package jp.arcanum.gomidashi.tomiya.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shinya.hosokawa on 13/12/22.
 */
public class LocalUtil {

    public static final String LCNAME_01 = "富ケ丘";
    public static final String LCNAME_02 = "あけの平・成田";
    public static final String LCNAME_03 = "鷹乃杜・日吉台・杜乃橋";
    public static final String LCNAME_04 = "東向陽台・明石台";
    public static final String LCNAME_05 = "大清水・上桜木";
    public static final String LCNAME_06 = "町上・町中・とちの木";
    public static final String LCNAME_07 = "町下・ひより台・太子堂・グリーンヒル";
    public static final String LCNAME_08 = "熊谷・原・穀田・大童・今泉";
    public static final String LCNAME_09 = "一ノ関・二ノ関・三ノ関・志戸田";
    public static final String LCNAME_10 = "大亀・石積・明石・西成田";

    // ---------------------------------------------------------------------------------
    // 第ｎｘ曜日のコードを定義
    // 一桁目　第ｎ
    // 二桁目　ｘ曜日（1:月曜　2:火曜　3:水曜　4:木曜　5:金曜　6:土曜　7:日曜）
    // ---------------------------------------------------------------------------------

    public static final String DAY_1SUN = "11";
    public static final String DAY_1MON = "12";
    public static final String DAY_1TUR = "13";
    public static final String DAY_1WED = "14";
    public static final String DAY_1THU = "15";
    public static final String DAY_1FRI = "16";
    public static final String DAY_1SAT = "17";
    public static final String DAY_2SUN = "21";
    public static final String DAY_2MON = "22";
    public static final String DAY_2TUR = "23";
    public static final String DAY_2WED = "24";
    public static final String DAY_2THU = "25";
    public static final String DAY_2FRI = "26";
    public static final String DAY_2SAT = "27";
    public static final String DAY_3SUN = "31";
    public static final String DAY_3MON = "32";
    public static final String DAY_3TUR = "33";
    public static final String DAY_3WED = "34";
    public static final String DAY_3THU = "35";
    public static final String DAY_3FRI = "36";
    public static final String DAY_3SAT = "37";
    public static final String DAY_4SUN = "41";
    public static final String DAY_4MON = "42";
    public static final String DAY_4TUR = "43";
    public static final String DAY_4WED = "44";
    public static final String DAY_4THU = "45";
    public static final String DAY_4FRI = "46";
    public static final String DAY_4SAT = "47";
    public static final String DAY_5SUN = "51";
    public static final String DAY_5MON = "52";
    public static final String DAY_5TUR = "53";
    public static final String DAY_5WED = "54";
    public static final String DAY_5THU = "55";
    public static final String DAY_5FRI = "56";
    public static final String DAY_5SAT = "57";

    /**
     * 第ｎｘ曜日の名称
     */
    public static final Map<String, String> WEEK_MAP = new HashMap<String, String>(){
        {
            put("11", "第１日曜日");
            put("12", "第１月曜日");
            put("13", "第１火曜日");
            put("14", "第１水曜日");
            put("15", "第１木曜日");
            put("16", "第１金曜日");
            put("17", "第１土曜日");
            put("21", "第２日曜日");
            put("22", "第２月曜日");
            put("23", "第２火曜日");
            put("24", "第２水曜日");
            put("25", "第２木曜日");
            put("26", "第２金曜日");
            put("27", "第２土曜日");
            put("31", "第３日曜日");
            put("32", "第３月曜日");
            put("33", "第３火曜日");
            put("34", "第３水曜日");
            put("35", "第３木曜日");
            put("36", "第３金曜日");
            put("37", "第３土曜日");
            put("41", "第４日曜日");
            put("42", "第４月曜日");
            put("43", "第４火曜日");
            put("44", "第４水曜日");
            put("45", "第４木曜日");
            put("46", "第４金曜日");
            put("47", "第４土曜日");
            put("51", "第５日曜日");
            put("52", "第５月曜日");
            put("53", "第５火曜日");
            put("54", "第５水曜日");
            put("55", "第５木曜日");
            put("56", "第５金曜日");
            put("57", "第５土曜日");
        }
    };

