package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.f.f;

public interface j extends o {
    void a(Aweme aweme);

    void a(f fVar);

    void a(Exception exc, Aweme aweme);

    Context getContext();

    boolean isViewValid();
}
