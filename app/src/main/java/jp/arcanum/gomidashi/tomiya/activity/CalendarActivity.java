package jp.arcanum.gomidashi.tomiya.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.LinearLayout;

import org.kazzz.view.calendar.CalendarSelectionEvent;
import org.kazzz.view.calendar.CalendarView;
import org.kazzz.view.calendar.DateInfo;
import org.kazzz.view.calendar.OnCalendarSelectionListener;

import java.util.Calendar;
import java.util.Date;

import jp.arcanum.gomidashi.tomiya.R;

public class CalendarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_calendar);

        LinearLayout ll = new LinearLayout(this);
        setContentView(ll);

        CalendarView calView = new CalendarView(this);
        ll.addView(calView);

        // 地区名取得
        SharedPreferences sp = getSharedPreferences(SettingsActivity.class.getName(), MODE_PRIVATE);
        String localName = sp.getString("localname", "不明");
        setTitle(localName);

        calView.addOnCalendarSelectionListener(
                new OnCalendarSelectionListener() {
                    @Override
                    public void onCalendarSelection(CalendarSelectionEvent event) {
                        DateInfo dateinfo = event.getDateInfo();

                        Calendar calToday    = Calendar.getInstance();
                        Calendar calSelected = Calendar.getInstance();
                        calSelected.set(Calendar.YEAR  , dateinfo.getYear());
                        calSelected.set(Calendar.MONTH , dateinfo.getMonth() - 1);
                        calSelected.set(Calendar.DATE  , dateinfo.getDay());

                        long sabun = calSelected.getTimeInMillis() - calToday.getTimeInMillis();
                        int addDate = (int)(sabun / (1000 * 60 * 60 * 24));

                        Intent intent = getIntent();
                        intent.setClass(getApplicationContext(), GomidashiActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.putExtra("adddate", addDate);
                        startActivity(intent);
                        finish();
                    }
                }
        );

    }



}
