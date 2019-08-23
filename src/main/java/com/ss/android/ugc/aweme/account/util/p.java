package com.ss.android.ugc.aweme.account.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33107a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33108a;
    }

    public static AlertDialog.Builder a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f33107a, true, 21410, new Class[]{Context.class}, AlertDialog.Builder.class)) {
            return new AlertDialog.Builder(context2);
        }
        return (AlertDialog.Builder) PatchProxy.accessDispatch(new Object[]{context2}, null, f33107a, true, 21410, new Class[]{Context.class}, AlertDialog.Builder.class);
    }

    public static ProgressDialog b(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f33107a, true, 21412, new Class[]{Context.class}, ProgressDialog.class)) {
            return a(context2, false);
        }
        return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{context2}, null, f33107a, true, 21412, new Class[]{Context.class}, ProgressDialog.class);
    }

    private static ProgressDialog a(Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, (byte) 0}, null, f33107a, true, 21411, new Class[]{Context.class, Boolean.TYPE}, ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{context2, (byte) 0}, null, f33107a, true, 21411, new Class[]{Context.class, Boolean.TYPE}, ProgressDialog.class);
        } else if (Build.VERSION.SDK_INT < 11) {
            return new ProgressDialog(context2);
        } else {
            if (!PatchProxy.isSupport(new Object[]{context2, (byte) 0}, null, a.f33108a, true, 21413, new Class[]{Context.class, Boolean.TYPE}, ProgressDialog.class)) {
                return new ProgressDialog(context2, 3);
            }
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{context2, (byte) 0}, null, a.f33108a, true, 21413, new Class[]{Context.class, Boolean.TYPE}, ProgressDialog.class);
        }
    }
}
