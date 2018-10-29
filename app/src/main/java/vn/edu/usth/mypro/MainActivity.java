package vn.edu.usth.mypro;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import vn.edu.usth.mypro.Notifications.NotificationsFragment;
import vn.edu.usth.mypro.UserSetting.optionFragment;
import vn.edu.usth.mypro.CalendarEvents.CalendarFragment;
import vn.edu.usth.mypro.Home.Courses.CourseModel;
import vn.edu.usth.mypro.Home.HomeFragment;
import vn.edu.usth.mypro.Home.SiteNewsModel;
import vn.edu.usth.mypro.Messages.ContactModel;
import vn.edu.usth.mypro.Messages.MessagesFragment;
import vn.edu.usth.mypro.Messages.MyMessageModel;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SiteNewsModel.init();
        MyMessageModel.init();
        ContactModel.init();
        CourseModel.init();
        setContentView(R.layout.activity_main);

        binding();
        Log.d("mytag","hello");
    }

    void binding() {
        bnv = findViewById(R.id.main_navigation);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Log.d("Pressing", "" + menuItem.getItemId());
                switch(menuItem.getItemId()) {
                    case R.id.navigation_home: {
                        replaceFragment(new HomeFragment(),false);
                        Log.d("clicking home","Hello");
                        getSupportActionBar().setTitle("USTH Moodle");
                        break;
                    }
                    case R.id.navigation_calendar: {
                        replaceFragment(new CalendarFragment(),false);
                        getSupportActionBar().setTitle("Calendar Events");
                        break;
                    }
                    case R.id.navigation_messages: {
                        replaceFragment(new MessagesFragment(),false);
                        getSupportActionBar().setTitle("Messages");
                        break;
                    }
                    case R.id.navigation_notifications: {
                        replaceFragment(new NotificationsFragment(), false);
                        getSupportActionBar().setTitle("Notifications");
                        break;
                    }
                    case R.id.navigation_user: {
                        replaceFragment(new optionFragment(), false);
                        getSupportActionBar().setTitle("USTH Moodle");
                        break;
                    }
                }
                return true;
            }
        });
    }

    void replaceFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_container,fragment);
        if (addToBackStack) ft.addToBackStack(null);
        ft.commit();
    }

}
