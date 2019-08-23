package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.widget.PKProgressBar;
import com.bytedance.android.livesdkapi.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cb implements c.C0083c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13063a;

    /* renamed from: b  reason: collision with root package name */
    static final c.C0083c f13064b = new cb();

    private cb() {
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13063a, false, 7149, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13063a, false, 7149, new Class[]{View.class}, Void.TYPE);
            return;
        }
        PKProgressBar pKProgressBar = (PKProgressBar) view;
        pKProgressBar.setLayerType(1, null);
        pKProgressBar.setIsVigo(a.f18616d);
    }
}
