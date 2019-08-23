package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeLockFragmentFactory;
import com.ss.android.ugc.aweme.base.ui.session.a;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33608a;

    /* renamed from: b  reason: collision with root package name */
    private final TeenagerLockOptionsFragmentV2 f33609b;

    d(TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2) {
        this.f33609b = teenagerLockOptionsFragmentV2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33608a, false, 22050, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33608a, false, 22050, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2 = this.f33609b;
        r.a("close_teen_mode", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
        if (teenagerLockOptionsFragmentV2.c()) {
            teenagerLockOptionsFragmentV2.a(1);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], teenagerLockOptionsFragmentV2, TeenagerLockOptionsFragmentV2.f33573f, false, 22048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], teenagerLockOptionsFragmentV2, TeenagerLockOptionsFragmentV2.f33573f, false, 22048, new Class[0], Void.TYPE);
            return;
        }
        Fragment b2 = TimeLockFragmentFactory.b(1);
        b.a().a("TimeLockEnterFragmentV2", Boolean.class).a((LifecycleOwner) b2).a(teenagerLockOptionsFragmentV2, new a.C0450a() {

            /* renamed from: a */
            public static ChangeQuickRedirect f33574a;

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockOptionsFragmentV2.1.a(java.lang.Object):void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockOptionsFragmentV2.1.a(java.lang.Object):void, class status: UNLOADED
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
        });
        teenagerLockOptionsFragmentV2.a(b2);
    }
}
