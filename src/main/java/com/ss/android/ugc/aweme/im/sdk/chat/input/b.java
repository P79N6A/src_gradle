package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.au;

public abstract class b extends au.a implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50434a;

    /* renamed from: b  reason: collision with root package name */
    public View f50435b;

    /* renamed from: c  reason: collision with root package name */
    public IInputView f50436c;

    public void a(boolean z) {
    }

    public void b() {
    }

    @LayoutRes
    public abstract int d();

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public View a() {
        return this.f50435b;
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50434a, false, 50522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50434a, false, 50522, new Class[0], Void.TYPE);
            return;
        }
        this.f50435b.addOnAttachStateChangeListener(this);
    }

    public b(Context context, IInputView iInputView) {
        this.f50436c = iInputView;
        if (PatchProxy.isSupport(new Object[]{context}, this, f50434a, false, 50521, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f50434a, false, 50521, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f50435b == null) {
            this.f50435b = View.inflate(context, d(), null);
        }
        b();
        c();
    }
}
