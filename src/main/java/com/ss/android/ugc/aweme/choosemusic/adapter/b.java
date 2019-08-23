package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.media.MediaPlayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35787a;

    /* renamed from: b  reason: collision with root package name */
    static final MediaPlayer.OnErrorListener f35788b = new b();

    private b() {
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35787a, false, 26478, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f35787a, false, 26478, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.music.util.b.b();
        return false;
    }
}
