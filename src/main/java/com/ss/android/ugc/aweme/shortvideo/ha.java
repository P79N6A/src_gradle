package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.s.f;

public final class ha {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68044a;

    public static boolean a(Context context) {
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f68044a, true, 74807, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f68044a, true, 74807, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (f.a(context) == 0) {
            i = 7;
        } else {
            i = 8;
        }
        boolean a2 = fc.a(context2, i);
        if (a.b()) {
            if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.AddTextInMusically) || a2) {
                return false;
            }
            return true;
        } else if (!a2) {
            return true;
        } else {
            return false;
        }
    }
}
