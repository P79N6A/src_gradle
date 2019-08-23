package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FollowImageViewHolder_ViewBinding extends BaseFollowViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57582b;

    /* renamed from: c  reason: collision with root package name */
    private FollowImageViewHolder f57583c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57582b, false, 62320, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57582b, false, 62320, new Class[0], Void.TYPE);
            return;
        }
        FollowImageViewHolder followImageViewHolder = this.f57583c;
        if (followImageViewHolder != null) {
            this.f57583c = null;
            followImageViewHolder.mImageLayout = null;
            followImageViewHolder.mDynamicStub = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowImageViewHolder_ViewBinding(FollowImageViewHolder followImageViewHolder, View view) {
        super(followImageViewHolder, view);
        this.f57583c = followImageViewHolder;
        followImageViewHolder.mImageLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.b8x, "field 'mImageLayout'", ViewGroup.class);
        followImageViewHolder.mDynamicStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
    }
}
