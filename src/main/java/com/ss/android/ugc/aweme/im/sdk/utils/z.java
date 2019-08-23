package com.ss.android.ugc.aweme.im.sdk.utils;

import android.text.TextUtils;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCouponContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.model.XPlanAwemeBannerConfig;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.im.sdk.share.b;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52670a;

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52670a, false, 53553, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52670a, false, 53553, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contact_num", i);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("share_chat").setLabelName("confirm").setJsonObject(jSONObject));
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52670a, false, 53556, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52670a, false, 53556, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_type", str4);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("enter_chat").setLabelName("message").setValue(str3).setJsonObject(jSONObject));
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, str9, str10}, this, f52670a, false, 53557, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str6, str7, str8, str9, str10};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f52670a, false, 53557, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str6);
        hashMap.put("to_user_id", str7);
        hashMap.put("chat_type", str8);
        hashMap.put("enter_from", str10);
        hashMap.put("enter_method", str9);
        r.a("enter_chat", (Map) hashMap);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52670a, false, 53558, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52670a, false, 53558, new Class[]{String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message_type", str2);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("im_to_myself").setLabelName("chat").setJsonObject(jSONObject));
    }

    public final void a(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, this, f52670a, false, 53566, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f52670a, false, 53566, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", "chat");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("group_id", str6);
            }
            jSONObject.put("enter_method", str8);
            jSONObject.put("user_type", str7);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str5).setJsonObject(jSONObject));
    }

    public final void a(n nVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f52670a, false, 53568, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f52670a, false, 53568, new Class[]{n.class}, Void.TYPE);
            return;
        }
        String str = nVar.getConversationType() == d.a.f20887b ? "group" : PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
        String h = ad.h(nVar);
        long a2 = e.a(nVar.getConversationId());
        if (nVar.getLocalExt() == null || !nVar.getLocalExt().containsKey("key_resend")) {
            z = false;
        }
        HashMap hashMap = new HashMap();
        if (a2 > 0) {
            hashMap.put("to_user_id", String.valueOf(a2));
        }
        if (!TextUtils.isEmpty(h)) {
            hashMap.put("message_type", h);
        }
        hashMap.put("conversation_id", nVar.getConversationId());
        hashMap.put("chat_type", str);
        hashMap.put("is_resend", z ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        hashMap.put("enter_from", "message");
        hashMap.put("enter_method", "click");
        r.a("send_message", (Map) hashMap);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, int i) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, str9, str10, Integer.valueOf(i)}, this, f52670a, false, 53569, new Class[]{String.class, String.class, String.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str6, str7, str8, str9, str10, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f52670a, false, 53569, new Class[]{String.class, String.class, String.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str6);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("to_user_id", str7);
        }
        hashMap.put("chat_type", str8);
        hashMap.put("message_type", str9);
        hashMap.put("send_status", str10);
        hashMap.put("check_code", String.valueOf(i));
        r.a("send_message_response", (Map) hashMap);
    }

    public final void a(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53581, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact, Byte.valueOf(z)}, this, f52670a, false, 53581, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
        } else if (shareStruct2 != null) {
            if ("aweme".equals(shareStruct2.itemType)) {
                b(shareStruct, iMContact, z);
            } else if ("poi".equals(shareStruct2.itemType)) {
                c(shareStruct, iMContact, z);
            } else if ("music".equals(shareStruct2.itemType)) {
                d(shareStruct, iMContact, z);
            } else if ("challenge".equals(shareStruct2.itemType)) {
                e(shareStruct, iMContact, z);
            } else if ("ranking".equals(shareStruct2.itemType)) {
                f(shareStruct, iMContact, z);
            } else if (AllStoryActivity.f73306b.equals(shareStruct2.itemType)) {
                g(shareStruct, iMContact, z);
            } else if ("web".equals(shareStruct2.itemType)) {
                h(shareStruct, iMContact, z);
            } else if ("live".equals(shareStruct2.itemType)) {
                i(shareStruct, iMContact, z);
            } else if ("good".equals(shareStruct2.itemType) || "good_window".equals(shareStruct2.itemType)) {
                j(shareStruct, iMContact, z);
            } else {
                if ("coupon".equals(shareStruct2.itemType)) {
                    k(shareStruct, iMContact, z);
                }
            }
        }
    }

    public final void a(ShareRankingListContent shareRankingListContent, String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{shareRankingListContent, str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53584, new Class[]{ShareRankingListContent.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareRankingListContent, str3, str4, Byte.valueOf(z)}, this, f52670a, false, 53584, new Class[]{ShareRankingListContent.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareRankingListContent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("to_user_id", str3);
            hashMap.put("conversation_id", str4);
            hashMap.put("enter_from", "chat");
            hashMap.put("action_type", z ? "click" : "show");
            r.a("hot_search_icon", (Map) hashMap);
        }
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f52670a, false, 53595, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f52670a, false, 53595, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = null;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str6);
            } catch (JSONException unused) {
            }
        }
        r.onEvent(MobClick.obtain().setEventName("block").setLabelName(str4).setValue(str5).setJsonObject(jSONObject));
    }

    public final void b(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f52670a, false, 53610, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f52670a, false, 53610, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str4);
        hashMap.put("enter_from", str5);
        hashMap.put("enter_method", str6);
        if (!m.b()) {
            hashMap.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else {
            hashMap.put("_staging_flag", PushConstants.PUSH_TYPE_NOTIFY);
        }
        r.a("enter_personal_detail", (Map) hashMap);
    }

    public final void b(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, this, f52670a, false, 53613, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f52670a, false, 53613, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str5);
        hashMap.put("chat_type", str6);
        hashMap.put("to_status", str7);
        r.a(str8, (Map) hashMap);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52670a, false, 53617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        r.a("upload_emoji", (Map) hashMap);
    }

    public final void a(String str, int i, int i2, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53622, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f52670a, false, 53622, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("account_type", str2);
        hashMap.put("client_order", String.valueOf(i));
        if (i2 > 0) {
            if (z) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i2));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
        }
        r.a("show_official_message", (Map) hashMap);
    }

    public final void a(String str, String str2, List<a> list, boolean z) {
        String str3 = str;
        String str4 = str2;
        List<a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str3, str4, list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53625, new Class[]{String.class, String.class, List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, list2, Byte.valueOf(z)}, this, f52670a, false, 53625, new Class[]{String.class, String.class, List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list2.get(i).getId());
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        hashMap.put("conversation_id", str4);
        hashMap.put("to_user_id", str3);
        hashMap.put("emoji_id", sb.toString());
        if (z) {
            r.a("greeting_emoji_alert_close", (Map) hashMap);
        } else {
            r.a("greeting_emoji_alert_show", (Map) hashMap);
        }
    }

    public final void a(String str, int i, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4}, this, f52670a, false, 53627, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4}, this, f52670a, false, 53627, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message_category", str3);
        hashMap.put("contact_number", String.valueOf(i));
        hashMap.put("action_type", str4);
        r.a("multi_send_message", (Map) hashMap);
    }

    public final void a(String str, String str2, String str3, BaseContent baseContent) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, baseContent2}, this, f52670a, false, 53628, new Class[]{String.class, String.class, String.class, BaseContent.class}, Void.TYPE)) {
            Object[] objArr = {str4, str5, str6, baseContent2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f52670a, false, 53628, new Class[]{String.class, String.class, String.class, BaseContent.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message_category", str4);
        hashMap.put("to_user_id", str6);
        hashMap.put("conversation_id", str5);
        hashMap.put("from_user_id", d.b().toString());
        if ("poi_coupon".equals(str4) && (baseContent2 instanceof ShareCouponContent)) {
            ShareCouponContent shareCouponContent = (ShareCouponContent) baseContent2;
            hashMap.put("coupon_id", shareCouponContent.getCouponId());
            hashMap.put("activity_id", shareCouponContent.getActivityId());
        }
        r.a("message_forward", (Map) hashMap);
    }

    public final void a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f52670a, false, 53630, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f52670a, false, 53630, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_cnt", String.valueOf(i));
            r.a(str2, (Map) hashMap);
        }
    }

    public static z a() {
        if (PatchProxy.isSupport(new Object[0], null, f52670a, true, 53550, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], null, f52670a, true, 53550, new Class[0], z.class);
        }
        return new z();
    }

    private static int g(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52670a, true, 53608, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f52670a, true, 53608, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (com.ss.android.ugc.aweme.im.sdk.d.a.a().e().showNewStyle()) {
            return com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().a(str2);
        } else {
            return 0;
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52670a, false, 53588, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52670a, false, 53588, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("shoot_way", "story");
        hashMap.put("is_success", String.valueOf(i));
        r.a("im_shoot", (Map) hashMap);
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52670a, false, 53596, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52670a, false, 53596, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("unblock").setLabelName("chat").setValue(str2));
    }

    public final void e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52670a, false, 53619, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52670a, false, 53619, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str2);
        r.a("share_comment_toast", (Map) hashMap);
    }

    public final void f(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52670a, false, 53623, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52670a, false, 53623, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("show_type", str2);
        r.a("show_commerce_message", (Map) hashMap);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52670a, false, 53564, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52670a, false, 53564, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("delete").setLabelName("message").setValue(String.valueOf(e.a(str))));
    }

    public final void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52670a, false, 53603, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f52670a, false, 53603, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str2);
        r.a("auto_emoji_show", (Map) hashMap);
    }

    public static void h(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f52670a, true, 53637, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f52670a, true, 53637, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str3);
        hashMap.put("chat_type", "group");
        hashMap.put("master_id", d.b().toString());
        hashMap.put("status", str4);
        r.a("create_group", (Map) hashMap);
    }

    public static void i(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f52670a, true, 53642, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f52670a, true, 53642, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str3);
        hashMap.put("chat_type", str4);
        r.a("exit_chat", (Map) hashMap);
    }

    public static void a(int i, String str) {
        String str2;
        String str3;
        int i2 = i;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4}, null, f52670a, true, 53631, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str4}, null, f52670a, true, 53631, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", str4);
            if (i2 == 10) {
                hashMap.put("enter_from", "homepage_story");
                hashMap.put("message_style", "duoshan_story");
            } else if (i2 != 12) {
                switch (i2) {
                    case 1:
                        hashMap.put("enter_from", "message");
                        if (k.a().f51277e > 0) {
                            str3 = "unread";
                        } else {
                            str3 = "blank";
                        }
                        hashMap.put("message_style", str3);
                        XPlanAwemeBannerConfig k = o.a().k();
                        if (!TextUtils.equals(str4, "show") && k != null) {
                            hashMap.put("body_text", k.getBodyText());
                            break;
                        }
                    case 2:
                        hashMap.put("enter_from", "others_homepage");
                        hashMap.put("message_style", "click_message");
                        break;
                    case 3:
                        hashMap.put("enter_from", "others_homepage");
                        hashMap.put("message_style", "click_stranger_chat_button");
                        break;
                    case 4:
                        hashMap.put("enter_chat", "contact");
                        hashMap.put("message_style", "click_contact");
                        break;
                    case 5:
                        hashMap.put("enter_chat", "chat");
                        hashMap.put("message_style", "duoshan_sync");
                        break;
                    case 6:
                        hashMap.put("enter_chat", "message");
                        hashMap.put("message_style", "group_chat");
                        break;
                    case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                        hashMap.put("enter_from", "chat");
                        hashMap.put("message_style", "duoshan_unable");
                        break;
                    default:
                        return;
                }
            } else {
                hashMap.put("enter_from", "chat");
                hashMap.put("message_style", "duoshan_red_envelope");
            }
            if (TextUtils.equals(str4, "show")) {
                str2 = "duoshan_banner_show";
            } else {
                str2 = "duoshan_banner_click";
            }
            r.a(str2, (Map) hashMap);
        }
    }

    public static void b(int i, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3}, null, f52670a, true, 53633, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3}, null, f52670a, true, 53633, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", str3);
            switch (i) {
                case 1:
                    hashMap.put("enter_from", "message");
                    if (k.a().f51277e > 0) {
                        str2 = "unread";
                    } else {
                        str2 = "blank";
                    }
                    hashMap.put("message_style", str2);
                    hashMap.put("enter_method", "click_button");
                    break;
                case 2:
                    hashMap.put("enter_from", "others_homepage");
                    hashMap.put("enter_method", "click_message");
                    break;
                case 3:
                    hashMap.put("enter_from", "others_homepage");
                    hashMap.put("enter_method", "click_stranger_chat_button");
                    break;
                case 4:
                    hashMap.put("enter_from", "contact");
                    hashMap.put("enter_method", "click_message");
                    break;
                case 5:
                    hashMap.put("enter_from", "chat");
                    hashMap.put("message_style", "duoshan_sync");
                    break;
                case 6:
                    hashMap.put("enter_from", "message");
                    hashMap.put("message_style", "group_chat");
                    break;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    hashMap.put("enter_from", "chat");
                    hashMap.put("message_style", "duoshan_unable");
                    break;
                case 8:
                    hashMap.put("enter_from", "share_board");
                    hashMap.put("message_style", "share_video");
                    break;
                case 10:
                    hashMap.put("enter_from", "homepage_story");
                    hashMap.put("message_style", "duoshan_story");
                    break;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    hashMap.put("enter_from", "chat");
                    hashMap.put("message_style", "duoshan_red_envelope");
                    break;
                default:
                    return;
            }
            r.a("duoshan_download_notice", (Map) hashMap);
        }
    }

    public final void e(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52670a, false, 53614, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52670a, false, 53614, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str4);
        hashMap.put("conversation_id", str3);
        r.a("chat_report_click", (Map) hashMap);
    }

    public final void f(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52670a, false, 53615, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52670a, false, 53615, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("kicked_user", str4);
        hashMap.put("conversation_id", str3);
        r.a("kick_group", (Map) hashMap);
    }

    public final void g(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52670a, false, 53616, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52670a, false, 53616, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("update_cnt", g(str));
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("chat_cell_show").setLabelName(str4).setValue(str3).setJsonObject(jSONObject));
    }

    public static void a(String str, Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, null, f52670a, true, 53636, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, null, f52670a, true, 53636, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        r.a(str, (Map) map);
    }

    public final void c(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52670a, false, 53611, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52670a, false, 53611, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", str3);
            r.a(str4, (Map) hashMap);
        }
    }

    public final void d(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52670a, false, 53612, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52670a, false, 53612, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("add_cnt", str4);
        hashMap.put("conversation_id", str3);
        r.a("group_add_complete_click", (Map) hashMap);
    }

    private void a(Map<String, String> map, IMContact iMContact) {
        Map<String, String> map2 = map;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{map2, iMContact2}, this, f52670a, false, 53582, new Class[]{Map.class, IMContact.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, iMContact2}, this, f52670a, false, 53582, new Class[]{Map.class, IMContact.class}, Void.TYPE);
        } else if (iMContact2 == null) {
            map2.put("to_user_id", "null");
            map2.put("conversation_id", "null");
        } else if (iMContact2 instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact2;
            map2.put("to_user_id", iMUser.getUid());
            map2.put("conversation_id", e.a(Long.valueOf(Long.parseLong(iMUser.getUid())).longValue()));
        } else {
            if (iMContact2 instanceof IMConversation) {
                map2.put("conversation_id", ((IMConversation) iMContact2).getConversationId());
                map2.put("to_user_id", "null");
            }
        }
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52670a, false, 53609, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52670a, false, 53609, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", str4);
            jSONObject.put("update_cnt", g(str));
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str3).setJsonObject(jSONObject));
    }

    public static void a(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, null, f52670a, true, 53640, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, null, f52670a, true, 53640, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str3);
        hashMap.put("from_user_id", str4);
        hashMap.put("member", String.valueOf(i));
        r.a("group_chat_confirm_join", (Map) hashMap);
    }

    public static void d(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f52670a, true, 53635, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f52670a, true, 53635, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("author_id", str4);
        hashMap.put("message_id", str5);
        hashMap.put("message_type", str6);
        r.a("click_in_message", (Map) hashMap);
    }

    private void c(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53573, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53573, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        a((Map<String, String>) hashMap, iMContact2);
        hashMap.put("poi_id", shareStruct2.poiId);
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put("platform", str);
        if (!TextUtils.isEmpty(shareStruct2.enterFrom)) {
            hashMap.put("enter_from", shareStruct2.enterFrom);
        }
        r.a("share_poi", (Map) hashMap);
    }

    private void d(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53574, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53574, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareStruct2.extraParams != null) {
            HashMap hashMap = new HashMap();
            a((Map<String, String>) hashMap, iMContact2);
            hashMap.put("music_id", shareStruct2.extraParams.get("music_id"));
            if (z) {
                str = "chat_merge";
            } else {
                str = "chat";
            }
            hashMap.put("platform", str);
            r.a("share_music", (Map) hashMap);
        }
    }

    private void e(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53575, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53575, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareStruct2.extraParams != null) {
            HashMap hashMap = new HashMap();
            a((Map<String, String>) hashMap, iMContact2);
            hashMap.put("tag_id", shareStruct2.extraParams.get("challenge_id"));
            if (z) {
                str = "chat_merge";
            } else {
                str = "chat";
            }
            hashMap.put("platform", str);
            r.a("share_tag", (Map) hashMap);
        }
    }

    private void f(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53576, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53576, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareStruct2.extraParams != null) {
            HashMap hashMap = new HashMap();
            a((Map<String, String>) hashMap, iMContact2);
            if (shareStruct2.awemeType == 1801) {
                hashMap.put("hot_search_type", "general");
            } else if (shareStruct2.awemeType == 1802) {
                hashMap.put("hot_search_type", "video");
            } else if (shareStruct2.awemeType == 1803) {
                hashMap.put("hot_search_type", "music");
            }
            if (z) {
                str = "chat_merge";
            } else {
                str = "chat";
            }
            hashMap.put("platform", str);
            r.a("share_tag", (Map) hashMap);
        }
    }

    private void g(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53577, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53577, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        a((Map<String, String>) hashMap, iMContact2);
        hashMap.put("user_id", shareStruct2.identifier);
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put("platform", str);
        r.a("share_profile", (Map) hashMap);
    }

    private void h(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53578, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53578, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareStruct2.extraParams != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", f.f34167a);
            hashMap.put(PushConstants.WEB_URL, shareStruct2.url);
            a((Map<String, String>) hashMap, iMContact2);
            hashMap.put("group_id", shareStruct2.extraParams.get("group_id"));
            hashMap.put("webview_type", shareStruct2.extraParams.get("webview_type"));
            hashMap.put("previous_page", shareStruct2.extraParams.get("previous_page"));
            if (z) {
                str = "chat_merge";
            } else {
                str = "chat";
            }
            hashMap.put("platform", str);
            r.a("share_webview", (Map) hashMap);
        }
    }

    private void i(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53579, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53579, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareStruct2.extraParams != null) {
            HashMap hashMap = new HashMap();
            a((Map<String, String>) hashMap, iMContact2);
            hashMap.put("anchor_id", shareStruct2.liveId);
            hashMap.put("room_id", shareStruct2.identifier);
            hashMap.put("request_id", shareStruct2.extraParams.get("request_id"));
            hashMap.put("user_type", shareStruct2.extraParams.get("user_type"));
            hashMap.put("previous_page", shareStruct2.extraParams.get("previous_page"));
            if (z) {
                str = "chat_merge";
            } else {
                str = "chat";
            }
            hashMap.put("platform", str);
            r.a("share_live", (Map) hashMap);
        }
    }

    private void j(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53580, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53580, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if ("good".equals(shareStruct2.itemType)) {
            if (shareStruct2.extraParams != null) {
                HashMap hashMap = new HashMap();
                a((Map<String, String>) hashMap, iMContact2);
                hashMap.put("author_id", shareStruct2.extraParams.get("user_id"));
                hashMap.put("commodity_id", shareStruct2.extraParams.get("commodity_id"));
                hashMap.put("commodity_type", shareStruct2.extraParams.get("commodity_type"));
                r.a("share_product", (Map) hashMap);
            }
        } else if ("good_window".equals(shareStruct2.itemType) && shareStruct2.extraParams != null) {
            HashMap hashMap2 = new HashMap();
            a((Map<String, String>) hashMap2, iMContact2);
            hashMap2.put("author_id", shareStruct2.extraParams.get("user_id"));
            r.a("share_store", (Map) hashMap2);
        }
    }

    private void k(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53583, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53583, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareStruct2.extraParams != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "poi_page");
            hashMap.put("poi_id", shareStruct2.poiId);
            a((Map<String, String>) hashMap, iMContact2);
            hashMap.put("from_user_id", d.b().toString());
            hashMap.put("coupon_id", shareStruct2.extraParams.get("coupon_id"));
            if (z) {
                str = "chat_merge";
            } else {
                str = "chat";
            }
            hashMap.put("platform", str);
            r.a("share_coupon", (Map) hashMap);
        }
    }

    private void b(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        String str;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        IMContact iMContact2 = iMContact;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52670a, false, 53572, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact2, Byte.valueOf(z)}, this, f52670a, false, 53572, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (shareStruct2 != null && b.a(shareStruct)) {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "chat_merge";
            } else {
                str = "chat";
            }
            try {
                jSONObject.put("platform", str);
                jSONObject.put("group_id", shareStruct2.itemIdStr);
                if (!m.b()) {
                    jSONObject.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                if (iMContact2 == null) {
                    jSONObject.put("to_user_id", "null");
                    jSONObject.put("conversation_id", "null");
                } else if (iMContact2 instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact2;
                    Long valueOf = Long.valueOf(Long.parseLong(iMUser.getUid()));
                    jSONObject.put("to_user_id", iMUser.getUid());
                    jSONObject.put("conversation_id", e.a(valueOf.longValue()));
                } else if (iMContact2 instanceof IMConversation) {
                    jSONObject.put("conversation_id", ((IMConversation) iMContact2).getConversationId());
                    jSONObject.put("to_user_id", "null");
                }
            } catch (JSONException unused) {
            }
            try {
                jSONObject.put("enter_from", shareStruct2.enterFrom);
                jSONObject.put("author_id", shareStruct2.authorId);
                if (!TextUtils.isEmpty(shareStruct2.poiId)) {
                    jSONObject.put("poi_id", shareStruct2.poiId);
                    jSONObject.put("poi_type", shareStruct2.poiType);
                }
                if (shareStruct2.cityInfo != null) {
                    jSONObject.put("city_info", shareStruct2.cityInfo);
                }
                if (shareStruct2.distnceInfo != null) {
                    jSONObject.put("distance_info", shareStruct2.distnceInfo);
                }
                jSONObject.put("content_type", shareStruct2.contentType);
                String str2 = shareStruct2.enterFrom;
                if (PatchProxy.isSupport(new Object[]{str2}, null, f52670a, true, 53571, new Class[]{String.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f52670a, true, 53571, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else if ("homepage_hot".equals(str2) || "homepage_follow".equals(str2) || "homepage_fresh".equals(str2) || "hot_search_video_board".equals(str2)) {
                    z2 = true;
                }
                if (z2 && !TextUtils.isEmpty(shareStruct2.logPb)) {
                    jSONObject.put("log_pb", new JSONObject(shareStruct2.logPb));
                }
                String str3 = null;
                if (shareStruct2.extraParams != null) {
                    String str4 = shareStruct2.extraParams.get("play_mode");
                    if (str4 != null) {
                        jSONObject.put("play_mode", str4);
                    }
                    str3 = shareStruct2.extraParams.get("enter_method");
                    String str5 = shareStruct2.extraParams.get("play_list_type");
                    if (!TextUtils.isEmpty(str5)) {
                        jSONObject.put("playlist_type", str5);
                    }
                    String str6 = shareStruct2.extraParams.get("play_list_id_key");
                    String str7 = shareStruct2.extraParams.get("play_list_id_value");
                    if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                        jSONObject.put(str6, str7);
                    }
                }
                if (TextUtils.equals(str3, "more")) {
                    jSONObject.put("enter_method", "more");
                } else if (TextUtils.equals(str3, "head")) {
                    jSONObject.put("enter_method", "head");
                } else {
                    jSONObject.put("enter_method", "icon");
                }
                if (shareStruct2.isLongItem != 0) {
                    jSONObject.put("is_long_item", shareStruct2.isLongItem);
                }
            } catch (JSONException unused2) {
            }
            AppLogNewUtils.onEventV3("share_video", jSONObject);
        }
    }

    public final void c(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f52670a, false, 53626, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f52670a, false, 53626, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str4);
        hashMap.put("to_user_id", str5);
        hashMap.put("emoji_id", str6);
        r.a("greeting_emoji", (Map) hashMap);
    }

    public static void a(String str, String str2, List<IMUser> list, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        List<IMUser> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str5, str6, list2, str3}, null, f52670a, true, 53638, new Class[]{String.class, String.class, List.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, list2, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52670a, true, 53638, new Class[]{String.class, String.class, List.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", str5);
        hashMap.put("type", str6);
        if (list2 != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list2.get(i).getUid());
                if (i != list.size() - 1) {
                    sb.append(",");
                }
            }
            hashMap.put("to_user_list", sb.toString());
        } else {
            hashMap.put("to_user_list", "null");
        }
        if (TextUtils.isEmpty(str3)) {
            str4 = "null";
        } else {
            str4 = str3;
        }
        hashMap.put("action", str4);
        r.a("group_chat_member_notice", (Map) hashMap);
    }

    public static void c(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, null, f52670a, true, 53639, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52670a, true, 53639, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str5);
        hashMap.put("from_user_id", str6);
        hashMap.put("to_user_id", str7);
        hashMap.put("status", str8);
        r.a("group_chat_show_invite", (Map) hashMap);
    }
}
