package com.ss.android.ugc.aweme.account.l;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32022a;

    public static void a(Context context, String str, String str2) {
        String str3;
        String str4;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2}, null, f32022a, true, 21462, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str, str2}, null, f32022a, true, 21462, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            h.a().a(g.b().aQ().getNotLoggedIn());
        } catch (a unused) {
            if (TextUtils.isEmpty(str)) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (TextUtils.isEmpty(str2)) {
                str4 = "";
            } else {
                str4 = str2;
            }
            i iVar = new i("https://aweme.snssdk.com/falcon/douyin_falcon/faq/?id=1209");
            iVar.a("enter_from", str3);
            iVar.a("enter_method", str4);
            ((v) w.a(v.class)).a(context2, iVar.toString(), true);
        }
        r.onEvent(MobClick.obtain().setEventName("sign_in_problem").setLabelName("sign_in_page"));
    }
}
