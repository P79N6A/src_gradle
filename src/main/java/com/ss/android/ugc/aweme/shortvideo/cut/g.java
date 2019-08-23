package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import android.net.Uri;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.view.ViewTreeObserver;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;

public final /* synthetic */ class g implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66405a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66406b;

    g(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66406b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66405a, false, 75446, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66405a, false, 75446, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66406b;
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75425, new Class[0], Void.TYPE);
            return;
        }
        h hVar = cutMultiVideoActivity.v.c().get(cutMultiVideoActivity.t);
        cutMultiVideoActivity.b(false);
        if (PatchProxy.isSupport(new Object[]{hVar}, cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75424, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75424, new Class[]{h.class}, Void.TYPE);
        } else {
            cutMultiVideoActivity.back.setVisibility(4);
            cutMultiVideoActivity.next.setVisibility(4);
            cutMultiVideoActivity.rotateBtn.setVisibility(0);
            cutMultiVideoActivity.deleteBtn.setVisibility(0);
            cutMultiVideoActivity.tvVideoSegDes.setVisibility(4);
            cutMultiVideoActivity.speedBtn.setVisibility((!cutMultiVideoActivity.J || !cutMultiVideoActivity.w.isSegMultiSpeedSupported(cutMultiVideoActivity.s)) ? 8 : 0);
            cutMultiVideoActivity.speedBtn.setChecked(cutMultiVideoActivity.n);
            if (cutMultiVideoActivity.f66141c != null) {
                cutMultiVideoActivity.f66141c.a(cutMultiVideoActivity.n ? 0 : 8);
                if (cutMultiVideoActivity.n) {
                    cutMultiVideoActivity.f66141c.a(ak.a(hVar.f66499f));
                }
            }
            if (cutMultiVideoActivity.animDot != null) {
                cutMultiVideoActivity.animDot.setVisibility(4);
            }
            cutMultiVideoActivity.editVideoCover.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(cutMultiVideoActivity.editVideoCover.getController())).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + hVar.f66495b)).setResizeOptions(new ResizeOptions(u.a(50.0d), u.a(50.0d))).build())).build());
        }
        float d2 = hVar.f66499f * cutMultiVideoActivity.v.d();
        cutMultiVideoActivity.w.select(cutMultiVideoActivity.s);
        cutMultiVideoActivity.w.setSegSpeed(cutMultiVideoActivity.s, (double) d2);
        cutMultiVideoActivity.w.setLoop(true);
        Pair<Long, Long> singleVideoPlayBoundary = cutMultiVideoActivity.videoEditView.getSingleVideoPlayBoundary();
        cutMultiVideoActivity.w.setSegBoundary(cutMultiVideoActivity.s, ((Long) singleVideoPlayBoundary.first).longValue(), ((Long) singleVideoPlayBoundary.second).longValue());
        cutMultiVideoActivity.w.seek(hVar.f66497d);
        if (PatchProxy.isSupport(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cutMultiVideoActivity, CutMultiVideoActivity.f66139a, false, 75428, new Class[0], Void.TYPE);
            return;
        }
        cutMultiVideoActivity.i = 1.0f;
        cutMultiVideoActivity.g = 0.0f;
        cutMultiVideoActivity.h = 0.0f;
        cutMultiVideoActivity.j = null;
        cutMultiVideoActivity.k = null;
        cutMultiVideoActivity.l = null;
        cutMultiVideoActivity.j = cutMultiVideoActivity.f66144f.b(cutMultiVideoActivity.videoRecyclerView, cutMultiVideoActivity.s);
        if (cutMultiVideoActivity.j != null) {
            if (ViewCompat.getLayoutDirection(cutMultiVideoActivity.videoRecyclerView) != 1) {
                z = false;
            }
            cutMultiVideoActivity.singleEditLayout.setVisibility(0);
            cutMultiVideoActivity.saveIcon.setVisibility(8);
            cutMultiVideoActivity.cancelIcon.setVisibility(8);
            cutMultiVideoActivity.flVideoCover.setVisibility(4);
            cutMultiVideoActivity.flVideoCover.getRootView().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(z) {

                /* renamed from: a */
                public static ChangeQuickRedirect f66170a;

                /* renamed from: b */
                final /* synthetic */ boolean f66171b;

                public final boolean onPreDraw(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity.8.onPreDraw():boolean, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoActivity.8.onPreDraw():boolean, class status: UNLOADED
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
        }
    }
}
