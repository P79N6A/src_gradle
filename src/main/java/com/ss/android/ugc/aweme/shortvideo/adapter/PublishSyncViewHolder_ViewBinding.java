package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;

public class PublishSyncViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65468a;

    /* renamed from: b  reason: collision with root package name */
    private PublishSyncViewHolder f65469b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f65468a, false, 74977, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65468a, false, 74977, new Class[0], Void.TYPE);
            return;
        }
        PublishSyncViewHolder publishSyncViewHolder = this.f65469b;
        if (publishSyncViewHolder != null) {
            this.f65469b = null;
            publishSyncViewHolder.mIvIcon = null;
            publishSyncViewHolder.mTvName = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PublishSyncViewHolder_ViewBinding(PublishSyncViewHolder publishSyncViewHolder, View view) {
        this.f65469b = publishSyncViewHolder;
        publishSyncViewHolder.mIvIcon = (AutoRTLImageView) Utils.findRequiredViewAsType(view, C0906R.id.cyh, "field 'mIvIcon'", AutoRTLImageView.class);
        publishSyncViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cyi, "field 'mTvName'", TextView.class);
    }
}
