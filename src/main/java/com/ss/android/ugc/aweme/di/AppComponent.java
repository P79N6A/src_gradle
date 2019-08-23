package com.ss.android.ugc.aweme.di;

import android.app.Application;
import com.ss.android.ugc.aweme.app.host.HostApplication;
import com.ss.android.ugc.bridge.BridgeServices;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component
public interface AppComponent extends BridgeServices {

    @Component.Builder
    public interface a {
        @BindsInstance
        a a(Application application);

        a a(an anVar);

        AppComponent a();
    }

    void inject(HostApplication hostApplication);
}
