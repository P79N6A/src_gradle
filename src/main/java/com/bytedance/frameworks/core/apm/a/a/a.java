package com.bytedance.frameworks.core.apm.a.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.d;
import com.bytedance.apm.f.e;
import com.bytedance.apm.k.i;
import com.bytedance.frameworks.core.apm.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class a<T extends e> extends com.bytedance.frameworks.core.apm.a.a<T> implements a.C0010a<T> {

    /* renamed from: a  reason: collision with root package name */
    private long f2125a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f2126b;

    private synchronized long g() {
        return b("is_sampled = 1", null);
    }

    public final synchronized long f() {
        if (c.d()) {
            String[] strArr = {getClass().getSimpleName() + " -> getLogSampledCount, mTotalSampleCount: " + this.f2125a + " , mFastReadSampleTimes: " + this.f2126b};
        }
        if (this.f2125a >= 0) {
            if (this.f2126b <= 10) {
                this.f2126b++;
            }
        }
        this.f2125a = g();
        this.f2126b = 0;
        return this.f2125a;
    }

    public final synchronized int c(List<Long> list) {
        if (i.a(list)) {
            return -1;
        }
        int a2 = a(i.a(list, ","));
        this.f2125a -= (long) a2;
        return a2;
    }

    public final synchronized int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return a("_id in ( " + str + " )", null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(T r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = -1
            if (r9 != 0) goto L_0x0007
            monitor-exit(r8)
            return r0
        L_0x0007:
            android.content.ContentValues r2 = r8.a(r9)     // Catch:{ Exception -> 0x0037 }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r8)
            return r0
        L_0x000f:
            long r2 = r8.a((android.content.ContentValues) r2)     // Catch:{ Exception -> 0x002a }
            boolean r9 = r9.l     // Catch:{ Exception -> 0x002a }
            if (r9 == 0) goto L_0x0028
            long r4 = r8.f2125a     // Catch:{ Exception -> 0x002a }
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0021
            r8.f2125a = r6     // Catch:{ Exception -> 0x002a }
        L_0x0021:
            long r4 = r8.f2125a     // Catch:{ Exception -> 0x002a }
            r6 = 1
            long r4 = r4 + r6
            r8.f2125a = r4     // Catch:{ Exception -> 0x002a }
        L_0x0028:
            monitor-exit(r8)
            return r2
        L_0x002a:
            r9 = move-exception
            com.bytedance.apm.d r2 = com.bytedance.apm.d.a()     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "AbsLogDao: insertLocalLog"
        L_0x0031:
            r2.a(r9, r3)     // Catch:{ all -> 0x0035 }
            goto L_0x003f
        L_0x0035:
            r9 = move-exception
            goto L_0x0041
        L_0x0037:
            r9 = move-exception
            com.bytedance.apm.d r2 = com.bytedance.apm.d.a()     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "AbsLogDao: insertLocalLog"
            goto L_0x0031
        L_0x003f:
            monitor-exit(r8)
            return r0
        L_0x0041:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.a.a.a.a(com.bytedance.apm.f.e):long");
    }

    public final synchronized void b(List<T> list) {
        if (!i.a(list)) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                e eVar = (e) list.get(i);
                ContentValues contentValues = null;
                try {
                    contentValues = a(eVar);
                } catch (Exception e2) {
                    d.a().a(e2, "AbsLogDao: insertLocalLogBatch");
                }
                if (contentValues != null) {
                    arrayList.add(contentValues);
                    if (eVar.l) {
                        if (this.f2125a < 0) {
                            this.f2125a = 0;
                        }
                        this.f2125a++;
                    }
                }
            }
            a((List<ContentValues>) arrayList);
        }
    }

    public final synchronized List<? extends e> a(List<String> list, int i) {
        String str;
        String[] strArr;
        str = "is_sampled = ? ";
        try {
            int i2 = 0;
            if (!i.a(list)) {
                str = str + " AND type IN ( " + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + " ) ";
                strArr = new String[(list.size() + 1)];
                strArr[0] = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                while (i2 < list.size()) {
                    int i3 = i2 + 1;
                    strArr[i3] = list.get(i2);
                    i2 = i3;
                }
            } else {
                strArr = new String[]{PushConstants.PUSH_TYPE_THROUGH_MESSAGE};
            }
        } catch (Throwable th) {
            d.a().a(th, "AbsLogDao: getLogSampled");
            return Collections.emptyList();
        }
        return a(str, strArr, "_id ASC  LIMIT " + i, this);
    }

    public final synchronized List<T> a(long j, long j2, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        try {
            String[] strArr = {String.valueOf(j), String.valueOf(j2), str};
            String str3 = "";
            if (str2.split(",").length == 2) {
                str3 = " LIMIT " + r5[1] + " OFFSET " + r5[0];
            }
            return a("timestamp >= ? AND timestamp <= ?  AND type2 = ? ", strArr, "_id ASC " + str3, this);
        } catch (Throwable th) {
            d.a().a(th, "AbsLogDao: getLegacyLog");
            return Collections.emptyList();
        }
    }

    public final synchronized List<T> a(long j, long j2, List<String> list, String str) {
        String str2;
        String[] strArr;
        String[] strArr2;
        String str3;
        str2 = "timestamp >= ? AND timestamp <= ? ";
        try {
            if (!i.a(list)) {
                str2 = str2 + " AND type2 IN ( " + TextUtils.join(",", Collections.nCopies(list.size(), "?")) + " )";
                strArr = new String[(list.size() + 2)];
                strArr[0] = String.valueOf(j);
                strArr[1] = String.valueOf(j2);
                for (int i = 0; i < list.size(); i++) {
                    strArr[i + 2] = list.get(i);
                }
            } else {
                strArr = new String[]{String.valueOf(j), String.valueOf(j2)};
            }
            if (str != null) {
                strArr2 = str.split(",");
            } else {
                strArr2 = new String[0];
            }
            str3 = "";
            if (strArr2.length == 2) {
                str3 = " LIMIT " + strArr2[1] + " OFFSET " + strArr2[0];
            }
        } catch (Throwable th) {
            d.a().a(th, "AbsLogDao: getLocalLog");
            return Collections.emptyList();
        }
        return a(str2, strArr, "_id ASC " + str3, this);
    }
}
