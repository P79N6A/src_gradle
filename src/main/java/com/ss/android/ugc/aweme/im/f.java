package com.ss.android.ugc.aweme.im;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50065a;

    public static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f50065a, true, 50100, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f50065a, true, 50100, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a("chat", str2, "");
    }

    public static void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f50065a, true, 50088, new Class[]{String.class}, Void.TYPE)) {
            Object[] objArr = {str};
            PatchProxy.accessDispatch(objArr, null, f50065a, true, 50088, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a(GlobalContext.getContext(), "chat", "others_homepage", str, 0);
    }

    public static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f50065a, true, 50104, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f50065a, true, 50104, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "others_homepage");
        hashMap.put("action_type", "show");
        hashMap.put("message_style", str2);
        r.a("duoshan_banner_show", (Map) hashMap);
    }

    public static void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f50065a, true, 50102, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f50065a, true, 50102, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "message_add");
        hashMap.put("previous_page", "message");
        hashMap.put("account_type", str3);
        hashMap.put("tag_id", str4);
        r.a("enter_tag_detail", (Map) hashMap);
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f50065a, true, 50096, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f50065a, true, 50096, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("unblock").setLabelName(str3).setValue(str4));
    }

    public static void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f50065a, true, 50095, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f50065a, true, 50095, new Class[]{String.class, String.class, String.class}, Void.TYPE);
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

    public static void a(String str, String str2, int i, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f50065a, true, 50103, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i), Byte.valueOf(z)}, null, f50065a, true, 50103, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("account_type", str3);
        hashMap.put("client_order", str4);
        if (i > 0) {
            if (z) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
        }
        r.a("enter_official_message", (Map) hashMap);
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        if (PatchProxy.isSupport(new Object[]{str7, str8, str9, str10, str11}, null, f50065a, true, 50091, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str7, str8, str9, str10, str11};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f50065a, true, 50091, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("author_id", str7).a("enter_from", "others_homepage").a("enter_type", "normal_way").a("group_id", str8).a("previous_page", str9);
        if (PatchProxy.isSupport(new Object[]{str10}, null, f50065a, true, 50092, new Class[]{String.class}, String.class)) {
            str6 = (String) PatchProxy.accessDispatch(new Object[]{str10}, null, f50065a, true, 50092, new Class[]{String.class}, String.class);
        } else {
            LogPbBean logPbBean = new LogPbBean();
            logPbBean.setImprId(str10);
            str6 = new Gson().toJson((Object) logPbBean);
        }
        d a3 = a2.a("log_pb", str6).a("to_user_id", str7).a("enter_method", str11);
        if (!a.a()) {
            a3.a("conversation_id", b.a().getConversationId(str7));
        }
        r.a("enter_chat", (Map) a3.f34114b);
    }
}
