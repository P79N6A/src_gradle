package com.ss.android.ugc.aweme.update;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.update.m;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75216a;

    /* renamed from: c  reason: collision with root package name */
    private m f75217c = m.a();

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f75216a, false, 87367, new Class[0], Boolean.TYPE)) {
            return this.f75217c.r();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75216a, false, 87367, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f75216a, false, 87368, new Class[0], Boolean.TYPE)) {
            return this.f75217c.h();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75216a, false, 87368, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f75216a, false, 87369, new Class[0], Boolean.TYPE)) {
            return this.f75217c.g();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75216a, false, 87369, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f75216a, false, 87370, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f75216a, false, 87370, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        m mVar = this.f75217c;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, mVar, m.f4275a, false, 87458, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            m mVar2 = mVar;
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, mVar2, m.f4275a, false, 87458, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (mVar.h()) {
            String a2 = m.a(mVar.f());
            m.AnonymousClass1 r6 = new DialogInterface.OnClickListener(str3, context2, str4) {

                /* renamed from: a */
                public static ChangeQuickRedirect f75257a;

                /* renamed from: b */
                final /* synthetic */ String f75258b;

                /* renamed from: c */
                final /* synthetic */ Context f75259c;

                /* renamed from: d */
                final /* synthetic */ String f75260d;

                public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.update.m.1.onClick(android.content.DialogInterface, int):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.update.m.1.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            a.C0185a aVar = new a.C0185a(context2);
            aVar.a((int) C0906R.string.do6).b(a2).a((int) C0906R.string.b4h, (DialogInterface.OnClickListener) r6).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null);
            aVar.a().a();
        }
    }
}
