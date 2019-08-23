package io.fabric.sdk.android.services.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f83167a;

    static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private boolean f83168a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f83169b;

        private a() {
            this.f83169b = new LinkedBlockingQueue<>(1);
        }

        public final IBinder a() {
            this.f83168a = true;
            try {
                return this.f83169b.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f83169b.clear();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f83169b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    static final class b implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f83170a;

        public final IBinder asBinder() {
            return this.f83170a;
        }

        /* JADX INFO: finally extract failed */
        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f83170a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                obtain2.recycle();
                obtain.recycle();
                return readString;
            } catch (Exception unused) {
                obtain2.recycle();
                obtain.recycle();
                return null;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }

        public final boolean b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z = false;
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f83170a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        }

        public b(IBinder iBinder) {
            this.f83170a = iBinder;
        }
    }

    public final b a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            this.f83167a.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.f83167a.bindService(intent, aVar, 1)) {
                    b bVar = new b(aVar.a());
                    b bVar2 = new b(bVar.a(), bVar.b());
                    this.f83167a.unbindService(aVar);
                    return bVar2;
                }
            } catch (Exception unused) {
                this.f83167a.unbindService(aVar);
            } catch (Throwable unused2) {
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused3) {
            return null;
        } catch (Exception unused4) {
            return null;
        }
    }

    public e(Context context) {
        this.f83167a = context.getApplicationContext();
    }
}
