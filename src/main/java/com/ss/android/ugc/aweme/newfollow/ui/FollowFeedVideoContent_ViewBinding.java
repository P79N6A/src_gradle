package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;

public class FollowFeedVideoContent_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57233a;

    /* renamed from: b  reason: collision with root package name */
    private FollowFeedVideoContent f57234b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57233a, false, 61530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57233a, false, 61530, new Class[0], Void.TYPE);
            return;
        }
        FollowFeedVideoContent followFeedVideoContent = this.f57234b;
        if (followFeedVideoContent != null) {
            this.f57234b = null;
            followFeedVideoContent.mContainer = null;
            followFeedVideoContent.mCover = null;
            followFeedVideoContent.mProgressbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowFeedVideoContent_ViewBinding(FollowFeedVideoContent followFeedVideoContent, View view) {
        this.f57234b = followFeedVideoContent;
        followFeedVideoContent.mContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.dt_, "field 'mContainer'", ViewGroup.class);
        followFeedVideoContent.mCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mCover'", RemoteImageView.class);
        followFeedVideoContent.mProgressbar = (VideoPlayerProgressbar) Utils.findRequiredViewAsType(view, C0906R.id.dsn, "field 'mProgressbar'", VideoPlayerProgressbar.class);
    }
}
