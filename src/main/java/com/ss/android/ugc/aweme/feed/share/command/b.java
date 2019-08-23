package com.ss.android.ugc.aweme.feed.share.command;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import com.ss.android.ugc.aweme.share.a.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45933a;

    /* renamed from: b  reason: collision with root package name */
    private final CommandObserver f45934b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f45935c;

    /* renamed from: d  reason: collision with root package name */
    private final String f45936d;

    b(CommandObserver commandObserver, Context context, String str) {
        this.f45934b = commandObserver;
        this.f45935c = context;
        this.f45936d = str;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, f45933a, false, 42154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45933a, false, 42154, new Class[0], Void.TYPE);
            return;
        }
        CommandObserver commandObserver = this.f45934b;
        Context context = this.f45935c;
        String str4 = this.f45936d;
        String b2 = f.b(context);
        if (PatchProxy.isSupport(new Object[]{b2}, null, f.f64582a, true, 73461, new Class[]{String.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{b2}, null, f.f64582a, true, 73461, new Class[]{String.class}, String.class);
        } else {
            Matcher matcher = Pattern.compile("##[A-Za-z0-9]{11}##").matcher(b2);
            str = matcher.find() ? matcher.group().replace("#", "") : "";
        }
        if (CommandObserver.a(str4)) {
            commandObserver.b(str4);
        } else if (CommandObserver.a(b2)) {
            commandObserver.b(b2);
        } else {
            String str5 = null;
            if (!TextUtils.isEmpty(str)) {
                str5 = "token";
            } else {
                if (PatchProxy.isSupport(new Object[]{b2}, null, f.f64582a, true, 73458, new Class[]{String.class}, String.class)) {
                    str3 = (String) PatchProxy.accessDispatch(new Object[]{b2}, null, f.f64582a, true, 73458, new Class[]{String.class}, String.class);
                } else {
                    a b3 = g.b();
                    if (PatchProxy.isSupport(new Object[0], b3, a.f49567a, false, 48777, new Class[0], String.class)) {
                        str2 = (String) PatchProxy.accessDispatch(new Object[0], b3, a.f49567a, false, 48777, new Class[0], String.class);
                    } else if (b3.f49569c == null) {
                        str2 = b3.f49568b.getImGroupPasswordRegex();
                    } else {
                        str2 = (String) a.a(b3.f49569c, "im_group_password_regex", String.class, b3.f49568b.getImGroupPasswordRegex());
                    }
                    Matcher matcher2 = Pattern.compile(str2).matcher(b2);
                    if (matcher2.find()) {
                        str3 = matcher2.group().replace("\n", "");
                    } else {
                        str3 = "";
                    }
                }
                str = str3;
                if (!TextUtils.isEmpty(str)) {
                    str5 = "group_chat";
                } else {
                    str = f.a(b2);
                    if (!TextUtils.isEmpty(str)) {
                        str5 = "link";
                    }
                }
            }
            if (!commandObserver.a(str, str5, 0) && ((Integer) x.a().D().c()).intValue() != 0) {
                f.a(context, (f.a) new f.a() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f45864a;

                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.feed.share.command.CommandObserver.1.a(java.lang.String, int):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.feed.share.command.CommandObserver.1.a(java.lang.String, int):void, class status: UNLOADED
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
        }
    }
}
