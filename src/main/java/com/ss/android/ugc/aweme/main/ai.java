package com.ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.c.c;
import com.ss.android.download.api.config.h;
import com.ss.android.downloadlib.addownload.a.a;
import com.ss.android.downloadlib.addownload.j;
import com.ss.android.downloadlib.c.c;
import com.ss.android.downloadlib.c.k;
import com.ss.android.newmedia.BaseMainHelper;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2;
import com.ss.android.ugc.aweme.freeflowcard.b;
import com.ss.android.ugc.aweme.update.m;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.Callable;

public final class ai extends BaseMainHelper {
    public static ChangeQuickRedirect j;

    @MeasureFunction
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 57374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 57374, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        try {
            this.f30091c.cancel(C0906R.id.bu6);
            this.f30091c.cancel(C0906R.id.bu5);
        } catch (Exception unused) {
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 57375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 57375, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        m a2 = m.a();
        if (PatchProxy.isSupport(new Object[0], a2, m.f4275a, false, 87452, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, m.f4275a, false, 87452, new Class[0], Void.TYPE);
            return;
        }
        synchronized (a2.Q) {
            if (a2.S != null) {
                a2.S.a();
            }
            if (a2.R != null) {
                a2.R.a();
            }
            a2.g.cancel(C0906R.id.cu6);
            a2.g.cancel(C0906R.id.cu4);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 57376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 57376, new Class[0], Void.TYPE);
            return;
        }
        try {
            c();
            if (this.f30090b == null) {
                Context context = i.a().getContext();
                if (context != null) {
                    this.f30094f.f(context);
                }
            } else {
                this.f30094f.f(this.f30090b);
            }
            this.g = true;
            a.a().f28726c = false;
            if (this.f30090b != null) {
                this.f30090b.finish();
            }
            if (!o.v()) {
                o.b().j();
            } else {
                com.ss.android.ugc.playerkit.videoview.a.a().c();
            }
            b.a().k = false;
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.feed.a.f44607a, false, 39943, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.feed.a.f44607a, false, 39943, new Class[0], Void.TYPE);
            } else {
                a.i.a((Callable<TResult>) new Callable<Object>() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f44613a;

                    public final java.lang.Object call(
/*
Method generation error in method: com.ss.android.ugc.aweme.feed.a.1.call():java.lang.Object, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.feed.a.1.call():java.lang.Object, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                });
            }
            this.f30090b = null;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
    }

    public final boolean d() {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 57370, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, j, false, 57370, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, j, false, 57371, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, j, false, 57371, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, j, false, 57372, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, j, false, 57372, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (VideoCommentDialogFragment2.a((Context) this.f30090b)) {
                Activity activity = this.f30090b;
                if (PatchProxy.isSupport(new Object[]{activity}, null, VideoCommentDialogFragment2.f2855a, true, 27716, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity}, null, VideoCommentDialogFragment2.f2855a, true, 27716, new Class[]{Context.class}, Void.TYPE);
                } else {
                    VideoCommentDialogFragment2 b2 = VideoCommentDialogFragment2.b((Context) activity);
                    if (b2 != null) {
                        b2.q();
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (PatchProxy.isSupport(new Object[0], this, j, false, 57373, new Class[0], Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, j, false, 57373, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    a a2 = a.a();
                    Activity activity2 = this.f30090b;
                    AnonymousClass1 r2 = new a.C0341a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54330a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f54330a, false, 57377, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f54330a, false, 57377, new Class[0], Void.TYPE);
                                return;
                            }
                            ai.this.f();
                        }
                    };
                    String str2 = a.f28723a;
                    c.a(str2, "tryShowInstallDialog canBackRefresh:" + false, null);
                    if (a2.f28726c || a2.f28725b.isEmpty()) {
                        z3 = false;
                    } else {
                        String str3 = a.f28723a;
                        c.a(str3, "tryShowInstallDialog size:" + a2.f28725b.size(), null);
                        ListIterator listIterator = new LinkedList(a2.f28725b.values()).listIterator(a2.f28725b.values().size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                z3 = false;
                                break;
                            }
                            com.ss.android.downloadlib.addownload.d.a aVar = (com.ss.android.downloadlib.addownload.d.a) listIterator.previous();
                            if ((aVar == null || !k.b(activity2, aVar.f28757d)) && k.b(aVar.g)) {
                                a2.f28725b.clear();
                                String str4 = a.f28723a;
                                c.a(str4, "showBackInstallDialog appName:" + aVar.f28758e + ",pkg:" + aVar.f28757d, null);
                                h d2 = com.ss.android.downloadlib.addownload.k.d();
                                c.a a3 = new c.a(activity2).a(activity2.getResources().getString(C0906R.string.kr));
                                Resources resources = activity2.getResources();
                                Object[] objArr = new Object[1];
                                if (TextUtils.isEmpty(aVar.f28758e)) {
                                    str = activity2.getResources().getString(C0906R.string.kn);
                                } else {
                                    str = aVar.f28758e;
                                }
                                objArr[0] = str;
                                if (d2.a(a3.b(resources.getString(C0906R.string.kq, objArr)).c(activity2.getResources().getString(C0906R.string.kp)).d(String.format(activity2.getResources().getString(C0906R.string.ko), new Object[]{activity2.getResources().getString(activity2.getApplicationContext().getApplicationInfo().labelRes)})).a(false).a(k.a((Context) activity2, aVar.g)).a((c.b) new c.b(aVar, activity2, r2) {

                                    /* renamed from: a */
                                    final /* synthetic */ com.ss.android.downloadlib.addownload.d.a f28729a;

                                    /* renamed from: b */
                                    final /* synthetic */ Context f28730b;

                                    /* renamed from: c */
                                    final /* synthetic */ C0341a f28731c;

                                    public final void c(
/*
Method generation error in method: com.ss.android.downloadlib.addownload.a.a.1.c(android.content.DialogInterface):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.downloadlib.addownload.a.a.1.c(android.content.DialogInterface):void, class status: UNLOADED
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
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                    public final void b(
/*
Method generation error in method: com.ss.android.downloadlib.addownload.a.a.1.b(android.content.DialogInterface):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.downloadlib.addownload.a.a.1.b(android.content.DialogInterface):void, class status: UNLOADED
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
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                    public final void a(
/*
Method generation error in method: com.ss.android.downloadlib.addownload.a.a.1.a(android.content.DialogInterface):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.downloadlib.addownload.a.a.1.a(android.content.DialogInterface):void, class status: UNLOADED
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
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                    	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                                    	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                                }).a()) != null) {
                                    j.a("exit_warn", "show", true, aVar.f28755b, aVar.f28759f, aVar.f28756c, 1);
                                    a2.f28727d = aVar.f28757d;
                                }
                                a2.f28726c = true;
                                com.ss.android.downloadlib.addownload.a.b.a("sp_ad_install_back_dialog", "key_uninstalled_list", a2.f28725b);
                                z3 = true;
                            }
                        }
                        String str5 = a.f28723a;
                        com.ss.android.downloadlib.c.c.a(str5, "tryShowInstallDialog isShow:" + z3, null);
                    }
                }
                if (!z3) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            return false;
        }
        return e();
    }

    public ai(Activity activity) {
        super(activity);
    }
}
