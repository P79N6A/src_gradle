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

public class AboutActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64085a;

    /* renamed from: b  reason: collision with root package name */
    private AboutActivity f64086b;

    /* renamed from: c  reason: collision with root package name */
    private View f64087c;

    /* renamed from: d  reason: collision with root package name */
    private View f64088d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64085a, false, 72374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64085a, false, 72374, new Class[0], Void.TYPE);
            return;
        }
        AboutActivity aboutActivity = this.f64086b;
        if (aboutActivity != null) {
            this.f64086b = null;
            aboutActivity.mVersionView = null;
            aboutActivity.mVisitWebsite = null;
            aboutActivity.mCopyEmail = null;
            aboutActivity.mReportPhone = null;
            aboutActivity.mBusinessCertificate = null;
            this.f64087c.setOnClickListener(null);
            this.f64087c = null;
            this.f64088d.setOnClickListener(null);
            this.f64088d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AboutActivity_ViewBinding(final AboutActivity aboutActivity, View view) {
        this.f64086b = aboutActivity;
        aboutActivity.mVersionView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dr7, "field 'mVersionView'", TextView.class);
        aboutActivity.mVisitWebsite = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dv5, "field 'mVisitWebsite'", CommonItemView.class);
        aboutActivity.mCopyEmail = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.zt, "field 'mCopyEmail'", CommonItemView.class);
        aboutActivity.mReportPhone = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dv4, "field 'mReportPhone'", CommonItemView.class);
        aboutActivity.mBusinessCertificate = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dv3, "field 'mBusinessCertificate'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'exit'");
        this.f64087c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64089a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64089a, false, 72375, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64089a, false, 72375, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                aboutActivity.exit(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.c4v, "method 'clickPre'");
        this.f64088d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64092a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64092a, false, 72376, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64092a, false, 72376, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                aboutActivity.clickPre();
            }
        });
    }
}
