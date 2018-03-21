package com.example.android.turistas;

import android.content.Intent;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static junit.runner.Version.id;


public class Images {

    public static final String AROMA = "aroma";
    public static final String PASNERIJU = "pasneriju";
    public static final String AIROVITA = "airovita";
    public static final String VIKGRETA = "vikgreta";
    public static final String SMAGRATIS = "smagratis";
    public static final String GLOBEPARK = "globepark";
    public static final String VYTAUTOBAMSO = "vytautobamso";
    public static final String TAURAGESVIESBUTIS = "tauragesviesbutis";
    public static final String GRAFOZUBOVO = "grafozubovo";
    public static final String JURO = "juro";
    public static final String GRAFAITE = "grafaite";
    public static final String TURNE = "turne";
    public static final String HOTELSIAULIAI = "hotelsiauliai";
    public static final String SINCHRONAS = "sinchronas";
    public static final String PASSTEFA = "passtefa";
    public static final String VIESBUTISTELSIAI = "viesbutistelsiai";
    public static final String MESKOSGUOLIS = "meskosguolis";
    public static final String DZIUGOKALNAS = "Dziugokalnas";
    public static final String ROSSO = "Rosso";
    public static final String GAMA = "gama";
    public static final String SYNET = "synet";
    public static final String ARKA = "arka";
    public static final String LAISVES30 = "laisves30";
    public static final String NG = "NG";
    public static final String KRISTA = "krista";
    public static final String PORTO = "porto";
    private Random randNo;
    private ArrayList<Integer> imageId;

    public Images(String pavadinimas) {
        switch (pavadinimas) {
            case PORTO:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.porto0);
                imageId.add(R.drawable.porto1);
                imageId.add(R.drawable.porto2);
                imageId.add(R.drawable.porto3);
                imageId.add(R.drawable.porto4);
                break;

            case KRISTA:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.krista1);
                imageId.add(R.drawable.krista2);
                break;

