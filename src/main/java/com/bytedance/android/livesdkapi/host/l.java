package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdkapi.host.a.a;
import com.bytedance.android.livesdkapi.host.a.b;

public interface l {
    void a(int i, long j);

    void a(@Nullable Activity activity, int i, long j, b bVar);

    void a(FragmentActivity fragmentActivity, a aVar, String str, String str2, int i, String str3, String str4, String str5);

    void a(@NonNull com.bytedance.android.livesdkapi.depend.i.a aVar);

    void a(@NonNull com.bytedance.android.livesdkapi.depend.i.b bVar);

    boolean a();

    i b();

    long c();
}
