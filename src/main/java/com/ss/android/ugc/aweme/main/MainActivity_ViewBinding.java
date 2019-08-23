package com.ss.android.ugc.aweme.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;

public class MainActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54172a;

    /* renamed from: b  reason: collision with root package name */
    private MainActivity f54173b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f54172a, false, 57229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54172a, false, 57229, new Class[0], Void.TYPE);
            return;
        }
        MainActivity mainActivity = this.f54173b;
        if (mainActivity != null) {
            this.f54173b = null;
            mainActivity.mViewPager = null;
            mainActivity.mDisLikeAwemeLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MainActivity_ViewBinding(MainActivity mainActivity, View view) {
        this.f54173b = mainActivity;
        mainActivity.mViewPager = (ScrollableViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", ScrollableViewPager.class);
        mainActivity.mDisLikeAwemeLayout = (DisLikeAwemeLayout) Utils.findRequiredViewAsType(view, C0906R.id.a5m, "field 'mDisLikeAwemeLayout'", DisLikeAwemeLayout.class);
    }
}
