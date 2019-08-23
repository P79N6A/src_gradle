package com.ss.android.ugc.aweme.ae;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.message.b.b;
import com.ss.android.ugc.aweme.utils.bg;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33215a;

    public static void a(Activity activity) {
        String str;
        if (PatchProxy.isSupport(new Object[]{activity}, null, f33215a, true, 70332, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f33215a, true, 70332, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        String stringExtra = activity.getIntent().getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        int intExtra = activity.getIntent().getIntExtra("extra_story_is_friend", -1);
        boolean booleanExtra = activity.getIntent().getBooleanExtra("is_from_push", false);
        if (!activity.getIntent().getBooleanExtra("is_have_intents", false)) {
            if ((p.a().c() || !activity.isTaskRoot()) && !booleanExtra) {
                if (!TextUtils.isEmpty(stringExtra)) {
                    bg.a(new b(stringExtra));
                }
                return;
            }
            if (TextUtils.isEmpty(stringExtra)) {
                str = "aweme://main";
            } else {
                str = "aweme://main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=" + stringExtra;
            }
            if (intExtra != -1) {
                h.a().f2591d.b("extra_story_is_friend");
                str = str + "&extra_story_is_friend" + "=" + intExtra;
            }
            h.a().a((Activity) null, str);
        }
    }
}
