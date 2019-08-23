package com.tt.miniapphost.entity;

import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.util.List;

@AnyProcess
public class ChooseImageResultEntity {
    @Nullable
    private List<MediaEntity> mMediaListResult;
    private boolean shouldHandle;

    @AnyProcess
    public List<MediaEntity> getMediaListResult() {
        return this.mMediaListResult;
    }

    @AnyProcess
    public boolean isShouldHandle() {
        return this.shouldHandle;
    }

    @AnyProcess
    public void setMediaListResult(List<MediaEntity> list) {
        this.mMediaListResult = list;
    }

    @AnyProcess
    public void setShouldHandle(boolean z) {
        this.shouldHandle = z;
    }
}
