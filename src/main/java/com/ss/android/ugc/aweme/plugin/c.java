package com.ss.android.ugc.aweme.plugin;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59263a;

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f59263a, true, 64518, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f59263a, true, 64518, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.story.live.c.a().c()) {
            b.a().a(context2, "start_live", false, null);
        }
    }
}
