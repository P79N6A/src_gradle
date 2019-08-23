package com.ss.android.ugc.effectmanager.common.a;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.b.b;
import com.ss.android.ugc.effectmanager.common.f.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static b f77271a;

    /* renamed from: b  reason: collision with root package name */
    public static List<String> f77272b = Arrays.asList(new String[]{"52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781"});

    /* renamed from: c  reason: collision with root package name */
    public static List<String> f77273c = Arrays.asList(new String[]{"52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226"});

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<String> f77274d;
    private static a g;
    private static String j;
    private final com.ss.android.ugc.effectmanager.common.b.a h;
    private final int i = 62914560;

    public final String a(String str) {
        return super.a(str);
    }

    public final InputStream b(String str) {
        return super.b(str);
    }

    public final boolean c(String str) {
        return super.c(str);
    }

    public final boolean d(String str) {
        return this.h.c(str);
    }

    private a(g gVar) {
        super(gVar);
        try {
            this.h = com.ss.android.ugc.effectmanager.common.b.a.a(this.f77275e.i, 0, 1, 62914560);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str) || !str.equals(j)) {
            return false;
        }
        return true;
    }

    public static String e(String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (!(c2 == '_' || c2 == '-' || ((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9')))) {
                charArray[i2] = '_';
            }
        }
        return new String(charArray);
    }

    public final void a(Effect effect) throws Exception {
        d.a(effect.zipPath, effect.unzipPath);
        this.h.b(new File(effect.unzipPath).getName());
        f77271a.a(effect.id, effect.effect_id);
        String[] split = effect.zipPath.split(File.separator);
        this.h.a(split[split.length - 1]);
    }

    public static a a(g gVar) {
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    j = gVar.j;
                    f77274d = gVar.t;
                    File file = gVar.i;
                    ArrayList<String> arrayList = f77274d;
                    if (file != null && file.exists() && file.isDirectory() && file.list() != null && file.list().length > 0 && !new File(file, "journal").exists()) {
                        a(file, arrayList);
                    }
                    g = new a(gVar);
                    f77271a = new b(gVar.i);
                }
            }
        }
        return g;
    }

    public final void a(String str, String str2) {
        super.a(str, str2);
    }

    private static void a(File file, ArrayList<String> arrayList) {
        if (file != null && file.exists() && file.isDirectory()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (!file2.isDirectory()) {
                            file2.delete();
                        } else if (arrayList != null && !arrayList.contains(file2.getName())) {
                            d.a(file2);
                        }
                    }
                }
            } else {
                d.a(file);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c A[SYNTHETIC, Splitter:B:46:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0081 A[Catch:{ IOException -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0086 A[Catch:{ IOException -> 0x0089 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.io.InputStream r19, long r20, com.ss.android.ugc.effectmanager.effect.b.d r22) {
        /*
            r15 = this;
            r1 = r19
            r2 = r20
            r0 = r22
            r4 = 0
            r5 = r15
            com.ss.android.ugc.effectmanager.common.b.a r6 = r5.h     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r7 = -1
            r9 = r18
            com.ss.android.ugc.effectmanager.common.b.a$a r6 = r6.a((java.lang.String) r9, (long) r7)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r7 = 0
            java.io.OutputStream r8 = r6.a(r7)     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r9 = 0
            r11 = r9
        L_0x001e:
            int r13 = r1.read(r4)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            if (r13 <= 0) goto L_0x0043
            r8.write(r4, r7, r13)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            long r13 = (long) r13     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            long r11 = r11 + r13
            if (r0 == 0) goto L_0x001e
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x001e
            int r13 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x001e
            float r13 = (float) r11     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r14 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 * r14
            float r14 = (float) r2     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            float r13 = r13 / r14
            r14 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r14
            int r13 = (int) r13     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r0.a(r13, r2)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            goto L_0x001e
        L_0x0043:
            r8.close()     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            com.ss.android.ugc.effectmanager.common.b.b r0 = f77271a     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r2 = r16
            r3 = r17
            r0.a(r2, r3)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            if (r1 == 0) goto L_0x0054
            r19.close()     // Catch:{ IOException -> 0x005f }
        L_0x0054:
            if (r8 == 0) goto L_0x0059
            r8.close()     // Catch:{ IOException -> 0x005f }
        L_0x0059:
            if (r6 == 0) goto L_0x0060
            r6.a()     // Catch:{ IOException -> 0x005f }
            goto L_0x0060
        L_0x005f:
            return
        L_0x0060:
            return
        L_0x0061:
            r0 = move-exception
            goto L_0x007a
        L_0x0063:
            r0 = move-exception
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            r8 = r4
            goto L_0x007a
        L_0x0068:
            r0 = move-exception
            r8 = r4
        L_0x006a:
            r4 = r6
            goto L_0x0072
        L_0x006c:
            r0 = move-exception
            r6 = r4
            r8 = r6
            goto L_0x007a
        L_0x0070:
            r0 = move-exception
            r8 = r4
        L_0x0072:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0078 }
            r2.<init>(r0)     // Catch:{ all -> 0x0078 }
            throw r2     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            r6 = r4
        L_0x007a:
            if (r1 == 0) goto L_0x007f
            r19.close()     // Catch:{ IOException -> 0x0089 }
        L_0x007f:
            if (r8 == 0) goto L_0x0084
            r8.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0084:
            if (r6 == 0) goto L_0x0089
            r6.a()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.a.a.a(java.lang.String, java.lang.String, java.lang.String, java.io.InputStream, long, com.ss.android.ugc.effectmanager.effect.b.d):void");
    }
}
