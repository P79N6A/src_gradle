package com.bytedance.android.livesdk.gift.effect.video.a;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.MediaPlayerClient;
import com.ss.ttm.player.OSPlayerClient;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttm.player.TTPlayerConfiger;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

public class d implements MediaPlayer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14998a;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f14999e;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15000b;

    /* renamed from: c  reason: collision with root package name */
    public String f15001c = "";

    /* renamed from: d  reason: collision with root package name */
    private MediaPlayerClient f15002d;

    public void selectTrack(int i) {
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    public int getCurrentPosition() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9674, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9674, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getCurrentPosition();
        } else {
            return 0;
        }
    }

    public String getDataSource() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9685, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9685, new Class[0], String.class);
        } else if (this.f15002d != null) {
            return this.f15002d.getDataSource();
        } else {
            return null;
        }
    }

    public int getDuration() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9677, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9677, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getDuration();
        } else {
            return 0;
        }
    }

    public int getPlayerType() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9664, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9664, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getType();
        } else {
            return 0;
        }
    }

    public MediaPlayer.TrackInfo[] getTrackInfo() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9719, new Class[0], MediaPlayer.TrackInfo[].class)) {
            return (MediaPlayer.TrackInfo[]) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9719, new Class[0], MediaPlayer.TrackInfo[].class);
        }
        if (this.f15002d != null) {
            this.f15002d.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9675, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9675, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getVideoHeight();
        } else {
            return 0;
        }
    }

    public int getVideoType() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9678, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9678, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getVideoType();
        } else {
            return 0;
        }
    }

    public int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9676, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9676, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getVideoWidth();
        } else {
            return 0;
        }
    }

    public boolean isLooping() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9687, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9687, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f15002d != null) {
            return this.f15002d.isLooping();
        } else {
            return false;
        }
    }

    public boolean isMute() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9707, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9707, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f15002d != null) {
            return this.f15002d.isMute();
        } else {
            return false;
        }
    }

    public boolean isOSPlayer() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9663, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9663, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f15002d == null || this.f15002d.getType() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPlaying() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9686, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9686, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f15002d != null) {
            return this.f15002d.isPlaying();
        } else {
            return false;
        }
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9669, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.pause();
        }
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9672, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.prepare();
        }
    }

    public void prepareAsync() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9673, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.prepareAsync();
        }
    }

    public void prevClose() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9665, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.prevClose();
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9666, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.release();
        }
    }

    public void releaseAsync() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9667, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.releaseAsync();
        }
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9670, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.reset();
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9668, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.start();
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, f14998a, false, 9671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14998a, false, 9671, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.stop();
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f14998a, false, 9683, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f14998a, false, 9683, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setDataSource(str);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f14998a, false, 9680, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f14998a, false, 9680, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setDisplay(surfaceHolder);
        }
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (PatchProxy.isSupport(new Object[]{onBufferingUpdateListener}, this, f14998a, false, 9694, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onBufferingUpdateListener}, this, f14998a, false, 9694, new Class[]{MediaPlayer.OnBufferingUpdateListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        if (PatchProxy.isSupport(new Object[]{onCompletionListener}, this, f14998a, false, 9695, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onCompletionListener}, this, f14998a, false, 9695, new Class[]{MediaPlayer.OnCompletionListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        if (PatchProxy.isSupport(new Object[]{onErrorListener}, this, f14998a, false, 9696, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onErrorListener}, this, f14998a, false, 9696, new Class[]{MediaPlayer.OnErrorListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onExternInfoListener}, this, f14998a, false, 9701, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onExternInfoListener}, this, f14998a, false, 9701, new Class[]{MediaPlayer.OnExternInfoListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        if (PatchProxy.isSupport(new Object[]{onInfoListener}, this, f14998a, false, 9697, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onInfoListener}, this, f14998a, false, 9697, new Class[]{MediaPlayer.OnInfoListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        if (PatchProxy.isSupport(new Object[]{onLogListener}, this, f14998a, false, 9693, new Class[]{MediaPlayer.OnLogListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLogListener}, this, f14998a, false, 9693, new Class[]{MediaPlayer.OnLogListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        if (PatchProxy.isSupport(new Object[]{onPreparedListener}, this, f14998a, false, 9698, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPreparedListener}, this, f14998a, false, 9698, new Class[]{MediaPlayer.OnPreparedListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (PatchProxy.isSupport(new Object[]{onSeekCompleteListener}, this, f14998a, false, 9699, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekCompleteListener}, this, f14998a, false, 9699, new Class[]{MediaPlayer.OnSeekCompleteListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (PatchProxy.isSupport(new Object[]{onVideoSizeChangedListener}, this, f14998a, false, 9700, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onVideoSizeChangedListener}, this, f14998a, false, 9700, new Class[]{MediaPlayer.OnVideoSizeChangedListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (PatchProxy.isSupport(new Object[]{playbackParams}, this, f14998a, false, 9716, new Class[]{PlaybackParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{playbackParams}, this, f14998a, false, 9716, new Class[]{PlaybackParams.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setPlaybackParams(playbackParams);
        }
    }

    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        if (PatchProxy.isSupport(new Object[]{onScreenshotListener}, this, f14998a, false, 9715, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onScreenshotListener}, this, f14998a, false, 9715, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.takeScreenshot(onScreenshotListener);
        }
    }

    public void deselectTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9718, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9718, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9717, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9717, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f15002d != null) {
            this.f15002d.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9711, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9711, new Class[]{Integer.TYPE}, String.class);
        } else if (this.f15002d != null) {
            return this.f15002d.getStringOption(i);
        } else {
            return null;
        }
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9691, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9691, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.seekTo(i);
        }
    }

    public void setIsMute(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14998a, false, 9706, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14998a, false, 9706, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14998a, false, 9688, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14998a, false, 9688, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setLooping(z);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9679, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14998a, false, 9679, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setPanoVideoControlModel(i);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14998a, false, 9692, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14998a, false, 9692, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setScreenOnWhilePlaying(z);
        }
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f14998a, false, 9681, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, f14998a, false, 9681, new Class[]{Surface.class}, Void.TYPE);
        } else if ((surface == null || surface.isValid()) && this.f15002d != null) {
            this.f15002d.setSurface(surface);
        }
    }

    public static MediaPlayer a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f14998a, true, 9661, new Class[]{Context.class}, MediaPlayer.class)) {
            return (MediaPlayer) PatchProxy.accessDispatch(new Object[]{context}, null, f14998a, true, 9661, new Class[]{Context.class}, MediaPlayer.class);
        }
        d dVar = new d();
        synchronized (d.class) {
            if (TTPlayerConfiger.isOnTTPlayer()) {
                try {
                    Class<?> cls = Class.forName("com.ss.ttm.player.TTPlayerClient");
                    Method declaredMethod = cls.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                    declaredMethod.setAccessible(true);
                    dVar.f15002d = (MediaPlayerClient) declaredMethod.invoke(cls, new Object[]{dVar, context});
                    f14999e = true;
                } catch (Throwable th) {
                    dVar.f15000b = true;
                    dVar.f15001c = th.toString();
                }
            }
            if (dVar.f15002d == null) {
                dVar.f15002d = OSPlayerClient.create(dVar, context);
            }
        }
        return dVar;
    }

    public float getFloatOption(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f14998a, false, 9704, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f14998a, false, 9704, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getFloatOption(i, f2);
        } else {
            return f2;
        }
    }

    public int getIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14998a, false, 9710, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14998a, false, 9710, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f15002d != null) {
            return this.f15002d.getIntOption(i, i2);
        } else {
            return i2;
        }
    }

    public long getLongOption(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f14998a, false, 9712, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f14998a, false, 9712, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        } else if (this.f15002d == null) {
            return j2;
        } else {
            int i2 = i;
            return this.f15002d.getLongOption(i, j2);
        }
    }

    public void rotateCamera(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f14998a, false, 9714, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f14998a, false, 9714, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.rotateCamera(f2, f3);
        }
    }

    public void setCacheFile(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f14998a, false, 9708, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f14998a, false, 9708, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (PatchProxy.isSupport(new Object[]{context, uri}, this, f14998a, false, 9684, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, uri}, this, f14998a, false, 9684, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f14998a, false, 9703, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f14998a, false, 9703, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f15002d != null) {
            this.f15002d.setFloatOption(i, f2);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14998a, false, 9702, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14998a, false, 9702, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f14998a, false, 9713, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f14998a, false, 9713, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        } else if (this.f15002d == null) {
            return -1;
        } else {
            int i2 = i;
            return (long) this.f15002d.setLongOption(i, j2);
        }
    }

    public void setStringOption(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f14998a, false, 9709, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f14998a, false, 9709, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setStringOption(i, str);
        }
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f14998a, false, 9689, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f14998a, false, 9689, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setVolume(f2, f3);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, f14998a, false, 9705, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, f14998a, false, 9705, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setWakeMode(context, i);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14998a, false, 9690, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14998a, false, 9690, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        Context context2 = context;
        Uri uri2 = uri;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, map2}, this, f14998a, false, 9682, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2, map2}, this, f14998a, false, 9682, new Class[]{Context.class, Uri.class, Map.class}, Void.TYPE);
            return;
        }
        if (this.f15002d != null) {
            this.f15002d.setDataSource(context2, uri2, map2);
        }
    }
}
