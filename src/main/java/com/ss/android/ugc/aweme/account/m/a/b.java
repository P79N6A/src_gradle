package com.ss.android.ugc.aweme.account.m.a;

import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.e;
import com.bytedance.sdk.account.f.b.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment;
import com.ss.android.ugc.aweme.w;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements d, InputCaptchaFragment.a, InputCaptchaFragment.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32729a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f32730b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32731c;

    /* renamed from: d  reason: collision with root package name */
    private a f32732d;

    /* renamed from: e  reason: collision with root package name */
    private InputCaptchaFragment f32733e;

    /* renamed from: f  reason: collision with root package name */
    private j f32734f;
    private String g;
    private h h;

    public final void a() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32729a, false, 21561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32729a, false, 21561, new Class[0], Void.TYPE);
            return;
        }
        a(this.h, false);
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f32729a, false, 21556, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32729a, false, 21556, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.bytedance.sdk.account.d.d.a(w.b()).a(this.g, 23, false, this.f32734f);
    }

    public b(WeakReference<Context> weakReference, a aVar) {
        this.f32730b = weakReference;
        this.f32732d = aVar;
    }

    public final void b(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32729a, false, 21557, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32729a, false, 21557, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32733e.dismiss();
        a(str);
    }

    public final void call(final h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f32729a, false, 21555, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f32729a, false, 21555, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (this.f32730b.get() != null) {
            this.h = hVar;
            this.h.f20625f = false;
            this.g = hVar.f20623d.getString("code");
            try {
                this.f32731c = hVar.f20623d.getBoolean("ignoreErrorToast");
            } catch (JSONException unused) {
            }
            this.f32734f = new j() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32735c;

                public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                    e eVar = (e) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{eVar}, this, f32735c, false, 21563, new Class[]{e.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{eVar}, this, f32735c, false, 21563, new Class[]{e.class}, Void.TYPE);
                        return;
                    }
                    b.this.a(hVar, true);
                }

                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                    e eVar = (e) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f32735c, false, 21564, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f32735c, false, 21564, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!(b.this.f32730b == null || b.this.f32730b.get() == null || b.this.f32731c)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) b.this.f32730b.get(), eVar.errorMsg).a();
                    }
                    b.this.a(hVar, false);
                }
            };
            a("");
        }
    }

    public final void a(h hVar, boolean z) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f32729a, false, 21558, new Class[]{h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, Byte.valueOf(z)}, this, f32729a, false, 21558, new Class[]{h.class, Boolean.TYPE}, Void.TYPE);
        } else if (hVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            this.f32732d.a(hVar2.f20621b, jSONObject);
        }
    }
}
