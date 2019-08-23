package com.ss.ttm.player;

import android.content.Context;
import android.os.RemoteException;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.MediaPlayer;

public class TTPlayerRef extends ITTPlayerRef implements IPlayerNotifyer {
    private static final String TAG = "TTPlayerRef";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mAppPath;
    private TTPlayerClient mClient;
    private Context mContext;
    private long mId = System.currentTimeMillis();
    private TTPlayer mPlayer;

    public int getType() {
        return 1;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean isValid() {
        if (this.mPlayer == null) {
            return false;
        }
        return true;
    }

    public void close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91058, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.close();
    }

    public int getLifeId() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91054, new Class[0], Integer.TYPE)) {
            return this.mPlayer.getIntOption(35, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91054, new Class[0], Integer.TYPE)).intValue();
    }

    public long getNativeObject() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91056, new Class[0], Long.TYPE)) {
            return this.mPlayer.getNativePlayer();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91056, new Class[0], Long.TYPE)).longValue();
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91061, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.pause();
    }

    public void prepare() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91064, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.prepare();
    }

    public void prevClose() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91057, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91057, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.prevClose();
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91059, new Class[0], Void.TYPE);
            return;
        }
        TTPlayer tTPlayer = this.mPlayer;
        this.mPlayer = null;
        tTPlayer.release();
    }

    public void reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91062, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91062, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.reset();
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91060, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.start();
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91063, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.stop();
    }

    public void takeScreenshot() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91083, new Class[0], Void.TYPE);
            return;
        }
        this.mPlayer.takeScreenshot();
    }

    public TTPlayerRef(Context context) {
        this.mContext = context;
    }

    public void setDataSource(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 91065, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 91065, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setDataSource(str2);
    }

    public void setOnScreenshotListener(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        MediaPlayer.OnScreenshotListener onScreenshotListener2 = onScreenshotListener;
        if (PatchProxy.isSupport(new Object[]{onScreenshotListener2}, this, changeQuickRedirect, false, 91084, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onScreenshotListener2}, this, changeQuickRedirect, false, 91084, new Class[]{MediaPlayer.OnScreenshotListener.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setOnScreenshotListener(onScreenshotListener2);
    }

    public void setSurface(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, changeQuickRedirect, false, 91073, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, changeQuickRedirect, false, 91073, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.mPlayer.setVideoSurface(surface2);
    }

    public String getStringOption(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91078, new Class[]{Integer.TYPE}, String.class)) {
            return this.mPlayer.getStringOption(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91078, new Class[]{Integer.TYPE}, String.class);
    }

    public void seekTo(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91071, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91071, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.seekTo(i);
    }

    public void setDataSourceFd(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91066, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91066, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.setDataSourceFd(i);
    }

    public void setLooping(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91067, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91067, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.setLooping(i);
    }

    public void setNotifyState(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91074, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91074, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.setNotifyerState(j2);
    }

    public double getDoubleOption(int i, double d2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91089, new Class[]{Integer.TYPE, Double.TYPE}, Double.TYPE)) {
            return this.mPlayer.getDoubleOption(i, d2);
        }
        return ((Double) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91089, new Class[]{Integer.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
    }

    public float getFloatOption(int i, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91088, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return this.mPlayer.getFloatOption(i, f2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91088, new Class[]{Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
    }

    public int getIntOption(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91072, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return this.mPlayer.getIntOption(i, i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91072, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public long getLongOption(int i, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91080, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return this.mPlayer.getLongOption(i, j2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91080, new Class[]{Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
    }

    public void rotateCamera(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91070, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91070, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.rotateCamera(f2, f3);
    }

    public void setCacheFile(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91076, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91076, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.setCacheFile(str2, i);
    }

    public int setDoubleOption(int i, double d2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91087, new Class[]{Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
            return this.mPlayer.setDoubleOption(i, d2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91087, new Class[]{Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
    }

    public int setFloatOption(int i, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91086, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return this.mPlayer.setFloatOption(i, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91086, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public int setIntOption(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91075, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91075, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int i3 = -1;
        try {
            i3 = this.mPlayer.setIntOption(i, i2);
        } catch (RemoteException unused) {
        }
        return i3;
    }

    public int setLongOption(int i, long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91079, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return this.mPlayer.setLongOption(i, j2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 91079, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
    }

    public int setStringOption(int i, String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 91077, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return this.mPlayer.setStringOption(i, str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 91077, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
    }

    public void setVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91068, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91068, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.setVolume(f2, f3);
    }

    public void switchStream(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91085, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91085, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.switchStream(i, i2);
    }

    public static final synchronized TTPlayerRef create(TTPlayerClient tTPlayerClient, Context context) {
        Throwable th;
        StringBuffer stringBuffer;
        String str;
        TTPlayerClient tTPlayerClient2 = tTPlayerClient;
        Context context2 = context;
        synchronized (TTPlayerRef.class) {
            if (PatchProxy.isSupport(new Object[]{tTPlayerClient2, context2}, null, changeQuickRedirect, true, 91055, new Class[]{TTPlayerClient.class, Context.class}, TTPlayerRef.class)) {
                TTPlayerRef tTPlayerRef = (TTPlayerRef) PatchProxy.accessDispatch(new Object[]{tTPlayerClient2, context2}, null, changeQuickRedirect, true, 91055, new Class[]{TTPlayerClient.class, Context.class}, TTPlayerRef.class);
                return tTPlayerRef;
            }
            if (mAppPath == null) {
                mAppPath = TTPlayerConfiger.getAppFileCachePath(context);
                if (TTPlayer.getAppPath() == null) {
                    TTPlayer.setTempFileDir(mAppPath);
                }
            }
            TTPlayerRef tTPlayerRef2 = new TTPlayerRef(context2);
            tTPlayerRef2.mClient = tTPlayerClient2;
            try {
                tTPlayerRef2.mPlayer = new TTPlayer(context2, tTPlayerRef2.mId);
                tTPlayerRef2.mPlayer.setNotifyer(tTPlayerRef2);
                return tTPlayerRef2;
            } catch (Throwable th2) {
                str = th2.toString();
            }
        }
        stringBuffer.append(th.toString());
        stringBuffer.append(",player:");
        stringBuffer.append(str);
        throw new RuntimeException(stringBuffer.toString());
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91069, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91069, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mPlayer.mouseEvent(i, i2, i3);
    }

    public void handleErrorNotify(long j, int i, int i2, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 91082, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 91082, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mClient.onPlayLogInfo(i, i2, str2);
    }

    public void handlePlayerNotify(long j, int i, int i2, int i3, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 91081, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 91081, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mClient.onPlayerNotify(i, i2, i3, str2);
    }
}
