package com.ss.android.ugc.aweme.story.feed.jedi;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState;", "()V", "defaultState", "updateChangeMode", "", "mode", "", "updateLifeFeed", "feed", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "updateMotionEvent", "newEvent", "Lcom/ss/android/ugc/aweme/story/feed/jedi/ViewPagerSealedMotionEvent;", "updateNextPostion", "position", "", "updatePopWindowVisibility", "showing", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryFeedViewModel extends JediViewModel<StoryFeedState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f72580d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<StoryFeedState, StoryFeedState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $mode;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.$mode = str;
        }

        @NotNull
        public final StoryFeedState invoke(@NotNull StoryFeedState storyFeedState) {
            StoryFeedState storyFeedState2 = storyFeedState;
            if (PatchProxy.isSupport(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83343, new Class[]{StoryFeedState.class}, StoryFeedState.class)) {
                return (StoryFeedState) PatchProxy.accessDispatch(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83343, new Class[]{StoryFeedState.class}, StoryFeedState.class);
            }
            Intrinsics.checkParameterIsNotNull(storyFeedState2, "$receiver");
            return StoryFeedState.copy$default(storyFeedState, null, false, null, this.$mode, 0, 23, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<StoryFeedState, StoryFeedState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.story.feed.model.a $feed;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.story.feed.model.a aVar) {
            super(1);
            this.$feed = aVar;
        }

        @NotNull
        public final StoryFeedState invoke(@NotNull StoryFeedState storyFeedState) {
            StoryFeedState storyFeedState2 = storyFeedState;
            if (PatchProxy.isSupport(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83344, new Class[]{StoryFeedState.class}, StoryFeedState.class)) {
                return (StoryFeedState) PatchProxy.accessDispatch(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83344, new Class[]{StoryFeedState.class}, StoryFeedState.class);
            }
            Intrinsics.checkParameterIsNotNull(storyFeedState2, "$receiver");
            return StoryFeedState.copy$default(storyFeedState, this.$feed, false, null, null, 0, 30, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<StoryFeedState, StoryFeedState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ p $newEvent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(1);
            this.$newEvent = pVar;
        }

        @NotNull
        public final StoryFeedState invoke(@NotNull StoryFeedState storyFeedState) {
            StoryFeedState storyFeedState2 = storyFeedState;
            if (PatchProxy.isSupport(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83345, new Class[]{StoryFeedState.class}, StoryFeedState.class)) {
                return (StoryFeedState) PatchProxy.accessDispatch(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83345, new Class[]{StoryFeedState.class}, StoryFeedState.class);
            }
            Intrinsics.checkParameterIsNotNull(storyFeedState2, "$receiver");
            return StoryFeedState.copy$default(storyFeedState, null, false, this.$newEvent, null, 0, 27, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<StoryFeedState, StoryFeedState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $showing;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$showing = z;
        }

        @NotNull
        public final StoryFeedState invoke(@NotNull StoryFeedState storyFeedState) {
            StoryFeedState storyFeedState2 = storyFeedState;
            if (PatchProxy.isSupport(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83347, new Class[]{StoryFeedState.class}, StoryFeedState.class)) {
                return (StoryFeedState) PatchProxy.accessDispatch(new Object[]{storyFeedState2}, this, changeQuickRedirect, false, 83347, new Class[]{StoryFeedState.class}, StoryFeedState.class);
            }
            Intrinsics.checkParameterIsNotNull(storyFeedState2, "$receiver");
            return StoryFeedState.copy$default(storyFeedState, null, this.$showing, null, null, 0, 29, null);
        }
    }

    public final /* synthetic */ x c() {
        StoryFeedState storyFeedState;
        if (PatchProxy.isSupport(new Object[0], this, f72580d, false, 83337, new Class[0], StoryFeedState.class)) {
            storyFeedState = (StoryFeedState) PatchProxy.accessDispatch(new Object[0], this, f72580d, false, 83337, new Class[0], StoryFeedState.class);
        } else {
            storyFeedState = new StoryFeedState(null, false, null, null, 0, 31, null);
        }
        return storyFeedState;
    }

    public final void a(@NotNull p pVar) {
        p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{pVar2}, this, f72580d, false, 83339, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2}, this, f72580d, false, 83339, new Class[]{p.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(pVar2, "newEvent");
        c(new c(pVar2));
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f72580d, false, 83341, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f72580d, false, 83341, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "mode");
        c(new a(str2));
    }
}
