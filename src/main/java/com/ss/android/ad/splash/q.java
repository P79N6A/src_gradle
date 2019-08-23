package com.ss.android.ad.splash;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.ss.android.ad.splash.core.e.f;
import java.util.HashMap;
import org.json.JSONObject;

public interface q {
    @WorkerThread
    f a(@NonNull String str);

    @WorkerThread
    o a(@NonNull String str, int i, HashMap<String, String> hashMap, JSONObject jSONObject);

    @WorkerThread
    o a(@NonNull String str, @Nullable String str2);

    @WorkerThread
    boolean a(@NonNull String str, @NonNull String str2, @NonNull b bVar);

    @WorkerThread
    o b(@NonNull String str);
}
