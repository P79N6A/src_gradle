package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import cn.com.chinatelecom.account.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static int f1803a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, e> f1804b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static List<String> f1805c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static Handler f1806d = new Handler(Looper.getMainLooper());

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = new cn.com.chinatelecom.account.api.c.e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized cn.com.chinatelecom.account.api.c.e a(java.lang.String r3) {
        /*
            java.lang.Class<cn.com.chinatelecom.account.api.c.f> r0 = cn.com.chinatelecom.account.api.c.f.class
            monitor-enter(r0)
            r1 = 0
            java.util.Map<java.lang.String, cn.com.chinatelecom.account.api.c.e> r2 = f1804b     // Catch:{ Throwable -> 0x0024 }
            boolean r2 = r2.containsKey(r3)     // Catch:{ Throwable -> 0x0024 }
            if (r2 == 0) goto L_0x0014
            java.util.Map<java.lang.String, cn.com.chinatelecom.account.api.c.e> r1 = f1804b     // Catch:{ Throwable -> 0x0024 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Throwable -> 0x0024 }
            cn.com.chinatelecom.account.api.c.e r1 = (cn.com.chinatelecom.account.api.c.e) r1     // Catch:{ Throwable -> 0x0024 }
        L_0x0014:
            if (r1 != 0) goto L_0x0020
            cn.com.chinatelecom.account.api.c.e r1 = new cn.com.chinatelecom.account.api.c.e     // Catch:{ Throwable -> 0x0024 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x0024 }
            java.util.Map<java.lang.String, cn.com.chinatelecom.account.api.c.e> r2 = f1804b     // Catch:{ Throwable -> 0x0024 }
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x0024 }
        L_0x0020:
            monitor-exit(r0)
            return r1
        L_0x0022:
            r3 = move-exception
            goto L_0x002b
        L_0x0024:
            cn.com.chinatelecom.account.api.c.e r1 = new cn.com.chinatelecom.account.api.c.e     // Catch:{ all -> 0x0022 }
            r1.<init>(r3)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)
            return r1
        L_0x002b:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.f.a(java.lang.String):cn.com.chinatelecom.account.api.c.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(final android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<cn.com.chinatelecom.account.api.c.f> r0 = cn.com.chinatelecom.account.api.c.f.class
            monitor-enter(r0)     // Catch:{ Throwable -> 0x0038 }
            java.util.Map<java.lang.String, cn.com.chinatelecom.account.api.c.e> r1 = f1804b     // Catch:{ all -> 0x0035 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0021
            java.util.List<java.lang.String> r1 = f1805c     // Catch:{ all -> 0x0035 }
            java.util.Map<java.lang.String, cn.com.chinatelecom.account.api.c.e> r2 = f1804b     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0035 }
            cn.com.chinatelecom.account.api.c.e r2 = (cn.com.chinatelecom.account.api.c.e) r2     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0035 }
            r1.add(r2)     // Catch:{ all -> 0x0035 }
            java.util.Map<java.lang.String, cn.com.chinatelecom.account.api.c.e> r1 = f1804b     // Catch:{ all -> 0x0035 }
            r1.remove(r4)     // Catch:{ all -> 0x0035 }
        L_0x0021:
            int r4 = f1803a     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r4 == r1) goto L_0x0033
            java.util.List<java.lang.String> r4 = f1805c     // Catch:{ all -> 0x0035 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            f1803a = r1     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ Throwable -> 0x0038 }
        L_0x0038:
            android.os.Handler r4 = f1806d
            cn.com.chinatelecom.account.api.c.f$1 r0 = new cn.com.chinatelecom.account.api.c.f$1
            r0.<init>(r3)
            r1 = 8000(0x1f40, double:3.9525E-320)
            r4.postDelayed(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.f.a(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = -1
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x001c }
            if (r2 != 0) goto L_0x001c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x001c }
            r2.<init>(r4)     // Catch:{ Exception -> 0x001c }
            java.lang.String r4 = "result"
            int r4 = r2.getInt(r4)     // Catch:{ Exception -> 0x001c }
            java.lang.String r1 = "msg"
            java.lang.String r1 = r2.optString(r1)     // Catch:{ Exception -> 0x001d }
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r4 = -1
        L_0x001d:
            if (r4 != 0) goto L_0x002b
            cn.com.chinatelecom.account.api.c.e r3 = a((java.lang.String) r3)
            cn.com.chinatelecom.account.api.c.e r3 = r3.a((int) r4)
            r3.e(r0)
            return
        L_0x002b:
            cn.com.chinatelecom.account.api.c.e r3 = a((java.lang.String) r3)
            cn.com.chinatelecom.account.api.c.e r3 = r3.a((int) r4)
            cn.com.chinatelecom.account.api.c.e r3 = r3.e(r0)
            r3.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.f.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public static void b(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (f.class) {
                arrayList.addAll(f1805c);
                f1803a = 0;
                f1805c.clear();
            }
            if (!arrayList.isEmpty()) {
                int a2 = c.a(context);
                if (a2 != -2) {
                    c.a(new Runnable(context, arrayList, a2) {

                        /* renamed from: a */
                        final /* synthetic */ Context f1722a;

                        /* renamed from: b */
                        final /* synthetic */ List f1723b;

                        /* renamed from: c */
                        final /* synthetic */ int f1724c;

                        public final void run(
/*
Method generation error in method: cn.com.chinatelecom.account.a.c.1.run():void, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: cn.com.chinatelecom.account.a.c.1.run():void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r4, java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 64897(0xfd81, float:9.094E-41)
            r2 = -1
            r3 = 0
            if (r0 == r1) goto L_0x002a
            r1 = 78159(0x1314f, float:1.09524E-40)
            if (r0 == r1) goto L_0x0020
            r1 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "ERROR"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "OFF"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "ALL"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            switch(r5) {
                case 0: goto L_0x0038;
                case 1: goto L_0x003b;
                case 2: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            r2 = 0
            goto L_0x003b
        L_0x003a:
            r2 = -2
        L_0x003b:
            java.lang.String r5 = "key_c_l_l_v"
            cn.com.chinatelecom.account.api.c.c.a((android.content.Context) r4, (java.lang.String) r5, (int) r2)     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.f.b(android.content.Context, java.lang.String):void");
    }
}
