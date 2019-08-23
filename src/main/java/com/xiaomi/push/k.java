package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class k {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f82410a;

        /* renamed from: a  reason: collision with other field name */
        private final boolean f860a;

        a(String str, boolean z) {
            this.f82410a = str;
            this.f860a = z;
        }

        public final String a() {
            return this.f82410a;
        }
    }

    static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f82411a;

        /* renamed from: a  reason: collision with other field name */
        boolean f861a;

        private b() {
            this.f82411a = new LinkedBlockingQueue<>(1);
        }

        public final IBinder a() {
            if (!this.f861a) {
                this.f861a = true;
                return this.f82411a.poll(30000, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f82411a.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    static final class c implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f82412a;

        public c(IBinder iBinder) {
            this.f82412a = iBinder;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f82412a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.f82412a;
        }
    }

    public static a a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                b bVar = new b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, bVar, 1)) {
                    try {
                        IBinder a2 = bVar.a();
                        if (a2 != null) {
                            a aVar = new a(new c(a2).a(), false);
                            context.unbindService(bVar);
                            return aVar;
                        }
                        context.unbindService(bVar);
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Throwable th) {
                        context.unbindService(bVar);
                        throw th;
                    }
                }
                throw new IOException("Google Play connection failed");
            } catch (Exception e3) {
                throw e3;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }
}
