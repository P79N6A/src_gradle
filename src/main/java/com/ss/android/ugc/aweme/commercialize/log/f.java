package com.ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39315a;

    public static void a(j jVar, Aweme aweme, String str, boolean z, String str2) {
        String str3;
        String str4;
        String str5;
        j jVar2 = jVar;
        String str6 = str;
        if (PatchProxy.isSupport(new Object[]{jVar2, aweme, str6, Byte.valueOf(z ? (byte) 1 : 0), str2}, null, f39315a, true, 31487, new Class[]{j.class, Aweme.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {jVar2, aweme, str6, Byte.valueOf(z), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39315a, true, 31487, new Class[]{j.class, Aweme.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (aweme != null && jVar2 != null) {
            String str7 = "normaltitle";
            if (!z) {
                switch (jVar2.feedShowType) {
                    case 1:
                        str7 = "weaktitle";
                        break;
                    case 2:
                        str7 = "strongtitle";
                        break;
                }
            }
            d a2 = d.a().a("degree_style_difference", str7);
            if (ex.e(aweme.getAuthor())) {
                str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str3 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            d a3 = a2.a("is_enterprise", str3).a("action_type", str6);
            if (z) {
                str4 = "video_comment";
            } else {
                str4 = "video_play";
            }
            d a4 = a3.a("page_type", str4).a("author_id", aweme.getAuthorUid()).a("group_id", aweme.getAid());
            if (TextUtils.isEmpty(str2)) {
                str5 = "";
            } else {
                str5 = str2;
            }
            r.a("link_userside", (Map) a4.a("enter_from", str5).f34114b);
        }
    }
}
