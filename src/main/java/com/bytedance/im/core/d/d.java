package com.bytedance.im.core.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.a.f;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.b.a.s;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.b.e.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class d implements h {

    /* renamed from: e  reason: collision with root package name */
    private static d f21257e;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, b> f21258a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public boolean f21259b = false;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f21260c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    public Set<g> f21261d = new CopyOnWriteArraySet();

    public final void f() {
        j();
    }

    public final void a(b... bVarArr) {
        if (bVarArr != null && bVarArr.length > 0) {
            b(bVarArr);
            for (b bVar : bVarArr) {
                g.a().b(bVar);
                for (g b2 : this.f21261d) {
                    b2.b(bVar);
                }
            }
        }
    }

    public final void a(List<m> list) {
        if (list != null && !list.isEmpty()) {
            g.a().a(list);
            for (g a2 : this.f21261d) {
                a2.a(list);
            }
        }
    }

    public final synchronized Map<String, b> e() {
        return this.f21258a;
    }

    private synchronized List<b> h() {
        return i();
    }

    public static d a() {
        if (f21257e == null) {
            synchronized (d.class) {
                if (f21257e == null) {
                    f21257e = new d();
                }
            }
        }
        return f21257e;
    }

    private void j() {
        if (this.f21259b) {
            com.bytedance.im.core.b.e.d.c("Conversation List is Syncing");
            return;
        }
        this.f21259b = true;
        e.a(new com.bytedance.im.core.b.d.d() {
            public final Object a() {
                d dVar = d.this;
                long uptimeMillis = SystemClock.uptimeMillis();
                com.bytedance.im.core.a.e b2 = c.a().b();
                if (b2 != null) {
                    o.a();
                    String str = b2.I;
                    if (!TextUtils.isEmpty(str)) {
                        com.bytedance.im.core.b.a.a.d.a();
                        com.bytedance.im.core.b.a.a.d.a("msg", f.COLUMN_MSG_TYPE.key + "=?", new String[]{str});
                    }
                }
                k.a();
                List<b> b3 = k.b();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    com.bytedance.im.core.c.d.a("im_sync_conversation_list_duration", jSONObject, (JSONObject) null);
                } catch (Exception unused) {
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (b bVar : b3) {
                    if (!PushConstants.PUSH_TYPE_NOTIFY.equals(bVar.getConversationId())) {
                        i++;
                        if (c.a().b().i != -1 && i >= c.a().b().i) {
                            arrayList.add(bVar.getConversationId());
                        }
                        dVar.b(bVar);
                    } else {
                        com.bytedance.im.core.b.e.d.c("syncConversionList dirty message");
                        com.bytedance.im.core.c.d.a("im_dirty_sync", bVar.getConversationId(), 1.0f);
                    }
                }
                if (arrayList.size() > 0) {
                    k.a();
                    k.a((List<String>) arrayList);
                }
                return Boolean.TRUE;
            }
        }, new com.bytedance.im.core.b.d.c() {
            public final void a(Object obj) {
                if (!d.this.f21261d.isEmpty()) {
                    com.bytedance.im.core.b.e.d.c("syncConversionList onCallback");
                    for (g a2 : d.this.f21261d) {
                        a2.a(d.this.f21258a);
                    }
                }
                d.this.f21259b = false;
            }
        });
    }

    public final synchronized List<b> b() {
        List<b> i;
        i = i();
        if (i.size() > 0) {
            Collections.sort(i);
        }
        return i;
    }

    private synchronized List<b> i() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b add : this.f21258a.values()) {
            c.a();
            arrayList.add(add);
        }
        return arrayList;
    }

    public final synchronized List<b> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : h()) {
            if (next != null && next.isGroupChat()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    public final synchronized List<b> d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : h()) {
            if (next != null && next.isMember()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    public final synchronized void g() {
        com.bytedance.im.core.b.e.k.a();
        if (!this.f21258a.isEmpty()) {
            for (String next : this.f21258a.keySet()) {
                b bVar = this.f21258a.get(next);
                if (bVar.isWaitingInfo()) {
                    com.bytedance.im.core.b.e.d.b("retryWaitingInfoConversations - " + next);
                    a.a(bVar.getInboxType(), next, bVar.getConversationShortId(), bVar.getConversationType(), bVar.getUpdatedTime());
                }
            }
            a.a();
        }
    }

    public static void d(String str) {
        m.a();
        m.b(str);
    }

    public final void a(g gVar) {
        if (gVar != null) {
            this.f21261d.add(gVar);
        }
    }

    public final void b(g gVar) {
        if (gVar != null) {
            this.f21261d.remove(gVar);
        }
    }

    public final b a(String str) {
        return this.f21258a.get(str);
    }

    public final void f(b bVar) {
        b(bVar);
    }

    public static void c(String str) {
        m.a();
        s sVar = new s();
        e.a(new com.bytedance.im.core.b.d.d<b>(str) {

            /* renamed from: a */
            final /* synthetic */ String f21104a;

            public final /* synthetic */ java.lang.Object a(
/*
Method generation error in method: com.bytedance.im.core.b.b.a.s.1.a():java.lang.Object, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.b.b.a.s.1.a():java.lang.Object, class status: UNLOADED
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
        }, new com.bytedance.im.core.b.d.c<b>() {
            public final /* synthetic */ void a(
/*
Method generation error in method: com.bytedance.im.core.b.b.a.s.2.a(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.b.b.a.s.2.a(java.lang.Object):void, class status: UNLOADED
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
        });
    }

    private void f(String str) {
        this.f21258a.remove(str);
        if (c.a().b().D) {
            j.a().c();
        }
    }

    public final void d(b bVar) {
        if (bVar != null) {
            g.a().d(bVar);
            for (g d2 : this.f21261d) {
                d2.d(bVar);
            }
        }
    }

    public final void e(b bVar) {
        if (bVar != null) {
            g.a().e(bVar);
            for (g e2 : this.f21261d) {
                e2.e(bVar);
            }
        }
    }

    public final void b(b bVar) {
        if (bVar != null) {
            b(bVar);
            g.a().b(bVar);
            for (g b2 : this.f21261d) {
                b2.b(bVar);
            }
        }
    }

    public final boolean e(String str) {
        if (TextUtils.isEmpty(str) || !this.f21260c.contains(str)) {
            return false;
        }
        return true;
    }

    public static void b(String str) {
        m.a();
        com.bytedance.im.core.b.b.a.f fVar = new com.bytedance.im.core.b.b.a.f();
        b a2 = a().a(str);
        if (a2 != null && !a2.isTemp()) {
            fVar.a(a2.getInboxType(), str, a2.getConversationShortId(), a2.getConversationType(), a2.getLastMessageIndex());
        }
        e.a(new com.bytedance.im.core.b.d.d<Boolean>(str) {

            /* renamed from: a */
            final /* synthetic */ String f21017a;

            public final /* synthetic */ java.lang.Object a(
/*
Method generation error in method: com.bytedance.im.core.b.b.a.f.1.a():java.lang.Object, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.b.b.a.f.1.a():java.lang.Object, class status: UNLOADED
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
        }, new com.bytedance.im.core.b.d.c<Boolean>(str) {

            /* renamed from: a */
            final /* synthetic */ String f21019a;

            public final /* synthetic */ void a(
/*
Method generation error in method: com.bytedance.im.core.b.b.a.f.2.a(java.lang.Object):void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.b.b.a.f.2.a(java.lang.Object):void, class status: UNLOADED
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
        });
        a().a(a2);
    }

    public final void c(b bVar) {
        if (bVar != null) {
            b(bVar);
            g.a().c(bVar);
            for (g c2 : this.f21261d) {
                c2.c(bVar);
            }
        }
    }

    public final void b(List<m> list) {
        if (list != null && !list.isEmpty()) {
            g.a().b(list);
            for (g b2 : this.f21261d) {
                b2.b(list);
            }
        }
    }

    public final void c(List<String> list) {
        com.bytedance.im.core.b.e.k.a();
        if (!this.f21258a.isEmpty() && list != null && !list.isEmpty()) {
            for (String next : list) {
                b bVar = this.f21258a.get(next);
                com.bytedance.im.core.b.e.d.b("updateConversationListInfo - " + next);
                if (bVar != null) {
                    a.a(bVar.getInboxType(), next, bVar.getConversationShortId(), bVar.getConversationType(), bVar.getUpdatedTime());
                }
            }
            a.a();
        }
    }

    public final synchronized void b(b... bVarArr) {
        if (bVarArr != null) {
            try {
                if (bVarArr.length > 0) {
                    for (b bVar : bVarArr) {
                        this.f21258a.put(bVar.getConversationId(), bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c.a().b().D) {
            j.a().c();
        }
    }

    public final void a(b bVar) {
        if (bVar != null) {
            f(bVar.getConversationId());
            g.a().a(bVar);
            for (g a2 : this.f21261d) {
                a2.a(bVar);
            }
        }
    }

    private void a(int i, long j) {
        String a2 = e.a(i, j);
        if (a(a2) == null) {
            final b bVar = new b();
            bVar.setInboxType(i);
            bVar.setConversationId(a2);
            bVar.setConversationType(d.a.f20886a);
            bVar.setUpdatedTime(System.currentTimeMillis());
            bVar.setMemberCount(2);
            bVar.setIsMember(true);
            c(bVar);
            e.a(new com.bytedance.im.core.b.d.d<b>() {
                public final /* bridge */ /* synthetic */ Object a() {
                    k.a();
                    k.a(bVar);
                    return null;
                }
            }, null);
        }
    }

    public final long a(long j, com.bytedance.im.core.b.c.e eVar) {
        a(0, j);
        m.a();
        return new com.bytedance.im.core.b.b.a.e().a(0, j, eVar);
    }

    public final void a(long j, b<b> bVar) {
        a(0, j);
        m.a();
        new com.bytedance.im.core.b.b.a.e(bVar).a(0, j, null);
    }

    public final void a(String str, List<m> list) {
        g.a().a(str, list);
        for (g a2 : this.f21261d) {
            a2.a(str, list);
        }
    }

    public final void a(int i, List<Long> list, Map<String, String> map, b<b> bVar) {
        m.a();
        m.a(0, list, (String) null, map, bVar);
    }
}
