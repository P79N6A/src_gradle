package com.ss.android.ugc.awemepushlib.interaction;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.common.push.account.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.pushmanager.c;
import com.ss.android.pushmanager.client.MessageAppManager;
import com.ss.android.pushmanager.client.e;
import com.ss.android.pushmanager.f;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.android.ugc.awemepushapi.b;
import com.ss.android.ugc.awemepushlib.c.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;

public final class PushInitializer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76989a;

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f76990b;

    /* renamed from: c  reason: collision with root package name */
    static ExecutorService f76991c;

    /* renamed from: d  reason: collision with root package name */
    static Deque<Runnable> f76992d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private static volatile int f76993e = 0;

    @Retention(RetentionPolicy.SOURCE)
    @interface InitFlag {
    }

    static {
        ExecutorService executorService;
        if (PatchProxy.isSupport(new Object[]{1}, null, q.f77042a, true, 90240, new Class[]{Integer.TYPE}, ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{1}, null, q.f77042a, true, 90240, new Class[]{Integer.TYPE}, ExecutorService.class);
        } else {
            executorService = h.a(m.a(p.FIXED).a(1).a());
        }
        f76991c = executorService;
    }

    static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f76989a, true, 90229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f76989a, true, 90229, new Class[0], Void.TYPE);
            return;
        }
        if (!f76990b && f76993e != 0) {
            while (f76992d.size() > 0) {
                f76992d.pop().run();
            }
            f76990b = true;
        }
    }

    static void a(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, null, f76989a, true, 90228, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, null, f76989a, true, 90228, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        f76991c.execute(new m(runnable2));
    }

    static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f76989a, true, 90230, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f76989a, true, 90230, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f76993e = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                f76991c.execute(n.f77033b);
                break;
            case 4:
                a();
                return;
        }
    }

    public static void a(boolean z, Context context, b bVar) {
        c cVar;
        Context context2 = context;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), context2, bVar2}, null, f76989a, true, 90227, new Class[]{Boolean.TYPE, Context.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), context2, bVar2}, null, f76989a, true, 90227, new Class[]{Boolean.TYPE, Context.class, b.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, 2}, null, com.ss.android.message.h.f30010a, true, 17903, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, 2}, null, com.ss.android.message.h.f30010a, true, 17903, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
        } else if (f.f2538b.contains(2)) {
            try {
                Intent a2 = com.ss.android.message.h.a(context);
                a2.putExtra("do_schedule_start", true);
                a2.putExtra("do_schedule_start_type", 2);
                context2.startService(a2);
            } catch (Exception unused) {
            }
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, a.f76970a, true, 90394, new Class[]{b.class}, c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[]{bVar2}, null, a.f76970a, true, 90394, new Class[]{b.class}, c.class);
        } else {
            cVar = new c(bVar2) {

                /* renamed from: a */
                public static ChangeQuickRedirect f76971a;

                /* renamed from: b */
                final /* synthetic */ b f76972b;

                public final android.content.Context a(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.c.a.1.a():android.content.Context, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.c.a.1.a():android.content.Context, class status: UNLOADED
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

                public final java.lang.String b(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.c.a.1.b():java.lang.String, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.c.a.1.b():java.lang.String, class status: UNLOADED
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

                public final int c(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.c.a.1.c():int, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.c.a.1.c():int, class status: UNLOADED
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

                public final java.lang.String d(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.c.a.1.d():java.lang.String, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.c.a.1.d():java.lang.String, class status: UNLOADED
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

                public final java.lang.String e(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.c.a.1.e():java.lang.String, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.c.a.1.e():java.lang.String, class status: UNLOADED
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

                public final int f(
/*
Method generation error in method: com.ss.android.ugc.awemepushlib.c.a.1.f():int, dex: classes6.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.awemepushlib.c.a.1.f():int, class status: UNLOADED
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
            };
        }
        MessageAppManager.inst().initOnApplication(context2, cVar, ToolUtils.getCurProcessName(context));
        if (z) {
            e.a().b(context2, com.ss.android.ugc.awemepushlib.manager.a.a().a(context2));
            com.bytedance.ies.common.push.account.a aVar = new com.bytedance.ies.common.push.account.a(new a.C0181a(context2), (byte) 0);
            if (aVar.f20221a != null) {
                try {
                    String packageName = aVar.f20221a.getPackageName();
                    String string = aVar.f20221a.getString(aVar.f20221a.getApplicationInfo().labelRes);
                    if (!TextUtils.isEmpty(string)) {
                        if (!TextUtils.isEmpty(packageName)) {
                            Account account = new Account(string, packageName);
                            if (AccountManager.get(aVar.f20221a).addAccountExplicitly(account, null, null)) {
                                ContentResolver.setIsSyncable(account, aVar.a(), 1);
                                ContentResolver.setSyncAutomatically(account, aVar.a(), true);
                                ContentResolver.addPeriodicSync(account, aVar.a(), new Bundle(), 900);
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    com.ss.android.pushmanager.setting.b a3 = com.ss.android.pushmanager.setting.b.a();
                    if (PatchProxy.isSupport(new Object[]{(byte) 0}, a3, com.ss.android.pushmanager.setting.b.f2543a, false, 19197, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        com.ss.android.pushmanager.setting.b bVar3 = a3;
                        PatchProxy.accessDispatch(new Object[]{(byte) 0}, bVar3, com.ss.android.pushmanager.setting.b.f2543a, false, 19197, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        a3.f2546c.a().a("allow_push_daemon_monitor", false).a();
                    }
                } catch (Exception unused3) {
                }
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                MessageAppManager.inst().checkPushConfiguration("AwemePushConfig", com.ss.android.ugc.aweme.framework.e.a.a());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b2, code lost:
        if (r2.contains("com.adm") == false) goto L_0x01b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ boolean a(int r21, int r22, int r23, int r24, int r25, android.os.Handler.Callback r26, android.os.Message r27) {
        /*
            r0 = r27
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.what
            java.lang.Object r3 = r0.obj
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            r5[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r12 = 1
            r5[r12] = r6
            r13 = 2
            r5[r13] = r3
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.awemepushlib.c.a.f76970a
            r8 = 1
            r9 = 90393(0x16119, float:1.26668E-40)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class r11 = java.lang.Integer.TYPE
            r10[r1] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r10[r12] = r11
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r13] = r11
            java.lang.Class r11 = java.lang.Boolean.TYPE
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x006f
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r14[r1] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14[r12] = r2
            r14[r13] = r3
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.awemepushlib.c.a.f76970a
            r17 = 1
            r18 = 90393(0x16119, float:1.26668E-40)
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r1] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r12] = r3
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r2[r13] = r3
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x009d
        L_0x006f:
            r5 = r21
            if (r2 != r5) goto L_0x009c
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r2 >= r5) goto L_0x009c
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x009c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "Bad notification posted from package"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x009c
            java.lang.String r2 = "type_badnotification_error"
            com.ss.android.ugc.aweme.app.d.c r5 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r6 = "message"
            com.ss.android.ugc.aweme.app.d.c r3 = r5.a((java.lang.String) r6, (java.lang.String) r3)
            org.json.JSONObject r3 = r3.b()
            com.ss.android.ugc.awemepushlib.interaction.k.a(r2, r3)
            r2 = 1
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 == 0) goto L_0x00a0
            return r12
        L_0x00a0:
            r2 = 5
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r5[r1] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r5[r12] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r5[r13] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)
            r5[r4] = r3
            r3 = 4
            r5[r3] = r0
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f76989a
            r8 = 1
            r9 = 90232(0x16078, float:1.26442E-40)
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.Class r11 = java.lang.Integer.TYPE
            r10[r1] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r10[r12] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r10[r13] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r10[r4] = r11
            java.lang.Class<android.os.Message> r11 = android.os.Message.class
            r10[r3] = r11
            java.lang.Class r11 = java.lang.Void.TYPE
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0126
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r14[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            r14[r12] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
            r14[r13] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            r14[r4] = r5
            r14[r3] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f76989a
            r17 = 1
            r18 = 90232(0x16078, float:1.26442E-40)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r2[r1] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r2[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r2[r13] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r2[r4] = r5
            java.lang.Class<android.os.Message> r4 = android.os.Message.class
            r2[r3] = r4
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x01b7
        L_0x0126:
            boolean r2 = f76990b
            if (r2 != 0) goto L_0x01b7
            if (r0 != 0) goto L_0x012e
            goto L_0x01b7
        L_0x012e:
            int r2 = r0.what
            r3 = r22
            if (r2 == r3) goto L_0x0140
            r3 = r23
            if (r2 == r3) goto L_0x0140
            r3 = r25
            if (r2 == r3) goto L_0x0140
            r3 = r24
            if (r2 != r3) goto L_0x01b7
        L_0x0140:
            java.lang.String r2 = r27.toString()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = "com.xiaomi"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.taobao"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "org.android.agoo"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.aliyun"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.alibaba"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.umeng.message"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.huawei"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.coloros.mcssdk"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.meizu"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.vivo"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.ss.android.newmedia.message"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.amazon"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.fcm"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = "com.adm"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x01b7
        L_0x01b4:
            a((int) r4)
        L_0x01b7:
            if (r26 != 0) goto L_0x01ba
            return r1
        L_0x01ba:
            boolean r0 = r26.handleMessage(r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.interaction.PushInitializer.a(int, int, int, int, int, android.os.Handler$Callback, android.os.Message):boolean");
    }
}
