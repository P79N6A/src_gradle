package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.f.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.util.p;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.aweme.video.preload.g;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/ClearCacheManager;", "", "()V", "clear", "", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64420a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f64421b = new d();

    private d() {
    }

    public final void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f64420a, false, 72442, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f64420a, false, 72442, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        g.f().c();
        b.b(b.c());
        b.b(b.d());
        Intrinsics.checkExpressionValueIsNotNull(iAVService, "avService");
        b.b(iAVService.getLrcExternalCacheDir());
        b.b(iAVService.getExternalFaceCacheDir());
        File d2 = b.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "FileHelper.getExternalPictureCacheDir()");
        b.e(d2.getPath());
        IEffectService effectService = iAVService.effectService();
        Intrinsics.checkExpressionValueIsNotNull(effectService, "avService.effectService()");
        DouYinSettingNewVersionActivity.a(effectService.getCacheDir());
        p.a(true);
        b.b(a.a());
        com.ss.android.ugc.aweme.im.b.a().clearAudioDownloadCache();
    }
}
