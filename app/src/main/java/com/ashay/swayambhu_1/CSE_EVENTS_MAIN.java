package com.ashay.swayambhu_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class CSE_EVENTS_MAIN extends AppCompatActivity {

    private FeatureCoverFlow coverFlow;

    private CSE_EVENT_ADAPTER CSEEVENTADAPTER;

    private List<CSE_Event_1> CSEEvent1List = new ArrayList<>();
    private TextSwitcher mTitle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();



        mTitle = (TextSwitcher)findViewById(R.id.title);
        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(CSE_EVENTS_MAIN.this);
                TextView txt = (TextView) inflater.inflate((R.layout.layout_title),null);
                txt.setTextColor(Color.BLACK);
                txt.setTextSize(30);

                return txt;

            }
        });

        Animation in = AnimationUtils.loadAnimation(this,R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom);

        mTitle.setAnimation(in);
        mTitle.setAnimation(out);


        //

        CSEEVENTADAPTER = new CSE_EVENT_ADAPTER(CSEEvent1List,this);
        coverFlow = (FeatureCoverFlow) findViewById(R.id.coverflow);
        coverFlow.setAdapter(CSEEVENTADAPTER);

        coverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(CSEEvent1List.get(position).getName());


            }

            @Override
            public void onScrolling() {

            }
        });


        coverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent in = new Intent(getApplicationContext(), C_Ladder_CSE.class);
                    startActivity(in);

                }
                if(position == 1)
                {
                    Intent in = new Intent(getApplicationContext(), Web_War_IT.class);
                    startActivity(in);
                }

                if(position == 2)
                {
                    Intent in = new Intent(getApplicationContext(), Code_Wizard_MCA.class);
                    startActivity(in);
                }

                if(position == 3)
                {
                    Intent in = new Intent(getApplicationContext(), Codingo2_CSE.class);
                    startActivity(in);
                }

                if (position == 4) {
                    Intent in = new Intent(getApplicationContext(), FastFurious_IT.class);
                    startActivity(in);
                }

                if (position == 5) {
                    Intent in = new Intent(getApplicationContext(), Hackathon_CSE.class);
                    startActivity(in);
                }

            }
        });


       /* Animation a = AnimationUtils.loadAnimation(this, R.anim.textanim);
        a.reset();*/



    }

    private void initData()
    {


        CSEEvent1List.add(new CSE_Event_1("C over Snakes", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTe7kfP28dRoni-eCNq-t0sZdiELECGx0xBjvCKPbsIZ-8XQ90dfw"));
        CSEEvent1List.add(new CSE_Event_1("Web War","https://www.eventmanagerblog.com/wp-content/uploads/2014/03/creating-perfect-event-websites.png"));
        CSEEvent1List.add(new CSE_Event_1("Code Wizards", "https://image.freepik.com/free-vector/web-programming-background_1300-188.jpg"));
        CSEEvent1List.add(new CSE_Event_1("Codingo2.0", "https://image.freepik.com/free-vector/web-design-background_1300-72.jpg"));
        CSEEvent1List.add(new CSE_Event_1("Fast and Furious", "https://pbs.twimg.com/profile_images/984492992751845376/WwQHuVFq_400x400.jpg"));
        CSEEvent1List.add(new CSE_Event_1("Hackathon", "https://www.meetingsnet.com/sites/meetingsnet.com/files/styles/article_featured_retina/public/uploads/2016/11/thinkstockphotos-529162111.jpg?itok=_A-PkVlB"));
    }





}
