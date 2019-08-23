package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.b;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.c.d;
import com.ss.android.download.api.config.h;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.core.download.d;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class j {
    static boolean a(int i) {
        return i == 0 || i == 1;
    }

    static boolean b(int i) {
        return i == 2 || i == 1;
    }

    static boolean c(int i) {
        return i == 2;
    }

    static boolean a(c cVar) {
        return cVar.o() && (cVar instanceof com.ss.android.downloadad.api.a.c) && cVar.u() == 1;
    }

    static void a(String str, String str2, Object obj, c cVar) {
        if (k.b() != null) {
            k.b().onEvent(new d.a().b(str).c(str2).a(cVar.o()).a(cVar.b()).d(cVar.p()).b(cVar.c()).a(cVar.t()).a(1).a(obj).a());
        }
    }

    public static void a(String str, String str2, boolean z, long j, String str3, long j2, int i) {
        if (k.b() != null) {
            k.b().onEvent(new d.a().b(str).c(str2).a(z).a(j).d(str3).b(j2).a(i).a());
        }
    }

    public static void a(String str, String str2, boolean z, long j, String str3, long j2, JSONObject jSONObject, int i) {
        if (k.b() != null) {
            k.b().onEvent(new d.a().b(str).c(str2).a(z).a(j).d(str3).b(j2).a(jSONObject).a(i).a());
        }
    }

    public static void a(String str, String str2, long j, long j2, JSONObject jSONObject) {
        if (k.b() != null) {
            k.b().onEvent(new d.a().b(str).c(str2).a(0).b(0).a(jSONObject).a());
        }
    }

    private static void a(String str, String str2, String str3, JSONObject jSONObject) {
        k.b().onEvent(new d.a().a(str).b(str2).c(str3).b(0).a(jSONObject).a());
    }

    public static long a(DownloadInfo downloadInfo) {
        try {
            String extra = downloadInfo.getExtra();
            if (!TextUtils.isEmpty(extra)) {
                return k.a(new JSONObject(extra), PushConstants.EXTRA);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    static boolean b(c cVar) {
        if (cVar == null || cVar.u() != 2) {
            return false;
        }
        return true;
    }

    private static void a(Context context, JSONObject jSONObject) {
        if (context != null && jSONObject != null) {
            try {
                String optString = jSONObject.optString("label");
                JSONObject optJSONObject = jSONObject.optJSONObject("ext_json");
                if (!TextUtils.isEmpty(optString)) {
                    a("wap_stat", "app_download", optString, optJSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    static void a(c cVar, b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(PushConstants.WEB_URL, cVar.a()).putOpt("ad_id", Long.valueOf(cVar.b())).putOpt("ext_value", Long.valueOf(cVar.c()));
            JSONObject t = cVar.t();
            if (t != null) {
                Iterator<String> keys = t.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, t.get(next));
                }
            }
            if (bVar == null || bVar.v() != 0) {
                str = "browser";
            } else {
                str = bVar.b();
            }
            a("wap_stat", "app_download", str, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static int a(boolean z, boolean z2, JSONObject jSONObject, AppTaskBuilder appTaskBuilder) {
        int i;
        if (appTaskBuilder == null || TextUtils.isEmpty(appTaskBuilder.getUrl()) || appTaskBuilder.getContext() == null) {
            return 0;
        }
        a(appTaskBuilder.getContext(), jSONObject);
        int addDownloadTask = AppDownloader.getInstance().addDownloadTask(appTaskBuilder);
        if (z) {
            h d2 = k.d();
            Context context = appTaskBuilder.getContext();
            Resources resources = appTaskBuilder.getContext().getResources();
            if (z2) {
                i = C0906R.string.a7n;
            } else {
                i = C0906R.string.cmr;
            }
            d2.a(context, resources.getString(i), a.a(appTaskBuilder.getContext().getResources(), 2130838576), z2 ? 1 : 0);
        }
        return addDownloadTask;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r2, long r3, @android.support.annotation.NonNull com.ss.android.download.api.b.c r5, @android.support.annotation.NonNull com.ss.android.download.api.b.b r6) {
        /*
            org.json.JSONObject r0 = r5.t()     // Catch:{ JSONException -> 0x002e }
            if (r0 != 0) goto L_0x0017
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e }
            r0.<init>()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = "click_type"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0015 }
            r0.putOpt(r1, r3)     // Catch:{ JSONException -> 0x0015 }
            goto L_0x002f
        L_0x0015:
            goto L_0x002f
        L_0x0017:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e }
            org.json.JSONObject r1 = r5.t()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x002e }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = "click_type"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0015 }
            r0.putOpt(r1, r3)     // Catch:{ JSONException -> 0x0015 }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.lang.String r3 = r6.d()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x003e
            java.lang.String r3 = r6.d()
            goto L_0x0042
        L_0x003e:
            java.lang.String r3 = r6.b()
        L_0x0042:
            com.ss.android.download.api.c.d$a r4 = new com.ss.android.download.api.c.d$a
            r4.<init>()
            com.ss.android.download.api.c.d$a r3 = r4.b((java.lang.String) r3)
            com.ss.android.download.api.c.d$a r2 = r3.c(r2)
            boolean r3 = r5.o()
            com.ss.android.download.api.c.d$a r2 = r2.a((boolean) r3)
            long r3 = r5.b()
            com.ss.android.download.api.c.d$a r2 = r2.a((long) r3)
            java.lang.String r3 = r5.p()
            com.ss.android.download.api.c.d$a r2 = r2.d(r3)
            long r3 = r5.c()
            com.ss.android.download.api.c.d$a r2 = r2.b((long) r3)
            com.ss.android.download.api.c.d$a r2 = r2.a((org.json.JSONObject) r0)
            java.lang.Object r3 = r6.u()
            com.ss.android.download.api.c.d$a r2 = r2.a((java.lang.Object) r3)
            java.util.List r3 = r5.s()
            com.ss.android.download.api.c.d$a r2 = r2.a((java.util.List<java.lang.String>) r3)
            r3 = 1
            com.ss.android.download.api.c.d$a r2 = r2.a((int) r3)
            com.ss.android.download.api.c.d r2 = r2.a()
            boolean r3 = r6.z()
            if (r3 == 0) goto L_0x009a
            com.ss.android.download.api.config.d r3 = com.ss.android.downloadlib.addownload.k.b()
            r3.a(r2)
            return
        L_0x009a:
            com.ss.android.download.api.config.d r3 = com.ss.android.downloadlib.addownload.k.b()
            r3.onEvent(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.j.a(java.lang.String, long, com.ss.android.download.api.b.c, com.ss.android.download.api.b.b):void");
    }

    private static long a(String str, String str2, Context context, String str3, Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, String str5, boolean z6) {
        String str6;
        String str7;
        String str8;
        int i;
        boolean z7 = z6;
        if (context == null) {
            return -1;
        }
        try {
            com.ss.android.downloadlib.core.download.d a2 = com.ss.android.downloadlib.core.download.d.a(context);
            if (a2 == null) {
                return -1;
            }
            try {
                Uri parse = Uri.parse(str);
                String a3 = k.a(parse.getLastPathSegment());
                if (TextUtils.isEmpty(a3)) {
                    if (TextUtils.isEmpty(str2)) {
                        return -1;
                    }
                    a3 = str2;
                }
                if (TextUtils.isEmpty(str2)) {
                    str6 = a3;
                } else {
                    str6 = str2;
                }
                d.c cVar = new d.c(parse);
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        String str9 = (String) next.getKey();
                        String str10 = (String) next.getValue();
                        if (str9 == null) {
                            throw new NullPointerException("header cannot be null");
                        } else if (!str9.contains(":")) {
                            if (str10 == null) {
                                str10 = "";
                            }
                            cVar.f28977c.add(Pair.create(str9, str10));
                        } else {
                            throw new IllegalArgumentException("header may not contain ':'");
                        }
                    }
                }
                if (!com.ss.android.downloadlib.core.download.k.b(str) || a3.endsWith(".apk")) {
                    str8 = a3;
                    str7 = str3;
                } else {
                    str8 = a3 + ".apk";
                    str7 = "application/vnd.android.package-archive";
                }
                if (!TextUtils.isEmpty(str7)) {
                    cVar.f28980f = str7;
                }
                if (!TextUtils.isEmpty(str5)) {
                    str8 = str5;
                }
                cVar.f28978d = str6;
                if (!TextUtils.isEmpty(str4)) {
                    cVar.f28976b = Uri.parse(str4);
                } else if (z4) {
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    if (externalStoragePublicDirectory != null && !externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                        return -1;
                    }
                    File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    if (externalStoragePublicDirectory2 != null) {
                        if (externalStoragePublicDirectory2.exists()) {
                            if (!externalStoragePublicDirectory2.isDirectory()) {
                                throw new IllegalStateException(externalStoragePublicDirectory2.getAbsolutePath() + " already exists and is not a directory");
                            }
                        } else if (!externalStoragePublicDirectory2.mkdirs()) {
                            throw new IllegalStateException("Unable to create directory: " + externalStoragePublicDirectory2.getAbsolutePath());
                        }
                        cVar.l = true;
                        cVar.a(externalStoragePublicDirectory2, str8);
                    } else {
                        throw new IllegalStateException("Failed to get external storage public directory");
                    }
                } else {
                    File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (externalFilesDir != null && !externalFilesDir.exists() && !externalFilesDir.mkdirs()) {
                        return -1;
                    }
                    File externalFilesDir2 = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (externalFilesDir2 != null) {
                        if (externalFilesDir2.exists()) {
                            if (!externalFilesDir2.isDirectory()) {
                                throw new IllegalStateException(externalFilesDir2.getAbsolutePath() + " already exists and is not a directory");
                            }
                        } else if (!externalFilesDir2.mkdirs()) {
                            throw new IllegalStateException("Unable to create directory: " + externalFilesDir2.getAbsolutePath());
                        }
                        cVar.l = false;
                        cVar.a(externalFilesDir2, str8);
                    } else {
                        throw new IllegalStateException("Failed to get external storage files directory");
                    }
                }
                cVar.i = z5;
                if (z2) {
                    cVar.a(1);
                } else {
                    cVar.a(2);
                }
                cVar.h = false;
                if (z3) {
                    cVar.g = 2;
                }
                long a4 = a2.a(cVar);
                if (z) {
                    h d2 = k.d();
                    Resources resources = context.getResources();
                    if (z7) {
                        i = C0906R.string.a7n;
                    } else {
                        i = C0906R.string.cmr;
                    }
                    d2.a(context, resources.getString(i), a.a(context.getResources(), 2130838576), z7 ? 1 : 0);
                }
                return a4;
            } catch (Throwable th) {
                new StringBuilder("add download task error:").append(th);
                return -1;
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    public static long a(String str, String str2, Context context, String str3, Map<String, String> map, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, String str5, boolean z6) {
        Context context2 = context;
        if (TextUtils.isEmpty(str) || context2 == null) {
            return -1;
        }
        a(context2, jSONObject);
        long a2 = a(str, str2, context, str3, map, z, z2, z3, z4, z5, str4, str5, z6);
        if (a2 >= 0) {
            return a2;
        }
        return -1;
    }
}
