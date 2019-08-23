package com.ss.android.ugc.aweme.following.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FollowerCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47990a;

    /* renamed from: b  reason: collision with root package name */
    private FollowerCardViewHolder f47991b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f47990a, false, 44920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47990a, false, 44920, new Class[0], Void.TYPE);
            return;
        }
        FollowerCardViewHolder followerCardViewHolder = this.f47991b;
        if (followerCardViewHolder != null) {
            this.f47991b = null;
            followerCardViewHolder.fansRecyclerView = null;
            followerCardViewHolder.tvFansSum = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowerCardViewHolder_ViewBinding(FollowerCardViewHolder followerCardViewHolder, View view) {
        this.f47991b = followerCardViewHolder;
        followerCardViewHolder.fansRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ach, "field 'fansRecyclerView'", RecyclerView.class);
        followerCardViewHolder.tvFansSum = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dbn, "field 'tvFansSum'", DmtTextView.class);
    }
}
