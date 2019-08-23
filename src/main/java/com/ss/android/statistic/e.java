package com.ss.android.statistic;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.app.ag;
import com.ss.android.ugc.aweme.app.ah;
import com.ss.android.ugc.aweme.g.a;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONObject;

public final class e {
    @Insert
    @TargetClass
    static void a(@NonNull d dVar, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable Long l2, JSONObject jSONObject, int i) {
        if (a.a()) {
            ag a2 = ag.a();
            ah ahVar = new ah(1, str, str2, str3, l, l2, jSONObject);
            a2.a(ahVar);
        }
        dVar.b(str, str2, str3, l, l2, jSONObject, i);
    }
}
