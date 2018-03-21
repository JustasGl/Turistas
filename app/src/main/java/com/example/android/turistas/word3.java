package com.example.android.turistas;


import static com.example.android.turistas.R.id.desine;
import static com.example.android.turistas.R.id.foto;
import static com.example.android.turistas.R.id.kaire;

public class word3 {
    public static final String NERA_PAVADINIMO = "nera pavadinimo";
    private String NER_INFO = NERA_PAVADINIMO;
    private String mtext1,mtext2,mtext3,mtext4;
    private String mpavadinimas = NER_INFO;
    private String maprasymas = NER_INFO;
    private int mFoto1,mFoto2;

    public word3 (int foto1, String text1,String text2, int foto2,String text3,String text4)
    {
        mtext1=text1;
        mtext2 = text2;
        mtext3 = text3;
        mtext4=text4;

        mFoto1=foto1;
        mFoto2 = foto2;

        mpavadinimas = NER_INFO;
        maprasymas = NER_INFO;

    }
    public word3 (int foto1, String text1,String text2, int foto2,String text3,String text4 ,String pavadinimas, String aprasymas)
    {
        mtext1=text1;
        mtext2 = text2;
        mtext3 = text3;
        mtext4=text4;

        mFoto1=foto1;
        mFoto2 = foto2;

        mpavadinimas = pavadinimas;
        maprasymas = aprasymas;
    }

    public String text1() {return mtext1;}
    public String text2() {return mtext2;}
    public String text3() {return mtext3;}
    public String text4() {return mtext4;}

    public int getFoto1 ()
    {
        return mFoto1;
    }
    public int getFoto2 ()
    {
        return mFoto2;
    }

    public String getpavadinimas(){return mpavadinimas;}
    public String getaprasymas(){return maprasymas;}
}
