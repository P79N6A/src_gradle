package com.ss.android.message;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.c;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29951a;

        /* renamed from: com.ss.android.message.b$a$a  reason: collision with other inner class name */
        static class C0360a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29958a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f29959b;

            public final IBinder asBinder() {
                return this.f29959b;
            }

            C0360a(IBinder iBinder) {
                this.f29959b = iBinder;
            }

            public final void a(c cVar) throws RemoteException {
                IBinder iBinder;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f29958a, false, 17830, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f29958a, false, 17830, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.INotifyService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    try {
                        this.f29959b.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public final void b(c cVar) throws RemoteException {
                IBinder iBinder;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f29958a, false, 17831, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f29958a, false, 17831, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.INotifyService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    try {
                        this.f29959b.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.ss.android.message.INotifyService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = i;
            Parcel parcel3 = parcel;
            Parcel parcel4 = parcel2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, f29951a, false, 17829, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), parcel3, parcel4, Integer.valueOf(i2)}, this, f29951a, false, 17829, new Class[]{Integer.TYPE, Parcel.class, Parcel.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (i3 != 1598968902) {
                switch (i3) {
                    case 1:
                        parcel3.enforceInterface("com.ss.android.message.INotifyService");
                        a(c.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel3.enforceInterface("com.ss.android.message.INotifyService");
                        b(c.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel4.writeString("com.ss.android.message.INotifyService");
                return true;
            }
        }
    }

    void a(c cVar) throws RemoteException;

    void b(c cVar) throws RemoteException;
}
