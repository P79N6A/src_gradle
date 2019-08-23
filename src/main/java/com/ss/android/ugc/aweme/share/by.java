package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.model.e;
import com.ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

public final /* synthetic */ class by implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64863a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f64864b;

    by(Effect effect) {
        this.f64864b = effect;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f64863a, false, 73274, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f64863a, false, 73274, new Class[0], Object.class);
        }
        return (e) ((StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(StickerPropApi.class)).getStickerDetail(this.f64864b.effect_id).execute().body();
    }
}
