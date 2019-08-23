package com.bytedance.ies.uikit.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabsPagerAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {
    private final Context mContext;
    private final TabHost.OnTabChangeListener mListener;
    private boolean mSmooth = true;
    private final TabHost mTabHost;
    private final ArrayList<TabInfo> mTabs = new ArrayList<>();
    private final ViewPager mViewPager;

    static class DummyTabFactory implements TabHost.TabContentFactory {
        private final Context mContext;

        public DummyTabFactory(Context context) {
            this.mContext = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.mContext);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static final class TabInfo {
        public final Bundle args;
        public final Class<?> clss;
        Fragment mFragment;
        final String tag;

        TabInfo(String str, Class<?> cls, Bundle bundle) {
            this.tag = str;
            this.clss = cls;
            this.args = bundle;
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    public int getCount() {
        return this.mTabs.size();
    }

    public void setSmoothEabled(boolean z) {
        this.mSmooth = z;
    }

    public Fragment getFragment(int i) {
        if (i < 0 || i >= this.mTabs.size()) {
            return null;
        }
        return this.mTabs.get(i).mFragment;
    }

    public Fragment getItem(int i) {
        TabInfo tabInfo = this.mTabs.get(i);
        return Fragment.instantiate(this.mContext, tabInfo.clss.getName(), tabInfo.args);
    }

    public void onPageSelected(int i) {
        TabWidget tabWidget = this.mTabHost.getTabWidget();
        int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        this.mTabHost.setCurrentTab(i);
        tabWidget.setDescendantFocusability(descendantFocusability);
    }

    public void onTabChanged(String str) {
        this.mViewPager.setCurrentItem(this.mTabHost.getCurrentTab(), this.mSmooth);
        if (this.mListener != null) {
            this.mListener.onTabChanged(str);
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        if (instantiateItem != null && (instantiateItem instanceof Fragment) && i >= 0 && i < this.mTabs.size()) {
            this.mTabs.get(i).mFragment = (Fragment) instantiateItem;
        }
        return instantiateItem;
    }

    public void addTab(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        addTab(tabSpec, cls, bundle, true);
    }

    public void addTab(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle, boolean z) {
        tabSpec.setContent(new DummyTabFactory(this.mContext));
        this.mTabs.add(new TabInfo(tabSpec.getTag(), cls, bundle));
        this.mTabHost.addTab(tabSpec);
        if (z) {
            notifyDataSetChanged();
        }
    }

    public FragmentTabsPagerAdapter(FragmentActivity fragmentActivity, FragmentManager fragmentManager, TabHost tabHost, ViewPager viewPager, TabHost.OnTabChangeListener onTabChangeListener) {
        super(fragmentManager);
        this.mContext = fragmentActivity;
        this.mTabHost = tabHost;
        this.mViewPager = viewPager;
        this.mTabHost.setOnTabChangedListener(this);
        this.mViewPager.setAdapter(this);
        this.mViewPager.setOnPageChangeListener(this);
        this.mListener = onTabChangeListener;
    }
}
