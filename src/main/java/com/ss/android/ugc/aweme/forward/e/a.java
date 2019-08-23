package com.ss.android.ugc.aweme.forward.e;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.u.aa;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48291a;

    public static void a(String str, Aweme aweme, String str2, String str3) {
        String str4 = str;
        Aweme aweme2 = aweme;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, aweme2, str2, str5}, null, f48291a, true, 45501, new Class[]{String.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str4, aweme2, str2, str5};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f48291a, true, 45501, new Class[]{String.class, Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a(a(str, aweme)).a(b(aweme, str2)).a(a(aweme2, str4)).a("enter_method", str5);
        if ("homepage_country".equals(str4) && aweme.getAuthor() != null) {
            a2.a("country_name", aweme.getAuthor().getRegion());
        }
        r.a("click_repost_button", (Map) a2.f34114b);
    }

    public static void a(String str, Aweme aweme, String str2, String str3, boolean z) {
        String str4 = str;
        Aweme aweme2 = aweme;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, aweme2, str2, str5, Byte.valueOf(z ? (byte) 1 : 0)}, null, f48291a, true, 45503, new Class[]{String.class, Aweme.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, aweme2, str2, str5, Byte.valueOf(z)}, null, f48291a, true, 45503, new Class[]{String.class, Aweme.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a(a(str, aweme)).a(b(aweme, str2)).a(a(aweme2, str4)).a("enter_method", str5).a("is_success", z ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        if (aweme2 != null && aweme.getAwemeType() == 13) {
            a2.a("from_user_id", aweme.getFromUserId());
        }
        r.a("repost", (Map) a2.f34114b);
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f48291a, true, 45512, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f48291a, true, 45512, new Class[0], String.class);
        }
        Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
        if (a2 instanceof FeedDetailActivity) {
            return "detail";
        }
        if (a2 instanceof AbsFollowFeedDetailActivity) {
            return ((AbsFollowFeedDetailActivity) a2).h;
        }
        return "list";
    }

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f48291a, true, 45513, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f48291a, true, 45513, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
        if ((a2 instanceof OriginDetailActivity) || ((a2 instanceof AbsFollowFeedDetailActivity) && ((AbsFollowFeedDetailActivity) a2).i)) {
            return true;
        }
        return false;
    }

    public static HashMap<String, String> b(Aweme aweme, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, str2}, null, f48291a, true, 45509, new Class[]{Aweme.class, String.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{aweme, str2}, null, f48291a, true, 45509, new Class[]{Aweme.class, String.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (aweme == null) {
            return hashMap;
        }
        if (aweme.getAwemeType() == 13) {
            hashMap.put("page_type", str2);
            hashMap.put("is_reposted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            hashMap.put("repost_comment_id", aweme.getForwardCommentId());
            hashMap.put("from_group_id", aweme.getFromGroupId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                hashMap.put("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                hashMap.put("forward_user_id", aweme.getForwardUserId());
            }
        } else if (b()) {
            hashMap.put("page_type", "detail");
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                hashMap.put("repost_from_group_id", aweme.getRepostFromGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
                hashMap.put("repost_from_user_id", aweme.getRepostFromUserId());
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> a(Aweme aweme, String str) {
        if (!PatchProxy.isSupport(new Object[]{aweme, str}, null, f48291a, true, 45506, new Class[]{Aweme.class, String.class}, HashMap.class)) {
            return h.a(aweme);
        }
        return (HashMap) PatchProxy.accessDispatch(new Object[]{aweme, str}, null, f48291a, true, 45506, new Class[]{Aweme.class, String.class}, HashMap.class);
    }

    public static HashMap<String, String> a(String str, Aweme aweme) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, aweme}, null, f48291a, true, 45507, new Class[]{String.class, Aweme.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{str2, aweme}, null, f48291a, true, 45507, new Class[]{String.class, Aweme.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", str2);
        if (aweme != null) {
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("group_id", aweme.getAid());
        }
        return hashMap;
    }

    public static c b(c cVar, Aweme aweme, String str) {
        c cVar2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar, aweme, str2}, null, f48291a, true, 45508, new Class[]{c.class, Aweme.class, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{cVar, aweme, str2}, null, f48291a, true, 45508, new Class[]{c.class, Aweme.class, String.class}, c.class);
        }
        if (cVar == null) {
            cVar2 = new c();
        } else {
            cVar2 = cVar;
        }
        if (aweme != null) {
            cVar2.a("enter_from", str2);
            cVar2.a("author_id", aweme.getAuthorUid());
            cVar2.a("request_id", aa.c(aweme));
        }
        return cVar2;
    }

    public static c a(c cVar, Aweme aweme, String str) {
        c cVar2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar, aweme, str2}, null, f48291a, true, 45505, new Class[]{c.class, Aweme.class, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{cVar, aweme, str2}, null, f48291a, true, 45505, new Class[]{c.class, Aweme.class, String.class}, c.class);
        }
        if (cVar == null) {
            cVar2 = new c();
        } else {
            cVar2 = cVar;
        }
        if (aweme == null) {
            return cVar2;
        }
        if (aweme.getAwemeType() == 13) {
            cVar2.a("page_type", str2).a("is_reposted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("repost_comment_id", aweme.getForwardCommentId()).a("from_group_id", aweme.getFromGroupId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                cVar2.a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                cVar2.a("forward_user_id", aweme.getForwardUserId());
            }
        } else if (b()) {
            cVar2.a("page_type", "detail");
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                cVar2.a("repost_from_group_id", aweme.getRepostFromGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
                cVar2.a("repost_from_user_id", aweme.getRepostFromUserId());
            }
        }
        return cVar2;
    }

    public static JSONObject a(JSONObject jSONObject, Aweme aweme, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{jSONObject, aweme2, str2}, null, f48291a, true, 45504, new Class[]{JSONObject.class, Aweme.class, String.class}, JSONObject.class)) {
            return a(c.a(jSONObject), aweme2, str2).b();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject, aweme2, str2}, null, f48291a, true, 45504, new Class[]{JSONObject.class, Aweme.class, String.class}, JSONObject.class);
    }

    public static void b(String str, Aweme aweme, String str2, String str3) {
        String str4 = str;
        Aweme aweme2 = aweme;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, aweme2, str2, str5}, null, f48291a, true, 45502, new Class[]{String.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str4, aweme2, str2, str5};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f48291a, true, 45502, new Class[]{String.class, Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        a2.a(a(str, aweme)).a(b(aweme, str2)).a(a(aweme2, str4)).a("enter_method", str5);
        if ("homepage_country".equals(str4) && aweme.getAuthor() != null) {
            a2.a("country_name", aweme.getAuthor().getRegion());
        }
        r.a("click_comment_and_repost", (Map) a2.f34114b);
    }
}
