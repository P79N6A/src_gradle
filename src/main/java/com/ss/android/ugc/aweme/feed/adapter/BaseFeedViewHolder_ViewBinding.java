package com.ss.android.ugc.aweme.feed.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class BaseFeedViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44643a;

    /* renamed from: b  reason: collision with root package name */
    private BaseFeedViewHolder f44644b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44643a, false, 40292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44643a, false, 40292, new Class[0], Void.TYPE);
            return;
        }
        BaseFeedViewHolder baseFeedViewHolder = this.f44644b;
        if (baseFeedViewHolder != null) {
            this.f44644b = null;
            baseFeedViewHolder.mAvatarDeco = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseFeedViewHolder_ViewBinding(BaseFeedViewHolder baseFeedViewHolder, View view) {
        this.f44644b = baseFeedViewHolder;
        baseFeedViewHolder.mAvatarDeco = (RemoteImageView) Utils.findOptionalViewAsType(view, C0906R.id.hu, "field 'mAvatarDeco'", RemoteImageView.class);
    }
}
