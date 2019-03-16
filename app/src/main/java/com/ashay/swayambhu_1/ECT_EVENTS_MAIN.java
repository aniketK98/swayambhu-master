package com.ashay.swayambhu_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class ECT_EVENTS_MAIN extends AppCompatActivity {

    private FeatureCoverFlow coverFlow_ECT;

    private ECT_EVENT_ADAPTER ECTEVENTADAPTER;

    private List<ECT_EVENT_1> ECTEvent1List = new ArrayList<>();
    private TextSwitcher mTitle_ECT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ect__events__main);


        initData();



        mTitle_ECT = (TextSwitcher)findViewById(R.id.title_ECT);
        mTitle_ECT.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(ECT_EVENTS_MAIN.this);
                TextView txt = (TextView) inflater.inflate((R.layout.layout_title),null);
                txt.setTextColor(Color.BLACK);
                txt.setTextSize(30);

                return txt;

            }
        });

        Animation in = AnimationUtils.loadAnimation(this,R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom);

        mTitle_ECT.setAnimation(in);
        mTitle_ECT.setAnimation(out);




        ECTEVENTADAPTER = new ECT_EVENT_ADAPTER(ECTEvent1List,this);
        coverFlow_ECT = (FeatureCoverFlow) findViewById(R.id.coverflow_ECT);
        coverFlow_ECT.setAdapter(ECTEVENTADAPTER);

        coverFlow_ECT.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle_ECT.setText(ECTEvent1List.get(position).getName());


            }

            @Override
            public void onScrolling() {

            }
        });


        coverFlow_ECT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent in = new Intent(getApplicationContext(), Micron_ECT.class);
                    startActivity(in);

                }
                if(position == 1)
                {
                    Intent in = new Intent(getApplicationContext(), Sports_Data_ECT.class);
                    startActivity(in);
                }

                if(position == 2)
                {
                    Intent in = new Intent(getApplicationContext(),Mat_Mania.class);
                    startActivity(in);
                }

                if(position == 3)
                {
                    Intent in = new Intent(getApplicationContext(), ElectromaniaWork_ECT.class);
                    startActivity(in);
                }
                if (position == 4) {
                    Intent in = new Intent(getApplicationContext(), Techno_Ace_EEP.class);
                    startActivity(in);
                }
                if (position == 5) {
                    Intent in = new Intent(getApplicationContext(), CrossTheStairs_EEP.class);
                    startActivity(in);
                }
                if (position == 6) {
                    Intent in = new Intent(getApplicationContext(), Khoj2k19_EEP.class);
                    startActivity(in);
                }


            }
        });




    }

    private void initData()
    {


        ECTEvent1List.add(new ECT_EVENT_1("Micron", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRWq8ekW3oyFYrsH0DiC1NE3cU0tF_kmRg7C-KgYlFXV10mR94iQ"));
        ECTEvent1List.add(new ECT_EVENT_1("Sports Data Analytic", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREAEpDz6RXjgtmuEcPAkvcmip9o3W6z_wLmI2nqHMD8-VnbhcJ1Q"));
        ECTEvent1List.add(new ECT_EVENT_1("The Mat Hacker", "https://cdn.shopify.com/s/files/1/1787/8943/products/887305559810685529a3f34aec898494_600x.png?v=1517279431"));
        ECTEvent1List.add(new ECT_EVENT_1("Electromania Workshop", "https://sites.google.com/site/electromaniablog/_/rsrc/1449511582560/config/customLogo.gif?revision=6"));
        ECTEvent1List.add(new ECT_EVENT_1("Techno Ace", "https://image.freepik.com/free-vector/technological-logo_1035-6545.jpg"));
        ECTEvent1List.add(new ECT_EVENT_1("Cross the Stairs", "https://icortechnology.com/wp-content/uploads/2016/09/Mini-CALIBER-SWAT-Robot-Stair-climb.jpg"));
        ECTEvent1List.add(new ECT_EVENT_1("KHOJ 2k19", "https://in.bookmyshow.com/entertainment/wp-content/uploads/2017/06/feature-min.jpg"));
    }

    void Circlemenu(View v)
    {
        Intent in = new Intent(getApplicationContext(),Floatingmenu.class);
        startActivity(in);
    }


}
