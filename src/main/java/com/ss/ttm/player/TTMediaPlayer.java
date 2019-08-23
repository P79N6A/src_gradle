package com.ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.MediaPlayer;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public class TTMediaPlayer implements MediaPlayer {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected MediaPlayerClient mClient;
    protected int mPlayerType;

    public void selectTrack(int i) {
    }

    static {
        TTVersion.saveVersionInfo();
    }

    @Deprecated
    public void prevClose() {
        if (this.mClient != null) {
            this.mClient.prevClose();
        }
    }

    public int getCurrentPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90778, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90778, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getCurrentPosition();
        } else {
            return 0;
        }
    }

    public String getDataSource() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90790, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90790, new Class[0], String.class);
        } else if (this.mClient != null) {
            return this.mClient.getDataSource();
        } else {
            return null;
        }
    }

    public int getDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90781, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90781, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getDuration();
        } else {
            return 0;
        }
    }

    public int getPlayerType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90769, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90769, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getType();
        } else {
            return 0;
        }
    }

    public MediaPlayer.TrackInfo[] getTrackInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90826, new Class[0], MediaPlayer.TrackInfo[].class)) {
            return (MediaPlayer.TrackInfo[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90826, new Class[0], MediaPlayer.TrackInfo[].class);
        } else if (this.mClient != null) {
            return this.mClient.getTrackInfo();
        } else {
            return null;
        }
    }

    public int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90779, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90779, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getVideoHeight();
        } else {
            return 0;
        }
    }

    public int getVideoType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90782, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90782, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getVideoType();
        } else {
            return 0;
        }
    }

    public int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90780, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90780, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getVideoWidth();
        } else {
            return 0;
        }
    }

    public boolean isLooping() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90792, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90792, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient != null) {
            return this.mClient.isLooping();
        } else {
            return false;
        }
    }

    public boolean isMute() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90811, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90811, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient != null) {
            return this.mClient.isMute();
        } else {
            return false;
        }
    }

    public boolean isOSPlayer() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90768, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90768, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient == null || this.mClient.getType() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPlaying() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90791, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90791, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient != null) {
            return this.mClient.isPlaying();
        } else {
            return false;
        }
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90773, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.pause();
        }
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90776, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.prepare();
        }
    }

    public void prepareAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90777, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.prepareAsync();
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90770, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.release();
        }
    }

    public void releaseAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90771, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.releaseAsync();
        }
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90774, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.reset();
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90772, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.start();
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90775, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.stop();
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 90787, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 90787, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDataSource(str);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90784, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90784, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDisplay(surfaceHolder);
        }
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (PatchProxy.isSupport(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 90799, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 90799, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        if (PatchProxy.isSupport(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 90800, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 90800, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (PatchProxy.isSupport(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 90801, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 90801, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onExternInfoListener}, this, changeQuickRedirect, false, 90803, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onExternInfoListener}, this, changeQuickRedirect, false, 90803, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 90802, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 90802, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        if (PatchProxy.isSupport(new Object[]{onLogListener}, this, changeQuickRedirect, false, 90798, new Class[]{MediaPlayer.OnLogListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLogListener}, this, changeQuickRedirect, false, 90798, new Class[]{MediaPlayer.OnLogListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (PatchProxy.isSupport(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 90805, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 90805, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
        if (PatchProxy.isSupport(new Object[]{onsarchangedlistener}, this, changeQuickRedirect, false, 90804, new Class[]{MediaPlayer.onSARChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onsarchangedlistener}, this, changeQuickRedirect, false, 90804, new Class[]{MediaPlayer.onSARChangedListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnSARChangedListener(onsarchangedlistener);
        }
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (PatchProxy.isSupport(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 90806, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 90806, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (PatchProxy.isSupport(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 90807, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 90807, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (PatchProxy.isSupport(new Object[]{playbackParams}, this, changeQuickRedirect, false, 90823, new Class[]{PlaybackParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{playbackParams}, this, changeQuickRedirect, false, 90823, new Class[]{PlaybackParams.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setPlaybackParams(playbackParams);
        }
    }

    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        if (PatchProxy.isSupport(new Object[]{onScreenshotListener}, this, changeQuickRedirect, false, 90821, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onScreenshotListener}, this, changeQuickRedirect, false, 90821, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.takeScreenshot(onScreenshotListener);
        }
    }

    public void deselectTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90824, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90824, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setIntOption(65, (i << 8) | 0);
        }
    }

    public int getSelectedTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90825, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90825, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getSelectedTrack(i);
        } else {
            return -1;
        }
    }

    public String getStringOption(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90815, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90815, new Class[]{Integer.TYPE}, String.class);
        } else if (this.mClient != null) {
            return this.mClient.getStringOption(i);
        } else {
            return null;
        }
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90796, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90796, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.seekTo(i);
        }
    }

    public void setIsMute(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90810, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90810, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90793, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90793, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setLooping(z);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90783, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90783, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setPanoVideoControlModel(i);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90797, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90797, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setScreenOnWhilePlaying(z);
        }
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 90785, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 90785, new Class[]{Surface.class}, Void.TYPE);
        } else if (surface != null && surface.isValid() && this.mClient != null) {
            this.mClient.setSurface(surface);
        }
    }

    public void setUnSupportSampleRates(int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{iArr}, this, changeQuickRedirect, false, 90827, new Class[]{int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iArr}, this, changeQuickRedirect, false, 90827, new Class[]{int[].class}, Void.TYPE);
        } else if (!isOSPlayer()) {
            int length = iArr.length;
            if (length > 0) {
                int length2 = MEDIA_PLAYER_SUPPORT_SAMPLERATES.length;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        } else if (MEDIA_PLAYER_SUPPORT_SAMPLERATES[i3] == iArr[i2]) {
                            i |= 1 << i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (this.mClient != null) {
                    this.mClient.setIntOption(111, i);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[Catch:{ Throwable -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[SYNTHETIC, Splitter:B:35:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.ss.ttm.player.TTMediaPlayer create(android.content.Context r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.ttm.player.TTMediaPlayer> r1 = com.ss.ttm.player.TTMediaPlayer.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x007f }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect     // Catch:{ all -> 0x007f }
            r6 = 1
            r7 = 90767(0x1628f, float:1.27192E-40)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x007f }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r10] = r9     // Catch:{ all -> 0x007f }
            java.lang.Class<com.ss.ttm.player.TTMediaPlayer> r9 = com.ss.ttm.player.TTMediaPlayer.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x003d
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            r11[r10] = r0     // Catch:{ all -> 0x007f }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = changeQuickRedirect     // Catch:{ all -> 0x007f }
            r14 = 1
            r15 = 90767(0x1628f, float:1.27192E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x007f }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r10] = r2     // Catch:{ all -> 0x007f }
            java.lang.Class<com.ss.ttm.player.TTMediaPlayer> r17 = com.ss.ttm.player.TTMediaPlayer.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x007f }
            com.ss.ttm.player.TTMediaPlayer r0 = (com.ss.ttm.player.TTMediaPlayer) r0     // Catch:{ all -> 0x007f }
            monitor-exit(r1)
            return r0
        L_0x003d:
            com.ss.ttm.player.TTMediaPlayer r3 = new com.ss.ttm.player.TTMediaPlayer     // Catch:{ all -> 0x007f }
            r3.<init>()     // Catch:{ all -> 0x007f }
            com.ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x007f }
            r4 = 11
            r5 = 0
            boolean r6 = com.ss.ttm.player.TTPlayerConfiger.isOnTTPlayer()     // Catch:{ Throwable -> 0x0059 }
            if (r6 != 0) goto L_0x0054
            boolean r6 = com.ss.ttm.player.TTPlayerConfiger.getValue((int) r4, (boolean) r10)     // Catch:{ Throwable -> 0x0059 }
            if (r6 == 0) goto L_0x0063
        L_0x0054:
            com.ss.ttm.player.TTPlayerClient r6 = com.ss.ttm.player.TTPlayerClient.create(r3, r0)     // Catch:{ Throwable -> 0x0059 }
            goto L_0x0064
        L_0x0059:
            r6 = 7
            boolean r7 = com.ss.ttm.player.TTPlayerConfiger.getValue((int) r6, (boolean) r10)     // Catch:{ all -> 0x007f }
            if (r7 != 0) goto L_0x0063
            com.ss.ttm.player.TTPlayerConfiger.setValue((int) r6, (boolean) r2)     // Catch:{ all -> 0x007f }
        L_0x0063:
            r6 = r5
        L_0x0064:
            if (r6 != 0) goto L_0x0077
            com.ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x007f }
            boolean r2 = com.ss.ttm.player.TTPlayerConfiger.getValue((int) r4, (boolean) r10)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0071
            monitor-exit(r1)
            return r5
        L_0x0071:
            com.ss.ttm.player.OSPlayerClient r6 = com.ss.ttm.player.OSPlayerClient.create(r3, r0)     // Catch:{ all -> 0x007f }
            r3.mPlayerType = r10     // Catch:{ all -> 0x007f }
        L_0x0077:
            if (r6 != 0) goto L_0x007b
            monitor-exit(r1)
            return r5
        L_0x007b:
            r3.mClient = r6     // Catch:{ all -> 0x007f }
            monitor-exit(r1)
            return r3
        L_0x007f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTMediaPlayer.create(android.content.Context):com.ss.ttm.player.TTMediaPlayer");
    }

    public float getFloatOption(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90818, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90818, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        } else if (this.mClient != null) {
            return this.mClient.getFloatOption(i, f2);
        } else {
            return f2;
        }
    }

    public int getIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90814, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90814, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getIntOption(i, i2);
        } else {
            return i2;
        }
    }

    public long getLongOption(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90816, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90816, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        } else if (this.mClient == null) {
            return j2;
        } else {
            int i2 = i;
            return this.mClient.getLongOption(i, j2);
        }
    }

    public void rotateCamera(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90820, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90820, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.rotateCamera(f2, f3);
        }
    }

    public void setCacheFile(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90812, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90812, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{context, uri}, this, changeQuickRedirect, false, 90788, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, uri}, this, changeQuickRedirect, false, 90788, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90819, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90819, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.setFloatOption(i, f2);
        } else {
            return -1;
        }
    }

    public void setIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90808, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90808, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90817, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 90817, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        } else if (this.mClient == null) {
            return -1;
        } else {
            int i2 = i;
            return (long) this.mClient.setLongOption(i, j2);
        }
    }

    public void setStringOption(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 90813, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 90813, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setStringOption(i, str);
        }
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90794, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90794, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setVolume(f2, f3);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90809, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90809, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setWakeMode(context, i);
        }
    }

    public void switchStream(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90822, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90822, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.switchStream(i, i2);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90795, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90795, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        Context context2 = context;
        Uri uri2 = uri;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 90786, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 90786, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDataSource(context2, uri2, map2);
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{fileDescriptor, new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90789, new Class[]{FileDescriptor.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fileDescriptor, new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90789, new Class[]{FileDescriptor.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDataSource(fileDescriptor, j, j2);
        }
    }
}
