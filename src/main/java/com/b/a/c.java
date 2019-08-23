package com.b.a;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Slog;
import com.b.a.a;
import com.b.a.b;
import java.lang.ref.WeakReference;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static b f7424b;

    /* renamed from: c  reason: collision with root package name */
    private static c f7425c;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Object> f7426a;

    public static c a() {
        if (f7424b == null) {
            synchronized (c.class) {
                if (f7424b == null) {
                    f7425c = new c();
                }
            }
        }
        return f7425c;
    }

    private c() {
        b bVar;
        IBinder checkService = ServiceManager.checkService("oiface");
        if (checkService == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = checkService.queryLocalInterface("com.oppo.oiface.IOIfaceService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                bVar = new b.a.C0050a(checkService);
            } else {
                bVar = (b) queryLocalInterface;
            }
        }
        f7424b = bVar;
        if (bVar != null) {
            try {
                f7424b.a((a) new a.C0048a() {
                    public final void a(String str) throws RemoteException {
                        if (c.this.f7426a != null && c.this.f7426a.get() != null) {
                            c.this.f7426a.get();
                        }
                    }
                });
            } catch (DeadObjectException e2) {
                Slog.d("OppoManager", "IOIfaceService onSystemNotify err: " + e2);
                f7424b = null;
            } catch (RemoteException e3) {
                Slog.d("OppoManager", "IOIfaceService onSystemNotify error" + e3);
            }
        }
    }

    public static String b() {
        if (f7424b == null) {
            return null;
        }
        try {
            return f7424b.b() + ":2.0";
        } catch (DeadObjectException e2) {
            Slog.d("OppoManager", "IOIfaceService getOifaceversion err: " + e2);
            f7424b = null;
            return null;
        } catch (RemoteException e3) {
            Slog.d("OppoManager", "current package error" + e3);
            return null;
        }
    }

    public static boolean a(String str) {
        if (f7424b == null) {
            return false;
        }
        try {
            f7424b.a(str);
        } catch (DeadObjectException e2) {
            Slog.d("OppoManager", "IOIfaceService currentPackage err: " + e2);
            f7424b = null;
        } catch (RemoteException e3) {
            Slog.d("OppoManager", "current package error" + e3);
        }
        return true;
    }
}
