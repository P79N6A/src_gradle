package com.ss.android.ugc.aweme.profile.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61463a;

    public static void a(User user, String str, int i, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{user, str3, Integer.valueOf(i), str4}, null, f61463a, true, 69980, new Class[]{User.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, str3, Integer.valueOf(i), str4}, null, f61463a, true, 69980, new Class[]{User.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        r.a("follow_card", (Map) d.a().a("rec_uid", user.getUid()).a("enter_from", "others_homepage").a("event_type", str3).a("impr_order", i).a("req_id", str4).a("rec_reason", user.getRecommendReason()).f34114b);
    }
}
