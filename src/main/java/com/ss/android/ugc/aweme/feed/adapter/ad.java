package com.ss.android.ugc.aweme.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44871a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoViewHolder f44872b;

    /* renamed from: c  reason: collision with root package name */
    private final String f44873c;

    ad(VideoViewHolder videoViewHolder, String str) {
        this.f44872b = videoViewHolder;
        this.f44873c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f44871a, false, 40850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44871a, false, 40850, new Class[0], Void.TYPE);
            return;
        }
        VideoViewHolder videoViewHolder = this.f44872b;
        String str = this.f44873c;
        if (videoViewHolder.g) {
            videoViewHolder.h = false;
            return;
        }
        videoViewHolder.h = true;
        r.a("show_dou_bubble", (Map) d.a().a("group_id", videoViewHolder.f44821f.getAid()).a("enter_from", videoViewHolder.L() ? "personal_homepage" : "others_homepage").a("author_id", videoViewHolder.f44821f.getAuthorUid()).a("is_self", videoViewHolder.L() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY).f34114b);
        videoViewHolder.f44819d = new ag(videoViewHolder, str, videoViewHolder.mRootView.findViewById(C0906R.id.cpf));
        a.b(videoViewHolder.f44819d);
    }
}
