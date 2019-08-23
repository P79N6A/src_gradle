package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.graph.e;
import dagger.Module;
import dagger.Provides;

@Module
public class _Miniapp_apiModule {
    @Provides
    public IMiniAppService provideIMiniAppService() {
        return ((Miniapp_apiService) e.a(Miniapp_apiService.class)).provideIMiniAppService();
    }
}
