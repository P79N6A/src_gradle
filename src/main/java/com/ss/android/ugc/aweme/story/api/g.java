package com.ss.android.ugc.aweme.story.api;

import android.content.Context;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IStoryDownloadService;", "", "downloadService", "", "context", "Landroid/content/Context;", "story", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "callback", "Lcom/ss/android/ugc/aweme/story/api/Callback;", "", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface g {
    void a(@Nullable Context context, @Nullable LifeStory lifeStory, @NotNull a<String> aVar);
}
