package com.ss.android.ugc.aweme.story.shootvideo.publish.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73784a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishBottomLayout f73785b;

    a(PublishBottomLayout publishBottomLayout) {
        this.f73785b = publishBottomLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73784a, false, 85521, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73784a, false, 85521, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PublishBottomLayout publishBottomLayout = this.f73785b;
        publishBottomLayout.g = true ^ publishBottomLayout.g;
        publishBottomLayout.a();
        com.ss.android.ugc.aweme.port.in.a.o.w().a(Boolean.valueOf(publishBottomLayout.g));
        com.ss.android.ugc.aweme.utils.a.f75468b.a("saving_click", d.a().a("creation_id", publishBottomLayout.i).a("shoot_way", publishBottomLayout.j == null ? "story" : publishBottomLayout.j.mShootWay).a("to_status", publishBottomLayout.g ? "on" : "off").a("enter_from", "edit_post_page").f34114b);
    }
}
