package com.bytedance.android.livesdk.bgbroadcast.game;

import android.os.Build;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.android.livesdk.floatwindow.i;
import com.bytedance.android.livesdk.floatwindow.ui.c;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9229a;

    /* renamed from: b  reason: collision with root package name */
    private final f f9230b;

    g(f fVar) {
        this.f9230b = fVar;
    }

    public final void accept(Object obj) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9229a, false, 3314, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9229a, false, 3314, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        f fVar = this.f9230b;
        if (fVar.f9174d != null && i.a(fVar.f9174d) && (Build.VERSION.SDK_INT < 17 || !fVar.f9174d.isDestroyed())) {
            if (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.a()).intValue() != 1 || fVar.g == null || !fVar.g.isShowing() || !fVar.k) {
                if (h.a("control_view") != null) {
                    h.a("control_view").a();
                    c cVar = (c) h.a("control_view").d();
                    if (cVar != null) {
                        if (((Integer) b.W.a()).intValue() != 1) {
                            z = true;
                        }
                        cVar.setMsgBtn(z);
                    }
                    fVar.j();
                }
                if (h.a("msg_view") != null) {
                    if (((Integer) b.W.a()).intValue() == 1) {
                        h.a("msg_view").b();
                        return;
                    }
                    h.a("msg_view").a();
                }
            } else {
                fVar.k = false;
            }
        }
    }
}
