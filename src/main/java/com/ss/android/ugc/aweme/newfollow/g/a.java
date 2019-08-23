package com.ss.android.ugc.aweme.newfollow.g;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commerce.service.logs.aj;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.IFollowFeedFetchTrigger;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.u.ar;
import com.ss.android.ugc.aweme.u.as;
import com.ss.android.ugc.aweme.u.at;
import com.ss.android.ugc.aweme.u.n;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.v;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57157a = null;

    /* renamed from: b  reason: collision with root package name */
    private static long f57158b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Long> f57159c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static long f57160d = -1;

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f57157a, true, 61348, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f57157a, true, 61348, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (f57158b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - f57158b;
            if (currentTimeMillis > 0) {
                a(currentTimeMillis, str3, str4);
            }
            f57158b = -1;
        }
    }

    public static void a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, null, f57157a, true, 61350, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, null, f57157a, true, 61350, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        f57159c.put(str2, Long.valueOf(j));
    }

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f57157a, true, 61351, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f57157a, true, 61351, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (a(str) == -1) {
            a(str2, System.currentTimeMillis());
        }
    }

    public static void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f57157a, true, 61354, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f57157a, true, 61354, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (f57160d != -1) {
            long currentTimeMillis = System.currentTimeMillis() - f57160d;
            if (currentTimeMillis > 0) {
                a(currentTimeMillis, str3, str4);
            }
            f57160d = -1;
        }
    }

    public static void a(Aweme aweme, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str2}, null, f57157a, true, 61357, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str2}, null, f57157a, true, 61357, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            c a2 = c.a();
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str2);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            a2.a("is_photo", Integer.valueOf(d(aweme)));
            r.onEvent(MobClick.obtain().setEventName("show").setLabelName(str2).setValue(aweme.getAid()).setJsonObject(a2.b()));
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str2);
            hashMap.put("previous_page", str2);
            hashMap.put("group_id", aa.m(aweme));
            hashMap.put("author_id", aa.a(aweme));
            hashMap.put("log_pb", ai.a().a(aa.c(aweme)));
            hashMap.put("content_type", aa.o(aweme));
            r.a("show", aa.a((Map<String, String>) hashMap));
        }
    }

    public static void a(Aweme aweme, long j, String str) {
        Aweme aweme2 = aweme;
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, new Long(j2), str2}, null, f57157a, true, 61358, new Class[]{Aweme.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, new Long(j2), str2}, null, f57157a, true, 61358, new Class[]{Aweme.class, Long.TYPE, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            c a2 = c.a();
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str2);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            a2.a("is_photo", Integer.valueOf(d(aweme)));
            a2.a("stay_time", String.valueOf(j));
            r.onEvent(MobClick.obtain().setEventName("show_time").setLabelName(str2).setValue(aweme.getAid()).setJsonObject(a2.b()));
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str2);
            hashMap.put("previous_page", str2);
            hashMap.put("group_id", aa.m(aweme));
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("log_pb", ai.a().a(aa.c(aweme)));
            hashMap.put("content_type", aa.o(aweme));
            hashMap.put("stay_time", String.valueOf(j));
            r.a("show_time", aa.a((Map<String, String>) hashMap));
        }
    }

    public static void a(Aweme aweme, String str, String str2, String str3, boolean z, String str4) {
        Aweme aweme2 = aweme;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{aweme2, str5, str6, str7, Byte.valueOf(z ? (byte) 1 : 0), str8}, null, f57157a, true, 61359, new Class[]{Aweme.class, String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str5, str6, str7, Byte.valueOf(z), str8}, null, f57157a, true, 61359, new Class[]{Aweme.class, String.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            ((ar) new ar().a(str5).c(str5).f(aweme2).j(str6)).g(str7).b(i.m() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : "").a(z).a((Map<String, String>) com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a())).e();
            if (TextUtils.equals(str8, "search_result") || TextUtils.equals(str8, "general_search")) {
                j.f42669b.a("search_video_play", aweme2, str5, TextUtils.equals(str8, "search_result"));
            }
            c a2 = c.a();
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str5);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            if (i.m()) {
                a2.a("is_auto_play", (Integer) 1);
            }
            if ("poi_page".equalsIgnoreCase(str5)) {
                a2.a("poi_id", aa.e(aweme));
                a2.a("poi_type", aa.h(aweme));
            }
            a2.a("enter_fullscreen", Integer.valueOf(z ? 1 : 0));
            a2.a("content_source", str7);
            a2.a("tab_name", str6);
            r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(str5).setValue(aweme.getAid()).setJsonObject(a2.b()));
        }
    }

    public static void a(Aweme aweme, String str, String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4}, null, f57157a, true, 61361, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4}, null, f57157a, true, 61361, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(aweme2, str3, "", str4);
    }

    public static void a(Aweme aweme, String str, String str2, String str3) {
        Aweme aweme2 = aweme;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{aweme2, str4, str5, str6}, null, f57157a, true, 61362, new Class[]{Aweme.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str4, str5, str6}, null, f57157a, true, 61362, new Class[]{Aweme.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            ((as) new as().a(str6).b(str6).f(aweme2).f(str5).j(str4)).c(i.m() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : "").a((Map<String, String>) com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a())).e();
            c a2 = c.a();
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str6);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            if (i.m()) {
                a2.a("is_auto_play", (Integer) 1);
            }
            if ("poi_page".equalsIgnoreCase(str6)) {
                a2.a("poi_id", aa.e(aweme));
                a2.a("poi_type", aa.h(aweme));
            }
            a2.a("enter_from", str6);
            a2.a("content_source", str5);
            a2.a("tab_name", str4);
            r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("finish").setValue(aweme.getAid()).setJsonObject(a2.b()));
        }
    }

    public static void a(Aweme aweme, long j, boolean z, String str, String str2, String str3) {
        Aweme aweme2 = aweme;
        long j2 = j;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{aweme2, new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), str4, str5, str6}, null, f57157a, true, 61364, new Class[]{Aweme.class, Long.TYPE, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, new Long(j2), Byte.valueOf(z), str4, str5, str6}, null, f57157a, true, 61364, new Class[]{Aweme.class, Long.TYPE, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            ((at) new at().a(str4).b(str4).f(aweme2).c(i.m() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : "").a(j2).h(str6).j(str5)).a(z).f(aa.c(aweme)).a((Map<String, String>) com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a())).e();
            c a2 = c.a().a("enter_fullscreen", Integer.valueOf(z ? 1 : 0));
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str4);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            if (i.m()) {
                a2.a("is_auto_play", (Integer) 1);
            }
            if ("poi_page".equalsIgnoreCase(str4)) {
                a2.a("poi_id", aa.e(aweme));
                a2.a("poi_type", aa.h(aweme));
            }
            a2.a("content_source", str6);
            a2.a("tab_name", str5);
            r.onEvent(MobClick.obtain().setEventName("play_time").setLabelName(str4).setValue(aweme.getAid()).setExtValueLong(j2).setJsonObject(a2.b()));
        }
    }

    public static void a(Aweme aweme, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f57157a, true, 61366, new Class[]{Aweme.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2, Byte.valueOf(z)}, null, f57157a, true, 61366, new Class[]{Aweme.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_pause").setValue(aweme.getAid()));
        if (TextUtils.equals(str2, "general_search")) {
            d a2 = d.a().a("enter_from", str2).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("enter_fullscreen", z ? 1 : 0);
            if (i.m()) {
                a2.a("is_auto_play", 1);
            }
            r.a("video_pause", (Map) a2.f34114b);
        }
    }

    public static void a(Aweme aweme, String str, String str2, int i) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4, Integer.valueOf(i)}, null, f57157a, true, 61368, new Class[]{Aweme.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4, Integer.valueOf(i)}, null, f57157a, true, 61368, new Class[]{Aweme.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (aweme2 != null) {
            new v().e(str3).f(str4).f(aweme2).a(i).a((Map<String, String>) com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a())).e();
            c a2 = c.a().a("enter_from", str3).a("enter_method", "click").a("is_photo", Integer.valueOf(d(aweme)));
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str3);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            if ("poi_page".equalsIgnoreCase(str3)) {
                a2.a("poi_id", aa.e(aweme));
                a2.a("poi_type", aa.h(aweme));
            }
            r.onEvent(MobClick.obtain().setEventName("like").setLabelName(str3).setValue(aweme.getAid()).setJsonObject(a2.b()));
        }
    }

    public static void a(User user, String str, int i, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{user, str, Integer.valueOf(i), str2, str3, str4}, null, f57157a, true, 61374, new Class[]{User.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {user, str, Integer.valueOf(i), str2, str3, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f57157a, true, 61374, new Class[]{User.class, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(user, str, i, str2, false, str3, str4);
    }

    public static void a(User user, String str, int i, String str2, boolean z, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{user, str5, Integer.valueOf(i), str6, Byte.valueOf(z ? (byte) 1 : 0), str7, str4}, null, f57157a, true, 61375, new Class[]{User.class, String.class, Integer.TYPE, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, str5, Integer.valueOf(i), str6, Byte.valueOf(z), str7, str4}, null, f57157a, true, 61375, new Class[]{User.class, String.class, Integer.TYPE, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE);
        } else if (user != null) {
            c a2 = c.a().a("rec_uid", user.getUid()).a("enter_from", z ? "" : str4).a("event_type", str5).a("impr_order", Integer.valueOf(i)).a("req_id", str6);
            if (z) {
                a2.a("is_direct", (Integer) 1).a("trigger_reason", "cold_launch");
            }
            r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("homepage_follow").setJsonObject(a2.b()));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rec_uid", user.getUid());
                jSONObject.put("enter_from", z ? "" : str4);
                jSONObject.put("event_type", str5);
                jSONObject.put("impr_order", i);
                jSONObject.put("req_id", str6);
                jSONObject.put("rec_reason", user.getRecommendReason());
                jSONObject.put("is_direct", 1);
                jSONObject.put("page_status", str7);
            } catch (JSONException unused) {
            }
            r.a("follow_card", jSONObject);
        }
    }

    public static void a(User user, String str, int i, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{user, str3, Integer.valueOf(i), str4}, null, f57157a, true, 61376, new Class[]{User.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, str3, Integer.valueOf(i), str4}, null, f57157a, true, 61376, new Class[]{User.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{user, str3, Integer.valueOf(i), str4, "cold_launch"}, null, f57157a, true, 61377, new Class[]{User.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, str3, Integer.valueOf(i), str4, "cold_launch"}, null, f57157a, true, 61377, new Class[]{User.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        r.a("follow_card", (Map) d.a().a("rec_uid", user.getUid()).a("enter_from", "homepage_follow").a("event_type", str3).a("impr_order", i).a("req_id", str4).a("trigger_reason", "cold_launch").a("rec_reason", user.getRecommendReason()).f34114b);
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f57157a, true, 61379, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f57157a, true, 61379, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c a2 = c.a().a("enter_type", "card");
        if (z) {
            a2.a("trigger_reason", "cold_launch");
        }
        r.onEvent(MobClick.obtain().setEventName("click_add_friends").setLabelName("homepage_follow").setJsonObject(a2.b()));
        if (z) {
            r.a("click_add_friends", (Map) d.a().a("enter_from", "homepage_follow").a("enter_type", "card").a("trigger_reason", "cold_launch").f34114b);
        }
    }

    public static void a(String str, String str2, boolean z, int i) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, null, f57157a, true, 61383, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z), Integer.valueOf(i)}, null, f57157a, true, 61383, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        c a2 = c.a().a("enter_type", "card").a("enter_from", "homepage_follow").a("request_id", str3);
        if (z) {
            a2.a("trigger_reason", "cold_launch");
        }
        r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("homepage_follow").setValue(str4).setJsonObject(a2.b()));
        d b2 = d.a().a("enter_from", "homepage_follow").a("enter_type", "card").a("request_id", str3).a("log_pb", ai.a().a(str3)).a("to_user_id", str4).a("enter_method", "follow_card_button").a("previous_page", "homepage_follow").a("previous_page_position", "follow_card_button").b();
        if (z) {
            b2.a("trigger_reason", "cold_launch");
        }
        r.a(i == 0 ? "follow" : "follow_cancel", (Map) b2.f34114b);
    }

    public static void a(String str, String str2, Aweme aweme) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aweme}, null, f57157a, true, 61384, new Class[]{String.class, String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, aweme}, null, f57157a, true, 61384, new Class[]{String.class, String.class, Aweme.class}, Void.TYPE);
            return;
        }
        c a2 = c.a().a("previous_page", "").a("author_id", aweme.getAuthorUid()).a("enter_method", "content_card");
        if (aweme.getAwemeType() == 13) {
            a2.a("is_reposted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("from_group_id", aweme.getFromGroupId()).a("page_type", "list").a("repost_comment_id", aweme.getForwardCommentId());
        }
        r.onEvent(MobClick.obtain().setEventName(str3).setLabelName(str4).setValue(aweme.getAuthorUid()).setExtValueString(aweme.getAid()).setJsonObject(a2.b()));
        d a3 = d.a().a("previous_page", "").a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("to_user_id", aweme.getAuthorUid()).a("enter_method", "content_card");
        if (TextUtils.equals("follow", str3)) {
            a3.b();
            a3.a("enter_from", str4);
            a3.a("previous_page", "homepage_follow");
            a3.a("previous_page_position", "content_card_button");
            a3.a("enter_method", "follow_button");
        } else if (TextUtils.equals("follow_cancel", str3)) {
            a3.a("enter_from", "homepage_follow");
            a3.a("enter_method", "menu_sheet");
        } else {
            a3.a("enter_from", str4);
        }
        if (aweme.getAwemeType() == 13) {
            a3.a("is_reposted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("from_group_id", aweme.getFromGroupId()).a("page_type", "list").a("repost_comment_id", aweme.getForwardCommentId());
        }
        a3.a("log_pb", ai.a().a(aa.c(aweme)));
        r.a(str3, aa.a(a3.f34114b));
    }

    public static void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f57157a, true, 61386, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, null, f57157a, true, 61386, new Class[]{User.class}, Void.TYPE);
            return;
        }
        r.a("follow", (Map) d.a().a("to_user_id", user.getUid()).a("enter_from", "homepage_follow").a("enter_type", "card").a("trigger_reason", "cold_launch").a("rec_reason", user.getRecommendReason()).b().f34114b);
    }

    public static void a(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, null, f57157a, true, 61388, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, null, f57157a, true, 61388, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        c a2 = c.a().a("enter_type", "card").a("request_id", str4);
        if (z) {
            a2.a("trigger_reason", "cold_launch").a("enter_from", "homepage_follow");
        }
        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("homepage_follow").setValue(str3).setJsonObject(a2.b()));
        if (z) {
            r.a("enter_personal_detail", aa.a(d.a().a("enter_from", "homepage_follow").a("enter_type", "card").a("request_id", str4).a("to_user_id", str3).a("trigger_reason", "cold_launch").a("log_pb", ai.a().a(str4)).b().f34114b));
        }
    }

    public static void a(String str, User user) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, user}, null, f57157a, true, 61389, new Class[]{String.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, user}, null, f57157a, true, 61389, new Class[]{String.class, User.class}, Void.TYPE);
            return;
        }
        r.a("enter_personal_detail", aa.a(d.a().a("to_user_id", user.getUid()).a("enter_from", "homepage_follow").a("enter_type", "card").a("trigger_reason", "cold_launch").a("rec_reason", user.getRecommendReason()).a("log_pb", ai.a().a(str2)).b().f34114b));
    }

    public static void a(Aweme aweme, String str, String str2, String str3, String str4) {
        Aweme aweme2 = aweme;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{aweme2, str5, str6, str7, str8}, null, f57157a, true, 61394, new Class[]{Aweme.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str5, str6, str7, str8}, null, f57157a, true, 61394, new Class[]{Aweme.class, String.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            c a2 = c.a();
            a2.a("group_id", aweme.getAid());
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str7);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, str8);
            if (TextUtils.equals(str7, "rec_follow")) {
                a2.a("content_source", "content_card");
            }
            r.onEvent(MobClick.obtain().setEventName(str6).setLabelName(str7).setValue(str5).setJsonObject(a2.b()));
            d b2 = d.a().a("author_id", aweme.getAuthorUid()).a("to_user_id", str5).a("enter_method", TextUtils.equals(str6, "head") ? "click_head" : "click_name").a(com.ss.android.ugc.aweme.forward.e.a.a(str7, aweme2)).a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, str8)).b();
            if (TextUtils.equals(str7, "rec_follow")) {
                b2.a("content_source", "content_card");
            }
            if (aa.d(str3)) {
                b2.a("log_pb", ai.a().a(aweme.getRequestId()));
                r.a("enter_personal_detail", aa.a(b2.f34114b));
                return;
            }
            r.a("enter_personal_detail", (Map) b2.f34114b);
        }
    }

    public static void a(String str, com.ss.android.ugc.aweme.newfollow.e.a aVar, @Nullable String str2, int i) {
        String str3 = str;
        com.ss.android.ugc.aweme.newfollow.e.a aVar2 = aVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, aVar2, str4, Integer.valueOf(i)}, null, f57157a, true, 61401, new Class[]{String.class, com.ss.android.ugc.aweme.newfollow.e.a.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, aVar2, str4, Integer.valueOf(i)}, null, f57157a, true, 61401, new Class[]{String.class, com.ss.android.ugc.aweme.newfollow.e.a.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", str3).a("group_id", aVar2.f57098d).a(PushConstants.TITLE, aVar2.f57097c).a("order", i);
        if (!TextUtils.isEmpty(str2)) {
            a2.a("search_keyword", str4);
        }
        if (aa.d(str)) {
            a2.a("log_pb", ai.a().a(aVar2.f57095a));
            r.a("article_read", aa.a(a2.f34114b));
            return;
        }
        r.a("article_read", (Map) a2.f34114b);
    }

    public static void b(String str, com.ss.android.ugc.aweme.newfollow.e.a aVar, @Nullable String str2, int i) {
        String str3 = str;
        com.ss.android.ugc.aweme.newfollow.e.a aVar2 = aVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, aVar2, str4, Integer.valueOf(i)}, null, f57157a, true, 61402, new Class[]{String.class, com.ss.android.ugc.aweme.newfollow.e.a.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, aVar2, str4, Integer.valueOf(i)}, null, f57157a, true, 61402, new Class[]{String.class, com.ss.android.ugc.aweme.newfollow.e.a.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", str3).a("group_id", aVar2.f57098d).a(PushConstants.TITLE, aVar2.f57097c).a("action_type", "show").a("order", i);
        if (!TextUtils.isEmpty(str2)) {
            a2.a("search_keyword", str4);
        }
        if (aa.d(str)) {
            a2.a("log_pb", ai.a().a(aVar2.f57095a));
            r.a("top_article", aa.a(a2.f34114b));
            return;
        }
        r.a("top_article", (Map) a2.f34114b);
    }

    public static void a(String str, boolean z, boolean z2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f57157a, true, 61410, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), Byte.valueOf(z2)}, null, f57157a, true, 61410, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        r.a("page_refresh_response", (Map) d.a().a("enter_from", "homepage_follow").a("refresh_method", str2).a("is_success", z ? 1 : 0).a("no_more_content", z2 ^ true ? 1 : 0).f34114b);
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f57157a, true, 61347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f57157a, true, 61347, new Class[0], Void.TYPE);
            return;
        }
        if (f57158b == -1) {
            f57158b = System.currentTimeMillis();
        }
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f57157a, true, 61353, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f57157a, true, 61353, new Class[0], Void.TYPE);
            return;
        }
        if (f57160d == -1) {
            f57160d = System.currentTimeMillis();
        }
    }

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f57157a, true, 61380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f57157a, true, 61380, new Class[0], Void.TYPE);
        } else {
            r.a("click_add_friends", (Map) d.a().a("enter_from", "homepage_follow").f34114b);
        }
    }

    public static void d() {
        if (PatchProxy.isSupport(new Object[0], null, f57157a, true, 61399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f57157a, true, 61399, new Class[0], Void.TYPE);
        } else {
            r.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
        }
    }

    public static void e() {
        if (PatchProxy.isSupport(new Object[0], null, f57157a, true, 61408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f57157a, true, 61408, new Class[0], Void.TYPE);
        } else {
            r.a("show_history", (Map) d.a().a("enter_from", "homepage_follow").f34114b);
        }
    }

    public static long a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f57157a, true, 61349, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f57157a, true, 61349, new Class[]{String.class}, Long.TYPE)).longValue();
        } else if (f57159c.containsKey(str2)) {
            return f57159c.get(str2).longValue();
        } else {
            return -1;
        }
    }

    public static String b(@IFollowFeedFetchTrigger.ILoadMoreType Integer num) {
        int i;
        if (PatchProxy.isSupport(new Object[]{num}, null, f57157a, true, 61407, new Class[]{Integer.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{num}, null, f57157a, true, 61407, new Class[]{Integer.class}, String.class);
        }
        if (num == null) {
            i = 4;
        } else {
            i = num.intValue();
        }
        switch (Integer.valueOf(i).intValue()) {
            case 4:
                return "slide_up";
            case 5:
                return "prefetch";
            default:
                return null;
        }
    }

    public static void c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57157a, true, 61391, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, null, f57157a, true, 61391, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("request_id", aa.c(aweme));
        hashMap.put("position", "poi_page");
        hashMap.put("host_value", aa.a(aweme));
        hashMap.put("room_value", aa.b(aweme));
        r.a("live_notice", (Map) hashMap);
    }

    private static int d(Aweme aweme) {
        Aweme aweme2;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57157a, true, 61398, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, null, f57157a, true, 61398, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else if (aweme == null) {
            return -1;
        } else {
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            if (aweme2 == null) {
                return -1;
            }
            if (aweme2.getAwemeType() != 2) {
                i = 0;
            }
            return i;
        }
    }

    public static String a(@IFollowFeedFetchTrigger.IRefreshType Integer num) {
        int i;
        if (PatchProxy.isSupport(new Object[]{num}, null, f57157a, true, 61406, new Class[]{Integer.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{num}, null, f57157a, true, 61406, new Class[]{Integer.class}, String.class);
        }
        if (num == null) {
            i = 3;
        } else {
            i = num.intValue();
        }
        switch (Integer.valueOf(i).intValue()) {
            case 1:
                return "click_bottom_icon";
            case 2:
                return "click_top_icon";
            case 3:
                return "slide_down";
            case e.l:
                return "launch";
            case 8:
                return "slide_right";
            default:
                return null;
        }
    }

    public static void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57157a, true, 61385, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, null, f57157a, true, 61385, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            d a2 = d.a().a("enter_from", "homepage_follow").a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid());
            if (aweme.getAwemeType() == 13) {
                a2.a("is_reposted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("from_group_id", aweme.getFromGroupId()).a("page_type", "list").a("repost_comment_id", aweme.getForwardCommentId());
            }
            r.a("enter_rec_follow_detail", (Map) a2.f34114b);
        }
    }

    public static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f57157a, true, 61403, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f57157a, true, 61403, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a(str2, (Map) null);
    }

    public static void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f57157a, true, 61409, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f57157a, true, 61409, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("page_refresh", (Map) d.a().a("enter_from", "homepage_follow").a("refresh_method", str2).f34114b);
    }

    public static void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f57157a, true, 61365, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, null, f57157a, true, 61365, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            r.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_play").setValue(aweme.getAid()));
        }
    }

    public static void c(Aweme aweme, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str2}, null, f57157a, true, 61393, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str2}, null, f57157a, true, 61393, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            c a2 = c.a().a("enter_type", "normal_way").a("enter_from", str2).a("group_id", aweme.getAid()).a("is_photo", Integer.valueOf(d(aweme)));
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str2);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aweme.getAuthorUid()).setJsonObject(a2.b()));
            r.a("enter_personal_detail_backup", (Map) d.a().a("enter_type", "normal_way").a("enter_from", "personal_homepage").a("to_user_id", aweme.getAuthorUid()).a(com.ss.android.ugc.aweme.forward.e.a.a(str2, aweme2)).a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a())).f34114b);
        }
    }

    public static void d(Aweme aweme, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, str2}, null, f57157a, true, 61397, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2}, null, f57157a, true, 61397, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme != null && aweme.getPromotion() != null) {
            new aj().f(aweme.getAuthorUid()).b("video_cart_tag").c(aweme.getPromotion().getPromotionId()).a((Long) 0L).e(str2).d(aweme.getAid()).b(true).a("full_screen_card").b();
        }
    }

    public static void b(Aweme aweme, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str2}, null, f57157a, true, 61367, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str2}, null, f57157a, true, 61367, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            c a2 = c.a().a("is_photo", Integer.valueOf(d(aweme)));
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str2);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            r.onEvent(MobClick.obtain().setEventName("enter_fullscreen").setLabelName(str2).setValue(aweme.getAid()).setJsonObject(a2.b()));
            d a3 = d.a();
            a3.a("content_type", aa.o(aweme));
            a3.a(com.ss.android.ugc.aweme.forward.e.a.a(str2, aweme2));
            a3.a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a()));
            if (aa.d(str)) {
                a3.a("log_pb", ai.a().a(aa.c(aweme)));
                r.a("enter_fullscreen", aa.a(a3.f34114b));
                return;
            }
            r.a("enter_fullscreen", (Map) a3.f34114b);
        }
    }

    public static void a(long j, String str, String str2) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, str4}, null, f57157a, true, 61356, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str3, str4}, null, f57157a, true, 61356, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE);
        } else if (!"poi_page".equalsIgnoreCase(str3)) {
            c a2 = c.a();
            a2.a("page_type", str4);
            r.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(str3).setValue(String.valueOf(j)).setJsonObject(a2.b()));
            new ao().a(String.valueOf(j)).b(str3).e(str4).e();
        }
    }

    public static void c(Aweme aweme, String str, String str2) {
        String str3;
        Aweme aweme2 = aweme;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str4, str5}, null, f57157a, true, 61392, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str4, str5}, null, f57157a, true, 61392, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            ((q) new q().f(aweme2).b("poi_page").k(str5).a(str4)).e();
            c a2 = c.a().a("request_id", aa.c(aweme)).a("is_photo", Integer.valueOf(d(aweme))).a("poi_id", aa.e(aweme)).a("poi_type", aa.h(aweme));
            MobClick obtain = MobClick.obtain();
            if ("click_name".equalsIgnoreCase(str4)) {
                str3 = "name";
            } else {
                str3 = "head";
            }
            r.onEvent(obtain.setEventName(str3).setLabelName("poi_page").setValue(aa.m(aweme)).setExtValueLong(aa.j(aweme).longValue()).setJsonObject(a2.b()));
        }
    }

    public static void d(Aweme aweme, String str, String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4}, null, f57157a, true, 61395, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4}, null, f57157a, true, 61395, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            if ("poi_page".equalsIgnoreCase(str3)) {
                ((n) new n().c(aa.m(aweme)).e(aa.a(aweme)).f(aa.k(aweme)).b(str3).a("click_cover")).g(aa.c(aweme)).e();
            } else {
                d b2 = d.a().a("enter_from", str3).a("enter_method", "click_cover").a("music_id", aa.k(aweme)).a(com.ss.android.ugc.aweme.forward.e.a.a(str3, aweme2)).a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, str4)).b();
                if (aa.d(str)) {
                    b2.a("log_pb", ai.a().a(aweme.getRequestId()));
                    r.a("enter_music_detail", aa.a(b2.f34114b));
                } else {
                    r.a("enter_music_detail", (Map) b2.f34114b);
                }
            }
            c a2 = c.a().a("request_id", aa.c(aweme)).a("is_photo", Integer.valueOf(d(aweme)));
            if (!"poi_page".equalsIgnoreCase(str3)) {
                com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str3);
                com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, str4);
            }
            r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName(str3).setValue(aweme.getAid()).setExtValueString(aa.k(aweme)).setJsonObject(a2.b()));
        }
    }

    public static void b(Aweme aweme, String str, String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str2}, null, f57157a, true, 61370, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str2}, null, f57157a, true, 61370, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null && !"poi_page".equalsIgnoreCase(str3)) {
            c a2 = c.a().a("enter_from", str3).a("enter_method", "click").a("is_photo", Integer.valueOf(d(aweme)));
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str3);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
        }
    }

    public static void a(Context context, TextExtraStruct textExtraStruct, Aweme aweme, String str) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, textExtraStruct, aweme2, str2}, null, f57157a, true, 61400, new Class[]{Context.class, TextExtraStruct.class, Aweme.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, textExtraStruct, aweme2, str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f57157a, true, 61400, new Class[]{Context.class, TextExtraStruct.class, Aweme.class, String.class}, Void.TYPE);
        } else if (textExtraStruct.getType() == 1) {
            c a2 = c.a();
            a2.a("hashtag", textExtraStruct.getHashTagName());
            a2.a("request_id", aa.c(aweme));
            a2.a("is_photo", aa.d(aweme));
            com.ss.android.ugc.aweme.forward.e.a.b(a2, aweme2, str2);
            com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(str2).setValue(aweme.getAid()).setExtValueString(textExtraStruct.getCid()).setJsonObject(a2.b()));
            g.w(context2, aweme2);
            ((com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().b(str2).f(aweme2).e(textExtraStruct.getCid()).a("click_in_video_name")).f(aa.c(aweme)).c(com.ss.android.ugc.aweme.forward.e.a.a()).e();
        } else if (textExtraStruct.getType() == 2) {
            c(aweme, str);
            a(aweme2, textExtraStruct.getUserId(), "name", str2, "list");
        } else {
            c a3 = c.a();
            com.ss.android.ugc.aweme.forward.e.a.b(a3, aweme2, str2);
            com.ss.android.ugc.aweme.forward.e.a.a(a3, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            r.onEvent(MobClick.obtain().setEventName("name").setLabelName("video_at").setValue(textExtraStruct.getUserId()).setJsonObject(a3.b()));
            d b2 = d.a().a("enter_from", str2).a("to_user_id", textExtraStruct.getUserId()).a("group_id", aweme.getAid()).a("enter_method", "video_at").b();
            b2.a(com.ss.android.ugc.aweme.forward.e.a.a(str2, aweme2));
            b2.a(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a()));
            if (aa.d(str)) {
                b2.a("log_pb", ai.a().a(aweme.getRequestId()));
                r.a("enter_personal_detail", aa.a(b2.f34114b));
            } else {
                r.a("enter_personal_detail", (Map) b2.f34114b);
            }
            c a4 = c.a();
            a4.a("enter_method", "click_head");
            com.ss.android.ugc.aweme.forward.e.a.b(a4, aweme2, str2);
            com.ss.android.ugc.aweme.forward.e.a.a(a4, aweme2, com.ss.android.ugc.aweme.forward.e.a.a());
            if (aweme.getAuthor() != null) {
                r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aweme.getAuthor().getUid()).setJsonObject(a4.b()));
                Map<String, String> map = d.a().a("enter_from", "personal_homepage").a("to_user_id", aweme.getAuthor().getUid()).a("group_id", aweme.getAid()).a("enter_method", "click_name").f34114b;
                map.putAll(com.ss.android.ugc.aweme.forward.e.a.a(str2, aweme2));
                map.putAll(com.ss.android.ugc.aweme.forward.e.a.b(aweme2, com.ss.android.ugc.aweme.forward.e.a.a()));
                r.a("enter_personal_detail_backup", (Map) map);
            }
        }
    }

    public static void b(Aweme aweme, String str, String str2, String str3) {
        Aweme aweme2 = aweme;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{aweme2, str4, str5, str6}, null, f57157a, true, 61371, new Class[]{Aweme.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {aweme2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f57157a, true, 61371, new Class[]{Aweme.class, String.class, String.class, String.class}, Void.TYPE);
        } else if (aweme2 != null) {
            r.onEvent(MobClick.obtain().setEventName("comment").setLabelName(str4).setValue(aweme.getAid()).setJsonObject(com.ss.android.ugc.aweme.forward.e.a.a(c.a().a("enter_from", str4).a("enter_method", "click").a("reply_to_comment_id", str6).a("request_id", aa.c(aweme)).a("is_photo", Integer.valueOf(d(aweme))), aweme2, str5).b()));
            r.a("comment", (Map) d.a().a("enter_from", str4).a("group_id", aweme.getAid()).f34114b);
        }
    }
}
