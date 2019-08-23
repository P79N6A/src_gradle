package com.ss.android.agilelogger.d;

import android.content.Context;
import android.os.Process;
import com.ss.android.agilelogger.ALog;
import com.ss.android.agilelogger.AgileDelegate;
import com.ss.android.agilelogger.c;
import com.ss.android.agilelogger.e;
import com.ss.android.agilelogger.f;
import com.ss.android.agilelogger.f.j;
import com.ss.android.agilelogger.g;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;

public final class a extends b {

    /* renamed from: e  reason: collision with root package name */
    private final Context f27894e;

    /* renamed from: f  reason: collision with root package name */
    private final int f27895f;
    private AgileDelegate g;
    private String h;

    /* renamed from: com.ss.android.agilelogger.d.a$a  reason: collision with other inner class name */
    public static class C0324a {

        /* renamed from: a  reason: collision with root package name */
        public Context f27896a;

        /* renamed from: b  reason: collision with root package name */
        public String f27897b;

        /* renamed from: c  reason: collision with root package name */
        public String f27898c;

        /* renamed from: d  reason: collision with root package name */
        public int f27899d = 4096;

        /* renamed from: e  reason: collision with root package name */
        public int f27900e = 2;

        /* renamed from: f  reason: collision with root package name */
        public List<com.ss.android.agilelogger.c.a> f27901f;
        public boolean g;
        public boolean h;
        public int i = 3;

        public C0324a(Context context) {
            this.f27896a = context;
        }
    }

    public final void a() {
        super.a();
        AgileDelegate agileDelegate = this.g;
        if (agileDelegate.f27854b != 0) {
            try {
                agileDelegate.asyncFlush(agileDelegate.f27854b);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        super.b();
        AgileDelegate agileDelegate = this.g;
        if (agileDelegate.f27854b != 0) {
            try {
                agileDelegate.release(agileDelegate.f27854b);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str) {
        this.g.a(str);
    }

    public a(C0324a aVar) {
        this.f27894e = aVar.f27896a;
        this.f27895f = aVar.i;
        this.h = new File(aVar.f27898c).getParentFile().getAbsolutePath();
        AgileDelegate agileDelegate = new AgileDelegate(aVar.f27897b, aVar.f27899d, aVar.f27898c, aVar.g, aVar.h);
        this.g = agileDelegate;
        this.f27904c = aVar.f27899d;
        a(aVar.f27900e);
        a(aVar.f27901f);
    }

    /* access modifiers changed from: protected */
    public final void a(e eVar) {
        boolean z;
        String str;
        int i;
        if (j.f27924a >= ((long) ALog.sConfig.f27860b)) {
            j.a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a(new File(this.h, com.ss.android.agilelogger.f.a.a(ALog.getContext())).getAbsolutePath());
        }
        int i2 = this.f27895f;
        c.f27889d = this.g.f27853a;
        File file = new File(c.f27889d);
        g.b();
        long j = g.f27927a.getLong("_LAST_CLEAN_TIMESTAMP_", 0);
        int i3 = i2 * com.ss.android.ugc.aweme.main.guide.a.f54802d;
        if (System.currentTimeMillis() - j < ((long) (i3 * 3))) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                public final boolean accept(
/*
Method generation error in method: com.ss.android.agilelogger.c.3.accept(java.io.File, java.lang.String):boolean, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.agilelogger.c.3.accept(java.io.File, java.lang.String):boolean, class status: UNLOADED
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
            if (listFiles == null) {
                i = 0;
            } else {
                i = listFiles.length;
            }
            if (i * ALog.sConfig.f27860b > ALog.sConfig.f27859a && (c.f27888c == null || c.f27888c.isDone())) {
                c.f27888c = c.f27886a.submit(new c.a((byte) 0));
            }
        } else if (c.f27887b == null || c.f27887b.isDone()) {
            c.f27887b = c.f27886a.submit(new c.b((long) i3));
            long currentTimeMillis = System.currentTimeMillis();
            g.b();
            g.f27927a.edit().putLong("_LAST_CLEAN_TIMESTAMP_", currentTimeMillis).commit();
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[10];
        objArr[0] = this.f27905d.format(Long.valueOf(System.currentTimeMillis()));
        objArr[1] = Integer.valueOf(Process.myPid());
        objArr[2] = Long.valueOf(eVar.f27910e);
        if (eVar.f27911f) {
            str = "*";
        } else {
            str = "";
        }
        objArr[3] = str;
        objArr[4] = f.a(eVar.f27907b);
        objArr[5] = eVar.f27908c;
        objArr[6] = eVar.j;
        objArr[7] = eVar.k;
        objArr[8] = eVar.l;
        objArr[9] = eVar.f27909d;
        String format = String.format(locale, "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n", objArr);
        AgileDelegate agileDelegate = this.g;
        if (agileDelegate.f27854b != 0) {
            try {
                agileDelegate.write(agileDelegate.f27854b, format);
            } catch (Throwable unused) {
            }
        }
        j.a(format.getBytes(Charset.forName("utf-8")).length);
    }
}
