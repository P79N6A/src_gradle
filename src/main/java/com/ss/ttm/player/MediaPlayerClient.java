package com.ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.ttm.player.MediaPlayer;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public abstract class MediaPlayerClient {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void deselectTrack(int i);

    public abstract int getCurrentPosition();

    public String getDataSource() {
        return null;
    }

    public double getDoubleOption(int i, double d2) {
        return d2;
    }

    public abstract int getDuration();

    public float getFloatOption(int i, float f2) {
        return f2;
    }

    public int getIntOption(int i, int i2) {
        return i2;
    }

    public long getLongOption(int i, long j) {
        return j;
    }

    public abstract int getSelectedTrack(int i);

    public String getStringOption(int i) {
        return null;
    }

    public abstract MediaPlayer.TrackInfo[] getTrackInfo();

    public abstract int getType();

    public abstract int getVideoHeight();

    public int getVideoType() {
        return 0;
    }

    public abstract int getVideoWidth();

    public abstract boolean isLooping();

    public boolean isMute() {
        return false;
    }

    public abstract boolean isPlaying();

    public void mouseEvent(int i, int i2, int i3) {
    }

    public abstract void pause();

    public abstract void prepare();

    public abstract void prepareAsync();

    @Deprecated
    public abstract void prevClose();

    public abstract void release();

    public abstract void releaseAsync();

    public abstract void reset();

    public void rotateCamera(float f2, float f3) {
    }

    public abstract void seekTo(int i);

    public void setCacheFile(String str, int i) {
    }

    public abstract void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    public abstract void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    public abstract void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException;

    public abstract void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    public abstract void setDisplay(SurfaceHolder surfaceHolder);

    public int setDoubleOption(int i, double d2) {
        return -1;
    }

    public int setFloatOption(int i, float f2) {
        return -1;
    }

    public int setIntOption(int i, int i2) {
        return -1;
    }

    public void setIsMute(boolean z) {
    }

    public int setLongOption(int i, long j) {
        return -1;
    }

    public abstract void setLooping(boolean z);

    public abstract void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener);

    public abstract void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener);

    public abstract void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener);

    public abstract void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener);

    public abstract void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener);

    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
    }

    public abstract void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener);

    public abstract void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener);

    public abstract void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener);

    public abstract void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener);

    public void setPanoVideoControlModel(int i) {
    }

    public abstract void setPlaybackParams(PlaybackParams playbackParams);

    public abstract void setScreenOnWhilePlaying(boolean z);

    public int setStringOption(int i, String str) {
        return -1;
    }

    public abstract void setSurface(Surface surface);

    public abstract void setVolume(float f2, float f3);

    public abstract void setWakeMode(Context context, int i);

    public abstract void start();

    public abstract void stop();

    public abstract void switchStream(int i, int i2);

    public abstract void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener);
}
