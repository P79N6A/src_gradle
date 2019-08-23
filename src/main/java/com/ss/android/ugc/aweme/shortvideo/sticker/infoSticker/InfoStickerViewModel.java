package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.b.l;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import java.util.List;

public class InfoStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69782a;

    /* renamed from: b  reason: collision with root package name */
    public InfoStickerRepository f69783b;

    /* renamed from: c  reason: collision with root package name */
    public int f69784c;

    /* renamed from: d  reason: collision with root package name */
    public cb f69785d;

    /* renamed from: e  reason: collision with root package name */
    public LiveData<a<CategoryPageModel>> f69786e;

    /* renamed from: f  reason: collision with root package name */
    private MutableLiveData<Effect> f69787f;
    private LiveData<a<EffectChannelResponse>> g;
    private LiveData<a<PanelInfoModel>> h;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69782a, false, 79392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69782a, false, 79392, new Class[0], Void.TYPE);
            return;
        }
        this.f69783b.a();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69782a, false, 79393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69782a, false, 79393, new Class[0], Void.TYPE);
            return;
        }
        a(false);
    }

    public final MutableLiveData<Effect> c() {
        if (PatchProxy.isSupport(new Object[0], this, f69782a, false, 79395, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f69782a, false, 79395, new Class[0], MutableLiveData.class);
        }
        if (this.f69787f == null) {
            this.f69787f = new MutableLiveData<>();
        }
        return this.f69787f;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f69782a, false, 79397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69782a, false, 79397, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
    }

    public InfoStickerViewModel(InfoStickerRepository infoStickerRepository) {
        this.f69783b = infoStickerRepository;
    }

    public final LiveData<a<EffectChannelResponse>> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69782a, false, 79383, new Class[]{String.class}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str}, this, f69782a, false, 79383, new Class[]{String.class}, LiveData.class);
        }
        if (this.g == null || ((a) this.g.getValue()).f76550c == a.C0799a.ERROR) {
            this.g = this.f69783b.a(str);
        }
        return this.g;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69782a, false, 79394, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69782a, false, 79394, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f69783b.a(z);
    }

    public final void a(List<Effect> list, boolean z) {
        List<Effect> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69782a, false, 79390, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f69782a, false, 79390, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (!list.isEmpty()) {
            this.f69783b.a(list2, z);
        }
    }

    public final LiveData<a<ProviderEffectModel>> a(@Nullable String str, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), 30}, this, f69782a, false, 79387, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), 30}, this, f69782a, false, 79387, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, LiveData.class);
        }
        InfoStickerRepository infoStickerRepository = this.f69783b;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), 30}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79318, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), 30}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79318, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, LiveData.class);
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(a.a(a.C0799a.LOADING, null));
        infoStickerRepository.f69729b.a(str, false, i, 30, (l) new l(mutableLiveData) {

            /* renamed from: a */
            public static ChangeQuickRedirect f69764a;

            /* renamed from: b */
            final /* synthetic */ MutableLiveData f69765b;

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.9.a(com.ss.android.ugc.effectmanager.common.e.c):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.9.a(com.ss.android.ugc.effectmanager.common.e.c):void, class status: UNLOADED
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
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.9.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.9.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel):void, class status: UNLOADED
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
        return mutableLiveData;
    }

    public final LiveData<a<PanelInfoModel>> a(String str, String str2, int i, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, 75, 0}, this, f69782a, false, 79385, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str3, str4, 75, 0}, this, f69782a, false, 79385, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class);
        }
        if (this.h == null || ((a) this.h.getValue()).f76550c == a.C0799a.ERROR) {
            this.h = this.f69783b.a(str3, str4, 75, 0);
        }
        return this.h;
    }

    public final LiveData<a<ProviderEffectModel>> b(@NonNull String str, @Nullable String str2, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), 30}, this, f69782a, false, 79388, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i), 30}, this, f69782a, false, 79388, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class);
        }
        InfoStickerRepository infoStickerRepository = this.f69783b;
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), 30}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79319, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i), 30}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79319, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE}, LiveData.class);
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(a.a(a.C0799a.LOADING, null));
        infoStickerRepository.f69729b.a(str, str2, i, 30, (l) new l(mutableLiveData) {

            /* renamed from: a */
            public static ChangeQuickRedirect f69737a;

            /* renamed from: b */
            final /* synthetic */ MutableLiveData f69738b;

            public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.10.a(com.ss.android.ugc.effectmanager.common.e.c):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.10.a(com.ss.android.ugc.effectmanager.common.e.c):void, class status: UNLOADED
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
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.10.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository.10.a(com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel):void, class status: UNLOADED
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
        return mutableLiveData;
    }
}
