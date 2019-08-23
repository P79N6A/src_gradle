package com.ss.android.ugc.aweme.survey;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.g.a;
import java.util.Random;

public abstract class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f74516a = a.a();

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f74517b;

    /* renamed from: c  reason: collision with root package name */
    public View f74518c;

    /* renamed from: d  reason: collision with root package name */
    public View f74519d;

    /* renamed from: e  reason: collision with root package name */
    public View f74520e;

    /* renamed from: f  reason: collision with root package name */
    TextView f74521f;
    TextView g;
    public d h;
    public e i;
    Animator j;
    public boolean k;
    boolean l;
    private ViewStub m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private ValueAnimator r;
    private boolean s;

    private void h() {
        this.l = false;
    }

    public abstract int a();

    public final int f() {
        if (this.i != null) {
            return this.i.f74503b;
        }
        return 0;
    }

    public final int g() {
        if (this.i != null) {
            return this.i.j;
        }
        return 0;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74517b, false, 86710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74517b, false, 86710, new Class[0], Void.TYPE);
            return;
        }
        if (this.f74518c != null) {
            this.f74518c.setVisibility(8);
        }
        j();
        this.k = false;
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f74517b, false, 86711, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74517b, false, 86711, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.i == null || TextUtils.isEmpty(this.i.f74504c) || TextUtils.isEmpty(this.i.f74505d) || TextUtils.isEmpty(this.i.f74506e) || TextUtils.isEmpty(this.i.f74507f) || TextUtils.isEmpty(this.i.g) || TextUtils.isEmpty(this.i.h)) {
            return false;
        } else {
            return true;
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f74517b, false, 86714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74517b, false, 86714, new Class[0], Void.TYPE);
        } else if (this.j != null && this.r != null) {
            if (this.j.isStarted() || this.j.isRunning()) {
                this.j.cancel();
            }
            if (this.r.isStarted() || this.r.isRunning()) {
                this.r.cancel();
            }
        }
    }

    @SuppressLint({"LogNotTimber"})
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74517b, false, 86708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74517b, false, 86708, new Class[0], Void.TYPE);
        } else if (this.m != null && i()) {
            if (this.f74518c == null) {
                this.f74518c = this.m.inflate();
                a(this.f74518c);
            }
            h();
            a(this.i);
            if (this.f74518c.getHeight() > 0) {
                c();
            } else {
                v.a(this.f74518c, (ViewTreeObserver.OnGlobalLayoutListener) new j(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"AnimatorRule"})
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74517b, false, 86709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74517b, false, 86709, new Class[0], Void.TYPE);
            return;
        }
        this.f74518c.setTranslationY((float) this.f74518c.getHeight());
        ViewGroup.LayoutParams layoutParams = this.f74520e.getLayoutParams();
        layoutParams.height = this.f74518c.getHeight();
        this.f74520e.setLayoutParams(layoutParams);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f74518c, View.TRANSLATION_Y, new float[]{(float) this.f74518c.getMeasuredHeight(), 0.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74522a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f74522a, false, 86719, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f74522a, false, 86719, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                i.this.k = true;
                if (i.this.h != null) {
                    i.this.h.a(i.this.i);
                }
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f74522a, false, 86718, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f74522a, false, 86718, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                i.this.f74518c.setVisibility(0);
                i.this.f74519d.setVisibility(0);
                i.this.f74519d.setAlpha(1.0f);
                i.this.f74520e.setVisibility(8);
            }
        });
        ofFloat.start();
    }

    @SuppressLint({"AnimatorRule"})
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f74517b, false, 86712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74517b, false, 86712, new Class[0], Void.TYPE);
            return;
        }
        if (this.r == null) {
            this.r = ValueAnimator.ofFloat(new float[]{-1.0f, 0.0f, 1.0f});
            this.r.addUpdateListener(new k(this));
            this.r.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74524a;

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f74524a, false, 86720, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f74524a, false, 86720, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    i.this.f74520e.setAlpha(0.0f);
                    i.this.f74520e.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f74524a, false, 86721, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f74524a, false, 86721, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    i iVar = i.this;
                    if (PatchProxy.isSupport(new Object[0], iVar, i.f74517b, false, 86713, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], iVar, i.f74517b, false, 86713, new Class[0], Void.TYPE);
                        return;
                    }
                    if (!iVar.l) {
                        if (iVar.j == null) {
                            iVar.j = ObjectAnimator.ofFloat(iVar.f74518c, View.TRANSLATION_Y, new float[]{0.0f, (float) iVar.f74518c.getHeight()});
                            iVar.j.setDuration(300);
                            iVar.j.setInterpolator(new DecelerateInterpolator());
                            iVar.j.setStartDelay(2000);
                        }
                        if (!iVar.j.isStarted() && !iVar.j.isRunning()) {
                            iVar.j.start();
                        }
                    }
                }
            });
            this.r.setDuration(600);
        }
        if (!this.r.isStarted() && !this.r.isRunning()) {
            this.r.start();
        }
    }

    i(ViewStub viewStub) {
        this.m = viewStub;
        if (this.m.getLayoutResource() <= 0) {
            this.m.setLayoutResource(a());
        }
    }

    private void a(e eVar) {
        String str;
        String str2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f74517b, false, 86707, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f74517b, false, 86707, new Class[]{e.class}, Void.TYPE);
        } else if (eVar != null) {
            this.n.setText(eVar.f74504c);
            this.o.setText(eVar.f74505d);
            if (new Random().nextInt(2) != 1) {
                z = false;
            }
            this.s = z;
            TextView textView = this.f74521f;
            if (this.s) {
                str = eVar.f74507f;
            } else {
                str = eVar.f74506e;
            }
            textView.setText(str);
            TextView textView2 = this.g;
            if (this.s) {
                str2 = eVar.f74506e;
            } else {
                str2 = eVar.f74507f;
            }
            textView2.setText(str2);
            this.p.setText(eVar.g);
            this.q.setText(eVar.h);
        }
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74517b, false, 86706, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74517b, false, 86706, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f74519d = view.findViewById(C0906R.id.cxl);
        this.n = (TextView) this.f74519d.findViewById(C0906R.id.cxt);
        this.o = (TextView) this.f74519d.findViewById(C0906R.id.cxm);
        this.f74521f = (TextView) this.f74519d.findViewById(C0906R.id.cxk);
        this.g = (TextView) this.f74519d.findViewById(C0906R.id.cxo);
        this.f74520e = view.findViewById(C0906R.id.cxr);
        this.p = (TextView) this.f74520e.findViewById(C0906R.id.cxs);
        this.q = (TextView) this.f74520e.findViewById(C0906R.id.cxq);
        View findViewById = this.f74519d.findViewById(C0906R.id.cxi);
        View findViewById2 = this.f74520e.findViewById(C0906R.id.cxn);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        this.f74521f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        b.a(findViewById, 0.75f);
        b.a(findViewById2, 0.75f);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74517b, false, 86715, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74517b, false, 86715, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.cxi) {
            if (this.h != null) {
                this.h.a(this.i, 3, "");
            }
        } else if (id == C0906R.id.cxk) {
            if (this.h != null) {
                if (this.s) {
                    this.h.a(this.i, 2, this.i.l);
                } else {
                    this.h.a(this.i, 1, this.i.k);
                }
            }
        } else if (id == C0906R.id.cxo) {
            if (this.h != null) {
                if (this.s) {
                    this.h.a(this.i, 1, this.i.k);
                } else {
                    this.h.a(this.i, 2, this.i.l);
                }
            }
        } else if (id == C0906R.id.cxn) {
            this.l = true;
            j();
            if (this.h != null) {
                this.h.a();
            }
        }
    }
}
