package com.ss.android.ugc.aweme.qrcode.d;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.miniapp_api.model.j;
import com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity;
import com.ss.android.ugc.aweme.qrcode.b.c;
import com.ss.android.ugc.aweme.qrcode.d.d;
import com.ss.android.ugc.aweme.qrcode.d.m;
import com.ss.android.ugc.aweme.qrcode.e.b;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.u.af;
import com.ss.android.ugc.aweme.util.g;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class f implements d.a, m.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63407a;

    /* renamed from: b  reason: collision with root package name */
    public AmeSSActivity f63408b;

    /* renamed from: c  reason: collision with root package name */
    public m.a f63409c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f63410d;

    /* renamed from: e  reason: collision with root package name */
    public String f63411e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f63412f;
    public boolean g;
    public boolean h;
    public List<c> i;
    public List<c> j;
    private d k;
    private com.ss.android.ugc.aweme.qrcode.f l = new com.ss.android.ugc.aweme.qrcode.f();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final CouponRedeemApi.b f63429a;

        /* renamed from: b  reason: collision with root package name */
        public final String f63430b;

        a(CouponRedeemApi.b bVar, String str) {
            this.f63429a = bVar;
            this.f63430b = str;
        }
    }

    public final long a() {
        return 65536;
    }

    public final void a(int i2, int i3, Intent intent) {
    }

    public final boolean a(Context context, String str, int i2, int i3) {
        String str2;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63407a, false, 70457, new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63407a, false, 70457, new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{str}, this, f63407a, false, 70458, new Class[]{String.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{str}, this, f63407a, false, 70458, new Class[]{String.class}, String.class);
        } else {
            str2 = com.ss.android.ugc.aweme.share.a.f.c(str);
        }
        if (TimeLockRuler.isTeenModeON() && !ParentalPlatformManager.f2599b.a(str2)) {
            com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.chz).a();
            return true;
        } else if (b.b(str2)) {
            for (c next : this.i) {
                if (next.a(str2, i4)) {
                    this.f63411e = next.a();
                    return true;
                }
            }
            this.f63411e = "web";
            if (this.k == null) {
                this.k = new d(this);
            }
            d dVar = this.k;
            AmeSSActivity ameSSActivity = this.f63408b;
            Object[] objArr = {ameSSActivity, str2, Integer.valueOf(i2)};
            if (PatchProxy.isSupport(objArr, dVar, d.f63398a, false, 70439, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr2 = {ameSSActivity, str2, Integer.valueOf(i2)};
                Object[] objArr3 = objArr2;
                d dVar2 = dVar;
                PatchProxy.accessDispatch(objArr3, dVar2, d.f63398a, false, 70439, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str2)) {
                if (dVar.f63400c != null) {
                    dVar.f63400c.a();
                    dVar.f63400c = null;
                }
                dVar.f63400c = new k(new com.ss.android.ugc.aweme.qrcode.c.d(), new b(ameSSActivity, str2, i2) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f63401a;

                    /* renamed from: b */
                    final /* synthetic */ Context f63402b;

                    /* renamed from: c */
                    final /* synthetic */ String f63403c;

                    /* renamed from: d */
                    final /* synthetic */ int f63404d;

                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.qrcode.d.d.1.a(java.lang.Exception):void, dex: classes5.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.qrcode.d.d.1.a(java.lang.Exception):void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
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
Method generation error in method: com.ss.android.ugc.aweme.qrcode.d.d.1.a(com.ss.android.ugc.aweme.qrcode.c.c):void, dex: classes5.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.qrcode.d.d.1.a(com.ss.android.ugc.aweme.qrcode.c.c):void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
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
                dVar.f63400c.a(str2);
            }
            return true;
        } else {
            for (c next2 : this.j) {
                if (next2.a(str2, i4)) {
                    this.f63411e = next2.a();
                    return true;
                }
            }
            AmeSSActivity ameSSActivity2 = this.f63408b;
            if (PatchProxy.isSupport(new Object[]{ameSSActivity2, str2}, null, TextQRCodeActivity.f63324a, true, 70382, new Class[]{Context.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ameSSActivity2, str2}, null, TextQRCodeActivity.f63324a, true, 70382, new Class[]{Context.class, String.class}, Void.TYPE);
            } else {
                Intent intent = new Intent(ameSSActivity2, TextQRCodeActivity.class);
                intent.putExtra("intent_extra_content", str2);
                ameSSActivity2.startActivity(intent);
            }
            this.f63411e = "text";
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0437, code lost:
        a("enter_tag_detail", r7.f63410d, "tag_id", r9);
        com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity.a(r8, r9, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0444, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0339, code lost:
        if (com.ss.android.g.a.a() == false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x033b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x033c, code lost:
        com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity.a(r8, r9, r14, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x033f, code lost:
        return r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r24, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r26
            r10 = r27
            r14 = r28
            r11 = 6
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r15 = 1
            r0[r15] = r1
            r13 = 2
            r0[r13] = r9
            r6 = 3
            r0[r6] = r10
            r5 = 4
            r0[r5] = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r16 = 5
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f63407a
            java.lang.Class[] r4 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r4[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r4[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r4[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r4[r6] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r4[r5] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r4[r16] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r3 = 0
            r18 = 70461(0x1133d, float:9.8737E-41)
            r1 = r23
            r19 = r4
            r4 = r18
            r5 = r19
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a6
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r15] = r1
            r0[r13] = r9
            r1 = 3
            r0[r1] = r10
            r2 = 4
            r0[r2] = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r29)
            r0[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = f63407a
            r4 = 0
            r5 = 70461(0x1133d, float:9.8737E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r6[r12] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r6[r15] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r13] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r1] = r8
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r6[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r16] = r1
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r1 = r23
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00a6:
            r1 = 3
            r2 = 4
            java.lang.String r0 = ""
            boolean r3 = android.text.TextUtils.isEmpty(r27)
            if (r3 != 0) goto L_0x00c9
            android.net.Uri r3 = android.net.Uri.parse(r27)
            if (r3 == 0) goto L_0x00c9
            java.lang.String r0 = "sec_uid"
            java.lang.String r0 = r3.getQueryParameter(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x00c9
            com.ss.android.ugc.aweme.utils.dr r3 = com.ss.android.ugc.aweme.utils.dr.a()
            r3.a((java.lang.String) r9, (java.lang.String) r0)
        L_0x00c9:
            boolean r3 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r3 == 0) goto L_0x00d0
            return r12
        L_0x00d0:
            r3 = 0
            switch(r25) {
                case 1: goto L_0x0445;
                case 2: goto L_0x0437;
                case 3: goto L_0x0429;
                case 4: goto L_0x041b;
                case 5: goto L_0x03e3;
                case 6: goto L_0x00d4;
                case 7: goto L_0x0395;
                case 8: goto L_0x0390;
                case 9: goto L_0x0340;
                case 10: goto L_0x0260;
                case 11: goto L_0x00d4;
                case 12: goto L_0x00d4;
                case 13: goto L_0x00d4;
                case 14: goto L_0x00d4;
                case 15: goto L_0x00d4;
                case 16: goto L_0x0252;
                case 17: goto L_0x0245;
                case 18: goto L_0x00d4;
                case 19: goto L_0x0242;
                case 20: goto L_0x0163;
                case 21: goto L_0x00da;
                case 22: goto L_0x00d4;
                case 23: goto L_0x00d5;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            return r12
        L_0x00d5:
            com.ss.android.ugc.aweme.commercialize.utils.r.a((java.lang.String) r26)
            goto L_0x0437
        L_0x00da:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x00e1
            return r12
        L_0x00e1:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r12] = r0
            r3[r15] = r9
            r3[r13] = r14
            r3[r1] = r10
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.share.x.f65321a
            r19 = 1
            r20 = 73003(0x11d2b, float:1.02299E-40)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r4[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r15] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r13] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r3
            r21 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r3 == 0) goto L_0x014a
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r12] = r0
            r3[r15] = r9
            r3[r13] = r14
            r3[r1] = r10
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.share.x.f65321a
            r19 = 1
            r20 = 73003(0x11d2b, float:1.02299E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r0[r12] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r15] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r13] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r3
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x014a:
            boolean r1 = android.text.TextUtils.isEmpty(r26)
            if (r1 == 0) goto L_0x0151
            return r12
        L_0x0151:
            java.lang.String r1 = "sec_uid"
            java.lang.String r2 = com.ss.android.ugc.aweme.ag.k.b(r10, r1)
            java.lang.String r3 = ""
            java.lang.String r5 = ""
            r1 = r26
            r4 = r28
            com.ss.android.ugc.aweme.commerce.a.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5)
            return r15
        L_0x0163:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x016a
            return r12
        L_0x016a:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r8 = r7.f63408b
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r12] = r8
            r0[r15] = r9
            r0[r13] = r14
            r0[r1] = r10
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.share.x.f65321a
            r19 = 1
            r20 = 73002(0x11d2a, float:1.02298E-40)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r4[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r15] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r13] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r0
            r21 = r4
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x01d3
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r12] = r8
            r0[r15] = r9
            r0[r13] = r14
            r0[r1] = r10
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.share.x.f65321a
            r19 = 1
            r20 = 73002(0x11d2a, float:1.02298E-40)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r2[r12] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r15] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r13] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r1] = r3
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r0
            r21 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x01d3:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r12] = r9
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.share.x.f65321a
            r19 = 1
            r20 = 73005(0x11d2d, float:1.02302E-40)
            java.lang.Class[] r4 = new java.lang.Class[r15]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r12] = r5
            java.lang.Class<java.lang.String[]> r22 = java.lang.String[].class
            r16 = r0
            r21 = r4
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x0213
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r12] = r9
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.share.x.f65321a
            r19 = 1
            r20 = 73005(0x11d2d, float:1.02302E-40)
            java.lang.Class[] r3 = new java.lang.Class[r15]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r12] = r4
            java.lang.Class<java.lang.String[]> r22 = java.lang.String[].class
            r16 = r0
            r21 = r3
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3
            goto L_0x0220
        L_0x0213:
            boolean r0 = android.text.TextUtils.isEmpty(r26)
            if (r0 == 0) goto L_0x021a
            goto L_0x0220
        L_0x021a:
            java.lang.String r0 = "_"
            java.lang.String[] r3 = r9.split(r0)
        L_0x0220:
            if (r3 == 0) goto L_0x0241
            int r0 = r3.length
            if (r0 == r2) goto L_0x0226
            goto L_0x0241
        L_0x0226:
            java.lang.String r0 = "sec_uid"
            java.lang.String r0 = com.ss.android.ugc.aweme.ag.k.b(r10, r0)
            r9 = r3[r15]
            r10 = r3[r13]
            r11 = r3[r12]
            r13 = r3[r1]
            java.lang.String r1 = ""
            java.lang.String r16 = ""
            r12 = r0
            r14 = r28
            r4 = 1
            r15 = r1
            com.ss.android.ugc.aweme.commerce.a.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r4
        L_0x0241:
            return r12
        L_0x0242:
            r4 = 1
            goto L_0x0335
        L_0x0245:
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]
            r0[r12] = r9
            java.util.ArrayList r0 = com.google.common.collect.az.a((E[]) r0)
            com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.a(r8, r0)
            return r4
        L_0x0252:
            r4 = 1
            java.lang.String r1 = "enter_personal_detail"
            boolean r2 = r7.f63410d
            java.lang.String r3 = "user_id"
            r7.a((java.lang.String) r1, (boolean) r2, (java.lang.String) r3, (java.lang.String) r9)
            com.ss.android.ugc.aweme.profile.ui.UserProfileActivity.a((android.content.Context) r8, (java.lang.String) r9, (java.lang.String) r0, (java.lang.String) r14)
            return r4
        L_0x0260:
            r4 = 1
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = "id"
            java.lang.String r0 = com.ss.android.ugc.aweme.ag.k.b(r10, r0)
            java.lang.String r2 = "edition_uid"
            java.lang.String r2 = com.ss.android.ugc.aweme.ag.k.b(r10, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x027a
            return r12
        L_0x027a:
            boolean r3 = com.ss.android.ugc.aweme.discover.helper.d.a()
            if (r3 != 0) goto L_0x02cf
            r7.g = r4
            int r0 = java.lang.Integer.parseInt(r0)
            switch(r0) {
                case 0: goto L_0x02c2;
                case 1: goto L_0x02b5;
                case 2: goto L_0x02a7;
                case 3: goto L_0x0299;
                case 4: goto L_0x028b;
                default: goto L_0x0289;
            }
        L_0x0289:
            goto L_0x0334
        L_0x028b:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            r1 = 2131563050(0x7f0d122a, float:1.8751546E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x0334
        L_0x0299:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            r1 = 2131563049(0x7f0d1229, float:1.8751544E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x0334
        L_0x02a7:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            r1 = 2131563047(0x7f0d1227, float:1.875154E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x0334
        L_0x02b5:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            r1 = 2131563051(0x7f0d122b, float:1.8751548E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x0334
        L_0x02c2:
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            r1 = 2131563052(0x7f0d122c, float:1.875155E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x0334
        L_0x02cf:
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r14[r12] = r8
            r14[r4] = r0
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.hotsearch.RankingListActivity.f3354a
            r17 = 1
            r18 = 49510(0xc166, float:6.9378E-41)
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r3[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r13] = r5
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x031d
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r14[r12] = r8
            r14[r4] = r0
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.hotsearch.RankingListActivity.f3354a
            r17 = 1
            r18 = 49510(0xc166, float:6.9378E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r4] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0334
        L_0x031d:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.Class<com.ss.android.ugc.aweme.hotsearch.RankingListActivity> r3 = com.ss.android.ugc.aweme.hotsearch.RankingListActivity.class
            r1.setClass(r8, r3)
            java.lang.String r3 = "type"
            r1.putExtra(r3, r0)
            java.lang.String r0 = "edition_uid"
            r1.putExtra(r0, r2)
            r8.startActivity(r1)
        L_0x0334:
            return r4
        L_0x0335:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x033c
            return r12
        L_0x033c:
            com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity.a(r8, r9, r14, r3, r12)
            return r4
        L_0x0340:
            r4 = 1
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.publish.IPublishService r0 = r0.getPublishService()
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r7.f63408b
            boolean r0 = r0.checkIsAlreadyPublished(r1)
            if (r0 != 0) goto L_0x0367
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            r1 = 2131558602(0x7f0d00ca, float:1.8742524E38)
            com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r0, (int) r1)
            com.ss.android.ugc.aweme.qrcode.d.m$a r0 = r7.f63409c
            r0.ae_()
            return r4
        L_0x0367:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            if (r0 == 0) goto L_0x037f
            boolean r0 = r0.needLoginBeforeRecord()
            if (r0 != 0) goto L_0x037f
            r7.a(r9)
            goto L_0x038f
        L_0x037f:
            r7.f63412f = r4
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            java.lang.String r1 = "scan"
            java.lang.String r2 = "click_my_qr"
            com.ss.android.ugc.aweme.qrcode.d.f$5 r5 = new com.ss.android.ugc.aweme.qrcode.d.f$5
            r5.<init>(r9)
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.ss.android.ugc.aweme.base.component.f) r5)
        L_0x038f:
            return r4
        L_0x0390:
            r4 = 1
            com.ss.android.ugc.aweme.music.ui.MusicDetailActivity.a(r8, r9, r14)
            return r4
        L_0x0395:
            r4 = 1
            java.lang.String r0 = "preview"
            java.lang.String r0 = com.ss.android.ugc.aweme.ag.k.b(r10, r0)
            java.lang.String r1 = "card_source"
            java.lang.String r1 = com.ss.android.ugc.aweme.ag.k.b(r10, r1)
            java.lang.String r2 = "challenge_id"
            java.lang.String r2 = com.ss.android.ugc.aweme.ag.k.b(r10, r2)
            java.lang.String r3 = "sticker_id"
            java.lang.String r3 = com.ss.android.ugc.aweme.ag.k.b(r10, r3)
            com.ss.android.ugc.aweme.poi.model.l$a r5 = new com.ss.android.ugc.aweme.poi.model.l$a
            r5.<init>()
            com.ss.android.ugc.aweme.poi.model.l$a r5 = r5.c(r9)
            java.lang.String r6 = ""
            com.ss.android.ugc.aweme.poi.model.l$a r5 = r5.g(r6)
            java.lang.String r6 = "1"
            boolean r0 = r6.equalsIgnoreCase(r0)
            r5.f59932b = r0
            com.ss.android.ugc.aweme.poi.model.l$a r0 = r5.i(r14)
            java.lang.String r5 = "scan_activity_poi"
            com.ss.android.ugc.aweme.poi.model.l$a r0 = r0.l(r5)
            java.lang.String r5 = "1"
            boolean r1 = r5.equalsIgnoreCase(r1)
            r0.p = r1
            r0.q = r2
            r0.r = r3
            com.ss.android.ugc.aweme.poi.model.l r0 = r0.a()
            com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity.a(r8, r0)
            return r4
        L_0x03e3:
            r4 = 1
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x03fb
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r7.f63408b
            r1 = 2131564521(0x7f0d17e9, float:1.875453E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1, (int) r12)
            r0.a()
            return r4
        L_0x03fb:
            com.ss.android.ugc.aweme.profile.model.User r0 = new com.ss.android.ugc.aweme.profile.model.User
            r0.<init>()
            long r5 = java.lang.Long.parseLong(r26)
            r0.roomId = r5
            com.ss.android.ugc.aweme.story.live.c r1 = com.ss.android.ugc.aweme.story.live.c.a()
            com.ss.android.ugc.aweme.story.live.c$a r3 = new com.ss.android.ugc.aweme.story.live.c$a
            r3.<init>(r8, r0)
            com.ss.android.ugc.aweme.story.live.c$a r0 = r3.b(r14)
            com.ss.android.ugc.aweme.story.live.c$a r0 = r0.a((int) r2)
            r1.a((com.ss.android.ugc.aweme.story.live.c.a) r0)
            return r4
        L_0x041b:
            r4 = 1
            java.lang.String r1 = "enter_personal_detail"
            boolean r2 = r7.f63410d
            java.lang.String r3 = "user_id"
            r7.a((java.lang.String) r1, (boolean) r2, (java.lang.String) r3, (java.lang.String) r9)
            com.ss.android.ugc.aweme.profile.ui.UserProfileActivity.a((android.content.Context) r8, (java.lang.String) r9, (java.lang.String) r0, (java.lang.String) r14)
            return r4
        L_0x0429:
            r4 = 1
            java.lang.String r0 = "enter_music_detail"
            boolean r1 = r7.f63410d
            java.lang.String r2 = "music_id"
            r7.a((java.lang.String) r0, (boolean) r1, (java.lang.String) r2, (java.lang.String) r9)
            com.ss.android.ugc.aweme.music.ui.MusicDetailActivity.a(r8, r9, r14)
            return r4
        L_0x0437:
            r4 = 1
            java.lang.String r0 = "enter_tag_detail"
            boolean r1 = r7.f63410d
            java.lang.String r2 = "tag_id"
            r7.a((java.lang.String) r0, (boolean) r1, (java.lang.String) r2, (java.lang.String) r9)
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity.a(r8, r9, r14)
            return r4
        L_0x0445:
            r4 = 1
            com.ss.android.ugc.aweme.detail.ui.DetailActivity.a((android.content.Context) r8, (java.lang.String) r9, (java.lang.String) r14)
            java.lang.String r0 = "video_play"
            boolean r1 = r7.f63410d
            java.lang.String r2 = "group_id"
            r7.a((java.lang.String) r0, (boolean) r1, (java.lang.String) r2, (java.lang.String) r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.d.f.a(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f63407a, false, 70466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63407a, false, 70466, new Class[0], Void.TYPE);
            return;
        }
        this.f63409c.a(false);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f63407a, false, 70465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63407a, false, 70465, new Class[0], Void.TYPE);
            return;
        }
        this.f63409c.i();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63407a, false, 70455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63407a, false, 70455, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            d dVar = this.k;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f63398a, false, 70442, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f63398a, false, 70442, new Class[0], Void.TYPE);
            } else {
                if (dVar.f63400c != null) {
                    dVar.f63400c.a();
                }
                dVar.f63399b = null;
            }
        }
        this.f63409c = null;
        this.f63408b = null;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f63407a, false, 70464, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f63407a, false, 70464, new Class[]{String.class}, Void.TYPE);
        } else if (this.f63408b != null && this.f63408b.isViewValid()) {
            this.h = true;
            bv bvVar = new bv(this.f63408b, "scan");
            bvVar.q = false;
            bvVar.k = new h(str);
            bvVar.l = new i(this);
            bvVar.a(az.a((E[]) new String[]{str}), false, "qrcode");
        }
    }

    public f(AmeSSActivity ameSSActivity, m.a aVar) {
        this.f63408b = ameSSActivity;
        this.f63409c = aVar;
    }

    public final void a(boolean z, int i2, int i3) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63407a, false, 70460, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f63407a, false, 70460, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f63408b != null && this.f63408b.isViewValid()) {
            new Handler(Looper.getMainLooper()).post(new g(this, z));
            if (z2) {
                this.f63409c.ae_();
            }
        }
    }

    private void a(String str, boolean z, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0), str2, str3}, this, f63407a, false, 70462, new Class[]{String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z), str2, str3}, this, f63407a, false, 70462, new Class[]{String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        a(null, str, z, str2, str3);
    }

    public final void a(boolean z, int i2, String str, int i3) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), str2, Integer.valueOf(i3)}, this, f63407a, false, 70456, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), str2, Integer.valueOf(i3)}, this, f63407a, false, 70456, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f63408b.isViewValid()) {
            if (i3 == 2) {
                AmeSSActivity ameSSActivity = this.f63408b;
                if (PatchProxy.isSupport(new Object[]{str2, ameSSActivity}, null, g.f75433a, true, 87799, new Class[]{String.class, Activity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2, ameSSActivity}, null, g.f75433a, true, 87799, new Class[]{String.class, Activity.class}, Void.TYPE);
                    return;
                }
                Uri parse = Uri.parse(str);
                String str3 = parse.getHost() + parse.getPath();
                if (str3.charAt(str3.length() - 1) == '/') {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                g.a(str3, (Context) ameSSActivity);
            } else if (!g.a(str2, (Activity) this.f63408b)) {
                this.f63410d = z;
                if (!NetworkUtils.isNetworkAvailable(this.f63408b)) {
                    UIUtils.displayToast((Context) this.f63408b, (int) C0906R.string.bgf);
                    return;
                }
                j jVar = new j();
                jVar.f56036b = "qrCode";
                jVar.f56035a = str2;
                bg.a(new j());
                i a2 = i.a((Callable<TResult>) new Callable<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63424a;

                    public final /* synthetic */ Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f63424a, false, 70474, new Class[0], String.class)) {
                            return (String) PatchProxy.accessDispatch(new Object[0], this, f63424a, false, 70474, new Class[0], String.class);
                        }
                        f.this.f63409c.g();
                        return null;
                    }
                }, i.f1052b).a((a.g<TResult, TContinuationResult>) new a.g<String, a>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63421a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public a then(i<String> iVar) throws Exception {
                        String str;
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f63421a, false, 70473, new Class[]{i.class}, a.class)) {
                            return (a) PatchProxy.accessDispatch(new Object[]{iVar}, this, f63421a, false, 70473, new Class[]{i.class}, a.class);
                        }
                        if (b.a(str2)) {
                            str = com.ss.android.ugc.aweme.share.a.f.b(str2);
                        } else {
                            str = str2;
                        }
                        CouponRedeemApi.b bVar = null;
                        if (!com.ss.android.g.a.a() && !TimeLockRuler.isTeenModeON() && TextUtils.equals("13", k.b(str, "schema_type"))) {
                            String b2 = k.b(str, "object_id");
                            if (!TextUtils.isEmpty(b2)) {
                                try {
                                    bVar = (CouponRedeemApi.b) CouponRedeemApi.a(b2).get();
                                } catch (InterruptedException | CancellationException | ExecutionException unused) {
                                }
                            }
                        }
                        return new a(bVar, str);
                    }
                }, (Executor) i.f1051a);
                final int i4 = i3;
                final int i5 = i2;
                final String str4 = str;
                final boolean z2 = z;
                AnonymousClass2 r0 = new a.g<a, String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63415a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public String then(i<a> iVar) {
                        String str;
                        String str2;
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f63415a, false, 70471, new Class[]{i.class}, String.class)) {
                            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, this, f63415a, false, 70471, new Class[]{i.class}, String.class);
                        }
                        a aVar = (a) iVar.e();
                        if (aVar.f63429a == null || TimeLockRuler.isTeenModeON()) {
                            f.this.a((Context) f.this.f63408b, aVar.f63430b, i4, i5);
                        } else {
                            f.this.f63411e = "verify_coupon_page";
                            new Handler(Looper.getMainLooper()).post(new j(this, aVar));
                        }
                        if (f.this.g) {
                            f.this.f63409c.h();
                            f.this.g = false;
                        } else if (f.this.f63412f) {
                            f.this.f63412f = false;
                        } else if (!f.this.h) {
                            f.this.f63409c.d();
                            if (aVar.f63429a == null) {
                                f.this.f63409c.i();
                            } else {
                                f.this.f63409c.finish();
                            }
                        } else {
                            f.this.h = false;
                        }
                        String queryParameter = Uri.parse(str4).getQueryParameter("u_code");
                        af afVar = new af();
                        afVar.f75022b = str4;
                        if (z2) {
                            str = "scan_album";
                        } else {
                            str = "scan_cam";
                        }
                        afVar.f75023c = str;
                        afVar.f75024d = f.this.f63411e;
                        afVar.p = queryParameter;
                        if (i5 == 2) {
                            str2 = "shaped";
                        } else {
                            str2 = "general";
                        }
                        afVar.q = str2;
                        afVar.e();
                        f.this.f63410d = false;
                        return null;
                    }
                };
                a2.a((a.g<TResult, TContinuationResult>) r0, i.f1052b);
                if (PatchProxy.isSupport(new Object[0], this, f63407a, false, 70459, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63407a, false, 70459, new Class[0], Void.TYPE);
                    return;
                }
                Vibrator vibrator = (Vibrator) this.f63408b.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200);
                }
            }
        }
    }

    private void a(com.ss.android.ugc.aweme.app.d.d dVar, String str, boolean z, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{null, str5, Byte.valueOf(z ? (byte) 1 : 0), str6, str7}, this, f63407a, false, 70463, new Class[]{com.ss.android.ugc.aweme.app.d.d.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {null, str5, Byte.valueOf(z), str6, str7};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f63407a, false, 70463, new Class[]{com.ss.android.ugc.aweme.app.d.d.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "scan");
        if (z) {
            str4 = "scan_album";
        } else {
            str4 = "scan_cam";
        }
        r.a(str5, (Map) a2.a("enter_method", str4).a(str6, str7).a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0).f34114b);
    }
}
