package com.ss.ugc.live.sdk.player.a;

import com.bytedance.common.utility.Logger;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.TTMediaPlayer;
import com.ss.ugc.live.sdk.player.ILivePlayer;

public final class d implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnExternInfoListener, MediaPlayer.OnInfoListener, MediaPlayer.OnLogListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public ILivePlayer.a f78755a;

    /* renamed from: b  reason: collision with root package name */
    private final TTMediaPlayer f78756b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f78757c = Logger.debug();

    public final void onLogInfo(MediaPlayer mediaPlayer, String str) {
    }

    d(TTMediaPlayer tTMediaPlayer) {
        this.f78756b = tTMediaPlayer;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        a(ILivePlayer.b.PLAY_COMPLETED, 0, "play complete");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        a(ILivePlayer.b.PREPARED, 0, "player is prepared");
    }

    private void a(ILivePlayer.b bVar, int i, String str) {
        if (this.f78755a != null) {
            this.f78755a.a(bVar, i, str);
        }
    }

    public final void onExternInfo(MediaPlayer mediaPlayer, int i, String str) {
        if (19 == i) {
            a(ILivePlayer.b.SEI_UPDATE, 0, str);
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        a(ILivePlayer.b.VIDEO_SIZE_CHANGED, (i2 << 16) | i, "videoSizeChanged, width: " + i + ", height: " + i2);
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ILivePlayer.b bVar = ILivePlayer.b.MEDIA_ERROR;
        a(bVar, i, "play error.code:" + i2);
        if (i != 0) {
            ILivePlayer.b bVar2 = ILivePlayer.b.PREPARE_FAILED;
            a(bVar2, i, "prepare failed.code:" + i2);
            if (this.f78757c) {
                this.f78756b.getStringOption(5002);
            }
        }
        return false;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            switch (i) {
                case 701:
                    a(ILivePlayer.b.BUFFERING_START, 0, "player start buffer");
                    break;
                case 702:
                    a(ILivePlayer.b.BUFFERING_END, 0, "player end buffer");
                    break;
            }
        } else {
            a(ILivePlayer.b.RENDERING_START, 0, "player start render");
        }
        return false;
    }
}
