package com.bytedance.d;

import android.content.Context;
import android.os.Process;
import android.support.v4.content.ContextCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J$\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007¨\u0006\u0011"}, d2 = {"Lcom/bytedance/oomdumper/OOMDumper;", "", "()V", "checkPermission", "", "context", "Landroid/content/Context;", "dumpFd", "", "dir", "Ljava/io/File;", "fileName", "", "dumpMmap", "dumpThreads", "testOOM", "OOMObject", "oomdumper_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19590a = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/oomdumper/OOMDumper$OOMObject;", "", "()V", "OM_OBJECT", "", "doSomething", "oomdumper_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.d.a$a  reason: collision with other inner class name */
    public static final class C0155a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f19591a = new byte[1048576];
    }

    private a() {
    }

    @JvmStatic
    public static final void a() {
        while (true) {
            new ArrayList().add(new C0155a());
        }
    }

    private static boolean a(Context context) {
        if (context != null && ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final void a(@Nullable File file, @NotNull String str) {
        Throwable th;
        Throwable th2;
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        if (file != null) {
            File file2 = new File("/proc/" + Process.myPid() + "/maps");
            StringBuffer stringBuffer = new StringBuffer();
            Closeable fileReader = new FileReader(file2);
            try {
                Iterator it2 = p.a((Reader) (FileReader) fileReader).iterator();
                while (it2.hasNext()) {
                    stringBuffer.append(((String) it2.next()) + 10);
                }
                CloseableKt.closeFinally(fileReader, null);
                Closeable fileWriter = new FileWriter(new File(file, str));
                try {
                    ((FileWriter) fileWriter).write(stringBuffer.toString());
                    CloseableKt.closeFinally(fileWriter, null);
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileWriter, th2);
                    throw th3;
                }
            } catch (Throwable th4) {
                CloseableKt.closeFinally(fileReader, th);
                throw th4;
            }
        }
    }

    @JvmStatic
    public static final void a(@Nullable Context context, @Nullable File file, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        if (file != null && a(context)) {
            System.currentTimeMillis();
            List a2 = com.bytedance.d.a.a.a(new File("/proc/" + Process.myPid() + "/fd"));
            FileWriter fileWriter = new FileWriter(new File(file, str));
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                fileWriter.write(((String) it2.next()) + 10);
            }
            fileWriter.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0060 A[SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(@org.jetbrains.annotations.Nullable android.content.Context r7, @org.jetbrains.annotations.Nullable java.io.File r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            boolean r7 = a(r7)
            if (r7 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.System.currentTimeMillis()
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "/proc/"
            r1.<init>(r2)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "/task"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.File[] r0 = r0.listFiles()
            java.lang.String r1 = "taskFile.listFiles()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0043:
            if (r4 >= r2) goto L_0x0063
            r5 = r0[r4]
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x005a
            java.lang.String r6 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x0060
            r1.add(r5)
        L_0x0060:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0063:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L_0x006b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "stat"
            r4.<init>(r1, r5)
            java.lang.String r1 = "statFile"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r1)
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r4.getAbsolutePath()
            r1.append(r4)
            java.lang.String r4 = " does not exist"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x00b9
        L_0x00a4:
            java.io.FileReader r1 = new java.io.FileReader
            r1.<init>(r4)
            java.io.Reader r1 = (java.io.Reader) r1
            java.util.List r1 = kotlin.io.p.a((java.io.Reader) r1)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.getOrNull(r1, r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00b9
            java.lang.String r1 = ""
        L_0x00b9:
            r2.append(r1)
            r1 = 10
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r7.append(r1)
            goto L_0x006b
        L_0x00c9:
            java.io.File r0 = new java.io.File
            r0.<init>(r8, r9)
            java.io.FileWriter r8 = new java.io.FileWriter
            r8.<init>(r0)
            java.io.Closeable r8 = (java.io.Closeable) r8
            r9 = 0
            r0 = r8
            java.io.FileWriter r0 = (java.io.FileWriter) r0     // Catch:{ Throwable -> 0x00e6 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x00e6 }
            r0.write(r7)     // Catch:{ Throwable -> 0x00e6 }
            kotlin.io.CloseableKt.closeFinally(r8, r9)
            return
        L_0x00e4:
            r7 = move-exception
            goto L_0x00e9
        L_0x00e6:
            r7 = move-exception
            r9 = r7
            throw r9     // Catch:{ all -> 0x00e4 }
        L_0x00e9:
            kotlin.io.CloseableKt.closeFinally(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.d.a.b(android.content.Context, java.io.File, java.lang.String):void");
    }
}
