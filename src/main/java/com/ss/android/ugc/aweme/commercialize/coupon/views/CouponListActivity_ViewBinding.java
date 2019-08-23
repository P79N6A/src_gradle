package com.ss.android.ugc.aweme.commercialize.coupon.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CouponListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38625a;

    /* renamed from: b  reason: collision with root package name */
    private CouponListActivity f38626b;

    /* renamed from: c  reason: collision with root package name */
    private View f38627c;

    /* renamed from: d  reason: collision with root package name */
    private View f38628d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f38625a, false, 30526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38625a, false, 30526, new Class[0], Void.TYPE);
            return;
        }
        CouponListActivity couponListActivity = this.f38626b;
        if (couponListActivity != null) {
            this.f38626b = null;
            couponListActivity.title = null;
            couponListActivity.mStatusView = null;
            couponListActivity.mListView = null;
            couponListActivity.merchantTv = null;
            this.f38627c.setOnClickListener(null);
            this.f38627c = null;
            this.f38628d.setOnClickListener(null);
            this.f38628d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CouponListActivity_ViewBinding(final CouponListActivity couponListActivity, View view) {
        this.f38626b = couponListActivity;
        couponListActivity.title = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'title'", DmtTextView.class);
        couponListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        couponListActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mListView'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bmm, "field 'merchantTv' and method 'onClick'");
        couponListActivity.merchantTv = (TextView) Utils.castView(findRequiredView, C0906R.id.bmm, "field 'merchantTv'", TextView.class);
        this.f38627c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38629a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38629a, false, 30527, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38629a, false, 30527, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponListActivity.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.iz, "method 'onClick'");
        this.f38628d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38632a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f38632a, false, 30528, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f38632a, false, 30528, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                couponListActivity.onClick(view2);
            }
        });
    }
}
