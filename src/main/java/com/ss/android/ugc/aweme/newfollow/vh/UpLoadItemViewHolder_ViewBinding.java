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

public class UpLoadItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57684a;

    /* renamed from: b  reason: collision with root package name */
    private UpLoadItemViewHolder f57685b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57684a, false, 62666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57684a, false, 62666, new Class[0], Void.TYPE);
            return;
        }
        UpLoadItemViewHolder upLoadItemViewHolder = this.f57685b;
        if (upLoadItemViewHolder != null) {
            this.f57685b = null;
            upLoadItemViewHolder.mCoverImage = null;
            upLoadItemViewHolder.mTextView = null;
            upLoadItemViewHolder.mProgressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UpLoadItemViewHolder_ViewBinding(UpLoadItemViewHolder upLoadItemViewHolder, View view) {
        this.f57685b = upLoadItemViewHolder;
        upLoadItemViewHolder.mCoverImage = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a1e, "field 'mCoverImage'", ImageView.class);
        upLoadItemViewHolder.mTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.doj, "field 'mTextView'", TextView.class);
        upLoadItemViewHolder.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, C0906R.id.dok, "field 'mProgressBar'", ProgressBar.class);
    }
}
