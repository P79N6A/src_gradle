package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ec implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13205a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioWidget f13206b;

    ec(RadioWidget radioWidget) {
        this.f13206b = radioWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13205a, false, 7437, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13205a, false, 7437, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RadioWidget radioWidget = this.f13206b;
        radioWidget.f12780f.setVisibility(0);
        radioWidget.f12780f.setOnClickListener(radioWidget);
        radioWidget.l.setOnClickListener(radioWidget);
        radioWidget.g.setVisibility(0);
        radioWidget.g.playAnimation();
    }
}
