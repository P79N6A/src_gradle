package com.ss.android.ugc.aweme.shortvideo.music;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.k;
import com.ss.android.ugc.aweme.ao.a.l;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.music.MusicItemViewHolder;
import com.ss.android.ugc.aweme.shortvideo.music.MusicLibViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001dB\u001d\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u001a\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0013H\u0002J\u000e\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020\u0006J\b\u0010A\u001a\u00020<H\u0002J\u0006\u0010B\u001a\u00020<J\u0006\u0010C\u001a\u00020<J\u0006\u0010D\u001a\u00020<J\u0006\u0010E\u001a\u00020\u0013J\b\u0010F\u001a\u0004\u0018\u00010\u0006J\b\u0010G\u001a\u00020\u0013H\u0016J\u0010\u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u0013H\u0016J\u0010\u0010J\u001a\u0004\u0018\u00010\u00062\u0006\u0010I\u001a\u00020\u0013J\u0006\u0010K\u001a\u00020\u0013J\b\u0010L\u001a\u0004\u0018\u00010\u0006J\u0010\u0010M\u001a\u00020<2\u0006\u0010N\u001a\u00020 H\u0016J\u0018\u0010O\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u0013H\u0016J\u0018\u0010Q\u001a\u00020\u00022\u0006\u0010R\u001a\u00020S2\u0006\u0010P\u001a\u00020\u0013H\u0016J\u0018\u0010T\u001a\u00020<2\u0006\u0010U\u001a\u00020V2\u0006\u0010I\u001a\u00020\u0013H\u0016J\u0010\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020\u0002H\u0016J\u0010\u0010Y\u001a\u00020<2\b\u0010@\u001a\u0004\u0018\u00010\u0006J\u000e\u0010Z\u001a\u00020<2\u0006\u0010[\u001a\u00020\u0013J\u000e\u0010\\\u001a\u00020<2\u0006\u0010[\u001a\u00020\u0013J\u0016\u0010\\\u001a\u00020<2\u0006\u0010[\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\nJ\u0018\u0010^\u001a\u00020<2\u0006\u0010I\u001a\u00020\u00132\b\b\u0002\u0010_\u001a\u00020\nJ\u0006\u0010`\u001a\u00020<J\u0006\u0010a\u001a\u00020<J\u0006\u0010b\u001a\u00020<J\u0006\u0010c\u001a\u00020<R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n06X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "mMusicLists", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "onItemClickListener", "(Ljava/util/List;Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;)V", "enableAnim", "", "jarvisItemShow", "", "", "getJarvisItemShow", "()Ljava/util/Set;", "setJarvisItemShow", "(Ljava/util/Set;)V", "mAnimCount", "", "mAnimatorSet", "Landroid/animation/AnimatorSet;", "mAnimators", "", "Landroid/animation/Animator;", "mCurrentIndex", "getMMusicLists", "()Ljava/util/List;", "setMMusicLists", "(Ljava/util/List;)V", "mNextPlayIndex", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "needAnimItemNum", "getNeedAnimItemNum", "()I", "setNeedAnimItemNum", "(I)V", "needAnimate", "getNeedAnimate", "()Z", "setNeedAnimate", "(Z)V", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "setOnItemClickListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;)V", "onItemShowListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "getOnItemShowListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "setOnItemShowListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;)V", "shownItemMap", "", "getShownItemMap", "()Ljava/util/Map;", "setShownItemMap", "(Ljava/util/Map;)V", "addAnimToList", "", "viewHolder", "delay", "addItemNotNeedMobClick", "mMusicModel", "animate", "cancelAIMusicLoadingAnim", "clearSelectState", "endLoadingAnim", "getCurrentIndex", "getCurrentMusic", "getItemCount", "getItemViewType", "position", "getMusicItem", "getNextPlayIndex", "getNextPlayMusic", "onAttachedToRecyclerView", "recyclerView", "onBindViewHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "onItemClick", "view", "Landroid/view/View;", "onViewAttachedToWindow", "holder", "reportJarvisItemShow", "setCurrentIndex", "index", "setNextPlayIndex", "startAnim", "setSelectedPosition", "byClick", "startAIMusicLoadingAnim", "startItemAnim", "startLoadingAnim", "stopItemAnim", "Companion", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68379a;
    public static final a n = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f68380b = -1;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f68381c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public l f68382d;

    /* renamed from: e  reason: collision with root package name */
    public AnimatorSet f68383e = new AnimatorSet();

    /* renamed from: f  reason: collision with root package name */
    public final List<Animator> f68384f = new ArrayList();
    public int g = 1;
    public boolean h;
    public int i;
    @NotNull
    public Map<String, Boolean> j = new LinkedHashMap();
    @NotNull
    public Set<String> k = new LinkedHashSet();
    @Nullable
    public List<? extends MusicModel> l;
    @NotNull
    public k m;
    private int o = -1;
    private boolean p = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicItemAdapter$Companion;", "", "()V", "getJarvisItemShowCid", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68385a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/MusicItemAdapter$animate$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicItemAdapter f68387b;

        b(MusicItemAdapter musicItemAdapter) {
            this.f68387b = musicItemAdapter;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            this.f68387b.g++;
        }

        public final void onAnimationCancel(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f68386a, false, 77737, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f68386a, false, 77737, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f68387b.g = 3;
            this.f68387b.f68383e.end();
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f68386a, false, 77736, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f68386a, false, 77736, new Class[]{Animator.class}, Void.TYPE);
            } else if (this.f68387b.g < 3) {
                this.f68387b.f68383e.start();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/MusicItemAdapter$startAIMusicLoadingAnim$1", "Ljava/lang/Runnable;", "run", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68388a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicItemAdapter f68389b;

        public final void run() {
            RecyclerView.LayoutManager layoutManager;
            RecyclerView.ViewHolder viewHolder;
            if (PatchProxy.isSupport(new Object[0], this, f68388a, false, 77738, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68388a, false, 77738, new Class[0], Void.TYPE);
                return;
            }
            MusicItemAdapter musicItemAdapter = this.f68389b;
            RecyclerView recyclerView = this.f68389b.f68381c;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager != null) {
                musicItemAdapter.i = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                int i = this.f68389b.i;
                for (int i2 = 1; i2 < i; i2++) {
                    MusicItemAdapter musicItemAdapter2 = this.f68389b;
                    RecyclerView recyclerView2 = this.f68389b.f68381c;
                    if (recyclerView2 != null) {
                        viewHolder = recyclerView2.findViewHolderForAdapterPosition(i2);
                    } else {
                        viewHolder = null;
                    }
                    int i3 = (i2 - 1) * 175;
                    if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i3)}, musicItemAdapter2, MusicItemAdapter.f68379a, false, 77723, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                        MusicItemAdapter musicItemAdapter3 = musicItemAdapter2;
                        PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i3)}, musicItemAdapter3, MusicItemAdapter.f68379a, false, 77723, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                    } else if (viewHolder instanceof MusicItemViewHolder) {
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 0.5f, 1.0f});
                        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.5f, 1.0f});
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((MusicItemViewHolder) viewHolder).f68392b, new PropertyValuesHolder[]{ofFloat, ofFloat2});
                        Intrinsics.checkExpressionValueIsNotNull(ofPropertyValuesHolder, "scale");
                        ofPropertyValuesHolder.setDuration(700);
                        ofPropertyValuesHolder.setStartDelay((long) i3);
                        musicItemAdapter2.f68384f.add(ofPropertyValuesHolder);
                    }
                }
                MusicItemAdapter musicItemAdapter4 = this.f68389b;
                if (PatchProxy.isSupport(new Object[0], musicItemAdapter4, MusicItemAdapter.f68379a, false, 77724, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], musicItemAdapter4, MusicItemAdapter.f68379a, false, 77724, new Class[0], Void.TYPE);
                    return;
                }
                musicItemAdapter4.f68383e.playTogether(musicItemAdapter4.f68384f);
                musicItemAdapter4.f68383e.start();
                musicItemAdapter4.f68383e.addListener(new b(musicItemAdapter4));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }

        public c(MusicItemAdapter musicItemAdapter) {
            this.f68389b = musicItemAdapter;
        }
    }

    public final int getItemViewType(int i2) {
        return i2 == 0 ? 0 : 2;
    }

    public final int a() {
        return this.f68380b - 1;
    }

    public final int b() {
        return this.o - 1;
    }

    @Nullable
    public final MusicModel c() {
        if (PatchProxy.isSupport(new Object[0], this, f68379a, false, 77717, new Class[0], MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[0], this, f68379a, false, 77717, new Class[0], MusicModel.class);
        }
        List<? extends MusicModel> list = this.l;
        if (list != null) {
            return (MusicModel) CollectionsKt.getOrNull(list, this.f68380b - 1);
        }
        return null;
    }

    @Nullable
    public final MusicModel d() {
        if (PatchProxy.isSupport(new Object[0], this, f68379a, false, 77718, new Class[0], MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[0], this, f68379a, false, 77718, new Class[0], MusicModel.class);
        }
        List<? extends MusicModel> list = this.l;
        if (list != null) {
            return (MusicModel) CollectionsKt.getOrNull(list, this.o - 1);
        }
        return null;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f68379a, false, 77725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68379a, false, 77725, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68383e.isRunning()) {
            this.f68383e.cancel();
        }
    }

    public final void g() {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[0], this, f68379a, false, 77727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68379a, false, 77727, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f68381c;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(this.f68380b);
        } else {
            viewHolder = null;
        }
        if (viewHolder instanceof MusicItemViewHolder) {
            ((MusicItemViewHolder) viewHolder).a();
        }
    }

    public final void f() {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[0], this, f68379a, false, 77726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68379a, false, 77726, new Class[0], Void.TYPE);
        } else if (this.o > 0) {
            RecyclerView recyclerView = this.f68381c;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(this.o);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) viewHolder).d();
            } else {
                notifyItemChanged(this.o);
            }
        }
    }

    public final int getItemCount() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f68379a, false, 77714, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68379a, false, 77714, new Class[0], Integer.TYPE)).intValue();
        }
        List<? extends MusicModel> list = this.l;
        if (list != null && list.size() == 0) {
            return 9;
        }
        List<? extends MusicModel> list2 = this.l;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i2 + 1;
    }

    public final void a(int i2) {
        this.f68380b = i2 + 1;
    }

    public final void b(int i2) {
        this.o = i2 + 1;
    }

    @Nullable
    public final MusicModel c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68379a, false, 77719, new Class[]{Integer.TYPE}, MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68379a, false, 77719, new Class[]{Integer.TYPE}, MusicModel.class);
        }
        List<? extends MusicModel> list = this.l;
        if (list != null) {
            return (MusicModel) CollectionsKt.getOrNull(list, i2);
        }
        return null;
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f68379a, false, 77711, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f68379a, false, 77711, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f68381c = recyclerView2;
    }

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        boolean z;
        MusicModel musicModel;
        String str;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f68379a, false, 77729, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f68379a, false, 77729, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof MusicItemViewHolder) {
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) viewHolder2;
            if (musicItemViewHolder.getLayoutPosition() == this.f68380b) {
                musicItemViewHolder.a();
            }
            int adapterPosition = musicItemViewHolder.getAdapterPosition() - 1;
            List<? extends MusicModel> list = this.l;
            if (list != null) {
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    List<? extends MusicModel> list2 = this.l;
                    if (list2 != null) {
                        MusicModel musicModel2 = (MusicModel) list2.get(adapterPosition);
                        if (musicModel2 != null) {
                            String musicId = musicModel2.getMusicId();
                            if (musicId != null) {
                                if (this.j.get(musicId) == null || Intrinsics.areEqual((Object) this.j.get(musicId), (Object) Boolean.FALSE)) {
                                    this.j.put(musicId, Boolean.TRUE);
                                    l lVar = this.f68382d;
                                    if (lVar != null) {
                                        lVar.a(adapterPosition);
                                    }
                                }
                                if (!this.k.contains(musicId)) {
                                    List<? extends MusicModel> list3 = this.l;
                                    String str2 = null;
                                    if (list3 != null) {
                                        musicModel = (MusicModel) CollectionsKt.getOrNull(list3, adapterPosition);
                                    } else {
                                        musicModel = null;
                                    }
                                    if (PatchProxy.isSupport(new Object[]{musicModel}, this, f68379a, false, 77730, new Class[]{MusicModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{musicModel}, this, f68379a, false, 77730, new Class[]{MusicModel.class}, Void.TYPE);
                                    } else if (musicModel != null && musicModel.getComeFromForMod() == 1) {
                                        d a2 = d.a().a("item_id", musicModel.getMusicId());
                                        a aVar = n;
                                        if (PatchProxy.isSupport(new Object[0], aVar, a.f68385a, false, 77735, new Class[0], String.class)) {
                                            str = (String) PatchProxy.accessDispatch(new Object[0], aVar, a.f68385a, false, 77735, new Class[0], String.class);
                                        } else if (com.ss.android.g.a.b()) {
                                            str = "94349537923";
                                        } else if (com.ss.android.g.a.c()) {
                                            str = "94349537828";
                                        } else {
                                            str = "94349537798";
                                        }
                                        d a3 = a2.a("channel_id", str);
                                        LogPbBean logPb = musicModel.getLogPb();
                                        if (logPb != null) {
                                            str2 = logPb.getImprId();
                                        }
                                        r.a("jarvis_item_show", (Map) a3.a("req_id", str2).f34114b);
                                    }
                                    this.k.add(musicId);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public MusicItemAdapter(@Nullable List<? extends MusicModel> list, @NotNull k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "onItemClickListener");
        this.l = list;
        this.m = kVar;
    }

    public final void a(@NotNull View view, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f68379a, false, 77715, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f68379a, false, 77715, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        k kVar = this.m;
        if (kVar != null) {
            kVar.a(view2, i2 - 1);
        }
    }

    public final void a(int i2, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68379a, false, 77716, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f68379a, false, 77716, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        f();
        this.o = i2 + 1;
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f68379a, false, 77721, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68379a, false, 77721, new Class[0], Void.TYPE);
            } else if (this.o > 0) {
                RecyclerView recyclerView = this.f68381c;
                if (recyclerView != null) {
                    viewHolder = recyclerView.findViewHolderForAdapterPosition(this.o);
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68379a, false, 77720, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f68379a, false, 77720, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.ViewHolder viewHolder2 = null;
        if (this.f68380b > 0 && this.f68380b < getItemCount()) {
            RecyclerView recyclerView = this.f68381c;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(this.f68380b);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof MusicItemViewHolder) {
                MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) viewHolder;
                musicItemViewHolder.a(false);
                musicItemViewHolder.b();
            } else {
                notifyItemChanged(this.f68380b);
            }
        }
        this.f68380b = i2 + 1;
        if (this.f68380b < getItemCount()) {
            RecyclerView recyclerView2 = this.f68381c;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.findViewHolderForAdapterPosition(this.f68380b);
            }
            if (viewHolder2 instanceof MusicItemViewHolder) {
                MusicItemViewHolder musicItemViewHolder2 = (MusicItemViewHolder) viewHolder2;
                musicItemViewHolder2.a(true);
                musicItemViewHolder2.a();
            }
        }
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        MusicModel musicModel;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f68379a, false, 77713, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f68379a, false, 77713, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        if (viewHolder instanceof MusicItemViewHolder) {
            if (i2 >= this.i) {
                this.p = false;
            }
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) viewHolder;
            List<? extends MusicModel> list = this.l;
            if (list != null) {
                musicModel = (MusicModel) CollectionsKt.getOrNull(list, i2 - 1);
            } else {
                musicModel = null;
            }
            if (this.f68380b == i2) {
                z = true;
            } else {
                z = false;
            }
            if (this.f68380b == this.o || this.o != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.h && this.p) {
                z3 = true;
            }
            musicItemViewHolder.a(musicModel, z, z2, z3);
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        View view;
        int i3;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f68379a, false, 77712, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f68379a, false, 77712, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
        if (getItemViewType(i2) != 0) {
            MusicItemViewHolder.a aVar = MusicItemViewHolder.f68391e;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            Intrinsics.checkExpressionValueIsNotNull(from, "LayoutInflater.from(viewGroup.context)");
            return new MusicItemViewHolder(aVar.a(from, viewGroup2), this);
        }
        MusicLibViewHolder.a aVar2 = MusicLibViewHolder.f68400b;
        LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(from2, "LayoutInflater.from(viewGroup.context)");
        if (PatchProxy.isSupport(new Object[]{from2, viewGroup2}, aVar2, MusicLibViewHolder.a.f68409a, false, 77749, new Class[]{LayoutInflater.class, ViewGroup.class}, View.class)) {
            MusicLibViewHolder.a aVar3 = aVar2;
            view = (View) PatchProxy.accessDispatch(new Object[]{from2, viewGroup2}, aVar3, MusicLibViewHolder.a.f68409a, false, 77749, new Class[]{LayoutInflater.class, ViewGroup.class}, View.class);
        } else {
            Intrinsics.checkParameterIsNotNull(from2, "inflater");
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            if (com.ss.android.ugc.aweme.tools.music.b.b.a() == 0) {
                i3 = C0906R.layout.fj;
            } else {
                i3 = C0906R.layout.fk;
            }
            view = from2.inflate(i3, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(view, "inflater.inflate(if (ABM…th_search, parent, false)");
        }
        return new MusicLibViewHolder(view, this);
    }
}
