package com.ss.ttm.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public interface ITTNotifyer extends IInterface {

    public static abstract class Stub extends Binder implements ITTNotifyer {
        public static ChangeQuickRedirect changeQuickRedirect;

        static class Proxy implements ITTNotifyer {
            public static ChangeQuickRedirect changeQuickRedirect;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.ttm.player.ITTNotifyer";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void handleErrorNotify(long j, int i, int i2, String str) throws RemoteException {
                long j2 = j;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 90624, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 90624, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTNotifyer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    try {
                        this.mRemote.transact(2, obtain, obtain2, 0);
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

            public void handlePlayerNotify(long j, int i, int i2, int i3, String str) throws RemoteException {
                long j2 = j;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, changeQuickRedirect, false, 90623, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    Object[] objArr = {new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2};
                    Object[] objArr2 = objArr;
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 90623, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.ttm.player.ITTNotifyer");
                    obtain.writeLong(j2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str2);
                    try {
                        this.mRemote.transact(1, obtain, obtain2, 0);
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
            attachInterface(this, "com.ss.ttm.player.ITTNotifyer");
        }

        public static ITTNotifyer asInterface(IBinder iBinder) {
            IBinder iBinder2 = iBinder;
            if (PatchProxy.isSupport(new Object[]{iBinder2}, null, changeQuickRedirect, true, 90621, new Class[]{IBinder.class}, ITTNotifyer.class)) {
                return (ITTNotifyer) PatchProxy.accessDispatch(new Object[]{iBinder2}, null, changeQuickRedirect, true, 90621, new Class[]{IBinder.class}, ITTNotifyer.class);
            } else if (iBinder2 == null) {
                return null;
            } else {
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.ss.ttm.player.ITTNotifyer");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof ITTNotifyer)) {
                    return new Proxy(iBinder2);
                }
                return (ITTNotifyer) queryLocalInterface;
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90622, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, changeQuickRedirect, false, 90622, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (i3 != 1598968902) {
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTNotifyer");
                        handlePlayerNotify(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.ss.ttm.player.ITTNotifyer");
                        handleErrorNotify(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString("com.ss.ttm.player.ITTNotifyer");
                return true;
            }
        }
    }

    void handleErrorNotify(long j, int i, int i2, String str) throws RemoteException;

    void handlePlayerNotify(long j, int i, int i2, int i3, String str) throws RemoteException;
}
