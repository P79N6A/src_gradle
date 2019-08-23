package com.ss.android.ugc.aweme.mediachoose.a;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Message;
import android.provider.MediaStore;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressLint({"CI_StaticFieldLeak"})
public final class d implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55265a;

    /* renamed from: e  reason: collision with root package name */
    private static d f55266e;

    /* renamed from: b  reason: collision with root package name */
    public Context f55267b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f55268c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, com.ss.android.ugc.aweme.music.b.a.a> f55269d = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private b f55270f = new b(this.f55268c);
    private boolean g = false;
    private final HashMap<Integer, List<com.ss.android.ugc.aweme.music.b.a.a>> h = new HashMap<>();
    private final List<com.ss.android.ugc.aweme.music.b.a.a> i = new ArrayList();
    private final Set<c> j = new HashSet();
    private final Set<a> k = new HashSet();
    private final Set<b> l = new HashSet();

    public interface a {
        void a(int i);
    }

    public interface b {
        void a(boolean z, int i, List<com.ss.android.ugc.aweme.music.b.a.a> list);
    }

    public interface c {
        void a();
    }

    public static d a() {
        return f55266e;
    }

    public final void a(com.ss.android.ugc.aweme.music.b.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f55265a, false, 58639, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f55265a, false, 58639, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
        } else if (aVar != null) {
            if (!this.i.contains(aVar)) {
                this.i.add(aVar);
            }
            e();
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f55265a, false, 58634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55265a, false, 58634, new Class[0], Void.TYPE);
            return;
        }
        for (c a2 : this.j) {
            a2.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f55265a, false, 58644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55265a, false, 58644, new Class[0], Void.TYPE);
            return;
        }
        this.i.clear();
        e();
    }

    public final List<com.ss.android.ugc.aweme.music.b.a.a> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f55265a, false, 58645, new Class[0], List.class)) {
            return new ArrayList(this.i);
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f55265a, false, 58645, new Class[0], List.class);
    }

    private void d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f55265a, false, 58626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55265a, false, 58626, new Class[0], Void.TYPE);
            return;
        }
        if (!PatchProxy.isSupport(new Object[0], this, f55265a, false, 58649, new Class[0], Boolean.TYPE)) {
            int[] iArr = {1, 4, 3, 2};
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    z = false;
                    break;
                } else if (!Lists.isEmpty(a(iArr[i2]))) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f55265a, false, 58649, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (z && !this.g) {
            this.g = true;
            ContentResolver contentResolver = this.f55267b.getContentResolver();
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, this.f55270f);
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, false, this.f55270f);
        }
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f55265a, false, 58628, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f55265a, false, 58628, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.k.add(aVar2);
    }

    private d(Context context) {
        this.f55267b = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.ugc.aweme.mediachoose.a.d> r1 = com.ss.android.ugc.aweme.mediachoose.a.d.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0047 }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x0047 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f55265a     // Catch:{ all -> 0x0047 }
            r6 = 1
            r7 = 58625(0xe501, float:8.2151E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0047 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r10] = r9     // Catch:{ all -> 0x0047 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x0047 }
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x003a
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x0047 }
            r11[r10] = r0     // Catch:{ all -> 0x0047 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f55265a     // Catch:{ all -> 0x0047 }
            r14 = 1
            r15 = 58625(0xe501, float:8.2151E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0047 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r10] = r2     // Catch:{ all -> 0x0047 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ all -> 0x0047 }
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x003a:
            com.ss.android.ugc.aweme.mediachoose.a.d r2 = f55266e     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.mediachoose.a.d r2 = new com.ss.android.ugc.aweme.mediachoose.a.d     // Catch:{ all -> 0x0047 }
            r2.<init>(r0)     // Catch:{ all -> 0x0047 }
            f55266e = r2     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r1)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.a.d.a(android.content.Context):void");
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55265a, false, 58635, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55265a, false, 58635, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (a a2 : this.k) {
            a2.a(i2);
        }
    }

    public final List<com.ss.android.ugc.aweme.music.b.a.a> a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55265a, false, 58636, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55265a, false, 58636, new Class[]{Integer.TYPE}, List.class);
        }
        List list = this.h.get(Integer.valueOf(i2));
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    public final void b(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f55265a, false, 58629, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f55265a, false, 58629, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.k.remove(aVar2);
    }

    public final void b(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f55265a, false, 58633, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f55265a, false, 58633, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.l.remove(bVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f55265a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 58653(0xe51d, float:8.219E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f55265a
            r3 = 0
            r4 = 58653(0xe51d, float:8.219E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r0 = 10
            int r1 = r8.what
            if (r0 != r1) goto L_0x0040
            r11 = 1
            goto L_0x0041
        L_0x0040:
            r11 = 0
        L_0x0041:
            r0 = 0
            if (r11 == 0) goto L_0x0172
            java.lang.Object r0 = r8.obj
            r12 = r0
            java.util.List r12 = (java.util.List) r12
            int r13 = r8.arg1
            int r14 = r8.arg2
            r15 = 3
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            r16 = 2
            r0[r16] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f55265a
            r3 = 0
            r4 = 58647(0xe517, float:8.2182E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ab
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            r0[r16] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f55265a
            r3 = 0
            r4 = 58647(0xe517, float:8.2182E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x016e
        L_0x00ab:
            if (r12 == 0) goto L_0x016e
            java.util.HashMap<java.lang.Integer, java.util.List<com.ss.android.ugc.aweme.music.b.a.a>> r0 = r7.h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x00c9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.Integer, java.util.List<com.ss.android.ugc.aweme.music.b.a.a>> r1 = r7.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.put(r2, r0)
        L_0x00c9:
            r15 = r0
            java.util.Iterator r0 = r15.iterator()
        L_0x00ce:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.music.b.a.a r1 = (com.ss.android.ugc.aweme.music.b.a.a) r1
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.music.b.a.a> r2 = r7.f55269d
            java.lang.String r1 = r1.f56315e
            r2.remove(r1)
            goto L_0x00ce
        L_0x00e2:
            r15.clear()
            java.util.Iterator r16 = r12.iterator()
        L_0x00e9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r16.next()
            r6 = r0
            com.ss.android.ugc.aweme.music.b.a.a r6 = (com.ss.android.ugc.aweme.music.b.a.a) r6
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r6
            com.meituan.robust.ChangeQuickRedirect r2 = f55265a
            r3 = 0
            r4 = 58648(0xe518, float:8.2183E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.music.b.a.a> r1 = com.ss.android.ugc.aweme.music.b.a.a.class
            r5[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r1 = r18
            r10 = r6
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x012e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r17 = 0
            r0[r17] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f55265a
            r3 = 0
            r4 = 58648(0xe518, float:8.2183E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.music.b.a.a> r1 = com.ss.android.ugc.aweme.music.b.a.a.class
            r5[r17] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x012c:
            r10 = 0
            goto L_0x00e9
        L_0x012e:
            r17 = 0
            if (r10 != 0) goto L_0x0133
            goto L_0x012c
        L_0x0133:
            java.lang.String r0 = r10.f56315e
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.music.b.a.a> r1 = r7.f55269d
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L_0x012c
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.music.b.a.a> r1 = r7.f55269d
            r1.put(r0, r10)
            goto L_0x012c
        L_0x0143:
            r15.addAll(r12)
            if (r14 != r9) goto L_0x014b
            r7.b((int) r13)
        L_0x014b:
            java.util.List<com.ss.android.ugc.aweme.music.b.a.a> r0 = r7.i
            java.util.Iterator r0 = r0.iterator()
        L_0x0151:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.music.b.a.a r1 = (com.ss.android.ugc.aweme.music.b.a.a) r1
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.music.b.a.a> r2 = r7.f55269d
            java.lang.String r1 = r1.f56315e
            boolean r1 = r2.containsKey(r1)
            if (r1 != 0) goto L_0x0151
            r0.remove()
            goto L_0x0151
        L_0x016b:
            r18.e()
        L_0x016e:
            r18.d()
            r0 = r12
        L_0x0172:
            int r1 = r8.arg2
            if (r1 != 0) goto L_0x018e
            java.util.Set<com.ss.android.ugc.aweme.mediachoose.a.d$b> r1 = r7.l
            java.util.Iterator r1 = r1.iterator()
        L_0x017c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x018e
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.mediachoose.a.d$b r2 = (com.ss.android.ugc.aweme.mediachoose.a.d.b) r2
            int r3 = r8.arg1
            r2.a(r11, r3, r0)
            goto L_0x017c
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.a.d.handleMsg(android.os.Message):void");
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f55265a, false, 58632, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f55265a, false, 58632, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.l.add(bVar2);
    }

    public final void b(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f55265a, false, 58631, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f55265a, false, 58631, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.j.remove(cVar2);
    }

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f55265a, false, 58630, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f55265a, false, 58630, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.j.add(cVar2);
    }

    public final void a(int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f55265a, false, 58651, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f55265a, false, 58651, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        final int i3 = i2;
        final int i4 = z ? 1 : 0;
        new ThreadPlus("get image thread") {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55271a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f55271a, false, 58654, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f55271a, false, 58654, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    if (1 == i3) {
                        arrayList.addAll(c.a(d.this.f55267b, true));
                    } else if (4 == i3) {
                        arrayList.addAll(c.b(d.this.f55267b));
                    } else if (3 == i3) {
                        arrayList.addAll(c.a(d.this.f55267b, false));
                    } else if (2 == i3) {
                        arrayList.addAll(c.a(d.this.f55267b));
                    } else if (i3 == 0) {
                        arrayList.addAll(c.b(d.this.f55267b));
                        arrayList.addAll(c.a(d.this.f55267b, true));
                        Collections.sort(arrayList);
                    }
                    Message obtainMessage = d.this.f55268c.obtainMessage(10);
                    obtainMessage.arg1 = i3;
                    obtainMessage.arg2 = i4;
                    obtainMessage.obj = arrayList;
                    obtainMessage.sendToTarget();
                } catch (Exception e2) {
                    Message obtainMessage2 = d.this.f55268c.obtainMessage(11);
                    obtainMessage2.arg2 = i4;
                    obtainMessage2.obj = e2;
                    obtainMessage2.sendToTarget();
                }
            }
        }.start();
    }
}
