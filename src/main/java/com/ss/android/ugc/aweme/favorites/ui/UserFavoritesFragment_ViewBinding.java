package com.ss.android.ugc.aweme.favorites.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;

public class UserFavoritesFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44356a;

    /* renamed from: b  reason: collision with root package name */
    private UserFavoritesFragment f44357b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44356a, false, 39671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44356a, false, 39671, new Class[0], Void.TYPE);
            return;
        }
        UserFavoritesFragment userFavoritesFragment = this.f44357b;
        if (userFavoritesFragment != null) {
            this.f44357b = null;
            userFavoritesFragment.mTitleBar = null;
            userFavoritesFragment.navigator = null;
            userFavoritesFragment.mViewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UserFavoritesFragment_ViewBinding(UserFavoritesFragment userFavoritesFragment, View view) {
        this.f44357b = userFavoritesFragment;
        userFavoritesFragment.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        userFavoritesFragment.navigator = (AwemeViewPagerNavigator) Utils.findRequiredViewAsType(view, C0906R.id.bq0, "field 'navigator'", AwemeViewPagerNavigator.class);
        userFavoritesFragment.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", ViewPager.class);
    }
}
