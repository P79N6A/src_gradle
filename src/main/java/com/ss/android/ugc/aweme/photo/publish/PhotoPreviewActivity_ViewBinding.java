package com.ss.android.ugc.aweme.photo.publish;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PhotoPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58628a;

    /* renamed from: b  reason: collision with root package name */
    private PhotoPreviewActivity f58629b;

    /* renamed from: c  reason: collision with root package name */
    private View f58630c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f58628a, false, 63720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58628a, false, 63720, new Class[0], Void.TYPE);
            return;
        }
        PhotoPreviewActivity photoPreviewActivity = this.f58629b;
        if (photoPreviewActivity != null) {
            this.f58629b = null;
            photoPreviewActivity.mImageView = null;
            this.f58630c.setOnClickListener(null);
            this.f58630c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PhotoPreviewActivity_ViewBinding(final PhotoPreviewActivity photoPreviewActivity, View view) {
        this.f58629b = photoPreviewActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bxz, "field 'mImageView' and method 'onClick'");
        photoPreviewActivity.mImageView = (ImageView) Utils.castView(findRequiredView, C0906R.id.bxz, "field 'mImageView'", ImageView.class);
        this.f58630c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58631a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f58631a, false, 63721, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f58631a, false, 63721, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                photoPreviewActivity.onClick(view2);
            }
        });
    }
}
