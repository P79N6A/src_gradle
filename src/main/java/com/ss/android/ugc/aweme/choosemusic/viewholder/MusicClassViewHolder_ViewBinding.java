package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MusicClassViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36096a;

    /* renamed from: b  reason: collision with root package name */
    private MusicClassViewHolder f36097b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36096a, false, 26900, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36096a, false, 26900, new Class[0], Void.TYPE);
            return;
        }
        MusicClassViewHolder musicClassViewHolder = this.f36097b;
        if (musicClassViewHolder != null) {
            this.f36097b = null;
            musicClassViewHolder.mTvTitleRight = null;
            musicClassViewHolder.mTvTitleLeft = null;
            musicClassViewHolder.mRvClassContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicClassViewHolder_ViewBinding(MusicClassViewHolder musicClassViewHolder, View view) {
        this.f36097b = musicClassViewHolder;
        musicClassViewHolder.mTvTitleRight = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dkt, "field 'mTvTitleRight'", TextView.class);
        musicClassViewHolder.mTvTitleLeft = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dkq, "field 'mTvTitleLeft'", TextView.class);
        musicClassViewHolder.mRvClassContainer = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cid, "field 'mRvClassContainer'", RecyclerView.class);
    }
}
