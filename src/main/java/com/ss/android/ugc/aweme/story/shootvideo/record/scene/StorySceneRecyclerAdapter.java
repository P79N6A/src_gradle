package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B>\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\nJ\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0016J&\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001aH\u0016J\u0018\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nH\u0016R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R)\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneRecyclerAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneItemHolder;", "effectPlatform", "Lcom/google/common/base/Supplier;", "Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "onStickerDownload", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "(Lcom/google/common/base/Supplier;Landroid/support/v7/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "clickEnable", "", "getClickEnable", "()Z", "setClickEnable", "(Z)V", "scaleFirstNeeded", "getScaleFirstNeeded", "setScaleFirstNeeded", "value", "", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerWrapper;", "stickerList", "getStickerList", "()Ljava/util/List;", "setStickerList", "(Ljava/util/List;)V", "getItemCount", "getStickerAt", "onBindViewHolder", "holder", "payloads", "", "onCreateViewHolder", "container", "Landroid/view/ViewGroup;", "viewType", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySceneRecyclerAdapter extends RecyclerView.Adapter<StorySceneItemHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74034a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74035b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74036c = true;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public List<ah> f74037d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f74038e;

    /* renamed from: f  reason: collision with root package name */
    private final s<g> f74039f;
    private final Function1<Integer, Unit> g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $position;
        final /* synthetic */ StorySceneRecyclerAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StorySceneRecyclerAdapter storySceneRecyclerAdapter, int i) {
            super(1);
            this.this$0 = storySceneRecyclerAdapter;
            this.$position = i;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 85964, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 85964, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
            if (this.this$0.f74035b) {
                this.this$0.f74038e.smoothScrollToPosition(this.$position);
            }
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f74034a, false, 85960, new Class[0], Integer.TYPE)) {
            return this.f74037d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74034a, false, 85960, new Class[0], Integer.TYPE)).intValue();
    }

    @Nullable
    public final ah a(int i) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74034a, false, 85963, new Class[]{Integer.TYPE}, ah.class)) {
            return (ah) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74034a, false, 85963, new Class[]{Integer.TYPE}, ah.class);
        }
        List<ah> list = this.f74037d;
        if (i < 0 || this.f74037d.size() <= i) {
            z = false;
        }
        if (!z) {
            list = null;
        }
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public final void a(@NotNull List<ah> list) {
        List<ah> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f74034a, false, 85958, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f74034a, false, 85958, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.f74037d.clear();
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            for (ah add : list2) {
                this.f74037d.add(add);
            }
        }
        notifyDataSetChanged();
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        StorySceneItemHolder storySceneItemHolder;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f74034a, false, 85959, new Class[]{ViewGroup.class, Integer.TYPE}, StorySceneItemHolder.class)) {
            storySceneItemHolder = (StorySceneItemHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f74034a, false, 85959, new Class[]{ViewGroup.class, Integer.TYPE}, StorySceneItemHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.rg, viewGroup, false);
            s<g> sVar = this.f74039f;
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            storySceneItemHolder = new StorySceneItemHolder(sVar, inflate, this.g);
        }
        return storySceneItemHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        StorySceneItemHolder storySceneItemHolder = (StorySceneItemHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{storySceneItemHolder, Integer.valueOf(i)}, this, f74034a, false, 85961, new Class[]{StorySceneItemHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storySceneItemHolder, Integer.valueOf(i)}, this, f74034a, false, 85961, new Class[]{StorySceneItemHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storySceneItemHolder, "holder");
        if (i2 == 0 && this.f74036c) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(1.15f)}, storySceneItemHolder, StorySceneItemHolder.f74010a, false, 85914, new Class[]{Float.TYPE}, Void.TYPE)) {
                StorySceneItemHolder storySceneItemHolder2 = storySceneItemHolder;
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(1.15f)}, storySceneItemHolder2, StorySceneItemHolder.f74010a, false, 85914, new Class[]{Float.TYPE}, Void.TYPE);
            } else {
                View view = storySceneItemHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                view.setScaleX(1.15f);
                View view2 = storySceneItemHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                view2.setScaleY(1.15f);
            }
            this.f74036c = false;
        }
        ah ahVar = this.f74037d.get(i2);
        Function1 aVar = new a(this, i2);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), ahVar, aVar}, storySceneItemHolder, StorySceneItemHolder.f74010a, false, 85912, new Class[]{Integer.TYPE, ah.class, Function1.class}, Void.TYPE)) {
            StorySceneItemHolder storySceneItemHolder3 = storySceneItemHolder;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), ahVar, aVar}, storySceneItemHolder3, StorySceneItemHolder.f74010a, false, 85912, new Class[]{Integer.TYPE, ah.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(ahVar, "effect");
        Intrinsics.checkParameterIsNotNull(aVar, "onItemClick");
        storySceneItemHolder.f74012c = i2;
        storySceneItemHolder.itemView.setOnClickListener(new a(aVar));
        storySceneItemHolder.a(ahVar);
        Effect effect = ahVar.f69295b;
        if (effect != null) {
            UrlModel urlModel = effect.icon_url;
            if (urlModel != null) {
                List<String> list = urlModel.url_list;
                if (list != null) {
                    String str = list.get(0);
                    if (str != null) {
                        c.a(storySceneItemHolder.f74011b, str);
                    }
                }
            }
        }
    }

    public StorySceneRecyclerAdapter(@NotNull s<g> sVar, @NotNull RecyclerView recyclerView, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(sVar, "effectPlatform");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(function1, "onStickerDownload");
        this.f74039f = sVar;
        this.f74038e = recyclerView;
        this.g = function1;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        List list2 = list;
        StorySceneItemHolder storySceneItemHolder = (StorySceneItemHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{storySceneItemHolder, Integer.valueOf(i), list2}, this, f74034a, false, 85962, new Class[]{StorySceneItemHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storySceneItemHolder, Integer.valueOf(i), list2}, this, f74034a, false, 85962, new Class[]{StorySceneItemHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storySceneItemHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        if (list.isEmpty()) {
            super.onBindViewHolder(storySceneItemHolder, i, list2);
            return;
        }
        Object obj = list2.get(0);
        if (obj != null) {
            ah ahVar = (ah) obj;
            if (PatchProxy.isSupport(new Object[]{ahVar}, storySceneItemHolder, StorySceneItemHolder.f74010a, false, 85913, new Class[]{ah.class}, Void.TYPE)) {
                StorySceneItemHolder storySceneItemHolder2 = storySceneItemHolder;
                PatchProxy.accessDispatch(new Object[]{ahVar}, storySceneItemHolder2, StorySceneItemHolder.f74010a, false, 85913, new Class[]{ah.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(ahVar, "stickerWrapper");
            storySceneItemHolder.a(ahVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper");
    }
}
