package com.ss.android.downloadlib.c;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.c;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.downloadlib.addownload.d.b;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    public static com.ss.android.downloadlib.addownload.d.b a(DownloadInfo downloadInfo) {
        String str;
        long j;
        boolean z;
        long j2;
        String extra = downloadInfo.getExtra();
        long j3 = 0;
        try {
            if (!TextUtils.isEmpty(extra)) {
                JSONObject jSONObject = new JSONObject(extra);
                j2 = k.a(jSONObject, PushConstants.EXTRA);
                try {
                    str = jSONObject.optString("log_extra");
                } catch (Exception unused) {
                    str = "";
                    z = false;
                    j = 0;
                    j3 = j2;
                    return new b.a().a(j3).a(str).a(z).b(j).a();
                }
                try {
                    z = jSONObject.optBoolean("is_enable_backdialog");
                } catch (Exception unused2) {
                    z = false;
                    j = 0;
                    j3 = j2;
                    return new b.a().a(j3).a(str).a(z).b(j).a();
                }
                try {
                    j = k.a(jSONObject, "ext_value");
                } catch (Exception unused3) {
                    j = 0;
                    j3 = j2;
                    return new b.a().a(j3).a(str).a(z).b(j).a();
                }
                j3 = j2;
                return new b.a().a(j3).a(str).a(z).b(j).a();
            }
            str = "";
            j = 0;
            z = false;
            return new b.a().a(j3).a(str).a(z).b(j).a();
        } catch (Exception unused4) {
            str = "";
            j2 = 0;
            z = false;
            j = 0;
            j3 = j2;
            return new b.a().a(j3).a(str).a(z).b(j).a();
        }
    }

    public static c b(DownloadInfo downloadInfo) {
        long j;
        long j2;
        String str;
        JSONObject jSONObject = null;
        if (downloadInfo == null) {
            return null;
        }
        String extra = downloadInfo.getExtra();
        try {
            if (!TextUtils.isEmpty(extra)) {
                JSONObject jSONObject2 = new JSONObject(extra);
                j2 = k.a(jSONObject2, PushConstants.EXTRA);
                try {
                    str = jSONObject2.optString("log_extra");
                    try {
                        j = k.a(jSONObject2, "ext_value");
                        try {
                            String optString = jSONObject2.optString("extra_json", "");
                            if (!TextUtils.isEmpty(optString)) {
                                jSONObject = new JSONObject(optString);
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        j = 0;
                        return new c.a().d(downloadInfo.getUrl()).b(downloadInfo.getPackageName()).a(j2).b(j).a(str).a(jSONObject).a();
                    }
                } catch (Exception unused3) {
                    str = "";
                    j = 0;
                    return new c.a().d(downloadInfo.getUrl()).b(downloadInfo.getPackageName()).a(j2).b(j).a(str).a(jSONObject).a();
                }
                return new c.a().d(downloadInfo.getUrl()).b(downloadInfo.getPackageName()).a(j2).b(j).a(str).a(jSONObject).a();
            }
        } catch (Exception unused4) {
        }
        str = "";
        j2 = 0;
        j = 0;
        return new c.a().d(downloadInfo.getUrl()).b(downloadInfo.getPackageName()).a(j2).b(j).a(str).a(jSONObject).a();
    }

    public static String a(String str, long j, int i, String str2, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(PushConstants.EXTRA, str);
            jSONObject2.put("ext_value", j);
            jSONObject2.put("position", 0);
            jSONObject2.put("log_extra", str2);
            jSONObject2.put("is_enable_backdialog", z);
            if (jSONObject != null) {
                jSONObject2.put("extra_json", jSONObject.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject2.toString();
    }
}
