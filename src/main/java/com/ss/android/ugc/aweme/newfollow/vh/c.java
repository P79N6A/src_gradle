package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final /* synthetic */ class c implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57708a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFollowViewHolder f57709b;

    c(BaseFollowViewHolder baseFollowViewHolder) {
        this.f57709b = baseFollowViewHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        View view2 = view;
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        if (PatchProxy.isSupport(new Object[]{view2, textExtraStruct2}, this, f57708a, false, 62067, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, textExtraStruct2}, this, f57708a, false, 62067, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        BaseFollowViewHolder baseFollowViewHolder = this.f57709b;
        if (baseFollowViewHolder.n != null) {
            baseFollowViewHolder.n.a(view2, textExtraStruct2, baseFollowViewHolder.itemView, baseFollowViewHolder.j);
        }
    }
}
