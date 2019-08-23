package com.ss.android.ugc.aweme.base.activity;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TabHost;
import com.bytedance.ies.uikit.base.ITabFragment;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AmeAbsTabActivity extends AmeSSActivity implements TabHost.OnTabChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34480a;

    /* renamed from: b  reason: collision with root package name */
    protected Map<String, WeakReference<View>> f34481b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    protected final FragmentTabHost.OnTabSwitchListener f34482c = new FragmentTabHost.OnTabSwitchListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34483a;

        public final void onTabSwitched(String str, Fragment fragment, Fragment fragment2) {
            Fragment fragment3 = fragment;
            Fragment fragment4 = fragment2;
            if (PatchProxy.isSupport(new Object[]{str, fragment3, fragment4}, this, f34483a, false, 24060, new Class[]{String.class, Fragment.class, Fragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, fragment3, fragment4}, this, f34483a, false, 24060, new Class[]{String.class, Fragment.class, Fragment.class}, Void.TYPE);
                return;
            }
            AmeAbsTabActivity ameAbsTabActivity = AmeAbsTabActivity.this;
            if (PatchProxy.isSupport(new Object[]{str, fragment3, fragment4}, ameAbsTabActivity, AmeAbsTabActivity.f34480a, false, 24059, new Class[]{String.class, Fragment.class, Fragment.class}, Void.TYPE)) {
                AmeAbsTabActivity ameAbsTabActivity2 = ameAbsTabActivity;
                PatchProxy.accessDispatch(new Object[]{str, fragment3, fragment4}, ameAbsTabActivity2, AmeAbsTabActivity.f34480a, false, 24059, new Class[]{String.class, Fragment.class, Fragment.class}, Void.TYPE);
                return;
            }
            if (fragment4 != null && (fragment4 instanceof ITabFragment)) {
                ((ITabFragment) fragment4).onTabUnSelected();
            }
            if (fragment3 != null && (fragment3 instanceof ITabFragment)) {
                ((ITabFragment) fragment3).onTabSelected();
            }
            if (fragment3 != null) {
                fragment3.setUserVisibleHint(true);
            }
            if (fragment4 != null) {
                fragment4.setUserVisibleHint(false);
            }
        }
    };
}
