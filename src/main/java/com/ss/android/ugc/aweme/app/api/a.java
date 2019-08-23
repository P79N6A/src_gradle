package com.ss.android.ugc.aweme.app.api;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.f;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ApiMonitorService;
import com.ss.android.ugc.aweme.utils.ce;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33783a;

    /* renamed from: com.ss.android.ugc.aweme.app.api.a$a  reason: collision with other inner class name */
    static class C0435a<T> implements c<List<T>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33784a;

        /* renamed from: b  reason: collision with root package name */
        public Class<T> f33785b;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public List<T> a(Object obj) throws Exception {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f33784a, false, 23030, new Class[]{Object.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{obj2}, this, f33784a, false, 23030, new Class[]{Object.class}, List.class);
            } else if (obj2 instanceof JSONArray) {
                try {
                    try {
                        return JSON.parseArray(obj.toString(), this.f33785b);
                    } catch (Throwable th) {
                        th = th;
                        throw new com.ss.android.ugc.aweme.base.api.a.a.c(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw new com.ss.android.ugc.aweme.base.api.a.a.c(th);
                }
            } else {
                throw new com.ss.android.ugc.aweme.base.api.a.a.d();
            }
        }
    }

    public static class b<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33787a;

        /* renamed from: c  reason: collision with root package name */
        static final Gson f33788c;

        /* renamed from: b  reason: collision with root package name */
        Class<T> f33789b;

        static {
            GsonBuilder createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
            createAdapterGsonBuilder.registerTypeAdapterFactory(new MusicTypeAdapterFactory());
            createAdapterGsonBuilder.registerTypeAdapterFactory(new UserTypeAdapterFactory());
            f33788c = createAdapterGsonBuilder.create();
        }

        public b(Class<T> cls) {
            this.f33789b = cls;
        }

        public final T a(Object obj) throws Exception {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f33787a, false, 23031, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, f33787a, false, 23031, new Class[]{Object.class}, Object.class);
            }
            BaseResponse.class.isAssignableFrom(this.f33789b);
            try {
                T fromJson = f33788c.fromJson(obj.toString(), this.f33789b);
                if (!(fromJson instanceof BaseResponse)) {
                    return fromJson;
                }
                try {
                    return ((BaseResponse) fromJson).checkValid();
                } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new com.ss.android.ugc.aweme.base.api.a.a(-1, th);
                }
            } catch (Throwable th2) {
                throw new com.ss.android.ugc.aweme.base.api.a.a.c(th2);
            }
        }
    }

    public interface c<T> {
        T a(@Nullable Object obj) throws Exception;
    }

    public static class d implements c<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33790a;

        /* renamed from: b  reason: collision with root package name */
        static final d f33791b = new d();

        private d() {
        }

        public static d a() {
            return f33791b;
        }

        public final /* synthetic */ Object a(@Nullable Object obj) throws Exception {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f33790a, false, 23032, new Class[]{Object.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{obj}, this, f33790a, false, 23032, new Class[]{Object.class}, String.class);
            } else if (obj != null) {
                return obj.toString();
            } else {
                return null;
            }
        }
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f33783a, true, 23011, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f33783a, true, 23011, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        if (jSONObject2 != null) {
            if (jSONObject2.has("statusCode") && jSONObject2.optInt("statusCode") == 0) {
                return true;
            }
            if (!jSONObject2.has("status_code") || jSONObject2.optInt("status_code") != 0) {
                return jSONObject2.has("message") && TextUtils.equals("success", jSONObject2.optString("message"));
            }
            return true;
        }
    }

    public static String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f33783a, true, 23015, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f33783a, true, 23015, new Class[]{String.class, String.class}, String.class);
        } else if (TextUtils.isEmpty(str2)) {
            return a(str);
        } else {
            return a().appendQueryParameter("user_id", str3).appendQueryParameter("unique_id", str4).toString();
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, str3, str4}, null, f33783a, true, 23021, new Class[]{JSONObject.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, str3, str4}, null, f33783a, true, 23021, new Class[]{JSONObject.class, String.class, String.class}, Void.TYPE);
        } else if (StringUtils.isEmpty(str)) {
            throw new com.ss.android.ugc.aweme.base.api.a.a.b();
        } else if (!a(jSONObject)) {
            if (jSONObject2.has("message") && TextUtils.equals(jSONObject2.optString("message"), "error")) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                if (optJSONObject != null) {
                    throw new com.ss.android.ugc.aweme.base.api.a.b.a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str3).setUrl(str4);
                }
            }
            com.ss.android.ugc.aweme.base.api.a.b.a url = new com.ss.android.ugc.aweme.base.api.a.b.a(jSONObject2.optInt("status_code")).setErrorMsg(jSONObject2.optString("message", "")).setErrorMsg(jSONObject2.optString("status_msg", "")).setPrompt(jSONObject2.optString("prompts", "")).setResponse(str3).setUrl(str4);
            url.setBlockCode(jSONObject2.optInt("block_code"));
            throw url;
        }
    }

    public static <T> T a(String str, c<T> cVar, String str2, String str3) throws Exception {
        String str4 = str;
        c<T> cVar2 = cVar;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, cVar2, str5, str6}, null, f33783a, true, 23022, new Class[]{String.class, c.class, String.class, String.class}, Object.class)) {
            Object[] objArr = {str4, cVar2, str5, str6};
            return PatchProxy.accessDispatch(objArr, null, f33783a, true, 23022, new Class[]{String.class, c.class, String.class, String.class}, Object.class);
        } else if (cVar2 == null) {
            throw new IllegalArgumentException("Parser can't be null");
        } else if (!StringUtils.isEmpty(str)) {
            T jSONObject = new JSONObject(str4);
            com.ss.android.ugc.traffic.a aVar = com.ss.android.ugc.traffic.a.y;
            com.ss.android.ugc.traffic.a.a(0, (long) str.length());
            if (!a((JSONObject) jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        ApiMonitorService.Companion.getInstance().apiMonitor(str6, "", str4);
                        throw new com.ss.android.ugc.aweme.base.api.a.b.a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str4).setUrl(str6);
                    }
                }
                com.ss.android.ugc.aweme.base.api.a.b.a url = new com.ss.android.ugc.aweme.base.api.a.b.a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str4).setUrl(str6);
                url.setBlockCode(jSONObject.optInt("block_code"));
                ApiMonitorService.Companion.getInstance().apiMonitor(str6, "", str4);
                throw url;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return cVar2.a(jSONObject.opt(str5));
                }
                if ((cVar2 instanceof b) && ((b) cVar2).f33789b == null) {
                    return jSONObject;
                }
                if (!(cVar2 instanceof C0435a) || ((C0435a) cVar2).f33785b != null) {
                    return cVar2.a(str4);
                }
                return jSONObject;
            } catch (Exception e2) {
                ce.a((Throwable) e2, str6, str4);
                return null;
            }
        } else {
            throw new com.ss.android.ugc.aweme.base.api.a.a.b();
        }
    }

    public static <T> T a(String str, Class<T> cls, String str2, boolean z, String str3) throws Exception {
        String str4 = str;
        Class<T> cls2 = cls;
        String str5 = str2;
        String str6 = str3;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{str4, cls2, str5, Byte.valueOf(z ? (byte) 1 : 0), str6}, null, f33783a, true, 23024, new Class[]{String.class, Class.class, String.class, Boolean.TYPE, String.class}, Object.class)) {
            Object[] objArr = {str4, cls2, str5, Byte.valueOf(z), str6};
            return PatchProxy.accessDispatch(objArr, null, f33783a, true, 23024, new Class[]{String.class, Class.class, String.class, Boolean.TYPE, String.class}, Object.class);
        } else if (!z) {
            return a(0, str4, cls2, str5, (f) null);
        } else {
            new StringBuilder("url = ").append(str4);
            int a2 = com.ss.android.ugc.aweme.store.d.a(str);
            if (!TextUtils.isEmpty(str3) && com.ss.android.ugc.aweme.store.d.a().e(a2) != null) {
                return null;
            }
            com.ss.android.ugc.aweme.store.d.a().b(a2);
            try {
                T a3 = com.ss.android.ugc.aweme.store.d.a().a(a2);
                StringBuilder sb = new StringBuilder("get result = ");
                sb.append(a2);
                sb.append(" ");
                if (a3 != null) {
                    z2 = false;
                }
                sb.append(z2);
                if (a3 != null) {
                    com.ss.android.ugc.aweme.store.d.a().a(str6, a2);
                    return a3;
                }
                T a4 = a(0, str4, cls2, str5, (f) null);
                if (!TextUtils.isEmpty(str3)) {
                    com.ss.android.ugc.aweme.store.d.a().a(a2, (Object) a4);
                    com.ss.android.ugc.aweme.store.d.a().a(a2, str6);
                    com.ss.android.ugc.aweme.store.d.a().f71751b = (User) a4;
                    StringBuilder sb2 = new StringBuilder("put result = ");
                    sb2.append(a2);
                    sb2.append(" ");
                    sb2.append(str4);
                } else {
                    com.ss.android.ugc.aweme.store.d.a().d(a2);
                }
                com.ss.android.ugc.aweme.store.d.a().c(a2);
                return a4;
            } finally {
                com.ss.android.ugc.aweme.store.d.a().c(a2);
            }
        }
    }

    public static Uri.Builder a() {
        if (PatchProxy.isSupport(new Object[0], null, f33783a, true, 23012, new Class[0], Uri.Builder.class)) {
            return (Uri.Builder) PatchProxy.accessDispatch(new Object[0], null, f33783a, true, 23012, new Class[0], Uri.Builder.class);
        }
        return Uri.parse("https://aweme.snssdk.com/aweme/v1/user/").buildUpon();
    }

    public static String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f33783a, true, 23014, new Class[]{String.class}, String.class)) {
            return a().appendQueryParameter("user_id", str2).toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f33783a, true, 23014, new Class[]{String.class}, String.class);
    }

    public static void b(String str, String str2) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f33783a, true, 23020, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f33783a, true, 23020, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str3);
            if (!a(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        throw new com.ss.android.ugc.aweme.base.api.a.b.a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str3).setUrl(str4);
                    }
                }
                com.ss.android.ugc.aweme.base.api.a.b.a url = new com.ss.android.ugc.aweme.base.api.a.b.a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str3).setUrl(str4);
                url.setBlockCode(jSONObject.optInt("block_code"));
                throw url;
            }
        } else {
            throw new com.ss.android.ugc.aweme.base.api.a.a.b();
        }
    }

    private static <T> T a(int i, String str, c<T> cVar, String str2, f fVar) throws Exception {
        String str3 = str;
        c<T> cVar2 = cVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, cVar2, str4, fVar}, null, f33783a, true, 23023, new Class[]{Integer.TYPE, String.class, c.class, String.class, f.class}, Object.class)) {
            Object[] objArr = {Integer.valueOf(i), str3, cVar2, str4, fVar};
            return PatchProxy.accessDispatch(objArr, null, f33783a, true, 23023, new Class[]{Integer.TYPE, String.class, c.class, String.class, f.class}, Object.class);
        } else if (NetworkUtils.isNetworkAvailable(k.a()) || (!TextUtils.isEmpty(str) && str3.contains("/aweme/v1/feed/?type=0"))) {
            return a(NetworkUtils.executeGet(i, 0, str, true, true, (List<com.ss.android.http.a.a>) null, fVar, true), cVar2, str4, str3);
        } else {
            throw new IOException();
        }
    }

    public static <T> T a(int i, String str, Class<T> cls, String str2, f fVar) throws Exception {
        int i2 = i;
        String str3 = str;
        Class<T> cls2 = cls;
        String str4 = str2;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, cls2, str4, fVar2}, null, f33783a, true, 23026, new Class[]{Integer.TYPE, String.class, Class.class, String.class, f.class}, Object.class)) {
            Object[] objArr = {Integer.valueOf(i), str3, cls2, str4, fVar2};
            return PatchProxy.accessDispatch(objArr, null, f33783a, true, 23026, new Class[]{Integer.TYPE, String.class, Class.class, String.class, f.class}, Object.class);
        } else if (String.class.equals(cls2)) {
            return a(i2, str3, (c<T>) d.a(), str4, fVar2);
        } else {
            return a(i2, str3, (c<T>) new b<T>(cls2), str4, fVar2);
        }
    }

    public static <T> T a(String str, int i, String str2, c<T> cVar, String str3) throws Exception {
        String str4 = str;
        String str5 = str2;
        c<T> cVar2 = cVar;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, Integer.valueOf(i), str5, cVar2, str6}, null, f33783a, true, 23019, new Class[]{String.class, Integer.TYPE, String.class, c.class, String.class}, Object.class)) {
            Object[] objArr = {str4, Integer.valueOf(i), str5, cVar2, str6};
            return PatchProxy.accessDispatch(objArr, null, f33783a, true, 23019, new Class[]{String.class, Integer.TYPE, String.class, c.class, String.class}, Object.class);
        } else if (NetworkUtils.isNetworkAvailable(k.a())) {
            return a(NetworkUtils.postFile(i, str4, "file", str5), cVar2, str6, str4);
        } else {
            throw new IOException();
        }
    }

    public static <T> T a(int i, String str, Class<T> cls, String str2, f fVar, boolean z, String str3) throws Exception {
        int i2 = i;
        String str4 = str;
        Class<T> cls2 = cls;
        f fVar2 = fVar;
        String str5 = str3;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, cls2, null, fVar2, Byte.valueOf(z ? (byte) 1 : 0), str5}, null, f33783a, true, 23025, new Class[]{Integer.TYPE, String.class, Class.class, String.class, f.class, Boolean.TYPE, String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str4, cls2, null, fVar2, Byte.valueOf(z), str5}, null, f33783a, true, 23025, new Class[]{Integer.TYPE, String.class, Class.class, String.class, f.class, Boolean.TYPE, String.class}, Object.class);
        } else if (!z) {
            return a(i2, str4, cls2, (String) null, fVar2);
        } else {
            new StringBuilder("url = ").append(str4);
            int a2 = com.ss.android.ugc.aweme.store.d.a(str);
            if (!TextUtils.isEmpty(str3) && com.ss.android.ugc.aweme.store.d.a().e(a2) != null) {
                return null;
            }
            com.ss.android.ugc.aweme.store.d.a().b(a2);
            try {
                T a3 = com.ss.android.ugc.aweme.store.d.a().a(a2);
                StringBuilder sb = new StringBuilder("get result ==== ");
                sb.append(a2);
                sb.append(" ");
                if (a3 == null) {
                    z2 = true;
                }
                sb.append(z2);
                if (!(a3 instanceof FeedItemList) || j.a((Collection<T>) ((FeedItemList) a3).items)) {
                    T a4 = a(i2, str4, cls2, (String) null, fVar2);
                    if (TextUtils.equals("profile_preload", str5)) {
                        com.ss.android.ugc.aweme.store.d.a().a(a2, (Object) a4);
                        com.ss.android.ugc.aweme.store.d.a().c(a2);
                        return a4;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        com.ss.android.ugc.aweme.store.d.a().a(a2, (Object) a4);
                        com.ss.android.ugc.aweme.store.d.a().a(a2, str5);
                        StringBuilder sb2 = new StringBuilder("put result = ");
                        sb2.append(a2);
                        sb2.append(" ");
                        sb2.append(str4);
                    } else {
                        com.ss.android.ugc.aweme.store.d.a().d(a2);
                    }
                    com.ss.android.ugc.aweme.store.d.a().c(a2);
                    return a4;
                }
                if (!TextUtils.equals("profile_preload", str5)) {
                    com.ss.android.ugc.aweme.store.d.a().a(str5, a2);
                }
                return a3;
            } finally {
                com.ss.android.ugc.aweme.store.d.a().c(a2);
            }
        }
    }
}
