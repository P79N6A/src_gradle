package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import a.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveSkyLightAdapter;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveSkyLightViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0014\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0014\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mAdapter", "Lcom/ss/android/ugc/aweme/feed/adapter/FollowLiveSkyLightAdapter;", "mHasLayout", "", "mLinearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "doShowUpAnimationInner", "", "initView", "setData", "roomList", "", "Lcom/ss/android/ugc/aweme/live/feedpage/RoomItem;", "setEnterLiveCallBack", "callback", "Lkotlin/Function0;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowLiveSkyLightListView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46198a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f46199e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f46200b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f46201c;

    /* renamed from: d  reason: collision with root package name */
    FollowLiveSkyLightAdapter f46202d;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayoutManager f46203f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightListView$Companion;", "", "()V", "ANIMATION_GAP", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<Void, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView.ViewHolder f46205b;

        b(RecyclerView.ViewHolder viewHolder) {
            this.f46205b = viewHolder;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f46204a, false, 42833, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f46204a, false, 42833, new Class[]{i.class}, Void.TYPE);
            } else {
                FollowLiveSkyLightViewHolder followLiveSkyLightViewHolder = (FollowLiveSkyLightViewHolder) this.f46205b;
                if (PatchProxy.isSupport(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40531, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], followLiveSkyLightViewHolder, FollowLiveSkyLightViewHolder.f44730a, false, 40531, new Class[0], Void.TYPE);
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(followLiveSkyLightViewHolder.itemView, "alpha", new float[]{0.0f, 1.0f});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(followLiveSkyLightViewHolder.itemView, "translationY", new float[]{-((float) u.a(5.0d)), 0.0f});
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.setDuration(300);
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet.start();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowLiveSkyLightListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FollowLiveSkyLightListView followLiveSkyLightListView) {
            super(0);
            this.this$0 = followLiveSkyLightListView;
        }

        public final void invoke() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 42834, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 42834, new Class[0], Void.TYPE);
                return;
            }
            if (ag.h.b()) {
                FollowLiveSkyLightListView followLiveSkyLightListView = this.this$0;
                if (PatchProxy.isSupport(new Object[0], followLiveSkyLightListView, FollowLiveSkyLightListView.f46198a, false, 42830, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], followLiveSkyLightListView, FollowLiveSkyLightListView.f46198a, false, 42830, new Class[0], Void.TYPE);
                } else {
                    RecyclerView recyclerView = followLiveSkyLightListView.f46201c;
                    if (recyclerView != null) {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            i = layoutManager.getItemCount();
                        } else {
                            i = 0;
                        }
                        if (i > 0) {
                            long j = 0;
                            for (int i2 = 0; i2 < i; i2++) {
                                View childAt = recyclerView.getChildAt(i2);
                                if (childAt != null) {
                                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                                    if (childViewHolder != null && (childViewHolder instanceof FollowLiveSkyLightViewHolder)) {
                                        i.a(j).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(childViewHolder), i.f1052b);
                                        j += 50;
                                    }
                                }
                            }
                            FollowLiveSkyLightAdapter followLiveSkyLightAdapter = followLiveSkyLightListView.f46202d;
                            if (followLiveSkyLightAdapter == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            }
                            followLiveSkyLightAdapter.f44729c = false;
                        }
                    }
                }
            }
            this.this$0.f46200b = true;
        }
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46198a, false, 42827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46198a, false, 42827, new Class[0], Void.TYPE);
            return;
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f46201c = (RecyclerView) LayoutInflater.from(getContext()).inflate(C0906R.layout.a4_, this, true).findViewById(C0906R.id.ccc);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f46203f = new CallBackLinearLayoutManager(context, 0, false, new c(this));
        RecyclerView recyclerView = this.f46201c;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.f46203f);
        }
        this.f46202d = new FollowLiveSkyLightAdapter();
        RecyclerView recyclerView2 = this.f46201c;
        if (recyclerView2 != null) {
            FollowLiveSkyLightAdapter followLiveSkyLightAdapter = this.f46202d;
            if (followLiveSkyLightAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            recyclerView2.setAdapter(followLiveSkyLightAdapter);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowLiveSkyLightListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a();
    }

    public final void setData(@NotNull List<com.ss.android.ugc.aweme.live.feedpage.g> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f46198a, false, 42828, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f46198a, false, 42828, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "roomList");
        FollowLiveSkyLightAdapter followLiveSkyLightAdapter = this.f46202d;
        if (followLiveSkyLightAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        followLiveSkyLightAdapter.f44729c = ag.h.b();
        FollowLiveSkyLightAdapter followLiveSkyLightAdapter2 = this.f46202d;
        if (followLiveSkyLightAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        followLiveSkyLightAdapter2.setData(list);
        followLiveSkyLightAdapter2.notifyDataSetChanged();
        RecyclerView recyclerView = this.f46201c;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    public final void setEnterLiveCallBack(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f46198a, false, 42829, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f46198a, false, 42829, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        FollowLiveSkyLightAdapter followLiveSkyLightAdapter = this.f46202d;
        if (followLiveSkyLightAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (PatchProxy.isSupport(new Object[]{function02}, followLiveSkyLightAdapter, FollowLiveSkyLightAdapter.f44727a, false, 40520, new Class[]{Function0.class}, Void.TYPE)) {
            FollowLiveSkyLightAdapter followLiveSkyLightAdapter2 = followLiveSkyLightAdapter;
            PatchProxy.accessDispatch(new Object[]{function02}, followLiveSkyLightAdapter2, FollowLiveSkyLightAdapter.f44727a, false, 40520, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "<set-?>");
        followLiveSkyLightAdapter.f44728b = function02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowLiveSkyLightListView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FollowLiveSkyLightListView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FollowLiveSkyLightListView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
        a();
    }
}
