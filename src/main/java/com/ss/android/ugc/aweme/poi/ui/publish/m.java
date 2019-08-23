package com.ss.android.ugc.aweme.poi.ui.publish;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.poi.api.POIApiManager;
import com.ss.android.ugc.aweme.poi.model.ay;
import java.util.concurrent.Callable;

public final class m extends b<a<ay>, l> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60879a;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60879a, false, 66698, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60879a, false, 66698, new Class[]{Exception.class}, Void.TYPE);
        }
    }

    public m() {
        a(new a<ay>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60880a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                int i;
                int i2;
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f60880a, false, 66700, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f60880a, false, 66700, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    try {
                        String d2 = c.d();
                        if (TextUtils.isEmpty(d2)) {
                            i2 = 0;
                        } else {
                            i2 = Integer.parseInt(d2);
                        }
                        i = i2;
                    } catch (Exception unused) {
                        i = 0;
                    }
                    WeakHandler weakHandler = this.mHandler;
                    String str = objArr[0];
                    String str2 = objArr[1];
                    String str3 = objArr[2];
                    if (PatchProxy.isSupport(new Object[]{weakHandler, str, str2, Integer.valueOf(i), str3}, null, POIApiManager.f59704a, true, 64915, new Class[]{Handler.class, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
                        Object[] objArr2 = {weakHandler, str, str2, Integer.valueOf(i), str3};
                        Object[] objArr3 = objArr2;
                        PatchProxy.accessDispatch(objArr3, null, POIApiManager.f59704a, true, 64915, new Class[]{Handler.class, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.base.m.a().a(weakHandler, new Callable(str, str2, i, str3) {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f59706a;

                            /* renamed from: b */
                            final /* synthetic */ String f59707b;

                            /* renamed from: c */
                            final /* synthetic */ String f59708c;

                            /* renamed from: d */
                            final /* synthetic */ int f59709d;

                            /* renamed from: e */
                            final /* synthetic */ String f59710e;

                            public final java.lang.Object call(
/*
Method generation error in method: com.ss.android.ugc.aweme.poi.api.POIApiManager.1.call():java.lang.Object, dex: classes5.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.poi.api.POIApiManager.1.call():java.lang.Object, class status: UNLOADED
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
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
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
                        }, 2);
                    }
                    return true;
                }
            }
        });
    }

    public final void b() {
        ay ayVar;
        if (PatchProxy.isSupport(new Object[0], this, f60879a, false, 66697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60879a, false, 66697, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            l lVar = (l) this.f2979f;
            if (PatchProxy.isSupport(new Object[0], this, f60879a, false, 66699, new Class[0], ay.class)) {
                ayVar = (ay) PatchProxy.accessDispatch(new Object[0], this, f60879a, false, 66699, new Class[0], ay.class);
            } else if (this.f2978e == null) {
                ayVar = null;
            } else {
                ayVar = (ay) this.f2978e.getData();
            }
            lVar.a(ayVar);
        }
    }
}
