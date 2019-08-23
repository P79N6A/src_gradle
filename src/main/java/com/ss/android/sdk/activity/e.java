package com.ss.android.sdk.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.downloadlib.c.k;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    public interface a {
        void a(long j);
    }

    private static void a(Context context, JSONObject jSONObject) {
        if (context != null) {
            try {
                String optString = jSONObject.optString("label");
                JSONObject optJSONObject = jSONObject.optJSONObject("ext_json");
                if (!StringUtils.isEmpty(optString)) {
                    com.ss.android.common.lib.a.a(context, "wap_stat", "app_download_banned", optString, 0, 0, optJSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(PushConstants.WEB_URL, str);
                jSONObject2.put("referer_url", str2);
                jSONObject.put("label", "browser");
                jSONObject.put("ext_json", jSONObject2);
            } catch (JSONException unused) {
            }
            a(context, jSONObject);
        }
    }

    public static void a(Context context, String str, String str2, String str3, JSONObject jSONObject, a aVar) {
        final Context context2 = context;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final JSONObject jSONObject2 = jSONObject;
        final a aVar2 = aVar;
        AnonymousClass2 r4 = new b.C0400b() {
            public final void a(String[] strArr, int[] iArr) {
                if (iArr.length > 0 && iArr[0] == 0) {
                    Context context = context2;
                    String str = str4;
                    String str2 = str5;
                    String str3 = str6;
                    JSONObject jSONObject = jSONObject2;
                    ArrayList arrayList = null;
                    if (!StringUtils.isEmpty(str2)) {
                        arrayList = new ArrayList();
                        arrayList.add(new com.ss.android.http.a.b.a("User-Agent", str2));
                    }
                    long a2 = com.ss.android.newmedia.e.a(str, null, context, false, str3, arrayList, true, jSONObject);
                    if (aVar2 != null) {
                        aVar2.a(a2);
                    }
                }
            }
        };
        b.a(k.c(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, r4);
    }

    public static JSONObject a(Context context, long j, String str, String str2, String str3, String str4) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("label", "browser");
            jSONObject2.put("pageUrl", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("referer_url", str3);
            }
            if (!TextUtils.isEmpty(str3) && !str3.equals(str4)) {
                jSONObject2.put("init_url", str4);
            }
            jSONObject2.put("ad_id", j);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (j <= 0) {
                jSONObject2.put("in_white_list", 1);
            }
            jSONObject.put("ext_json", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static AlertDialog a(Context context, String str, String str2, String str3, JSONObject jSONObject, boolean z, a aVar) {
        if (context == null || StringUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            a(context, str, str2, str3, jSONObject, aVar);
            return null;
        }
        AlertDialog.Builder a2 = com.ss.android.a.a.a(context);
        a2.setTitle((CharSequence) str).setMessage((int) C0906R.string.aep);
        a2.setNegativeButton((int) C0906R.string.b49, (DialogInterface.OnClickListener) null);
        final Context context2 = context;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final JSONObject jSONObject2 = jSONObject;
        final a aVar2 = aVar;
        AnonymousClass1 r1 = new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                e.a(context2, str4, str5, str6, jSONObject2, aVar2);
            }
        };
        a2.setPositiveButton((int) C0906R.string.b4_, (DialogInterface.OnClickListener) r1);
        return a2.show();
    }
}
