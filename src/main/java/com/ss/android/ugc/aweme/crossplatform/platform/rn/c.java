package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import android.annotation.SuppressLint;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.service.IReactService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40835a;
    @SuppressLint({"StaticFieldLeak", "CI_StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    public static ImagePipelineConfig f40836b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f40837c;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f40835a, true, 34337, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f40835a, true, 34337, new Class[0], Void.TYPE);
            return;
        }
        IReactService c2 = c();
        if (c2 != null) {
            c2.invoke();
        }
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f40835a, true, 34338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f40835a, true, 34338, new Class[0], Void.TYPE);
            return;
        }
        IReactService c2 = c();
        if (c2 != null) {
            c2.rePrepareReactContext();
        }
    }

    private static IReactService c() {
        if (PatchProxy.isSupport(new Object[0], null, f40835a, true, 34336, new Class[0], IReactService.class)) {
            return (IReactService) PatchProxy.accessDispatch(new Object[0], null, f40835a, true, 34336, new Class[0], IReactService.class);
        }
        final ImagePipelineConfig imagePipelineConfig = f40836b;
        if (PatchProxy.isSupport(new Object[]{imagePipelineConfig}, null, f40835a, true, 34335, new Class[]{ImagePipelineConfig.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imagePipelineConfig}, null, f40835a, true, 34335, new Class[]{ImagePipelineConfig.class}, Void.TYPE);
        } else if (!f40837c) {
            synchronized (c.class) {
                if (!f40837c) {
                    ServiceManager.get().bind(IReactService.class, new ServiceProvider<IReactService>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f40838a;

                        public final /* synthetic */ Object get() {
                            if (PatchProxy.isSupport(new Object[0], this, f40838a, false, 34340, new Class[0], IReactService.class)) {
                                return (IReactService) PatchProxy.accessDispatch(new Object[0], this, f40838a, false, 34340, new Class[0], IReactService.class);
                            }
                            IReactService iReactService = (IReactService) ServiceManager.get().getService(IReactService.class, true);
                            if (iReactService != null) {
                                iReactService.init(k.a(), new a(imagePipelineConfig), new d());
                            }
                            return iReactService;
                        }
                    }).asSingleton();
                    f40837c = true;
                }
            }
        }
        return (IReactService) ServiceManager.get().getService(IReactService.class);
    }
}
