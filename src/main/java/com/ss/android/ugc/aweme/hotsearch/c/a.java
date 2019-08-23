package com.ss.android.ugc.aweme.hotsearch.c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49713a;

    public static void a(Aweme aweme, int i, String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f49713a, true, 49801, new Class[]{Aweme.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f49713a, true, 49801, new Class[]{Aweme.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 3 && aweme != null) {
            d a2 = new d().a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("action_type", str2).a("order", i);
            if (TextUtils.equals("click", str2)) {
                a2.a("log_pb", ai.a().a(aa.c(aweme)));
                r.a("hot_search_video_keyword", aa.a(a2.f34114b));
                return;
            }
            r.a("hot_search_video_keyword", (Map) a2.f34114b);
        }
    }
}
