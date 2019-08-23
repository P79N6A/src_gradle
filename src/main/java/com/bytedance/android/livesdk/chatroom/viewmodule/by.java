package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class by implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13056a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKStealTowerWidget f13057b;

    by(LinkPKStealTowerWidget linkPKStealTowerWidget) {
        this.f13057b = linkPKStealTowerWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13056a, false, 7122, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13056a, false, 7122, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LinkPKStealTowerWidget linkPKStealTowerWidget = this.f13057b;
        linkPKStealTowerWidget.a((View) linkPKStealTowerWidget.j.f9861c, false);
        linkPKStealTowerWidget.a(linkPKStealTowerWidget.h, false);
        linkPKStealTowerWidget.a(linkPKStealTowerWidget.g, false);
    }
}
