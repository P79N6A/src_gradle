package com.ss.android.ugc.aweme.forward.vh;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final /* synthetic */ class c implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48405a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseForwardViewHolder f48406b;

    c(BaseForwardViewHolder baseForwardViewHolder) {
        this.f48406b = baseForwardViewHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        View view2 = view;
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        if (PatchProxy.isSupport(new Object[]{view2, textExtraStruct2}, this, f48405a, false, 45599, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, textExtraStruct2}, this, f48405a, false, 45599, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        BaseForwardViewHolder baseForwardViewHolder = this.f48406b;
        if (baseForwardViewHolder.f48318c != null) {
            baseForwardViewHolder.f48318c.a(view2, textExtraStruct2, baseForwardViewHolder.itemView, baseForwardViewHolder.f48319d);
        }
    }
}
