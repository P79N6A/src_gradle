package com.sina.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    /* renamed from: com.sina.a.a$a  reason: collision with other inner class name */
    public static abstract class C0317a extends Binder implements a {

        /* renamed from: com.sina.a.a$a$a  reason: collision with other inner class name */
        public static class C0318a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f27370a;

            public final IBinder asBinder() {
                return this.f27370a;
            }

            public final String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sina.sso.RemoteSSO");
                    this.f27370a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sina.sso.RemoteSSO");
                    this.f27370a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sina.sso.RemoteSSO");
                    this.f27370a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0318a(IBinder iBinder) {
                this.f27370a = iBinder;
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.sina.sso.RemoteSSO");
                        String a2 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.sina.sso.RemoteSSO");
                        String b2 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b2);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.sina.sso.RemoteSSO");
                        String c2 = c();
                        parcel2.writeNoException();
                        parcel2.writeString(c2);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.sina.sso.RemoteSSO");
                return true;
            }
        }
    }

    String a() throws RemoteException;

    String b() throws RemoteException;

    String c() throws RemoteException;
}
