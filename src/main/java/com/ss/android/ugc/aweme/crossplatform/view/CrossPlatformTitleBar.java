package com.ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0019R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/ss/android/ugc/aweme/crossplatform/params/base/CrossPlatformParams;", "crossPlatformParams", "getCrossPlatformParams", "()Lcom/ss/android/ugc/aweme/crossplatform/params/base/CrossPlatformParams;", "setCrossPlatformParams", "(Lcom/ss/android/ugc/aweme/crossplatform/params/base/CrossPlatformParams;)V", "titleWrap", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar$ITitle;", "getTitleWrap", "()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar$ITitle;", "setTitleWrap", "(Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar$ITitle;)V", "enterGradualChangeMode", "", "enterImmersiveMode", "enterNormalMode", "hideCloseAll", "init", "initView", "setBackgroundAlpha", "alpha", "", "setTitle", "str", "", "showCloseAll", "ITitle", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CrossPlatformTitleBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40990a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private a f40991b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.crossplatform.params.base.a f40992c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f40993d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar$ITitle;", "", "clickBack", "", "clickCloseAllPage", "clickMenu", "view", "Landroid/view/View;", "clickReport", "clickShare", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();

        void a(@NotNull View view);

        void b();

        void c();

        void d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f40995b;

        b(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f40995b = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f40994a, false, 34540, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f40994a, false, 34540, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a titleWrap = this.f40995b.getTitleWrap();
            if (titleWrap != null) {
                Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                titleWrap.a(view2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40996a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f40997b;

        c(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f40997b = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40996a, false, 34541, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f40996a, false, 34541, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a titleWrap = this.f40997b.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f40999b;

        d(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f40999b = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40998a, false, 34542, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f40998a, false, 34542, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a titleWrap = this.f40999b.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f41001b;

        e(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f41001b = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f41000a, false, 34543, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f41000a, false, 34543, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a titleWrap = this.f41001b.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f41003b;

        f(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f41003b = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f41002a, false, 34544, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f41002a, false, 34544, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a titleWrap = this.f41003b.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.b();
            }
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40990a, false, 34538, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40990a, false, 34538, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f40993d == null) {
            this.f40993d = new HashMap();
        }
        View view = (View) this.f40993d.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f40993d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.crossplatform.params.base.a getCrossPlatformParams() {
        return this.f40992c;
    }

    @Nullable
    public final a getTitleWrap() {
        return this.f40991b;
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f40990a, false, 34537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40990a, false, 34537, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.aqk, this, true);
        setBackgroundResource(2130838252);
        setMinimumHeight((int) getResources().getDimension(C0906R.dimen.m6));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40990a, false, 34531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40990a, false, 34531, new Class[0], Void.TYPE);
            return;
        }
        setBackgroundColor(0);
        if (com.ss.android.g.a.a()) {
            View a2 = a(C0906R.id.k9);
            Intrinsics.checkExpressionValueIsNotNull(a2, "bg_browser_title");
            a2.setVisibility(0);
        } else {
            View a3 = a(C0906R.id.k9);
            Intrinsics.checkExpressionValueIsNotNull(a3, "bg_browser_title");
            a3.setVisibility(8);
        }
        DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, PushConstants.TITLE);
        dmtTextView.setVisibility(8);
        ((AutoRTLImageView) a(C0906R.id.to)).setImageResource(2130839442);
        ((AutoRTLImageView) a(C0906R.id.tk)).setImageResource(2130839444);
        ((AutoRTLImageView) a(C0906R.id.p3)).setImageResource(2130839450);
        ((AutoRTLImageView) a(C0906R.id.cdp)).setImageResource(2130839448);
        ((AutoRTLImageView) a(C0906R.id.cep)).setImageResource(2130839446);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40990a, false, 34532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40990a, false, 34532, new Class[0], Void.TYPE);
            return;
        }
        setBackgroundColor(0);
        View a2 = a(C0906R.id.k9);
        Intrinsics.checkExpressionValueIsNotNull(a2, "bg_browser_title");
        a2.setVisibility(0);
        View a3 = a(C0906R.id.k9);
        Intrinsics.checkExpressionValueIsNotNull(a3, "bg_browser_title");
        a3.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getContext(), 2130838252));
        DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, PushConstants.TITLE);
        dmtTextView.setVisibility(8);
        ((AutoRTLImageView) a(C0906R.id.to)).setImageResource(2130839442);
        ((AutoRTLImageView) a(C0906R.id.tk)).setImageResource(2130839444);
        ((AutoRTLImageView) a(C0906R.id.p3)).setImageResource(2130839450);
        ((AutoRTLImageView) a(C0906R.id.cdp)).setImageResource(2130839448);
        ((AutoRTLImageView) a(C0906R.id.cep)).setImageResource(2130839446);
    }

    public final void setTitleWrap(@Nullable a aVar) {
        this.f40991b = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossPlatformTitleBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        c();
    }

    public final void setBackgroundAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f40990a, false, 34534, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f40990a, false, 34534, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        View a2 = a(C0906R.id.k9);
        Intrinsics.checkExpressionValueIsNotNull(a2, "bg_browser_title");
        a2.setAlpha(f2);
    }

    public final void setTitle(@NotNull CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f40990a, false, 34530, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f40990a, false, 34530, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(charSequence2, "str");
        DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, PushConstants.TITLE);
        dmtTextView.setText(charSequence2);
    }

    public final void setCrossPlatformParams(@Nullable com.ss.android.ugc.aweme.crossplatform.params.base.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f40990a, false, 34528, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f40990a, false, 34528, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE);
            return;
        }
        this.f40992c = aVar;
        com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2 = this.f40992c;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f40990a, false, 34529, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f40990a, false, 34529, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, PushConstants.TITLE);
            if (TextUtils.isEmpty(aVar2.f40808d.f40825d)) {
                str = getContext().getString(C0906R.string.cbo);
            } else {
                str = aVar2.f40808d.f40825d;
            }
            dmtTextView.setText(str);
            ((AutoRTLImageView) a(C0906R.id.cep)).setOnClickListener(new b(this));
            ((AutoRTLImageView) a(C0906R.id.to)).setOnClickListener(new c(this));
            ((AutoRTLImageView) a(C0906R.id.tk)).setOnClickListener(new d(this));
            if (aVar2.f40808d.f40823b) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(C0906R.id.cep);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView, "right_menu");
                autoRTLImageView.setVisibility(8);
            }
            ((AutoRTLImageView) a(C0906R.id.p3)).setOnClickListener(new e(this));
            if (aVar2.f40808d.h) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) a(C0906R.id.to);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView2, "close_custom");
                autoRTLImageView2.setVisibility(0);
            }
            if (aVar2.f40808d.f40826e != -2) {
                DmtTextView dmtTextView2 = (DmtTextView) a(C0906R.id.title);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, PushConstants.TITLE);
                dmtTextView2.setBackground(new ColorDrawable(aVar2.f40808d.f40826e));
                setBackgroundColor(aVar2.f40808d.f40826e);
            }
            if (aVar2.f40808d.g != -2) {
                ((DmtTextView) a(C0906R.id.title)).setTextColor(aVar2.f40808d.g);
            }
            if (aVar2.f40808d.f40823b) {
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) a(C0906R.id.p3);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView3, "btn_share");
                autoRTLImageView3.setVisibility(8);
            }
            if (aVar2.f40808d.f40824c) {
                if (j.a().a(aVar2.f40805a.k) != null) {
                    AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) a(C0906R.id.cdp);
                    Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView4, "report_ads");
                    autoRTLImageView4.setVisibility(0);
                    ((AutoRTLImageView) a(C0906R.id.cdp)).setOnClickListener(new f(this));
                }
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) a(C0906R.id.p3);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView5, "btn_share");
                autoRTLImageView5.setVisibility(8);
            }
            if (aVar2.f40808d.z == 2) {
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) a(C0906R.id.p3);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView6, "btn_share");
                autoRTLImageView6.setVisibility(0);
                AutoRTLImageView autoRTLImageView7 = (AutoRTLImageView) a(C0906R.id.cdp);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView7, "report_ads");
                autoRTLImageView7.setVisibility(8);
            } else if (aVar2.f40808d.z == 1) {
                AutoRTLImageView autoRTLImageView8 = (AutoRTLImageView) a(C0906R.id.p3);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView8, "btn_share");
                autoRTLImageView8.setVisibility(8);
                AutoRTLImageView autoRTLImageView9 = (AutoRTLImageView) a(C0906R.id.cdp);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView9, "report_ads");
                autoRTLImageView9.setVisibility(0);
            }
            if (!com.ss.android.g.a.a() && aVar2.f40808d.i) {
                com.ss.android.ugc.aweme.crossplatform.base.b.a((View) (AutoRTLImageView) a(C0906R.id.cep), 2130838460);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossPlatformTitleBar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossPlatformTitleBar(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        c();
    }
}
