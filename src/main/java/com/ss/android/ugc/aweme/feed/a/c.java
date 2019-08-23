package com.ss.android.ugc.aweme.feed.a;

import a.i;
import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.util.Log;
import com.bytedance.common.utility.io.IOUtils;
import com.google.common.b.b;
import com.google.common.b.g;
import com.google.common.b.m;
import com.google.common.b.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.utils.be;
import com.ss.android.ugc.aweme.utils.bm;
import java.io.Closeable;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44619a;

    /* renamed from: b  reason: collision with root package name */
    public b<String, Aweme> f44620b = com.google.common.b.c.a().a(g.p.WEAK).a(200).a((m<? super K1, ? super V1>) new m() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44625a;

        public final void onRemoval(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, f44625a, false, 40907, new Class[]{n.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{nVar}, this, f44625a, false, 40907, new Class[]{n.class}, Void.TYPE);
                return;
            }
            if (nVar.getValue() != null) {
                c.this.a((String) nVar.getKey(), (Aweme) nVar.getValue());
            }
        }
    }).d();

    /* renamed from: c  reason: collision with root package name */
    private b<String, Aweme> f44621c = com.google.common.b.c.a().a(100).a((m<? super K1, ? super V1>) new m() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44623a;

        public final void onRemoval(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, f44623a, false, 40906, new Class[]{n.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{nVar}, this, f44623a, false, 40906, new Class[]{n.class}, Void.TYPE);
                return;
            }
            c.this.f44620b.put((String) nVar.getKey(), (Aweme) nVar.getValue());
            c.this.a((String) nVar.getKey(), (Aweme) nVar.getValue());
        }
    }).d();

    /* renamed from: d  reason: collision with root package name */
    private be f44622d;

    public final Collection<Aweme> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f44619a, false, 40897, new Class[0], Collection.class)) {
            return this.f44621c.asMap().values();
        }
        return (Collection) PatchProxy.accessDispatch(new Object[0], this, f44619a, false, 40897, new Class[0], Collection.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f44619a, false, 40898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44619a, false, 40898, new Class[0], Void.TYPE);
            return;
        }
        try {
            bm.c(a(GlobalContext.getContext(), "awemeCache").getAbsolutePath());
        } catch (Exception unused) {
        }
    }

    public c() {
        try {
            File a2 = a(GlobalContext.getContext(), "awemeCache");
            if (a2.exists()) {
                bm.c(a2.getAbsolutePath());
            }
            this.f44622d = be.a(a2, com.ss.android.ugc.aweme.update.m.a().d(), 1, 52428800);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public boolean b(String str) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str}, this, f44619a, false, 40896, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f44619a, false, 40896, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (!(this.f44621c.getIfPresent(str) == null && this.f44620b.getIfPresent(str) == null && !d(str))) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    private Aweme c(String str) {
        Aweme aweme;
        ObjectInputStream objectInputStream;
        if (PatchProxy.isSupport(new Object[]{str}, this, f44619a, false, 40902, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str}, this, f44619a, false, 40902, new Class[]{String.class}, Aweme.class);
        }
        ObjectInputStream objectInputStream2 = null;
        if (this.f44622d == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(this.f44622d.a(str).a(0));
            try {
                aweme = (Aweme) objectInputStream.readObject();
                IOUtils.close((Closeable) objectInputStream);
            } catch (Exception unused) {
                IOUtils.close((Closeable) objectInputStream);
                aweme = null;
                return aweme;
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                IOUtils.close((Closeable) objectInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            objectInputStream = null;
            IOUtils.close((Closeable) objectInputStream);
            aweme = null;
            return aweme;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.close((Closeable) objectInputStream2);
            throw th;
        }
        return aweme;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f44619a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 40904(0x9fc8, float:5.7319E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0039
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f44619a
            r4 = 0
            r5 = 40904(0x9fc8, float:5.7319E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0039:
            com.ss.android.ugc.aweme.utils.be r1 = r10.f44622d
            if (r1 != 0) goto L_0x003e
            return r9
        L_0x003e:
            com.ss.android.ugc.aweme.utils.be r1 = r10.f44622d
            java.io.Writer r1 = r1.f75594f
            if (r1 != 0) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x004a
            return r9
        L_0x004a:
            com.ss.android.ugc.aweme.utils.be r1 = r10.f44622d     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            com.ss.android.ugc.aweme.utils.be$c r0 = r1.a((java.lang.String) r11)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            if (r0 == 0) goto L_0x0053
            r9 = 1
        L_0x0053:
            if (r0 == 0) goto L_0x005b
            r0.close()
            goto L_0x005b
        L_0x0059:
            r0 = move-exception
            throw r0
        L_0x005b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.a.c.d(java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public Aweme a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f44619a, false, 40894, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str2}, this, f44619a, false, 40894, new Class[]{String.class}, Aweme.class);
        }
        Aweme aweme = (Aweme) this.f44621c.getIfPresent(str2);
        if (aweme == null) {
            aweme = (Aweme) this.f44620b.getIfPresent(str2);
            if (aweme != null) {
                a(str2, aweme);
                this.f44620b.invalidate(str2);
            }
        }
        if (aweme == null) {
            aweme = c(str);
            if (aweme != null) {
                a(str2, aweme);
            }
        }
        if (aweme == null) {
            if (PatchProxy.isSupport(new Object[]{str2}, null, f44619a, true, 40905, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, null, f44619a, true, 40905, new Class[]{String.class}, Void.TYPE);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String stackTraceString = Log.getStackTraceString(new Throwable());
                    if (stackTraceString.length() > 4096) {
                        stackTraceString = stackTraceString.substring(0, 4096);
                    }
                    jSONObject.put("error_stack", stackTraceString);
                    jSONObject.put("aid", str2);
                    com.ss.android.ugc.aweme.base.n.a("aweme_manager_get_aweme_is_null", jSONObject);
                    a.a();
                } catch (Exception unused) {
                }
            }
        }
        return aweme;
    }

    public final void a(String str, Aweme aweme) {
        final String str2 = str;
        final Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str2, aweme2}, this, f44619a, false, 40900, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aweme2}, this, f44619a, false, 40900, new Class[]{String.class, Aweme.class}, Void.TYPE);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            i.a((Callable<TResult>) new Callable<Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44627a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f44627a, false, 40908, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f44627a, false, 40908, new Class[0], Object.class);
                    }
                    c.this.b(str2, aweme2);
                    return null;
                }
            });
        } else {
            b(str, aweme);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void a(String str, Aweme aweme) {
        String str2 = str;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str2, aweme2}, this, f44619a, false, 40895, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aweme2}, this, f44619a, false, 40895, new Class[]{String.class, Aweme.class}, Void.TYPE);
            return;
        }
        this.f44621c.put(str2, aweme2);
    }

    public final void b(String str, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{str, aweme}, this, f44619a, false, 40901, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aweme}, this, f44619a, false, 40901, new Class[]{String.class, Aweme.class}, Void.TYPE);
        } else if (this.f44622d != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                be.a b2 = this.f44622d.b(str);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(b2.a(0));
                try {
                    objectOutputStream2.writeObject(aweme);
                    b2.a();
                    IOUtils.close((Closeable) objectOutputStream2);
                } catch (Exception unused) {
                    objectOutputStream = objectOutputStream2;
                    IOUtils.close((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    IOUtils.close((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                IOUtils.close((Closeable) objectOutputStream);
            } catch (Throwable th2) {
                th = th2;
                IOUtils.close((Closeable) objectOutputStream);
                throw th;
            }
        }
    }

    private File a(Context context, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context, str3}, this, f44619a, false, 40899, new Class[]{Context.class, String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context, str3}, this, f44619a, false, 40899, new Class[]{Context.class, String.class}, File.class);
        }
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            str2 = context.getExternalCacheDir().getPath();
        } else {
            str2 = context.getCacheDir().getPath();
        }
        return new File(str2 + File.separator + str3);
    }
}
