package com.ss.android.downloadlib.addownload;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.download.api.c.a;
import com.ss.android.download.api.config.b;
import com.ss.android.download.api.config.c;
import com.ss.android.download.api.config.d;
import com.ss.android.download.api.config.e;
import com.ss.android.download.api.config.f;
import com.ss.android.download.api.config.g;
import com.ss.android.download.api.config.h;
import com.ss.android.download.api.config.i;
import com.ss.android.download.api.config.j;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static d f28836a;

    /* renamed from: b  reason: collision with root package name */
    public static b f28837b;

    /* renamed from: c  reason: collision with root package name */
    public static h f28838c;

    /* renamed from: d  reason: collision with root package name */
    public static e f28839d;

    /* renamed from: e  reason: collision with root package name */
    public static f f28840e;

    /* renamed from: f  reason: collision with root package name */
    public static g f28841f;
    public static a g;
    public static com.ss.android.download.api.config.a h;
    public static i i;
    public static IAppDownloadMonitorListener j;
    public static j k;
    static final List<int[]> l = new ArrayList();
    private static Context m;
    private static c n;
    private static String o;
    private static final List<int[]> p = new ArrayList();

    public static Context a() {
        return m;
    }

    public static d b() {
        return f28836a;
    }

    public static e e() {
        return f28839d;
    }

    public static com.ss.android.download.api.config.a i() {
        return h;
    }

    public static i j() {
        return i;
    }

    public static c k() {
        return n;
    }

    @NonNull
    public static b c() {
        if (f28837b == null) {
            f28837b = new b() {
                public final void a(@Nullable Activity activity, @NonNull com.ss.android.download.api.b.c cVar, @Nullable com.ss.android.download.api.b.a aVar, @Nullable com.ss.android.download.api.b.b bVar) {
                }
            };
        }
        return f28837b;
    }

    @NonNull
    public static h d() {
        if (f28838c == null) {
            f28838c = new com.ss.android.downloadlib.a.a();
        }
        return f28838c;
    }

    @NonNull
    public static f f() {
        if (f28840e == null) {
            f28840e = new com.ss.android.downloadlib.a.b();
        }
        return f28840e;
    }

    @NonNull
    public static JSONObject g() {
        if (f28841f == null) {
            f28841f = new g() {
                public final JSONObject a() {
                    return new JSONObject();
                }
            };
        }
        return f28841f.a();
    }

    @NonNull
    public static a h() {
        if (g == null) {
            g = new a.C0338a().a();
        }
        return g;
    }

    public static String l() {
        if (TextUtils.isEmpty(o)) {
            String optString = g().optString("download_completed_event_tag");
            if (TextUtils.isEmpty(optString)) {
                optString = "embeded_ad";
            }
            o = optString;
        }
        return o;
    }

    public static boolean m() {
        if (g().optInt("is_enable_start_install_again") == 2) {
            return true;
        }
        return false;
    }

    public static long n() {
        long optLong = g().optLong("start_install_interval");
        if (optLong == 0) {
            return 300000;
        }
        return optLong;
    }

    public static long o() {
        long optLong = g().optLong("next_install_min_interval");
        if (optLong == 0) {
            return 10000;
        }
        return optLong;
    }

    private static boolean p() {
        if (g().optInt("download_lib_switch", 2) == 1) {
            return true;
        }
        return false;
    }

    private static boolean q() {
        if (g().optInt("download_lib_switch", 2) == 2) {
            return true;
        }
        return false;
    }

    private static boolean r() {
        if (g().optInt("download_lib_switch", 2) == 3) {
            return true;
        }
        return false;
    }

    public static void a(@NonNull Context context) {
        m = context.getApplicationContext();
        com.ss.android.downloadlib.core.download.j.a();
        com.ss.android.downloadlib.core.download.g.a();
    }

    private static boolean a(boolean z) {
        if (r() || ((z && q()) || (!z && p()))) {
            return true;
        }
        return false;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("download_notification_config")) {
            String obj = jSONObject.opt("download_notification_config").toString();
            if (!TextUtils.isEmpty(obj)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj);
                    AppDownloader.getInstance().setMinResumeFailedIntervalTime(jSONObject2.optLong("min_resume_failed_interval_time"));
                    AppDownloader.getInstance().setMinResumeUnInstallIntervalTime(jSONObject2.optLong("min_resume_uninstall_interval_time"));
                    AppDownloader.getInstance().setMaxResumeFailedNotificationShowCount(jSONObject2.optInt("max_resume_failed_notification_show_count"));
                    AppDownloader.getInstance().setMaxResumeUnInstallNotificationShowCount(jSONObject2.optInt("max_resume_uninstall_notification_show_count"));
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("download_chunk_config")) {
            String obj = jSONObject.opt("download_chunk_config").toString();
            if (!TextUtils.isEmpty(obj)) {
                JSONObject jSONObject2 = null;
                try {
                    jSONObject2 = new JSONObject(obj);
                } catch (Exception unused) {
                }
                if (jSONObject2 != null) {
                    String[] strArr = new String[5];
                    String[][] strArr2 = new String[5][];
                    strArr[1] = jSONObject2.optString("download_chunk_1");
                    strArr[2] = jSONObject2.optString("download_chunk_2");
                    strArr[3] = jSONObject2.optString("download_chunk_3");
                    strArr[4] = jSONObject2.optString("download_chunk_4");
                    for (int i2 = 1; i2 < 5; i2++) {
                        if (!TextUtils.isEmpty(strArr[i2])) {
                            strArr2[i2] = strArr[i2].split(",");
                            for (int i3 = 0; i3 < strArr2[i2].length - 1; i3 += 2) {
                                l.add(new int[]{i2, Integer.parseInt(strArr2[i2][i3]), Integer.parseInt(strArr2[i2][i3 + 1])});
                            }
                        }
                    }
                    String optString = jSONObject2.optString("network_quality_operation");
                    String optString2 = jSONObject2.optString("network_quality_operand");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        String[] split = optString.split(",");
                        String[] split2 = optString2.split(",");
                        if (split.length >= 5 && split2.length >= 5) {
                            for (int i4 = 0; i4 < 5; i4++) {
                                p.add(new int[]{Integer.parseInt(split[i4]), Integer.parseInt(split2[i4])});
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean a(boolean z, boolean z2) {
        if (z || !a(z2)) {
            return true;
        }
        return false;
    }
}
