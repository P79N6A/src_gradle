package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.StringRes;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52591a;

    public static void a(Context context, @StringRes int i, @StringRes int i2, @StringRes int i3, Runnable runnable) {
        Context context2 = context;
        final Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(C0906R.string.apk), Integer.valueOf(i3), runnable2}, null, f52591a, true, 53365, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Runnable.class}, Void.TYPE)) {
            Object[] objArr = {context2, Integer.valueOf(i), Integer.valueOf(C0906R.string.apk), Integer.valueOf(i3), runnable2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52591a, true, 53365, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Runnable.class}, Void.TYPE);
            return;
        }
        AnonymousClass1 r2 = new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52592a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52592a, false, 53369, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52592a, false, 53369, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                } else if (i == -2 || i != -1 || runnable2 == null) {
                    dialogInterface.dismiss();
                } else {
                    dialogInterface.dismiss();
                    runnable2.run();
                }
            }
        };
        new AlertDialog.Builder(context2, C0906R.style.q9).setMessage(i).setNegativeButton((int) C0906R.string.apk, (DialogInterface.OnClickListener) r2).setPositiveButton(i3, (DialogInterface.OnClickListener) r2).create().show();
    }

    public static AlertDialog a(Context context, String str, String str2, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        DialogInterface.OnClickListener onClickListener3 = onClickListener;
        DialogInterface.OnClickListener onClickListener4 = onClickListener2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, Integer.valueOf(i), onClickListener3, Integer.valueOf(i2), onClickListener4}, null, f52591a, true, 53368, new Class[]{Context.class, String.class, String.class, Integer.TYPE, DialogInterface.OnClickListener.class, Integer.TYPE, DialogInterface.OnClickListener.class}, AlertDialog.class)) {
            return (AlertDialog) PatchProxy.accessDispatch(new Object[]{context2, str3, str4, Integer.valueOf(i), onClickListener3, Integer.valueOf(i2), onClickListener4}, null, f52591a, true, 53368, new Class[]{Context.class, String.class, String.class, Integer.TYPE, DialogInterface.OnClickListener.class, Integer.TYPE, DialogInterface.OnClickListener.class}, AlertDialog.class);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context2, C0906R.style.q9);
        builder.setTitle((CharSequence) str3).setMessage((CharSequence) str4).setNegativeButton(i, onClickListener3).setPositiveButton(i2, onClickListener4);
        AlertDialog create = builder.create();
        try {
            create.show();
            create.getButton(-1).setTextColor(context.getResources().getColor(C0906R.color.a1z));
        } catch (Exception unused) {
        }
        return create;
    }
}
