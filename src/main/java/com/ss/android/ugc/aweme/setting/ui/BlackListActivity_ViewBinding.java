package com.ss.android.ugc.aweme.setting.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BlackListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64121a;

    /* renamed from: b  reason: collision with root package name */
    private BlackListActivity f64122b;

    /* renamed from: c  reason: collision with root package name */
    private View f64123c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64121a, false, 72425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64121a, false, 72425, new Class[0], Void.TYPE);
            return;
        }
        BlackListActivity blackListActivity = this.f64122b;
        if (blackListActivity != null) {
            this.f64122b = null;
            blackListActivity.mRootView = null;
            blackListActivity.mTitleBar = null;
            blackListActivity.mTitle = null;
            blackListActivity.mBack = null;
            blackListActivity.mStatusView = null;
            blackListActivity.mRecyclerView = null;
            this.f64123c.setOnClickListener(null);
            this.f64123c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BlackListActivity_ViewBinding(final BlackListActivity blackListActivity, View view) {
        this.f64122b = blackListActivity;
        blackListActivity.mRootView = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.ci4, "field 'mRootView'", LinearLayout.class);
        blackListActivity.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3v, "field 'mTitleBar'", ButtonTitleBar.class);
        blackListActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "field 'mBack' and method 'back'");
        blackListActivity.mBack = (ImageView) Utils.castView(findRequiredView, C0906R.id.ix, "field 'mBack'", ImageView.class);
        this.f64123c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64124a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64124a, false, 72426, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64124a, false, 72426, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                blackListActivity.back();
            }
        });
        blackListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.lh, "field 'mStatusView'", DmtStatusView.class);
        blackListActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.lg, "field 'mRecyclerView'", RecyclerView.class);
    }
}
