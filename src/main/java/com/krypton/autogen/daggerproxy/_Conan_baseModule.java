package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.conan.IConanService;
import com.ss.android.ugc.graph.e;
import dagger.Module;
import dagger.Provides;

@Module
public class _Conan_baseModule {
    @Provides
    public IConanService provideIConanService() {
        return ((Conan_baseService) e.a(Conan_baseService.class)).provideIConanService();
    }
}
