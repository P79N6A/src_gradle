package com.ss.android.ugc.aweme.shortvideo.music.collect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.k;
import com.ss.android.ugc.aweme.ao.a.l;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.music.MusicItemViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001a\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020\u0014H\u0002J\b\u0010;\u001a\u000207H\u0002J\u0006\u0010<\u001a\u000207J\u0006\u0010=\u001a\u000207J\u0010\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002J\u0006\u0010@\u001a\u000207J\b\u0010A\u001a\u00020\u0014H\u0016J\u0006\u0010B\u001a\u00020\u0014J\b\u0010C\u001a\u0004\u0018\u00010\u0002J\u0012\u0010D\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0010\u0010G\u001a\u0004\u0018\u00010\u00022\u0006\u0010H\u001a\u00020\u0014J\u0006\u0010I\u001a\u00020\u0014J\b\u0010J\u001a\u0004\u0018\u00010\u0002J\u0010\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020\u001dH\u0016J\u0018\u0010M\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010H\u001a\u00020\u0014H\u0016J\u0012\u0010N\u001a\u0002072\b\u0010O\u001a\u0004\u0018\u000109H\u0016J\u0018\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0014H\u0016J\u0012\u0010T\u001a\u0002092\b\u0010U\u001a\u0004\u0018\u00010RH\u0016J\u0018\u0010V\u001a\u0002072\u0006\u0010E\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0014H\u0016J\u0010\u0010W\u001a\u0002072\u0006\u0010O\u001a\u000209H\u0016J\u000e\u0010X\u001a\u0002072\u0006\u0010Y\u001a\u00020\u0014J\u000e\u0010Z\u001a\u0002072\u0006\u0010Y\u001a\u00020\u0014J\u0016\u0010Z\u001a\u0002072\u0006\u0010Y\u001a\u00020\u00142\u0006\u0010[\u001a\u00020\u0007J\u0018\u0010\\\u001a\u0002072\u0006\u0010H\u001a\u00020\u00142\b\b\u0002\u0010]\u001a\u00020\u0007J\u0010\u0010^\u001a\u0002072\u0006\u0010_\u001a\u00020\u0007H\u0016J\u0006\u0010`\u001a\u000207J\u0006\u0010a\u001a\u000207J\u0006\u0010b\u001a\u000207J\u0006\u0010c\u001a\u000207J\u0010\u0010d\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0005R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R&\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000700X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicItemAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "onItemClickListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;)V", "enableAnim", "", "hasHeaderView", "getHasHeaderView", "()Z", "setHasHeaderView", "(Z)V", "loadingCircle", "Landroid/widget/ImageView;", "getLoadingCircle", "()Landroid/widget/ImageView;", "setLoadingCircle", "(Landroid/widget/ImageView;)V", "mAnimCount", "", "mAnimatorSet", "Landroid/animation/AnimatorSet;", "mAnimators", "", "Landroid/animation/Animator;", "mCurrentIndex", "mNextPlayIndex", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "needAnimItemNum", "getNeedAnimItemNum", "()I", "setNeedAnimItemNum", "(I)V", "needAnimate", "getNeedAnimate", "setNeedAnimate", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "setOnItemClickListener", "onItemShowListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "getOnItemShowListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "setOnItemShowListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;)V", "shownItemMap", "", "", "getShownItemMap", "()Ljava/util/Map;", "setShownItemMap", "(Ljava/util/Map;)V", "addAnimToList", "", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "delay", "animate", "cancelAIMusicLoadingAnim", "clearSelectState", "dataPos2ViewPos", "pos", "endLoadingAnim", "getBasicItemCount", "getCurrentIndex", "getCurrentMusic", "getLoadMoreHeight", "view", "Landroid/view/View;", "getMusicItem", "position", "getNextPlayIndex", "getNextPlayMusic", "onAttachedToRecyclerView", "recyclerView", "onBindBasicViewHolder", "onBindFooterViewHolder", "holder", "onCreateBasicViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "onCreateFooterViewHolder", "parent", "onItemClick", "onViewAttachedToWindow", "setCurrentIndex", "index", "setNextPlayIndex", "startAnim", "setSelectedPosition", "byClick", "setShowFooter", "showFooter", "startAIMusicLoadingAnim", "startItemAnim", "startLoadingAnim", "stopItemAnim", "viewPos2DataPos", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CollectMusicItemAdapter extends BaseAdapter<MusicModel> implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68429a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f68430b;

    /* renamed from: c  reason: collision with root package name */
    public int f68431c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f68432d;

    /* renamed from: e  reason: collision with root package name */
    public int f68433e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f68434f = -1;
    public RecyclerView g;
    @Nullable
    public ImageView h;
    public AnimatorSet i = new AnimatorSet();
    public final List<Animator> j = new ArrayList();
    public int k = 1;
    @NotNull
    public Map<String, Boolean> l = new LinkedHashMap();
    @Nullable
    public l m;
    @NotNull
    public k n;
    private boolean o = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicItemAdapter$animate$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectMusicItemAdapter f68436b;

        a(CollectMusicItemAdapter collectMusicItemAdapter) {
            this.f68436b = collectMusicItemAdapter;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            this.f68436b.k++;
        }

        public final void onAnimationCancel(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f68435a, false, 77806, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f68435a, false, 77806, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f68436b.k = 3;
            this.f68436b.i.end();
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f68435a, false, 77805, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f68435a, false, 77805, new Class[]{Animator.class}, Void.TYPE);
            } else if (this.f68436b.k < 3) {
                this.f68436b.i.start();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicItemAdapter$startAIMusicLoadingAnim$1", "Ljava/lang/Runnable;", "run", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectMusicItemAdapter f68438b;

        public final void run() {
            RecyclerView.LayoutManager layoutManager;
            RecyclerView.ViewHolder viewHolder;
            if (PatchProxy.isSupport(new Object[0], this, f68437a, false, 77807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68437a, false, 77807, new Class[0], Void.TYPE);
                return;
            }
            CollectMusicItemAdapter collectMusicItemAdapter = this.f68438b;
            RecyclerView recyclerView = this.f68438b.g;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager != null) {
                collectMusicItemAdapter.f68431c = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                int i = this.f68438b.f68431c;
                for (int i2 = this.f68438b.f68430b; i2 < i; i2++) {
                    CollectMusicItemAdapter collectMusicItemAdapter2 = this.f68438b;
                    RecyclerView recyclerView2 = this.f68438b.g;
                    if (recyclerView2 != null) {
                        viewHolder = recyclerView2.findViewHolderForAdapterPosition(i2);
                    } else {
                        viewHolder = null;
                    }
                    int i3 = (i2 - 1) * 175;
                    if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i3)}, collectMusicItemAdapter2, CollectMusicItemAdapter.f68429a, false, 77788, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i3)}, collectMusicItemAdapter2, CollectMusicItemAdapter.f68429a, false, 77788, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                    } else if (viewHolder instanceof MusicItemViewHolder) {
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((MusicItemViewHolder) viewHolder).f68392b, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 0.5f, 1.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.5f, 1.0f})});
                        Intrinsics.checkExpressionValueIsNotNull(ofPropertyValuesHolder, "scale");
                        ofPropertyValuesHolder.setDuration(700);
                        ofPropertyValuesHolder.setStartDelay((long) i3);
                        collectMusicItemAdapter2.j.add(ofPropertyValuesHolder);
                    }
                }
                CollectMusicItemAdapter collectMusicItemAdapter3 = this.f68438b;
                if (PatchProxy.isSupport(new Object[0], collectMusicItemAdapter3, CollectMusicItemAdapter.f68429a, false, 77789, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], collectMusicItemAdapter3, CollectMusicItemAdapter.f68429a, false, 77789, new Class[0], Void.TYPE);
                    return;
                }
                collectMusicItemAdapter3.i.playTogether(collectMusicItemAdapter3.j);
                collectMusicItemAdapter3.i.start();
                collectMusicItemAdapter3.i.addListener(new a(collectMusicItemAdapter3));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }

        public b(CollectMusicItemAdapter collectMusicItemAdapter) {
            this.f68438b = collectMusicItemAdapter;
        }
    }

    @Nullable
    public final MusicModel a() {
        if (PatchProxy.isSupport(new Object[0], this, f68429a, false, 77783, new Class[0], MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[0], this, f68429a, false, 77783, new Class[0], MusicModel.class);
        }
        List list = this.mItems;
        if (list != null) {
            return (MusicModel) CollectionsKt.getOrNull(list, this.f68434f);
        }
        return null;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68429a, false, 77787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68429a, false, 77787, new Class[0], Void.TYPE);
            return;
        }
        if (this.i.isRunning()) {
            this.i.cancel();
        }
    }

    public final int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f68429a, false, 77803, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68429a, false, 77803, new Class[0], Integer.TYPE)).intValue();
        } else if (CollectionUtils.isEmpty(this.mItems)) {
            return 9;
        } else {
            return super.getBasicItemCount();
        }
    }

    public final void c() {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[0], this, f68429a, false, 77791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68429a, false, 77791, new Class[0], Void.TYPE);
        } else if (this.f68434f >= 0) {
            RecyclerView recyclerView = this.g;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(this.f68434f);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) viewHolder).d();
            } else {
                notifyItemChanged(this.f68434f);
            }
        }
    }

    private final int b(int i2) {
        if (this.f68430b) {
            return i2 - 1;
        }
        return i2;
    }

    public CollectMusicItemAdapter(@NotNull k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "onItemClickListener");
        this.n = kVar;
    }

    @Nullable
    public final MusicModel a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68429a, false, 77784, new Class[]{Integer.TYPE}, MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68429a, false, 77784, new Class[]{Integer.TYPE}, MusicModel.class);
        }
        List list = this.mItems;
        if (list != null) {
            return (MusicModel) CollectionsKt.getOrNull(list, b(i2));
        }
        return null;
    }

    public final int getLoadMoreHeight(@Nullable View view) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{view}, this, f68429a, false, 77798, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f68429a, false, 77798, new Class[]{View.class}, Integer.TYPE)).intValue();
        }
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        return (int) UIUtils.dip2Px(context, 72.0f);
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f68429a, false, 77795, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f68429a, false, 77795, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.g = recyclerView2;
    }

    public final void onBindFooterViewHolder(@Nullable RecyclerView.ViewHolder viewHolder) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f68429a, false, 77797, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f68429a, false, 77797, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onBindFooterViewHolder(viewHolder);
        ImageView imageView = this.h;
        if (imageView != null) {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                context = imageView2.getContext();
            } else {
                context = null;
            }
            imageView.startAnimation(AnimationUtils.loadAnimation(context, C0906R.anim.cf));
        }
    }

    public final void setShowFooter(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68429a, false, 77780, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68429a, false, 77780, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setShowFooter(z);
        if (!z) {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.clearAnimation();
            }
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(@Nullable ViewGroup viewGroup) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f68429a, false, 77796, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f68429a, false, 77796, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Integer num = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a5n, viewGroup, false);
        this.h = (ImageView) inflate.findViewById(C0906R.id.b2w);
        RecyclerView.ViewHolder onCreateFooterViewHolder = super.onCreateFooterViewHolder(viewGroup);
        View view = onCreateFooterViewHolder.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.a().a(inflate));
            View view2 = viewGroup;
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(getLoadMoreHeight(view2), getLoadMoreHeight(view2));
            if (viewGroup != null) {
                num = Integer.valueOf(viewGroup.getHeight());
            }
            if (num == null) {
                Intrinsics.throwNpe();
            }
            layoutParams.bottomMargin = num.intValue() - getLoadMoreHeight(view2);
            dmtStatusView.setLayoutParams(layoutParams);
            Intrinsics.checkExpressionValueIsNotNull(onCreateFooterViewHolder, "superFooterHolder");
            return onCreateFooterViewHolder;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f68429a, false, 77799, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f68429a, false, 77799, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof MusicItemViewHolder) {
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) viewHolder;
            if (musicItemViewHolder.getLayoutPosition() == this.f68433e) {
                musicItemViewHolder.a();
            }
            int adapterPosition = musicItemViewHolder.getAdapterPosition();
            List list = this.mItems;
            if (list != null) {
                Collection collection = list;
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    List list2 = this.mItems;
                    if (list2 != null) {
                        MusicModel musicModel = (MusicModel) list2.get(adapterPosition);
                        if (musicModel != null) {
                            String musicId = musicModel.getMusicId();
                            if (musicId != null) {
                                if (this.l.get(musicId) == null || Intrinsics.areEqual((Object) this.l.get(musicId), (Object) Boolean.FALSE)) {
                                    this.l.put(musicId, Boolean.TRUE);
                                    l lVar = this.m;
                                    if (lVar != null) {
                                        lVar.a(adapterPosition);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f68429a, false, 77802, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f68429a, false, 77802, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
        MusicItemViewHolder.a aVar = MusicItemViewHolder.f68391e;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(from, "LayoutInflater.from(viewGroup.context)");
        return new MusicItemViewHolder(aVar.a(from, viewGroup2), this);
    }

    public final void a(int i2, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68429a, false, 77781, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f68429a, false, 77781, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        c();
        this.f68434f = i2;
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f68429a, false, 77790, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68429a, false, 77790, new Class[0], Void.TYPE);
            } else if (this.f68434f >= 0) {
                RecyclerView recyclerView = this.g;
                if (recyclerView != null) {
                    viewHolder = recyclerView.findViewHolderForAdapterPosition(this.f68434f);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof MusicItemViewHolder) {
                    ((MusicItemViewHolder) viewHolder).c();
                }
            }
        }
    }

    public final void b(int i2, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68429a, false, 77785, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f68429a, false, 77785, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int itemCount = getItemCount() - 1;
        int i3 = this.f68433e;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i3 >= 0 && itemCount >= i3) {
            RecyclerView recyclerView = this.g;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(this.f68433e);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof MusicItemViewHolder) {
                MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) viewHolder;
                musicItemViewHolder.a(false);
                musicItemViewHolder.b();
            } else {
                notifyItemChanged(this.f68433e);
            }
        }
        this.f68433e = i2;
        if (this.f68433e < getItemCount()) {
            RecyclerView recyclerView2 = this.g;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.findViewHolderForAdapterPosition(this.f68433e);
            }
            if (viewHolder2 instanceof MusicItemViewHolder) {
                MusicItemViewHolder musicItemViewHolder2 = (MusicItemViewHolder) viewHolder2;
                musicItemViewHolder2.a(true);
                musicItemViewHolder2.a();
            }
        }
    }

    public final void onBindBasicViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        MusicModel musicModel;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f68429a, false, 77779, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f68429a, false, 77779, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        if (viewHolder instanceof MusicItemViewHolder) {
            if (i2 >= this.f68431c) {
                this.o = false;
            }
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) viewHolder;
            List list = this.mItems;
            if (list != null) {
                musicModel = (MusicModel) CollectionsKt.getOrNull(list, b(i2));
            } else {
                musicModel = null;
            }
            if (this.f68433e == i2) {
                z = true;
            } else {
                z = false;
            }
            if (this.f68433e == this.f68434f || this.f68434f != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f68432d && this.o) {
                z3 = true;
            }
            musicItemViewHolder.a(musicModel, z, z2, z3);
        }
    }

    public final void a(@NotNull View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f68429a, false, 77794, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f68429a, false, 77794, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        k kVar = this.n;
        if (kVar != null) {
            kVar.a(view, b(i2));
        }
    }
}
