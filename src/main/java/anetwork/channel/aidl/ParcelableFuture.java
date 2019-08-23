package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ParcelableFuture extends IInterface {

    public static abstract class Stub extends Binder implements ParcelableFuture {

        static class Proxy implements ParcelableFuture {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f1478a;

            public IBinder asBinder() {
                return this.f1478a;
            }

            public boolean isCancelled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableFuture");
                    boolean z = false;
                    this.f1478a.transact(2, obtain, obtain2, 0);
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

            public boolean isDone() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableFuture");
                    boolean z = false;
                    this.f1478a.transact(3, obtain, obtain2, 0);
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

            Proxy(IBinder iBinder) {
                this.f1478a = iBinder;
            }

            public boolean cancel(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableFuture");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f1478a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public NetworkResponse get(long j) throws RemoteException {
                NetworkResponse networkResponse;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("anetwork.channel.aidl.ParcelableFuture");
                    obtain.writeLong(j);
                    this.f1478a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        networkResponse = NetworkResponse.CREATOR.createFromParcel(obtain2);
                    } else {
                        networkResponse = null;
                    }
                    return networkResponse;
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
            attachInterface(this, "anetwork.channel.aidl.ParcelableFuture");
        }

        public static ParcelableFuture asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("anetwork.channel.aidl.ParcelableFuture");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ParcelableFuture)) {
                return new Proxy(iBinder);
            }
            return (ParcelableFuture) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableFuture");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean cancel = cancel(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(cancel ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableFuture");
                        boolean isCancelled = isCancelled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isCancelled ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableFuture");
                        boolean isDone = isDone();
                        parcel2.writeNoException();
                        parcel2.writeInt(isDone ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface("anetwork.channel.aidl.ParcelableFuture");
                        NetworkResponse networkResponse = get(parcel.readLong());
                        parcel2.writeNoException();
                        if (networkResponse != null) {
                            parcel2.writeInt(1);
                            networkResponse.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("anetwork.channel.aidl.ParcelableFuture");
                return true;
            }
        }
    }

    boolean cancel(boolean z) throws RemoteException;

    NetworkResponse get(long j) throws RemoteException;

    boolean isCancelled() throws RemoteException;

    boolean isDone() throws RemoteException;
}
