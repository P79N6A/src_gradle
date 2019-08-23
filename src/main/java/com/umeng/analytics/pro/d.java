package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

public class d {

    public static class a {

        /* renamed from: com.umeng.analytics.pro.d$a$a  reason: collision with other inner class name */
        public static class C0856a {
        }

        public static class b {
        }
    }

    public static class b {

        public static class a {
        }

        /* renamed from: com.umeng.analytics.pro.d$b$b  reason: collision with other inner class name */
        public static class C0857b {
        }
    }

    public static class c {

        public static class a {
        }

        public static class b {
        }
    }

    public static String a(List<String> list) {
        return TextUtils.join("!", list);
    }

    public static List<String> b(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static String a(Context context) {
        return "/data/data/" + context.getPackageName() + "/databases/cc/";
    }

    public static List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String next : list) {
                if (Collections.frequency(arrayList, next) <= 0) {
                    arrayList.add(next);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static JSONArray a(String str) {
        String[] split = str.split("!");
        JSONArray jSONArray = new JSONArray();
        for (String put : split) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
