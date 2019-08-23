package com.bytedance.frameworks.core.apm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.services.apm.api.IApmAgent;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, HashSet<d>> f2136a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static a f2137b = new a() {
        public final int b() {
            return 7;
        }

        public final int c() {
            return 100;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static long f2138c = -1;

    public interface a {
        int b();

        int c();
    }

    public static void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f2138c >= 43200000) {
            JSONObject jSONObject = new JSONObject();
            Iterator<Map.Entry<String, HashSet<d>>> it2 = f2136a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry next = it2.next();
                if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                    File file = new File((String) next.getKey());
                    if (file.exists()) {
                        HashSet hashSet = (HashSet) next.getValue();
                        long length = file.length();
                        long c2 = ((long) f2137b.c()) * 1024 * 1024;
                        int b2 = f2137b.b();
                        try {
                            jSONObject.put("before_size", length);
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                jSONObject.put("before_count_" + r12.a(), ((d) it3.next()).b());
                            }
                        } catch (JSONException unused) {
                        }
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            ((d) it4.next()).a(currentTimeMillis - (((long) b2) * 86400000));
                            jSONObject = jSONObject;
                            it2 = it2;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        Iterator<Map.Entry<String, HashSet<d>>> it5 = it2;
                        if (length > c2) {
                            do {
                                b2--;
                                Iterator it6 = hashSet.iterator();
                                while (it6.hasNext()) {
                                    ((d) it6.next()).a(currentTimeMillis - (((long) b2) * 86400000));
                                }
                                length = file.length();
                                if (length < c2) {
                                    break;
                                }
                            } while (b2 > 1);
                        }
                        JSONObject jSONObject3 = jSONObject2;
                        try {
                            jSONObject3.put("after_size", length);
                            Iterator it7 = hashSet.iterator();
                            while (it7.hasNext()) {
                                jSONObject3.put("after_count_" + r4.a(), ((d) it7.next()).b());
                            }
                        } catch (JSONException unused2) {
                        }
                        jSONObject = jSONObject3;
                        it2 = it5;
                    }
                }
            }
            JSONObject jSONObject4 = jSONObject;
            IApmAgent iApmAgent = (IApmAgent) com.bytedance.news.common.service.manager.c.a(IApmAgent.class);
            if (iApmAgent != null) {
                iApmAgent.monitorEvent("apm_db_size", null, jSONObject4, null);
            }
            a("special_monitor_v2");
            a("default_ss_local_monitor");
            f2138c = currentTimeMillis;
        }
    }

    private static void a(String str) {
        try {
            Context a2 = com.bytedance.apm.c.a();
            File databasePath = a2.getDatabasePath(str + ".db");
            if (databasePath.exists()) {
                databasePath.delete();
            }
        } catch (Exception unused) {
        }
    }
}
