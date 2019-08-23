package com.bytedance.android.livesdk.effect.beauty.smallitem;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.effect.k;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$LiveSmallItemViewHolder;", "()V", "TAG", "", "beautyDownloadCallback", "com/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$beautyDownloadCallback$1", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$beautyDownloadCallback$1;", "listener", "Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$OnSelectItemChangeListener;", "selectIndex", "", "stickerList", "", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "getItemCount", "onBindViewHolder", "", "viewHolder", "index", "onCreateViewHolder", "view", "Landroid/view/ViewGroup;", "type", "setData", "list", "setOnSelectItemChangeListener", "LiveSmallItemViewHolder", "OnSelectItemChangeListener", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class LiveSmallItemBeautyAdapter extends RecyclerView.Adapter<LiveSmallItemViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13730a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends com.bytedance.android.livesdk.sticker.b.a> f13731b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f13732c;

    /* renamed from: d  reason: collision with root package name */
    public a f13733d;

    /* renamed from: e  reason: collision with root package name */
    private final String f13734e = "LiveSmallItemBeautyAdapter";

    /* renamed from: f  reason: collision with root package name */
    private final b f13735f = new b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$LiveSmallItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;Landroid/view/View;)V", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public final class LiveSmallItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyAdapter f13736a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LiveSmallItemViewHolder(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter, @NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f13736a = liveSmallItemBeautyAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$OnSelectItemChangeListener;", "", "onChange", "", "sticker", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public interface a {
        void a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/android/livesdk/effect/beauty/smallitem/LiveSmallItemBeautyAdapter$beautyDownloadCallback$1", "Lcom/bytedance/android/livesdk/effect/LiveSmallItemBeautyHelper$LiveBeautyDownloadCallback;", "onError", "", "onSuccess", "sticker", "Lcom/bytedance/android/livesdk/sticker/model/Sticker;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b implements k.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyAdapter f13738b;

        b(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter) {
            this.f13738b = liveSmallItemBeautyAdapter;
        }

        public final void a(@NotNull com.bytedance.android.livesdk.sticker.b.a aVar) {
            com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f13737a, false, 8243, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13737a, false, 8243, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "sticker");
            this.f13738b.notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13739a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemBeautyAdapter f13740b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LiveSmallItemViewHolder f13741c;

        c(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter, LiveSmallItemViewHolder liveSmallItemViewHolder) {
            this.f13740b = liveSmallItemBeautyAdapter;
            this.f13741c = liveSmallItemViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f13739a, false, 8244, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f13739a, false, 8244, new Class[]{View.class}, Void.TYPE);
                return;
            }
            int adapterPosition = this.f13741c.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f13740b.f13731b.size()) {
                com.bytedance.android.livesdk.effect.b p = j.q().p();
                Intrinsics.checkExpressionValueIsNotNull(p, "LiveInternalService.inst().liveEffectService()");
                if (p.a().a((com.bytedance.android.livesdk.sticker.b.a) this.f13740b.f13731b.get(adapterPosition))) {
                    this.f13740b.f13732c = adapterPosition;
                    a aVar = this.f13740b.f13733d;
                    if (aVar != null) {
                        aVar.a((com.bytedance.android.livesdk.sticker.b.a) this.f13740b.f13731b.get(this.f13740b.f13732c));
                    }
                    this.f13740b.notifyDataSetChanged();
                }
            }
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f13730a, false, 8239, new Class[0], Integer.TYPE)) {
            return this.f13731b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f13730a, false, 8239, new Class[0], Integer.TYPE)).intValue();
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LiveSmallItemViewHolder liveSmallItemViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f13730a, false, 8238, new Class[]{ViewGroup.class, Integer.TYPE}, LiveSmallItemViewHolder.class)) {
            liveSmallItemViewHolder = (LiveSmallItemViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f13730a, false, 8238, new Class[]{ViewGroup.class, Integer.TYPE}, LiveSmallItemViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "view");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aj1, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(view…_small_item, view, false)");
            liveSmallItemViewHolder = new LiveSmallItemViewHolder(this, inflate);
        }
        return liveSmallItemViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ImageModel imageModel;
        int i2 = i;
        LiveSmallItemViewHolder liveSmallItemViewHolder = (LiveSmallItemViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{liveSmallItemViewHolder, Integer.valueOf(i)}, this, f13730a, false, 8240, new Class[]{LiveSmallItemViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveSmallItemViewHolder, Integer.valueOf(i)}, this, f13730a, false, 8240, new Class[]{LiveSmallItemViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(liveSmallItemViewHolder, "viewHolder");
        if (this.f13732c == i2) {
            View view = liveSmallItemViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
            View findViewById = view.findViewById(C0906R.id.lx);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "viewHolder.itemView.border");
            findViewById.setVisibility(0);
            View view2 = liveSmallItemViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "viewHolder.itemView");
            ((TextView) view2.findViewById(C0906R.id.df7)).setTextColor(Color.parseColor("#ffc95c"));
        } else {
            View view3 = liveSmallItemViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "viewHolder.itemView");
            View findViewById2 = view3.findViewById(C0906R.id.lx);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "viewHolder.itemView.border");
            findViewById2.setVisibility(4);
            View view4 = liveSmallItemViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "viewHolder.itemView");
            ((TextView) view4.findViewById(C0906R.id.df7)).setTextColor(Color.parseColor("#ffffffff"));
        }
        View view5 = liveSmallItemViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "viewHolder.itemView");
        HSImageView hSImageView = (HSImageView) view5.findViewById(C0906R.id.az5);
        f fVar = ((com.bytedance.android.livesdk.sticker.b.a) this.f13731b.get(i2)).f17250b;
        Intrinsics.checkExpressionValueIsNotNull(fVar, "stickerList[index].icon");
        String str = fVar.f7710b;
        f fVar2 = ((com.bytedance.android.livesdk.sticker.b.a) this.f13731b.get(i2)).f17250b;
        Intrinsics.checkExpressionValueIsNotNull(fVar2, "stickerList[index].icon");
        List<String> list = fVar2.f7711c;
        if (PatchProxy.isSupport(new Object[]{str, list}, null, h.f17284a, true, 13363, new Class[]{String.class, List.class}, ImageModel.class)) {
            imageModel = (ImageModel) PatchProxy.accessDispatch(new Object[]{str, list}, null, h.f17284a, true, 13363, new Class[]{String.class, List.class}, ImageModel.class);
        } else {
            ImageModel imageModel2 = new ImageModel();
            imageModel2.setUri(str);
            imageModel2.setUrls(list);
            imageModel = imageModel2;
        }
        com.bytedance.android.livesdk.chatroom.f.b.b(hSImageView, imageModel);
        View view6 = liveSmallItemViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "viewHolder.itemView");
        TextView textView = (TextView) view6.findViewById(C0906R.id.df7);
        Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.itemView.tv_name");
        textView.setText(((com.bytedance.android.livesdk.sticker.b.a) this.f13731b.get(i2)).f17253e);
        com.bytedance.android.livesdk.effect.b p = j.q().p();
        Intrinsics.checkExpressionValueIsNotNull(p, "LiveInternalService.inst().liveEffectService()");
        if (p.a().a((com.bytedance.android.livesdk.sticker.b.a) this.f13731b.get(i2))) {
            View view7 = liveSmallItemViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "viewHolder.itemView");
            ImageView imageView = (ImageView) view7.findViewById(C0906R.id.b2w);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "viewHolder.itemView.iv_loading");
            imageView.setVisibility(8);
        } else {
            View view8 = liveSmallItemViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "viewHolder.itemView");
            ImageView imageView2 = (ImageView) view8.findViewById(C0906R.id.b2w);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "viewHolder.itemView.iv_loading");
            imageView2.setVisibility(0);
            com.bytedance.android.livesdk.effect.b p2 = j.q().p();
            Intrinsics.checkExpressionValueIsNotNull(p2, "LiveInternalService.inst().liveEffectService()");
            p2.b().a((com.bytedance.android.livesdk.sticker.b.a) this.f13731b.get(i2), (k.b) this.f13735f);
        }
        liveSmallItemViewHolder.itemView.setOnClickListener(new c(this, liveSmallItemViewHolder));
    }
}
