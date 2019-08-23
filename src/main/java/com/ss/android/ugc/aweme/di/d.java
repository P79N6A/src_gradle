package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.shootvideo.services.AVStoryServiceImpl;
import dagger.internal.c;
import dagger.internal.e;

public final class d implements c<IAVStoryService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41436a;

    /* renamed from: b  reason: collision with root package name */
    static final d f41437b = new d();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41436a, false, 35214, new Class[0], IAVStoryService.class)) {
            return (IAVStoryService) PatchProxy.accessDispatch(new Object[0], this, f41436a, false, 35214, new Class[0], IAVStoryService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41436a, true, 35215, new Class[0], IAVStoryService.class)) {
            return (IAVStoryService) PatchProxy.accessDispatch(new Object[0], null, f41436a, true, 35215, new Class[0], IAVStoryService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41436a, true, 35216, new Class[0], IAVStoryService.class)) {
                return (IAVStoryService) PatchProxy.accessDispatch(new Object[0], null, f41436a, true, 35216, new Class[0], IAVStoryService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35180, new Class[0], IAVStoryService.class)) {
                obj = (IAVStoryService) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35180, new Class[0], IAVStoryService.class);
            } else {
                obj = new AVStoryServiceImpl();
            }
            return (IAVStoryService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
