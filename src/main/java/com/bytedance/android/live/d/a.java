package com.bytedance.android.live.d;

import android.support.annotation.NonNull;
import com.bytedance.android.live.base.b;
import com.bytedance.android.livesdk.j.c.f;
import io.reactivex.Observable;

public interface a extends b {
    b getCurrentPkState();

    f getLinkCrossRoomLog();

    @NonNull
    Observable<b> observePkState();
}
