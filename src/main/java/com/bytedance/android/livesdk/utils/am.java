package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17585a;

    static class a extends ProgressDialog {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17586a;

        public final void setMessage(CharSequence charSequence) {
        }

        public final void show() {
            if (PatchProxy.isSupport(new Object[0], this, f17586a, false, 13790, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17586a, false, 13790, new Class[0], Void.TYPE);
                return;
            }
            try {
                super.show();
            } catch (Exception unused) {
            }
        }

        public a(Context context) {
            this(context, 0);
        }

        public final void onCreate(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{bundle}, this, f17586a, false, 13789, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle}, this, f17586a, false, 13789, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.onCreate(bundle);
            setContentView(C0906R.layout.aoo);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
                window.clearFlags(2);
            }
        }

        private a(Context context, int i) {
            super(context, 0);
        }
    }

    public static ProgressDialog a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f17585a, true, 13788, new Class[]{Context.class}, ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{context2}, null, f17585a, true, 13788, new Class[]{Context.class}, ProgressDialog.class);
        }
        a aVar = new a(context2);
        if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
            aVar.show();
        }
        return aVar;
    }
}
