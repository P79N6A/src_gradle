package com.bytedance.android.live.uikit.toast;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8696a;
    private int A;
    private boolean B;

    /* renamed from: b  reason: collision with root package name */
    public Context f8697b;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f8698c;

    /* renamed from: d  reason: collision with root package name */
    public View f8699d;

    /* renamed from: e  reason: collision with root package name */
    AnimatorSet f8700e;

    /* renamed from: f  reason: collision with root package name */
    public long f8701f = 2500;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public AnimatorSet m;
    public AnimatorSet n;
    int o;
    private int p = 49;
    private int[] q;
    private TextView r;
    private AnimatorSet s;
    private ImageView t;
    private boolean u;
    private WindowManager v;
    private WindowManager.LayoutParams w;
    private View x;
    private boolean y;
    private int z;

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.f8697b == null || this.g) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f8696a, false, 2417, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8696a, false, 2417, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f8699d != null && this.f8699d.isShown()) {
            z2 = true;
        }
        return z2;
    }

    public final AnimatorSet a() {
        if (PatchProxy.isSupport(new Object[0], this, f8696a, false, 2416, new Class[0], AnimatorSet.class)) {
            return (AnimatorSet) PatchProxy.accessDispatch(new Object[0], this, f8696a, false, 2416, new Class[0], AnimatorSet.class);
        }
        if (this.s == null) {
            this.s = new AnimatorSet();
            this.s.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f8698c, "translationY", new float[]{0.0f, (float) (-this.o)}), ObjectAnimator.ofFloat(this.f8698c, "alpha", new float[]{1.0f, 0.0f})});
            this.s.setInterpolator(new AccelerateDecelerateInterpolator());
            this.s.setDuration(320);
        }
        return this.s;
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f8696a, false, 2418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8696a, false, 2418, new Class[0], Void.TYPE);
        } else if (this.u) {
            if (!(this.f8698c == null || this.f8698c.getParent() == null)) {
                this.v.removeView(this.f8698c);
                this.f8698c.removeView(this.f8699d);
            }
            this.u = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f8696a, false, 2421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8696a, false, 2421, new Class[0], Void.TYPE);
        } else if (!d()) {
            if (this.r != null && !StringUtils.isEmpty(this.h)) {
                this.r.setText(this.h);
            }
            this.u = true;
            this.f8698c.removeAllViews();
            if (this.f8699d.getParent() == null) {
                this.f8698c.addView(this.f8699d);
            } else {
                ((ViewGroup) this.f8699d.getParent()).removeView(this.f8699d);
                this.f8698c.addView(this.f8699d);
            }
            if (this.w == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 262280, -2);
                layoutParams.flags = 262280;
                layoutParams.gravity = this.p;
                if (layoutParams.gravity == 48) {
                    layoutParams.y = this.q[0];
                }
                this.w = layoutParams;
            }
            this.v = (WindowManager) this.f8697b.getSystemService("window");
            if (this.f8698c.getParent() != null) {
                this.v.removeView(this.f8698c);
            }
            try {
                this.v.addView(this.f8698c, this.w);
            } catch (Exception unused) {
            }
        }
    }

    public final a a(boolean z2) {
        this.y = false;
        return this;
    }

    public final a b(boolean z2) {
        this.j = true;
        return this;
    }

    public final a a(int i2) {
        this.p = 48;
        return this;
    }

    public final a a(long j2) {
        this.f8701f = 5000;
        return this;
    }

    public a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context, null}, this, f8696a, false, 2408, new Class[]{Context.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, null}, this, f8696a, false, 2408, new Class[]{Context.class, View.class}, Void.TYPE);
            return;
        }
        this.f8697b = context;
        this.q = new int[4];
        if (!d()) {
            this.f8698c = new FrameLayout(this.f8697b);
            this.o = (int) context.getResources().getDimension(C0906R.dimen.m8);
            this.f8698c.setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8702a;

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f8702a, false, 2422, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f8702a, false, 2422, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    switch (motionEvent.getAction()) {
                        case 0:
                            a.this.k = motionEvent.getY();
                            a.this.a(a.this.m, 1.0f, 0.98f);
                            break;
                        case 1:
                            a.this.a(a.this.n, 0.98f, 1.0f);
                            if (a.this.j && a.this.l - a.this.k < 0.0f && Math.abs(a.this.l - a.this.k) > 20.0f) {
                                b.a().a(a.this);
                                break;
                            }
                        case 2:
                            a.this.l = motionEvent.getY();
                            break;
                        case 3:
                            a.this.a(a.this.n, 0.98f, 1.0f);
                            break;
                    }
                    return false;
                }
            });
        }
    }

    private View b(int i2) {
        int i3;
        View view;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8696a, false, 2410, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8696a, false, 2410, new Class[]{Integer.TYPE}, View.class);
        }
        LayoutInflater from = LayoutInflater.from(this.f8697b);
        if (i2 == this.z) {
            return this.x;
        }
        if (i2 != -1) {
            i3 = i2;
        } else if (this.A > 0) {
            i3 = this.A;
        } else if (this.y) {
            i3 = C0906R.layout.a__;
        } else {
            i3 = C0906R.layout.a_9;
        }
        try {
            view = from.inflate(i3, this.f8698c, false);
            this.x = view;
            this.z = i3;
        } catch (InflateException unused) {
            if (this.x == null) {
                this.x = from.inflate(C0906R.layout.a_9, this.f8698c, false);
            }
            this.z = C0906R.layout.a_9;
            view = this.x;
        }
        return view;
    }

    public final void a(@LayoutRes int i2, d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.layout.ahq), dVar2}, this, f8696a, false, 2414, new Class[]{Integer.TYPE, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.layout.ahq), dVar2}, this, f8696a, false, 2414, new Class[]{Integer.TYPE, d.class}, Void.TYPE);
            return;
        }
        this.f8699d = b((int) C0906R.layout.ahq);
        dVar2.a(this.f8699d);
        if (PatchProxy.isSupport(new Object[]{"", -1}, this, f8696a, false, 2411, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{"", -1}, this, f8696a, false, 2411, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (!d()) {
            this.h = "";
            if (this.f8699d != null) {
                this.r = (TextView) this.f8699d.findViewById(C0906R.id.text);
                this.t = (ImageView) this.f8699d.findViewById(C0906R.id.aq8);
            }
            if (this.t != null) {
                this.t.setVisibility(8);
            }
            this.f8699d.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        }
        b a2 = b.a();
        if (PatchProxy.isSupport(new Object[]{this}, a2, b.f8704a, false, 2427, new Class[]{a.class}, Void.TYPE)) {
            b bVar = a2;
            PatchProxy.accessDispatch(new Object[]{this}, bVar, b.f8704a, false, 2427, new Class[]{a.class}, Void.TYPE);
        } else if (!a2.f8706b.contains(this) && a2.f8706b.size() <= a2.f8708d) {
            a2.f8706b.offer(this);
            if (!a2.f8707c) {
                a2.b();
            }
        }
    }

    public final void a(AnimatorSet animatorSet, float f2, float f3) {
        AnimatorSet animatorSet2;
        if (PatchProxy.isSupport(new Object[]{animatorSet, Float.valueOf(f2), Float.valueOf(f3)}, this, f8696a, false, 2409, new Class[]{AnimatorSet.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatorSet, Float.valueOf(f2), Float.valueOf(f3)}, this, f8696a, false, 2409, new Class[]{AnimatorSet.class, Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.B) {
            if (animatorSet != null || this.f8699d == null) {
                animatorSet2 = animatorSet;
            } else {
                animatorSet2 = new AnimatorSet();
                animatorSet2.play(ObjectAnimator.ofFloat(this.f8698c, "scaleX", new float[]{f2, f3})).with(ObjectAnimator.ofFloat(this.f8698c, "scaleY", new float[]{f2, f3}));
                animatorSet2.setDuration(80);
            }
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }
}
