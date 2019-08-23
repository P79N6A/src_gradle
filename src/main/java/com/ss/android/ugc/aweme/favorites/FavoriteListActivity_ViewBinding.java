package com.ss.android.ugc.aweme.favorites;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FavoriteListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44191a;

    /* renamed from: b  reason: collision with root package name */
    private FavoriteListActivity f44192b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44191a, false, 39390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44191a, false, 39390, new Class[0], Void.TYPE);
            return;
        }
        FavoriteListActivity favoriteListActivity = this.f44192b;
        if (favoriteListActivity != null) {
            this.f44192b = null;
            favoriteListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FavoriteListActivity_ViewBinding(FavoriteListActivity favoriteListActivity, View view) {
        this.f44192b = favoriteListActivity;
        favoriteListActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
    }
}
