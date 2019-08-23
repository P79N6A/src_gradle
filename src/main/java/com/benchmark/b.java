package com.benchmark;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.benchmark.g;
import com.benchmark.h;
import com.benchmark.k;
import com.benchmark.m;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class b {
    @SuppressLint({"CI_StaticFieldLeak"})
    private static b k;

    /* renamed from: a  reason: collision with root package name */
    public Context f7459a;

    /* renamed from: b  reason: collision with root package name */
    public i f7460b;

    /* renamed from: c  reason: collision with root package name */
    public a f7461c = new a(this, (byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public d f7462d = null;

    /* renamed from: e  reason: collision with root package name */
    public C0053b f7463e = null;

    /* renamed from: f  reason: collision with root package name */
    public c f7464f = null;
    public h g;
    public m h;
    Handler i = new Handler(Looper.getMainLooper());
    private boolean j;

    class a extends g.a {

        /* renamed from: a  reason: collision with root package name */
        Benchmark f7465a;

        private a() {
        }

        public final void a(Benchmark benchmark) {
            b.this.a((Runnable) new e(this, benchmark));
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }

        public final void a(Benchmark benchmark, String str) {
            b.this.a((Runnable) new d(this, benchmark, str));
        }

        public final void a(Benchmark benchmark, long[] jArr) {
            b.this.a((Runnable) new c(this, benchmark, jArr));
        }
    }

    /* renamed from: com.benchmark.b$b  reason: collision with other inner class name */
    public class C0053b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public List<Benchmark> f7467a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public a f7468b;

        public final void onServiceDisconnected(ComponentName componentName) {
            int i;
            b.this.g = null;
            if (b.this.f7460b != null) {
                int i2 = -1;
                if (this.f7468b.f7465a != null) {
                    i = this.f7468b.f7465a.id;
                } else {
                    i = -1;
                }
                if (this.f7468b.f7465a != null) {
                    i2 = this.f7468b.f7465a.when;
                }
                b.this.f7460b.a(i, i2, "ServiceDisconnected");
                b.this.f7460b.a();
            }
        }

        public C0053b(a aVar) {
            this.f7468b = aVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            h hVar;
            b bVar = b.this;
            if (iBinder == null) {
                hVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IBMManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                    hVar = new h.a.C0055a(iBinder);
                } else {
                    hVar = (h) queryLocalInterface;
                }
            }
            bVar.g = hVar;
            if (b.this.g != null) {
                try {
                    b.this.g.a(this.f7467a, this.f7468b);
                } catch (Throwable th) {
                    a.a(th);
                }
            }
        }
    }

    public class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        d f7470a;

        public final void onServiceDisconnected(ComponentName componentName) {
            b.this.h = null;
        }

        public c(d dVar) {
            this.f7470a = dVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            m mVar;
            b bVar = b.this;
            if (iBinder == null) {
                mVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IProxyManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof m)) {
                    mVar = new m.a.C0057a(iBinder);
                } else {
                    mVar = (m) queryLocalInterface;
                }
            }
            bVar.h = mVar;
            if (b.this.h != null) {
                try {
                    b.this.h.a(this.f7470a);
                } catch (Throwable th) {
                    a.a(th);
                }
            }
        }
    }

    public class d extends k.a {

        /* renamed from: a  reason: collision with root package name */
        l f7472a;

        public final void a(Map map) {
            if (this.f7472a != null) {
                this.f7472a.a(map);
            }
            b.this.f7459a.unbindService(b.this.f7464f);
            b.this.h = null;
        }

        public d(l lVar) {
            this.f7472a = lVar;
        }
    }

    static {
        com.ss.android.ttve.nativePort.b.a(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getLibraryLoader(com.ss.android.ugc.aweme.app.k.a()));
    }

    public final void a() {
        if (this.j) {
            this.f7459a.unbindService(this.f7463e);
            this.g = null;
            this.j = false;
        }
    }

    public final void a(Runnable runnable) {
        this.i.post(runnable);
    }

    public static b a(Context context) {
        if (k == null) {
            k = new b(context);
        }
        return k;
    }

    private b(Context context) {
        this.f7459a = context;
    }

    public void a(int i2, ServiceConnection serviceConnection) {
        Intent intent = new Intent(this.f7459a, BenchmarkService.class);
        intent.setPackage(this.f7459a.getPackageName());
        intent.putExtra("bind_type", i2);
        if (this.f7459a.bindService(intent, serviceConnection, 1)) {
            this.j = true;
        }
    }
}
