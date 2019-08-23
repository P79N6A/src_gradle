package com.ss.android.ugc.aweme.choosemusic.viewholder;

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

public class MusicClassItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36083a;

    /* renamed from: b  reason: collision with root package name */
    private MusicClassItemViewHolder f36084b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36083a, false, 26894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36083a, false, 26894, new Class[0], Void.TYPE);
            return;
        }
        MusicClassItemViewHolder musicClassItemViewHolder = this.f36084b;
        if (musicClassItemViewHolder != null) {
            this.f36084b = null;
            musicClassItemViewHolder.mTvClassName = null;
            musicClassItemViewHolder.mIvClassCover = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicClassItemViewHolder_ViewBinding(MusicClassItemViewHolder musicClassItemViewHolder, View view) {
        this.f36084b = musicClassItemViewHolder;
        musicClassItemViewHolder.mTvClassName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d_f, "field 'mTvClassName'", TextView.class);
        musicClassItemViewHolder.mIvClassCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.azt, "field 'mIvClassCover'", RemoteImageView.class);
    }
}
