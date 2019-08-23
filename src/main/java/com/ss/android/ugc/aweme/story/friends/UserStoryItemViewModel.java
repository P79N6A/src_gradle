package com.ss.android.ugc.aweme.story.friends;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0002H\u0014J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryItemViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryItemState;", "()V", "userStoryRepo", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryRepository;", "getUserStoryRepo", "()Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryRepository;", "defaultState", "load", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryItemViewModel extends JediViewModel<UserStoryItemState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f73012d;

    public final /* synthetic */ x c() {
        UserStoryItemState userStoryItemState;
        if (PatchProxy.isSupport(new Object[0], this, f73012d, false, 84448, new Class[0], UserStoryItemState.class)) {
            userStoryItemState = (UserStoryItemState) PatchProxy.accessDispatch(new Object[0], this, f73012d, false, 84448, new Class[0], UserStoryItemState.class);
        } else {
            userStoryItemState = new UserStoryItemState(null, null, 3, null);
        }
        return userStoryItemState;
    }
}
