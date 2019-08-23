package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeLockFragmentFactory;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a;
import com.ss.android.ugc.aweme.base.ui.session.a;
import com.ss.android.ugc.aweme.base.ui.session.b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.bd;
import kotlinx.coroutines.bk;
import kotlinx.coroutines.g;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33606a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsOptionsFragmentV2 f33607b;

    c(AbsOptionsFragmentV2 absOptionsFragmentV2) {
        this.f33607b = absOptionsFragmentV2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33606a, false, 22035, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33606a, false, 22035, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AbsOptionsFragmentV2 absOptionsFragmentV2 = this.f33607b;
        if (absOptionsFragmentV2.c()) {
            if (PatchProxy.isSupport(new Object[0], absOptionsFragmentV2, AbsOptionsFragmentV2.f33552a, false, 22032, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], absOptionsFragmentV2, AbsOptionsFragmentV2.f33552a, false, 22032, new Class[0], Void.TYPE);
            } else {
                if (absOptionsFragmentV2.b() != null) {
                    String str = ((a) absOptionsFragmentV2.b().getValue()).f33620b.f33621a;
                    ParentalPlatformManager parentalPlatformManager = ParentalPlatformManager.f2599b;
                    Context context = absOptionsFragmentV2.getContext();
                    if (PatchProxy.isSupport(new Object[]{str, context}, parentalPlatformManager, ParentalPlatformManager.f2598a, false, 21749, new Class[]{String.class, Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, context}, parentalPlatformManager, ParentalPlatformManager.f2598a, false, 21749, new Class[]{String.class, Context.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str, "uid");
                        Intrinsics.checkParameterIsNotNull(context, "context");
                        q<com.ss.android.ugc.aweme.antiaddic.lock.entity.a> dynamicPassword = PatchProxy.isSupport(new Object[]{str}, null, ParentalPlatformApi.f33425a, true, 21840, new Class[]{String.class}, q.class) ? (q) PatchProxy.accessDispatch(new Object[]{str}, null, ParentalPlatformApi.f33425a, true, 21840, new Class[]{String.class}, q.class) : TextUtils.isEmpty(str) ? null : ParentalPlatformApi.f33426b.getDynamicPassword(str);
                        if (dynamicPassword != null) {
                            bk unused = g.a(bd.f83876a, com.ss.android.ugc.aweme.f.a.f43885b, null, new ParentalPlatformManager.c(dynamicPassword, context, null), 2);
                        }
                    }
                }
            }
        } else {
            Fragment b2 = TimeLockFragmentFactory.b(2);
            b.a().a("TimeLockEnterFragmentV2", Boolean.class).a((LifecycleOwner) b2).a(absOptionsFragmentV2, new a.C0450a<Boolean>() {

                /* renamed from: a */
                public static ChangeQuickRedirect f33560a;

                public final /* synthetic */ void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.AbsOptionsFragmentV2.2.a(java.lang.Object):void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.AbsOptionsFragmentV2.2.a(java.lang.Object):void, class status: UNLOADED
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
            absOptionsFragmentV2.a(b2);
        }
    }
}
