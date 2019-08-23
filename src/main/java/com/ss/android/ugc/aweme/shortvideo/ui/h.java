package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.widget.LinearLayout;
import com.google.common.a.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.util.KeyBoardMonitor;

public final class h implements KeyBoardMonitor.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70894a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f70895b;

    /* renamed from: c  reason: collision with root package name */
    private ColorDrawable f70896c;

    /* renamed from: d  reason: collision with root package name */
    private ColorDrawable f70897d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70894a, false, 80223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70894a, false, 80223, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (this.f70897d == null) {
                this.f70897d = new ColorDrawable(this.f70895b.getContext().getResources().getColor(C0906R.color.a25, null));
            }
            if (this.f70895b.getForeground() != this.f70897d) {
                this.f70895b.setForeground(this.f70897d);
                this.f70895b.getForeground().setAlpha(150);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f70894a, false, 80224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70894a, false, 80224, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (this.f70896c == null) {
                this.f70896c = new ColorDrawable(this.f70895b.getContext().getResources().getColor(C0906R.color.ano, null));
            }
            if (this.f70895b.getForeground() != this.f70896c) {
                this.f70895b.setForeground(this.f70896c);
            }
        }
    }

    public h(@NonNull LinearLayout linearLayout) {
        this.f70895b = (LinearLayout) m.a(linearLayout);
    }
}
