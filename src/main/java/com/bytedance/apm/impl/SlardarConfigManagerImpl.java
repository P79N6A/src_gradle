package com.bytedance.apm.impl;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.apm.core.d;
import com.bytedance.apm.i.c;
import com.bytedance.apm.k.i;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.services.slardar.config.a;
import com.bytedance.services.slardar.config.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class SlardarConfigManagerImpl implements IConfigManager {
    private b mSlardarConfigFetcher = new b();

    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.f2017a;
    }

    public String queryConfig() {
        return this.mSlardarConfigFetcher.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fetchConfig() {
        /*
            r8 = this;
            com.bytedance.apm.impl.b r0 = r8.mSlardarConfigFetcher
            java.lang.String r1 = r0.a()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x003d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0037 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0037 }
            r0.i = r4     // Catch:{ Exception -> 0x0037 }
            android.content.SharedPreferences r1 = r0.f2022f     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = "monitor_net_config_id"
            r6 = -1
            long r5 = r1.getLong(r5, r6)     // Catch:{ Exception -> 0x0037 }
            r0.j = r5     // Catch:{ Exception -> 0x0037 }
            android.content.SharedPreferences r1 = r0.f2022f     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = "monitor_configure_refresh_time"
            r6 = 0
            long r5 = r1.getLong(r5, r6)     // Catch:{ Exception -> 0x0037 }
            r0.k = r5     // Catch:{ Exception -> 0x0037 }
            r0.a((org.json.JSONObject) r2)     // Catch:{ Exception -> 0x0037 }
            r0.a(r2, r4)     // Catch:{ Exception -> 0x0037 }
            r0.b()     // Catch:{ Exception -> 0x0037 }
            goto L_0x003e
        L_0x0037:
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r2 = "配置信息读取失败"
            r1[r3] = r2
        L_0x003d:
            r3 = 1
        L_0x003e:
            android.content.Context r1 = com.bytedance.apm.c.a()
            boolean r1 = com.ss.android.common.util.ToolUtils.isMainProcess(r1)
            if (r1 == 0) goto L_0x005d
            long r1 = r0.k
            long r5 = java.lang.System.currentTimeMillis()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0053
            r3 = 1
        L_0x0053:
            r0.a((boolean) r3)
            com.bytedance.apm.j.b r1 = com.bytedance.apm.j.b.a()
            r1.a((com.bytedance.apm.j.b.C0006b) r0)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.SlardarConfigManagerImpl.fetchConfig():void");
    }

    public void unregisterConfigListener(a aVar) {
        b bVar = this.mSlardarConfigFetcher;
        if (aVar != null && bVar.l != null) {
            bVar.l.remove(aVar);
        }
    }

    public void unregisterResponseConfigListener(b bVar) {
        c a2 = c.a();
        if (bVar != null && a2.f2013d != null) {
            a2.f2013d.remove(bVar);
        }
    }

    @Nullable
    public JSONObject getConfigJSON(String str) {
        b bVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || bVar.h == null) {
            return new JSONObject();
        }
        return bVar.h.optJSONObject(str);
    }

    public boolean getMetricTypeSwitch(String str) {
        b bVar = this.mSlardarConfigFetcher;
        if (bVar.f2019c == null || TextUtils.isEmpty(str) || bVar.f2019c.opt(str) == null) {
            return false;
        }
        return true;
    }

    public boolean getServiceSwitch(String str) {
        b bVar = this.mSlardarConfigFetcher;
        if (bVar.f2020d == null || TextUtils.isEmpty(str) || bVar.f2020d.opt(str) == null) {
            return false;
        }
        return true;
    }

    public boolean getSwitch(String str) {
        b bVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || bVar.h == null) {
            return false;
        }
        return bVar.h.optBoolean(str);
    }

    public void registerResponseConfigListener(b bVar) {
        c a2 = c.a();
        if (bVar != null) {
            if (a2.f2013d == null) {
                a2.f2013d = new CopyOnWriteArrayList();
            }
            if (!a2.f2013d.contains(bVar)) {
                a2.f2013d.add(bVar);
            }
        }
    }

    public boolean getLogTypeSwitch(String str) {
        b bVar = this.mSlardarConfigFetcher;
        if (bVar.f2018b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (bVar.f2018b.opt(str) != null) {
            return true;
        }
        return false;
    }

    public void registerConfigListener(a aVar) {
        b bVar = this.mSlardarConfigFetcher;
        if (aVar != null) {
            if (bVar.l == null) {
                bVar.l = new CopyOnWriteArrayList();
            }
            if (!bVar.l.contains(aVar)) {
                bVar.l.add(aVar);
            }
            if (bVar.f2017a) {
                aVar.onReady();
                aVar.onRefresh(bVar.h, bVar.i);
            }
        }
    }

    public int getConfigInt(String str, int i) {
        b bVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || bVar.h == null) {
            return i;
        }
        return bVar.h.optInt(str, i);
    }

    public void initParams(com.bytedance.apm.core.c cVar, List<String> list) {
        b bVar = this.mSlardarConfigFetcher;
        bVar.f2022f = d.a(com.bytedance.apm.c.a(), "monitor_config");
        bVar.g = cVar;
        if (!i.a(list)) {
            bVar.f2021e = new ArrayList(list);
        }
    }
}
