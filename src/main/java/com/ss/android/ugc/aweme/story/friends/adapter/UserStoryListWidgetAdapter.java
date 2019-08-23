package com.ss.android.ugc.aweme.story.friends.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.h;
import com.ss.android.ugc.aweme.story.base.utils.StoryDiffer;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.DiffableStoryAdapter;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b;
import com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder;
import com.ss.android.ugc.aweme.story.friends.anim.AvatarBorderViewController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020!H\u0016J\u0018\u0010)\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010,\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\u0016J\u001e\u0010-\u001a\u00020*2\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030/H\u0014J\u0006\u00100\u001a\u00020*J\u0006\u00101\u001a\u00020*R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/adapter/UserStoryListWidgetAdapter;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/DiffableStoryAdapter;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "Lcom/ss/android/ugc/aweme/story/friends/adapter/StoryBaseViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "mStoryParams", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;Landroid/arch/lifecycle/LifecycleOwner;)V", "data", "", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "mLiveAvatarController", "Lcom/ss/android/ugc/aweme/story/friends/anim/AvatarBorderViewController;", "getMLiveAvatarController", "()Lcom/ss/android/ugc/aweme/story/friends/anim/AvatarBorderViewController;", "setMLiveAvatarController", "(Lcom/ss/android/ugc/aweme/story/friends/anim/AvatarBorderViewController;)V", "mLiveStoryCallback", "Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;", "getMLiveStoryCallback", "()Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;", "setMLiveStoryCallback", "(Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;)V", "getMStoryParams", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "setMStoryParams", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "mTabType", "", "getMTabType", "()I", "setMTabType", "(I)V", "getItemId", "", "position", "onViewAttachedToWindow", "", "holder", "onViewDetachedFromWindow", "registerFactories", "registry", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryViewHolderFactoryRegistry;", "startAnimation", "stopAnimation", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListWidgetAdapter extends DiffableStoryAdapter<com.ss.android.ugc.aweme.story.api.model.c, StoryBaseViewHolder<? extends com.bytedance.jedi.arch.d>> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f73089b;

    /* renamed from: d  reason: collision with root package name */
    public int f73090d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public List<? extends com.ss.android.ugc.aweme.story.api.model.c> f73091e = d();
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public AvatarBorderViewController f73092f;
    @NotNull
    public LiveStoryViewHolder.a g;
    @NotNull
    public h h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/story/friends/adapter/UserStoryListWidgetAdapter$mLiveStoryCallback$1", "Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder$ILiveStoryCallback;", "getLiveStorys", "", "Lcom/ss/android/ugc/aweme/story/feed/model/LiveStory;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements LiveStoryViewHolder.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserStoryListWidgetAdapter f73094b;

        @NotNull
        public final List<com.ss.android.ugc.aweme.story.feed.model.c> a() {
            if (PatchProxy.isSupport(new Object[0], this, f73093a, false, 84601, new Class[0], List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[0], this, f73093a, false, 84601, new Class[0], List.class);
            }
            Collection arrayList = new ArrayList();
            for (Object next : this.f73094b.d()) {
                if (((com.ss.android.ugc.aweme.story.api.model.c) next) instanceof com.ss.android.ugc.aweme.story.feed.model.c) {
                    arrayList.add(next);
                }
            }
            Iterable<com.ss.android.ugc.aweme.story.api.model.c> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (com.ss.android.ugc.aweme.story.api.model.c cVar : iterable) {
                if (cVar != null) {
                    arrayList2.add((com.ss.android.ugc.aweme.story.feed.model.c) cVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.feed.model.LiveStory");
                }
            }
            return (List) arrayList2;
        }

        a(UserStoryListWidgetAdapter userStoryListWidgetAdapter) {
            this.f73094b = userStoryListWidgetAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<Integer, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidgetAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserStoryListWidgetAdapter userStoryListWidgetAdapter) {
            super(1);
            this.this$0 = userStoryListWidgetAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke(((Number) obj).intValue()));
        }

        public final boolean invoke(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 84602, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 84602, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            com.ss.android.ugc.aweme.story.api.model.c cVar = (com.ss.android.ugc.aweme.story.api.model.c) this.this$0.b(i);
            if (cVar == null || cVar.getType() != 0 || !g.f72503b.a(((UserStory) cVar).getUser())) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/friends/adapter/CurUserViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<ViewGroup, CurUserViewHolder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidgetAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserStoryListWidgetAdapter userStoryListWidgetAdapter) {
            super(1);
            this.this$0 = userStoryListWidgetAdapter;
        }

        @NotNull
        public final CurUserViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 84603, new Class[]{ViewGroup.class}, CurUserViewHolder.class)) {
                return (CurUserViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 84603, new Class[]{ViewGroup.class}, CurUserViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ar0, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(it.c…ur_user_story, it, false)");
            return new CurUserViewHolder(inflate, this.this$0.h);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<Integer, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidgetAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UserStoryListWidgetAdapter userStoryListWidgetAdapter) {
            super(1);
            this.this$0 = userStoryListWidgetAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke(((Number) obj).intValue()));
        }

        public final boolean invoke(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 84604, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 84604, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            com.ss.android.ugc.aweme.story.api.model.c cVar = (com.ss.android.ugc.aweme.story.api.model.c) this.this$0.b(i);
            if (cVar == null || cVar.getType() != 1) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/friends/adapter/LiveStoryViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<ViewGroup, LiveStoryViewHolder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidgetAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(UserStoryListWidgetAdapter userStoryListWidgetAdapter) {
            super(1);
            this.this$0 = userStoryListWidgetAdapter;
        }

        @NotNull
        public final LiveStoryViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 84605, new Class[]{ViewGroup.class}, LiveStoryViewHolder.class)) {
                return (LiveStoryViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 84605, new Class[]{ViewGroup.class}, LiveStoryViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ar1, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(it.c…em_live_story, it, false)");
            return new LiveStoryViewHolder(inflate, this.this$0.h);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/friends/adapter/UserStoryViewHolder;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<ViewGroup, UserStoryViewHolder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidgetAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(UserStoryListWidgetAdapter userStoryListWidgetAdapter) {
            super(1);
            this.this$0 = userStoryListWidgetAdapter;
        }

        @NotNull
        public final UserStoryViewHolder invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 84606, new Class[]{ViewGroup.class}, UserStoryViewHolder.class)) {
                return (UserStoryViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 84606, new Class[]{ViewGroup.class}, UserStoryViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ar2, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(it.c…em_user_story, it, false)");
            return new UserStoryViewHolder(inflate, this.this$0.h);
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f73089b, false, 84598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73089b, false, 84598, new Class[0], Void.TYPE);
            return;
        }
        this.f73092f.a();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f73089b, false, 84599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73089b, false, 84599, new Class[0], Void.TYPE);
            return;
        }
        this.f73092f.b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onViewDetachedFromWindow(@NotNull StoryBaseViewHolder<? extends com.bytedance.jedi.arch.d> storyBaseViewHolder) {
        if (PatchProxy.isSupport(new Object[]{storyBaseViewHolder}, this, f73089b, false, 84597, new Class[]{StoryBaseViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storyBaseViewHolder}, this, f73089b, false, 84597, new Class[]{StoryBaseViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storyBaseViewHolder, "holder");
        super.onViewDetachedFromWindow(storyBaseViewHolder);
        if (storyBaseViewHolder instanceof LiveStoryViewHolder) {
            LiveStoryViewHolder liveStoryViewHolder = (LiveStoryViewHolder) storyBaseViewHolder;
            this.f73092f.b(liveStoryViewHolder);
            liveStoryViewHolder.i = null;
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b<StoryBaseViewHolder<? extends com.bytedance.jedi.arch.d>> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f73089b, false, 84595, new Class[]{com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f73089b, false, 84595, new Class[]{com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "registry");
        com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b unused = bVar.a(new b(this), new c(this)).a(new d(this), new e(this)).a(b.a.C0757a.INSTANCE, new f(this));
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Long] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c4, code lost:
        if (r4 == null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ec, code lost:
        if (r3 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fb, code lost:
        if (r0 == null) goto L_0x01fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.story.friends.adapter.StoryBaseViewHolder<? extends com.bytedance.jedi.arch.d> r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73089b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.story.friends.adapter.StoryBaseViewHolder> r1 = com.ss.android.ugc.aweme.story.friends.adapter.StoryBaseViewHolder.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84596(0x14a74, float:1.18544E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73089b
            r3 = 0
            r4 = 84596(0x14a74, float:1.18544E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.story.friends.adapter.StoryBaseViewHolder> r1 = com.ss.android.ugc.aweme.story.friends.adapter.StoryBaseViewHolder.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            r0 = r8
            com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeViewHolder r0 = (com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeViewHolder) r0
            super.onViewAttachedToWindow(r0)
            android.view.View r0 = r8.itemView
            r1 = 0
            if (r0 == 0) goto L_0x004d
            android.content.Context r0 = r0.getContext()
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r0 == 0) goto L_0x022f
            android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
            android.arch.lifecycle.Lifecycle r0 = r0.getLifecycle()
            java.lang.String r2 = "(context as FragmentActivity).lifecycle"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.arch.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            android.arch.lifecycle.Lifecycle$State r2 = android.arch.lifecycle.Lifecycle.State.RESUMED
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L_0x0210
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder
            if (r0 == 0) goto L_0x00dd
            r0 = r8
            com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder r0 = (com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder) r0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder.f73065a
            r14 = 0
            r15 = 84577(0x14a61, float:1.18518E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0099
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder.f73065a
            r14 = 0
            r15 = 84577(0x14a61, float:1.18518E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0210
        L_0x0099:
            boolean r2 = r0.h
            if (r2 == 0) goto L_0x0210
            com.ss.android.ugc.aweme.story.metrics.i r2 = new com.ss.android.ugc.aweme.story.metrics.i
            r2.<init>()
            com.ss.android.ugc.aweme.story.api.model.h r3 = r0.j
            if (r3 == 0) goto L_0x00a9
            java.lang.String r3 = r3.f71857b
            goto L_0x00aa
        L_0x00a9:
            r3 = r1
        L_0x00aa:
            com.ss.android.ugc.aweme.story.metrics.i r2 = r2.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.story.feed.c.g$a r3 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            com.ss.android.ugc.aweme.story.api.model.UserStory r4 = r0.g
            java.lang.String r3 = r3.b((com.ss.android.ugc.aweme.story.api.model.UserStory) r4)
            com.ss.android.ugc.aweme.story.metrics.i r2 = r2.b(r3)
            com.ss.android.ugc.aweme.story.api.model.UserStory r3 = r0.g
            if (r3 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.story.api.model.LogPbBean r1 = r3.getLogPb()
        L_0x00c2:
            com.ss.android.ugc.aweme.story.metrics.i r1 = r2.a((com.ss.android.ugc.aweme.story.api.model.LogPbBean) r1)
            boolean r2 = r0.g()
            com.ss.android.ugc.aweme.story.metrics.i r1 = r1.a((boolean) r2)
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = r0.g
            int r0 = com.ss.android.ugc.aweme.story.metrics.a.a.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r0)
            com.ss.android.ugc.aweme.story.metrics.i r0 = r1.a((int) r0)
            r0.post()
            goto L_0x0210
        L_0x00dd:
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.story.friends.adapter.UserStoryViewHolder
            if (r0 == 0) goto L_0x014d
            r0 = r8
            com.ss.android.ugc.aweme.story.friends.adapter.UserStoryViewHolder r0 = (com.ss.android.ugc.aweme.story.friends.adapter.UserStoryViewHolder) r0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.UserStoryViewHolder.f73095a
            r14 = 0
            r15 = 84616(0x14a88, float:1.18572E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x010d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.UserStoryViewHolder.f73095a
            r14 = 0
            r15 = 84616(0x14a88, float:1.18572E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0210
        L_0x010d:
            com.ss.android.ugc.aweme.story.metrics.i r2 = new com.ss.android.ugc.aweme.story.metrics.i
            r2.<init>()
            com.ss.android.ugc.aweme.story.api.model.h r3 = r0.h
            if (r3 == 0) goto L_0x0119
            java.lang.String r3 = r3.f71857b
            goto L_0x011a
        L_0x0119:
            r3 = r1
        L_0x011a:
            com.ss.android.ugc.aweme.story.metrics.i r2 = r2.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.story.feed.c.g$a r3 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
            com.ss.android.ugc.aweme.story.api.model.UserStory r4 = r0.g
            java.lang.String r3 = r3.b((com.ss.android.ugc.aweme.story.api.model.UserStory) r4)
            com.ss.android.ugc.aweme.story.metrics.i r2 = r2.b(r3)
            com.ss.android.ugc.aweme.story.api.model.UserStory r3 = r0.g
            if (r3 == 0) goto L_0x0132
            com.ss.android.ugc.aweme.story.api.model.LogPbBean r1 = r3.getLogPb()
        L_0x0132:
            com.ss.android.ugc.aweme.story.metrics.i r1 = r2.a((com.ss.android.ugc.aweme.story.api.model.LogPbBean) r1)
            boolean r2 = r0.f()
            com.ss.android.ugc.aweme.story.metrics.i r1 = r1.a((boolean) r2)
            com.ss.android.ugc.aweme.story.api.model.UserStory r0 = r0.g
            int r0 = com.ss.android.ugc.aweme.story.metrics.a.a.a((com.ss.android.ugc.aweme.story.api.model.UserStory) r0)
            com.ss.android.ugc.aweme.story.metrics.i r0 = r1.a((int) r0)
            r0.post()
            goto L_0x0210
        L_0x014d:
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder
            if (r0 == 0) goto L_0x0210
            r0 = r8
            com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder r0 = (com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder) r0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder.f73080a
            r14 = 0
            r15 = 84590(0x14a6e, float:1.18536E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x017d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder.f73080a
            r14 = 0
            r15 = 84590(0x14a6e, float:1.18536E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0210
        L_0x017d:
            com.ss.android.ugc.aweme.story.metrics.i r2 = new com.ss.android.ugc.aweme.story.metrics.i
            r2.<init>()
            com.ss.android.ugc.aweme.story.api.model.h r3 = r0.j
            if (r3 == 0) goto L_0x0189
            java.lang.String r3 = r3.f71857b
            goto L_0x018a
        L_0x0189:
            r3 = r1
        L_0x018a:
            com.ss.android.ugc.aweme.story.metrics.i r2 = r2.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.story.feed.model.c r3 = r0.h
            if (r3 == 0) goto L_0x019b
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f72669b
            if (r3 == 0) goto L_0x019b
            java.lang.String r3 = r3.getUid()
            goto L_0x019c
        L_0x019b:
            r3 = r1
        L_0x019c:
            com.ss.android.ugc.aweme.story.metrics.i r2 = r2.b(r3)
            r2.post()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "action_type"
            java.lang.String r4 = "click"
            r2.put(r3, r4)
            java.lang.String r3 = "scene_id"
            java.lang.String r4 = "1001"
            r2.put(r3, r4)
            java.lang.String r3 = "anchor_id"
            com.ss.android.ugc.aweme.story.feed.model.c r4 = r0.h
            if (r4 == 0) goto L_0x01c6
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.f72669b
            if (r4 == 0) goto L_0x01c6
            java.lang.String r4 = r4.getUid()
            if (r4 != 0) goto L_0x01c8
        L_0x01c6:
            java.lang.String r4 = ""
        L_0x01c8:
            r2.put(r3, r4)
            java.lang.String r3 = "room_id"
            com.ss.android.ugc.aweme.story.feed.model.c r4 = r0.h
            if (r4 == 0) goto L_0x01d7
            long r4 = r4.f72668a
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
        L_0x01d7:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.put(r3, r1)
            java.lang.String r1 = "request_id"
            com.ss.android.ugc.aweme.story.feed.model.c r3 = r0.h
            if (r3 == 0) goto L_0x01ee
            com.ss.android.ugc.aweme.story.api.model.LogPbBean r3 = r3.f72670c
            if (r3 == 0) goto L_0x01ee
            java.lang.String r3 = r3.getImprId()
            if (r3 != 0) goto L_0x01f0
        L_0x01ee:
            java.lang.String r3 = ""
        L_0x01f0:
            r2.put(r1, r3)
            java.lang.String r1 = "enter_from_merge"
            com.ss.android.ugc.aweme.story.api.model.h r0 = r0.j
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = r0.f71857b
            if (r0 != 0) goto L_0x01ff
        L_0x01fd:
            java.lang.String r0 = ""
        L_0x01ff:
            r2.put(r1, r0)
            java.lang.String r0 = "enter_method"
            java.lang.String r1 = "live_cover"
            r2.put(r0, r1)
            java.lang.String r0 = "livesdk_live_show"
            java.util.Map r2 = (java.util.Map) r2
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r2)
        L_0x0210:
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder
            if (r0 == 0) goto L_0x022e
            com.ss.android.ugc.aweme.story.api.model.h r0 = r7.h
            int r0 = r0.f71860e
            if (r0 != r9) goto L_0x0227
            com.ss.android.ugc.aweme.story.friends.anim.AvatarBorderViewController r0 = r7.f73092f
            r1 = r8
            com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder r1 = (com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder) r1
            r0.a(r1)
            com.ss.android.ugc.aweme.story.friends.anim.AvatarBorderViewController r0 = r7.f73092f
            r0.a()
        L_0x0227:
            r0 = r8
            com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder r0 = (com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder) r0
            com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder$a r1 = r7.g
            r0.i = r1
        L_0x022e:
            return
        L_0x022f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.adapter.UserStoryListWidgetAdapter.onViewAttachedToWindow(com.ss.android.ugc.aweme.story.friends.adapter.StoryBaseViewHolder):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStoryListWidgetAdapter(@NotNull h hVar, @NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner, new StoryDiffer(), null, 4);
        Intrinsics.checkParameterIsNotNull(hVar, "mStoryParams");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        this.h = hVar;
        this.f73092f = new AvatarBorderViewController(lifecycleOwner);
        this.g = new a(this);
    }
}
