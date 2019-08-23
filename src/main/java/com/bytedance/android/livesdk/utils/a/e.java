package com.bytedance.android.livesdk.utils.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17550a;

    /* renamed from: e  reason: collision with root package name */
    private static e f17551e;

    /* renamed from: f  reason: collision with root package name */
    private static Context f17552f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17553b;

    /* renamed from: c  reason: collision with root package name */
    public long f17554c;

    /* renamed from: d  reason: collision with root package name */
    public long f17555d;
    private final String g;
    private final long h;
    private ConnectivityManager i;
    private long j;

    private long c() {
        if (PatchProxy.isSupport(new Object[0], this, f17550a, false, 13799, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17550a, false, 13799, new Class[0], Long.TYPE)).longValue();
        } else if (this.f17553b) {
            return SystemClock.elapsedRealtime() - this.f17555d;
        } else {
            return Long.MAX_VALUE;
        }
    }

    public final long b() {
        if (PatchProxy.isSupport(new Object[0], this, f17550a, false, 13800, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f17550a, false, 13800, new Class[0], Long.TYPE)).longValue();
        } else if (!this.f17553b) {
            return ah.a();
        } else {
            return this.f17554c + c();
        }
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        if (PatchProxy.isSupport(new Object[0], this, f17550a, false, 13798, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17550a, false, 13798, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(this.g)) {
            return false;
        } else {
            synchronized (this) {
                if (this.i == null) {
                    this.i = (ConnectivityManager) f17552f.getSystemService("connectivity");
                }
            }
            if (this.i == null) {
                networkInfo = null;
            } else {
                networkInfo = this.i.getActiveNetworkInfo();
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                return false;
            }
            f fVar = new f();
            if (!fVar.a(this.g, (int) this.h)) {
                return false;
            }
            this.f17553b = true;
            this.f17554c = fVar.f17557b;
            this.f17555d = fVar.f17558c;
            this.j = fVar.f17559d / 2;
            return true;
        }
    }

    private e(String str, long j2) {
        this.g = str;
        this.h = j2;
    }

    public static synchronized e a(Context context, String str, long j2) {
        String str2 = str;
        synchronized (e.class) {
            if (PatchProxy.isSupport(new Object[]{context, str2, 500L}, null, f17550a, true, 13797, new Class[]{Context.class, String.class, Long.TYPE}, e.class)) {
                Object[] objArr = {context, str2, 500L};
                e eVar = (e) PatchProxy.accessDispatch(objArr, null, f17550a, true, 13797, new Class[]{Context.class, String.class, Long.TYPE}, e.class);
                return eVar;
            }
            if (f17551e == null) {
                f17551e = new e(str2, 500);
                f17552f = context.getApplicationContext();
            }
            e eVar2 = f17551e;
            return eVar2;
        }
    }
}
