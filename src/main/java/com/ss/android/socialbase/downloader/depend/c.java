package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* renamed from: com.ss.android.socialbase.downloader.depend.c$a$a  reason: collision with other inner class name */
        public static class C0374a implements c {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f30877a;

            public final IBinder asBinder() {
                return this.f30877a;
            }

            public C0374a(IBinder iBinder) {
                this.f30877a = iBinder;
            }

            public final int a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j);
                    this.f30877a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
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
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                int a2 = a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
        }
    }

    int a(long j) throws RemoteException;
}
