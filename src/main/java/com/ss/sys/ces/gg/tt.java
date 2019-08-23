package com.ss.sys.ces.gg;

import com.bytedance.frameworks.baselib.network.http.e;
import com.ss.a.b.a;
import com.ss.a.b.d;
import com.ss.sys.ces.out.StcSDKFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tt {
    /* access modifiers changed from: private */
    public static String d(String str) {
        int indexOf = str.indexOf("?");
        int indexOf2 = str.indexOf("#");
        if (indexOf == -1) {
            return null;
        }
        if (indexOf2 == -1) {
            return str.substring(indexOf + 1);
        }
        if (indexOf2 < indexOf) {
            return null;
        }
        return str.substring(indexOf + 1, indexOf2);
    }

    /* access modifiers changed from: private */
    public static String e(String str) {
        for (String str2 : str.replace(" ", "").split(",")) {
            int indexOf = str2.indexOf("sessionid=");
            if (indexOf != -1) {
                return str2.substring(indexOf + 10);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static boolean f(String str) {
        return false;
    }

    public static void init_gorgon() {
        e.j = new e.a() {
            public final Map<String, String> a(String str, Map<String, List<String>> map) {
                HashMap hashMap = new HashMap();
                try {
                    if (!str.toLowerCase().contains("http")) {
                        if (!str.toLowerCase().contains("https")) {
                            throw new NullPointerException("nein http/https");
                        }
                    }
                    if (str.toLowerCase().contains("X-Khronos")) {
                        if (str.toLowerCase().contains("X-Gorgon")) {
                            throw new NullPointerException("it was");
                        }
                    }
                    if (!tt.f(str)) {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        String b2 = tt.d(str);
                        String str2 = null;
                        String a2 = (b2 == null || b2.length() <= 0) ? null : d.a(b2);
                        String str3 = null;
                        String str4 = null;
                        for (Map.Entry next : map.entrySet()) {
                            if (((String) next.getKey()).toUpperCase().contains("X-SS-STUB")) {
                                str2 = (String) ((List) next.getValue()).get(0);
                            }
                            if (((String) next.getKey()).toUpperCase().contains("COOKIE")) {
                                String str5 = (String) ((List) next.getValue()).get(0);
                                if (str5 != null && str5.length() > 0) {
                                    str3 = d.a(str5);
                                    String c2 = tt.e(str5);
                                    if (c2 != null && c2.length() > 0) {
                                        str4 = d.a(c2);
                                        StcSDKFactory.getInstance().setSession(c2);
                                    }
                                }
                            }
                        }
                        hashMap.put("X-Khronos", currentTimeMillis);
                        if (a2 == null || a2.length() == 0) {
                            a2 = "00000000000000000000000000000000";
                        }
                        if (str2 == null || str2.length() == 0) {
                            str2 = "00000000000000000000000000000000";
                        }
                        if (str3 == null || str3.length() == 0) {
                            str3 = "00000000000000000000000000000000";
                        }
                        if (str4 == null || str4.length() == 0) {
                            str4 = "00000000000000000000000000000000";
                        }
                        hashMap.put("X-Gorgon", a.a(com.ss.sys.ces.a.leviathan(currentTimeMillis, a.a(a2 + str2 + str3 + str4))));
                        // a2: req parms md5, str2: X-SS-STUB, str3: Cookie md5, str4:
                        return hashMap;
                    }
                    throw new NullPointerException("filter_1");
                } catch (Throwable th) {
                    th.getMessage().contains("filter_1");
                }
            }
        };
    }
}
