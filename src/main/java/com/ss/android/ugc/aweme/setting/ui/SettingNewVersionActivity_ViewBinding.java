package com.ss.android.ugc.aweme.setting.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SettingNewVersionActivity_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f64217b;

    /* renamed from: a  reason: collision with root package name */
    private SettingNewVersionActivity f64218a;

    /* renamed from: c  reason: collision with root package name */
    private View f64219c;

    /* renamed from: d  reason: collision with root package name */
    private View f64220d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64217b, false, 72687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64217b, false, 72687, new Class[0], Void.TYPE);
            return;
        }
        SettingNewVersionActivity settingNewVersionActivity = this.f64218a;
        if (settingNewVersionActivity != null) {
            this.f64218a = null;
            settingNewVersionActivity.statusBar = null;
            settingNewVersionActivity.rootView = null;
            settingNewVersionActivity.mTitleBar = null;
            settingNewVersionActivity.mEditUserProfile = null;
            settingNewVersionActivity.mAccountAndSafetyItem = null;
            settingNewVersionActivity.mNotificationManagerItem = null;
            settingNewVersionActivity.mPrivacyManagerItem = null;
            settingNewVersionActivity.mUnderAgeProtection = null;
            settingNewVersionActivity.mCommonProtocolItem = null;
            settingNewVersionActivity.mStorySetting = null;
            settingNewVersionActivity.mHelperCenter = null;
            settingNewVersionActivity.mFeedbackAndHelpItem = null;
            settingNewVersionActivity.mProtocolItem = null;
            settingNewVersionActivity.mAboutAmeItem = null;
            settingNewVersionActivity.mPrivacyPolicyItem = null;
            settingNewVersionActivity.mCopyRightPolicyItem = null;
            settingNewVersionActivity.mClearCacheItem = null;
            settingNewVersionActivity.mUserInfo = null;
            settingNewVersionActivity.mVersionView = null;
            settingNewVersionActivity.mOpenDebugTest = null;
            settingNewVersionActivity.mLocalLiveWallpaper = null;
            settingNewVersionActivity.mAddAccount = null;
            settingNewVersionActivity.mLogout = null;
            settingNewVersionActivity.mMyWalletItem = null;
            settingNewVersionActivity.mShareProfileItem = null;
            settingNewVersionActivity.mMyQrCode = null;
            settingNewVersionActivity.mCommunityPolicyItem = null;
            settingNewVersionActivity.mGuidanceForParentsItem = null;
            settingNewVersionActivity.mInsights = null;
            settingNewVersionActivity.mMicroApp = null;
            settingNewVersionActivity.mSafetyCenter = null;
            settingNewVersionActivity.mMusInviteFriend = null;
            settingNewVersionActivity.mAccessibility = null;
            settingNewVersionActivity.mCheckUpdate = null;
            settingNewVersionActivity.mJoinTesters = null;
            this.f64219c.setOnClickListener(null);
            this.f64219c = null;
            this.f64220d.setOnClickListener(null);
            this.f64220d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SettingNewVersionActivity_ViewBinding(final SettingNewVersionActivity settingNewVersionActivity, View view) {
        this.f64218a = settingNewVersionActivity;
        settingNewVersionActivity.statusBar = Utils.findRequiredView(view, C0906R.id.cv0, "field 'statusBar'");
        settingNewVersionActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.chu, "field 'rootView'", ViewGroup.class);
        settingNewVersionActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        settingNewVersionActivity.mEditUserProfile = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.a90, "field 'mEditUserProfile'", CommonItemView.class);
        settingNewVersionActivity.mAccountAndSafetyItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.v, "field 'mAccountAndSafetyItem'", CommonItemView.class);
        settingNewVersionActivity.mNotificationManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bt8, "field 'mNotificationManagerItem'", CommonItemView.class);
        settingNewVersionActivity.mPrivacyManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c62, "field 'mPrivacyManagerItem'", CommonItemView.class);
        settingNewVersionActivity.mUnderAgeProtection = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dnw, "field 'mUnderAgeProtection'", CommonItemView.class);
        settingNewVersionActivity.mCommonProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.xu, "field 'mCommonProtocolItem'", CommonItemView.class);
        settingNewVersionActivity.mStorySetting = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.cw6, "field 'mStorySetting'", CommonItemView.class);
        settingNewVersionActivity.mHelperCenter = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.anx, "field 'mHelperCenter'", CommonItemView.class);
        settingNewVersionActivity.mFeedbackAndHelpItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.ad4, "field 'mFeedbackAndHelpItem'", CommonItemView.class);
        settingNewVersionActivity.mProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.d02, "field 'mProtocolItem'", CommonItemView.class);
        settingNewVersionActivity.mAboutAmeItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.t, "field 'mAboutAmeItem'", CommonItemView.class);
        settingNewVersionActivity.mPrivacyPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c6_, "field 'mPrivacyPolicyItem'", CommonItemView.class);
        settingNewVersionActivity.mCopyRightPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.zz, "field 'mCopyRightPolicyItem'", CommonItemView.class);
        settingNewVersionActivity.mClearCacheItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.t6, "field 'mClearCacheItem'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dps, "field 'mUserInfo' and method 'onUserInfoClick'");
        settingNewVersionActivity.mUserInfo = (TextView) Utils.castView(findRequiredView, C0906R.id.dps, "field 'mUserInfo'", TextView.class);
        this.f64219c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64221a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64221a, false, 72688, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64221a, false, 72688, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                settingNewVersionActivity.onUserInfoClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dr7, "field 'mVersionView' and method 'onVersionClick'");
        settingNewVersionActivity.mVersionView = (TextView) Utils.castView(findRequiredView2, C0906R.id.dr7, "field 'mVersionView'", TextView.class);
        this.f64220d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64224a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64224a, false, 72689, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64224a, false, 72689, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                settingNewVersionActivity.onVersionClick(view2);
            }
        });
        settingNewVersionActivity.mOpenDebugTest = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bv3, "field 'mOpenDebugTest'", CommonItemView.class);
        settingNewVersionActivity.mLocalLiveWallpaper = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bjn, "field 'mLocalLiveWallpaper'", CommonItemView.class);
        settingNewVersionActivity.mAddAccount = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dd, "field 'mAddAccount'", CommonItemView.class);
        settingNewVersionActivity.mLogout = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bkm, "field 'mLogout'", CommonItemView.class);
        settingNewVersionActivity.mMyWalletItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bpl, "field 'mMyWalletItem'", CommonItemView.class);
        settingNewVersionActivity.mShareProfileItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.cqc, "field 'mShareProfileItem'", CommonItemView.class);
        settingNewVersionActivity.mMyQrCode = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bpc, "field 'mMyQrCode'", CommonItemView.class);
        settingNewVersionActivity.mCommunityPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.xw, "field 'mCommunityPolicyItem'", CommonItemView.class);
        settingNewVersionActivity.mGuidanceForParentsItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.am9, "field 'mGuidanceForParentsItem'", CommonItemView.class);
        settingNewVersionActivity.mInsights = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.auy, "field 'mInsights'", CommonItemView.class);
        settingNewVersionActivity.mMicroApp = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bmv, "field 'mMicroApp'", CommonItemView.class);
        settingNewVersionActivity.mSafetyCenter = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.cj1, "field 'mSafetyCenter'", CommonItemView.class);
        settingNewVersionActivity.mMusInviteFriend = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.avf, "field 'mMusInviteFriend'", CommonItemView.class);
        settingNewVersionActivity.mAccessibility = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.u, "field 'mAccessibility'", CommonItemView.class);
        settingNewVersionActivity.mCheckUpdate = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.s9, "field 'mCheckUpdate'", CommonItemView.class);
        settingNewVersionActivity.mJoinTesters = (CommonItemView) Utils.findOptionalViewAsType(view, C0906R.id.b70, "field 'mJoinTesters'", CommonItemView.class);
    }
}