            case NG:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.ng0);
                imageId.add(R.drawable.ng1);
                imageId.add(R.drawable.ng2);
                imageId.add(R.drawable.ng3);
                break;

            case LAISVES30:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.laisves0);
                imageId.add(R.drawable.laisves1);
                imageId.add(R.drawable.laisves2);
                imageId.add(R.drawable.laisves3);
                imageId.add(R.drawable.laisves4);
                imageId.add(R.drawable.laisves5);
                imageId.add(R.drawable.laisves6);
                break;
            case ARKA:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.arka0);
                imageId.add(R.drawable.arka1);
                imageId.add(R.drawable.arka2);
                imageId.add(R.drawable.arka3);
                imageId.add(R.drawable.arka4);
                imageId.add(R.drawable.arka5);
                imageId.add(R.drawable.arka6);
                break;

            case SYNET:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.synet0);
                imageId.add(R.drawable.synet1);
                imageId.add(R.drawable.synet2);
                imageId.add(R.drawable.synet3);
                imageId.add(R.drawable.synet4);
                imageId.add(R.drawable.synet5);
                imageId.add(R.drawable.synet6);
                imageId.add(R.drawable.synet7);
                imageId.add(R.drawable.synet8);
                imageId.add(R.drawable.synet9);
                imageId.add(R.drawable.synet10);
                break;

            case GAMA:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.gama0);
                imageId.add(R.drawable.gama1);
                imageId.add(R.drawable.gama2);
                imageId.add(R.drawable.gama3);
                imageId.add(R.drawable.gama4);
                imageId.add(R.drawable.gama5);
                imageId.add(R.drawable.gama6);
                imageId.add(R.drawable.gama7);
                imageId.add(R.drawable.gama8);
                imageId.add(R.drawable.gama9);
                break;

            case ROSSO:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.rosso0);
                imageId.add(R.drawable.rosso1);
                imageId.add(R.drawable.rosso2);
                imageId.add(R.drawable.rosso3);
                imageId.add(R.drawable.rosso4);
                imageId.add(R.drawable.rosso5);
                imageId.add(R.drawable.rosso6);
                imageId.add(R.drawable.rosso7);
                imageId.add(R.drawable.rosso8);
                imageId.add(R.drawable.rosso9);
                imageId.add(R.drawable.rosso10);
                imageId.add(R.drawable.rosso11);
                imageId.add(R.drawable.rosso12);
                imageId.add(R.drawable.rosso13);
                imageId.add(R.drawable.rosso14);
                imageId.add(R.drawable.rosso15);
                imageId.add(R.drawable.rosso16);
                imageId.add(R.drawable.rosso17);
                imageId.add(R.drawable.rosso18);
                imageId.add(R.drawable.rosso19);
                break;

            case DZIUGOKALNAS:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.dziugokalnas0);
                imageId.add(R.drawable.dziugokalnas1);
                imageId.add(R.drawable.dziugokalnas2);
                imageId.add(R.drawable.dziugokalnas3);
                break;
            case MESKOSGUOLIS:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.meskosguolis0);
                imageId.add(R.drawable.meskosguolis1);
                imageId.add(R.drawable.meskosguolis2);
                imageId.add(R.drawable.meskosguolis3);
                imageId.add(R.drawable.meskosguolis4);
                imageId.add(R.drawable.meskosguolis5);
                imageId.add(R.drawable.meskosguolis6);
                imageId.add(R.drawable.meskosguolis7);
                imageId.add(R.drawable.meskosguolis8);
                imageId.add(R.drawable.meskosguolis9);
                break;
            case VIESBUTISTELSIAI:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.viesbutistelsiai0);
                imageId.add(R.drawable.viesbutistelsiai1);
                imageId.add(R.drawable.viesbutistelsiai2);
                imageId.add(R.drawable.viesbutistelsiai3);
                imageId.add(R.drawable.viesbutistelsiai4);
                imageId.add(R.drawable.viesbutistelsiai5);
                break;
            case PASSTEFA:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.passtefa0);
                imageId.add(R.drawable.passtefa1);
                imageId.add(R.drawable.passtefa2);
                imageId.add(R.drawable.passtefa3);
                imageId.add(R.drawable.passtefa4);
                imageId.add(R.drawable.passtefa5);
                imageId.add(R.drawable.passtefa6);
                imageId.add(R.drawable.passtefa7);
                imageId.add(R.drawable.passtefa8);
                imageId.add(R.drawable.passtefa9);
                break;
            case SINCHRONAS:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.sinchronas0);
                imageId.add(R.drawable.sinchronas1);
                imageId.add(R.drawable.sinchronas2);
                imageId.add(R.drawable.sinchronas3);
                imageId.add(R.drawable.sinchronas4);
                imageId.add(R.drawable.sinchronas5);
                imageId.add(R.drawable.sinchronas6);
                imageId.add(R.drawable.sinchronas7);
                imageId.add(R.drawable.sinchronas8);
                imageId.add(R.drawable.sinchronas9);
                imageId.add(R.drawable.sinchronas10);
                break;
            case HOTELSIAULIAI:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.siauliuviesbutis0);
                imageId.add(R.drawable.siauliuviesbutis1);
                imageId.add(R.drawable.siauliuviesbutis2);
                imageId.add(R.drawable.siauliuviesbutis3);
                imageId.add(R.drawable.siauliuviesbutis4);
                imageId.add(R.drawable.siauliuviesbutis5);
                imageId.add(R.drawable.siauliuviesbutis6);
                imageId.add(R.drawable.siauliuviesbutis7);
                imageId.add(R.drawable.siauliuviesbutis8);
                imageId.add(R.drawable.siauliuviesbutis9);
                imageId.add(R.drawable.siauliuviesbutis10);
                break;
            case TURNE:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.turne0);
                imageId.add(R.drawable.turne1);
                imageId.add(R.drawable.turne2);
                imageId.add(R.drawable.turne3);
                imageId.add(R.drawable.turne4);
                imageId.add(R.drawable.turne5);
                imageId.add(R.drawable.turne6);
                imageId.add(R.drawable.turne7);
                imageId.add(R.drawable.turne8);
                imageId.add(R.drawable.turne9);
                break;
            case GRAFAITE:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.grafaite0);
                imageId.add(R.drawable.grafaite1);
                imageId.add(R.drawable.grafaite2);
                imageId.add(R.drawable.grafaite3);
                imageId.add(R.drawable.grafaite4);
                imageId.add(R.drawable.grafaite5);
                break;
            case JURO:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.juro0);
                imageId.add(R.drawable.juro1);
                imageId.add(R.drawable.juro2);
                imageId.add(R.drawable.juro3);
                imageId.add(R.drawable.juro4);
                imageId.add(R.drawable.juro5);
                break;
            case GRAFOZUBOVO:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.zubovo0);
                imageId.add(R.drawable.zubovo1);
                imageId.add(R.drawable.zubovo2);
                imageId.add(R.drawable.zubovo3);
                imageId.add(R.drawable.zubovo4);
                imageId.add(R.drawable.zubovo5);
                imageId.add(R.drawable.zubovo6);
                imageId.add(R.drawable.zubovo7);
                imageId.add(R.drawable.zubovo8);
                break;
            case TAURAGESVIESBUTIS:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.tauragesviesbutis0);
                imageId.add(R.drawable.tauragesviesbutis1);
                imageId.add(R.drawable.tauragesviesbutis2);
                imageId.add(R.drawable.tauragesviesbutis3);
                imageId.add(R.drawable.tauragesviesbutis4);
                imageId.add(R.drawable.tauragesviesbutis5);
                imageId.add(R.drawable.tauragesviesbutis6);
                break;
            case VYTAUTOBAMSO:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.vytautobamso0);
                imageId.add(R.drawable.vytautobamso1);
                imageId.add(R.drawable.vytautobamso2);
                imageId.add(R.drawable.vytautobamso3);
                imageId.add(R.drawable.vytautobamso4);
                imageId.add(R.drawable.vytautobamso5);
                imageId.add(R.drawable.vytautobamso6);
                imageId.add(R.drawable.vytautobamso7);
                break;
            case GLOBEPARK:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.globepark0);
                imageId.add(R.drawable.globepark1);
                imageId.add(R.drawable.globepark2);
                imageId.add(R.drawable.globepark3);
                imageId.add(R.drawable.globepark4);
                break;
            case SMAGRATIS:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.smagratis0);
                imageId.add(R.drawable.smagratis1);
                imageId.add(R.drawable.smagratis2);
                imageId.add(R.drawable.smagratis3);
                imageId.add(R.drawable.smagratis4);
                imageId.add(R.drawable.smagratis5);
                imageId.add(R.drawable.smagratis6);
                imageId.add(R.drawable.smagratis7);
                imageId.add(R.drawable.smagratis8);
                imageId.add(R.drawable.smagratis9);
                imageId.add(R.drawable.smagratis10);
                imageId.add(R.drawable.smagratis11);
                imageId.add(R.drawable.smagratis12);
                break;
            case VIKGRETA:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.vikgreta0);
                imageId.add(R.drawable.vikgreta1);
                imageId.add(R.drawable.vikgreta2);
                imageId.add(R.drawable.vikgreta3);
                imageId.add(R.drawable.vikgreta4);
                imageId.add(R.drawable.vikgreta5);
                imageId.add(R.drawable.vikgreta6);
                break;
            case AIROVITA:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.airovita0);
                imageId.add(R.drawable.airovita1);
                imageId.add(R.drawable.airovita2);
                imageId.add(R.drawable.airovita3);
                imageId.add(R.drawable.airovita4);
                imageId.add(R.drawable.airovita5);
                imageId.add(R.drawable.airovita6);
                imageId.add(R.drawable.airovita7);
                imageId.add(R.drawable.airovita8);
                break;
            case PASNERIJU:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.pasneriju0);
                imageId.add(R.drawable.pasneriju1);
                imageId.add(R.drawable.pasneriju02);
                imageId.add(R.drawable.pasneriju3);
                imageId.add(R.drawable.pasneriju4);
                imageId.add(R.drawable.pasneriju5);
                break;
            case AROMA:
                imageId = new ArrayList<Integer>();
                imageId.add(R.drawable.aroma0);
                imageId.add(R.drawable.aroma1);
                imageId.add(R.drawable.aroma2);
                imageId.add(R.drawable.aroma3);
                imageId.add(R.drawable.aroma4);
                break;
        }
    }



    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}

