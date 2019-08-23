package cn.com.chinatelecom.account.api.c;

import android.os.Build;
import cn.com.chinatelecom.account.api.CtAuth;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private String f1797a = "1.0";

    /* renamed from: b  reason: collision with root package name */
    private String f1798b = a(this.t);

    /* renamed from: c  reason: collision with root package name */
    private String f1799c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f1800d = CtAuth.mAppKey;

    /* renamed from: e  reason: collision with root package name */
    private String f1801e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f1802f = "";
    private String g = Build.BRAND;
    private String h = Build.MODEL;
    private String i = "Android";
    private String j = Build.VERSION.RELEASE;
    private String k = "SDK-API-v1.5.2";
    private String l;
    private String m = "";
    private String n = "";
    private int o;
    private String p = "";
    private long q;
    private long r;
    private StringBuffer s = new StringBuffer();
    private long t = System.currentTimeMillis();
    private long u;

    public e(String str) {
        this.l = str;
    }

    public static String a(long j2) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA).format(new Date(j2));
        } catch (Throwable unused) {
            return "";
        }
    }

    public e a(int i2) {
        this.o = i2;
        return this;
    }

    public e a(String str) {
        this.f1801e = str;
        return this;
    }

    public e b(long j2) {
        this.q = j2;
        return this;
    }

    public e b(String str) {
        this.f1802f = str;
        return this;
    }

    public e c(String str) {
        this.m = str;
        return this;
    }

    public e d(String str) {
        this.n = str;
        return this;
    }

    public e e(String str) {
        this.p = str;
        return this;
    }

    public e f(String str) {
        StringBuffer stringBuffer = this.s;
        stringBuffer.append(str);
        stringBuffer.append("\n");
        return this;
    }

    public String toString() {
        try {
            this.u = System.currentTimeMillis();
            this.r = this.u - this.t;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotifyType.VIBRATE, this.f1797a);
            jSONObject.put("t", this.f1798b);
            jSONObject.put("tag", this.f1799c);
            jSONObject.put("ai", this.f1800d);
            jSONObject.put(AppIconSetting.DEFAULT_LARGE_ICON, this.f1801e);
            jSONObject.put(NotificationStyle.NOTIFICATION_STYLE, this.f1802f);
            jSONObject.put("br", this.g);
            jSONObject.put("ml", this.h);
            jSONObject.put("os", this.i);
            jSONObject.put("ov", this.j);
            jSONObject.put("sv", this.k);
            jSONObject.put("ri", this.l);
            jSONObject.put("api", this.m);
            jSONObject.put("p", this.n);
            jSONObject.put("rt", this.o);
            jSONObject.put("msg", this.p);
            jSONObject.put(TimeDisplaySetting.START_SHOW_TIME, this.q);
            jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, this.r);
            jSONObject.put("ep", this.s.toString());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
