package com.ss.android.ugc.aweme.setting.api;

import a.g;
import a.i;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class AbTestApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63831a;

    /* renamed from: b  reason: collision with root package name */
    public static ABTestApi f63832b = ((ABTestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ABTestApi.class));

    interface ABTestApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/abtest/param/")
        i<JsonObject> querySettings(@Query(a = "last_settings_version") String str);
    }

    @Keep
    public static class AbTestResponse {
        @SerializedName("data")
        public AbTestModel data;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.ss.android.ugc.aweme.setting.api.AbTestApi$AbTestResponse} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Boolean a(a.i r2) throws java.lang.Exception {
        /*
            boolean r0 = r2.c()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            if (r0 == 0) goto L_0x0009
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            return r2
        L_0x0009:
            boolean r0 = r2.d()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            if (r0 == 0) goto L_0x0012
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            return r2
        L_0x0012:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avSettingsService()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            java.lang.Object r1 = r2.e()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            r0.updateABTestModel(r1)     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            java.lang.Object r0 = r2.e()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.google.gson.JsonObject r0 = (com.google.gson.JsonObject) r0     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.ss.android.ugc.aweme.share.a.a(r0)     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            r0 = 0
            com.google.gson.Gson r1 = com.ss.android.ugc.aweme.app.api.m.d()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            if (r1 == 0) goto L_0x004e
            com.google.gson.Gson r0 = com.ss.android.ugc.aweme.app.api.m.d()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            java.lang.Object r2 = r2.e()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            java.lang.Class<com.ss.android.ugc.aweme.setting.api.AbTestApi$AbTestResponse> r1 = com.ss.android.ugc.aweme.setting.api.AbTestApi.AbTestResponse.class
            java.lang.Object r2 = r0.fromJson((com.google.gson.JsonElement) r2, (java.lang.Class<T>) r1)     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            r0 = r2
            com.ss.android.ugc.aweme.setting.api.AbTestApi$AbTestResponse r0 = (com.ss.android.ugc.aweme.setting.api.AbTestApi.AbTestResponse) r0     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
        L_0x004e:
            if (r0 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.setting.model.AbTestModel r2 = r0.data     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            if (r2 != 0) goto L_0x0055
            goto L_0x0076
        L_0x0055:
            boolean r2 = com.ss.android.g.a.a()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            if (r2 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r2 = r2.getService(r1)     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r2 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r2     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r0.data     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            r2.updateTTAbTest(r1)     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
        L_0x006c:
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.data     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            r2.a((com.ss.android.ugc.aweme.setting.model.AbTestModel) r0)     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            goto L_0x0079
        L_0x0076:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x007c, IncompatibleClassChangeError -> 0x0079 }
            return r2
        L_0x0079:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        L_0x007c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.api.AbTestApi.a(a.i):java.lang.Boolean");
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f63831a, true, 72134, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f63831a, true, 72134, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f63832b.querySettings(b.b().b((Context) k.a(), "last_ab_setting_version", "")).a(a.f63843b).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(z), i.f1052b);
    }

    public static void a(boolean z, JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), jsonElement2}, null, f63831a, true, 72135, new Class[]{Boolean.TYPE, JsonElement.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), jsonElement2}, null, f63831a, true, 72135, new Class[]{Boolean.TYPE, JsonElement.class}, Void.TYPE);
        } else if (jsonElement2 != null) {
            try {
                final boolean z2 = z;
                Observable.create(new c(jsonElement2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<Boolean>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63833a;

                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(Disposable disposable) {
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        Boolean bool = (Boolean) obj;
                        if (PatchProxy.isSupport(new Object[]{bool}, this, f63833a, false, 72140, new Class[]{Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool}, this, f63833a, false, 72140, new Class[]{Boolean.class}, Void.TYPE);
                            return;
                        }
                        AbTestManager.a().a(true, z2);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }
}
