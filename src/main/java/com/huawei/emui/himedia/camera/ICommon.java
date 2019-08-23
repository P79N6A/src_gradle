package com.huawei.emui.himedia.camera;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICommon extends IInterface {

    public static abstract class Stub extends Binder implements ICommon {

        static class Proxy implements ICommon {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.android.huawei.HiMediaEngine.ICommon";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void setClientInfo(IBinder iBinder, String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.ICommon");
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void reportFunc(String str, String str2, String str3, String str4, int i, String str5, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.ICommon");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeInt(i);
                    obtain.writeString(str5);
                    obtain.writeLong(j);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.android.huawei.HiMediaEngine.ICommon");
        }

        public static ICommon asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.huawei.HiMediaEngine.ICommon");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICommon)) {
                return new Proxy(iBinder);
            }
            return (ICommon) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = i;
            Parcel parcel3 = parcel;
            if (i3 != 1598968902) {
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.android.huawei.HiMediaEngine.ICommon");
                        setClientInfo(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.android.huawei.HiMediaEngine.ICommon");
                        reportFunc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.android.huawei.HiMediaEngine.ICommon");
                return true;
            }
        }
    }

    void reportFunc(String str, String str2, String str3, String str4, int i, String str5, long j) throws RemoteException;

    void setClientInfo(IBinder iBinder, String str, String str2, String str3) throws RemoteException;
}
