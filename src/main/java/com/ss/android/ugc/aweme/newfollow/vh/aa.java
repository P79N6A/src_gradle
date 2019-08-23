package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final /* synthetic */ class aa implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57694a;

    /* renamed from: b  reason: collision with root package name */
    private final MomentForwardFeedViewHolder f57695b;

    aa(MomentForwardFeedViewHolder momentForwardFeedViewHolder) {
        this.f57695b = momentForwardFeedViewHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        View view2 = view;
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        if (PatchProxy.isSupport(new Object[]{view2, textExtraStruct2}, this, f57694a, false, 62646, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, textExtraStruct2}, this, f57694a, false, 62646, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        MomentForwardFeedViewHolder momentForwardFeedViewHolder = this.f57695b;
        if (momentForwardFeedViewHolder.f48318c != null) {
            momentForwardFeedViewHolder.f48318c.a(view2, textExtraStruct2, momentForwardFeedViewHolder.itemView, momentForwardFeedViewHolder.f48319d);
        }
    }
}
