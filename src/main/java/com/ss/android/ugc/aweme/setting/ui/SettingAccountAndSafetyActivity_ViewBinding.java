package com.ss.android.ugc.aweme.setting.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SettingAccountAndSafetyActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64195a;

    /* renamed from: b  reason: collision with root package name */
    private SettingAccountAndSafetyActivity f64196b;

    /* renamed from: c  reason: collision with root package name */
    private View f64197c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64195a, false, 72627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64195a, false, 72627, new Class[0], Void.TYPE);
            return;
        }
        SettingAccountAndSafetyActivity settingAccountAndSafetyActivity = this.f64196b;
        if (settingAccountAndSafetyActivity != null) {
            this.f64196b = null;
            settingAccountAndSafetyActivity.mTitle = null;
            settingAccountAndSafetyActivity.mAwemeIdText = null;
            settingAccountAndSafetyActivity.mQrCodeItem = null;
            settingAccountAndSafetyActivity.mBindPhoneItem = null;
            settingAccountAndSafetyActivity.mBindThirdAccountItem = null;
            settingAccountAndSafetyActivity.mSaveLoginInfoItem = null;
            settingAccountAndSafetyActivity.mAwmePwdItem = null;
            settingAccountAndSafetyActivity.mCertificationItem = null;
            settingAccountAndSafetyActivity.mDeviceManagerItem = null;
            settingAccountAndSafetyActivity.mPoiMerchantEntranceItem = null;
            settingAccountAndSafetyActivity.mPersonalAuthItem = null;
            settingAccountAndSafetyActivity.mSafetyCenterItem = null;
            settingAccountAndSafetyActivity.mPoiDivider = null;
            this.f64197c.setOnClickListener(null);
            this.f64197c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SettingAccountAndSafetyActivity_ViewBinding(final SettingAccountAndSafetyActivity settingAccountAndSafetyActivity, View view) {
        this.f64196b = settingAccountAndSafetyActivity;
        settingAccountAndSafetyActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        settingAccountAndSafetyActivity.mAwemeIdText = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.ik, "field 'mAwemeIdText'", CommonItemView.class);
        settingAccountAndSafetyActivity.mQrCodeItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bpc, "field 'mQrCodeItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mBindPhoneItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.l9, "field 'mBindPhoneItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mBindThirdAccountItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.l_, "field 'mBindThirdAccountItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mSaveLoginInfoItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.cjc, "field 'mSaveLoginInfoItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mAwmePwdItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.in, "field 'mAwmePwdItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mCertificationItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.rd, "field 'mCertificationItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mDeviceManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.a4b, "field 'mDeviceManagerItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mPoiMerchantEntranceItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bz_, "field 'mPoiMerchantEntranceItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mPersonalAuthItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bxi, "field 'mPersonalAuthItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mSafetyCenterItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.f4425io, "field 'mSafetyCenterItem'", CommonItemView.class);
        settingAccountAndSafetyActivity.mPoiDivider = Utils.findRequiredView(view, C0906R.id.c1j, "field 'mPoiDivider'");
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'exit'");
        this.f64197c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64198a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64198a, false, 72628, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64198a, false, 72628, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                settingAccountAndSafetyActivity.exit(view2);
            }
        });
    }
}
