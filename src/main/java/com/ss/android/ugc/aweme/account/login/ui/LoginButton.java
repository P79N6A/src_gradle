package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.a.l;
import com.ss.android.ugc.aweme.h.b;

@Deprecated
public class LoginButton extends AutoRTLButton implements l {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f32455b;

    /* renamed from: c  reason: collision with root package name */
    int f32456c;

    /* renamed from: d  reason: collision with root package name */
    boolean f32457d;

    /* renamed from: e  reason: collision with root package name */
    private int f32458e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32455b, false, 20580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32455b, false, 20580, new Class[0], Void.TYPE);
            return;
        }
        setEnabled(true);
        this.f32457d = false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32455b, false, 20577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32455b, false, 20577, new Class[0], Void.TYPE);
            return;
        }
        setBackgroundResource(this.f32458e);
        c();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f32455b, false, 20579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32455b, false, 20579, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f32455b, false, 20578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32455b, false, 20578, new Class[0], Void.TYPE);
            return;
        }
        this.f32457d = true;
        setEnabled(false);
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new j(this)).start();
    }

    public void setLoadingBackground(int i) {
        this.f32458e = i;
    }

    public LoginButton(Context context) {
        this(context, null);
    }

    public void setLoginBackgroundRes(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32455b, false, 20576, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32455b, false, 20576, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f32456c = i;
        setBackgroundResource(this.f32456c);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32456c = 2130838072;
        this.f32458e = 2130839819;
        setBackgroundResource(this.f32456c);
        setOnTouchListener(new b(1.2f, 100, null));
    }
}
