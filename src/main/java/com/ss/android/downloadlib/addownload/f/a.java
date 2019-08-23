package com.ss.android.downloadlib.addownload.f;

import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.c.a.c;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public final class a {
    public static String a(String str, String str2) {
        try {
            byte[] bytes = (str + "|" + str2).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec("596f823f283d4af73ead3ea6".getBytes(), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return Base64.encodeToString(instance.doFinal(bytes), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(DownloadInfo downloadInfo, long j, String str, String str2) {
        if (downloadInfo != null && k.e() != null) {
            try {
                final HashMap hashMap = new HashMap();
                String str3 = k.h().f28452b;
                hashMap.put("from", str3);
                String valueOf = String.valueOf(System.currentTimeMillis());
                hashMap.put("timestamp", valueOf);
                hashMap.put("signature", a(str3, valueOf));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_id", j);
                jSONObject.put("log_extra", str);
                jSONObject.put("download_url", downloadInfo.getUrl());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_name", downloadInfo.getTitle());
                jSONObject2.put("package_name", str2);
                jSONObject2.put("package_size", downloadInfo.getTotalBytes());
                List<HttpHeader> extraHeaders = downloadInfo.getExtraHeaders();
                if (extraHeaders != null && !extraHeaders.isEmpty()) {
                    Iterator<HttpHeader> it2 = extraHeaders.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        HttpHeader next = it2.next();
                        if (TextUtils.equals(next.getName(), "User-Agent")) {
                            jSONObject2.put("User-Agent", next.getValue());
                            break;
                        }
                    }
                }
                jSONObject.put("request_info", jSONObject2.toString());
                hashMap.put("info", jSONObject.toString());
                new c() {
                    public final void run() {
                        k.e().a("POST", "https://crm.bytedance.com/audit/inspect/client/app/resend/", hashMap, null);
                    }
                }.a();
            } catch (Exception unused) {
            }
        }
    }
}
