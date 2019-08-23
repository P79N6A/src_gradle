package com.ss.android.ugc.aweme.festival.christmas;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.base.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.utils.ex;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47225a = null;

    /* renamed from: b */
    public static final int cr6 = 2131169954;

    /* renamed from: c */
    public static final int aql = 2131167198;

    /* renamed from: d  reason: collision with root package name */
    private static b f47226d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f47227e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f47228f = true;
    private static com.ss.android.ugc.aweme.festival.common.a g;

    public static boolean c() {
        if (f47227e > 6) {
            return true;
        }
        return false;
    }

    public static void d() {
        if (f47227e <= 6) {
            f47227e++;
        }
    }

    static {
        try {
            f47226d = (b) c.a(k.a(), b.class);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.util.c.a("Get show xmas tree SP failed." + th.getMessage());
        }
    }

    public static Map<String, Object> f() {
        if (PatchProxy.isSupport(new Object[0], null, f47225a, true, 43887, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], null, f47225a, true, 43887, new Class[0], Map.class);
        }
        com.ss.android.ugc.aweme.festival.common.a e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.g;
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f47225a, true, 43878, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47225a, true, 43878, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (e() == null || !e().f47290d || e().f47291e == null || ex.b()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f47225a, true, 43879, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47225a, true, 43879, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (e() != null && a() && TextUtils.equals(e().f47287a, "2018_US_Christmas")) {
            z = true;
        }
        return z;
    }

    public static com.ss.android.ugc.aweme.festival.common.a e() {
        an<String> anVar;
        if (PatchProxy.isSupport(new Object[0], null, f47225a, true, 43884, new Class[0], com.ss.android.ugc.aweme.festival.common.a.class)) {
            return (com.ss.android.ugc.aweme.festival.common.a) PatchProxy.accessDispatch(new Object[0], null, f47225a, true, 43884, new Class[0], com.ss.android.ugc.aweme.festival.common.a.class);
        }
        if (g != null) {
            return g;
        }
        x a2 = x.a();
        if (PatchProxy.isSupport(new Object[0], a2, x.f2698a, false, 22438, new Class[0], an.class)) {
            anVar = (an) PatchProxy.accessDispatch(new Object[0], a2, x.f2698a, false, 22438, new Class[0], an.class);
        } else {
            if (a2.i == null) {
                a2.i = new an<>("festival_entity", "");
            }
            anVar = a2.i;
        }
        String str = (String) anVar.c();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            g = (com.ss.android.ugc.aweme.festival.common.a) new Gson().fromJson(str, com.ss.android.ugc.aweme.festival.common.a.class);
        } catch (Exception unused) {
            g = null;
        }
        return g;
    }

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f47225a, true, 43896, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f47225a, true, 43896, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!b() || aweme == null || aweme.getAuthor() == null) {
            return false;
        } else {
            if (aweme.getAuthor().isMe()) {
                User curUser = d.a().getCurUser();
                if (curUser == null || curUser.isSecret()) {
                    return false;
                }
                List list = null;
                try {
                    list = (List) new Gson().fromJson((String) x.a().ac().c(), new TypeToken<List<String>>() {
                    }.getType());
                } catch (Exception unused) {
                }
                if (CollectionUtils.isEmpty(list) || !list.contains(aweme.getAid())) {
                    return false;
                }
                return true;
            } else if (aweme.getAuthor().isSecret() || !a(aweme.getStickerIDs())) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f47225a, true, 43897, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f47225a, true, 43897, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!b()) {
            return false;
        } else {
            com.ss.android.ugc.aweme.festival.common.a e2 = e();
            if (e2 != null) {
                List<String> list = e2.i;
                for (String str2 : bv.a(str)) {
                    if (list != null && list.contains(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f47225a, true, 43889, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f47225a, true, 43889, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, str2, null}, null, f47225a, true, 43890, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, null}, null, f47225a, true, 43890, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (str2.startsWith("https://") || str2.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=");
                    sb.append(URLEncoder.encode(str2, "ISO-8859-1"));
                } catch (Exception unused) {
                }
                Intent a2 = b.a(context2, Uri.parse(sb.toString()));
                a2.setClass(context2, CrossPlatformActivity.class);
                a2.putExtra("hide_more", false);
                a2.putExtra("bundle_auto_play_audio", true);
                context2.startActivity(a2);
                return;
            }
            sb.append(str2);
            h.a().a(sb.toString());
        }
    }
}
