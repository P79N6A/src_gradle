package com.ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.medialib.jni.EffectThumb;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.tools.e;
import dmt.av.video.ah;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68820a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f68821b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68822c;

    /* renamed from: d  reason: collision with root package name */
    private final int f68823d;

    /* renamed from: e  reason: collision with root package name */
    private final EffectThumb f68824e;

    /* renamed from: f  reason: collision with root package name */
    private final String f68825f;
    private final IEffectService.OnVideoCoverCallback g;

    b(boolean z, String str, int i, EffectThumb effectThumb, String str2, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.f68821b = z;
        this.f68822c = str;
        this.f68823d = i;
        this.f68824e = effectThumb;
        this.f68825f = str2;
        this.g = onVideoCoverCallback;
    }

    public final Object call() {
        Bitmap bitmap;
        if (PatchProxy.isSupport(new Object[0], this, f68820a, false, 78187, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f68820a, false, 78187, new Class[0], Object.class);
        }
        boolean z = this.f68821b;
        String str = this.f68822c;
        int i = this.f68823d;
        EffectThumb effectThumb = this.f68824e;
        String str2 = this.f68825f;
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.g;
        int d2 = !z ? ah.d(str) + i : 0;
        CoverInfo thumb = effectThumb.getThumb(0);
        if (thumb == null || thumb.getData() == null) {
            bitmap = null;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Bitmap.Config.ARGB_8888);
            if (d2 > 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) d2);
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
            } else {
                bitmap = createBitmap;
            }
        }
        if (PatchProxy.isSupport(new Object[]{bitmap, str2}, null, a.f68815a, true, 78186, new Class[]{Bitmap.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, str2}, null, a.f68815a, true, 78186, new Class[]{Bitmap.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2) && bitmap != null) {
            e.a(bitmap, new File(str2), 60, Bitmap.CompressFormat.PNG);
        }
        a.b(new Runnable(onVideoCoverCallback, bitmap) {

            /* renamed from: a */
            public static ChangeQuickRedirect f68817a;

            /* renamed from: b */
            final /* synthetic */ IEffectService.OnVideoCoverCallback f68818b;

            /* renamed from: c */
            final /* synthetic */ Bitmap f68819c;

            public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.presenter.a.1.run():void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.presenter.a.1.run():void, class status: UNLOADED
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
        effectThumb.stopRender();
        return null;
    }
}
