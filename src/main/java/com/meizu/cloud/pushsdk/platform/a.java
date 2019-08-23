package com.meizu.cloud.pushsdk.platform;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f27256a = a();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f27257b = new ArrayList(f27256a.keySet());

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.length() > 3) {
                String substring = str.substring(0, 3);
                if (f27256a.containsKey(substring)) {
                    String str3 = f27256a.get(substring);
                    str2 = str.substring(3, str.length());
                    try {
                        char[] cArr = new char[(str2.length() / 2)];
                        int i = 0;
                        int i2 = 0;
                        while (i < str2.length() / 2) {
                            if (i2 == str3.length()) {
                                i2 = 0;
                            }
                            int i3 = i * 2;
                            cArr[i] = (char) (((char) Integer.valueOf(str2.substring(i3, i3 + 2), 16).intValue()) ^ str3.charAt(i2));
                            i++;
                            i2++;
                        }
                        str = new String(String.valueOf(cArr).getBytes("iso-8859-1"), "UTF-8");
                    } catch (Exception unused) {
                        DebugLogger.e("PushIdEncryptUtils", "invalid pushId encryption " + str2);
                        return str;
                    }
                }
            }
        } catch (Exception unused2) {
            str2 = str;
            DebugLogger.e("PushIdEncryptUtils", "invalid pushId encryption " + str2);
            return str;
        }
        return str;
    }

    private static Map<String, String> a() {
        if (a(f27256a)) {
            synchronized (a.class) {
                if (a(f27256a)) {
                    TreeMap treeMap = new TreeMap();
                    f27256a = treeMap;
                    treeMap.put("UCI", "v9tC0Myz1MGwXRFy");
                    f27256a.put("G3G", "XAsFqhhaf4gKpmAi");
                    f27256a.put("V5R", "cOqH18NXwBtZVkvz");
                    f27256a.put("0XC", "IgSEKZ3Ea6Pm4woS");
                    f27256a.put("Z9K", "pH6J9DMPNgqQp8m8");
                    f27256a.put("EIM", "K11Rs9HAKRXeNwq8");
                    f27256a.put("SO7", "T8LquL1DvwVcogiU");
                    f27256a.put("DDI", "d02F6ttOtV05MYCQ");
                    f27256a.put("ULY", "ToZZIhAywnUfHShN");
                    f27256a.put("0EV", "r5D5RRwQhfV0AYLb");
                    f27256a.put("N6A", "QAtSBFcXnQoUgHO2");
                    f27256a.put("S5Q", "sDWLrZINnum227am");
                    f27256a.put("RA5", "4Uq3Ruxo1FTBdHQE");
                    f27256a.put("J04", "N5hViUTdLCpN59H0");
                    f27256a.put("B68", "EY3sH1KKtalg5ZaT");
                    f27256a.put("9IW", "q1u0MiuFyim4pCYY");
                    f27256a.put("UU3", "syLnkkd8AqNykVV7");
                    f27256a.put("Z49", "V00FiWu124yE91sH");
                    f27256a.put("BNA", "rPP7AK1VWpKEry3p");
                    f27256a.put("WXG", "om8w5ahkJJgpAH9v");
                }
            }
        }
        return f27256a;
    }

    public static <K, V> boolean a(Map<K, V> map) {
        return map == null || map.isEmpty();
    }
}
