package com.ss.android.ugc.aweme.profile.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.util.Map;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61459a;

    public static void a(Context context, boolean z, String str) {
        String str2;
        String str3;
        Context context2 = context;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0), str4}, null, f61459a, true, 69973, new Class[]{Context.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z), str4}, null, f61459a, true, 69973, new Class[]{Context.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (context2 != null) {
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/douyin_falcon/certification/personalApplyEnter/index.html?enter_from=" + str4));
            intent.putExtra("hide_nav_bar", true);
            context2.startActivity(intent);
            r.onEvent(MobClick.obtain().setEventName("enter_certification").setLabelName("official_certification").setJsonObject(new c().a("enter_from", str4).b()));
            d a2 = d.a();
            if (z) {
                str2 = "click_blue_vip";
            } else {
                str2 = "click";
            }
            d a3 = a2.a("enter_method", str2);
            if ("settings".equals(str4)) {
                str3 = "settings_page";
            } else {
                str3 = "others_homepage";
            }
            r.a("enter_office_certification", (Map) a3.a("previous_page", str3).f34114b);
        }
    }
}
