package com.ss.android.ad.splash.core;

import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.ss.android.ad.splash.b.a;
import com.ss.android.ad.splash.utils.b;
import com.ss.android.ad.splash.utils.g;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static volatile j f27700a;

    private j() {
    }

    public static j a() {
        if (f27700a == null) {
            synchronized (j.class) {
                if (f27700a == null) {
                    f27700a = new j();
                }
            }
        }
        return f27700a;
    }

    @WorkerThread
    public static void d() {
        try {
            String A = e.A();
            if (!g.a(A)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key_splash_cache_size", b.a(new File(A)) / 1024);
                a.a().a("service_ad_res_disk_cache_size_in_mb", jSONObject, (JSONObject) null);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @MainThread
    public final void b() {
        if (e.r) {
            if (Math.abs(System.currentTimeMillis() - r.a().f27732a.getLong("clear_local_cache_time", 0)) >= Math.min(e.B(), 3600000)) {
                e.y().execute(new Runnable() {
                    public final void run() {
                        j jVar = j.this;
                        try {
                            String A = e.A();
                            if (!g.a(A)) {
                                File file = new File(A);
                                if (file.exists()) {
                                    File[] listFiles = file.listFiles();
                                    if (listFiles != null) {
                                        if (listFiles.length > 0) {
                                            for (File file2 : listFiles) {
                                                long B = e.B();
                                                boolean z = true;
                                                if (file2 != null) {
                                                    if (B > 0) {
                                                        if (System.currentTimeMillis() - file2.lastModified() <= B) {
                                                            z = false;
                                                        }
                                                    }
                                                }
                                                if (z) {
                                                    if (file2 != null && file2.exists()) {
                                                        file2.delete();
                                                    }
                                                    StringBuilder sb = new StringBuilder("文件 ");
                                                    sb.append(A);
                                                    sb.append("已过期，被系统删除");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        j.c();
                        r a2 = r.a();
                        if (a2.f27733b == null) {
                            a2.f27733b = a2.f27732a.edit();
                        }
                        a2.f27733b.putLong("clear_local_cache_time", System.currentTimeMillis());
                        a2.d();
                    }
                });
            }
        }
    }

    @WorkerThread
    static void c() {
        try {
            JSONArray jSONArray = new JSONArray(r.a().c());
            JSONArray jSONArray2 = new JSONArray();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("local_url");
                    long optLong = optJSONObject.optLong("local_data_expire_time");
                    if (!g.a(optString)) {
                        File file = new File(optString);
                        if (file.exists()) {
                            if (currentTimeMillis <= optLong) {
                                jSONArray2.put(optJSONObject);
                            } else {
                                file.delete();
                                StringBuilder sb = new StringBuilder("文件 ");
                                sb.append(optString);
                                sb.append("已过期，被系统删除");
                            }
                        }
                    }
                }
            }
            r.a().h(jSONArray2.toString()).d();
        } catch (Exception unused) {
        }
    }
}
