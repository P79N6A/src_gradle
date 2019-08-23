package com.bytedance.android.livesdk.wallet;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.z;
import com.bytedance.android.livesdk.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001e\u001fB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/bytedance/android/livesdk/wallet/ReChargeHalDialogListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "list", "", "Lcom/bytedance/android/livesdkapi/depend/model/ChargeDeal;", "mOnClickDeal", "Lcom/bytedance/android/livesdk/wallet/ReChargeHalDialogListAdapter$OnClickDealListener;", "recentDealId", "", "(Ljava/util/List;Lcom/bytedance/android/livesdk/wallet/ReChargeHalDialogListAdapter$OnClickDealListener;J)V", "getList", "()Ljava/util/List;", "getMOnClickDeal", "()Lcom/bytedance/android/livesdk/wallet/ReChargeHalDialogListAdapter$OnClickDealListener;", "getRecentDealId", "()J", "getItemCount", "", "onBindViewHolder", "", "rclHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "Companion", "OnClickDealListener", "RechargeViewHolder", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class ReChargeHalDialogListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17787a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f17788e = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final List<com.bytedance.android.livesdkapi.depend.model.a> f17789b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final b f17790c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17791d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bytedance/android/livesdk/wallet/ReChargeHalDialogListAdapter$RechargeViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "tvDiamond", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvDiamond", "()Landroid/widget/TextView;", "tvGivingCount", "getTvGivingCount", "tvPrice", "getTvPrice", "tvStrategy", "getTvStrategy", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class RechargeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f17792a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f17793b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f17794c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f17795d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RechargeViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f17792a = (TextView) view.findViewById(C0906R.id.a4q);
            this.f17793b = (TextView) view.findViewById(C0906R.id.c5s);
            this.f17794c = (TextView) view.findViewById(C0906R.id.a3m);
            this.f17795d = (TextView) view.findViewById(C0906R.id.dk1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/android/livesdk/wallet/ReChargeHalDialogListAdapter$Companion;", "", "()V", "CHARGE_100F", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/android/livesdk/wallet/ReChargeHalDialogListAdapter$OnClickDealListener;", "", "onClickDeal", "", "deal", "Lcom/bytedance/android/livesdkapi/depend/model/ChargeDeal;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public interface b {
        void a(@NotNull com.bytedance.android.livesdkapi.depend.model.a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReChargeHalDialogListAdapter f17797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a f17798c;

        c(ReChargeHalDialogListAdapter reChargeHalDialogListAdapter, com.bytedance.android.livesdkapi.depend.model.a aVar) {
            this.f17797b = reChargeHalDialogListAdapter;
            this.f17798c = aVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f17796a, false, 14036, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f17796a, false, 14036, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f17797b.f17790c.a(this.f17798c);
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f17787a, false, 14033, new Class[0], Integer.TYPE)) {
            return this.f17789b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f17787a, false, 14033, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f17787a, false, 14032, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f17787a, false, 14032, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ak9, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…og_item_b, parent, false)");
        return new RechargeViewHolder(inflate);
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f17787a, false, 14034, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f17787a, false, 14034, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "rclHolder");
        com.bytedance.android.livesdkapi.depend.model.a aVar = this.f17789b.get(i);
        RechargeViewHolder rechargeViewHolder = (RechargeViewHolder) viewHolder;
        if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.b()) {
            Drawable c2 = ac.c(2130841132);
            Intrinsics.checkExpressionValueIsNotNull(c2, "coinIcon");
            c2.setBounds(new Rect(0, 0, ac.a(16.0f), ac.a(16.0f)));
            TextView textView = rechargeViewHolder.f17792a;
            Intrinsics.checkExpressionValueIsNotNull(textView, "holder.tvDiamond");
            textView.setCompoundDrawablePadding(ac.a(1.0f));
            rechargeViewHolder.f17792a.setCompoundDrawables(c2, null, null, null);
        }
        TextView textView2 = rechargeViewHolder.f17795d;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.tvStrategy");
        if (this.f17791d == aVar.f18678a) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        String a2 = n.a("%.2f", Float.valueOf(((float) aVar.f18679b) / 100.0f));
        TextView textView3 = rechargeViewHolder.f17793b;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.tvPrice");
        textView3.setText(ac.a((int) C0906R.string.di8, a2));
        TextView textView4 = rechargeViewHolder.f17792a;
        Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.tvDiamond");
        textView4.setText(String.valueOf(aVar.f18682e) + "  ");
        if (aVar.f18683f <= 0) {
            TextView textView5 = rechargeViewHolder.f17794c;
            Intrinsics.checkExpressionValueIsNotNull(textView5, "holder.tvGivingCount");
            textView5.setVisibility(4);
        } else {
            TextView textView6 = rechargeViewHolder.f17794c;
            Intrinsics.checkExpressionValueIsNotNull(textView6, "holder.tvGivingCount");
            textView6.setText(ac.a((int) C0906R.string.dhi, String.valueOf(aVar.f18683f)));
            TextView textView7 = rechargeViewHolder.f17794c;
            Intrinsics.checkExpressionValueIsNotNull(textView7, "holder.tvGivingCount");
            textView7.setVisibility(0);
        }
        rechargeViewHolder.itemView.setOnTouchListener(new z());
        rechargeViewHolder.itemView.setOnClickListener(new c(this, aVar));
    }

    public ReChargeHalDialogListAdapter(@NotNull List<com.bytedance.android.livesdkapi.depend.model.a> list, @NotNull b bVar, long j) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnClickDeal");
        this.f17789b = list;
        this.f17790c = bVar;
        this.f17791d = j;
    }
}
