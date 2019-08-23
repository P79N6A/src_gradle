package com.bytedance.frameworks.plugin.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.frameworks.plugin.a.b;
import com.bytedance.frameworks.plugin.component.broadcast.c;
import java.util.List;

public interface a extends IInterface {

    /* renamed from: com.bytedance.frameworks.plugin.pm.a$a  reason: collision with other inner class name */
    public static abstract class C0172a extends Binder implements a {

        /* renamed from: com.bytedance.frameworks.plugin.pm.a$a$a  reason: collision with other inner class name */
        static class C0014a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f2269a;

            public final IBinder asBinder() {
                return this.f2269a;
            }

            public final boolean a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f2269a.transact(2, obtain, obtain2, 0);
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

            public final List<String> e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    this.f2269a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    this.f2269a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<com.bytedance.frameworks.plugin.a.a> f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    this.f2269a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(com.bytedance.frameworks.plugin.a.a.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<b> h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    this.f2269a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(b.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<String> b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    this.f2269a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    this.f2269a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<String> a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    this.f2269a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    boolean z = false;
                    this.f2269a.transact(23, obtain, obtain2, 0);
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

            C0014a(IBinder iBinder) {
                this.f2269a = iBinder;
            }

            public final int c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    this.f2269a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final com.bytedance.frameworks.plugin.a.a f(String str) throws RemoteException {
                com.bytedance.frameworks.plugin.a.a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    this.f2269a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        aVar = com.bytedance.frameworks.plugin.a.a.CREATOR.createFromParcel(obtain2);
                    } else {
                        aVar = null;
                    }
                    return aVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String h(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    this.f2269a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean i(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f2269a.transact(32, obtain, obtain2, 0);
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

            public final int j(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    this.f2269a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final b k(String str) throws RemoteException {
                b bVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    this.f2269a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bVar = b.CREATOR.createFromParcel(obtain2);
                    } else {
                        bVar = null;
                    }
                    return bVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void g(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    this.f2269a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean e(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f2269a.transact(25, obtain, obtain2, 0);
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

            public final boolean b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f2269a.transact(17, obtain, obtain2, 0);
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

            public final boolean d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f2269a.transact(22, obtain, obtain2, 0);
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

            public final boolean a(b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    boolean z = true;
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2269a.transact(37, obtain, obtain2, 0);
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

            public final ProviderInfo b(String str, int i) throws RemoteException {
                ProviderInfo providerInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        providerInfo = (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        providerInfo = null;
                    }
                    return providerInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int d(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ActivityInfo a(ComponentName componentName, int i) throws RemoteException {
                ActivityInfo activityInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f2269a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        activityInfo = (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        activityInfo = null;
                    }
                    return activityInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ActivityInfo b(ComponentName componentName, int i) throws RemoteException {
                ActivityInfo activityInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f2269a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        activityInfo = (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        activityInfo = null;
                    }
                    return activityInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ApplicationInfo c(String str, int i) throws RemoteException {
                ApplicationInfo applicationInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        applicationInfo = (ApplicationInfo) ApplicationInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        applicationInfo = null;
                    }
                    return applicationInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ProviderInfo d(ComponentName componentName, int i) throws RemoteException {
                ProviderInfo providerInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f2269a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        providerInfo = (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        providerInfo = null;
                    }
                    return providerInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final PackageInfo a(String str, int i) throws RemoteException {
                PackageInfo packageInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        packageInfo = (PackageInfo) PackageInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        packageInfo = null;
                    }
                    return packageInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ServiceInfo c(ComponentName componentName, int i) throws RemoteException {
                ServiceInfo serviceInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f2269a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        serviceInfo = (ServiceInfo) ServiceInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        serviceInfo = null;
                    }
                    return serviceInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<c> e(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(c.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int a(String str, boolean z, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.f2269a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<ResolveInfo> e(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ResolveInfo d(Intent intent, String str, int i) throws RemoteException {
                ResolveInfo resolveInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        resolveInfo = (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        resolveInfo = null;
                    }
                    return resolveInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<ResolveInfo> f(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ResolveInfo a(Intent intent, String str, int i) throws RemoteException {
                ResolveInfo resolveInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        resolveInfo = (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        resolveInfo = null;
                    }
                    return resolveInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<ResolveInfo> b(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<ResolveInfo> c(Intent intent, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f2269a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<ProviderInfo> a(String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f2269a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C0172a() {
            attachInterface(this, "com.bytedance.frameworks.plugin.pm.IPluginPackageManager");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.content.ComponentName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.content.ComponentName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.content.ComponentName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.content.ComponentName} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: com.bytedance.frameworks.plugin.a.b} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v14, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v17, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v20, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v23, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v26, types: [android.content.Intent] */
        /* JADX WARNING: type inference failed for: r0v29, types: [android.content.Intent] */
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
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r4 == r0) goto L_0x040f
                r0 = 0
                r2 = 0
                switch(r4) {
                    case 1: goto L_0x03ee;
                    case 2: goto L_0x03da;
                    case 3: goto L_0x03ae;
                    case 4: goto L_0x0382;
                    case 5: goto L_0x0356;
                    case 6: goto L_0x032a;
                    case 7: goto L_0x02fa;
                    case 8: goto L_0x02d3;
                    case 9: goto L_0x02ac;
                    case 10: goto L_0x027c;
                    case 11: goto L_0x0255;
                    case 12: goto L_0x022e;
                    case 13: goto L_0x020d;
                    case 14: goto L_0x01ec;
                    case 15: goto L_0x01cd;
                    case 16: goto L_0x01b5;
                    case 17: goto L_0x01a1;
                    case 18: goto L_0x0185;
                    case 19: goto L_0x0171;
                    case 20: goto L_0x0161;
                    case 21: goto L_0x0151;
                    case 22: goto L_0x013d;
                    case 23: goto L_0x012d;
                    case 24: goto L_0x0121;
                    case 25: goto L_0x010d;
                    case 26: goto L_0x00fd;
                    case 27: goto L_0x00e0;
                    case 28: goto L_0x00d0;
                    case 29: goto L_0x00c0;
                    case 30: goto L_0x00b0;
                    case 31: goto L_0x009c;
                    case 32: goto L_0x0088;
                    case 33: goto L_0x0074;
                    case 34: goto L_0x005c;
                    case 35: goto L_0x003f;
                    case 36: goto L_0x002f;
                    case 37: goto L_0x0010;
                    default: goto L_0x000b;
                }
            L_0x000b:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0010:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0024
                android.os.Parcelable$Creator<com.bytedance.frameworks.plugin.a.b> r4 = com.bytedance.frameworks.plugin.a.b.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.bytedance.frameworks.plugin.a.b r0 = (com.bytedance.frameworks.plugin.a.b) r0
            L_0x0024:
                boolean r4 = r3.a((com.bytedance.frameworks.plugin.a.b) r0)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x002f:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.util.List r4 = r3.h()
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x003f:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                com.bytedance.frameworks.plugin.a.b r4 = r3.k(r4)
                r6.writeNoException()
                if (r4 == 0) goto L_0x0058
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x005b
            L_0x0058:
                r6.writeInt(r2)
            L_0x005b:
                return r1
            L_0x005c:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                java.util.List r4 = r3.e(r4, r5)
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x0074:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r4 = r3.j(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0088:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                boolean r4 = r3.i(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x009c:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                java.lang.String r4 = r3.h(r4)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L_0x00b0:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r3.g()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L_0x00c0:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                r3.g(r4)
                r6.writeNoException()
                return r1
            L_0x00d0:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.util.List r4 = r3.f()
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x00e0:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                com.bytedance.frameworks.plugin.a.a r4 = r3.f(r4)
                r6.writeNoException()
                if (r4 == 0) goto L_0x00f9
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x00fc
            L_0x00f9:
                r6.writeInt(r2)
            L_0x00fc:
                return r1
            L_0x00fd:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.util.List r4 = r3.e()
                r6.writeNoException()
                r6.writeStringList(r4)
                return r1
            L_0x010d:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                boolean r4 = r3.e(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0121:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                r3.d()
                r6.writeNoException()
                return r1
            L_0x012d:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                boolean r4 = r3.c()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x013d:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                boolean r4 = r3.d(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0151:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.util.List r4 = r3.b()
                r6.writeNoException()
                r6.writeStringList(r4)
                return r1
            L_0x0161:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.util.List r4 = r3.a()
                r6.writeNoException()
                r6.writeStringList(r4)
                return r1
            L_0x0171:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r4 = r3.c(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0185:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                java.lang.String r7 = r5.readString()
                int r5 = r5.readInt()
                java.util.List r4 = r3.a((java.lang.String) r4, (java.lang.String) r7, (int) r5)
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x01a1:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                boolean r4 = r3.b(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x01b5:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                int r4 = r3.d((java.lang.String) r4, (int) r5)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x01cd:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x01dd
                r2 = 1
            L_0x01dd:
                int r5 = r5.readInt()
                int r4 = r3.a((java.lang.String) r4, (boolean) r2, (int) r5)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x01ec:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                android.content.pm.ApplicationInfo r4 = r3.c((java.lang.String) r4, (int) r5)
                r6.writeNoException()
                if (r4 == 0) goto L_0x0209
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x020c
            L_0x0209:
                r6.writeInt(r2)
            L_0x020c:
                return r1
            L_0x020d:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                android.content.pm.ProviderInfo r4 = r3.b((java.lang.String) r4, (int) r5)
                r6.writeNoException()
                if (r4 == 0) goto L_0x022a
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x022d
            L_0x022a:
                r6.writeInt(r2)
            L_0x022d:
                return r1
            L_0x022e:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0242
                android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x0242:
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                java.util.List r4 = r3.f(r0, r4, r5)
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x0255:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0269
                android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x0269:
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                java.util.List r4 = r3.e(r0, r4, r5)
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x027c:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0290
                android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x0290:
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                android.content.pm.ResolveInfo r4 = r3.d(r0, r4, r5)
                r6.writeNoException()
                if (r4 == 0) goto L_0x02a8
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x02ab
            L_0x02a8:
                r6.writeInt(r2)
            L_0x02ab:
                return r1
            L_0x02ac:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x02c0
                android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x02c0:
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                java.util.List r4 = r3.c(r0, r4, r5)
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x02d3:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x02e7
                android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x02e7:
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                java.util.List r4 = r3.b(r0, r4, r5)
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r1
            L_0x02fa:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x030e
                android.os.Parcelable$Creator r4 = android.content.Intent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.Intent r0 = (android.content.Intent) r0
            L_0x030e:
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                android.content.pm.ResolveInfo r4 = r3.a((android.content.Intent) r0, (java.lang.String) r4, (int) r5)
                r6.writeNoException()
                if (r4 == 0) goto L_0x0326
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x0329
            L_0x0326:
                r6.writeInt(r2)
            L_0x0329:
                return r1
            L_0x032a:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x033e
                android.os.Parcelable$Creator r4 = android.content.ComponentName.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.ComponentName r0 = (android.content.ComponentName) r0
            L_0x033e:
                int r4 = r5.readInt()
                android.content.pm.ProviderInfo r4 = r3.d((android.content.ComponentName) r0, (int) r4)
                r6.writeNoException()
                if (r4 == 0) goto L_0x0352
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x0355
            L_0x0352:
                r6.writeInt(r2)
            L_0x0355:
                return r1
            L_0x0356:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x036a
                android.os.Parcelable$Creator r4 = android.content.ComponentName.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.ComponentName r0 = (android.content.ComponentName) r0
            L_0x036a:
                int r4 = r5.readInt()
                android.content.pm.ServiceInfo r4 = r3.c((android.content.ComponentName) r0, (int) r4)
                r6.writeNoException()
                if (r4 == 0) goto L_0x037e
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x0381
            L_0x037e:
                r6.writeInt(r2)
            L_0x0381:
                return r1
            L_0x0382:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0396
                android.os.Parcelable$Creator r4 = android.content.ComponentName.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.ComponentName r0 = (android.content.ComponentName) r0
            L_0x0396:
                int r4 = r5.readInt()
                android.content.pm.ActivityInfo r4 = r3.b((android.content.ComponentName) r0, (int) r4)
                r6.writeNoException()
                if (r4 == 0) goto L_0x03aa
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x03ad
            L_0x03aa:
                r6.writeInt(r2)
            L_0x03ad:
                return r1
            L_0x03ae:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x03c2
                android.os.Parcelable$Creator r4 = android.content.ComponentName.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.content.ComponentName r0 = (android.content.ComponentName) r0
            L_0x03c2:
                int r4 = r5.readInt()
                android.content.pm.ActivityInfo r4 = r3.a((android.content.ComponentName) r0, (int) r4)
                r6.writeNoException()
                if (r4 == 0) goto L_0x03d6
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x03d9
            L_0x03d6:
                r6.writeInt(r2)
            L_0x03d9:
                return r1
            L_0x03da:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                boolean r4 = r3.a((java.lang.String) r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x03ee:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r5 = r5.readInt()
                android.content.pm.PackageInfo r4 = r3.a((java.lang.String) r4, (int) r5)
                r6.writeNoException()
                if (r4 == 0) goto L_0x040b
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L_0x040e
            L_0x040b:
                r6.writeInt(r2)
            L_0x040e:
                return r1
            L_0x040f:
                java.lang.String r4 = "com.bytedance.frameworks.plugin.pm.IPluginPackageManager"
                r6.writeString(r4)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.a.C0172a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    int a(String str, boolean z, int i) throws RemoteException;

    ActivityInfo a(ComponentName componentName, int i) throws RemoteException;

    PackageInfo a(String str, int i) throws RemoteException;

    ResolveInfo a(Intent intent, String str, int i) throws RemoteException;

    List<String> a() throws RemoteException;

    List<ProviderInfo> a(String str, String str2, int i) throws RemoteException;

    boolean a(b bVar) throws RemoteException;

    boolean a(String str) throws RemoteException;

    ActivityInfo b(ComponentName componentName, int i) throws RemoteException;

    ProviderInfo b(String str, int i) throws RemoteException;

    List<String> b() throws RemoteException;

    List<ResolveInfo> b(Intent intent, String str, int i) throws RemoteException;

    boolean b(String str) throws RemoteException;

    int c(String str) throws RemoteException;

    ApplicationInfo c(String str, int i) throws RemoteException;

    ServiceInfo c(ComponentName componentName, int i) throws RemoteException;

    List<ResolveInfo> c(Intent intent, String str, int i) throws RemoteException;

    boolean c() throws RemoteException;

    int d(String str, int i) throws RemoteException;

    ProviderInfo d(ComponentName componentName, int i) throws RemoteException;

    ResolveInfo d(Intent intent, String str, int i) throws RemoteException;

    void d() throws RemoteException;

    boolean d(String str) throws RemoteException;

    List<String> e() throws RemoteException;

    List<ResolveInfo> e(Intent intent, String str, int i) throws RemoteException;

    List<c> e(String str, int i) throws RemoteException;

    boolean e(String str) throws RemoteException;

    com.bytedance.frameworks.plugin.a.a f(String str) throws RemoteException;

    List<com.bytedance.frameworks.plugin.a.a> f() throws RemoteException;

    List<ResolveInfo> f(Intent intent, String str, int i) throws RemoteException;

    String g() throws RemoteException;

    void g(String str) throws RemoteException;

    String h(String str) throws RemoteException;

    List<b> h() throws RemoteException;

    boolean i(String str) throws RemoteException;

    int j(String str) throws RemoteException;

    b k(String str) throws RemoteException;
}
