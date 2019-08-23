package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.push.service.ag;
import com.xiaomi.push.service.be;
import com.xiaomi.push.service.bf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fy {

    /* renamed from: a  reason: collision with root package name */
    private static a f82077a;

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, iu> f402a;

    public interface a {
        void a(Context context, io ioVar);
    }

    public static int a(int i) {
        if (i > 0) {
            return i + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        return -1;
    }

    public static int a(Enum enumR) {
        if (enumR == null) {
            return -1;
        }
        if (enumR instanceof ik) {
            return enumR.ordinal() + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
        }
        if (enumR instanceof iu) {
            return enumR.ordinal() + 2001;
        }
        if (enumR instanceof ge) {
            return enumR.ordinal() + 3001;
        }
        return -1;
    }

    public static Config a(Context context) {
        boolean a2 = ag.a(context).a(ip.PerfUploadSwitch.a(), false);
        boolean a3 = ag.a(context).a(ip.EventUploadSwitch.a(), false);
        int a4 = ag.a(context).a(ip.PerfUploadFrequency.a(), 86400);
        return Config.getBuilder().setEventUploadSwitchOpen(a3).setEventUploadFrequency((long) ag.a(context).a(ip.EventUploadFrequency.a(), 86400)).setPerfUploadSwitchOpen(a2).setPerfUploadFrequency((long) a4).build(context);
    }

    public static EventClientReport a(Context context, String str, String str2, int i, long j, String str3) {
        EventClientReport a2 = a(str);
        a2.eventId = str2;
        a2.eventType = i;
        a2.eventTime = j;
        a2.eventContent = str3;
        return a2;
    }

    public static EventClientReport a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        eventClientReport.reportType = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    public static PerfClientReport a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        perfClientReport.reportType = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    public static PerfClientReport a(Context context, int i, long j, long j2) {
        PerfClientReport a2 = a();
        a2.code = i;
        a2.perfCounts = j;
        a2.perfLatencies = j2;
        return a2;
    }

    public static io a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        io ioVar = new io();
        ioVar.d("category_client_report_data");
        ioVar.a("push_sdk_channel");
        ioVar.a(1);
        ioVar.b(str);
        ioVar.a(true);
        ioVar.b(System.currentTimeMillis());
        ioVar.g(context.getPackageName());
        ioVar.e("com.xiaomi.xmsf");
        ioVar.f(be.a());
        ioVar.c("quality_support");
        return ioVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static iu m308a(String str) {
        if (f402a == null) {
            synchronized (iu.class) {
                try {
                    if (f402a == null) {
                        f402a = new HashMap();
                        for (iu iuVar : iu.values()) {
                            f402a.put(iuVar.f570a.toLowerCase(), iuVar);
                        }
                    }
                } catch (Throwable th) {
                    Class<iu> cls = iu.class;
                    throw th;
                }
            }
        }
        iu iuVar2 = f402a.get(str.toLowerCase());
        return iuVar2 != null ? iuVar2 : iu.Invalid;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m309a(int i) {
        return i == 1000 ? "E100000" : i == 3000 ? "E100002" : i == 2000 ? "E100001" : i == 6000 ? "E100003" : "";
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m310a(Context context) {
        ClientReportClient.updateConfig(context, a(context));
    }

    public static void a(Context context, Config config) {
        ClientReportClient.init(context, config, new fw(context), new fx(context));
    }

    private static void a(Context context, io ioVar) {
        if (a(context.getApplicationContext())) {
            bf.a(context.getApplicationContext(), ioVar);
        } else if (f82077a != null) {
            f82077a.a(context, ioVar);
        }
    }

    public static void a(Context context, List<String> list) {
        if (list != null) {
            try {
                for (String a2 : list) {
                    io a3 = a(context, a2);
                    if (be.a(a3, false)) {
                        b.c(a3.d() + "is not valid...");
                    } else {
                        b.c("send event/perf data item id:" + a3.d());
                        a(context, a3);
                    }
                }
            } catch (Throwable th) {
                b.d(th.getMessage());
            }
        }
    }

    public static void a(a aVar) {
        f82077a = aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m311a(Context context) {
        return context != null && !TextUtils.isEmpty(context.getPackageName()) && "com.xiaomi.xmsf".equals(context.getPackageName());
    }
}
