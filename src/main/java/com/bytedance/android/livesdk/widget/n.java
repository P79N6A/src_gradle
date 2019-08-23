package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.StringRes;
import com.bytedance.android.livesdk.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18525a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile n f18526b;

    public interface a {
        a b(int i, @StringRes int i2, DialogInterface.OnClickListener onClickListener);

        Dialog c();

        a c(@StringRes int i);

        a c(CharSequence charSequence);

        a d(@StringRes int i);
    }

    public static n a() {
        if (PatchProxy.isSupport(new Object[0], null, f18525a, true, 14447, new Class[0], n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[0], null, f18525a, true, 14447, new Class[0], n.class);
        }
        if (f18526b == null) {
            synchronized (n.class) {
                if (f18526b == null) {
                    f18526b = new n();
                }
            }
        }
        return f18526b;
    }

    public final a a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f18525a, false, 14448, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2}, this, f18525a, false, 14448, new Class[]{Context.class}, a.class);
        } else if (com.bytedance.android.live.uikit.a.a.b()) {
            return new u(context2);
        } else {
            return new m.a(context2);
        }
    }
}
