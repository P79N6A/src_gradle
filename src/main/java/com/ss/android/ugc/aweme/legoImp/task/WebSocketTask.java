package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.common.wschannel.WsChannelSdk;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.message.d.g;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class WebSocketTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55331, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55331, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("WebSocketTask");
        g a2 = g.g.a();
        k a3 = k.a();
        if (PatchProxy.isSupport(new Object[]{a3}, a2, g.f3576a, false, 58798, new Class[]{Application.class}, Void.TYPE)) {
            g gVar = a2;
            PatchProxy.accessDispatch(new Object[]{a3}, gVar, g.f3576a, false, 58798, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(a3, "context");
        if (a2.f3578b) {
            WsChannelSdk.init(a3, a2.f3581e);
            bg.c(a2);
            return;
        }
        com.ss.android.websocket.b.a.a((Context) a3).a();
    }
}
