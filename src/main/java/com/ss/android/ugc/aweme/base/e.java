package com.ss.android.ugc.aweme.base;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.i18n.c;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34731a;

    public static int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f34731a, true, 23992, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f34731a, true, 23992, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            if (str2.contains("canceled") || str2.contains("Canceled")) {
                return 2;
            }
            if (str2.contains("network not available")) {
                return 3;
            }
        }
        return 1;
    }

    public static void a(String str, long j, boolean z) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), Byte.valueOf(z ? (byte) 1 : 0)}, null, f34731a, true, 23993, new Class[]{String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), Byte.valueOf(z)}, null, f34731a, true, 23993, new Class[]{String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = null;
            if (c.a()) {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(PushConstants.WEB_URL, str2);
                    jSONObject.put("fromNetwork", z);
                } catch (Exception unused) {
                }
            }
            n.a("aweme_image_load_error_rate", 0, jSONObject);
            if (j2 > 0) {
                n.a("aweme_image_load", "load_time", (float) j2);
            }
        }
    }
}
