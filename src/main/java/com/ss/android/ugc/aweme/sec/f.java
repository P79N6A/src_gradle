package com.ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.sec.c;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@WorkerThread
public class f<T> extends c.a<T> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f63766d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f63767e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f63768f;
    public final Object g = new Object();
    public JSONObject h;

    public T a() {
        if (PatchProxy.isSupport(new Object[0], this, f63766d, false, 71098, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f63766d, false, 71098, new Class[0], Object.class);
        } else if (this.f63755c == null) {
            return null;
        } else {
            return this.f63755c.a();
        }
    }

    public T b() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f63766d, false, 71097, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f63766d, false, 71097, new Class[0], Object.class);
        } else if (this.f63755c == null) {
            return null;
        } else {
            return this.f63755c.b();
        }
    }

    public final T c() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f63766d, false, 71096, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f63766d, false, 71096, new Class[0], Object.class);
        } else if (this.f63767e) {
            return b();
        } else {
            return a();
        }
    }

    public final boolean a(int i) throws InterruptedException {
        boolean z;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63766d, false, 71093, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63766d, false, 71093, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int i3 = 4;
        Activity e2 = k.a().e();
        if (e2 != null) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, a.f63719a, true, 71086, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, a.f63719a, true, 71086, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                if (a.f63720b) {
                    if (a.f63722d == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("captcha");
                    }
                    if (i2 == 3058 || i2 == 3059 || i2 == 1104 || i2 == 1105) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                a.a(i2, e2, new g() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63769a;

                    public final void a(boolean z, @NotNull String str) {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f63769a, false, 71100, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f63769a, false, 71100, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
                            return;
                        }
                        f.this.f63767e = z;
                        f.this.f63768f = true;
                        synchronized (f.this.g) {
                            f.this.g.notifyAll();
                        }
                    }
                });
                synchronized (this.g) {
                    while (!this.f63768f) {
                        int i4 = i3 - 1;
                        if (i3 <= 0) {
                            break;
                        }
                        this.g.wait(50000);
                        i3 = i4;
                    }
                    this.g.notifyAll();
                }
                return true;
            }
        }
        return false;
    }

    public final boolean a(String str, JSONObject jSONObject) throws InterruptedException, IOException, JSONException {
        boolean z;
        int i;
        JSONObject jSONObject2 = jSONObject;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str, jSONObject2}, this, f63766d, false, 71092, new Class[]{String.class, JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, jSONObject2}, this, f63766d, false, 71092, new Class[]{String.class, JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        this.h = jSONObject2;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f63766d, false, 71099, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f63766d, false, 71099, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if ((jSONObject2 == null || !jSONObject2.has("status_code") || jSONObject2.optInt("status_code") != 0) && (jSONObject2 == null || !jSONObject2.has("message") || !TextUtils.equals("success", jSONObject2.optString("message")))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return false;
        }
        if (jSONObject2.has("error_code")) {
            i = jSONObject2.optInt("error_code");
        } else if (jSONObject2.has("status_code")) {
            i = jSONObject2.optInt("status_code");
        } else if (!a.b(str)) {
            return false;
        } else {
            d dVar = new d();
            if (PatchProxy.isSupport(new Object[]{str, jSONObject2}, dVar, d.f63764a, false, 71089, new Class[]{String.class, JSONObject.class}, Integer.TYPE)) {
                d dVar2 = dVar;
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{str, jSONObject2}, dVar2, d.f63764a, false, 71089, new Class[]{String.class, JSONObject.class}, Integer.TYPE)).intValue();
            } else {
                if (a.b(str)) {
                    String str2 = "";
                    if (jSONObject2.has("message")) {
                        str2 = jSONObject2.optString("message");
                    }
                    if (TextUtils.equals(str2, "error")) {
                        i2 = new JSONObject(jSONObject2.optString("data")).optInt("error_code");
                    }
                }
                i = i2;
            }
        }
        return a(i);
    }
}
