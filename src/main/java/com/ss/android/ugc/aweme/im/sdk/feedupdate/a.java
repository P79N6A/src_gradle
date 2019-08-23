package com.ss.android.ugc.aweme.im.sdk.feedupdate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51460a;

    /* renamed from: d  reason: collision with root package name */
    private static a f51461d = new a();

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<String, b> f51462b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f51463c = false;

    public static a a() {
        return f51461d;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51460a, false, 52073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51460a, false, 52073, new Class[0], Void.TYPE);
        } else if (!this.f51463c) {
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51466a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f51466a, false, 52076, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51466a, false, 52076, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.d();
                }
            });
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51460a, false, 52065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51460a, false, 52065, new Class[0], Void.TYPE);
        } else if (!this.f51463c) {
            this.f51463c = true;
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51464a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f51464a, false, 52075, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51464a, false, 52075, new Class[0], Void.TYPE);
                        return;
                    }
                    a aVar = a.this;
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f51460a, false, 52067, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, a.f51460a, false, 52067, new Class[0], Void.TYPE);
                    } else {
                        aVar.f51462b.clear();
                        ArrayList<b> c2 = aVar.c();
                        if (!j.a((Collection<T>) c2)) {
                            Iterator<b> it2 = c2.iterator();
                            while (it2.hasNext()) {
                                b next = it2.next();
                                next.generate();
                                if (next.getTagCount() > 0) {
                                    aVar.f51462b.put(next.getUid(), next);
                                }
                            }
                        }
                    }
                    a aVar2 = a.this;
                    if (PatchProxy.isSupport(new Object[0], aVar2, a.f51460a, false, 52066, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar2, a.f51460a, false, 52066, new Class[0], Void.TYPE);
                    } else {
                        FeedUpdate a2 = FeedUpdateApiManager.a(0);
                        if (a2 != null && a2.getStatusCode() == 0 && !j.a((Collection<T>) a2.getItems())) {
                            for (FeedUpdate.d dVar : a2.getItems()) {
                                if (aVar2.f51462b.containsKey(String.valueOf(dVar.getUid()))) {
                                    aVar2.f51462b.get(String.valueOf(dVar.getUid())).add(dVar);
                                } else {
                                    b bVar = new b(dVar);
                                    aVar2.f51462b.put(bVar.getUid(), bVar);
                                }
                            }
                        }
                        aVar2.d();
                    }
                    a.this.f51463c = false;
                }
            });
        }
    }

    private String e() {
        if (PatchProxy.isSupport(new Object[0], this, f51460a, false, 52071, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51460a, false, 52071, new Class[0], String.class);
        }
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        return "update_video_data_" + currentUserID;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f51460a, false, 52069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51460a, false, 52069, new Class[0], Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> value : this.f51462b.entrySet()) {
            b bVar = (b) value.getValue();
            if (bVar.getTagCount() > 0) {
                arrayList.add(bVar);
            } else {
                this.f51462b.remove(bVar.getUid());
            }
        }
        a(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.feedupdate.b>] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r1 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0071, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0077, code lost:
        if (r2 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008a, code lost:
        if (r1 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0090, code lost:
        if (r1 != null) goto L_0x008c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066 A[SYNTHETIC, Splitter:B:35:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x007f A[SYNTHETIC, Splitter:B:54:0x007f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.feedupdate.b> c() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51460a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.ArrayList> r7 = java.util.ArrayList.class
            r4 = 0
            r5 = 52068(0xcb64, float:7.2963E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51460a
            r5 = 0
            r6 = 52068(0xcb64, float:7.2963E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            return r0
        L_0x0028:
            r0 = 0
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x007b, all -> 0x0062 }
            java.lang.String r2 = r10.e()     // Catch:{ Exception -> 0x007b, all -> 0x0062 }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x007b, all -> 0x0062 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0060, all -> 0x005b }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0060, all -> 0x005b }
            java.lang.Object r3 = r2.readObject()     // Catch:{ Exception -> 0x007d, all -> 0x0055 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x007d, all -> 0x0055 }
            r2.close()     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            if (r1 == 0) goto L_0x0053
        L_0x0045:
            r1.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0053
        L_0x0049:
            r0 = move-exception
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            if (r1 == 0) goto L_0x0053
            goto L_0x0045
        L_0x0053:
            r0 = r3
            goto L_0x0093
        L_0x0055:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r2
            r2 = r9
            goto L_0x0064
        L_0x005b:
            r2 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x0064
        L_0x0060:
            r2 = r0
            goto L_0x007d
        L_0x0062:
            r1 = move-exception
            r2 = r0
        L_0x0064:
            if (r0 == 0) goto L_0x0077
            r0.close()     // Catch:{ Exception -> 0x0071, all -> 0x006a }
            goto L_0x0077
        L_0x006a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            throw r0
        L_0x0071:
            if (r2 == 0) goto L_0x007a
        L_0x0073:
            r2.close()     // Catch:{ Exception -> 0x007a }
            goto L_0x007a
        L_0x0077:
            if (r2 == 0) goto L_0x007a
            goto L_0x0073
        L_0x007a:
            throw r1
        L_0x007b:
            r1 = r0
            r2 = r1
        L_0x007d:
            if (r2 == 0) goto L_0x0090
            r2.close()     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            goto L_0x0090
        L_0x0083:
            r0 = move-exception
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            throw r0
        L_0x008a:
            if (r1 == 0) goto L_0x0093
        L_0x008c:
            r1.close()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0093
        L_0x0090:
            if (r1 == 0) goto L_0x0093
            goto L_0x008c
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.feedupdate.a.c():java.util.ArrayList");
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f51460a, false, 52062, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f51460a, false, 52062, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.f51462b.containsKey(str)) {
            return this.f51462b.get(str).getTagCount();
        } else {
            return 0;
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f51460a, false, 52064, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f51460a, false, 52064, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f51462b.remove(str2);
        f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r2 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r2 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008c, code lost:
        if (r2 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0092, code lost:
        if (r2 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a5, code lost:
        if (r2 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00a8, code lost:
        if (r2 != null) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080 A[SYNTHETIC, Splitter:B:38:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0099 A[SYNTHETIC, Splitter:B:58:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.feedupdate.b> r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51460a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 52070(0xcb66, float:7.2966E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51460a
            r13 = 0
            r14 = 52070(0xcb66, float:7.2966E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r17.e()
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x004c
            boolean r1 = r1.delete()
            if (r1 != 0) goto L_0x004c
            return
        L_0x004c:
            r1 = 0
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()     // Catch:{ Exception -> 0x0096, all -> 0x007c }
            java.lang.String r3 = r17.e()     // Catch:{ Exception -> 0x0096, all -> 0x007c }
            java.io.FileOutputStream r2 = r2.openFileOutput(r3, r9)     // Catch:{ Exception -> 0x0096, all -> 0x007c }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r3.writeObject(r0)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            r3.close()     // Catch:{ Exception -> 0x0072, all -> 0x006a }
            if (r2 == 0) goto L_0x00ab
        L_0x0066:
            r2.close()     // Catch:{ Exception -> 0x00ab }
            goto L_0x00ab
        L_0x006a:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r1
        L_0x0072:
            if (r2 == 0) goto L_0x00ab
            goto L_0x0066
        L_0x0075:
            r0 = move-exception
            r1 = r3
            goto L_0x007e
        L_0x0078:
            r1 = r3
            goto L_0x0097
        L_0x007a:
            r0 = move-exception
            goto L_0x007e
        L_0x007c:
            r0 = move-exception
            r2 = r1
        L_0x007e:
            if (r1 == 0) goto L_0x0092
            r1.close()     // Catch:{ Exception -> 0x008c, all -> 0x0084 }
            goto L_0x0092
        L_0x0084:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x008b
            r2.close()     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            throw r1
        L_0x008c:
            if (r2 == 0) goto L_0x0095
        L_0x008e:
            r2.close()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0095
        L_0x0092:
            if (r2 == 0) goto L_0x0095
            goto L_0x008e
        L_0x0095:
            throw r0
        L_0x0096:
            r2 = r1
        L_0x0097:
            if (r1 == 0) goto L_0x00a8
            r1.close()     // Catch:{ Exception -> 0x00a5, all -> 0x009d }
            goto L_0x00a8
        L_0x009d:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x00a4
            r2.close()     // Catch:{ Exception -> 0x00a4 }
        L_0x00a4:
            throw r1
        L_0x00a5:
            if (r2 == 0) goto L_0x00ab
            goto L_0x0066
        L_0x00a8:
            if (r2 == 0) goto L_0x00ab
            goto L_0x0066
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a(java.util.ArrayList):void");
    }

    public final String a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51460a, false, 52072, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51460a, false, 52072, new Class[]{Integer.TYPE}, String.class);
        } else if (i > 99) {
            return "99+";
        } else {
            return String.valueOf(i);
        }
    }
}
