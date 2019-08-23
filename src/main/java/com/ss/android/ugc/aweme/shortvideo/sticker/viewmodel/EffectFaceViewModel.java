package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.model.Face;
import com.ss.android.ugc.aweme.shortvideo.sticker.a.c;
import com.ss.android.ugc.aweme.utils.dd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EffectFaceViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70251a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<List<Face>> f70252b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<List<Face>> f70253c;

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Boolean> f70254d;

    /* renamed from: e  reason: collision with root package name */
    public c f70255e;

    /* renamed from: f  reason: collision with root package name */
    public HandlerThread f70256f = new HandlerThread("checkFaces");
    public Handler g;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70251a, false, 79894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70251a, false, 79894, new Class[0], Void.TYPE);
            return;
        }
        this.g.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70264a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f70264a, false, 79901, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70264a, false, 79901, new Class[0], Void.TYPE);
                    return;
                }
                c cVar = EffectFaceViewModel.this.f70255e;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f69262a, false, 79049, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar, c.f69262a, false, 79049, new Class[0], Void.TYPE);
                } else {
                    dd.a();
                    List<Face> b2 = cVar.f69266e.b();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet = new HashSet();
                    for (Face face : b2) {
                        if (!cVar.a(face)) {
                            arrayList.add(face);
                            hashSet.add(face.origin_path);
                        }
                    }
                    if (hashSet.size() > 0) {
                        cVar.f69266e.a(hashSet);
                        cVar.a(null, arrayList, cVar.f69264c);
                    }
                    if (arrayList.size() > 0 && arrayList.size() == b2.size()) {
                        if (PatchProxy.isSupport(new Object[0], cVar, c.f69262a, false, 79056, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], cVar, c.f69262a, false, 79056, new Class[0], Void.TYPE);
                        } else {
                            dd.a();
                            String json = a.f61120c.toJson((Object) new c.b(0, 0));
                            if (PatchProxy.isSupport(new Object[]{json}, cVar, c.f69262a, false, 79059, new Class[]{String.class}, Void.TYPE)) {
                                c cVar2 = cVar;
                                PatchProxy.accessDispatch(new Object[]{json}, cVar2, c.f69262a, false, 79059, new Class[]{String.class}, Void.TYPE);
                            } else {
                                a.L.a(e.a.FolderInfo, json);
                            }
                        }
                    }
                }
                EffectFaceViewModel.this.f70255e.a();
            }
        });
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f70251a, false, 79898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70251a, false, 79898, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        c cVar = this.f70255e;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f69262a, false, 79054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f69262a, false, 79054, new Class[0], Void.TYPE);
        } else if (cVar.f69267f != null) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a */
                public static ChangeQuickRedirect f69272a;

                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.a.c.3.run():void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.a.c.3.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
        }
        this.g.removeCallbacksAndMessages(null);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f70256f.quitSafely();
        } else {
            this.f70256f.quit();
        }
    }
}
