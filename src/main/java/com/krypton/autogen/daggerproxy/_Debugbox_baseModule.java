package com.krypton.autogen.daggerproxy;

import com.bytedance.debugbox.base.IDebugBoxService;
import com.ss.android.ugc.graph.e;
import dagger.Module;
import dagger.Provides;

@Module
public class _Debugbox_baseModule {
    @Provides
    public IDebugBoxService provideIDebugBoxService() {
        return ((Debugbox_baseService) e.a(Debugbox_baseService.class)).provideIDebugBoxService();
    }
}
