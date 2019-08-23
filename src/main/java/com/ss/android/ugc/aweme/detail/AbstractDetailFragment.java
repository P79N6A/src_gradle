package com.ss.android.ugc.aweme.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.detail.a.b;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.aweme.views.l;
import java.util.List;

public abstract class AbstractDetailFragment extends AmeBaseFragment implements ViewPager.OnPageChangeListener, ScrollableLayout.b {
    public static ChangeQuickRedirect q;
    protected static final String r = ("android:switcher:" + C0906R.id.duu + ":");
    public FragmentPagerAdapter A;
    protected int B;
    protected boolean C = true;
    protected List<AbstractBaseDetailFragment.a> D;
    protected List<AmeBaseFragment> E;
    protected List<AbstractBaseDetailFragment.a> F;
    protected String G;
    protected a H;
    protected long I = -1;

    /* renamed from: a  reason: collision with root package name */
    private int f2997a;
    public int s = 1;
    public ScrollableLayout t;
    protected TextView u;
    protected View v;
    protected ViewPager w;
    protected AwemeViewPagerNavigator x;
    ImageView y;
    protected ImageView z;

    public abstract String a(int i);

    public void a(int i, int i2) {
    }

    public void a(int i, boolean z2) {
    }

    public abstract void a(Bundle bundle);

    public void a(View view) {
    }

    public void b(int i, int i2) {
    }

    public void c(int i) {
    }

    public abstract boolean g();

    public boolean isRegisterEventBus() {
        return true;
    }

    public abstract int n();

    public abstract String o();

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    @NonNull
    public abstract String p();

    public final boolean q_() {
        return false;
    }

