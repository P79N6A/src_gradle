package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ad.splash.utils.k;
import com.ss.android.ugc.aweme.C0906R;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    FrameLayout f27763a;

    /* renamed from: b  reason: collision with root package name */
    TextView f27764b;

    /* renamed from: c  reason: collision with root package name */
    TextView f27765c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f27766d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f27767e;

    /* renamed from: f  reason: collision with root package name */
    SSRenderSurfaceView f27768f;
    View g;
    int h;
    int i;
    View j;
    Context k;
    public boolean l;
    public a m;
    FrameLayout n;
    TextView o;
    Space p;
    TextView q;
    TextView r;
    public boolean s;
    private View.OnTouchListener t = new View.OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                e eVar = e.this;
                if (eVar.d()) {
                    eVar.m.a(motionEvent);
                }
            }
            return true;
        }
    };

    interface a {
        void a();

        void a(int i, int i2, int i3);

        void a(MotionEvent motionEvent);

        void a(SurfaceHolder surfaceHolder);

        void b();
    }

    public final void c() {
        this.g.setVisibility(8);
    }

    public final boolean d() {
        if (this.m != null) {
            return true;
        }
        return false;
    }

    public final FrameLayout.LayoutParams a() {
        if (this.j.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) this.j.getLayoutParams();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) k.a(this.k, 14.0f), (int) k.a(this.k, 9.0f), 0);
        this.f27764b.setLayoutParams(layoutParams);
    }

    public final void e() {
        b(8);
        this.f27765c.setVisibility(4);
        this.f27763a.setVisibility(8);
        this.f27764b.setVisibility(8);
        this.f27766d.setVisibility(8);
        this.f27767e.setVisibility(4);
        if (this.s) {
            this.n.setVisibility(8);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
        }
    }

    public final void b(int i2) {
        k.a(this.j, i2);
    }

    public final void a(int i2) {
        this.j.setVisibility(0);
        if (this.f27768f != null) {
            this.f27768f.setVisibility(i2);
        }
    }

    public final void b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f27768f.getHolder()) {
            this.l = false;
            if (d()) {
                this.m.a();
            }
        }
    }

    public final void a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f27768f.getHolder()) {
            this.l = true;
            if (d()) {
                this.m.a(surfaceHolder);
            }
        }
    }

    e(Context context, View view) {
        b(8);
        this.k = context;
        if (view != null) {
            this.f27765c = (TextView) view.findViewById(C0906R.id.cx);
            this.f27763a = (FrameLayout) view.findViewById(C0906R.id.cw);
            this.f27764b = (TextView) view.findViewById(C0906R.id.cv);
            if (com.ss.android.ad.splash.core.e.k() != 0) {
                this.f27764b.setText(com.ss.android.ad.splash.core.e.k());
            } else {
                this.f27764b.setText(C0906R.string.c__);
            }
            this.f27767e = (ImageView) view.findViewById(C0906R.id.cz);
            this.f27766d = (ImageView) view.findViewById(C0906R.id.cy);
            if (com.ss.android.ad.splash.core.e.o() != 0) {
                this.f27766d.setImageResource(com.ss.android.ad.splash.core.e.o());
            }
            this.o = (TextView) view.findViewById(C0906R.id.bb);
            this.n = (FrameLayout) view.findViewById(C0906R.id.ba);
            this.p = (Space) view.findViewById(C0906R.id.b_);
            this.q = (TextView) view.findViewById(C0906R.id.bd);
            this.r = (TextView) view.findViewById(C0906R.id.bc);
            if (com.ss.android.ad.splash.core.e.m() != 0) {
                this.f27765c.setText(com.ss.android.ad.splash.core.e.m());
            } else {
                this.f27765c.setText(C0906R.string.c9v);
            }
            if (com.ss.android.ad.splash.core.e.n() != 0) {
                this.f27767e.setImageResource(com.ss.android.ad.splash.core.e.n());
            } else {
                this.f27767e.setImageResource(2130840554);
            }
            if (com.ss.android.ad.splash.core.e.l() != 0) {
                this.f27765c.setBackgroundResource(com.ss.android.ad.splash.core.e.l());
                this.o.setBackgroundResource(com.ss.android.ad.splash.core.e.l());
            }
            this.f27768f = (SSRenderSurfaceView) view.findViewById(C0906R.id.dsy);
            this.f27768f.a(this);
            this.g = view.findViewById(C0906R.id.dsc);
            this.f27763a.setWillNotDraw(false);
            this.n.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (e.this.d()) {
                        e.this.m.b();
                    }
                }
            });
            this.f27765c.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    view.setVisibility(4);
                    e.this.f27767e.setVisibility(0);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(800);
                    rotateAnimation.setRepeatCount(10);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    e.this.f27767e.startAnimation(rotateAnimation);
                    if (e.this.d()) {
                        e.this.m.b();
                    }
                }
            });
        }
        this.j = view;
        if (this.j != null) {
            this.j.setOnTouchListener(this.t);
        }
    }

    public final void a(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (surfaceHolder == this.f27768f.getHolder() && d()) {
            this.m.a(i2, i3, i4);
        }
    }
}
