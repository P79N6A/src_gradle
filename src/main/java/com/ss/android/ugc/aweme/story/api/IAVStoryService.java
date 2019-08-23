package com.ss.android.ugc.aweme.story.api;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.v4.app.FragmentActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\nH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H&J&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0003H&¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IAVStoryService;", "", "cancelPublish", "", "taskPath", "", "getPublishState", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/story/api/StoryPublishState;", "isStoryPublishing", "", "context", "Landroid/content/Context;", "isStoryRecording", "launchRecord", "intent", "Landroid/content/Intent;", "processPublish", "activity", "Landroid/support/v4/app/FragmentActivity;", "rePublishStory", "taskId", "callback", "Lcom/ss/android/ugc/aweme/story/api/Callback;", "reset", "startPublish", "bundle", "Landroid/os/Bundle;", "updatePublishStartTime", "startTime", "", "updateStoryActivityRemainTime", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface IAVStoryService {
    void cancelPublish(@NotNull String str);

    @NotNull
    MutableLiveData<j> getPublishState();

    boolean isStoryPublishing(@NotNull Context context);

    boolean isStoryRecording();

    void launchRecord(@NotNull Context context, @NotNull Intent intent);

    boolean processPublish(@NotNull FragmentActivity fragmentActivity, @NotNull Intent intent);

    void rePublishStory(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull a<Object> aVar);

    void reset();

    void startPublish(@NotNull FragmentActivity fragmentActivity, @NotNull Bundle bundle);

    void updatePublishStartTime(long j);

    void updateStoryActivityRemainTime();
}
