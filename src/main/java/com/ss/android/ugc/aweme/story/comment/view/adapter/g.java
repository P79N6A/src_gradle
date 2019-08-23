package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.base.utils.f;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72296a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewerListViewHolder f72297b;

    g(ViewerListViewHolder viewerListViewHolder) {
        this.f72297b = viewerListViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72296a, false, 83007, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72296a, false, 83007, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ViewerListViewHolder viewerListViewHolder = this.f72297b;
        if (!f.a(view)) {
            viewerListViewHolder.s = (d) ServiceManager.get().getService(d.class);
            if (viewerListViewHolder.s != null && !TextUtils.isEmpty(viewerListViewHolder.n.getUid())) {
                viewerListViewHolder.s.a(view.getContext(), viewerListViewHolder.n.getUid(), viewerListViewHolder.n.getSecUid());
            }
        }
    }
}
