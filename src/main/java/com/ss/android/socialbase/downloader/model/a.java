package com.ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.c;
import com.ss.android.socialbase.downloader.depend.d;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.f;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.h;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.p;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public interface a extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.model.a$a  reason: collision with other inner class name */
    public static abstract class C0389a extends Binder implements a {

        /* renamed from: com.ss.android.socialbase.downloader.model.a$a$a  reason: collision with other inner class name */
        public static class C0390a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f31052a;

            public final IBinder asBinder() {
                return this.f31052a;
            }

            public final t c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return t.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final w d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return w.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final e k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return e.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final c b() throws RemoteException {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                            cVar = new c.a.C0374a(readStrongBinder);
                        } else {
                            cVar = (c) queryLocalInterface;
                        }
                    }
                    return cVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final f e() throws RemoteException {
                f fVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                            fVar = new f.a.C0377a(readStrongBinder);
                        } else {
                            fVar = (f) queryLocalInterface;
                        }
                    }
                    return fVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final d f() throws RemoteException {
                d dVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                            dVar = new d.a.C0375a(readStrongBinder);
                        } else {
                            dVar = (d) queryLocalInterface;
                        }
                    }
                    return dVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final p g() throws RemoteException {
                p pVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        pVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof p)) {
                            pVar = new p.a.C0383a(readStrongBinder);
                        } else {
                            pVar = (p) queryLocalInterface;
                        }
                    }
                    return pVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final y h() throws RemoteException {
                y yVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        yVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof y)) {
                            yVar = new y.a.C0386a(readStrongBinder);
                        } else {
                            yVar = (y) queryLocalInterface;
                        }
                    }
                    return yVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final k i() throws RemoteException {
                k kVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        kVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                            kVar = new k.a.C0381a(readStrongBinder);
                        } else {
                            kVar = (k) queryLocalInterface;
                        }
                    }
                    return kVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final h j() throws RemoteException {
                h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        hVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                            hVar = new h.a.C0379a(readStrongBinder);
                        } else {
                            hVar = (h) queryLocalInterface;
                        }
                    }
                    return hVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final DownloadInfo a() throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    this.f31052a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0390a(IBinder iBinder) {
                this.f31052a = iBinder;
            }

            public final int a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    this.f31052a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final g b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    this.f31052a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return g.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final g a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f31052a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return g.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C0389a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo a2 = a();
                        parcel2.writeNoException();
                        if (a2 != null) {
                            parcel2.writeInt(1);
                            a2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        c b2 = b();
                        parcel2.writeNoException();
                        if (b2 != null) {
                            iBinder = b2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int a3 = a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a3);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        g a4 = a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a4 != null) {
                            iBinder = a4.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        g b3 = b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b3 != null) {
                            iBinder = b3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        t c2 = c();
                        parcel2.writeNoException();
                        if (c2 != null) {
                            iBinder = c2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        w d2 = d();
                        parcel2.writeNoException();
                        if (d2 != null) {
                            iBinder = d2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        f e2 = e();
                        parcel2.writeNoException();
                        if (e2 != null) {
                            iBinder = e2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        d f2 = f();
                        parcel2.writeNoException();
                        if (f2 != null) {
                            iBinder = f2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        p g = g();
                        parcel2.writeNoException();
                        if (g != null) {
                            iBinder = g.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        y h = h();
                        parcel2.writeNoException();
                        if (h != null) {
                            iBinder = h.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        k i3 = i();
                        parcel2.writeNoException();
                        if (i3 != null) {
                            iBinder = i3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        h j = j();
                        parcel2.writeNoException();
                        if (j != null) {
                            iBinder = j.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        e k = k();
                        parcel2.writeNoException();
                        if (k != null) {
                            iBinder = k.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                return true;
            }
        }
    }

    int a(int i) throws RemoteException;

    g a(int i, int i2) throws RemoteException;

    DownloadInfo a() throws RemoteException;

    c b() throws RemoteException;

    g b(int i) throws RemoteException;

    t c() throws RemoteException;

    w d() throws RemoteException;

    f e() throws RemoteException;

    d f() throws RemoteException;

    p g() throws RemoteException;

    y h() throws RemoteException;

    k i() throws RemoteException;

    h j() throws RemoteException;

    e k() throws RemoteException;
}
