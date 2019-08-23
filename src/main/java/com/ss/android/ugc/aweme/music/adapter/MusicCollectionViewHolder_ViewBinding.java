package com.ss.android.ugc.aweme.music.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class MusicCollectionViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56188a;

    /* renamed from: b  reason: collision with root package name */
    private MusicCollectionViewHolder f56189b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56188a, false, 59875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56188a, false, 59875, new Class[0], Void.TYPE);
            return;
        }
        MusicCollectionViewHolder musicCollectionViewHolder = this.f56189b;
        if (musicCollectionViewHolder != null) {
            this.f56189b = null;
            musicCollectionViewHolder.mNameView = null;
            musicCollectionViewHolder.mCoverView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicCollectionViewHolder_ViewBinding(MusicCollectionViewHolder musicCollectionViewHolder, View view) {
        this.f56189b = musicCollectionViewHolder;
        musicCollectionViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bpn, "field 'mNameView'", TextView.class);
        musicCollectionViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.boa, "field 'mCoverView'", RemoteImageView.class);
    }
}
