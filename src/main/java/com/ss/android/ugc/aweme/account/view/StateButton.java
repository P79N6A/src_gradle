package com.ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.R$styleable;
import com.ss.android.ugc.aweme.account.login.a.l;
import com.ss.android.ugc.aweme.account.login.ui.CheckButton;
import com.ss.android.ugc.aweme.h.b;

public class StateButton extends DmtButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33146a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f33147b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static int f33148c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static int f33149d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static int f33150e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static int f33151f = 1;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private Animation j;
    private int k;
    private int l;
    private int m;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33152a;

        public static void a(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, null, f33152a, true, 21489, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, null, f33152a, true, 21489, new Class[]{View.class}, Void.TYPE);
            } else if (view2 instanceof StateButton) {
                ((StateButton) view2).b();
            } else if (view2 instanceof l) {
                ((l) view2).a();
            } else {
                if (view2 instanceof CheckButton) {
                    ((CheckButton) view2).c();
                }
            }
        }

        public static void b(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, null, f33152a, true, 21490, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, null, f33152a, true, 21490, new Class[]{View.class}, Void.TYPE);
            } else if (view2 instanceof StateButton) {
                ((StateButton) view2).a();
            } else if (view2 instanceof l) {
                ((l) view2).b();
            } else {
                if (view2 instanceof CheckButton) {
                    ((CheckButton) view2).a();
                }
            }
        }

        public static void a(View view, boolean z) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f33152a, true, 21488, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, null, f33152a, true, 21488, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            } else if (!(view2 instanceof StateButton)) {
                view.setEnabled(z);
            } else if (z) {
                ((StateButton) view2).a(StateButton.f33148c);
            } else {
                ((StateButton) view2).a(StateButton.f33147b);
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f33146a, false, 21483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33146a, false, 21483, new Class[0], Void.TYPE);
            return;
        }
        a(f33149d);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f33146a, false, 21482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33146a, false, 21482, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.j != null) {
            this.j.cancel();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f33146a, false, 21484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33146a, false, 21484, new Class[0], Void.TYPE);
            return;
        }
        int i2 = f33149d;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f33146a, false, 21486, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f33146a, false, 21486, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.k == i2) {
            if (PatchProxy.isSupport(new Object[0], this, f33146a, false, 21487, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33146a, false, 21487, new Class[0], Void.TYPE);
                return;
            }
            a(this.l);
        }
    }

    public StateButton(Context context) {
        this(context, null);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f33146a, false, 21485, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f33146a, false, 21485, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.k != i2) {
            this.l = this.k;
            this.k = i2;
            if (!(this.k == f33149d || this.l != f33149d || this.j == null)) {
                clearAnimation();
                this.j.cancel();
            }
            if (i2 == f33147b) {
                setBackground(this.g);
            } else if (i2 == f33148c) {
                setBackground(this.h);
            } else if (i2 == f33149d) {
                setBackground(this.i);
                startAnimation(this.j);
            } else {
                this.k = this.l;
            }
        }
    }

    public StateButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StateButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = -1;
        this.l = this.k;
        this.m = f33150e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StateButton);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                a(obtainStyledAttributes.getInt(0, f33147b));
            } else if (index == 1) {
                this.g = obtainStyledAttributes.getDrawable(1);
            } else if (index == 2) {
                this.h = obtainStyledAttributes.getDrawable(2);
            } else if (index == 3) {
                this.i = obtainStyledAttributes.getDrawable(3);
            } else if (index == 4) {
                this.m = obtainStyledAttributes.getInt(4, f33150e);
            }
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.j = rotateAnimation;
        this.j.setRepeatCount(-1);
        this.j.setDuration(800);
        if (this.m == f33151f) {
            setOnTouchListener(new b(1.2f, 100, null));
        }
        if (this.k == -1) {
            a(f33147b);
        }
        obtainStyledAttributes.recycle();
    }
}
