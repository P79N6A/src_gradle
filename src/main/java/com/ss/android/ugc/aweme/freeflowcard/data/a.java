package com.ss.android.ugc.aweme.freeflowcard.data;

import android.arch.persistence.room.Room;
import android.os.Build;
import android.os.StatFs;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.freeflowcard.data.b.b;
import com.ss.android.ugc.aweme.freeflowcard.data.b.c;
import com.ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48602a;

    /* renamed from: c  reason: collision with root package name */
    private static a f48603c;

    /* renamed from: b  reason: collision with root package name */
    public FreeFlowDatabase f48604b = ((FreeFlowDatabase) Room.databaseBuilder(i.a().getContext(), FreeFlowDatabase.class, "free_flow").allowMainThreadQueries().build());

    /* renamed from: d  reason: collision with root package name */
    private b f48605d;

    public final List<com.ss.android.ugc.aweme.freeflowcard.data.b.a> a(long j, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), 0}, this, f48602a, false, 46051, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), 0}, this, f48602a, false, 46051, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, List.class);
        }
        try {
            return this.f48604b.c().a(j, j2, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f48602a, false, 46052, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f48602a, false, 46052, new Class[]{b.class}, Void.TYPE);
        } else if (g()) {
            try {
                this.f48604b.a().b();
                this.f48604b.a().a(bVar);
                this.f48605d = bVar;
            } catch (Exception unused) {
            }
        }
    }

    public final void a(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f48602a, false, 46057, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f48602a, false, 46057, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(new c(System.currentTimeMillis(), i, z));
    }

    private a() {
    }

    private File h() {
        if (PatchProxy.isSupport(new Object[0], this, f48602a, false, 46063, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f48602a, false, 46063, new Class[0], File.class);
        }
        File databasePath = i.a().getContext().getDatabasePath("free_flow");
        if (databasePath.exists()) {
            return databasePath;
        }
        return null;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f48602a, false, 46059, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48602a, false, 46059, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User curUser = d.a().getCurUser();
        if (curUser == null) {
            return false;
        }
        return curUser.isFlowcardMember();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f48602a, false, 46060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48602a, false, 46060, new Class[0], Void.TYPE);
            return;
        }
        a.i.a((Callable<TResult>) new Callable<Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48609a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f48609a, false, 46066, new Class[0], Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[0], this, f48609a, false, 46066, new Class[0], Void.class);
                }
                try {
                    a.this.f48604b.b().a();
                    a.this.f48604b.c().a();
                    a.this.f48604b.a().b();
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    private b f() {
        if (PatchProxy.isSupport(new Object[0], this, f48602a, false, 46053, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f48602a, false, 46053, new Class[0], b.class);
        } else if (this.f48605d != null) {
            return this.f48605d;
        } else {
            try {
                List a2 = this.f48604b.a().a();
                if (CollectionUtils.isEmpty(a2)) {
                    b bVar = new b(d(), 0, 0, 0, false, 0);
                    a(bVar);
                    return bVar;
                }
                this.f48605d = (b) a2.get(0);
                return this.f48605d;
            } catch (Exception unused) {
                b bVar2 = new b(false, 0, 0, 0, false, 0);
                return bVar2;
            }
        }
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f48602a, false, 46062, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48602a, false, 46062, new Class[0], Boolean.TYPE)).booleanValue();
        }
        File h = h();
        if (h != null && a(h) >= 1048576) {
            return true;
        }
        return false;
    }

    public final b c() {
        if (PatchProxy.isSupport(new Object[0], this, f48602a, false, 46055, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f48602a, false, 46055, new Class[0], b.class);
        }
        b f2 = f();
        if (f2.isOpen && f2.resetTime < System.currentTimeMillis() && !d()) {
            f2.resetTime = 0;
            f2.isOpen = false;
            f2.changeType = 0;
            f2.monthlyState = 0;
            a(f2);
        }
        if (f2.isDayOpen && f2.dayOpenResetTime < System.currentTimeMillis()) {
            f2.isDayOpen = false;
            f2.dayOpenResetTime = 0;
            a(f2);
        }
        if (!f2.isOpen && f2.changeType == 1 && f2.resetTime < System.currentTimeMillis()) {
            f2.resetTime = 0;
            f2.changeType = 0;
            a(f2);
        }
        return f2;
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f48602a, true, 46048, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f48602a, true, 46048, new Class[0], a.class);
        }
        if (f48603c == null) {
            synchronized (a.class) {
                if (f48603c == null) {
                    f48603c = new a();
                }
            }
        }
        return f48603c;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f48602a, false, 46054, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48602a, false, 46054, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            b c2 = c();
            if (!c2.isOpen && c2.changeType == 1) {
                return false;
            }
            if ((!c2.isOpen || c2.monthlyState == 1) && !c2.isDayOpen) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private long a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f48602a, false, 46064, new Class[]{File.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{file}, this, f48602a, false, 46064, new Class[]{File.class}, Long.TYPE)).longValue();
        }
        StatFs statFs = null;
        long j = 0;
        try {
            statFs = new StatFs(file.getPath());
        } catch (IllegalArgumentException unused) {
        }
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                j = statFs.getAvailableBytes();
            } else {
                j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
        }
        return j;
    }

    private void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f48602a, false, 46056, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f48602a, false, 46056, new Class[]{c.class}, Void.TYPE);
        } else if (g()) {
            try {
                this.f48604b.b().a(cVar2);
            } catch (Exception unused) {
            }
        }
    }

    public final a.i a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48602a, false, 46049, new Class[]{Integer.TYPE}, a.i.class)) {
            return (a.i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48602a, false, 46049, new Class[]{Integer.TYPE}, a.i.class);
        } else if (!g() || (i != 1 && i != 0)) {
            return null;
        } else {
            final com.ss.android.ugc.aweme.freeflowcard.data.b.a aVar = new com.ss.android.ugc.aweme.freeflowcard.data.b.a();
            aVar.mode = i;
            aVar.time = System.currentTimeMillis();
            if (this.f48604b != null) {
                return a.i.a((Callable<TResult>) new Callable<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48606a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f48606a, false, 46065, new Class[0], Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[0], this, f48606a, false, 46065, new Class[0], Void.class);
                        }
                        try {
                            a.this.f48604b.c().a(aVar);
                            return null;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                });
            }
            return null;
        }
    }

    public final List<c> b(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f48602a, false, 46058, new Class[]{Long.TYPE, Long.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f48602a, false, 46058, new Class[]{Long.TYPE, Long.TYPE}, List.class);
        }
        try {
            return this.f48604b.b().a(j3, j4);
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<com.ss.android.ugc.aweme.freeflowcard.data.b.a> a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f48602a, false, 46050, new Class[]{Long.TYPE, Long.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f48602a, false, 46050, new Class[]{Long.TYPE, Long.TYPE}, List.class);
        }
        try {
            return this.f48604b.c().a(j3, j4);
        } catch (Exception unused) {
            return null;
        }
    }
}
