package com.ss.android.ugc.effectmanager.common.f;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class b {
    public static boolean a(Effect effect) {
        if (effect != null && !a(effect.file_url)) {
            return true;
        }
        return false;
    }

    public static boolean a(UrlModel urlModel) {
        if (urlModel == null || urlModel.url_list == null || urlModel.url_list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|(2:6|(3:8|(2:14|42)|15)(1:41))|(2:17|18)|19|20|21) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0051 A[SYNTHETIC, Splitter:B:33:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0058 A[SYNTHETIC, Splitter:B:37:0x0058] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a(java.io.InputStream r9, java.lang.String r10, long r11, com.ss.android.ugc.effectmanager.effect.b.d r13) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x004a }
            r1.<init>(r10)     // Catch:{ IOException -> 0x004a }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004a }
            r2.<init>(r1)     // Catch:{ IOException -> 0x004a }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r3 = 0
            r4 = 0
        L_0x0011:
            int r5 = r9.read(r0)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r6 = -1
            if (r5 == r6) goto L_0x0039
            int r4 = r4 + r5
            if (r13 == 0) goto L_0x0035
            long r6 = (long) r4     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0035
            r6 = 0
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0035
            float r6 = (float) r4     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r7
            float r7 = (float) r11     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            float r6 = r6 / r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r7
            int r6 = (int) r6     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r13.a(r6, r11)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
        L_0x0035:
            r2.write(r0, r3, r5)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            goto L_0x0011
        L_0x0039:
            if (r9 == 0) goto L_0x003e
            r9.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r2.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r1
        L_0x0042:
            r10 = move-exception
            r0 = r2
            goto L_0x004f
        L_0x0045:
            r11 = move-exception
            r0 = r2
            goto L_0x004b
        L_0x0048:
            r10 = move-exception
            goto L_0x004f
        L_0x004a:
            r11 = move-exception
        L_0x004b:
            com.ss.android.ugc.effectmanager.common.f.d.b(r10)     // Catch:{ all -> 0x0048 }
            throw r11     // Catch:{ all -> 0x0048 }
        L_0x004f:
            if (r9 == 0) goto L_0x0056
            r9.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.f.b.a(java.io.InputStream, java.lang.String, long, com.ss.android.ugc.effectmanager.effect.b.d):java.io.File");
    }
}
