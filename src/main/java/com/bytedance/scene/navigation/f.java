package com.bytedance.scene.navigation;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.scene.animation.c;
import com.bytedance.scene.b.b;
import com.bytedance.scene.l;
import com.bytedance.scene.navigation.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* renamed from: f  reason: collision with root package name */
    public static final Runnable f22156f = new Runnable() {
        public final void run() {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public e f22157a;

    /* renamed from: b  reason: collision with root package name */
    public final j f22158b = new j();

    /* renamed from: c  reason: collision with root package name */
    public d f22159c;

    /* renamed from: d  reason: collision with root package name */
    public final a f22160d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    final List<com.bytedance.scene.b.f<com.bytedance.scene.e, h>> f22161e = new ArrayList();
    public boolean g = false;
    List<c> h = new ArrayList();
    private final b i = new b(Looper.getMainLooper());
    private final ArrayDeque<b> j = new ArrayDeque<>();
    private long k = -1;
    private boolean l = false;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<com.bytedance.scene.b.c> f22165a;

        private a() {
            this.f22165a = new ArrayList();
        }

        public final void a() {
            if (this.f22165a.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f22165a);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.remove();
                    ((com.bytedance.scene.b.c) it2.next()).b();
                }
                this.f22165a.removeAll(arrayList);
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(com.bytedance.scene.b.c cVar) {
            this.f22165a.add(cVar);
        }

        public final void b(com.bytedance.scene.b.c cVar) {
            this.f22165a.remove(cVar);
        }
    }

    interface b {
        void a(Runnable runnable);
    }

    class c implements b {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.animation.c f22167b;

        /* renamed from: c  reason: collision with root package name */
        private final int f22168c;

        public final void a(Runnable runnable) {
            boolean z;
            boolean z2;
            f.this.g();
            if (f.this.f22157a.f22098f.value >= l.STOPPED.value) {
                if (Build.VERSION.SDK_INT >= 19) {
                    f.this.f22157a.f22094b.cancelPendingInputEvents();
                }
                List c2 = f.this.f22158b.c();
                if (this.f22168c > 0) {
                    boolean z3 = true;
                    if (this.f22168c >= c2.size()) {
                        if (c2.size() > 1) {
                            new c(this.f22167b, c2.size() - 1).a(f.f22156f);
                        }
                        f.this.f22157a.s().onBackPressed();
                        runnable.run();
                        return;
                    }
                    ArrayList<i> arrayList = new ArrayList<>();
                    for (int i = 0; i <= this.f22168c - 1; i++) {
                        arrayList.add((i) c2.get((c2.size() - 1) - i));
                    }
                    i iVar = (i) c2.get((c2.size() - this.f22168c) - 1);
                    final i a2 = f.this.f22158b.a();
                    com.bytedance.scene.e eVar = a2.f22190a;
                    View view = eVar.f22094b;
                    for (i iVar2 : arrayList) {
                        com.bytedance.scene.e eVar2 = iVar2.f22190a;
                        f.a(f.this.f22157a, eVar2, l.NONE, null, false, null);
                        f.this.f22158b.a(iVar2);
                        if (iVar2 != a2 && (eVar2 instanceof com.bytedance.scene.group.f)) {
                            f.this.f22157a.a((com.bytedance.scene.group.f) eVar2);
                        }
                    }
                    com.bytedance.scene.e eVar3 = iVar.f22190a;
                    if (f.this.f22157a.f22098f.value >= l.STARTED.value) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f.a(f.this.f22157a, eVar3, f.this.f22157a.f22098f, null, false, null);
                    if (a2.f22195f != null) {
                        a2.f22195f.a(a2.f22194e);
                    }
                    if (iVar.f22191b) {
                        List c3 = f.this.f22158b.c();
                        if (c3.size() > 1) {
                            for (int size = c3.size() - 2; size >= 0; size--) {
                                i iVar3 = (i) c3.get(size);
                                f.a(f.this.f22157a, iVar3.f22190a, f.a(f.this.f22157a.f22098f, l.STARTED), null, false, null);
                                if (!iVar3.f22191b) {
                                    break;
                                }
                            }
                        }
                    }
                    f fVar = f.this;
                    a aVar = iVar.f22192c;
                    Activity activity = fVar.f22157a.f22093a;
                    Window window = activity.getWindow();
                    if (Build.VERSION.SDK_INT >= 21) {
                        window.setStatusBarColor(aVar.f22146a);
                        window.setNavigationBarColor(aVar.f22147b);
                    }
                    window.getDecorView().setSystemUiVisibility(aVar.f22148c);
                    window.setSoftInputMode(aVar.f22149d);
                    int i2 = window.getAttributes().flags;
                    int i3 = aVar.f22150e;
                    int i4 = (i2 & i3) ^ -1;
                    window.addFlags(i3 & i4);
                    window.clearFlags(i2 & i4);
                    activity.setRequestedOrientation(aVar.f22151f);
                    f.this.f22159c.a(a2.f22190a, iVar.f22190a, false);
                    com.bytedance.scene.animation.c cVar = null;
                    if (this.f22167b != null) {
                        a2.f22190a.getClass();
                        iVar.f22190a.getClass();
                        cVar = this.f22167b;
                    }
                    if (cVar == null && a2.f22193d != null) {
                        a2.f22190a.getClass();
                        iVar.f22190a.getClass();
                        cVar = a2.f22193d;
                    }
                    if (cVar == null) {
                        cVar = f.this.f22157a.o;
                    }
                    if (f.this.g || !z || cVar == null) {
                        Runnable runnable2 = runnable;
                        runnable.run();
                    } else {
                        a2.f22190a.getClass();
                        iVar.f22190a.getClass();
                        FrameLayout frameLayout = f.this.f22157a.n;
                        com.bytedance.scene.b.a.c(frameLayout);
                        cVar.f21995a = frameLayout;
                        final com.bytedance.scene.b.c cVar2 = new com.bytedance.scene.b.c();
                        final Runnable runnable3 = runnable;
                        AnonymousClass1 r9 = new Runnable() {
                            public final void run() {
                                f.this.f22160d.b(cVar2);
                                if (a2.f22190a instanceof com.bytedance.scene.group.f) {
                                    f.this.f22157a.a((com.bytedance.scene.group.f) a2.f22190a);
                                }
                                runnable3.run();
                            }
                        };
                        com.bytedance.scene.animation.a aVar2 = new com.bytedance.scene.animation.a(eVar, view, eVar.f22098f, a2.f22191b);
                        com.bytedance.scene.animation.a aVar3 = new com.bytedance.scene.animation.a(iVar.f22190a, iVar.f22190a.f22094b, iVar.f22190a.f22098f, iVar.f22191b);
                        f.this.f22160d.a(cVar2);
                        e eVar4 = f.this.f22157a;
                        View rootView = f.this.f22157a.f22094b.getRootView();
                        eVar4.a(true);
                        c.AnonymousClass4 r6 = new Runnable(eVar4, r9) {

                            /* renamed from: a */
                            final /* synthetic */ e f22009a;

                            /* renamed from: b */
                            final /* synthetic */ Runnable f22010b;

                            public final void run(
/*
Method generation error in method: com.bytedance.scene.animation.c.4.run():void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.animation.c.4.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        };
                        cVar2.a(new b.a(r6) {

                            /* renamed from: a */
                            final /* synthetic */ Runnable f22012a;

                            public final void a(
/*
Method generation error in method: com.bytedance.scene.animation.c.5.a():void, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.animation.c.5.a():void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        });
                        View view2 = aVar2.f21987b;
                        View view3 = aVar3.f21987b;
                        if (view2.getWidth() == 0 || view2.getHeight() == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (view3.getWidth() == 0 || view3.getHeight() == 0) {
                            z3 = false;
                        }
                        if (!z2 || !z3) {
                            com.bytedance.scene.b.b c4 = cVar2.c();
                            c.AnonymousClass6 r3 = r9;
                            c.AnonymousClass6 r92 = new Runnable(z2, view2, c4, aVar2, aVar3, r6, cVar2) {

                                /* renamed from: a */
                                final /* synthetic */ boolean f22014a;

                                /* renamed from: b */
                                final /* synthetic */ View f22015b;

                                /* renamed from: c */
                                final /* synthetic */ b f22016c;

                                /* renamed from: d */
                                final /* synthetic */ a f22017d;

                                /* renamed from: e */
                                final /* synthetic */ a f22018e;

                                /* renamed from: f */
                                final /* synthetic */ Runnable f22019f;
                                final /* synthetic */ com.bytedance.scene.b.c g;

                                public final void run(
/*
Method generation error in method: com.bytedance.scene.animation.c.6.run():void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.animation.c.6.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                
*/
                            };
                            com.bytedance.scene.animation.c.a(rootView, c4, r3);
                            if (!z2) {
                                cVar.f21995a.addView(view2);
                                view2.setVisibility(0);
                                view2.requestLayout();
                            }
                            if (!z3) {
                                view3.requestLayout();
                            }
                        } else {
                            cVar.b(aVar2, aVar3, r6, cVar2.c());
                            return;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("popCount can not be " + this.f22168c + " stackSize is " + c2.size());
            }
            throw new IllegalArgumentException("Can't pop before NavigationScene create view");
        }

        private c(com.bytedance.scene.animation.c cVar, int i) {
            this.f22167b = cVar;
            this.f22168c = i;
        }

        /* synthetic */ c(f fVar, com.bytedance.scene.animation.c cVar, int i, byte b2) {
            this(cVar, 1);
        }
    }

    class d implements b {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.animation.c f22174b;

        public final void a(Runnable runnable) {
            new c(f.this, this.f22174b, 1, (byte) 0).a(runnable);
        }

        private d(com.bytedance.scene.animation.c cVar) {
            this.f22174b = cVar;
        }

        /* synthetic */ d(f fVar, com.bytedance.scene.animation.c cVar, byte b2) {
            this(null);
        }
    }

    class e implements b {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.e f22176b;

        /* renamed from: c  reason: collision with root package name */
        private final com.bytedance.scene.a.c f22177c;

        public final void a(Runnable runnable) {
            View view;
            com.bytedance.scene.e eVar;
            boolean z;
            boolean z2;
            boolean z3;
            l lVar;
            f.this.g();
            if (f.this.f22157a.f22098f.value >= l.STOPPED.value) {
                if (Build.VERSION.SDK_INT >= 19) {
                    f.this.f22157a.f22094b.cancelPendingInputEvents();
                }
                i a2 = f.this.f22158b.a();
                com.bytedance.scene.animation.c cVar = null;
                if (a2 != null) {
                    view = a2.f22190a.f22094b;
                } else {
                    view = null;
                }
                if (this.f22176b.f22095c == null) {
                    com.bytedance.scene.b.g<com.bytedance.scene.e> gVar = this.f22177c.f21981d;
                    if (gVar != null) {
                        List c2 = f.this.f22158b.c();
                        for (int size = c2.size() - 1; size >= 0; size--) {
                            i iVar = (i) c2.get(size);
                            com.bytedance.scene.e eVar2 = iVar.f22190a;
                            if (gVar.a()) {
                                f.a(f.this.f22157a, eVar2, l.NONE, null, false, null);
                                f.this.f22158b.a(iVar);
                            }
                        }
                    }
                    if (a2 != null && f.this.f22158b.c().contains(a2)) {
                        Activity s = a2.f22190a.s();
                        a aVar = new a();
                        Window window = s.getWindow();
                        View decorView = window.getDecorView();
                        if (Build.VERSION.SDK_INT >= 21) {
                            aVar.f22146a = window.getStatusBarColor();
                            aVar.f22147b = window.getNavigationBarColor();
                        }
                        aVar.f22148c = decorView.getSystemUiVisibility();
                        aVar.f22149d = window.getAttributes().softInputMode;
                        aVar.f22150e = window.getAttributes().flags;
                        aVar.f22151f = s.getRequestedOrientation();
                        a2.f22192c = aVar;
                        com.bytedance.scene.e eVar3 = a2.f22190a;
                        if (this.f22177c.f21980c) {
                            lVar = l.STARTED;
                        } else {
                            lVar = l.STOPPED;
                        }
                        f.a(f.this.f22157a, eVar3, f.a(lVar, f.this.f22157a.f22098f), null, false, null);
                        List c3 = f.this.f22158b.c();
                        if (c3.size() > 1 && !this.f22177c.f21980c && a2.f22191b) {
                            for (int size2 = c3.size() - 2; size2 >= 0; size2--) {
                                i iVar2 = (i) c3.get(size2);
                                f.a(f.this.f22157a, iVar2.f22190a, f.a(l.STOPPED, f.this.f22157a.f22098f), null, false, null);
                                if (!iVar2.f22191b) {
                                    break;
                                }
                            }
                        }
                    }
                    com.bytedance.scene.animation.c cVar2 = this.f22177c.f21978a;
                    com.bytedance.scene.e eVar4 = this.f22176b;
                    boolean z4 = this.f22177c.f21980c;
                    i iVar3 = new i();
                    iVar3.f22190a = eVar4;
                    iVar3.f22191b = z4;
                    iVar3.f22193d = cVar2;
                    iVar3.f22195f = this.f22177c.f21979b;
                    f.this.f22158b.f22196a.add(iVar3);
                    f.a(f.this.f22157a, this.f22176b, f.this.f22157a.f22098f, null, false, null);
                    d dVar = f.this.f22159c;
                    if (a2 != null) {
                        eVar = a2.f22190a;
                    } else {
                        eVar = null;
                    }
                    dVar.a(eVar, this.f22176b, true);
                    if (f.this.f22157a.f22098f.value >= l.STARTED.value) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (f.this.g || !z || a2 == null) {
                        Runnable runnable2 = runnable;
                        runnable.run();
                    } else {
                        com.bytedance.scene.animation.c cVar3 = iVar3.f22193d;
                        if (cVar3 != null) {
                            a2.f22190a.getClass();
                            this.f22176b.getClass();
                            cVar = cVar3;
                        }
                        if (cVar == null && cVar2 != null) {
                            a2.f22190a.getClass();
                            this.f22176b.getClass();
                            cVar = cVar2;
                        }
                        if (cVar == null) {
                            cVar = f.this.f22157a.o;
                        }
                        if (cVar != null) {
                            a2.f22190a.getClass();
                            this.f22176b.getClass();
                            com.bytedance.scene.e eVar5 = a2.f22190a;
                            com.bytedance.scene.b.a.c(f.this.f22157a.m);
                            cVar.f21995a = f.this.f22157a.n;
                            com.bytedance.scene.animation.a aVar2 = new com.bytedance.scene.animation.a(eVar5, view, eVar5.f22098f, a2.f22191b);
                            com.bytedance.scene.animation.a aVar3 = new com.bytedance.scene.animation.a(this.f22176b, this.f22176b.f22094b, this.f22176b.f22098f, iVar3.f22191b);
                            final com.bytedance.scene.b.c cVar4 = new com.bytedance.scene.b.c();
                            f.this.f22160d.a(cVar4);
                            e eVar6 = f.this.f22157a;
                            View rootView = f.this.f22157a.f22094b.getRootView();
                            final Runnable runnable3 = runnable;
                            AnonymousClass1 r15 = new Runnable() {
                                public final void run() {
                                    f.this.f22160d.b(cVar4);
                                    runnable3.run();
                                }
                            };
                            eVar6.a(true);
                            View view2 = aVar2.f21987b;
                            View view3 = aVar3.f21987b;
                            if (aVar2.f21988c.value < l.STOPPED.value) {
                                if (Build.VERSION.SDK_INT >= 18) {
                                    cVar.f21995a.getOverlay().add(view2);
                                } else {
                                    cVar.f21995a.addView(view2);
                                }
                            }
                            c.AnonymousClass1 r5 = r10;
                            c.AnonymousClass1 r10 = new Runnable(eVar6, aVar2, view2, r15) {

                                /* renamed from: a */
                                final /* synthetic */ e f21996a;

                                /* renamed from: b */
                                final /* synthetic */ a f21997b;

                                /* renamed from: c */
                                final /* synthetic */ View f21998c;

                                /* renamed from: d */
                                final /* synthetic */ Runnable f21999d;

                                public final void run(
/*
Method generation error in method: com.bytedance.scene.animation.c.1.run():void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.animation.c.1.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                
*/
                            };
                            cVar4.a(new b.a(r5) {

                                /* renamed from: a */
                                final /* synthetic */ Runnable f22001a;

                                public final void a(
/*
Method generation error in method: com.bytedance.scene.animation.c.2.a():void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.animation.c.2.a():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                
*/
                            });
                            if (view2.getWidth() == 0 || view2.getHeight() == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (view3.getWidth() == 0 || view3.getHeight() == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (!z2 || !z3) {
                                com.bytedance.scene.b.b c4 = cVar4.c();
                                c.AnonymousClass3 r2 = r10;
                                c.AnonymousClass3 r102 = new Runnable(z2, view2, c4, aVar2, aVar3, r5, cVar4) {

                                    /* renamed from: a */
                                    final /* synthetic */ boolean f22003a;

                                    /* renamed from: b */
                                    final /* synthetic */ View f22004b;

                                    /* renamed from: c */
                                    final /* synthetic */ b f22005c;

                                    /* renamed from: d */
                                    final /* synthetic */ a f22006d;

                                    /* renamed from: e */
                                    final /* synthetic */ a f22007e;

                                    /* renamed from: f */
                                    final /* synthetic */ Runnable f22008f;
                                    final /* synthetic */ com.bytedance.scene.b.c g;

                                    public final void run(
/*
Method generation error in method: com.bytedance.scene.animation.c.3.run():void, dex: classes2.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.animation.c.3.run():void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                    	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                    
*/
                                };
                                com.bytedance.scene.animation.c.a(rootView, c4, r2);
                                if (!z2) {
                                    view2.setVisibility(0);
                                    view2.requestLayout();
                                }
                                if (!z3) {
                                    view3.requestLayout();
                                }
                            } else {
                                cVar.a(aVar2, aVar3, r5, cVar4.c());
                            }
                        } else {
                            Runnable runnable4 = runnable;
                            runnable.run();
                        }
                    }
                } else if (this.f22176b.f22095c == f.this.f22157a) {
                    runnable.run();
                } else {
                    throw new IllegalArgumentException("Scene already has a parent, parent " + this.f22176b.f22095c);
                }
            } else {
                throw new IllegalArgumentException("Can't push before NavigationScene create view");
            }
        }

        private e(com.bytedance.scene.e eVar, com.bytedance.scene.a.c cVar) {
            this.f22176b = eVar;
            this.f22177c = cVar;
        }

        /* synthetic */ e(f fVar, com.bytedance.scene.e eVar, com.bytedance.scene.a.c cVar, byte b2) {
            this(eVar, cVar);
        }
    }

    /* renamed from: com.bytedance.scene.navigation.f$f  reason: collision with other inner class name */
    class C0230f implements b {

        /* renamed from: b  reason: collision with root package name */
        private final l f22182b;

        public final void a(Runnable runnable) {
            if (f.this.e() == null) {
                runnable.run();
                return;
            }
            for (i iVar : f.this.f22158b.c()) {
                f.a(f.this.f22157a, iVar.f22190a, this.f22182b, null, true, null);
            }
            runnable.run();
        }

        private C0230f(l lVar) {
            this.f22182b = lVar;
        }

        /* synthetic */ C0230f(f fVar, l lVar, byte b2) {
            this(lVar);
        }
    }

    class g implements b {

        /* renamed from: b  reason: collision with root package name */
        private final l f22184b;

        public final void a(Runnable runnable) {
            if (f.this.e() == null) {
                runnable.run();
                return;
            }
            List c2 = f.this.f22158b.c();
            l lVar = this.f22184b;
            for (int size = c2.size() - 1; size >= 0; size--) {
                i iVar = (i) c2.get(size);
                if (size != c2.size() - 1) {
                    l lVar2 = null;
                    if (lVar == l.RESUMED) {
                        lVar2 = l.STARTED;
                    } else if (lVar == l.STARTED) {
                        lVar2 = l.STARTED;
                    } else if (lVar == l.STOPPED) {
                        lVar2 = l.STOPPED;
                    }
                    f.a(f.this.f22157a, iVar.f22190a, lVar2, null, true, runnable);
                    if (!iVar.f22191b) {
                        break;
                    }
                } else {
                    f.a(f.this.f22157a, iVar.f22190a, lVar, null, true, runnable);
                    if (!iVar.f22191b) {
                        break;
                    }
                }
            }
            runnable.run();
        }

        private g(l lVar) {
            this.f22184b = lVar;
        }

        /* synthetic */ g(f fVar, l lVar, byte b2) {
            this(lVar);
        }
    }

    public final boolean c() {
        return this.f22158b.b();
    }

    public final i e() {
        return this.f22158b.a();
    }

    public final void a() {
        a((b) new d(this, null, (byte) 0));
    }

    public final com.bytedance.scene.e d() {
        i a2 = this.f22158b.a();
        if (a2 != null) {
            return a2.f22190a;
        }
        return null;
    }

    public final void g() {
        this.f22160d.a();
        com.bytedance.scene.animation.interaction.a.a();
    }

    public final boolean f() {
        ArrayList arrayList = new ArrayList(this.f22161e);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((h) ((com.bytedance.scene.b.f) arrayList.get(size)).f22084b).a()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        boolean z;
        boolean z2;
        if (this.j.size() != 0 && this.f22157a.f22098f == l.STOPPED) {
            if (System.currentTimeMillis() - this.k > 800) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList(this.j);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                b bVar = (b) arrayList.get(i2);
                if (i2 < arrayList.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.g = z2 | z;
                this.l = true;
                bVar.a(f22156f);
                this.l = false;
                this.g = false;
            }
            this.j.removeAll(arrayList);
            if (this.j.size() <= 0) {
                this.k = -1;
                return;
            }
            throw new IllegalStateException("why mPendingActionList still have item?");
        }
    }

    public final void a(Configuration configuration) {
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            if (cVar != null) {
                cVar.a(configuration);
            }
        }
    }

    f(e eVar) {
        this.f22157a = eVar;
        this.f22159c = eVar;
    }

    public final void a(l lVar) {
        new g(this, lVar, (byte) 0).a(f22156f);
    }

    public final void a(final b bVar) {
        if (this.f22157a.f22098f.value < l.STOPPED.value) {
            this.j.addLast(bVar);
            this.k = System.currentTimeMillis();
        } else if (this.l) {
            AnonymousClass1 r0 = new Runnable() {
                public final void run() {
                    f.this.a(bVar);
                }
            };
            b bVar2 = this.i;
            Message obtain = Message.obtain(bVar2, r0);
            if (bVar2.f22152a) {
                obtain.setAsynchronous(true);
            }
            bVar2.sendMessage(obtain);
        } else {
            this.l = true;
            bVar.a(f22156f);
            this.l = false;
        }
    }

    public static l a(l lVar, l lVar2) {
        if (lVar.value > lVar2.value) {
            return lVar2;
        }
        return lVar;
    }

    public final void a(@NonNull com.bytedance.scene.e eVar, @NonNull com.bytedance.scene.a.c cVar) {
        if (eVar != null) {
            a((b) new e(this, eVar, cVar, (byte) 0));
            return;
        }
        throw new NullPointerException("scene can't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.scene.navigation.e r5, com.bytedance.scene.e r6, com.bytedance.scene.l r7, android.os.Bundle r8, boolean r9, java.lang.Runnable r10) {
        /*
        L_0x0000:
            com.bytedance.scene.l r0 = r6.f22098f
            if (r0 != r7) goto L_0x000a
            if (r10 == 0) goto L_0x0009
            r10.run()
        L_0x0009:
            return
        L_0x000a:
            int r1 = r0.value
            int r2 = r7.value
            r3 = 8
            if (r1 >= r2) goto L_0x0093
            int[] r1 = com.bytedance.scene.navigation.f.AnonymousClass3.f22164a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0034;
                case 2: goto L_0x0026;
                case 3: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0092
        L_0x001f:
            r6.h()
            a(r5, r6, r7, r8, r9, r10)
            goto L_0x0092
        L_0x0026:
            android.view.View r0 = r6.f22094b
            r1 = 0
            r0.setVisibility(r1)
            r6.g()
            a(r5, r6, r7, r8, r9, r10)
            goto L_0x00c9
        L_0x0034:
            android.app.Activity r0 = r5.f22093a
            r6.a((android.app.Activity) r0)
            r6.a((com.bytedance.scene.e) r5)
            r6.a((android.os.Bundle) r8)
            android.widget.FrameLayout r0 = r5.m
            r6.a((android.os.Bundle) r8, (android.view.ViewGroup) r0)
            if (r9 != 0) goto L_0x0086
            android.view.View r1 = r6.f22094b
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 != 0) goto L_0x0081
            com.bytedance.scene.navigation.i r1 = r5.b(r6)
            boolean r1 = r1.f22191b
            if (r1 != 0) goto L_0x0081
            com.bytedance.scene.navigation.g r1 = r5.k
            boolean r1 = r1.f22188d
            if (r1 == 0) goto L_0x0081
            com.bytedance.scene.navigation.g r1 = r5.k
            int r1 = r1.f22189e
            if (r1 <= 0) goto L_0x0074
            android.view.View r2 = r6.f22094b
            android.support.v7.view.ContextThemeWrapper r4 = r6.r()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r1 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r4, (int) r1)
            r2.setBackgroundDrawable(r1)
            goto L_0x0081
        L_0x0074:
            android.view.View r1 = r6.f22094b
            android.support.v7.view.ContextThemeWrapper r2 = r6.r()
            android.graphics.drawable.Drawable r2 = com.bytedance.scene.b.k.a((android.content.Context) r2)
            r1.setBackgroundDrawable(r2)
        L_0x0081:
            android.view.View r1 = r6.f22094b
            r0.addView(r1)
        L_0x0086:
            android.view.View r0 = r6.f22094b
            r0.setVisibility(r3)
            r6.b(r8)
            a(r5, r6, r7, r8, r9, r10)
            goto L_0x00c9
        L_0x0092:
            return
        L_0x0093:
            int[] r1 = com.bytedance.scene.navigation.f.AnonymousClass3.f22164a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 2: goto L_0x00b4;
                case 3: goto L_0x00a6;
                case 4: goto L_0x009f;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x00c9
        L_0x009f:
            r6.i()
            a(r5, r6, r7, r8, r9, r10)
            return
        L_0x00a6:
            r6.j()
            if (r9 != 0) goto L_0x00b0
            android.view.View r0 = r6.f22094b
            r0.setVisibility(r3)
        L_0x00b0:
            a(r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x00ca }
            return
        L_0x00b4:
            android.view.View r0 = r6.f22094b
            r6.k()
            if (r9 != 0) goto L_0x00be
            com.bytedance.scene.b.k.a((android.view.View) r0)
        L_0x00be:
            r6.l()
            r6.m()
            r6.n()
            goto L_0x0000
        L_0x00c9:
            return
        L_0x00ca:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.f.a(com.bytedance.scene.navigation.e, com.bytedance.scene.e, com.bytedance.scene.l, android.os.Bundle, boolean, java.lang.Runnable):void");
    }
}
