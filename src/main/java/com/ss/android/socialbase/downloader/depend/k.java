package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.j;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        /* renamed from: com.ss.android.socialbase.downloader.depend.k$a$a  reason: collision with other inner class name */
        public static class C0381a implements k {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f30884a;

            public final IBinder asBinder() {
                return this.f30884a;
            }

            public C0381a(IBinder iBinder) {
                this.f30884a = iBinder;
            }

            public final boolean a(long j, long j2, j jVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f30884a.transact(1, obtain, obtain2, 0);
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
        }

        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            j jVar;
            j jVar2;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof j)) {
                        jVar2 = new j.a.C0380a(readStrongBinder);
                    } else {
                        jVar2 = (j) queryLocalInterface;
                    }
                    jVar = jVar2;
                }
                boolean a2 = a(readLong, readLong2, jVar);
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
        }
    }

    boolean a(long j, long j2, j jVar) throws RemoteException;
}
