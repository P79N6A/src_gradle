package com.bytedance.frameworks.plugin.am;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* renamed from: com.bytedance.frameworks.plugin.am.c$a$a  reason: collision with other inner class name */
        static class C0012a implements c {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f2151a;

            public final IBinder asBinder() {
                return this.f2151a;
            }

            public final void a(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (serviceInfo != null) {
                        obtain.writeInt(1);
                        serviceInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (serviceInfo2 != null) {
                        obtain.writeInt(1);
                        serviceInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f2151a.transact(17, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    obtain.writeStringList(list);
                    this.f2151a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C0012a(IBinder iBinder) {
                this.f2151a = iBinder;
            }

            public final boolean d(ActivityInfo activityInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    boolean z = true;
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(15, obtain, obtain2, 0);
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

            public final ActivityInfo a(ActivityInfo activityInfo) throws RemoteException {
                ActivityInfo activityInfo2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        activityInfo2 = (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        activityInfo2 = null;
                    }
                    return activityInfo2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ActivityInfo b(ActivityInfo activityInfo) throws RemoteException {
                ActivityInfo activityInfo2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        activityInfo2 = (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        activityInfo2 = null;
                    }
                    return activityInfo2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ServiceInfo c(ServiceInfo serviceInfo) throws RemoteException {
                ServiceInfo serviceInfo2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (serviceInfo != null) {
                        obtain.writeInt(1);
                        serviceInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        serviceInfo2 = (ServiceInfo) ServiceInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        serviceInfo2 = null;
                    }
                    return serviceInfo2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ProviderInfo a(ProviderInfo providerInfo) throws RemoteException {
                ProviderInfo providerInfo2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (providerInfo != null) {
                        obtain.writeInt(1);
                        providerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        providerInfo2 = (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        providerInfo2 = null;
                    }
                    return providerInfo2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c(ActivityInfo activityInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    boolean z = true;
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(13, obtain, obtain2, 0);
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

            public final ServiceInfo a(ServiceInfo serviceInfo) throws RemoteException {
                ServiceInfo serviceInfo2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (serviceInfo != null) {
                        obtain.writeInt(1);
                        serviceInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        serviceInfo2 = (ServiceInfo) ServiceInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        serviceInfo2 = null;
                    }
                    return serviceInfo2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean b(ProviderInfo providerInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    boolean z = true;
                    if (providerInfo != null) {
                        obtain.writeInt(1);
                        providerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(16, obtain, obtain2, 0);
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

            public final boolean b(ServiceInfo serviceInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    boolean z = true;
                    if (serviceInfo != null) {
                        obtain.writeInt(1);
                        serviceInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(14, obtain, obtain2, 0);
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

            public final void a(ActivityInfo activityInfo, ActivityInfo activityInfo2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (activityInfo2 != null) {
                        obtain.writeInt(1);
                        activityInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(ActivityInfo activityInfo, ActivityInfo activityInfo2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (activityInfo2 != null) {
                        obtain.writeInt(1);
                        activityInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void c(ActivityInfo activityInfo, ActivityInfo activityInfo2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (activityInfo2 != null) {
                        obtain.writeInt(1);
                        activityInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (serviceInfo != null) {
                        obtain.writeInt(1);
                        serviceInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (serviceInfo2 != null) {
                        obtain.writeInt(1);
                        serviceInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(ProviderInfo providerInfo, ProviderInfo providerInfo2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (providerInfo != null) {
                        obtain.writeInt(1);
                        providerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (providerInfo2 != null) {
                        obtain.writeInt(1);
                        providerInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(ActivityInfo activityInfo, ActivityInfo activityInfo2, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (activityInfo2 != null) {
                        obtain.writeInt(1);
                        activityInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2151a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(ApplicationInfo applicationInfo, String str, int i, b bVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.am.IPluginActivityManager");
                    if (applicationInfo != null) {
                        obtain.writeInt(1);
                        applicationInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f2151a.transact(5, obtain, obtain2, 0);
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
            attachInterface(this, "com.bytedance.frameworks.plugin.am.IPluginActivityManager");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.content.pm.ActivityInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.content.pm.ActivityInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.content.pm.ServiceInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.content.pm.ProviderInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.content.pm.ActivityInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: android.content.pm.ActivityInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: android.content.pm.ServiceInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: android.content.pm.ServiceInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: android.content.pm.ProviderInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: android.content.pm.ActivityInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: android.content.pm.ActivityInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: android.content.pm.ServiceInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: android.content.pm.ActivityInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: android.content.pm.ProviderInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: android.content.pm.ServiceInfo} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.frameworks.plugin.am.b] */
        /* JADX WARNING: type inference failed for: r2v21, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r2v54 */
        /* JADX WARNING: type inference failed for: r2v55 */
        /* JADX WARNING: type inference failed for: r2v56 */
        /* JADX WARNING: type inference failed for: r2v57 */
        /* JADX WARNING: type inference failed for: r2v58 */
        /* JADX WARNING: type inference failed for: r2v59 */
        /* JADX WARNING: type inference failed for: r2v60 */
        /* JADX WARNING: type inference failed for: r2v61 */
        /* JADX WARNING: type inference failed for: r2v62 */
        /* JADX WARNING: type inference failed for: r2v63 */
        /* JADX WARNING: type inference failed for: r2v64 */
        /* JADX WARNING: type inference failed for: r2v65 */
        /* JADX WARNING: type inference failed for: r2v66 */
        /* JADX WARNING: type inference failed for: r2v67 */
        /* JADX WARNING: type inference failed for: r2v68 */
        /* JADX WARNING: type inference failed for: r2v69 */
        /* JADX WARNING: type inference failed for: r2v70 */
        /* JADX WARNING: type inference failed for: r2v71 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x02f4
                r0 = 0
                r2 = 0
                switch(r5) {
                    case 1: goto L_0x02cc;
                    case 2: goto L_0x02a4;
                    case 3: goto L_0x027c;
                    case 4: goto L_0x0254;
                    case 5: goto L_0x0215;
                    case 6: goto L_0x01ea;
                    case 7: goto L_0x01af;
                    case 8: goto L_0x0184;
                    case 9: goto L_0x0159;
                    case 10: goto L_0x012e;
                    case 11: goto L_0x0103;
                    case 12: goto L_0x00d8;
                    case 13: goto L_0x00b9;
                    case 14: goto L_0x009a;
                    case 15: goto L_0x007b;
                    case 16: goto L_0x005c;
                    case 17: goto L_0x0048;
                    case 18: goto L_0x0038;
                    case 19: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0010:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0024
                android.os.Parcelable$Creator r5 = android.content.pm.ServiceInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ServiceInfo r2 = (android.content.pm.ServiceInfo) r2
            L_0x0024:
                android.content.pm.ServiceInfo r5 = r4.c((android.content.pm.ServiceInfo) r2)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0034
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0037
            L_0x0034:
                r7.writeInt(r0)
            L_0x0037:
                return r1
            L_0x0038:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                java.util.ArrayList r5 = r6.createStringArrayList()
                r4.a((java.util.List<java.lang.String>) r5)
                r7.writeNoException()
                return r1
            L_0x0048:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                java.lang.String r5 = r6.readString()
                java.lang.String r6 = r6.readString()
                r4.a((java.lang.String) r5, (java.lang.String) r6)
                r7.writeNoException()
                return r1
            L_0x005c:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0070
                android.os.Parcelable$Creator r5 = android.content.pm.ProviderInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ProviderInfo r2 = (android.content.pm.ProviderInfo) r2
            L_0x0070:
                boolean r5 = r4.b((android.content.pm.ProviderInfo) r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x007b:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x008f
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2
            L_0x008f:
                boolean r5 = r4.d(r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x009a:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ae
                android.os.Parcelable$Creator r5 = android.content.pm.ServiceInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ServiceInfo r2 = (android.content.pm.ServiceInfo) r2
            L_0x00ae:
                boolean r5 = r4.b((android.content.pm.ServiceInfo) r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00b9:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00cd
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2
            L_0x00cd:
                boolean r5 = r4.c((android.content.pm.ActivityInfo) r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00d8:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ec
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ActivityInfo r5 = (android.content.pm.ActivityInfo) r5
                goto L_0x00ed
            L_0x00ec:
                r5 = r2
            L_0x00ed:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00fc
                android.os.Parcelable$Creator r8 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2
            L_0x00fc:
                r4.c(r5, r2)
                r7.writeNoException()
                return r1
            L_0x0103:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0117
                android.os.Parcelable$Creator r5 = android.content.pm.ProviderInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ProviderInfo r5 = (android.content.pm.ProviderInfo) r5
                goto L_0x0118
            L_0x0117:
                r5 = r2
            L_0x0118:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0127
                android.os.Parcelable$Creator r8 = android.content.pm.ProviderInfo.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.content.pm.ProviderInfo r2 = (android.content.pm.ProviderInfo) r2
            L_0x0127:
                r4.a((android.content.pm.ProviderInfo) r5, (android.content.pm.ProviderInfo) r2)
                r7.writeNoException()
                return r1
            L_0x012e:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0142
                android.os.Parcelable$Creator r5 = android.content.pm.ServiceInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ServiceInfo r5 = (android.content.pm.ServiceInfo) r5
                goto L_0x0143
            L_0x0142:
                r5 = r2
            L_0x0143:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0152
                android.os.Parcelable$Creator r8 = android.content.pm.ServiceInfo.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.content.pm.ServiceInfo r2 = (android.content.pm.ServiceInfo) r2
            L_0x0152:
                r4.b((android.content.pm.ServiceInfo) r5, (android.content.pm.ServiceInfo) r2)
                r7.writeNoException()
                return r1
            L_0x0159:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x016d
                android.os.Parcelable$Creator r5 = android.content.pm.ServiceInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ServiceInfo r5 = (android.content.pm.ServiceInfo) r5
                goto L_0x016e
            L_0x016d:
                r5 = r2
            L_0x016e:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x017d
                android.os.Parcelable$Creator r8 = android.content.pm.ServiceInfo.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.content.pm.ServiceInfo r2 = (android.content.pm.ServiceInfo) r2
            L_0x017d:
                r4.a((android.content.pm.ServiceInfo) r5, (android.content.pm.ServiceInfo) r2)
                r7.writeNoException()
                return r1
            L_0x0184:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0198
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ActivityInfo r5 = (android.content.pm.ActivityInfo) r5
                goto L_0x0199
            L_0x0198:
                r5 = r2
            L_0x0199:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01a8
                android.os.Parcelable$Creator r8 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2
            L_0x01a8:
                r4.b((android.content.pm.ActivityInfo) r5, (android.content.pm.ActivityInfo) r2)
                r7.writeNoException()
                return r1
            L_0x01af:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01c3
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ActivityInfo r5 = (android.content.pm.ActivityInfo) r5
                goto L_0x01c4
            L_0x01c3:
                r5 = r2
            L_0x01c4:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01d3
                android.os.Parcelable$Creator r8 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.content.pm.ActivityInfo r8 = (android.content.pm.ActivityInfo) r8
                goto L_0x01d4
            L_0x01d3:
                r8 = r2
            L_0x01d4:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x01e3
                android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r2 = r6
                android.content.Intent r2 = (android.content.Intent) r2
            L_0x01e3:
                r4.a(r5, r8, r2)
                r7.writeNoException()
                return r1
            L_0x01ea:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01fe
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ActivityInfo r5 = (android.content.pm.ActivityInfo) r5
                goto L_0x01ff
            L_0x01fe:
                r5 = r2
            L_0x01ff:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x020e
                android.os.Parcelable$Creator r8 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2
            L_0x020e:
                r4.a((android.content.pm.ActivityInfo) r5, (android.content.pm.ActivityInfo) r2)
                r7.writeNoException()
                return r1
            L_0x0215:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0229
                android.os.Parcelable$Creator r5 = android.content.pm.ApplicationInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.content.pm.ApplicationInfo r5 = (android.content.pm.ApplicationInfo) r5
                goto L_0x022a
            L_0x0229:
                r5 = r2
            L_0x022a:
                java.lang.String r8 = r6.readString()
                int r0 = r6.readInt()
                android.os.IBinder r6 = r6.readStrongBinder()
                if (r6 != 0) goto L_0x0239
                goto L_0x024d
            L_0x0239:
                java.lang.String r2 = "com.bytedance.frameworks.plugin.am.IApplicationThread"
                android.os.IInterface r2 = r6.queryLocalInterface(r2)
                if (r2 == 0) goto L_0x0248
                boolean r3 = r2 instanceof com.bytedance.frameworks.plugin.am.b
                if (r3 == 0) goto L_0x0248
                com.bytedance.frameworks.plugin.am.b r2 = (com.bytedance.frameworks.plugin.am.b) r2
                goto L_0x024d
            L_0x0248:
                com.bytedance.frameworks.plugin.am.b$a$a r2 = new com.bytedance.frameworks.plugin.am.b$a$a
                r2.<init>(r6)
            L_0x024d:
                r4.a(r5, r8, r0, r2)
                r7.writeNoException()
                return r1
            L_0x0254:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0268
                android.os.Parcelable$Creator r5 = android.content.pm.ProviderInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ProviderInfo r2 = (android.content.pm.ProviderInfo) r2
            L_0x0268:
                android.content.pm.ProviderInfo r5 = r4.a((android.content.pm.ProviderInfo) r2)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0278
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x027b
            L_0x0278:
                r7.writeInt(r0)
            L_0x027b:
                return r1
            L_0x027c:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0290
                android.os.Parcelable$Creator r5 = android.content.pm.ServiceInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ServiceInfo r2 = (android.content.pm.ServiceInfo) r2
            L_0x0290:
                android.content.pm.ServiceInfo r5 = r4.a((android.content.pm.ServiceInfo) r2)
                r7.writeNoException()
                if (r5 == 0) goto L_0x02a0
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x02a3
            L_0x02a0:
                r7.writeInt(r0)
            L_0x02a3:
                return r1
            L_0x02a4:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2
            L_0x02b8:
                android.content.pm.ActivityInfo r5 = r4.b((android.content.pm.ActivityInfo) r2)
                r7.writeNoException()
                if (r5 == 0) goto L_0x02c8
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x02cb
            L_0x02c8:
                r7.writeInt(r0)
            L_0x02cb:
                return r1
            L_0x02cc:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r6.enforceInterface(r5)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x02e0
                android.os.Parcelable$Creator r5 = android.content.pm.ActivityInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.content.pm.ActivityInfo r2 = (android.content.pm.ActivityInfo) r2
            L_0x02e0:
                android.content.pm.ActivityInfo r5 = r4.a((android.content.pm.ActivityInfo) r2)
                r7.writeNoException()
                if (r5 == 0) goto L_0x02f0
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x02f3
            L_0x02f0:
                r7.writeInt(r0)
            L_0x02f3:
                return r1
            L_0x02f4:
                java.lang.String r5 = "com.bytedance.frameworks.plugin.am.IPluginActivityManager"
                r7.writeString(r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.am.c.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    ActivityInfo a(ActivityInfo activityInfo) throws RemoteException;

    ProviderInfo a(ProviderInfo providerInfo) throws RemoteException;

    ServiceInfo a(ServiceInfo serviceInfo) throws RemoteException;

    void a(ActivityInfo activityInfo, ActivityInfo activityInfo2) throws RemoteException;

    void a(ActivityInfo activityInfo, ActivityInfo activityInfo2, Intent intent) throws RemoteException;

    void a(ApplicationInfo applicationInfo, String str, int i, b bVar) throws RemoteException;

    void a(ProviderInfo providerInfo, ProviderInfo providerInfo2) throws RemoteException;

    void a(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) throws RemoteException;

    void a(String str, String str2) throws RemoteException;

    void a(List<String> list) throws RemoteException;

    ActivityInfo b(ActivityInfo activityInfo) throws RemoteException;

    void b(ActivityInfo activityInfo, ActivityInfo activityInfo2) throws RemoteException;

    void b(ServiceInfo serviceInfo, ServiceInfo serviceInfo2) throws RemoteException;

    boolean b(ProviderInfo providerInfo) throws RemoteException;

    boolean b(ServiceInfo serviceInfo) throws RemoteException;

    ServiceInfo c(ServiceInfo serviceInfo) throws RemoteException;

    void c(ActivityInfo activityInfo, ActivityInfo activityInfo2) throws RemoteException;

    boolean c(ActivityInfo activityInfo) throws RemoteException;

    boolean d(ActivityInfo activityInfo) throws RemoteException;
}
