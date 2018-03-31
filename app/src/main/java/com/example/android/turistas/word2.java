package com.example.android.turistas;


public class word2 {

    private String mKaire;
    private String mDesine;
    private int mFoto;

    public word2(int foto, String kaire, String desine) {
        mFoto = foto;
        mKaire = kaire;
        mDesine = desine;
    }

    public String getKaire() {
        return mKaire;
    }

    public String getDesine() {
        return mDesine;
    }

    public int getFoto() {
        return mFoto;
    }

}
