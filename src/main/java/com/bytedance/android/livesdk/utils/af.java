package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17573a;

    static class a extends ProgressDialog {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17574a;

        public final void show() {
            if (PatchProxy.isSupport(new Object[0], this, f17574a, false, 13725, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17574a, false, 13725, new Class[0], Void.TYPE);
                return;
            }
            try {
                super.show();
            } catch (Exception unused) {
            }
        }

        a(Context context) {
            super(context);
        }
    }

    public static ProgressDialog a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f17573a, true, 13723, new Class[]{Context.class, String.class}, ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f17573a, true, 13723, new Class[]{Context.class, String.class}, ProgressDialog.class);
        }
        a aVar = new a(context2);
        aVar.setMessage(str2);
        if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
            aVar.show();
        }
        return aVar;
    }

    public static ProgressDialog b(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f17573a, true, 13724, new Class[]{Context.class, String.class}, ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f17573a, true, 13724, new Class[]{Context.class, String.class}, ProgressDialog.class);
        }
        a aVar = new a(context2);
        aVar.setMessage(str2);
        return aVar;
    }
}
