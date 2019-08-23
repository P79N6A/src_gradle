package com.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.b.a.a;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: com.b.a.b$a$a  reason: collision with other inner class name */
        static class C0050a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7423a;

            public final IBinder asBinder() {
                return this.f7423a;
            }

            public final void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    this.f7423a.transact(104, obtain, obtain2, 1);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    this.f7423a.transact(105, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C0050a(IBinder iBinder) {
                this.f7423a = iBinder;
            }

            public final void a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeString(str);
                    this.f7423a.transact(102, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    obtain.writeString(str);
                    this.f7423a.transact(103, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void a(a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7423a.transact(BaseLoginOrRegisterActivity.o, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            a aVar;
            if (i != 1598968902) {
                switch (i) {
                    case BaseLoginOrRegisterActivity.o /*101*/:
                        parcel.enforceInterface("com.oppo.oiface.IOIfaceService");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            aVar = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.oppo.oiface.IOIfaceNotifier");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                                aVar = new a.C0048a.C0049a(readStrongBinder);
                            } else {
                                aVar = (a) queryLocalInterface;
                            }
                        }
                        a(aVar);
                        parcel2.writeNoException();
                        return true;
                    case 102:
                        parcel.enforceInterface("com.oppo.oiface.IOIfaceService");
                        a(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 103:
                        parcel.enforceInterface("com.oppo.oiface.IOIfaceService");
                        b(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 104:
                        parcel.enforceInterface("com.oppo.oiface.IOIfaceService");
                        a();
                        parcel2.writeNoException();
                        return true;
                    case 105:
                        parcel.enforceInterface("com.oppo.oiface.IOIfaceService");
                        String b2 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b2);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.oppo.oiface.IOIfaceService");
                return true;
            }
        }
    }

    void a() throws RemoteException;

    void a(a aVar) throws RemoteException;

    void a(String str) throws RemoteException;

    String b() throws RemoteException;

    void b(String str) throws RemoteException;
}
