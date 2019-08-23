package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.f;
import com.ss.android.ugc.aweme.w;
import com.tencent.connect.b.h;
import com.tencent.open.a.f;
import com.tencent.tauth.b;
import com.tencent.tauth.c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d extends BasePlatformAuthorize implements b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32148c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f32149d;

    /* renamed from: e  reason: collision with root package name */
    private c f32150e;

    /* renamed from: f  reason: collision with root package name */
    private b f32151f = new a(this);

    static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32152a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<b> f32153b;

        public final void h() {
            if (PatchProxy.isSupport(new Object[0], this, f32152a, false, 20176, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32152a, false, 20176, new Class[0], Void.TYPE);
                return;
            }
            if (this.f32153b.get() != null) {
                ((b) this.f32153b.get()).h();
            }
        }

        public a(b bVar) {
            this.f32153b = new WeakReference<>(bVar);
        }

        public final void a(com.tencent.tauth.d dVar) {
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f32152a, false, 20175, new Class[]{com.tencent.tauth.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f32152a, false, 20175, new Class[]{com.tencent.tauth.d.class}, Void.TYPE);
                return;
            }
            if (this.f32153b.get() != null) {
                ((b) this.f32153b.get()).a(dVar);
            }
        }

        public final void a(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f32152a, false, 20174, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj}, this, f32152a, false, 20174, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            if (this.f32153b.get() != null) {
                ((b) this.f32153b.get()).a(obj);
            }
        }
    }

    public final boolean b(int i, String str) {
        return false;
    }

    @NonNull
    public final String c() {
        return "qzone_sns";
    }

    @NonNull
    public final String d() {
        return "";
    }

    @NonNull
    public final String e() {
        return "QQ";
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f32148c, false, 20173, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32148c, false, 20173, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f32148c, false, 20169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32148c, false, 20169, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32150e != null) {
            h hVar = this.f32150e.f79775a;
            StringBuilder sb = new StringBuilder("isSessionValid(), result = ");
            if (hVar.f79623a.a()) {
                str = "true";
            } else {
                str = "false";
            }
            sb.append(str);
            f.a("openSDK_LOG.QQAuth", sb.toString());
            if (!hVar.f79623a.a()) {
                c cVar = this.f32150e;
                Activity activity = this.f32149d;
                b bVar = this.f32151f;
                f.c("openSDK_LOG.Tencent", "login() with activity, scope is " + "get_simple_userinfo,add_topic");
                h hVar2 = cVar.f79775a;
                f.c("openSDK_LOG.QQAuth", "login()");
                f.c("openSDK_LOG.QQAuth", "-->login activity: " + activity);
                hVar2.a(activity, null, "get_simple_userinfo,add_topic", bVar);
                return;
            }
        }
        a(-100000, "");
    }

    public final void a(com.tencent.tauth.d dVar) {
        com.tencent.tauth.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f32148c, false, 20172, new Class[]{com.tencent.tauth.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f32148c, false, 20172, new Class[]{com.tencent.tauth.d.class}, Void.TYPE);
            return;
        }
        a(dVar2.f79776a, dVar2.f79777b);
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f32148c, false, 20171, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f32148c, false, 20171, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && !TextUtils.isEmpty(jSONObject.optString("access_token"))) {
                a(new f.a().d("qzone_sns").a(jSONObject.optString("access_token")).a(Long.parseLong(jSONObject.optString("expires_in"))).b(jSONObject.optString("openid")).a());
                return;
            }
        }
        a(-100000, " Objcect==null");
    }

    public d(@NonNull Activity activity, @NonNull b bVar, @BasePlatformAuthorize.AuthorizeType int i) {
        super(activity, bVar, i);
        this.f32149d = activity;
        this.f32150e = c.a("1105602870", (Context) w.b());
    }

    public final void a(int i, int i2, Intent intent) {
        boolean z;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32148c, false, 20170, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32148c, false, 20170, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.a(i, i2, intent);
        b bVar = this.f32151f;
        StringBuilder sb = new StringBuilder("onActivityResultData() reqcode = ");
        sb.append(i3);
        sb.append(", resultcode = ");
        sb.append(i4);
        sb.append(", data = null ? ");
        if (intent2 == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", listener = null ? ");
        if (bVar != null) {
            z2 = false;
        }
        sb.append(z2);
        com.tencent.open.a.f.c("openSDK_LOG.Tencent", sb.toString());
        com.tencent.connect.common.b.a().a(i3, i4, intent2, bVar);
    }
}
