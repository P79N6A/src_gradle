package com.b.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    /* renamed from: com.b.b.a$a  reason: collision with other inner class name */
    public static abstract class C0051a extends Binder implements a {

        /* renamed from: com.b.b.a$a$a  reason: collision with other inner class name */
        static class C0052a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7428a;

            /* renamed from: b  reason: collision with root package name */
            private String f7429b = "omediatestkey";

            public final IBinder asBinder() {
                return this.f7428a;
            }

            public final String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f7429b);
                    this.f7428a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C0052a(IBinder iBinder) {
                this.f7428a = iBinder;
            }

            public final boolean b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f7429b);
                    obtain.writeString(str);
                    boolean z = false;
                    this.f7428a.transact(4, obtain, obtain2, 0);
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

            public final String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f7429b);
                    obtain.writeString(str);
                    this.f7428a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    if (str2 == null) {
                        obtain.writeString("omediatestkey");
                    } else {
                        obtain.writeString(str2);
                    }
                    obtain.writeString(str);
                    this.f7428a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    if (readString != null) {
                        this.f7429b = str2;
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String a(String str, String str2) throws RemoteException;

    boolean b(String str) throws RemoteException;
}
