package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class UpLoadRecoverItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57690a;

    /* renamed from: b  reason: collision with root package name */
    private UpLoadRecoverItemViewHolder f57691b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57690a, false, 62681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57690a, false, 62681, new Class[0], Void.TYPE);
            return;
        }
        UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = this.f57691b;
        if (upLoadRecoverItemViewHolder != null) {
            this.f57691b = null;
            upLoadRecoverItemViewHolder.mCoverImage = null;
            upLoadRecoverItemViewHolder.mTextView = null;
            upLoadRecoverItemViewHolder.mProgressBar = null;
            upLoadRecoverItemViewHolder.mIvClose = null;
            upLoadRecoverItemViewHolder.mIvRefresh = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UpLoadRecoverItemViewHolder_ViewBinding(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder, View view) {
        this.f57691b = upLoadRecoverItemViewHolder;
        upLoadRecoverItemViewHolder.mCoverImage = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.a1e, "field 'mCoverImage'", RemoteImageView.class);
        upLoadRecoverItemViewHolder.mTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.doj, "field 'mTextView'", TextView.class);
        upLoadRecoverItemViewHolder.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, C0906R.id.dok, "field 'mProgressBar'", ProgressBar.class);
        upLoadRecoverItemViewHolder.mIvClose = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.azy, "field 'mIvClose'", ImageView.class);
        upLoadRecoverItemViewHolder.mIvRefresh = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b4b, "field 'mIvRefresh'", ImageView.class);
    }
}
