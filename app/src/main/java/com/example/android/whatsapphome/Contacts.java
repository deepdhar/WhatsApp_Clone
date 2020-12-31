package com.example.android.whatsapphome;

public class Contacts {

    private String mName;
    private String mMessage;
    private String mTime;
    private int mImageResourceId;

    public Contacts(String name, String message, String time, int imageResourceId) {
        mName = name;
        mMessage = message;
        mTime = time;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getMessage() {
        return mMessage;
    }

    public String getTime() {
        return mTime;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
