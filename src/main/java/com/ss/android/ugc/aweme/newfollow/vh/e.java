package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57712a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFollowViewHolder f57713b;

    e(BaseFollowViewHolder baseFollowViewHolder) {
        this.f57713b = baseFollowViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57712a, false, 62069, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57712a, false, 62069, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        BaseFollowViewHolder baseFollowViewHolder = this.f57713b;
        if (baseFollowViewHolder.n != null) {
            baseFollowViewHolder.n.a(view2, baseFollowViewHolder.itemView, baseFollowViewHolder.j, baseFollowViewHolder.j.getAuthor());
        }
    }
}
