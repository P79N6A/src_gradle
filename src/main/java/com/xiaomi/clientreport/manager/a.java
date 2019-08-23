package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.clientreport.processor.c;
import com.xiaomi.push.aj;
import com.xiaomi.push.ba;
import com.xiaomi.push.bb;
import com.xiaomi.push.bc;
import com.xiaomi.push.bd;
import com.xiaomi.push.bf;
import com.xiaomi.push.bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f81720a;

    /* renamed from: a  reason: collision with other field name */
    private Context f62a;

    /* renamed from: a  reason: collision with other field name */
    private Config f63a;

    /* renamed from: a  reason: collision with other field name */
    private IEventProcessor f64a;

    /* renamed from: a  reason: collision with other field name */
    private IPerfProcessor f65a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f66a = new HashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private ExecutorService f67a = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f81721b = new HashMap<>();

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    private a(Context context) {
        this.f62a = context;
    }

    public static a a(Context context) {
        if (f81720a == null) {
            synchronized (a.class) {
                try {
                    if (f81720a == null) {
                        f81720a = new a(context);
                    }
                } catch (Throwable th) {
                    Class<a> cls = a.class;
                    throw th;
                }
            }
        }
        return f81720a;
    }

    private void a(Runnable runnable, int i) {
        aj.a(this.f62a).a(runnable, i);
    }

    private void d() {
        if (a(this.f62a).a().isEventUploadSwitchOpen()) {
            bb bbVar = new bb(this.f62a);
            int eventUploadFrequency = (int) a(this.f62a).a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bi.a(this.f62a).a("sp_client_report_status", "event_last_upload_time", 0) > ((long) (eventUploadFrequency * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
                aj.a(this.f62a).a((Runnable) new d(this, bbVar), 10);
            }
            synchronized (a.class) {
                try {
                    if (!aj.a(this.f62a).a((aj.a) bbVar, eventUploadFrequency)) {
                        aj.a(this.f62a).a(100886);
                        aj.a(this.f62a).a((aj.a) bbVar, eventUploadFrequency);
                    }
                } catch (Throwable th) {
                    Class<a> cls = a.class;
                    throw th;
                }
            }
        }
    }

    private void e() {
        if (a(this.f62a).a().isPerfUploadSwitchOpen()) {
            bc bcVar = new bc(this.f62a);
            int perfUploadFrequency = (int) a(this.f62a).a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bi.a(this.f62a).a("sp_client_report_status", "perf_last_upload_time", 0) > ((long) (perfUploadFrequency * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
                aj.a(this.f62a).a((Runnable) new e(this, bcVar), 15);
            }
            synchronized (a.class) {
                try {
                    if (!aj.a(this.f62a).a((aj.a) bcVar, perfUploadFrequency)) {
                        aj.a(this.f62a).a(100887);
                        aj.a(this.f62a).a((aj.a) bcVar, perfUploadFrequency);
                    }
                } catch (Throwable th) {
                    Class<a> cls = a.class;
                    throw th;
                }
            }
        }
    }

    public Config a() {
        Config config;
        synchronized (this) {
            if (this.f63a == null) {
                this.f63a = Config.defaultConfig(this.f62a);
            }
            config = this.f63a;
        }
        return config;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m24a() {
        a(this.f62a).d();
        a(this.f62a).e();
    }

    public void a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f63a = config;
        this.f64a = iEventProcessor;
        this.f65a = iPerfProcessor;
        this.f64a.setEventMap(this.f81721b);
        this.f65a.setPerfMap(this.f66a);
    }

    public void a(EventClientReport eventClientReport) {
        if (a().isEventUploadSwitchOpen()) {
            this.f67a.execute(new ba(this.f62a, eventClientReport, this.f64a));
            a(new b(this), 30);
        }
    }

    public void a(PerfClientReport perfClientReport) {
        if (a().isPerfUploadSwitchOpen()) {
            this.f67a.execute(new ba(this.f62a, perfClientReport, this.f65a));
            a(new c(this), 30);
        }
    }

    public void a(boolean z, boolean z2, long j, long j2) {
        if (this.f63a == null) {
            return;
        }
        if (z != this.f63a.isEventUploadSwitchOpen() || z2 != this.f63a.isPerfUploadSwitchOpen() || j != this.f63a.getEventUploadFrequency() || j2 != this.f63a.getPerfUploadFrequency()) {
            long eventUploadFrequency = this.f63a.getEventUploadFrequency();
            long perfUploadFrequency = this.f63a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(bf.a(this.f62a)).setEventEncrypted(this.f63a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f62a);
            this.f63a = build;
            if (!this.f63a.isEventUploadSwitchOpen()) {
                aj.a(this.f62a).a(100886);
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                b.c(this.f62a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                d();
            }
            if (!this.f63a.isPerfUploadSwitchOpen()) {
                aj.a(this.f62a).a(100887);
            } else if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                b.c(this.f62a.getPackageName() + "reset perf job " + build.getPerfUploadFrequency());
                e();
            }
        }
    }

    public void b() {
        if (a().isEventUploadSwitchOpen()) {
            bd bdVar = new bd();
            bdVar.a(this.f62a);
            bdVar.a((c) this.f64a);
            this.f67a.execute(bdVar);
        }
    }

    public void c() {
        if (a().isPerfUploadSwitchOpen()) {
            bd bdVar = new bd();
            bdVar.a((c) this.f65a);
            bdVar.a(this.f62a);
            this.f67a.execute(bdVar);
        }
    }
}
