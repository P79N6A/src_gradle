package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.lighten.core.b.c;
import com.bytedance.lighten.core.h;
import com.bytedance.lighten.core.l;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.ad;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.net.af;
import com.ss.android.ugc.aweme.net.j;
import com.ss.android.ugc.aweme.net.w;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.io.File;
import org.jetbrains.annotations.NotNull;

public class FrescoTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    public void run(@NotNull Context context) {
        ImagePipelineConfig imagePipelineConfig;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55263, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55263, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("FrescoTask");
        b.a(context);
        try {
            k a2 = k.a();
            if (PatchProxy.isSupport(new Object[]{a2}, null, j.f56985a, true, 60709, new Class[]{Application.class}, ImagePipelineConfig.class)) {
                imagePipelineConfig = (ImagePipelineConfig) PatchProxy.accessDispatch(new Object[]{a2}, null, j.f56985a, true, 60709, new Class[]{Application.class}, ImagePipelineConfig.class);
            } else {
                if (PatchProxy.isSupport(new Object[]{a2, 0L}, null, j.f56985a, true, 60710, new Class[]{Application.class, Long.TYPE}, ImagePipelineConfig.class)) {
                    imagePipelineConfig = (ImagePipelineConfig) PatchProxy.accessDispatch(new Object[]{a2, 0L}, null, j.f56985a, true, 60710, new Class[]{Application.class, Long.TYPE}, ImagePipelineConfig.class);
                } else {
                    FLog.setLoggingDelegate(com.ss.android.ugc.aweme.net.k.b());
                    j.AnonymousClass1 r1 = new c(a2, 0) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f56987a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ Application f56988b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ long f56989c;

                        public final Application a() {
                            return this.f56988b;
                        }

                        public final long d() {
                            return this.f56989c;
                        }

                        public final File c() {
                            if (!PatchProxy.isSupport(new Object[0], this, f56987a, false, 60713, new Class[0], File.class)) {
                                return b.d();
                            }
                            return (File) PatchProxy.accessDispatch(new Object[0], this, f56987a, false, 60713, new Class[0], File.class);
                        }

                        public final h b() {
                            boolean z = false;
                            if (PatchProxy.isSupport(new Object[0], this, f56987a, false, 60712, new Class[0], h.class)) {
                                return (h) PatchProxy.accessDispatch(new Object[0], this, f56987a, false, 60712, new Class[0], h.class);
                            }
                            if (!j.f56986b) {
                                if (PatchProxy.isSupport(new Object[0], null, j.f56985a, true, 60711, new Class[0], Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, j.f56985a, true, 60711, new Class[0], Boolean.TYPE)).booleanValue();
                                } else if (!com.ss.android.ugc.aweme.net.a.f.b()) {
                                    z = true;
                                }
                                if (z) {
                                    return af.a.f56906a;
                                }
                            }
                            return w.a.f57039a;
                        }

                        {
                            this.f56988b = r1;
                            this.f56989c = r2;
                        }
                    };
                    l.f21797b = r1.a().getPackageName();
                    l.f21796a.a((c) r1);
                    imagePipelineConfig = com.bytedance.lighten.loader.f.a().f21816a;
                }
            }
            com.ss.android.ugc.aweme.crossplatform.platform.rn.c.f40836b = imagePipelineConfig;
            ad.a().registerMemoryTrimmable(new MemoryTrimmable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53125a;

                public final void trim(MemoryTrimType memoryTrimType) {
                    if (PatchProxy.isSupport(new Object[]{memoryTrimType}, this, f53125a, false, 55264, new Class[]{MemoryTrimType.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{memoryTrimType}, this, f53125a, false, 55264, new Class[]{MemoryTrimType.class}, Void.TYPE);
                        return;
                    }
                    try {
                        double suggestedTrimRatio = memoryTrimType.getSuggestedTrimRatio();
                        if (MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
                            ImagePipelineFactory.getInstance().getImagePipeline().clearMemoryCaches();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "[Lighten][Fresco][Initializer][Throwable]");
            throw e2;
        }
    }
}
