package com.bytedance.d;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/bytedance/oomdumper/SystemUtils;", "", "()V", "dumpSystemMessage", "", "", "cmd", "", "path", "oomdumper_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f19593a = new b();

    private b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r3);
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(@org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            java.lang.String r0 = "cmd"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            kotlin.collections.CollectionsKt.emptyList()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            java.lang.Process r3 = r0.exec(r3)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "process"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r2)
            java.io.InputStream r3 = r3.getInputStream()
            r1.<init>(r3)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r3 = 0
            r1 = r0
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ Throwable -> 0x0037 }
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ Throwable -> 0x0037 }
            java.util.List r1 = kotlin.io.p.a((java.io.Reader) r1)     // Catch:{ Throwable -> 0x0037 }
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            return r1
        L_0x0035:
            r1 = move-exception
            goto L_0x0039
        L_0x0037:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0035 }
        L_0x0039:
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.d.b.a(java.lang.String):java.util.List");
    }
}
