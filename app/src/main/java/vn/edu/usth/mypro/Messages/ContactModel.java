package vn.edu.usth.mypro.Messages;

import java.util.ArrayList;

import vn.edu.usth.mypro.R;

public class ContactModel {
    private int imageID;
    private String name;
    private String phoneNumber;

    public ContactModel(int imageID, String name, String phoneNumber) {
        this.imageID = imageID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static ArrayList<ContactModel> contacts = new ArrayList<>();

    public static void init() {
        contacts.add(new ContactModel(R.drawable.ic_avatar,"Nam","12345"));
        contacts.add(new ContactModel(R.drawable.ic_avatar,"Duc","67890"));
    }
}
