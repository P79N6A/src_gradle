package com.ss.android.ugc.aweme.story.feed.jedi;

import android.view.ViewGroup;
import com.bytedance.jedi.arch.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryAdapter;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolder;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainRawPagerAdapter2;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryAdapter;", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "mFragment", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment;", "mViewPager", "Lcom/ss/android/ugc/aweme/story/viewpager2/widget/ViewPager2;", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment;Lcom/ss/android/ugc/aweme/story/viewpager2/widget/ViewPager2;)V", "createViewHolder", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "parent", "Landroid/view/ViewGroup;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryMainRawPagerAdapter2 extends StoryAdapter<UserStory> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72604a;

    /* renamed from: d  reason: collision with root package name */
    private final StoryFeedJediFragment f72605d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewPager2 f72606e;

    @NotNull
    public final StoryViewHolder<d, UserStory> a(@NotNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f72604a, false, 83435, new Class[]{ViewGroup.class}, StoryViewHolder.class)) {
            return (StoryViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f72604a, false, 83435, new Class[]{ViewGroup.class}, StoryViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new StoryMainHolder2<>(viewGroup, this.f72605d, this.f72606e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryMainRawPagerAdapter2(@NotNull StoryFeedJediFragment storyFeedJediFragment, @NotNull ViewPager2 viewPager2) {
        super(storyFeedJediFragment, new UserStoryDiffer(), null, 4);
        Intrinsics.checkParameterIsNotNull(storyFeedJediFragment, "mFragment");
        Intrinsics.checkParameterIsNotNull(viewPager2, "mViewPager");
        this.f72605d = storyFeedJediFragment;
        this.f72606e = viewPager2;
    }
}
