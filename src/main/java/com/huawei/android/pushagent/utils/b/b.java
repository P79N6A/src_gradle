package com.huawei.android.pushagent.utils.b;

import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.b.a;
import java.lang.reflect.Field;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static a.C0292a f25180a = a.C0292a.MODE_SUPPORT_UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    private static a f25181b;

    public static synchronized a a() {
        a aVar;
        synchronized (b.class) {
            b();
            f25181b = f25180a == a.C0292a.MODE_SUPPORT_MTK_GEMINI ? d.a() : c.a();
            aVar = f25181b;
        }
        return aVar;
    }

    private static synchronized void a(a.C0292a aVar) {
        synchronized (b.class) {
            f25180a = aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (f25180a != com.huawei.android.pushagent.utils.b.a.C0292a.MODE_SUPPORT_MTK_GEMINI) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean b() {
        /*
            java.lang.Class<com.huawei.android.pushagent.utils.b.b> r0 = com.huawei.android.pushagent.utils.b.b.class
            monitor-enter(r0)
            r1 = 0
            com.huawei.android.pushagent.utils.b.a$a r2 = f25180a     // Catch:{ all -> 0x0063 }
            com.huawei.android.pushagent.utils.b.a$a r3 = com.huawei.android.pushagent.utils.b.a.C0292a.MODE_SUPPORT_UNKNOWN     // Catch:{ all -> 0x0063 }
            r4 = 1
            if (r2 == r3) goto L_0x0018
            com.huawei.android.pushagent.utils.b.a$a r2 = f25180a     // Catch:{ all -> 0x0063 }
            com.huawei.android.pushagent.utils.b.a$a r3 = com.huawei.android.pushagent.utils.b.a.C0292a.MODE_SUPPORT_HW_GEMINI     // Catch:{ all -> 0x0063 }
            if (r2 == r3) goto L_0x0061
            com.huawei.android.pushagent.utils.b.a$a r2 = f25180a     // Catch:{ all -> 0x0063 }
            com.huawei.android.pushagent.utils.b.a$a r3 = com.huawei.android.pushagent.utils.b.a.C0292a.MODE_SUPPORT_MTK_GEMINI     // Catch:{ all -> 0x0063 }
            if (r2 != r3) goto L_0x0060
            goto L_0x0061
        L_0x0018:
            boolean r2 = d()     // Catch:{ Exception -> 0x004a, Error -> 0x0033 }
            if (r2 == 0) goto L_0x0024
            com.huawei.android.pushagent.utils.b.a$a r2 = com.huawei.android.pushagent.utils.b.a.C0292a.MODE_SUPPORT_MTK_GEMINI     // Catch:{ Exception -> 0x004a, Error -> 0x0033 }
        L_0x0020:
            a(r2)     // Catch:{ Exception -> 0x004a, Error -> 0x0033 }
            goto L_0x0061
        L_0x0024:
            boolean r2 = c()     // Catch:{ Exception -> 0x004a, Error -> 0x0033 }
            if (r2 == 0) goto L_0x002d
            com.huawei.android.pushagent.utils.b.a$a r2 = com.huawei.android.pushagent.utils.b.a.C0292a.MODE_SUPPORT_HW_GEMINI     // Catch:{ Exception -> 0x004a, Error -> 0x0033 }
            goto L_0x0020
        L_0x002d:
            com.huawei.android.pushagent.utils.b.a$a r2 = com.huawei.android.pushagent.utils.b.a.C0292a.MODE_NOT_SUPPORT_GEMINI     // Catch:{ Exception -> 0x004a, Error -> 0x0033 }
            a(r2)     // Catch:{ Exception -> 0x004a, Error -> 0x0033 }
            goto L_0x0060
        L_0x0033:
            r2 = move-exception
            java.lang.String r3 = "mutiCardFactory"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r4.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0063 }
            r4.append(r2)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0063 }
        L_0x0046:
            com.huawei.android.pushagent.utils.a.e.d(r3, r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0060
        L_0x004a:
            r2 = move-exception
            java.lang.String r3 = "mutiCardFactory"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = " "
            r4.<init>(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0063 }
            r4.append(r2)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0063 }
            goto L_0x0046
        L_0x0060:
            r4 = 0
        L_0x0061:
            monitor-exit(r0)
            return r4
        L_0x0063:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.b.b.b():boolean");
    }

    public static boolean c() {
        StringBuilder sb;
        String str;
        String str2;
        boolean z = false;
        try {
            Object b2 = c.b();
            if (b2 != null) {
                z = ((Boolean) b2.getClass().getMethod("isMultiSimEnabled", new Class[0]).invoke(b2, new Object[0])).booleanValue();
            }
        } catch (Exception e2) {
            str = "mutiCardFactory";
            sb = new StringBuilder("MSimTelephonyManager.getDefault().isMultiSimEnabled()?");
            str2 = e2.toString();
            sb.append(str2);
            e.d(str, sb.toString());
            e.b("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        } catch (Error e3) {
            str = "mutiCardFactory";
            sb = new StringBuilder("MSimTelephonyManager.getDefault().isMultiSimEnabled()");
            str2 = e3.toString();
            sb.append(str2);
            e.d(str, sb.toString());
            e.b("mutiCardFactory", "isHwGeminiSupport1 " + z);
            return z;
        }
        e.b("mutiCardFactory", "isHwGeminiSupport1 " + z);
        return z;
    }

    private static boolean d() {
        boolean z;
        StringBuilder sb;
        String str;
        String str2;
        try {
            Field declaredField = Class.forName("com.mediatek.common.featureoption.FeatureOption").getDeclaredField("MTK_GEMINI_SUPPORT");
            declaredField.setAccessible(true);
            z = declaredField.getBoolean(null);
        } catch (Exception e2) {
            str = "mutiCardFactory";
            sb = new StringBuilder("FeatureOption.MTK_GEMINI_SUPPORT");
            str2 = e2.toString();
            sb.append(str2);
            e.d(str, sb.toString());
            z = false;
            e.b("mutiCardFactory", "isMtkGeminiSupport " + z);
            return z;
        } catch (Error e3) {
            str = "mutiCardFactory";
            sb = new StringBuilder("FeatureOption.MTK_GEMINI_SUPPORT");
            str2 = e3.toString();
            sb.append(str2);
            e.d(str, sb.toString());
            z = false;
            e.b("mutiCardFactory", "isMtkGeminiSupport " + z);
            return z;
        }
        e.b("mutiCardFactory", "isMtkGeminiSupport " + z);
        return z;
    }
}
