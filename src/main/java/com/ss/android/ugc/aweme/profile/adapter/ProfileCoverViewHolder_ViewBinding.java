package com.ss.android.ugc.aweme.profile.adapter;

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
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class ProfileCoverViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61278a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileCoverViewHolder f61279b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61278a, false, 67421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61278a, false, 67421, new Class[0], Void.TYPE);
            return;
        }
        ProfileCoverViewHolder profileCoverViewHolder = this.f61279b;
        if (profileCoverViewHolder != null) {
            this.f61279b = null;
            profileCoverViewHolder.mCoverImage = null;
            profileCoverViewHolder.mSelectBtn = null;
            profileCoverViewHolder.mUnselectedText = null;
            profileCoverViewHolder.mSelectedImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileCoverViewHolder_ViewBinding(ProfileCoverViewHolder profileCoverViewHolder, View view) {
        this.f61279b = profileCoverViewHolder;
        profileCoverViewHolder.mCoverImage = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mCoverImage'", RemoteImageView.class);
        profileCoverViewHolder.mSelectBtn = Utils.findRequiredView(view, C0906R.id.ag8, "field 'mSelectBtn'");
        profileCoverViewHolder.mUnselectedText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dl7, "field 'mUnselectedText'", TextView.class);
        profileCoverViewHolder.mSelectedImage = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b4z, "field 'mSelectedImage'", ImageView.class);
    }
}
