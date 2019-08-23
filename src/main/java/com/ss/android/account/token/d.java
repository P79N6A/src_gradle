package com.ss.android.account.token;

import android.text.TextUtils;
import com.bytedance.retrofit2.client.Header;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    public static void a(String str) {
        f c2 = c.a().c();
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(PushConstants.WEB_URL, str);
                c2.a("x_tt_token_lost", jSONObject, null);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, List list) {
        f c2 = c.a().c();
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(PushConstants.WEB_URL, str);
                StringBuilder sb = new StringBuilder();
                if (list != null) {
                    for (Object next : list) {
                        if (next instanceof Header) {
                            jSONObject.put(((Header) next).getName(), ((Header) next).getValue());
                        } else if (next != null) {
                            sb.append(next.toString());
                            sb.append(";");
                        }
                    }
                }
                jSONObject.put(PushConstants.EXTRA, sb.toString());
                c2.a("tt_token_logout", jSONObject, null);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        f c2 = c.a().c();
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str);
                jSONObject.put("tokenSign", str2);
                jSONObject.put("token", str3);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("errorMsg", str4);
                }
                c2.a("tt_token_decrypt_err", jSONObject, null);
            } catch (JSONException unused) {
            }
        }
    }

    public static void a(String str, List list, int i, String str2) {
        f c2 = c.a().c();
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", i);
                jSONObject.put("error_code_msg", str2);
                StringBuilder sb = new StringBuilder();
                if (list != null) {
                    for (Object next : list) {
                        if (next instanceof Header) {
                            jSONObject.put(((Header) next).getName(), ((Header) next).getValue());
                        } else if (next != null) {
                            sb.append(next.toString());
                            sb.append(";");
                        }
                    }
                }
                jSONObject.put(PushConstants.EXTRA, sb.toString());
                c2.a(str, jSONObject, null);
            } catch (Exception unused) {
            }
        }
    }
}
