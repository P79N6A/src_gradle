package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.c.h;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import org.jetbrains.annotations.NotNull;

public class WXPayInitTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55329, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55329, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("WXPayInitTask");
        if (PatchProxy.isSupport(new Object[0], null, h.f36793a, true, 28306, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, h.f36793a, true, 28306, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (h.f36794c != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            h hVar = new h("wx76fdd06dde311af3");
            if (PatchProxy.isSupport(new Object[]{hVar}, null, h.f36793a, true, 28305, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, null, h.f36793a, true, 28305, new Class[]{h.class}, Void.TYPE);
                return;
            }
            h.a aVar = h.f36795d;
            if (PatchProxy.isSupport(new Object[]{hVar}, aVar, h.a.f36797a, false, 28307, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, aVar, h.a.f36797a, false, 28307, new Class[]{h.class}, Void.TYPE);
            } else if (h.f36794c == null) {
                h.f36794c = hVar;
            } else {
                throw new IllegalStateException("WalletSDKContext has already exists");
            }
        }
    }
}
