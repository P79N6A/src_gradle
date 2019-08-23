package com.ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48790a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendListViewHolder f48791b;

    /* renamed from: c  reason: collision with root package name */
    private final c f48792c;

    d(FriendListViewHolder friendListViewHolder, c cVar) {
        this.f48791b = friendListViewHolder;
        this.f48792c = cVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48790a, false, 46283, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48790a, false, 46283, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f48791b.a(this.f48792c, view);
    }
}
