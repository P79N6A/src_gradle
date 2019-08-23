package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.FilterDialog;
import com.ss.android.ugc.aweme.filter.aw;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.shortvideo.edit.o;

public final class m implements o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67458a;

    /* renamed from: b  reason: collision with root package name */
    public h f67459b;

    /* renamed from: c  reason: collision with root package name */
    public o.a f67460c;

    /* renamed from: d  reason: collision with root package name */
    MutableLiveData<h> f67461d = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f67462e;

    /* renamed from: f  reason: collision with root package name */
    private final cb f67463f;
    private Activity g;
    private boolean h;

    public final void a() {
        FilterDialog filterDialog;
        if (PatchProxy.isSupport(new Object[0], this, f67458a, false, 76275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67458a, false, 76275, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.g;
        h hVar = this.f67459b;
        AnonymousClass1 r2 = new aw() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67464a;

            public final void a(h hVar) {
                if (PatchProxy.isSupport(new Object[]{hVar}, this, f67464a, false, 76276, new Class[]{h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar}, this, f67464a, false, 76276, new Class[]{h.class}, Void.TYPE);
                    return;
                }
                m.this.f67459b = hVar;
                if (m.this.f67460c != null) {
                    m.this.f67460c.a(hVar);
                }
            }
        };
        AnonymousClass2 r3 = new DialogInterface.OnDismissListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67466a;

            public final void onDismiss(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f67466a, false, 76277, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f67466a, false, 76277, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                if (m.this.f67460c != null) {
                    m.this.f67460c.a();
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{activity, hVar, r2, r3}, null, FilterDialog.f47382c, true, 44199, new Class[]{Context.class, h.class, aw.class, DialogInterface.OnDismissListener.class}, FilterDialog.class)) {
            Object[] objArr = {activity, hVar, r2, r3};
            Object[] objArr2 = objArr;
            filterDialog = (FilterDialog) PatchProxy.accessDispatch(objArr2, null, FilterDialog.f47382c, true, 44199, new Class[]{Context.class, h.class, aw.class, DialogInterface.OnDismissListener.class}, FilterDialog.class);
        } else {
            FilterDialog filterDialog2 = new FilterDialog(activity);
            filterDialog2.g = hVar;
            if (PatchProxy.isSupport(new Object[]{r2}, filterDialog2, FilterDialog.f47382c, false, 44219, new Class[]{aw.class}, Void.TYPE)) {
                Object[] objArr3 = {r2};
                FilterDialog filterDialog3 = filterDialog2;
                PatchProxy.accessDispatch(objArr3, filterDialog3, FilterDialog.f47382c, false, 44219, new Class[]{aw.class}, Void.TYPE);
            } else {
                filterDialog2.r = r2;
                if (filterDialog2.f47384e != null) {
                    filterDialog2.f47384e.f47342e = new aw(r2) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f47388a;

                        /* renamed from: b */
                        final /* synthetic */ aw f47389b;

                        public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.filter.FilterDialog.10.a(com.ss.android.ugc.aweme.filter.h):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.filter.FilterDialog.10.a(com.ss.android.ugc.aweme.filter.h):void, class status: UNLOADED
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
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                    };
                }
            }
            filterDialog2.setOnDismissListener(r3);
            filterDialog = filterDialog2;
        }
        filterDialog.a(this.f67462e, this.f67461d);
        cg.a((Dialog) filterDialog);
    }

    public final void a(h hVar) {
        this.f67459b = hVar;
    }

    public final void b(boolean z) {
        this.h = true;
    }

    public final void a(o.a aVar) {
        this.f67460c = aVar;
    }

    public final void a(boolean z) {
        this.f67462e = true;
    }

    public m(Activity activity, h hVar, @NonNull cb cbVar) {
        this.g = activity;
        this.f67459b = hVar;
        this.f67463f = cbVar;
    }
}
