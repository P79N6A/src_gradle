package com.alipay.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.alipay.b.a.b;

public interface a extends IInterface {

    /* renamed from: com.alipay.b.a.a$a  reason: collision with other inner class name */
    public static abstract class C0037a extends Binder implements a {

        /* renamed from: com.alipay.b.a.a$a$a  reason: collision with other inner class name */
        public static class C0038a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f5234a;

            public final IBinder asBinder() {
                return this.f5234a;
            }

            public final String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    this.f5234a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0038a(IBinder iBinder) {
                this.f5234a = iBinder;
            }

            public final String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    this.f5234a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    obtain.writeString(str);
                    this.f5234a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(b bVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5234a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(b bVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alipay.android.app.IAlixPay");
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5234a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String a2 = a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String a3 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a3);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        a(b.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        b(b.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.alipay.android.app.IAlixPay");
                        String b2 = b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(b2);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.alipay.android.app.IAlixPay");
                return true;
            }
        }
    }

    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    void a(b bVar) throws RemoteException;

    String b(String str) throws RemoteException;

    void b(b bVar) throws RemoteException;
}
