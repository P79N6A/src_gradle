package com.bytedance.apm.battery.c;

import android.text.TextUtils;
import com.bytedance.apm.battery.b.b;
import com.bytedance.apm.k.c;
import com.bytedance.apm.k.m;
import java.util.List;

public final class e extends c {
    public e() {
        super("cpu_active_time");
    }

    /* access modifiers changed from: protected */
    public final long a() {
        long b2 = c.b();
        if (b2 <= 0) {
            return 0;
        }
        return b2 * 10;
    }

    public final void a(b bVar, List<com.bytedance.apm.f.b> list, int i, int i2) {
        String str;
        b bVar2 = bVar;
        List<com.bytedance.apm.f.b> list2 = list;
        String str2 = "cpu_active_time";
        int i3 = i;
        String str3 = null;
        long j = 0;
        int i4 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i5 = i2;
        while (i3 <= i5) {
            com.bytedance.apm.f.b bVar3 = list2.get(i3);
            if (!TextUtils.equals(str2, bVar3.f18984d) || bVar3.g < 0) {
                str = str2;
            } else {
                String str4 = bVar3.l;
                if (str3 != null && !TextUtils.equals(str3, str4)) {
                    if (j > 0) {
                        j2 += list2.get(i4).g - j;
                    }
                    j = 0;
                    j4 = 0;
                    j5 = 0;
                }
                if (bVar3.a()) {
                    if (j == 0) {
                        j = bVar3.g;
                        if (j4 > 0) {
                            long j6 = j - j4;
                            if (j6 > 0) {
                                j3 += j6;
                                j4 = 0;
                            }
                        }
                    }
                    str = str2;
                    str3 = str4;
                    i4 = i3;
                } else {
                    if (!bVar3.f18982b || j <= 0 || j5 != 0) {
                        str = str2;
                    } else {
                        long j7 = bVar3.g;
                        long j8 = j7 - j;
                        if (j8 > 0) {
                            j2 += j8;
                            str = str2;
                            j = 0;
                            j7 = 0;
                        } else {
                            str = str2;
                        }
                        j5 = j7;
                        j4 = bVar3.g;
                    }
                    str3 = str4;
                }
            }
            i3++;
            str2 = str;
            i5 = i2;
        }
        if (j > 0) {
            j2 += list2.get(i4).g - j;
        }
        m mVar = new m(Long.valueOf(j3), Long.valueOf(j2));
        bVar2.f18921e = ((Long) mVar.f19039a).longValue();
        bVar2.j = ((Long) mVar.f19040b).longValue();
    }
}
