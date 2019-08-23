package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.feiliao.oauth.sdk.a.a.a;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.feiliao.oauth.sdk.flipchat.open.api.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.rocket.d;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;

public class FlipChatInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    private void registerFlipChat() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55261, new Class[0], Void.TYPE);
            return;
        }
        e.a aVar = new e.a();
        Intrinsics.checkParameterIsNotNull("1128", "appId");
        aVar.f24293a = "1128";
        Intrinsics.checkParameterIsNotNull("rkf04d0bf6578806", "clientKey");
        aVar.f24294b = "rkf04d0bf6578806";
        Intrinsics.checkParameterIsNotNull("480", "platformAppId");
        aVar.f24295c = "480";
        Intrinsics.checkParameterIsNotNull("security.snssdk.com", "host");
        aVar.f24296d = "security.snssdk.com";
        d dVar = d.f63651b;
        Intrinsics.checkParameterIsNotNull(dVar, "depend");
        aVar.f24297e = dVar;
        e eVar = new e(aVar, (byte) 0);
        a aVar2 = new a(eVar.f24288b);
        if (!TextUtils.isEmpty(aVar2.f22233a)) {
            com.feiliao.oauth.sdk.a.b.a.f24256a = aVar2;
        }
        FlipChat.INSTANCE.initConfig(eVar);
    }

    @MeasureFunction
    private void registerFusionFuel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55262, new Class[0], Void.TYPE);
            return;
        }
        FusionFuelSdk.init(k.a(), i.a(), com.ss.android.ugc.aweme.rocket.a.f63644b, null, null);
        com.ss.android.ugc.aweme.rocket.e eVar = com.ss.android.ugc.aweme.rocket.e.f3847b;
        if (PatchProxy.isSupport(new Object[0], eVar, com.ss.android.ugc.aweme.rocket.e.f3846a, false, 70882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], eVar, com.ss.android.ugc.aweme.rocket.e.f3846a, false, 70882, new Class[0], Void.TYPE);
        } else if (!c.a().b((Object) eVar)) {
            c.a().a((Object) eVar);
        }
        com.ss.android.ugc.aweme.rocket.k kVar = com.ss.android.ugc.aweme.rocket.k.f3849b;
        if (PatchProxy.isSupport(new Object[0], kVar, com.ss.android.ugc.aweme.rocket.k.f3848a, false, 70903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], kVar, com.ss.android.ugc.aweme.rocket.k.f3848a, false, 70903, new Class[0], Void.TYPE);
            return;
        }
        if (!c.a().b((Object) kVar)) {
            c.a().a((Object) kVar);
        }
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55260, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55260, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("FlipChatInitTask");
        registerFlipChat();
        registerFusionFuel();
    }
}
