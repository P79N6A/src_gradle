package com.tt.miniapphost.process.extra;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface ICrossProcessOperator {

    @Retention(RetentionPolicy.SOURCE)
    public @interface OperateProcessIdentify {
    }

    @MiniAppProcess
    void callbackOnOriginProcess(String str);

    @AnyProcess
    boolean isSwitchProcessOperateAsync();

    @HostProcess
    void operateFinishOnGoalProcess(@Nullable String str, @NonNull AsyncIpcHandler asyncIpcHandler);

    @AnyProcess
    String operateProcessIdentify();
}
