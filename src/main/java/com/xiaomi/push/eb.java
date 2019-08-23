package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class eb {

    /* renamed from: a  reason: collision with root package name */
    private static String f81963a = "/MiPushLog";

    /* renamed from: a  reason: collision with other field name */
    private int f292a;
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a  reason: collision with other field name */
    private final SimpleDateFormat f293a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<File> f294a = new ArrayList<>();

    /* renamed from: a  reason: collision with other field name */
    private boolean f295a;

    /* renamed from: b  reason: collision with root package name */
    private int f81964b = 2097152;

    /* renamed from: b  reason: collision with other field name */
    private String f296b;

    /* renamed from: c  reason: collision with root package name */
    private String f81965c;

    eb() {
    }

    private void a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z = false;
        while (read != -1 && !z) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= read || !matcher.find(i)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.f296b.length() + start);
                if (this.f295a) {
                    if (substring.compareTo(this.f81965c) > 0) {
                        read = start;
                        z = true;
                        break;
                    }
                } else if (substring.compareTo(this.f296b) >= 0) {
                    this.f295a = true;
                    i2 = start;
                }
                int indexOf = str.indexOf(10, start);
                if (indexOf == -1) {
                    indexOf = this.f296b.length();
                }
                i = start + indexOf;
            }
            if (this.f295a) {
                int i3 = read - i2;
                this.f292a += i3;
                if (z) {
                    bufferedWriter.write(cArr, i2, i3);
                    return;
                }
                bufferedWriter.write(cArr, i2, i3);
                if (this.f292a > this.f81964b) {
                    return;
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.File r8) {
        /*
            r7 = this;
            java.lang.String r0 = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r1 = 0
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00b6, all -> 0x00b3 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00b6, all -> 0x00b3 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00b6, all -> 0x00b3 }
            r4.<init>(r8)     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00b6, all -> 0x00b3 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00b6, all -> 0x00b3 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00b6, all -> 0x00b3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = "model :"
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = "; os :"
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = "; uid :"
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = com.xiaomi.push.service.ba.a()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = "; lng :"
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = "; sdk :38"
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = "; andver :"
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r3 = "\n"
            r8.append(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r8 = r8.toString()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r2.write(r8)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r8 = 0
            r7.f292a = r8     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.util.ArrayList<java.io.File> r8 = r7.f294a     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
        L_0x006f:
            boolean r3 = r8.hasNext()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            if (r3 == 0) goto L_0x009a
            java.lang.Object r3 = r8.next()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.io.File r3 = (java.io.File) r3     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r6.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r7.a(r4, r2, r0)     // Catch:{ FileNotFoundException -> 0x0097, IOException -> 0x0094, all -> 0x0092 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0097, IOException -> 0x0094, all -> 0x0092 }
            r1 = r4
            goto L_0x006f
        L_0x0092:
            r8 = move-exception
            goto L_0x00ad
        L_0x0094:
            r8 = move-exception
            r1 = r4
            goto L_0x00b8
        L_0x0097:
            r8 = move-exception
            r1 = r4
            goto L_0x00d3
        L_0x009a:
            com.xiaomi.push.dt r8 = com.xiaomi.push.dt.a()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            java.lang.String r8 = r8.c()     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
            r2.write(r8)     // Catch:{ FileNotFoundException -> 0x00b1, IOException -> 0x00af }
        L_0x00a5:
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            return
        L_0x00ac:
            r4 = r1
        L_0x00ad:
            r1 = r2
            goto L_0x00eb
        L_0x00af:
            r8 = move-exception
            goto L_0x00b8
        L_0x00b1:
            r8 = move-exception
            goto L_0x00d3
        L_0x00b3:
            r8 = move-exception
            r4 = r1
            goto L_0x00eb
        L_0x00b6:
            r8 = move-exception
            r2 = r1
        L_0x00b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r0.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "LOG: filter error = "
            r0.append(r3)     // Catch:{ all -> 0x00e9 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00e9 }
            r0.append(r8)     // Catch:{ all -> 0x00e9 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00e9 }
        L_0x00cd:
            com.xiaomi.channel.commonutils.logger.b.c(r8)     // Catch:{ all -> 0x00e9 }
            goto L_0x00a5
        L_0x00d1:
            r8 = move-exception
            r2 = r1
        L_0x00d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r0.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "LOG: filter error = "
            r0.append(r3)     // Catch:{ all -> 0x00e9 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00e9 }
            r0.append(r8)     // Catch:{ all -> 0x00e9 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00e9 }
            goto L_0x00cd
        L_0x00e9:
            r8 = move-exception
            goto L_0x00ac
        L_0x00eb:
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.eb.a(java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public eb m199a(File file) {
        if (file.exists()) {
            this.f294a.add(file);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public eb a(Date date, Date date2) {
        String format;
        if (date.after(date2)) {
            this.f296b = this.f293a.format(date2);
            format = this.f293a.format(date);
        } else {
            this.f296b = this.f293a.format(date);
            format = this.f293a.format(date2);
        }
        this.f81965c = format;
        return this;
    }

    /* access modifiers changed from: package-private */
    public File a(Context context, Date date, Date date2, File file) {
        File file2;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            file2 = context.getFilesDir();
            a(new File(file2, "xmsf.log.1"));
            a(new File(file2, "xmsf.log"));
        } else {
            File file3 = new File(context.getExternalFilesDir(null) + f81963a);
            a(new File(file3, "log0.txt"));
            a(new File(file3, "log1.txt"));
            file2 = file3;
        }
        if (!file2.isDirectory()) {
            return null;
        }
        File file4 = new File(file, date.getTime() + "-" + date2.getTime() + ".zip");
        if (file4.exists()) {
            return null;
        }
        a(date, date2);
        long currentTimeMillis = System.currentTimeMillis();
        File file5 = new File(file, "log.txt");
        a(file5);
        b.c("LOG: filter cost = " + (System.currentTimeMillis() - currentTimeMillis));
        if (!file5.exists()) {
            return null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        z.a(file4, file5);
        b.c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
        file5.delete();
        if (!file4.exists()) {
            return null;
        }
        return file4;
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        if (i != 0) {
            this.f81964b = i;
        }
    }
}
