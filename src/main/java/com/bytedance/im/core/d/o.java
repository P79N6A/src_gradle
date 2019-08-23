package com.bytedance.im.core.d;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.b.a.g;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.b.a.z;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.a;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.e.e;
import com.bytedance.im.core.b.e.k;
import com.bytedance.im.core.d.n;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class o implements k {

    /* renamed from: a  reason: collision with root package name */
    public e f21290a;

    /* renamed from: b  reason: collision with root package name */
    public String f21291b;

    /* renamed from: c  reason: collision with root package name */
    public int f21292c;

    /* renamed from: d  reason: collision with root package name */
    public k f21293d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21294e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21295f;
    public boolean g;
    public List<Long> h;

    public final List<n> b() {
        return new ArrayList(this.f21290a);
    }

    public final void a() {
        if (d.a().a(this.f21291b) == null) {
            e((List<n>) null);
            return;
        }
        k.a();
        if (!this.g) {
            this.g = true;
            com.bytedance.im.core.b.d.e.a(new d<List<n>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<n> a() {
                    n nVar;
                    o oVar = o.this;
                    if (oVar.f21290a.isEmpty()) {
                        nVar = null;
                    } else {
                        nVar = (n) oVar.f21290a.get(oVar.f21290a.size() - 1);
                    }
                    if (nVar == null) {
                        return null;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    com.bytedance.im.core.b.a.o.a();
                    List<n> a2 = com.bytedance.im.core.b.a.o.a(o.this.f21291b, nVar.getIndex(), o.this.f21292c, (int[]) null);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        com.bytedance.im.core.c.d.a("im_load_more_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    return a2;
                }
            }, new c<List<n>>() {
                public final /* synthetic */ void a(Object obj) {
                    List list = (List) obj;
                    o.this.g = false;
                    if (list == null || list.size() < o.this.f21292c) {
                        m.a();
                        m.a(o.this.f21291b);
                    }
                    o.this.e(list);
                }
            });
        }
    }

    public o(String str) {
        this(str, true);
    }

    public static void c(n nVar) {
        m.a();
        new g().a(nVar, false);
    }

    public static void d(final n nVar) {
        com.bytedance.im.core.b.d.e.a(new d<Pair<b, n>>() {
            public final /* synthetic */ Object a() {
                boolean a2 = com.bytedance.im.core.b.a.o.a().a(nVar);
                com.bytedance.im.core.b.a.k.a();
                b a3 = com.bytedance.im.core.b.a.k.a(nVar.getConversationId());
                if (a3 != null) {
                    com.bytedance.im.core.b.a.o.a();
                    a3.setUnreadCount(com.bytedance.im.core.b.a.o.a(a3.getConversationId(), a3.getReadIndex(), Long.MAX_VALUE, com.bytedance.im.core.a.c.a().f20879c.a()));
                    a3.setUpdatedTime(Math.max(a3.getUpdatedTime(), nVar.getCreatedAt()));
                    a3.setLastMessageIndex(Math.max(a3.getLastMessageIndex(), nVar.getIndex()));
                    com.bytedance.im.core.b.a.k.a();
                    com.bytedance.im.core.b.a.k.b(a3);
                }
                if (a2) {
                    return new Pair(a3, nVar);
                }
                return null;
            }
        }, new c<Pair<b, n>>(null) {
            public final /* synthetic */ void a(Object obj) {
                Pair pair = (Pair) obj;
                int i = -3001;
                if (pair != null) {
                    if (pair.first != null) {
                        d.a().b((b) pair.first);
                    }
                    if (null != null) {
                        null.a(nVar);
                    }
                } else {
                    nVar.setMsgStatus(3);
                    if (null != null) {
                        null.a(j.a(f.a(-3001)));
                    }
                }
                com.bytedance.im.core.b.e.g a2 = com.bytedance.im.core.b.e.g.a();
                if (pair != null) {
                    i = d.b.f20889a;
                }
                a2.b(i, nVar);
            }
        });
    }

    public static void e(final n nVar) {
        com.bytedance.im.core.b.d.e.a(new com.bytedance.im.core.b.d.d<n>() {
            public final /* bridge */ /* synthetic */ Object a() {
                if (com.bytedance.im.core.b.a.o.a().a(nVar)) {
                    return nVar;
                }
                return null;
            }
        }, new c<n>(null) {
            public final /* synthetic */ void a(Object obj) {
                n nVar = (n) obj;
                if (nVar != null) {
                    com.bytedance.im.core.b.e.g.a().f(Collections.singletonList(nVar));
                    if (null != null) {
                        null.a(nVar);
                    }
                } else if (null != null) {
                    null.a(j.a(f.a(-3001)));
                }
            }
        });
    }

    public final void a(n nVar) {
        if (this.f21290a.remove(nVar) && this.f21293d != null) {
            this.f21293d.a(nVar);
        }
    }

    public final void b(n nVar) {
        if (nVar != null && this.f21293d != null) {
            this.f21290a.update(nVar);
            this.f21293d.b(nVar);
        }
    }

    public final void c(List<n> list) {
        if (this.f21295f && list != null && !list.isEmpty()) {
            this.f21290a.addList(list);
            if (this.f21293d != null) {
                this.f21293d.c(list);
            }
        }
    }

    public final void d(List<n> list) {
        if (this.f21293d != null) {
            this.f21293d.d(list);
        }
        com.bytedance.im.core.b.d.e.a(new com.bytedance.im.core.b.d.d() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object a() {
                /*
                    r12 = this;
                    com.bytedance.im.core.d.o r0 = com.bytedance.im.core.d.o.this     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.a.c r1 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.c.a r1 = r1.f20880d     // Catch:{ Exception -> 0x00a0 }
                    if (r1 == 0) goto L_0x00a0
                    com.bytedance.im.core.b.e.e r1 = r0.f21290a     // Catch:{ Exception -> 0x00a0 }
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x0052
                    int r5 = r1.size()     // Catch:{ Exception -> 0x00a0 }
                    if (r5 > 0) goto L_0x0018
                    goto L_0x0052
                L_0x0018:
                    java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
                    r5.<init>(r1)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.d.o$7 r1 = new com.bytedance.im.core.d.o$7     // Catch:{ Exception -> 0x00a0 }
                    r1.<init>()     // Catch:{ Exception -> 0x00a0 }
                    java.util.Collections.sort(r5, r1)     // Catch:{ Exception -> 0x00a0 }
                    r0 = 0
                    java.util.Iterator r6 = r5.iterator()     // Catch:{ Exception -> 0x00a0 }
                    r7 = 0
                L_0x002c:
                    boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x00a0 }
                    if (r8 == 0) goto L_0x0047
                    java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.d.n r8 = (com.bytedance.im.core.d.n) r8     // Catch:{ Exception -> 0x00a0 }
                    long r9 = r8.getIndex()     // Catch:{ Exception -> 0x00a0 }
                    int r11 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                    if (r11 <= 0) goto L_0x0042
                    int r7 = r7 + 1
                L_0x0042:
                    long r0 = r8.getIndex()     // Catch:{ Exception -> 0x00a0 }
                    goto L_0x002c
                L_0x0047:
                    int[] r0 = new int[r2]     // Catch:{ Exception -> 0x00a0 }
                    int r1 = r5.size()     // Catch:{ Exception -> 0x00a0 }
                    r0[r4] = r1     // Catch:{ Exception -> 0x00a0 }
                    r0[r3] = r7     // Catch:{ Exception -> 0x00a0 }
                    goto L_0x0057
                L_0x0052:
                    int[] r0 = new int[r2]     // Catch:{ Exception -> 0x00a0 }
                    r0 = {0, 0} // fill-array     // Catch:{ Exception -> 0x00a0 }
                L_0x0057:
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a0 }
                    r1.<init>()     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "receive_no"
                    r5 = r0[r4]     // Catch:{ JSONException -> 0x006a }
                    r1.put(r2, r5)     // Catch:{ JSONException -> 0x006a }
                    java.lang.String r2 = "disordered_no"
                    r5 = r0[r3]     // Catch:{ JSONException -> 0x006a }
                    r1.put(r2, r5)     // Catch:{ JSONException -> 0x006a }
                L_0x006a:
                    com.bytedance.im.core.a.c r2 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.c.a r2 = r2.f20880d     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r5 = "sdk_enter_chat"
                    r2.a(r5, r1)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.c.c r1 = com.bytedance.im.core.c.c.a()     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "message_data_source"
                    com.bytedance.im.core.c.c r1 = r1.a(r2)     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "wrong_order"
                    com.bytedance.im.core.c.c r1 = r1.b(r2)     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "total_count"
                    r4 = r0[r4]     // Catch:{ Exception -> 0x00a0 }
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.c.c r1 = r1.a(r2, r4)     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "count"
                    r0 = r0[r3]     // Catch:{ Exception -> 0x00a0 }
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.c.c r0 = r1.a(r2, r0)     // Catch:{ Exception -> 0x00a0 }
                    r0.b()     // Catch:{ Exception -> 0x00a0 }
                L_0x00a0:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.d.o.AnonymousClass6.a():java.lang.Object");
            }
        }, null);
    }

    public final void e(List<n> list) {
        if (list != null && !list.isEmpty()) {
            this.f21290a.appendList(list);
        }
        if (this.f21293d != null) {
            this.f21293d.e(list);
        }
    }

    public final void f(List<n> list) {
        if (list != null && !list.isEmpty()) {
            this.f21290a.updateList(list);
            if (this.f21293d != null) {
                this.f21293d.f(list);
            }
        }
    }

    public final void g(List<p> list) {
        if (list != null && !list.isEmpty() && this.f21293d != null) {
            this.f21293d.g(list);
        }
    }

    public final void a(boolean z) {
        this.f21290a.clear();
        if (z && this.f21293d != null) {
            this.f21293d.a(true);
        }
    }

    public final void a(int i, p pVar) {
        if (pVar != null && this.f21293d != null) {
            this.f21293d.a(i, pVar);
        }
    }

    private o(String str, boolean z) {
        this.f21290a = new e();
        this.f21292c = 50;
        this.f21294e = true;
        this.f21295f = true;
        this.h = new ArrayList();
        this.f21291b = str;
        this.f21294e = true;
    }

    public static void a(n nVar, b<n> bVar) {
        m.a();
        z zVar = new z(bVar);
        if (nVar == null) {
            zVar.b(f.a(-1015));
            return;
        }
        nVar.setMsgStatus(1);
        com.bytedance.im.core.b.d.e.a(new com.bytedance.im.core.b.d.d<Pair<b, n>>(nVar) {

            /* renamed from: a */
            final /* synthetic */ n f21136a;

            public final /* synthetic */ java.lang.Object a(
/*
Method generation error in method: com.bytedance.im.core.b.b.a.z.3.a():java.lang.Object, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.b.b.a.z.3.a():java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        }, new c<Pair<b, n>>(nVar) {

            /* renamed from: a */
            final /* synthetic */ n f21138a;

            public final /* synthetic */ void a(
/*
Method generation error in method: com.bytedance.im.core.b.b.a.z.4.a(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.b.b.a.z.4.a(java.lang.Object):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        }, a.b());
    }

    public final void b(int i, n nVar) {
        if (this.f21295f) {
            if (nVar != null) {
                this.f21290a.add(nVar);
                if (this.f21290a.size() > 3000) {
                    this.f21290a = new e(this.f21290a.subList(0, PushConstants.WORK_RECEIVER_EVENTCORE_ERROR));
                }
            }
            if (this.f21293d != null) {
                this.f21293d.b(i, nVar);
            }
        }
    }

    public final void a(int i, n nVar) {
        if (this.f21295f) {
            if (nVar != null && i == d.b.f20889a) {
                this.f21290a.add(nVar);
                if (this.f21290a.size() > 3000) {
                    this.f21290a = new e(this.f21290a.subList(0, PushConstants.WORK_RECEIVER_EVENTCORE_ERROR));
                }
            }
            if (this.f21293d != null) {
                this.f21293d.a(i, nVar);
            }
        }
    }
}
