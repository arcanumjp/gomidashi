package jp.arcanum.gomidashi.tomiya.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import jp.arcanum.gomidashi.tomiya.R;
import jp.arcanum.gomidashi.tomiya.util.GomiInfo;
import jp.arcanum.gomidashi.tomiya.util.LocalUtil;

public class SelectGomiTypeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_selectgomitype);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // アイテムを追加します
        adapter.add(LocalUtil.GOMI_TYPE_NAMA);
        adapter.add(LocalUtil.GOMI_TYPE_KAMIKUZU);
        adapter.add(LocalUtil.GOMI_TYPE_KAN);
        adapter.add(LocalUtil.GOMI_TYPE_ZATUTETU);
        adapter.add(LocalUtil.GOMI_TYPE_KAMI);
        adapter.add(LocalUtil.GOMI_TYPE_KANDENCHI);
        adapter.add(LocalUtil.GOMI_TYPE_BIN);
        adapter.add(LocalUtil.GOMI_TYPE_WAREMONO);
        adapter.add(LocalUtil.GOMI_TYPE_IRUI);
        adapter.add(LocalUtil.GOMI_TYPE_HAPPO);
        adapter.add(LocalUtil.GOMI_TYPE_PRASTIC);
        adapter.add(LocalUtil.GOMI_TYPE_ZATUGAMI);
        adapter.add(LocalUtil.GOMI_TYPE_FUKUGO);
        adapter.add(LocalUtil.GOMI_TYPE_PET);

        Spinner spinner = (Spinner) findViewById(R.id.gomitype);
        // アダプターを設定します
        spinner.setAdapter(adapter);
        // スピナーのアイテムが選択された時に呼び出されるコールバックリスナーを登録します
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                // 選択されたアイテムを取得します
                String item = (String) spinner.getSelectedItem();
                //Toast.makeText(SelectGomiTypeActivity.this, item, Toast.LENGTH_LONG).show();
                showGomidashi(item);
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        ListView searchlistView = (ListView) findViewById(R.id.searchlist);
        ArrayAdapter<GomiInfo> searchAdapter = new ArrayAdapter<GomiInfo>(getApplicationContext(), R.layout.select_gomi_day, _dateList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                GomiInfo gomiInfo = _dateList.get(position);

                if (convertView == null) {
                    LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    convertView = layoutInflater.inflate(R.layout.select_gomi_day, null);
                }

                TextView dateView = (TextView) convertView.findViewById(R.id.date);
                SimpleDateFormat sdf = new SimpleDateFormat("MM月 dd日");

                String dateText = sdf.format(gomiInfo.getDate());
                dateText = dateText + "(" + gomiInfo.getDayOfWeekName() + ")";
                dateView.setText(dateText);

                return convertView;
            }
        };
        searchlistView.setAdapter(searchAdapter);


    }

    /**
     * 検索した一覧
     */
    private List<GomiInfo> _dateList = new ArrayList<GomiInfo>();

    private void showGomidashi(String item){

        Log.d("1", "@@@ " + item);

        // 地区名取得
        SharedPreferences sp = getSharedPreferences(SettingsActivity.class.getName(), MODE_PRIVATE);
        String localName = sp.getString("localname", "不明");

        // 今日を取得
        Calendar cal = Calendar.getInstance();
        _dateList.clear();
        for(int i=0; i<31; i++){
            cal.add(Calendar.DATE, 1);

            GomiInfo gomiinfo = LocalUtil.getGomiInfo(cal, localName);
            Log.d("2", localName + " / " + new SimpleDateFormat("yyyy/MM/dd").format(cal.getTime()) + "  " + gomiinfo.getDayOfWeekName() +  "  (" + gomiinfo.getTodayGomiName() +  ") ---------------------------------------- ");

            String gomi = LocalUtil.GOMITYPE_MAP.get(gomiinfo.getTodayGomiName());
            Log.d("3", gomi);
            if(gomi.indexOf(item)!=-1){
                Log.d("4", "  --------------->");
                _dateList.add(gomiinfo);
            }
        }

        ListView searchListView = (ListView) findViewById(R.id.searchlist);
        ArrayAdapter arrayAdapter = (ArrayAdapter) searchListView.getAdapter();
        arrayAdapter.notifyDataSetChanged();


    }

}
