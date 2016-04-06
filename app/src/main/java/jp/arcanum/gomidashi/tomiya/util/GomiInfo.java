package jp.arcanum.gomidashi.tomiya.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by shinya.hosokawa on 14/01/06.
 */
public class GomiInfo {

    private Date _date;
    public Date getDate(){
        return _date;
    }
    public void setDate(Date date){
        _date = date;
    }


    /**
     * 第ｎ
     */
    private int _noOfMonth;
    public int getNoOfMonth(){
        return _noOfMonth;
    }
    public void setNoOfMonth(int v){
        _noOfMonth = v;
    }

    /**
     * 曜日
     */
    private int _week;
    public int getWeek(){
        return _week;
    }
    public void setWeek(int s){
        _week = s;
    }

    /**
     * 第ｎX曜日の文字列
     */
    private String _dayOfWeekName;
    public String getDayOfWeekName(){
        return _dayOfWeekName;
    }
    public void setDayOfWeekName(String s){
        _dayOfWeekName = s;
    }

    /**
     * ごみ名称（燃えるごみとか）
     */
    private String _todayGomiName;
    public String getTodayGomiName(){
        return _todayGomiName;
    }
    public void setTodayGomiName(String s){
        _todayGomiName = s;
    }

    /**
     * ごみ説明
     */
    private String _gomiDescription;
    public String getGomiDescription(){
        return _gomiDescription;
    }
    public void setGomiDescription(String s){
        _gomiDescription = s;
    }

    /**
     * 地域名
     */
    private String _localName;
    public String getLocalName(){
        return _localName;
    }
    public void setLocalName(String s){
        _localName = s;
    }


}
