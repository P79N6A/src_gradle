package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.b;
import java.util.List;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.h$a$a  reason: collision with other inner class name */
        static class C0388a implements h {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f30929a;

            public final IBinder asBinder() {
                return this.f30929a;
            }

            public final void a(com.ss.android.socialbase.downloader.model.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f30929a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    this.f30929a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, g gVar, int i2, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f30929a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30929a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30929a.transact(24, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void a(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f30929a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30929a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30929a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, int i2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.f30929a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, int i2, int i3, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    this.f30929a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, List<b> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f30929a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(z zVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStrongBinder(zVar != null ? zVar.asBinder() : null);
                    this.f30929a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, t tVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    this.f30929a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f30929a.transact(30, obtain, obtain2, 0);
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

            public final void d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    this.f30929a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    this.f30929a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    this.f30929a.transact(26, obtain, obtain2, 0);
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

            C0388a(IBinder iBinder) {
                this.f30929a = iBinder;
            }

            public final void a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f30929a.transact(25, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final List<DownloadInfo> c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f30929a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<DownloadInfo> d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f30929a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void e(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final long f(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int g(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean h(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f30929a.transact(10, obtain, obtain2, 0);
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

            public final DownloadInfo i(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(11, obtain, obtain2, 0);
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

            public final List<b> j(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(b.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void k(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void l(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean m(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f30929a.transact(28, obtain, obtain2, 0);
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

            public final void n(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int o(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean p(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f30929a.transact(35, obtain, obtain2, 0);
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

            public final void q(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean r(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f30929a.transact(40, obtain, obtain2, 0);
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

            public final t s(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    return t.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final w t(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return w.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final e u(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                    return e.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<DownloadInfo> a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f30929a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<DownloadInfo> b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    this.f30929a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.f30929a.transact(4, obtain, obtain2, 0);
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

            public final void d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    this.f30929a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f30929a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final DownloadInfo b(String str, String str2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f30929a.transact(14, obtain, obtain2, 0);
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

            public final void a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f30929a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(int i, List<b> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    this.f30929a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(int i, g gVar, int i2, boolean z) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i2);
                    obtain.writeInt(z ? 1 : 0);
                    this.f30929a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f30929a.transact(39, obtain, obtain2, 0);
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
            attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                return new C0388a(iBinder);
            }
            return (h) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.app.Notification} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.ss.android.socialbase.downloader.model.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1, types: [com.ss.android.socialbase.downloader.model.a] */
        /* JADX WARNING: type inference failed for: r2v21, types: [com.ss.android.socialbase.downloader.depend.z] */
        /* JADX WARNING: type inference failed for: r2v25, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v27, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v29, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r2v31 */
        /* JADX WARNING: type inference failed for: r2v32 */
        /* JADX WARNING: type inference failed for: r2v33 */
        /* JADX WARNING: type inference failed for: r2v34 */
        /* JADX WARNING: type inference failed for: r2v35 */
        /* JADX WARNING: type inference failed for: r2v36 */
        /* JADX WARNING: type inference failed for: r2v37 */
        /* JADX WARNING: type inference failed for: r2v38 */
        /* JADX WARNING: type inference failed for: r2v39 */
        /* JADX WARNING: type inference failed for: r2v40 */
        /* JADX WARNING: type inference failed for: r2v41 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
            /*
                r8 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r9 == r0) goto L_0x045b
                r0 = 0
                r2 = 0
                switch(r9) {
                    case 1: goto L_0x0433;
                    case 2: goto L_0x0423;
                    case 3: goto L_0x0413;
                    case 4: goto L_0x03ff;
                    case 5: goto L_0x03ef;
                    case 6: goto L_0x03df;
                    case 7: goto L_0x03d3;
                    case 8: goto L_0x03bf;
                    case 9: goto L_0x03ab;
                    case 10: goto L_0x0397;
                    case 11: goto L_0x037a;
                    case 12: goto L_0x0366;
                    case 13: goto L_0x034e;
                    case 14: goto L_0x032d;
                    case 15: goto L_0x0319;
                    case 16: goto L_0x0305;
                    case 17: goto L_0x02f1;
                    case 18: goto L_0x02e1;
                    case 19: goto L_0x02d1;
                    case 20: goto L_0x02c1;
                    case 21: goto L_0x029e;
                    case 22: goto L_0x027b;
                    case 23: goto L_0x025c;
                    case 24: goto L_0x0240;
                    case 25: goto L_0x0230;
                    case 26: goto L_0x0220;
                    case 27: goto L_0x020c;
                    case 28: goto L_0x01f8;
                    case 29: goto L_0x01e8;
                    case 30: goto L_0x01d8;
                    case 31: goto L_0x01c1;
                    case 32: goto L_0x01ad;
                    case 33: goto L_0x0192;
                    case 34: goto L_0x0173;
                    case 35: goto L_0x015f;
                    case 36: goto L_0x014f;
                    case 37: goto L_0x0137;
                    case 38: goto L_0x011a;
                    case 39: goto L_0x00fe;
                    case 40: goto L_0x00ea;
                    case 41: goto L_0x00de;
                    case 42: goto L_0x00c8;
                    case 43: goto L_0x00b2;
                    case 44: goto L_0x008a;
                    case 45: goto L_0x0076;
                    case 46: goto L_0x005c;
                    case 47: goto L_0x0042;
                    case 48: goto L_0x002a;
                    case 49: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r9 = super.onTransact(r9, r10, r11, r12)
                return r9
            L_0x0010:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.e r9 = r8.u(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0026
                android.os.IBinder r2 = r9.asBinder()
            L_0x0026:
                r11.writeStrongBinder(r2)
                return r1
            L_0x002a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.IBinder r10 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.t r10 = com.ss.android.socialbase.downloader.depend.t.a.a(r10)
                r8.a((int) r9, (com.ss.android.socialbase.downloader.depend.t) r10)
                r11.writeNoException()
                return r1
            L_0x0042:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.w r9 = r8.t(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0058
                android.os.IBinder r2 = r9.asBinder()
            L_0x0058:
                r11.writeStrongBinder(r2)
                return r1
            L_0x005c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.depend.t r9 = r8.s(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0072
                android.os.IBinder r2 = r9.asBinder()
            L_0x0072:
                r11.writeStrongBinder(r2)
                return r1
            L_0x0076:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                r8.a((int) r9, (int) r10)
                r11.writeNoException()
                return r1
            L_0x008a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x0096
                goto L_0x00ab
            L_0x0096:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback"
                android.os.IInterface r10 = r9.queryLocalInterface(r10)
                if (r10 == 0) goto L_0x00a6
                boolean r12 = r10 instanceof com.ss.android.socialbase.downloader.depend.z
                if (r12 == 0) goto L_0x00a6
                r2 = r10
                com.ss.android.socialbase.downloader.depend.z r2 = (com.ss.android.socialbase.downloader.depend.z) r2
                goto L_0x00ab
            L_0x00a6:
                com.ss.android.socialbase.downloader.depend.z$a$a r2 = new com.ss.android.socialbase.downloader.depend.z$a$a
                r2.<init>(r9)
            L_0x00ab:
                r8.a((com.ss.android.socialbase.downloader.depend.z) r2)
                r11.writeNoException()
                return r1
            L_0x00b2:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.b> r12 = com.ss.android.socialbase.downloader.model.b.CREATOR
                java.util.ArrayList r10 = r10.createTypedArrayList(r12)
                r8.b((int) r9, (java.util.List<com.ss.android.socialbase.downloader.model.b>) r10)
                r11.writeNoException()
                return r1
            L_0x00c8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.b> r12 = com.ss.android.socialbase.downloader.model.b.CREATOR
                java.util.ArrayList r10 = r10.createTypedArrayList(r12)
                r8.a((int) r9, (java.util.List<com.ss.android.socialbase.downloader.model.b>) r10)
                r11.writeNoException()
                return r1
            L_0x00de:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                r8.d()
                r11.writeNoException()
                return r1
            L_0x00ea:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.r(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x00fe:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r12 = r10.readInt()
                int r0 = r10.readInt()
                int r10 = r10.readInt()
                r8.a((int) r9, (int) r12, (int) r0, (int) r10)
                r11.writeNoException()
                return r1
            L_0x011a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r3 = r10.readInt()
                int r4 = r10.readInt()
                int r5 = r10.readInt()
                long r6 = r10.readLong()
                r2 = r8
                r2.a((int) r3, (int) r4, (int) r5, (long) r6)
                r11.writeNoException()
                return r1
            L_0x0137:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r12 = r10.readInt()
                long r2 = r10.readLong()
                r8.a(r9, r12, r2)
                r11.writeNoException()
                return r1
            L_0x014f:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.q(r9)
                r11.writeNoException()
                return r1
            L_0x015f:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.p(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0173:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0187
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r9 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r2
            L_0x0187:
                boolean r9 = r8.b((com.ss.android.socialbase.downloader.model.DownloadInfo) r2)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0192:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x01a6
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.b> r9 = com.ss.android.socialbase.downloader.model.b.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.b r2 = (com.ss.android.socialbase.downloader.model.b) r2
            L_0x01a6:
                r8.a((com.ss.android.socialbase.downloader.model.b) r2)
                r11.writeNoException()
                return r1
            L_0x01ad:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r9 = r8.o(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01c1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r10 = r10.readInt()
                if (r10 == 0) goto L_0x01d1
                r0 = 1
            L_0x01d1:
                r8.a((int) r9, (boolean) r0)
                r11.writeNoException()
                return r1
            L_0x01d8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.c()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x01e8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.n(r9)
                r11.writeNoException()
                return r1
            L_0x01f8:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.m(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x020c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.d((java.lang.String) r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0220:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                boolean r9 = r8.b()
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0230:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x023c
                r0 = 1
            L_0x023c:
                r8.a((boolean) r0)
                return r1
            L_0x0240:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r11 = r10.readInt()
                if (r11 == 0) goto L_0x0258
                android.os.Parcelable$Creator r11 = android.app.Notification.CREATOR
                java.lang.Object r10 = r11.createFromParcel(r10)
                r2 = r10
                android.app.Notification r2 = (android.app.Notification) r2
            L_0x0258:
                r8.a((int) r9, (android.app.Notification) r2)
                return r1
            L_0x025c:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0270
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r9 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r2 = r9
                com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r2
            L_0x0270:
                boolean r9 = r8.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r2)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x027b:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.IBinder r12 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.g r12 = com.ss.android.socialbase.downloader.depend.g.a.a(r12)
                int r2 = r10.readInt()
                int r10 = r10.readInt()
                if (r10 == 0) goto L_0x0297
                r0 = 1
            L_0x0297:
                r8.b(r9, r12, r2, r0)
                r11.writeNoException()
                return r1
            L_0x029e:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                android.os.IBinder r12 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.depend.g r12 = com.ss.android.socialbase.downloader.depend.g.a.a(r12)
                int r2 = r10.readInt()
                int r10 = r10.readInt()
                if (r10 == 0) goto L_0x02ba
                r0 = 1
            L_0x02ba:
                r8.a((int) r9, (com.ss.android.socialbase.downloader.depend.g) r12, (int) r2, (boolean) r0)
                r11.writeNoException()
                return r1
            L_0x02c1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.l(r9)
                r11.writeNoException()
                return r1
            L_0x02d1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.k(r9)
                r11.writeNoException()
                return r1
            L_0x02e1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.util.ArrayList r9 = r10.createStringArrayList()
                r8.a((java.util.List<java.lang.String>) r9)
                r11.writeNoException()
                return r1
            L_0x02f1:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.c((java.lang.String) r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0305:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.b((java.lang.String) r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x0319:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.util.List r9 = r8.a((java.lang.String) r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x032d:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.lang.String r10 = r10.readString()
                com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r8.b((java.lang.String) r9, (java.lang.String) r10)
                r11.writeNoException()
                if (r9 == 0) goto L_0x034a
                r11.writeInt(r1)
                r9.writeToParcel(r11, r1)
                goto L_0x034d
            L_0x034a:
                r11.writeInt(r0)
            L_0x034d:
                return r1
            L_0x034e:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                java.lang.String r9 = r10.readString()
                java.lang.String r10 = r10.readString()
                int r9 = r8.a((java.lang.String) r9, (java.lang.String) r10)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0366:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                java.util.List r9 = r8.j(r9)
                r11.writeNoException()
                r11.writeTypedList(r9)
                return r1
            L_0x037a:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r8.i(r9)
                r11.writeNoException()
                if (r9 == 0) goto L_0x0393
                r11.writeInt(r1)
                r9.writeToParcel(r11, r1)
                goto L_0x0396
            L_0x0393:
                r11.writeInt(r0)
            L_0x0396:
                return r1
            L_0x0397:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.h(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x03ab:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                int r9 = r8.g(r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x03bf:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                long r9 = r8.f(r9)
                r11.writeNoException()
                r11.writeLong(r9)
                return r1
            L_0x03d3:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                r8.a()
                r11.writeNoException()
                return r1
            L_0x03df:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.e(r9)
                r11.writeNoException()
                return r1
            L_0x03ef:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.d((int) r9)
                r11.writeNoException()
                return r1
            L_0x03ff:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                boolean r9 = r8.c((int) r9)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
            L_0x0413:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.b((int) r9)
                r11.writeNoException()
                return r1
            L_0x0423:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                int r9 = r10.readInt()
                r8.a((int) r9)
                r11.writeNoException()
                return r1
            L_0x0433:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r10.enforceInterface(r9)
                android.os.IBinder r9 = r10.readStrongBinder()
                if (r9 != 0) goto L_0x043f
                goto L_0x0454
            L_0x043f:
                java.lang.String r10 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                android.os.IInterface r10 = r9.queryLocalInterface(r10)
                if (r10 == 0) goto L_0x044f
                boolean r12 = r10 instanceof com.ss.android.socialbase.downloader.model.a
                if (r12 == 0) goto L_0x044f
                r2 = r10
                com.ss.android.socialbase.downloader.model.a r2 = (com.ss.android.socialbase.downloader.model.a) r2
                goto L_0x0454
            L_0x044f:
                com.ss.android.socialbase.downloader.model.a$a$a r2 = new com.ss.android.socialbase.downloader.model.a$a$a
                r2.<init>(r9)
            L_0x0454:
                r8.a((com.ss.android.socialbase.downloader.model.a) r2)
                r11.writeNoException()
                return r1
            L_0x045b:
                java.lang.String r9 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r11.writeString(r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.h.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    int a(String str, String str2) throws RemoteException;

    List<DownloadInfo> a(String str) throws RemoteException;

    void a() throws RemoteException;

    void a(int i) throws RemoteException;

    void a(int i, int i2) throws RemoteException;

    void a(int i, int i2, int i3, int i4) throws RemoteException;

    void a(int i, int i2, int i3, long j) throws RemoteException;

    void a(int i, int i2, long j) throws RemoteException;

    void a(int i, Notification notification) throws RemoteException;

    void a(int i, g gVar, int i2, boolean z) throws RemoteException;

    void a(int i, t tVar) throws RemoteException;

    void a(int i, List<b> list) throws RemoteException;

    void a(int i, boolean z) throws RemoteException;

    void a(z zVar) throws RemoteException;

    void a(com.ss.android.socialbase.downloader.model.a aVar) throws RemoteException;

    void a(b bVar) throws RemoteException;

    void a(List<String> list) throws RemoteException;

    void a(boolean z) throws RemoteException;

    boolean a(DownloadInfo downloadInfo) throws RemoteException;

    DownloadInfo b(String str, String str2) throws RemoteException;

    List<DownloadInfo> b(String str) throws RemoteException;

    void b(int i) throws RemoteException;

    void b(int i, g gVar, int i2, boolean z) throws RemoteException;

    void b(int i, List<b> list) throws RemoteException;

    boolean b() throws RemoteException;

    boolean b(DownloadInfo downloadInfo) throws RemoteException;

    List<DownloadInfo> c(String str) throws RemoteException;

    boolean c() throws RemoteException;

    boolean c(int i) throws RemoteException;

    List<DownloadInfo> d(String str) throws RemoteException;

    void d() throws RemoteException;

    void d(int i) throws RemoteException;

    void e(int i) throws RemoteException;

    long f(int i) throws RemoteException;

    int g(int i) throws RemoteException;

    boolean h(int i) throws RemoteException;

    DownloadInfo i(int i) throws RemoteException;

    List<b> j(int i) throws RemoteException;

    void k(int i) throws RemoteException;

    void l(int i) throws RemoteException;

    boolean m(int i) throws RemoteException;

    void n(int i) throws RemoteException;

    int o(int i) throws RemoteException;

    boolean p(int i) throws RemoteException;

    void q(int i) throws RemoteException;

    boolean r(int i) throws RemoteException;

    t s(int i) throws RemoteException;

    w t(int i) throws RemoteException;

    e u(int i) throws RemoteException;
}
