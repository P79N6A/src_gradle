package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface y extends IInterface {

    public static abstract class a extends Binder implements y {

        /* renamed from: com.ss.android.socialbase.downloader.depend.y$a$a  reason: collision with other inner class name */
        public static class C0386a implements y {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f30889a;

            public final IBinder asBinder() {
                return this.f30889a;
            }

            public C0386a(IBinder iBinder) {
                this.f30889a = iBinder;
            }

            public final long a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f30889a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                long a2 = a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(a2);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
        }
    }

    long a(int i, int i2) throws RemoteException;
}
