package com.ss.android.ugc.effectmanager.effect.c;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.common.i;
import com.ss.android.ugc.effectmanager.effect.b.f;
import com.ss.android.ugc.effectmanager.effect.b.k;
import com.ss.android.ugc.effectmanager.effect.b.l;
import com.ss.android.ugc.effectmanager.effect.e.a.b;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.g;
import com.ss.android.ugc.effectmanager.j;
import java.util.HashMap;

public final class a implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.effectmanager.a.a f77355a;

    /* renamed from: b  reason: collision with root package name */
    public g f77356b = this.f77355a.f77204a;

    /* renamed from: c  reason: collision with root package name */
    public Handler f77357c = new i(this);

    /* renamed from: d  reason: collision with root package name */
    public C0812a f77358d;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.c.a$a  reason: collision with other inner class name */
    public interface C0812a {
        void a(String str, EffectChannelResponse effectChannelResponse, int i, c cVar);
    }

    public a(com.ss.android.ugc.effectmanager.a.a aVar) {
        this.f77355a = aVar;
    }

    public final void a(Message message) {
        l lVar;
        k kVar;
        if (this.f77358d != null) {
            f fVar = null;
            if (message.what == 14 && (message.obj instanceof b)) {
                b bVar = (b) message.obj;
                c cVar = bVar.f77393c;
                if (cVar == null) {
                    this.f77358d.a(bVar.f77314a, bVar.f77392b, 23, null);
                } else {
                    this.f77358d.a(bVar.f77314a, bVar.f77392b, 27, cVar);
                }
            }
            if (message.what == 22 && (message.obj instanceof com.ss.android.ugc.effectmanager.effect.e.a.i)) {
                com.ss.android.ugc.effectmanager.effect.e.a.i iVar = (com.ss.android.ugc.effectmanager.effect.e.a.i) message.obj;
                j jVar = this.f77356b.z;
                String str = iVar.f77314a;
                if (jVar.j == null) {
                    kVar = null;
                } else {
                    kVar = jVar.j.get(str);
                }
                c cVar2 = iVar.f77411c;
                if (cVar2 == null) {
                    kVar.a(iVar.f77410b);
                } else {
                    kVar.a(cVar2);
                }
            }
            if (message.what == 18 && (message.obj instanceof com.ss.android.ugc.effectmanager.effect.e.a.j)) {
                com.ss.android.ugc.effectmanager.effect.e.a.j jVar2 = (com.ss.android.ugc.effectmanager.effect.e.a.j) message.obj;
                c cVar3 = jVar2.f77413c;
                j jVar3 = this.f77356b.z;
                String str2 = jVar2.f77314a;
                if (jVar3.g == null) {
                    lVar = null;
                } else {
                    lVar = jVar3.g.get(str2);
                }
                if (lVar != null) {
                    if (cVar3 == null) {
                        lVar.a(jVar2.f77412b);
                    } else {
                        lVar.a(jVar2.f77413c);
                    }
                }
            }
            if (message.what == 21 && (message.obj instanceof com.ss.android.ugc.effectmanager.effect.e.a.g)) {
                com.ss.android.ugc.effectmanager.effect.e.a.g gVar = (com.ss.android.ugc.effectmanager.effect.e.a.g) message.obj;
                c cVar4 = gVar.f77406c;
                j jVar4 = this.f77356b.z;
                String str3 = gVar.f77314a;
                if (jVar4.i != null) {
                    fVar = jVar4.i.get(str3);
                }
                if (fVar != null) {
                    if (cVar4 == null) {
                        fVar.a(gVar.f77405b);
                    } else {
                        fVar.a(cVar4);
                    }
                }
            }
            if (message.what == 13 && (message.obj instanceof com.ss.android.ugc.effectmanager.effect.e.a.c)) {
                com.ss.android.ugc.effectmanager.effect.e.a.c cVar5 = (com.ss.android.ugc.effectmanager.effect.e.a.c) message.obj;
                c cVar6 = cVar5.f77395c;
                j jVar5 = this.f77356b.z;
                String str4 = cVar5.f77314a;
                if (jVar5.f77507a == null) {
                    jVar5.f77507a = new HashMap();
                }
                com.ss.android.ugc.effectmanager.effect.b.a aVar = jVar5.f77507a.get(str4);
                if (aVar != null) {
                    if (cVar6 == null) {
                        aVar.a(cVar5.f77394b);
                        return;
                    }
                    aVar.a(cVar6);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.ss.android.ugc.effectmanager.effect.e.b.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ss.android.ugc.effectmanager.effect.e.b.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.ss.android.ugc.effectmanager.effect.e.b.j} */
    /* JADX WARNING: type inference failed for: r9v1, types: [com.ss.android.ugc.effectmanager.common.e.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            if (r9 == 0) goto L_0x0010
            com.ss.android.ugc.effectmanager.effect.e.b.j r9 = new com.ss.android.ugc.effectmanager.effect.e.b.j
            com.ss.android.ugc.effectmanager.a.a r1 = r6.f77355a
            android.os.Handler r4 = r6.f77357c
            r5 = 0
            r0 = r9
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0019
        L_0x0010:
            com.ss.android.ugc.effectmanager.effect.e.b.k r9 = new com.ss.android.ugc.effectmanager.effect.e.b.k
            com.ss.android.ugc.effectmanager.a.a r0 = r6.f77355a
            android.os.Handler r1 = r6.f77357c
            r9.<init>(r0, r7, r8, r1)
        L_0x0019:
            com.ss.android.ugc.effectmanager.g r7 = r6.f77356b
            com.ss.android.ugc.effectmanager.common.h r7 = r7.q
            r7.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.c.a.a(java.lang.String, java.lang.String, boolean):void");
    }

    public final void a(String str, String str2, int i, String str3) {
        com.ss.android.ugc.effectmanager.effect.e.b.a aVar = new com.ss.android.ugc.effectmanager.effect.e.b.a(this.f77355a, str3, this.f77357c, str, str2, i);
        this.f77356b.q.a(aVar);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.ss.android.ugc.effectmanager.effect.e.b.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17, int r18, int r19, boolean r20) {
        /*
            r13 = this;
            r0 = r13
            if (r20 == 0) goto L_0x000f
            com.ss.android.ugc.effectmanager.effect.e.b.m r1 = new com.ss.android.ugc.effectmanager.effect.e.b.m
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f77355a
            android.os.Handler r3 = r0.f77357c
            r6 = r14
            r7 = r15
            r1.<init>(r2, r14, r15, r3)
            goto L_0x0023
        L_0x000f:
            r6 = r14
            r7 = r15
            com.ss.android.ugc.effectmanager.effect.e.b.n r1 = new com.ss.android.ugc.effectmanager.effect.e.b.n
            com.ss.android.ugc.effectmanager.a.a r5 = r0.f77355a
            android.os.Handler r12 = r0.f77357c
            r4 = r1
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0023:
            com.ss.android.ugc.effectmanager.g r2 = r0.f77356b
            com.ss.android.ugc.effectmanager.common.h r2 = r2.q
            r2.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.c.a.a(java.lang.String, java.lang.String, boolean, java.lang.String, int, int, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: com.ss.android.ugc.effectmanager.effect.e.b.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.ss.android.ugc.effectmanager.effect.e.b.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.ss.android.ugc.effectmanager.effect.e.b.h} */
    /* JADX WARNING: type inference failed for: r11v0, types: [com.ss.android.ugc.effectmanager.common.e.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, int r27, int r28, java.lang.String r29, boolean r30) {
        /*
            r22 = this;
            r0 = r22
            if (r30 == 0) goto L_0x001d
            com.ss.android.ugc.effectmanager.effect.e.b.h r11 = new com.ss.android.ugc.effectmanager.effect.e.b.h
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f77355a
            android.os.Handler r10 = r0.f77357c
            r1 = r11
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0038
        L_0x001d:
            com.ss.android.ugc.effectmanager.effect.e.b.i r1 = new com.ss.android.ugc.effectmanager.effect.e.b.i
            com.ss.android.ugc.effectmanager.a.a r13 = r0.f77355a
            android.os.Handler r2 = r0.f77357c
            r12 = r1
            r14 = r23
            r15 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r29
            r21 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11 = r1
        L_0x0038:
            com.ss.android.ugc.effectmanager.g r1 = r0.f77356b
            com.ss.android.ugc.effectmanager.common.h r1 = r1.q
            r1.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.c.a.a(java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean):void");
    }
}
