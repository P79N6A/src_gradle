package com.ss.android.ugc.aweme.setting.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.api.AbTestApi;
import com.ss.android.ugc.aweme.share.a;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class c implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63846a;

    /* renamed from: b  reason: collision with root package name */
    private final JsonElement f63847b;

    c(JsonElement jsonElement) {
        this.f63847b = jsonElement;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        ObservableEmitter observableEmitter2 = observableEmitter;
        if (PatchProxy.isSupport(new Object[]{observableEmitter2}, this, f63846a, false, 72139, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter2}, this, f63846a, false, 72139, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        JsonElement jsonElement = this.f63847b;
        try {
            AbTestApi.AbTestResponse abTestResponse = (AbTestApi.AbTestResponse) m.d().fromJson(jsonElement, AbTestApi.AbTestResponse.class);
            if (abTestResponse != null) {
                if (abTestResponse.data != null) {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().updateABTestModel(asJsonObject);
                    a.a(asJsonObject);
                    if (com.ss.android.g.a.a()) {
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).updateTTAbTest(abTestResponse.data);
                    }
                    AbTestManager.a().a(abTestResponse.data);
                    observableEmitter2.onNext(Boolean.TRUE);
                }
            }
        } catch (Exception unused) {
        }
    }
}
