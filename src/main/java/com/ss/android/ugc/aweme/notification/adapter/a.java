package com.ss.android.ugc.aweme.notification.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final /* synthetic */ class a implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57944a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentNotificationHolder f57945b;

    a(CommentNotificationHolder commentNotificationHolder) {
        this.f57945b = commentNotificationHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        if (PatchProxy.isSupport(new Object[]{view, textExtraStruct2}, this, f57944a, false, 62910, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, textExtraStruct2}, this, f57944a, false, 62910, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        this.f57945b.a(textExtraStruct2);
    }
}
