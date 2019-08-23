package com.ss.android.ugc.aweme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.aweme.views.l;
import java.util.List;

public abstract class AbstractBaseDetailFragment extends AmeBaseFragment implements ViewPager.OnPageChangeListener, ScrollableLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3292a;

    /* renamed from: b  reason: collision with root package name */
    protected static final String f3293b = ("android:switcher:" + C0906R.id.duu + ":");

    /* renamed from: c  reason: collision with root package name */
    public int f3294c = 1;

    /* renamed from: d  reason: collision with root package name */
    protected ScrollableLayout f3295d;

    /* renamed from: e  reason: collision with root package name */
    protected TextView f3296e;

    /* renamed from: f  reason: collision with root package name */
    protected View f3297f;
    public View g;
    protected View h;
    protected ViewPager i;
    protected AwemeViewPagerNavigator j;
    ImageView k;
    protected ImageView l;
    protected FragmentPagerAdapter m;
    protected boolean n;
    protected boolean o = true;
    protected int p;
    protected boolean q = true;
    protected List<a> r;
    protected List<a> s;
    protected String t;
    protected long u = -1;
    private int v;

    public interface a extends b.a {
        void a();

        void a(String str);

        void a(boolean z);

        boolean c();

        void e();

        View f();

        void g();
    }

    public abstract FragmentPagerAdapter a();

    public abstract void a(Bundle bundle);

    public void b(int i2, int i3) {
    }

    public abstract boolean b();

    public abstract String d();

    public abstract String h();

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageScrolled(int i2, float f2, int i3) {
    }

    public final boolean q_() {
        return false;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45812, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(0);
        this.h.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dl));
        this.g.clearAnimation();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45807, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45808, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.u = System.currentTimeMillis();
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45814, new Class[0], Void.TYPE);
            return;
        }
        if (!this.n && !this.o) {
            this.g.setVisibility(0);
            this.g.startAnimation(j());
            this.o = true;
            this.h.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dl));
        }
    }

    private static AnimationSet j() {
        if (PatchProxy.isSupport(new Object[0], null, f3292a, true, 45815, new Class[0], AnimationSet.class)) {
            return (AnimationSet) PatchProxy.accessDispatch(new Object[0], null, f3292a, true, 45815, new Class[0], AnimationSet.class);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300);
        animationSet.setFillAfter(false);
        return animationSet;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45811, new Class[0], Void.TYPE);
            return;
        }
        this.h.clearAnimation();
        this.h.setVisibility(4);
        this.g.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dj));
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45809, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.u != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.u;
            Context context = getContext();
            String d2 = d();
            r.a(context, "stay_time", d2, currentTimeMillis, h());
            this.u = -1;
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45816, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            RecyclerView recyclerView = null;
            if (this.f3294c == 1 && this.r != null && this.r.get(this.p) != null) {
                recyclerView = (RecyclerView) this.r.get(this.p).f();
            } else if (!(this.s == null || this.s.get(this.p) == null)) {
                recyclerView = (RecyclerView) this.s.get(this.p).f();
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    this.f3295d.a();
                    if (this.f3294c == 1) {
                        this.r.get((this.p + 1) % this.r.size()).a();
                    } else {
                        this.s.get((this.p + 1) % this.s.size()).a();
                    }
                    this.f3295d.setMaxScrollHeight(0);
                    return;
                }
                View childAt = recyclerView.getLayoutManager().getChildAt(childCount - 1);
                int childCount2 = this.f3295d.getChildCount();
                if (childCount2 >= 2 && childAt != null) {
                    int bottom = (childAt.getBottom() + this.f3295d.getChildAt(childCount2 - 1).getTop()) - this.f3295d.getCurScrollY();
                    this.f3295d.setMaxScrollHeight(((bottom + this.f3295d.getCurScrollY()) + UIUtils.getStatusBarHeight(getContext())) - UIUtils.getScreenHeight(getContext()));
                }
            }
        }
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45810, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3295d != null) {
            this.f3295d.setOnScrollListener(this);
        }
        this.h.startAnimation(AnimationUtils.loadAnimation(getContext(), C0906R.anim.dl));
        this.g.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48446a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f48446a, false, 45820, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f48446a, false, 45820, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        AbstractBaseDetailFragment.this.f();
                        break;
                    case 1:
                        AbstractBaseDetailFragment.this.g();
                        break;
                }
                return false;
            }
        });
        this.j.setBackgroundColor(getResources().getColor(C0906R.color.a26));
        this.m = a();
        this.i.setAdapter(this.m);
        this.j.a(this.i, (l) new d(), (AwemeViewPagerNavigator.a) new AwemeViewPagerNavigator.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48448a;

            public final void a(View view, int i) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f48448a, false, 45821, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f48448a, false, 45821, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                }
            }

            public final void a(View view, int i, boolean z) {
            }
        });
        this.i.addOnPageChangeListener(this);
        this.i.setCurrentItem(this.p);
        onPageSelected(this.p);
        if (com.ss.android.g.a.a()) {
            if (b()) {
                this.j.setVisibility(0);
                return;
            }
            this.j.setVisibility(8);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f3292a, false, 45804, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f3292a, false, 45804, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle2.putInt("cur_pos", this.p);
        super.onSaveInstanceState(bundle);
    }

    public void onPageSelected(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3292a, false, 45813, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3292a, false, 45813, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.u == -1 || this.p == i2)) {
            long currentTimeMillis = System.currentTimeMillis() - this.u;
            Context context = getContext();
            String d2 = d();
            r.a(context, "stay_time", d2, currentTimeMillis, h());
            this.u = System.currentTimeMillis();
        }
        this.v = i2;
        this.p = i2;
        if (this.i.getCurrentItem() != this.p) {
            this.i.setCurrentItem(this.p);
        }
        if (!(this.f3295d == null || this.f3295d.getHelper() == null)) {
            if (this.f3294c == 1) {
                if (this.r != null) {
                    this.f3295d.getHelper().f40577c = this.r.get(this.p);
                }
            } else if (this.s != null) {
                this.f3295d.getHelper().f40577c = this.s.get(this.p);
            }
        }
        i();
        if (!(this.m == null || this.i == null)) {
            int count = this.m.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                if (this.f3294c == 0) {
                    Fragment item = this.m.getItem(i3);
                    if (!(item == null || item.getFragmentManager() == null)) {
                        if (i3 == i2) {
                            item.setUserVisibleHint(true);
                            item.hashCode();
                        } else {
                            item.setUserVisibleHint(false);
                        }
                    }
                } else {
                    Fragment item2 = this.m.getItem(i3);
                    if (!(item2 == null || item2.getFragmentManager() == null)) {
                        if (i3 == i2) {
                            item2.setUserVisibleHint(true);
                            item2.hashCode();
                        } else {
                            item2.setUserVisibleHint(false);
                        }
                        ((a) item2).g();
                    }
                }
            }
        }
        k();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3292a, false, 45805, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3292a, false, 45805, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view}, this, f3292a, false, 45806, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3292a, false, 45806, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f3295d = (ScrollableLayout) view.findViewById(C0906R.id.ck9);
            this.f3296e = (TextView) view.findViewById(C0906R.id.title);
            this.f3297f = view.findViewById(C0906R.id.d3q);
            this.g = view.findViewById(C0906R.id.cup);
            this.h = view.findViewById(C0906R.id.cus);
            this.i = (ViewPager) view.findViewById(C0906R.id.duu);
            this.j = (AwemeViewPagerNavigator) view.findViewById(C0906R.id.bq0);
            this.k = (ImageView) view.findViewById(C0906R.id.cp9);
            this.l = (ImageView) view.findViewById(C0906R.id.ix);
        }
        if (bundle != null) {
            this.p = bundle.getInt("cur_pos", 0);
        }
        e();
    }

    public final void a(float f2, float f3) {
        AnimationSet animationSet;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3292a, false, 45817, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3292a, false, 45817, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        k();
        if (Math.abs(f2) < Math.abs(f3) && this.q) {
            if (f3 > 30.0f) {
                if (PatchProxy.isSupport(new Object[0], this, f3292a, false, 45818, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3292a, false, 45818, new Class[0], Void.TYPE);
                } else {
                    if (!this.n && this.o) {
                        this.h.clearAnimation();
                        View view = this.g;
                        if (PatchProxy.isSupport(new Object[0], null, f3292a, true, 45819, new Class[0], AnimationSet.class)) {
                            animationSet = (AnimationSet) PatchProxy.accessDispatch(new Object[0], null, f3292a, true, 45819, new Class[0], AnimationSet.class);
                        } else {
                            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(200);
                            AnimationSet animationSet2 = new AnimationSet(true);
                            animationSet2.addAnimation(translateAnimation);
                            animationSet2.addAnimation(alphaAnimation);
                            animationSet2.setDuration(300);
                            animationSet2.setFillAfter(false);
                            animationSet = animationSet2;
                        }
                        view.startAnimation(animationSet);
                        this.g.setVisibility(8);
                        this.o = false;
                    }
                }
            } else if (f3 < -30.0f) {
                i();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3292a, false, 45803, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3292a, false, 45803, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        a(getArguments());
        return layoutInflater2.inflate(C0906R.layout.qi, viewGroup2, false);
    }
}
