package com.ss.android.ugc.aweme.user.b;

import android.os.Handler;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.ae;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.user.b;
import com.ss.android.ugc.aweme.user.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75298a;

    public static void a(Handler handler, Map<String, String> map, int i) {
        Handler handler2 = handler;
        final Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{handler2, map2, Integer.valueOf(i)}, null, f75298a, true, 87641, new Class[]{Handler.class, Map.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, map2, Integer.valueOf(i)}, null, f75298a, true, 87641, new Class[]{Handler.class, Map.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75302a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f75302a, false, 87648, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f75302a, false, 87648, new Class[0], Object.class);
                }
                Map map = map2;
                if (PatchProxy.isSupport(new Object[]{map}, null, b.f75297a, true, 87491, new Class[]{Map.class}, UserResponse.class)) {
                    return (UserResponse) PatchProxy.accessDispatch(new Object[]{map}, null, b.f75297a, true, 87491, new Class[]{Map.class}, UserResponse.class);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new e("uid", c.a().e()));
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new e((String) entry.getKey(), (String) entry.getValue()));
                }
                UserResponse a2 = ((com.ss.android.ugc.aweme.main.h.e) ae.a(com.ss.android.ugc.aweme.main.h.e.class)).a("https://aweme.snssdk.com/aweme/v1/commit/user/", (List<e>) arrayList);
                Set<String> a3 = b.a(new HashSet(map.keySet()));
                if (!(c.a().b() == null || a2.getUser() == null || (!TextUtils.isEmpty(c.a().b().getUid()) && !TextUtils.isEmpty(a2.getUser().getUid())))) {
                    n.a("aweme_user_manager_null_uid", com.ss.android.ugc.aweme.account.a.a.a.a().a("local_user_json", new Gson().toJson((Object) c.a().b())).a("server_user_json", new Gson().toJson((Object) a2.getUser())).a("map", map.toString()).b());
                }
                b.a(c.a().b(), a2.getUser(), a3);
                return a2;
            }
        }, i);
    }

    public static void a(Handler handler, String str, String str2, int i) {
        Handler handler2 = handler;
        final String str3 = str;
        final String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{handler2, str3, str4, Integer.valueOf(i)}, null, f75298a, true, 87640, new Class[]{Handler.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, str4, Integer.valueOf(i)}, null, f75298a, true, 87640, new Class[]{Handler.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75299a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f75299a, false, 87647, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f75299a, false, 87647, new Class[0], Object.class);
                }
                String str = str3;
                String str2 = str4;
                if (PatchProxy.isSupport(new Object[]{str, str2}, null, b.f75297a, true, 87490, new Class[]{String.class, String.class}, UserResponse.class)) {
                    return (UserResponse) PatchProxy.accessDispatch(new Object[]{str, str2}, null, b.f75297a, true, 87490, new Class[]{String.class, String.class}, UserResponse.class);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new e("uid", c.a().e()));
                arrayList.add(new e(str, str2));
                UserResponse a2 = ((com.ss.android.ugc.aweme.main.h.e) ae.a(com.ss.android.ugc.aweme.main.h.e.class)).a("https://aweme.snssdk.com/aweme/v1/commit/user/", (List<e>) arrayList);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                Set<String> a3 = b.a(hashSet);
                if (!(c.a().b() == null || a2.getUser() == null || (!TextUtils.isEmpty(c.a().b().getUid()) && !TextUtils.isEmpty(a2.getUser().getUid())))) {
                    n.a("aweme_user_manager_null_uid", com.ss.android.ugc.aweme.account.a.a.a.a().a("local_user_json", new Gson().toJson((Object) c.a().b())).a("server_user_json", new Gson().toJson((Object) a2.getUser())).b());
                }
                b.a(c.a().b(), a2.getUser(), a3);
                return a2;
            }
        }, i);
    }

    public static void a(Handler handler, String str, boolean z, int i) {
        Handler handler2 = handler;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2, (byte) 0, Integer.valueOf(SearchJediMixFeedAdapter.f42516e)}, null, f75298a, true, 87642, new Class[]{Handler.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2, (byte) 0, Integer.valueOf(SearchJediMixFeedAdapter.f42516e)}, null, f75298a, true, 87642, new Class[]{Handler.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new Callable(false) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75304a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f75304a, false, 87649, new Class[0], Object.class)) {
                    return b.a(str2, false);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f75304a, false, 87649, new Class[0], Object.class);
            }
        }, SearchJediMixFeedAdapter.f42516e);
    }

    public static void a(Handler handler, String str, int i, String str2, int i2) {
        if (PatchProxy.isSupport(new Object[]{handler, str, Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f75298a, true, 87643, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler, str, Integer.valueOf(i), str2, Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f75298a, true, 87643, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(handler, str, i, str2, null, i2);
    }

    public static void a(Handler handler, String str, int i, String str2, List<e> list, int i2) {
        Handler handler2 = handler;
        final String str3 = str;
        final String str4 = str2;
        final List<e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{handler2, str3, Integer.valueOf(i), str4, list2, Integer.valueOf(i2)}, null, f75298a, true, 87644, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, List.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, str3, Integer.valueOf(i), str4, list2, Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f75298a, true, 87644, new Class[]{Handler.class, String.class, Integer.TYPE, String.class, List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final int i3 = i;
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75307a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f75307a, false, 87650, new Class[0], Object.class)) {
                    return ((com.ss.android.ugc.aweme.main.h.e) ae.a(com.ss.android.ugc.aweme.main.h.e.class)).a(str3, i3, str4, list2);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f75307a, false, 87650, new Class[0], Object.class);
            }
        }, i2);
    }
}
