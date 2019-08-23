package com.tt.miniapphost.entity;

import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.util.List;

@AnyProcess
public class ChooseVideoResultEntity {
    @Nullable
    private List<String> mMediaUrlListResult;
    private boolean shouldHandle;

    @Nullable
    @AnyProcess
    public List<String> getMediaUrlListResult() {
        return this.mMediaUrlListResult;
    }

    @AnyProcess
    public boolean isShouldHandle() {
        return this.shouldHandle;
    }

    @AnyProcess
    public void setMediaUrlListResult(@Nullable List<String> list) {
        this.mMediaUrlListResult = list;
    }

    @AnyProcess
    public void setShouldHandle(boolean z) {
        this.shouldHandle = z;
    }
}
