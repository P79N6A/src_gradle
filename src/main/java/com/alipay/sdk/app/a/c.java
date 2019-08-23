package com.alipay.sdk.app.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.i.b;
import com.alipay.sdk.j.a;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    String f5419a = String.format("123456789,%s", new Object[]{new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date())});

    /* renamed from: b  reason: collision with root package name */
    String f5420b;

    /* renamed from: c  reason: collision with root package name */
    String f5421c;

    /* renamed from: d  reason: collision with root package name */
    String f5422d;

    /* renamed from: e  reason: collision with root package name */
    String f5423e;

    /* renamed from: f  reason: collision with root package name */
    String f5424f;
    String g;
    String h;
    String i = "";
    String j;

    private static String a(Context context) {
        String str = "-";
        String str2 = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                try {
                    str2 = applicationContext.getPackageManager().getPackageInfo(packageName, 0).versionName;
                } catch (Throwable unused) {
                }
                str = packageName;
            } catch (Throwable unused2) {
            }
        }
        return String.format("%s,%s,-,-,-", new Object[]{str, str2});
    }

    static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("-", "=").replace("^", "~");
    }

    public c(Context context) {
        this.f5421c = a(context);
        this.f5422d = String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,-,-", new Object[]{a("15.2.0"), a("h.a.3.2.0")});
        this.f5423e = String.format("%s,%s,-,-,-", new Object[]{a(b.a().f5513a), a(com.alipay.sdk.h.b.a().c())});
        this.f5424f = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", new Object[]{a(a.d(context)), "android", a(Build.VERSION.RELEASE), a(Build.MODEL), "-", a(a.a(context).a()), a(a.b(context).p), "gw", a(a.a(context).b())});
        this.g = "-";
        this.h = "-";
        this.j = "-";
    }

    private static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                for (int i2 = 0; i2 < stackTrace.length; i2++) {
                    stringBuffer.append(stackTrace[i2].toString() + " 》 ");
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public final void a(String str, String str2, String str3) {
        a(str, str2, str3, "-");
    }

    public final void a(String str, String str2, Throwable th) {
        a(str, str2, a(th));
    }

    private void a(String str, String str2, String str3, String str4) {
        String str5 = "";
        if (!TextUtils.isEmpty(this.i)) {
            str5 = str5 + "^";
        }
        this.i += (str5 + String.format("%s,%s,%s,%s", new Object[]{str, str2, a(str3), str4}));
    }
}
