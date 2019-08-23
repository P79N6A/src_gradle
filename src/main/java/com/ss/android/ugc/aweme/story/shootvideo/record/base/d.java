package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import android.arch.lifecycle.LiveData;
import com.ss.android.ugc.aweme.story.shootvideo.record.b;
import com.ss.android.ugc.aweme.tools.am;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/MediaRecordPresenterProvider;", "deleteLastSegment", "", "endRecord", "forceClearRecord", "getRecordState", "Landroid/arch/lifecycle/LiveData;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordStateWrapper;", "markRecordIdle", "setMusic", "musicPath", "", "startRecord", "recordingSpeed", "Lcom/ss/android/ugc/aweme/tools/RecordingSpeed;", "stopRecord", "isForce", "", "updateRecordProgress", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface d extends b {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {
    }

    void a();

    void a(@NotNull am amVar);

    void a(@Nullable String str);

    void a(boolean z);

    void b();

    @NotNull
    LiveData<g> c();

    void d();

    void e();
}
