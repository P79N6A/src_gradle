package com.tencent.open.b;

import android.os.SystemClock;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.open.d.h;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    protected static d f79687a;

    protected d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f79687a == null) {
                f79687a = new d();
            }
            dVar = f79687a;
        }
        return dVar;
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        g.a().a(h.a(str, str3, str4, str5, str2, str6), str2, true);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str2;
        g.a().a(h.a(str, str4, str5, str3, str2, str6, "", str7, str8, "", "", ""), str2, false);
    }

    public static void a(int i, String str, String str2, String str3, String str4, Long l, int i2, int i3, String str5) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        if (l.longValue() == 0 || elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        StringBuffer stringBuffer = new StringBuffer("http://c.isdspeed.qq.com/code.cgi");
        stringBuffer.append("?domain=mobile.opensdk.com&cgi=opensdk&type=");
        int i4 = i;
        stringBuffer.append(i);
        stringBuffer.append("&code=0");
        stringBuffer.append("&time=");
        stringBuffer.append(elapsedRealtime);
        stringBuffer.append("&rate=1");
        stringBuffer.append("&uin=");
        stringBuffer.append(str2);
        stringBuffer.append("&data=");
        g.a().a(stringBuffer.toString(), "GET", h.a(String.valueOf(i), PushConstants.PUSH_TYPE_NOTIFY, String.valueOf(elapsedRealtime), PushConstants.PUSH_TYPE_THROUGH_MESSAGE, str, str2, str3, str4, str5), true);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str2;
        g.a().a(h.a(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }
}
