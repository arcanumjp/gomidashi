package jp.arcanum.gomidashi.tomiya.activity;

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
import android.widget.Toast;

import jp.arcanum.gomidashi.tomiya.R;

public class TitleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_title);

    }


    /**
     * 今日、明日のゴミを調べる
     * @param view
     */
    public void onClickGomidashi(View view) {

        // 設定取得
        SharedPreferences sp = getSharedPreferences(SettingsActivity.class.getName(), MODE_PRIVATE);
        String localname = sp.getString("localname", "");
        if(localname.equals("")){
            Toast.makeText(getApplicationContext(), "あなたのお住まいの地域を設定してください。", Toast.LENGTH_LONG).show();
            onClickSettings(view);
            return;
        }

        Intent intent = getIntent();
        intent.setClass(this, GomidashiActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

    /**
     * カレンダー表示する
     * @param view
     */
    public void onClickCalendar(View view) {

        Intent intent = getIntent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(getApplicationContext(), CalendarActivity.class);
        startActivity(intent);

    }


    /**
     * ごみの種類から調べる
     * @param view
     */
    public void onClickGomiType(View view) {

        Intent intent = getIntent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClass(getApplicationContext(), SelectGomiTypeActivity.class);
        startActivity(intent);

    }


    /**
     * 設定
     * @param view
     */
    public void onClickSettings(View view){

        Intent intent = getIntent();
        intent.setClass(getApplicationContext(), SettingsActivity.class);
        startActivity(intent);

    }



}
