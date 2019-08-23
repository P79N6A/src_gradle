package org.android.agoo.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMessageService extends IInterface {

    public static abstract class Stub extends Binder implements IMessageService {

        static class a implements IMessageService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f84034a;

            public IBinder asBinder() {
                return this.f84034a;
            }

            public boolean ping() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("org.android.agoo.service.IMessageService");
                    boolean z = false;
                    this.f84034a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void probe() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("org.android.agoo.service.IMessageService");
                    this.f84034a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            a(IBinder iBinder) {
                this.f84034a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "org.android.agoo.service.IMessageService");
        }

        public static IMessageService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("org.android.agoo.service.IMessageService");
            if (queryLocalInterface instanceof IMessageService) {
                return (IMessageService) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("org.android.agoo.service.IMessageService");
                        boolean ping = ping();
                        parcel2.writeNoException();
                        parcel2.writeInt(ping ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("org.android.agoo.service.IMessageService");
                        probe();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("org.android.agoo.service.IMessageService");
                return true;
            }
        }
    }

    boolean ping() throws RemoteException;

    void probe() throws RemoteException;
}
