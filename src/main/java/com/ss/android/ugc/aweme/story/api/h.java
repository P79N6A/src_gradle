package com.ss.android.ugc.aweme.story.api;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.story.api.b.a;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.model.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IStoryRingService;", "", "createAvatarOpenStoryRequest", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest;", "context", "Landroid/content/Context;", "params", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "avatarView", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/story/api/userstory/IAvatarOpenStoryRequest$OnPreloadListener;", "createStoryCircleHelper", "Lcom/ss/android/ugc/aweme/story/api/userstory/IStoryCircleHelper;", "circleView", "loadingView", "Lcom/ss/android/ugc/aweme/base/ui/AnimationImageView;", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface h {
    @NotNull
    a a(@NotNull Context context, @NotNull f fVar, @NotNull View view, @NotNull a.c cVar);

    @NotNull
    b a(@NotNull View view, @NotNull View view2, @NotNull AnimationImageView animationImageView);
}
