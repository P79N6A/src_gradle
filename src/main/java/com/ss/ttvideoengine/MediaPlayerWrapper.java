package com.ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.MediaPlayerClient;
import com.ss.ttm.player.OSPlayerClient;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttm.player.TTPlayerConfiger;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

public class MediaPlayerWrapper implements MediaPlayer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean sHasLoadPlayerClass;
    private MediaPlayerClient mClient;
    private String mExceptionStr = "";
    private boolean mHasException;

    public void selectTrack(int i) {
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    public String getExceptionStr() {
        return this.mExceptionStr;
    }

    public boolean hasException() {
        return this.mHasException;
    }

    public static boolean tryLoadPlayerPlugin() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91266, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91266, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (sHasLoadPlayerClass) {
            return true;
        }
        try {
            Class.forName("com.ss.ttm.player.TTPlayerClient");
            sHasLoadPlayerClass = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getCurrentPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91279, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91279, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getCurrentPosition();
        } else {
            return 0;
        }
    }

    public String getDataSource() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91290, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91290, new Class[0], String.class);
        } else if (this.mClient != null) {
            return this.mClient.getDataSource();
        } else {
            return null;
        }
    }

    public int getDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91282, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91282, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getDuration();
        } else {
            return 0;
        }
    }

    public int getPlayerType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91269, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91269, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getType();
        } else {
            return 0;
        }
    }

    public MediaPlayer.TrackInfo[] getTrackInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91324, new Class[0], MediaPlayer.TrackInfo[].class)) {
            return (MediaPlayer.TrackInfo[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91324, new Class[0], MediaPlayer.TrackInfo[].class);
        }
        if (this.mClient != null) {
            this.mClient.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91280, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91280, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getVideoHeight();
        } else {
            return 0;
        }
    }

    public int getVideoType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91283, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91283, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getVideoType();
        } else {
            return 0;
        }
    }

    public int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91281, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91281, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getVideoWidth();
        } else {
            return 0;
        }
    }

    public boolean isLooping() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91292, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91292, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient != null) {
            return this.mClient.isLooping();
        } else {
            return false;
        }
    }

    public boolean isMute() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91312, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91312, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient != null) {
            return this.mClient.isMute();
        } else {
            return false;
        }
    }

    public boolean isOSPlayer() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91268, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91268, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient == null || this.mClient.getType() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPlaying() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91291, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91291, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mClient != null) {
            return this.mClient.isPlaying();
        } else {
            return false;
        }
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91274, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.pause();
        }
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91277, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.prepare();
        }
    }

    public void prepareAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91278, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.prepareAsync();
        }
    }

    public void prevClose() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91270, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91270, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.prevClose();
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91271, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.release();
        }
    }

    public void releaseAsync() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91272, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91272, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.releaseAsync();
        }
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91275, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.reset();
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91273, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.start();
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91276, new Class[0], Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.stop();
        }
    }

    public static String getPluginVersion() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91267, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91267, new Class[0], String.class);
        }
        String str = "";
        try {
            str = Class.forName("com.ss.ttmplugin.player.TTVersion").getField("VERSION_NAME").get(null).toString();
        } catch (Throwable unused) {
        }
        return str;
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91288, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91288, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDataSource(str);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91285, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 91285, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDisplay(surfaceHolder);
        }
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (PatchProxy.isSupport(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 91299, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onBufferingUpdateListener}, this, changeQuickRedirect, false, 91299, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        if (PatchProxy.isSupport(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 91300, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCompletionListener}, this, changeQuickRedirect, false, 91300, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (PatchProxy.isSupport(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 91301, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onErrorListener}, this, changeQuickRedirect, false, 91301, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onExternInfoListener}, this, changeQuickRedirect, false, 91306, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onExternInfoListener}, this, changeQuickRedirect, false, 91306, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 91302, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onInfoListener}, this, changeQuickRedirect, false, 91302, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        if (PatchProxy.isSupport(new Object[]{onLogListener}, this, changeQuickRedirect, false, 91298, new Class[]{MediaPlayer.OnLogListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLogListener}, this, changeQuickRedirect, false, 91298, new Class[]{MediaPlayer.OnLogListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (PatchProxy.isSupport(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 91303, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPreparedListener}, this, changeQuickRedirect, false, 91303, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (PatchProxy.isSupport(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 91304, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekCompleteListener}, this, changeQuickRedirect, false, 91304, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (PatchProxy.isSupport(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 91305, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onVideoSizeChangedListener}, this, changeQuickRedirect, false, 91305, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (PatchProxy.isSupport(new Object[]{playbackParams}, this, changeQuickRedirect, false, 91321, new Class[]{PlaybackParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{playbackParams}, this, changeQuickRedirect, false, 91321, new Class[]{PlaybackParams.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setPlaybackParams(playbackParams);
        }
    }

    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        if (PatchProxy.isSupport(new Object[]{onScreenshotListener}, this, changeQuickRedirect, false, 91320, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onScreenshotListener}, this, changeQuickRedirect, false, 91320, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.takeScreenshot(onScreenshotListener);
        }
    }

    public void deselectTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91323, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91323, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91322, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91322, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.mClient != null) {
            this.mClient.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91316, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91316, new Class[]{Integer.TYPE}, String.class);
        } else if (this.mClient != null) {
            return this.mClient.getStringOption(i);
        } else {
            return null;
        }
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91296, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91296, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.seekTo(i);
        }
    }

    public void setIsMute(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91311, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91311, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91293, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91293, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setLooping(z);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91284, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91284, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setPanoVideoControlModel(i);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 91297, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 91297, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setScreenOnWhilePlaying(z);
        }
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 91286, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 91286, new Class[]{Surface.class}, Void.TYPE);
        } else if ((surface == null || surface.isValid()) && this.mClient != null) {
            this.mClient.setSurface(surface);
        }
    }

    public static MediaPlayer create(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 91265, new Class[]{Context.class}, MediaPlayer.class)) {
            return (MediaPlayer) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 91265, new Class[]{Context.class}, MediaPlayer.class);
        }
        MediaPlayerWrapper mediaPlayerWrapper = new MediaPlayerWrapper();
        synchronized (MediaPlayerWrapper.class) {
            if (TTPlayerConfiger.isOnTTPlayer()) {
                if (TTVideoEngine.isForceUsePluginPlayer()) {
                    try {
                        Class<?> cls = Class.forName("com.ss.ttmplugin.player.TTPlayerClient");
                        Method declaredMethod = cls.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                        declaredMethod.setAccessible(true);
                        mediaPlayerWrapper.mClient = (MediaPlayerClient) declaredMethod.invoke(cls, new Object[]{mediaPlayerWrapper, context});
                    } catch (Throwable th) {
                        mediaPlayerWrapper.mHasException = true;
                        mediaPlayerWrapper.mExceptionStr = th.toString();
                    }
                }
                if (mediaPlayerWrapper.mClient == null) {
                    try {
                        Class<?> cls2 = Class.forName("com.ss.ttm.player.TTPlayerClient");
                        Method declaredMethod2 = cls2.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                        declaredMethod2.setAccessible(true);
                        mediaPlayerWrapper.mClient = (MediaPlayerClient) declaredMethod2.invoke(cls2, new Object[]{mediaPlayerWrapper, context});
                        sHasLoadPlayerClass = true;
                    } catch (Throwable th2) {
                        mediaPlayerWrapper.mHasException = true;
                        mediaPlayerWrapper.mExceptionStr = th2.toString();
                    }
                }
            }
            if (mediaPlayerWrapper.mClient == null) {
                mediaPlayerWrapper.mClient = OSPlayerClient.create(mediaPlayerWrapper, context);
            }
        }
        return mediaPlayerWrapper;
    }

    public float getFloatOption(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91309, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91309, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        } else if (this.mClient != null) {
            return this.mClient.getFloatOption(i, f2);
        } else {
            return f2;
        }
    }

    public int getIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91315, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91315, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mClient != null) {
            return this.mClient.getIntOption(i, i2);
        } else {
            return i2;
        }
    }

    public long getLongOption(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91317, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91317, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        } else if (this.mClient == null) {
            return j2;
        } else {
            int i2 = i;
            return this.mClient.getLongOption(i, j2);
        }
    }

    public void rotateCamera(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91319, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91319, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.rotateCamera(f2, f3);
        }
    }

    public void setCacheFile(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91313, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91313, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{context, uri}, this, changeQuickRedirect, false, 91289, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, uri}, this, changeQuickRedirect, false, 91289, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91308, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91308, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.mClient != null) {
            this.mClient.setFloatOption(i, f2);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91307, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91307, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91318, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91318, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        } else if (this.mClient == null) {
            return -1;
        } else {
            int i2 = i;
            return (long) this.mClient.setLongOption(i, j2);
        }
    }

    public void setStringOption(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91314, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91314, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setStringOption(i, str);
        }
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91294, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91294, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setVolume(f2, f3);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91310, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91310, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setWakeMode(context, i);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91295, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91295, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 91287, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2, map2}, this, changeQuickRedirect, false, 91287, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE);
            return;
        }
        if (this.mClient != null) {
            this.mClient.setDataSource(context2, uri2, map2);
        }
    }
}
