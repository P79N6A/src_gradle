package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.media.MediaPlayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;

public final /* synthetic */ class a implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35785a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicItemViewHolder f35786b;

    a(MusicItemViewHolder musicItemViewHolder) {
        this.f35786b = musicItemViewHolder;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f35785a, false, 26477, new Class[]{MediaPlayer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f35785a, false, 26477, new Class[]{MediaPlayer.class}, Void.TYPE);
            return;
        }
        MusicItemViewHolder musicItemViewHolder = this.f35786b;
        mediaPlayer.start();
        musicItemViewHolder.a(true);
        musicItemViewHolder.a(false, true);
    }
}
