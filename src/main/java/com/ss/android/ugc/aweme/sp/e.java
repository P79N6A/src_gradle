package com.ss.android.ugc.aweme.sp;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sp.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

public final class e implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4068a;
    private static final Object m = new Object();

    /* renamed from: b  reason: collision with root package name */
    final File f4069b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4070c;

    /* renamed from: d  reason: collision with root package name */
    final File f4071d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4072e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final Object f4073f = new Object();
    @GuardedBy("mLock")
    public Map<String, Object> g;
    @GuardedBy("mLock")
    public int h = 0;
    @GuardedBy("mLock")
    boolean i = false;
    @GuardedBy("mLock")
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> j = new WeakHashMap<>();
    @GuardedBy("this")
    public long k;
    @GuardedBy("mWritingToDiskLock")
    long l;

    public final class a implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4082a;

        /* renamed from: c  reason: collision with root package name */
        private final Object f4084c = new Object();
        @GuardedBy("mLock")

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, Object> f4085d = new HashMap();
        @GuardedBy("mLock")

        /* renamed from: e  reason: collision with root package name */
        private boolean f4086e = false;

        public final SharedPreferences.Editor clear() {
            synchronized (this.f4084c) {
                this.f4086e = true;
            }
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            return false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean commit() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f4082a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r4 = 0
                r5 = 81751(0x13f57, float:1.14558E-40)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x002c
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f4082a
                r5 = 0
                r6 = 81751(0x13f57, float:1.14558E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x002c:
                com.ss.android.ugc.aweme.sp.e$b r7 = r9.a()
                com.ss.android.ugc.aweme.sp.e r1 = com.ss.android.ugc.aweme.sp.e.this
                r3 = 0
                r5 = 0
                r6 = 0
                r2 = r7
                r4 = r9
                r1.a(r2, r3, r4, r5, r6)
                java.util.concurrent.CountDownLatch r1 = r7.f4101f     // Catch:{ InterruptedException -> 0x0047, all -> 0x0045 }
                r1.await()     // Catch:{ InterruptedException -> 0x0047, all -> 0x0045 }
                r9.a(r7)
                boolean r0 = r7.g
                return r0
            L_0x0045:
                r0 = move-exception
                throw r0
            L_0x0047:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.e.a.commit():boolean");
        }

        public final void apply() {
            List list;
            if (PatchProxy.isSupport(new Object[0], this, f4082a, false, 81749, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4082a, false, 81749, new Class[0], Void.TYPE);
                return;
            }
            try {
                list = new ArrayList(this.f4085d.keySet());
            } catch (Exception unused) {
                list = Collections.emptyList();
            }
            List list2 = list;
            final b a2 = a();
            final AnonymousClass1 r2 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f4087a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f4087a, false, 81753, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f4087a, false, 81753, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        a2.f4101f.await();
                    } catch (InterruptedException unused) {
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{r2}, null, d.f4061a, true, 81713, new Class[]{Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r2}, null, d.f4061a, true, 81713, new Class[]{Runnable.class}, Void.TYPE);
            } else {
                synchronized (d.f4062b) {
                    d.f4064d.add(r2);
                }
            }
            e.this.a(a2, new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f4090a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f4090a, false, 81754, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f4090a, false, 81754, new Class[0], Void.TYPE);
                        return;
                    }
                    r2.run();
                    Runnable runnable = r2;
                    if (PatchProxy.isSupport(new Object[]{runnable}, null, d.f4061a, true, 81714, new Class[]{Runnable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{runnable}, null, d.f4061a, true, 81714, new Class[]{Runnable.class}, Void.TYPE);
                        return;
                    }
                    synchronized (d.f4062b) {
                        d.f4064d.remove(runnable);
                    }
                }
            }, this, list2, true);
            a(a2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ss.android.ugc.aweme.sp.e.b a() {
            /*
                r12 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f4082a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.ss.android.ugc.aweme.sp.e$b> r7 = com.ss.android.ugc.aweme.sp.e.b.class
                r4 = 0
                r5 = 81750(0x13f56, float:1.14556E-40)
                r2 = r12
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f4082a
                r5 = 0
                r6 = 81750(0x13f56, float:1.14556E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<com.ss.android.ugc.aweme.sp.e$b> r8 = com.ss.android.ugc.aweme.sp.e.b.class
                r3 = r12
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                com.ss.android.ugc.aweme.sp.e$b r0 = (com.ss.android.ugc.aweme.sp.e.b) r0
                return r0
            L_0x0028:
                com.ss.android.ugc.aweme.sp.e r1 = com.ss.android.ugc.aweme.sp.e.this
                java.lang.Object r1 = r1.f4072e
                monitor-enter(r1)
                com.ss.android.ugc.aweme.sp.e r2 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                int r2 = r2.h     // Catch:{ all -> 0x0117 }
                if (r2 <= 0) goto L_0x0040
                com.ss.android.ugc.aweme.sp.e r2 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0117 }
                com.ss.android.ugc.aweme.sp.e r4 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                java.util.Map<java.lang.String, java.lang.Object> r4 = r4.g     // Catch:{ all -> 0x0117 }
                r3.<init>(r4)     // Catch:{ all -> 0x0117 }
                r2.g = r3     // Catch:{ all -> 0x0117 }
            L_0x0040:
                com.ss.android.ugc.aweme.sp.e r2 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                java.util.Map<java.lang.String, java.lang.Object> r8 = r2.g     // Catch:{ all -> 0x0117 }
                com.ss.android.ugc.aweme.sp.e r2 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                int r3 = r2.h     // Catch:{ all -> 0x0117 }
                r4 = 1
                int r3 = r3 + r4
                r2.h = r3     // Catch:{ all -> 0x0117 }
                com.ss.android.ugc.aweme.sp.e r2 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r2 = r2.j     // Catch:{ all -> 0x0117 }
                if (r2 == 0) goto L_0x005e
                com.ss.android.ugc.aweme.sp.e r2 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r2 = r2.j     // Catch:{ all -> 0x0117 }
                int r2 = r2.size()     // Catch:{ all -> 0x0117 }
                if (r2 <= 0) goto L_0x005e
                r2 = 1
                goto L_0x005f
            L_0x005e:
                r2 = 0
            L_0x005f:
                r3 = 0
                if (r2 == 0) goto L_0x0077
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0117 }
                r3.<init>()     // Catch:{ all -> 0x0117 }
                java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0117 }
                com.ss.android.ugc.aweme.sp.e r6 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0117 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r6 = r6.j     // Catch:{ all -> 0x0117 }
                java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x0117 }
                r5.<init>(r6)     // Catch:{ all -> 0x0117 }
                r6 = r3
                r7 = r5
                goto L_0x0079
            L_0x0077:
                r6 = r3
                r7 = r6
            L_0x0079:
                java.lang.Object r3 = r12.f4084c     // Catch:{ all -> 0x0117 }
                monitor-enter(r3)     // Catch:{ all -> 0x0117 }
                boolean r5 = r12.f4086e     // Catch:{ all -> 0x0114 }
                if (r5 == 0) goto L_0x0097
                com.ss.android.ugc.aweme.sp.e r5 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.g     // Catch:{ all -> 0x0114 }
                boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0114 }
                if (r5 != 0) goto L_0x0093
                com.ss.android.ugc.aweme.sp.e r5 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.g     // Catch:{ all -> 0x0114 }
                r5.clear()     // Catch:{ all -> 0x0114 }
                r5 = 1
                goto L_0x0094
            L_0x0093:
                r5 = 0
            L_0x0094:
                r12.f4086e = r0     // Catch:{ all -> 0x0114 }
                r0 = r5
            L_0x0097:
                java.util.Map<java.lang.String, java.lang.Object> r5 = r12.f4085d     // Catch:{ all -> 0x0114 }
                java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x0114 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0114 }
            L_0x00a1:
                boolean r9 = r5.hasNext()     // Catch:{ all -> 0x0114 }
                if (r9 == 0) goto L_0x00f6
                java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0114 }
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x0114 }
                java.lang.Object r10 = r9.getKey()     // Catch:{ all -> 0x0114 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0114 }
                java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0114 }
                if (r9 == r12) goto L_0x00de
                if (r9 != 0) goto L_0x00bc
                goto L_0x00de
            L_0x00bc:
                com.ss.android.ugc.aweme.sp.e r11 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.g     // Catch:{ all -> 0x0114 }
                boolean r11 = r11.containsKey(r10)     // Catch:{ all -> 0x0114 }
                if (r11 == 0) goto L_0x00d6
                com.ss.android.ugc.aweme.sp.e r11 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.g     // Catch:{ all -> 0x0114 }
                java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x0114 }
                if (r11 == 0) goto L_0x00d6
                boolean r11 = r11.equals(r9)     // Catch:{ all -> 0x0114 }
                if (r11 != 0) goto L_0x00a1
            L_0x00d6:
                com.ss.android.ugc.aweme.sp.e r0 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.g     // Catch:{ all -> 0x0114 }
                r0.put(r10, r9)     // Catch:{ all -> 0x0114 }
                goto L_0x00ef
            L_0x00de:
                com.ss.android.ugc.aweme.sp.e r9 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                java.util.Map<java.lang.String, java.lang.Object> r9 = r9.g     // Catch:{ all -> 0x0114 }
                boolean r9 = r9.containsKey(r10)     // Catch:{ all -> 0x0114 }
                if (r9 == 0) goto L_0x00a1
                com.ss.android.ugc.aweme.sp.e r0 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.g     // Catch:{ all -> 0x0114 }
                r0.remove(r10)     // Catch:{ all -> 0x0114 }
            L_0x00ef:
                if (r2 == 0) goto L_0x00f4
                r6.add(r10)     // Catch:{ all -> 0x0114 }
            L_0x00f4:
                r0 = 1
                goto L_0x00a1
            L_0x00f6:
                java.util.Map<java.lang.String, java.lang.Object> r2 = r12.f4085d     // Catch:{ all -> 0x0114 }
                r2.clear()     // Catch:{ all -> 0x0114 }
                if (r0 == 0) goto L_0x0106
                com.ss.android.ugc.aweme.sp.e r0 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                long r4 = r0.k     // Catch:{ all -> 0x0114 }
                r9 = 1
                long r4 = r4 + r9
                r0.k = r4     // Catch:{ all -> 0x0114 }
            L_0x0106:
                com.ss.android.ugc.aweme.sp.e r0 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x0114 }
                long r4 = r0.k     // Catch:{ all -> 0x0114 }
                monitor-exit(r3)     // Catch:{ all -> 0x0114 }
                monitor-exit(r1)     // Catch:{ all -> 0x0117 }
                com.ss.android.ugc.aweme.sp.e$b r0 = new com.ss.android.ugc.aweme.sp.e$b
                r9 = 0
                r3 = r0
                r3.<init>(r4, r6, r7, r8, r9)
                return r0
            L_0x0114:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0114 }
                throw r0     // Catch:{ all -> 0x0117 }
            L_0x0117:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0117 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.e.a.a():com.ss.android.ugc.aweme.sp.e$b");
        }

        public a() {
        }

        public final SharedPreferences.Editor remove(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f4082a, false, 81748, new Class[]{String.class}, SharedPreferences.Editor.class)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[]{str}, this, f4082a, false, 81748, new Class[]{String.class}, SharedPreferences.Editor.class);
            }
            synchronized (this.f4084c) {
                this.f4085d.put(str, this);
            }
            return this;
        }

        public final void a(final b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f4082a, false, 81752, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f4082a, false, 81752, new Class[]{b.class}, Void.TYPE);
            } else if (bVar.f4099d != null && bVar.f4098c != null && bVar.f4098c.size() != 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = bVar.f4098c.size() - 1; size >= 0; size--) {
                        String str = bVar.f4098c.get(size);
                        for (SharedPreferences.OnSharedPreferenceChangeListener next : bVar.f4099d) {
                            if (next != null) {
                                next.onSharedPreferenceChanged(e.this, str);
                            }
                        }
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f4093a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f4093a, false, 81755, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f4093a, false, 81755, new Class[0], Void.TYPE);
                            return;
                        }
                        a.this.a(bVar);
                    }
                });
            }
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4082a, false, 81747, new Class[]{String.class, Boolean.TYPE}, SharedPreferences.Editor.class)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f4082a, false, 81747, new Class[]{String.class, Boolean.TYPE}, SharedPreferences.Editor.class);
            }
            synchronized (this.f4084c) {
                this.f4085d.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f2) {
            if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2)}, this, f4082a, false, 81746, new Class[]{String.class, Float.TYPE}, SharedPreferences.Editor.class)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2)}, this, f4082a, false, 81746, new Class[]{String.class, Float.TYPE}, SharedPreferences.Editor.class);
            }
            synchronized (this.f4084c) {
                this.f4085d.put(str, Float.valueOf(f2));
            }
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f4082a, false, 81744, new Class[]{String.class, Integer.TYPE}, SharedPreferences.Editor.class)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f4082a, false, 81744, new Class[]{String.class, Integer.TYPE}, SharedPreferences.Editor.class);
            }
            synchronized (this.f4084c) {
                this.f4085d.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f4082a, false, 81745, new Class[]{String.class, Long.TYPE}, SharedPreferences.Editor.class)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f4082a, false, 81745, new Class[]{String.class, Long.TYPE}, SharedPreferences.Editor.class);
            }
            synchronized (this.f4084c) {
                this.f4085d.put(str, Long.valueOf(j));
            }
            return this;
        }

        public final SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
            HashSet hashSet;
            if (PatchProxy.isSupport(new Object[]{str, set}, this, f4082a, false, 81743, new Class[]{String.class, Set.class}, SharedPreferences.Editor.class)) {
                return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[]{str, set}, this, f4082a, false, 81743, new Class[]{String.class, Set.class}, SharedPreferences.Editor.class);
            }
            synchronized (this.f4084c) {
                Map<String, Object> map = this.f4085d;
                if (set == null) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet(set);
                }
                map.put(str, hashSet);
            }
            return this;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|(2:11|(1:13)(1:(2:15|16)))|17|18) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00d0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.SharedPreferences.Editor putString(java.lang.String r21, @android.support.annotation.Nullable java.lang.String r22) {
            /*
                r20 = this;
                r8 = r20
                r0 = r21
                r9 = r22
                r10 = 2
                java.lang.Object[] r1 = new java.lang.Object[r10]
                r11 = 0
                r1[r11] = r0
                r12 = 1
                r1[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r3 = f4082a
                java.lang.Class[] r6 = new java.lang.Class[r10]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r11] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r12] = r2
                java.lang.Class<android.content.SharedPreferences$Editor> r7 = android.content.SharedPreferences.Editor.class
                r4 = 0
                r5 = 81742(0x13f4e, float:1.14545E-40)
                r2 = r20
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x004a
                java.lang.Object[] r1 = new java.lang.Object[r10]
                r1[r11] = r0
                r1[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r3 = f4082a
                r4 = 0
                r5 = 81742(0x13f4e, float:1.14545E-40)
                java.lang.Class[] r6 = new java.lang.Class[r10]
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r11] = r0
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r12] = r0
                java.lang.Class<android.content.SharedPreferences$Editor> r7 = android.content.SharedPreferences.Editor.class
                r2 = r20
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                android.content.SharedPreferences$Editor r0 = (android.content.SharedPreferences.Editor) r0
                return r0
            L_0x004a:
                java.lang.Object r1 = r8.f4084c
                monitor-enter(r1)
                java.util.Map<java.lang.String, java.lang.Object> r2 = r8.f4085d     // Catch:{ all -> 0x00d2 }
                r2.put(r0, r9)     // Catch:{ all -> 0x00d2 }
                if (r9 == 0) goto L_0x00d0
                int r2 = r22.length()     // Catch:{ all -> 0x00d2 }
                r3 = 500(0x1f4, float:7.0E-43)
                if (r2 <= r3) goto L_0x00d0
                com.ss.android.ugc.aweme.sp.e r2 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x00d2 }
                java.lang.String r2 = r2.f4070c     // Catch:{ all -> 0x00d2 }
                r3 = 3
                java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d2 }
                r13[r11] = r2     // Catch:{ all -> 0x00d2 }
                r13[r12] = r0     // Catch:{ all -> 0x00d2 }
                r13[r10] = r9     // Catch:{ all -> 0x00d2 }
                r14 = 0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.sp.f.f4102a     // Catch:{ all -> 0x00d2 }
                r16 = 1
                r17 = 81768(0x13f68, float:1.14581E-40)
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d2 }
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r11] = r5     // Catch:{ all -> 0x00d2 }
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r12] = r5     // Catch:{ all -> 0x00d2 }
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r10] = r5     // Catch:{ all -> 0x00d2 }
                java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x00d2 }
                r18 = r4
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00d2 }
                if (r4 == 0) goto L_0x00af
                java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d2 }
                r13[r11] = r2     // Catch:{ all -> 0x00d2 }
                r13[r12] = r0     // Catch:{ all -> 0x00d2 }
                r13[r10] = r9     // Catch:{ all -> 0x00d2 }
                r14 = 0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.sp.f.f4102a     // Catch:{ all -> 0x00d2 }
                r16 = 1
                r17 = 81768(0x13f68, float:1.14581E-40)
                java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d2 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r11] = r2     // Catch:{ all -> 0x00d2 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r12] = r2     // Catch:{ all -> 0x00d2 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r10] = r2     // Catch:{ all -> 0x00d2 }
                java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x00d2 }
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00d2 }
                goto L_0x00d0
            L_0x00af:
                if (r9 == 0) goto L_0x00d0
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d0 }
                r3.<init>()     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r4 = "sp_value_size"
                int r5 = r22.length()     // Catch:{ Exception -> 0x00d0 }
                r3.put(r4, r5)     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r4 = "sp_file_name"
                r3.put(r4, r2)     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r2 = "sp_key"
                r3.put(r2, r0)     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r0 = "sp_put_big_size_value"
                java.lang.String r2 = "sp_put_big_size_value"
                com.ss.android.ugc.aweme.base.n.b((java.lang.String) r0, (java.lang.String) r2, (org.json.JSONObject) r3)     // Catch:{ Exception -> 0x00d0 }
            L_0x00d0:
                monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
                return r8
            L_0x00d2:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.e.a.putString(java.lang.String, java.lang.String):android.content.SharedPreferences$Editor");
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4096a;

        /* renamed from: b  reason: collision with root package name */
        final long f4097b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        final List<String> f4098c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        final Set<SharedPreferences.OnSharedPreferenceChangeListener> f4099d;

        /* renamed from: e  reason: collision with root package name */
        final Map<String, Object> f4100e;

        /* renamed from: f  reason: collision with root package name */
        final CountDownLatch f4101f;
        @GuardedBy("mWritingToDiskLock")
        volatile boolean g;
        boolean h;

        /* access modifiers changed from: package-private */
        public final void a(boolean z, boolean z2) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4096a, false, 81756, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f4096a, false, 81756, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.h = z;
            this.g = z2;
            this.f4101f.countDown();
        }

        private b(long j, @Nullable List<String> list, @Nullable Set<SharedPreferences.OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.f4101f = new CountDownLatch(1);
            this.g = false;
            this.h = false;
            this.f4097b = j;
            this.f4098c = list;
            this.f4099d = set;
            this.f4100e = map;
        }

        /* synthetic */ b(long j, List list, Set set, Map map, byte b2) {
            this(j, list, set, map);
        }
    }

    public final SharedPreferences.Editor edit() {
        if (PatchProxy.isSupport(new Object[0], this, f4068a, false, 81736, new Class[0], SharedPreferences.Editor.class)) {
            return (SharedPreferences.Editor) PatchProxy.accessDispatch(new Object[0], this, f4068a, false, 81736, new Class[0], SharedPreferences.Editor.class);
        }
        synchronized (this.f4072e) {
            a();
        }
        return new a();
    }

    public final Map<String, ?> getAll() {
        HashMap hashMap;
        if (PatchProxy.isSupport(new Object[0], this, f4068a, false, 81728, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f4068a, false, 81728, new Class[0], Map.class);
        }
        synchronized (this.f4072e) {
            a();
            hashMap = new HashMap(this.g);
        }
        return hashMap;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4068a, false, 81727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4068a, false, 81727, new Class[0], Void.TYPE);
            return;
        }
        if (!this.i) {
            if (PatchProxy.isSupport(new Object[0], null, a.f4051a, true, 81675, new Class[0], a.C0029a.class)) {
                a.C0029a aVar = (a.C0029a) PatchProxy.accessDispatch(new Object[0], null, a.f4051a, true, 81675, new Class[0], a.C0029a.class);
            } else {
                a.C0029a aVar2 = a.f4053c.get();
            }
        }
        while (!this.i) {
            try {
                this.f4072e.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onSharedPreferenceChangeListener}, this, f4068a, false, 81726, new Class[]{SharedPreferences.OnSharedPreferenceChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSharedPreferenceChangeListener}, this, f4068a, false, 81726, new Class[]{SharedPreferences.OnSharedPreferenceChangeListener.class}, Void.TYPE);
            return;
        }
        synchronized (this.f4072e) {
            this.j.remove(onSharedPreferenceChangeListener);
        }
    }

    static FileOutputStream a(File file) {
        FileOutputStream fileOutputStream;
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, null, f4068a, true, 81738, new Class[]{File.class}, FileOutputStream.class)) {
            return (FileOutputStream) PatchProxy.accessDispatch(new Object[]{file2}, null, f4068a, true, 81738, new Class[]{File.class}, FileOutputStream.class);
        }
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException unused2) {
                fileOutputStream = null;
            }
        }
        return fileOutputStream;
    }

    public final boolean contains(String str) {
        boolean containsKey;
        if (PatchProxy.isSupport(new Object[]{str}, this, f4068a, false, 81735, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f4068a, false, 81735, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        synchronized (this.f4072e) {
            a();
            containsKey = this.g.containsKey(str);
        }
        return containsKey;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onSharedPreferenceChangeListener}, this, f4068a, false, 81725, new Class[]{SharedPreferences.OnSharedPreferenceChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSharedPreferenceChangeListener}, this, f4068a, false, 81725, new Class[]{SharedPreferences.OnSharedPreferenceChangeListener.class}, Void.TYPE);
            return;
        }
        synchronized (this.f4072e) {
            this.j.put(onSharedPreferenceChangeListener, m);
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4068a, false, 81734, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f4068a, false, 81734, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        synchronized (this.f4072e) {
            a();
            Boolean bool = (Boolean) this.g.get(str);
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = z;
            }
        }
        return z2;
    }

    public final float getFloat(String str, float f2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2)}, this, f4068a, false, 81733, new Class[]{String.class, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2)}, this, f4068a, false, 81733, new Class[]{String.class, Float.TYPE}, Float.TYPE)).floatValue();
        }
        synchronized (this.f4072e) {
            a();
            Float f4 = (Float) this.g.get(str);
            if (f4 != null) {
                f3 = f4.floatValue();
            } else {
                f3 = f2;
            }
        }
        return f3;
    }

    public final int getInt(String str, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f4068a, false, 81731, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f4068a, false, 81731, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        synchronized (this.f4072e) {
            a();
            Integer num = (Integer) this.g.get(str);
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = i2;
            }
        }
        return i3;
    }

    public final long getLong(String str, long j2) {
        long j3;
        String str2 = str;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j4)}, this, f4068a, false, 81732, new Class[]{String.class, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2, new Long(j4)}, this, f4068a, false, 81732, new Class[]{String.class, Long.TYPE}, Long.TYPE)).longValue();
        }
        synchronized (this.f4072e) {
            a();
            Long l2 = (Long) this.g.get(str);
            if (l2 != null) {
                j3 = l2.longValue();
            } else {
                j3 = j4;
            }
        }
        return j3;
    }

    @Nullable
    public final String getString(String str, @Nullable String str2) {
        String str3;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f4068a, false, 81729, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f4068a, false, 81729, new Class[]{String.class, String.class}, String.class);
        }
        synchronized (this.f4072e) {
            a();
            str3 = (String) this.g.get(str);
            if (str3 == null) {
                str3 = str2;
            }
        }
        return str3;
    }

    @Nullable
    public final Set<String> getStringSet(String str, @Nullable Set<String> set) {
        Set<String> set2;
        if (PatchProxy.isSupport(new Object[]{str, set}, this, f4068a, false, 81730, new Class[]{String.class, Set.class}, Set.class)) {
            return (Set) PatchProxy.accessDispatch(new Object[]{str, set}, this, f4068a, false, 81730, new Class[]{String.class, Set.class}, Set.class);
        }
        synchronized (this.f4072e) {
            a();
            set2 = (Set) this.g.get(str);
            if (set2 == null) {
                set2 = set;
            }
        }
        return set2;
    }

    public e(String str, File file) {
        File file2;
        this.f4069b = file;
        this.f4070c = str;
        File file3 = this.f4069b;
        if (PatchProxy.isSupport(new Object[]{file3}, null, f4068a, true, 81724, new Class[]{File.class}, File.class)) {
            file2 = (File) PatchProxy.accessDispatch(new Object[]{file3}, null, f4068a, true, 81724, new Class[]{File.class}, File.class);
        } else {
            file2 = new File(file3.getPath() + ".bak");
        }
        this.f4071d = file2;
        this.i = false;
        this.g = null;
        if (PatchProxy.isSupport(new Object[0], this, f4068a, false, 81722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4068a, false, 81722, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this.f4072e) {
            this.i = false;
        }
        new Thread("KwaiSharedPreferencesImpl-load") {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f4074a;

            /* JADX WARNING: Can't wrap try/catch for region: R(5:34|35|(0)|39|40) */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
                r5 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
                if (r10.f4069b.canRead() == false) goto L_0x00e2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
                r7 = new java.io.BufferedInputStream(new java.io.FileInputStream(r10.f4069b), 16384);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
                if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[]{r7}, null, com.ss.android.ugc.aweme.sp.i.f4107a, true, 81803, new java.lang.Class[]{java.io.InputStream.class}, java.util.HashMap.class) == false) goto L_0x00c0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
                r0 = (java.util.HashMap) com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[]{r7}, null, com.ss.android.ugc.aweme.sp.i.f4107a, true, 81803, new java.lang.Class[]{java.io.InputStream.class}, java.util.HashMap.class);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
                r0 = android.util.Xml.newPullParser();
                r0.setInput(r7, null);
                r0 = (java.util.HashMap) com.ss.android.ugc.aweme.sp.i.a(r0, new java.lang.String[1]);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
                r5 = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
                r7.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d4, code lost:
                r0 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
                r0 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
                r7 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
                if (r7 != null) goto L_0x00da;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
                r7.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
                r7 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
                if (r7 != null) goto L_0x00d0;
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00dd */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00da A[SYNTHETIC, Splitter:B:37:0x00da] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r24 = this;
                    r1 = 0
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    com.meituan.robust.ChangeQuickRedirect r4 = f4074a
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r5 = 0
                    r6 = 81740(0x13f4c, float:1.14542E-40)
                    r3 = r24
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r0 == 0) goto L_0x0027
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    com.meituan.robust.ChangeQuickRedirect r4 = f4074a
                    r5 = 0
                    r6 = 81740(0x13f4c, float:1.14542E-40)
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r24
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    return
                L_0x0027:
                    r2 = r24
                    com.ss.android.ugc.aweme.sp.e r10 = com.ss.android.ugc.aweme.sp.e.this
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.sp.e.f4068a
                    r6 = 0
                    r7 = 81723(0x13f3b, float:1.14518E-40)
                    java.lang.Class[] r8 = new java.lang.Class[r1]
                    java.lang.Class r9 = java.lang.Void.TYPE
                    r4 = r10
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                    if (r0 == 0) goto L_0x004f
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.sp.e.f4068a
                    r6 = 0
                    r7 = 81723(0x13f3b, float:1.14518E-40)
                    java.lang.Class[] r8 = new java.lang.Class[r1]
                    java.lang.Class r9 = java.lang.Void.TYPE
                    r4 = r10
                    com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                    return
                L_0x004f:
                    long r3 = java.lang.System.currentTimeMillis()
                    java.lang.Object r5 = r10.f4072e
                    monitor-enter(r5)
                    boolean r0 = r10.i     // Catch:{ all -> 0x0195 }
                    if (r0 == 0) goto L_0x005c
                    monitor-exit(r5)     // Catch:{ all -> 0x0195 }
                    return
                L_0x005c:
                    java.io.File r0 = r10.f4071d     // Catch:{ all -> 0x0195 }
                    boolean r0 = r0.exists()     // Catch:{ all -> 0x0195 }
                    if (r0 == 0) goto L_0x0070
                    java.io.File r0 = r10.f4069b     // Catch:{ all -> 0x0195 }
                    r0.delete()     // Catch:{ all -> 0x0195 }
                    java.io.File r0 = r10.f4071d     // Catch:{ all -> 0x0195 }
                    java.io.File r6 = r10.f4069b     // Catch:{ all -> 0x0195 }
                    r0.renameTo(r6)     // Catch:{ all -> 0x0195 }
                L_0x0070:
                    monitor-exit(r5)     // Catch:{ all -> 0x0195 }
                    r5 = 0
                    r6 = 1
                    java.io.File r0 = r10.f4069b     // Catch:{  }
                    boolean r0 = r0.canRead()     // Catch:{  }
                    if (r0 == 0) goto L_0x00e2
                    java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00de, all -> 0x00d6 }
                    java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00de, all -> 0x00d6 }
                    java.io.File r8 = r10.f4069b     // Catch:{ Exception -> 0x00de, all -> 0x00d6 }
                    r0.<init>(r8)     // Catch:{ Exception -> 0x00de, all -> 0x00d6 }
                    r8 = 16384(0x4000, float:2.2959E-41)
                    r7.<init>(r0, r8)     // Catch:{ Exception -> 0x00de, all -> 0x00d6 }
                    java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    r11[r1] = r7     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.sp.i.f4107a     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    r14 = 1
                    r15 = 81803(0x13f8b, float:1.1463E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.lang.Class<java.io.InputStream> r8 = java.io.InputStream.class
                    r0[r1] = r8     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.lang.Class<java.util.HashMap> r17 = java.util.HashMap.class
                    r16 = r0
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    if (r0 == 0) goto L_0x00c0
                    java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    r11[r1] = r7     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.sp.i.f4107a     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    r14 = 1
                    r15 = 81803(0x13f8b, float:1.1463E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.lang.Class<java.io.InputStream> r8 = java.io.InputStream.class
                    r0[r1] = r8     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.lang.Class<java.util.HashMap> r17 = java.util.HashMap.class
                    r16 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    goto L_0x00cf
                L_0x00c0:
                    org.xmlpull.v1.XmlPullParser r0 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    r0.setInput(r7, r5)     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.lang.Object r0 = com.ss.android.ugc.aweme.sp.i.a(r0, r8)     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                    java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x00df, all -> 0x00d4 }
                L_0x00cf:
                    r5 = r0
                L_0x00d0:
                    r7.close()     // Catch:{ Exception -> 0x00e2 }
                    goto L_0x00e2
                L_0x00d4:
                    r0 = move-exception
                    goto L_0x00d8
                L_0x00d6:
                    r0 = move-exception
                    r7 = r5
                L_0x00d8:
                    if (r7 == 0) goto L_0x00dd
                    r7.close()     // Catch:{ IOException -> 0x00dd }
                L_0x00dd:
                    throw r0     // Catch:{  }
                L_0x00de:
                    r7 = r5
                L_0x00df:
                    if (r7 == 0) goto L_0x00e2
                    goto L_0x00d0
                L_0x00e2:
                    java.lang.Object r7 = r10.f4072e
                    monitor-enter(r7)
                    r10.i = r6     // Catch:{ all -> 0x0192 }
                    if (r5 == 0) goto L_0x00ec
                    r10.g = r5     // Catch:{ all -> 0x0192 }
                    goto L_0x00f3
                L_0x00ec:
                    java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0192 }
                    r0.<init>()     // Catch:{ all -> 0x0192 }
                    r10.g = r0     // Catch:{ all -> 0x0192 }
                L_0x00f3:
                    java.lang.Object r0 = r10.f4072e     // Catch:{ all -> 0x0192 }
                    r0.notifyAll()     // Catch:{ all -> 0x0192 }
                    monitor-exit(r7)     // Catch:{ all -> 0x0192 }
                    long r7 = java.lang.System.currentTimeMillis()
                    long r7 = r7 - r3
                    long r3 = java.lang.Math.abs(r7)
                    r7 = 400(0x190, double:1.976E-321)
                    int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r0 < 0) goto L_0x0191
                    java.lang.String r0 = r10.f4070c
                    java.io.File r5 = r10.f4069b
                    long r7 = r5.length()
                    r5 = 3
                    java.lang.Object[] r9 = new java.lang.Object[r5]
                    r9[r1] = r0
                    java.lang.Long r10 = new java.lang.Long
                    r10.<init>(r3)
                    r9[r6] = r10
                    java.lang.Long r10 = new java.lang.Long
                    r10.<init>(r7)
                    r16 = 2
                    r9[r16] = r10
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.sp.f.f4102a
                    r12 = 1
                    r13 = 81767(0x13f67, float:1.1458E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r5]
                    java.lang.Class<java.lang.String> r15 = java.lang.String.class
                    r14[r1] = r15
                    java.lang.Class r15 = java.lang.Long.TYPE
                    r14[r6] = r15
                    java.lang.Class r15 = java.lang.Long.TYPE
                    r14[r16] = r15
                    java.lang.Class r15 = java.lang.Void.TYPE
                    boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r9 == 0) goto L_0x0175
                    java.lang.Object[] r9 = new java.lang.Object[r5]
                    r9[r1] = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r3)
                    r9[r6] = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r7)
                    r9[r16] = r0
                    r18 = 0
                    com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.sp.f.f4102a
                    r20 = 1
                    r21 = 81767(0x13f67, float:1.1458E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r5]
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r1] = r3
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r0[r6] = r1
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r0[r16] = r1
                    java.lang.Class r23 = java.lang.Void.TYPE
                    r17 = r9
                    r22 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
                    return
                L_0x0175:
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0191 }
                    r1.<init>()     // Catch:{ Exception -> 0x0191 }
                    java.lang.String r5 = "sp_init_cost_time"
                    r1.put(r5, r3)     // Catch:{ Exception -> 0x0191 }
                    java.lang.String r3 = "sp_file_name"
                    r1.put(r3, r0)     // Catch:{ Exception -> 0x0191 }
                    java.lang.String r0 = "sp_file_size"
                    r1.put(r0, r7)     // Catch:{ Exception -> 0x0191 }
                    java.lang.String r0 = "sp_init_cost"
                    java.lang.String r3 = "sp_init_cost"
                    com.ss.android.ugc.aweme.base.n.b((java.lang.String) r0, (java.lang.String) r3, (org.json.JSONObject) r1)     // Catch:{ Exception -> 0x0191 }
                    return
                L_0x0191:
                    return
                L_0x0192:
                    r0 = move-exception
                    monitor-exit(r7)     // Catch:{ all -> 0x0192 }
                    throw r0
                L_0x0195:
                    r0 = move-exception
                    monitor-exit(r5)     // Catch:{ all -> 0x0195 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.e.AnonymousClass1.run():void");
            }
        }.start();
    }

    public final void a(b bVar, Runnable runnable, a aVar, List<String> list, boolean z) {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[]{bVar, runnable, aVar, list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f4068a, false, 81737, new Class[]{b.class, Runnable.class, a.class, List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, runnable, aVar, list, Byte.valueOf(z)}, this, f4068a, false, 81737, new Class[]{b.class, Runnable.class, a.class, List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (runnable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        final b bVar2 = bVar;
        final boolean z4 = z2;
        final Runnable runnable2 = runnable;
        final List<String> list2 = list;
        AnonymousClass2 r1 = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f4076a;

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0146 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0156 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r19 = this;
                    r8 = r19
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f4076a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 81741(0x13f4d, float:1.14544E-40)
                    r2 = r19
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0029
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f4076a
                    r4 = 0
                    r5 = 81741(0x13f4d, float:1.14544E-40)
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r2 = r19
                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    return
                L_0x0029:
                    long r1 = java.lang.System.currentTimeMillis()
                    com.ss.android.ugc.aweme.sp.e r3 = com.ss.android.ugc.aweme.sp.e.this
                    java.lang.Object r3 = r3.f4073f
                    monitor-enter(r3)
                    com.ss.android.ugc.aweme.sp.e r4 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x01fc }
                    com.ss.android.ugc.aweme.sp.e$b r5 = r3     // Catch:{ all -> 0x01fc }
                    boolean r6 = r4     // Catch:{ all -> 0x01fc }
                    r7 = 2
                    java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x01fc }
                    r9[r0] = r5     // Catch:{ all -> 0x01fc }
                    java.lang.Byte r10 = java.lang.Byte.valueOf(r6)     // Catch:{ all -> 0x01fc }
                    r15 = 1
                    r9[r15] = r10     // Catch:{ all -> 0x01fc }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.sp.e.f4068a     // Catch:{ all -> 0x01fc }
                    r12 = 0
                    r13 = 81739(0x13f4b, float:1.14541E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ all -> 0x01fc }
                    java.lang.Class<com.ss.android.ugc.aweme.sp.e$b> r10 = com.ss.android.ugc.aweme.sp.e.b.class
                    r14[r0] = r10     // Catch:{ all -> 0x01fc }
                    java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01fc }
                    r14[r15] = r10     // Catch:{ all -> 0x01fc }
                    java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ all -> 0x01fc }
                    r10 = r4
                    r15 = r16
                    boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01fc }
                    if (r9 == 0) goto L_0x0083
                    java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x01fc }
                    r9[r0] = r5     // Catch:{ all -> 0x01fc }
                    java.lang.Byte r5 = java.lang.Byte.valueOf(r6)     // Catch:{ all -> 0x01fc }
                    r6 = 1
                    r9[r6] = r5     // Catch:{ all -> 0x01fc }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.sp.e.f4068a     // Catch:{ all -> 0x01fc }
                    r12 = 0
                    r13 = 81739(0x13f4b, float:1.14541E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ all -> 0x01fc }
                    java.lang.Class<com.ss.android.ugc.aweme.sp.e$b> r5 = com.ss.android.ugc.aweme.sp.e.b.class
                    r14[r0] = r5     // Catch:{ all -> 0x01fc }
                    java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01fc }
                    r14[r6] = r5     // Catch:{ all -> 0x01fc }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ all -> 0x01fc }
                    r10 = r4
                    com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01fc }
                    r9 = 1
                    goto L_0x0164
                L_0x0083:
                    r9 = 1
                    java.io.File r10 = r4.f4069b     // Catch:{ all -> 0x01fc }
                    boolean r10 = r10.exists()     // Catch:{ all -> 0x01fc }
                    if (r10 == 0) goto L_0x00cf
                    long r10 = r4.l     // Catch:{ all -> 0x01fc }
                    long r12 = r5.f4097b     // Catch:{ all -> 0x01fc }
                    int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r14 >= 0) goto L_0x00ab
                    if (r6 == 0) goto L_0x0098
                    r10 = 1
                    goto L_0x00ac
                L_0x0098:
                    java.lang.Object r6 = r4.f4072e     // Catch:{ all -> 0x01fc }
                    monitor-enter(r6)     // Catch:{ all -> 0x01fc }
                    long r10 = r4.k     // Catch:{ all -> 0x00a8 }
                    long r12 = r5.f4097b     // Catch:{ all -> 0x00a8 }
                    int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r14 != 0) goto L_0x00a5
                    r10 = 1
                    goto L_0x00a6
                L_0x00a5:
                    r10 = 0
                L_0x00a6:
                    monitor-exit(r6)     // Catch:{ all -> 0x00a8 }
                    goto L_0x00ac
                L_0x00a8:
                    r0 = move-exception
                    monitor-exit(r6)     // Catch:{ all -> 0x00a8 }
                    throw r0     // Catch:{ all -> 0x01fc }
                L_0x00ab:
                    r10 = 0
                L_0x00ac:
                    if (r10 != 0) goto L_0x00b3
                    r5.a(r0, r9)     // Catch:{ all -> 0x01fc }
                    goto L_0x0164
                L_0x00b3:
                    java.io.File r6 = r4.f4071d     // Catch:{ all -> 0x01fc }
                    boolean r6 = r6.exists()     // Catch:{ all -> 0x01fc }
                    if (r6 != 0) goto L_0x00ca
                    java.io.File r6 = r4.f4069b     // Catch:{ all -> 0x01fc }
                    java.io.File r10 = r4.f4071d     // Catch:{ all -> 0x01fc }
                    boolean r6 = r6.renameTo(r10)     // Catch:{ all -> 0x01fc }
                    if (r6 != 0) goto L_0x00cf
                    r5.a(r0, r0)     // Catch:{ all -> 0x01fc }
                    goto L_0x0164
                L_0x00ca:
                    java.io.File r6 = r4.f4069b     // Catch:{ all -> 0x01fc }
                    r6.delete()     // Catch:{ all -> 0x01fc }
                L_0x00cf:
                    java.io.File r6 = r4.f4069b     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.io.FileOutputStream r6 = com.ss.android.ugc.aweme.sp.e.a(r6)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    if (r6 != 0) goto L_0x00dc
                    r5.a(r0, r0)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    goto L_0x0164
                L_0x00dc:
                    java.util.Map<java.lang.String, java.lang.Object> r10 = r5.f4100e     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r11[r0] = r10     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r11[r9] = r6     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.sp.i.f4107a     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r14 = 1
                    java.lang.Class[] r15 = new java.lang.Class[r7]     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Class<java.util.Map> r16 = java.util.Map.class
                    r15[r0] = r16     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Class<java.io.OutputStream> r16 = java.io.OutputStream.class
                    r15[r9] = r16     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r16 = r15
                    r15 = 81795(0x13f83, float:1.14619E-40)
                    boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    if (r11 == 0) goto L_0x011e
                    java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r12[r0] = r10     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r12[r9] = r6     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r13 = 0
                    com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.sp.i.f4107a     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r15 = 1
                    r16 = 81795(0x13f83, float:1.14619E-40)
                    java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Class<java.util.Map> r11 = java.util.Map.class
                    r10[r0] = r11     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Class<java.io.OutputStream> r11 = java.io.OutputStream.class
                    r10[r9] = r11     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r17 = r10
                    com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    goto L_0x0139
                L_0x011e:
                    com.ss.android.ugc.aweme.sp.c r11 = new com.ss.android.ugc.aweme.sp.c     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r11.<init>()     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.String r12 = "utf-8"
                    r11.setOutput(r6, r12)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r13 = 0
                    r11.startDocument(r13, r12)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.lang.String r12 = "http://xmlpull.org/v1/doc/features.html#indent-output"
                    r11.setFeature(r12, r9)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    com.ss.android.ugc.aweme.sp.i.a((java.util.Map) r10, (java.lang.String) r13, (org.xmlpull.v1.XmlSerializer) r11)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r11.endDocument()     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                L_0x0139:
                    boolean r10 = com.ss.android.ugc.aweme.sp.d.b()     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    if (r10 != 0) goto L_0x0146
                    java.io.FileDescriptor r10 = r6.getFD()     // Catch:{ Exception -> 0x0146 }
                    r10.sync()     // Catch:{ Exception -> 0x0146 }
                L_0x0146:
                    r6.close()     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    java.io.File r6 = r4.f4071d     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r6.delete()     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    long r10 = r5.f4097b     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r4.l = r10     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    r5.a(r9, r9)     // Catch:{ IOException -> 0x015c, XmlPullParserException -> 0x0156 }
                    goto L_0x0164
                L_0x0156:
                    java.io.File r4 = r4.f4069b     // Catch:{ all -> 0x01fc }
                    r4.delete()     // Catch:{ all -> 0x01fc }
                    goto L_0x0161
                L_0x015c:
                    java.io.File r4 = r4.f4069b     // Catch:{ all -> 0x01fc }
                    r4.delete()     // Catch:{ all -> 0x01fc }
                L_0x0161:
                    r5.a(r0, r0)     // Catch:{ all -> 0x01fc }
                L_0x0164:
                    monitor-exit(r3)     // Catch:{ all -> 0x01fc }
                    com.ss.android.ugc.aweme.sp.e r3 = com.ss.android.ugc.aweme.sp.e.this
                    java.lang.Object r4 = r3.f4072e
                    monitor-enter(r4)
                    com.ss.android.ugc.aweme.sp.e r3 = com.ss.android.ugc.aweme.sp.e.this     // Catch:{ all -> 0x01f9 }
                    int r5 = r3.h     // Catch:{ all -> 0x01f9 }
                    int r5 = r5 - r9
                    r3.h = r5     // Catch:{ all -> 0x01f9 }
                    monitor-exit(r4)     // Catch:{ all -> 0x01f9 }
                    java.lang.Runnable r3 = r5
                    if (r3 == 0) goto L_0x017b
                    java.lang.Runnable r3 = r5
                    r3.run()
                L_0x017b:
                    long r3 = java.lang.System.currentTimeMillis()
                    long r3 = r3 - r1
                    r1 = 100
                    int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r5 <= 0) goto L_0x01f8
                    com.ss.android.ugc.aweme.sp.e r1 = com.ss.android.ugc.aweme.sp.e.this
                    java.lang.String r1 = r1.f4070c
                    java.util.List r2 = r6
                    r5 = 3
                    java.lang.Object[] r10 = new java.lang.Object[r5]
                    r10[r0] = r1
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r3)
                    r10[r9] = r6
                    r10[r7] = r2
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.sp.f.f4102a
                    r13 = 1
                    r14 = 81769(0x13f69, float:1.14583E-40)
                    java.lang.Class[] r15 = new java.lang.Class[r5]
                    java.lang.Class<java.lang.String> r6 = java.lang.String.class
                    r15[r0] = r6
                    java.lang.Class r6 = java.lang.Long.TYPE
                    r15[r9] = r6
                    java.lang.Class<java.util.List> r6 = java.util.List.class
                    r15[r7] = r6
                    java.lang.Class r16 = java.lang.Void.TYPE
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                    if (r6 == 0) goto L_0x01df
                    java.lang.Object[] r10 = new java.lang.Object[r5]
                    r10[r0] = r1
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r3)
                    r10[r9] = r1
                    r10[r7] = r2
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.sp.f.f4102a
                    r13 = 1
                    r14 = 81769(0x13f69, float:1.14583E-40)
                    java.lang.Class[] r15 = new java.lang.Class[r5]
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r15[r0] = r1
                    java.lang.Class r0 = java.lang.Long.TYPE
                    r15[r9] = r0
                    java.lang.Class<java.util.List> r0 = java.util.List.class
                    r15[r7] = r0
                    java.lang.Class r16 = java.lang.Void.TYPE
                    com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    return
                L_0x01df:
                    if (r2 == 0) goto L_0x01f8
                    org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01f8 }
                    r0.<init>()     // Catch:{ Exception -> 0x01f8 }
                    java.lang.String r2 = "sp_apply_cost_time"
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x01f8 }
                    java.lang.String r2 = "sp_file_name"
                    r0.put(r2, r1)     // Catch:{ Exception -> 0x01f8 }
                    java.lang.String r1 = "sp_apply_cost"
                    java.lang.String r2 = "sp_apply_cost"
                    com.ss.android.ugc.aweme.base.n.b((java.lang.String) r1, (java.lang.String) r2, (org.json.JSONObject) r0)     // Catch:{ Exception -> 0x01f8 }
                    return
                L_0x01f8:
                    return
                L_0x01f9:
                    r0 = move-exception
                    monitor-exit(r4)     // Catch:{ all -> 0x01f9 }
                    throw r0
                L_0x01fc:
                    r0 = move-exception
                    monitor-exit(r3)     // Catch:{ all -> 0x01fc }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.e.AnonymousClass2.run():void");
            }
        };
        if (z2) {
            synchronized (this.f4072e) {
                if (this.h == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                r1.run();
                return;
            }
        }
        boolean z5 = !z2;
        if (PatchProxy.isSupport(new Object[]{r1, Byte.valueOf(z5 ? (byte) 1 : 0)}, null, d.f4061a, true, 81717, new Class[]{Runnable.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{r1, Byte.valueOf(z5)}, null, d.f4061a, true, 81717, new Class[]{Runnable.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Handler a2 = d.a();
        synchronized (d.f4062b) {
            d.f4065e.add(r1);
            if (!z5 || !d.f4066f) {
                a2.sendEmptyMessage(1);
            } else {
                a2.sendEmptyMessageDelayed(1, 100);
            }
        }
    }
}
