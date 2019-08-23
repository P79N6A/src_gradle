package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.benchmark.k;

public interface m extends IInterface {

    public static abstract class a extends Binder implements m {

        /* renamed from: com.benchmark.m$a$a  reason: collision with other inner class name */
        static class C0057a implements m {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7507a;

            public final IBinder asBinder() {
                return this.f7507a;
            }

            C0057a(IBinder iBinder) {
                this.f7507a = iBinder;
            }

            public final void a(k kVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IProxyManager");
                    if (kVar != null) {
                        iBinder = kVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7507a.transact(1, obtain, obtain2, 0);
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

        public a() {
            attachInterface(this, "com.benchmark.IProxyManager");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            k kVar;
            if (i == 1) {
                parcel.enforceInterface("com.benchmark.IProxyManager");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    kVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.benchmark.IProxyCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                        kVar = new k.a.C0056a(readStrongBinder);
                    } else {
                        kVar = (k) queryLocalInterface;
                    }
                }
                a(kVar);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.benchmark.IProxyManager");
                return true;
            }
        }
    }

    void a(k kVar) throws RemoteException;
}
