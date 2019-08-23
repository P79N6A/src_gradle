package com.bytedance.android.live.core.paging.b;

import android.support.annotation.NonNull;
import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import io.reactivex.Observable;
import java.util.List;

public interface b<V> {
    @NonNull
    Observable<Pair<List<V>, Extra>> a(boolean z, Long l, int i);
}
