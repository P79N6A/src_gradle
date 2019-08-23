package com.meizu.cloud.pushsdk.base;

import android.content.Context;
import android.os.Environment;

public class h extends j<g> implements g {

    /* renamed from: c  reason: collision with root package name */
    private static h f27079c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27080d;

    protected h(g gVar) {
        super(gVar);
    }

    public static h b() {
        if (f27079c == null) {
            synchronized (h.class) {
                if (f27079c == null) {
                    f27079c = new h(new b());
                }
            }
        }
        return f27079c;
    }

    public void a(Context context) {
        if (!this.f27080d) {
            boolean z = true;
            this.f27080d = true;
            if ((context.getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            b(z);
            a(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdk/" + context.getPackageName());
        }
    }

    public void a(String str) {
        ((g) c()).a(str);
    }

    public void a(String str, String str2) {
        ((g) c()).a(str, str2);
    }

    public void a(String str, String str2, Throwable th) {
        ((g) c()).a(str, str2, th);
    }

    public void a(boolean z) {
        ((g) c()).a(z);
    }

    public boolean a() {
        return ((g) c()).a();
    }

    public void b(String str, String str2) {
        ((g) c()).b(str, str2);
    }

    public void b(boolean z) {
        ((g) c()).b(z);
    }

    public void c(String str, String str2) {
        ((g) c()).c(str, str2);
    }

    public void d(String str, String str2) {
        ((g) c()).d(str, str2);
    }
}
