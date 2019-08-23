package com.ss.android.ugc.aweme.story.feed.jedi;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.l;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.a.b.m;
import com.ss.android.ugc.aweme.story.feed.c.g;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderState;", "()V", "defaultState", "getCurrentTimeZone", "", "getTimeZone", "loadMore", "", "preLoadMore", "refresh", "uid", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryMainHolderViewModel extends JediViewModel<StoryMainHolderState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f72602d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f72603e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderViewModel$Companion;", "", "()V", "ONE_DAY_LOAD_MORE_COUNT", "", "ONE_DAY_PRE_LOAD_MORE_COUNT", "ONE_DAY_REFRESH_COUNT", "ONE_USER_LOAD_MORE_COUNT", "ONE_USER_PRE_LOAD_MORE_COUNT", "QUERY_TYPE_ONE_DAY", "QUERY_TYPE_ONE_USER", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<StoryMainHolderState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryMainHolderViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryMainHolderViewModel storyMainHolderViewModel) {
            super(1);
            this.this$0 = storyMainHolderViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryMainHolderState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryMainHolderState storyMainHolderState) {
            StoryMainHolderState storyMainHolderState2 = storyMainHolderState;
            if (PatchProxy.isSupport(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83429, new Class[]{StoryMainHolderState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83429, new Class[]{StoryMainHolderState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolderState2, "state");
            if (!(storyMainHolderState.getLoadMore() instanceof l)) {
                this.this$0.a(m.a(com.ss.android.ugc.aweme.story.a.a.a(), g.f72503b.b(storyMainHolderState.getUserStory()), g.f72503b.a(storyMainHolderState.getUserStory(), 20), 1, 0, 0, 0, 56), AnonymousClass1.INSTANCE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<StoryMainHolderState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryMainHolderViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StoryMainHolderViewModel storyMainHolderViewModel) {
            super(1);
            this.this$0 = storyMainHolderViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryMainHolderState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryMainHolderState storyMainHolderState) {
            StoryMainHolderState storyMainHolderState2 = storyMainHolderState;
            if (PatchProxy.isSupport(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83431, new Class[]{StoryMainHolderState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83431, new Class[]{StoryMainHolderState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolderState2, "state");
            if (!(storyMainHolderState.getPreLoadMore() instanceof l)) {
                this.this$0.a(m.a(com.ss.android.ugc.aweme.story.a.a.a(), g.f72503b.b(storyMainHolderState.getUserStory()), g.f72503b.b(storyMainHolderState.getUserStory(), 20), 2, 0, 0, 0, 56), AnonymousClass1.INSTANCE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<StoryMainHolderState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $uid;
        final /* synthetic */ StoryMainHolderViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(StoryMainHolderViewModel storyMainHolderViewModel, String str) {
            super(1);
            this.this$0 = storyMainHolderViewModel;
            this.$uid = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryMainHolderState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryMainHolderState storyMainHolderState) {
            String id;
            StoryMainHolderState storyMainHolderState2 = storyMainHolderState;
            if (PatchProxy.isSupport(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83433, new Class[]{StoryMainHolderState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83433, new Class[]{StoryMainHolderState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolderState2, "state");
            if (!(storyMainHolderState.getRefresh() instanceof l)) {
                m a2 = com.ss.android.ugc.aweme.story.a.a.a();
                String str = this.$uid;
                StoryMainHolderViewModel storyMainHolderViewModel = this.this$0;
                if (PatchProxy.isSupport(new Object[0], storyMainHolderViewModel, StoryMainHolderViewModel.f72602d, false, 83427, new Class[0], String.class)) {
                    id = (String) PatchProxy.accessDispatch(new Object[0], storyMainHolderViewModel, StoryMainHolderViewModel.f72602d, false, 83427, new Class[0], String.class);
                } else {
                    if (PatchProxy.isSupport(new Object[0], storyMainHolderViewModel, StoryMainHolderViewModel.f72602d, false, 83428, new Class[0], String.class)) {
                        id = (String) PatchProxy.accessDispatch(new Object[0], storyMainHolderViewModel, StoryMainHolderViewModel.f72602d, false, 83428, new Class[0], String.class);
                    } else {
                        TimeZone timeZone = TimeZone.getDefault();
                        Intrinsics.checkExpressionValueIsNotNull(timeZone, "tz");
                        id = timeZone.getID();
                        Intrinsics.checkExpressionValueIsNotNull(id, "tz.id");
                    }
                }
                this.this$0.a(a2.a(str, 0, 0, 5, id, 0, -1), AnonymousClass1.INSTANCE);
            }
        }
    }

    public final /* synthetic */ x c() {
        StoryMainHolderState storyMainHolderState;
        if (PatchProxy.isSupport(new Object[0], this, f72602d, false, 83423, new Class[0], StoryMainHolderState.class)) {
            storyMainHolderState = (StoryMainHolderState) PatchProxy.accessDispatch(new Object[0], this, f72602d, false, 83423, new Class[0], StoryMainHolderState.class);
        } else {
            storyMainHolderState = new StoryMainHolderState(0, null, null, null, null, 31, null);
        }
        return storyMainHolderState;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f72602d, false, 83425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72602d, false, 83425, new Class[0], Void.TYPE);
            return;
        }
        b(new b(this));
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f72602d, false, 83426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72602d, false, 83426, new Class[0], Void.TYPE);
            return;
        }
        b(new c(this));
    }
}
