package com.ss.android.ugc.aweme.effectplatform;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.ugc.effectmanager.effect.b.h;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.b.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public interface g {
    void a(Effect effect, i iVar);

    void a(@NonNull String str, @NonNull com.ss.android.ugc.effectmanager.effect.b.g gVar);

    void a(@NonNull String str, @Nullable String str2, i iVar);

    void a(String str, List<String> list, Boolean bool, n nVar);

    void a(@NonNull String str, boolean z, @NonNull com.ss.android.ugc.effectmanager.effect.b.g gVar);

    void a(List<String> list, @Nullable String str, boolean z, h hVar);

    boolean a(@Nullable Effect effect);

    void destroy();

    com.ss.android.ugc.effectmanager.h f();
}
