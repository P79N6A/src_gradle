package com.ss.android.ugc.aweme.shortvideo.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class OnlineMusicFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67798a;

    /* renamed from: b  reason: collision with root package name */
    private OnlineMusicFragment f67799b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f67798a, false, 77347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67798a, false, 77347, new Class[0], Void.TYPE);
            return;
        }
        OnlineMusicFragment onlineMusicFragment = this.f67799b;
        if (onlineMusicFragment != null) {
            this.f67799b = null;
            onlineMusicFragment.mRelativeSearch = null;
            onlineMusicFragment.mLinearGrid = null;
            onlineMusicFragment.mLinearSearch = null;
            onlineMusicFragment.mSearchTextView = null;
            onlineMusicFragment.mCancelSearch = null;
            onlineMusicFragment.mStatusView = null;
            onlineMusicFragment.mSearchEditTextContainer = null;
            onlineMusicFragment.mListViewBackground = null;
            onlineMusicFragment.mSearchEditView = null;
            onlineMusicFragment.mBackView = null;
            onlineMusicFragment.mSkipView = null;
            onlineMusicFragment.mSearchBg = null;
            onlineMusicFragment.mSearchLayout = null;
            onlineMusicFragment.mMainLayout = null;
            onlineMusicFragment.txtClickRecommend = null;
            onlineMusicFragment.llRecommendMusic = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public OnlineMusicFragment_ViewBinding(OnlineMusicFragment onlineMusicFragment, View view) {
        this.f67799b = onlineMusicFragment;
        onlineMusicFragment.mRelativeSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.cgc, "field 'mRelativeSearch'", LinearLayout.class);
        onlineMusicFragment.mLinearGrid = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.bgr, "field 'mLinearGrid'", RelativeLayout.class);
        onlineMusicFragment.mLinearSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bhr, "field 'mLinearSearch'", LinearLayout.class);
        onlineMusicFragment.mSearchTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.di2, "field 'mSearchTextView'", TextView.class);
        onlineMusicFragment.mCancelSearch = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.di4, "field 'mCancelSearch'", TextView.class);
        onlineMusicFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        onlineMusicFragment.mSearchEditTextContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.cge, "field 'mSearchEditTextContainer'", LinearLayout.class);
        onlineMusicFragment.mListViewBackground = Utils.findRequiredView(view, C0906R.id.bgz, "field 'mListViewBackground'");
        onlineMusicFragment.mSearchEditView = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.di1, "field 'mSearchEditView'", EditText.class);
        onlineMusicFragment.mBackView = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBackView'");
        onlineMusicFragment.mSkipView = Utils.findRequiredView(view, C0906R.id.crs, "field 'mSkipView'");
        onlineMusicFragment.mSearchBg = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.cgd, "field 'mSearchBg'", RelativeLayout.class);
        onlineMusicFragment.mSearchLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.z2, "field 'mSearchLayout'", LinearLayout.class);
        onlineMusicFragment.mMainLayout = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.z3, "field 'mMainLayout'", FrameLayout.class);
        onlineMusicFragment.txtClickRecommend = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ta, "field 'txtClickRecommend'", TextView.class);
        onlineMusicFragment.llRecommendMusic = Utils.findRequiredView(view, C0906R.id.cba, "field 'llRecommendMusic'");
    }
}
