package com.ss.android.ugc.aweme.tools.music.f;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"GSON", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getGSON", "()Lcom/google/gson/Gson;", "tools.music_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Gson f74893a = ((IAVService) ServiceManager.get().getService(IAVService.class)).provideAvGson();

    public static final Gson a() {
        return f74893a;
    }
}
