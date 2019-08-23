package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f80983a;

    /* renamed from: b  reason: collision with root package name */
    private String f80984b;

    /* renamed from: c  reason: collision with root package name */
    private String f80985c;

    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a  reason: collision with other inner class name */
    static class C0863a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final a f80986a = new a();

        private C0863a() {
        }
    }

    private a() {
    }

    public String a() {
        return this.f80985c;
    }

    public String b() {
        return this.f80984b;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("a");
        }
        return false;
    }

    public boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("t");
        }
        return false;
    }

    public static a a(Context context) {
        if (f80983a == null && context != null) {
            f80983a = context.getApplicationContext();
        }
        return C0863a.f80986a;
    }

    public void c(String str) {
        String substring = str.substring(0, str.indexOf(95));
        e(substring);
        d(substring);
    }

    private void d(String str) {
        try {
            String replaceAll = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/");
            this.f80984b = replaceAll + "/Android" + "/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + " " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f80983a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f80983a, th);
        }
    }

    private void e(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("&=");
                StringBuilder sb = new StringBuilder();
                sb.append("ut/");
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        String substring = str3.substring(0, 2);
                        if (substring.endsWith("=")) {
                            substring = substring.replace("=", "");
                        }
                        sb.append(substring);
                    }
                }
                this.f80985c = sb.toString();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f80983a, th);
        }
    }
}
