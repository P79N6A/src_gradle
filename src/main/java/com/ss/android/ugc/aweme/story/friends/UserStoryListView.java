package com.ss.android.ugc.aweme.story.friends;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.h;
import com.ss.android.ugc.aweme.story.base.view.OnRecyclerViewFlingListener;
import com.ss.android.ugc.aweme.story.base.view.StoryCircleView;
import com.ss.android.ugc.aweme.story.detail.b.e;
import com.ss.android.ugc.aweme.story.detail.f;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.friends.a.g;
import com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder;
import com.ss.android.ugc.aweme.story.friends.adapter.UserStoryListWidgetAdapter;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u0004\u0018\u00010LJ\u0010\u0010M\u001a\u0002062\u0006\u0010N\u001a\u000206H\u0002J\b\u0010O\u001a\u00020CH\u0002J\b\u0010P\u001a\u00020CH\u0002J\u0012\u0010Q\u001a\u00020C2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010R\u001a\u00020C2\u0006\u0010S\u001a\u00020$J\u0006\u0010T\u001a\u00020CJ\u0006\u0010U\u001a\u00020CJ\b\u0010V\u001a\u00020CH\u0007J\b\u0010W\u001a\u00020CH\u0014J\u0010\u0010X\u001a\u00020C2\u0006\u0010Y\u001a\u000200H\u0016J\b\u0010Z\u001a\u00020CH\u0014J\u000e\u0010[\u001a\u00020C2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\\\u001a\u00020CJ\b\u0010]\u001a\u00020CH\u0002J\u000e\u0010^\u001a\u00020C2\u0006\u0010_\u001a\u00020`J\u0010\u0010a\u001a\u00020C2\u0006\u0010N\u001a\u000206H\u0002J\u0006\u0010b\u001a\u00020CJ\u000e\u0010c\u001a\u00020C2\u0006\u0010d\u001a\u00020\u0007J\u0006\u0010e\u001a\u00020CJ\u0006\u0010f\u001a\u00020CJ\u0006\u0010g\u001a\u00020CR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006h"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryListView;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/ugc/aweme/story/detail/StoryDetailHelper$Observer;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "mParams", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;Landroid/arch/lifecycle/LifecycleOwner;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "isAttached", "setAttached", "isUpdateData", "setUpdateData", "getLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "linearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroid/support/v7/widget/LinearLayoutManager;", "setLinearLayoutManager", "(Landroid/support/v7/widget/LinearLayoutManager;)V", "mAdapter", "Lcom/ss/android/ugc/aweme/story/friends/adapter/UserStoryListWidgetAdapter;", "getMAdapter", "()Lcom/ss/android/ugc/aweme/story/friends/adapter/UserStoryListWidgetAdapter;", "setMAdapter", "(Lcom/ss/android/ugc/aweme/story/friends/adapter/UserStoryListWidgetAdapter;)V", "mCurUid", "", "getMCurUid", "()Ljava/lang/String;", "setMCurUid", "(Ljava/lang/String;)V", "mModel", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeedModel;", "getMParams", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "setMParams", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "mUserStoryChangeEvent", "Lcom/ss/android/ugc/aweme/story/detail/event/UserStoryChangeEvent;", "getMUserStoryChangeEvent", "()Lcom/ss/android/ugc/aweme/story/detail/event/UserStoryChangeEvent;", "setMUserStoryChangeEvent", "(Lcom/ss/android/ugc/aweme/story/detail/event/UserStoryChangeEvent;)V", "openUserStoryTabType", "", "getOpenUserStoryTabType", "()I", "setOpenUserStoryTabType", "(I)V", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "toLoadMore", "Lkotlin/Function0;", "", "getToLoadMore", "()Lkotlin/jvm/functions/Function0;", "setToLoadMore", "(Lkotlin/jvm/functions/Function0;)V", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getAuthorView", "Landroid/view/View;", "getSafeRecyclerViewPos", "pos", "initEventBus", "initModel", "initView", "insertStory", "uid", "loadMore", "logStoryScrolled", "onActivityResume", "onAttachedToWindow", "onChange", "event", "onDetachedFromWindow", "onHasMore", "onStoryPublishAnimateEndEvent", "prepareTransitions", "scrollToLiveStory", "roomId", "", "scrollToPositionWithOffset", "scrollToStart", "setParams", "params", "showUploadError", "startAnimation", "stopAnimation", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListView extends LinearLayout implements LifecycleObserver, f.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4155a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f4156b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public UserStoryListWidgetAdapter f4157c;

    /* renamed from: d  reason: collision with root package name */
    boolean f4158d = true;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    Function0<Unit> f4159e = d.INSTANCE;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4160f;
    public boolean g;
    @NotNull
    h h;
    @Nullable
    private e i = new e();
    @NotNull
    private String j = "";
    private int k;
    @Nullable
    private LinearLayoutManager l;
    @NotNull
    private final LifecycleOwner m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserStoryListView f73014b;

        a(UserStoryListView userStoryListView) {
            this.f73014b = userStoryListView;
        }

        public final void onChanged(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f73013a, false, 84484, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj}, this, f73013a, false, 84484, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            UserStoryListView userStoryListView = this.f73014b;
            if (obj != null) {
                userStoryListView.setOpenUserStoryTabType(((com.ss.android.ugc.aweme.story.detail.b.b) obj).f72381a);
                int openUserStoryTabType = this.f73014b.getOpenUserStoryTabType();
                h mParams = this.f73014b.getMParams();
                if (mParams != null && openUserStoryTabType == mParams.f71856a) {
                    UserStoryListView userStoryListView2 = this.f73014b;
                    if (PatchProxy.isSupport(new Object[0], userStoryListView2, UserStoryListView.f4155a, false, 84468, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], userStoryListView2, UserStoryListView.f4155a, false, 84468, new Class[0], Void.TYPE);
                        return;
                    } else if (g.a() && (userStoryListView2.getContext() instanceof FragmentActivity)) {
                        Context context = userStoryListView2.getContext();
                        if (context != null) {
                            Window window = ((FragmentActivity) context).getWindow();
                            if (window != null) {
                                ScalingUtils.ScaleType scaleType = ScalingUtils.ScaleType.CENTER_CROP;
                                window.setSharedElementReturnTransition(com.facebook.drawee.view.b.a(scaleType, scaleType));
                            }
                            Context context2 = userStoryListView2.getContext();
                            if (context2 != null) {
                                ((FragmentActivity) context2).setExitSharedElementCallback(new UserStoryListView$prepareTransitions$1(userStoryListView2));
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.detail.event.OpenUserStoryEvent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/story/friends/UserStoryListView$initView$1", "Lcom/ss/android/ugc/aweme/story/base/view/OnPreloadListener;", "handleHasMore", "", "hasMore", "", "preload", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.aweme.story.base.view.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserStoryListView f73016b;

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f73015a, false, 84485, new Class[0], Boolean.TYPE)) {
                return this.f73016b.getHasMore();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73015a, false, 84485, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f73015a, false, 84487, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73015a, false, 84487, new Class[0], Void.TYPE);
                return;
            }
            UserStoryListView userStoryListView = this.f73016b;
            if (PatchProxy.isSupport(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84460, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84460, new Class[0], Void.TYPE);
                return;
            }
            userStoryListView.f4159e.invoke();
        }

        b(UserStoryListView userStoryListView) {
            this.f73016b = userStoryListView;
        }

        public final void a(boolean z) {
            String str;
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f73015a, false, 84486, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f73015a, false, 84486, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.metrics.f fVar = new com.ss.android.ugc.aweme.story.metrics.f();
            h mParams = this.f73016b.getMParams();
            if (mParams != null) {
                str = mParams.f71857b;
            } else {
                str = null;
            }
            fVar.a(str).post();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserStoryListView f73018b;

        c(UserStoryListView userStoryListView) {
            this.f73018b = userStoryListView;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73017a, false, 84489, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73017a, false, 84489, new Class[0], Void.TYPE);
                return;
            }
            RecyclerView recyclerView = this.f73018b.getRecyclerView();
            if (recyclerView != null) {
                RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(0);
                if (findViewHolderForLayoutPosition != null && (findViewHolderForLayoutPosition instanceof CurUserViewHolder)) {
                    CurUserViewHolder curUserViewHolder = (CurUserViewHolder) findViewHolderForLayoutPosition;
                    if (PatchProxy.isSupport(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84576, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], curUserViewHolder, CurUserViewHolder.f73065a, false, 84576, new Class[0], Void.TYPE);
                    } else {
                        StoryCircleView storyCircleView = curUserViewHolder.f73069e;
                        if (storyCircleView != null) {
                            storyCircleView.a();
                        }
                        StoryCircleView storyCircleView2 = curUserViewHolder.f73069e;
                        if (storyCircleView2 != null) {
                            storyCircleView2.a(Color.parseColor("#10dff9"), Color.parseColor("#0bb8f0"));
                        }
                        StoryCircleView storyCircleView3 = curUserViewHolder.f73069e;
                        if (storyCircleView3 != null) {
                            storyCircleView3.setStrokeWidth(UIUtils.dip2Px(curUserViewHolder.f73068d, 2.0f));
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public final boolean getHasMore() {
        return this.f4158d;
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.m;
    }

    @Nullable
    public final LinearLayoutManager getLinearLayoutManager() {
        return this.l;
    }

    @NotNull
    public final String getMCurUid() {
        return this.j;
    }

    @NotNull
    public final h getMParams() {
        return this.h;
    }

    @Nullable
    public final e getMUserStoryChangeEvent() {
        return this.i;
    }

    public final int getOpenUserStoryTabType() {
        return this.k;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.f4156b;
    }

    @NotNull
    public final Function0<Unit> getToLoadMore() {
        return this.f4159e;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84474, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f4156b;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84476, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            UserStoryListWidgetAdapter userStoryListWidgetAdapter = this.f4157c;
            if (userStoryListWidgetAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            userStoryListWidgetAdapter.e();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84477, new Class[0], Void.TYPE);
            return;
        }
        UserStoryListWidgetAdapter userStoryListWidgetAdapter = this.f4157c;
        if (userStoryListWidgetAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        userStoryListWidgetAdapter.f();
    }

    @Nullable
    public final View getAuthorView() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84471, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84471, new Class[0], View.class);
        }
        RecyclerView recyclerView = this.f4156b;
        if (recyclerView != null) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition != null) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
        return null;
    }

    @NotNull
    public final UserStoryListWidgetAdapter getMAdapter() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84455, new Class[0], UserStoryListWidgetAdapter.class)) {
            return (UserStoryListWidgetAdapter) PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84455, new Class[0], UserStoryListWidgetAdapter.class);
        }
        UserStoryListWidgetAdapter userStoryListWidgetAdapter = this.f4157c;
        if (userStoryListWidgetAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return userStoryListWidgetAdapter;
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84469, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84469, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        f.a().a((f.b) this);
        this.g = true;
        b();
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84470, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84470, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.g = false;
        f.a().b(this);
        c();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onActivityResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84462, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f4156b;
        if (recyclerView != null && recyclerView.getScrollState() == 0 && !recyclerView.isComputingLayout()) {
            UserStoryListWidgetAdapter userStoryListWidgetAdapter = this.f4157c;
            if (userStoryListWidgetAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (userStoryListWidgetAdapter != null) {
                userStoryListWidgetAdapter.notifyDataSetChanged();
            }
        }
    }

    public final void setAttached(boolean z) {
        this.g = z;
    }

    public final void setHasMore(boolean z) {
        this.f4158d = z;
    }

    public final void setLinearLayoutManager(@Nullable LinearLayoutManager linearLayoutManager) {
        this.l = linearLayoutManager;
    }

    public final void setMUserStoryChangeEvent(@Nullable e eVar) {
        this.i = eVar;
    }

    public final void setOpenUserStoryTabType(int i2) {
        this.k = i2;
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.f4156b = recyclerView;
    }

    public final void setUpdateData(boolean z) {
        this.f4160f = z;
    }

    public final void setMAdapter(@NotNull UserStoryListWidgetAdapter userStoryListWidgetAdapter) {
        UserStoryListWidgetAdapter userStoryListWidgetAdapter2 = userStoryListWidgetAdapter;
        if (PatchProxy.isSupport(new Object[]{userStoryListWidgetAdapter2}, this, f4155a, false, 84456, new Class[]{UserStoryListWidgetAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStoryListWidgetAdapter2}, this, f4155a, false, 84456, new Class[]{UserStoryListWidgetAdapter.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(userStoryListWidgetAdapter2, "<set-?>");
        this.f4157c = userStoryListWidgetAdapter2;
    }

    public final void setMCurUid(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f4155a, false, 84457, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f4155a, false, 84457, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.j = str2;
    }

    public final void setMParams(@NotNull h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f4155a, false, 84481, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f4155a, false, 84481, new Class[]{h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar2, "<set-?>");
        this.h = hVar2;
    }

    public final void setParams(@NotNull h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f4155a, false, 84467, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f4155a, false, 84467, new Class[]{h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar2, "params");
        this.h = hVar2;
    }

    public final void setToLoadMore(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f4155a, false, 84458, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f4155a, false, 84458, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "<set-?>");
        this.f4159e = function02;
    }

    private final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4155a, false, 84480, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4155a, false, 84480, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f4156b;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i2, 0);
            }
        }
    }

    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f4155a, false, 84473, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f4155a, false, 84473, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "ev");
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void a(long j2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f4155a, false, 84479, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f4155a, false, 84479, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (j2 >= 0) {
            UserStoryListWidgetAdapter userStoryListWidgetAdapter = this.f4157c;
            if (userStoryListWidgetAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            for (Object next : userStoryListWidgetAdapter.d()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                com.ss.android.ugc.aweme.story.api.model.c cVar = (com.ss.android.ugc.aweme.story.api.model.c) next;
                if (!(cVar instanceof com.ss.android.ugc.aweme.story.feed.model.c) || ((com.ss.android.ugc.aweme.story.feed.model.c) cVar).f72668a != j2) {
                    i2 = i3;
                } else if (i2 > 0) {
                    a(i2 - 1);
                    return;
                } else {
                    a(i2);
                    return;
                }
            }
        }
    }

    public final void a(@NotNull e eVar) {
        Integer num;
        int i2;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f4155a, false, 84463, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f4155a, false, 84463, new Class[]{e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar, "event");
        int i3 = eVar.f72382a;
        h hVar = this.h;
        Integer num2 = null;
        if (hVar != null) {
            num = Integer.valueOf(hVar.f71856a);
        } else {
            num = null;
        }
        if (i3 == num.intValue()) {
            this.i = eVar;
            String str = eVar.f72383b;
            if (str == null) {
                str = "";
            }
            this.j = str;
            g.a aVar = com.ss.android.ugc.aweme.story.feed.c.g.f72503b;
            UserStoryListWidgetAdapter userStoryListWidgetAdapter = this.f4157c;
            if (userStoryListWidgetAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            List d2 = userStoryListWidgetAdapter.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            int a2 = aVar.a(d2, this.j);
            if (a2 >= 0) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, this, f4155a, false, 84465, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, this, f4155a, false, 84465, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                } else {
                    UserStoryListWidgetAdapter userStoryListWidgetAdapter2 = this.f4157c;
                    if (userStoryListWidgetAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    }
                    if (userStoryListWidgetAdapter2 != null) {
                        num2 = Integer.valueOf(userStoryListWidgetAdapter2.getItemCount());
                    }
                    i2 = Math.min(num2.intValue(), Math.max(0, a2));
                }
                RecyclerView recyclerView = this.f4156b;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStoryListView(@Nullable Context context, @NotNull h hVar, @NotNull LifecycleOwner lifecycleOwner) {
        super(context);
        Integer num;
        Intrinsics.checkParameterIsNotNull(hVar, "mParams");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.h = hVar;
        this.m = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{context}, this, f4155a, false, 84459, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f4155a, false, 84459, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f4156b = (RecyclerView) LayoutInflater.from(context).inflate(C0906R.layout.r5, this, true).findViewById(C0906R.id.ccc);
            this.l = new LinearLayoutManager(context, 0, false);
            RecyclerView recyclerView = this.f4156b;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(this.l);
            }
            this.f4157c = new UserStoryListWidgetAdapter(this.h, this.m);
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    Field declaredField = Class.forName("android.support.v7.widget.RecyclerView$Adapter").getDeclaredField("mHasStableIds");
                    Intrinsics.checkExpressionValueIsNotNull(declaredField, "mHasStableIds");
                    declaredField.setAccessible(true);
                    UserStoryListWidgetAdapter userStoryListWidgetAdapter = this.f4157c;
                    if (userStoryListWidgetAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    }
                    declaredField.set(userStoryListWidgetAdapter, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
            UserStoryListWidgetAdapter userStoryListWidgetAdapter2 = this.f4157c;
            if (userStoryListWidgetAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (userStoryListWidgetAdapter2 != null) {
                h hVar2 = this.h;
                if (hVar2 != null) {
                    num = Integer.valueOf(hVar2.f71856a);
                } else {
                    num = null;
                }
                userStoryListWidgetAdapter2.f73090d = num.intValue();
            }
            RecyclerView recyclerView2 = this.f4156b;
            if (recyclerView2 != null) {
                UserStoryListWidgetAdapter userStoryListWidgetAdapter3 = this.f4157c;
                if (userStoryListWidgetAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                recyclerView2.setAdapter(userStoryListWidgetAdapter3);
            }
            UserStoryListWidgetAdapter userStoryListWidgetAdapter4 = this.f4157c;
            if (userStoryListWidgetAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (userStoryListWidgetAdapter4 != null) {
                List<? extends com.ss.android.ugc.aweme.story.api.model.c> mutableListOf = CollectionsKt.mutableListOf(com.ss.android.ugc.aweme.story.feed.c.g.f72503b.b());
                if (PatchProxy.isSupport(new Object[]{mutableListOf}, userStoryListWidgetAdapter4, UserStoryListWidgetAdapter.f73089b, false, 84592, new Class[]{List.class}, Void.TYPE)) {
                    UserStoryListWidgetAdapter userStoryListWidgetAdapter5 = userStoryListWidgetAdapter4;
                    PatchProxy.accessDispatch(new Object[]{mutableListOf}, userStoryListWidgetAdapter5, UserStoryListWidgetAdapter.f73089b, false, 84592, new Class[]{List.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(mutableListOf, "<set-?>");
                    userStoryListWidgetAdapter4.f73091e = mutableListOf;
                }
            }
            RecyclerView recyclerView3 = this.f4156b;
            if (recyclerView3 != null) {
                recyclerView3.setOnFlingListener(new OnRecyclerViewFlingListener(this.f4156b, new b(this)));
            }
            RecyclerView recyclerView4 = this.f4156b;
            if (recyclerView4 != null) {
                recyclerView4.addOnScrollListener(new UserStoryListView$initView$2(this));
            }
            if (PatchProxy.isSupport(new Object[0], this, f4155a, false, 84464, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4155a, false, 84464, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.arch.widgets.base.b<Object> a2 = com.ss.android.ugc.aweme.story.base.a.a.a().a("key_open_user_story");
                Context context2 = getContext();
                if (context2 != null) {
                    a2.observe((FragmentActivity) context2, new a(this));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        }
    }
}
