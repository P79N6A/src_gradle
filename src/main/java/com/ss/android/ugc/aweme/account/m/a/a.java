package com.ss.android.ugc.aweme.account.m.a;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.k;
import com.bytedance.sdk.account.f.b.a.g;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.a.j;
import com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment;
import com.ss.android.ugc.aweme.w;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements d, InputCaptchaFragment.a, InputCaptchaFragment.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32718a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f32719b = 22;

    /* renamed from: c  reason: collision with root package name */
    public static int f32720c = 23;

    /* renamed from: d  reason: collision with root package name */
    protected WeakReference<Context> f32721d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.ies.f.a.a f32722e;

    /* renamed from: f  reason: collision with root package name */
    private InputCaptchaFragment f32723f;
    private i g;
    private g h;
    private h i;

    private FragmentActivity c() {
        if (PatchProxy.isSupport(new Object[0], this, f32718a, false, 21548, new Class[0], FragmentActivity.class)) {
            return (FragmentActivity) PatchProxy.accessDispatch(new Object[0], this, f32718a, false, 21548, new Class[0], FragmentActivity.class);
        } else if (this.f32721d != null) {
            return (FragmentActivity) this.f32721d.get();
        } else {
            return null;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32718a, false, 21544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32718a, false, 21544, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.sdk.account.d.d.a(w.b()).a(f32719b, this.h);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32718a, false, 21547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32718a, false, 21547, new Class[0], Void.TYPE);
            return;
        }
        a(this.i, false);
    }

    public a(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar) {
        this.f32721d = weakReference;
        this.f32722e = aVar;
    }

    public final void a(h hVar, boolean z) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f32718a, false, 21545, new Class[]{h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, Byte.valueOf(z)}, this, f32718a, false, 21545, new Class[]{h.class, Boolean.TYPE}, Void.TYPE);
        } else if (hVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            this.f32722e.a(hVar2.f20621b, jSONObject);
        }
    }

    public final void b(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f32718a, false, 21543, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f32718a, false, 21543, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32723f.dismiss();
        com.bytedance.sdk.account.d.d.a(w.b()).a("", str, f32719b, this.g);
    }

    public final void call(final h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f32718a, false, 21542, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f32718a, false, 21542, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (this.f32721d.get() != null) {
            if (TextUtils.isEmpty(w.a().getCurUser().getBindPhone())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f32721d.get(), (int) C0906R.string.alv).a();
                a(hVar, false);
                return;
            }
            this.i = hVar;
            this.i.f20625f = false;
            this.g = new j() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32724c;

                /* renamed from: a */
                public final void g(c<k> cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32724c, false, 21549, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32724c, false, 21549, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    super.g(cVar);
                    a.this.a(hVar, true);
                }

                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
                    c cVar = (c) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32724c, false, 21551, new Class[]{c.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32724c, false, 21551, new Class[]{c.class, String.class}, Void.TYPE);
                    } else if (!TextUtils.isEmpty(str)) {
                        a.this.a(str, cVar.errorMsg, a.f32719b, a.this);
                    } else {
                        if (!(a.this.f32721d == null || a.this.f32721d.get() == null)) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f32721d.get(), cVar.errorMsg).a();
                        }
                        a.this.a(hVar, false);
                    }
                }

                public final void a(c<k> cVar, int i) {
                    if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32724c, false, 21550, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32724c, false, 21550, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.a(cVar, i);
                    if (!(a.this.f32721d == null || a.this.f32721d.get() == null)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f32721d.get(), cVar.errorMsg).a();
                    }
                    a.this.a(hVar, false);
                }
            };
            this.h = new g() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32727c;

                /* renamed from: a */
                public final void g(c<com.bytedance.sdk.account.f.a.i> cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f32727c, false, 21552, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f32727c, false, 21552, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    a.this.a(((com.bytedance.sdk.account.f.a.i) cVar.f22251a).f22383a, null, a.f32719b, a.this);
                }

                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
                    c cVar = (c) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f32727c, false, 21554, new Class[]{c.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f32727c, false, 21554, new Class[]{c.class, String.class}, Void.TYPE);
                    } else if (!TextUtils.isEmpty(str)) {
                        a.this.a(str, cVar.errorMsg, a.f32719b, a.this);
                    } else {
                        if (!(TextUtils.isEmpty(cVar.errorMsg) || a.this.f32721d == null || a.this.f32721d.get() == null)) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f32721d.get(), cVar.errorMsg).a();
                        }
                    }
                }

                public final void a(c<com.bytedance.sdk.account.f.a.i> cVar, int i) {
                    if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f32727c, false, 21553, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f32727c, false, 21553, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!(TextUtils.isEmpty(cVar.errorMsg) || a.this.f32721d == null || a.this.f32721d.get() == null)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f32721d.get(), cVar.errorMsg).a();
                    }
                }
            };
            com.bytedance.sdk.account.d.d.a(w.b()).a("", "", f32719b, this.g);
        }
    }

    public final void a(String str, String str2, int i2, InputCaptchaFragment.a aVar) {
        String str3 = str;
        String str4 = str2;
        int i3 = i2;
        InputCaptchaFragment.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i2), aVar2}, this, f32718a, false, 21546, new Class[]{String.class, String.class, Integer.TYPE, InputCaptchaFragment.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i2), aVar2}, this, f32718a, false, 21546, new Class[]{String.class, String.class, Integer.TYPE, InputCaptchaFragment.a.class}, Void.TYPE);
        } else if (c() != null) {
            if (this.f32723f == null) {
                this.f32723f = InputCaptchaFragment.a(str3, i3, aVar2);
                FragmentTransaction beginTransaction = c().getSupportFragmentManager().beginTransaction();
                beginTransaction.add((Fragment) this.f32723f, "captcha");
                beginTransaction.commitAllowingStateLoss();
            } else if (c().getSupportFragmentManager().findFragmentByTag("captcha") == null) {
                this.f32723f.show(c().getSupportFragmentManager(), "captcha");
                this.f32723f.f32447e = aVar2;
            }
            this.f32723f.f32448f = this;
            this.f32723f.a(str3, str4, i3);
        }
    }
}
