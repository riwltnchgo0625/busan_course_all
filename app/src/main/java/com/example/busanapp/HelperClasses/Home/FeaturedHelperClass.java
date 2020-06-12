package com.example.busanapp.HelperClasses.Home;

public class FeaturedHelperClass {
    //  private int image;
    private String Url, title, description;

    public FeaturedHelperClass(/*int image,*/String Url, String title, String description) {
//      this.image = image;
        this.Url = Url;
        this.title = title;
        this.description = description;
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

    public String getDescription() {
        return description;
    }
}
