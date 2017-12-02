package com.example.android.yhack2017;

public class info {
    private String mLocation;
    private String mvoteText;
    private String mDate;
    private int mValue;


    public info(String voteText, String locate, String date, int value){
        mLocation = locate;
        mvoteText = voteText;
        mDate = date;
        mValue = value;


    }

    public String getmLocation(){
        return mLocation;
    }

    public String getmvoteText(){
        return mvoteText;
    }

    public String getmDate(){
        return mDate;
    }

    public int getmValue(){
        return mValue;
    }



    @Override
    public String toString() {
        return "Question{" +
                "mLocation='" + mLocation + '\'' +
                ", mvoteText='" + mvoteText + '\'' +
                '}';
    }
}
