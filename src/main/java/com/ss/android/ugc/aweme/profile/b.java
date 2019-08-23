package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.profile.a;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61342a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f61343b;

    /* renamed from: c  reason: collision with root package name */
    private final VerticalViewPager f61344c;

    /* renamed from: d  reason: collision with root package name */
    private final View f61345d;

    /* renamed from: e  reason: collision with root package name */
    private final int f61346e;

    /* renamed from: f  reason: collision with root package name */
    private final a.b f61347f;

    b(Activity activity, VerticalViewPager verticalViewPager, View view, int i, a.b bVar) {
        this.f61343b = activity;
        this.f61344c = verticalViewPager;
        this.f61345d = view;
        this.f61346e = i;
        this.f61347f = bVar;
    }

    public final void run() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f61342a, false, 67229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61342a, false, 67229, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.f61343b;
        VerticalViewPager verticalViewPager = this.f61344c;
        View view = this.f61345d;
        int i2 = this.f61346e;
        a.b bVar = this.f61347f;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception unused) {
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            int i3 = displayMetrics.heightPixels;
            int i4 = displayMetrics.widthPixels;
            boolean z = ToolUtils.isMiui() && a.a(activity);
            if (z) {
                i = 0;
            } else {
                i = a.c();
            }
            a.AnonymousClass1 r8 = new Runnable(activity, verticalViewPager, view, a.b(activity), i3, i4, i, a.c(activity), i2, z, bVar) {

                /* renamed from: a */
                public static ChangeQuickRedirect f61221a;

                /* renamed from: b */
                final /* synthetic */ Activity f61222b;

                /* renamed from: c */
                final /* synthetic */ VerticalViewPager f61223c;

                /* renamed from: d */
                final /* synthetic */ View f61224d;

                /* renamed from: e */
                final /* synthetic */ boolean f61225e;

                /* renamed from: f */
                final /* synthetic */ int f61226f;
                final /* synthetic */ int g;
                final /* synthetic */ int h;
                final /* synthetic */ int i;
                final /* synthetic */ int j;
                final /* synthetic */ boolean k;
                final /* synthetic */ b l;

                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.profile.a.1.run():void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.profile.a.1.run():void, class status: UNLOADED
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
            com.ss.android.b.a.a.a.b(r8);
        }
    }
}
