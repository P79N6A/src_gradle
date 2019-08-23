package com.ss.android.ugc.aweme.commerce.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commerce.service.l.e;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.logs.p;
import com.ss.android.ugc.aweme.commerce.service.logs.y;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment;
import com.ss.android.ugc.aweme.commerce.service.models.ad;
import com.ss.android.ugc.aweme.commerce.service.models.ae;
import com.ss.android.ugc.aweme.commerce.service.models.o;
import com.ss.android.ugc.aweme.commerce.service.models.r;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0002mnB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u00020F2\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020FH\u0002J&\u0010M\u001a\u00020F2\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00132\f\u0010P\u001a\b\u0012\u0004\u0012\u00020F0QH\u0002J\b\u0010R\u001a\u0004\u0018\u00010\u0019J\b\u0010S\u001a\u00020FH\u0002J\u0012\u0010T\u001a\u00020F2\b\u0010U\u001a\u0004\u0018\u00010HH\u0016J\b\u0010V\u001a\u00020FH\u0002J\b\u0010W\u001a\u00020FH\u0002J\b\u0010X\u001a\u00020FH\u0002J\b\u0010Y\u001a\u00020FH\u0002J\u0010\u0010Z\u001a\u00020F2\u0006\u0010[\u001a\u00020\u0013H\u0002J\u0006\u0010\\\u001a\u00020FJ\u0010\u0010]\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010^\u001a\u00020FH\u0002J\b\u0010_\u001a\u00020FH\u0002J\u0010\u0010`\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010a\u001a\u00020FH\u0002J\b\u0010b\u001a\u00020FH\u0002J\b\u0010c\u001a\u00020FH\u0002J\b\u0010d\u001a\u00020FH\u0002J\b\u0010e\u001a\u00020FH\u0002J\b\u0010f\u001a\u00020FH\u0002J\b\u0010g\u001a\u00020FH\u0002J0\u0010h\u001a\u00020F2\b\u0010i\u001a\u0004\u0018\u00010\r2\b\u0010j\u001a\u0004\u0018\u00010\u00132\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020F0lH\u0002R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u000e\u0010%\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001a\u00104\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u001a\u0010<\u001a\u00020=X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0015\"\u0004\bD\u0010\u0017¨\u0006o"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "awemeId", "", "getAwemeId", "()Ljava/lang/String;", "setAwemeId", "(Ljava/lang/String;)V", "cartCenterPoint", "Landroid/graphics/Point;", "isAppointing", "", "listener", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom$PreViewBottomListener;", "getListener", "()Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom$PreViewBottomListener;", "setListener", "(Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom$PreViewBottomListener;)V", "originFeedAwemeId", "getOriginFeedAwemeId", "setOriginFeedAwemeId", "padding13", "padding16", "padding18", "padding24", "padding32", "padding41", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "getPromotion", "()Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "setPromotion", "(Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;)V", "referFrom", "getReferFrom", "setReferFrom", "saleOut", "getSaleOut", "()Z", "setSaleOut", "(Z)V", "showOriginalButton", "getShowOriginalButton", "setShowOriginalButton", "startPreviewTime", "", "getStartPreviewTime", "()J", "setStartPreviewTime", "(J)V", "uid", "getUid", "setUid", "add2Cart", "", "view", "Landroid/view/View;", "appoint", "btn", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "buy", "checkLogin", "enterFrom", "enterMethod", "callBack", "Lkotlin/Function0;", "getCartCenterPoint", "go2TaobaoCoupon", "onClick", "v", "onVirtualAddCart", "openIM", "openMiniApp", "openTaobao", "postEvent", "nextPageName", "refresh", "refreshAddCartBtn", "refreshButtons", "refreshIcons", "setAlphaAnimation75", "showAppointBtn", "showNormalBtn", "showNotSaleBtn", "showPresaleBtn", "showTaobaoCouponBtn", "showThirdPartyNotSaleBtn", "showThirdPartyOnSaleBtn", "tryToOpenApp", "fromAct", "url", "jumpAppSuccess", "Lkotlin/Function1;", "Companion", "PreViewBottomListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewBottom extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38343a;
    public static final a l = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.commerce.service.models.h f38344b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    String f38345c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    String f38346d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    Activity f38347e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    String f38348f = "";
    @NotNull
    String g = "";
    @Nullable
    b h;
    long i;
    Point j;
    public boolean k;
    private final int m = ((int) UIUtils.dip2Px(getContext(), 16.0f));
    private final int n = ((int) UIUtils.dip2Px(getContext(), 13.0f));
    private final int o = ((int) UIUtils.dip2Px(getContext(), 24.0f));
    private final int p = ((int) UIUtils.dip2Px(getContext(), 18.0f));
    private final int q = ((int) UIUtils.dip2Px(getContext(), 32.0f));
    private final int r = ((int) UIUtils.dip2Px(getContext(), 41.0f));
    private boolean s;
    private boolean t;
    private HashMap u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom$Companion;", "", "()V", "SPACE_TIME", "", "VALUE_13", "", "VALUE_16", "VALUE_18", "VALUE_24", "VALUE_32", "VALUE_41", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom$PreViewBottomListener;", "", "onAddCartClick", "", "onAppointChanged", "boolean", "", "onCollectionClick", "v", "Landroid/view/View;", "onNormalBuyClick", "onStoreClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(@NotNull View view);

        void a(boolean z);

        void b();

        void c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DmtTextView $btn;
        final /* synthetic */ boolean $isAppointment;
        final /* synthetic */ PreviewBottom this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewBottom previewBottom, boolean z, DmtTextView dmtTextView) {
            super(1);
            this.this$0 = previewBottom;
            this.$isAppointment = z;
            this.$btn = dmtTextView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 30176, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 30176, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.this$0.k = false;
            if (z) {
                com.ss.android.ugc.aweme.commerce.service.models.h promotion = this.this$0.getPromotion();
                if (promotion != null) {
                    r toutiao = promotion.getToutiao();
                    if (toutiao != null) {
                        PromotionAppointment appointment = toutiao.getAppointment();
                        if (appointment != null) {
                            appointment.setAppointment(!this.$isAppointment);
                        }
                    }
                }
                if (!this.$isAppointment) {
                    str = this.this$0.getResources().getString(C0906R.string.fu);
                } else {
                    str = this.this$0.getResources().getString(C0906R.string.fw);
                }
                this.$btn.setText(str);
                b listener = this.this$0.getListener();
                if (listener != null) {
                    listener.a(!this.$isAppointment);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onResultOK"}, k = 3, mv = {1, 1, 15})
    static final class d implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f38350b;

        d(Function0 function0) {
            this.f38350b = function0;
        }

        public final void a(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f38349a, false, 30178, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f38349a, false, 30178, new Class[]{Bundle.class}, Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f38349a, false, 30177, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38349a, false, 30177, new Class[0], Void.TYPE);
                return;
            }
            this.f38350b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewBottom this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PreviewBottom previewBottom) {
            super(0);
            this.this$0 = previewBottom;
        }

        public final void invoke() {
            String str;
            Long l;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30179, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30179, new Class[0], Void.TYPE);
                return;
            }
            PreviewBottom previewBottom = this.this$0;
            if (PatchProxy.isSupport(new Object[0], previewBottom, PreviewBottom.f38343a, false, 30173, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], previewBottom, PreviewBottom.f38343a, false, 30173, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.log.g.b((Context) previewBottom.f38347e, com.ss.android.ugc.aweme.commerce.a.a.a(previewBottom.f38346d), previewBottom.f38344b);
            y yVar = new y();
            yVar.f38166f = previewBottom.f38345c;
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = previewBottom.f38344b;
            String str2 = null;
            if (hVar != null) {
                str = hVar.getPromotionId();
            } else {
                str = null;
            }
            yVar.h = str;
            yVar.g = previewBottom.f38348f;
            com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = previewBottom.f38344b;
            if (hVar2 != null) {
                l = Long.valueOf(hVar2.getCommodityType());
            } else {
                l = null;
            }
            yVar.i = l;
            yVar.j = "full_screen_card";
            yVar.b();
            Context context = previewBottom.f38347e;
            com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = previewBottom.f38344b;
            if (hVar3 != null) {
                r toutiao = hVar3.getToutiao();
                if (toutiao != null) {
                    str2 = toutiao.getImUrl();
                }
            }
            com.ss.android.ugc.aweme.commercialize.utils.g.a(context, str2, "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isJumpAppSuccess", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewBottom this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PreviewBottom previewBottom) {
            super(1);
            this.this$0 = previewBottom;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 30180, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 30180, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                this.this$0.a(PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
            } else {
                this.this$0.a("h5");
                com.ss.android.ugc.aweme.commerce.service.models.h promotion = this.this$0.getPromotion();
                if (promotion != null) {
                    str = promotion.getDetailUrl();
                } else {
                    str = null;
                }
                String str2 = str;
                Activity activity = this.this$0.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                com.ss.android.ugc.aweme.commerce.a.a(str2, activity, (String) null, false, false, 28);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38352b;

        g(PreviewBottom previewBottom) {
            this.f38352b = previewBottom;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38351a, false, 30181, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38351a, false, 30181, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            PreviewBottom previewBottom = this.f38352b;
            if (PatchProxy.isSupport(new Object[0], previewBottom, PreviewBottom.f38343a, false, 30163, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], previewBottom, PreviewBottom.f38343a, false, 30163, new Class[0], Void.TYPE);
                return;
            }
            UIUtils.displayToast(previewBottom.getContext(), (int) C0906R.string.ys);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f38355c;

        h(PreviewBottom previewBottom, View view) {
            this.f38354b = previewBottom;
            this.f38355c = view;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38353a, false, 30182, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38353a, false, 30182, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f38354b.a("commodity_page", "click_add_to_cart", new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ h this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    String str;
                    long j;
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30183, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30183, new Class[0], Void.TYPE);
                        return;
                    }
                    PreviewBottom previewBottom = this.this$0.f38354b;
                    View view = this.this$0.f38355c;
                    if (PatchProxy.isSupport(new Object[]{view}, previewBottom, PreviewBottom.f38343a, false, 30162, new Class[]{View.class}, Void.TYPE)) {
                        PreviewBottom previewBottom2 = previewBottom;
                        PatchProxy.accessDispatch(new Object[]{view}, previewBottom2, PreviewBottom.f38343a, false, 30162, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.c(previewBottom.getContext(), com.ss.android.ugc.aweme.commerce.a.a.a(previewBottom.f38346d), previewBottom.f38344b);
                    com.ss.android.ugc.aweme.commerce.service.logs.g a2 = new com.ss.android.ugc.aweme.commerce.service.logs.g().c(previewBottom.f38348f).a(previewBottom.f38345c);
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar = previewBottom.f38344b;
                    if (hVar != null) {
                        str = hVar.getPromotionId();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.commerce.service.logs.g d2 = a2.b(str).d("full_screen_card");
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = previewBottom.f38344b;
                    if (hVar2 != null) {
                        j = hVar2.getCommodityType();
                    } else {
                        j = 0;
                    }
                    com.ss.android.ugc.aweme.commerce.service.logs.g a3 = d2.a(j);
                    a3.g = previewBottom.g;
                    a3.b();
                    Rect rect = new Rect();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    rect.left = iArr[0];
                    rect.top = iArr[1];
                    rect.right = rect.left + view.getMeasuredWidth();
                    rect.bottom = rect.top + view.getMeasuredHeight();
                    previewBottom.j = new Point(rect.centerX(), rect.centerY());
                    b bVar = previewBottom.h;
                    if (bVar != null) {
                        bVar.c();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38356a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f38358c;

        i(PreviewBottom previewBottom, View view) {
            this.f38357b = previewBottom;
            this.f38358c = view;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38356a, false, 30184, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38356a, false, 30184, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f38357b.a("commodity_page", "click_product", new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ i this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
                    if (r3 == null) goto L_0x00de;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void invoke() {
                    /*
                        r16 = this;
                        r7 = r16
                        r8 = 0
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 30185(0x75e9, float:4.2298E-41)
                        r1 = r16
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0027
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                        r3 = 0
                        r4 = 30185(0x75e9, float:4.2298E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r16
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0027:
                        com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$i r0 = r7.this$0
                        com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r0 = r0.f38357b
                        com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$i r1 = r7.this$0
                        android.view.View r1 = r1.f38358c
                        java.lang.String r2 = "container"
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                        r2 = 2131165424(0x7f0700f0, float:1.7945065E38)
                        android.view.View r1 = r1.findViewById(r2)
                        com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                        java.lang.String r2 = "container.appointRightBtn"
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                        r2 = 1
                        java.lang.Object[] r9 = new java.lang.Object[r2]
                        r9[r8] = r1
                        com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.f38343a
                        r12 = 0
                        r13 = 30164(0x75d4, float:4.2269E-41)
                        java.lang.Class[] r14 = new java.lang.Class[r2]
                        java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r3 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
                        r14[r8] = r3
                        java.lang.Class r15 = java.lang.Void.TYPE
                        r10 = r0
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                        if (r3 == 0) goto L_0x0071
                        java.lang.Object[] r9 = new java.lang.Object[r2]
                        r9[r8] = r1
                        com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.f38343a
                        r12 = 0
                        r13 = 30164(0x75d4, float:4.2269E-41)
                        java.lang.Class[] r14 = new java.lang.Class[r2]
                        java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r1 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
                        r14[r8] = r1
                        java.lang.Class r15 = java.lang.Void.TYPE
                        r10 = r0
                        com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                        return
                    L_0x0071:
                        boolean r3 = r0.k
                        if (r3 != 0) goto L_0x0100
                        r0.k = r2
                        com.ss.android.ugc.aweme.commerce.service.models.h r3 = r0.f38344b
                        if (r3 == 0) goto L_0x008e
                        com.ss.android.ugc.aweme.commerce.service.models.r r3 = r3.getToutiao()
                        if (r3 == 0) goto L_0x008e
                        com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment r3 = r3.getAppointment()
                        if (r3 == 0) goto L_0x008e
                        boolean r3 = r3.isAppointment()
                        if (r3 != r2) goto L_0x008e
                        r8 = 1
                    L_0x008e:
                        com.ss.android.ugc.aweme.commerce.service.logs.o r3 = new com.ss.android.ugc.aweme.commerce.service.logs.o
                        r3.<init>()
                        java.lang.String r4 = "full_screen_card"
                        r3.f38146f = r4
                        if (r8 == 0) goto L_0x009c
                        java.lang.String r4 = "cancel_presale"
                        goto L_0x009e
                    L_0x009c:
                        java.lang.String r4 = "presale"
                    L_0x009e:
                        r3.g = r4
                        com.ss.android.ugc.aweme.commerce.service.models.h r4 = r0.f38344b
                        r5 = 0
                        if (r4 == 0) goto L_0x00ae
                        long r9 = r4.getCommodityType()
                        java.lang.Long r4 = java.lang.Long.valueOf(r9)
                        goto L_0x00af
                    L_0x00ae:
                        r4 = r5
                    L_0x00af:
                        java.lang.String r4 = java.lang.String.valueOf(r4)
                        r3.h = r4
                        com.ss.android.ugc.aweme.commerce.service.models.h r4 = r0.f38344b
                        if (r4 == 0) goto L_0x00bd
                        java.lang.String r5 = r4.getPromotionId()
                    L_0x00bd:
                        r3.i = r5
                        java.lang.String r4 = r0.f38348f
                        r3.j = r4
                        r3.b()
                        com.ss.android.ugc.aweme.commerce.preview.api.a r9 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c
                        android.content.Context r10 = r0.getContext()
                        java.lang.String r3 = "context"
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r3)
                        com.ss.android.ugc.aweme.commerce.service.models.h r3 = r0.f38344b
                        if (r3 == 0) goto L_0x00de
                        java.lang.String r3 = r3.getPromotionId()
                        if (r3 != 0) goto L_0x00dc
                        goto L_0x00de
                    L_0x00dc:
                        r11 = r3
                        goto L_0x00e1
                    L_0x00de:
                        java.lang.String r3 = ""
                        goto L_0x00dc
                    L_0x00e1:
                        java.lang.String r3 = r0.f38345c
                        if (r3 != 0) goto L_0x00e7
                        java.lang.String r3 = ""
                    L_0x00e7:
                        r12 = r3
                        java.lang.String r3 = r0.f38348f
                        if (r3 != 0) goto L_0x00ee
                        java.lang.String r3 = ""
                    L_0x00ee:
                        r13 = r3
                        if (r8 == 0) goto L_0x00f4
                        r2 = 2
                        r14 = 2
                        goto L_0x00f5
                    L_0x00f4:
                        r14 = 1
                    L_0x00f5:
                        com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$c r2 = new com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$c
                        r2.<init>(r0, r8, r1)
                        r15 = r2
                        kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
                        r9.a((android.content.Context) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14, (kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>) r15)
                    L_0x0100:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.i.AnonymousClass1.invoke():void");
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38360b;

        j(PreviewBottom previewBottom) {
            this.f38360b = previewBottom;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38359a, false, 30186, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38359a, false, 30186, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f38360b.a("commodity_page", "click_product", new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ j this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30187, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30187, new Class[0], Void.TYPE);
                        return;
                    }
                    this.this$0.f38360b.b();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38362b;

        k(PreviewBottom previewBottom) {
            this.f38362b = previewBottom;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38361a, false, 30188, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38361a, false, 30188, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f38362b.a("commodity_page", "click_product", new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ k this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30189, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30189, new Class[0], Void.TYPE);
                        return;
                    }
                    this.this$0.f38362b.b();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38364b;

        l(PreviewBottom previewBottom) {
            this.f38364b = previewBottom;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38363a, false, 30190, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38363a, false, 30190, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f38364b.a("commodity_page", "click_product", new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ l this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30191, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30191, new Class[0], Void.TYPE);
                        return;
                    }
                    this.this$0.f38364b.c();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38366b;

        m(PreviewBottom previewBottom) {
            this.f38366b = previewBottom;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38365a, false, 30192, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38365a, false, 30192, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f38366b.a("commodity_page", "click_product", new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ m this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    Boolean bool;
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30193, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30193, new Class[0], Void.TYPE);
                        return;
                    }
                    PreviewBottom previewBottom = this.this$0.f38366b;
                    if (PatchProxy.isSupport(new Object[0], previewBottom, PreviewBottom.f38343a, false, 30171, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], previewBottom, PreviewBottom.f38343a, false, 30171, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.a(previewBottom.getContext(), com.ss.android.ugc.aweme.commerce.a.a.a(previewBottom.f38346d), previewBottom.f38344b, System.currentTimeMillis(), SystemClock.uptimeMillis() - previewBottom.i);
                    if (previewBottom.f38347e != null) {
                        com.ss.android.ugc.aweme.commerce.service.models.h hVar = previewBottom.f38344b;
                        if (hVar != null) {
                            ad taobao = hVar.getTaobao();
                            if (taobao != null) {
                                ae coupon = taobao.getCoupon();
                                if (coupon != null) {
                                    com.ss.android.ugc.aweme.commerce.a aVar = com.ss.android.ugc.aweme.commerce.a.f36661b;
                                    Activity activity = previewBottom.f38347e;
                                    if (activity == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    Context context = activity;
                                    String couponWebUrl = coupon.getCouponWebUrl();
                                    String couponOpenUrl = coupon.getCouponOpenUrl();
                                    g.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                                    Activity activity2 = previewBottom.f38347e;
                                    if (activity2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    aVar.a(context, couponWebUrl, couponOpenUrl, aVar2.a(activity2, C0906R.string.chr, new Object[0]));
                                    p e2 = new p().e(previewBottom.f38348f);
                                    com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = previewBottom.f38344b;
                                    Long l = null;
                                    if (hVar2 != null) {
                                        bool = Boolean.valueOf(hVar2.isSelf());
                                    } else {
                                        bool = null;
                                    }
                                    p a2 = e2.a(bool);
                                    com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = previewBottom.f38344b;
                                    if (hVar3 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    p g = a2.a(hVar3.getElasticType()).d(previewBottom.f38345c).a(previewBottom.g).g(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                    com.ss.android.ugc.aweme.commerce.service.models.h hVar4 = previewBottom.f38344b;
                                    if (hVar4 != null) {
                                        o activity3 = hVar4.getActivity();
                                        if (activity3 != null && activity3.canBeShown()) {
                                            z = true;
                                        }
                                    }
                                    p b2 = g.b(z);
                                    com.ss.android.ugc.aweme.commerce.service.models.h hVar5 = previewBottom.f38344b;
                                    if (hVar5 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    p b3 = b2.c(hVar5.getPromotionId()).f("click_full_screen_card_coupon").b("full_screen_card");
                                    com.ss.android.ugc.aweme.commerce.service.models.h hVar6 = previewBottom.f38344b;
                                    if (hVar6 != null) {
                                        l = Long.valueOf(hVar6.getCommodityType());
                                    }
                                    b3.a(l).b();
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewBottom f38368b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f38369c;

        n(PreviewBottom previewBottom, boolean z) {
            this.f38368b = previewBottom;
            this.f38369c = z;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f38367a, false, 30194, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f38367a, false, 30194, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f38369c) {
                this.f38368b.a("commodity_page", "click_product", new Function0<Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ n this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
                        if (r0.isKaolaGood() == true) goto L_0x0134;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void invoke() {
                        /*
                            r17 = this;
                            r0 = 0
                            java.lang.Object[] r1 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                            java.lang.Class[] r6 = new java.lang.Class[r0]
                            java.lang.Class r7 = java.lang.Void.TYPE
                            r4 = 0
                            r5 = 30195(0x75f3, float:4.2312E-41)
                            r2 = r17
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                            if (r1 == 0) goto L_0x0025
                            java.lang.Object[] r2 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                            r5 = 0
                            r6 = 30195(0x75f3, float:4.2312E-41)
                            java.lang.Class[] r7 = new java.lang.Class[r0]
                            java.lang.Class r8 = java.lang.Void.TYPE
                            r3 = r17
                            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                            return
                        L_0x0025:
                            r1 = r17
                            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$n r2 = r1.this$0
                            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r2 = r2.f38368b
                            java.lang.Object[] r3 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.f38343a
                            r6 = 0
                            r7 = 30166(0x75d6, float:4.2272E-41)
                            java.lang.Class[] r8 = new java.lang.Class[r0]
                            java.lang.Class r9 = java.lang.Void.TYPE
                            r4 = r2
                            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                            if (r3 == 0) goto L_0x004d
                            java.lang.Object[] r3 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.f38343a
                            r6 = 0
                            r7 = 30166(0x75d6, float:4.2272E-41)
                            java.lang.Class[] r8 = new java.lang.Class[r0]
                            java.lang.Class r9 = java.lang.Void.TYPE
                            r4 = r2
                            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                            return
                        L_0x004d:
                            android.content.Context r10 = r2.getContext()
                            java.lang.String r3 = r2.f38346d
                            com.ss.android.ugc.aweme.feed.model.Aweme r11 = com.ss.android.ugc.aweme.commerce.a.a.a((java.lang.String) r3)
                            com.ss.android.ugc.aweme.commerce.service.models.h r12 = r2.f38344b
                            long r13 = java.lang.System.currentTimeMillis()
                            long r3 = android.os.SystemClock.uptimeMillis()
                            long r5 = r2.i
                            long r15 = r3 - r5
                            com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r10, (com.ss.android.ugc.aweme.feed.model.Aweme) r11, (com.ss.android.ugc.aweme.commerce.service.models.h) r12, (long) r13, (long) r15)
                            android.app.Activity r3 = r2.f38347e
                            if (r3 == 0) goto L_0x013f
                            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r4 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
                            java.lang.Object r3 = r3.getService(r4)
                            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r3 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r3
                            com.ss.android.ugc.aweme.commerce.service.models.h r4 = r2.f38344b
                            r5 = 0
                            if (r4 == 0) goto L_0x0082
                            java.lang.String r4 = r4.getSmallAppUrl()
                            goto L_0x0083
                        L_0x0082:
                            r4 = r5
                        L_0x0083:
                            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                            boolean r4 = android.text.TextUtils.isEmpty(r4)
                            if (r4 != 0) goto L_0x00b6
                            android.app.Activity r4 = r2.f38347e
                            android.content.Context r4 = (android.content.Context) r4
                            com.ss.android.ugc.aweme.commerce.service.models.h r6 = r2.f38344b
                            if (r6 == 0) goto L_0x0098
                            java.lang.String r6 = r6.getSmallAppUrl()
                            goto L_0x0099
                        L_0x0098:
                            r6 = r5
                        L_0x0099:
                            com.ss.android.ugc.aweme.miniapp_api.model.b$a r7 = new com.ss.android.ugc.aweme.miniapp_api.model.b$a
                            r7.<init>()
                            java.lang.String r8 = "commodity_page"
                            com.ss.android.ugc.aweme.miniapp_api.model.b$a r7 = r7.b(r8)
                            com.ss.android.ugc.aweme.miniapp_api.model.b r7 = r7.a()
                            boolean r3 = r3.openMiniApp(r4, r6, r7)
                            if (r3 != 0) goto L_0x00af
                            goto L_0x00b6
                        L_0x00af:
                            java.lang.String r0 = "mp"
                            r2.a((java.lang.String) r0)
                            goto L_0x013f
                        L_0x00b6:
                            android.app.Activity r10 = r2.f38347e
                            com.ss.android.ugc.aweme.commerce.service.models.h r3 = r2.f38344b
                            if (r3 == 0) goto L_0x00c0
                            java.lang.String r5 = r3.getJumpToAppUrl()
                        L_0x00c0:
                            r11 = r5
                            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$f r3 = new com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$f
                            r3.<init>(r2)
                            r12 = r3
                            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
                            r13 = 3
                            java.lang.Object[] r3 = new java.lang.Object[r13]
                            r3[r0] = r10
                            r14 = 1
                            r3[r14] = r11
                            r15 = 2
                            r3[r15] = r12
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.f38343a
                            r6 = 0
                            r7 = 30168(0x75d8, float:4.2274E-41)
                            java.lang.Class[] r8 = new java.lang.Class[r13]
                            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
                            r8[r0] = r4
                            java.lang.Class<java.lang.String> r4 = java.lang.String.class
                            r8[r14] = r4
                            java.lang.Class<kotlin.jvm.functions.Function1> r4 = kotlin.jvm.functions.Function1.class
                            r8[r15] = r4
                            java.lang.Class r9 = java.lang.Void.TYPE
                            r4 = r2
                            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                            if (r3 == 0) goto L_0x0112
                            java.lang.Object[] r3 = new java.lang.Object[r13]
                            r3[r0] = r10
                            r3[r14] = r11
                            r3[r15] = r12
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.f38343a
                            r6 = 0
                            r7 = 30168(0x75d8, float:4.2274E-41)
                            java.lang.Class[] r8 = new java.lang.Class[r13]
                            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
                            r8[r0] = r4
                            java.lang.Class<java.lang.String> r0 = java.lang.String.class
                            r8[r14] = r0
                            java.lang.Class<kotlin.jvm.functions.Function1> r0 = kotlin.jvm.functions.Function1.class
                            r8[r15] = r0
                            java.lang.Class r9 = java.lang.Void.TYPE
                            r4 = r2
                            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                            goto L_0x013f
                        L_0x0112:
                            android.app.Activity r0 = r2.f38347e
                            if (r0 == 0) goto L_0x013a
                            r0 = r11
                            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                            boolean r0 = android.text.TextUtils.isEmpty(r0)
                            if (r0 == 0) goto L_0x0120
                            goto L_0x013a
                        L_0x0120:
                            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r2.f38344b
                            if (r0 == 0) goto L_0x012a
                            boolean r0 = r0.isJDGood()
                            if (r0 == r14) goto L_0x0134
                        L_0x012a:
                            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r2.f38344b
                            if (r0 == 0) goto L_0x013f
                            boolean r0 = r0.isKaolaGood()
                            if (r0 != r14) goto L_0x0139
                        L_0x0134:
                            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r2.f38344b
                            com.ss.android.ugc.aweme.commercialize.g.a((com.ss.android.ugc.aweme.commerce.service.models.h) r0, (android.app.Activity) r10, (java.lang.String) r11, (kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>) r12)
                        L_0x0139:
                            return
                        L_0x013a:
                            java.lang.Boolean r0 = java.lang.Boolean.FALSE
                            r12.invoke(r0)
                        L_0x013f:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.n.AnonymousClass1.invoke():void");
                    }
                });
            } else {
                this.f38368b.a("commodity_page", "click_product", new Function0<Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ n this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void invoke() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30196, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30196, new Class[0], Void.TYPE);
                            return;
                        }
                        this.this$0.f38368b.c();
                    }
                });
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f38343a, false, 30174, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f38343a, false, 30174, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.u == null) {
            this.u = new HashMap();
        }
        View view = (View) this.u.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.u.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    @Nullable
    public final Activity getActivity() {
        return this.f38347e;
    }

    @Nullable
    public final String getAwemeId() {
        return this.f38345c;
    }

    @Nullable
    public final Point getCartCenterPoint() {
        return this.j;
    }

    @Nullable
    public final b getListener() {
        return this.h;
    }

    @Nullable
    public final String getOriginFeedAwemeId() {
        return this.f38346d;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.commerce.service.models.h getPromotion() {
        return this.f38344b;
    }

    @NotNull
    public final String getReferFrom() {
        return this.g;
    }

    public final boolean getSaleOut() {
        return this.s;
    }

    public final boolean getShowOriginalButton() {
        return this.t;
    }

    public final long getStartPreviewTime() {
        return this.i;
    }

    @Nullable
    public final String getUid() {
        return this.f38348f;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30151, new Class[0], Void.TYPE);
        } else if (this.f38344b != null) {
            d();
            e();
        }
    }

    private final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30157, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.hn, (LinearLayout) a((int) C0906R.id.pn), true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "container");
        ((DmtTextView) inflate.findViewById(C0906R.id.br8)).setBackgroundResource(2130838421);
        View findViewById = inflate.findViewById(C0906R.id.br7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "container.normalDivider");
        findViewById.setVisibility(0);
        ((DmtTextView) inflate.findViewById(C0906R.id.br9)).setBackgroundResource(2130838424);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r2 != null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f38343a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 30158(0x75ce, float:4.226E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f38343a
            r5 = 0
            r6 = 30158(0x75ce, float:4.226E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.content.Context r0 = r9.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131689785(0x7f0f0139, float:1.9008595E38)
            r2 = 2131165798(0x7f070266, float:1.7945823E38)
            android.view.View r2 = r9.a((int) r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 1
            android.view.View r0 = r0.inflate(r1, r2, r3)
            java.lang.String r1 = "container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r9.setAlphaAnimation75(r0)
            r1 = 2131169099(0x7f070f4b, float:1.7952519E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "container.pre_sale_delivery_prefix"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.f38344b
            if (r2 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.commerce.service.models.r r2 = r2.getToutiao()
            if (r2 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale r2 = r2.getPreSale()
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = r2.getButtonPrefix()
            if (r2 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            java.lang.String r2 = ""
        L_0x006b:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$k r1 = new com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$k
            r1.<init>(r9)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.i():void");
    }

    private final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30159, new Class[0], Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setBackgroundResource(2130838419);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setTextColor(-1);
        g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
        Context context = dmtTextView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        dmtTextView.setText(aVar.a(context, C0906R.string.ajm, new Object[0]));
        dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ((LinearLayout) a((int) C0906R.id.pn)).addView(dmtTextView);
    }

    public final void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30169, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.log.g.a(getContext(), com.ss.android.ugc.aweme.commerce.a.a.a(this.f38346d), this.f38344b, System.currentTimeMillis(), SystemClock.uptimeMillis() - this.i);
        if (this.f38347e != null) {
            Activity activity = this.f38347e;
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.f38344b;
            if (hVar != null) {
                str = hVar.getDetailUrl();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.commercialize.g.a(activity, str, this.f38344b, "product_detail", this.f38345c, this.f38348f, "full_screen_card", "click_full_screen_card", Boolean.TRUE, this.g);
        }
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30153, new Class[0], Void.TYPE);
            return;
        }
        ((LinearLayout) a((int) C0906R.id.pn)).removeAllViews();
        ((LinearLayout) a((int) C0906R.id.pn)).setOnClickListener(null);
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.f38344b;
        if (hVar == null || !hVar.isThirdParty()) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.f38344b;
            if (hVar2 == null || hVar2.isAppointment() || !this.s) {
                com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = this.f38344b;
                if (hVar3 == null || hVar3.isOnSale()) {
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar4 = this.f38344b;
                    if (hVar4 == null || !hVar4.isPreSaleGood()) {
                        com.ss.android.ugc.aweme.commerce.service.models.h hVar5 = this.f38344b;
                        if (hVar5 == null || !hVar5.isAppointment()) {
                            f();
                        } else {
                            g();
                        }
                    } else {
                        i();
                    }
                } else {
                    h();
                }
            } else {
                h();
            }
        } else {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar6 = this.f38344b;
            if (hVar6 == null || hVar6.isOnSale()) {
                com.ss.android.ugc.aweme.commerce.service.models.h hVar7 = this.f38344b;
                if (hVar7 != null && hVar7.isTaobaoGood()) {
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar8 = this.f38344b;
                    if (hVar8 != null && hVar8.hasTaobaoCoupon()) {
                        k();
                        return;
                    }
                }
                l();
                return;
            }
            j();
        }
    }

    private final void g() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30155, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.hh, (LinearLayout) a((int) C0906R.id.pn), true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "container");
        DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(C0906R.id.fh);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "container.appointLeftBtn");
        setAlphaAnimation75(dmtTextView);
        DmtTextView dmtTextView2 = (DmtTextView) inflate.findViewById(C0906R.id.fi);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "container.appointRightBtn");
        setAlphaAnimation75(dmtTextView2);
        DmtTextView dmtTextView3 = (DmtTextView) inflate.findViewById(C0906R.id.fh);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "container.appointLeftBtn");
        a((View) dmtTextView3);
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.f38344b;
        if (hVar != null) {
            r toutiao = hVar.getToutiao();
            if (toutiao != null) {
                PromotionAppointment appointment = toutiao.getAppointment();
                if (appointment != null && appointment.isAppointment()) {
                    str = getResources().getString(C0906R.string.fu);
                    DmtTextView dmtTextView4 = (DmtTextView) inflate.findViewById(C0906R.id.fi);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "container.appointRightBtn");
                    dmtTextView4.setText(str);
                    ((DmtTextView) inflate.findViewById(C0906R.id.fi)).setOnClickListener(new i(this, inflate));
                }
            }
        }
        str = getResources().getString(C0906R.string.fw);
        DmtTextView dmtTextView42 = (DmtTextView) inflate.findViewById(C0906R.id.fi);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView42, "container.appointRightBtn");
        dmtTextView42.setText(str);
        ((DmtTextView) inflate.findViewById(C0906R.id.fi)).setOnClickListener(new i(this, inflate));
    }

    private final void k() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30160, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.hr, (LinearLayout) a((int) C0906R.id.pn), true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "container");
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0906R.id.a0p);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "container.couponLeftBtn");
        setAlphaAnimation75(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0906R.id.a0s);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "container.couponRightBtn");
        setAlphaAnimation75(linearLayout2);
        DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(C0906R.id.a0r);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "container.couponLeftBtnTop");
        e.a aVar = com.ss.android.ugc.aweme.commerce.service.l.e.f38011b;
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.f38344b;
        if (hVar == null) {
            Intrinsics.throwNpe();
        }
        dmtTextView.setText(aVar.a(hVar.getPrice()));
        DmtTextView dmtTextView2 = (DmtTextView) inflate.findViewById(C0906R.id.a0u);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "container.couponRightBtnTop");
        e.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.e.f38011b;
        com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.f38344b;
        if (hVar2 == null) {
            Intrinsics.throwNpe();
        }
        int price = hVar2.getPrice();
        com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = this.f38344b;
        if (hVar3 != null) {
            ad taobao = hVar3.getTaobao();
            if (taobao != null) {
                ae coupon = taobao.getCoupon();
                if (coupon != null) {
                    str = coupon.getCouponAmount();
                    dmtTextView2.setText(aVar2.a(aVar2.a(price, str)));
                    ((LinearLayout) inflate.findViewById(C0906R.id.a0p)).setOnClickListener(new l(this));
                    ((LinearLayout) inflate.findViewById(C0906R.id.a0s)).setOnClickListener(new m(this));
                }
            }
        }
        str = null;
        dmtTextView2.setText(aVar2.a(aVar2.a(price, str)));
        ((LinearLayout) inflate.findViewById(C0906R.id.a0p)).setOnClickListener(new l(this));
        ((LinearLayout) inflate.findViewById(C0906R.id.a0s)).setOnClickListener(new m(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        if (r2.isOtherTypeGood() == true) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f38343a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 30161(0x75d1, float:4.2265E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f38343a
            r5 = 0
            r6 = 30161(0x75d1, float:4.2265E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            android.content.Context r2 = r9.getContext()
            r1.<init>(r2)
            r2 = 17
            r1.setGravity(r2)
            r2 = 2130838422(0x7f020396, float:1.7281826E38)
            r1.setBackgroundResource(r2)
            r2 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r2)
            r2 = -1
            r1.setTextColor(r2)
            com.ss.android.ugc.aweme.commerce.service.l.g$a r3 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            android.content.Context r4 = r1.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            r5 = 2131560181(0x7f0d06f5, float:1.8745727E38)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r3 = r3.a(r4, r5, r6)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r2, r2)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.setLayoutParams(r3)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.f38344b
            r3 = 1
            if (r2 == 0) goto L_0x006e
            boolean r2 = r2.isMiniProgramGood()
            if (r2 == r3) goto L_0x0078
        L_0x006e:
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.f38344b
            if (r2 == 0) goto L_0x0079
            boolean r2 = r2.isOtherTypeGood()
            if (r2 != r3) goto L_0x0079
        L_0x0078:
            r0 = 1
        L_0x0079:
            if (r0 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r3 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r2 = r2.getService(r3)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r2 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r2
            com.ss.android.ugc.aweme.commerce.service.models.h r3 = r9.f38344b
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = r3.getSmallAppUrl()
            goto L_0x0091
        L_0x0090:
            r3 = 0
        L_0x0091:
            r2.preloadMiniApp(r3)
        L_0x0094:
            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$n r2 = new com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$n
            r2.<init>(r9, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r0 = 2131165798(0x7f070266, float:1.7945823E38)
            android.view.View r0 = r9.a((int) r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.l():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        if (r1.canBeShown() == true) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38343a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 30165(0x75d5, float:4.227E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38343a
            r3 = 0
            r4 = 30165(0x75d5, float:4.227E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            android.content.Context r9 = r16.getContext()
            java.lang.String r0 = r7.f38346d
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = com.ss.android.ugc.aweme.commerce.a.a.a((java.lang.String) r0)
            com.ss.android.ugc.aweme.commerce.service.models.h r11 = r7.f38344b
            long r12 = java.lang.System.currentTimeMillis()
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r7.i
            long r14 = r0 - r2
            com.ss.android.ugc.aweme.commercialize.log.g.a((android.content.Context) r9, (com.ss.android.ugc.aweme.feed.model.Aweme) r10, (com.ss.android.ugc.aweme.commerce.service.models.h) r11, (long) r12, (long) r14)
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = new com.ss.android.ugc.aweme.commerce.service.logs.p
            r0.<init>()
            java.lang.String r1 = r7.f38348f
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.e(r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.f38344b
            r2 = 0
            if (r1 == 0) goto L_0x005b
            boolean r1 = r1.isSelf()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x005c
        L_0x005b:
            r1 = r2
        L_0x005c:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((java.lang.Boolean) r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.f38344b
            if (r1 == 0) goto L_0x0069
            int r1 = r1.getElasticType()
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((int) r1)
            java.lang.String r1 = r7.f38345c
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.d(r1)
            java.lang.String r1 = r7.g
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((java.lang.String) r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.f38344b
            r3 = 1
            if (r1 == 0) goto L_0x0088
            boolean r1 = r1.hasCoupon()
            if (r1 != r3) goto L_0x0088
            java.lang.String r1 = "1"
            goto L_0x008a
        L_0x0088:
            java.lang.String r1 = "0"
        L_0x008a:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.g(r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.f38344b
            if (r1 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.commerce.service.models.o r1 = r1.getActivity()
            if (r1 == 0) goto L_0x009f
            boolean r1 = r1.canBeShown()
            if (r1 != r3) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.b((boolean) r3)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.f38344b
            if (r1 == 0) goto L_0x00ad
            java.lang.String r1 = r1.getPromotionId()
            goto L_0x00ae
        L_0x00ad:
            r1 = r2
        L_0x00ae:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.c(r1)
            java.lang.String r1 = "click_full_screen_card"
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.f(r1)
            java.lang.String r1 = "full_screen_card"
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.b((java.lang.String) r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.f38344b
            if (r1 == 0) goto L_0x00ca
            long r1 = r1.getCommodityType()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x00ca:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((java.lang.Long) r2)
            r0.b()
            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r7.f38344b
            boolean r0 = com.ss.android.ugc.aweme.commerce.service.l.d.b((com.ss.android.ugc.aweme.commerce.service.models.h) r0)
            if (r0 == 0) goto L_0x00e4
            android.content.Context r0 = r16.getContext()
            r1 = 2131559361(0x7f0d03c1, float:1.8744064E38)
            com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r0, (int) r1)
            return
        L_0x00e4:
            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$b r0 = r7.h
            if (r0 == 0) goto L_0x00ec
            r0.b()
            return
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f38343a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 30152(0x75c8, float:4.2252E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f38343a
            r5 = 0
            r6 = 30152(0x75c8, float:4.2252E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            r1 = 2131167215(0x7f0707ef, float:1.7948697E38)
            android.view.View r2 = r9.a((int) r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "imContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.commerce.service.models.h r3 = r9.f38344b
            r4 = 8
            if (r3 == 0) goto L_0x003e
            boolean r3 = r3.isThirdParty()
            r5 = 1
            if (r3 == r5) goto L_0x0056
        L_0x003e:
            com.ss.android.ugc.aweme.commerce.service.models.h r3 = r9.f38344b
            if (r3 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.commerce.service.models.r r3 = r3.getToutiao()
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = r3.getImUrl()
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0059
        L_0x0056:
            r3 = 8
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            r2.setVisibility(r3)
            r2 = 2131165961(0x7f070309, float:1.7946154E38)
            android.view.View r3 = r9.a((int) r2)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.String r5 = "collectContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r6 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.app.an r5 = r5.getDisableWant()
            java.lang.String r6 = "SharePrefCache.inst().disableWant"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.Object r5 = r5.c()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x008b
            r5 = 0
            goto L_0x008d
        L_0x008b:
            r5 = 8
        L_0x008d:
            r3.setVisibility(r5)
            android.view.View r3 = r9.a((int) r1)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.lang.String r5 = "imContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            int r3 = r3.getVisibility()
            r5 = 2131170133(0x7f071355, float:1.7954616E38)
            if (r3 != 0) goto L_0x00dd
            android.view.View r3 = r9.a((int) r2)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.String r6 = "collectContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r6)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x00dd
            android.view.View r3 = r9.a((int) r5)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r4 = r9.m
            int r5 = r9.m
            r3.setPadding(r4, r0, r5, r0)
            android.view.View r1 = r9.a((int) r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r3 = r9.n
            int r4 = r9.n
            r1.setPadding(r3, r0, r4, r0)
            android.view.View r1 = r9.a((int) r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            int r2 = r9.m
            int r3 = r9.o
            r1.setPadding(r2, r0, r3, r0)
            return
        L_0x00dd:
            android.view.View r3 = r9.a((int) r1)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.lang.String r6 = "imContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r6)
            int r3 = r3.getVisibility()
            if (r3 != r4) goto L_0x010d
            android.view.View r3 = r9.a((int) r2)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.String r6 = "collectContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r6)
            int r3 = r3.getVisibility()
            if (r3 != r4) goto L_0x010d
            android.view.View r1 = r9.a((int) r5)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r2 = r9.q
            int r3 = r9.q
            r1.setPadding(r2, r0, r3, r0)
            return
        L_0x010d:
            android.view.View r3 = r9.a((int) r1)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.lang.String r4 = "imContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0125
            android.view.View r1 = r9.a((int) r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            goto L_0x012b
        L_0x0125:
            android.view.View r1 = r9.a((int) r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L_0x012b:
            android.view.View r2 = r9.a((int) r5)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r3 = r9.r
            int r4 = r9.p
            r2.setPadding(r3, r0, r4, r0)
            int r2 = r9.p
            int r3 = r9.r
            r1.setPadding(r2, r0, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.d():void");
    }

    private final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f38343a, false, 30154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38343a, false, 30154, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.hn, (LinearLayout) a((int) C0906R.id.pn), true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "container");
        DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(C0906R.id.br8);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "container.normalLeftBtn");
        setAlphaAnimation75(dmtTextView);
        DmtTextView dmtTextView2 = (DmtTextView) inflate.findViewById(C0906R.id.br9);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "container.normalRightBtn");
        setAlphaAnimation75(dmtTextView2);
        DmtTextView dmtTextView3 = (DmtTextView) inflate.findViewById(C0906R.id.br8);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "container.normalLeftBtn");
        a((View) dmtTextView3);
        if (this.t) {
            DmtTextView dmtTextView4 = (DmtTextView) inflate.findViewById(C0906R.id.br9);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "container.normalRightBtn");
            g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            dmtTextView4.setText(aVar.a(context, C0906R.string.p4, new Object[0]));
        } else {
            DmtTextView dmtTextView5 = (DmtTextView) inflate.findViewById(C0906R.id.br9);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "container.normalRightBtn");
            g.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            dmtTextView5.setText(aVar2.a(context2, C0906R.string.p5, new Object[0]));
        }
        if (com.ss.android.ugc.aweme.commerce.service.l.d.b(this.f38344b)) {
            View findViewById = inflate.findViewById(C0906R.id.br7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "container.normalDivider");
            findViewById.setVisibility(0);
            ((DmtTextView) inflate.findViewById(C0906R.id.br9)).setBackgroundResource(2130838424);
        } else {
            View findViewById2 = inflate.findViewById(C0906R.id.br7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "container.normalDivider");
            findViewById2.setVisibility(8);
            ((DmtTextView) inflate.findViewById(C0906R.id.br9)).setBackgroundResource(2130838423);
        }
        ((DmtTextView) inflate.findViewById(C0906R.id.br9)).setOnClickListener(new j(this));
    }

    public final void setActivity(@Nullable Activity activity) {
        this.f38347e = activity;
    }

    public final void setAwemeId(@Nullable String str) {
        this.f38345c = str;
    }

    public final void setListener(@Nullable b bVar) {
        this.h = bVar;
    }

    public final void setOriginFeedAwemeId(@Nullable String str) {
        this.f38346d = str;
    }

    public final void setPromotion(@Nullable com.ss.android.ugc.aweme.commerce.service.models.h hVar) {
        this.f38344b = hVar;
    }

    public final void setSaleOut(boolean z) {
        this.s = z;
    }

    public final void setShowOriginalButton(boolean z) {
        this.t = z;
    }

    public final void setStartPreviewTime(long j2) {
        this.i = j2;
    }

    public final void setUid(@Nullable String str) {
        this.f38348f = str;
    }

    private final void setAlphaAnimation75(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f38343a, false, 30150, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f38343a, false, 30150, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.l.o.f38047b.b(view2);
    }

    public final void setReferFrom(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f38343a, false, 30149, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f38343a, false, 30149, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.g = str2;
    }

    private final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38343a, false, 30156, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38343a, false, 30156, new Class[]{View.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commerce.service.l.d.a(this.f38344b)) {
            view.setBackgroundResource(2130838421);
            view.setOnClickListener(new g(this));
        } else {
            view.setBackgroundResource(2130838420);
            view.setOnClickListener(new h(this, view));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewBottom(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7l, this, true);
        View.OnClickListener onClickListener = this;
        ((LinearLayout) a((int) C0906R.id.cw0)).setOnClickListener(onClickListener);
        ((LinearLayout) a((int) C0906R.id.ar2)).setOnClickListener(onClickListener);
        ((FrameLayout) a((int) C0906R.id.u3)).setOnClickListener(onClickListener);
        LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.cw0);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "storeContainer");
        setAlphaAnimation75(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.ar2);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "imContainer");
        setAlphaAnimation75(linearLayout2);
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f38343a, false, 30172, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38343a, false, 30172, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!com.ss.android.ugc.aweme.c.a.a.a(view, 500)) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == C0906R.id.cw0) {
                b bVar = this.h;
                if (bVar != null) {
                    bVar.a();
                }
            } else if (num != null && num.intValue() == C0906R.id.ar2) {
                a("commodity_page", "click_product", new e(this));
            } else if (num != null && num.intValue() == C0906R.id.u3) {
                b bVar2 = this.h;
                if (bVar2 != null) {
                    View findViewById = view.findViewById(C0906R.id.u5);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById(R.id.collectInternalContainer)");
                    bVar2.a(findViewById);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r1.canBeShown() == true) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f38343a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 30167(0x75d7, float:4.2273E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f38343a
            r3 = 0
            r4 = 30167(0x75d7, float:4.2273E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = new com.ss.android.ugc.aweme.commerce.service.logs.p
            r0.<init>()
            java.lang.String r1 = r9.f38348f
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.e(r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.f38344b
            r2 = 0
            if (r1 == 0) goto L_0x0049
            boolean r1 = r1.isSelf()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((java.lang.Boolean) r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.f38344b
            if (r1 == 0) goto L_0x0057
            int r1 = r1.getElasticType()
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((int) r1)
            java.lang.String r1 = r9.f38345c
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.d(r1)
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.h(r10)
            java.lang.String r1 = r9.g
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((java.lang.String) r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.f38344b
            if (r1 == 0) goto L_0x0079
            boolean r1 = r1.hasCoupon()
            if (r1 != r7) goto L_0x0079
            java.lang.String r1 = "1"
            goto L_0x007b
        L_0x0079:
            java.lang.String r1 = "0"
        L_0x007b:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.g(r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.f38344b
            if (r1 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.commerce.service.models.o r1 = r1.getActivity()
            if (r1 == 0) goto L_0x0090
            boolean r1 = r1.canBeShown()
            if (r1 != r7) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.b((boolean) r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.f38344b
            if (r1 == 0) goto L_0x009e
            java.lang.String r1 = r1.getPromotionId()
            goto L_0x009f
        L_0x009e:
            r1 = r2
        L_0x009f:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.c(r1)
            java.lang.String r1 = "click_full_screen_card"
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.f(r1)
            java.lang.String r1 = "full_screen_card"
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.b((java.lang.String) r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.f38344b
            if (r1 == 0) goto L_0x00bb
            long r1 = r1.getCommodityType()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
        L_0x00bb:
            com.ss.android.ugc.aweme.commerce.service.logs.p r0 = r0.a((java.lang.Long) r2)
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.a(java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewBottom(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7l, this, true);
        View.OnClickListener onClickListener = this;
        ((LinearLayout) a((int) C0906R.id.cw0)).setOnClickListener(onClickListener);
        ((LinearLayout) a((int) C0906R.id.ar2)).setOnClickListener(onClickListener);
        ((FrameLayout) a((int) C0906R.id.u3)).setOnClickListener(onClickListener);
        LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.cw0);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "storeContainer");
        setAlphaAnimation75(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.ar2);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "imContainer");
        setAlphaAnimation75(linearLayout2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewBottom(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7l, this, true);
        View.OnClickListener onClickListener = this;
        ((LinearLayout) a((int) C0906R.id.cw0)).setOnClickListener(onClickListener);
        ((LinearLayout) a((int) C0906R.id.ar2)).setOnClickListener(onClickListener);
        ((FrameLayout) a((int) C0906R.id.u3)).setOnClickListener(onClickListener);
        LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.cw0);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "storeContainer");
        setAlphaAnimation75(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.ar2);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "imContainer");
        setAlphaAnimation75(linearLayout2);
    }

    public final void a(String str, String str2, Function0<Unit> function0) {
        String str3 = str;
        String str4 = str2;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{str3, str4, function02}, this, f38343a, false, 30170, new Class[]{String.class, String.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, function02}, this, f38343a, false, 30170, new Class[]{String.class, String.class, Function0.class}, Void.TYPE);
        } else if (this.f38347e != null) {
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (a2.isLogin()) {
                function0.invoke();
            } else {
                com.ss.android.ugc.aweme.login.e.a(this.f38347e, str3, str4, (com.ss.android.ugc.aweme.base.component.f) new d(function02));
            }
        }
    }
}
