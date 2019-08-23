package com.ss.android.ttvecamera.e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.c;
import com.ss.android.ttvecamera.c.b;
import com.ss.android.ttvecamera.hardware.e;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(21)
public final class a extends com.ss.android.ttvecamera.a.a {
    boolean w;

    public final void o() {
        Bundle bundle;
        if (this.r.containsKey(this.h.s)) {
            bundle = (Bundle) this.r.get(this.h.s);
        } else {
            bundle = new Bundle();
            this.r.put(this.h.s, bundle);
        }
        this.w = this.f31344a.a(this.h.f31294e);
        bundle.putBoolean("support_anti_shake", this.w);
    }

    @SuppressLint({"MissingPermission"})
    public final int h() throws Exception {
        int i;
        if (this.s == null) {
            this.s = (CameraManager) this.l.getSystemService("camera");
            if (this.s == null) {
                return -1;
            }
        }
        if (this.h.m == 0) {
            this.f31349f = new c(this, this.l, this.s, this.k);
        } else {
            this.f31349f = new b(this, this.l, this.s, this.k);
        }
        this.h.s = this.f31349f.a(this.h.f31294e);
        b bVar = this.f31349f;
        if (this.f31348e) {
            i = this.h.o;
        } else {
            i = 0;
        }
        int c2 = bVar.c(i);
        if (c2 != 0) {
            return c2;
        }
        p();
        o();
        this.j.a(1, 0, "TEOppoCamera2 features is ready");
        this.s.openCamera(this.h.s, this.v, this.k);
        return 0;
    }

    public final void a(Bundle bundle) {
        this.f31349f.a(bundle);
    }

    public final void d(int i) {
        if (this.f31349f != null) {
            j();
            if (i == 0) {
                this.f31349f = new c(this, this.l, this.s, this.k);
                ad.c("TECamera2", "switch video mode");
            } else {
                this.f31349f = new b(this, this.l, this.s, this.k);
                ad.c("TECamera2", "switch image mode");
            }
            try {
                this.h.s = this.f31349f.a(this.h.f31294e);
                if (this.f31349f.c(this.h.o) != 0) {
                    return;
                }
            } catch (CameraAccessException unused) {
            }
            this.f31349f.a((Object) this.t);
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i) {
        int i2 = this.h.k.f31335a;
        int i3 = this.h.k.f31336b;
        String packageName = this.l.getPackageName();
        Size size = new Size(i2, i3);
        String id = this.t.getId();
        com.b.b.b a2 = com.b.b.b.a();
        try {
            String b2 = a2.b(e.f31458d.get(packageName));
            if (b2 == null || b2.isEmpty()) {
                ad.c("TECamera2", "oMediaVersion is null");
            } else {
                String b3 = a2.b();
                if (b3 == null || !b3.contains(id)) {
                    ad.c("TECamera2", "omedia camList is null");
                    return;
                }
                String c2 = a2.c(id);
                if (c2 == null || c2.isEmpty()) {
                    ad.c("TECamera2", "omedia camera:" + id + "capability is null");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject(c2);
                    String str = null;
                    if (1 == jSONObject2.optInt("EIS")) {
                        str = "EIS";
                        jSONObject.put(str, 1);
                    } else if (1 == jSONObject2.optInt("OIS-Movie")) {
                        str = "OIS-Movie";
                        jSONObject.put(str, 1);
                    }
                    boolean z = false;
                    if (!(c2 == null || str == null || str.isEmpty())) {
                        boolean a3 = com.b.b.b.a(c2, str, new Size(size.getWidth(), size.getHeight()));
                        boolean a4 = com.b.b.b.a(c2, str, i);
                        ad.b("TECamera2", "w:" + size.getWidth() + " h:" + size.getHeight() + "sizeCheck:" + a3 + " countCheck:" + a4);
                        z = a3 & a4;
                    }
                    if (jSONObject.length() <= 0 || !z) {
                        ad.c("TECamera2", "omedia update parm str is null " + jSONObject + " " + z);
                        return;
                    }
                    boolean a5 = a2.a(jSONObject.toString());
                    ad.b("TECamera2", "omedia set capability: " + jSONObject.toString() + " setFeatureSuccess:" + a5);
                }
            }
        } catch (RuntimeException unused) {
            ad.d("TECamera2", "omedia got a RuntimeException");
        } catch (JSONException unused2) {
            ad.c("TECamera2", "omedia got a json Exception");
        }
    }

    public a(int i, Context context, c.a aVar, Handler handler) {
        super(i, context, aVar, handler);
    }
}
