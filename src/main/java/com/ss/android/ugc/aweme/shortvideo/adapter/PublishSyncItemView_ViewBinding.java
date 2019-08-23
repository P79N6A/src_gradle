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

public class PublishSyncItemView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65466a;

    /* renamed from: b  reason: collision with root package name */
    private PublishSyncItemView f65467b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f65466a, false, 74972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65466a, false, 74972, new Class[0], Void.TYPE);
            return;
        }
        PublishSyncItemView publishSyncItemView = this.f65467b;
        if (publishSyncItemView != null) {
            this.f65467b = null;
            publishSyncItemView.mIvIcon = null;
            publishSyncItemView.mTvName = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PublishSyncItemView_ViewBinding(PublishSyncItemView publishSyncItemView, View view) {
        this.f65467b = publishSyncItemView;
        publishSyncItemView.mIvIcon = (AutoRTLImageView) Utils.findRequiredViewAsType(view, C0906R.id.cyh, "field 'mIvIcon'", AutoRTLImageView.class);
        publishSyncItemView.mTvName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cyi, "field 'mTvName'", TextView.class);
    }
}
