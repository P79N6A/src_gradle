package com.meizu.cloud.pushsdk.c.b.a;

import com.meizu.cloud.pushsdk.b.c.i;
import com.meizu.cloud.pushsdk.c.b.c;
import com.meizu.cloud.pushsdk.c.b.g;
import com.meizu.cloud.pushsdk.c.d.d;
import com.meizu.cloud.pushsdk.c.f.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a extends c {
    private final String u = a.class.getSimpleName();
    /* access modifiers changed from: private */
    public d v = new com.meizu.cloud.pushsdk.c.d.a(this.f27108d, this.o);
    private int w;

    public a(c.a aVar) {
        super(aVar);
        if (!this.v.a()) {
            this.v = new com.meizu.cloud.pushsdk.c.d.c(this.o);
            com.meizu.cloud.pushsdk.c.f.c.a(this.u, "init memory store", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.LinkedList<com.meizu.cloud.pushsdk.c.b.g> a(java.util.LinkedList<com.meizu.cloud.pushsdk.c.b.e> r11) {
        /*
            r10 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r2 = r11.iterator()
        L_0x000e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r2.next()
            com.meizu.cloud.pushsdk.c.b.e r3 = (com.meizu.cloud.pushsdk.c.b.e) r3
            com.meizu.cloud.pushsdk.b.c.i r3 = r3.a()
            java.util.concurrent.Callable r3 = r10.b((com.meizu.cloud.pushsdk.b.c.i) r3)
            java.util.concurrent.Future r3 = com.meizu.cloud.pushsdk.c.b.a.b.a((java.util.concurrent.Callable) r3)
            r1.add(r3)
            goto L_0x000e
        L_0x002a:
            java.lang.String r2 = r10.u
            java.lang.String r3 = "Request Futures: %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r6 = r1.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            com.meizu.cloud.pushsdk.c.f.c.b(r2, r3, r5)
            r2 = 0
        L_0x0040:
            int r3 = r1.size()
            if (r2 >= r3) goto L_0x00c2
            r3 = -1
            java.lang.Object r5 = r1.get(r2)     // Catch:{ InterruptedException -> 0x0079, ExecutionException -> 0x006b, TimeoutException -> 0x005d }
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5     // Catch:{ InterruptedException -> 0x0079, ExecutionException -> 0x006b, TimeoutException -> 0x005d }
            r8 = 5
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0079, ExecutionException -> 0x006b, TimeoutException -> 0x005d }
            java.lang.Object r5 = r5.get(r8, r6)     // Catch:{ InterruptedException -> 0x0079, ExecutionException -> 0x006b, TimeoutException -> 0x005d }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ InterruptedException -> 0x0079, ExecutionException -> 0x006b, TimeoutException -> 0x005d }
            int r5 = r5.intValue()     // Catch:{ InterruptedException -> 0x0079, ExecutionException -> 0x006b, TimeoutException -> 0x005d }
            r3 = r5
            goto L_0x0089
        L_0x005d:
            r5 = move-exception
            java.lang.String r6 = r10.u
            java.lang.String r8 = "Request Future had a timeout: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r9[r7] = r5
            goto L_0x0086
        L_0x006b:
            r5 = move-exception
            java.lang.String r6 = r10.u
            java.lang.String r8 = "Request Future failed: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r9[r7] = r5
            goto L_0x0086
        L_0x0079:
            r5 = move-exception
            java.lang.String r6 = r10.u
            java.lang.String r8 = "Request Future was interrupted: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r9[r7] = r5
        L_0x0086:
            com.meizu.cloud.pushsdk.c.f.c.a(r6, r8, r9)
        L_0x0089:
            java.lang.Object r5 = r11.get(r2)
            com.meizu.cloud.pushsdk.c.b.e r5 = (com.meizu.cloud.pushsdk.c.b.e) r5
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x00a8
            com.meizu.cloud.pushsdk.c.b.g r3 = new com.meizu.cloud.pushsdk.c.b.g
            java.lang.Object r5 = r11.get(r2)
            com.meizu.cloud.pushsdk.c.b.e r5 = (com.meizu.cloud.pushsdk.c.b.e) r5
            java.util.LinkedList r5 = r5.b()
            r3.<init>(r4, r5)
            r0.add(r3)
            goto L_0x00be
        L_0x00a8:
            com.meizu.cloud.pushsdk.c.b.g r5 = new com.meizu.cloud.pushsdk.c.b.g
            boolean r3 = r10.a((int) r3)
            java.lang.Object r6 = r11.get(r2)
            com.meizu.cloud.pushsdk.c.b.e r6 = (com.meizu.cloud.pushsdk.c.b.e) r6
            java.util.LinkedList r6 = r6.b()
            r5.<init>(r3, r6)
            r0.add(r5)
        L_0x00be:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.b.a.a.a(java.util.LinkedList):java.util.LinkedList");
    }

    private Callable<Boolean> a(final Long l) {
        return new Callable<Boolean>() {
            /* renamed from: a */
            public Boolean call() throws Exception {
                return Boolean.valueOf(a.this.v.a(l.longValue()));
            }
        };
    }

    private LinkedList<Boolean> b(LinkedList<Long> linkedList) {
        boolean z;
        Object[] objArr;
        String str;
        String str2;
        LinkedList<Boolean> linkedList2 = new LinkedList<>();
        LinkedList linkedList3 = new LinkedList();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            linkedList3.add(b.a((Callable) a((Long) it2.next())));
        }
        com.meizu.cloud.pushsdk.c.f.c.b(this.u, "Removal Futures: %s", Integer.valueOf(linkedList3.size()));
        for (int i = 0; i < linkedList3.size(); i++) {
            try {
                z = ((Boolean) ((Future) linkedList3.get(i)).get(5, TimeUnit.SECONDS)).booleanValue();
            } catch (InterruptedException e2) {
                str2 = this.u;
                str = "Removal Future was interrupted: %s";
                objArr = new Object[]{e2.getMessage()};
                com.meizu.cloud.pushsdk.c.f.c.a(str2, str, objArr);
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (ExecutionException e3) {
                str2 = this.u;
                str = "Removal Future failed: %s";
                objArr = new Object[]{e3.getMessage()};
                com.meizu.cloud.pushsdk.c.f.c.a(str2, str, objArr);
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (TimeoutException e4) {
                str2 = this.u;
                str = "Removal Future had a timeout: %s";
                objArr = new Object[]{e4.getMessage()};
                com.meizu.cloud.pushsdk.c.f.c.a(str2, str, objArr);
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            }
            linkedList2.add(Boolean.valueOf(z));
        }
        return linkedList2;
    }

    private Callable<Integer> b(final i iVar) {
        return new Callable<Integer>() {
            /* renamed from: a */
            public Integer call() throws Exception {
                return Integer.valueOf(a.this.a(iVar));
            }
        };
    }

    /* access modifiers changed from: private */
    public void c() {
        String str;
        String str2;
        if (!e.a(this.f27108d)) {
            str2 = this.u;
            str = "Emitter loop stopping: emitter offline.";
        } else if (this.v.c() > 0) {
            this.w = 0;
            LinkedList<g> a2 = a(a(this.v.d()));
            com.meizu.cloud.pushsdk.c.f.c.c(this.u, "Processing emitter results.", new Object[0]);
            LinkedList linkedList = new LinkedList();
            Iterator it2 = a2.iterator();
            int i = 0;
            int i2 = 0;
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                if (gVar.a()) {
                    Iterator it3 = gVar.b().iterator();
                    while (it3.hasNext()) {
                        linkedList.add((Long) it3.next());
                    }
                    i += gVar.b().size();
                } else {
                    i2 += gVar.b().size();
                    com.meizu.cloud.pushsdk.c.f.c.a(this.u, "Request sending failed but we will retry later.", new Object[0]);
                }
            }
            b(linkedList);
            com.meizu.cloud.pushsdk.c.f.c.b(this.u, "Success Count: %s", Integer.valueOf(i));
            com.meizu.cloud.pushsdk.c.f.c.b(this.u, "Failure Count: %s", Integer.valueOf(i2));
            if (this.f27110f != null) {
                if (i2 != 0) {
                    this.f27110f.a(i, i2);
                } else {
                    this.f27110f.a(i);
                }
            }
            if (i2 <= 0 || i != 0) {
                c();
                return;
            }
            if (e.a(this.f27108d)) {
                com.meizu.cloud.pushsdk.c.f.c.a(this.u, "Ensure collector path is valid: %s", b());
            }
            str2 = this.u;
            str = "Emitter loop stopping: failures.";
        } else if (this.w >= this.n) {
            com.meizu.cloud.pushsdk.c.f.c.a(this.u, "Emitter loop stopping: empty limit reached.", new Object[0]);
            this.t.compareAndSet(true, false);
            if (this.f27110f != null) {
                this.f27110f.a(true);
                return;
            }
        } else {
            this.w++;
            com.meizu.cloud.pushsdk.c.f.c.a(this.u, "Emitter database empty: " + this.w, new Object[0]);
            try {
                this.r.sleep((long) this.m);
            } catch (InterruptedException e2) {
                com.meizu.cloud.pushsdk.c.f.c.a(this.u, "Emitter thread sleep interrupted: " + e2.toString(), new Object[0]);
            }
            c();
            return;
        }
        com.meizu.cloud.pushsdk.c.f.c.a(str2, str, new Object[0]);
        this.t.compareAndSet(true, false);
    }

    public void a() {
        b.a((Runnable) new Runnable() {
            public void run() {
                if (a.this.t.compareAndSet(false, true)) {
                    a.this.c();
                }
            }
        });
    }

    public void a(com.meizu.cloud.pushsdk.c.a.a aVar, boolean z) {
        this.v.a(aVar);
        String str = this.u;
        com.meizu.cloud.pushsdk.c.f.c.a(str, "isRunning " + this.t + " attemptEmit " + z, new Object[0]);
        if (!z) {
            try {
                this.r.sleep(1);
            } catch (InterruptedException e2) {
                String str2 = this.u;
                com.meizu.cloud.pushsdk.c.f.c.a(str2, "Emitter add thread sleep interrupted: " + e2.toString(), new Object[0]);
            }
        }
        if (this.t.compareAndSet(false, true)) {
            c();
        }
    }
}
