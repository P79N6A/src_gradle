package com.ss.ttm.player;

import android.content.Context;
import android.os.RemoteException;
import android.support.v4.util.LongSparseArray;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.ITTPlayer;
import com.ss.ttm.utils.AVLogger;

public class TTPlayerStub extends ITTPlayer.Stub implements IPlayerNotifyer {
    private static final String TAG = "TTPlayerStub";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;
    private ITTNotifyer mNotifyer;
    private LongSparseArray<TTPlayer> mPlayers = new LongSparseArray<>();
    private LongSparseArray<Surface> mSurfaces = new LongSparseArray<>();

    public void takeScreenshot() throws RemoteException {
    }

    public void unregisterNotifyer() throws RemoteException {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91113, new Class[0], Void.TYPE);
            return;
        }
        this.mNotifyer = null;
        int size = this.mPlayers.size() - 1;
        for (int i = 0; i < size; i++) {
            TTPlayer tTPlayer = (TTPlayer) this.mPlayers.valueAt(i);
            if (tTPlayer != null) {
                tTPlayer.setNotifyer(null);
            }
        }
    }

    public void registerNotifyer(ITTNotifyer iTTNotifyer) throws RemoteException {
        this.mNotifyer = iTTNotifyer;
    }

    public TTPlayerStub(Context context) throws Exception {
        this.mContext = context;
    }

    public int close(long j) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91106, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91106, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.close();
    }

    public long create(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91097, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91097, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        } else if (TTPlayer.isError() && TTPlayerService.isError()) {
            return 0;
        } else {
            try {
                TTPlayer tTPlayer = new TTPlayer(this.mContext, j);
                tTPlayer.setNotifyer(this);
                this.mPlayers.put(j, tTPlayer);
                return j;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public TTPlayer getPlayer(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91096, new Class[]{Long.TYPE}, TTPlayer.class)) {
            return (TTPlayer) this.mPlayers.get(j2);
        }
        return (TTPlayer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91096, new Class[]{Long.TYPE}, TTPlayer.class);
    }

    public int pause(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91103, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91103, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.pause();
    }

    public int prepare(long j) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91107, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91107, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.prepare();
    }

    public int prevClose(long j) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91115, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91115, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.prevClose();
    }

    public void release(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91098, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 91098, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            this.mPlayers.remove(j);
            player.release();
            Surface surface = (Surface) this.mSurfaces.get(j);
            if (surface != null) {
                String str = TAG;
                AVLogger.k(str, "<release>surface:" + surface + ", id =" + j);
                surface.release();
                this.mSurfaces.remove(j);
            }
        }
    }

    public int reset(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91104, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91104, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.reset();
    }

    public int start(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91102, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91102, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.start();
    }

    public int stop(long j) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91105, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 91105, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.stop();
    }

    public String getStringOption(long j, int i) throws RemoteException {
        long j2 = j;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91118, new Class[]{Long.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91118, new Class[]{Long.TYPE, Integer.TYPE}, String.class);
        } else if (i2 == 27) {
            return TTPlayerService.getCrashPath();
        } else {
            if (i2 == 28) {
                return TTPlayerService.getAppFilesPath();
            }
            TTPlayer player = getPlayer(j);
            if (player == null) {
                return null;
            }
            return player.getStringOption(i2);
        }
    }

    public void seekTo(long j, int i) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91112, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91112, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.seekTo(i);
        }
    }

    public void setDataSource(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 91100, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 91100, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setDataSource(str2);
        }
    }

    public void setLooping(long j, int i) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91108, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 91108, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setLooping(i);
        }
    }

    public void setNotifyState(long j, long j2) throws RemoteException {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 91116, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 91116, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setNotifyerState(j4);
        }
    }

    public int setSurface(long j, Surface surface) {
        long j2 = j;
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), surface2}, this, changeQuickRedirect, false, 91099, new Class[]{Long.TYPE, Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), surface2}, this, changeQuickRedirect, false, 91099, new Class[]{Long.TYPE, Surface.class}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        Surface surface3 = (Surface) this.mSurfaces.get(j2);
        this.mSurfaces.remove(j2);
        if (surface2 != null) {
            this.mSurfaces.put(j2, surface2);
        }
        int videoSurface = player.setVideoSurface(surface2);
        if (surface3 != null) {
            surface3.release();
        }
        return videoSurface;
    }

    public void rotateCamera(long j, float f2, float f3) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91121, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91121, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.rotateCamera(f2, f3);
        }
    }

    public void setCacheFile(long j, String str, int i) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91101, new Class[]{Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91101, new Class[]{Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setCacheFile(str2, i);
        }
    }

    public int setStringOption(long j, int i, String str) throws RemoteException {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 91117, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 91117, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.setStringOption(i, str2);
    }

    public void setVolume(long j, float f2, float f3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91109, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 91109, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.setVolume(f2, f3);
        }
    }

    public void switchStream(long j, int i, int i2) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91122, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91122, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.switchStream(i, i2);
        }
    }

    public double getDoubleOption(long j, int i, double d2) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91127, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91127, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1.0d;
        }
        return player.getDoubleOption(i, d2);
    }

    public float getFloatOption(long j, int i, float f2) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91125, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91125, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1.0f;
        }
        return player.getFloatOption(i, f2);
    }

    public int getIntOption(long j, int i, int i2) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91110, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91110, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.getIntOption(i, i2);
    }

    public long getLongOption(long j, int i, long j2) throws RemoteException {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 91120, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 91120, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        return player.getLongOption(i, j4);
    }

    public int setDoubleOption(long j, int i, double d2) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91128, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 91128, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setDoubleOption(i, d2);
        return 0;
    }

    public int setFloatOption(long j, int i, float f2) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91126, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 91126, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setFloatOption(i, f2);
        return 0;
    }

    public int setIntOption(long j, int i, int i2) throws RemoteException {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91114, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91114, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setIntOption(i, i2);
        return 0;
    }

    public int setLongOption(long j, int i, long j2) throws RemoteException {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 91119, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 91119, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        TTPlayer player = getPlayer(j);
        if (player == null) {
            return -1;
        }
        player.setLongOption(i, j4);
        return 0;
    }

    public void handleErrorNotify(long j, int i, int i2, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 91124, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 91124, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.mNotifyer != null) {
            try {
                this.mNotifyer.handleErrorNotify(j, i, i2, str);
            } catch (RemoteException unused) {
            }
        }
    }

    public void mouseEvent(long j, int i, int i2, int i3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91111, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 91111, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        TTPlayer player = getPlayer(j);
        if (player != null) {
            player.mouseEvent(i, i2, i3);
        }
    }

    public void handlePlayerNotify(long j, int i, int i2, int i3, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 91123, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, changeQuickRedirect, false, 91123, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.mNotifyer != null) {
            try {
                this.mNotifyer.handlePlayerNotify(j, i, i2, i3, str);
            } catch (RemoteException unused) {
            }
        }
    }
}
