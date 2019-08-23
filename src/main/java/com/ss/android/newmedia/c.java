package com.ss.android.newmedia;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Message;
import android.view.LayoutInflater;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.h;
import com.ss.android.download.a.c;
import com.ss.android.image.b;
import com.ss.android.image.g;
import com.ss.android.newmedia.a.a;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class c implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30182a;

    /* renamed from: b  reason: collision with root package name */
    final Context f30183b;

    /* renamed from: c  reason: collision with root package name */
    final WeakHandler f30184c;

    /* renamed from: d  reason: collision with root package name */
    final BaseAppData f30185d;

    /* renamed from: e  reason: collision with root package name */
    public final h f30186e;

    /* renamed from: f  reason: collision with root package name */
    final com.ss.android.download.a.c<String, a, Void, Void, a> f30187f;
    public WeakReference<Dialog> g;
    long h = 0;
    public final List<a> i = new ArrayList(8);
    final Runnable j = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30190a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f30190a, false, 18238, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f30190a, false, 18238, new Class[0], Void.TYPE);
                return;
            }
            c.this.a();
        }
    };
    private b k;
    private g l;
    private final LayoutInflater m;
    private final c.a<String, a, Void, Void, a> n = new c.a<String, a, Void, Void, a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30188a;

        /* access modifiers changed from: private */
        public a a(String str, a aVar, Void voidR) {
            boolean z;
            a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{str, aVar2, voidR}, this, f30188a, false, 18236, new Class[]{String.class, a.class, Void.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, aVar2, voidR}, this, f30188a, false, 18236, new Class[]{String.class, a.class, Void.class}, a.class);
            } else if (aVar2 == null) {
                return null;
            } else {
                String str2 = aVar2.f30102d;
                String md5Hex = DigestUtils.md5Hex(str2);
                b b2 = c.this.b();
                boolean a2 = b2.a(md5Hex);
                if (a2) {
                    aVar2.f30104f = true;
                    return aVar2;
                }
                aVar2.f30104f = false;
                try {
                    z = e.a(c.this.f30183b, -1, str2, (String) null, b2.b(md5Hex), (String) null, md5Hex, (com.ss.android.common.util.c<String>) null, (String) null, c.this.f30186e);
                } catch (Throwable unused) {
                    z = a2;
                }
                aVar2.f30104f = z;
                return aVar2;
            }
        }

        public final /* synthetic */ void a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            String str = (String) obj;
            a aVar = (a) obj2;
            Void voidR = (Void) obj3;
            Void voidR2 = (Void) obj4;
            a aVar2 = (a) obj5;
            if (PatchProxy.isSupport(new Object[]{str, aVar, voidR, voidR2, aVar2}, this, f30188a, false, 18237, new Class[]{String.class, a.class, Void.class, Void.class, a.class}, Void.TYPE)) {
                Object[] objArr = {str, aVar, voidR, voidR2, aVar2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f30188a, false, 18237, new Class[]{String.class, a.class, Void.class, Void.class, a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                for (a next : c.this.i) {
                    if (next != null && next.f30101c == aVar2.f30101c) {
                        next.f30104f = aVar2.f30104f;
                        return;
                    }
                }
            }
        }
    };
    private final Comparator<a> o = new Comparator<a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int i = ((a) obj).f30100b;
            int i2 = ((a) obj2).f30100b;
            if (i == i2) {
                return 0;
            }
            if (i < i2) {
                return -1;
            }
            return 1;
        }
    };

    public final synchronized b b() {
        if (PatchProxy.isSupport(new Object[0], this, f30182a, false, 18234, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f30182a, false, 18234, new Class[0], b.class);
        }
        if (this.k == null) {
            this.k = new b(this.f30183b);
        }
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public synchronized g c() {
        if (PatchProxy.isSupport(new Object[0], this, f30182a, false, 18235, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f30182a, false, 18235, new Class[0], g.class);
        }
        if (this.l == null) {
            Resources resources = this.f30183b.getResources();
            g gVar = new g(this.f30183b, this.f30186e, 4, 8, 1, b(), resources.getDimensionPixelSize(C0906R.dimen.by), resources.getDimensionPixelSize(C0906R.dimen.bx));
            this.l = gVar;
        }
        return this.l;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30182a, false, 18233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30182a, false, 18233, new Class[0], Void.TYPE);
        } else if (!this.i.isEmpty() && this.f30185d.Q != null) {
            Activity activity = (Activity) this.f30185d.Q.get();
            if (activity != null) {
                if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                    a aVar = this.i.get(0);
                    long j2 = (long) aVar.f30100b;
                    long currentTimeMillis = (System.currentTimeMillis() - this.f30185d.T) / 1000;
                    if (currentTimeMillis <= 0) {
                        currentTimeMillis = 1;
                    }
                    if (currentTimeMillis > 3600) {
                        currentTimeMillis = 3600;
                    }
                    long j3 = this.f30185d.S + currentTimeMillis;
                    if (!StringUtils.isEmpty(aVar.f30102d) && !aVar.f30104f) {
                        this.f30187f.a(aVar.f30102d, aVar, null, null);
                        a(0);
                    } else if (j3 >= j2) {
                        this.i.remove(0);
                        Dialog a2 = aVar.a(activity, c(), this.m);
                        if (a2 != null) {
                            a(a2);
                            a(20000);
                        }
                    } else {
                        a(0);
                    }
                }
            }
        }
    }

    public final void a(Dialog dialog) {
        if (PatchProxy.isSupport(new Object[]{dialog}, this, f30182a, false, 18226, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, this, f30182a, false, 18226, new Class[]{Dialog.class}, Void.TYPE);
        } else if (dialog != null) {
            this.g = new WeakReference<>(dialog);
        } else {
            this.g = null;
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f30182a, false, 18230, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f30182a, false, 18230, new Class[]{Message.class}, Void.TYPE);
        } else if (BaseAppData.a() != null && message != null) {
            if (message.what == 10004) {
                a(false, null);
            } else if (message.what == 10003) {
                try {
                    a(true, (List) message.obj);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (r0 < r2) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(long r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f30182a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 18232(0x4738, float:2.5548E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f30182a
            r3 = 0
            r4 = 18232(0x4738, float:2.5548E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            java.util.List<com.ss.android.newmedia.a.a> r0 = r9.i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0043
            return
        L_0x0043:
            java.util.List<com.ss.android.newmedia.a.a> r0 = r9.i
            java.lang.Object r0 = r0.get(r8)
            com.ss.android.newmedia.a.a r0 = (com.ss.android.newmedia.a.a) r0
            int r0 = r0.f30100b
            long r0 = (long) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0055
            r0 = r2
        L_0x0055:
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x005c
            r2 = 5000(0x1388, double:2.4703E-320)
            goto L_0x005d
        L_0x005c:
            r2 = r10
        L_0x005d:
            com.ss.android.newmedia.BaseAppData r4 = r9.f30185d
            long r4 = r4.S
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0072
            com.ss.android.newmedia.BaseAppData r4 = r9.f30185d
            long r4 = r4.R
            long r0 = r0 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0073
        L_0x0072:
            r0 = r2
        L_0x0073:
            com.bytedance.common.utility.collection.WeakHandler r2 = r9.f30184c
            java.lang.Runnable r3 = r9.j
            r2.removeCallbacks(r3)
            com.bytedance.common.utility.collection.WeakHandler r2 = r9.f30184c
            java.lang.Runnable r3 = r9.j
            r2.postDelayed(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.c.a(long):void");
    }

    public final void a(Context context) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context}, this, f30182a, false, 18227, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f30182a, false, 18227, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a(0);
        if (currentTimeMillis - this.h > 900000 && NetworkUtils.isNetworkAvailable(this.f30183b)) {
            try {
                List<ResolveInfo> queryIntentActivities = this.f30183b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ss.android.example")), 65536);
                if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            this.h = currentTimeMillis;
            com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.requesttask.idle.b(this.f30183b, this.f30184c, z)).a();
            com.ss.android.common.lib.a.a(this.f30183b, "monitor", "app_alert", 0, 0);
        }
        if (this.f30187f != null) {
            this.f30187f.d();
        }
        g c2 = c();
        if (c2 != null) {
            c2.a();
        }
    }

    public c(Context context, BaseAppData baseAppData) {
        this.f30183b = context;
        this.f30185d = baseAppData;
        this.f30184c = new WeakHandler(this.f30183b.getMainLooper(), this);
        this.f30187f = new com.ss.android.download.a.c<>(this.n);
        this.f30186e = new h();
        this.m = LayoutInflater.from(this.f30183b);
    }

    private void a(boolean z, List<a> list) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), list}, this, f30182a, false, 18231, new Class[]{Boolean.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), list}, this, f30182a, false, 18231, new Class[]{Boolean.TYPE, List.class}, Void.TYPE);
        } else if (z && list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (a next : list) {
                if (next != null && next.g) {
                    arrayList.add(next);
                    i2++;
                    if (i2 > 20) {
                        break;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, this.o);
                this.i.clear();
                this.f30184c.removeCallbacks(this.j);
                this.i.addAll(arrayList);
                for (a next2 : this.i) {
                    this.f30187f.a(next2.f30102d, next2, null, null);
                }
                if (!(this.f30185d.Q == null || ((Activity) this.f30185d.Q.get()) == null)) {
                    a(0);
                }
            }
        }
    }
}
