package com.ss.android.message;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30000a;

        /* renamed from: com.ss.android.message.c$a$a  reason: collision with other inner class name */
        static class C0362a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30001a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f30002b;

            public final IBinder asBinder() {
                return this.f30002b;
            }

            public final boolean a() throws RemoteException {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[0], this, f30001a, false, 17834, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30001a, false, 17834, new Class[0], Boolean.TYPE)).booleanValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f30002b.transact(1, obtain, obtain2, 0);
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

            public final int b() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, f30001a, false, 17835, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30001a, false, 17835, new Class[0], Integer.TYPE)).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f30002b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final long c() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, f30001a, false, 17836, new Class[0], Long.TYPE)) {
                    return ((Long) PatchProxy.accessDispatch(new Object[0], this, f30001a, false, 17836, new Class[0], Long.TYPE)).longValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f30002b.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String d() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, f30001a, false, 17837, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f30001a, false, 17837, new Class[0], String.class);
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f30002b.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String e() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, f30001a, false, 17838, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f30001a, false, 17838, new Class[0], String.class);
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f30002b.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String f() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, f30001a, false, 17839, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f30001a, false, 17839, new Class[0], String.class);
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f30002b.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String g() throws RemoteException {
                if (PatchProxy.isSupport(new Object[0], this, f30001a, false, 17840, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f30001a, false, 17840, new Class[0], String.class);
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f30002b.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C0362a(IBinder iBinder) {
                this.f30002b = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.ss.android.message.IPushAppCallback");
        }

        public static c a(IBinder iBinder) {
            IBinder iBinder2 = iBinder;
            if (PatchProxy.isSupport(new Object[]{iBinder2}, null, f30000a, true, 17832, new Class[]{IBinder.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{iBinder2}, null, f30000a, true, 17832, new Class[]{IBinder.class}, c.class);
            } else if (iBinder2 == null) {
                return null;
            } else {
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.ss.android.message.IPushAppCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                    return new C0362a(iBinder2);
                }
                return (c) queryLocalInterface;
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, f30000a, false, 17833, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, f30000a, false, 17833, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (i3 != 1598968902) {
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.ss.android.message.IPushAppCallback");
                        boolean a2 = a();
                        parcel2.writeNoException();
                        parcel4.writeInt(a2 ? 1 : 0);
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.ss.android.message.IPushAppCallback");
                        int b2 = b();
                        parcel2.writeNoException();
                        parcel4.writeInt(b2);
                        return true;
                    case 3:
                        parcel3.enforceInterface("com.ss.android.message.IPushAppCallback");
                        long c2 = c();
                        parcel2.writeNoException();
                        parcel4.writeLong(c2);
                        return true;
                    case 4:
                        parcel3.enforceInterface("com.ss.android.message.IPushAppCallback");
                        String d2 = d();
                        parcel2.writeNoException();
                        parcel4.writeString(d2);
                        return true;
                    case 5:
                        parcel3.enforceInterface("com.ss.android.message.IPushAppCallback");
                        String e2 = e();
                        parcel2.writeNoException();
                        parcel4.writeString(e2);
                        return true;
                    case 6:
                        parcel3.enforceInterface("com.ss.android.message.IPushAppCallback");
                        String f2 = f();
                        parcel2.writeNoException();
                        parcel4.writeString(f2);
                        return true;
                    case e.l /*?: ONE_ARG  (7 int)*/:
                        parcel3.enforceInterface("com.ss.android.message.IPushAppCallback");
                        String g = g();
                        parcel2.writeNoException();
                        parcel4.writeString(g);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString("com.ss.android.message.IPushAppCallback");
                return true;
            }
        }
    }

    boolean a() throws RemoteException;

    int b() throws RemoteException;

    long c() throws RemoteException;

    String d() throws RemoteException;

    String e() throws RemoteException;

    String f() throws RemoteException;

    String g() throws RemoteException;
}
