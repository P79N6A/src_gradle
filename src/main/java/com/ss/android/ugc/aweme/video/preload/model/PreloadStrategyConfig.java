package com.ss.android.ugc.aweme.video.preload.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;

@Keep
public class PreloadStrategyConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("network_lower")
    private long networkLower;
    @SerializedName("network_upper")
    private long networkUpper;
    @SerializedName("tasks")
    public List<PreloadTask> tasks;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final PreloadStrategyConfig f76263a;

        static {
            PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
            f76263a = preloadStrategyConfig;
            preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask());
        }
    }

    public static PreloadStrategyConfig getDefault() {
        return a.f76263a;
    }

    public long getNetworkLower() {
        return this.networkLower;
    }

    public long getNetworkUpper() {
        return this.networkUpper;
    }

    public void clearFlag() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89304, new Class[0], Void.TYPE);
            return;
        }
        if (this.tasks != null) {
            for (PreloadTask preloadTask : this.tasks) {
                preloadTask.alreadyPreload = false;
            }
        }
    }

    public List<PreloadTask> getTasks() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89302, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89302, new Class[0], List.class);
        }
        if (this.tasks == null) {
            this.tasks = Collections.emptyList();
        }
        return this.tasks;
    }

    public static PreloadStrategyConfig convertOldConfig(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 89303, new Class[]{Integer.TYPE, Integer.TYPE}, PreloadStrategyConfig.class)) {
            return (PreloadStrategyConfig) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 89303, new Class[]{Integer.TYPE, Integer.TYPE}, PreloadStrategyConfig.class);
        }
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask(i, i2));
        return preloadStrategyConfig;
    }
}
