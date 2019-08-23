package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.event.ah;
import com.bytedance.android.livesdk.chatroom.widget.e;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13344a;

    /* renamed from: b  reason: collision with root package name */
    private final DecorationWrapperWidget f13345b;

    /* renamed from: c  reason: collision with root package name */
    private final ah f13346c;

    x(DecorationWrapperWidget decorationWrapperWidget, ah ahVar) {
        this.f13345b = decorationWrapperWidget;
        this.f13346c = ahVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13344a, false, 6765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13344a, false, 6765, new Class[0], Void.TYPE);
            return;
        }
        DecorationWrapperWidget decorationWrapperWidget = this.f13345b;
        decorationWrapperWidget.f12476b[1] = UIUtils.getScreenHeight(decorationWrapperWidget.context) - this.f13346c.f10148a;
        for (e a2 : decorationWrapperWidget.f12477c) {
            a2.a(decorationWrapperWidget.f12476b);
        }
    }
}
