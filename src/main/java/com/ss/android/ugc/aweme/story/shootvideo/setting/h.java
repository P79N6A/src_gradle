package com.ss.android.ugc.aweme.story.shootvideo.setting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.port.in.ag;
import com.ss.android.ugc.aweme.port.in.s;

public abstract class h implements s.b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f74139b;

    /* renamed from: a  reason: collision with root package name */
    private int f74140a;

    /* renamed from: c  reason: collision with root package name */
    protected int f74141c;

    /* renamed from: d  reason: collision with root package name */
    protected int f74142d;

    /* renamed from: e  reason: collision with root package name */
    protected Activity f74143e;

    /* renamed from: f  reason: collision with root package name */
    public ag.b f74144f;
    protected s.a g;
    public a h;
    private boolean i;
    private String j;

    public interface a {
        void a(int i);
    }

    public abstract String c();

    public abstract String d();

    public boolean e() {
        return true;
    }

    public abstract String f();

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74139b, false, 86053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74139b, false, 86053, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this.f74143e, (int) C0906R.string.bki).a();
        this.i = false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74139b, false, 86052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74139b, false, 86052, new Class[0], Void.TYPE);
            return;
        }
        this.f74142d = this.f74141c;
        this.f74144f.a(this.f74142d);
        if (e()) {
            com.ss.android.ugc.aweme.port.in.a.o.i().a(Integer.valueOf(this.f74142d));
        } else {
            com.ss.android.ugc.aweme.port.in.a.o.j().a(Integer.valueOf(this.f74142d));
        }
        this.i = false;
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f74139b, false, 86055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74139b, false, 86055, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f74144f.a(), "translationX", new float[]{0.0f, (float) p.b(this.f74143e)});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74149a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f74149a, false, 86060, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f74149a, false, 86060, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                h.this.f74144f.a().setVisibility(8);
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f74139b, false, 86054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74139b, false, 86054, new Class[0], Void.TYPE);
            return;
        }
        this.f74144f.a().setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f74144f.a(), "translationX", new float[]{(float) p.b(this.f74143e), 0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74147a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f74147a, false, 86059, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f74147a, false, 86059, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    public final boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74139b, false, 86050, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74139b, false, 86050, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.i) {
            return false;
        } else {
            this.f74141c = i2;
            int i3 = this.f74141c;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f74139b, false, 86051, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f74139b, false, 86051, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                this.i = true;
                this.g.a(this.j, Integer.valueOf(i3));
            }
            return false;
        }
    }

    public final void a(Activity activity, ViewGroup viewGroup, int i2, int i3) {
        Activity activity2 = activity;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{activity2, viewGroup2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74139b, false, 86049, new Class[]{Activity.class, ViewGroup.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, viewGroup2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74139b, false, 86049, new Class[]{Activity.class, ViewGroup.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f74143e = activity2;
        this.j = c();
        this.f74144f = com.ss.android.ugc.aweme.port.in.a.C.a(activity2);
        this.f74144f.a().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup2.addView(this.f74144f.a());
        this.g = com.ss.android.ugc.aweme.port.in.a.B.c();
        this.g.a((s.b) this);
        this.f74140a = i2;
        this.f74144f.a(e());
        this.f74144f.b(f());
        this.f74144f.a(d());
        if (this.f74140a == 1) {
            this.f74144f.b();
        } else {
            this.f74144f.c();
        }
        this.f74141c = i3;
        this.f74144f.a(this.f74141c);
        this.f74144f.a((ag.a) new ag.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74145a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f74145a, false, 86058, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74145a, false, 86058, new Class[0], Void.TYPE);
                    return;
                }
                h.this.dismiss();
                if (h.this.h != null) {
                    h.this.h.a(h.this.f74142d);
                }
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74145a, false, 86057, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74145a, false, 86057, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                h.this.a(i);
            }
        });
        this.f74144f.a().setOnClickListener(i.f74152b);
    }
}
