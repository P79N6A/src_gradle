package com.huawei.android.pushagent.b.d.a;

import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.regex.PatternSyntaxException;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public long f25075a;

    /* renamed from: b  reason: collision with root package name */
    public long f25076b;

    /* renamed from: c  reason: collision with root package name */
    public long f25077c;

    /* renamed from: d  reason: collision with root package name */
    public long f25078d;

    public a() {
    }

    public a(long j, long j2) {
        this.f25075a = j;
        this.f25076b = j2;
    }

    public String a() {
        StringBuffer stringBuffer = new StringBuffer(PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION);
        stringBuffer.append(";");
        stringBuffer.append(this.f25075a);
        stringBuffer.append(";");
        stringBuffer.append(this.f25076b);
        stringBuffer.append(";");
        stringBuffer.append(this.f25077c);
        stringBuffer.append(";");
        stringBuffer.append(this.f25078d);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(long r10) {
        /*
            r9 = this;
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "enter FlowSimpleControl::canApply(num:"
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = ", curVol:"
            r1.append(r2)
            long r2 = r9.f25077c
            r1.append(r2)
            java.lang.String r2 = ", maxVol:"
            r1.append(r2)
            long r2 = r9.f25076b
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r0.longValue()
            long r3 = r9.f25078d
            r5 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0091
            long r1 = r0.longValue()
            long r3 = r9.f25078d
            long r1 = r1 - r3
            long r3 = r9.f25075a
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x004e
            goto L_0x0091
        L_0x004e:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            long r2 = r9.f25078d     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            r1.setTimeInMillis(r2)     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            r2 = 2
            int r3 = r1.get(r2)     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            long r7 = r0.longValue()     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            r1.setTimeInMillis(r7)     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            int r1 = r1.get(r2)     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            if (r3 == r1) goto L_0x00d1
            long r0 = r0.longValue()     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            r9.f25078d = r0     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            r9.f25077c = r5     // Catch:{ IllegalArgumentException -> 0x0086, ArrayIndexOutOfBoundsException -> 0x007e, Exception -> 0x0076 }
            goto L_0x00d1
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r2 = r0.toString()
            goto L_0x008d
        L_0x007e:
            r0 = move-exception
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r2 = r0.toString()
            goto L_0x008d
        L_0x0086:
            r0 = move-exception
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r2 = r0.toString()
        L_0x008d:
            com.huawei.android.pushagent.utils.a.e.c(r1, r2, r0)
            goto L_0x00d1
        L_0x0091:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " fistrControlTime:"
            r2.<init>(r3)
            java.util.Date r3 = new java.util.Date
            long r7 = r9.f25078d
            r3.<init>(r7)
            r2.append(r3)
            java.lang.String r3 = " interval:"
            r2.append(r3)
            long r3 = r0.longValue()
            long r7 = r9.f25078d
            long r3 = r3 - r7
            r2.append(r3)
            java.lang.String r3 = " statInterval:"
            r2.append(r3)
            long r3 = r9.f25075a
            r2.append(r3)
            java.lang.String r3 = " change fistrControlTime to cur"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.a(r1, r2)
            long r0 = r0.longValue()
            r9.f25078d = r0
            r9.f25077c = r5
        L_0x00d1:
            long r0 = r9.f25077c
            long r0 = r0 + r10
            long r10 = r9.f25076b
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00dc
            r10 = 1
            return r10
        L_0x00dc:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.d.a.a.a(long):boolean");
    }

    public boolean a(b bVar) {
        if (!(bVar instanceof a)) {
            return false;
        }
        a aVar = (a) bVar;
        return this.f25075a == aVar.f25075a && this.f25076b == aVar.f25076b;
    }

    public boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                e.b("PushLogAC2815", "in loadFromString, info is empty!");
                return false;
            }
            e.a("PushLogAC2815", "begin to parse:" + str);
            String[] split = str.split(";");
            if (split.length == 0) {
                return false;
            }
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 4) {
                if (parseInt == split.length - 1) {
                    this.f25075a = Long.parseLong(split[1]);
                    this.f25076b = Long.parseLong(split[2]);
                    this.f25077c = Long.parseLong(split[3]);
                    this.f25078d = Long.parseLong(split[4]);
                    return true;
                }
            }
            e.d("PushLogAC2815", "in fileNum:" + parseInt + ", but need 4" + " parse " + str + " failed");
            return false;
        } catch (Exception | NumberFormatException | PatternSyntaxException unused) {
        }
    }

    public boolean b(long j) {
        this.f25077c += j;
        return true;
    }
}
