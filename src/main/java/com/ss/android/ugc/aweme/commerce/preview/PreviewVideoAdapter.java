package com.ss.android.ugc.aweme.commerce.preview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.floatvideo.h;
import com.ss.android.ugc.aweme.commerce.preview.PreviewVideoHolderV2;
import com.ss.android.ugc.aweme.commerce.service.l.e;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.l.j;
import com.ss.android.ugc.aweme.commerce.service.l.m;
import com.ss.android.ugc.aweme.commerce.service.models.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bh\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R.\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewVideoAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "goods", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "uid", "", "acb", "Lkotlin/Function4;", "Landroid/view/View;", "", "", "logCB", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "video", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;)V", "watchList", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewVideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37258a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<String> f37259b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private List<? extends Aweme> f37260c;

    /* renamed from: d  reason: collision with root package name */
    private String f37261d;

    /* renamed from: e  reason: collision with root package name */
    private Function4<? super Aweme, ? super View, ? super String, ? super Boolean, Unit> f37262e;

    /* renamed from: f  reason: collision with root package name */
    private Function1<? super Aweme, Unit> f37263f;

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f37258a, false, 28788, new Class[0], Integer.TYPE)) {
            return this.f37260c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37258a, false, 28788, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37258a, false, 28790, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37258a, false, 28790, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        return new PreviewVideoHolderV2(viewGroup2);
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        UrlModel urlModel;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f37258a, false, 28789, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f37258a, false, 28789, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Aweme aweme = (Aweme) this.f37260c.get(i);
        PreviewVideoHolderV2 previewVideoHolderV2 = (PreviewVideoHolderV2) viewHolder2;
        String str = this.f37261d;
        Function4<? super Aweme, ? super View, ? super String, ? super Boolean, Unit> function4 = this.f37262e;
        if (PatchProxy.isSupport(new Object[]{aweme, str, function4}, previewVideoHolderV2, PreviewVideoHolderV2.f37264a, false, 28791, new Class[]{Aweme.class, String.class, Function4.class}, Void.TYPE)) {
            PreviewVideoHolderV2 previewVideoHolderV22 = previewVideoHolderV2;
            PatchProxy.accessDispatch(new Object[]{aweme, str, function4}, previewVideoHolderV22, PreviewVideoHolderV2.f37264a, false, 28791, new Class[]{Aweme.class, String.class, Function4.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(aweme, "aweme");
            Intrinsics.checkParameterIsNotNull(str, "uid");
            previewVideoHolderV2.f37266b = aweme;
            if (aweme.getPromotion() != null && !Intrinsics.areEqual((Object) aweme, previewVideoHolderV2.itemView.getTag(2130838470))) {
                if (PatchProxy.isSupport(new Object[0], previewVideoHolderV2, PreviewVideoHolderV2.f37264a, false, 28793, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], previewVideoHolderV2, PreviewVideoHolderV2.f37264a, false, 28793, new Class[0], Void.TYPE);
                } else {
                    View view = previewVideoHolderV2.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0906R.id.arp);
                    View childAt = relativeLayout.getChildAt(relativeLayout.getChildCount() - 1);
                    if (childAt instanceof h) {
                        relativeLayout.removeView(childAt);
                    }
                }
                x promotion = aweme.getPromotion();
                if (promotion == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(promotion, "aweme.promotion!!");
                View view2 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                DmtTextView dmtTextView = (DmtTextView) view2.findViewById(C0906R.id.c4k);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.portfolio_title");
                dmtTextView.setText(promotion.getLongTitle());
                View view3 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                ((RelativeLayout) view3.findViewById(C0906R.id.arp)).getLayoutParams().height = j.f38032c;
                List<UrlModel> elasticImages = promotion.getElasticImages();
                if (elasticImages != null && (!elasticImages.isEmpty())) {
                    View view4 = previewVideoHolderV2.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                    RemoteImageView remoteImageView = (RemoteImageView) view4.findViewById(C0906R.id.c4e);
                    List<UrlModel> elasticImages2 = promotion.getElasticImages();
                    if (elasticImages2 != null) {
                        urlModel = elasticImages2.get(0);
                    } else {
                        urlModel = null;
                    }
                    c.b(remoteImageView, urlModel);
                }
                List<String> labels = promotion.getLabels();
                if (!labels.isEmpty()) {
                    View view5 = previewVideoHolderV2.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                    TagFlowLayout tagFlowLayout = (TagFlowLayout) view5.findViewById(C0906R.id.c4f);
                    Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout, "itemView.portfolio_item_you_tags");
                    tagFlowLayout.setVisibility(0);
                    View view6 = previewVideoHolderV2.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                    TagFlowLayout tagFlowLayout2 = (TagFlowLayout) view6.findViewById(C0906R.id.c4f);
                    Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout2, "itemView.portfolio_item_you_tags");
                    tagFlowLayout2.setAdapter(new PreviewVideoHolderV2.b(labels, labels, previewVideoHolderV2));
                } else {
                    View view7 = previewVideoHolderV2.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                    TagFlowLayout tagFlowLayout3 = (TagFlowLayout) view7.findViewById(C0906R.id.c4f);
                    Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout3, "itemView.portfolio_item_you_tags");
                    tagFlowLayout3.setVisibility(8);
                }
                SpannableString spannableString = new SpannableString(e.f38011b.a(promotion.getPrice()));
                k.a(spannableString, new RelativeSizeSpan(0.7f), 0, 1, 33);
                View view8 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                DmtTextView dmtTextView2 = (DmtTextView) view8.findViewById(C0906R.id.c5y);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "itemView.price_view");
                dmtTextView2.setText(spannableString);
                View view9 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                DmtTextView dmtTextView3 = (DmtTextView) view9.findViewById(C0906R.id.dhv);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "itemView.tv_sales");
                g.a aVar = g.f38016b;
                View view10 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                Context context = view10.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                dmtTextView3.setText(aVar.a(context, C0906R.string.bci, m.f38042b.a((long) promotion.getSales())));
                previewVideoHolderV2.itemView.setOnClickListener(new PreviewVideoHolderV2.c(previewVideoHolderV2, function4, aweme, str));
                View view11 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
                ((RelativeLayout) view11.findViewById(C0906R.id.arp)).setOnClickListener(new PreviewVideoHolderV2.d(previewVideoHolderV2, function4, aweme, str));
                View view12 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
                DmtTextView dmtTextView4 = (DmtTextView) view12.findViewById(C0906R.id.d32);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "itemView.time_span");
                Video video = aweme.getVideo();
                Intrinsics.checkExpressionValueIsNotNull(video, "aweme.video");
                dmtTextView4.setText(previewVideoHolderV2.a((long) video.getDuration()));
                View view13 = previewVideoHolderV2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
                view13.findViewById(C0906R.id.es).setBackgroundResource(2130838471);
                previewVideoHolderV2.itemView.setTag(2130838470, aweme);
            }
        }
        if (!this.f37259b.contains(aweme.getAid())) {
            Function1<? super Aweme, Unit> function1 = this.f37263f;
            if (function1 != null) {
                function1.invoke(aweme);
            }
            this.f37259b.add(aweme.getAid());
        }
    }

    public PreviewVideoAdapter(@NotNull List<? extends Aweme> list, @NotNull String str, @Nullable Function4<? super Aweme, ? super View, ? super String, ? super Boolean, Unit> function4, @Nullable Function1<? super Aweme, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(list, "goods");
        Intrinsics.checkParameterIsNotNull(str, "uid");
        this.f37260c = list;
        this.f37261d = str;
        this.f37262e = function4;
        this.f37263f = function1;
    }
}
