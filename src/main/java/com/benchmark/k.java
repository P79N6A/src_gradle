package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        /* renamed from: com.benchmark.k$a$a  reason: collision with other inner class name */
        static class C0056a implements k {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7506a;

            public final IBinder asBinder() {
                return this.f7506a;
            }

            C0056a(IBinder iBinder) {
                this.f7506a = iBinder;
            }

            public final void a(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IProxyCallback");
                    obtain.writeMap(map);
                    this.f7506a.transact(1, obtain, obtain2, 0);
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
            attachInterface(this, "com.benchmark.IProxyCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.benchmark.IProxyCallback");
                a(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.benchmark.IProxyCallback");
                return true;
            }
        }
    }

    void a(Map map) throws RemoteException;
}
