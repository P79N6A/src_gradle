package com.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    /* renamed from: com.b.a.a$a  reason: collision with other inner class name */
    public static abstract class C0048a extends Binder implements a {

        /* renamed from: com.b.a.a$a$a  reason: collision with other inner class name */
        static class C0049a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7422a;

            public final IBinder asBinder() {
                return this.f7422a;
            }

            C0049a(IBinder iBinder) {
                this.f7422a = iBinder;
            }

            public final void a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceNotifier");
                    obtain.writeString(str);
                    this.f7422a.transact(1, obtain, obtain2, 0);
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

        public C0048a() {
            attachInterface(this, "com.oppo.oiface.IOIfaceNotifier");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.oppo.oiface.IOIfaceNotifier");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.oppo.oiface.IOIfaceNotifier");
                return true;
            }
        }
    }

    void a(String str) throws RemoteException;
}