    public abstract FragmentPagerAdapter s();

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 34631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 34631, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 34632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 34632, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.I = System.currentTimeMillis();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 34633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 34633, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public l r() {
        if (!PatchProxy.isSupport(new Object[0], this, q, false, 34636, new Class[0], l.class)) {
            return new d();
        }
        return (l) PatchProxy.accessDispatch(new Object[0], this, q, false, 34636, new Class[0], l.class);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 34634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 34634, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.I != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.I;
            Context context = getContext();
            String a2 = a(this.B);
            r.a(context, "stay_time", a2, currentTimeMillis, o());
            this.I = -1;
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 34638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 34638, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            RecyclerView recyclerView = null;
            if (this.s == 1 && this.D != null && this.D.get(this.B) != null) {
                recyclerView = (RecyclerView) this.D.get(this.B).f();
            } else if (!(this.F == null || this.F.get(this.B) == null)) {
                recyclerView = (RecyclerView) this.F.get(this.B).f();
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    this.t.a();
                    if (this.s == 1) {
                        this.D.get((this.B + 1) % this.D.size()).a();
                    } else {
                        this.F.get((this.B + 1) % this.F.size()).a();
                    }
                    this.t.setMaxScrollHeight(0);
                    return;
                }
                View childAt = recyclerView.getLayoutManager().getChildAt(childCount - 1);
                int childCount2 = this.t.getChildCount();
                if (childCount2 >= 2 && childAt != null) {
                    int bottom = (childAt.getBottom() + this.t.getChildAt(childCount2 - 1).getTop()) - this.t.getCurScrollY();
                    this.t.setMaxScrollHeight(((bottom + this.t.getCurScrollY()) + UIUtils.getStatusBarHeight(getContext())) - UIUtils.getScreenHeight(getContext()));
                }
            }
        }
    }

    public void q() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 34635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 34635, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null) {
            this.t.setOnScrollListener(this);
        }
        if (this.H != null) {
            this.H.a();
        }
        this.x.setBackgroundColor(getResources().getColor(C0906R.color.a26));
        this.A = s();
        this.w.setAdapter(this.A);
        this.x.a(this.w, r(), (AwemeViewPagerNavigator.a) new AwemeViewPagerNavigator.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41087a;

            public final void a(View view, int i, boolean z) {
            }

            public final void a(View view, int i) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f41087a, false, 34640, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f41087a, false, 34640, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                AbstractDetailFragment.this.c(i);
            }
        });
        this.w.addOnPageChangeListener(this);
        this.w.setCurrentItem(this.B);
        onPageSelected(this.B);
        if (!a.a()) {
            this.x.setVisibility(8);
        } else if (g()) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
    }

    public a a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, q, false, 34626, new Class[]{ViewGroup.class}, a.class)) {
            return new b(getContext(), viewGroup2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, q, false, 34626, new Class[]{ViewGroup.class}, a.class);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, q, false, 34628, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, q, false, 34628, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle2.putInt("cur_pos", this.B);
        super.onSaveInstanceState(bundle);
    }

    public void onPageSelected(int i) {
        int i2;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, q, false, 34637, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, q, false, 34637, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i < 0 || !(this.w == null || this.w.getAdapter() == null || i < this.w.getAdapter().getCount())) {
            i2 = 0;
        } else {
            i2 = i;
        }
        if (!(this.I == -1 || this.B == i2)) {
            long currentTimeMillis = System.currentTimeMillis() - this.I;
            Context context = getContext();
            String a2 = a(this.B);
            r.a(context, "stay_time", a2, currentTimeMillis, o());
            this.I = System.currentTimeMillis();
        }
        if (i2 != this.f2997a) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(i2, z2);
        this.f2997a = i2;
        this.B = i2;
        if (this.w.getCurrentItem() != this.B) {
            this.w.setCurrentItem(this.B);
        }
        if (!(this.t == null || this.t.getHelper() == null)) {
            if (this.s == 1) {
                if (this.D != null) {
                    this.t.getHelper().f40577c = this.D.get(this.B);
                }
            } else if (this.F != null) {
                this.t.getHelper().f40577c = this.F.get(this.B);
            }
        }
        if (this.H != null) {
            this.H.a(i2);
        }
        if (!(this.A == null || this.w == null)) {
            int count = this.A.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                if (this.s == 0) {
                    Fragment item = this.A.getItem(i3);
                    if (!(item == null || item.getFragmentManager() == null)) {
                        if (i3 == i2) {
                            item.setUserVisibleHint(true);
                            a(i2, item.hashCode());
                        } else {
                            item.setUserVisibleHint(false);
                        }
                    }
                } else {
                    Fragment item2 = this.A.getItem(i3);
                    if (!(item2 == null || item2.getFragmentManager() == null)) {
                        if (i3 == i2) {
                            item2.setUserVisibleHint(true);
                            a(i2, item2.hashCode());
                        } else {
                            item2.setUserVisibleHint(false);
                        }
                        ((AbstractBaseDetailFragment.a) item2).g();
                    }
                }
            }
        }
        a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, q, false, 34629, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, q, false, 34629, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view}, this, q, false, 34630, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, q, false, 34630, new Class[]{View.class}, Void.TYPE);
        } else {
            this.t = (ScrollableLayout) view.findViewById(C0906R.id.ck9);
            this.u = (TextView) view.findViewById(C0906R.id.title);
            this.v = view.findViewById(C0906R.id.d3q);
            this.w = (ViewPager) view.findViewById(C0906R.id.duu);
            this.x = (AwemeViewPagerNavigator) view.findViewById(C0906R.id.bq0);
            this.y = (ImageView) view.findViewById(C0906R.id.cp9);
            this.z = (ImageView) view.findViewById(C0906R.id.ix);
        }
        if (this.H == null) {
            this.H = a((ViewGroup) view);
        }
        if (bundle != null) {
            this.B = bundle.getInt("cur_pos", 0);
        }
        q();
    }

    public void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, q, false, 34639, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, q, false, 34639, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        a();
        if (Math.abs(f2) < Math.abs(f3) && this.C) {
            if (f3 > 30.0f) {
                if (this.H != null) {
                    this.H.c();
                }
            } else if (f3 < -30.0f && this.H != null) {
                this.H.b();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, q, false, 34627, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, q, false, 34627, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        a(getArguments());
        View inflate = layoutInflater.inflate(n(), viewGroup2, false);
        a(inflate);
        return inflate;
    }
}
