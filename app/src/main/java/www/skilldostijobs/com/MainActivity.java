package www.skilldostijobs.com;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import www.skilldostijobs.com.adapter.SliderAdapter;

public class MainActivity extends AppCompatActivity {

    private Context context = this;
    private ViewPager mSlider;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSlider = findViewById(R.id.walkthrough_viewpager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabDots);

        SliderAdapter adapter = new SliderAdapter(context);
        mSlider.setAdapter(adapter);
        tabLayout.setupWithViewPager(mSlider, true);
        mSlider.addOnPageChangeListener(listener);

         fab = findViewById(R.id.fab_next);


    }

    ViewPager.OnPageChangeListener listener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            if (i==2){
                fab.show();
                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(context,LoginSignUp.class));
                        finish();
                    }
                });//startActivity(new Intent(context,LoginSignUp.class));
            }else{

            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
