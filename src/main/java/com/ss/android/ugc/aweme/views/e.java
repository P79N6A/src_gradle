package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76460a;

    public static c a(Context context, View.OnClickListener onClickListener) {
        Context context2 = context;
        View.OnClickListener onClickListener2 = onClickListener;
        if (!PatchProxy.isSupport(new Object[]{context2, onClickListener2}, null, f76460a, true, 89448, new Class[]{Context.class, View.OnClickListener.class}, c.class)) {
            return new c.a(context2).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(a.BORDER, C0906R.string.dms, onClickListener2).f20493a;
        }
        return (c) PatchProxy.accessDispatch(new Object[]{context2, onClickListener2}, null, f76460a, true, 89448, new Class[]{Context.class, View.OnClickListener.class}, c.class);
    }
}
