package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.common.collect.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.b.b;
import com.ss.android.sdk.b.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.iesapi.a;
import java.util.Map;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71081a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f71082b;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f71081a, true, 81021, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f71081a, true, 81021, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c[] cVarArr = new c[0];
        if (d.a().isLogin()) {
            cVarArr = b.a().f30690a;
        }
        for (c cVar : cVarArr) {
            if (cVar.l != null && cVar.l.contains("toutiao") && cVar.o) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        a(this.f71082b);
        r.a("bind_toutiao_confirm", (Map) ak.of("current_fans_count", String.valueOf(d.a().getCurUser().getFansCount()), "enter_method", "after_publish"));
    }

    public static void a(Activity activity) {
        final Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, f71081a, true, 81023, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, f71081a, true, 81023, new Class[]{Activity.class}, Void.TYPE);
        } else if (a()) {
            new com.ss.android.ugc.aweme.iesapi.a.c(activity2).a((a.C0592a) new a.C0592a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71087a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f71087a, false, 81028, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71087a, false, 81028, new Class[0], Void.TYPE);
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.a((Context) activity2, (int) C0906R.string.hh).a();
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f71087a, false, 81029, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f71087a, false, 81029, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b((Context) activity2, (int) C0906R.string.hg).a();
                }
            });
        } else {
            Intent authorizeActivityStartIntent = com.ss.android.ugc.aweme.account.c.c().getAuthorizeActivityStartIntent(activity2);
            authorizeActivityStartIntent.putExtra("platform", "toutiao_v2");
            authorizeActivityStartIntent.putExtra("is_login", false);
            activity2.startActivityForResult(authorizeActivityStartIntent, 10005);
        }
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == 1) {
                return true;
            }
        }
        return false;
    }
}
