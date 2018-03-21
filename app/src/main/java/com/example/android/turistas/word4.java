package com.example.android.turistas;


import static com.example.android.turistas.R.id.aprasymas;
import static com.example.android.turistas.R.id.foto;

public class word4 {

    public static final String NERA = "nera";
    private String NER_PAVADINIMO= NERA;
    private String mPavadinimas=NER_PAVADINIMO;
    private String mAprasymas;
    private int mFoto;
    public word4 (String Aprasymas,int foto)
    {
        mFoto=foto;
        mAprasymas=Aprasymas;
    }
    public word4 (String Aprasymas,int foto,String Pavadinimas)
    {
        mFoto=foto;
        mPavadinimas=Pavadinimas;
        mAprasymas=Aprasymas;
    }
    public String getPavadinimas()
    {
        return mPavadinimas;
    }
    public String getaprasymas()
    {
        return mAprasymas;
    }
    public int getFoto ()
    {
        return mFoto;
    }

}
