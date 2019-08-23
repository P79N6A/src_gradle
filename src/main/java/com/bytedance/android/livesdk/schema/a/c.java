package com.bytedance.android.livesdk.schema.a;

import android.content.Context;
import android.net.Uri;

public interface c {
    boolean canHandle(Uri uri);

    boolean handle(Context context, Uri uri);
}
