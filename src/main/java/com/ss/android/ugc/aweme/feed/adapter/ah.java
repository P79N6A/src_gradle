package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class ah implements b.C0184b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44882a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoViewHolder f44883b;

    ah(VideoViewHolder videoViewHolder) {
        this.f44883b = videoViewHolder;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44882a, false, 40854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44882a, false, 40854, new Class[0], Void.TYPE);
            return;
        }
        VideoViewHolder videoViewHolder = this.f44883b;
        videoViewHolder.g(37);
        r.a("click_dou_bubble", (Map) d.a().a("group_id", videoViewHolder.f44821f.getAid()).a("enter_from", videoViewHolder.L() ? "personal_homepage" : "others_homepage").a("author_id", videoViewHolder.f44821f.getAuthorUid()).a("is_self", videoViewHolder.L() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY).f34114b);
    }
}
