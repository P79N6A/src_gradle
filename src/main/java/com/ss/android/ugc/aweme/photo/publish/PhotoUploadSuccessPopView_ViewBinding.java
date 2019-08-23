package com.ss.android.ugc.aweme.photo.publish;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.PullUpLayout;

public class PhotoUploadSuccessPopView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58686a;

    /* renamed from: b  reason: collision with root package name */
    private PhotoUploadSuccessPopView f58687b;

    /* renamed from: c  reason: collision with root package name */
    private View f58688c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f58686a, false, 63779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58686a, false, 63779, new Class[0], Void.TYPE);
            return;
        }
        PhotoUploadSuccessPopView photoUploadSuccessPopView = this.f58687b;
        if (photoUploadSuccessPopView != null) {
            this.f58687b = null;
            photoUploadSuccessPopView.mPullUpLayout = null;
            photoUploadSuccessPopView.mLayoutView = null;
            photoUploadSuccessPopView.mRootLayout = null;
            photoUploadSuccessPopView.mVideoCover = null;
            photoUploadSuccessPopView.mShareItemContainer = null;
            photoUploadSuccessPopView.commerceView = null;
            photoUploadSuccessPopView.commerceIconView = null;
            photoUploadSuccessPopView.commerceMsgView = null;
            photoUploadSuccessPopView.commerceLineView = null;
            this.f58688c.setOnClickListener(null);
            this.f58688c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PhotoUploadSuccessPopView_ViewBinding(final PhotoUploadSuccessPopView photoUploadSuccessPopView, View view) {
        this.f58687b = photoUploadSuccessPopView;
        photoUploadSuccessPopView.mPullUpLayout = (PullUpLayout) Utils.findRequiredViewAsType(view, C0906R.id.c92, "field 'mPullUpLayout'", PullUpLayout.class);
        photoUploadSuccessPopView.mLayoutView = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.b89, "field 'mLayoutView'", RelativeLayout.class);
        photoUploadSuccessPopView.mRootLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.b88, "field 'mRootLayout'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.asw, "field 'mVideoCover' and method 'onClick'");
        photoUploadSuccessPopView.mVideoCover = (RemoteImageView) Utils.castView(findRequiredView, C0906R.id.asw, "field 'mVideoCover'", RemoteImageView.class);
        this.f58688c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58689a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f58689a, false, 63780, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f58689a, false, 63780, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                photoUploadSuccessPopView.onClick(view2);
            }
        });
        photoUploadSuccessPopView.mShareItemContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.by3, "field 'mShareItemContainer'", LinearLayout.class);
        photoUploadSuccessPopView.commerceView = Utils.findRequiredView(view, C0906R.id.bg1, "field 'commerceView'");
        photoUploadSuccessPopView.commerceIconView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b03, "field 'commerceIconView'", RemoteImageView.class);
        photoUploadSuccessPopView.commerceMsgView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d_t, "field 'commerceMsgView'", TextView.class);
        photoUploadSuccessPopView.commerceLineView = Utils.findRequiredView(view, C0906R.id.bbs, "field 'commerceLineView'");
    }
}
