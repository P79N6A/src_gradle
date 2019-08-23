package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.graph.e;
import dagger.Module;
import dagger.Provides;

@Module
public class _ImserviceModule {
    @Provides
    public IIMService provideIIMService() {
        return ((ImserviceService) e.a(ImserviceService.class)).provideIIMService();
    }
}
