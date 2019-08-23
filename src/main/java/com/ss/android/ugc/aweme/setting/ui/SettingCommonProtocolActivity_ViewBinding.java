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

public class SettingCommonProtocolActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64202a;

    /* renamed from: b  reason: collision with root package name */
    private SettingCommonProtocolActivity f64203b;

    /* renamed from: c  reason: collision with root package name */
    private View f64204c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64202a, false, 72642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64202a, false, 72642, new Class[0], Void.TYPE);
            return;
        }
        SettingCommonProtocolActivity settingCommonProtocolActivity = this.f64203b;
        if (settingCommonProtocolActivity != null) {
            this.f64203b = null;
            settingCommonProtocolActivity.mTitle = null;
            settingCommonProtocolActivity.mDynamicCoverItem = null;
            settingCommonProtocolActivity.mUpdateItem = null;
            settingCommonProtocolActivity.mAutoPlay = null;
            settingCommonProtocolActivity.mPreUpload = null;
            this.f64204c.setOnClickListener(null);
            this.f64204c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SettingCommonProtocolActivity_ViewBinding(final SettingCommonProtocolActivity settingCommonProtocolActivity, View view) {
        this.f64203b = settingCommonProtocolActivity;
        settingCommonProtocolActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        settingCommonProtocolActivity.mDynamicCoverItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.a8a, "field 'mDynamicCoverItem'", CommonItemView.class);
        settingCommonProtocolActivity.mUpdateItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dod, "field 'mUpdateItem'", CommonItemView.class);
        settingCommonProtocolActivity.mAutoPlay = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.h1, "field 'mAutoPlay'", CommonItemView.class);
        settingCommonProtocolActivity.mPreUpload = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.c55, "field 'mPreUpload'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'exit'");
        this.f64204c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64205a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64205a, false, 72643, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64205a, false, 72643, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                settingCommonProtocolActivity.exit(view2);
            }
        });
    }
}
