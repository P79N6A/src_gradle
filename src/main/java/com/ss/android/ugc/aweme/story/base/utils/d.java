package com.ss.android.ugc.aweme.story.base.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.a.b.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71947a;

    public static void a(Context context, Exception exc) {
        Context context2 = context;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{context2, exc2}, null, f71947a, true, 82300, new Class[]{Context.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, exc2}, null, f71947a, true, 82300, new Class[]{Context.class, Exception.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, exc2, Integer.valueOf(C0906R.string.b6z)}, null, f71947a, true, 82301, new Class[]{Context.class, Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, exc2, Integer.valueOf(C0906R.string.b6z)}, null, f71947a, true, 82301, new Class[]{Context.class, Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (exc2 instanceof a) {
            if (((a) exc2).getErrorCode() != 2155) {
            }
        } else if (context2 != null) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.b6z).a();
        }
    }
}
