package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.ui.coupon.c;
import com.ss.android.ugc.aweme.poi.ui.s;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010 \u001a\u00020\u0015H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/coupon/CouponReceiveSuccessTipDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "couponInfo", "Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponInfo;", "canBook", "", "bookUrl", "", "canCouponShare", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "shareCouponListener", "Lcom/ss/android/ugc/aweme/poi/ui/coupon/CouponShareDialog$ShareCouponListener;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponInfo;ZLjava/lang/String;ZLcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;Lcom/ss/android/ugc/aweme/poi/ui/coupon/CouponShareDialog$ShareCouponListener;)V", "getCouponInfo", "()Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponInfo;", "setCouponInfo", "(Lcom/ss/android/ugc/aweme/commercialize/coupon/model/CouponInfo;)V", "initData", "", "initListener", "mobClickCouponToast", "enterMethod", "mobShowCouponToast", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openBrowser", "url", "title", "show", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60647a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.coupon.model.c f60648b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f60649c;

    /* renamed from: d  reason: collision with root package name */
    public String f60650d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f60651e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.poi.c f60652f;
    public final c.a g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f60654b;

        a(b bVar) {
            this.f60654b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60653a, false, 66321, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60653a, false, 66321, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f60654b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b$b  reason: collision with other inner class name */
    static final class C0671b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f60656b;

        C0671b(b bVar) {
            this.f60656b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60655a, false, 66322, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60655a, false, 66322, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f60656b.f60649c && !TextUtils.isEmpty(this.f60656b.f60650d)) {
                s.f60892b = "coupon_toast";
                b bVar = this.f60656b;
                String str = this.f60656b.f60650d;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                Context context = this.f60656b.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                String string = context.getResources().getString(C0906R.string.bpd);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getString(R.string.poi_reserve)");
                if (PatchProxy.isSupport(new Object[]{str, string}, bVar, b.f60647a, false, 66317, new Class[]{String.class, String.class}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{str, string}, bVar2, b.f60647a, false, 66317, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    Intent intent = new Intent(bVar.getContext(), CrossPlatformActivity.class);
                    intent.setData(Uri.parse(str));
                    intent.putExtra(PushConstants.TITLE, string);
                    intent.putExtra("hide_nav_bar", false);
                    intent.putExtra("hide_status_bar", false);
                    intent.putExtra("bundle_user_webview_title", false);
                    intent.putExtra("show_closeall", true);
                    bVar.getContext().startActivity(intent);
                }
                com.ss.android.ugc.aweme.poi.c.b.a("click", "reserve", "poi_page", "coupon_toast", this.f60656b.f60652f);
                this.f60656b.a("click_reserve");
            } else if (this.f60656b.f60651e) {
                this.f60656b.a("click_share_friend");
                c.a aVar = this.f60656b.g;
                if (aVar != null) {
                    aVar.I();
                }
            } else {
                this.f60656b.a("click_first_ok");
            }
            this.f60656b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f60658b;

        c(b bVar) {
            this.f60658b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60657a, false, 66323, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60657a, false, 66323, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f60658b.f60648b != null) {
                this.f60658b.a("click_first_look");
                h.a(this.f60658b.f60652f, "enter_card_bag", d.a().a("enter_from", "poi_page"));
                Intent intent = new Intent(this.f60658b.getContext(), CouponListActivity.class);
                intent.putExtra("is_coupon_valid", true);
                this.f60658b.getContext().startActivity(intent);
            }
            this.f60658b.dismiss();
        }
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f60647a, false, 66318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60647a, false, 66318, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        if (this.f60649c) {
            b("click_reserve");
        } else if (this.f60651e) {
            b("click_first_coupon_share_friend");
        } else {
            b("click_first_coupon");
        }
    }

    private final void b(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f60647a, false, 66319, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60647a, false, 66319, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.c cVar = this.f60652f;
        d a2 = d.a().a("enter_from", "poi_page").a("enter_method", str);
        com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar2 = this.f60648b;
        if (cVar2 == null) {
            Intrinsics.throwNpe();
        }
        d a3 = a2.a("coupon_id", cVar2.getCouponId());
        com.ss.android.ugc.aweme.poi.c cVar3 = this.f60652f;
        if (cVar3 != null) {
            str2 = cVar3.getPoiId();
        } else {
            str2 = null;
        }
        h.a(cVar, "show_coupon_toast", a3.a("poi_id", str2));
    }

    public final void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f60647a, false, 66320, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60647a, false, 66320, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.c cVar = this.f60652f;
        d a2 = d.a().a("enter_from", "poi_page").a("enter_method", str);
        com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar2 = this.f60648b;
        if (cVar2 == null) {
            Intrinsics.throwNpe();
        }
        d a3 = a2.a("coupon_id", cVar2.getCouponId());
        com.ss.android.ugc.aweme.poi.c cVar3 = this.f60652f;
        if (cVar3 != null) {
            str2 = cVar3.getPoiId();
        } else {
            str2 = null;
        }
        h.a(cVar, "click_coupon_toast", a3.a("poi_id", str2));
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60647a, false, 66314, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60647a, false, 66314, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.kv);
        if (PatchProxy.isSupport(new Object[0], this, f60647a, false, 66315, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60647a, false, 66315, new Class[0], Void.TYPE);
        } else {
            setCanceledOnTouchOutside(false);
            com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar = this.f60648b;
            if (cVar != null) {
                DmtTextView dmtTextView = (DmtTextView) findViewById(C0906R.id.a1_);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "coupon_valid_date");
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                String string = context.getResources().getString(C0906R.string.a3c);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…oupon_valid_start_to_end)");
                String format = String.format(string, Arrays.copyOf(new Object[]{cVar.getValidStart(), cVar.getValidEnd()}, 2));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                dmtTextView.setText(format);
                if (this.f60649c) {
                    ((DmtTextView) findViewById(C0906R.id.bue)).setText(C0906R.string.bp3);
                    DmtTextView dmtTextView2 = (DmtTextView) findViewById(C0906R.id.akz);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "go_coupon_detail");
                    dmtTextView2.setVisibility(8);
                } else {
                    if (this.f60651e) {
                        ((DmtTextView) findViewById(C0906R.id.bue)).setText(C0906R.string.a36);
                    } else {
                        ((DmtTextView) findViewById(C0906R.id.bue)).setText(C0906R.string.dop);
                    }
                    DmtTextView dmtTextView3 = (DmtTextView) findViewById(C0906R.id.akz);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "go_coupon_detail");
                    dmtTextView3.setVisibility(0);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f60647a, false, 66316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60647a, false, 66316, new Class[0], Void.TYPE);
            return;
        }
        ((ImageView) findViewById(C0906R.id.ti)).setOnClickListener(new a(this));
        ((DmtTextView) findViewById(C0906R.id.bue)).setOnClickListener(new C0671b(this));
        ((DmtTextView) findViewById(C0906R.id.akz)).setOnClickListener(new c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @Nullable com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar, boolean z, @Nullable String str, boolean z2, @Nullable com.ss.android.ugc.aweme.poi.c cVar2, @Nullable c.a aVar) {
        super(context, C0906R.style.sn);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f60648b = cVar;
        this.f60649c = z;
        this.f60650d = str;
        this.f60651e = z2;
        this.f60652f = cVar2;
        this.g = aVar;
    }
}
