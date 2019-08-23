package com.ss.android.ugc.aweme.profile.ui.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;

public final /* synthetic */ class j implements RemarkEditDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63152a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendUserCardViewHolder f63153b;

    j(RecommendUserCardViewHolder recommendUserCardViewHolder) {
        this.f63153b = recommendUserCardViewHolder;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63152a, false, 69836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63152a, false, 69836, new Class[0], Void.TYPE);
            return;
        }
        RecommendUserCardViewHolder recommendUserCardViewHolder = this.f63153b;
        recommendUserCardViewHolder.a(recommendUserCardViewHolder.f63087d);
    }
}
