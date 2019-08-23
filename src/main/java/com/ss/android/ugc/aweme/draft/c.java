package com.ss.android.ugc.aweme.draft;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.ej;
import java.io.File;
import org.json.JSONObject;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43472a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeDraftViewHolder f43473b;

    c(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f43473b = awemeDraftViewHolder;
    }

    public final void onClick(View view) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, f43472a, false, 38382, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43472a, false, 38382, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AwemeDraftViewHolder awemeDraftViewHolder = this.f43473b;
        if (PatchProxy.isSupport(new Object[]{view}, awemeDraftViewHolder, AwemeDraftViewHolder.f3080a, false, 38379, new Class[]{View.class}, Void.TYPE)) {
            AwemeDraftViewHolder awemeDraftViewHolder2 = awemeDraftViewHolder;
            PatchProxy.accessDispatch(new Object[]{view}, awemeDraftViewHolder2, AwemeDraftViewHolder.f3080a, false, 38379, new Class[]{View.class}, Void.TYPE);
        } else if (awemeDraftViewHolder.r) {
            awemeDraftViewHolder.m.setChecked(true ^ ((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).w);
        } else {
            if (ej.a().a(view.getContext()) && awemeDraftViewHolder.g != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - awemeDraftViewHolder.v >= 500) {
                    awemeDraftViewHolder.v = currentTimeMillis;
                    com.ss.android.ugc.aweme.draft.a.c cVar = (com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g;
                    if (PatchProxy.isSupport(new Object[]{cVar}, null, AwemeDraftViewHolder.f3080a, true, 38366, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[]{cVar}, null, AwemeDraftViewHolder.f3080a, true, 38366, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Integer.TYPE)).intValue();
                    } else {
                        if (cVar.L != 2) {
                            File file = new File(cVar.f());
                            if (!file.exists()) {
                                i = -1;
                            } else if (file.length() == 0) {
                                i = -9;
                            } else if (!TextUtils.isEmpty(cVar.h) && !new File(cVar.h).exists()) {
                                i = -2;
                            }
                        }
                        i = 0;
                    }
                    n.a("aweme_draft_invalid", i, (JSONObject) null);
                    com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a("validity", String.valueOf(i)).a("is_fast_import", Boolean.valueOf(((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).M())).a("videoPath", new File(((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).f()).getPath());
                    if (((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).I() || i == 0 || i == -2) {
                        n.a("aweme_draft_load_fail_rate", 0, a2.b());
                        awemeDraftViewHolder.u = com.ss.android.ugc.aweme.shortvideo.view.c.a(awemeDraftViewHolder.t, awemeDraftViewHolder.t.getString(C0906R.string.f4484cat));
                        e eVar = ((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).f43438f;
                        if (eVar == null || ((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).s() == 1) {
                            if (awemeDraftViewHolder.u != null) {
                                awemeDraftViewHolder.u.dismiss();
                            }
                            awemeDraftViewHolder.b();
                        } else if (TextUtils.isEmpty(eVar.getMusicId()) || !TextUtils.isEmpty(eVar.getName())) {
                            com.ss.android.ugc.aweme.util.c.a("editDraft() musicModel path = [" + a.f61120c.toJson((Object) eVar) + "]");
                            if (!((((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).Q == null && ((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).v() == null) || ((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).h == null)) {
                                File file2 = new File(((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).h);
                                if (file2.exists() && file2.length() > 0) {
                                    awemeDraftViewHolder.b();
                                    return;
                                }
                            }
                            if (eVar.getPath() == null) {
                                com.bytedance.ies.dmt.ui.d.a.b(awemeDraftViewHolder.t, awemeDraftViewHolder.t.getApplicationContext().getString(C0906R.string.bel)).a();
                                if (awemeDraftViewHolder.u != null) {
                                    awemeDraftViewHolder.u.dismiss();
                                }
                                return;
                            } else if (eVar.getPath().startsWith("http")) {
                                String a3 = com.ss.android.ugc.b.c.a().a(eVar.getPath());
                                Context context = awemeDraftViewHolder.t;
                                AwemeDraftViewHolder.AnonymousClass4 r7 = new AwemeDraftViewHolder.a(awemeDraftViewHolder.u, a3) {

                                    /* renamed from: a */
                                    public static ChangeQuickRedirect f43390a;

                                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder.4.a(java.lang.String, int, java.lang.String, float[]):void, dex: classes4.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder.4.a(java.lang.String, int, java.lang.String, float[]):void, class status: UNLOADED
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
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                                };
                                if (PatchProxy.isSupport(new Object[]{context, eVar, r7}, awemeDraftViewHolder, AwemeDraftViewHolder.f3080a, false, 38376, new Class[]{Context.class, e.class, AwemeDraftViewHolder.a.class}, Void.TYPE)) {
                                    AwemeDraftViewHolder awemeDraftViewHolder3 = awemeDraftViewHolder;
                                    PatchProxy.accessDispatch(new Object[]{context, eVar, r7}, awemeDraftViewHolder3, AwemeDraftViewHolder.f3080a, false, 38376, new Class[]{Context.class, e.class, AwemeDraftViewHolder.a.class}, Void.TYPE);
                                } else if (context == null || eVar.getMusicStatus() != 0) {
                                    a.i.a(eVar, (a.h) r7);
                                } else {
                                    String offlineDesc = eVar.getOfflineDesc();
                                    if (TextUtils.isEmpty(offlineDesc)) {
                                        offlineDesc = context.getApplicationContext().getString(C0906R.string.bel);
                                    }
                                    com.bytedance.ies.dmt.ui.d.a.b(context, offlineDesc).a();
                                    if (awemeDraftViewHolder.u != null) {
                                        awemeDraftViewHolder.u.dismiss();
                                    }
                                }
                            } else {
                                ((com.ss.android.ugc.aweme.draft.a.c) awemeDraftViewHolder.g).h = eVar.getPath();
                                awemeDraftViewHolder.b();
                                return;
                            }
                        } else {
                            com.ss.android.ugc.aweme.port.in.a.i.a(eVar.getMusicId(), (z) new z() {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f43388a;

                                public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder.3.a(java.lang.Exception):void, dex: classes4.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder.3.a(java.lang.Exception):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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

                                public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder.3.a(com.ss.android.ugc.aweme.shortvideo.e):void, dex: classes4.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.draft.AwemeDraftViewHolder.3.a(com.ss.android.ugc.aweme.shortvideo.e):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                        com.ss.android.ugc.aweme.util.c.a("editDraft() called with: view = [" + awemeDraftViewHolder.g + "]");
                        r.onEvent(MobClick.obtain().setEventName("click_edit_image").setLabelName("draft_page"));
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b(awemeDraftViewHolder.t, (int) C0906R.string.b20).a();
                        n.a("aweme_draft_load_fail_rate", 1, a2.b());
                    }
                }
            }
        }
    }
}
