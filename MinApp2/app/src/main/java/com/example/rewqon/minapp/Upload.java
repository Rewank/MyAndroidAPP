package com.example.rewqon.minapp;


import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageur1;
    private String mkey;


    public Upload(){
        //Tom konstruktör behövs

    }
    public Upload(String name, String mImageur1){
        if (name.trim().equals("")){
            name = "No Name";

        }

        mName = name;
        mImageur1 = mImageur1;
    }

    public String getmName(){ return mName;}

    public void setName(String name) { mName = name;}

    public String getmImageur1(){return mImageur1;}

    public void setmImageur1(String imageur1) { mImageur1 = imageur1; }

    @Exclude

        public String getkey(){
            return mkey;

    }
    @Exclude

    public void setkey(String key) {
            mkey = key;
    }
}
