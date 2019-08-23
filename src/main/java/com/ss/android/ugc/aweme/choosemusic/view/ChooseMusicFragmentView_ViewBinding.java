package com.ss.android.ugc.aweme.choosemusic.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ChooseMusicFragmentView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36027a;

    /* renamed from: b  reason: collision with root package name */
    private ChooseMusicFragmentView f36028b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36027a, false, 26846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36027a, false, 26846, new Class[0], Void.TYPE);
            return;
        }
        ChooseMusicFragmentView chooseMusicFragmentView = this.f36028b;
        if (chooseMusicFragmentView != null) {
            this.f36028b = null;
            chooseMusicFragmentView.mRelativeSearch = null;
            chooseMusicFragmentView.mLinearSearch = null;
            chooseMusicFragmentView.mSearchTextView = null;
            chooseMusicFragmentView.mCancelSearch = null;
            chooseMusicFragmentView.mSearchEditTextContainer = null;
            chooseMusicFragmentView.mSearchEditView = null;
            chooseMusicFragmentView.mBackView = null;
            chooseMusicFragmentView.mSkipView = null;
            chooseMusicFragmentView.mSearchLayout = null;
            chooseMusicFragmentView.mMainLayout = null;
            chooseMusicFragmentView.txtClickRecommend = null;
            chooseMusicFragmentView.mClearView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ChooseMusicFragmentView_ViewBinding(ChooseMusicFragmentView chooseMusicFragmentView, View view) {
        this.f36028b = chooseMusicFragmentView;
        chooseMusicFragmentView.mRelativeSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.cgc, "field 'mRelativeSearch'", LinearLayout.class);
        chooseMusicFragmentView.mLinearSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bhr, "field 'mLinearSearch'", LinearLayout.class);
        chooseMusicFragmentView.mSearchTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.di2, "field 'mSearchTextView'", TextView.class);
        chooseMusicFragmentView.mCancelSearch = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.di4, "field 'mCancelSearch'", TextView.class);
        chooseMusicFragmentView.mSearchEditTextContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.cge, "field 'mSearchEditTextContainer'", LinearLayout.class);
        chooseMusicFragmentView.mSearchEditView = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.di1, "field 'mSearchEditView'", EditText.class);
        chooseMusicFragmentView.mBackView = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBackView'");
        chooseMusicFragmentView.mSkipView = Utils.findRequiredView(view, C0906R.id.crs, "field 'mSkipView'");
        chooseMusicFragmentView.mSearchLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.z2, "field 'mSearchLayout'", LinearLayout.class);
        chooseMusicFragmentView.mMainLayout = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.z3, "field 'mMainLayout'", FrameLayout.class);
        chooseMusicFragmentView.txtClickRecommend = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ta, "field 'txtClickRecommend'", TextView.class);
        chooseMusicFragmentView.mClearView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.azu, "field 'mClearView'", ImageView.class);
    }
}
