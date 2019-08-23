package com.ss.android.ugc.aweme.forward.vh;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class ForwardImageViewHolder_ViewBinding extends BaseForwardViewHolder_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48361b;

    /* renamed from: c  reason: collision with root package name */
    private ForwardImageViewHolder f48362c;

    /* renamed from: d  reason: collision with root package name */
    private View f48363d;

    /* renamed from: e  reason: collision with root package name */
    private View f48364e;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48361b, false, 45632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48361b, false, 45632, new Class[0], Void.TYPE);
            return;
        }
        ForwardImageViewHolder forwardImageViewHolder = this.f48362c;
        if (forwardImageViewHolder != null) {
            this.f48362c = null;
            forwardImageViewHolder.mCoverView = null;
            forwardImageViewHolder.mImageLayout = null;
            forwardImageViewHolder.mOriginDescView = null;
            forwardImageViewHolder.mOriginHeader = null;
            forwardImageViewHolder.mOriginRootView = null;
            forwardImageViewHolder.mDynamicStub = null;
            this.f48363d.setOnClickListener(null);
            this.f48363d = null;
            this.f48364e.setOnClickListener(null);
            this.f48364e = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ForwardImageViewHolder_ViewBinding(final ForwardImageViewHolder forwardImageViewHolder, View view) {
        super(forwardImageViewHolder, view);
        this.f48362c = forwardImageViewHolder;
        forwardImageViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b8x, "field 'mImageLayout' and method 'onExpandImage'");
        forwardImageViewHolder.mImageLayout = (ViewGroup) Utils.castView(findRequiredView, C0906R.id.b8x, "field 'mImageLayout'", ViewGroup.class);
        this.f48363d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48365a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48365a, false, 45633, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48365a, false, 45633, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardImageViewHolder.onExpandImage(view2);
            }
        });
        forwardImageViewHolder.mOriginDescView = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.dft, "field 'mOriginDescView'", MentionTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.b9j, "field 'mOriginHeader' and method 'onCheckDetail'");
        forwardImageViewHolder.mOriginHeader = findRequiredView2;
        this.f48364e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48368a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48368a, false, 45634, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48368a, false, 45634, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                forwardImageViewHolder.onCheckDetail();
            }
        });
        forwardImageViewHolder.mOriginRootView = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.chz, "field 'mOriginRootView'", ViewGroup.class);
        forwardImageViewHolder.mDynamicStub = (ViewStub) Utils.findOptionalViewAsType(view, C0906R.id.cwi, "field 'mDynamicStub'", ViewStub.class);
    }
}
