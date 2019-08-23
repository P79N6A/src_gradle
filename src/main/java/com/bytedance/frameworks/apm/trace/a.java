package com.bytedance.frameworks.apm.trace;

import com.bytedance.frameworks.apm.trace.g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f19642a;

    /* renamed from: b  reason: collision with root package name */
    private final b f19643b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<f> f19644c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private g.a f19645d;

    /* renamed from: e  reason: collision with root package name */
    private int f19646e;

    private static long a(long j) {
        return j & 8796093022207L;
    }

    private static int b(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        r9 = a(r9) - a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
        if (r9 < 0) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r9 < 6000) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
        a(r2, new com.bytedance.frameworks.apm.trace.f(r5, (int) r9, r1.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        com.bytedance.frameworks.apm.trace.d.a("AnalyseTask", "[analyse] trace during invalid:%d", java.lang.Long.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r6 = r22
            long[] r0 = r6.f19642a
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r3 = r0.length
            r7 = 0
            r4 = 0
        L_0x0011:
            r8 = 1
            if (r4 >= r3) goto L_0x00f8
            r9 = r0[r4]
            r5 = 63
            long r11 = r9 >> r5
            r13 = 1
            long r11 = r11 & r13
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            if (r5 == 0) goto L_0x002f
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r1.push(r5)
            goto L_0x00f4
        L_0x002f:
            int r5 = b(r9)
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x00e5
            java.lang.Object r11 = r1.pop()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
        L_0x0043:
            int r13 = b(r11)
            r16 = 0
            if (r13 == r5) goto L_0x00b3
            java.lang.String r13 = "AnalyseTask"
            java.lang.String r14 = "[analyse] method[%s] not match in! continue to find!"
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r5)
            r15[r7] = r20
            com.bytedance.frameworks.apm.trace.d.b(r13, r14, r15)
            com.bytedance.frameworks.apm.trace.b r13 = r6.f19643b
            long r13 = r13.f19649c
            long r20 = a((long) r11)
            long r13 = r13 - r20
            int r15 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r15 < 0) goto L_0x00a3
            r18 = 6000(0x1770, double:2.9644E-320)
            int r15 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r15 < 0) goto L_0x006f
            goto L_0x00a3
        L_0x006f:
            int r11 = b(r11)
            com.bytedance.frameworks.apm.trace.f r12 = new com.bytedance.frameworks.apm.trace.f
            int r13 = (int) r13
            int r14 = r1.size()
            r12.<init>(r11, r13, r14)
            a((java.util.LinkedList<com.bytedance.frameworks.apm.trace.f>) r2, (com.bytedance.frameworks.apm.trace.f) r12)
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x0091
            java.lang.Object r11 = r1.pop()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            goto L_0x0043
        L_0x0091:
            java.lang.String r11 = "AnalyseTask"
            java.lang.String r12 = "[analyse] method[%s] not match in finally! "
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r13[r7] = r14
            com.bytedance.frameworks.apm.trace.d.a(r11, r12, r13)
            r11 = r16
            goto L_0x00b3
        L_0x00a3:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "[analyse] trace during invalid:%d"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.d.a(r0, r1, r2)
            return
        L_0x00b3:
            long r9 = a((long) r9)
            long r11 = a((long) r11)
            long r9 = r9 - r11
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00d5
            r11 = 6000(0x1770, double:2.9644E-320)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x00c7
            goto L_0x00d5
        L_0x00c7:
            com.bytedance.frameworks.apm.trace.f r8 = new com.bytedance.frameworks.apm.trace.f
            int r9 = (int) r9
            int r10 = r1.size()
            r8.<init>(r5, r9, r10)
            a((java.util.LinkedList<com.bytedance.frameworks.apm.trace.f>) r2, (com.bytedance.frameworks.apm.trace.f) r8)
            goto L_0x00f4
        L_0x00d5:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "[analyse] trace during invalid:%d"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.d.a(r0, r1, r2)
            return
        L_0x00e5:
            java.lang.String r9 = "AnalyseTask"
            java.lang.String r10 = "[analyse] method[%s] not found in! "
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r7] = r5
            com.bytedance.frameworks.apm.trace.d.b(r9, r10, r8)
        L_0x00f4:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x00f8:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0147
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r3 = "[analyse] has never out method. rawData size:%s result size:%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r1.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r7] = r5
            int r5 = r2.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            com.bytedance.frameworks.apm.trace.d.b(r0, r3, r4)
            java.lang.Object r0 = r1.pop()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r0 = b(r3)
            long r3 = a((long) r3)
            com.bytedance.frameworks.apm.trace.f r5 = new com.bytedance.frameworks.apm.trace.f
            com.bytedance.frameworks.apm.trace.b r9 = r6.f19643b
            long r9 = r9.f19649c
            long r9 = r9 - r3
            int r3 = (int) r9
            r4 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r1.size()
            r5.<init>(r0, r3, r4)
            a((java.util.LinkedList<com.bytedance.frameworks.apm.trace.f>) r2, (com.bytedance.frameworks.apm.trace.f) r5)
            goto L_0x00f8
        L_0x0147:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "resultStack:%s"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            com.bytedance.frameworks.apm.trace.d.c(r0, r1, r3)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            com.bytedance.frameworks.apm.trace.h r10 = a((java.util.LinkedList<com.bytedance.frameworks.apm.trace.f>) r2)
            r11 = 1
        L_0x015c:
            com.bytedance.frameworks.apm.trace.b r2 = r6.f19643b
            r3 = 0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = (float) r11
            float r5 = r1 * r0
            r0 = r22
            r1 = r10
            boolean r0 = r0.a(r1, r2, r3, r5)
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "type:%s [stack result is empty after trim, just ignore]"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.bytedance.frameworks.apm.trace.b r3 = r6.f19643b
            com.bytedance.frameworks.apm.trace.i r3 = r3.f19647a
            java.lang.String r3 = r3.name()
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.d.a(r0, r1, r2)
            return
        L_0x0183:
            int r0 = r6.a((com.bytedance.frameworks.apm.trace.h) r10)
            r1 = 20
            if (r0 <= r1) goto L_0x0191
            int r11 = r11 + 1
            r0 = 3
            if (r11 > r0) goto L_0x0191
            goto L_0x015c
        L_0x0191:
            com.bytedance.frameworks.apm.trace.b r0 = r6.f19643b
            r6.a((com.bytedance.frameworks.apm.trace.h) r10, (com.bytedance.frameworks.apm.trace.b) r0)
            r6.a((com.bytedance.frameworks.apm.trace.h) r10, (java.util.LinkedList<com.bytedance.frameworks.apm.trace.f>) r9)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "type:%s [stack result is empty after trim, just ignore]"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.bytedance.frameworks.apm.trace.b r3 = r6.f19643b
            com.bytedance.frameworks.apm.trace.i r3 = r3.f19647a
            java.lang.String r3 = r3.name()
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.d.a(r0, r1, r2)
            return
        L_0x01b3:
            java.util.ListIterator r0 = r9.listIterator()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n"
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x01c3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01e6
            java.lang.Object r3 = r0.next()
            com.bytedance.frameworks.apm.trace.f r3 = (com.bytedance.frameworks.apm.trace.f) r3
            java.lang.String r4 = r3.a()
            r1.append(r4)
            r4 = 10
            r1.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            r2.append(r4)
            goto L_0x01c3
        L_0x01e6:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r3 = "[analyse result] %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r1 = r1.toString()
            r4[r7] = r1
            com.bytedance.frameworks.apm.trace.d.c(r0, r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r6.a((com.bytedance.frameworks.apm.trace.h) r10, (java.lang.StringBuilder) r0)
            java.lang.String r0 = r0.toString()
            com.bytedance.frameworks.apm.trace.b r1 = r6.f19643b
            com.bytedance.frameworks.apm.trace.i r1 = r1.f19647a
            com.bytedance.frameworks.apm.trace.i r3 = com.bytedance.frameworks.apm.trace.i.FULL
            if (r1 != r3) goto L_0x020c
            java.lang.String r0 = "TypeFull"
            goto L_0x0226
        L_0x020c:
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0226
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "get key null, type:%s"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.bytedance.frameworks.apm.trace.b r3 = r6.f19643b
            com.bytedance.frameworks.apm.trace.i r3 = r3.f19647a
            java.lang.String r3 = r3.name()
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.d.a(r0, r1, r2)
            return
        L_0x0226:
            java.lang.String r1 = "AnalyseTask"
            java.lang.String r3 = "[analyse key] %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r0
            com.bytedance.frameworks.apm.trace.d.c(r1, r3, r4)
            com.bytedance.frameworks.apm.trace.g r1 = new com.bytedance.frameworks.apm.trace.g
            r1.<init>()
            com.bytedance.frameworks.apm.trace.b r3 = r6.f19643b
            com.bytedance.frameworks.apm.trace.i r3 = r3.f19647a
            r1.f19664a = r3
            r1.f19665b = r0
            java.lang.String r0 = r2.toString()
            r1.f19666c = r0
            com.bytedance.frameworks.apm.trace.b r0 = r6.f19643b
            long r2 = r0.f19648b
            r1.f19669f = r2
            com.bytedance.frameworks.apm.trace.b r0 = r6.f19643b
            long r2 = r0.f19649c
            r1.f19668e = r2
            com.bytedance.frameworks.apm.trace.b r0 = r6.f19643b
            java.lang.String r0 = r0.f19650d
            r1.f19667d = r0
            int r0 = r6.f19646e
            r1.h = r0
            com.bytedance.frameworks.apm.trace.g$a r0 = r6.f19645d
            if (r0 == 0) goto L_0x0274
            boolean r0 = com.bytedance.apm.c.d()
            if (r0 == 0) goto L_0x026f
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r2 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.bytedance.frameworks.apm.trace.d.c(r0, r2, r3)
        L_0x026f:
            com.bytedance.frameworks.apm.trace.g$a r0 = r6.f19645d
            r0.a(r1)
        L_0x0274:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.apm.trace.a.run():void");
    }

    private int a(h hVar) {
        int size = hVar.f19672c.size();
        Iterator it2 = hVar.f19672c.iterator();
        while (it2.hasNext()) {
            size += a((h) it2.next());
        }
        return size;
    }

    private static h a(LinkedList<f> linkedList) {
        h hVar = null;
        h hVar2 = new h(null, null);
        ListIterator<f> listIterator = linkedList.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            h hVar3 = new h(listIterator.next(), hVar);
            if (hVar == null && hVar3.a() != 0) {
                d.a("AnalyseTask", "[stackToTree] begin error! why the frist node'depth is not 0!", new Object[0]);
                break;
            }
            int a2 = hVar3.a();
            if (a2 == 0) {
                hVar2.a(hVar3);
            } else if (hVar != null && hVar.a() >= a2) {
                while (hVar.a() > a2) {
                    hVar = hVar.f19671b;
                }
                if (hVar.f19671b != null) {
                    hVar3.f19671b = hVar.f19671b;
                    hVar.f19671b.a(hVar3);
                }
            } else if (hVar != null && hVar.a() < a2) {
                hVar.a(hVar3);
            }
            hVar = hVar3;
        }
        return hVar2;
    }

    a(long[] jArr, b bVar) {
        this.f19642a = jArr;
        this.f19643b = bVar;
        this.f19645d = bVar.f19651e;
    }

    private void a(h hVar, LinkedList<f> linkedList) {
        if (hVar != null && !hVar.f19672c.isEmpty()) {
            LinkedList<h> linkedList2 = hVar.f19672c;
            while (!linkedList2.isEmpty()) {
                h pop = linkedList2.pop();
                linkedList.addLast(pop.f19670a);
                a(pop, linkedList);
            }
        }
    }

    private void a(h hVar, b bVar) {
        long j;
        while (bVar.f19647a != i.FULL) {
            long j2 = bVar.f19648b;
            Iterator it2 = hVar.f19672c.iterator();
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2 == null || hVar2.f19670a == null) {
                    d.a("AnalyseTask", "Null Tree Node, Must check.", new Object[0]);
                } else {
                    if (hVar2.f19670a.f19662c == 0 || hVar2.f19671b == null || hVar2.f19671b.f19670a == null) {
                        j = (long) (((float) j2) * 0.3f);
                    } else {
                        j = (long) (((float) hVar2.f19671b.f19670a.f19661b) * 0.6f);
                    }
                    if (((long) hVar2.f19670a.f19661b) < j) {
                        continue;
                    } else if (hVar2.f19670a.f19662c > 0) {
                        this.f19644c.pop();
                        this.f19644c.push(hVar2.f19670a);
                        hVar = hVar2;
                    } else {
                        this.f19644c.push(hVar2.f19670a);
                        a(hVar2, bVar);
                    }
                }
            }
            return;
        }
    }

    private void a(h hVar, StringBuilder sb) {
        if (this.f19644c.isEmpty()) {
            Iterator it2 = hVar.f19672c.iterator();
            int i = 0;
            while (it2.hasNext() && i <= 10) {
                h hVar2 = (h) it2.next();
                this.f19646e += hVar2.f19670a.f19661b;
                this.f19644c.add(hVar2.f19670a);
                i++;
            }
            if (i == 0 && hVar.f19670a != null) {
                this.f19646e += hVar.f19670a.f19661b;
                this.f19644c.add(hVar.f19670a);
            }
        }
        Iterator it3 = this.f19644c.iterator();
        while (it3.hasNext()) {
            f fVar = (f) it3.next();
            sb.append(fVar.f19660a);
            sb.append(10);
            if (fVar.f19661b > this.f19646e) {
                this.f19646e = fVar.f19661b;
            }
        }
        this.f19644c.clear();
    }

    private static void a(LinkedList<f> linkedList, f fVar) {
        f fVar2;
        if (!linkedList.isEmpty()) {
            fVar2 = linkedList.peek();
        } else {
            fVar2 = null;
        }
        if (fVar2 == null || !fVar2.equals(fVar)) {
            linkedList.push(fVar);
        } else {
            fVar2.a((long) fVar.f19661b);
        }
    }

    private boolean a(h hVar, b bVar, long j, float f2) {
        long j2;
        if (hVar.f19670a == null) {
            j2 = bVar.f19648b;
        } else {
            j2 = (long) hVar.f19670a.f19661b;
        }
        if (j2 <= bVar.f19648b / 20) {
            return true;
        }
        if (j2 <= ((long) (((float) j) * f2))) {
            hVar.f19672c.clear();
        }
        Iterator it2 = hVar.f19672c.iterator();
        while (it2.hasNext()) {
            if (a((h) it2.next(), bVar, j2, f2)) {
                it2.remove();
            }
        }
        return false;
    }
}
