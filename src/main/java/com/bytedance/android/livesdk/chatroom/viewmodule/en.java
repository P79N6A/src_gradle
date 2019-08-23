package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget;
import com.bytedance.android.livesdk.j.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class en implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13230a;

    /* renamed from: b  reason: collision with root package name */
    private final TextMessageWidget f13231b;

    en(TextMessageWidget textMessageWidget) {
        this.f13231b = textMessageWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13230a, false, 7498, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13230a, false, 7498, new Class[]{View.class}, Void.TYPE);
            return;
        }
        TextMessageWidget textMessageWidget = this.f13231b;
        if (textMessageWidget.isViewValid()) {
            f.a(textMessageWidget.context);
            textMessageWidget.a(TextMessageWidget.a.NORMAL);
        }
    }
}
