package com.vivo.vms;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IPCCallback extends IInterface {

    public static abstract class Stub extends Binder implements IPCCallback {

        static class Proxy implements IPCCallback {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.vivo.vms.IPCCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void call(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.vivo.vms.IPCCallback");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
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
            attachInterface(this, "com.vivo.vms.IPCCallback");
        }

        public static IPCCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.vivo.vms.IPCCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IPCCallback)) {
                return new Proxy(iBinder);
            }
            return (IPCCallback) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.vivo.vms.IPCCallback");
                Bundle bundle = new Bundle();
                call(bundle);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.vivo.vms.IPCCallback");
                return true;
            }
        }
    }

    void call(Bundle bundle) throws RemoteException;
}
