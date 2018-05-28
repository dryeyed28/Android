package com.example19.kitri.a264;

import android.app.TabActivity;
import android.database.DatabaseUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("강아지");
            tabSpecDog.setContent(R.id.tabDog);
            tabHost.addTab(tabSpecDog);
        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");
            tabSpecCat.setContent(R.id.tabCat);
            tabHost.addTab(tabSpecCat);
        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");
            tabSpecRabbit.setContent(R.id.tabRAbbit);
            tabHost.addTab(tabSpecRabbit);
        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("말");
            tabSpecHorse.setContent(R.id.tabHorse);
            tabHost.addTab(tabSpecHorse);

            tabHost.setCurrentTab(0);
    }
}
