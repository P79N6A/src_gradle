package com.ss.android.ugc.aweme.legoImp.a.a;

import android.content.Context;
import com.bytedance.android.livesdk.feed.b.b;
import com.bytedance.android.livesdkapi.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import org.jetbrains.annotations.NotNull;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53076a;

    @NotNull
    public final e a() {
        return e.IDLE;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f53076a, false, 55201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53076a, false, 55201, new Class[0], Void.TYPE);
            return;
        }
        try {
            h.b();
            h.c();
            b.a();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    public final void a(@NotNull Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f53076a, false, 55202, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f53076a, false, 55202, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (g.b().aA().booleanValue()) {
                return;
            }
        } catch (Exception unused) {
        }
        b();
    }
}
