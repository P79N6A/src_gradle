package com.bytedance.android.livesdk.schema.a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.b;
import com.bytedance.android.livesdk.schema.a.b;
import java.util.Map;

public interface a extends b {
    boolean a(long j);

    boolean a(long j, String str, Map<String, String> map);

    boolean a(Context context, Uri uri);

    boolean a(Context context, b.a aVar);

    boolean a(Context context, String str);

    boolean b(Context context, String str);
}
