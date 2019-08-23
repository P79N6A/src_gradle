package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57714a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFollowViewHolder f57715b;

    f(BaseFollowViewHolder baseFollowViewHolder) {
        this.f57715b = baseFollowViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57714a, false, 62070, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57714a, false, 62070, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f57715b.c(view2);
    }
}
