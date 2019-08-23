package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import com.alibaba.sdk.android.httpdns.a.b;
import com.alibaba.sdk.android.utils.AMSDevReporter;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class HttpDns implements HttpDnsService {
    private static DegradationFilter degradationFilter = null;
    private static b hostManager = b.a();
    static HttpDns instance = null;
    private static boolean isEnabled = true;
    private static ExecutorService pool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(3, new h());
    private boolean isExpiredIPEnabled;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(int i, ThreadFactory threadFactory) {
            return h.a(m.a(p.FIXED).a(i).a(threadFactory).a());
        }
    }

    private HttpDns() {
    }

    private String getIpByHost(String str) {
        if (!isEnabled) {
            g.f("HttpDns service turned off");
            return null;
        }
        String[] ipsByHost = getIpsByHost(str);
        if (ipsByHost.length > 0) {
            return ipsByHost[0];
        }
        return null;
    }

    private String[] getIpsByHost(String str) {
        if (!isEnabled) {
            g.f("HttpDns service turned off");
        } else if (!j.b(str)) {
            return d.f25d;
        } else {
            if (j.c(str)) {
                return new String[]{str};
            } else if (degradationFilter != null && degradationFilter.shouldDegradeHttpDNS(str)) {
                return d.f25d;
            } else {
                if (s.d()) {
                    return getIpsByHostAsync(str);
                }
                c a2 = hostManager.a(str);
                if (a2 != null && a2.b() && this.isExpiredIPEnabled) {
                    if (!hostManager.a(str)) {
                        g.e("refresh host async: " + str);
                        pool.submit(new l(str, n.QUERY_HOST));
                    }
                    return a2.a();
                } else if (a2 != null && !a2.b()) {
                    return a2.a();
                } else {
                    g.e("refresh host sync: " + str);
                    try {
                        return (String[]) pool.submit(new l(str, n.QUERY_HOST)).get();
                    } catch (Exception e2) {
                        g.a(e2);
                    }
                }
            }
        }
        return d.f25d;
    }

    public static HttpDnsService getService(Context context, String str) {
        if (instance == null) {
            synchronized (HttpDns.class) {
                if (instance == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(AMSDevReporter.AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString(), "1.1.3.1");
                    AMSDevReporter.asyncReport(context, AMSDevReporter.AMSSdkTypeEnum.AMS_HTTPDNS, hashMap);
                    k.setContext(context);
                    l.setContext(context);
                    b.a(context);
                    b.b(context);
                    s.a(context);
                    d.d(str);
                    o.a().a(context);
                    instance = new HttpDns();
                }
            }
        }
        return instance;
    }

    public static HttpDnsService getService(Context context, String str, String str2) {
        if (instance == null) {
            synchronized (HttpDns.class) {
                if (instance == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(AMSDevReporter.AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString(), "1.1.3.1");
                    AMSDevReporter.asyncReport(context, AMSDevReporter.AMSSdkTypeEnum.AMS_HTTPDNS, hashMap);
                    k.setContext(context);
                    l.setContext(context);
                    b.a(context);
                    b.b(context);
                    s.a(context);
                    d.d(str);
                    o.a().a(context);
                    a.a(str2);
                    instance = new HttpDns();
                }
            }
        }
        return instance;
    }

    static synchronized void switchDnsService(boolean z) {
        synchronized (HttpDns.class) {
            isEnabled = z;
            if (!z) {
                g.f("httpdns service disabled");
            }
        }
    }

    public String getIpByHostAsync(String str) {
        if (!isEnabled) {
            g.f("HttpDns service turned off");
            return null;
        }
        String[] ipsByHostAsync = getIpsByHostAsync(str);
        if (ipsByHostAsync.length > 0) {
            return ipsByHostAsync[0];
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r1 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] getIpsByHostAsync(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = isEnabled
            if (r0 != 0) goto L_0x000c
            java.lang.String r5 = "HttpDns service turned off"
            com.alibaba.sdk.android.httpdns.g.f(r5)
            java.lang.String[] r5 = com.alibaba.sdk.android.httpdns.d.f25d
            return r5
        L_0x000c:
            boolean r0 = com.alibaba.sdk.android.httpdns.j.b(r5)
            if (r0 != 0) goto L_0x0015
            java.lang.String[] r5 = com.alibaba.sdk.android.httpdns.d.f25d
            return r5
        L_0x0015:
            boolean r0 = com.alibaba.sdk.android.httpdns.j.c(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r1] = r5
            return r0
        L_0x0022:
            com.alibaba.sdk.android.httpdns.DegradationFilter r0 = degradationFilter
            if (r0 == 0) goto L_0x0031
            com.alibaba.sdk.android.httpdns.DegradationFilter r0 = degradationFilter
            boolean r0 = r0.shouldDegradeHttpDNS(r5)
            if (r0 == 0) goto L_0x0031
            java.lang.String[] r5 = com.alibaba.sdk.android.httpdns.d.f25d
            return r5
        L_0x0031:
            com.alibaba.sdk.android.httpdns.b r0 = hostManager
            com.alibaba.sdk.android.httpdns.c r0 = r0.a((java.lang.String) r5)
            if (r0 == 0) goto L_0x003f
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0072
        L_0x003f:
            com.alibaba.sdk.android.httpdns.b r2 = hostManager
            boolean r2 = r2.a((java.lang.String) r5)
            if (r2 != 0) goto L_0x0072
            boolean r2 = com.alibaba.sdk.android.httpdns.s.d()
            if (r2 == 0) goto L_0x0055
            com.alibaba.sdk.android.httpdns.q r2 = com.alibaba.sdk.android.httpdns.q.a()
            r2.g(r5)
            goto L_0x0072
        L_0x0055:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "refresh host async: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.alibaba.sdk.android.httpdns.g.e(r2)
            com.alibaba.sdk.android.httpdns.l r2 = new com.alibaba.sdk.android.httpdns.l
            com.alibaba.sdk.android.httpdns.n r3 = com.alibaba.sdk.android.httpdns.n.QUERY_HOST
            r2.<init>(r5, r3)
            java.util.concurrent.ExecutorService r5 = pool
            r5.submit(r2)
        L_0x0072:
            if (r0 != 0) goto L_0x0077
            java.lang.String[] r5 = com.alibaba.sdk.android.httpdns.d.f25d
            return r5
        L_0x0077:
            boolean r5 = com.alibaba.sdk.android.httpdns.s.d()
            if (r5 == 0) goto L_0x0080
            java.lang.String[] r5 = com.alibaba.sdk.android.httpdns.d.f25d
            return r5
        L_0x0080:
            boolean r5 = r4.isExpiredIPEnabled
            if (r5 == 0) goto L_0x0089
            java.lang.String[] r5 = r0.a()
            return r5
        L_0x0089:
            if (r1 != 0) goto L_0x0090
            java.lang.String[] r5 = r0.a()
            return r5
        L_0x0090:
            java.lang.String[] r5 = com.alibaba.sdk.android.httpdns.d.f25d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.HttpDns.getIpsByHostAsync(java.lang.String):java.lang.String[]");
    }

    public void setAuthCurrentTime(long j) {
        a.setAuthCurrentTime(j);
    }

    public void setCachedIPEnabled(boolean z) {
        b.c(z);
        b.a().a();
    }

    public void setDegradationFilter(DegradationFilter degradationFilter2) {
        degradationFilter = degradationFilter2;
    }

    public void setExpiredIPEnabled(boolean z) {
        this.isExpiredIPEnabled = z;
    }

    public void setHTTPSRequestEnabled(boolean z) {
        d.setHTTPSRequestEnabled(z);
    }

    public void setLogEnabled(boolean z) {
        g.setLogEnabled(z);
    }

    public void setPreResolveAfterNetworkChanged(boolean z) {
        k.f5104b = z;
    }

    public void setPreResolveHosts(ArrayList<String> arrayList) {
        if (!isEnabled) {
            g.f("HttpDns service turned off");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!hostManager.a(str)) {
                pool.submit(new l(str, n.QUERY_HOST));
            }
        }
    }

    public void setTimeoutInterval(int i) {
        d.setTimeoutInterval(i);
    }
}
