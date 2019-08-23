package com.ss.android.ugc.aweme.crossplatform.platform.rn.service;

import android.app.Application;
import android.support.annotation.Keep;
import com.ss.android.ugc.aweme.framework.b.a;
import com.ss.android.ugc.aweme.framework.d;

@Keep
public interface IReactService {
    void init(Application application, a aVar, d dVar);

    void invoke();

    void rePrepareReactContext();
}
