package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

public interface b {
    void a(int i, String str);

    void a(long j, Map<String, String> map);

    void a(Context context, long j, Bundle bundle);

    void a(String str, Context context);

    void a(String str, Bundle bundle, Context context);

    void a(String str, String str2);

    void a(String str, String str2, Context context);

    boolean a(Context context, String str);

    void b(Context context, String str);
}
