package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57710a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFollowViewHolder f57711b;

    d(BaseFollowViewHolder baseFollowViewHolder) {
        this.f57711b = baseFollowViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57710a, false, 62068, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57710a, false, 62068, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f57711b.d(view2);
    }
}
