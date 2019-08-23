package com.ss.android.ugc.aweme.newfollow.userstate;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57388a;

    /* renamed from: b  reason: collision with root package name */
    private final UserStateFeedViewHolder f57389b;

    d(UserStateFeedViewHolder userStateFeedViewHolder) {
        this.f57389b = userStateFeedViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57388a, false, 61796, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57388a, false, 61796, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f57389b.g();
    }
}
