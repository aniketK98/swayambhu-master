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
        ECTEvent1List.add(new ECT_EVENT_1("Sports Data Analytic", "data:image/png;base64,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\"));\nVORK5CYII=        "));
        ECTEvent1List.add(new ECT_EVENT_1("The Mat Hacker", "https://www.zyxware.com/files/styles/article/public/software_testing.jpg?itok=0j0cFmYc"));
        ECTEvent1List.add(new ECT_EVENT_1("Electromania Workshop", "data:image/jpeg;base64,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"));
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
