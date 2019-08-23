package com.bumptech.glide.load.engine;

import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Jobs {
    private final Map<Key, EngineJob<?>> jobs = new HashMap();
    private final Map<Key, EngineJob<?>> onlyCacheJobs = new HashMap();

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final Map<Key, EngineJob<?>> getAll() {
        return Collections.unmodifiableMap(this.jobs);
    }

    Jobs() {
    }

    private Map<Key, EngineJob<?>> getJobMap(boolean z) {
        if (z) {
            return this.onlyCacheJobs;
        }
        return this.jobs;
    }

    /* access modifiers changed from: package-private */
    public final EngineJob<?> get(Key key, boolean z) {
        return getJobMap(z).get(key);
    }

    /* access modifiers changed from: package-private */
    public final void put(Key key, EngineJob<?> engineJob) {
        getJobMap(engineJob.onlyRetrieveFromCache()).put(key, engineJob);
    }

    /* access modifiers changed from: package-private */
    public final void removeIfCurrent(Key key, EngineJob<?> engineJob) {
        Map<Key, EngineJob<?>> jobMap = getJobMap(engineJob.onlyRetrieveFromCache());
        if (engineJob.equals(jobMap.get(key))) {
            jobMap.remove(key);
        }
    }
}