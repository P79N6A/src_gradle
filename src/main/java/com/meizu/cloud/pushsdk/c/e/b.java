package com.meizu.cloud.pushsdk.c.e;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.meizu.cloud.pushsdk.c.f.c;
import com.meizu.cloud.pushsdk.c.f.e;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f27166a = "b";

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, String> f27167b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Object> f27168c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, String> f27169d;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Context f27170a;

        public a a(Context context) {
            this.f27170a = context;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(a aVar) {
        this.f27167b = new HashMap<>();
        this.f27168c = new HashMap<>();
        this.f27169d = new HashMap<>();
        d();
        e();
        f();
        g();
        if (aVar.f27170a != null) {
            a(aVar.f27170a);
        }
        c.c(f27166a, "Subject created successfully.", new Object[0]);
    }

    private void a(String str, Object obj) {
        if ((str != null && obj != null && !str.isEmpty()) || ((obj instanceof String) && !((String) obj).isEmpty())) {
            this.f27168c.put(str, obj);
        }
    }

    private void a(String str, String str2) {
        if (str != null && str2 != null && !str.isEmpty() && !str2.isEmpty()) {
            this.f27169d.put(str, str2);
        }
    }

    private void d() {
        a("ot", "android-" + Build.VERSION.RELEASE);
    }

    private void e() {
        a("ov", Build.DISPLAY);
    }

    private void f() {
        a("dm", Build.MODEL);
    }

    private void g() {
        a("df", Build.MANUFACTURER);
    }

    public Map<String, Object> a() {
        return this.f27168c;
    }

    public void a(Context context) {
        b(context);
        c(context);
    }

    public Map<String, String> b() {
        return this.f27169d;
    }

    public void b(Context context) {
        Location c2 = e.c(context);
        if (c2 == null) {
            c.a(f27166a, "Location information not available.", new Object[0]);
            return;
        }
        a("la", (Object) Double.valueOf(c2.getLatitude()));
        a("lt", (Object) Double.valueOf(c2.getLongitude()));
        a("al", (Object) Double.valueOf(c2.getAltitude()));
        a("lla", (Object) Float.valueOf(c2.getAccuracy()));
        a("speed", (Object) Float.valueOf(c2.getSpeed()));
        a("br", (Object) Float.valueOf(c2.getBearing()));
    }

    public Map<String, String> c() {
        return this.f27167b;
    }

    public void c(Context context) {
        String b2 = e.b(context);
        if (b2 != null) {
            a("ca", b2);
        }
    }
}
