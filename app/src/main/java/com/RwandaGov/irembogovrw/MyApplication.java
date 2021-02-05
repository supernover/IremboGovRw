package com.RwandaGov.irembogovrw;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;


public class MyApplication extends Application {

    private com.RwandaGov.irembogovrw.AppOpenAdManager appOpenAdManager;

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this);

        appOpenAdManager = new com.RwandaGov.irembogovrw.AppOpenAdManager
                .Builder(this, com.RwandaGov.irembogovrw.AppOpenAdManager.TEST_AD_UNIT_ID)
                .build();
    }

    public com.RwandaGov.irembogovrw.AppOpenAdManager getAppOpenAdManager() {
        return this.appOpenAdManager;
    }
}
