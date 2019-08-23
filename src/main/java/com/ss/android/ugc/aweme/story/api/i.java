package com.ss.android.ugc.aweme.story.api;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.story.api.b.c;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.api.model.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&J\b\u0010\u0016\u001a\u00020\u0017H&J0\u0010\u0018\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH&JD\u0010\u0018\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/IStoryService;", "", "buildStoryDetailIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "params", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "userStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "createProfileStoryWidget", "Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;", "createStoryHeadView", "Lcom/ss/android/ugc/aweme/story/api/userstory/IUserStoryListView;", "context", "Landroid/content/Context;", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "getUserStoryReadState", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lcom/ss/android/ugc/aweme/story/api/userstory/UserStoryReadState;", "onLogout", "", "startStoryDetailActivity", "requestCode", "", "avatar", "Landroid/view/View;", "bg", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public interface i {
    @NotNull
    Intent a(@Nullable Activity activity, @Nullable f fVar, @Nullable UserStory userStory);

    @NotNull
    Widget a();

    @NotNull
    c a(@NotNull Context context, @NotNull h hVar, @NotNull LifecycleOwner lifecycleOwner);

    void a(@Nullable Activity activity, @Nullable f fVar, @Nullable UserStory userStory, int i);

    void a(@Nullable Activity activity, @Nullable f fVar, @Nullable UserStory userStory, int i, @Nullable View view, @Nullable View view2);

    @NotNull
    b<d> b();

    void c();
}
