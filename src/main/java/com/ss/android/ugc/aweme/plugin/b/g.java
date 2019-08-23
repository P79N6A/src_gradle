package com.ss.android.ugc.aweme.plugin.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.bytedance.frameworks.plugin.pm.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.plugin.b.d;
import com.ss.android.ugc.aweme.plugin.e.b;
import com.ss.android.ugc.aweme.thread.h;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59245a;

    /* renamed from: b  reason: collision with root package name */
    Context f59246b;

    /* renamed from: c  reason: collision with root package name */
    public b f59247c;

    /* renamed from: d  reason: collision with root package name */
    Executor f59248d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, a> f59249e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    d.a f59250f = new d.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59251a;

        public final void b(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar) {
            com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar2}, this, f59251a, false, 64595, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, aVar2}, this, f59251a, false, 64595, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE);
                return;
            }
            g.this.a(b.C0667b.PAUSED_BY_NETWORK, aVar2, null);
        }

        public final void c(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar) {
            com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar2}, this, f59251a, false, 64596, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, aVar2}, this, f59251a, false, 64596, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE);
                return;
            }
            g.this.a(b.C0667b.DOWNLOADING, aVar2, null);
        }

        public final void d(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar) {
            com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar2}, this, f59251a, false, 64597, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, aVar2}, this, f59251a, false, 64597, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE);
                return;
            }
            g.this.a(b.C0667b.FIRST_DOWNLOAD, aVar2, null);
        }

        public final void e(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar) {
            com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar2}, this, f59251a, false, 64598, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, aVar2}, this, f59251a, false, 64598, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE);
                return;
            }
            g.this.a(b.C0667b.SUCCESS, aVar2, null);
        }

        public final void f(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar) {
            com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar2}, this, f59251a, false, 64599, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, aVar2}, this, f59251a, false, 64599, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Void.TYPE);
                return;
            }
            g.this.a(b.C0667b.VERIFY_FAILED, aVar2, null);
        }

        public final boolean a(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar) {
            int i;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar}, this, f59251a, false, 64594, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar, aVar}, this, f59251a, false, 64594, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class}, Boolean.TYPE)).booleanValue();
            }
            String str = aVar.f59310e.f59324a;
            int i2 = aVar.f59310e.f59325b;
            com.bytedance.frameworks.plugin.a.a f2 = c.f(str);
            if (f2 != null) {
                i = f2.f2146b;
            } else {
                i = 0;
            }
            if (i2 > i && !g.this.a(str, i2)) {
                return true;
            }
            g.this.a(b.C0667b.ALREADY_DOWNLOADED, aVar, null);
            return false;
        }

        public final void a(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar, int i) {
            b.C0667b bVar;
            com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar2, Integer.valueOf(i)}, this, f59251a, false, 64601, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, aVar2, Integer.valueOf(i)}, this, f59251a, false, 64601, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            switch (i) {
                case 1:
                    bVar = b.C0667b.PAUSED_BY_APP;
                    break;
                case 2:
                    bVar = b.C0667b.PAUSED_BY_NETWORK;
                    break;
                case 3:
                    bVar = b.C0667b.CANCELED;
                    break;
                default:
                    bVar = b.C0667b.PAUSED_BY_OTHERS;
                    break;
            }
            g.this.a(bVar, aVar2, null);
        }

        public final void a(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar, Exception exc) {
            com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
            Exception exc2 = exc;
            if (PatchProxy.isSupport(new Object[]{dVar, aVar2, exc2}, this, f59251a, false, 64600, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, aVar2, exc2}, this, f59251a, false, 64600, new Class[]{d.class, com.ss.android.ugc.aweme.plugin.e.a.class, Exception.class}, Void.TYPE);
            } else if (b.a(exc)) {
                g.this.a(b.C0667b.INSUFFICIENT_STORAGE_FAILED, aVar2, exc2);
            } else {
                g.this.a(b.C0667b.FAILED, aVar2, exc2);
            }
        }
    };
    private Handler g = new Handler();
    private Runnable h = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59258a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f59258a, false, 64603, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59258a, false, 64603, new Class[0], Void.TYPE);
            } else if (!g.this.f59249e.isEmpty()) {
                ArrayList arrayList = new ArrayList(g.this.f59249e.size());
                for (a next : g.this.f59249e.values()) {
                    if (next.f59260a.f59231c > 0) {
                        next.f59261b.f59322e = next.f59260a.f59231c;
                    }
                    if (next.f59260a.f59232d > 0) {
                        next.f59261b.f59323f = next.f59260a.f59232d;
                    }
                    arrayList.add(next.f59261b);
                }
                g.this.f59247c.a((List<com.ss.android.ugc.aweme.plugin.e.b>) arrayList);
                g.this.a();
            }
        }
    };

    static class a {

        /* renamed from: a  reason: collision with root package name */
        d f59260a;

        /* renamed from: b  reason: collision with root package name */
        com.ss.android.ugc.aweme.plugin.e.b f59261b;

        a(d dVar, com.ss.android.ugc.aweme.plugin.e.b bVar) {
            this.f59260a = dVar;
            this.f59261b = bVar;
        }
    }

    public interface b {
        void a(com.ss.android.ugc.aweme.plugin.e.b bVar);

        void a(List<com.ss.android.ugc.aweme.plugin.e.b> list);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59245a, false, 64593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59245a, false, 64593, new Class[0], Void.TYPE);
            return;
        }
        this.g.removeCallbacks(this.h);
        this.g.postDelayed(this.h, 500);
    }

    public g(Context context, b bVar) {
        ExecutorService executorService;
        this.f59246b = context;
        this.f59247c = bVar;
        SimpleThreadFactory simpleThreadFactory = new SimpleThreadFactory("plugin_downloader", true);
        if (PatchProxy.isSupport(new Object[]{simpleThreadFactory}, null, h.f59262a, true, 64604, new Class[]{ThreadFactory.class}, ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{simpleThreadFactory}, null, h.f59262a, true, 64604, new Class[]{ThreadFactory.class}, ExecutorService.class);
        } else {
            executorService = h.c();
        }
        this.f59248d = executorService;
    }

    public final boolean a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f59245a, false, 64592, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f59245a, false, 64592, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        a aVar = this.f59249e.get(str);
        if (aVar == null) {
            return false;
        }
        File[] listFiles = new File(aVar.f59261b.i).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return false;
        }
        for (File file : listFiles) {
            try {
                if (file.getName().contains(str)) {
                    PackageInfo packageArchiveInfo = this.f59246b.getPackageManager().getPackageArchiveInfo(file.getPath(), 0);
                    if (TextUtils.equals(packageArchiveInfo.packageName, str) && packageArchiveInfo.versionCode == i) {
                        return true;
                    }
                } else {
                    continue;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void a(b.C0667b bVar, com.ss.android.ugc.aweme.plugin.e.a aVar, Exception exc) {
        final b.C0667b bVar2 = bVar;
        final com.ss.android.ugc.aweme.plugin.e.a aVar2 = aVar;
        final Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{bVar2, aVar2, exc2}, this, f59245a, false, 64591, new Class[]{b.C0667b.class, com.ss.android.ugc.aweme.plugin.e.a.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, aVar2, exc2}, this, f59245a, false, 64591, new Class[]{b.C0667b.class, com.ss.android.ugc.aweme.plugin.e.a.class, Exception.class}, Void.TYPE);
            return;
        }
        this.g.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59253a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f59253a, false, 64602, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59253a, false, 64602, new Class[0], Void.TYPE);
                    return;
                }
                String str = aVar2.f59310e.f59324a;
                a aVar = g.this.f59249e.get(str);
                if (aVar != null) {
                    if (bVar2.isSucceed() || bVar2.isFailed() || bVar2.isCanceled() || bVar2.isPaused()) {
                        g.this.f59249e.remove(str);
                    }
                    aVar.f59261b.a(bVar2);
                    aVar.f59261b.k = exc2;
                    if (g.this.f59247c != null) {
                        g.this.f59247c.a(aVar.f59261b);
                    }
                }
            }
        });
    }
}
