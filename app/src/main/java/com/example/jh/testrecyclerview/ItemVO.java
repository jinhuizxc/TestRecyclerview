package com.example.jh.testrecyclerview;

/**
 * Created by jinhui on 2018/4/24.
 * email: 1004260403@qq.com
 */

public class ItemVO {

    private int mImg;
    private String mName;

    public ItemVO(int mImg, String mName) {
        this.mImg = mImg;
        this.mName = mName;
    }

    public void setmImg(int mImg) {
        this.mImg = mImg;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmImg() {
        return mImg;
    }

    public String getmName() {
        return mName;
    }
}
