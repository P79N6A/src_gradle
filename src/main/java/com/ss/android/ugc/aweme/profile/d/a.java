package com.ss.android.ugc.aweme.profile.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61358a;

    public static void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f61358a, true, 69884, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f61358a, true, 69884, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            r.a("aweme_profile_list_request_data", (Map) d.a().a("request_type", i).a("to_user_id", str2).f34114b);
        } catch (Exception unused) {
        }
    }

    public static void a(int i, String str, FeedItemList feedItemList) {
        String str2;
        LogPbBean logPbBean;
        String str3 = str;
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, feedItemList2}, null, f61358a, true, 69883, new Class[]{Integer.TYPE, String.class, FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, feedItemList2}, null, f61358a, true, 69883, new Class[]{Integer.TYPE, String.class, FeedItemList.class}, Void.TYPE);
            return;
        }
        try {
            d a2 = d.a().a("request_type", i).a("to_user_id", str3);
            if (feedItemList2 != null) {
                if (feedItemList2.items != null) {
                    a2.a("size", feedItemList2.items.size()).a("log_pb", feedItemList2.logPb).a("request_id", feedItemList.getRequestId());
                    r.a("aweme_profile_list_response_data", (Map) a2.f34114b);
                }
            }
            d a3 = a2.a("is_empty", "true");
            if (feedItemList2 != null) {
                str2 = feedItemList.getRequestId();
            } else {
                str2 = "";
            }
            d a4 = a3.a("request_id", str2);
            if (feedItemList2 != null) {
                logPbBean = feedItemList2.logPb;
            } else {
                logPbBean = null;
            }
            a4.a("log_pb", logPbBean);
            r.a("aweme_profile_list_response_data", (Map) a2.f34114b);
        } catch (Exception unused) {
        }
    }

    public static void a(int i, boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, null, f61358a, true, 69882, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2)}, null, f61358a, true, 69882, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("request", "request");
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("curCount", i2);
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException unused) {
        }
        n.a("aweme_favorite_list_data_log", jSONObject2);
    }

    public static void a(int i, boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), str2}, null, f61358a, true, 69881, new Class[]{Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), str2}, null, f61358a, true, 69881, new Class[]{Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("errorMsg", str2);
            jSONObject2.put("success", 0);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException unused) {
        }
        n.a("aweme_favorite_list_data_log", jSONObject2);
    }

    public static void a(int i, boolean z, int i2, int i3, long j, long j2, int i4) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), 0, Integer.valueOf(i3), new Long(j3), new Long(j4), Integer.valueOf(i4)}, null, f61358a, true, 69880, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), 0, Integer.valueOf(i3), new Long(j3), new Long(j4), Integer.valueOf(i4)}, null, f61358a, true, 69880, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("status_code", 0);
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("hasMore", String.valueOf(i3));
            jSONObject.put("maxCursor", String.valueOf(j));
            jSONObject.put("minCursor", String.valueOf(j2));
            jSONObject.put("listCount", String.valueOf(i4));
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject.toString());
        } catch (JSONException unused) {
        }
        n.a("aweme_favorite_list_data_log", jSONObject2);
    }
}
