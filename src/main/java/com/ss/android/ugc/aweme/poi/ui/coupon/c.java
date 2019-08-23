package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.poi.e.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/coupon/CouponShareDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "contentTip", "", "couponId", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "shareCouponListener", "Lcom/ss/android/ugc/aweme/poi/ui/coupon/CouponShareDialog$ShareCouponListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;Lcom/ss/android/ugc/aweme/poi/ui/coupon/CouponShareDialog$ShareCouponListener;)V", "getCouponId", "()Ljava/lang/String;", "getPoiSimpleBundle", "()Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "initData", "", "initListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "ShareCouponListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60659a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f60660b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.poi.c f60661c;

    /* renamed from: d  reason: collision with root package name */
    public final a f60662d;

    /* renamed from: e  reason: collision with root package name */
    private final String f60663e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/coupon/CouponShareDialog$ShareCouponListener;", "", "shareCoupon", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void I();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f60665b;

        b(c cVar) {
            this.f60665b = cVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60664a, false, 66328, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60664a, false, 66328, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f60665b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c$c  reason: collision with other inner class name */
    static final class C0672c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f60667b;

        C0672c(c cVar) {
            this.f60667b = cVar;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f60666a, false, 66329, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60666a, false, 66329, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.poi.c cVar = this.f60667b.f60661c;
            d a2 = d.a().a("enter_from", "poi_page").a("enter_method", "click_share_friend").a("coupon_id", this.f60667b.f60660b);
            com.ss.android.ugc.aweme.poi.c cVar2 = this.f60667b.f60661c;
            if (cVar2 != null) {
                str = cVar2.getPoiId();
            } else {
                str = null;
            }
            h.a(cVar, "click_coupon_toast", a2.a("poi_id", str));
            a aVar = this.f60667b.f60662d;
            if (aVar != null) {
                aVar.I();
            }
            this.f60667b.dismiss();
        }
    }

    public final void show() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f60659a, false, 66327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60659a, false, 66327, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        com.ss.android.ugc.aweme.poi.c cVar = this.f60661c;
        d a2 = d.a().a("enter_from", "poi_page").a("enter_method", "share_friend").a("coupon_id", this.f60660b);
        com.ss.android.ugc.aweme.poi.c cVar2 = this.f60661c;
        if (cVar2 != null) {
            str = cVar2.getPoiId();
        } else {
            str = null;
        }
        h.a(cVar, "show_coupon_toast", a2.a("poi_id", str));
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60659a, false, 66324, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60659a, false, 66324, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.ks);
        if (PatchProxy.isSupport(new Object[0], this, f60659a, false, 66325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60659a, false, 66325, new Class[0], Void.TYPE);
        } else {
            setCanceledOnTouchOutside(false);
            String str = this.f60663e;
            if (str != null) {
                DmtTextView dmtTextView = (DmtTextView) findViewById(C0906R.id.cph);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "share_content");
                dmtTextView.setText(str);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f60659a, false, 66326, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60659a, false, 66326, new Class[0], Void.TYPE);
            return;
        }
        ((ImageView) findViewById(C0906R.id.ti)).setOnClickListener(new b(this));
        ((DmtTextView) findViewById(C0906R.id.bue)).setOnClickListener(new C0672c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable com.ss.android.ugc.aweme.poi.c cVar, @Nullable a aVar) {
        super(context, C0906R.style.sn);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f60663e = str;
        this.f60660b = str2;
        this.f60661c = cVar;
        this.f60662d = aVar;
    }
}
