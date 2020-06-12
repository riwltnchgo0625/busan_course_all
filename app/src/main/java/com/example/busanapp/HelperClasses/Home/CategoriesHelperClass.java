package com.example.busanapp.HelperClasses.Home;

public class CategoriesHelperClass {
    //  int image;
    private String Url, title;
//  String gradient;

    public CategoriesHelperClass(/* int image */String Url, String title/*, String gradient*/) {
//      this.image = image;
        this.Url = Url;
        this.title = title;
//      this.gradient = gradient;
    }

    /*
    public int getImage() {
        return image;
    }
    */
    public String getUrl() {
        return Url;
    }

    public String getTitle() {
        return title;
    }
    /*
    String getGradient() {
        return gradient;
    }
    */
}