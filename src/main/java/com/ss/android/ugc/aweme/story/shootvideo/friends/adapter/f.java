package com.ss.android.ugc.aweme.story.shootvideo.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.k;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73581a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishSelectFriendViewHolder f73582b;

    /* renamed from: c  reason: collision with root package name */
    private final int f73583c;

    /* renamed from: d  reason: collision with root package name */
    private final k f73584d;

    f(PublishSelectFriendViewHolder publishSelectFriendViewHolder, int i, k kVar) {
        this.f73582b = publishSelectFriendViewHolder;
        this.f73583c = i;
        this.f73584d = kVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73581a, false, 85317, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73581a, false, 85317, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PublishSelectFriendViewHolder publishSelectFriendViewHolder = this.f73582b;
        int i = this.f73583c;
        k kVar = this.f73584d;
        if (publishSelectFriendViewHolder.h == null || publishSelectFriendViewHolder.h.a(i, kVar.f73552b)) {
            kVar.f73552b = !kVar.f73552b;
            publishSelectFriendViewHolder.a(kVar.f73552b);
        }
    }
}
