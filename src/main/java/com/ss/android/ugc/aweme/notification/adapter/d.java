package com.ss.android.ugc.aweme.notification.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

public final /* synthetic */ class d implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57950a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractiveNotificationHolder f57951b;

    d(InteractiveNotificationHolder interactiveNotificationHolder) {
        this.f57951b = interactiveNotificationHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        if (PatchProxy.isSupport(new Object[]{view, textExtraStruct2}, this, f57950a, false, 63050, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, textExtraStruct2}, this, f57950a, false, 63050, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        this.f57951b.a(textExtraStruct2);
    }
}
