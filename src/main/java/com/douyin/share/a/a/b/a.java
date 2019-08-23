package com.douyin.share.a.a.b;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.StringUtils;
import com.douyin.share.a.b.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a {
    public static Runnable a(final Handler handler, final Callable callable) {
        return new Runnable() {
            public final void run() {
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception unused) {
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(com.douyin.share.a.b.a.f23127a);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e2) {
                        obtainMessage.obj = e2;
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        };
    }

    @NonNull
    private static c a(String str, List<e> list) throws Exception {
        String executePost = NetworkUtils.executePost(10240, "http://isub.snssdk.com/2/data/share_message/", (List) list);
        if (executePost == null || executePost.length() == 0) {
            return c.FAIL;
        }
        JSONObject jSONObject = new JSONObject(executePost);
        String string = jSONObject.getString("message");
        char c2 = 65535;
        int hashCode = string.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode == 96784904 && string.equals("error")) {
                c2 = 1;
            }
        } else if (string.equals("success")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                return c.SUCCESS;
            case 1:
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String optString = jSONObject.optString("expired_platform", null);
                if ("session_expired".equals(jSONObject2.optString("name"))) {
                    if (StringUtils.isEmpty(optString) || !StringUtils.equal(optString, str)) {
                        return c.SESSION_EXPIRED;
                    }
                    return c.PLATFORM_EXPIRED;
                }
                break;
        }
        return c.FAIL;
    }

    public static c a(String str, String str2, String str3, String str4, int i) {
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isEmpty(str)) {
            arrayList.add(new e("platform", str));
        }
        arrayList.add(new e(PushConstants.WEB_URL, str2));
        if (!StringUtils.isEmpty(str4)) {
            arrayList.add(new e(PushConstants.TITLE, str4));
        }
        if (!StringUtils.isEmpty(str3)) {
            arrayList.add(new e("text", str3));
        }
        if (i > 0) {
            arrayList.add(new e("share_type", String.valueOf(i)));
        }
        try {
            return a(str, (List<e>) arrayList);
        } catch (Throwable unused) {
            return c.FAIL;
        }
    }

    public static c a(String str, String str2, long j, long j2, long j3, int i, int i2, String str3, String str4, String str5) {
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isEmpty(str)) {
            arrayList.add(new e("platform", str));
        }
        arrayList.add(new e("group_id", String.valueOf(j)));
        arrayList.add(new e("item_id", String.valueOf(j2)));
        if (j3 > 0) {
            arrayList.add(new e("ad_id", String.valueOf(j3)));
        }
        if (!StringUtils.isEmpty(str2)) {
            arrayList.add(new e("text", str2));
        }
        if (i > 0) {
            arrayList.add(new e("share_type", String.valueOf(i)));
        }
        if (i2 > 0) {
            arrayList.add(new e("image_index", String.valueOf(i2)));
        }
        if (!StringUtils.isEmpty(str3)) {
            arrayList.add(new e("utm_source", str3));
        }
        if (!StringUtils.isEmpty(str4)) {
            arrayList.add(new e("utm_medium", str4));
        }
        if (!StringUtils.isEmpty(str5)) {
            arrayList.add(new e("utm_campaign", str5));
        }
        try {
            return a(str, (List<e>) arrayList);
        } catch (Throwable unused) {
            return c.FAIL;
        }
    }
}