    /**
     * 各地域ごとのゴミ出しスケジュール
     */
    public static final Map<String, String> GOMI_MAP = new HashMap<String, String>(){
        {
            // -----------------------------------------
            // 富が丘
            // -----------------------------------------
            put("11" + LCNAME_01 , "なし");             //
            put("12" + LCNAME_01 , "もえるごみ");    //
            put("13" + LCNAME_01 , "資源1種");    //
            put("14" + LCNAME_01 , "もえるごみ");    //
            put("15" + LCNAME_01 , "なし");    //
            put("16" + LCNAME_01 , "もえるごみ");    //
            put("17" + LCNAME_01 , "資源3種");    //

            put("21" + LCNAME_01 , "なし");             //
            put("22" + LCNAME_01 , "もえるごみ");    //
            put("23" + LCNAME_01 , "資源2種");    //
            put("24" + LCNAME_01 , "もえるごみ");    //
            put("25" + LCNAME_01 , "なし");    //
            put("26" + LCNAME_01 , "もえるごみ");    //
            put("27" + LCNAME_01 , "資源3種");    //

            put("31" + LCNAME_01 , "なし");             //
            put("32" + LCNAME_01 , "もえるごみ");    //
            put("33" + LCNAME_01 , "資源1種");    //
            put("34" + LCNAME_01 , "もえるごみ");    //
            put("35" + LCNAME_01 , "なし");    //
            put("36" + LCNAME_01 , "もえるごみ");    //
            put("37" + LCNAME_01 , "資源3種");    //

            put("41" + LCNAME_01 , "なし");             //
            put("42" + LCNAME_01 , "もえるごみ");    //
            put("43" + LCNAME_01 , "資源2種");    //
            put("44" + LCNAME_01 , "もえるごみ");    //
            put("45" + LCNAME_01 , "なし");    //
            put("46" + LCNAME_01 , "もえるごみ");    //
            put("47" + LCNAME_01 , "資源3種");    //

            put("51" + LCNAME_01 , "なし");             //
            put("52" + LCNAME_01 , "もえるごみ");    //
            put("53" + LCNAME_01 , "なし>");    //
            put("54" + LCNAME_01 , "もえるごみ");    //
            put("55" + LCNAME_01 , "なし");    //
            put("56" + LCNAME_01 , "もえるごみ");    //
            put("57" + LCNAME_01 , "なし");    //

            // -----------------------------------------
            // あけの平・成田
            // -----------------------------------------
            put("11" + LCNAME_02, "なし");             //
            put("12" + LCNAME_02 , "もえるごみ");    //
            put("13" + LCNAME_02 , "資源3種");    //
            put("14" + LCNAME_02 , "もえるごみ");    //
            put("15" + LCNAME_02 , "資源1種");    //
            put("16" + LCNAME_02 , "もえるごみ");    //
            put("17" + LCNAME_02 , "なし");    //

            put("21" + LCNAME_02 , "なし");             //
            put("22" + LCNAME_02 , "もえるごみ");    //
            put("23" + LCNAME_02 , "資源3種");    //
            put("24" + LCNAME_02 , "もえるごみ");    //
            put("25" + LCNAME_02 , "資源2種");    //
            put("26" + LCNAME_02 , "もえるごみ");    //
            put("27" + LCNAME_02 , "なし");    //

            put("31" + LCNAME_02 , "なし");             //
            put("32" + LCNAME_02 , "もえるごみ");    //
            put("33" + LCNAME_02 , "資源3種");    //
            put("34" + LCNAME_02 , "もえるごみ");    //
            put("35" + LCNAME_02 , "資源1種");    //
            put("36" + LCNAME_02 , "もえるごみ");    //
            put("37" + LCNAME_02 , "なし");    //

            put("41" + LCNAME_02 , "なし");             //
            put("42" + LCNAME_02 , "もえるごみ");    //
            put("43" + LCNAME_02 , "資源3種");    //
            put("44" + LCNAME_02 , "もえるごみ");    //
            put("45" + LCNAME_02 , "資源2種");    //
            put("46" + LCNAME_02 , "もえるごみ");    //
            put("47" + LCNAME_02 , "なし");    //

            put("51" + LCNAME_02 , "なし");             //
            put("52" + LCNAME_02 , "もえるごみ");    //
            put("53" + LCNAME_02 , "なし>");    //
            put("54" + LCNAME_02 , "もえるごみ");    //
            put("55" + LCNAME_02 , "なし");    //
            put("56" + LCNAME_02 , "もえるごみ");    //
            put("57" + LCNAME_02 , "なし");    //

            // -----------------------------------------
            // 鷹乃杜・日吉台・杜乃橋
            // -----------------------------------------
            put("11" + LCNAME_03 , "なし");             //
            put("12" + LCNAME_03 , "もえるごみ");    //
            put("13" + LCNAME_03 , "なし");    //
            put("14" + LCNAME_03 , "もえるごみ");    //
            put("15" + LCNAME_03 , "資源3種");    //
            put("16" + LCNAME_03 , "もえるごみ");    //
            put("17" + LCNAME_03 , "資源1種");    //

            put("21" + LCNAME_03 , "なし");             //
            put("22" + LCNAME_03 , "もえるごみ");    //
            put("23" + LCNAME_03 , "なし");    //
            put("24" + LCNAME_03 , "もえるごみ");    //
            put("25" + LCNAME_03 , "資源3種");    //
            put("26" + LCNAME_03 , "もえるごみ");    //
            put("27" + LCNAME_03 , "資源2種");    //

            put("31" + LCNAME_03 , "なし");             //
            put("32" + LCNAME_03 , "もえるごみ");    //
            put("33" + LCNAME_03 , "なし");    //
            put("34" + LCNAME_03 , "もえるごみ");    //
            put("35" + LCNAME_03 , "資源3種");    //
            put("36" + LCNAME_03 , "もえるごみ");    //
            put("37" + LCNAME_03 , "資源1種");    //

            put("41" + LCNAME_03 , "なし");             //
            put("42" + LCNAME_03 , "もえるごみ");    //
            put("43" + LCNAME_03 , "なし");    //
            put("44" + LCNAME_03 , "もえるごみ");    //
            put("45" + LCNAME_03 , "資源3種");    //
            put("46" + LCNAME_03 , "もえるごみ");    //
            put("47" + LCNAME_03 , "資源2種");    //

            put("51" + LCNAME_03 , "なし");             //
            put("52" + LCNAME_03 , "もえるごみ");    //
            put("53" + LCNAME_03 , "なし");    //
            put("54" + LCNAME_03 , "もえるごみ");    //
            put("55" + LCNAME_03 , "資源3種");    //
            put("56" + LCNAME_03 , "もえるごみ");    //
            put("57" + LCNAME_03 , "なし");    //

            // -----------------------------------------
            // 東向陽台・明石台
            // -----------------------------------------
            put("11" + LCNAME_04 , "なし");             //
            put("12" + LCNAME_04 , "資源1種");    //
            put("13" + LCNAME_04 , "もえるごみ");    //
            put("14" + LCNAME_04 , "なし");    //
            put("15" + LCNAME_04 , "もえるごみ");    //
            put("16" + LCNAME_04 , "資源3種");    //
            put("17" + LCNAME_04 , "もえるごみ");    //

            put("21" + LCNAME_04 , "なし");             //
            put("22" + LCNAME_04 , "資源2種");    //
            put("23" + LCNAME_04 , "もえるごみ");    //
            put("24" + LCNAME_04 , "なし");    //
            put("25" + LCNAME_04 , "もえるごみ");    //
            put("26" + LCNAME_04 , "資源3種");    //
            put("27" + LCNAME_04 , "もえるごみ");    //

            put("31" + LCNAME_04 , "なし");             //
            put("32" + LCNAME_04 , "資源1種");    //
            put("33" + LCNAME_04 , "もえるごみ");    //
            put("34" + LCNAME_04 , "なし");    //
            put("35" + LCNAME_04 , "もえるごみ");    //
            put("36" + LCNAME_04 , "資源3種");    //
            put("37" + LCNAME_04 , "もえるごみ");    //

            put("41" + LCNAME_04 , "なし");             //
            put("42" + LCNAME_04 , "資源2種");    //
            put("43" + LCNAME_04 , "もえるごみ");    //
            put("44" + LCNAME_04 , "なし");    //
            put("45" + LCNAME_04 , "もえるごみ");    //
            put("46" + LCNAME_04 , "資源3種");    //
            put("47" + LCNAME_04 , "もえるごみ");    //

            put("51" + LCNAME_04 , "なし");             //
            put("52" + LCNAME_04 , "なし");    //
            put("53" + LCNAME_04 , "もえるごみ");    //
            put("54" + LCNAME_04 , "なし");    //
            put("55" + LCNAME_04 , "もえるごみ");    //
            put("56" + LCNAME_04 , "資源3種");    //
            put("57" + LCNAME_04 , "もえるごみ");    //

            // -----------------------------------------
            // 大清水・上桜木
            // -----------------------------------------
            put("11" + LCNAME_05 , "なし");             //
            put("12" + LCNAME_05 , "資源3種");    //
            put("13" + LCNAME_05 , "もえるごみ");    //
            put("14" + LCNAME_05 , "資源1種");    //
            put("15" + LCNAME_05 , "もえるごみ");    //
            put("16" + LCNAME_05 , "なし");    //
            put("17" + LCNAME_05 , "もえるごみ");    //

            put("21" + LCNAME_05 , "なし");             //
            put("22" + LCNAME_05 , "資源3種");    //
            put("23" + LCNAME_05 , "もえるごみ");    //
            put("24" + LCNAME_05 , "資源2種");    //
            put("25" + LCNAME_05 , "もえるごみ");    //
            put("26" + LCNAME_05 , "なし");    //
            put("27" + LCNAME_05 , "もえるごみ");    //

            put("31" + LCNAME_05 , "なし");             //
            put("32" + LCNAME_05 , "資源3種");    //
            put("33" + LCNAME_05 , "もえるごみ");    //
            put("34" + LCNAME_05 , "資源1種");    //
            put("35" + LCNAME_05 , "もえるごみ");    //
            put("36" + LCNAME_05 , "なし");    //
            put("37" + LCNAME_05 , "もえるごみ");    //

            put("41" + LCNAME_05 , "なし");             //
            put("42" + LCNAME_05 , "資源3種");    //
            put("43" + LCNAME_05 , "もえるごみ");    //
            put("44" + LCNAME_05 , "資源2種");    //
            put("45" + LCNAME_05 , "もえるごみ");    //
            put("46" + LCNAME_05 , "なし");    //
            put("47" + LCNAME_05 , "もえるごみ");    //

            put("51" + LCNAME_05 , "なし");             //
            put("52" + LCNAME_05 , "資源3種");    //
            put("53" + LCNAME_05 , "もえるごみ");    //
            put("54" + LCNAME_05 , "なし");    //
            put("55" + LCNAME_05 , "もえるごみ");    //
            put("56" + LCNAME_05 , "なし");    //
            put("57" + LCNAME_05 , "もえるごみ");    //

            // -----------------------------------------
            // 町上・町中・とちの木
            // -----------------------------------------
            put("11" + LCNAME_06 , "なし");             //
            put("12" + LCNAME_06 , "資源3種");    //
            put("13" + LCNAME_06 , "もえるごみ");    //
            put("14" + LCNAME_06 , "資源1種");    //
            put("15" + LCNAME_06 , "もえるごみ");    //
            put("16" + LCNAME_06 , "なし");    //
            put("17" + LCNAME_06 , "もえるごみ");    //

            put("21" + LCNAME_06 , "なし");             //
            put("22" + LCNAME_06 , "資源3種");    //
            put("23" + LCNAME_06 , "もえるごみ");    //
            put("24" + LCNAME_06 , "資源2種");    //
            put("25" + LCNAME_06 , "もえるごみ");    //
            put("26" + LCNAME_06 , "なし");    //
            put("27" + LCNAME_06 , "もえるごみ");    //

            put("31" + LCNAME_06 , "なし");             //
            put("32" + LCNAME_06 , "資源3種");    //
            put("33" + LCNAME_06 , "もえるごみ");    //
            put("34" + LCNAME_06 , "資源1種");    //
            put("35" + LCNAME_06 , "もえるごみ");    //
            put("36" + LCNAME_06 , "なし");    //
            put("37" + LCNAME_06 , "もえるごみ");    //

            put("41" + LCNAME_06 , "なし");             //
            put("42" + LCNAME_06 , "資源3種");    //
            put("43" + LCNAME_06 , "もえるごみ");    //
            put("44" + LCNAME_06 , "資源2種");    //
            put("45" + LCNAME_06 , "もえるごみ");    //
            put("46" + LCNAME_06 , "なし");    //
            put("47" + LCNAME_06 , "もえるごみ");    //

            put("51" + LCNAME_06 , "なし");             //
            put("52" + LCNAME_06 , "資源3種");    //
            put("53" + LCNAME_06 , "もえるごみ");    //
            put("54" + LCNAME_06 , "なし");    //
            put("55" + LCNAME_06 , "もえるごみ");    //
            put("56" + LCNAME_06 , "なし");    //
            put("57" + LCNAME_06 , "もえるごみ");    //

            // -----------------------------------------
            // 町下・ひより台・太子堂・グリーンヒル
            // -----------------------------------------
            put("11" + LCNAME_07 , "なし");             //
            put("12" + LCNAME_07 , "なし");    //
            put("13" + LCNAME_07 , "もえるごみ");    //
            put("14" + LCNAME_07 , "資源3種");    //
            put("15" + LCNAME_07 , "もえるごみ");    //
            put("16" + LCNAME_07 , "資源1種");    //
            put("17" + LCNAME_07 , "もえるごみ");    //

            put("21" + LCNAME_07 , "なし");             //
            put("22" + LCNAME_07 , "なし");    //
            put("23" + LCNAME_07 , "もえるごみ");    //
            put("24" + LCNAME_07 , "資源3種");    //
            put("25" + LCNAME_07 , "もえるごみ");    //
            put("26" + LCNAME_07 , "資源2種");    //
            put("27" + LCNAME_07 , "もえるごみ");    //

            put("31" + LCNAME_07 , "なし");             //
            put("32" + LCNAME_07 , "なし");    //
            put("33" + LCNAME_07 , "もえるごみ");    //
            put("34" + LCNAME_07 , "資源3種");    //
            put("35" + LCNAME_07 , "もえるごみ");    //
            put("36" + LCNAME_07 , "資源1種");    //
            put("37" + LCNAME_07 , "もえるごみ");    //

            put("41" + LCNAME_07 , "なし");             //
            put("42" + LCNAME_07 , "なし");    //
            put("43" + LCNAME_07 , "もえるごみ");    //
            put("44" + LCNAME_07 , "資源3種");    //
            put("45" + LCNAME_07 , "もえるごみ");    //
            put("46" + LCNAME_07 , "資源2種");    //
            put("47" + LCNAME_07 , "もえるごみ");    //

            put("51" + LCNAME_07 , "なし");             //
            put("52" + LCNAME_07 , "なし");    //
            put("53" + LCNAME_07 , "もえるごみ");    //
            put("54" + LCNAME_07 , "資源3種");    //
            put("55" + LCNAME_07 , "もえるごみ");    //
            put("56" + LCNAME_07 , "なし");    //
            put("57" + LCNAME_07 , "もえるごみ");    //

            // -----------------------------------------
            // 熊谷・原・穀田・大童・今泉
            // -----------------------------------------
            put("11" + LCNAME_08 , "なし");             //
            put("12" + LCNAME_08 , "もえるごみ");    //
            put("13" + LCNAME_08 , "なし");    //
            put("14" + LCNAME_08 , "資源3種");    //
            put("15" + LCNAME_08 , "もえるごみ");    //
            put("16" + LCNAME_08 , "資源1種");    //
            put("17" + LCNAME_08 , "なし");    //

            put("21" + LCNAME_08 , "なし");             //
            put("22" + LCNAME_08 , "もえるごみ");    //
            put("23" + LCNAME_08 , "なし");    //
            put("24" + LCNAME_08 , "資源3種");    //
            put("25" + LCNAME_08 , "もえるごみ");    //
            put("26" + LCNAME_08 , "資源2種");    //
            put("27" + LCNAME_08 , "なし");    //

            put("31" + LCNAME_08 , "なし");             //
            put("32" + LCNAME_08 , "もえるごみ");    //
            put("33" + LCNAME_08 , "なし");    //
            put("34" + LCNAME_08 , "資源3種");    //
            put("35" + LCNAME_08 , "もえるごみ");    //
            put("36" + LCNAME_08 , "資源1種");    //
            put("37" + LCNAME_08 , "なし");    //

            put("41" + LCNAME_08 , "なし");             //
            put("42" + LCNAME_08 , "もえるごみ");    //
            put("43" + LCNAME_08 , "なし");    //
            put("44" + LCNAME_08 , "資源3種");    //
            put("45" + LCNAME_08 , "もえるごみ");    //
            put("46" + LCNAME_08 , "資源2種");    //
            put("47" + LCNAME_08 , "なし");    //

            put("51" + LCNAME_08 , "なし");             //
            put("52" + LCNAME_08 , "もえるごみ");    //
            put("53" + LCNAME_08 , "なし");    //
            put("54" + LCNAME_08 , "資源3種");    //
            put("55" + LCNAME_08 , "もえるごみ");    //
            put("56" + LCNAME_08 , "なし");    //
            put("57" + LCNAME_08 , "なし");    //

            // -----------------------------------------
            // 一ノ関・二ノ関・三ノ関・志戸田
            // -----------------------------------------
            put("11" + LCNAME_09 , "なし");             //
            put("12" + LCNAME_09 , "資源3種");    //
            put("13" + LCNAME_09 , "もえるごみ");    //
            put("14" + LCNAME_09 , "資源1種");    //
            put("15" + LCNAME_09 , "なし");    //
            put("16" + LCNAME_09 , "もえるごみ");    //
            put("17" + LCNAME_09 , "なし");    //

            put("21" + LCNAME_09 , "なし");             //
            put("22" + LCNAME_09 , "資源3種");    //
            put("23" + LCNAME_09 , "もえるごみ");    //
            put("24" + LCNAME_09 , "資源2種");    //
            put("25" + LCNAME_09 , "なし");    //
            put("26" + LCNAME_09 , "もえるごみ");    //
            put("27" + LCNAME_09 , "なし");    //

            put("31" + LCNAME_09 , "なし");             //
            put("32" + LCNAME_09 , "資源3種");    //
            put("33" + LCNAME_09 , "もえるごみ");    //
            put("34" + LCNAME_09 , "資源1種");    //
            put("35" + LCNAME_09 , "なし");    //
            put("36" + LCNAME_09 , "もえるごみ");    //
            put("37" + LCNAME_09 , "なし");    //

            put("41" + LCNAME_09 , "なし");             //
            put("42" + LCNAME_09 , "資源3種");    //
            put("43" + LCNAME_09 , "もえるごみ");    //
            put("44" + LCNAME_09 , "資源2種");    //
            put("45" + LCNAME_09 , "なし");    //
            put("46" + LCNAME_09 , "もえるごみ");    //
            put("47" + LCNAME_09 , "なし");    //

            put("51" + LCNAME_09 , "なし");             //
            put("52" + LCNAME_09 , "資源3種");    //
            put("53" + LCNAME_09 , "もえるごみ");    //
            put("54" + LCNAME_09 , "なし");    //
            put("55" + LCNAME_09 , "なし");    //
            put("56" + LCNAME_09 , "もえるごみ");    //
            put("57" + LCNAME_09 , "なし");    //

            // -----------------------------------------
            // 大亀・石積・明石・西成田
            // -----------------------------------------
            put("11" + LCNAME_10 , "なし");             //
            put("12" + LCNAME_10 , "なし");    //
            put("13" + LCNAME_10 , "資源3種");    //
            put("14" + LCNAME_10 , "もえるごみ");    //
            put("15" + LCNAME_10 , "資源1種");    //
            put("16" + LCNAME_10 , "なし");    //
            put("17" + LCNAME_10 , "もえるごみ");    //

            put("21" + LCNAME_10 , "なし");             //
            put("22" + LCNAME_10 , "なし");    //
            put("23" + LCNAME_10 , "資源3種");    //
            put("24" + LCNAME_10 , "もえるごみ");    //
            put("25" + LCNAME_10 , "資源2種");    //
            put("26" + LCNAME_10 , "なし");    //
            put("27" + LCNAME_10 , "もえるごみ");    //

            put("31" + LCNAME_10 , "なし");             //
            put("32" + LCNAME_10 , "なし");    //
            put("33" + LCNAME_10 , "資源3種");    //
            put("34" + LCNAME_10 , "もえるごみ");    //
            put("35" + LCNAME_10 , "資源1種");    //
            put("36" + LCNAME_10 , "なし");    //
            put("37" + LCNAME_10 , "もえるごみ");    //

            put("41" + LCNAME_10 , "なし");             //
            put("42" + LCNAME_10 , "なし");    //
            put("43" + LCNAME_10 , "資源3種");    //
            put("44" + LCNAME_10 , "もえるごみ");    //
            put("45" + LCNAME_10 , "資源2種");    //
            put("46" + LCNAME_10 , "なし");    //
            put("47" + LCNAME_10 , "もえるごみ");    //

            put("51" + LCNAME_10 , "なし");             //
            put("52" + LCNAME_10 , "なし");    //
            put("53" + LCNAME_10 , "資源3種");    //
            put("54" + LCNAME_10 , "もえるごみ");    //
            put("55" + LCNAME_10 , "なし");    //
            put("56" + LCNAME_10 , "なし");    //
            put("57" + LCNAME_10 , "もえるごみ");    //


        }
    };


