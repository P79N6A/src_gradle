package com.ss.android.ugc.aweme.discover.mob;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.n;
import com.ss.android.ugc.aweme.u.q;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42673a;

    @NonNull
    private static String a(int i) {
        return i == 3 ? "general_search" : i == 6 ? "search_sug" : "search_result";
    }

    public static void a(String str, Aweme aweme) {
        String str2 = str;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str2, aweme2}, null, f42673a, true, 36993, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aweme2}, null, f42673a, true, 36993, new Class[]{String.class, Aweme.class}, Void.TYPE);
            return;
        }
        a(str2, aweme2, "");
    }

    public static void a(String str, Aweme aweme, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, aweme, str4}, null, f42673a, true, 36994, new Class[]{String.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, aweme, str4}, null, f42673a, true, 36994, new Class[]{String.class, Aweme.class, String.class}, Void.TYPE);
        } else if (str3.equals("general_search") || str3.equals("search_result") || str3.equals("similar_videos")) {
            r.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(str3).setValue(aweme.getAid()).setJsonObject(c.a().a("request_id", aa.c(aweme)).b()));
            d dVar = new d();
            dVar.a("enter_from", str3).a("group_id", aweme.getAid()).a("search_keyword", str4).a("log_pb", ai.a().a(aa.c(aweme)));
            r.a("feed_enter", aa.a(dVar.f34114b));
        }
    }

    @NonNull
    public static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f42673a, true, 36988, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f42673a, true, 36988, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "click_search_recommend";
        } else {
            return "click_search_result";
        }
    }

    public static void a(com.ss.android.ugc.aweme.u.d dVar, s sVar) {
        com.ss.android.ugc.aweme.u.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, sVar}, null, f42673a, true, 36989, new Class[]{com.ss.android.ugc.aweme.u.d.class, s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, sVar}, null, f42673a, true, 36989, new Class[]{com.ss.android.ugc.aweme.u.d.class, s.class}, Void.TYPE);
            return;
        }
        new f().setSearchKeyword(sVar.a()).setRid(sVar.b()).setEnterFrom("general_search").setEnterMethod("aladdin_card").installToMetrics(dVar2);
        dVar.e();
    }

    public static void a(int i, String str, int i2, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str5, 0, str6, str7, str8}, null, f42673a, true, 36986, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str5, 0, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f42673a, true, 36986, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        q k = new q().b(a(0)).l(str6).k(str7);
        new f().setOrder(i).setSearchKeyword(str5).setRid(str6).setEnterFrom("find_friends").setEnterMethod(str8).installToMetrics(k);
        k.e();
    }

    public static void a(int i, String str, int i2, String str2, Music music, String str3) {
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, Integer.valueOf(i2), str5, music, str3}, null, f42673a, true, 36991, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, Music.class, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str4, Integer.valueOf(i2), str5, music, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f42673a, true, 36991, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, Music.class, String.class}, Void.TYPE);
            return;
        }
        a(i, str, str2, (com.ss.android.ugc.aweme.u.d) ((n) new n().a(true)).f(music.getMid()).b(a(i2)).g(str5), i2, str3);
        if (i2 != 3) {
            c a2 = c.a();
            if (!TextUtils.isEmpty(str)) {
                a2.a("search_keyword", str4);
                r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setExtValueString(music.getMid()).setJsonObject(a2.b()));
            } else {
                a2.a("source", "recommend");
                a2.a("id", music.getMid());
                r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setJsonObject(a2.b()));
            }
        } else {
            r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("general_search").setValue(music.getMid()));
        }
    }

    public static void b(int i, String str, int i2, String str2, String str3, String str4) {
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str5, str6, str4}, null, f42673a, true, 36987, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), str5, str6, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f42673a, true, 36987, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(i, str, str2, (com.ss.android.ugc.aweme.u.d) ((q) new q().a(true)).b(a(i2)).l(str5).k(str6), i2, str4);
        c a2 = c.a();
        if (i2 != 3) {
            a2.a("group_id", "");
            a2.a("request_id", str5);
            a2.a("enter_from", "search_result");
            a2.a("enter_method", "click_card");
            a2.a("enter_type", "normal_way");
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str6).setJsonObject(a2.b()));
            return;
        }
        a2.a("enter_from", "general_search");
        a2.a("enter_method", "click_card");
        a2.a("enter_type", "normal_way");
        r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str6).setJsonObject(a2.b()));
    }

    public static void c(int i, String str, int i2, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str5, Integer.valueOf(i2), str6, str7, str4}, null, f42673a, true, 36992, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str5, Integer.valueOf(i2), str6, str7, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f42673a, true, 36992, new Class[]{Integer.TYPE, String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(i, str, str2, (com.ss.android.ugc.aweme.u.d) ((com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().a(true)).e(str7).b(a(i2)).f(str6), i2, str4);
        if (i2 == 3) {
            r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("general_search").setValue(str7));
            return;
        }
        c a2 = c.a();
        if (!TextUtils.isEmpty(str)) {
            a2.a("search_keyword", str5);
            r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setExtValueString(str7).setJsonObject(a2.b()));
            return;
        }
        a2.a("source", "recommend");
        a2.a("id", str7);
        r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setJsonObject(a2.b()));
    }

    private static void a(int i, String str, String str2, com.ss.android.ugc.aweme.u.d dVar, int i2, String str3) {
        String str4 = str;
        String str5 = str2;
        com.ss.android.ugc.aweme.u.d dVar2 = dVar;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, str5, dVar2, Integer.valueOf(i2), str6}, null, f42673a, true, 36990, new Class[]{Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.u.d.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str4, str5, dVar2, Integer.valueOf(i2), str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f42673a, true, 36990, new Class[]{Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.u.d.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        new f().setOrder(i).setSearchKeyword(str4).setRid(str5).setEnterFrom(a(i2)).setEnterMethod(str6).installToMetrics(dVar2);
        dVar.e();
    }
}
