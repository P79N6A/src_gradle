package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.effectplatform.d;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.b.a;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class b implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70307a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerViewModel f70308b;

    /* renamed from: c  reason: collision with root package name */
    private final EffectPlatform f70309c;

    /* renamed from: d  reason: collision with root package name */
    private final String f70310d;

    b(EffectStickerViewModel effectStickerViewModel, EffectPlatform effectPlatform, String str) {
        this.f70308b = effectStickerViewModel;
        this.f70309c = effectPlatform;
        this.f70310d = str;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        ObservableEmitter observableEmitter2 = observableEmitter;
        if (PatchProxy.isSupport(new Object[]{observableEmitter2}, this, f70307a, false, 79911, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter2}, this, f70307a, false, 79911, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        EffectStickerViewModel effectStickerViewModel = this.f70308b;
        EffectPlatform effectPlatform = this.f70309c;
        String str = this.f70310d;
        EffectStickerViewModel.AnonymousClass3 r4 = new a(observableEmitter2) {

            /* renamed from: a */
            public static ChangeQuickRedirect f70278a;

            /* renamed from: b */
            final /* synthetic */ ObservableEmitter f70279b;

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.3.a(com.ss.android.ugc.effectmanager.common.e.c):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.3.a(com.ss.android.ugc.effectmanager.common.e.c):void, class status: UNLOADED
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
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.3.a(boolean):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel.3.a(boolean):void, class status: UNLOADED
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
        if (PatchProxy.isSupport(new Object[]{"default", str, r4}, effectPlatform, EffectPlatform.f3091a, false, 38923, new Class[]{String.class, String.class, a.class}, Void.TYPE)) {
            EffectPlatform effectPlatform2 = effectPlatform;
            PatchProxy.accessDispatch(new Object[]{"default", str, r4}, effectPlatform2, EffectPlatform.f3091a, false, 38923, new Class[]{String.class, String.class, a.class}, Void.TYPE);
            return;
        }
        d dVar = effectPlatform.f3095e;
        if (PatchProxy.isSupport(new Object[]{"default", str, r4}, dVar, d.f43812a, false, 38956, new Class[]{String.class, String.class, a.class}, Void.TYPE)) {
            Object[] objArr = {"default", str, r4};
            d dVar2 = dVar;
            PatchProxy.accessDispatch(objArr, dVar2, d.f43812a, false, 38956, new Class[]{String.class, String.class, a.class}, Void.TYPE);
            return;
        }
        dVar.f43815c.a("default", str, (a) r4);
    }
}
