package vn.edu.usth.moodle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * This is "Site Home" screen. Provides an overview about Moodle
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        configureOnClick();
    }


    public void configureOnClick() {
        LinearLayout ll1 = findViewById(R.id.ll_1);
        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "You clicked the Course categories", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout ll2 = findViewById(R.id.ll_2);
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "You clicked the My courses", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout ll3 = findViewById(R.id.ll_3);
        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "You clicked the Site news", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout ll4 = findViewById(R.id.ll_4);
        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "You clicked the Moodle Lecturer Guide", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout ll5 = findViewById(R.id.ll_5);
        ll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "You clicked the Moodle Student Guide", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout ll6 = findViewById(R.id.ll_6);
        ll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "You clicked the Moodle Assistant Guide", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
