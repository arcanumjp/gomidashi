package jp.arcanum.gomidashi.tomiya.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jp.arcanum.gomidashi.tomiya.R;
import jp.arcanum.gomidashi.tomiya.util.GomiInfo;
import jp.arcanum.gomidashi.tomiya.util.LocalUtil;

public class GomidashiActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gomidashi);

        // 今日、明日？（今日＝０、明日＝１）
        int addDay = 0;
        Intent intent = getIntent();
        addDay = intent.getIntExtra("adddate", 0);

        // 今日か明日か
        String todayortomorrow = "";
        if(addDay == 0){
            todayortomorrow = "　今日のゴミは";
        }
        else if(addDay == 1) {
            todayortomorrow = "　明日のゴミは";
        }
        TextView todayorTomorrowView = (TextView) findViewById(R.id.todayortomorrow);
        todayorTomorrowView.setText(todayortomorrow);

        // 日付取得
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, addDay);
        Date today = cal.getTime();
        SimpleDateFormat sd = new SimpleDateFormat("MM月dd日");
        String todayStr = sd.format(today);
        TextView todayView = (TextView) findViewById(R.id.yyyymmdd);
        todayView.setText(todayStr);

        // 地区名取得
        SharedPreferences sp = getSharedPreferences(SettingsActivity.class.getName(), MODE_PRIVATE);
        String localName = sp.getString("localname", "不明");
        TextView localnameView = (TextView) findViewById(R.id.localname);
        localnameView.setText(localName);

        // 指定日のゴミ情報を取得
        GomiInfo gomiInfo = LocalUtil.getGomiInfo(cal, localName);

        // 第ｎ曜日
        TextView dayofWeekView = (TextView) findViewById(R.id.dayofweek);
        dayofWeekView.setText(gomiInfo.getDayOfWeekName());

        // 今日のごみ取得
        TextView gomiView = (TextView) findViewById(R.id.gomitext);
        gomiView.setText(gomiInfo.getTodayGomiName());

        // ごみの説明
        TextView gomiTypeView = (TextView) findViewById(R.id.gomitype);
        gomiTypeView.setText(gomiInfo.getGomiDescription());

    }




    public void onClickToday(View view){

        Intent intent = getIntent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(getApplicationContext(), GomidashiActivity.class);
        intent.putExtra("adddate", 0);
        startActivity(intent);
        finish();

    }



    public void onClickTomorrow(View view){

        Intent intent = getIntent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(getApplicationContext(), GomidashiActivity.class);
        intent.putExtra("adddate", 1);
        startActivity(intent);
        finish();

    }

    public void onClickCalendar(View view) {

        Intent intent = getIntent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(getApplicationContext(), CalendarActivity.class);
        startActivity(intent);
        finish();

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK){

            Intent intent = getIntent();
            intent.setClass(getApplicationContext(), TitleActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        return false;
    }


}
