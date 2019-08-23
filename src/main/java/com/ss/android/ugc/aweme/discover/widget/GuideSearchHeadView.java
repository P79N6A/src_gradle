package com.ss.android.ugc.aweme.discover.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.helper.RecyclerViewScrollSynchronizer;
import com.ss.android.ugc.aweme.discover.mob.e;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003456B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ4\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010&\u001a\u00020'H\u0007J\u0012\u0010,\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\"H\u0002J \u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0007H\u0002J\u0016\u00101\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+H\u0002J\u000e\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\u0000R\u001f\u0010\t\u001a\u00060\nR\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchAdapter;", "getAdapter", "()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "alreadyMobWords", "Ljava/util/HashSet;", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "Lkotlin/collections/HashSet;", "getAlreadyMobWords", "()Ljava/util/HashSet;", "alreadyMobWords$delegate", "layoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "getLayoutManager", "()Landroid/support/v7/widget/LinearLayoutManager;", "layoutManager$delegate", "listView", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "getListView", "()Landroid/support/v7/widget/RecyclerView;", "listView$delegate", "originalKeyword", "", "scrollSynchronizer", "Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer;", "searchLabel", "shouldMobEvent", "", "bindData", "", "wordList", "", "getSearchType", "sendMobEventByItem", "event", "word", "order", "sendMobShowEvent", "syncWith", "that", "GuideSearchAdapter", "GuideSearchViewHolder", "SpaceItemDecoration", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GuideSearchHeadView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43288a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f43289b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GuideSearchHeadView.class), "listView", "getListView()Landroid/support/v7/widget/RecyclerView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GuideSearchHeadView.class), "adapter", "getAdapter()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GuideSearchHeadView.class), "layoutManager", "getLayoutManager()Landroid/support/v7/widget/LinearLayoutManager;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GuideSearchHeadView.class), "alreadyMobWords", "getAlreadyMobWords()Ljava/util/HashSet;"))};

    /* renamed from: c  reason: collision with root package name */
    public RecyclerViewScrollSynchronizer f43290c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43291d;

    /* renamed from: e  reason: collision with root package name */
    HashMap f43292e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f43293f;
    private final Lazy g;
    private final Lazy h;
    private final Lazy i;
    private String j;
    private String k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "(Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;)V", "words", "", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "getWords", "()Ljava/util/List;", "setWords", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onViewAttachedToWindow", "setData", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class GuideSearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43294a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public List<GuideSearchWord> f43295b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43297a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GuideSearchAdapter f43298b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f43299c;

            a(GuideSearchAdapter guideSearchAdapter, int i) {
                this.f43298b = guideSearchAdapter;
                this.f43299c = i;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f43297a, false, 38241, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f43297a, false, 38241, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                GuideSearchHeadView guideSearchHeadView = GuideSearchHeadView.this;
                List<GuideSearchWord> list = this.f43298b.f43295b;
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                guideSearchHeadView.a("trending_words_click", list.get(this.f43299c), this.f43299c);
                List<GuideSearchWord> list2 = this.f43298b.f43295b;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                String word = list2.get(this.f43299c).getWord();
                if (word == null) {
                    Intrinsics.throwNpe();
                }
                bg.a(new com.ss.android.ugc.aweme.discover.a.a(word));
            }
        }

        public final int getItemCount() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f43294a, false, 38240, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43294a, false, 38240, new Class[0], Integer.TYPE)).intValue();
            }
            if (this.f43295b != null) {
                List<GuideSearchWord> list = this.f43295b;
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                i = list.size();
            }
            return i;
        }

        public GuideSearchAdapter() {
        }

        @SuppressLint({"notifyDataSetChanged"})
        public final void a(@Nullable List<GuideSearchWord> list) {
            List<GuideSearchWord> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f43294a, false, 38236, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f43294a, false, 38236, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f43295b = list2;
            notifyDataSetChanged();
        }

        public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f43294a, false, 38239, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f43294a, false, 38239, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
            if (GuideSearchHeadView.this.f43291d) {
                GuideSearchWord guideSearchWord = ((GuideSearchViewHolder) viewHolder).f43301b;
                if (guideSearchWord != null) {
                    List<GuideSearchWord> list = this.f43295b;
                    if (list != null) {
                        int indexOf = list.indexOf(guideSearchWord);
                        if (!GuideSearchHeadView.this.getAlreadyMobWords().contains(guideSearchWord)) {
                            GuideSearchHeadView.this.getAlreadyMobWords().add(guideSearchWord);
                            GuideSearchHeadView.this.a("trending_words_show", guideSearchWord, indexOf);
                        }
                    }
                }
            }
        }

        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43294a, false, 38237, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43294a, false, 38237, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vd, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…arch_word, parent, false)");
            return new GuideSearchViewHolder(inflate);
        }

        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            RecyclerView.ViewHolder viewHolder2 = viewHolder;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43294a, false, 38238, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43294a, false, 38238, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
            GuideSearchViewHolder guideSearchViewHolder = (GuideSearchViewHolder) viewHolder2;
            List<GuideSearchWord> list = this.f43295b;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            GuideSearchWord guideSearchWord = list.get(i2);
            if (PatchProxy.isSupport(new Object[]{guideSearchWord}, guideSearchViewHolder, GuideSearchViewHolder.f43300a, false, 38242, new Class[]{GuideSearchWord.class}, Void.TYPE)) {
                GuideSearchViewHolder guideSearchViewHolder2 = guideSearchViewHolder;
                PatchProxy.accessDispatch(new Object[]{guideSearchWord}, guideSearchViewHolder2, GuideSearchViewHolder.f43300a, false, 38242, new Class[]{GuideSearchWord.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(guideSearchWord, "word");
                guideSearchViewHolder.f43301b = guideSearchWord;
                View view = guideSearchViewHolder.itemView;
                if (view != null) {
                    ((DmtTextView) view).setText(guideSearchWord.getWord());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
                }
            }
            viewHolder2.itemView.setOnClickListener(new a(this, i2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "word", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "getWord", "()Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "setWord", "(Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;)V", "bind", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class GuideSearchViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43300a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public GuideSearchWord f43301b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GuideSearchViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$SpaceItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "spaceX", "", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class SpaceItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43302a;

        /* renamed from: b  reason: collision with root package name */
        private final int f43303b;

        public SpaceItemDecoration(int i) {
            this.f43303b = i;
        }

        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Rect rect2 = rect;
            View view2 = view;
            RecyclerView recyclerView2 = recyclerView;
            RecyclerView.State state2 = state;
            if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f43302a, false, 38243, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state2}, this, f43302a, false, 38243, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(rect2, "outRect");
            Intrinsics.checkParameterIsNotNull(view2, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
            Intrinsics.checkParameterIsNotNull(state2, "state");
            if (recyclerView2.getChildAdapterPosition(view2) == 0) {
                rect2.left = this.f43303b;
            }
            rect2.right = this.f43303b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchAdapter;", "Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<GuideSearchAdapter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GuideSearchHeadView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GuideSearchHeadView guideSearchHeadView) {
            super(0);
            this.this$0 = guideSearchHeadView;
        }

        @NotNull
        public final GuideSearchAdapter invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38244, new Class[0], GuideSearchAdapter.class)) {
                return new GuideSearchAdapter();
            }
            return (GuideSearchAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38244, new Class[0], GuideSearchAdapter.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/HashSet;", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "Lkotlin/collections/HashSet;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<HashSet<GuideSearchWord>> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final HashSet<GuideSearchWord> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38245, new Class[0], HashSet.class)) {
                return new HashSet<>();
            }
            return (HashSet) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38245, new Class[0], HashSet.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/support/v7/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<LinearLayoutManager> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.$context = context;
        }

        @NotNull
        public final LinearLayoutManager invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38246, new Class[0], LinearLayoutManager.class)) {
                return new LinearLayoutManager(this.$context, 0, false);
            }
            return (LinearLayoutManager) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38246, new Class[0], LinearLayoutManager.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<RecyclerView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GuideSearchHeadView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GuideSearchHeadView guideSearchHeadView) {
            super(0);
            this.this$0 = guideSearchHeadView;
        }

        public final RecyclerView invoke() {
            View view;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38247, new Class[0], RecyclerView.class)) {
                return (RecyclerView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38247, new Class[0], RecyclerView.class);
            }
            GuideSearchHeadView guideSearchHeadView = this.this$0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ccc)}, guideSearchHeadView, GuideSearchHeadView.f43288a, false, 38234, new Class[]{Integer.TYPE}, View.class)) {
                GuideSearchHeadView guideSearchHeadView2 = guideSearchHeadView;
                view = (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ccc)}, guideSearchHeadView2, GuideSearchHeadView.f43288a, false, 38234, new Class[]{Integer.TYPE}, View.class);
            } else {
                if (guideSearchHeadView.f43292e == null) {
                    guideSearchHeadView.f43292e = new HashMap();
                }
                view = (View) guideSearchHeadView.f43292e.get(Integer.valueOf(C0906R.id.ccc));
                if (view == null) {
                    view = guideSearchHeadView.findViewById(C0906R.id.ccc);
                    guideSearchHeadView.f43292e.put(Integer.valueOf(C0906R.id.ccc), view);
                }
            }
            return (RecyclerView) view;
        }
    }

    @JvmOverloads
    public GuideSearchHeadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public GuideSearchHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final GuideSearchAdapter getAdapter() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f43288a, false, 38224, new Class[0], GuideSearchAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f43288a, false, 38224, new Class[0], GuideSearchAdapter.class);
        } else {
            value = this.g.getValue();
        }
        return (GuideSearchAdapter) value;
    }

    private final LinearLayoutManager getLayoutManager() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f43288a, false, 38225, new Class[0], LinearLayoutManager.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f43288a, false, 38225, new Class[0], LinearLayoutManager.class);
        } else {
            value = this.h.getValue();
        }
        return (LinearLayoutManager) value;
    }

    public final HashSet<GuideSearchWord> getAlreadyMobWords() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f43288a, false, 38226, new Class[0], HashSet.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f43288a, false, 38226, new Class[0], HashSet.class);
        } else {
            value = this.i.getValue();
        }
        return (HashSet) value;
    }

    public final RecyclerView getListView() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f43288a, false, 38223, new Class[0], RecyclerView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f43288a, false, 38223, new Class[0], RecyclerView.class);
        } else {
            value = this.f43293f.getValue();
        }
        return (RecyclerView) value;
    }

    private final void a(List<GuideSearchWord> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f43288a, false, 38231, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f43288a, false, 38231, new Class[]{List.class}, Void.TYPE);
            return;
        }
        r.a("trending_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("words_num", list.size()).a("words_source", "guide_search").a("query", this.k).a("search_id", e.a().a(a(this.j))).a("search_subtab_name", this.j).f34114b);
    }

    private final int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f43288a, false, 38233, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f43288a, false, 38233, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (str2 != null) {
            switch (str.hashCode()) {
                case 111178:
                    if (str2.equals("poi")) {
                        return 5;
                    }
                    break;
                case 114586:
                    if (str2.equals("tag")) {
                        return 2;
                    }
                    break;
                case 3599307:
                    if (str2.equals(AllStoryActivity.f73306b)) {
                        return 0;
                    }
                    break;
                case 104263205:
                    if (str2.equals("music")) {
                        return 1;
                    }
                    break;
                case 112202875:
                    if (str2.equals("video")) {
                        return 4;
                    }
                    break;
                case 998835423:
                    if (str2.equals("general_search")) {
                        return 3;
                    }
                    break;
                case 1528280640:
                    if (str2.equals("ecommerce")) {
                        return 7;
                    }
                    break;
            }
        }
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GuideSearchHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f43293f = a.a(new d(this));
        this.g = a.a(new a(this));
        this.h = a.a(new c(context));
        this.i = a.a(b.INSTANCE);
        LayoutInflater.from(context).inflate(C0906R.layout.aqx, this, true);
        RecyclerView listView = getListView();
        Intrinsics.checkExpressionValueIsNotNull(listView, "listView");
        listView.setLayoutManager(getLayoutManager());
        RecyclerView listView2 = getListView();
        Intrinsics.checkExpressionValueIsNotNull(listView2, "listView");
        listView2.setAdapter(getAdapter());
        getListView().addItemDecoration(new SpaceItemDecoration((int) UIUtils.dip2Px(getContext(), 12.0f)));
    }

    public final void a(String str, GuideSearchWord guideSearchWord, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, guideSearchWord, Integer.valueOf(i2)}, this, f43288a, false, 38232, new Class[]{String.class, GuideSearchWord.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, guideSearchWord, Integer.valueOf(i2)}, this, f43288a, false, 38232, new Class[]{String.class, GuideSearchWord.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a(str, (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", guideSearchWord.getId()).a("words_source", "guide_search").a("words_position", i2).a("words_content", guideSearchWord.getWord()).a("query", this.k).a("search_id", e.a().a(a(this.j))).a("search_subtab_name", this.j).f34114b);
    }

    @JvmOverloads
    public final void a(@NotNull List<GuideSearchWord> list, @NotNull String str, @Nullable String str2, boolean z) {
        List<GuideSearchWord> list2 = list;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{list2, str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f43288a, false, 38228, new Class[]{List.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str3, str4, Byte.valueOf(z)}, this, f43288a, false, 38228, new Class[]{List.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "wordList");
        Intrinsics.checkParameterIsNotNull(str3, "originalKeyword");
        getAdapter().a(list2);
        getListView().scrollToPosition(0);
        getAlreadyMobWords().clear();
        this.k = str3;
        this.j = str4;
        this.f43291d = z2;
        if (z2 && !CollectionUtils.isEmpty(list2)) {
            a(list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuideSearchHeadView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
