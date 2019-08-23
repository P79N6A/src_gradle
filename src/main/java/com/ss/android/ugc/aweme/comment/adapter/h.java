package com.ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final /* synthetic */ class h implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36354a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentViewHolder f36355b;

    h(CommentViewHolder commentViewHolder) {
        this.f36355b = commentViewHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        if (PatchProxy.isSupport(new Object[]{view, textExtraStruct2}, this, f36354a, false, 27256, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, textExtraStruct2}, this, f36354a, false, 27256, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        this.f36355b.a(textExtraStruct2);
    }
}
