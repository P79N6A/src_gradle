package com.ss.android.ugc.aweme.requesttask.a;

import a.i;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.d;
import org.jetbrains.annotations.NotNull;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63605a;

    @NotNull
    public final com.ss.android.ugc.aweme.lego.e a() {
        return com.ss.android.ugc.aweme.lego.e.IDLE;
    }

    public final void a(@NotNull Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63605a, false, 70836, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f63605a, false, 70836, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        i.a(f.f63607b);
    }
}
