package com.ss.android.ugc.aweme.poi.ui.detail;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60705a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiDetailWithoutMapFragment f60706b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60707c;

    /* renamed from: d  reason: collision with root package name */
    private final int f60708d;

    d(PoiDetailWithoutMapFragment poiDetailWithoutMapFragment, boolean z, int i) {
        this.f60706b = poiDetailWithoutMapFragment;
        this.f60707c = z;
        this.f60708d = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60705a, false, 66376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60705a, false, 66376, new Class[0], Void.TYPE);
            return;
        }
        PoiDetailWithoutMapFragment poiDetailWithoutMapFragment = this.f60706b;
        boolean z = this.f60707c;
        int i = this.f60708d;
        if (z) {
            PoiDetailWithoutMapFragment.AnonymousClass3 r0 = new LinearSmoothScroller(poiDetailWithoutMapFragment.mRecyclerView.getContext()) {

                /* renamed from: a */
                public static ChangeQuickRedirect f60695a;

                public int calculateDtToFit(
/*
Method generation error in method: com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment.3.calculateDtToFit(int, int, int, int, int):int, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment.3.calculateDtToFit(int, int, int, int, int):int, class status: UNLOADED
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
            r0.setTargetPosition(i);
            poiDetailWithoutMapFragment.mRecyclerView.getLayoutManager().startSmoothScroll(r0);
            return;
        }
        ((LinearLayoutManager) poiDetailWithoutMapFragment.mRecyclerView.getLayoutManager()).scrollToPositionWithOffset(i, 0);
    }
}
