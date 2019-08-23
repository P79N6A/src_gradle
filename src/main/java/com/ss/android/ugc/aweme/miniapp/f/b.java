package com.ss.android.ugc.aweme.miniapp.f;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.lighten.core.g;
import com.facebook.common.a.a;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.animated.a.c;
import com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.ad;
import com.ss.android.ugc.aweme.net.ac;
import com.ss.android.ugc.aweme.net.k;
import com.ss.android.ugc.aweme.net.y;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/miniapp/impl/BaseLibDependImpl;", "Lcom/ss/android/ugc/aweme/miniapp_api/depend/IBaseLibDepend;", "()V", "enableStartUpApiWhiteList", "", "enable", "", "initFresco", "application", "Landroid/app/Application;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.ss.android.ugc.aweme.miniapp_api.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3583a;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f3583a, false, 59414, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f3583a, false, 59414, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ac.a();
    }

    public final void a(@NotNull Application application) {
        Application application2 = application;
        if (PatchProxy.isSupport(new Object[]{application2}, this, f3583a, false, 59413, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application2}, this, f3583a, false, 59413, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(application2, "application");
        g.a(application);
        if (!Fresco.hasBeenInitialized()) {
            FLog.setLoggingDelegate(k.b());
            AnimatedFactoryProvider.setDefaultPreDecodeCount(1);
            Object systemService = application2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (systemService != null) {
                Context context = application2;
                com.facebook.cache.disk.b a2 = com.facebook.cache.disk.b.a(context).a(com.ss.android.ugc.aweme.video.b.d()).a("fresco_cache").a((a) com.facebook.common.a.b.a()).a();
                y a3 = y.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "OkHttpManager.getSingleton()");
                ImagePipelineConfig build = com.facebook.imagepipeline.a.a.a.newBuilder(context, a3.b()).setBitmapMemoryCacheParamsSupplier(new com.ss.android.ugc.aweme.app.ac((ActivityManager) systemService)).setMemoryTrimmableRegistry(ad.a()).setMainDiskCacheConfig(a2).setBitmapsConfig(Bitmap.Config.RGB_565).setDownsampleEnabled(true).build();
                c.DEFAULTS = c.newBuilder().setMaximumBytes(0).setAllowPrefetching(true).setForceKeepAllFramesInMemory(false).build();
                Fresco.initialize(context, build);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }
}
