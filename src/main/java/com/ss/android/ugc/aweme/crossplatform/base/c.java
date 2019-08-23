package com.ss.android.ugc.aweme.crossplatform.base;

import android.content.Context;
import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;

public interface c {
    boolean a();

    void b();

    @NonNull
    Context getContext();

    j getCrossPlatformBusiness();

    a getCrossPlatformParams();
}
