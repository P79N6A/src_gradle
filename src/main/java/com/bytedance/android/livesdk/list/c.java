package com.bytedance.android.livesdk.list;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.g;
import java.util.Collections;
import java.util.List;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f15775a;

    public final int a(Bundle bundle) {
        return 0;
    }

    public final void a(int i, FeedItem feedItem) {
    }

    public final void a(long j) {
    }

    public final int b() {
        return 1;
    }

    public final void b(int i) {
    }

    @NonNull
    public final List<Room> d() {
        return Collections.EMPTY_LIST;
    }

    public final Bundle a(int i) {
        return this.f15775a;
    }

    public c(Bundle bundle) {
        this.f15775a = bundle == null ? new Bundle() : bundle;
    }
}
