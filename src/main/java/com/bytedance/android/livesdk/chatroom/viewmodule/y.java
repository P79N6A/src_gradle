package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13347a;

    /* renamed from: b  reason: collision with root package name */
    private final DecorationWrapperWidget f13348b;

    /* renamed from: c  reason: collision with root package name */
    private final List f13349c;

    y(DecorationWrapperWidget decorationWrapperWidget, List list) {
        this.f13348b = decorationWrapperWidget;
        this.f13349c = list;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13347a, false, 6766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13347a, false, 6766, new Class[0], Void.TYPE);
            return;
        }
        DecorationWrapperWidget decorationWrapperWidget = this.f13348b;
        for (c cVar : this.f13349c) {
            decorationWrapperWidget.a(cVar);
            decorationWrapperWidget.c(cVar);
        }
        decorationWrapperWidget.g();
    }
}
