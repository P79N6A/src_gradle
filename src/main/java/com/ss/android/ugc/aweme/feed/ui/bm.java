package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final /* synthetic */ class bm implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46621a;

    /* renamed from: b  reason: collision with root package name */
    private final bj f46622b;

    bm(bj bjVar) {
        this.f46622b = bjVar;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        if (PatchProxy.isSupport(new Object[]{view, textExtraStruct2}, this, f46621a, false, 43187, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, textExtraStruct2}, this, f46621a, false, 43187, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        this.f46622b.a(textExtraStruct2);
    }
}
