package com.ss.android.ugc.aweme.commerce.collection;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.commerce.preview.h;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.l.j;
import com.ss.android.ugc.aweme.commerce.service.l.m;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodListAdapter;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseSingleTypeAdapter;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "getParent", "()Landroid/arch/lifecycle/LifecycleOwner;", "createViewHolder", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Landroid/view/ViewGroup;", "CollectionGoodViewHolder", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CollectionGoodListAdapter extends JediBaseSingleTypeAdapter<CollectionGood> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f36847f;
    public static final a h = new a((byte) 0);
    @NotNull
    public final LifecycleOwner g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodListAdapter$CollectionGoodViewHolder;", "Lcom/bytedance/jedi/ext/adapter/JediSimpleViewHolder;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "coverView", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "kotlin.jvm.PlatformType", "descTV", "Landroid/widget/TextView;", "priceView", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceTextView;", "titleTV", "getView", "()Landroid/view/View;", "onBind", "", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class CollectionGoodViewHolder extends JediSimpleViewHolder<CollectionGood> {
        public static ChangeQuickRedirect g;
        @NotNull
        public final View h;
        private final TextView i = ((TextView) this.h.findViewById(C0906R.id.ug));
        private final PriceTextView j = ((PriceTextView) this.h.findViewById(C0906R.id.uf));
        private final TextView k = ((TextView) this.h.findViewById(C0906R.id.ud));
        private final AnimatedImageView l = ((AnimatedImageView) this.h.findViewById(C0906R.id.ue));

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36848a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CollectionGood f36849b;

            a(CollectionGood collectionGood) {
                this.f36849b = collectionGood;
            }

            public final void onClick(View view) {
                long j;
                if (PatchProxy.isSupport(new Object[]{view}, this, f36848a, false, 28066, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36848a, false, 28066, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                Activity a2 = b2.a();
                if (a2 != null) {
                    h.a aVar = h.f37502d;
                    n.a aVar2 = n.r;
                    Context context = a2;
                    String promotionId = this.f36849b.getPromotionId();
                    if (promotionId == null) {
                        promotionId = "";
                    }
                    String str = promotionId;
                    String productId = this.f36849b.getProductId();
                    if (productId == null) {
                        productId = "";
                    }
                    String str2 = productId;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    String promotionSource = this.f36849b.getPromotionSource();
                    if (promotionSource != null) {
                        j = Long.parseLong(promotionSource);
                    } else {
                        j = -1;
                    }
                    aVar.a(n.a.a(aVar2, context, null, str, str2, null, "personal_homepage", "click_collection_card", null, null, "collection_card", null, 0, uptimeMillis, j, "", null, null, this.f36849b.getAuthorId(), 98304));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CollectionGoodViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.h = view;
        }

        public final /* synthetic */ void a(Object obj) {
            int i2;
            long j2;
            CollectionGood collectionGood = (CollectionGood) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{collectionGood}, this, g, false, 28065, new Class[]{CollectionGood.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{collectionGood}, this, g, false, 28065, new Class[]{CollectionGood.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(collectionGood, "item");
            TextView textView = this.i;
            Intrinsics.checkExpressionValueIsNotNull(textView, "titleTV");
            String title = collectionGood.getTitle();
            if (title == null) {
                title = "";
            }
            textView.setText(title);
            PriceTextView priceTextView = this.j;
            Integer price = collectionGood.getPrice();
            if (price != null) {
                i2 = price.intValue();
            } else {
                i2 = 0;
            }
            g.a aVar = g.f38016b;
            PriceTextView priceTextView2 = this.j;
            Intrinsics.checkExpressionValueIsNotNull(priceTextView2, "priceView");
            Context context = priceTextView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "priceView.context");
            priceTextView.a(i2, aVar.a(context, C0906R.color.g5), 13.0f, 15.0f, 15.0f);
            TextView textView2 = this.k;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "descTV");
            TextView textView3 = this.k;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "descTV");
            Context context2 = textView3.getContext();
            Object[] objArr = new Object[1];
            m.a aVar2 = m.f38042b;
            Long favoriteCount = collectionGood.getFavoriteCount();
            if (favoriteCount != null) {
                j2 = favoriteCount.longValue();
            } else {
                j2 = 0;
            }
            objArr[0] = aVar2.a(j2);
            textView2.setText(context2.getString(C0906R.string.ud, objArr));
            UrlModel cover = collectionGood.getCover();
            if (cover == null) {
                cover = new UrlModel();
            }
            if (cover.getWidth() == 0) {
                cover.setWidth(100);
            }
            if (cover.getHeight() == 0) {
                cover.setHeight(100);
            }
            AnimatedImageView animatedImageView = this.l;
            Intrinsics.checkExpressionValueIsNotNull(animatedImageView, "coverView");
            animatedImageView.getLayoutParams().height = (j.f38032c * cover.getHeight()) / cover.getWidth();
            Collection urlList = cover.getUrlList();
            if (urlList != null && !urlList.isEmpty()) {
                z = false;
            }
            if (z) {
                this.l.setImageDrawable(null);
            } else {
                c.b(this.l, cover);
            }
            this.h.setOnClickListener(new a(collectionGood));
            dr.a().a(collectionGood.getAuthorId(), collectionGood.getSecAuthorId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodListAdapter$Companion;", "", "()V", "IMAGE_DEFAULT_SIZE", "", "PRICE_MIDDLE_SIZE", "", "PRICE_PRE_SIZE", "PRICE_SUF_SIZE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionGoodListAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner, new CollectionGoodDiffer(), null, 4);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        this.g = lifecycleOwner;
    }

    @NotNull
    public final JediViewHolder<? extends d, CollectionGood> a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f36847f, false, 28064, new Class[]{ViewGroup.class}, JediViewHolder.class)) {
            return (JediViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f36847f, false, 28064, new Class[]{ViewGroup.class}, JediViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.hc, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…good_item, parent, false)");
        return new CollectionGoodViewHolder<>(inflate);
    }
}
