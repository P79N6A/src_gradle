package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;

public class TimeLineViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44814a;

    /* renamed from: b  reason: collision with root package name */
    private TimeLineViewHolder f44815b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44814a, false, 40698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44814a, false, 40698, new Class[0], Void.TYPE);
            return;
        }
        TimeLineViewHolder timeLineViewHolder = this.f44815b;
        if (timeLineViewHolder != null) {
            this.f44815b = null;
            timeLineViewHolder.mDescribeView = null;
            timeLineViewHolder.mAvHeadView = null;
            timeLineViewHolder.mTvLocation = null;
            timeLineViewHolder.mImgLocation = null;
            timeLineViewHolder.mLocationLayout = null;
            timeLineViewHolder.txtDistance = null;
            timeLineViewHolder.mTvName = null;
            timeLineViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TimeLineViewHolder_ViewBinding(TimeLineViewHolder timeLineViewHolder, View view) {
        this.f44815b = timeLineViewHolder;
        timeLineViewHolder.mDescribeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bog, "field 'mDescribeView'", TextView.class);
        timeLineViewHolder.mAvHeadView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'mAvHeadView'", AvatarImageView.class);
        timeLineViewHolder.mTvLocation = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bjq, "field 'mTvLocation'", TextView.class);
        timeLineViewHolder.mImgLocation = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.bk0, "field 'mImgLocation'", RemoteImageView.class);
        timeLineViewHolder.mLocationLayout = Utils.findRequiredView(view, C0906R.id.bjy, "field 'mLocationLayout'");
        timeLineViewHolder.txtDistance = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dmw, "field 'txtDistance'", TextView.class);
        timeLineViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.awq, "field 'mTvName'", TextView.class);
        timeLineViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.czc, "field 'tagLayout'", TagLayout.class);
    }
}
