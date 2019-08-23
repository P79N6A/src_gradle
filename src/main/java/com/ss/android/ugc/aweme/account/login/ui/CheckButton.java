package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.h.b;

public class CheckButton extends DmtButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32412a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32413b;

    public final void c() {
        this.f32413b = false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32412a, false, 20540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32412a, false, 20540, new Class[0], Void.TYPE);
            return;
        }
        setBackgroundResource(2130839819);
        b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32412a, false, 20541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32412a, false, 20541, new Class[0], Void.TYPE);
            return;
        }
        this.f32413b = true;
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32414a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f32414a, false, 20542, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32414a, false, 20542, new Class[0], Void.TYPE);
                } else if (CheckButton.this.f32413b) {
                    CheckButton.this.b();
                } else {
                    CheckButton.this.animate().cancel();
                    CheckButton.this.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
                    CheckButton.this.setBackgroundResource(2130838071);
                }
            }
        }).start();
    }

    public CheckButton(Context context) {
        this(context, null);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(2130838071);
        setOnTouchListener(new b(1.2f, 100, null));
    }
}
