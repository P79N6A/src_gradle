package com.ss.android.ugc.aweme.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.app.location.b;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.ui.n;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

@SuppressLint({"CI_StaticFieldLeak"})
public final class af implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2624a;

    /* renamed from: b  reason: collision with root package name */
    static af f2625b;

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f2626c = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: d  reason: collision with root package name */
    public final a f2627d;

    /* renamed from: e  reason: collision with root package name */
    private Vector<WeakReference<f>> f2628e = new Vector<>();

    /* renamed from: f  reason: collision with root package name */
    private Context f2629f;
    private WeakHandler g;
    private long h;

    public interface a {
        void a(boolean z);

        void e();

        Address f();

        com.ss.android.ugc.aweme.poi.a g();

        void h();

        void i();

        void j();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2624a, false, 22535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22535, new Class[0], Void.TYPE);
            return;
        }
        this.f2627d.h();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2624a, false, 22536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22536, new Class[0], Void.TYPE);
            return;
        }
        this.f2627d.i();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f2624a, false, 22538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22538, new Class[0], Void.TYPE);
            return;
        }
        a();
        if (this.g != null) {
            this.g.sendEmptyMessage(241);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2624a, false, 22541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22541, new Class[0], Void.TYPE);
            return;
        }
        this.f2627d.j();
    }

    public final boolean g() {
        if (!PatchProxy.isSupport(new Object[0], this, f2624a, false, 22549, new Class[0], Boolean.TYPE)) {
            return ToolUtils.isMainProcess(this.f2629f);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22549, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2624a, false, 22540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22540, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        if (currentTimeMillis > TimeUnit.SECONDS.toMillis(60)) {
            this.f2627d.e();
            a();
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33746a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f33746a, false, 22550, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f33746a, false, 22550, new Class[0], Void.TYPE);
                    return;
                }
                af.this.f2627d.e();
                af.this.a();
            }
        }, TimeUnit.SECONDS.toMillis(60) - currentTimeMillis);
    }

    public final com.ss.android.ugc.aweme.poi.a f() {
        if (PatchProxy.isSupport(new Object[0], this, f2624a, false, 22542, new Class[0], com.ss.android.ugc.aweme.poi.a.class)) {
            return (com.ss.android.ugc.aweme.poi.a) PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22542, new Class[0], com.ss.android.ugc.aweme.poi.a.class);
        }
        if (n.a().b()) {
            com.ss.android.ugc.aweme.poi.a aVar = new com.ss.android.ugc.aweme.poi.a();
            double[] c2 = n.a().c();
            if (c2 != null) {
                aVar.isGaode = true;
                aVar.latitude = c2[0];
                aVar.longitude = c2[1];
                return aVar;
            }
        }
        return this.f2627d.g();
    }

    private af(Context context) {
        int i;
        this.f2629f = context;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, e.f59784a, true, 66800, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, e.f59784a, true, 66800, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = AbTestManager.a().d();
            if (d2 != null) {
                i = d2.useLocationSDK;
            } else {
                i = 0;
            }
            if (i == 1) {
                z = true;
            }
        }
        if (z) {
            this.f2627d = new b(context, this);
        } else {
            this.f2627d = new com.ss.android.ugc.aweme.app.location.a(context, this);
        }
        if (g()) {
            this.g = new WeakHandler(this);
        }
        this.h = System.currentTimeMillis();
    }

    public static synchronized af a(Context context) {
        synchronized (af.class) {
            if (PatchProxy.isSupport(new Object[]{context}, null, f2624a, true, 22533, new Class[]{Context.class}, af.class)) {
                af afVar = (af) PatchProxy.accessDispatch(new Object[]{context}, null, f2624a, true, 22533, new Class[]{Context.class}, af.class);
                return afVar;
            }
            if (f2625b == null) {
                f2625b = new af(context.getApplicationContext());
            }
            af afVar2 = f2625b;
            return afVar2;
        }
    }

    public static boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f2624a, true, 22547, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f2624a, true, 22547, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (ContextCompat.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION") == -1) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f2624a, false, 22545, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f2624a, false, 22545, new Class[]{f.class}, Void.TYPE);
            return;
        }
        synchronized (this.f2628e) {
            Iterator<WeakReference<f>> it2 = this.f2628e.iterator();
            while (it2.hasNext()) {
                f fVar2 = (f) it2.next().get();
                if (fVar2 != null && fVar2.equals(fVar)) {
                    it2.remove();
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f2624a, false, 22546, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f2624a, false, 22546, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f2624a, false, 22539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2624a, false, 22539, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this.f2628e) {
            Iterator<WeakReference<f>> it2 = this.f2628e.iterator();
            while (it2.hasNext()) {
                f fVar = (f) it2.next().get();
                if (fVar != null) {
                    fVar.W_();
                }
            }
            this.f2628e.clear();
        }
    }

    public final com.ss.android.ugc.aweme.poi.a a(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f2624a, false, 22543, new Class[]{f.class}, com.ss.android.ugc.aweme.poi.a.class)) {
            return (com.ss.android.ugc.aweme.poi.a) PatchProxy.accessDispatch(new Object[]{fVar}, this, f2624a, false, 22543, new Class[]{f.class}, com.ss.android.ugc.aweme.poi.a.class);
        }
        if (n.a().b()) {
            com.ss.android.ugc.aweme.poi.a aVar = new com.ss.android.ugc.aweme.poi.a();
            double[] c2 = n.a().c();
            if (c2 != null) {
                aVar.isGaode = true;
                aVar.latitude = c2[0];
                aVar.longitude = c2[1];
                return aVar;
            }
        }
        com.ss.android.ugc.aweme.poi.a g2 = this.f2627d.g();
        if (g2 != null && g2.isValid()) {
            return g2;
        }
        if (b((Context) k.a()) || fVar == null) {
            return null;
        }
        synchronized (this.f2628e) {
            this.f2628e.add(new WeakReference(fVar));
            d();
        }
        return null;
    }

    public final void b(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f2624a, false, 22544, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f2624a, false, 22544, new Class[]{f.class}, Void.TYPE);
            return;
        }
        synchronized (this.f2628e) {
            Iterator<WeakReference<f>> it2 = this.f2628e.iterator();
            while (it2.hasNext()) {
                f fVar2 = (f) it2.next().get();
                if (fVar2 != null && fVar2.equals(fVar)) {
                    return;
                }
            }
            this.f2628e.add(new WeakReference(fVar));
        }
    }
}
