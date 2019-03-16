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
        ECTEvent1List.add(new ECT_EVENT_1("Sports Data Analytic", "data:image/png;base64,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"));
        ECTEvent1List.add(new ECT_EVENT_1("The Mat Hacker", "https://www.zyxware.com/files/styles/article/public/software_testing.jpg?itok=0j0cFmYc"));
        ECTEvent1List.add(new ECT_EVENT_1("Electromania Workshop", "https://cdn.hackaday.io/images/8490861449161850753.JPG"));
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
