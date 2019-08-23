package com.ss.android.ugc.aweme.setting.ui;

import android.support.annotation.UiThread;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DouYinSettingNewVersionActivity_ViewBinding extends SettingNewVersionActivity_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64148a;

    /* renamed from: c  reason: collision with root package name */
    private DouYinSettingNewVersionActivity f64149c;

    /* renamed from: d  reason: collision with root package name */
    private View f64150d;

    /* renamed from: e  reason: collision with root package name */
    private View f64151e;

    /* renamed from: f  reason: collision with root package name */
    private View f64152f;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64148a, false, 72512, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64148a, false, 72512, new Class[0], Void.TYPE);
            return;
        }
        DouYinSettingNewVersionActivity douYinSettingNewVersionActivity = this.f64149c;
        if (douYinSettingNewVersionActivity != null) {
            this.f64149c = null;
            douYinSettingNewVersionActivity.mSettingContainer = null;
            douYinSettingNewVersionActivity.mWalletItem = null;
            douYinSettingNewVersionActivity.mMicroApp = null;
            douYinSettingNewVersionActivity.mAdStarAtlasItem = null;
            douYinSettingNewVersionActivity.mShoppingGuideItem = null;
            douYinSettingNewVersionActivity.mScrollView = null;
            douYinSettingNewVersionActivity.mThirdServiceDivider = null;
            douYinSettingNewVersionActivity.mVgRocket = null;
            douYinSettingNewVersionActivity.mVgFansPlus = null;
            douYinSettingNewVersionActivity.mVgTouTiao = null;
            douYinSettingNewVersionActivity.mVgAccountDivider = null;
            douYinSettingNewVersionActivity.mLinkAuth = null;
            this.f64150d.setOnClickListener(null);
            this.f64150d = null;
            this.f64151e.setOnClickListener(null);
            this.f64151e = null;
            this.f64152f.setOnClickListener(null);
            this.f64152f = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DouYinSettingNewVersionActivity_ViewBinding(final DouYinSettingNewVersionActivity douYinSettingNewVersionActivity, View view) {
        super(douYinSettingNewVersionActivity, view);
        this.f64149c = douYinSettingNewVersionActivity;
        douYinSettingNewVersionActivity.mSettingContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.a6w, "field 'mSettingContainer'", ViewGroup.class);
        douYinSettingNewVersionActivity.mWalletItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bpm, "field 'mWalletItem'", CommonItemView.class);
        douYinSettingNewVersionActivity.mMicroApp = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bmv, "field 'mMicroApp'", CommonItemView.class);
        douYinSettingNewVersionActivity.mAdStarAtlasItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.d0, "field 'mAdStarAtlasItem'", CommonItemView.class);
        douYinSettingNewVersionActivity.mShoppingGuideItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.cr1, "field 'mShoppingGuideItem'", CommonItemView.class);
        douYinSettingNewVersionActivity.mScrollView = (NestedScrollView) Utils.findRequiredViewAsType(view, C0906R.id.cka, "field 'mScrollView'", NestedScrollView.class);
        douYinSettingNewVersionActivity.mThirdServiceDivider = Utils.findRequiredView(view, C0906R.id.d2l, "field 'mThirdServiceDivider'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.chd, "field 'mVgRocket' and method 'clickRocket'");
        douYinSettingNewVersionActivity.mVgRocket = (ViewGroup) Utils.castView(findRequiredView, C0906R.id.chd, "field 'mVgRocket'", ViewGroup.class);
        this.f64150d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64153a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64153a, false, 72513, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64153a, false, 72513, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                douYinSettingNewVersionActivity.clickRocket();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.acg, "field 'mVgFansPlus' and method 'clickFansPlus'");
        douYinSettingNewVersionActivity.mVgFansPlus = (ViewGroup) Utils.castView(findRequiredView2, C0906R.id.acg, "field 'mVgFansPlus'", ViewGroup.class);
        this.f64151e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64156a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64156a, false, 72514, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64156a, false, 72514, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                douYinSettingNewVersionActivity.clickFansPlus();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.d68, "field 'mVgTouTiao' and method 'clickToutiao'");
        douYinSettingNewVersionActivity.mVgTouTiao = (ViewGroup) Utils.castView(findRequiredView3, C0906R.id.d68, "field 'mVgTouTiao'", ViewGroup.class);
        this.f64152f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64159a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64159a, false, 72515, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64159a, false, 72515, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                douYinSettingNewVersionActivity.clickToutiao();
            }
        });
        douYinSettingNewVersionActivity.mVgAccountDivider = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.w, "field 'mVgAccountDivider'", ViewGroup.class);
        douYinSettingNewVersionActivity.mLinkAuth = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bc6, "field 'mLinkAuth'", CommonItemView.class);
    }
}
