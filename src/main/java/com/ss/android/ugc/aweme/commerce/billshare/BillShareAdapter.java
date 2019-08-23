package com.ss.android.ugc.aweme.commerce.billshare;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.billshare.BillShareVideoHolder;
import com.ss.android.ugc.aweme.commerce.service.l.j;
import com.ss.android.ugc.aweme.commerce.service.l.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bb\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001bH\u0016R(\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0018j\b\u0012\u0004\u0012\u00020\u0007`\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareVideoHolder;", "goods", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "uid", "", "acb", "Lkotlin/Function3;", "Landroid/view/View;", "", "logCB", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "video", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "topAweme", "getTopAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setTopAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "watchList", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BillShareAdapter extends RecyclerView.Adapter<BillShareVideoHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36715a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Aweme f36716b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<String> f36717c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private List<? extends Aweme> f36718d;

    /* renamed from: e  reason: collision with root package name */
    private String f36719e;

    /* renamed from: f  reason: collision with root package name */
    private Function3<? super Aweme, ? super View, ? super String, Unit> f36720f;
    private Function1<? super Aweme, Unit> g;

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f36715a, false, 27979, new Class[0], Integer.TYPE)) {
            return this.f36718d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36715a, false, 27979, new Class[0], Integer.TYPE)).intValue();
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BillShareVideoHolder billShareVideoHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f36715a, false, 27981, new Class[]{ViewGroup.class, Integer.TYPE}, BillShareVideoHolder.class)) {
            billShareVideoHolder = (BillShareVideoHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f36715a, false, 27981, new Class[]{ViewGroup.class, Integer.TYPE}, BillShareVideoHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            billShareVideoHolder = new BillShareVideoHolder(viewGroup2);
        }
        return billShareVideoHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        UrlModel urlModel;
        int i2;
        int i3;
        BillShareVideoHolder billShareVideoHolder = (BillShareVideoHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{billShareVideoHolder, Integer.valueOf(i)}, this, f36715a, false, 27980, new Class[]{BillShareVideoHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{billShareVideoHolder, Integer.valueOf(i)}, this, f36715a, false, 27980, new Class[]{BillShareVideoHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(billShareVideoHolder, "holder");
        Aweme aweme = (Aweme) this.f36718d.get(i);
        String str2 = this.f36719e;
        Function3<? super Aweme, ? super View, ? super String, Unit> function3 = this.f36720f;
        CharSequence aid = aweme.getAid();
        Aweme aweme2 = this.f36716b;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        boolean equals = TextUtils.equals(aid, str);
        if (PatchProxy.isSupport(new Object[]{aweme, str2, function3, Byte.valueOf(equals ? (byte) 1 : 0)}, billShareVideoHolder, BillShareVideoHolder.f36721a, false, 28001, new Class[]{Aweme.class, String.class, Function3.class, Boolean.TYPE}, Void.TYPE)) {
            BillShareVideoHolder billShareVideoHolder2 = billShareVideoHolder;
            PatchProxy.accessDispatch(new Object[]{aweme, str2, function3, Byte.valueOf(equals)}, billShareVideoHolder2, BillShareVideoHolder.f36721a, false, 28001, new Class[]{Aweme.class, String.class, Function3.class, Boolean.TYPE}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(aweme, "aweme");
            Intrinsics.checkParameterIsNotNull(str2, "uid");
            View view = billShareVideoHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            c.a((RemoteImageView) (LinearGradientDraweeView) view.findViewById(C0906R.id.wv), aweme.getDynamicPreferredCover());
            View view2 = billShareVideoHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            AvatarImageView avatarImageView = (AvatarImageView) view2.findViewById(C0906R.id.xa);
            User author = aweme.getAuthor();
            if (author != null) {
                urlModel = author.getAvatarMedium();
            } else {
                urlModel = null;
            }
            c.b(avatarImageView, urlModel);
            View view3 = billShareVideoHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view3.findViewById(C0906R.id.x9);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.commerce_preview_promotion_title");
            dmtTextView.setText(aweme.getDesc());
            User author2 = aweme.getAuthor();
            Intrinsics.checkExpressionValueIsNotNull(author2, "aweme.author");
            String nickname = author2.getNickname();
            if (nickname != null) {
                View view4 = billShareVideoHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                DmtTextView dmtTextView2 = (DmtTextView) view4.findViewById(C0906R.id.x_);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "itemView.commerce_preview_title");
                dmtTextView2.setText(nickname);
            }
            View view5 = billShareVideoHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            DmtTextView dmtTextView3 = (DmtTextView) view5.findViewById(C0906R.id.x8);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "itemView.commerce_preview_heart_count");
            m.a aVar = m.f38042b;
            AwemeStatistics statistics = aweme.getStatistics();
            Intrinsics.checkExpressionValueIsNotNull(statistics, "aweme.statistics");
            dmtTextView3.setText(aVar.a((long) statistics.getDiggCount()));
            if (PatchProxy.isSupport(new Object[]{aweme}, billShareVideoHolder, BillShareVideoHolder.f36721a, false, 28002, new Class[]{Aweme.class}, Void.TYPE)) {
                BillShareVideoHolder billShareVideoHolder3 = billShareVideoHolder;
                PatchProxy.accessDispatch(new Object[]{aweme}, billShareVideoHolder3, BillShareVideoHolder.f36721a, false, 28002, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                Video video = aweme.getVideo();
                int i4 = 100;
                if (video != null) {
                    i2 = video.getWidth();
                } else {
                    i2 = 100;
                }
                Video video2 = aweme.getVideo();
                if (video2 != null) {
                    i3 = video2.getHeight();
                } else {
                    i3 = 100;
                }
                if (i2 == 0) {
                    i2 = 100;
                }
                if (i3 != 0) {
                    i4 = i3;
                }
                View view6 = billShareVideoHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                ((RelativeLayout) view6.findViewById(C0906R.id.wu)).getLayoutParams().height = (j.f38032c * i4) / i2;
            }
            billShareVideoHolder.itemView.setOnClickListener(new BillShareVideoHolder.b(billShareVideoHolder, function3, aweme, str2));
            View view7 = billShareVideoHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ((AvatarImageView) view7.findViewById(C0906R.id.xa)).setOnClickListener(new BillShareVideoHolder.c(aweme));
            View view8 = billShareVideoHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            ((DmtTextView) view8.findViewById(C0906R.id.x_)).setOnClickListener(new BillShareVideoHolder.d(aweme));
            View view9 = billShareVideoHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ((LinearGradientDraweeView) view9.findViewById(C0906R.id.wv)).d();
            if (equals) {
                View view10 = billShareVideoHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                ((ImageView) view10.findViewById(C0906R.id.dh5)).setImageResource(2130838858);
                View view11 = billShareVideoHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
                ImageView imageView = (ImageView) view11.findViewById(C0906R.id.dh5);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.tv_recommend_or_stick");
                imageView.setVisibility(0);
            } else if (aweme.isOrderShareRecommend()) {
                View view12 = billShareVideoHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
                ((ImageView) view12.findViewById(C0906R.id.dh5)).setImageResource(2130838857);
                View view13 = billShareVideoHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
                ImageView imageView2 = (ImageView) view13.findViewById(C0906R.id.dh5);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.tv_recommend_or_stick");
                imageView2.setVisibility(0);
            } else {
                View view14 = billShareVideoHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
                ImageView imageView3 = (ImageView) view14.findViewById(C0906R.id.dh5);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "itemView.tv_recommend_or_stick");
                imageView3.setVisibility(8);
            }
        }
        if (!this.f36717c.contains(aweme.getAid())) {
            Function1<? super Aweme, Unit> function1 = this.g;
            if (function1 != null) {
                function1.invoke(aweme);
            }
            this.f36717c.add(aweme.getAid());
        }
    }

    public BillShareAdapter(@NotNull List<? extends Aweme> list, @NotNull String str, @Nullable Function3<? super Aweme, ? super View, ? super String, Unit> function3, @Nullable Function1<? super Aweme, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(list, "goods");
        Intrinsics.checkParameterIsNotNull(str, "uid");
        this.f36718d = list;
        this.f36719e = str;
        this.f36720f = function3;
        this.g = function1;
    }
}
