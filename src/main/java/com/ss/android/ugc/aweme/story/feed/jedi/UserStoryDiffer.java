package com.ss.android.ugc.aweme.story.feed.jedi;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/UserStoryDiffer;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryDiffer extends DiffUtil.ItemCallback<UserStory> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72607a;

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        UserStory userStory = (UserStory) obj;
        UserStory userStory2 = (UserStory) obj2;
        if (PatchProxy.isSupport(new Object[]{userStory, userStory2}, this, f72607a, false, 83437, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory, userStory2}, this, f72607a, false, 83437, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(userStory, "oldItem");
        Intrinsics.checkParameterIsNotNull(userStory2, "newItem");
        return g.f72503b.a(userStory, userStory2);
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        UserStory userStory = (UserStory) obj;
        UserStory userStory2 = (UserStory) obj2;
        if (PatchProxy.isSupport(new Object[]{userStory, userStory2}, this, f72607a, false, 83436, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory, userStory2}, this, f72607a, false, 83436, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(userStory, "oldItem");
        Intrinsics.checkParameterIsNotNull(userStory2, "newItem");
        return g.f72503b.a(userStory, userStory2);
    }
}
