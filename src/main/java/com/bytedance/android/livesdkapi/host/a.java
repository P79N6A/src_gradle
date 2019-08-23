package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.live.base.b;
import java.util.Map;

public interface a extends b {
    void a(long j, Map<String, String> map);

    void a(Context context, Intent intent);

    void a(String str, Context context);

    void a(String str, Bundle bundle, Context context);

    void a(String str, String str2, Context context);

    boolean a(Context context, String str, Bundle bundle);
}
