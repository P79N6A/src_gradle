package com.ss.android.ugc.aweme.profile.d;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Nonnull;

public class w extends ArrayList<w> {
    public static ChangeQuickRedirect changeQuickRedirect;
    String code;
    String name;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61503a;

        /* renamed from: b  reason: collision with root package name */
        public String f61504b;

        private static int a(String str) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{str}, null, f61503a, true, 70017, new Class[]{String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, null, f61503a, true, 70017, new Class[]{String.class}, Integer.TYPE)).intValue();
            }
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            int i2 = 0;
            while (i < length && charArray[i] == ' ') {
                i2++;
                i++;
            }
            return i2 / 2;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.d.w a(java.io.InputStream r18) throws java.io.IOException {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f61503a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
                r7[r9] = r3
                java.lang.Class<com.ss.android.ugc.aweme.profile.d.w> r8 = com.ss.android.ugc.aweme.profile.d.w.class
                r5 = 0
                r6 = 70015(0x1117f, float:9.8112E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0039
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f61503a
                r13 = 0
                r14 = 70015(0x1117f, float:9.8112E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
                r15[r9] = r0
                java.lang.Class<com.ss.android.ugc.aweme.profile.d.w> r16 = com.ss.android.ugc.aweme.profile.d.w.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                com.ss.android.ugc.aweme.profile.d.w r0 = (com.ss.android.ugc.aweme.profile.d.w) r0
                return r0
            L_0x0039:
                com.ss.android.ugc.aweme.profile.d.w r1 = new com.ss.android.ugc.aweme.profile.d.w
                r1.<init>()
                java.io.BufferedReader r2 = new java.io.BufferedReader
                java.io.InputStreamReader r3 = new java.io.InputStreamReader
                r3.<init>(r0)
                r2.<init>(r3)
                r0 = -1
                r3 = r17
                r3.a(r1, r2, r0)     // Catch:{ IOException -> 0x004e, all -> 0x0052 }
            L_0x004e:
                r2.close()     // Catch:{ IOException -> 0x0058 }
                goto L_0x0058
            L_0x0052:
                r0 = move-exception
                r1 = r0
                r2.close()     // Catch:{ IOException -> 0x0057 }
            L_0x0057:
                throw r1
            L_0x0058:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.d.w.a.a(java.io.InputStream):com.ss.android.ugc.aweme.profile.d.w");
        }

        private void a(w wVar, BufferedReader bufferedReader, int i) throws IOException {
            w wVar2 = wVar;
            BufferedReader bufferedReader2 = bufferedReader;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{wVar2, bufferedReader2, Integer.valueOf(i)}, this, f61503a, false, 70016, new Class[]{w.class, BufferedReader.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{wVar2, bufferedReader2, Integer.valueOf(i)}, this, f61503a, false, 70016, new Class[]{w.class, BufferedReader.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            while (true) {
                String str = this.f61504b;
                this.f61504b = null;
                if (str == null) {
                    str = bufferedReader.readLine();
                }
                if (str != null) {
                    int a2 = a(str);
                    int i3 = i2 + 1;
                    if (i3 == a2) {
                        String[] split = str.trim().split("#");
                        w wVar3 = new w(split[0], split[1]);
                        wVar2.add(wVar3);
                        a(wVar3, bufferedReader2, i3);
                    } else if (i2 == a2) {
                        this.f61504b = str;
                        return;
                    } else if (i2 > a2) {
                        this.f61504b = str;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public w() {
        this.name = "";
        this.code = "";
    }

    public String getCode() {
        if (this.code == null) {
            return "";
        }
        return this.code;
    }

    public String getName() {
        if (this.name == null) {
            return "";
        }
        return this.name;
    }

    public w(@NonNull String str) {
        this.name = str;
        this.code = "";
    }

    public w(@NonNull String str, @Nonnull String str2) {
        this.code = str;
        this.name = str2;
    }

    public void setValue(String str, String str2) {
        this.code = str;
        this.name = str2;
    }
}
