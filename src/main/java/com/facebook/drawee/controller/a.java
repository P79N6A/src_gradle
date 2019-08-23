package com.facebook.drawee.controller;

import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class a {
    @Insert
    @TargetClass
    static AbstractDraweeController a(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        AbTestManager a2 = AbTestManager.a();
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71912, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71912, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 != null) {
                z = d2.isMonitorFrescoImageLoading;
            }
        }
        if (!z) {
            return abstractDraweeControllerBuilder.build$___twin___();
        }
        try {
            AbstractDraweeControllerBuilder abstractDraweeControllerBuilder2 = abstractDraweeControllerBuilder;
            ControllerListener<? super INFO> controllerListener = abstractDraweeControllerBuilder2.getControllerListener();
            if (controllerListener == null || !(controllerListener instanceof b)) {
                abstractDraweeControllerBuilder2.setControllerListener(new b(controllerListener, abstractDraweeControllerBuilder2.getImageRequest() != null ? abstractDraweeControllerBuilder2.getImageRequest() : abstractDraweeControllerBuilder2.getFirstAvailableImageRequests() != null ? abstractDraweeControllerBuilder2.getFirstAvailableImageRequests() : abstractDraweeControllerBuilder2.getLowResImageRequest()));
            }
        } catch (Exception unused) {
        }
        return abstractDraweeControllerBuilder.build$___twin___();
    }
}
