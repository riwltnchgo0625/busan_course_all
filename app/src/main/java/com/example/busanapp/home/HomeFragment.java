package com.example.busanapp.home;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import com.example.busanapp.HelperClasses.Home.CategoriesAdapter;
import com.example.busanapp.HelperClasses.Home.CategoriesHelperClass;
import com.example.busanapp.HelperClasses.Home.FeaturedAdapter;
import com.example.busanapp.HelperClasses.Home.FeaturedHelperClass;
import com.example.busanapp.HelperClasses.Home.MostViewedAdapter;
import com.example.busanapp.HelperClasses.Home.MostViewedHelperClass;
import com.example.busanapp.R;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class HomeFragment extends Fragment {
    private RecyclerView mostViewedRecycler, categoriesRecycler;
//  private TextView tv_name;
//  private Context mContext;

    private TextView t1_temp, t4_data;
    private ImageView imageView;
    private String my_longitude;
    private String my_latitude;
    private String imgURL;

    /*
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;
    //추가
    List<Course> first_Course;
    */

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //날씨
        t1_temp = view.findViewById(R.id.weather_temp);
        t4_data = view.findViewById(R.id.weather_date);
        imageView = view.findViewById(R.id.weather_image);
        final LocationManager lm = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);

        if (Build.VERSION.SDK_INT >= 23 &&
                ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    0);
        } else {
            Location location = null;
            if (lm != null) {
                location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            }

            if (location != null) {
                String provider = location.getProvider();
            }

            double longitude = 0;
            if (location != null) {
                longitude = location.getLongitude();
            }

            double latitude = 0;
            if (location != null) {
                latitude = location.getLatitude();
            }

            if (location != null) {
                double altitude = location.getAltitude();
            }

            my_longitude = Double.toString(longitude);
            my_latitude = Double.toString(latitude);

            if (lm != null) {
                lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10000, 1, gpsLocationListener);
            }

            if (lm != null) {
                lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 1, gpsLocationListener);
            }
        }

        find_weather();

        RecyclerView featuredRecycler = view.findViewById(R.id.featured_recycler);

        mostViewedRecycler = view.findViewById(R.id.Most_recycler);
        mostViewedRecycler();

        categoriesRecycler = view.findViewById(R.id.categories_recycler);
        categoriesRecycler();


        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass("https://cdn.pixabay.com/photo/2018/07/15/04/19/gwangalli-3538913_960_720.jpg",
                "광안리 해수욕장", "부산광역시 수영구 광안2동"));
        featuredLocations.add(new FeaturedHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20191229153531987_oen",
                "해운대 해수욕장", "부산광역시 해운대구 해운대해변로 264"));
        featuredLocations.add(new FeaturedHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20191222180842708_wufrotr",
                "태종대", "부산광역시 영도구 동삼동 전망로 24"));
        featuredLocations.add(new FeaturedHelperClass("https://cdn.pixabay.com/photo/2018/06/15/12/47/busan-3476918_960_720.jpg",
                "감천문화마을", "부산광역시 사하구 감천2동 감내1로 200"));
        featuredLocations.add(new FeaturedHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20191230184115413_oen",
                "국제시장", "부산광역시 중구 신창동4가"));

        RecyclerView.Adapter adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);

        return view;
    }

    final LocationListener gpsLocationListener = new LocationListener() {
        public void onLocationChanged(Location location) {
            String provider = location.getProvider();
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            double altitude = location.getAltitude();
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
        }

        public void onProviderEnabled(String provider) {
        }

        public void onProviderDisabled(String provider) {
        }
    };

    private void find_weather() {
        String url = "http://api.openweathermap.org/data/2.5/weather?lat=" + my_latitude + "&lon=" + my_longitude +
                "&appid=d1ce79865abbaf66dc12b6ad6368826a&units=metric";
        Log.e("url", url);

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject main_object = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject object = array.getJSONObject(0);
                    String temp = String.valueOf(main_object.getDouble("temp"));
                    String description = object.getString("description");
                    String city = response.getString("name");
                    String icon = object.getString("icon");
                    Log.e("icon", icon);
                    imgURL = "http://openweathermap.org/img/w/" + icon + ".png";
                    Log.e("icon url", imgURL);

                    t1_temp.setText(temp);
                    Picasso.get().load(Uri.parse(imgURL)).into(imageView);

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEEE-MM-dd");
                    String formatte_date = sdf.format(calendar.getTime());

                    t4_data.setText(formatte_date);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            private void into(ImageView imageView) {
            }
        }, error -> {

        });
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        queue.add(jor);
    }


    private void mostViewedRecycler() {
        mostViewedRecycler.setHasFixedSize(true);
        mostViewedRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        ArrayList<MostViewedHelperClass> mostViewedLocations = new ArrayList<>();

        mostViewedLocations.add(new MostViewedHelperClass("https://cdn.pixabay.com/photo/2018/09/10/09/21/haejangguk-3666599_960_720.jpg",
                "돼지국밥", "부산 돼지국밥을 빼고 국밥을 논하지 마라.(궁서체)"));
        mostViewedLocations.add(new MostViewedHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20191226181410757_wufrotr",
                "밀면", "묘하게 중독되는 부산 여름의 맛!"));
        mostViewedLocations.add(new MostViewedHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200102184731969_oen",
                "회", "마! 부산은 회 아이가~"));
        mostViewedLocations.add(new MostViewedHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20191230195412058_oen",
                "동래파전", "파전은 늘 옳다."));
        mostViewedLocations.add(new MostViewedHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20191227100120502_wufrotr",
                "씨앗호떡", "부산이 씨앗호떡 원조라면서요?"));

        RecyclerView.Adapter adapter = new MostViewedAdapter(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);
    }

    private void categoriesRecycler() {
        // All Gradients
//      GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
//      GradientDrawable gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
//      GradientDrawable gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
//      GradientDrawable gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});

        ArrayList<CategoriesHelperClass> categoriesHelperClasses = new ArrayList<>();

        categoriesRecycler.setHasFixedSize(true);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        categoriesHelperClasses.add(new CategoriesHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110132712927_ttiel",
                "#중구지역\n#서구지역\n#동구지역\n#남구지역"));
        categoriesHelperClasses.add(new CategoriesHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110133650886_ttiel",
                "#영도구지역\n#부산진구지역\n#해운대지역"));
        categoriesHelperClasses.add(new CategoriesHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110153816890_ttiel",
                "#동래구지역\n#북구지역\n#사상구지역\n#기장군지역"));
        categoriesHelperClasses.add(new CategoriesHelperClass("https://www.visitbusan.net/uploadImgs/files/cntnts/20200110154437547_ttiel",
                "#사하구지역\n#금정구지역\n#강서구지역\n#연제구지역\n#수영구지역"));

        RecyclerView.Adapter adapter = new CategoriesAdapter(categoriesHelperClasses);
        categoriesRecycler.setAdapter(adapter);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
}