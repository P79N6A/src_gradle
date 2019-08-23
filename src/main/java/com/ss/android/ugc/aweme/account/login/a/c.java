package com.ss.android.ugc.aweme.account.login.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.login.loginlog.a;
import com.ss.android.ugc.aweme.account.login.ui.InputCaptchaFragment;
import com.ss.android.ugc.aweme.w;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public abstract class c implements InputCaptchaFragment.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f32050b;

    /* renamed from: a  reason: collision with root package name */
    private d f32051a = com.bytedance.sdk.account.d.d.a(w.b());

    /* renamed from: c  reason: collision with root package name */
    public k f32052c;

    public abstract void a(String str, int i);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32050b, false, 20215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32050b, false, 20215, new Class[0], Void.TYPE);
            return;
        }
        this.f32052c.i();
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20046, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.account.i.d.f31991b.c("on refresh captcha");
        }
        this.f32051a.a(g.u, (com.bytedance.sdk.account.f.b.a.g) new com.bytedance.sdk.account.f.b.a.g() {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f32053c;

            public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse, String str) {
            }

            /* renamed from: a */
            public final void g(com.bytedance.sdk.account.api.call.c<i> cVar) {
                com.bytedance.sdk.account.api.call.c<i> cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f32053c, false, 20216, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f32053c, false, 20216, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                    return;
                }
                if (!(cVar2 == null || cVar2.f22251a == null || TextUtils.isEmpty(((i) cVar2.f22251a).f22383a))) {
                    String str = ((i) cVar2.f22251a).f22383a;
                    String valueOf = String.valueOf(((i) cVar2.f22251a).l);
                    if (PatchProxy.isSupport(new Object[]{str, valueOf}, null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20048, new Class[]{String.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, valueOf}, null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20048, new Class[]{String.class, String.class}, Void.TYPE);
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event", "on refresh captcha success");
                        if (str == null) {
                            str = "";
                        }
                        hashMap.put("captcha", str);
                        if (valueOf == null) {
                            valueOf = "";
                        }
                        hashMap.put("scenario", valueOf);
                        com.ss.android.ugc.aweme.account.i.d dVar = com.ss.android.ugc.aweme.account.i.d.f31991b;
                        String hashMap2 = hashMap.toString();
                        Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
                        dVar.c(hashMap2);
                    }
                    c.this.f32052c.a(((i) cVar2.f22251a).f22383a, null, ((i) cVar2.f22251a).l, c.this);
                }
            }

            public final void a(com.bytedance.sdk.account.api.call.c<i> cVar, int i) {
                com.bytedance.sdk.account.api.call.c<i> cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i)}, this, f32053c, false, 20217, new Class[]{com.bytedance.sdk.account.api.call.c.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i)}, this, f32053c, false, 20217, new Class[]{com.bytedance.sdk.account.api.call.c.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                String valueOf = String.valueOf(cVar2.error);
                String str = cVar2.errorMsg;
                if (PatchProxy.isSupport(new Object[]{valueOf, str}, null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20049, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueOf, str}, null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20049, new Class[]{String.class, String.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event", "on refresh captcha error");
                if (valueOf == null) {
                    valueOf = "";
                }
                hashMap.put("errCode", valueOf);
                if (str == null) {
                    str = "";
                }
                hashMap.put("errorMsg", str);
                com.ss.android.ugc.aweme.account.i.d dVar = com.ss.android.ugc.aweme.account.i.d.f31991b;
                String hashMap2 = hashMap.toString();
                Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
                dVar.c(hashMap2);
            }
        });
    }

    public c(@NonNull k kVar) {
        this.f32052c = kVar;
    }

    public final void b(String str, int i) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f32050b, false, 20214, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f32050b, false, 20214, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.a().a("", "", false, "send_voice_code", "", "注册图片验证码");
        String valueOf = String.valueOf(i);
        if (PatchProxy.isSupport(new Object[]{str, valueOf}, null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20045, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, valueOf}, null, com.ss.android.ugc.aweme.account.i.d.f31990a, true, 20045, new Class[]{String.class, String.class}, Void.TYPE);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "on ok");
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            hashMap.put("captcha", str2);
            if (valueOf == null) {
                valueOf = "";
            }
            hashMap.put("scenario", valueOf);
            com.ss.android.ugc.aweme.account.i.d dVar = com.ss.android.ugc.aweme.account.i.d.f31991b;
            String hashMap2 = hashMap.toString();
            Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
            dVar.c(hashMap2);
        }
        a(str, i);
        this.f32052c.i();
    }
}
