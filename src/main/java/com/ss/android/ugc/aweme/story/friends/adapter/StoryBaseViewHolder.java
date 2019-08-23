package com.ss.android.ugc.aweme.story.friends.adapter;

import android.view.View;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.aweme.story.api.model.c;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/adapter/StoryBaseViewHolder;", "T", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class StoryBaseViewHolder<T extends d> extends StoryViewHolder<T, c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryBaseViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }
}
