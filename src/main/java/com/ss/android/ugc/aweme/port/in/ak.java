package com.ss.android.ugc.aweme.port.in;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import java.util.LinkedHashMap;

public interface ak {
    q<? extends at> a(String str, LinkedHashMap<String, String> linkedHashMap);

    void a(Context context, Throwable th);

    void a(String str, @NonNull LifeStory lifeStory);
}
