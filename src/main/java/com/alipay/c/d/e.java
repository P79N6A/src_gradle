package com.alipay.c.d;

import android.content.Context;
import com.alipay.d.a.a.a.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f5316a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f5317b = {"AD1", "AD2", "AD3", "AD5", "AD6", "AD7", "AD8", "AD9", "AD10", "AD11", "AD12", "AD13", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD32", "AD34", "AA1", "AA2", "AA3", "AA4", "AA5", "AC4", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    private static String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size()) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i == 0 ? "" : "&");
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            stringBuffer.append(sb.toString());
            i++;
        }
        return stringBuffer.toString();
    }

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        Map<String, String> map2;
        synchronized (e.class) {
            if (f5316a == null) {
                c(context, map);
            }
            map2 = f5316a;
        }
        return map2;
    }

    public static synchronized void a() {
        synchronized (e.class) {
            f5316a = null;
        }
    }

    public static synchronized String b(Context context, Map<String, String> map) {
        String a2;
        synchronized (e.class) {
            a(context, map);
            TreeMap treeMap = new TreeMap();
            for (String str : f5317b) {
                if (f5316a.containsKey(str)) {
                    treeMap.put(str, f5316a.get(str));
                }
            }
            a2 = b.a(a(treeMap));
        }
        return a2;
    }

    private static synchronized void c(Context context, Map<String, String> map) {
        synchronized (e.class) {
            TreeMap treeMap = new TreeMap();
            f5316a = treeMap;
            treeMap.putAll(b.a(context, map));
            f5316a.putAll(d.a(context));
            f5316a.putAll(c.a(context));
            f5316a.putAll(a.a(context, map));
        }
    }
}
