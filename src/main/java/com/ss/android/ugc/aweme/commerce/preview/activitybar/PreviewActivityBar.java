package com.ss.android.ugc.aweme.commerce.preview.activitybar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.preview.activitybar.a;
import com.ss.android.ugc.aweme.commerce.preview.activitybar.b;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.o;
import com.ss.android.ugc.aweme.commerce.service.models.r;
import com.ss.android.ugc.aweme.commerce.service.models.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0012J\u0016\u0010&\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/PreviewActivityBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "atmosphereLayout", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/AtmosphereLayout;", "mAtmosphereListener", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/AtmosphereLayout$AtmosphereListener;", "mDisplayGood", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "mSecKillStatusListener", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillLayout$SecKillStatusListener;", "secKillLayout", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillLayout;", "addAtmosphereLayout", "", "promotionActivity", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "addSecKillLayout", "secKillInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "initView", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "onActivityDestroy", "onActivityPause", "onActivityResume", "setAtmosphereListener", "atmosphereListener", "setSecKillStatusListener", "secKillStatusListener", "updateView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewActivityBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37286a;

    /* renamed from: b  reason: collision with root package name */
    public h f37287b;

    /* renamed from: c  reason: collision with root package name */
    public b f37288c;

    /* renamed from: d  reason: collision with root package name */
    public a f37289d;

    /* renamed from: e  reason: collision with root package name */
    private b.C0470b f37290e;

    /* renamed from: f  reason: collision with root package name */
    private a.C0469a f37291f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewActivityBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setAtmosphereListener(@NotNull a.C0469a aVar) {
        a.C0469a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f37286a, false, 28826, new Class[]{a.C0469a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f37286a, false, 28826, new Class[]{a.C0469a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "atmosphereListener");
        this.f37291f = aVar2;
    }

    public final void setSecKillStatusListener(@NotNull b.C0470b bVar) {
        b.C0470b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f37286a, false, 28825, new Class[]{b.C0470b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f37286a, false, 28825, new Class[]{b.C0470b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "secKillStatusListener");
        this.f37290e = bVar2;
    }

    public final void a(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, f37286a, false, 28823, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, f37286a, false, 28823, new Class[]{o.class}, Void.TYPE);
            return;
        }
        removeAllViews();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f37289d = new a(context);
        a aVar = this.f37289d;
        if (aVar != null) {
            h hVar = this.f37287b;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            aVar.setPrice(hVar.getPrice());
            aVar.setAtmosphereListener(this.f37291f);
            aVar.a(oVar);
            addView(aVar);
        }
    }

    public final void a(s sVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{sVar}, this, f37286a, false, 28822, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, f37286a, false, 28822, new Class[]{s.class}, Void.TYPE);
            return;
        }
        removeAllViews();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f37288c = new b(context);
        b bVar = this.f37288c;
        if (bVar != null) {
            h hVar = this.f37287b;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            r toutiao = hVar.getToutiao();
            if (toutiao != null) {
                i = toutiao.getMaxPrice();
            }
            bVar.setMarketPrice(i);
            bVar.setSecKillStatusListener(this.f37290e);
            bVar.a(sVar);
            addView(bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewActivityBar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewActivityBar(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }
}
