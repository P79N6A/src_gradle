package com.bytedance.android.livesdk.bgbroadcast.game;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.floatwindow.g;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class GameUiStrategy$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9191a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f9192b;

    GameUiStrategy$1(f fVar) {
        this.f9192b = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f9191a, false, 3319, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f9191a, false, 3319, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) {
            g gVar = (g) h.a("control_view");
            g gVar2 = (g) h.a("msg_view");
            int screenWidth = UIUtils.getScreenWidth(context);
            int screenHeight = UIUtils.getScreenHeight(context);
            if (gVar != null && gVar.c()) {
                gVar.f14548b.a(0);
                gVar.f14548b.b((int) (((float) screenHeight) * 0.5f));
            }
            if (gVar2 != null && gVar2.c()) {
                gVar2.f14548b.a((int) (((float) screenWidth) * 0.1f));
                gVar2.f14548b.b((int) (((float) screenHeight) * 0.1f));
            }
        }
    }
}
