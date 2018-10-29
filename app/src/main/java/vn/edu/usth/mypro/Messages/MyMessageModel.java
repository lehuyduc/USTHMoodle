package vn.edu.usth.mypro.Messages;

import android.media.Image;

import java.util.ArrayList;
import java.util.Date;

public class MyMessageModel {
    String sender;
    Date date;
    Image avatar;

    public MyMessageModel(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public static ArrayList<MyMessageModel> myMessages;

    public static void init() {
        myMessages = new ArrayList<>();
        myMessages.add(new MyMessageModel("Nam Vinh Huynh"));
        myMessages.add(new MyMessageModel("Le Huy Duc"));
    }
}
