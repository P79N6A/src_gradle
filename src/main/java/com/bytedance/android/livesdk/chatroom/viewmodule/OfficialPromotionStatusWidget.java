package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.presenter.bn;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.widget.WaveProgressView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010)\u001a\u00020*H\u0016J\u001f\u0010+\u001a\u00020,2\u0010\u0010-\u001a\f\u0012\u0006\b\u0001\u0012\u00020/\u0018\u00010.H\u0016¢\u0006\u0002\u00100J\u001f\u00101\u001a\u00020,2\u0010\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010.H\u0016¢\u0006\u0002\u00100J\u0018\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020*H\u0016J\u001a\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u00010 2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020,H\u0002J\b\u0010:\u001a\u00020,H\u0016J\u0018\u0010;\u001a\u00020,2\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020*H\u0002J\b\u0010<\u001a\u00020,H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0012\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0013\u0010\bR#\u0010\u0015\u001a\n \u0006*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R#\u0010!\u001a\n \u0006*\u0004\u0018\u00010\"0\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b#\u0010$R#\u0010&\u001a\n \u0006*\u0004\u0018\u00010\"0\"8BX\u0002¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b'\u0010$¨\u0006="}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/viewmodule/OfficialPromotionStatusWidget;", "Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;", "Lcom/bytedance/android/livesdk/chatroom/presenter/PromotionStatusPresenter$IView;", "()V", "bgOfficialPromotionProgress", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getBgOfficialPromotionProgress", "()Landroid/view/View;", "bgOfficialPromotionProgress$delegate", "Lkotlin/Lazy;", "dialog", "Lcom/bytedance/android/livesdk/promotioncard/OfficialPromotionHotValueDialog;", "getDialog", "()Lcom/bytedance/android/livesdk/promotioncard/OfficialPromotionHotValueDialog;", "dialog$delegate", "isAnchor", "", "officialPromotionDone", "getOfficialPromotionDone", "officialPromotionDone$delegate", "officialPromotionProgress", "Lcom/bytedance/android/livesdk/widget/WaveProgressView;", "getOfficialPromotionProgress", "()Lcom/bytedance/android/livesdk/widget/WaveProgressView;", "officialPromotionProgress$delegate", "presenter", "Lcom/bytedance/android/livesdk/chatroom/presenter/PromotionStatusPresenter;", "getPresenter", "()Lcom/bytedance/android/livesdk/chatroom/presenter/PromotionStatusPresenter;", "presenter$delegate", "status", "Lcom/bytedance/android/livesdk/chatroom/presenter/PromotionStatusPresenter$PromotionStatus;", "tvOfficialPromotion", "Landroid/widget/TextView;", "getTvOfficialPromotion", "()Landroid/widget/TextView;", "tvOfficialPromotion$delegate", "tvOfficialPromotionProgress", "getTvOfficialPromotionProgress", "tvOfficialPromotionProgress$delegate", "getLayoutId", "", "onInit", "", "args", "", "", "([Ljava/lang/Object;)V", "onLoad", "onPromotionProgressChange", "show", "target", "onPromotionStatusChange", "newStatus", "roomId", "", "onStatusClick", "onUnload", "updateProgress", "updateVisibility", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class OfficialPromotionStatusWidget extends LiveRecyclableWidget implements bn.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12707a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f12708b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OfficialPromotionStatusWidget.class), "presenter", "getPresenter()Lcom/bytedance/android/livesdk/chatroom/presenter/PromotionStatusPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OfficialPromotionStatusWidget.class), "bgOfficialPromotionProgress", "getBgOfficialPromotionProgress()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OfficialPromotionStatusWidget.class), "tvOfficialPromotionProgress", "getTvOfficialPromotionProgress()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OfficialPromotionStatusWidget.class), "officialPromotionDone", "getOfficialPromotionDone()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OfficialPromotionStatusWidget.class), "officialPromotionProgress", "getOfficialPromotionProgress()Lcom/bytedance/android/livesdk/widget/WaveProgressView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OfficialPromotionStatusWidget.class), "tvOfficialPromotion", "getTvOfficialPromotion()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OfficialPromotionStatusWidget.class), "dialog", "getDialog()Lcom/bytedance/android/livesdk/promotioncard/OfficialPromotionHotValueDialog;"))};

    /* renamed from: c  reason: collision with root package name */
    bn.b f12709c = bn.b.IDLE;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12710d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f12711e = LazyKt.lazy(f.INSTANCE);

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f12712f = LazyKt.lazy(new a(this));
    private final Lazy g = LazyKt.lazy(new h(this));
    private final Lazy h = LazyKt.lazy(new c(this));
    private final Lazy i = LazyKt.lazy(new d(this));
    private final Lazy j = LazyKt.lazy(new g(this));
    private final Lazy k = LazyKt.lazy(new b(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OfficialPromotionStatusWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OfficialPromotionStatusWidget officialPromotionStatusWidget) {
            super(0);
            this.this$0 = officialPromotionStatusWidget;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7337, new Class[0], View.class)) {
                return this.this$0.contentView.findViewById(C0906R.id.km);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7337, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/android/livesdk/promotioncard/OfficialPromotionHotValueDialog;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function0<com.bytedance.android.livesdk.q.a> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OfficialPromotionStatusWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OfficialPromotionStatusWidget officialPromotionStatusWidget) {
            super(0);
            this.this$0 = officialPromotionStatusWidget;
        }

        @NotNull
        public final com.bytedance.android.livesdk.q.a invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7338, new Class[0], com.bytedance.android.livesdk.q.a.class)) {
                return (com.bytedance.android.livesdk.q.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7338, new Class[0], com.bytedance.android.livesdk.q.a.class);
            }
            Context context = this.this$0.context;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            return new com.bytedance.android.livesdk.q.a(context, this.this$0.f12710d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OfficialPromotionStatusWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OfficialPromotionStatusWidget officialPromotionStatusWidget) {
            super(0);
            this.this$0 = officialPromotionStatusWidget;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7339, new Class[0], View.class)) {
                return this.this$0.contentView.findViewById(C0906R.id.bua);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7339, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/android/livesdk/widget/WaveProgressView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class d extends Lambda implements Function0<WaveProgressView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OfficialPromotionStatusWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(OfficialPromotionStatusWidget officialPromotionStatusWidget) {
            super(0);
            this.this$0 = officialPromotionStatusWidget;
        }

        public final WaveProgressView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7340, new Class[0], WaveProgressView.class)) {
                return (WaveProgressView) this.this$0.contentView.findViewById(C0906R.id.bub);
            }
            return (WaveProgressView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7340, new Class[0], WaveProgressView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OfficialPromotionStatusWidget f12714b;

        e(OfficialPromotionStatusWidget officialPromotionStatusWidget) {
            this.f12714b = officialPromotionStatusWidget;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f12713a, false, 7341, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12713a, false, 7341, new Class[]{View.class}, Void.TYPE);
                return;
            }
            OfficialPromotionStatusWidget officialPromotionStatusWidget = this.f12714b;
            if (PatchProxy.isSupport(new Object[0], officialPromotionStatusWidget, OfficialPromotionStatusWidget.f12707a, false, 7332, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], officialPromotionStatusWidget, OfficialPromotionStatusWidget.f12707a, false, 7332, new Class[0], Void.TYPE);
                return;
            }
            if (officialPromotionStatusWidget.f12709c == bn.b.FINISHED) {
                officialPromotionStatusWidget.f12709c = bn.b.IDLE;
                officialPromotionStatusWidget.d();
                officialPromotionStatusWidget.c().f16860b = officialPromotionStatusWidget.b().f11303c;
                if (!officialPromotionStatusWidget.c().isShowing()) {
                    officialPromotionStatusWidget.c().show();
                }
                com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                Object[] objArr = new Object[3];
                j jVar = new j();
                if (officialPromotionStatusWidget.f12710d) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                objArr[0] = jVar.a(str).f("click");
                objArr[1] = new k();
                objArr[2] = Room.class;
                a2.a("pm_live_card_end_click", objArr);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/android/livesdk/chatroom/presenter/PromotionStatusPresenter;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class f extends Lambda implements Function0<bn> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(0);
        }

        @NotNull
        public final bn invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7342, new Class[0], bn.class)) {
                return new bn(3);
            }
            return (bn) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7342, new Class[0], bn.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class g extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OfficialPromotionStatusWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(OfficialPromotionStatusWidget officialPromotionStatusWidget) {
            super(0);
            this.this$0 = officialPromotionStatusWidget;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7343, new Class[0], TextView.class)) {
                return (TextView) this.this$0.contentView.findViewById(C0906R.id.dfm);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7343, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class h extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OfficialPromotionStatusWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(OfficialPromotionStatusWidget officialPromotionStatusWidget) {
            super(0);
            this.this$0 = officialPromotionStatusWidget;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 7344, new Class[0], TextView.class)) {
                return (TextView) this.this$0.contentView.findViewById(C0906R.id.dfo);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 7344, new Class[0], TextView.class);
        }
    }

    private final View e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7321, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7321, new Class[0], View.class);
        } else {
            value = this.f12712f.getValue();
        }
        return (View) value;
    }

    private final TextView f() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7322, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7322, new Class[0], TextView.class);
        } else {
            value = this.g.getValue();
        }
        return (TextView) value;
    }

    private final View g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7323, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7323, new Class[0], View.class);
        } else {
            value = this.h.getValue();
        }
        return (View) value;
    }

    private final WaveProgressView h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7324, new Class[0], WaveProgressView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7324, new Class[0], WaveProgressView.class);
        } else {
            value = this.i.getValue();
        }
        return (WaveProgressView) value;
    }

    private final TextView i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7325, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7325, new Class[0], TextView.class);
        } else {
            value = this.j.getValue();
        }
        return (TextView) value;
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12707a, false, 7335, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7335, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12707a, false, 7336, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12707a, false, 7336, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    /* access modifiers changed from: package-private */
    public final bn b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7320, new Class[0], bn.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7320, new Class[0], bn.class);
        } else {
            value = this.f12711e.getValue();
        }
        return (bn) value;
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.android.livesdk.q.a c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7326, new Class[0], com.bytedance.android.livesdk.q.a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7326, new Class[0], com.bytedance.android.livesdk.q.a.class);
        } else {
            value = this.k.getValue();
        }
        return (com.bytedance.android.livesdk.q.a) value;
    }

    public final int getLayoutId() {
        return C0906R.layout.al1;
    }

    public final void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7329, new Class[0], Void.TYPE);
            return;
        }
        b().d();
        View view = this.contentView;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        view.setVisibility(8);
        this.f12709c = bn.b.IDLE;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12707a, false, 7334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12707a, false, 7334, new Class[0], Void.TYPE);
            return;
        }
        switch (du.f13187a[this.f12709c.ordinal()]) {
            case 1:
                View view = this.contentView;
                Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
                view.setVisibility(8);
                View e2 = e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "bgOfficialPromotionProgress");
                e2.setVisibility(8);
                WaveProgressView h2 = h();
                Intrinsics.checkExpressionValueIsNotNull(h2, "officialPromotionProgress");
                h2.setVisibility(8);
                TextView f2 = f();
                Intrinsics.checkExpressionValueIsNotNull(f2, "tvOfficialPromotionProgress");
                f2.setVisibility(8);
                View g2 = g();
                Intrinsics.checkExpressionValueIsNotNull(g2, "officialPromotionDone");
                g2.setVisibility(8);
                i().setText(C0906R.string.dg5);
                return;
            case 2:
                View view2 = this.contentView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
                view2.setVisibility(0);
                View e3 = e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "bgOfficialPromotionProgress");
                e3.setVisibility(0);
                WaveProgressView h3 = h();
                Intrinsics.checkExpressionValueIsNotNull(h3, "officialPromotionProgress");
                h3.setVisibility(0);
                h().a();
                TextView f3 = f();
                Intrinsics.checkExpressionValueIsNotNull(f3, "tvOfficialPromotionProgress");
                f3.setVisibility(0);
                View g3 = g();
                Intrinsics.checkExpressionValueIsNotNull(g3, "officialPromotionDone");
                g3.setVisibility(8);
                i().setText(C0906R.string.dg5);
                return;
            case 3:
                if (b().f11302b != 0) {
                    View view3 = this.contentView;
                    Intrinsics.checkExpressionValueIsNotNull(view3, "contentView");
                    view3.setVisibility(0);
                    View e4 = e();
                    Intrinsics.checkExpressionValueIsNotNull(e4, "bgOfficialPromotionProgress");
                    e4.setVisibility(0);
                    WaveProgressView h4 = h();
                    Intrinsics.checkExpressionValueIsNotNull(h4, "officialPromotionProgress");
                    h4.setVisibility(0);
                    h().b();
                    TextView f4 = f();
                    Intrinsics.checkExpressionValueIsNotNull(f4, "tvOfficialPromotionProgress");
                    f4.setVisibility(4);
                    View g4 = g();
                    Intrinsics.checkExpressionValueIsNotNull(g4, "officialPromotionDone");
                    g4.setVisibility(0);
                    i().setText(C0906R.string.dg6);
                    b(1, 1);
                    break;
                } else {
                    this.f12709c = bn.b.IDLE;
                    ai.a((int) C0906R.string.dg7);
                    d();
                    return;
                }
        }
    }

    public final void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12707a, false, 7327, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12707a, false, 7327, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.contentView.setOnClickListener(new e(this));
    }

    public final void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12707a, false, 7328, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12707a, false, 7328, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        Object obj = this.dataCenter.get("data_is_anchor");
        Intrinsics.checkExpressionValueIsNotNull(obj, "dataCenter.get<Boolean>(…tConstant.DATA_IS_ANCHOR)");
        this.f12710d = ((Boolean) obj).booleanValue();
        d();
        b().a((bn.a) this);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12707a, false, 7331, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12707a, false, 7331, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i2, i3);
    }

    private final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12707a, false, 7333, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12707a, false, 7333, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float f2 = ((float) i2) / ((float) i3);
        WaveProgressView h2 = h();
        Intrinsics.checkExpressionValueIsNotNull(h2, "officialPromotionProgress");
        h2.setProgress(f2);
        TextView f3 = f();
        Intrinsics.checkExpressionValueIsNotNull(f3, "tvOfficialPromotionProgress");
        f3.setText(ac.a((int) C0906R.string.dg9, Integer.valueOf((int) (f2 * 100.0f))));
    }

    public final void a(@Nullable bn.b bVar, long j2) {
        bn.b bVar2 = bVar;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{bVar2, new Long(j3)}, this, f12707a, false, 7330, new Class[]{bn.b.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, new Long(j3)}, this, f12707a, false, 7330, new Class[]{bn.b.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (bVar2 != null) {
            this.f12709c = bVar2;
            d();
        }
    }
}
