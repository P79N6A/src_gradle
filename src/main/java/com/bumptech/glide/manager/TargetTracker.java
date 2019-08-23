package com.bumptech.glide.manager;

import android.support.annotation.NonNull;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class TargetTracker implements LifecycleListener {
    private final Set<Target<?>> targets = Collections.newSetFromMap(new WeakHashMap());

    public final void clear() {
        this.targets.clear();
    }

    @NonNull
    public final List<Target<?>> getAll() {
        return Util.getSnapshot(this.targets);
    }

    public final void onDestroy() {
        for (T onDestroy : Util.getSnapshot(this.targets)) {
            onDestroy.onDestroy();
        }
    }

    public final void onStart() {
        for (T onStart : Util.getSnapshot(this.targets)) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        for (T onStop : Util.getSnapshot(this.targets)) {
            onStop.onStop();
        }
    }

    public final void track(@NonNull Target<?> target) {
        this.targets.add(target);
    }

    public final void untrack(@NonNull Target<?> target) {
        this.targets.remove(target);
    }
}
