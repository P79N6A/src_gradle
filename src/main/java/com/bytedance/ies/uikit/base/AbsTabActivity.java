package com.bytedance.ies.uikit.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbsTabActivity extends AbsActivity {
    protected Map<String, WeakReference<View>> mIndicatorMap = new HashMap();
    protected LayoutInflater mInflater;
    protected String mPendingTag;
    protected FragmentTabHost mTabHost;
    protected final FragmentTabHost.OnTabSwitchListener mTabListener = new FragmentTabHost.OnTabSwitchListener() {
        public void onTabSwitched(String str, Fragment fragment, Fragment fragment2) {
            AbsTabActivity.this.handleTabSwitch(str, fragment, fragment2);
        }
    };
    protected TabWidget mTabWidget;

    public static class TabEntry {
        public final Bundle args;
        public final Class<? extends Fragment> clz;
        public final int icon;
        public final String tag;
        public final int title;

        public TabEntry(String str, int i, int i2, Class<? extends Fragment> cls, Bundle bundle) {
            this.tag = str;
            this.title = i;
            this.icon = i2;
            this.clz = cls;
            this.args = bundle;
        }
    }

    public String getCurrentTabTag() {
        return this.mTabHost.getCurrentTabTag();
    }

    /* access modifiers changed from: protected */
    public Fragment getCurrentFragment() {
        if (this.mTabHost != null) {
            return this.mTabHost.getCurrentFragment();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public View getIndicatorView(String str) {
        WeakReference weakReference = this.mIndicatorMap.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* access modifiers changed from: protected */
    public void initTab(Bundle bundle, List<TabEntry> list) {
        this.mInflater = LayoutInflater.from(this);
        this.mTabHost = (FragmentTabHost) findViewById(16908306);
        this.mTabHost.setHideWhenTabChanged(true);
        this.mTabHost.setOnTabSwitchListener(this.mTabListener);
        this.mTabHost.setup(this, getSupportFragmentManager(), C0906R.id.can);
        this.mTabWidget = (TabWidget) findViewById(16908307);
        for (TabEntry next : list) {
            TabHost.TabSpec newTabSpec = this.mTabHost.newTabSpec(next.tag);
            View makeIndicator = makeIndicator(next.tag, next.title, next.icon);
            newTabSpec.setIndicator(makeIndicator);
            this.mTabHost.addTab(newTabSpec, next.clz, next.args);
            this.mIndicatorMap.put(next.tag, new WeakReference(makeIndicator));
        }
        this.mPendingTag = null;
    }

    /* access modifiers changed from: protected */
    public void handleTabSwitch(String str, Fragment fragment, Fragment fragment2) {
        if (fragment2 != null && (fragment2 instanceof ITabFragment)) {
            ((ITabFragment) fragment2).onTabUnSelected();
        }
        if (fragment != null && (fragment instanceof ITabFragment)) {
            ((ITabFragment) fragment).onTabSelected();
        }
    }

    /* access modifiers changed from: protected */
    public View makeIndicator(String str, int i, int i2) {
        String string = getString(i);
        View inflate = this.mInflater.inflate(C0906R.layout.adt, this.mTabWidget, false);
        ((TextView) inflate.findViewById(C0906R.id.aua)).setText(string);
        ((ImageView) inflate.findViewById(C0906R.id.au7)).setImageResource(i2);
        return inflate;
    }
}
