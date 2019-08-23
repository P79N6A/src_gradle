package com.ss.android.ugc.aweme.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class fd {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75874a;

    private static void a(@NonNull File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f75874a, true, 88715, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, null, f75874a, true, 88715, new Class[]{File.class}, Void.TYPE);
            return;
        }
        file.delete();
    }

    public static String a(@NonNull String str, @NonNull List<String> list) {
        String str2 = str;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, null, f75874a, true, 88710, new Class[]{String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, list2}, null, f75874a, true, 88710, new Class[]{String.class, List.class}, String.class);
        }
        return a(str2, "ame-extract-frames" + System.currentTimeMillis() + ".zip", list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3 A[Catch:{ Exception -> 0x00e6, all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8 A[Catch:{ Exception -> 0x00e6, all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1 A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f5 A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r19, java.io.File r20) throws java.io.IOException {
        /*
            r0 = r19
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = f75874a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.io.File> r4 = java.io.File.class
            r8[r10] = r4
            java.lang.Class<java.io.File> r4 = java.io.File.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 88713(0x15a89, float:1.24313E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r20
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75874a
            r15 = 1
            r16 = 88713(0x15a89, float:1.24313E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0[r10] = r1
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0046:
            r2 = 0
            r20.mkdirs()     // Catch:{ Exception -> 0x00ec }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x00ec }
            r3.<init>(r0)     // Catch:{ Exception -> 0x00ec }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.util.Enumeration r5 = r3.entries()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r6 = r2
        L_0x0058:
            boolean r7 = r5.hasMoreElements()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            if (r7 == 0) goto L_0x00dc
            java.lang.Object r7 = r5.nextElement()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.util.zip.ZipEntry r7 = (java.util.zip.ZipEntry) r7     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r9.<init>()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.lang.String r11 = r20.getPath()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r9.append(r11)     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.lang.String r11 = java.io.File.separator     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r9.append(r11)     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.lang.String r11 = r7.getName()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r9.append(r11)     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            boolean r9 = r7.isDirectory()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            if (r9 == 0) goto L_0x008f
            r8.mkdirs()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            goto L_0x0058
        L_0x008f:
            java.io.File r9 = r8.getParentFile()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            boolean r11 = r9.exists()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            if (r11 != 0) goto L_0x009d
            r9.mkdirs()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            goto L_0x00a0
        L_0x009d:
            r8.createNewFile()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
        L_0x00a0:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00cf }
            java.io.InputStream r7 = r3.getInputStream(r7)     // Catch:{ all -> 0x00cf }
            r9.<init>(r7)     // Catch:{ all -> 0x00cf }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x00cd }
            r6.<init>(r8)     // Catch:{ all -> 0x00cd }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00cd }
            r7.<init>(r6, r0)     // Catch:{ all -> 0x00cd }
        L_0x00b3:
            int r2 = r9.read(r4, r10, r0)     // Catch:{ all -> 0x00ca }
            r6 = -1
            if (r2 == r6) goto L_0x00be
            r7.write(r4, r10, r2)     // Catch:{ all -> 0x00ca }
            goto L_0x00b3
        L_0x00be:
            r7.flush()     // Catch:{ all -> 0x00ca }
            r7.close()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r9.close()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
            r2 = r7
            r6 = r9
            goto L_0x0058
        L_0x00ca:
            r0 = move-exception
            r2 = r7
            goto L_0x00d1
        L_0x00cd:
            r0 = move-exception
            goto L_0x00d1
        L_0x00cf:
            r0 = move-exception
            r9 = r6
        L_0x00d1:
            if (r2 == 0) goto L_0x00d6
            r2.close()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
        L_0x00d6:
            if (r9 == 0) goto L_0x00db
            r9.close()     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
        L_0x00db:
            throw r0     // Catch:{ Exception -> 0x00e6, all -> 0x00e4 }
        L_0x00dc:
            r3.close()
            java.lang.String r0 = r20.getPath()
            return r0
        L_0x00e4:
            r0 = move-exception
            goto L_0x0100
        L_0x00e6:
            r0 = move-exception
            r2 = r3
            goto L_0x00ed
        L_0x00e9:
            r0 = move-exception
            r3 = r2
            goto L_0x0100
        L_0x00ec:
            r0 = move-exception
        L_0x00ed:
            boolean r3 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x00e9 }
            if (r3 == 0) goto L_0x00f5
            a(r20)     // Catch:{ all -> 0x00e9 }
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x00f5:
            a(r20)     // Catch:{ all -> 0x00e9 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "Error when decompressing zip file."
            r1.<init>(r3, r0)     // Catch:{ all -> 0x00e9 }
            throw r1     // Catch:{ all -> 0x00e9 }
        L_0x0100:
            if (r3 == 0) goto L_0x0105
            r3.close()
        L_0x0105:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.fd.a(java.io.File, java.io.File):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1 A[SYNTHETIC, Splitter:B:42:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6 A[Catch:{ IOException -> 0x00e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.InputStream r19, java.lang.String r20) throws java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f75874a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 88714(0x15a8a, float:1.24315E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75874a
            r15 = 1
            r16 = 88714(0x15a8a, float:1.24315E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            r2 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00dd }
            r3.<init>(r0)     // Catch:{ all -> 0x00dd }
        L_0x004b:
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00d1
            java.lang.String r4 = r0.getName()     // Catch:{ all -> 0x00db }
            boolean r0 = r0.isDirectory()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x0078
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00db }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r5.<init>()     // Catch:{ all -> 0x00db }
            r5.append(r1)     // Catch:{ all -> 0x00db }
            java.lang.String r6 = java.io.File.separator     // Catch:{ all -> 0x00db }
            r5.append(r6)     // Catch:{ all -> 0x00db }
            r5.append(r4)     // Catch:{ all -> 0x00db }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00db }
            r0.<init>(r4)     // Catch:{ all -> 0x00db }
            r0.mkdirs()     // Catch:{ all -> 0x00db }
            goto L_0x004b
        L_0x0078:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00db }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r5.<init>()     // Catch:{ all -> 0x00db }
            r5.append(r1)     // Catch:{ all -> 0x00db }
            java.lang.String r6 = java.io.File.separator     // Catch:{ all -> 0x00db }
            r5.append(r6)     // Catch:{ all -> 0x00db }
            r5.append(r4)     // Catch:{ all -> 0x00db }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00db }
            r0.<init>(r4)     // Catch:{ all -> 0x00db }
            java.io.File r4 = r0.getParentFile()     // Catch:{ all -> 0x00db }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x00db }
            if (r5 != 0) goto L_0x009f
            r4.mkdirs()     // Catch:{ all -> 0x00db }
            goto L_0x00ac
        L_0x009f:
            boolean r4 = r0.exists()     // Catch:{ all -> 0x00db }
            if (r4 == 0) goto L_0x00a9
            r0.delete()     // Catch:{ all -> 0x00db }
            goto L_0x00ac
        L_0x00a9:
            r0.createNewFile()     // Catch:{ all -> 0x00db }
        L_0x00ac:
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00db }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00db }
            r5.<init>(r0)     // Catch:{ all -> 0x00db }
            r4.<init>(r5)     // Catch:{ all -> 0x00db }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00ce }
        L_0x00ba:
            int r2 = r3.read(r0)     // Catch:{ all -> 0x00ce }
            r5 = -1
            if (r2 == r5) goto L_0x00c5
            r4.write(r0, r10, r2)     // Catch:{ all -> 0x00ce }
            goto L_0x00ba
        L_0x00c5:
            r4.flush()     // Catch:{ all -> 0x00ce }
            r4.close()     // Catch:{ all -> 0x00ce }
            r2 = r4
            goto L_0x004b
        L_0x00ce:
            r0 = move-exception
            r2 = r4
            goto L_0x00df
        L_0x00d1:
            r3.close()     // Catch:{ IOException -> 0x00da }
            if (r2 == 0) goto L_0x00d9
            r2.close()     // Catch:{ IOException -> 0x00da }
        L_0x00d9:
            return
        L_0x00da:
            return
        L_0x00db:
            r0 = move-exception
            goto L_0x00df
        L_0x00dd:
            r0 = move-exception
            r3 = r2
        L_0x00df:
            if (r3 == 0) goto L_0x00e4
            r3.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e4:
            if (r2 == 0) goto L_0x00e9
            r2.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.fd.a(java.io.InputStream, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (r1 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1 A[SYNTHETIC, Splitter:B:27:0x00d1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(@android.support.annotation.NonNull java.lang.String r21, @android.support.annotation.NonNull java.lang.String r22, @android.support.annotation.NonNull java.util.List<java.lang.String> r23) {
        /*
            r0 = r21
            r1 = r22
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r23
            com.meituan.robust.ChangeQuickRedirect r6 = f75874a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 88711(0x15a87, float:1.2431E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r23
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f75874a
            r17 = 1
            r18 = 88711(0x15a87, float:1.2431E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0056:
            boolean r3 = r23.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x005e
            return r4
        L_0x005e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = java.io.File.separator
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch:{ Exception -> 0x00d8, all -> 0x00cd }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00d8, all -> 0x00cd }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d8, all -> 0x00cd }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00cd }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00d8, all -> 0x00cd }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00d8, all -> 0x00cd }
            java.util.Iterator r2 = r23.iterator()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
        L_0x0085:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            if (r3 == 0) goto L_0x0085
            boolean r3 = r4.isDirectory()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            if (r3 == 0) goto L_0x00bb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            r3.<init>()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            java.lang.String r5 = r4.getName()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            r3.append(r5)     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            r3.append(r5)     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            a((java.util.zip.ZipOutputStream) r1, (java.io.File) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            goto L_0x0085
        L_0x00bb:
            java.lang.String r3 = ""
            a((java.util.zip.ZipOutputStream) r1, (java.io.File) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
            goto L_0x0085
        L_0x00c1:
            r1.flush()     // Catch:{ Exception -> 0x00d9, all -> 0x00cb }
        L_0x00c4:
            r1.closeEntry()     // Catch:{ IOException -> 0x00dc }
            r1.close()     // Catch:{ IOException -> 0x00dc }
            goto L_0x00dc
        L_0x00cb:
            r0 = move-exception
            goto L_0x00cf
        L_0x00cd:
            r0 = move-exception
            r1 = r4
        L_0x00cf:
            if (r1 == 0) goto L_0x00d7
            r1.closeEntry()     // Catch:{ IOException -> 0x00d7 }
            r1.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            throw r0
        L_0x00d8:
            r1 = r4
        L_0x00d9:
            if (r1 == 0) goto L_0x00dc
            goto L_0x00c4
        L_0x00dc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.fd.a(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        ZipOutputStream zipOutputStream2 = zipOutputStream;
        File file2 = file;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{zipOutputStream2, file2, str2}, null, f75874a, true, 88712, new Class[]{ZipOutputStream.class, File.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{zipOutputStream2, file2, str2}, null, f75874a, true, 88712, new Class[]{ZipOutputStream.class, File.class, String.class}, Void.TYPE);
        } else if (file.isDirectory()) {
            for (File file3 : file.listFiles()) {
                if (file3 != null) {
                    if (file3.isDirectory()) {
                        str2 = file.getName() + File.separator + file3.getName() + File.separator;
                    }
                    a(zipOutputStream2, file3, str2);
                }
            }
        } else {
            byte[] bArr = new byte[2048];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            zipOutputStream2.putNextEntry(new ZipEntry(str2 + file.getName()));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    zipOutputStream2.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    return;
                }
            }
        }
    }
}
