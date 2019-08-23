package com.huawei.emui.himedia.camera;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IHiMediaEngineService extends IInterface {

    public static abstract class Stub extends Binder implements IHiMediaEngineService {

        static class Proxy implements IHiMediaEngineService {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.android.huawei.HiMediaEngine.IHiMediaEngineService";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder getService(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.huawei.HiMediaEngine.IHiMediaEngineService");
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
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
            attachInterface(this, "com.android.huawei.HiMediaEngine.IHiMediaEngineService");
        }

        public static IHiMediaEngineService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.huawei.HiMediaEngine.IHiMediaEngineService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IHiMediaEngineService)) {
                return new Proxy(iBinder);
            }
            return (IHiMediaEngineService) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.android.huawei.HiMediaEngine.IHiMediaEngineService");
                IBinder service = getService(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(service);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.android.huawei.HiMediaEngine.IHiMediaEngineService");
                return true;
            }
        }
    }

    IBinder getService(String str) throws RemoteException;
}
