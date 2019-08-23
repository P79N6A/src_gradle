package com.ss.android.ugc.aweme.poi.ui.comment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.poi.widget.ExpandableTextView;

public class PoiCommentPresenter_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60584a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCommentPresenter f60585b;

    /* renamed from: c  reason: collision with root package name */
    private View f60586c;

    /* renamed from: d  reason: collision with root package name */
    private View f60587d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60584a, false, 66290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60584a, false, 66290, new Class[0], Void.TYPE);
            return;
        }
        PoiCommentPresenter poiCommentPresenter = this.f60585b;
        if (poiCommentPresenter != null) {
            this.f60585b = null;
            poiCommentPresenter.mTxtContainer = null;
            poiCommentPresenter.mAvatarImg = null;
            poiCommentPresenter.mTxtUserName = null;
            poiCommentPresenter.mTxtPrice = null;
            poiCommentPresenter.mTxtFrom = null;
            poiCommentPresenter.mImagesList = null;
            poiCommentPresenter.mImagesLayout = null;
            poiCommentPresenter.mDivider = null;
            this.f60586c.setOnClickListener(null);
            this.f60586c = null;
            this.f60587d.setOnClickListener(null);
            this.f60587d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCommentPresenter_ViewBinding(final PoiCommentPresenter poiCommentPresenter, View view) {
        this.f60585b = poiCommentPresenter;
        poiCommentPresenter.mTxtContainer = (ExpandableTextView) Utils.findRequiredViewAsType(view, C0906R.id.bzm, "field 'mTxtContainer'", ExpandableTextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bzk, "field 'mAvatarImg' and method 'onClick'");
        poiCommentPresenter.mAvatarImg = (AvatarImageView) Utils.castView(findRequiredView, C0906R.id.bzk, "field 'mAvatarImg'", AvatarImageView.class);
        this.f60586c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60588a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60588a, false, 66291, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60588a, false, 66291, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiCommentPresenter.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bzw, "field 'mTxtUserName' and method 'onClick'");
        poiCommentPresenter.mTxtUserName = (DmtTextView) Utils.castView(findRequiredView2, C0906R.id.bzw, "field 'mTxtUserName'", DmtTextView.class);
        this.f60587d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60591a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60591a, false, 66292, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60591a, false, 66292, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiCommentPresenter.onClick(view2);
            }
        });
        poiCommentPresenter.mTxtPrice = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.bzu, "field 'mTxtPrice'", DmtTextView.class);
        poiCommentPresenter.mTxtFrom = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.bzl, "field 'mTxtFrom'", DmtTextView.class);
        poiCommentPresenter.mImagesList = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bzr, "field 'mImagesList'", RecyclerView.class);
        poiCommentPresenter.mImagesLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bzs, "field 'mImagesLayout'", LinearLayout.class);
        poiCommentPresenter.mDivider = Utils.findRequiredView(view, C0906R.id.bzo, "field 'mDivider'");
    }
}
