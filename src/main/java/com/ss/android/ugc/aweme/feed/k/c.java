package com.ss.android.ugc.aweme.feed.k;

import a.i;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.an;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45567a;

    static final /* synthetic */ Object a(String str, String str2, String str3, String str4, boolean z) throws Exception {
        String str5;
        d a2 = d.a().a("request_id", str).a("author_id", str2).a("from_group_id", str3).a("to_group_id", str4).a("log_pb", ai.a().a(str4)).a("play_mode", "normal");
        a2.a("log_pb", ai.a().a(str));
        a2.a("enter_play_method", "manul_play");
        if (z) {
            str5 = "preference_slide_down";
        } else {
            str5 = "preference_slide_up";
        }
        r.a(str5, aa.a(a2.f34114b));
        return null;
    }

    public static void a(Context context, @NonNull Aweme aweme, @NonNull JSONObject jSONObject, @NonNull b bVar, String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{context, aweme, jSONObject, bVar, str}, null, f45567a, true, 43606, new Class[]{Context.class, Aweme.class, JSONObject.class, b.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, aweme, jSONObject, bVar, str};
            PatchProxy.accessDispatch(objArr, null, f45567a, true, 43606, new Class[]{Context.class, Aweme.class, JSONObject.class, b.class, String.class}, Void.TYPE);
            return;
        }
        int pageType = bVar.getPageType();
        if (pageType == 7) {
            str2 = "homepage_fresh";
        } else if (pageType != 11) {
            switch (pageType) {
                case 0:
                    str2 = "homepage_hot";
                    break;
                case 1:
                    str2 = "homepage_follow";
                    break;
                default:
                    return;
            }
        } else {
            str2 = "categorized_city_poi";
        }
        d dVar = new d(jSONObject, aweme, str2, context, aweme.getAid(), bVar, str);
        i.a((Callable<TResult>) dVar, (Executor) h.e());
    }

    static final /* synthetic */ Object a(boolean z, String str, String str2, String str3, String str4, @NonNull b bVar) throws Exception {
        String str5;
        String str6;
        String str7;
        MobClick obtain = MobClick.obtain();
        if (z) {
            str5 = "slide_down";
        } else {
            str5 = "slide_up";
        }
        r.onEvent(obtain.setEventName(str5).setLabelName("homepage_hot").setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("request_id", str).a("author_id", str2).a("from_group_id", str3).a("to_group_id", str4).b()));
        d a2 = d.a().a("request_id", str).a("author_id", str2).a("from_group_id", str3).a("to_group_id", str4).a("log_pb", ai.a().a(str4)).a("play_mode", "normal");
        if (TextUtils.equals("homepage_hot", bVar.getEventType())) {
            a2.a("log_pb", ai.a().a(str));
            a2.a("enter_play_method", "manul_play");
            if (z) {
                str7 = "homepage_hot_slide_down";
            } else {
                str7 = "homepage_hot_slide_up";
            }
            r.a(str7, aa.a(a2.f34114b));
        } else {
            if (z) {
                str6 = "homepage_hot_slide_down";
            } else {
                str6 = "homepage_hot_slide_up";
            }
            r.a(str6, (Map) a2.f34114b);
        }
        return null;
    }

    static final /* synthetic */ Object a(@NonNull JSONObject jSONObject, @NonNull Aweme aweme, String str, Context context, String str2, @NonNull b bVar, String str3) throws Exception {
        try {
            jSONObject.put("display", "full");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("to_user_id", aweme.getAuthorUid());
            jSONObject.put("author_id", aweme.getAuthorUid());
            if (!TextUtils.isEmpty(aa.e(aweme))) {
                jSONObject.put("poi_id", aa.e(aweme));
            }
            if (aa.c(str)) {
                jSONObject.put("poi_type", aa.h(aweme));
                jSONObject.put("city_info", aa.a());
                jSONObject.put("distance_info", aa.i(aweme));
            }
        } catch (JSONException unused) {
        }
        r.a(context, "show", str, str2, 0, jSONObject);
        if (a.a()) {
            r.a("video_show", (Map) d.a().a("enter_from", str).a("group_id", str2).a("author_id", aweme.getAuthorUid()).a("log_pb", ai.a().a(aa.f(str2))).a("_staging_flag", 0).a("feed_count", aweme.getFeedCount()).a("order", aweme.getOrder(bVar.getPageType())).f34114b);
            new an().a(str3).b(aweme, bVar.getPageType()).e();
        }
        return null;
    }
}
