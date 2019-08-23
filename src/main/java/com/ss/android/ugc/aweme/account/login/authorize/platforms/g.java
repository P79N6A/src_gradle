package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.open.tt.impl.TTWebAuthorizeActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.f;
import com.ss.android.ugc.aweme.ttopenapi.a;
import java.lang.ref.SoftReference;

public final class g extends BasePlatformAuthorize implements a.C0784a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32169c;

    /* renamed from: d  reason: collision with root package name */
    boolean f32170d;

    /* renamed from: e  reason: collision with root package name */
    private final Activity f32171e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.sdk.account.open.tt.a.a f32172f;
    private boolean g = true;

    public final boolean b(int i, String str) {
        return false;
    }

    @NonNull
    public final String c() {
        return "toutiao_v2";
    }

    @NonNull
    public final String d() {
        return "";
    }

    @NonNull
    public final String e() {
        return "今日头条";
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f32169c, false, 20185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32169c, false, 20185, new Class[0], Void.TYPE);
        } else if (!this.g) {
            com.ss.android.b.a.a.a.a(new h(this), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        } else {
            this.g = false;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32169c, false, 20184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32169c, false, 20184, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.f32171e;
        com.bytedance.sdk.account.open.tt.a.a aVar = this.f32172f;
        if (PatchProxy.isSupport(new Object[]{activity, aVar, "", this}, null, a.f74998a, true, 87320, new Class[]{Context.class, com.bytedance.sdk.account.open.tt.a.a.class, String.class, a.C0784a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, aVar, "", this}, null, a.f74998a, true, 87320, new Class[]{Context.class, com.bytedance.sdk.account.open.tt.a.a.class, String.class, a.C0784a.class}, Void.TYPE);
        } else {
            try {
                a.f74999b = new SoftReference<>(this);
                c.a aVar2 = new c.a();
                aVar2.f22263e = "user_info";
                aVar2.f22259a = "";
                aVar2.callerLocalEntry = "com.ss.android.ugc.aweme.ttopenapi.TtEntryActivity";
                if (com.bytedance.sdk.account.b.d.a.a(activity, "com.ss.android.article.news")) {
                    aVar.a(aVar2);
                } else {
                    if (PatchProxy.isSupport(new Object[]{activity, aVar2}, null, a.f74998a, true, 87321, new Class[]{Context.class, c.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity, aVar2}, null, a.f74998a, true, 87321, new Class[]{Context.class, c.a.class}, Void.TYPE);
                    } else {
                        Bundle bundle = new Bundle();
                        aVar2.toBundle(bundle);
                        bundle.putString("_bytedance_params_client_key", "fc169c8d3a2eec4a");
                        bundle.putString("_bytedance_params_type_caller_package", activity.getPackageName());
                        bundle.putString("__bytedance_base_caller_version", com.bytedance.sdk.account.a.a.a.f22229a);
                        Intent intent = new Intent(activity, TTWebAuthorizeActivity.class);
                        intent.putExtras(bundle);
                        if (Build.VERSION.SDK_INT >= 21) {
                            intent.addFlags(67108864);
                            intent.addFlags(536870912);
                        }
                        activity.startActivity(intent);
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.f32170d = true;
    }

    public g(@NonNull Activity activity, @NonNull b bVar, int i) {
        super(activity, bVar, i);
        this.f32171e = activity;
        com.bytedance.sdk.account.open.tt.impl.a.a(new com.bytedance.sdk.account.a.b.c("fc169c8d3a2eec4a"));
        this.f32172f = com.bytedance.sdk.account.open.tt.impl.a.a((Context) activity);
    }

    public final void a(boolean z, String str, int i, String str2) {
        String str3 = str;
        int i2 = i;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3, Integer.valueOf(i), str4}, this, f32169c, false, 20186, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, Integer.valueOf(i), str4}, this, f32169c, false, 20186, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f32170d = false;
        if (z) {
            a(new f.a().c(str3).d("toutiao_v2").a());
        } else if (i2 == -2) {
            a();
        } else {
            a(i2, str4);
        }
    }
}
