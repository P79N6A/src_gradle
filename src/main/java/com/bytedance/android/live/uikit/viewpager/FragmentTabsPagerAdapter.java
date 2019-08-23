package com.bytedance.android.live.uikit.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import java.util.ArrayList;

public class FragmentTabsPagerAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8720a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8721b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8722c;

    /* renamed from: d  reason: collision with root package name */
    private final TabHost f8723d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewPager f8724e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<a> f8725f;
    private final TabHost.OnTabChangeListener g;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f8726a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f8727b;

        /* renamed from: c  reason: collision with root package name */
        Fragment f8728c;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f8720a, false, SearchBaseFragment.s, new Class[0], Integer.TYPE)) {
            return this.f8725f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8720a, false, SearchBaseFragment.s, new Class[0], Integer.TYPE)).intValue();
    }

    public Fragment getItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8720a, false, 2485, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8720a, false, 2485, new Class[]{Integer.TYPE}, Fragment.class);
        }
        a aVar = this.f8725f.get(i);
        return Fragment.instantiate(this.f8722c, aVar.f8726a.getName(), aVar.f8727b);
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8720a, false, 2487, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8720a, false, 2487, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TabWidget tabWidget = this.f8723d.getTabWidget();
        int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        this.f8723d.setCurrentTab(i);
        tabWidget.setDescendantFocusability(descendantFocusability);
    }

    public void onTabChanged(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f8720a, false, 2486, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f8720a, false, 2486, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f8724e.setCurrentItem(this.f8723d.getCurrentTab(), this.f8721b);
        if (this.g != null) {
            this.g.onTabChanged(str);
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8720a, false, 2484, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8720a, false, 2484, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        if (instantiateItem != null && (instantiateItem instanceof Fragment) && i >= 0 && i < this.f8725f.size()) {
            this.f8725f.get(i).f8728c = (Fragment) instantiateItem;
        }
        return instantiateItem;
    }
}
