package com.ss.ttm.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import com.ss.ttm.player.ITTNotifyer;

public interface ITTPlayer extends IInterface {

    public static abstract class Stub extends Binder implements ITTPlayer {
        public static ChangeQuickRedirect changeQuickRedirect;

        static class Proxy implements ITTPlayer {
            public static ChangeQuickRedirect changeQuickRedirect;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.ttm.player.ITTPlayer";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void takeScreenshot() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90657, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90657, new Class[0], Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unregisterNotifyer() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90654, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90654, new Class[0], Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public int close(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90634, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90634, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(8, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public long create(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90627, new Class[]{Long.TYPE}, Long.TYPE)) {
                    return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90627, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        long readLong = obtain2.readLong();
                        obtain2.recycle();
                        obtain.recycle();
                        return readLong;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int pause(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90632, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90632, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(6, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int prepare(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90631, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90631, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(5, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int prevClose(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90633, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90633, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(7, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void registerNotifyer(ITTNotifyer iTTNotifyer) throws RemoteException {
                IBinder iBinder;
                if (PatchProxy.isSupport(new Object[]{iTTNotifyer}, this, changeQuickRedirect, false, 90653, new Class[]{ITTNotifyer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iTTNotifyer}, this, changeQuickRedirect, false, 90653, new Class[]{ITTNotifyer.class}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    if (iTTNotifyer != null) {
                        iBinder = iTTNotifyer.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    try {
                        this.mRemote.transact(27, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void release(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90630, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90630, new Class[]{Long.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(4, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int reset(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90635, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90635, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(9, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int start(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90628, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90628, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int stop(long j) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90629, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 90629, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    try {
                        this.mRemote.transact(3, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public String getStringOption(long j, int i) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90645, new Class[]{Long.TYPE, Integer.TYPE}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90645, new Class[]{Long.TYPE, Integer.TYPE}, String.class);
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    try {
                        this.mRemote.transact(19, obtain, obtain2, 0);
                        obtain2.readException();
                        String readString = obtain2.readString();
                        obtain2.recycle();
                        obtain.recycle();
                        return readString;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void seekTo(long j, int i) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90652, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90652, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    try {
                        this.mRemote.transact(26, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void setDataSource(long j, String str) throws RemoteException {
                long j2 = j;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 90647, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, changeQuickRedirect, false, 90647, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeString(str2);
                    try {
                        this.mRemote.transact(21, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void setLooping(long j, int i) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90649, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 90649, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    try {
                        this.mRemote.transact(23, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void setNotifyState(long j, long j2) throws RemoteException {
                long j3 = j;
                long j4 = j2;
                if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90655, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 90655, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j3);
                    obtain.writeLong(j4);
                    try {
                        this.mRemote.transact(29, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int setSurface(long j, Surface surface) throws RemoteException {
                long j2 = j;
                Surface surface2 = surface;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), surface2}, this, changeQuickRedirect, false, 90646, new Class[]{Long.TYPE, Surface.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), surface2}, this, changeQuickRedirect, false, 90646, new Class[]{Long.TYPE, Surface.class}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    if (surface2 != null) {
                        obtain.writeInt(1);
                        surface2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    try {
                        this.mRemote.transact(20, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public double getDoubleOption(long j, int i, double d2) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90640, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Double.TYPE)) {
                    return ((Double) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90640, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Double.TYPE)).doubleValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeDouble(d2);
                    try {
                        this.mRemote.transact(14, obtain, obtain2, 0);
                        obtain2.readException();
                        double readDouble = obtain2.readDouble();
                        obtain2.recycle();
                        obtain.recycle();
                        return readDouble;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public float getFloatOption(long j, int i, float f2) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90638, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Float.TYPE)) {
                    return ((Float) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90638, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeFloat(f2);
                    try {
                        this.mRemote.transact(12, obtain, obtain2, 0);
                        obtain2.readException();
                        float readFloat = obtain2.readFloat();
                        obtain2.recycle();
                        obtain.recycle();
                        return readFloat;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int getIntOption(long j, int i, int i2) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90636, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90636, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    try {
                        this.mRemote.transact(10, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public long getLongOption(long j, int i, long j2) throws RemoteException {
                long j3 = j;
                long j4 = j2;
                if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90642, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Long.TYPE)) {
                    return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90642, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Long.TYPE)).longValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j3);
                    obtain.writeInt(i);
                    obtain.writeLong(j4);
                    try {
                        this.mRemote.transact(16, obtain, obtain2, 0);
                        obtain2.readException();
                        long readLong = obtain2.readLong();
                        obtain2.recycle();
                        obtain.recycle();
                        return readLong;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void rotateCamera(long j, float f2, float f3) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90656, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90656, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    try {
                        this.mRemote.transact(30, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void setCacheFile(long j, String str, int i) throws RemoteException {
                long j2 = j;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90648, new Class[]{Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90648, new Class[]{Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    try {
                        this.mRemote.transact(22, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int setDoubleOption(long j, int i, double d2) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90641, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 90641, new Class[]{Long.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeDouble(d2);
                    try {
                        this.mRemote.transact(15, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int setFloatOption(long j, int i, float f2) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90639, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 90639, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeFloat(f2);
                    try {
                        this.mRemote.transact(13, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int setIntOption(long j, int i, int i2) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90637, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90637, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    try {
                        this.mRemote.transact(11, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int setLongOption(long j, int i, long j2) throws RemoteException {
                long j3 = j;
                long j4 = j2;
                if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90643, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), new Long(j4)}, this, changeQuickRedirect, false, 90643, new Class[]{Long.TYPE, Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j3);
                    obtain.writeInt(i);
                    obtain.writeLong(j4);
                    try {
                        this.mRemote.transact(17, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public int setStringOption(long j, int i, String str) throws RemoteException {
                long j2 = j;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 90644, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 90644, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    try {
                        this.mRemote.transact(18, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void setVolume(long j, float f2, float f3) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90650, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90650, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    try {
                        this.mRemote.transact(24, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void switchStream(long j, int i, int i2) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90658, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90658, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    try {
                        this.mRemote.transact(32, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void mouseEvent(long j, int i, int i2, int i3) throws RemoteException {
                long j2 = j;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90651, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 90651, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTPlayer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    try {
                        this.mRemote.transact(25, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.ss.ttm.player.ITTPlayer");
        }

        public static ITTPlayer asInterface(IBinder iBinder) {
            IBinder iBinder2 = iBinder;
            if (PatchProxy.isSupport(new Object[]{iBinder2}, null, changeQuickRedirect, true, 90625, new Class[]{IBinder.class}, ITTPlayer.class)) {
                return (ITTPlayer) PatchProxy.accessDispatch(new Object[]{iBinder2}, null, changeQuickRedirect, true, 90625, new Class[]{IBinder.class}, ITTPlayer.class);
            } else if (iBinder2 == null) {
                return null;
            } else {
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.ss.ttm.player.ITTPlayer");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof ITTPlayer)) {
                    return new Proxy(iBinder2);
                }
                return (ITTPlayer) queryLocalInterface;
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Surface surface;
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90626, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90626, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (i3 != 1598968902) {
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        long create = create(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeLong(create);
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int start = start(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(start);
                        return true;
                    case 3:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int stop = stop(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(stop);
                        return true;
                    case 4:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        release(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int prepare = prepare(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(prepare);
                        return true;
                    case 6:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int pause = pause(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(pause);
                        return true;
                    case e.l:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int prevClose = prevClose(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(prevClose);
                        return true;
                    case 8:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int close = close(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(close);
                        return true;
                    case 9:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int reset = reset(parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(reset);
                        return true;
                    case 10:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int intOption = getIntOption(parcel.readLong(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeInt(intOption);
                        return true;
                    case 11:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int intOption2 = setIntOption(parcel.readLong(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeInt(intOption2);
                        return true;
                    case SearchNilInfo.HIT_TYPE_SENSITIVE:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        float floatOption = getFloatOption(parcel.readLong(), parcel.readInt(), parcel.readFloat());
                        parcel2.writeNoException();
                        parcel4.writeFloat(floatOption);
                        return true;
                    case 13:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int floatOption2 = setFloatOption(parcel.readLong(), parcel.readInt(), parcel.readFloat());
                        parcel2.writeNoException();
                        parcel4.writeInt(floatOption2);
                        return true;
                    case 14:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        double doubleOption = getDoubleOption(parcel.readLong(), parcel.readInt(), parcel.readDouble());
                        parcel2.writeNoException();
                        parcel4.writeDouble(doubleOption);
                        return true;
                    case 15:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int doubleOption2 = setDoubleOption(parcel.readLong(), parcel.readInt(), parcel.readDouble());
                        parcel2.writeNoException();
                        parcel4.writeInt(doubleOption2);
                        return true;
                    case SearchJediMixFeedAdapter.f42514c:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        long longOption = getLongOption(parcel.readLong(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeLong(longOption);
                        return true;
                    case 17:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int longOption2 = setLongOption(parcel.readLong(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel4.writeInt(longOption2);
                        return true;
                    case 18:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        int stringOption = setStringOption(parcel.readLong(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel4.writeInt(stringOption);
                        return true;
                    case 19:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        String stringOption2 = getStringOption(parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel4.writeString(stringOption2);
                        return true;
                    case 20:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        long readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel3);
                        } else {
                            surface = null;
                        }
                        int surface2 = setSurface(readLong, surface);
                        parcel2.writeNoException();
                        parcel4.writeInt(surface2);
                        return true;
                    case 21:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        setDataSource(parcel.readLong(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        setCacheFile(parcel.readLong(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        setLooping(parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        setVolume(parcel.readLong(), parcel.readFloat(), parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        mouseEvent(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        seekTo(parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        registerNotifyer(ITTNotifyer.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        unregisterNotifyer();
                        parcel2.writeNoException();
                        return true;
                    case 29:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        setNotifyState(parcel.readLong(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case c.f69366e:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        rotateCamera(parcel.readLong(), parcel.readFloat(), parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case c.f69367f:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        takeScreenshot();
                        parcel2.writeNoException();
                        return true;
                    case 32:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTPlayer");
                        switchStream(parcel.readLong(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString("com.ss.ttm.player.ITTPlayer");
                return true;
            }
        }
    }

    int close(long j) throws RemoteException;

    long create(long j) throws RemoteException;

    double getDoubleOption(long j, int i, double d2) throws RemoteException;

    float getFloatOption(long j, int i, float f2) throws RemoteException;

    int getIntOption(long j, int i, int i2) throws RemoteException;

    long getLongOption(long j, int i, long j2) throws RemoteException;

    String getStringOption(long j, int i) throws RemoteException;

    void mouseEvent(long j, int i, int i2, int i3) throws RemoteException;

    int pause(long j) throws RemoteException;

    int prepare(long j) throws RemoteException;

    int prevClose(long j) throws RemoteException;

    void registerNotifyer(ITTNotifyer iTTNotifyer) throws RemoteException;

    void release(long j) throws RemoteException;

    int reset(long j) throws RemoteException;

    void rotateCamera(long j, float f2, float f3) throws RemoteException;

    void seekTo(long j, int i) throws RemoteException;

    void setCacheFile(long j, String str, int i) throws RemoteException;

    void setDataSource(long j, String str) throws RemoteException;

    int setDoubleOption(long j, int i, double d2) throws RemoteException;

    int setFloatOption(long j, int i, float f2) throws RemoteException;

    int setIntOption(long j, int i, int i2) throws RemoteException;

    int setLongOption(long j, int i, long j2) throws RemoteException;

    void setLooping(long j, int i) throws RemoteException;

    void setNotifyState(long j, long j2) throws RemoteException;

    int setStringOption(long j, int i, String str) throws RemoteException;

    int setSurface(long j, Surface surface) throws RemoteException;

    void setVolume(long j, float f2, float f3) throws RemoteException;

    int start(long j) throws RemoteException;

    int stop(long j) throws RemoteException;

    void switchStream(long j, int i, int i2) throws RemoteException;

    void takeScreenshot() throws RemoteException;

    void unregisterNotifyer() throws RemoteException;
}
