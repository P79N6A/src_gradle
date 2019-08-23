package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020 H\u0014R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0019\u001a\n \r*\u0004\u0018\u00010\f0\f8FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001a\u0010\u000fR#\u0010\u001c\u001a\n \r*\u0004\u0018\u00010\f0\f8FX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001d\u0010\u000f¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/DouPlusRefundBanView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appealView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getAppealView", "()Landroid/widget/TextView;", "appealView$delegate", "Lkotlin/Lazy;", "cancelView", "getCancelView", "cancelView$delegate", "onAppeal", "Landroid/view/View$OnClickListener;", "onCancel", "onRefund", "refundView", "getRefundView", "refundView$delegate", "titleView", "getTitleView", "titleView$delegate", "onAttachedToWindow", "", "onFinishInflate", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DouPlusRefundBanView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39909a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f39910b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DouPlusRefundBanView.class), "titleView", "getTitleView()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DouPlusRefundBanView.class), "refundView", "getRefundView()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DouPlusRefundBanView.class), "appealView", "getAppealView()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DouPlusRefundBanView.class), "cancelView", "getCancelView()Landroid/widget/TextView;"))};

    /* renamed from: f  reason: collision with root package name */
    public static final a f39911f = new a((byte) 0);
    @Nullable
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f39912c;
    @Nullable
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public View.OnClickListener f39913d;
    @Nullable
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public View.OnClickListener f39914e;
    private final Lazy g = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new h<Object>(this));
    private final Lazy h = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new g<Object>(this));
    private final Lazy i = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new b<Object>(this));
    private final Lazy j = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new c<Object>(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/DouPlusRefundBanView$Companion;", "", "()V", "eventV3", "", "name", "", "sceneId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39915a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f39915a, false, 32871, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f39915a, false, 32871, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            r.a(str3, MapsKt.mutableMapOf(TuplesKt.to("toast_type", "dou_plus_refund"), TuplesKt.to("scene_id", str4)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DouPlusRefundBanView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DouPlusRefundBanView douPlusRefundBanView) {
            super(0);
            this.this$0 = douPlusRefundBanView;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32872, new Class[0], TextView.class)) {
                return (TextView) this.this$0.findViewById(C0906R.id.a6l);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32872, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DouPlusRefundBanView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DouPlusRefundBanView douPlusRefundBanView) {
            super(0);
            this.this$0 = douPlusRefundBanView;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32873, new Class[0], TextView.class)) {
                return (TextView) this.this$0.findViewById(C0906R.id.a6m);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32873, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DouPlusRefundBanView f39917b;

        d(DouPlusRefundBanView douPlusRefundBanView) {
            this.f39917b = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f39916a, false, 32874, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f39916a, false, 32874, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            DouPlusRefundBanView.f39911f.a("confirm_toast", "1001");
            View.OnClickListener onClickListener = this.f39917b.f39912c;
            if (onClickListener != null) {
                onClickListener.onClick(view2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DouPlusRefundBanView f39919b;

        e(DouPlusRefundBanView douPlusRefundBanView) {
            this.f39919b = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f39918a, false, 32875, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f39918a, false, 32875, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            View.OnClickListener onClickListener = this.f39919b.f39913d;
            if (onClickListener != null) {
                onClickListener.onClick(view2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DouPlusRefundBanView f39921b;

        f(DouPlusRefundBanView douPlusRefundBanView) {
            this.f39921b = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f39920a, false, 32876, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f39920a, false, 32876, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            View.OnClickListener onClickListener = this.f39921b.f39914e;
            if (onClickListener != null) {
                onClickListener.onClick(view2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DouPlusRefundBanView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(DouPlusRefundBanView douPlusRefundBanView) {
            super(0);
            this.this$0 = douPlusRefundBanView;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32877, new Class[0], TextView.class)) {
                return (TextView) this.this$0.findViewById(C0906R.id.a6n);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32877, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DouPlusRefundBanView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(DouPlusRefundBanView douPlusRefundBanView) {
            super(0);
            this.this$0 = douPlusRefundBanView;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 32878, new Class[0], TextView.class)) {
                return (TextView) this.this$0.findViewById(C0906R.id.a6o);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 32878, new Class[0], TextView.class);
        }
    }

    public final TextView getAppealView() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39909a, false, 32865, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39909a, false, 32865, new Class[0], TextView.class);
        } else {
            value = this.i.getValue();
        }
        return (TextView) value;
    }

    public final TextView getCancelView() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39909a, false, 32866, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39909a, false, 32866, new Class[0], TextView.class);
        } else {
            value = this.j.getValue();
        }
        return (TextView) value;
    }

    public final TextView getRefundView() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39909a, false, 32864, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39909a, false, 32864, new Class[0], TextView.class);
        } else {
            value = this.h.getValue();
        }
        return (TextView) value;
    }

    public final TextView getTitleView() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39909a, false, 32863, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39909a, false, 32863, new Class[0], TextView.class);
        } else {
            value = this.g.getValue();
        }
        return (TextView) value;
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f39909a, false, 32868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39909a, false, 32868, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        f39911f.a("show_toast", "1002");
    }

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f39909a, false, 32867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39909a, false, 32867, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        getRefundView().setOnClickListener(new d(this));
        getAppealView().setOnClickListener(new e(this));
        getCancelView().setOnClickListener(new f(this));
    }

    public DouPlusRefundBanView(@Nullable Context context) {
        super(context);
    }

    public DouPlusRefundBanView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DouPlusRefundBanView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
