package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

public class ai extends y {

    /* renamed from: b  reason: collision with root package name */
    private Context f80362b;

    /* renamed from: c  reason: collision with root package name */
    private String f80363c;

    /* renamed from: d  reason: collision with root package name */
    private String f80364d;

    public String f() {
        return this.f80363c;
    }

    public boolean g() {
        return h();
    }

    public void i() {
        try {
            l();
            k();
            j();
        } catch (Exception unused) {
        }
    }

    private void j() {
        try {
            b("/data/local/tmp/.um");
            bw.a(new File("/data/local/tmp/.um/sysid.dat"), this.f80364d);
        } catch (Throwable unused) {
        }
    }

    private void k() {
        try {
            b("/sdcard/Android/obj/.um");
            bw.a(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f80364d);
        } catch (Throwable unused) {
        }
    }

    private void l() {
        try {
            b("/sdcard/Android/data/.um");
            bw.a(new File("/sdcard/Android/data/.um/sysid.dat"), this.f80364d);
        } catch (Throwable unused) {
        }
    }

    public boolean h() {
        this.f80364d = af.a(this.f80362b).b().g(null);
        if (!TextUtils.isEmpty(this.f80364d)) {
            this.f80364d = bt.c(this.f80364d);
            String b2 = bw.b(new File("/sdcard/Android/data/.um/sysid.dat"));
            String b3 = bw.b(new File("/sdcard/Android/obj/.um/sysid.dat"));
            String b4 = bw.b(new File("/data/local/tmp/.um/sysid.dat"));
            if (TextUtils.isEmpty(b2)) {
                l();
            } else if (!this.f80364d.equals(b2)) {
                this.f80363c = b2;
                return true;
            }
            if (TextUtils.isEmpty(b3)) {
                k();
            } else if (!this.f80364d.equals(b3)) {
                this.f80363c = b3;
                return true;
            }
            if (TextUtils.isEmpty(b4)) {
                j();
            } else if (!this.f80364d.equals(b4)) {
                this.f80363c = b4;
                return true;
            }
        }
        return false;
    }

    public ai(Context context) {
        super("oldumid");
        this.f80362b = context;
    }

    private void b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
