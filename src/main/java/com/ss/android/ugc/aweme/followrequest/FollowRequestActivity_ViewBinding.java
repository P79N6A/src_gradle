package com.ss.android.ugc.aweme.followrequest;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FollowRequestActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48228a;

    /* renamed from: b  reason: collision with root package name */
    private FollowRequestActivity f48229b;

    /* renamed from: c  reason: collision with root package name */
    private View f48230c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48228a, false, 45300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48228a, false, 45300, new Class[0], Void.TYPE);
            return;
        }
        FollowRequestActivity followRequestActivity = this.f48229b;
        if (followRequestActivity != null) {
            this.f48229b = null;
            followRequestActivity.mTitleBar = null;
            followRequestActivity.mRecyclerView = null;
            followRequestActivity.mStatusView = null;
            followRequestActivity.mListStatusView = null;
            this.f48230c.setOnClickListener(null);
            this.f48230c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowRequestActivity_ViewBinding(final FollowRequestActivity followRequestActivity, View view) {
        this.f48229b = followRequestActivity;
        followRequestActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        followRequestActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cds, "field 'mRecyclerView'", RecyclerView.class);
        followRequestActivity.mStatusView = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusView'");
        followRequestActivity.mListStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.ah3, "field 'mListStatusView'", DmtStatusView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'back'");
        this.f48230c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48231a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48231a, false, 45301, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48231a, false, 45301, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                followRequestActivity.back();
            }
        });
    }
}
