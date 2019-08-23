package com.ss.android.ugc.aweme.music.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.b.a.e;
import com.ss.android.ugc.b.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class q implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56398a;

    /* renamed from: b  reason: collision with root package name */
    private e f56399b;

    /* renamed from: c  reason: collision with root package name */
    private a f56400c = new a();

    /* renamed from: d  reason: collision with root package name */
    private List<MusicModel> f56401d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private String f56402e;

    /* renamed from: f  reason: collision with root package name */
    private b f56403f = new b();
    private boolean g;

    public final boolean a() {
        return this.f56400c.f56342b;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56398a, false, 60088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56398a, false, 60088, new Class[0], Void.TYPE);
            return;
        }
        this.f56399b = null;
        this.f56403f.a();
    }

    public q(e eVar) {
        this.f56399b = eVar;
        b bVar = this.f56403f;
        if (bVar.f77130b != null) {
            bVar.f77130b.f77155d = this;
        }
        this.g = false;
    }

    private List<MusicModel> a(List<MusicModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f56398a, false, 60087, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f56398a, false, 60087, new Class[]{List.class}, List.class);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (MusicModel next : list) {
            if (hashSet.add(next.getMusic().getMid())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{1}, this, f56398a, false, 60085, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f56398a, false, 60085, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = false;
        if (this.f56399b != null) {
            this.f56399b.a(null, false);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56398a, false, 60084, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f56398a, false, 60084, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!this.g && this.f56400c.f56342b) {
            this.g = true;
            this.f56403f.a(this.f56402e, this.f56400c.a(this.f56402e, true, str), true);
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f56398a, false, 60083, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f56398a, false, 60083, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            this.f56403f.a(str, this.f56400c.a(str, false, str2), false);
            this.f56402e = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.ArrayList<com.ss.android.ugc.b.b.b> r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r16 = this;
            r8 = r16
            r0 = r18
            r9 = r20
            monitor-enter(r16)
            r10 = 4
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x00b9 }
            r11 = 0
            r12 = 0
            r1[r12] = r11     // Catch:{ all -> 0x00b9 }
            r13 = 1
            r1[r13] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00b9 }
            r14 = 2
            r1[r14] = r2     // Catch:{ all -> 0x00b9 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r20)     // Catch:{ all -> 0x00b9 }
            r15 = 3
            r1[r15] = r2     // Catch:{ all -> 0x00b9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f56398a     // Catch:{ all -> 0x00b9 }
            r4 = 0
            r5 = 60086(0xeab6, float:8.4198E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            r6[r12] = r2     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r13] = r2     // Catch:{ all -> 0x00b9 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b9 }
            r6[r14] = r2     // Catch:{ all -> 0x00b9 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b9 }
            r6[r15] = r2     // Catch:{ all -> 0x00b9 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00b9 }
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0074
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x00b9 }
            r1[r12] = r11     // Catch:{ all -> 0x00b9 }
            r1[r13] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00b9 }
            r1[r14] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r20)     // Catch:{ all -> 0x00b9 }
            r1[r15] = r0     // Catch:{ all -> 0x00b9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f56398a     // Catch:{ all -> 0x00b9 }
            r4 = 0
            r5 = 60086(0xeab6, float:8.4198E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            r6[r12] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r13] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b9 }
            r6[r14] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b9 }
            r6[r15] = r0     // Catch:{ all -> 0x00b9 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00b9 }
            r2 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r16)
            return
        L_0x0074:
            r8.g = r12     // Catch:{ all -> 0x00b9 }
            com.ss.android.ugc.aweme.music.presenter.a r1 = r8.f56400c     // Catch:{ all -> 0x00b9 }
            java.util.ArrayList r0 = r1.a(r0)     // Catch:{ all -> 0x00b9 }
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x009a
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00b9 }
        L_0x0086:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b9 }
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r2     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x0086
            java.lang.String r3 = r8.f56402e     // Catch:{ all -> 0x00b9 }
            r2.setSearchKeyWords(r3)     // Catch:{ all -> 0x00b9 }
            goto L_0x0086
        L_0x009a:
            if (r9 != 0) goto L_0x00a1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r8.f56401d     // Catch:{ all -> 0x00b9 }
            r1.clear()     // Catch:{ all -> 0x00b9 }
        L_0x00a1:
            if (r0 == 0) goto L_0x00a8
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r8.f56401d     // Catch:{ all -> 0x00b9 }
            r1.addAll(r0)     // Catch:{ all -> 0x00b9 }
        L_0x00a8:
            com.ss.android.ugc.aweme.music.presenter.e r0 = r8.f56399b     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.music.presenter.e r0 = r8.f56399b     // Catch:{ all -> 0x00b9 }
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r8.f56401d     // Catch:{ all -> 0x00b9 }
            java.util.List r1 = r8.a((java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel>) r1)     // Catch:{ all -> 0x00b9 }
            r0.a(r1, r9)     // Catch:{ all -> 0x00b9 }
        L_0x00b7:
            monitor-exit(r16)
            return
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.presenter.q.a(java.util.ArrayList, java.lang.String, int, boolean):void");
    }
}
