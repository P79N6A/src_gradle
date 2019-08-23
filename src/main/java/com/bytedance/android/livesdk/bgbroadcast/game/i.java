package com.bytedance.android.livesdk.bgbroadcast.game;

import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.floatwindow.g;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.android.livesdk.floatwindow.ui.GameMsgView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements GameMsgView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9233a;

    /* renamed from: b  reason: collision with root package name */
    static final GameMsgView.a f9234b = new i();

    private i() {
    }

    public final void a(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9233a, false, 3316, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9233a, false, 3316, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            g gVar = (g) h.a("msg_view");
            if (gVar != null && gVar.c()) {
                if (PatchProxy.isSupport(new Object[0], gVar, g.f14547a, false, 9080, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], gVar, g.f14547a, false, 9080, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i = gVar.f14548b.b();
                }
                float screenHeight = (float) UIUtils.getScreenHeight(ac.e());
                if (((float) i) > screenHeight - UIUtils.dip2Px(ac.e(), 220.0f)) {
                    gVar.f14548b.b((int) (screenHeight - UIUtils.dip2Px(ac.e(), 220.0f)));
                }
            }
        }
    }
}
