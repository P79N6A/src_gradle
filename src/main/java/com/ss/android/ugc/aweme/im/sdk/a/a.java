package com.ss.android.ugc.aweme.im.sdk.a;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.im.sdk.f.b;
import com.ss.android.ugc.aweme.im.sdk.f.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50078a;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f50078a, true, 50118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f50078a, true, 50118, new Class[0], Void.TYPE);
            return;
        }
        new b().a();
        h.a().a(com.ss.android.ugc.aweme.framework.core.a.b().a(), j.a("aweme://bind/mobile/").a("ENTER_REASON", "chat").a());
    }

    public static void a(Context context, String str, String str2, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, Integer.valueOf(C0906R.string.aql), onClickListener, Integer.valueOf(C0906R.string.apb), onClickListener2}, null, f50078a, true, 50119, new Class[]{Context.class, String.class, String.class, Integer.TYPE, DialogInterface.OnClickListener.class, Integer.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, Integer.valueOf(C0906R.string.aql), onClickListener, Integer.valueOf(C0906R.string.apb), onClickListener2}, null, f50078a, true, 50119, new Class[]{Context.class, String.class, String.class, Integer.TYPE, DialogInterface.OnClickListener.class, Integer.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        new c().a();
        com.ss.android.ugc.aweme.im.sdk.utils.h.a(context, str, str2, C0906R.string.aql, onClickListener, C0906R.string.apb, onClickListener2);
    }
}
