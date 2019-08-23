package com.ss.android.ugc.aweme.discover.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BaseDiscoveryAndSearchFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42790a;

    /* renamed from: b  reason: collision with root package name */
    private BaseDiscoveryAndSearchFragment f42791b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f42790a, false, 37394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42790a, false, 37394, new Class[0], Void.TYPE);
            return;
        }
        BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment = this.f42791b;
        if (baseDiscoveryAndSearchFragment != null) {
            this.f42791b = null;
            baseDiscoveryAndSearchFragment.mGapStatusBar = null;
            baseDiscoveryAndSearchFragment.mSearchInputView = null;
            baseDiscoveryAndSearchFragment.mBtnClear = null;
            baseDiscoveryAndSearchFragment.mTvSearch = null;
            baseDiscoveryAndSearchFragment.mBackView = null;
            baseDiscoveryAndSearchFragment.mBottomContainer = null;
            baseDiscoveryAndSearchFragment.mIntermediateView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseDiscoveryAndSearchFragment_ViewBinding(BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment, View view) {
        this.f42791b = baseDiscoveryAndSearchFragment;
        baseDiscoveryAndSearchFragment.mGapStatusBar = Utils.findRequiredView(view, C0906R.id.aj3, "field 'mGapStatusBar'");
        baseDiscoveryAndSearchFragment.mSearchInputView = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.aai, "field 'mSearchInputView'", EditText.class);
        baseDiscoveryAndSearchFragment.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C0906R.id.ns, "field 'mBtnClear'", ImageButton.class);
        baseDiscoveryAndSearchFragment.mTvSearch = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.di9, "field 'mTvSearch'", TextView.class);
        baseDiscoveryAndSearchFragment.mBackView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.j0, "field 'mBackView'", ImageView.class);
        baseDiscoveryAndSearchFragment.mBottomContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.aic, "field 'mBottomContainer'", FrameLayout.class);
        baseDiscoveryAndSearchFragment.mIntermediateView = (SearchIntermediateView) Utils.findRequiredViewAsType(view, C0906R.id.clf, "field 'mIntermediateView'", SearchIntermediateView.class);
    }
}
