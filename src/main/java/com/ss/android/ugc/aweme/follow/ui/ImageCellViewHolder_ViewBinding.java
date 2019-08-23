package com.ss.android.ugc.aweme.follow.ui;

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

public class ImageCellViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47812a;

    /* renamed from: b  reason: collision with root package name */
    private ImageCellViewHolder f47813b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f47812a, false, 44723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47812a, false, 44723, new Class[0], Void.TYPE);
            return;
        }
        ImageCellViewHolder imageCellViewHolder = this.f47813b;
        if (imageCellViewHolder != null) {
            this.f47813b = null;
            imageCellViewHolder.mDescribeView = null;
            imageCellViewHolder.mAvHeadView = null;
            imageCellViewHolder.mTvName = null;
            imageCellViewHolder.tagLayout = null;
            imageCellViewHolder.tvCreateTime = null;
            imageCellViewHolder.mImageIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ImageCellViewHolder_ViewBinding(ImageCellViewHolder imageCellViewHolder, View view) {
        this.f47813b = imageCellViewHolder;
        imageCellViewHolder.mDescribeView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.a3t, "field 'mDescribeView'", TextView.class);
        imageCellViewHolder.mAvHeadView = (AvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.hk, "field 'mAvHeadView'", AvatarImageView.class);
        imageCellViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.awq, "field 'mTvName'", TextView.class);
        imageCellViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, C0906R.id.czc, "field 'tagLayout'", TagLayout.class);
        imageCellViewHolder.tvCreateTime = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dak, "field 'tvCreateTime'", TextView.class);
        imageCellViewHolder.mImageIcon = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ard, "field 'mImageIcon'", ImageView.class);
    }
}
