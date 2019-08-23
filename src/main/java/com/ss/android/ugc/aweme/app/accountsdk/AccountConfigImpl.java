package com.ss.android.ugc.aweme.app.accountsdk;

import android.content.Context;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.sdk.account.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.Map;

public final class AccountConfigImpl implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33679a;

    interface AccountGetApi {
        @GET
        Call<String> getResponse(@Url String str, @MaxLength int i);
    }

    interface AccountPostApi {
        @FormUrlEncoded
        @POST
        Call<String> getResponse(@Url String str, @FieldMap Map<String, String> map, @MaxLength int i);
    }

    public final String a() {
        return "aweme.snssdk.com";
    }

    public final Context b() {
        if (!PatchProxy.isSupport(new Object[0], this, f33679a, false, 22962, new Class[0], Context.class)) {
            return k.a();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f33679a, false, 22962, new Class[0], Context.class);
    }

    public final c c() {
        if (!PatchProxy.isSupport(new Object[0], this, f33679a, false, 22963, new Class[0], c.class)) {
            return new c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33680a;

                public final int a(Context context, Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{context, th2}, this, f33680a, false, 22967, new Class[]{Context.class, Throwable.class}, Integer.TYPE)) {
                        return ((Integer) PatchProxy.accessDispatch(new Object[]{context, th2}, this, f33680a, false, 22967, new Class[]{Context.class, Throwable.class}, Integer.TYPE)).intValue();
                    } else if (!(th2 instanceof com.bytedance.frameworks.baselib.network.http.a.b)) {
                        return 0;
                    } else {
                        if (((com.bytedance.frameworks.baselib.network.http.a.b) th2).getStatusCode() == 503) {
                            return -19;
                        }
                        return -16;
                    }
                }

                public final String a(int i, String str) throws Exception {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f33680a, false, 22965, new Class[]{Integer.TYPE, String.class}, String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f33680a, false, 22965, new Class[]{Integer.TYPE, String.class}, String.class);
                    }
                    try {
                        String str3 = (String) ((AccountGetApi) m.a("https://aweme.snssdk.com", null).create(AccountGetApi.class)).getResponse(str2, i).execute().body();
                        a.b(str3, str2);
                        return str3;
                    } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
                        return e2.getResponse();
                    }
                }

                public final String a(int i, String str, Map<String, String> map) throws Exception {
                    String str2 = str;
                    Map<String, String> map2 = map;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, map2}, this, f33680a, false, 22966, new Class[]{Integer.TYPE, String.class, Map.class}, String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, map2}, this, f33680a, false, 22966, new Class[]{Integer.TYPE, String.class, Map.class}, String.class);
                    }
                    try {
                        String str3 = (String) ((AccountPostApi) m.a("https://aweme.snssdk.com", null).create(AccountPostApi.class)).getResponse(str2, map2, i).execute().body();
                        a.b(str3, str2);
                        return str3;
                    } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
                        return e2.getResponse();
                    }
                }
            };
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f33679a, false, 22963, new Class[0], c.class);
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f33679a, false, 22964, new Class[0], Boolean.TYPE)) {
            return AbTestManager.a().al();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33679a, false, 22964, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
