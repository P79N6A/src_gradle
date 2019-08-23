package com.storage.async;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class AsyncSchedulerInit {
    static volatile boolean lockdown;
    @Nullable
    static volatile SchedulerCreator onInitDBHandler;
    @Nullable
    static volatile SchedulerCreator onInitNetHandler;

    public static void lockdown() {
        lockdown = true;
    }

    @Nullable
    public static SchedulerCreator getDBSchedulerHandler() {
        return onInitDBHandler;
    }

    @Nullable
    public static SchedulerCreator getNetSchedulerHandler() {
        return onInitNetHandler;
    }

    public static boolean isLockdown() {
        return lockdown;
    }

    public static void setDBSchedulerHandler(@Nullable SchedulerCreator schedulerCreator) {
        if (!lockdown) {
            onInitDBHandler = schedulerCreator;
        }
    }

    public static void setNetSchedulerHandler(@Nullable SchedulerCreator schedulerCreator) {
        if (!lockdown) {
            onInitNetHandler = schedulerCreator;
        }
    }

    @NonNull
    public static SchedulerCreator onDBScheduler(@NonNull SchedulerCreator schedulerCreator) {
        lockdown();
        if (onInitDBHandler != null) {
            return onInitDBHandler;
        }
        return schedulerCreator;
    }

    public static SchedulerCreator onNetScheduler(@NonNull SchedulerCreator schedulerCreator) {
        lockdown();
        if (onInitNetHandler != null) {
            return onInitNetHandler;
        }
        return schedulerCreator;
    }
}
