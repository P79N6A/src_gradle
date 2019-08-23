package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.hotsearch.d.a;
import com.ss.android.ugc.aweme.utils.di;
import java.util.Map;

public final class HotBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42555a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f42556b;

    /* renamed from: c  reason: collision with root package name */
    DmtTextView f42557c;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f42558d;

    /* renamed from: e  reason: collision with root package name */
    Fragment f42559e;

    /* renamed from: f  reason: collision with root package name */
    String f42560f;
    public boolean g;
    public boolean h;
    public boolean i;
    private int j;

    class HotBarScrollListener extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42564a;

        HotBarScrollListener() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f42564a, false, 36804, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f42564a, false, 36804, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && HotBar.this.a()) {
                View view = null;
                if (HotBar.this.f42558d.getLayoutManager() != null) {
                    view = HotBar.this.f42558d.getLayoutManager().findViewByPosition(0);
                }
                if (view != null && view.getTop() <= 0 && view.getTop() >= (-u.a(52.0d))) {
                    HotBar.this.h = false;
                    v.a((View) HotBar.this.f42556b, 8);
                }
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            boolean z;
            ObjectAnimator objectAnimator;
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42564a, false, 36805, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42564a, false, 36805, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (i2 != 0 && HotBar.this.a()) {
                View view = null;
                if (HotBar.this.f42558d.getLayoutManager() != null) {
                    view = HotBar.this.f42558d.getLayoutManager().findViewByPosition(0);
                }
                if (view != null) {
                    if (view.getTop() >= 0) {
                        v.a((View) HotBar.this.f42556b, 8);
                        return;
                    } else if (view.getTop() > (-u.a(52.0d)) && !HotBar.this.h) {
                        HotBar.this.i = false;
                        HotBar.this.h = false;
                        v.a((View) HotBar.this.f42556b, 0);
                        if (HotBar.this.f42556b != null) {
                            HotBar.this.f42556b.setY((float) (-(u.a(52.0d) - view.getTop())));
                        }
                        return;
                    } else if (view.getTop() <= (-u.a(52.0d)) && !HotBar.this.i) {
                        HotBar.this.i = true;
                        v.a((View) HotBar.this.f42556b, 8);
                    }
                } else if (!HotBar.this.i) {
                    HotBar.this.i = true;
                    v.a((View) HotBar.this.f42556b, 8);
                }
                HotBar hotBar = HotBar.this;
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, hotBar, HotBar.f42555a, false, 36798, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    HotBar hotBar2 = hotBar;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, hotBar2, HotBar.f42555a, false, 36798, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else if (!hotBar.g && hotBar.f42556b != null && ((!z || hotBar.f42556b.getVisibility() != 8) && (z || hotBar.f42556b.getVisibility() != 0))) {
                    hotBar.h = !z;
                    if (z) {
                        objectAnimator = ObjectAnimator.ofFloat(hotBar.f42556b, "translationY", new float[]{0.0f, (float) (-u.a(52.0d))});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(hotBar.f42556b, "translationY", new float[]{(float) (-u.a(52.0d)), 0.0f});
                    }
                    objectAnimator.addListener(new AnimatorListenerAdapter(z) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f42561a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ boolean f42562b;

                        public final void onAnimationCancel(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f42561a, false, 36803, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f42561a, false, 36803, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            HotBar.this.g = false;
                            if (this.f42562b) {
                                v.a((View) HotBar.this.f42556b, 8);
                            }
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f42561a, false, 36802, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f42561a, false, 36802, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            HotBar.this.g = false;
                            if (this.f42562b) {
                                v.a((View) HotBar.this.f42556b, 8);
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f42561a, false, 36801, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f42561a, false, 36801, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            HotBar.this.g = true;
                            if (!this.f42562b) {
                                v.a((View) HotBar.this.f42556b, 0);
                                HotBar.this.a(true);
                            }
                        }

                        {
                            this.f42562b = r2;
                        }
                    });
                    objectAnimator.start();
                }
            }
        }
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f42555a, false, 36796, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42555a, false, 36796, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.a(this.f42560f) > 0) {
            z = true;
        }
        return z;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42555a, false, 36797, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42555a, false, 36797, new Class[0], Void.TYPE);
        } else if (!a()) {
            v.a((View) this.f42556b, 8);
            di.b(this.f42558d);
        } else {
            this.j = a.a(this.f42560f);
            this.f42557c.setText(this.f42559e.getString(C0906R.string.ds_, Integer.valueOf(this.j)));
            a(true);
            this.f42556b.setOnClickListener(new a(this));
            this.f42558d.addOnScrollListener(new HotBarScrollListener());
        }
    }

    public final void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42555a, false, 36799, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42555a, false, 36799, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        r.a("hot_search_icon", (Map) a2.a("action_type", str).a("search_keyword", this.f42560f).a("enter_from", "general_search").f34114b);
    }

    public HotBar(Fragment fragment, FrameLayout frameLayout, DmtTextView dmtTextView, RecyclerView recyclerView, String str) {
        this.f42559e = fragment;
        this.f42556b = frameLayout;
        this.f42557c = dmtTextView;
        this.f42558d = recyclerView;
        this.f42560f = str;
    }

    public final void a(Fragment fragment, FrameLayout frameLayout, DmtTextView dmtTextView, RecyclerView recyclerView, String str) {
        this.f42559e = fragment;
        this.f42556b = frameLayout;
        this.f42557c = dmtTextView;
        this.f42558d = recyclerView;
        this.f42560f = str;
    }
}
