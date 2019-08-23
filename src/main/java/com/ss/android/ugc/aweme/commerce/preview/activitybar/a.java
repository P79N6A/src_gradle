package com.ss.android.ugc.aweme.commerce.preview.activitybar;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.service.l.d;
import com.ss.android.ugc.aweme.commerce.service.models.o;
import com.ss.android.ugc.aweme.commerce.service.widgets.CountDownLayout;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/AtmosphereLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "atmosphereListener", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/AtmosphereLayout$AtmosphereListener;", "price", "bindActivityInfo", "", "promotionActivity", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "onPause", "onResume", "onStop", "setAtmosphereListener", "setPrice", "AtmosphereListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37298a;

    /* renamed from: b  reason: collision with root package name */
    public C0469a f37299b;

    /* renamed from: c  reason: collision with root package name */
    private int f37300c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f37301d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/AtmosphereLayout$AtmosphereListener;", "", "onAtmosphereEnd", "", "onAtmosphereStart", "promotionActivity", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.activitybar.a$a  reason: collision with other inner class name */
    public interface C0469a {
        void a();

        void a(@NotNull o oVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/ugc/aweme/commerce/preview/activitybar/AtmosphereLayout$bindActivityInfo$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ o $promotionActivity$inlined;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, o oVar) {
            super(0);
            this.this$0 = aVar;
            this.$promotionActivity$inlined = oVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28820, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28820, new Class[0], Void.TYPE);
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.this$0.a((int) C0906R.id.au);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityPriceLayout");
            frameLayout.setVisibility(8);
            C0469a aVar = this.this$0.f37299b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37298a, false, 28818, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37298a, false, 28818, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f37301d == null) {
            this.f37301d = new HashMap();
        }
        View view = (View) this.f37301d.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f37301d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void setAtmosphereListener(@Nullable C0469a aVar) {
        this.f37299b = aVar;
    }

    public final void setPrice(int i) {
        this.f37300c = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7n, this, true);
    }

    public final void a(@NotNull o oVar) {
        o oVar2 = oVar;
        if (PatchProxy.isSupport(new Object[]{oVar2}, this, f37298a, false, 28814, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar2}, this, f37298a, false, 28814, new Class[]{o.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(oVar2, "promotionActivity");
        C0469a aVar = this.f37299b;
        if (aVar != null) {
            aVar.a(oVar2);
        }
        FrameLayout frameLayout = (FrameLayout) a((int) C0906R.id.au);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityPriceLayout");
        frameLayout.setVisibility(0);
        if (TextUtils.isEmpty(oVar.getCardImage())) {
            RemoteImageView remoteImageView = (RemoteImageView) a((int) C0906R.id.an);
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "activityCardRIV");
            remoteImageView.setVisibility(8);
            ((FrameLayout) a((int) C0906R.id.au)).setBackgroundColor(getResources().getColor(C0906R.color.a1z));
        } else {
            RemoteImageView remoteImageView2 = (RemoteImageView) a((int) C0906R.id.an);
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView2, "activityCardRIV");
            remoteImageView2.setVisibility(0);
            c.a((RemoteImageView) a((int) C0906R.id.an), oVar.getCardImage());
        }
        if (TextUtils.isEmpty(oVar.getLogo())) {
            RemoteImageView remoteImageView3 = (RemoteImageView) a((int) C0906R.id.as);
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView3, "activityLogoRIV");
            remoteImageView3.setVisibility(8);
        } else {
            RemoteImageView remoteImageView4 = (RemoteImageView) a((int) C0906R.id.as);
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView4, "activityLogoRIV");
            remoteImageView4.setVisibility(0);
            c.a((RemoteImageView) a((int) C0906R.id.as), oVar.getLogo());
        }
        if (oVar.getServerTime() != 0) {
            long startTime = oVar.getStartTime();
            long endTime = oVar.getEndTime();
            long serverTime = oVar.getServerTime();
            if (startTime <= serverTime && endTime >= serverTime) {
                CountDownLayout countDownLayout = (CountDownLayout) a((int) C0906R.id.ao);
                Intrinsics.checkExpressionValueIsNotNull(countDownLayout, "activityCountDown");
                countDownLayout.setVisibility(0);
                PriceView priceView = (PriceView) a((int) C0906R.id.av);
                Intrinsics.checkExpressionValueIsNotNull(priceView, "activityPriceTV");
                priceView.setVisibility(8);
                DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.ap);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "activityDetailTV");
                dmtTextView.setVisibility(8);
                ((CountDownLayout) a((int) C0906R.id.ao)).a(0, oVar.getServerTime(), oVar.getEndTime(), new b(this, oVar2));
                ((CountDownLayout) a((int) C0906R.id.ao)).b();
                return;
            }
        }
        CountDownLayout countDownLayout2 = (CountDownLayout) a((int) C0906R.id.ao);
        Intrinsics.checkExpressionValueIsNotNull(countDownLayout2, "activityCountDown");
        countDownLayout2.setVisibility(8);
        PriceView priceView2 = (PriceView) a((int) C0906R.id.av);
        Intrinsics.checkExpressionValueIsNotNull(priceView2, "activityPriceTV");
        priceView2.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.ap);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "activityDetailTV");
        dmtTextView2.setVisibility(0);
        DmtTextView dmtTextView3 = (DmtTextView) a((int) C0906R.id.ap);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "activityDetailTV");
        dmtTextView3.setText(oVar.getDetailText());
        ((PriceView) a((int) C0906R.id.av)).setPriceText(d.a(this.f37300c));
    }
}
