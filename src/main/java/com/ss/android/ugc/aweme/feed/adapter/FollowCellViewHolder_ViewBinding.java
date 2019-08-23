package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;

public class FollowCellViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44725a;

    /* renamed from: b  reason: collision with root package name */
    private FollowCellViewHolder f44726b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44725a, false, 40519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44725a, false, 40519, new Class[0], Void.TYPE);
            return;
        }
        FollowCellViewHolder followCellViewHolder = this.f44726b;
        if (followCellViewHolder != null) {
            this.f44726b = null;
            followCellViewHolder.mDescribeView = null;
            followCellViewHolder.mAvHeadView = null;
            followCellViewHolder.mTvName = null;
            followCellViewHolder.tagLayout = null;
            followCellViewHolder.tvCreateTime = null;
            followCellViewHolder.mImageLabel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowCellViewHolder_ViewBinding(FollowCellViewHolder followCellViewHolder, View view) {
        this.f44726b = followCellViewHolder;
        followCellViewHolder.mDescribeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bog, "field 'mDescribeView'", TextView.class);
        followCellViewHolder.mAvHeadView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'mAvHeadView'", AvatarImageView.class);
        followCellViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.awq, "field 'mTvName'", TextView.class);
        followCellViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.czc, "field 'tagLayout'", TagLayout.class);
        followCellViewHolder.tvCreateTime = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dak, "field 'tvCreateTime'", TextView.class);
        followCellViewHolder.mImageLabel = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.are, "field 'mImageLabel'", ImageView.class);
    }
}
