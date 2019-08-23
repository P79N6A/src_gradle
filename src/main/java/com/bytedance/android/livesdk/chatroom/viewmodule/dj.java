package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dj implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13164a;

    /* renamed from: b  reason: collision with root package name */
    private final LuckyBoxWidget f13165b;

    dj(LuckyBoxWidget luckyBoxWidget) {
        this.f13165b = luckyBoxWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13164a, false, 7279, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13164a, false, 7279, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LuckyBoxWidget luckyBoxWidget = this.f13165b;
        luckyBoxWidget.a(luckyBoxWidget.f12670b.c());
    }
}
