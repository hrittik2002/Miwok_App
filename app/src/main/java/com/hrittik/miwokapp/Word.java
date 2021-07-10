package com.hrittik.miwokapp;

public class Word {

    private String mDefaultTranslation; // private so that the value of the variables can not be changed after defind
    private String mMiwokTrasnslation;  // private so that the value of the variables can not be changed after defind
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED = -1;

    public Word(String DefaultTranslation , String MiwokTrasnslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTrasnslation = MiwokTrasnslation;
    }
    public Word(String DefaultTranslation , String MiwokTrasnslation , int ImageResourceID){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTrasnslation = MiwokTrasnslation;
        mImageResourceID = ImageResourceID;
    }

    // We have created who setter method to access of english and miwok word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTrasnslation(){
        return mMiwokTrasnslation;
    }

    public int getmImageResourceID() { return mImageResourceID; }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}
