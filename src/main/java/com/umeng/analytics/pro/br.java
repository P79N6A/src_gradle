package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

public class br {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f80532a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f80533b;

        /* access modifiers changed from: private */
        public String b() {
            return this.f80532a;
        }

        public final boolean a() {
            return this.f80533b;
        }

        a(String str, boolean z) {
            this.f80532a = str;
            this.f80533b = z;
        }
    }

    static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        boolean f80534a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f80535b;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private b() {
            this.f80535b = new LinkedBlockingQueue<>(1);
        }

        public final IBinder a() throws InterruptedException {
            if (!this.f80534a) {
                this.f80534a = true;
                return this.f80535b.take();
            }
            throw new IllegalStateException();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f80535b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    static final class c implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f80536a;

        public final IBinder asBinder() {
            return this.f80536a;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f80536a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public c(IBinder iBinder) {
            this.f80536a = iBinder;
        }

        public final boolean a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                boolean z2 = false;
                this.f80536a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static String a(Context context) {
        try {
            a b2 = b(context);
            if (b2 == null) {
                return null;
            }
            return b2.b();
        } catch (Exception unused) {
            return null;
        }
    }

    private static a b(Context context) throws Exception {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, bVar, 1)) {
                try {
                    c cVar = new c(bVar.a());
                    a aVar = new a(cVar.a(), cVar.a(true));
                    context.unbindService(bVar);
                    return aVar;
                } catch (Exception e2) {
                    throw e2;
                } catch (Throwable th) {
                    context.unbindService(bVar);
                    throw th;
                }
            } else {
                throw new IOException("Google Play connection failed");
            }
        } catch (Exception e3) {
            throw e3;
        }
    }
}
