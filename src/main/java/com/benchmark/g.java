package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* renamed from: com.benchmark.g$a$a  reason: collision with other inner class name */
        static class C0054a implements g {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7504a;

            public final IBinder asBinder() {
                return this.f7504a;
            }

            C0054a(IBinder iBinder) {
                this.f7504a = iBinder;
            }

            public final void a(Benchmark benchmark) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMCallback");
                    if (benchmark != null) {
                        obtain.writeInt(1);
                        benchmark.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7504a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(Benchmark benchmark, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMCallback");
                    if (benchmark != null) {
                        obtain.writeInt(1);
                        benchmark.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f7504a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(Benchmark benchmark, long[] jArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMCallback");
                    if (benchmark != null) {
                        obtain.writeInt(1);
                        benchmark.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLongArray(jArr);
                    this.f7504a.transact(1, obtain, obtain2, 0);
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
            attachInterface(this, "com.benchmark.IBMCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                Benchmark benchmark = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.benchmark.IBMCallback");
                        if (parcel.readInt() != 0) {
                            benchmark = Benchmark.CREATOR.createFromParcel(parcel);
                        }
                        a(benchmark, parcel.createLongArray());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.benchmark.IBMCallback");
                        if (parcel.readInt() != 0) {
                            benchmark = Benchmark.CREATOR.createFromParcel(parcel);
                        }
                        a(benchmark, parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.benchmark.IBMCallback");
                        if (parcel.readInt() != 0) {
                            benchmark = Benchmark.CREATOR.createFromParcel(parcel);
                        }
                        a(benchmark);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.benchmark.IBMCallback");
                return true;
            }
        }
    }

    void a(Benchmark benchmark) throws RemoteException;

    void a(Benchmark benchmark, String str) throws RemoteException;

    void a(Benchmark benchmark, long[] jArr) throws RemoteException;
}
