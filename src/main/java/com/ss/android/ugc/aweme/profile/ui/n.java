package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;

@Deprecated
public final class n extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62960a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f62961b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f62962c;

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f62960a, false, 67955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62960a, false, 67955, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, o.f62963a, true, 67959, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, o.f62963a, true, 67959, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62960a, false, 67954, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62960a, false, 67954, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.ix);
        findViewById(C0906R.id.dfp).setOnClickListener(this.f62962c);
        this.f62961b = (TextView) findViewById(C0906R.id.da0);
    }
}
