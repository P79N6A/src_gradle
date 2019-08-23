package com.ss.android.ugc.aweme.conan;

import android.app.Application;
import android.support.annotation.Keep;
import com.krypton.annotation.OutService;

@Keep
@OutService
public interface IConanService {
    void init(Application application, boolean z);

    void start();

    void stop();
}
