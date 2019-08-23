package com.ss.ttm.player;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.ITTPlayer;
import com.ss.ttm.utils.AVTime;

public class TTPlayerConnection implements ServiceConnection {
    private static final String TAG = "TTPlayerConnection";
    public static ChangeQuickRedirect changeQuickRedirect;
    private TTPlayerFactory mFactory;
    private ITTNotifyer mNotifyer = new TTPlayerNotifyerStub(this);
    protected ITTPlayer mPlayer;

    public void disConnection() {
    }

    public boolean isConnectioned() {
        if (this.mPlayer != null) {
            return true;
        }
        return false;
    }

    public void doConnectioned() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90990, new Class[0], Void.TYPE);
        } else if (this.mPlayer != null) {
            try {
                TTPlayerConfiger.setValue(19, this.mPlayer.getStringOption(0, 27));
                TTPlayerConfiger.setValue(20, this.mPlayer.getStringOption(0, 28));
                this.mPlayer.registerNotifyer(this.mNotifyer);
            } catch (RemoteException unused) {
            } catch (Exception unused2) {
            }
        }
    }

    TTPlayerConnection(TTPlayerFactory tTPlayerFactory) {
        this.mFactory = tTPlayerFactory;
    }

    public void close(long j) throws Exception {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90971, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90971, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.close(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        throw new Exception(getError(j, "close", str));
    }

    public long create(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90982, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90982, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        } else if (this.mPlayer == null) {
            return -1;
        } else {
            try {
                return this.mPlayer.create(j);
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (PatchProxy.isSupport(new Object[]{componentName}, this, changeQuickRedirect, false, 90966, new Class[]{ComponentName.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{componentName}, this, changeQuickRedirect, false, 90966, new Class[]{ComponentName.class}, Void.TYPE);
            return;
        }
        this.mPlayer = null;
        TTPlayerFactory tTPlayerFactory = this.mFactory;
        tTPlayerFactory.sendCrashedInfo(0, "<onServiceDisconnected," + AVTime.getFormatNow() + ">player is will null");
        this.mFactory.onServiceDisconnected();
    }

    public void pause(long j) {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90970, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90970, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.pause(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "pause", str));
    }

    public void prepare(long j) {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90974, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90974, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prepare(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "prepare", str));
    }

    public void prepareAsync(long j) {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90975, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90975, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prepare(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "prepareAsync", str));
    }

    public void prevClose(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90992, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90992, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prevClose(j);
            } catch (Throwable unused) {
            }
        }
    }

    public void release(long j) throws Exception {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90967, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90967, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.release(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        throw new Exception(getError(j, "release", str));
    }

    public void reset(long j) {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90973, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90973, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.reset(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "reset", str));
    }

    public void start(long j) {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90969, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90969, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.start(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "start", str));
    }

    public void stop(long j) {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90972, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 90972, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.stop(j);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "stop", str));
    }

    private int sendError(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 90988, new Class[]{Long.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 90988, new Class[]{Long.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        if (str2 != null) {
            this.mFactory.sendCrashedInfo(j2, str2);
        }
        return this.mFactory.sendCrashedError(j2, 20000);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (PatchProxy.isSupport(new Object[]{componentName, iBinder}, this, changeQuickRedirect, false, 90965, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{componentName, iBinder}, this, changeQuickRedirect, false, 90965, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE);
            return;
        }
        ITTPlayer asInterface = ITTPlayer.Stub.asInterface(iBinder);
        try {
            asInterface.registerNotifyer(this.mNotifyer);
            this.mPlayer = asInterface;
        } catch (Throwable unused) {
        }
    }

    public void seekTo(long j, int i) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90983, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90983, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.seekTo(j, i);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "seekTo", str));
    }

    public void setDataSource(long j, String str) {
        String str2;
        long j2 = j;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3}, this, changeQuickRedirect, false, 90977, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str3}, this, changeQuickRedirect, false, 90977, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setDataSource(j2, str3);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str2 = "player is null";
        } else {
            str2 = th.getMessage();
        }
        sendError(j2, getError(j2, "setDataSource", str2));
    }

    public void setLooping(long j, int i) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90981, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90981, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setLooping(j, i);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j, getError(j, "setLooping", str));
    }

    public void setNotifyState(long j, long j2) {
        String str;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90993, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90993, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setNotifyState(j3, j4);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j3, getError(j3, "setNotifyState", str));
    }

    public int setVideoSurface(long j, Surface surface) {
        String str;
        long j2 = j;
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), surface2}, this, changeQuickRedirect, false, 90976, new Class[]{Long.TYPE, Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), surface2}, this, changeQuickRedirect, false, 90976, new Class[]{Long.TYPE, Surface.class}, Integer.TYPE)).intValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setSurface(j2, surface2);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        return sendError(j2, getError(j2, "setVideoSurface", str));
    }

    public String getStringOption(long j, int i) {
        Throwable th;
        String str;
        long j2 = j;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90979, new Class[]{Long.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90979, new Class[]{Long.TYPE, Integer.TYPE}, String.class);
        } else if (this.mPlayer != null) {
            try {
                return this.mPlayer.getStringOption(j2, i2);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
            String str2 = "getStringOption,key:" + i2;
            if (th == null) {
                str = "player is null";
            } else {
                str = th.getMessage();
            }
            sendError(j2, getError(j2, str2, str));
            return null;
        }
    }

    private static final String getError(long j, String str, String str2) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, str4}, null, changeQuickRedirect, true, 90968, new Class[]{Long.TYPE, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), str3, str4}, null, changeQuickRedirect, true, 90968, new Class[]{Long.TYPE, String.class, String.class}, String.class);
        }
        StringBuilder sb = new StringBuilder(512);
        sb.append('<');
        sb.append(Thread.currentThread().getId());
        sb.append(',');
        sb.append(TAG);
        sb.append(',');
        sb.append(str3);
        sb.append(',');
        sb.append(AVTime.getFormatNow());
        sb.append('>');
        sb.append("player:");
        sb.append(j2);
        sb.append(",info:");
        sb.append(str4);
        return sb.toString();
    }

    public double getDoubleOption(long j, int i, double d2) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91001, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91001, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getDoubleOption(j, i, d2);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "getLongOption,key:" + i;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, str2, str));
        return d2;
    }

    public float getFloatOption(long j, int i, float f2) {
        String str;
        long j2 = j;
        int i2 = i;
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91000, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91000, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getFloatOption(j2, i2, f3);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "getLongOption,key:" + i2;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, str2, str));
        return f3;
    }

    public int getIntOption(long j, int i, int i2) {
        String str;
        long j2 = j;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90978, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90978, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getIntOption(j2, i3, i4);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "getIntOption,key:" + i3;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getClass().getSimpleName() + ":" + th.getMessage();
        }
        sendError(j2, getError(j2, str2, str));
        return i4;
    }

    public long getLongOption(long j, int i, long j2) {
        String str;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90997, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90997, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.getLongOption(j, i, j2);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "getLongOption,key:" + i;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j3, getError(j3, str2, str));
        return j4;
    }

    public void rotateCamera(long j, float f2, float f3) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90986, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90986, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.rotateCamera(j2, f2, f3);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, "rotateCamera", str));
    }

    public void setCacheFile(long j, String str, int i) {
        String str2;
        long j2 = j;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90994, new Class[]{Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str3, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90994, new Class[]{Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setCacheFile(j2, str3, i);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str2 = "player is null";
        } else {
            str2 = th.getMessage();
        }
        sendError(j2, getError(j2, "setLocalPath", str2));
    }

    public int setDoubleOption(long j, int i, double d2) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90999, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90999, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setDoubleOption(j, i, d2);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "setLongOption,key:" + i;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, str2, str));
        return -1;
    }

    public int setFloatOption(long j, int i, float f2) {
        String str;
        long j2 = j;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90998, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90998, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setFloatOption(j2, i2, f2);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "setLongOption,key:" + i2;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, str2, str));
        return -1;
    }

    public int setIntOption(long j, int i, int i2) {
        String str;
        long j2 = j;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90991, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90991, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setIntOption(j2, i3, i2);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "setIntOption,key:" + i3;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        return sendError(j2, getError(j2, str2, str));
    }

    public int setLongOption(long j, int i, long j2) {
        String str;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90996, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90996, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setLongOption(j, i, j2);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str2 = "setLongOption,key:" + i;
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j3, getError(j3, str2, str));
        return -1;
    }

    public int setStringOption(long j, int i, String str) {
        String str2;
        long j2 = j;
        int i2 = i;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), str3}, this, changeQuickRedirect, false, 90995, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), str3}, this, changeQuickRedirect, false, 90995, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                return this.mPlayer.setStringOption(j2, i2, str3);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        String str4 = "setStringOption,key:" + i2;
        if (th == null) {
            str2 = "player is null";
        } else {
            str2 = th.getMessage();
        }
        sendError(j2, getError(j2, str4, str2));
        return -1;
    }

    public void setVolume(long j, float f2, float f3) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90980, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90980, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.setVolume(j2, f2, f3);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, "setVolume", str));
    }

    public void switchStream(long j, int i, int i2) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90984, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90984, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.switchStream(j2, i, i2);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, "switch stream", str));
    }

    public void handlePlayerError(long j, int i, int i2, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 90989, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 90989, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mFactory.onPlayerLogInfo(j, i, i2, str);
    }

    public void mouseEvent(long j, int i, int i2, int i3) {
        String str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90985, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90985, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Throwable th = null;
        if (this.mPlayer != null) {
            try {
                this.mPlayer.mouseEvent(j, i, i2, i3);
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th == null) {
            str = "player is null";
        } else {
            str = th.getMessage();
        }
        sendError(j2, getError(j2, "mouseEvent", str));
    }

    public void recvNotify(long j, int i, int i2, int i3, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 90987, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 90987, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.mFactory.sendNotify(j, i, i2, i3, str);
    }
}
