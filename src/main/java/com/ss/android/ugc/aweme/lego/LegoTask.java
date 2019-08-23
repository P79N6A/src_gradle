package com.ss.android.ugc.aweme.lego;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/LegoTask;", "", "run", "", "context", "Landroid/content/Context;", "type", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface LegoTask {
    void run(@NotNull Context context);

    @NotNull
    f type();
}