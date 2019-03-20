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

public class General_Event_Main extends AppCompatActivity {

    private FeatureCoverFlow coverFlow_General;

    private General_Event_Adapter GENERALEVENTADAPTER;

    private List<General_Event_1> GeneralEvent1List = new ArrayList<>();
    private TextSwitcher mTitle_General;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__event__main);


        initData();



        mTitle_General = (TextSwitcher)findViewById(R.id.title_General);
        mTitle_General.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(General_Event_Main.this);
                TextView txt = (TextView) inflater.inflate((R.layout.layout_title),null);
                txt.setTextColor(Color.BLACK);
                txt.setTextSize(30);

                return txt;

            }
        });

        Animation in = AnimationUtils.loadAnimation(this,R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom);

        mTitle_General.setAnimation(in);
        mTitle_General.setAnimation(out);






        GENERALEVENTADAPTER= new General_Event_Adapter(GeneralEvent1List,this);
        coverFlow_General = (FeatureCoverFlow) findViewById(R.id.coverflow_General);
        coverFlow_General.setAdapter(GENERALEVENTADAPTER);

        coverFlow_General.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle_General.setText(GeneralEvent1List.get(position).getName());


            }

            @Override
            public void onScrolling() {

            }
        });


        coverFlow_General.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent in = new Intent(getApplicationContext(),JNEC_KBC_open.class);
                    startActivity(in);

                }
                if(position == 1)
                {
                    Intent in = new Intent(getApplicationContext(),SurvivalBattle_open.class);
                    startActivity(in);
                }

                if(position == 2)
                {
                    Intent in = new Intent(getApplicationContext(), TechOne_open.class);
                    startActivity(in);
                }
                if(position == 3)
                {
                    Intent in = new Intent(getApplicationContext(), MrMsTechy_open.class);
                    startActivity(in);
                }
                if(position == 4)
                {
                    Intent in = new Intent(getApplicationContext(), Bestfromwaste_open.class);
                    startActivity(in);
                }
                if(position == 5)
                {
                    Intent in = new Intent(getApplicationContext(), BussinessIdea_open.class);
                    startActivity(in);
                }
                if(position == 6)
                {
                    Intent in = new Intent(getApplicationContext(), Proyekto_open.class);
                    startActivity(in);
                }
                if(position == 7)
                {
                    Intent in = new Intent(getApplicationContext(), Ideathon_open.class);
                    startActivity(in);
                }
                if(position == 8)
                {
                    Intent in = new Intent(getApplicationContext(), Speakup_open.class);
                    startActivity(in);
                }

                if (position == 9) {
                    Intent in = new Intent(getApplicationContext(), Innovate_open.class);
                    startActivity(in);
                }

                if (position == 10) {
                    Intent in = new Intent(getApplicationContext(), LeaderInYou_open.class);
                    startActivity(in);
                }

                if (position == 11) {
                    Intent in = new Intent(getApplicationContext(), TechnoConfetti_open.class);
                    startActivity(in);
                }

                if (position == 12) {
                    Intent in = new Intent(getApplicationContext(), Water_rocket.class);
                    startActivity(in);
                }

                if (position == 13) {
                    Intent in = new Intent(getApplicationContext(), BehindTheLens_open.class);
                    startActivity(in);
                }

                if (position == 14) {
                    Intent in = new Intent(getApplicationContext(), EnggInterns_open.class);
                    startActivity(in);
                }

                if (position == 15) {
                    Intent in = new Intent(getApplicationContext(), MovieMaking_open.class);
                    startActivity(in);
                }

            }
        });




    }

    private void initData()
    {
        GeneralEvent1List.add(new General_Event_1("JNEC ka KBC", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0dIw52IesjCXtFz9d4nJW2tY5Ju-_-I1JuAnTTWSXCEEriViyBQ"));
        GeneralEvent1List.add(new General_Event_1("Survival Battle", "https://fsb.zobj.net/crop.php?r=QnkDZMFRpSkq5MLFnT2tuDowQj9dgbOFKCp-mvKjQZpS1rTMUQYOf_4-oOu8mXpIE5MOnnrzLR2bM_p0jo80KoBa48TZhyDlQjBhKcoxhbbQDYHoeaWE-rhGtZ-evfUCs3AGtR0NvcXc2NBB"));
        GeneralEvent1List.add(new General_Event_1("Tech One", "http://thamesandkosmos.com/images/stories/virtuemart/product/620377_roboticsworkshop_model8.jpg"));
        GeneralEvent1List.add(new General_Event_1("Mr. and Ms. Techy", "https://previews.123rf.com/images/yupiramos/yupiramos1809/yupiramos180913407/110155288-business-couple-with-social-media-marketing-icons-vector-illustration.jpg"));
        GeneralEvent1List.add(new General_Event_1("Best from Waste", "https://img.sheroes.in/tr:w-790/img/uploads/sheroespage/logoes/1517993979cardboard-tube-monster.jpg?tr=w-790"));
        GeneralEvent1List.add(new General_Event_1("Business Idea Competition", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRBWQviIWVULy9Svnq7culhyrZ1tt_r4A5Ax7IwqFTEVU-L47KP"));
        GeneralEvent1List.add(new General_Event_1("Proyecto", "http://beta.radiusmedia.com/wp-content/uploads/2018/07/management.png"));
        GeneralEvent1List.add(new General_Event_1("Ideathon", "http://millenniumupdate.in/img/competiton/paper.jpg"));
        GeneralEvent1List.add(new General_Event_1("Speak-up", "http://varsitysportssa.com/wp-content/uploads/2018/01/SpeakUpLogoOnWhite.png"));
        GeneralEvent1List.add(new General_Event_1("Innovate to implement", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTzc9t9xnKXxspjmlh43S0laxDj_WusbFKEs0CpF3FN0Txnxl-w"));
        GeneralEvent1List.add(new General_Event_1("Leader in You", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiPdvf7CxVFXhT_Gj7EJMUvPriU8aYOV6SKV00oCY7TjIT6tr2Eg"));
        GeneralEvent1List.add(new General_Event_1("Techno Confetti Poster Competition", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6DP4P-wWddMitqq8m9KLvxFjKy78H9vXNA2Y8XpLIKiV5eohE"));
        GeneralEvent1List.add(new General_Event_1("Water Rocket", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQQgZnPfD6zTYiRIvQNDd0PraC3s31R0WlFR00EMLLlActsm4EZ"));
        GeneralEvent1List.add(new General_Event_1("Behind the Lens", "http://garyjonesphotosblog.com/wp-content/uploads/2015/09/camera-lens.jpg"));
        GeneralEvent1List.add(new General_Event_1("Engineering Interns", "https://image.freepik.com/free-vector/variety-construction-engineer-icons_23-2147506665.jpg"));
        GeneralEvent1List.add(new General_Event_1("Movie Making Workshop", "http://clipart-library.com/img1/1594085.jpg"));


    }
}
