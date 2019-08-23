package com.ss.android.ugc.aweme.feed.g;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45346a;

    public static String a(boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, null, f45346a, true, 41307, new Class[]{Boolean.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, null, f45346a, true, 41307, new Class[]{Boolean.TYPE, String.class}, String.class);
        } else if (!TextUtils.equals("opus", str2)) {
            return str2;
        } else {
            if (z) {
                return "personal_homepage";
            }
            return "others_homepage";
        }
    }

    public static String a(int i, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f45346a, true, 41308, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Byte.valueOf(z)}, null, f45346a, true, 41308, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, String.class);
        }
        switch (i) {
            case 0:
                return "homepage_hot";
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_fresh";
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE:
                return "personal_homepage";
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST:
                return "personal_collection";
            case 2000:
                return "others_homepage";
            case 2001:
                return "others_collection";
            case 3002:
                return "challenge_hot";
            case 3003:
                return "challenge_fresh";
            case 4000:
                if (z) {
                    return "single_song";
                }
                return "single_song_hot";
            case 4001:
                return "single_Msong_fresh";
            case 9000:
                return "discovery";
            case 9001:
                return "playlist";
            default:
                if (TextUtils.equals(str2, "upload")) {
                    return "release";
                }
                return str2;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String str, String str2, Aweme aweme) {
        JSONObject jSONObject2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{jSONObject, str3, str4, aweme}, null, f45346a, true, 41309, new Class[]{JSONObject.class, String.class, String.class, Aweme.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject, str3, str4, aweme}, null, f45346a, true, 41309, new Class[]{JSONObject.class, String.class, String.class, Aweme.class}, JSONObject.class);
        } else if (str3 != null) {
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = jSONObject;
            }
            try {
                if (!"update_tips".equals(str4)) {
                    jSONObject2.put("enter_from", str4);
                }
                if ("like_banner".equals(str3)) {
                    jSONObject2.put("previous_page", str3);
                } else {
                    jSONObject2.put("enter_method", str3);
                }
                if (aweme.getAwemeType() == 2) {
                    jSONObject2.put("is_photo", 1);
                }
            } catch (Exception unused) {
            }
            return jSONObject2;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
