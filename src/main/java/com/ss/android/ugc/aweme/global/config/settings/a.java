package com.ss.android.ugc.aweme.global.config.settings;

import a.i;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.discover.model.SameCityModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.model.d;
import com.ss.android.ugc.aweme.services.IAVService;
import java.util.concurrent.Callable;

public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49528a;

    /* renamed from: b  reason: collision with root package name */
    protected Gson f49529b = new Gson();

    /* renamed from: c  reason: collision with root package name */
    private d f49530c;

    public abstract void b(com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar);

    @NonNull
    public final d a() {
        d dVar;
        if (PatchProxy.isSupport(new Object[0], this, f49528a, false, 47545, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f49528a, false, 47545, new Class[0], d.class);
        }
        if (this.f49530c != null) {
            dVar = this.f49530c;
        } else if (PatchProxy.isSupport(new Object[0], null, b.f50051a, true, 50035, new Class[0], d.class)) {
            dVar = (d) PatchProxy.accessDispatch(new Object[0], null, b.f50051a, true, 50035, new Class[0], d.class);
        } else {
            d a2 = d.a();
            a2.f52879b = SharePrefCache.inst().getOpenImLink();
            a2.f52880c = SharePrefCache.inst().getImUrlTemplate();
            a2.f52881d = SharePrefCache.inst().getMultiSelectLimit();
            return a2;
        }
        return dVar;
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar) {
        com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f49528a, false, 47543, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f49528a, false, 47543, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f49528a, false, 47544, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f49528a, false, 47544, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE);
        } else {
            i.a((Callable<TResult>) new b<TResult>(aVar2));
        }
        try {
            SameCityModel.sImageUrl = aVar.k();
        } catch (com.bytedance.ies.a unused) {
        }
        this.f49530c = b.a(SharePrefCache.inst().getSharePref().edit(), aVar2);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().updateServerSettings(aVar2);
        b(aVar);
    }
}
