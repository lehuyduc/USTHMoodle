package vn.edu.usth.mypro.Home;

import android.widget.Button;

import java.util.ArrayList;

import vn.edu.usth.mypro.R;

public class SiteNewsModel {
    int imageID;
    private String title;
    Button downloadButton;

    public SiteNewsModel(int imageID, String title) {
        this.title = title;
        this.imageID = imageID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public static ArrayList<SiteNewsModel> SiteNews = new ArrayList<>();

    public static void init() {
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "Moodle guide 1"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "Moodle guide 2"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "Moodle guide 3"));

    }
}
