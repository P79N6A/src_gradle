package com.ss.android.ugc.aweme.app.application.b;

import com.bytedance.frameworks.plugin.pm.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.application.task.CommonLogReportInitTask;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.v;
import org.json.JSONObject;

public final class h implements CommonLogReportInitTask.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2645a;

    public final void a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f2645a, false, 23245, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2645a, false, 23245, new Class[0], Void.TYPE);
            return;
        }
        try {
            boolean booleanValue = ((Boolean) SharePrefCache.inst().getUseNewFFmpeg().c()).booleanValue();
            if (booleanValue) {
                boolean z = v.f75967b;
                int c2 = c.c("com.ss.android.ugc.aweme.ffmpeg_so");
                boolean b2 = c.b("com.ss.android.ugc.aweme.ffmpeg_so");
                JSONObject b3 = new com.ss.android.ugc.aweme.app.d.c().a("ffmpeg_plugin_is_new_ffmpeg", Boolean.valueOf(booleanValue)).a("ffmpeg_plugin_load_result", Boolean.valueOf(z)).a("ffmpeg_plugin_version", Integer.valueOf(c2)).a("ffmpeg_plugin_installed", Boolean.valueOf(b2)).b();
                r.onEvent(MobClick.obtain().setEventName("plugin").setLabelName("ffmpeg_plugin").setJsonObject(b3));
                if (!z || !b2) {
                    if (z && !b2) {
                        i = 1;
                    } else if (b2) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                }
                n.a("ffmpeg_plugin", i, b3);
            }
        } catch (Exception unused) {
        }
    }
}
