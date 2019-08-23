package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c;
import com.ss.android.ugc.aweme.commerce.service.l.h;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\fJ\u0014\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelViewHolder;", "anchorInfo", "Lcom/ss/android/ugc/aweme/profile/model/User;", "fragment", "Landroid/support/v4/app/Fragment;", "(Lcom/ss/android/ugc/aweme/profile/model/User;Landroid/support/v4/app/Fragment;)V", "mSkuList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "mSkuPanelItemHandler", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter$ISkuPanelItemHandler;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "setSkuPanelItemHandler", "skuPanelItemHandler", "setUISkuInfoList", "goodsList", "", "Companion", "ISkuPanelItemHandler", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class SkuPanelAdapter extends RecyclerView.Adapter<SkuPanelViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37758a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f37759d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public List<ak> f37760b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public b f37761c;

    /* renamed from: e  reason: collision with root package name */
    private final User f37762e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f37763f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter$Companion;", "", "()V", "ITEM_SCREEN_WIDTH_RATIO", "", "PAYLOAD_UPDATA_APPOINTMENT_STATUS", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH&J\"\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J=\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter$ISkuPanelItemHandler;", "", "clickAddToCart", "", "mProduct", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "clickBuy", "clickConsultation", "clickCouponButton", "buttonUnfold", "", "clickInProductCoupon", "coupon_id", "", "onAddCartSuccess", "cartCount", "", "productImgLocation", "Landroid/graphics/Rect;", "snapshotBitmap", "Landroid/graphics/Bitmap;", "startPreview", "product", "context", "Landroid/content/Context;", "fragment", "Landroid/support/v4/app/Fragment;", "requestCode", "action", "(Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;Landroid/content/Context;Landroid/support/v4/app/Fragment;Ljava/lang/Integer;Ljava/lang/String;)V", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(int i, @NotNull Rect rect, @Nullable Bitmap bitmap);

        void a(@Nullable ak akVar);

        void a(@NotNull ak akVar, @NotNull Context context, @NotNull Fragment fragment, @Nullable Integer num, @Nullable String str);

        void a(@Nullable ak akVar, @NotNull String str);

        void a(@Nullable ak akVar, boolean z);

        void b(@Nullable ak akVar);

        void c(@Nullable ak akVar);
    }

    public final int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f37758a, false, 29332, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37758a, false, 29332, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f37760b.size() == 0) {
            return 1;
        } else {
            return this.f37760b.size();
        }
    }

    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        SkuPanelViewHolder skuPanelViewHolder = (SkuPanelViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{skuPanelViewHolder}, this, f37758a, false, 29333, new Class[]{SkuPanelViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{skuPanelViewHolder}, this, f37758a, false, 29333, new Class[]{SkuPanelViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(skuPanelViewHolder, "holder");
        skuPanelViewHolder.p = true;
    }

    public final /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        SkuPanelViewHolder skuPanelViewHolder = (SkuPanelViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{skuPanelViewHolder}, this, f37758a, false, 29334, new Class[]{SkuPanelViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{skuPanelViewHolder}, this, f37758a, false, 29334, new Class[]{SkuPanelViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(skuPanelViewHolder, "holder");
        skuPanelViewHolder.p = false;
    }

    public final /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        SkuPanelViewHolder skuPanelViewHolder = (SkuPanelViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{skuPanelViewHolder}, this, f37758a, false, 29335, new Class[]{SkuPanelViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{skuPanelViewHolder}, this, f37758a, false, 29335, new Class[]{SkuPanelViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(skuPanelViewHolder, "holder");
        if (PatchProxy.isSupport(new Object[0], skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29403, new Class[0], Void.TYPE);
            return;
        }
        h d2 = c.d();
        if (d2 != null) {
            d2.a(skuPanelViewHolder.m);
        }
        skuPanelViewHolder.n = null;
    }

    public SkuPanelAdapter(@Nullable User user, @NotNull Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f37762e = user;
        this.f37763f = fragment;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SkuPanelViewHolder skuPanelViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37758a, false, 29329, new Class[]{ViewGroup.class, Integer.TYPE}, SkuPanelViewHolder.class)) {
            skuPanelViewHolder = (SkuPanelViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37758a, false, 29329, new Class[]{ViewGroup.class, Integer.TYPE}, SkuPanelViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            skuPanelViewHolder = new SkuPanelViewHolder(viewGroup2);
            skuPanelViewHolder.i = this.f37761c;
        }
        return skuPanelViewHolder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(@NotNull SkuPanelViewHolder skuPanelViewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{skuPanelViewHolder, Integer.valueOf(i)}, this, f37758a, false, 29330, new Class[]{SkuPanelViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{skuPanelViewHolder, Integer.valueOf(i)}, this, f37758a, false, 29330, new Class[]{SkuPanelViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(skuPanelViewHolder, "holder");
        if (this.f37760b.size() == 0) {
            skuPanelViewHolder.a(this.f37763f, (ak) null, i, getItemCount(), this.f37762e, this);
            return;
        }
        if (i < this.f37760b.size()) {
            skuPanelViewHolder.a(this.f37763f, this.f37760b.get(i), i, getItemCount(), this.f37762e, this);
        }
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        int i2 = i;
        List list2 = list;
        SkuPanelViewHolder skuPanelViewHolder = (SkuPanelViewHolder) viewHolder;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{skuPanelViewHolder, Integer.valueOf(i), list2}, this, f37758a, false, 29331, new Class[]{SkuPanelViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{skuPanelViewHolder, Integer.valueOf(i), list2}, this, f37758a, false, 29331, new Class[]{SkuPanelViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(skuPanelViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(skuPanelViewHolder, i2);
            return;
        }
        if (Intrinsics.areEqual((Object) list2.get(0).toString(), (Object) "updateAppointmentStatus")) {
            ak akVar = this.f37760b.get(i2);
            if (PatchProxy.isSupport(new Object[]{akVar}, skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29390, new Class[]{ak.class}, Void.TYPE)) {
                SkuPanelViewHolder skuPanelViewHolder2 = skuPanelViewHolder;
                PatchProxy.accessDispatch(new Object[]{akVar}, skuPanelViewHolder2, SkuPanelViewHolder.f37767a, false, 29390, new Class[]{ak.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(akVar, "good");
            PromotionAppointment promotionAppointment = akVar.v;
            if (promotionAppointment != null) {
                z = promotionAppointment.isAppointment();
            }
            if (z) {
                TextView i3 = skuPanelViewHolder.i();
                View view = skuPanelViewHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                i3.setText(view.getContext().getString(C0906R.string.fu));
                return;
            }
            TextView i4 = skuPanelViewHolder.i();
            View view2 = skuPanelViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            i4.setText(view2.getContext().getString(C0906R.string.fw));
        }
    }
}
