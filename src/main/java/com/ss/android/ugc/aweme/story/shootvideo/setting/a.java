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
import com.ss.android.ugc.aweme.port.in.s;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.setting.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74107a;

    /* renamed from: b  reason: collision with root package name */
    protected s.a f74108b;

    /* renamed from: c  reason: collision with root package name */
    protected s.a f74109c;

    /* renamed from: d  reason: collision with root package name */
    public int f74110d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f74111e = 0;

    /* renamed from: f  reason: collision with root package name */
    public Activity f74112f;
    public e g;
    public boolean h = false;
    public boolean i = false;
    public e.a j;
    public h k;
    public h l;
    public int m = 1;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.setting.a$a  reason: collision with other inner class name */
    class C0770a implements s.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74120a;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f74120a, false, 86030, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74120a, false, 86030, new Class[0], Void.TYPE);
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f74112f, (int) C0906R.string.bki).a();
            a.this.i = false;
        }

        public final void a() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f74120a, false, 86029, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74120a, false, 86029, new Class[0], Void.TYPE);
                return;
            }
            e eVar = a.this.g;
            if (PatchProxy.isSupport(new Object[0], eVar, e.f74130a, false, 86041, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar, e.f74130a, false, 86041, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                boolean z2 = !eVar.f74132c.c();
                eVar.f74132c.setChecked(z2);
                z = z2;
            }
            com.ss.android.ugc.aweme.port.in.a.o.l().a(Boolean.valueOf(z));
            a.this.i = false;
            if (z) {
                com.ss.android.ugc.aweme.port.in.a.o.n().a(Boolean.TRUE);
            }
        }

        C0770a() {
        }
    }

    class b implements s.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74122a;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f74122a, false, 86032, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74122a, false, 86032, new Class[0], Void.TYPE);
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f74112f, (int) C0906R.string.bki).a();
            a.this.h = false;
        }

        public final void a() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f74122a, false, 86031, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74122a, false, 86031, new Class[0], Void.TYPE);
                return;
            }
            e eVar = a.this.g;
            if (PatchProxy.isSupport(new Object[0], eVar, e.f74130a, false, 86040, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar, e.f74130a, false, 86040, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                boolean z2 = !eVar.f74131b.c();
                eVar.f74131b.setChecked(z2);
                z = z2;
            }
            com.ss.android.ugc.aweme.port.in.a.o.k().a(Boolean.valueOf(z));
            a.this.h = false;
        }

        b() {
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74107a, false, 86015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74107a, false, 86015, new Class[0], Void.TYPE);
            return;
        }
        this.f74108b = com.ss.android.ugc.aweme.port.in.a.B.c();
        this.f74108b.a((s.b) new C0770a());
        this.f74109c = com.ss.android.ugc.aweme.port.in.a.B.c();
        this.f74109c.a((s.b) new b());
        this.f74111e = ((Integer) com.ss.android.ugc.aweme.port.in.a.o.j().a()).intValue();
        this.f74110d = ((Integer) com.ss.android.ugc.aweme.port.in.a.o.i().a()).intValue();
        this.g.a(this.f74110d, this.f74111e);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74107a, false, 86013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74107a, false, 86013, new Class[0], Void.TYPE);
            return;
        }
        this.h = true;
        if (this.g.getSyncDuoshanStatus()) {
            this.f74109c.a("sync_duoshan", 0);
            return;
        }
        this.f74109c.a("sync_duoshan", 1);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74107a, false, 86014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74107a, false, 86014, new Class[0], Void.TYPE);
            return;
        }
        this.i = true;
        if (this.g.getDoudouPhotoStatus()) {
            this.f74108b.a("shake_camera", 1);
            return;
        }
        this.f74108b.a("shake_camera", 0);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f74107a, false, 86021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74107a, false, 86021, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, "translationX", new float[]{0.0f, (float) fc.b(this.f74112f)});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74118a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f74118a, false, 86028, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f74118a, false, 86028, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.g.setVisibility(8);
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74107a, false, 86017, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74107a, false, 86017, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.setBlackTheme(z);
        this.m = 2;
        this.g.setBackgroundColor(this.f74112f.getResources().getColor(C0906R.color.p9));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74107a, false, 86016, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74107a, false, 86016, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.setWhiteTheme(z);
        this.m = 1;
        this.g.setBackground(com.ss.android.ugc.bytex.a.a.a.a(this.f74112f.getResources(), 2130838333));
    }

    public final void a(Activity activity, final ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{activity, viewGroup}, this, f74107a, false, 86011, new Class[]{Activity.class, ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, viewGroup}, this, f74107a, false, 86011, new Class[]{Activity.class, ViewGroup.class}, Void.TYPE);
            return;
        }
        this.f74112f = activity;
        this.g = new e(activity);
        this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(this.g);
        this.g.setStorySettingViewCallback(new e.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74113a;

            public final void a(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74113a, false, 86024, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74113a, false, 86024, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (a.this.j != null) {
                    a.this.j.a(z);
                }
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74113a, false, 86023, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74113a, false, 86023, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 3) {
                    if (!a.this.h) {
                        a.this.a();
                    }
                } else if (i == 5) {
                    if (!a.this.i) {
                        a.this.b();
                    }
                } else if (i == 2) {
                    a.this.k = new g();
                    a.this.k.a(a.this.f74112f, viewGroup, a.this.m, a.this.f74111e);
                    a.this.k.h = new c(this);
                    a.this.k.g();
                } else if (i == 1) {
                    a.this.l = new l();
                    a.this.l.a(a.this.f74112f, viewGroup, a.this.m, a.this.f74110d);
                    a.this.l.h = new d(this);
                    a.this.l.g();
                }
                if (a.this.j != null) {
                    a.this.j.a(i);
                }
            }
        });
        this.g.setOnClickListener(b.f74125b);
        c();
    }
}