    /**
     * スケジュールに対する捨てられるゴミの簡単な説明
     */
    public static final Map<String, String> GOMITYPE_MAP = new HashMap<String, String>(){
        {
            put("なし", "");
            put("もえるごみ", "生ごみ、資源以外の紙くずなど");
            put("資源1種", "缶、雑鉄、紙類、乾電池");
            put("資源2種", "缶、ビン3種、割れ物、衣類、発泡スチロール・トレイ");
            put("資源3種", "プラスチック製容器包装、紙製容器包装・雑紙、複合素材ごみ、ペットボトル");
        }
    };

    public static final String GOMI_TYPE_NAMA             = "生ごみ";
    public static final String GOMI_TYPE_KAMIKUZU        =         "資源以外の紙くずなど";
    public static final String GOMI_TYPE_KAN                 =         "缶";
    public static final String GOMI_TYPE_ZATUTETU          =         "雑鉄";
    public static final String GOMI_TYPE_KAMI              =         "紙類";
    public static final String GOMI_TYPE_KANDENCHI        =         "乾電池";
    public static final String GOMI_TYPE_BIN               =         "ビン";
    public static final String GOMI_TYPE_WAREMONO         =         "割れ物";
    public static final String GOMI_TYPE_IRUI              =         "衣類";
    public static final String GOMI_TYPE_HAPPO             =         "発泡スチロール・トレイ";
    public static final String GOMI_TYPE_PRASTIC           =         "プラスチック製容器包装";
    public static final String GOMI_TYPE_ZATUGAMI         =         "紙製容器包装・雑紙";
    public static final String GOMI_TYPE_FUKUGO            =         "複合素材ごみ";
    public static final String GOMI_TYPE_PET                =         "ペットボトル";

    public static final GomiInfo getGomiInfo(Calendar cal, String localName){

        GomiInfo ret = new GomiInfo();

        int wofm  = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);  // 第ｎ
        int week = cal.get(Calendar.DAY_OF_WEEK);   // 何曜日か
        String weekofMonth = LocalUtil.WEEK_MAP.get("" + wofm + week);  // 第ｎX曜日の文字列

        // ごみ名称
        String todayGomi = LocalUtil.GOMI_MAP.get("" + wofm + week + localName);

        // ごみの説明
        String gomitype = LocalUtil.GOMITYPE_MAP.get(todayGomi);

        ret.setDate(cal.getTime());
        ret.setLocalName(localName);
        ret.setNoOfMonth(wofm);
        ret.setWeek(week);
        ret.setDayOfWeekName(weekofMonth);
        ret.setTodayGomiName(todayGomi);
        ret.setGomiDescription(gomitype);

        return ret;

    }

}
