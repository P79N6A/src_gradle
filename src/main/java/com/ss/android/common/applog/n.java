package com.ss.android.common.applog;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28180a = null;

    /* renamed from: b  reason: collision with root package name */
    static int f28181b = -1;

    /* renamed from: c  reason: collision with root package name */
    static LinkedList<File> f28182c;

    /* renamed from: d  reason: collision with root package name */
    static boolean f28183d;

    static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f28180a, true, 15557, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f28180a, true, 15557, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static File[] a(File file) {
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, null, f28180a, true, 15560, new Class[]{File.class}, File[].class)) {
            return (File[]) PatchProxy.accessDispatch(new Object[]{file2}, null, f28180a, true, 15560, new Class[]{File.class}, File[].class);
        }
        final Pattern compile = Pattern.compile("^log_[0-9]+_\\.log$");
        File[] listFiles = file2.listFiles(new FileFilter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28184a;

            public final boolean accept(File file) {
                String str;
                if (PatchProxy.isSupport(new Object[]{file}, this, f28184a, false, 15561, new Class[]{File.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f28184a, false, 15561, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
                }
                if (file != null) {
                    str = file.getName();
                } else {
                    str = null;
                }
                if (str != null && str.startsWith("log_") && file.isFile()) {
                    return compile.matcher(str).matches();
                }
                return false;
            }
        });
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        Arrays.sort(listFiles, new Comparator<File>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28186a;

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                File file = (File) obj;
                File file2 = (File) obj2;
                if (PatchProxy.isSupport(new Object[]{file, file2}, this, f28186a, false, 15562, new Class[]{File.class, File.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{file, file2}, this, f28186a, false, 15562, new Class[]{File.class, File.class}, Integer.TYPE)).intValue();
                }
                long lastModified = file.lastModified();
                long lastModified2 = file2.lastModified();
                if (lastModified < lastModified2) {
                    return -1;
                }
                if (lastModified == lastModified2) {
                    return 0;
                }
                return 1;
            }
        });
        return listFiles;
    }

    private static void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f28180a, true, 15559, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f28180a, true, 15559, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        File[] a2 = a(context.getExternalCacheDir());
        f28181b = a2.length;
        if (a2.length >= 500) {
            f28182c = new LinkedList<>();
            int i = 100;
            if (a2.length <= 100) {
                i = a2.length;
            }
            f28182c.addAll(Arrays.asList(a2).subList(0, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(android.content.Context r18) {
        /*
            java.lang.Class<com.ss.android.common.applog.n> r1 = com.ss.android.common.applog.n.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0085 }
            r10 = 0
            r3[r10] = r18     // Catch:{ all -> 0x0085 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f28180a     // Catch:{ all -> 0x0085 }
            r6 = 1
            r7 = 15558(0x3cc6, float:2.1801E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0085 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r10] = r9     // Catch:{ all -> 0x0085 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x0085 }
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x0036
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x0085 }
            r11[r10] = r18     // Catch:{ all -> 0x0085 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f28180a     // Catch:{ all -> 0x0085 }
            r14 = 1
            r15 = 15558(0x3cc6, float:2.1801E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0085 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r10] = r2     // Catch:{ all -> 0x0085 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ all -> 0x0085 }
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0085 }
            monitor-exit(r1)
            return
        L_0x0036:
            int r3 = f28181b     // Catch:{ Throwable -> 0x0083 }
            if (r3 >= 0) goto L_0x003d
            b(r18)     // Catch:{ Throwable -> 0x0083 }
        L_0x003d:
            int r3 = f28181b     // Catch:{ Throwable -> 0x0083 }
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r4) goto L_0x0045
            monitor-exit(r1)
            return
        L_0x0045:
            java.util.LinkedList<java.io.File> r3 = f28182c     // Catch:{ Throwable -> 0x0083 }
            if (r3 != 0) goto L_0x004c
            b(r18)     // Catch:{ Throwable -> 0x0083 }
        L_0x004c:
            java.util.LinkedList<java.io.File> r0 = f28182c     // Catch:{ Throwable -> 0x0083 }
            if (r0 != 0) goto L_0x0052
            monitor-exit(r1)
            return
        L_0x0052:
            int r0 = f28181b     // Catch:{ Throwable -> 0x0083 }
            if (r0 <= r4) goto L_0x006f
            java.util.LinkedList<java.io.File> r0 = f28182c     // Catch:{ Throwable -> 0x0083 }
            int r0 = r0.size()     // Catch:{ Throwable -> 0x0083 }
            if (r0 <= 0) goto L_0x006f
            java.util.LinkedList<java.io.File> r0 = f28182c     // Catch:{ Throwable -> 0x0083 }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ Throwable -> 0x0083 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Throwable -> 0x0083 }
            r0.delete()     // Catch:{ Throwable -> 0x0083 }
            int r0 = f28181b     // Catch:{ Throwable -> 0x0083 }
            int r0 = r0 - r2
            f28181b = r0     // Catch:{ Throwable -> 0x0083 }
            goto L_0x0052
        L_0x006f:
            int r0 = f28181b     // Catch:{ Throwable -> 0x0083 }
            if (r0 >= 0) goto L_0x0076
            r0 = -1
            f28181b = r0     // Catch:{ Throwable -> 0x0083 }
        L_0x0076:
            java.util.LinkedList<java.io.File> r0 = f28182c     // Catch:{ Throwable -> 0x0083 }
            boolean r0 = r0.isEmpty()     // Catch:{ Throwable -> 0x0083 }
            if (r0 == 0) goto L_0x0081
            r0 = 0
            f28182c = r0     // Catch:{ Throwable -> 0x0083 }
        L_0x0081:
            monitor-exit(r1)
            return
        L_0x0083:
            monitor-exit(r1)
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.n.a(android.content.Context):void");
    }
}
