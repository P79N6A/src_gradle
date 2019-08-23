package com.ss.android.ugc.aweme.story.shootvideo.friends.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.a;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73576a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishSelectFriendViewHolder f73577b;

    /* renamed from: c  reason: collision with root package name */
    private final View f73578c;

    d(PublishSelectFriendViewHolder publishSelectFriendViewHolder, View view) {
        this.f73577b = publishSelectFriendViewHolder;
        this.f73578c = view;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73576a, false, 85315, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73576a, false, 85315, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PublishSelectFriendViewHolder publishSelectFriendViewHolder = this.f73577b;
        View view2 = this.f73578c;
        a.f75468b.a("duoshan_banner_click", com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", publishSelectFriendViewHolder.k).a("shoot_way", "story").a("enter_from", "edit_post_page").f34114b);
        String str = "";
        if (TextUtils.isEmpty(str)) {
            str = "https://maya.ppkankan01.com/page/record_demo/template/record_demo/lottie.html?source=aweme";
        }
        com.ss.android.ugc.aweme.port.in.a.f61121d.a(view2.getContext(), str);
    }
}
