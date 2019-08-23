package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.benchmark.g;
import java.util.ArrayList;
import java.util.List;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        /* renamed from: com.benchmark.h$a$a  reason: collision with other inner class name */
        static class C0055a implements h {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7505a;

            public final IBinder asBinder() {
                return this.f7505a;
            }

            C0055a(IBinder iBinder) {
                this.f7505a = iBinder;
            }

            public final void a(List list, g gVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMManager");
                    obtain.writeList(list);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7505a.transact(1, obtain, obtain2, 0);
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
            attachInterface(this, "com.benchmark.IBMManager");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            g gVar;
            if (i == 1) {
                parcel.enforceInterface("com.benchmark.IBMManager");
                ArrayList readArrayList = parcel.readArrayList(getClass().getClassLoader());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.benchmark.IBMCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof g)) {
                        gVar = new g.a.C0054a(readStrongBinder);
                    } else {
                        gVar = (g) queryLocalInterface;
                    }
                }
                a(readArrayList, gVar);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.benchmark.IBMManager");
                return true;
            }
        }
    }

    void a(List list, g gVar) throws RemoteException;
}
