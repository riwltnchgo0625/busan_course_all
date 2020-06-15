package com.example.busanapp.ui.home;

public class Course_two_three_trip {
    private String Title;

    private String Category;


    private String Description;
    private String Description2;
    private String Description3;
    private String Description4;
    private String Description5;

    private String Description6;
    private String Description7;
    private String Description8;
    private String Description9;
    private String Description10;
    private String Description11;

    private int Thumbnail;
    private int Thumbnail2;
    private int Thumbnail3;
    private int Thumbnail4;
    private int Thumbnail5;
    private int Thumbnail6;

    private int Thumbnail7;
    private int Thumbnail8;
    private int Thumbnail9;
    private int Thumbnail10;
    private int Thumbnail11;


    /*
    public Course() {
    }
    */

    public Course_two_three_trip(String title, String category, String description, String description2, String description3, String description4, String description5,
                                 String description6
            , String description7,String description8
            , String description9,String description10
            , String description11,int thumbnail, int thumbnail2, int thumbnail3, int thumbnail4, int thumbnail5, int thumbnail6
            ,
                                 int thumbnail7, int thumbnail8
            ,
                                 int thumbnail9, int thumbnail10
            ,
                                 int thumbnail11) {
        Title = title;

        Category = category;

        //요약
        Description = description;
        Description2 = description2;
        Description3 = description3;
        Description4 = description4;
        Description5 = description5;

        Description6 = description6;
        Description7 = description7;
        Description8 = description8;
        Description9 = description9;
        Description10 = description10;
        Description11 = description11;

        //사진
        Thumbnail2 = thumbnail2;
        Thumbnail = thumbnail;
        Thumbnail3 = thumbnail3;
        Thumbnail4 = thumbnail4;
        Thumbnail5 = thumbnail5;
        Thumbnail6 = thumbnail6;

        Thumbnail7 = thumbnail7;
        Thumbnail8 = thumbnail8;
        Thumbnail9 = thumbnail9;
        Thumbnail10 = thumbnail10;
        Thumbnail11 = thumbnail11;

    }

    public String getTitle() {
        return Title;
    }


    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }
    public String getDescription2() {
        return Description2;
    }
    public String getDescription3() {
        return Description3;
    }
    public String getDescription4() {
        return Description4;
    }
    public String getDescription5() {
        return Description5;
    }

    public String getDescription6() {
        return Description6;
    }
    public String getDescription7() {
        return Description7;
    }
    public String getDescription8() {
        return Description8;
    }
    public String getDescription9() {
        return Description9;
    }
    public String getDescription10() {
        return Description10;
    }
    public String getDescription11() {
        return Description11;
    }


    public int getThumbnail() {
        return Thumbnail;
    }
    public int getThumbnail2() { return Thumbnail2; }
    public int getThumbnail3() {
        return Thumbnail3;
    }
    public int getThumbnail4() {
        return Thumbnail4;
    }
    public int getThumbnail5() {
        return Thumbnail5;
    }
    public int getThumbnail6() {
        return Thumbnail6;
    }

    public int getThumbnail7() {
        return Thumbnail7;
    }
    public int getThumbnail8() {
        return Thumbnail8;
    }
    public int getThumbnail9() {
        return Thumbnail9;
    }
    public int getThumbnail10() {
        return Thumbnail10;
    }
    public int getThumbnail11() {
        return Thumbnail11;
    }
    /*
    // 안 쓰는 거 같아서 일단 주석처리 해둠
    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
    */
}


