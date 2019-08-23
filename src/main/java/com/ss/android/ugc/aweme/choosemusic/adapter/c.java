package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35789a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicAdapter f35790b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f35791c;

    c(MusicAdapter musicAdapter, boolean z) {
        this.f35790b = musicAdapter;
        this.f35791c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f35789a, false, 26479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35789a, false, 26479, new Class[0], Void.TYPE);
            return;
        }
        MusicAdapter musicAdapter = this.f35790b;
        boolean z = this.f35791c;
        if (musicAdapter.f35765c != null) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = musicAdapter.f35765c.findViewHolderForAdapterPosition(musicAdapter.f35766d);
            if (findViewHolderForAdapterPosition instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) findViewHolderForAdapterPosition).a(z, true);
            }
        }
    }
}
