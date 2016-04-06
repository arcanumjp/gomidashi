package jp.arcanum.gomidashi.tomiya.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import jp.arcanum.gomidashi.tomiya.R;
import jp.arcanum.gomidashi.tomiya.util.LocalUtil;

public class SettingsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_settings);

        final SharedPreferences sp = getSharedPreferences(SettingsActivity.class.getName(), MODE_PRIVATE);
        String setLocalname = sp.getString("localname", "");

        // ホームページ
        TextView hpView = (TextView) findViewById(R.id.settings_hp_to);
        hpView.setOnTouchListener(
                new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        onTouchUrl(v, event);
                        return false;
                    }
                }
        );

        // メール
        TextView mailView = (TextView) findViewById(R.id.settings_mail_to);
        mailView.setOnTouchListener(
                new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        onTouchMail(v, event);
                        return false;
                    }
                }
        );

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
        String[] localnames = {
                "",
                LocalUtil.LCNAME_01,
                LocalUtil.LCNAME_02,
                LocalUtil.LCNAME_03,
                LocalUtil.LCNAME_04,
                LocalUtil.LCNAME_05,
                LocalUtil.LCNAME_06,
                LocalUtil.LCNAME_07,
                LocalUtil.LCNAME_08,
                LocalUtil.LCNAME_09,
                LocalUtil.LCNAME_10,
        };
        adapter.add("");
        adapter.add(LocalUtil.LCNAME_01);
        adapter.add(LocalUtil.LCNAME_02);
        adapter.add(LocalUtil.LCNAME_03);
        adapter.add(LocalUtil.LCNAME_04);
        adapter.add(LocalUtil.LCNAME_05);
        adapter.add(LocalUtil.LCNAME_06);
        adapter.add(LocalUtil.LCNAME_07);
        adapter.add(LocalUtil.LCNAME_08);
        adapter.add(LocalUtil.LCNAME_09);
        adapter.add(LocalUtil.LCNAME_10);

        int selectedIndex = 0;
        for(int i=0; i< localnames.length; i++){
            if(localnames[i].equals(setLocalname)){
                selectedIndex = i;
            }
        }
        final Spinner localname = (Spinner) findViewById(R.id.localname);
        localname.setAdapter(adapter);
        localname.setSelection(selectedIndex);
        localname.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        String selected = (String)localname.getSelectedItem();
                        if(!selected.equals("")){
                            SharedPreferences.Editor editor = sp.edit();
                            editor.putString("localname", selected);
                            editor.commit();
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // なにもしない
                    }
                }
        );


        CheckBox chk5 = (CheckBox) findViewById(R.id.chk5);
        chk5.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putBoolean("chk5", isChecked);
                        editor.commit();
                    }
                }
        );
        chk5.setChecked(sp.getBoolean("chk5", false));

        CheckBox chk6 = (CheckBox) findViewById(R.id.chk6);
        chk6.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putBoolean("chk6", isChecked);
                        editor.commit();
                    }
                }
        );
        chk6.setChecked(sp.getBoolean("chk6", false));

        CheckBox chk7 = (CheckBox) findViewById(R.id.chk7);
        chk7.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putBoolean("chk7", isChecked);
                        editor.commit();
                    }
                }
        );
        chk7.setChecked(sp.getBoolean("chk7", false));

        CheckBox chk19 = (CheckBox) findViewById(R.id.chk19);
        chk19.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putBoolean("chk19", isChecked);
                        editor.commit();
                    }
                }
        );
        chk19.setChecked(sp.getBoolean("chk19", false));

        CheckBox chk20 = (CheckBox) findViewById(R.id.chk20);
        chk20.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putBoolean("chk20", isChecked);
                        editor.commit();
                    }
                }
        );
        chk20.setChecked(sp.getBoolean("chk20", false));

        CheckBox chk21 = (CheckBox) findViewById(R.id.chk21);
        chk21.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putBoolean("chk21", isChecked);
                        editor.commit();
                    }
                }
        );
        chk21.setChecked(sp.getBoolean("chk21", false));
    }


    private void onTouchUrl(View v, MotionEvent event){

        Uri uri = Uri.parse("http://www.town.tomiya.miyagi.jp/guide/svGuideDtl.aspx?servno=408");
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);

    }


    private void onTouchMail(View v, MotionEvent event){

        Uri uri=Uri.parse("mailto:arcanum.jp@gmail.com");
        Intent i=new Intent(Intent.ACTION_SENDTO, uri);
        i.putExtra(Intent.EXTRA_SUBJECT, "富谷町ゴミ出しアプリについて");
        i.putExtra(Intent.EXTRA_TEXT, "ここにご意見、ご感想、ご指摘等をご入力ください。");
        startActivity(i);

    }

}
