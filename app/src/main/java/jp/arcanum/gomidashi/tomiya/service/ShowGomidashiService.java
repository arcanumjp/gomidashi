package jp.arcanum.gomidashi.tomiya.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import jp.arcanum.gomidashi.tomiya.activity.GomidashiActivity;

/**
 * Created by shinya.hosokawa on 13/12/23.
 */
public class ShowGomidashiService extends IntentService {

    private int _addDate;

    public ShowGomidashiService(String name, int adddate){
        super(name);
        _addDate = adddate;
    }


    @Override
    protected void onHandleIntent(Intent intent) {

        intent.setClass(getApplicationContext(), GomidashiActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("adddate", _addDate);
        startActivity(intent);

    }
}
