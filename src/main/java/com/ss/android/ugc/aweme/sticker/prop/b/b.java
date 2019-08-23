package com.ss.android.ugc.aweme.sticker.prop.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.model.e;
import com.ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71683a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71684b;

    b(String str) {
        this.f71684b = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f71683a, false, 82076, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f71683a, false, 82076, new Class[0], Object.class);
        }
        return (e) ((StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(StickerPropApi.class)).getStickerDetail(this.f71684b).execute().body();
    }
}
