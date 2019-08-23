package com.tencent.wcdb.support;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICancellationSignal extends IInterface {

    public static abstract class Stub extends Binder implements ICancellationSignal {

        static class Proxy implements ICancellationSignal {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tencent.wcdb.support.ICancellationSignal";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void cancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.wcdb.support.ICancellationSignal");
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.tencent.wcdb.support.ICancellationSignal");
        }

        public static ICancellationSignal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.wcdb.support.ICancellationSignal");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICancellationSignal)) {
                return new Proxy(iBinder);
            }
            return (ICancellationSignal) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.tencent.wcdb.support.ICancellationSignal");
                cancel();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tencent.wcdb.support.ICancellationSignal");
                return true;
            }
        }
    }

    void cancel() throws RemoteException;
}
