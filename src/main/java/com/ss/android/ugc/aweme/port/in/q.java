package com.ss.android.ugc.aweme.port.in;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.shortvideo.g;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import java.util.List;

public interface q {

    public interface a {
        boolean a(Object... objArr);
    }

    public interface b {
        boolean a(Object... objArr);
    }

    public interface c {
        List<g> a();

        void b();
    }

    public interface d extends o {
        void a(AVSearchChallengeList aVSearchChallengeList);

        void a(Exception exc);

        void b();
    }

    a a(com.ss.android.ugc.aweme.common.f.c<com.ss.android.ugc.aweme.shortvideo.c> cVar);

    b a(d dVar);

    c a(Fragment fragment);

    com.ss.android.ugc.aweme.shortvideo.c a(int i, int i2, Intent intent, int i3);

    @Nullable
    com.ss.android.ugc.aweme.shortvideo.c a(@Nullable Intent intent);

    com.ss.android.ugc.aweme.shortvideo.c a(String str, int i, boolean z) throws Exception;

    void a(@Nullable String str, @Nullable String str2, int i, int i2, @NonNull com.ss.android.ugc.aweme.base.b.a.b<com.ss.android.ugc.aweme.shortvideo.c> bVar);
}
