package com.ss.android.ugc.aweme.app;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.io.IOUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.utils.ar;
import com.ss.android.ugc.aweme.utils.ey;
import java.io.File;
import org.json.JSONObject;

public class ai {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33757a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f33758b = "ai";

    private static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f33757a, true, 22568, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f33757a, true, 22568, new Class[0], String.class);
        }
        try {
            for (String split : ey.b("/proc/cpuinfo")) {
                String[] split2 = split.split(":");
                if (split2.length == 2) {
                    String lowerCase = split2[0].trim().toLowerCase();
                    String trim = split2[1].trim();
                    if (TextUtils.equals("hardware", lowerCase) || TextUtils.equals("vendor_id", lowerCase.toLowerCase()) || TextUtils.equals("model name", lowerCase)) {
                        return trim;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    static final /* synthetic */ Object a() throws Exception {
        long j;
        try {
            ar a2 = ar.a(d.a());
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (PatchProxy.isSupport(new Object[0], null, f33757a, true, 22567, new Class[0], Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[0], null, f33757a, true, 22567, new Class[0], Long.TYPE)).longValue();
            } else {
                j = ((IOUtils.getFileSize(d.a().getExternalCacheDir().getParentFile().getAbsolutePath()) / 1000) / 1000) + ((IOUtils.getFileSize(d.a().getCacheDir().getParentFile().getAbsolutePath()) / 1000) / 1000);
            }
            long totalSpace = (externalStorageDirectory.getTotalSpace() / 1000) / 1000;
            JSONObject b2 = new c().a("cpu_cores", Integer.valueOf(a2.a())).a("cpu_fps", Integer.valueOf(a2.b() / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)).a("cpu_brand", b()).a("memory_size", Long.valueOf((a2.c() / 1000) / 1000)).a("storage_total_size", Long.valueOf(totalSpace)).a("storage_avalible_size", Long.valueOf((externalStorageDirectory.getFreeSpace() / 1000) / 1000)).a("is_sd", Integer.valueOf(Environment.isExternalStorageRemovable() ? 1 : 0)).a("screen_height", Integer.valueOf(p.e(d.a()))).a("screen_width", Integer.valueOf(p.b())).a("screen_dpi", Integer.valueOf(UIUtils.getDpi(d.a()))).a("app_storage_size", Long.valueOf(j)).a("app_storage_ratio", Float.valueOf((((float) j) * 1.0f) / ((float) totalSpace))).b();
            r.onEvent(MobClick.obtain().setEventName("client_perf_stat").setLabelName("perf_monitor").setJsonObject(b2));
            r.a("client_perf_stat", b2);
        } catch (Exception e2) {
            a.a((Throwable) e2);
        }
        return null;
    }
}
