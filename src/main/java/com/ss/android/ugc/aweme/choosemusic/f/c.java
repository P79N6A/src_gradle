package com.ss.android.ugc.aweme.choosemusic.f;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.ui.v;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35896a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f35897b = null;

    /* renamed from: c  reason: collision with root package name */
    public static String f35898c = null;

    /* renamed from: d  reason: collision with root package name */
    static e f35899d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f35900e = -1;

    public static String a() {
        return f35897b;
    }

    static int b() {
        return f35900e;
    }

    public static void a(boolean z, String str, a aVar, int i, LogPbBean logPbBean) {
        String str2 = str;
        a aVar2 = aVar;
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2, aVar2, Integer.valueOf(i), logPbBean2}, null, f35896a, true, 26773, new Class[]{Boolean.TYPE, String.class, a.class, Integer.TYPE, LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2, aVar2, Integer.valueOf(i), logPbBean2}, null, f35896a, true, 26773, new Class[]{Boolean.TYPE, String.class, a.class, Integer.TYPE, LogPbBean.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            d a2 = d.a();
            a2.a("enter_from", aVar2.f35731a).a("music_id", str2).a("category_name", aVar2.f35732b).a("enter_method", aVar2.f35733c).a("previous_page", aVar2.f35734d).a("order", i);
            if (!TextUtils.isEmpty(aVar2.f35735e)) {
                a2.a("category_id", aVar2.f35735e);
            }
            if (!TextUtils.isEmpty(aVar2.g)) {
                a2.a("tag_id", aVar2.g);
            }
            if (!TextUtils.isEmpty(aVar2.f35736f)) {
                a2.a("prop_id", aVar2.f35736f);
            }
            if (TextUtils.equals(aVar2.f35731a, "search_music")) {
                a2.a("search_keyword", f35898c);
                a2.a("log_pb", new Gson().toJson((Object) logPbBean2));
                r.a(z ? "favourite_song" : "cancel_favourite_song", v.a(a2.f34114b));
            } else if (z) {
                r.a("favourite_song", (Map) a2.f34114b);
            }
        }
    }

    public static void a(String str, String str2, a aVar) {
        long j;
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, null, f35896a, true, 26774, new Class[]{String.class, String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, null, f35896a, true, 26774, new Class[]{String.class, String.class, a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            d a2 = d.a();
            d a3 = a2.a("to_music_id", str3).a("category_name", aVar2.f35732b).a("previous_page", aVar2.f35734d).a("from_music_id", str4);
            if (f35899d == null) {
                j = 0;
            } else {
                j = f35899d.b(str4);
            }
            a3.a("this_music_stay_time", j);
            r.a("click_next_music", (Map) a2.f34114b);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, str9, str10}, null, f35896a, true, 26780, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str6, str7, str8, str9, str10};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f35896a, true, 26780, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        d dVar = new d();
        if (!TextUtils.isEmpty(str3)) {
            dVar.a("banner_id", str8);
        }
        dVar.a("category_name", str6).a("enter_method", str7).a("enter_from", str9);
        if (!TextUtils.isEmpty(str5)) {
            dVar.a("category_id", str10);
        }
        r.a("enter_song_category", (Map) dVar.f34114b);
    }

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f35896a, true, 26781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f35896a, true, 26781, new Class[0], Void.TYPE);
        } else {
            r.a("enter_search", (Map) d.a().a("enter_from", "change_music_page").f34114b);
        }
    }

    public static void a(int i) {
        f35900e = i;
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f35896a, true, 26772, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f35896a, true, 26772, new Class[]{String.class}, Void.TYPE);
        } else if (f35899d != null) {
            f35899d.a(str2);
        }
    }

    public static void a(String str, a aVar) {
        long j;
        String str2 = str;
        a aVar2 = aVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, null, f35896a, true, 26775, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, null, f35896a, true, 26775, new Class[]{String.class, a.class}, Void.TYPE);
        } else if (aVar2 != null && f35899d != null) {
            d a2 = d.a();
            d a3 = a2.a("music_id", str2).a("category_name", aVar2.f35732b);
            if (f35899d != null) {
                i = f35899d.c(str2);
            }
            d a4 = a3.a("duration", i);
            if (f35899d == null) {
                j = 0;
            } else {
                j = f35899d.b(str2);
            }
            a4.a("stay_time", j).a("enter_from", aVar2.f35731a).a("previous_page_position", aVar2.f35734d);
            if (!TextUtils.isEmpty(aVar2.g)) {
                a2.a("tag_id", aVar2.g);
            }
            if (!TextUtils.isEmpty(aVar2.f35736f)) {
                a2.a("prop_id", aVar2.f35736f);
            }
            r.a("music_play_time", (Map) a2.f34114b);
            f35899d = null;
        }
    }

    public static void a(a aVar, String str, boolean z) {
        String str2;
        a aVar2 = aVar;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, f35896a, true, 26777, new Class[]{a.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str3, Byte.valueOf(z)}, null, f35896a, true, 26777, new Class[]{a.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            d a2 = d.a();
            d a3 = a2.a("enter_from", aVar2.f35731a).a("music_id", str3).a("category_name", aVar2.f35732b);
            if (z) {
                str2 = "click_banner";
            } else {
                str2 = "click_button";
            }
            a3.a("enter_method", str2);
            if (!TextUtils.isEmpty(aVar2.f35735e)) {
                a2.a("category_id", aVar2.f35735e);
            }
            r.a("enter_music_detail", (Map) a2.f34114b);
        }
    }

    public static void a(a aVar, String str, int i, LogPbBean logPbBean) {
        a aVar2 = aVar;
        String str2 = str;
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, Integer.valueOf(i), logPbBean2}, null, f35896a, true, 26779, new Class[]{a.class, String.class, Integer.TYPE, LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, Integer.valueOf(i), logPbBean2}, null, f35896a, true, 26779, new Class[]{a.class, String.class, Integer.TYPE, LogPbBean.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            d a2 = d.a();
            a2.a("enter_from", aVar2.f35731a).a("music_id", str2).a("category_name", aVar2.f35732b).a("enter_method", aVar2.f35733c).a("order", i).a("previous_page", a());
            if (!TextUtils.isEmpty(aVar2.g)) {
                a2.a("tag_id", aVar2.g);
            }
            if (!TextUtils.isEmpty(aVar2.f35736f)) {
                a2.a("prop_id", aVar2.f35736f);
            }
            if (!TextUtils.isEmpty(aVar2.f35735e)) {
                a2.a("category_id", aVar2.f35735e);
            }
            if (TextUtils.equals(aVar2.f35731a, "search_music")) {
                a2.a("search_keyword", f35898c);
                a2.a("log_pb", new Gson().toJson((Object) logPbBean2));
                r.a("add_music", v.a(a2.f34114b));
                return;
            }
            r.a("add_music", (Map) a2.f34114b);
        }
    }

    public static void a(a aVar, String str, int i, boolean z) {
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f35896a, true, 26782, new Class[]{a.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, Integer.valueOf(i), Byte.valueOf(z)}, null, f35896a, true, 26782, new Class[]{a.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (aVar2 != null && z) {
            d dVar = new d();
            dVar.a("enter_from", aVar2.f35731a).a("music_id", str2).a("category_name", aVar2.f35732b).a("enter_method", aVar2.f35733c).a("previous_page", aVar2.f35734d).a("order", i);
            if (!TextUtils.isEmpty(aVar2.f35735e)) {
                dVar.a("category_id", aVar2.f35735e);
            }
            if (!TextUtils.isEmpty(aVar2.g)) {
                dVar.a("tag_id", aVar2.g);
            }
            if (!TextUtils.isEmpty(aVar2.f35736f)) {
                dVar.a("prop_id", aVar2.f35736f);
            }
            r.a("show_music", (Map) dVar.f34114b);
        }
    }
}
