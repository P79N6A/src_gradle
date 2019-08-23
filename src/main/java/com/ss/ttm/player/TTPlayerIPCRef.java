package com.ss.ttm.player;

import android.content.Context;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.MediaPlayer;

public class TTPlayerIPCRef extends ITTPlayerRef {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TTPlayerClient mClient;
    private volatile long mPlayerId = System.currentTimeMillis();
    private TTPlayerConnection mPlayerRef;
    private Surface mSurface;

    public int getType() {
        return 2;
    }

    public void setDataSourceFd(int i) {
    }

    public void setOnScreenshotListener(MediaPlayer.OnScreenshotListener onScreenshotListener) {
    }

    public void takeScreenshot() {
    }

    public long getId() {
        return this.mPlayerId;
    }

    public void invalid() {
        this.mPlayerId = 0;
    }

    public boolean isValid() {
        if (this.mPlayerId == 0) {
            return false;
        }
        return true;
    }

    public void close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91022, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91022, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.mPlayerRef.close(this.mPlayerId);
        } catch (Exception unused) {
            TTPlayerConfiger.setValue(7, true);
        }
        this.mSurface = null;
    }

    public Context getContext() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91018, new Class[0], Context.class)) {
            return TTPlayerFactory.getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91018, new Class[0], Context.class);
    }

    public int getLifeId() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91019, new Class[0], Integer.TYPE)) {
            return this.mPlayerRef.getIntOption(this.mPlayerId, 35, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91019, new Class[0], Integer.TYPE)).intValue();
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91025, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayerRef.pause(this.mPlayerId);
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91028, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayerRef.prepare(this.mPlayerId);
    }

    public void prevClose() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91021, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayerRef.prevClose(this.mPlayerId);
        this.mSurface = null;
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91023, new Class[0], Void.TYPE);
            return;
        }
        long j = this.mPlayerId;
        this.mPlayerId = 0;
        try {
            this.mPlayerRef.release(j);
        } catch (Exception unused) {
            TTPlayerConfiger.setValue(7, true);
        }
        TTPlayerFactory.release(this, j);
        this.mSurface = null;
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91026, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayerRef.reset(this.mPlayerId);
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91024, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayerRef.start(this.mPlayerId);
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91027, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayerRef.stop(this.mPlayerId);
    }

    public void onCrashedInfo(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 91046, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 91046, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mClient.onCrashedInfo(str2);
    }

    public void setDataSource(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91029, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91029, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mPlayerRef.setDataSource(this.mPlayerId, str);
    }

    public String getStringOption(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91043, new Class[]{Integer.TYPE}, String.class)) {
            return this.mPlayerRef.getStringOption(this.mPlayerId, i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91043, new Class[]{Integer.TYPE}, String.class);
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91034, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91034, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.seekTo(this.mPlayerId, i);
    }

    public void setLooping(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91030, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91030, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.setLooping(this.mPlayerId, i);
    }

    public void setNotifyState(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91039, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91039, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.setNotifyState(this.mPlayerId, j);
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 91037, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 91037, new Class[]{Surface.class}, Void.TYPE);
        } else if (surface == null || this.mSurface != surface) {
            this.mPlayerRef.setVideoSurface(this.mPlayerId, surface);
            this.mSurface = surface;
        }
    }

    public TTPlayerIPCRef(TTPlayerConnection tTPlayerConnection, Context context) {
        this.mPlayerRef = tTPlayerConnection;
        this.mPlayerId = tTPlayerConnection.create(this.mPlayerId);
    }

    public static TTPlayerIPCRef create(TTPlayerClient tTPlayerClient, Context context) {
        TTPlayerClient tTPlayerClient2 = tTPlayerClient;
        if (PatchProxy.isSupport(new Object[]{tTPlayerClient2, context}, null, changeQuickRedirect, true, 91020, new Class[]{TTPlayerClient.class, Context.class}, TTPlayerIPCRef.class)) {
            return (TTPlayerIPCRef) PatchProxy.accessDispatch(new Object[]{tTPlayerClient2, context}, null, changeQuickRedirect, true, 91020, new Class[]{TTPlayerClient.class, Context.class}, TTPlayerIPCRef.class);
        }
        TTPlayerIPCRef create = TTPlayerFactory.create(context);
        if (create == null) {
            return null;
        }
        create.mClient = tTPlayerClient2;
        return create;
    }

    public double getDoubleOption(int i, double d2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91051, new Class[]{Integer.TYPE, Double.TYPE}, Double.TYPE)) {
            return this.mPlayerRef.getDoubleOption(this.mPlayerId, i, d2);
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91051, new Class[]{Integer.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
    }

    public float getFloatOption(int i, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91050, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return this.mPlayerRef.getFloatOption(this.mPlayerId, i, f2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91050, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public int getIntOption(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91036, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return this.mPlayerRef.getIntOption(this.mPlayerId, i, i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91036, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public long getLongOption(int i, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91045, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return this.mPlayerRef.getLongOption(this.mPlayerId, i, j);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91045, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
    }

    public void rotateCamera(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91033, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91033, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.rotateCamera(this.mPlayerId, f2, f3);
    }

    public void setCacheFile(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91041, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91041, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.setCacheFile(this.mPlayerId, str, i);
    }

    public int setDoubleOption(int i, double d2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91049, new Class[]{Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
            return this.mPlayerRef.setDoubleOption(this.mPlayerId, i, d2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91049, new Class[]{Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
    }

    public int setFloatOption(int i, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91048, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return this.mPlayerRef.setFloatOption(this.mPlayerId, i, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91048, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public int setIntOption(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91040, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return this.mPlayerRef.setIntOption(this.mPlayerId, i, i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91040, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public int setLongOption(int i, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91044, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return this.mPlayerRef.setLongOption(this.mPlayerId, i, j);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91044, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
    }

    public int setStringOption(int i, String str) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91042, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return this.mPlayerRef.setStringOption(this.mPlayerId, i, str);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91042, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91031, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91031, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.setVolume(this.mPlayerId, f2, f3);
    }

    public void switchStream(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91035, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91035, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.switchStream(this.mPlayerId, i, i2);
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91032, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91032, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayerRef.mouseEvent(this.mPlayerId, i, i2, i3);
    }

    public void onPlayerLogInfo(int i, int i2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 91047, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 91047, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mClient.onPlayLogInfo(i, i2, str2);
    }

    public void handleNotify(int i, int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 91038, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 91038, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mClient.onPlayerNotify(i, i2, i3, str2);
    }
}
