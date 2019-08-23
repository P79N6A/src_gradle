package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75587a;

    private static void c(Dialog dialog) {
        if (PatchProxy.isSupport(new Object[]{dialog}, null, f75587a, true, 88217, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, f75587a, true, 88217, new Class[]{Dialog.class}, Void.TYPE);
            return;
        }
        try {
            bd.a(dialog);
        } catch (IllegalArgumentException unused) {
        } catch (Exception unused2) {
        }
    }

    public static void a(Dialog dialog) {
        if (PatchProxy.isSupport(new Object[]{dialog}, null, f75587a, true, 88215, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, f75587a, true, 88215, new Class[]{Dialog.class}, Void.TYPE);
        } else if (dialog != null) {
            Context context = dialog.getContext();
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && !dialog.isShowing()) {
                try {
                    dialog.show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r1.isDestroyed() == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        if (((android.app.Activity) r1).isFinishing() == false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(@android.support.annotation.Nullable android.app.Dialog r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f75587a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.app.Dialog> r3 = android.app.Dialog.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 88216(0x15898, float:1.23617E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75587a
            r13 = 1
            r14 = 88216(0x15898, float:1.23617E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.app.Dialog> r0 = android.app.Dialog.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            if (r17 == 0) goto L_0x0068
            boolean r1 = r17.isShowing()
            if (r1 == 0) goto L_0x0068
            android.content.Context r1 = r17.getContext()
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0065
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x005d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L_0x0068
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L_0x0068
            goto L_0x0065
        L_0x005d:
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x0068
        L_0x0065:
            c(r17)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.bc.b(android.app.Dialog):void");
    }

    @Deprecated
    public static AlertDialog a(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener, int i3, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, C0906R.style.q9);
        builder.setMessage(i).setNegativeButton((int) C0906R.string.pm, onClickListener).setPositiveButton(i3, onClickListener2);
        AlertDialog create = builder.create();
        try {
            create.show();
        } catch (Exception unused) {
        }
        return create;
    }

    public static AlertDialog a(Context context, String str, String str2, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        DialogInterface.OnClickListener onClickListener3 = onClickListener;
        DialogInterface.OnClickListener onClickListener4 = onClickListener2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, Integer.valueOf(C0906R.string.pm), onClickListener3, Integer.valueOf(i2), onClickListener4}, null, f75587a, true, 88214, new Class[]{Context.class, String.class, String.class, Integer.TYPE, DialogInterface.OnClickListener.class, Integer.TYPE, DialogInterface.OnClickListener.class}, AlertDialog.class)) {
            return (AlertDialog) PatchProxy.accessDispatch(new Object[]{context2, str3, str4, Integer.valueOf(C0906R.string.pm), onClickListener3, Integer.valueOf(i2), onClickListener4}, null, f75587a, true, 88214, new Class[]{Context.class, String.class, String.class, Integer.TYPE, DialogInterface.OnClickListener.class, Integer.TYPE, DialogInterface.OnClickListener.class}, AlertDialog.class);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context2, C0906R.style.q9);
        builder.setTitle((CharSequence) str3).setMessage((CharSequence) str4).setNegativeButton((int) C0906R.string.pm, onClickListener3).setPositiveButton(i2, onClickListener4);
        AlertDialog create = builder.create();
        try {
            create.show();
        } catch (Exception unused) {
        }
        return create;
    }
}
