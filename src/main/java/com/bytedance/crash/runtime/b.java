package com.bytedance.crash.runtime;

import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.concurrent.ThreadPoolExecutor;

public final class b {
    private static IConfigManager o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19533a = true;

    /* renamed from: b  reason: collision with root package name */
    public String f19534b = "http://log.snssdk.com/monitor/collect/c/crash";

    /* renamed from: c  reason: collision with root package name */
    public String f19535c = "http://log.snssdk.com/monitor/collect/c/exception";

    /* renamed from: d  reason: collision with root package name */
    public String f19536d = "http://log.snssdk.com/monitor/collect/c/native_bin_crash";

    /* renamed from: e  reason: collision with root package name */
    public String f19537e = "http://mon.snssdk.com/monitor/collect/c/logcollect";

    /* renamed from: f  reason: collision with root package name */
    public long f19538f = 8000;
    public int g = 512;
    public int h = 1;
    public boolean i = true;
    public boolean j = true;
    public long k = 1000;
    public boolean l;
    public boolean m;
    public ThreadPoolExecutor n;

    public static IConfigManager b() {
        if (o == null) {
            o = (IConfigManager) c.a(IConfigManager.class);
        }
        return o;
    }

    public final boolean a() {
        if (b() != null) {
            return b().getLogTypeSwitch("core_exception_monitor");
        }
        return this.j;
    }
}
