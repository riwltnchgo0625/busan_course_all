package com.example.busanapp.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.busanapp.R;
import com.example.busanapp.home.Course_daytrip;
import com.example.busanapp.home.Course_one_two_trip;
import com.example.busanapp.home.ImageAdapter;
import com.example.busanapp.home.RecyclerViewAdapter;
import com.example.busanapp.home.RecyclerViewAdapterDayTrip;
import com.example.busanapp.home.RecyclerViewAdapterOneTwoTrip;
import com.example.busanapp.home.RecyclerViewAdapterTwoThreeTrip;

import java.util.ArrayList;
import java.util.List;


public class Course_all_Fragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView,onetwotripcardview,onetwothreecardview;

    private List<Course_daytrip> first_Course;
    private List<Course_one_two_trip> Fourth_Course;
    private List<Course_two_three_trip> third_Course;


    public Course_all_Fragment(){
    }

    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_all_trip, container, false);





        first_Course = new ArrayList<>();

        first_Course.add(new Course_daytrip("부산바다 당일치기", "추천코스","당일여행",
                "추천코스\n " +
                        "광안리해수욕장/광안대교 → 해운대해수욕장 → 부산아쿠아리움 → 문탠로드 → 청사포 → 용궁사\n",
                "부산의 랜드마크 중 하나인 광안대교를 한눈에 담을 수 있는 이곳은 사시사철 여행자로 북적인다. 사람들은 낮과 밤이 선사하는 각기 다른 광안리해수욕장의 매력에 흠뻑 빠져든다." +
                        " 특히 부산불꽃축제가 열리는 가을밤이면 광안리해수욕장 앞바다는 화려한 불꽃의 향연으로 물든다.\n",
                "해운대해수욕장은 넓고 고운 백사장을 가진 대한민국 대표 해수욕장으로 부산 시민보다 여행자로 더 북적이는 곳이다." +
                        " 해수욕장 주변에는 산책코스가 잘 갖춰져 있고 그 중 아름답기로 소문난 동백해안산책로는 바다, 바람, 그리고 도시풍경을 가장 가까이에서 만끽할 수 있는 코스이다. \n" ,
                "해안을 따라 조성된 문탠로드는 순환산책로로 평소 옷차림에 운동화만 있다면 도보에 무리가 없다." +
                        " 솔숲 사이 바다 냄새 느끼며 느린 걸음으로 다녀오는 가벼운 산책길도 경험해보자.\n",
                "바다와 가장 인접한 곳에 위치하고 있어 바다 위 사찰이라 불리는 해동용궁사."+
                        " 가장 높은 곳에 위치한 해수관음대불에 인사드리고 바다를 마주하면 간절하던 소원이 이루어진 마냥 입가에 절로 미소가 찾아온다.\n",
                R.drawable.daytrip1,R.drawable.daytrip1_2,R.drawable.daytrip1_3,R.drawable.daytrip1_4,R.drawable.daytrip1_5,R.drawable.daytrip1_map));

        first_Course.add(new Course_daytrip("역사 & 가족 당일코스", "지도로보는 추천코스","당일여행",
                "추천코스\n " +
                        "유엔기념공원 → 국립일제강제동원역사관 → 오륙도 → 광안리해수욕장/광안대교 → 동백해안산책로 → 달맞이길 \n",
                "세계에서 유일한 유엔군 공동묘역이 조성돼 있는 유엔기념공원은 한국전쟁 당시 목숨을 잃은 병사들이 잠들어 있다. " +
                        "이름 모를 군인들의 넋을 기리는 조형물과 전사한 이들의 이름이 새겨진 비석들 사이로 참전국 국기가 펄럭이는 모습은 이곳을 찾는 이들의 마음을 절로 숙연케 한다.\n",
                "역사관에서 그리 멀지 않은 곳에 오륙도가 위치한다. " +
                        "해맞이공원 끝자락에 아슬아슬하게 매달려 있는 스카이워크, 투명한 바닥에 들어서면 마치 에메랄드 빛 바다 위를 걷는 듯 아찔한 기분을 느낄 수 있다. " +
                        "오륙도의 기괴한 해안절경은 부산에서 느낄 수 있는 특별함 중 하나다. \n" ,
                "해운대해수욕장 위로 달이 뜨는 풍경을 만끽할 수 있는 곳, 바로 달맞이길이다. " +
                        "구불구불 언덕 산책로를 따라 형성된 예쁜 길, 갤러리며 카페며 주위 경관이 아름답기로 유명하다." +
                        " 봄이 오면 길을 따라 만개한 벚나무 덕에 벚꽃터널이 만들어지는 장소이기도 하다.\n",
                "광안리 해수욕장을 만났으니 해운대 해수욕장도 빼놓을 수는 없을 터. 광안리와 해운대 사이에 있는 동백섬에 들러 산책로를 먼저 걸어보자. " +
                        "동백섬에는 동백해안산책로가 조성되어 있어 바다를 바라보며 숲길을 걷는 묘미를 제대로 만끽할 수 있다\n",
                //un - 오륙도 - 동백해안산책로 - 달맞이길
                R.drawable.daytrip2_4,R.drawable.daytrip2_1,R.drawable.daytrip2_2,R.drawable.daytrip2_3,R.drawable.day2trip_6,R.drawable.daytrip2_map));

        first_Course.add(new Course_daytrip("동서로 가로지르기", "지도로보는 추천코스","다일여행",
                "추천코스\n " +
                        "태종대 → 흰여울문화마을 → 국제시장 → 용두산공원 → 오륙도 → 광안리해수욕장/광안대교 → 해운대해수욕장 → 동백해안산책로\n",
                "출발은 서쪽 영도 바다에서 시작한다. 영도의 끝자락에 위치한 태종대라면 더 없이 좋다.\n" +
                        "맑은 날이면 대마도까지 조망할 수 있고 사시사철 멋진 기암절벽에 부서지는 하얀 포말을 감상할 수 있다." +
                        " 다누비 열차를 이용해 태종대 전체를 편하게 둘러볼 수 있는데 초여름이면 수국꽃밭이 여행자를 반겨준다.\n",
                "국제시장을 주제로 촬영한 영화가 있을 정도로 피란민의 애환이 남아 있는 이곳은 여기저기 먹을거리가 많아 출출한 배를 달래기에 좋다. " +
                        "구제물품까지 저렴하게 구매할 수 있으니 잠시 걸음을 멈추고 이런 저런 구경으로 시간을 보내보면 어떨까.\n" ,
                "남해와 동해가 만나는 오륙도 풍경을 담기 위해 동쪽으로 순간이동. 높디높은 절벽위에 투명유리 스카이워크가 조성되면서 관광객들에게 아찔한 경험까지 선사하는 오륙도는 일출·일몰 명소로도 유명하다. " +
                        "해질 무렵 방문해 아름다운 부산 바다의 일몰을 느껴보는 것도 좋겠다.\n",
                "해운대 끝에서 이어져 동백섬을 둘러싸는 동백해안산책로. 이곳은 2005년 APEC 정상회담 회의장으로 사용됐던 누리마루가 있는 곳이다." +
                        " 바다를 감아 돌며 걷는 산책로에선 광안리와는 또 다른 매력의 해운대 야경이 기다리고 있다.\n",
                //태종대 - 국제시장 - 오륙도 - 동백해안산책로
                R.drawable.daytrip3_1,R.drawable.daytrip3_5,R.drawable.daytrip3_2,R.drawable.daytrip3_3,R.drawable.daytrip3_4,R.drawable.daytrip3_map));



       /* mostViewedRecycler = view.findViewById(R.id.Most_recycler);
        mostViewedRecycler();

        categoriesRecycler = view.findViewById(R.id.categories_recycler);
        categoriesRecycler();*/

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_one);
        onetwotripcardview = (RecyclerView) view.findViewById(R.id.recyclerview_onetwo);
        onetwotripcardview();
        onetwothreecardview = (RecyclerView) view.findViewById(R.id.recyclerview_onetwothree);
        onetwothreecardview();


        RecyclerView.Adapter myAdapter = new RecyclerViewAdapterDayTrip(getActivity(), first_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 세로 레이아웃
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(horizontalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }
    private void onetwotripcardview(){
        Fourth_Course = new ArrayList<>();
        Fourth_Course.add(new Course_one_two_trip("1박 2일에 완성하는 부산 해안선 완전 정복!", "1박 2일 여행\n",
                "★추천코스★",

                "\n" +
                        "1일차 : 영도대교 - 흰여울문화마을 / 절영해안산책로 - 태종대 - 국제시장/깡통시장 - 용두산공원\n\n" +
                        "2일차 : 해운대해수욕장 - 아쿠아리움 - 동백해안산책로(누리마루APEC하우스) - 오륙도스카이워크 - 이기대해안산책로 - 광안대교\n",

                "영도대교에서 여정을 시작한다.\n" +
                        "영도로 향하는 관문인 영도대교는 1950년대 한국전쟁으로 인해 생이별한 가족들이 훗날 만남을 기약하던 유명한 다리였다.\n" +
                        "한국 최초의 도개교로 매일 오후 2시 도개행사가 열린다.\n ",

                "흰여울문화마을과 마을 아래 절영해안산책로에서는 영화촬영 장소 찾기, 아기자기한 카페 구경하기, 바다 전망 인생샷 찍기 등으로 매번 분주하다.\n ",

                "영도에 왔다면 뛰어난 해안절경을 자랑하는 태종대도 놓쳐서는 안 된다. " +
                        "맑은 날 전망대에 오르면 대마도까지 조망할 수 있고 다누비열차를 이용해 태종대 전체를 편하게 둘러볼 수 있다.\n",

                "국제시장은 영화로 만들어질 만큼 전쟁의 슬픈 역사가 남아 있는 곳이다. 다양한 구제 물품과 수입품을 저렴한 가격에 구매할 수 있다.\n "+
                        "시간 가는 줄 모르고 시장 구경을 하다 허기가 지면 인근 깡통시장으로 걸음을 옮겨보자. 맛도 가격도 착한 주전부리의 진수가 기다리고 있다.\n",

                "국제시장에서 도보로 10분 거리에 용두산 공원이 자리해 있다. 부산 랜드마크인 부산타워 전망대는 일몰시간이면 최고의 전망을 자랑한다.\n " +
                        "땅거미가 지기 시작하면 노을에 붉게 빛나는 부산항, 영도, 남포동, 국제시장 등이 파노라마처럼 한눈에 들어온다.\n " +
                        "해가 진 후, 환상적 야경을 눈에 담으며 첫째 날을 마무리한다.\n\n",

                "해운대에서 시작하는 여행 2일차.\n " +
                        "우리나라 대표 관광지이자 많은 인파가 찾는 곳인 만큼 주변에는 숙박 시설과 오락 시설들이 잘 조성돼 있다. \n",

                "부산 대표 실내관광명소인 부산아쿠아리움에서는 살아 있는 다양한 해양생물들을 직접 눈으로 볼 수 있으며, 시간대별로 다양한 수중 공연이 펼쳐진다.\n ",

                "숲과 바다가 어우러진 명품 해안산책로 동백섬이다.\n\n " +
                        //내용전환
                        "해운대 해변 끝자락에서 시작해 누리마루APEC하우스를 거쳐 더베이101으로 이어지는 코스로 이동하거나 또는 그 반대 방향으로 코스를 잡아도 좋다.\n " +
                        "하얀 등대가 반기는 전망대에서 시원한 부산 앞바다와 웅장한 광안대교를 한눈에 조망할 수 있다.\n\n",

                "부산의 아름다운 일출과 일몰을 모두 가진 명소 오륙도다. 해맞이공원과 스카이워크에서 만나는 에메랄드 빛 부산 앞바다가 아름다운 곳이다.\n " +
                        "투명 유리바닥 스카이워크에서의 짜릿한 경험은 오륙도가 선사하는 또 다른 즐거움이다.\n ",

                "오륙도는 이기대 해안산책로로 이어진다. " +
                        "오르락 내리락 경사가 있는 트레킹 코스긴 하지만 해안을 따라 걷는 길이 보여주는 멋진 경관을 놓칠 수는 없다.\n\n",

                "★지도로 보는 추천코스★",

                "① 눈물로 약속한 공간 영도 대교\n" +
                        "② 가파른 절벽 끝에 흰여울문화마을\n" +
                        "③ 걷기만 핻 힐링, 절연해안산책로\n" +
                        "④ 영도 등대와 함께한 100년 태종대\n" +
                        "⑤ 골목골목 와글와글 국제시장\n" +
                        "⑥ 부산 먹방의 성지 부평깡통시장\n" +
                        "⑦ 부산여행의 이유 용두산공원\n" +
                        "⑧ 부산 바다의 정석, 해운대해수욕장\n" +
                        "⑨ 직접 만나는 바다 부산아쿠아리움\n" +
                        "⑩ 바다와 산, 그리고 부산을 걷다\n" +
                        "⑪ 오륙도가 전해주는 바다\n" +
                        "⑫ 부산 명품 트레킹코스 이기대 해안산책로\n" +
                        "⑬ 광안리의 밤은 당신의 낮보다 아름답다\n",

                "젊음의 열기가 넘쳐나는 도심 속 바다 광안리해수욕장에서 여유 있게 휴식을 취한다.\n\n" +
                        " 해가 지면 나타나는 다이아몬드브릿지 광안대교는 10만 가지 이상의 LED가 만들어내는 황홀한 불빛으로 광안리 해변을 물들인다.\n\n"+
                        "부산의 해안선을 따라가는 여행, 부산 바다가 간직한 여러 얼굴을 만나러 가는 길은 1박 2일이라는 시간이 결코 아깝지 않다."

                ,R.drawable.busan_1n2d,R.drawable.busan_1n2d_first,R.drawable.busan_1n2d_second,R.drawable.busan_1n2d_third,R.drawable.busan_1n2d_fourth,
                R.drawable.busan_1n2d_fifth,R.drawable.busan_1n2d_sixth,R.drawable.busan_1n2d_seventh,R.drawable.busan_1n2d_eighth,R.drawable.busan_1n2d_ninth
                ,R.drawable.busan_1n2d_tenth,R.drawable.busan_1n2d_eleventh));

        Fourth_Course.add(new Course_one_two_trip ("두 마리 토끼, 서부산과 동부산을 잡자",

                "1박 2일 여행",

                "★추천코스★",

                "\n1일차 : 태종대 - 송도해수욕장 - 감천문화마을 - 국제시장 / 깡통시장 - 용두산공원\n\n" +
                        "2일차 : 광안대교 - 해운대해수욕장 - 동백해안산책로 / 누리마루APECA하우스 - 달맞이고개 - 송정 - 해동용궁사\n",

                "영도의 남쪽 끝자락에 위치한 태종대는 울창한 숲과 절벽, 바다가 조화를 이루는 아름다운 곳이다.\n" +
                        "다누비열차를 타고 덜컹덜컹 태종대 전체를 순환해도 좋고, 해상유람선에 올라 출렁이는 파도 느끼며 태종대를 바라봐도 좋다.\n",

                "영도에서 멀지 않은 곳에 위치한 송도해수욕장은 하늘과 땅 모두에서 바다를 느낄 수 있는 곳이다.\n " +
                        "송도해상케이블카를 타고 바다 위를 나는 기분을 누렸다면, 구름산책로 위를 걸으며 투명한 바닥의 아찔함을 느껴 봐도 좋겠다.\n",

                "한국의 마추픽추라 불리는 감천문화마을은 계단식 주거형태와 미로 같은 골목길 등 독특한 경관을 자랑하는 곳이다.\n" +
                        "피난민의 터전으로 만들어 지기 시작한 마을은 이제 생활과 예술이 공존하는 명소가 됐다.\n" +
                        "설치미술품과 포토존 등이 마을 곳곳을 채우고, 예술가들이 만든 다양한 작품을 감상하며 직접 예술인과 함께하는 공방 체험에 나설 수도 있다.\n",

                "중구에 위치한 부산 대표 전통시장인 국제시장과 깡통시장도 그냥 지나칠 수 없는 장소다.\n" +
                        "국제시장에는 먹자골목, 구제용품 골목이 눈길을 끄는데 시장 내 609공간에선 다양한 문화공연까지 열린다.\n" +
                        "먹방의 진수 부평 깡통시장은 전 세계 다문화 먹거리와 공연을 즐길 수 있는 야시장이 특징이다.\n",

                "시장에서 가까운 곳에 위치한 용두산공원은 부산 시내를 한 눈에 내려다볼 수 있는 부산타워가 있는 곳이다.\n" +
                        "부산타워 전망대에서는 도시와 항구의 모습을 한 번에 내려다 볼 수 있다.\n" +
                        "해지는 부산을 바라보며 하루를 마무리해보자.\n",

                "부산바다라 하면 해운대를 빼 놓을 수 없다.\n" +
                        "희고 고운 모래를 가진 해운대 백사장과 그 끝자락에 위치한 동백섬을 놓쳐선 안 된다.\n",

                "숲과 바다가 어우러진 해안길을 따라가는 동백해안산책로에서는 바다풍경이 가장 아름다운 지점에서 APEC정상회담이 열렸던 누리마루APEC 하우스를 만나게 된다.\n",

                "달빛을 맞이하는 언덕 달맞이길의 정상에는 월출 명당 해월정이 있다.\n" +
                        "해월정에서 이어지는 문탠로드를 따라 난 해안산책로는 삼포해안길 미포와 청사포, 구덕포로 이어진다.\n",

                "국내 서핑의 메카로 떠오른 송정해수욕장에서 휴양과 레저를 동시에 즐겨보자.\n" +
                        "해양레포츠 관련 시설이 즐비하고 파도를 즐기는 서퍼들을 구경하는 것만으로도 재미가 있는 곳, 송정해수욕장이다.\n",

                "바다 위 아름다운 풍광을 자랑하는 해동용궁사는 대변항까지 이어지는 해안산책로의 시작점이다.\n" +
                        "경내 어디서든 푸른 동해 바다를 조망할 수 있는 사찰로 간절히 기도하면 한 가지 소원은 꼭 이뤄준다는 기도도량이다.\n",

                "★지도로 보는 추천코스★",

                "① 영도 등대와 함께한 100년 태종대\n" +
                        "② 100년을 넘어 다시 태어난 송도해수욕장\n" +
                        "③ 한국의 마추픽추 감천문화마을\n" +
                        "④ 골목골목 와글와글 국제시장\n" +
                        "⑤ 부산 먹방의 성지 부평깡통시장\n" +
                        "⑥ 부산여행의 이유 용두산공원\n" +
                        "⑦ 광안리의 밤은 당신의 낮보다 아름답다\n" +
                        "⑧ 부산 바다의 정석, 해운대해수욕장\n" +
                        "⑨ 바다와 산, 그리고 부산을 걷다\n" +
                        "⑩ 일출과 월출 모두를 품은 달맞이길 & 문탠로드\n",

                "\n\n*** 소개된 삼포해안길의 ‘미포철길’은 공사로 인해 2020년 6월까지 폐쇄됨을 알려드립니다. ***\n",

                R.drawable.onetwo_thumbnail,R.drawable.onetwo_pplus, R.drawable.onetwo_first, R.drawable.onetwo_second, R.drawable.onetwo_third, R.drawable.onetwo_fourth, R.drawable.onetwo_fifth
                , R.drawable.onetwo_sixth, R.drawable.onetwo_seventh, R.drawable.onetwo_eighth, R.drawable.onetwo_ninth, R.drawable.onetwo_tenth));


        RecyclerView.Adapter myAdapter = new RecyclerViewAdapterOneTwoTrip(getActivity(),Fourth_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 세로 레이아웃
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false);

        // 레이아웃 매니저 연결
        onetwotripcardview.setLayoutManager(horizontalLayoutManager);

        onetwotripcardview.setAdapter(myAdapter);

    }
    private void onetwothreecardview() {

        third_Course = new ArrayList<>();

        third_Course.add(new Course_two_three_trip("2박 3일에 완성하는 부산 완전정복","2박 3일",
                "추천코스\n" + "\n" +
                        "1일차 : 범어사 - 동래읍성 - 복천박물관/복천동고분군 - 죽성성당 - 해동용궁사 - 송정해수욕장/죽도공원\n" +
                        "2일차 : 해운대해수욕장/동백섬 - 오륙도 - 태종대 - 영도대교 - 용두산공원\n" +
                        "3일차 : 감천문화마을 - 송도해수욕장/케이블카 - 다대포 해수욕장 - 장림포구 - 을숙도 - 가덕도\n" +
                        "\n" + "\n" +
                        "1일차 추천코스\n" + "범어사 → 동래읍성 → 복천박물관/복천동고분군 → 죽성성당 → 해동용궁사 → 송정해수욕장/죽도공원\n" +
                        "\n",
                "황금빛 물고기가 내려와 노닐었다는 천년고찰 범어사는 차분하고 아늑한 산사의 분위기를 물씬 풍긴다. 사찰 자체가 문화재인 범어사에서 문화재급의 아름다운 자연도 함께 즐겨보자.\n",

                "조선시대 동래부를 지켜주던 동래읍성, 그 성벽을 따라 걸으며 임진왜란 최대 격전지였던 곳의 흔적을 새긴다. 성벽 아래 복천동고분군에서는 가야 왕국의 무덤이 발견되었고 출토된 유물을 복천박물관에서 전시하고 있다." +
                        "죽성마을 갯바위 끝에 한 폭의 그림처럼 걸려있는 죽성성당. 푸른 하늘, 에메랄드빛 바다와 어우러진 예쁜 성당 앞에는 너도나도 사진 찍기 바쁜 사람들로 종일 북적인다.\n",

                "뒤로는 소나무가 우거진 바위산이 사찰을 감싸고, 앞으로는 푸른 망망대해가 펼쳐져 있는 해동용궁사에서 새로운 추억을 만들어보자.\n",

                "서핑을 배우는 교육생들의 활기로 가득한 송정해수욕장의 끝자락, 죽도공원에서는 햇빛에 반짝이는 송정 바다 위, 밀려오는 파도를 즐기는 서퍼들의 소리가 어울린 천혜의 휴식처를 만날 수 있다.\n" + "\n\n\n\n" +
                        "2일차 추천코스\n" + "해운대해수욕장/동백섬 → 오륙도 → 태종대 → 영도대교 → 용두산공원\n" +
                        "\n",

                "해운대 해수욕장의 드넓은 백사장을 따라 걷다가 동백섬을 만나면 해안산책로를 유유자적 한 바퀴 돌아보자. 병풍처럼 펼쳐진 해운대의 마천루와 광안대교의 전망을 동시에 조망할 수 있다.\n",


                "오륙도는 시원하게 트인 바다가 일상의 근심을 날려주고 기암괴석에 부딪히는 하얀 포말이 삶의 위로가 되는 곳이다." +
                        "멋진 바다풍경하면 태종대를 빼놓을 수가 없다. 깎아지는 벼랑과 부딪치는 하얀 파도, 끝없이 푸른 바다와 함께 녹음으로 가득한 태종대 공원을 넉넉하게 돌아보자.\n" +
                        "영도와 남포동을 이어주는 주황색 영도대교를 넘어 도심 한가운데 봉긋 솟아있는 용두산 공원에 오른다. 부산타워 전망대에서는 부산의 동서남북을 모두 조망할 수 있다.\n\n\n" +
                        "3일차 추천코스\n" + "감천문화마을 → 송도해수욕장/케이블카 → 다대포해수욕장 → 장림포구 → 을숙도 → 가덕도\n\n",


                "한국의 마추픽추 감천문화마을로 향한다. 부산의 피란역사를 고스란히 담고 있는 이곳은 곳곳에 설치된 예술작품과 벽화가 형형색색의 지붕과 어우러져 낙후되었던 감천을 감성골목으로 만들었다." +
                        "우리나라 1호 해수욕장인 송도해수욕장이 해상케이블카와 스카이워크로 옛 명성을 되찾았다. 깨끗한 백사장과 해안산책로, 해송 우거진 숲길산책로까지 모두 갖춘 송도해수욕장은 방문리스트 1호!\n",


                "드넓은 자연 그 자체의 바다, 다대포해수욕장은 수평선보다는 지평선이 보이는 느낌이다. 오직 바다와 나지막한 산이 시야를 가득 채우는 이곳은 황홀한 낙조를 선사하는 곳으로 유명하다.\n",


                "‘부네치아’라는 애칭을 얻은 장림포구는 형형색색의 창고건물이 긴 포구를 따라 마주보고 있는 모습이 이국적인 정취를 자아낸다.\n" +
                        "가을이 짙어갈수록 흰 꽃을 피우는 억새군락 사이로 날아오르는 철새들을 관찰할 수 있는 을숙도는 미술관과 문화회관도 위치해 자연과 문화를 동시에 즐길 수 있는 아름다운 섬이다.\n" +
                        "부산과 거제도를 잇는 거가대교의 개통으로 유명해진 가덕도는 천혜의 자연환경이 그대로 보존된 섬이다. 그 풍경 속에 가려져 미처 몰랐던 가덕도의 슬픈 역사도 마주할 수 있다.\n\n",

                "추천코스",
                R.drawable.two_three_first,R.drawable.two_three_first_dtwo,R.drawable.two_three_first_dthree,R.drawable.two_three_first_dfour,R.drawable.two_three_first_dfive,
                R.drawable.two_three_first_dsix,R.drawable.two_three_first_dseven,R.drawable.two_three_first_deight,R.drawable.two_three_first_dnine,R.drawable.two_three_first_dten,R.drawable.two_three_first_deleven));

        third_Course.add(new Course_two_three_trip("부산 원도심의 이야기", "2박 3일",
                "추천코스\n" + "\n" +
                        "1일차 : 초량이바구길  - 40계단/문화관 - BIFF광장/국제시장/깡통시장 - 보수동책방골목 - 부산영화체험관/트릭아이뮤지엄 - 용두산공원\n" +
                        "2일차 : 영도대교 - 흰여울문화마을 - 태종대 - 국립해양박물관 - 오륙도 - 광안리해수욕장/광안대교\n" +
                        "3일차 : 해운대 - 삼포해안길 - 청사포 - 송정해수욕장/죽도공원 - 해동용궁사 - 아난티코브 - 죽성성당\n" +
                        "\n" + "\n" +
                        "1일차 추천코스\n" + "초량이바구길  → 40계단/문화관 → BIFF광장/국제시장/깡통시장 → 보수동책방골목 → 부산영화체험관/트릭아이뮤지엄 → 용두산공원\n" +
                        "\n",
                "부산의 원도심인 동구의 168계단을 중심으로 산복도로 이야기를 전해주는 초량이바구길, 피란민들의 아픔이 서린 부산의 근현대 역사를 한 번에 만나볼 수 있는 길이다.\n" +
                        "피란민의 애환이 서린 40계단과 그 아픔을 기억하는 40계단 문화관, 부산국제영화제의 태동지 BIFF광장, ‘없는 것 빼고 다 있다’는 국제시장과 부평깡통시장, 50년 문화 골목 보수동책방골목까지 하나하나 귀중한 부산의 이야기를 만날 수 있다.\n" +
                        "부산영화체험박물관은 다양한 영화 콘텐츠를 한 편의 영화탐험스토리 속에서 보다 쉽고 재미있게 체험할 수 있다. 박물관 2층에 자리한 착시체험형 미술관 트릭아이뮤지엄도 재미있는 체험을 만끽할 수 있는 명소이다.\n" +
                        "\n" +
                        "용두산 공원 부산타워 꼭대기에서 내려다보는 부산야경을 즐기며 하루를 마감한다.\n" + "\n\n\n\n" +
                        "2일차 추천코스\n" + "영도대교 → 흰여울문화마을 → 태종대 → 국립해양박물관 → 오륙도 → 광안리해수욕장/광안대교\n" +
                        "\n",

                "깎아지른 절벽을 사이에 두고 좁은 마을과 넓은 바다가 절묘한 대비를 이루는 흰여울문화마을. 골목길을 들어설 때마다 각기 다른 느낌의 진풍경이 방문객을 맞이하고 그 사이로 보이는 눈부신 바다가 탄성을 자아낸다.\n",

                "여름철 수국축제로 새로운 인기를 얻고 있는 태종대는 깎아지른 듯한 절벽과 에메랄드빛 푸른 바다가 끝없이 맞닿아있는 부산의 오랜 명소이다.\n" +
                        "아이와 함께 꼭 들러야 하는 국립해양박물관에서는 바다와 관련된 귀중한 유물과 자료를 볼 수 있고 다양한 해양 체험과 교육 프로그램을 들을 수 있다.\n",

                "썰물이면 여섯 봉우리, 밀물이면 다섯 봉우리가 된다고 해서 붙은 이름 ‘오륙도’는 탁 트인 바다 전망에 투명 스카이워크까지 아찔한 자연의 스릴을 만끽할 수 있다.\n" +
                        "화려한 광안대교 야경을 배경으로 펼쳐지는 버스킹 공연, 즐거운 음악에 몸이 절로 흔들거리며 여행의 두 번째 날이 광안리에서 저문다.\n" + "\n\n\n\n" +
                        "3일차 추천코스\n" + "해운대 → 삼포해안길 → 청사포 → 송정해수욕장/죽도공원 → 해동용궁사 → 아난티코브 → 죽성성당\n" +
                        "\n",

                "해운대 해수욕장을 거쳐 미포, 청사포, 구덕포를 잇는 삼포해안길을 따라 송정해수욕장으로 넘어가는 도보여행을 시도해도 좋겠다. 해안철길을 따라 걷는, 부산에서 가장 아름다운 산책로를 놓칠 수 없다.\n",

                "밀려오는 파도에 몸을 맡긴 서퍼들의 현란한 모습을 감상하며 송정해수욕장 송일정에 올라 편안한 휴식을 취하면 도보의 고단함도, 일상의 피로도 바닷바람에 날려 저 멀리 사라진다.\n",

                "해안절벽 위에 자리한 아름다운 사찰 해동용궁사는 광활한 동해바다의 파란세상이 눈앞에 펼쳐지는 절경 덕에 국내외 관광객의 발걸음이 끊이지 않는 곳이다.\n",

                "기장 앞바다를 정원으로 둔 힐튼호텔 아난니코브 타운. 맘에 드는 레스토랑을 찾아도 좋고 독특한 큐레이션이 눈길을 끄는 서점에서 충분한 시간을 보내도 좋겠다.\n",

                "빨간 뾰족지붕과 잘 어울리는 하얀 벽돌건물이 동화 속 한 장면처럼 이국적인 죽성성당. 아침에는 가슴 벅찬 일출을 맞이하는 곳이 밤이 되면 은은한 조명으로 둘러싸인 낭만성당으로 변모한다.\n",
                "추천코스",R.drawable.two_three_second_dsix,R.drawable.two_three_second,R.drawable.two_three_second_dtwo,R.drawable.two_three_second_dfour,R.drawable.two_three_second_dfive,
                R.drawable.two_three_second_dsix,R.drawable.two_three_second_dseven,R.drawable.two_three_second_deight,R.drawable.two_three_second_dnine,R.drawable.two_three_second_dten,R.drawable.two_three_second_deleven));




        RecyclerView.Adapter myAdapter = new RecyclerViewAdapterTwoThreeTrip(getActivity(), third_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 세로 레이아웃
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false);

        // 레이아웃 매니저 연결
        onetwothreecardview.setLayoutManager(horizontalLayoutManager);

        onetwothreecardview.setAdapter(myAdapter);

    }


}


