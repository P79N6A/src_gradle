package com.bytedance.ies.dmt.ui.input;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;
import com.bytedance.ies.dmt.ui.e.b;

public abstract class b extends b.a implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    protected View f20358a;

    /* renamed from: b  reason: collision with root package name */
    public IInputView f20359b;

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    @LayoutRes
    public abstract int d();

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public View a() {
        return this.f20358a;
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f20358a.addOnAttachStateChangeListener(this);
    }

    public b(Context context, IInputView iInputView) {
        this.f20359b = iInputView;
        if (this.f20358a == null) {
            this.f20358a = View.inflate(context, d(), null);
        }
        b();
        c();
    }
}
