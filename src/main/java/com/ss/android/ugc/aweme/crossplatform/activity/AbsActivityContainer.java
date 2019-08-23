package com.ss.android.ugc.aweme.crossplatform.activity;

import android.arch.lifecycle.LifecycleObserver;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.base.activity.b;
import com.ss.android.ugc.aweme.crossplatform.view.g;

public abstract class AbsActivityContainer implements LifecycleObserver, b, f {
    @Nullable
    public abstract <T extends g> T a(Class<T> cls);

    public abstract void a(Configuration configuration);

    public abstract void a(e eVar);

    public abstract boolean h();

    public abstract void i();

    public abstract void j();

    public abstract void k();
}
