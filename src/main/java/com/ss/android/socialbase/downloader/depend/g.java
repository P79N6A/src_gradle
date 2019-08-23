package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* renamed from: com.ss.android.socialbase.downloader.depend.g$a$a  reason: collision with other inner class name */
        static class C0378a implements g {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f30881a;

            public final IBinder asBinder() {
                return this.f30881a;
            }

            C0378a(IBinder iBinder) {
                this.f30881a = iBinder;
            }

            public final void a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void c(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void e(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void f(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void g(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void h(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void c(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30881a.transact(11, obtain, obtain2, 0);
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
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof g)) {
                return new C0378a(iBinder);
            }
            return (g) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v17, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v29, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v32, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r0v37 */
        /* JADX WARNING: type inference failed for: r0v38 */
        /* JADX WARNING: type inference failed for: r0v39 */
        /* JADX WARNING: type inference failed for: r0v40 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: type inference failed for: r0v43 */
        /* JADX WARNING: type inference failed for: r0v44 */
        /* JADX WARNING: type inference failed for: r0v45 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            /*
                r2 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r3 == r0) goto L_0x0168
                r0 = 0
                switch(r3) {
                    case 1: goto L_0x014d;
                    case 2: goto L_0x0132;
                    case 3: goto L_0x0117;
                    case 4: goto L_0x00fc;
                    case 5: goto L_0x00e1;
                    case 6: goto L_0x00b6;
                    case 7: goto L_0x009b;
                    case 8: goto L_0x0080;
                    case 9: goto L_0x0065;
                    case 10: goto L_0x003a;
                    case 11: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r3 = super.onTransact(r3, r4, r5, r6)
                return r3
            L_0x000f:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0023
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r3
                goto L_0x0024
            L_0x0023:
                r3 = r0
            L_0x0024:
                int r6 = r4.readInt()
                if (r6 == 0) goto L_0x0033
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.exception.BaseException> r6 = com.ss.android.socialbase.downloader.exception.BaseException.CREATOR
                java.lang.Object r4 = r6.createFromParcel(r4)
                r0 = r4
                com.ss.android.socialbase.downloader.exception.BaseException r0 = (com.ss.android.socialbase.downloader.exception.BaseException) r0
            L_0x0033:
                r2.c(r3, r0)
                r5.writeNoException()
                return r1
            L_0x003a:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x004e
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r3
                goto L_0x004f
            L_0x004e:
                r3 = r0
            L_0x004f:
                int r6 = r4.readInt()
                if (r6 == 0) goto L_0x005e
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.exception.BaseException> r6 = com.ss.android.socialbase.downloader.exception.BaseException.CREATOR
                java.lang.Object r4 = r6.createFromParcel(r4)
                r0 = r4
                com.ss.android.socialbase.downloader.exception.BaseException r0 = (com.ss.android.socialbase.downloader.exception.BaseException) r0
            L_0x005e:
                r2.b(r3, r0)
                r5.writeNoException()
                return r1
            L_0x0065:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0079
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0079:
                r2.h(r0)
                r5.writeNoException()
                return r1
            L_0x0080:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0094
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0094:
                r2.g(r0)
                r5.writeNoException()
                return r1
            L_0x009b:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x00af
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x00af:
                r2.f(r0)
                r5.writeNoException()
                return r1
            L_0x00b6:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x00ca
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r3
                goto L_0x00cb
            L_0x00ca:
                r3 = r0
            L_0x00cb:
                int r6 = r4.readInt()
                if (r6 == 0) goto L_0x00da
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.exception.BaseException> r6 = com.ss.android.socialbase.downloader.exception.BaseException.CREATOR
                java.lang.Object r4 = r6.createFromParcel(r4)
                r0 = r4
                com.ss.android.socialbase.downloader.exception.BaseException r0 = (com.ss.android.socialbase.downloader.exception.BaseException) r0
            L_0x00da:
                r2.a(r3, r0)
                r5.writeNoException()
                return r1
            L_0x00e1:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x00f5
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x00f5:
                r2.e(r0)
                r5.writeNoException()
                return r1
            L_0x00fc:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0110
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0110:
                r2.d(r0)
                r5.writeNoException()
                return r1
            L_0x0117:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x012b
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x012b:
                r2.c(r0)
                r5.writeNoException()
                return r1
            L_0x0132:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0146
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0146:
                r2.b(r0)
                r5.writeNoException()
                return r1
            L_0x014d:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0161
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0161:
                r2.a(r0)
                r5.writeNoException()
                return r1
            L_0x0168:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r5.writeString(r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.depend.g.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void a(DownloadInfo downloadInfo) throws RemoteException;

    void a(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    void b(DownloadInfo downloadInfo) throws RemoteException;

    void b(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    void c(DownloadInfo downloadInfo) throws RemoteException;

    void c(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    void d(DownloadInfo downloadInfo) throws RemoteException;

    void e(DownloadInfo downloadInfo) throws RemoteException;

    void f(DownloadInfo downloadInfo) throws RemoteException;

    void g(DownloadInfo downloadInfo) throws RemoteException;

    void h(DownloadInfo downloadInfo) throws RemoteException;
}
