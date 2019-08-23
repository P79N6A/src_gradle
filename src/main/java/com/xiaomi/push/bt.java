package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

public final class bt {

    /* renamed from: a  reason: collision with root package name */
    private static String f81875a;

    private static String a() {
        String b2 = br.b();
        String c2 = br.c();
        String e2 = br.e();
        int a2 = br.a();
        int b3 = br.b();
        if (b2 == null || b2.isEmpty() || c2 == null || c2.isEmpty()) {
            return null;
        }
        if (a2 < 0 || b3 < 0) {
            a2 = 999;
            b3 = 99;
        }
        return String.format("%s__%s__%d__%d__%s", new Object[]{b2, c2, Integer.valueOf(a2), Integer.valueOf(b3), e2});
    }

    public static String a(String str, String str2) {
        String a2 = bs.a();
        String a3 = a();
        String str3 = null;
        if (a3 != null) {
            StringBuffer stringBuffer = new StringBuffer(a2);
            stringBuffer.append("/base/profile/");
            stringBuffer.append("metoknlpsdk/");
            stringBuffer.append(str);
            stringBuffer.append("/");
            stringBuffer.append(a3);
            stringBuffer.append("__");
            stringBuffer.append(str2);
            String stringBuffer2 = stringBuffer.toString();
            Map a4 = a();
            try {
                str3 = bo.a(stringBuffer2, a4);
            } catch (Exception unused) {
            }
            a4.clear();
        }
        return str3;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static Map m134a() {
        String a2 = a();
        HashMap hashMap = new HashMap();
        if (f81875a == null) {
            String a3 = br.a();
            if (a3 == null || a3.isEmpty()) {
                return null;
            }
            String a4 = br.a(a3);
            if (a4 != null) {
                f81875a = a4;
            }
            if (f81875a == null) {
                return null;
            }
        }
        hashMap.put("CCPVER", f81875a);
        hashMap.put("CCPINF", a2);
        return hashMap;
    }
}
