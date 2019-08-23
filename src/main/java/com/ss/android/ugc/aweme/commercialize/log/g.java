package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commercialize.log.c;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.model.l;
import com.ss.android.ugc.aweme.commercialize.utils.al;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39316a;

    public interface a {
        void a(String str, String str2, long j);
    }

    public static String a(int i) {
        switch (i) {
            case 2:
                return "draw_ad";
            case 3:
            case 11:
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*?: ONE_ARG  (12 int)*/:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
                return "background_ad";
            case 6:
                return "comment_end_ad";
            case 8:
                return "homepage_ad";
            default:
                return null;
        }
    }

    public static boolean e(Context context, AwemeRawAd awemeRawAd) {
        return (context == null || awemeRawAd == null) ? false : true;
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f39316a, true, 31488, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f39316a, true, 31488, new Class[]{JSONObject.class}, JSONObject.class);
        } else if (jSONObject2 == null) {
            return null;
        } else {
            try {
                JsonObject asJsonObject = new JsonParser().parse(jSONObject2.getString("log_extra")).getAsJsonObject();
                JSONObject jSONObject3 = new JSONObject();
                if (asJsonObject.get("rit") != null) {
                    jSONObject3.put("ctr_rit", asJsonObject.get("rit").getAsString());
                }
                return jSONObject3;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public static void a(Context context, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, jSONObject}, null, f39316a, true, 31490, new Class[]{Context.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, jSONObject}, null, f39316a, true, 31490, new Class[]{Context.class, Aweme.class, JSONObject.class}, Void.TYPE);
            return;
        }
        b(context2, "show_failed", aweme2, c(context, aweme, jSONObject));
    }

    public static void a(Context context, Aweme aweme, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31491, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31491, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("filter_reason", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
        b(context2, "item_repeat", aweme2, a(context2, aweme2, "raw ad item repeat", false, (Map<String, String>) hashMap));
    }

    public static void b(Context context, Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{context, aweme, Integer.valueOf(i)}, null, f39316a, true, 31492, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aweme, Integer.valueOf(i)}, null, f39316a, true, 31492, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            d(context, aweme, i);
        } else {
            c(context, aweme, i);
        }
        al.a(aweme);
    }

    public static void a(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, jSONObject2}, null, f39316a, true, 31496, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31496, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, "landing_ad", str2, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    public static void a(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31497, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31497, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        a(context2, "landing_open_url_app", aweme2, f(context2, aweme2, "landing ad open url"));
    }

    public static void a(Context context, Aweme aweme, long j, int i) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, aweme, new Long(j2), Integer.valueOf(i)}, null, f39316a, true, 31505, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, aweme, new Long(j2), Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31505, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(context, aweme, j, i, "break", (Integer) null);
    }

    public static void a(Context context, Aweme aweme, long j, int i, String str, Integer num) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        long j2 = j;
        String str2 = str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, new Long(j2), Integer.valueOf(i), str2, null}, null, f39316a, true, 31508, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE, String.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, new Long(j2), Integer.valueOf(i), str2, null}, null, f39316a, true, 31508, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE, String.class, Integer.class}, Void.TYPE);
        } else if (aweme2 != null && aweme.getAwemeRawAd() != null) {
            HashMap hashMap = new HashMap();
            if (com.ss.android.g.a.a()) {
                hashMap.put("play_order", Integer.valueOf(i));
            }
            if (al.e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(al.d(aweme) ? 1 : 0));
            }
            JSONObject a2 = a(context2, aweme2, "raw ad over duration", false, a((Map<String, Object>) hashMap));
            try {
                a2.put("duration", j2);
                if (aweme.getVideo() != null) {
                    i2 = aweme.getVideo().getVideoLength();
                }
                a2.put("video_length", i2);
                if (TextUtils.equals(str2, "play_break")) {
                    a2.put("user_id", d.a().getCurUserId());
                }
            } catch (JSONException unused) {
            }
            al.a(aweme, j);
            b(context2, str2, aweme2, a2);
        }
    }

    public static void a(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31509, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31509, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        if (al.e(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("trueview_play_type", str2);
            b(context2, "trueview_play", aweme2, a(context2, aweme2, "trueview_play", false, a((Map<String, Object>) hashMap)));
        } else {
            b(context2, "trueview_play", aweme2, f(context2, aweme2, "trueview_play"));
        }
        c(aweme);
    }

    public static void b(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31510, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31510, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "ad_click", aweme2, f(context2, aweme2, "raw ad ad click"));
    }

    @Deprecated
    public static void a(@NonNull String str, Context context, Aweme aweme, String str2) {
        if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
            a(context, "draw_ad", str, b(context, aweme, str, str2), b(aweme.getAwemeRawAd()), a(aweme.getAwemeRawAd()));
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            throw new NullPointerException("aweme is null");
        }
    }

    public static void a(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, strArr}, null, f39316a, true, 31514, new Class[]{JSONObject.class, String[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, strArr}, null, f39316a, true, 31514, new Class[]{JSONObject.class, String[].class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            int i = 0;
            while (i < 2) {
                try {
                    if (strArr[0] != null) {
                        optJSONObject.put(strArr[0], strArr[1]);
                    }
                    i += 2;
                } catch (JSONException unused) {
                    return;
                }
            }
            jSONObject2.put("ad_extra_data", optJSONObject);
        }
    }

    public static void b(@NonNull String str, Context context, Aweme aweme) {
        String str2 = str;
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str2, context2, aweme2}, null, f39316a, true, 31515, new Class[]{String.class, Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, context2, aweme2}, null, f39316a, true, 31515, new Class[]{String.class, Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, str2, aweme2, f(context2, aweme2, str2));
    }

    public static void b(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31519, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31519, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
        } else if (c.u(aweme)) {
            a(context2, str2, "click_product", aweme2, a(context2, aweme2, "raw ad product click", false, (Map<String, String>) e(aweme)));
        }
    }

    public static void a(Context context, Aweme aweme, h hVar) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31521, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31521, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE);
        } else if (c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "click_shop_page", aweme2, a(context2, aweme2, "", false, (Map<String, String>) hashMap));
        }
    }

    public static void b(Context context, Aweme aweme, h hVar) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31522, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31522, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE);
        } else if (c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "click_consult", aweme2, a(context2, aweme2, "raw ad click consult", false, (Map<String, String>) hashMap));
        }
    }

    public static void a(Context context, Aweme aweme, h hVar, long j, long j2) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar, new Long(j3), new Long(j4)}, null, f39316a, true, 31524, new Class[]{Context.class, Aweme.class, h.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, hVar, new Long(j3), new Long(j4)}, null, f39316a, true, 31524, new Class[]{Context.class, Aweme.class, h.class, Long.TYPE, Long.TYPE}, Void.TYPE);
        } else if (c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_price", Integer.valueOf(hVar.getPrice()));
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap2.put("click_buy_time", Long.valueOf(j));
            hashMap2.put("commodity_duration", Long.valueOf(j2));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "click_buy_right_now", aweme2, a(context2, aweme2, "raw ad click buy_right_now", false, (Map<String, String>) hashMap));
        }
    }

    public static void a(Context context, Aweme aweme, h hVar, long j) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar, new Long(j2)}, null, f39316a, true, 31527, new Class[]{Context.class, Aweme.class, h.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, hVar, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31527, new Class[]{Context.class, Aweme.class, h.class, Long.TYPE}, Void.TYPE);
        } else if (c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_price", Integer.valueOf(hVar.getPrice()));
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap2.put("commodity_duration", Long.valueOf(j));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "click_want", aweme2, a(context2, aweme2, "", false, (Map<String, String>) hashMap));
        }
    }

    public static void b(Context context, Aweme aweme, h hVar, long j) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar, new Long(j2)}, null, f39316a, true, 31529, new Class[]{Context.class, Aweme.class, h.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, hVar, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31529, new Class[]{Context.class, Aweme.class, h.class, Long.TYPE}, Void.TYPE);
        } else if (c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_price", Integer.valueOf(hVar.getPrice()));
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap2.put("commodity_duration", Long.valueOf(j));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "click_return", aweme2, a(context2, aweme2, "", false, (Map<String, String>) hashMap));
        }
    }

    public static void a(Context context, AwemeRawAd awemeRawAd, String str) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31537, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31537, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, awemeRawAd2, "open_url_app", e(context2, awemeRawAd2, "raw ad open_url_app"), str2);
    }

    public static void b(Context context, AwemeRawAd awemeRawAd, String str) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31542, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31542, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, awemeRawAd2, "open_url_h5", e(context2, awemeRawAd2, "raw ad open_url_h5"), str2);
    }

    public static void a(Context context, Aweme aweme, Map<String, String> map) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, map2}, null, f39316a, true, 31551, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, map2}, null, f39316a, true, 31551, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = null;
        if (map.size() != 0) {
            hashMap = new HashMap();
            hashMap.put("ad_extra_data", new Gson().toJson((Object) map2));
        }
        c(context2, "othershow", aweme2, a(context2, aweme2, "raw ad background show", false, (Map<String, String>) hashMap));
    }

    public static void b(Context context, Aweme aweme, Map<String, String> map) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, map2}, null, f39316a, true, 31553, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, map2}, null, f39316a, true, 31553, new Class[]{Context.class, Aweme.class, Map.class}, Void.TYPE);
            return;
        }
        c(context2, "click", aweme2, a(context2, aweme2, "raw ad background click", true, map2));
        b(aweme);
    }

    public static void a(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject jSONObject;
        Context context2 = context;
        Aweme aweme2 = aweme;
        FollowStatus followStatus2 = followStatus;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, followStatus2}, null, f39316a, true, 31564, new Class[]{Context.class, Aweme.class, FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, followStatus2}, null, f39316a, true, 31564, new Class[]{Context.class, Aweme.class, FollowStatus.class}, Void.TYPE);
            return;
        }
        if (c.x(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("is_cheated_follow", Integer.valueOf((followStatus2 == null || !followStatus.isCheating()) ? 0 : 1));
            if (followStatus2 != null) {
                i = followStatus2.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i));
            jSONObject = a(context2, aweme2, "raw ad follow", false, a((Map<String, Object>) hashMap));
        } else {
            jSONObject = f(context2, aweme2, "raw ad follow");
        }
        b(context2, "follow", aweme2, jSONObject);
    }

    public static void b(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject jSONObject;
        Context context2 = context;
        Aweme aweme2 = aweme;
        FollowStatus followStatus2 = followStatus;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, followStatus2}, null, f39316a, true, 31567, new Class[]{Context.class, Aweme.class, FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, followStatus2}, null, f39316a, true, 31567, new Class[]{Context.class, Aweme.class, FollowStatus.class}, Void.TYPE);
            return;
        }
        if (c.x(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("is_cheated_follow", Integer.valueOf((followStatus2 == null || !followStatus.isCheating()) ? 0 : 1));
            if (followStatus2 != null) {
                i = followStatus2.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i));
            jSONObject = a(context2, aweme2, "raw ad follow", false, a((Map<String, Object>) hashMap));
        } else {
            jSONObject = f(context2, aweme2, "raw ad follow");
        }
        d(context2, "follow", aweme2, jSONObject);
    }

    public static void a(Context context, AwemeRawAd awemeRawAd) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31615, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31615, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE);
            return;
        }
        a(context2, "click", awemeRawAd2, a(context2, awemeRawAd2, "raw feed comment click", true));
        c(awemeRawAd);
    }

    public static void b(Context context, AwemeRawAd awemeRawAd) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31619, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31619, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE);
            return;
        }
        b(context2, "comment_end_show", awemeRawAd2, e(context2, awemeRawAd2, "raw feed comment end show"));
    }

    public static void c(Context context, AwemeRawAd awemeRawAd) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31620, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31620, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE);
            return;
        }
        b(context2, "click", awemeRawAd2, a(context2, awemeRawAd2, "raw feed comment end click", true));
        c(awemeRawAd);
    }

    public static void c(Context context, AwemeRawAd awemeRawAd, String str) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31650, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31650, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, awemeRawAd2, "show", e(context2, awemeRawAd2, "poi ad show"), str2);
    }

    public static void d(Context context, AwemeRawAd awemeRawAd, String str) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31651, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31651, new Class[]{Context.class, AwemeRawAd.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, awemeRawAd2, "click", a(context2, awemeRawAd2, "poi ad click", true), str2);
    }

    public static void b(Context context, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, jSONObject}, null, f39316a, true, 31652, new Class[]{Context.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, jSONObject}, null, f39316a, true, 31652, new Class[]{Context.class, Aweme.class, JSONObject.class}, Void.TYPE);
            return;
        }
        b(context2, "show_failed", aweme2, c(context, aweme, jSONObject));
    }

    public static void a(Context context, Aweme aweme, boolean z, boolean z2) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f39316a, true, 31653, new Class[]{Context.class, Aweme.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, Byte.valueOf(z), Byte.valueOf(z2)}, null, f39316a, true, 31653, new Class[]{Context.class, Aweme.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("splash_id", c.U(aweme));
            jSONObject2.put("splash_ready", z);
            jSONObject2.put("show_immediately", z2);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException unused) {
        }
        b(context2, "splash_pick", aweme2, c(context2, aweme2, jSONObject));
    }

    public static void e(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31661, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31661, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ad_extra_data", new Gson().toJson((Object) hashMap));
        b(context2, "download_video_no_download", aweme2, a(context2, aweme2, "raw ad download video no download", false, (Map<String, String>) hashMap2));
    }

    public static void a(Context context, long j, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Context context2 = context;
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2), str2}, null, f39316a, true, 31670, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, new Long(j2), str2}, null, f39316a, true, 31670, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE);
        } else if (a()) {
            try {
                jSONObject2 = a(context2, (JSONObject) null, str2);
                try {
                    jSONObject = b(jSONObject2);
                } catch (JSONException unused) {
                    jSONObject = jSONObject2;
                    r.a(context, "splash_ad", "first_view", String.valueOf(j), 0, jSONObject);
                }
            } catch (JSONException unused2) {
                jSONObject2 = new JSONObject();
                jSONObject = jSONObject2;
                r.a(context, "splash_ad", "first_view", String.valueOf(j), 0, jSONObject);
            }
            r.a(context, "splash_ad", "first_view", String.valueOf(j), 0, jSONObject);
        }
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f39316a, true, 31676, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f39316a, true, 31676, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.commercialize.splash.h.c()) {
            return false;
        }
        com.ss.android.ugc.aweme.commercialize.splash.h.a(true);
        return true;
    }

    public static void a(Context context, Aweme aweme, String str, String str2) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str3, str4}, null, f39316a, true, 31680, new Class[]{Context.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, str3, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31680, new Class[]{Context.class, Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("refer", str4);
        b(context2, str3, aweme2, a(context2, aweme2, "raw ad other", false, (Map<String, String>) hashMap));
    }

    public static void a(Context context, String str, Aweme aweme) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2}, null, f39316a, true, 31681, new Class[]{Context.class, String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, aweme2}, null, f39316a, true, 31681, new Class[]{Context.class, String.class, Aweme.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, str2, "live_click_source", f(context2, aweme2, "ad live click"), aweme.getAwemeRawAd());
        }
    }

    public static JSONObject a(Context context, Aweme aweme, String str, boolean z, Map<String, String> map) {
        Context context2 = context;
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, aweme, str2, Byte.valueOf(z ? (byte) 1 : 0), map2}, null, f39316a, true, 31684, new Class[]{Context.class, Aweme.class, String.class, Boolean.TYPE, Map.class}, JSONObject.class)) {
            Object[] objArr = {context2, aweme, str2, Byte.valueOf(z), map2};
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, f39316a, true, 31684, new Class[]{Context.class, Aweme.class, String.class, Boolean.TYPE, Map.class}, JSONObject.class);
        } else if (!S(context, aweme)) {
            return new JSONObject();
        } else {
            return a(context2, aweme.getAwemeRawAd(), str2, z, map2);
        }
    }

    public static JSONObject a(Context context, Aweme aweme, String str, boolean z) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, aweme2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39316a, true, 31685, new Class[]{Context.class, Aweme.class, String.class, Boolean.TYPE}, JSONObject.class)) {
            return a(context2, aweme2, str2, z, (Map<String, String>) null);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2, Byte.valueOf(z)}, null, f39316a, true, 31685, new Class[]{Context.class, Aweme.class, String.class, Boolean.TYPE}, JSONObject.class);
    }

    private static JSONObject a(Context context, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd, jSONObject}, null, f39316a, true, 31687, new Class[]{Context.class, AwemeRawAd.class, JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd, jSONObject}, null, f39316a, true, 31687, new Class[]{Context.class, AwemeRawAd.class, JSONObject.class}, JSONObject.class);
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        try {
            a(context2, jSONObject2, awemeRawAd.getLogExtra());
        } catch (JSONException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
        }
        return jSONObject2;
    }

    public static JSONObject a(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, awemeRawAd2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39316a, true, 31689, new Class[]{Context.class, AwemeRawAd.class, String.class, Boolean.TYPE}, JSONObject.class)) {
            return a(context2, awemeRawAd2, str2, z, (Map<String, String>) null);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2, str2, Byte.valueOf(z)}, null, f39316a, true, 31689, new Class[]{Context.class, AwemeRawAd.class, String.class, Boolean.TYPE}, JSONObject.class);
    }

    public static JSONObject a(Context context, AwemeRawAd awemeRawAd, String str, boolean z, @Nullable Map<String, String> map) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd, str, Byte.valueOf(z ? (byte) 1 : 0), map}, null, f39316a, true, 31690, new Class[]{Context.class, AwemeRawAd.class, String.class, Boolean.TYPE, Map.class}, JSONObject.class)) {
            Object[] objArr = {context2, awemeRawAd, str, Byte.valueOf(z), map};
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, f39316a, true, 31690, new Class[]{Context.class, AwemeRawAd.class, String.class, Boolean.TYPE, Map.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            a(context2, jSONObject, awemeRawAd.getLogExtra());
            if (z) {
                jSONObject.put("has_v3", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            }
        } catch (JSONException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
        }
        return jSONObject;
    }

    @NonNull
    public static JSONObject a(@NonNull Context context, @Nullable JSONObject jSONObject, String str) throws JSONException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, jSONObject, str2}, null, f39316a, true, 31692, new Class[]{Context.class, JSONObject.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context, jSONObject, str2}, null, f39316a, true, 31692, new Class[]{Context.class, JSONObject.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        if (!TextUtils.isEmpty(str)) {
            jSONObject2.put("log_extra", str2);
        }
        jSONObject2.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        if (!StringUtils.isEmpty(networkAccessType)) {
            jSONObject2.put("nt", networkAccessType);
        }
        return jSONObject2;
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject, Aweme aweme) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        JSONObject jSONObject2 = jSONObject;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, jSONObject2, aweme2}, null, f39316a, true, 31693, new Class[]{Context.class, String.class, String.class, JSONObject.class, Aweme.class}, Void.TYPE)) {
            Object[] objArr = {context2, str3, str4, jSONObject2, aweme2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31693, new Class[]{Context.class, String.class, String.class, JSONObject.class, Aweme.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, str3, str4, c(context2, aweme2, jSONObject2), aweme.getAwemeRawAd());
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6}, null, f39316a, true, 31694, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31694, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, "show", str4, str5, str6);
    }

    public static void b(Context context, String str, String str2, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6}, null, f39316a, true, 31695, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31695, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, "click", str4, str5, str6);
    }

    private static void a(Context context, String str, String str2, String str3, String str4) {
        String str5 = str3;
        String str6 = str4;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str5, str6}, null, f39316a, true, 31696, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, str5, str6};
            PatchProxy.accessDispatch(objArr, null, f39316a, true, 31696, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", str5);
            jSONObject.put("log_extra", str6);
            jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (JSONException unused) {
        }
        a(context, "result_ad", str, jSONObject, str2, 0);
    }

    public static void b(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, jSONObject2}, null, f39316a, true, 31697, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31697, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, "draw_ad", str2, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    public static void a(Context context, String str, String str2, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, aweme2, jSONObject2}, null, f39316a, true, 31698, new Class[]{Context.class, String.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str3, str4, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31698, new Class[]{Context.class, String.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, str3, str4, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    public static void c(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, jSONObject2}, null, f39316a, true, 31700, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31700, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, "background_ad", str2, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    public static void d(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, jSONObject2}, null, f39316a, true, 31701, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31701, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, "homepage_ad", str2, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    public static void a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, awemeRawAd2, jSONObject2}, null, f39316a, true, 31703, new Class[]{Context.class, String.class, AwemeRawAd.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, awemeRawAd2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31703, new Class[]{Context.class, String.class, AwemeRawAd.class, JSONObject.class}, Void.TYPE);
        } else if (e(context2, awemeRawAd2)) {
            a(context2, "comment_first_ad", str2, jSONObject2, awemeRawAd2);
        }
    }

    public static void b(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, awemeRawAd2, jSONObject2}, null, f39316a, true, 31704, new Class[]{Context.class, String.class, AwemeRawAd.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, awemeRawAd2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31704, new Class[]{Context.class, String.class, AwemeRawAd.class, JSONObject.class}, Void.TYPE);
        } else if (e(context2, awemeRawAd2)) {
            a(context2, "comment_end_ad", str2, jSONObject2, awemeRawAd2);
        }
    }

    public static void e(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, jSONObject2}, null, f39316a, true, 31705, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31705, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, "feed_download_ad", str2, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    private static void a(Context context, AwemeRawAd awemeRawAd, String str, JSONObject jSONObject, String str2) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2, str3, jSONObject, str2}, null, f39316a, true, 31710, new Class[]{Context.class, AwemeRawAd.class, String.class, JSONObject.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, awemeRawAd2, str3, jSONObject, str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31710, new Class[]{Context.class, AwemeRawAd.class, String.class, JSONObject.class, String.class}, Void.TYPE);
        } else if (e(context, awemeRawAd) && !TextUtils.isEmpty(str)) {
            a(context2, "poi_ad", str3, w.a(jSONObject, str2), awemeRawAd2);
        }
    }

    public static void a(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull JSONObject jSONObject, @NonNull AwemeRawAd awemeRawAd) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, str4, jSONObject, awemeRawAd}, null, f39316a, true, 31712, new Class[]{Context.class, String.class, String.class, JSONObject.class, AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str3, str4, jSONObject, awemeRawAd}, null, f39316a, true, 31712, new Class[]{Context.class, String.class, String.class, JSONObject.class, AwemeRawAd.class}, Void.TYPE);
            return;
        }
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            str3 = TextUtils.equals(str3, "background_ad") ? "background_ads" : "topic_ads";
        }
        if (com.ss.android.g.a.a() && TextUtils.equals("click", str4)) {
            am.a(awemeRawAd);
        }
        a(context, str3, str2, jSONObject, b(awemeRawAd), a(awemeRawAd));
    }

    public static void a(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull JSONObject jSONObject, @NonNull String str3, long j) {
        String str4 = str;
        String str5 = str2;
        JSONObject jSONObject2 = jSONObject;
        String str6 = str3;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str4, str5, jSONObject2, str6, new Long(j2)}, null, f39316a, true, 31713, new Class[]{Context.class, String.class, String.class, JSONObject.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str4, str5, jSONObject2, str6, new Long(j2)}, null, f39316a, true, 31713, new Class[]{Context.class, String.class, String.class, JSONObject.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("click", str5)) {
            al.a(str3);
            a(str4, str6, j2, jSONObject2);
            try {
                jSONObject2.put("has_v3", 1);
            } catch (JSONException unused) {
            }
        }
        r.a(context, str, str2, str3, j, jSONObject);
        com.ss.android.ugc.aweme.g.a.a();
    }

    public static void a(@NonNull String str, String str2, long j, JSONObject jSONObject) {
        String str3 = str;
        long j2 = j;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str3, str2, new Long(j2), jSONObject2}, null, f39316a, true, 31716, new Class[]{String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {str3, str2, new Long(j2), jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31716, new Class[]{String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        long j3 = 0;
        try {
            j3 = Long.parseLong(str2);
        } catch (Exception unused) {
        }
        JSONObject jSONObject3 = null;
        if (jSONObject2 != null) {
            jSONObject3 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("has_v3", next)) {
                    try {
                        jSONObject3.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        new c.a().b(str3).a("realtime_click").a(j3).b(j2).a(jSONObject3).a().a();
        n.a("ctr_monitor", "ctr_click", a(jSONObject));
    }

    static final /* synthetic */ void c(Aweme aweme, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("show").b(aweme).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(aweme).a(GlobalContext.getContext());
        }
    }

    public static void b(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39316a, true, 31721, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39316a, true, 31721, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            a((a) new i(aweme2), (Collection<String>) aweme.getRawAdClickTrackUrlList(), true);
        }
    }

    static final /* synthetic */ void b(Aweme aweme, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("click").b(aweme).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(aweme).a(GlobalContext.getContext());
        }
    }

    public static void c(AwemeRawAd awemeRawAd) {
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{awemeRawAd2}, null, f39316a, true, 31722, new Class[]{AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeRawAd2}, null, f39316a, true, 31722, new Class[]{AwemeRawAd.class}, Void.TYPE);
        } else if (awemeRawAd2 != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                a((a) new o(awemeRawAd2), (Collection<String>) clickTrackUrlList.getUrlList(), true);
            }
        }
    }

    static final /* synthetic */ void a(AwemeRawAd awemeRawAd, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("click").b(awemeRawAd).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(awemeRawAd).a(GlobalContext.getContext());
        }
    }

    public static void c(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39316a, true, 31725, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39316a, true, 31725, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            a((a) new q(aweme2), (Collection<String>) aweme.getRawAdEffectivePlayTrackUrlList(), false);
        }
    }

    public static void d(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39316a, true, 31726, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39316a, true, 31726, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            a((a) new r(aweme2), (Collection<String>) aweme.getRawAdPlayOverTrackUrlList(), false);
        }
    }

    static final /* synthetic */ void a(Aweme aweme, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("play_over").b(aweme).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("play_over").a(aweme).a(GlobalContext.getContext());
        }
    }

    public static void a(@Nullable a aVar, UrlModel urlModel, boolean z) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, urlModel, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39316a, true, 31728, new Class[]{a.class, UrlModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, urlModel, Byte.valueOf(z)}, null, f39316a, true, 31728, new Class[]{a.class, UrlModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty())) {
            a(aVar2, (Collection<String>) urlModel.getUrlList(), z);
        }
    }

    public static void a(@Nullable a aVar, Collection<String> collection, boolean z) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, collection, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39316a, true, 31731, new Class[]{a.class, Collection.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, collection, Byte.valueOf(z)}, null, f39316a, true, 31731, new Class[]{a.class, Collection.class, Boolean.TYPE}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(collection)) {
            for (String next : collection) {
                if (!TextUtils.isEmpty(next)) {
                    a(next, z, aVar2);
                } else {
                    boolean z2 = z;
                }
            }
        }
    }

    private static void a(String str, boolean z, a aVar) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), aVar}, null, f39316a, true, 31732, new Class[]{String.class, Boolean.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), aVar}, null, f39316a, true, 31732, new Class[]{String.class, Boolean.TYPE, a.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a(str2, currentTimeMillis);
        if (z) {
            a2 = StringUtils.handleAdClickTrackUrl(a2);
        }
        String str3 = a2;
        Uri parse = Uri.parse(str3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url", str3);
            jSONObject.put("scheme", parse.getScheme());
            jSONObject.put("host", parse.getHost());
            jSONObject.put("path", parse.getPath());
        } catch (JSONException unused) {
        }
        s sVar = new s(aVar, str3, currentTimeMillis, jSONObject);
        z.a(str3, sVar);
    }

    public static void a(Context context, j jVar, Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, jVar, aweme, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39316a, true, 31734, new Class[]{Context.class, j.class, Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, jVar, aweme, Byte.valueOf(z)}, null, f39316a, true, 31734, new Class[]{Context.class, j.class, Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a("link_click", context, jVar, aweme, z, false);
    }

    public static void a(Context context, Category category) {
        Context context2 = context;
        Category category2 = category;
        if (PatchProxy.isSupport(new Object[]{context2, category2}, null, f39316a, true, 31735, new Class[]{Context.class, Category.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, category2}, null, f39316a, true, 31735, new Class[]{Context.class, Category.class}, Void.TYPE);
            return;
        }
        d.a().b("video_slide").g(category.getLogExtra()).a("discovery_ad").d("video").a(Long.valueOf(category.getCreativeId())).a(context2);
        d.a().b("click").g(category.getLogExtra()).a("discovery_ad").d("video").a(Long.valueOf(category.getCreativeId())).a(context2);
        a((a) new t(category2), category.getClickTrackUrlList(), true);
    }

    static final /* synthetic */ void d(Category category, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("click").a(Long.valueOf(category.getCreativeId())).g(category.getLogExtra()).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(category).b();
        }
    }

    static final /* synthetic */ void c(Category category, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("click").a(Long.valueOf(category.getCreativeId())).g(category.getLogExtra()).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(category).b();
        }
    }

    static final /* synthetic */ void b(Category category, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("show").a(Long.valueOf(category.getCreativeId())).g(category.getLogExtra()).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(category).b();
        }
    }

    static final /* synthetic */ void a(Category category, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("click").a(Long.valueOf(category.getCreativeId())).g(category.getLogExtra()).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(category).b();
        }
    }

    public static void a(Context context, Banner banner, int i) {
        Context context2 = context;
        Banner banner2 = banner;
        if (PatchProxy.isSupport(new Object[]{context2, banner2, Integer.valueOf(i)}, null, f39316a, true, 31740, new Class[]{Context.class, Banner.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, banner2, Integer.valueOf(i)}, null, f39316a, true, 31740, new Class[]{Context.class, Banner.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i));
        d.a().b("click").g(banner.getLogExtra()).a("discovery_ad").d("banner").a(Long.valueOf(banner.getCreativeId())).a((Object) hashMap).a(context2);
        a((a) new k(banner2, hashMap), (Collection<String>) banner.getClickTrackUrlList(), true);
    }

    static final /* synthetic */ void b(Banner banner, Map map, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("click").a(Long.valueOf(banner.getCreativeId())).g(banner.getLogExtra()).a((Object) map).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(banner).b();
        }
    }

    static final /* synthetic */ void a(Banner banner, Map map, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("show").a(Long.valueOf(banner.getCreativeId())).g(banner.getLogExtra()).a((Object) map).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(banner).b();
        }
    }

    public static void a(String str, Context context, j jVar, Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, context, jVar, aweme, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39316a, true, 31749, new Class[]{String.class, Context.class, j.class, Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, context, jVar, aweme, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31749, new Class[]{String.class, Context.class, j.class, Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {str, context, jVar, aweme, Byte.valueOf(z), null};
        if (PatchProxy.isSupport(objArr3, null, f39316a, true, 31750, new Class[]{String.class, Context.class, j.class, Aweme.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr4 = {str, context, jVar, aweme, Byte.valueOf(z), null};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, f39316a, true, 31750, new Class[]{String.class, Context.class, j.class, Aweme.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(str, context, jVar, aweme, z, true);
    }

    @Deprecated
    private static void a(String str, Context context, j jVar, Aweme aweme, boolean z, boolean z2) {
        JSONObject b2;
        String b3;
        if (context == null || jVar == null) {
            if (com.ss.android.ugc.aweme.g.a.a()) {
                throw new NullPointerException("context or linkAd is null");
            }
        } else if (z2 || (aweme != null && aweme.isAd())) {
            String str2 = "link";
            if (!z) {
                switch (jVar.feedShowType) {
                    case 1:
                        str2 = "link_logo";
                        break;
                    case 2:
                        str2 = "link_bar";
                        break;
                }
            }
            if (z2) {
                b2 = a(context, jVar, str2, aweme.getAid());
                b3 = jVar.creativeId;
            } else {
                b2 = b(context, aweme, "logAdLink", str2);
                b3 = b(aweme.getAwemeRawAd());
            }
            a(context, z ? "comment_ad" : "draw_ad", str, b2, b3, a(aweme));
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            throw new RuntimeException("aweme is not ad while use ad data");
        }
    }

    public static void a(Context context, com.ss.android.ugc.aweme.commercialize.link.a.a aVar) {
        String str;
        JSONObject jSONObject;
        Context context2 = context;
        com.ss.android.ugc.aweme.commercialize.link.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f39316a, true, 31751, new Class[]{Context.class, com.ss.android.ugc.aweme.commercialize.link.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f39316a, true, 31751, new Class[]{Context.class, com.ss.android.ugc.aweme.commercialize.link.a.a.class}, Void.TYPE);
        } else if (context2 == null || aVar2 == null || aVar2.f38953c == null) {
            if (com.ss.android.ugc.aweme.g.a.a()) {
                throw new NullPointerException("context or linkAd is null");
            }
        } else if (aVar2.f38956f || (aVar2.f38954d != null && aVar2.f38954d.isAd())) {
            j jVar = aVar2.f38953c;
            Aweme aweme = aVar2.f38954d;
            String str2 = "link";
            if (!aVar2.f38955e) {
                switch (jVar.feedShowType) {
                    case 1:
                        str2 = "link_logo";
                        break;
                    case 2:
                        str2 = "link_bar";
                        break;
                }
            }
            if (aVar2.f38956f) {
                jSONObject = a(context, jVar, str2, aweme.getAid());
                str = jVar.creativeId;
            } else {
                JSONObject b2 = b(context, aweme, "logAdLink", str2);
                str = b(aweme.getAwemeRawAd());
                jSONObject = b2;
            }
            aVar2.b(jSONObject);
            aVar2.a(jSONObject);
            a(context, aVar2.f38955e ? "comment_ad" : "draw_ad", aVar2.f38952b, jSONObject, str, a(aweme));
            a(aVar);
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            throw new InvalidParameterException("aweme is invalid");
        }
    }

    private static void a(com.ss.android.ugc.aweme.commercialize.link.a.a aVar) {
        com.ss.android.ugc.aweme.commercialize.link.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f39316a, true, 31752, new Class[]{com.ss.android.ugc.aweme.commercialize.link.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f39316a, true, 31752, new Class[]{com.ss.android.ugc.aweme.commercialize.link.a.a.class}, Void.TYPE);
        } else if (aVar2 != null && aVar2.f38953c != null) {
            j jVar = aVar2.f38953c;
            if (TextUtils.equals(aVar2.f38952b, "show") || TextUtils.equals(aVar2.f38952b, "comment_show")) {
                a((a) new m(jVar), jVar.getTrackUrlList(), false);
                return;
            }
            if (TextUtils.equals(aVar2.f38952b, "click")) {
                a((a) new n(jVar), jVar.getClickTrackUrlList(), true);
            }
        }
    }

    static final /* synthetic */ void b(j jVar, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("show").c(jVar.creativeId).g(jVar.logExtra).c();
        } else {
            d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(jVar).b();
        }
    }

    static final /* synthetic */ void a(j jVar, String str, String str2, long j) {
        if (com.ss.android.g.a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("click").c(jVar.creativeId).g(jVar.logExtra).c();
        } else {
            d.a(str, str2, j).a("track_ad").f("click").a(jVar).b();
        }
    }

    public static void c(Context context, Aweme aweme, String str, String str2) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str3, str4}, null, f39316a, true, 31758, new Class[]{Context.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, str3, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31758, new Class[]{Context.class, Aweme.class, String.class, String.class}, Void.TYPE);
        } else if (S(context, aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("refer", str3);
            a(context, "poi_ad", "otherclick", w.a(a(context2, aweme2, "poi other click", false, (Map<String, String>) hashMap), str4), aweme.getAwemeRawAdIdStr(), a(aweme));
        }
    }

    public static void a(Context context, String str, String str2, AwemeRawAd awemeRawAd, Map<String, String> map) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, awemeRawAd2, map2}, null, f39316a, true, 31761, new Class[]{Context.class, String.class, String.class, AwemeRawAd.class, Map.class}, Void.TYPE)) {
            Object[] objArr = {context2, str3, str4, awemeRawAd2, map2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31761, new Class[]{Context.class, String.class, String.class, AwemeRawAd.class, Map.class}, Void.TYPE);
        } else if (context2 != null && awemeRawAd2 != null) {
            a(context, str, str2, a(context2, awemeRawAd2, str3 + " " + str4, false, map2), b(awemeRawAd), a(awemeRawAd));
        }
    }

    public static void a(@NonNull String str, @Nullable Context context, @Nullable Aweme aweme, @Nullable User user) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, context, aweme, user}, null, f39316a, true, 31764, new Class[]{String.class, Context.class, Aweme.class, User.class}, Void.TYPE)) {
            Object[] objArr = {str2, context, aweme, user};
            PatchProxy.accessDispatch(objArr, null, f39316a, true, 31764, new Class[]{String.class, Context.class, Aweme.class, User.class}, Void.TYPE);
        } else if (context != null) {
            String str3 = "";
            String networkAccessType = NetworkUtils.getNetworkAccessType(context);
            String str4 = PushConstants.PUSH_TYPE_NOTIFY;
            String str5 = PushConstants.PUSH_TYPE_NOTIFY;
            long j = 0;
            if (aweme != null && aweme.isAd()) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd.getLogExtra() != null) {
                    str3 = aweme.getAwemeRawAd().getLogExtra();
                }
                if (awemeRawAd.getCreativeId() != null) {
                    str5 = awemeRawAd.getCreativeId().toString();
                }
                if (awemeRawAd.getGroupId() != null) {
                    j = awemeRawAd.getGroupId().longValue();
                }
            } else if (!(user == null || user.getCommerceInfo() == null || TextUtils.isEmpty(user.getCommerceInfo().getSiteId()))) {
                str4 = user.getCommerceInfo().getSiteId();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log_extra", str3);
                jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                if (!StringUtils.isEmpty(networkAccessType)) {
                    jSONObject.put("nt", networkAccessType);
                }
                jSONObject.put("refer", "popup");
                jSONObject.put("site_id", str4);
            } catch (JSONException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
            }
            r.onEvent(MobClick.obtain().setEventName("homepage_ad").setLabelName(str2).setValue(str5).setExtValueLong(j).setJsonObject(jSONObject));
        }
    }

    public static void b(Context context, Aweme aweme, long j, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, new Long(j2), Integer.valueOf(i)}, null, f39316a, true, 31781, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, new Long(j2), Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31781, new Class[]{Context.class, Aweme.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a() && aweme2 != null && aweme.isAd()) {
            HashMap hashMap = new HashMap();
            if (al.e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(al.d(aweme) ? 1 : 0));
            }
            JSONObject a2 = a(context2, aweme2, "raw ad over duration", false, a((Map<String, Object>) hashMap));
            try {
                a2.put("duration", j2);
                a2.put("video_length", i);
            } catch (JSONException unused) {
            }
            al.b(aweme);
            b(context2, "over", aweme2, a2);
            d(aweme);
        }
    }

    public static void a(l lVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{lVar}, null, f39316a, true, 31784, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar}, null, f39316a, true, 31784, new Class[]{l.class}, Void.TYPE);
        } else if (lVar != null && !com.ss.android.g.a.a()) {
            if (p.a().b() || System.currentTimeMillis() - p.a().d() >= 5000) {
                z = false;
            }
            if (z) {
                y.a(lVar);
            } else {
                y.a(lVar.toJson());
            }
        }
    }

    public static long a(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39316a, true, 31718, new Class[]{Aweme.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39316a, true, 31718, new Class[]{Aweme.class}, Long.TYPE)).longValue();
        } else if (!aweme.isAd()) {
            return 0;
        } else {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                return 0;
            }
            return a(awemeRawAd);
        }
    }

    public static String b(@NonNull AwemeRawAd awemeRawAd) {
        if (PatchProxy.isSupport(new Object[]{awemeRawAd}, null, f39316a, true, 31719, new Class[]{AwemeRawAd.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{awemeRawAd}, null, f39316a, true, 31719, new Class[]{AwemeRawAd.class}, String.class);
        }
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        return String.valueOf(creativeId);
    }

    private static HashMap<String, String> e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39316a, true, 31526, new Class[]{Aweme.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39316a, true, 31526, new Class[]{Aweme.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = null;
        if (aweme.getPromotion() != null) {
            hashMap = new HashMap<>();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", aweme.getPromotion().getPromotionId());
            hashMap2.put("commodity_type", Integer.valueOf(aweme.getPromotion().getPromotionSource()));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
        }
        return hashMap;
    }

    public static long a(@NonNull AwemeRawAd awemeRawAd) {
        if (PatchProxy.isSupport(new Object[]{awemeRawAd}, null, f39316a, true, 31717, new Class[]{AwemeRawAd.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{awemeRawAd}, null, f39316a, true, 31717, new Class[]{AwemeRawAd.class}, Long.TYPE)).longValue();
        }
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    private static Map<String, String> b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f39316a, true, 31763, new Class[]{Integer.TYPE}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f39316a, true, 31763, new Class[]{Integer.TYPE}, Map.class);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_order", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
        return hashMap;
    }

    public static Map<String, String> a(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f39316a, true, 31762, new Class[]{Map.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{map2}, null, f39316a, true, 31762, new Class[]{Map.class}, Map.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", new Gson().toJson((Object) map2));
        return hashMap;
    }

    public static JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, null, f39316a, true, 31677, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, f39316a, true, 31677, new Class[]{JSONObject.class}, JSONObject.class);
        }
        long currentTimeMillis = System.currentTimeMillis() - com.ss.android.ugc.aweme.commercialize.splash.h.f2932b;
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("launchduration", Long.valueOf(currentTimeMillis));
            jSONObject2.put("ad_extra_data", new Gson().toJson((Object) hashMap));
            jSONObject2.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    private static void f(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39316a, true, 31723, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39316a, true, 31723, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            a((a) new p(aweme2), (Collection<String>) aweme.getRawAdPlayTrackUrlList(), false);
        }
    }

    public static void A(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31589, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31589, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click_button", aweme2, f(context2, aweme2, "raw homepage ad button click"));
    }

    public static void B(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31590, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31590, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click_coupon", aweme2, f(context2, aweme2, "raw homepage ad coupon click"));
    }

    public static void C(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31591, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31591, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click", aweme2, a(context2, aweme2, "raw homepage ad click", true));
        b(aweme);
    }

    public static void D(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31593, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31593, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click_start", aweme2, f(context2, aweme2, "raw homepage ad click start"));
    }

    public static void E(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31594, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31594, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click_call", aweme2, f(context2, aweme2, "raw homepage ad click call"));
    }

    public static void F(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31595, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31595, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click_form", aweme2, f(context2, aweme2, "raw homepage ad click form"));
    }

    public static void G(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31596, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31596, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click_cancel", aweme2, f(context2, aweme2, "raw homepage form click cancel"));
    }

    public static void H(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31597, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31597, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "load_fail", aweme2, f(context2, aweme2, "raw homepage load fail"));
    }

    public static void I(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31598, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31598, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "click_redpacket", aweme2, f(context2, aweme2, "raw homepage click red packet"));
    }

    public static void J(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31599, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31599, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        c(context2, "form_show", aweme2, f(context2, aweme2, "raw ad background form show"));
    }

    public static void K(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31612, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31612, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        g(context2, "click_cancel", aweme2, f(context2, aweme2, "raw feed form click cancel"));
    }

    public static void L(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31613, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31613, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        g(context2, "load_fail", aweme2, f(context2, aweme2, "raw feed form load fail"));
    }

    public static void M(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31630, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31630, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        f(context2, "redpacket_show", aweme2, f(context2, aweme2, "raw feed red packet coupon show"));
    }

    public static void N(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31645, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31645, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "open_card_show", aweme2, f(context2, aweme2, "open app hint show"));
    }

    public static void O(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31646, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31646, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "open_card_close", aweme2, f(context2, aweme2, "open app hint close"));
    }

    public static void P(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31647, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31647, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "open_card_jump", aweme2, f(context2, aweme2, "open app hint jump"));
    }

    public static void Q(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31656, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31656, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "splash_click", aweme2, f(context2, aweme2, "raw ad splash_click"));
    }

    public static void R(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31667, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31667, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "data_invalid", aweme2, f(context2, aweme2, "raw ad data_invalid"));
    }

    public static boolean S(Context context, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, f39316a, true, 31711, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, aweme}, null, f39316a, true, 31711, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || aweme == null) {
            return false;
        } else {
            return aweme.isAd();
        }
    }

    public static void T(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31768, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31768, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "othershow", aweme2, b(context2, aweme2, "raw ad othershow", "sticker"));
    }

    public static void U(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31769, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31769, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "otherclick", aweme2, b(context2, aweme2, "raw ad prop otherclick", "sticker"));
    }

    public static void V(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31771, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31771, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "play_complete", aweme2, f(context2, aweme2, "long video raw ad play"));
        }
    }

    public static void W(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31772, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31772, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "break_complete", aweme2, f(context2, aweme2, "long video raw ad break"));
        }
    }

    public static void X(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31773, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31773, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "over_complete", aweme2, f(context2, aweme2, "long video raw ad over"));
        }
    }

    public static void Y(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31774, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31774, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "like_complete", aweme2, f(context2, aweme2, "long video raw ad like"));
        }
    }

    public static void Z(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31775, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31775, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "like_cancel_complete", aweme2, f(context2, aweme2, "long video raw ad cancel like"));
        }
    }

    public static void aa(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31776, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31776, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "comment_complete", aweme2, f(context2, aweme2, "long video raw ad comment"));
        }
    }

    public static void ab(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31777, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31777, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "share_complete", aweme2, f(context2, aweme2, "long video raw ad share"));
        }
    }

    public static void ac(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31779, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31779, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "click_complete", aweme2, f(context2, aweme2, "long video raw ad label click"));
        }
    }

    public static void ad(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31782, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31782, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "progress_complete", aweme2, f(context2, aweme2, "long video raw ad seek complete"));
        }
    }

    public static void ae(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31783, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31783, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            b(context2, "replay_complete", aweme2, f(context2, aweme2, "long video raw ad replay"));
        }
    }

    public static void d(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31530, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31530, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        c(context2, aweme2, (String) null);
    }

    public static void g(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31538, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31538, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else if (S(context, aweme)) {
            b(context2, "deeplink_success", aweme2, f(context2, aweme2, "raw ad deeplink success"));
            a(new l.a().a("draw_ad").a(System.currentTimeMillis() - 5000).a(aweme.getAwemeRawAd()).a());
        }
    }

    public static void h(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31539, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31539, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "deeplink_failed", aweme2, f(context2, aweme2, "raw ad deeplink failed"));
    }

    public static void i(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31540, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31540, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("fail_reason", "app_uninstalled");
        hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
        b(context2, "deeplink_failed", aweme2, a(context2, aweme2, "raw ad deeplink failed", false, (Map<String, String>) hashMap));
    }

    public static void j(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31541, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31541, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "open_url_h5", aweme2, f(context2, aweme2, "raw ad open_url_h5"));
    }

    public static void k(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31544, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31544, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "slide", aweme2, f(context2, aweme2, "raw ad slide"));
        if (com.ss.android.ugc.aweme.commercialize.utils.c.x(aweme)) {
            b(context2, "click", aweme2, f(context2, aweme2, "raw ad slide+click"));
        }
    }

    public static void l(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31545, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31545, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "like", aweme2, f(context2, aweme2, "raw like"));
    }

    public static void m(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31546, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31546, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "like_cancel", aweme2, f(context2, aweme2, "raw cancel like"));
    }

    public static void n(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31550, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31550, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        c(context2, "button_show", aweme2, f(context2, aweme2, "raw ad background button show"));
    }

    public static void o(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31552, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31552, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        c(context2, "replay", aweme2, f(context2, aweme2, "raw ad background replay"));
        f(aweme);
    }

    public static void p(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31555, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31555, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        c(context2, "click_button", aweme2, f(context2, aweme2, "raw ad background button click"));
    }

    public static void q(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31558, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31558, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "button_show", aweme2, f(context2, aweme2, "raw ad button show"));
    }

    public static void r(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31560, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31560, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "click_coupon", aweme2, f(context2, aweme2, "raw ad coupon click"));
    }

    public static void s(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31565, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31565, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, aweme2, (FollowStatus) null);
    }

    public static void u(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31570, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31570, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "message_click", aweme2, f(context2, aweme2, "raw ad homepage follow"));
    }

    public static void v(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31579, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31579, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        a(context2, "homepage_ad", "click_message", aweme2, a(context2, aweme2, "raw ad click", false));
    }

    public static void w(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31581, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31581, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "challenge_click", aweme2, f(context2, aweme2, "raw ad challenge click"));
    }

    public static void x(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31583, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31583, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "share", aweme2, f(context2, aweme2, "raw ad share"));
    }

    public static void y(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31587, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31587, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "shopping_click", aweme2, f(context2, aweme2, "raw ad click shopping"));
    }

    public static void z(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31588, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31588, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        d(context2, "button_show", aweme2, f(context2, aweme2, "raw homepage ad button show"));
    }

    public static void c(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31520, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31520, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme)) {
            a(context2, "draw_ad", "click_cart", aweme2, a(context2, aweme2, "raw ad click cart", false, (Map<String, String>) e(aweme)));
        }
    }

    public static void f(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31535, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31535, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "open_url_app", aweme2, f(context2, aweme2, "raw ad open_url_app"));
    }

    public static void t(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31566, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31566, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, null}, null, f39316a, true, 31568, new Class[]{Context.class, Aweme.class, FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, null}, null, f39316a, true, 31568, new Class[]{Context.class, Aweme.class, FollowStatus.class}, Void.TYPE);
            return;
        }
        d(context2, "follow_cancel", aweme2, f(context2, aweme2, "raw ad homepage follow cancel"));
    }

    private static String a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, null, f39316a, true, 31733, new Class[]{String.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, null, f39316a, true, 31733, new Class[]{String.class, Long.TYPE}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return str2;
        } else {
            try {
                if (str2.contains("{TS}") || str2.contains("__TS__")) {
                    String replace = str2.replace("{TS}", String.valueOf(j));
                    try {
                        str2 = replace.replace("__TS__", String.valueOf(j));
                    } catch (Exception unused) {
                        str2 = replace;
                    }
                }
                String serverDeviceId = AppLog.getServerDeviceId();
                if (TextUtils.isEmpty(serverDeviceId)) {
                    return str2;
                }
                if (str2.contains("{UID}") || str2.contains("__UID__")) {
                    String replace2 = str2.replace("{UID}", serverDeviceId);
                    try {
                        str2 = replace2.replace("__UID__", serverDeviceId);
                    } catch (Exception unused2) {
                        str2 = replace2;
                    }
                }
                return str2;
            } catch (Exception unused3) {
            }
        }
    }

    public static void e(Context context, Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f39316a, true, 31534, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f39316a, true, 31534, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(context2, "click_source", aweme2, f(context2, aweme2, "raw ad click source"));
    }

    public static void b(Context context, Category category) {
        Context context2 = context;
        Category category2 = category;
        if (PatchProxy.isSupport(new Object[]{context2, category2}, null, f39316a, true, 31739, new Class[]{Context.class, Category.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, category2}, null, f39316a, true, 31739, new Class[]{Context.class, Category.class}, Void.TYPE);
            return;
        }
        d.a().b("otherclick").g(category.getLogExtra()).a("discovery_ad").d(PushConstants.TITLE).a(Long.valueOf(category.getCreativeId())).a(context2);
        a((a) new j(category2), category.getClickTrackUrlList(), true);
    }

    public static void d(Context context, AwemeRawAd awemeRawAd) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31621, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2}, null, f39316a, true, 31621, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE);
            return;
        }
        b(context2, "ad_click", awemeRawAd2, e(context2, awemeRawAd2, "raw feed comment end ad click"));
    }

    @Deprecated
    public static void a(@NonNull String str, Context context, Aweme aweme) {
        b(context, str, aweme, f(context, aweme, str));
    }

    public static JSONObject c(Context context, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, aweme, jSONObject2}, null, f39316a, true, 31686, new Class[]{Context.class, Aweme.class, JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, aweme, jSONObject2}, null, f39316a, true, 31686, new Class[]{Context.class, Aweme.class, JSONObject.class}, JSONObject.class);
        } else if (!S(context, aweme)) {
            return jSONObject2;
        } else {
            return a(context2, aweme.getAwemeRawAd(), jSONObject2);
        }
    }

    public static JSONObject f(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31683, new Class[]{Context.class, Aweme.class, String.class}, JSONObject.class)) {
            return a(context2, aweme2, str2, false);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31683, new Class[]{Context.class, Aweme.class, String.class}, JSONObject.class);
    }

    private static void d(Context context, Aweme aweme, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31495, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31495, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(context2, "play", aweme2, e(context, aweme, i));
        f(aweme);
    }

    @NonNull
    private static JSONObject e(Context context, Aweme aweme, int i) {
        int i2;
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31500, new Class[]{Context.class, Aweme.class, Integer.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31500, new Class[]{Context.class, Aweme.class, Integer.TYPE}, JSONObject.class);
        }
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        HashMap hashMap = new HashMap();
        hashMap.put("play_order", Integer.valueOf(i));
        if (audioManager != null) {
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i2 = -1;
        }
        float f2 = 0.0f;
        if (i2 > 0) {
            f2 = ((float) i2) / 100.0f;
        }
        hashMap.put("playervol", Float.valueOf(((float) ((int) (f2 * 1000.0f))) * 0.001f));
        return a(context2, aweme2, "raw ad play", false, a((Map<String, Object>) hashMap));
    }

    public static void g(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31754, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31754, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
        } else if (S(context, aweme)) {
            a(context, "poi_ad", "coupon_click", w.a(f(context2, aweme2, "poi coupon click"), str2), aweme.getAwemeRawAdIdStr(), a(aweme));
        }
    }

    public static void h(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31755, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31755, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
        } else if (S(context, aweme)) {
            a(context, "poi_ad", "phone_click", w.a(f(context2, aweme2, "poi phone click"), str2), aweme.getAwemeRawAdIdStr(), a(aweme));
        }
    }

    public static void i(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31756, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31756, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
        } else if (S(context, aweme)) {
            a(context, "poi_ad", "collect", w.a(f(context2, aweme2, "poi collect click"), str2), aweme.getAwemeRawAdIdStr(), a(aweme));
        }
    }

    public static void j(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31757, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31757, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
        } else if (S(context, aweme)) {
            a(context, "poi_ad", "collect_cancel", w.a(f(context2, aweme2, "poi collect cancel click"), str2), aweme.getAwemeRawAdIdStr(), a(aweme));
        }
    }

    private static void c(Context context, Aweme aweme, int i) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31494, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, Integer.valueOf(i)}, null, f39316a, true, 31494, new Class[]{Context.class, Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(context2, "play", aweme2, a(context2, aweme2, "raw ad play", false, b(i)));
        f(aweme);
    }

    public static void d(Context context, Aweme aweme, h hVar) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31525, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31525, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "click_confirm", aweme2, a(context2, aweme2, "raw ad click buy_right_now", false, (Map<String, String>) hashMap));
        }
    }

    public static JSONObject e(Context context, AwemeRawAd awemeRawAd, String str) {
        Context context2 = context;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31688, new Class[]{Context.class, AwemeRawAd.class, String.class}, JSONObject.class)) {
            return a(context2, awemeRawAd2, str2, false);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd2, str2}, null, f39316a, true, 31688, new Class[]{Context.class, AwemeRawAd.class, String.class}, JSONObject.class);
    }

    public static void c(Context context, Aweme aweme, h hVar) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31523, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31523, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "add_to_cart", aweme2, a(context2, aweme2, "raw ad click add_to_cart", false, (Map<String, String>) hashMap));
        }
    }

    public static void d(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31586, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31586, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        b(context2, "location_click", aweme2, w.a(f(context2, aweme2, "raw ad click location"), str2));
    }

    public static void c(Context context, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31531, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, str2}, null, f39316a, true, 31531, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject a2 = a(context2, aweme2, "raw ad click", true);
        if (str2 != null) {
            try {
                a2.put("refer", str2);
            } catch (JSONException unused) {
            }
        }
        b(context2, "click", aweme2, a2);
        b(aweme);
    }

    public static void e(Context context, Aweme aweme, h hVar) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31528, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme2, hVar}, null, f39316a, true, 31528, new Class[]{Context.class, Aweme.class, h.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.utils.c.u(aweme) && hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("commodity_id", hVar.getPromotionId());
            hashMap2.put("commodity_price", Integer.valueOf(hVar.getPrice()));
            hashMap2.put("commodity_type", Long.valueOf(hVar.getPromotionSource()));
            hashMap.put("ad_extra_data", new Gson().toJson((Object) hashMap2));
            a(context2, "shop_ad", "click_share", aweme2, a(context2, aweme2, "", false, (Map<String, String>) hashMap));
        }
    }

    public static JSONObject b(Context context, Aweme aweme, String str, String str2) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str3, str4}, null, f39316a, true, 31682, new Class[]{Context.class, Aweme.class, String.class, String.class}, JSONObject.class)) {
            Object[] objArr = {context2, aweme2, str3, str4};
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, f39316a, true, 31682, new Class[]{Context.class, Aweme.class, String.class, String.class}, JSONObject.class);
        }
        JSONObject a2 = a(context2, aweme2, str3, false);
        try {
            if (!TextUtils.isEmpty(str2)) {
                a2.put("refer", str4);
            }
        } catch (JSONException unused) {
        }
        return a2;
    }

    public static void f(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, jSONObject2}, null, f39316a, true, 31707, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31707, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, "draw_redpacket", str2, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    private static void g(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        Context context2 = context;
        String str2 = str;
        Aweme aweme2 = aweme;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme2, jSONObject2}, null, f39316a, true, 31702, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, aweme2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39316a, true, 31702, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
        } else if (S(context2, aweme2)) {
            a(context2, "feed_form", str2, jSONObject2, aweme.getAwemeRawAd());
        }
    }

    private static JSONObject a(@NonNull Context context, @NonNull j jVar, String str, String str2) {
        Context context2 = context;
        j jVar2 = jVar;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, jVar2, str3, str4}, null, f39316a, true, 31691, new Class[]{Context.class, j.class, String.class, String.class}, JSONObject.class)) {
            Object[] objArr = {context2, jVar2, str3, str4};
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, f39316a, true, 31691, new Class[]{Context.class, j.class, String.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            a(context2, jSONObject, jVar2.logExtra);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str3);
                jSONObject.put("item_id", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
