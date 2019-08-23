package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import cn.com.chinatelecom.account.api.Helper;
import cn.com.chinatelecom.account.api.a.c;

public class l implements i {
    public String a() {
        return Helper.cepahsul();
    }

    public String a(Context context, String str, String str2, String str3, long j, String str4) {
        return Helper.dnepah(context, str, str2, str3, j, str4);
    }

    public String a(Context context, String str, String str2, String str3, String str4, long j, String str5) {
        return Helper.cinetw(context, str, str2, str3, str4, j, str5);
    }

    public String a(String str, String str2) {
        try {
            return new String(Helper.dnepmret(c.a(str), str2));
        } catch (Throwable unused) {
            return "";
        }
    }

    public String b() {
        return Helper.cemppmul();
    }

    public String b(Context context, String str, String str2, String str3, long j, String str4) {
        return Helper.dnepmo(context, str, str2, str3, j, str4);
    }

    public String b(String str, String str2) {
        try {
            return new String(Helper.dnenwret(c.a(str), str2));
        } catch (Throwable unused) {
            return "";
        }
    }

    public String c() {
        return Helper.cemnetwul();
    }
}
