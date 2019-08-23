package com.ss.android.download.api.config;

import android.app.Dialog;
import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import com.ss.android.download.api.c.c;

public interface h {
    Dialog a(@NonNull c cVar);

    Notification a(@NonNull NotificationCompat.Builder builder);

    void a(@Nullable Context context, String str, Drawable drawable, int i);
}
