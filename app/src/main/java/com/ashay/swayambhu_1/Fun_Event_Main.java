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

public class Fun_Event_Main extends AppCompatActivity {


    private FeatureCoverFlow coverFlow_Fun;

    private Fun_Event_Adapter FUNEVENTADAPTER;

    private List<Fun_Event_1> FunEvent1List = new ArrayList<>();
    private TextSwitcher mTitle_Fun;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun__event__main);


        initData();



        mTitle_Fun = (TextSwitcher)findViewById(R.id.title_Fun);
        mTitle_Fun.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(Fun_Event_Main.this);
                TextView txt = (TextView) inflater.inflate((R.layout.layout_title),null);
                txt.setTextColor(Color.BLACK);
                txt.setTextSize(30);

                return txt;

            }
        });

        Animation in = AnimationUtils.loadAnimation(this,R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom);

        mTitle_Fun.setAnimation(in);
        mTitle_Fun.setAnimation(out);




        FUNEVENTADAPTER= new Fun_Event_Adapter(FunEvent1List,this);
        coverFlow_Fun = (FeatureCoverFlow) findViewById(R.id.coverflow_FUN);
        coverFlow_Fun.setAdapter(FUNEVENTADAPTER);

        coverFlow_Fun.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle_Fun.setText(FunEvent1List.get(position).getName());


            }

            @Override
            public void onScrolling() {

            }
        });


        coverFlow_Fun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent in = new Intent(getApplicationContext(), JNEC_KBC_open.class);
                    startActivity(in);

                }

            }
        });




    }

    private void initData()
    {


        FunEvent1List.add(new Fun_Event_1("Murder Mystery","https://t2.rbxcdn.com/f9394f26c573740776260e19051ef7ee"));


    }


}
