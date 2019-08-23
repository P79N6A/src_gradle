package com.bytedance.im.core.b.a.c.a;

import android.content.Context;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.e.d;
import com.bytedance.im.core.b.e.i;
import com.bytedance.im.core.c.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteOpenHelper;
import com.tencent.wcdb.repair.RepairKit;

public final class f extends SQLiteOpenHelper implements c {

    /* renamed from: a  reason: collision with root package name */
    public static int f20923a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f20924b;

    /* renamed from: d  reason: collision with root package name */
    private static final DatabaseErrorHandler f20925d = new DatabaseErrorHandler() {
        public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final d f20926e = new d() {
        public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
            if (!f.f20924b) {
                f.f20924b = true;
                boolean a2 = f.a(sQLiteDatabase);
                d.a("LocalWcdbOpenHelper", "tryRepair result " + a2);
                c a3 = c.a().a("core").b("db_repair").a("repair_result", String.valueOf(a2));
                int i = f.f20923a;
                int i2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                if (i < 1000) {
                    i2 = f.f20923a;
                }
                a3.a("repair_count", Integer.valueOf(i2)).b();
                if (!a2) {
                    super.onCorruption(sQLiteDatabase);
                    com.bytedance.im.core.a.c a4 = com.bytedance.im.core.a.c.a();
                    c.a().a("core").b("db_crash").a("last_reset_time", Long.valueOf(i.a().b())).a("reset_count", Integer.valueOf(i.a().c())).b();
                    m.a().a((Runnable) new Runnable() {
                        public final void run(
/*
Method generation error in method: com.bytedance.im.core.a.c.2.run():void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.a.c.2.run():void, class status: UNLOADED
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
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:96)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:467)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:436)
                        	at jadx.core.codegen.ClassGen.addField(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:347)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:224)
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
                f.f20924b = false;
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private a f20927c;

    public final void a(com.bytedance.im.core.b.a.c.c cVar) {
    }

    public final void a(com.bytedance.im.core.b.a.c.c cVar, int i, int i2) {
    }

    public final void close() {
        super.close();
    }

    public final com.bytedance.im.core.b.a.c.c b() {
        return b(getWritableDatabase());
    }

    public final void a(a aVar) {
        this.f20927c = aVar;
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    private static com.bytedance.im.core.b.a.c.c b(SQLiteDatabase sQLiteDatabase) {
        return new com.bytedance.im.core.b.a.c.b.b.c(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        d.a("LocalWcdbOpenHelper onConfigure");
        b(sQLiteDatabase);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        d.a("LocalWcdbOpenHelper onCreate");
        this.f20927c.a(b(sQLiteDatabase));
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        d.a("LocalWcdbOpenHelper onOpen");
        b(sQLiteDatabase);
        RepairKit.MasterInfo.save(sQLiteDatabase, sQLiteDatabase.getPath() + "-mbak", null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A[Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2 A[SYNTHETIC, Splitter:B:52:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(com.tencent.wcdb.database.SQLiteDatabase r8) {
        /*
            java.lang.Class<com.bytedance.im.core.b.a.c.a.f> r0 = com.bytedance.im.core.b.a.c.a.f.class
            monitor-enter(r0)
            r1 = 0
            if (r8 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            boolean r2 = r8.isOpen()     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0011
            r8.close()     // Catch:{ all -> 0x00ed }
        L_0x0011:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.lang.String r8 = r8.getPath()     // Catch:{ all -> 0x00ed }
            r2.<init>(r8)     // Catch:{ all -> 0x00ed }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r3.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r2.getPath()     // Catch:{ all -> 0x00ed }
            r3.append(r4)     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "-mbak"
            r3.append(r4)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ed }
            r8.<init>(r3)     // Catch:{ all -> 0x00ed }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r2.getParent()     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r5.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = r2.getName()     // Catch:{ all -> 0x00ed }
            r5.append(r6)     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = "-recover"
            r5.append(r6)     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ed }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ed }
            boolean r4 = r8.exists()     // Catch:{ all -> 0x00ed }
            r5 = 0
            if (r4 == 0) goto L_0x0062
            java.lang.String r8 = r8.getPath()     // Catch:{ SQLiteException -> 0x0062 }
            com.tencent.wcdb.repair.RepairKit$MasterInfo r8 = com.tencent.wcdb.repair.RepairKit.MasterInfo.load(r8, r5, r5)     // Catch:{ SQLiteException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r8 = r5
        L_0x0063:
            com.bytedance.im.core.a.c r4 = com.bytedance.im.core.a.c.a()     // Catch:{ all -> 0x00ed }
            com.bytedance.im.core.a.e r4 = r4.b()     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r4.x     // Catch:{ all -> 0x00ed }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00ed }
            if (r4 != 0) goto L_0x0082
            com.bytedance.im.core.a.c r4 = com.bytedance.im.core.a.c.a()     // Catch:{ all -> 0x00ed }
            com.bytedance.im.core.a.e r4 = r4.b()     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r4.x     // Catch:{ all -> 0x00ed }
            byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x00ed }
            goto L_0x0083
        L_0x0082:
            r4 = r5
        L_0x0083:
            com.tencent.wcdb.repair.RepairKit r6 = new com.tencent.wcdb.repair.RepairKit     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
            java.lang.String r7 = r2.getPath()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
            r6.<init>(r7, r4, r5, r8)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
            boolean r8 = r3.exists()     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            if (r8 == 0) goto L_0x0095
            r3.delete()     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
        L_0x0095:
            com.tencent.wcdb.DatabaseErrorHandler r8 = f20925d     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            com.tencent.wcdb.database.SQLiteDatabase r8 = com.tencent.wcdb.database.SQLiteDatabase.openOrCreateDatabase((java.io.File) r3, (byte[]) r4, (com.tencent.wcdb.database.SQLiteCipherSpec) r5, (com.tencent.wcdb.database.SQLiteDatabase.CursorFactory) r5, (com.tencent.wcdb.DatabaseErrorHandler) r8)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            f20923a = r1     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            com.bytedance.im.core.b.a.c.a.f$3 r4 = new com.bytedance.im.core.b.a.c.a.f$3     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            r4.<init>()     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            r6.setCallback(r4)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            int r4 = r6.output(r8, r1)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            r7 = 1
            if (r4 == 0) goto L_0x00b7
            if (r4 != r7) goto L_0x00af
            goto L_0x00b7
        L_0x00af:
            com.tencent.wcdb.database.SQLiteException r8 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            java.lang.String r2 = "Repair returns failure."
            r8.<init>(r2)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            throw r8     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
        L_0x00b7:
            r4 = 12
            r8.setVersion(r4)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            r8.close()     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            r6.release()     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00da }
            boolean r8 = r2.delete()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
            if (r8 == 0) goto L_0x00d0
            boolean r8 = r3.renameTo(r2)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
            if (r8 == 0) goto L_0x00d0
            monitor-exit(r0)
            return r7
        L_0x00d0:
            com.tencent.wcdb.database.SQLiteException r8 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
            java.lang.String r2 = "Cannot rename database."
            r8.<init>(r2)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
            throw r8     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00de }
        L_0x00d8:
            goto L_0x00e6
        L_0x00da:
            r8 = move-exception
            goto L_0x00e0
        L_0x00dc:
            r5 = r6
            goto L_0x00e6
        L_0x00de:
            r8 = move-exception
            r6 = r5
        L_0x00e0:
            if (r6 == 0) goto L_0x00e5
            r6.release()     // Catch:{ all -> 0x00ed }
        L_0x00e5:
            throw r8     // Catch:{ all -> 0x00ed }
        L_0x00e6:
            if (r5 == 0) goto L_0x00eb
            r5.release()     // Catch:{ all -> 0x00ed }
        L_0x00eb:
            monitor-exit(r0)
            return r1
        L_0x00ed:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.a.c.a.f.a(com.tencent.wcdb.database.SQLiteDatabase):boolean");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        d.a("LocalWcdbOpenHelper onUpgrade");
        this.f20927c.a(b(sQLiteDatabase), i, i2);
    }

    public f(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, null, cursorFactory, i, f20926e);
        d.a("LocalWcdbOpenHelper");
    }

    public f(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, bArr, cursorFactory, i, f20926e);
        d.a("LocalWcdbOpenHelper");
    }
}
