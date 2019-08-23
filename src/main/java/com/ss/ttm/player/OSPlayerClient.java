package com.ss.ttm.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.MediaPlayer;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public class OSPlayerClient extends MediaPlayerClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    protected MediaPlayer.OnCompletionListener mOnCompletionListener;
    protected MediaPlayer.OnErrorListener mOnErrorListener;
    protected MediaPlayer.OnInfoListener mOnInfoListener;
    protected MediaPlayer.OnPreparedListener mOnPreparedListener;
    protected MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    protected MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private android.media.MediaPlayer mPlayer;
    private MediaPlayer mWrapper;

    static class WrapOnBufferingUpdateListener implements MediaPlayer.OnBufferingUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer.OnBufferingUpdateListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onBufferingUpdateListener;
        }

        public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90718, new Class[]{android.media.MediaPlayer.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90718, new Class[]{android.media.MediaPlayer.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.mListener.onBufferingUpdate(this.mWrapper, i);
        }
    }

    static class WrapOnCompletionListener implements MediaPlayer.OnCompletionListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer.OnCompletionListener mListener;
        private MediaPlayer mWrapper;

        public void onCompletion(android.media.MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 90719, new Class[]{android.media.MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 90719, new Class[]{android.media.MediaPlayer.class}, Void.TYPE);
                return;
            }
            this.mListener.onCompletion(this.mWrapper);
        }

        public WrapOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onCompletionListener;
        }
    }

    static class WrapOnErrorListener implements MediaPlayer.OnErrorListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer.OnErrorListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnErrorListener(MediaPlayer.OnErrorListener onErrorListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onErrorListener;
        }

        public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90720, new Class[]{android.media.MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90720, new Class[]{android.media.MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            int i3 = i;
            int i4 = i2;
            return this.mListener.onError(this.mWrapper, i, i2);
        }
    }

    static class WrapOnInfoListener implements MediaPlayer.OnInfoListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer.OnInfoListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnInfoListener(MediaPlayer.OnInfoListener onInfoListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onInfoListener;
        }

        public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90721, new Class[]{android.media.MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90721, new Class[]{android.media.MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            int i3 = i;
            int i4 = i2;
            return this.mListener.onInfo(this.mWrapper, i, i2);
        }
    }

    static class WrapOnPreparedListener implements MediaPlayer.OnPreparedListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer.OnPreparedListener mListener;
        private MediaPlayer mWrapper;

        public void onPrepared(android.media.MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 90722, new Class[]{android.media.MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 90722, new Class[]{android.media.MediaPlayer.class}, Void.TYPE);
                return;
            }
            this.mListener.onPrepared(this.mWrapper);
        }

        public WrapOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener, MediaPlayer mediaPlayer) {
            this.mListener = onPreparedListener;
            this.mWrapper = mediaPlayer;
        }
    }

    static class WrapOnSeekCompleteListener implements MediaPlayer.OnSeekCompleteListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer.OnSeekCompleteListener mListener;
        private MediaPlayer mWrapper;

        public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 90723, new Class[]{android.media.MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, 90723, new Class[]{android.media.MediaPlayer.class}, Void.TYPE);
                return;
            }
            this.mListener.onSeekComplete(this.mWrapper);
        }

        public WrapOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, MediaPlayer mediaPlayer) {
            this.mListener = onSeekCompleteListener;
            this.mWrapper = mediaPlayer;
        }
    }

    static class WrapOnVideoSizeChangedListener implements MediaPlayer.OnVideoSizeChangedListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MediaPlayer.OnVideoSizeChangedListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener, MediaPlayer mediaPlayer) {
            this.mListener = onVideoSizeChangedListener;
            this.mWrapper = mediaPlayer;
        }

        public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90724, new Class[]{android.media.MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90724, new Class[]{android.media.MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            int i3 = i;
            int i4 = i2;
            this.mListener.onVideoSizeChanged(this.mWrapper, i, i2);
        }
    }

    public int getType() {
        return 0;
    }

    public void prevClose() {
    }

    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
    }

    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
    }

    public int getCurrentPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90688, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90688, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayer != null) {
            return this.mPlayer.getCurrentPosition();
        } else {
            return 0;
        }
    }

    public int getDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90691, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90691, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayer != null) {
            return this.mPlayer.getDuration();
        } else {
            return 0;
        }
    }

    public int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90689, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90689, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayer != null) {
            return this.mPlayer.getVideoHeight();
        } else {
            return 0;
        }
    }

    public int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90690, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90690, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mPlayer != null) {
            return this.mPlayer.getVideoWidth();
        } else {
            return 0;
        }
    }

    public boolean isLooping() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90694, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90694, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mPlayer != null) {
            return this.mPlayer.isLooping();
        } else {
            return false;
        }
    }

    public boolean isPlaying() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90693, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90693, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mPlayer != null) {
            return this.mPlayer.isPlaying();
        } else {
            return false;
        }
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90683, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.pause();
        }
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90686, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prepare();
            } catch (IllegalStateException unused) {
            } catch (IOException unused2) {
            }
        }
    }

    public void prepareAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90687, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.prepareAsync();
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90681, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.release();
        }
    }

    public void releaseAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90712, new Class[0], Void.TYPE);
            return;
        }
        new Thread(new Runnable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void run() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90717, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90717, new Class[0], Void.TYPE);
                    return;
                }
                OSPlayerClient.this.release();
            }
        }).start();
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90684, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.reset();
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90682, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.start();
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90685, new Class[0], Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.stop();
        }
    }

    public MediaPlayer.TrackInfo[] getTrackInfo() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90716, new Class[0], MediaPlayer.TrackInfo[].class)) {
            return (MediaPlayer.TrackInfo[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90716, new Class[0], MediaPlayer.TrackInfo[].class);
        }
        if (this.mPlayer != null) {
            MediaPlayer.TrackInfo[] trackInfo = this.mPlayer.getTrackInfo();
            if (trackInfo != null) {
                MediaPlayer.TrackInfo[] trackInfoArr = new MediaPlayer.TrackInfo[trackInfo.length];
                int length = trackInfo.length;
                int i2 = 0;
                while (i < length) {
                    trackInfoArr[i2] = new MediaPlayer.TrackInfo(trackInfo[i]);
                    i++;
                    i2++;
                }
            }
        }
        return null;
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 90707, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 90707, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setDataSource(str2);
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (PatchProxy.isSupport(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 90705, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 90705, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setOnVideoSizeChangedListener(new WrapOnVideoSizeChangedListener(onVideoSizeChangedListener, this.mWrapper));
    }

    public void setSurface(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, changeQuickRedirect, false, 90710, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, changeQuickRedirect, false, 90710, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setSurface(surface2);
    }

    public void deselectTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90714, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90714, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90715, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90715, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mPlayer != null) {
            return this.mPlayer.getSelectedTrack(i);
        } else {
            return -1;
        }
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90697, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90697, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.seekTo(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90692, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 90692, new Class[]{SurfaceHolder.class}, Void.TYPE);
        } else if (this.mPlayer != null && surfaceHolder != null && surfaceHolder.getSurface().isValid()) {
            try {
                this.mPlayer.setDisplay(surfaceHolder);
            } catch (Exception unused) {
            }
        }
    }

    public void setLooping(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90695, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90695, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (PatchProxy.isSupport(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 90699, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 90699, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE);
            return;
        }
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mPlayer.setOnBufferingUpdateListener(new WrapOnBufferingUpdateListener(onBufferingUpdateListener, this.mWrapper));
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        if (PatchProxy.isSupport(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 90700, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 90700, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE);
            return;
        }
        this.mOnCompletionListener = onCompletionListener;
        this.mPlayer.setOnCompletionListener(new WrapOnCompletionListener(onCompletionListener, this.mWrapper));
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (PatchProxy.isSupport(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 90701, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 90701, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE);
            return;
        }
        this.mOnErrorListener = onErrorListener;
        this.mPlayer.setOnErrorListener(new WrapOnErrorListener(onErrorListener, this.mWrapper));
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 90702, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 90702, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE);
            return;
        }
        this.mOnInfoListener = onInfoListener;
        this.mPlayer.setOnInfoListener(new WrapOnInfoListener(onInfoListener, this.mWrapper));
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (PatchProxy.isSupport(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 90703, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 90703, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE);
            return;
        }
        this.mOnPreparedListener = onPreparedListener;
        this.mPlayer.setOnPreparedListener(new WrapOnPreparedListener(onPreparedListener, this.mWrapper));
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (PatchProxy.isSupport(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 90704, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 90704, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE);
            return;
        }
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mPlayer.setOnSeekCompleteListener(new WrapOnSeekCompleteListener(onSeekCompleteListener, this.mWrapper));
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (PatchProxy.isSupport(new Object[]{playbackParams}, this, changeQuickRedirect, false, 90713, new Class[]{PlaybackParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{playbackParams}, this, changeQuickRedirect, false, 90713, new Class[]{PlaybackParams.class}, Void.TYPE);
            return;
        }
        PlaybackParams playbackParams2 = new PlaybackParams();
        playbackParams2.setSpeed(playbackParams.getSpeed());
        playbackParams2.setAudioFallbackMode(playbackParams.getAudioFallbackMode());
        playbackParams2.setPitch(playbackParams.getPitch());
        if (this.mPlayer != null) {
            this.mPlayer.setPlaybackParams(playbackParams2);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90698, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 90698, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.setScreenOnWhilePlaying(z);
        }
    }

    public static final synchronized OSPlayerClient create(MediaPlayer mediaPlayer, Context context) {
        MediaPlayer mediaPlayer2 = mediaPlayer;
        synchronized (OSPlayerClient.class) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer2, context}, null, changeQuickRedirect, true, 90680, new Class[]{MediaPlayer.class, Context.class}, OSPlayerClient.class)) {
                OSPlayerClient oSPlayerClient = (OSPlayerClient) PatchProxy.accessDispatch(new Object[]{mediaPlayer2, context}, null, changeQuickRedirect, true, 90680, new Class[]{MediaPlayer.class, Context.class}, OSPlayerClient.class);
                return oSPlayerClient;
            }
            OSPlayerClient oSPlayerClient2 = new OSPlayerClient();
            oSPlayerClient2.mPlayer = new android.media.MediaPlayer();
            oSPlayerClient2.mWrapper = mediaPlayer2;
            return oSPlayerClient2;
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, this, changeQuickRedirect, false, 90709, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2}, this, changeQuickRedirect, false, 90709, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setDataSource(context2, uri2);
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90696, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90696, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            this.mPlayer.setVolume(f2, f3);
        }
    }

    public void setWakeMode(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90711, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90711, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.setWakeMode(context2, i);
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        Context context2 = context;
        Uri uri2 = uri;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 90706, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 90706, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setDataSource(context2, uri2, map2);
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{fileDescriptor, new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90708, new Class[]{FileDescriptor.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {fileDescriptor, new Long(j3), new Long(j4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 90708, new Class[]{FileDescriptor.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.setDataSource(fileDescriptor, j, j2);
    }
}
