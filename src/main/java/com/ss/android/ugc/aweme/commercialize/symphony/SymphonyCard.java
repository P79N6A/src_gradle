package com.ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019J\u0010\u0010\u001a\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/SymphonyCard;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShowing", "", "()Z", "setShowing", "(Z)V", "isTranslating", "getAddOtherLayout", "Landroid/view/ViewGroup;", "reset", "", "setCardInfo", "iNativeAd", "Lcom/bytedance/ad/symphony/ad/nativead/INativeAd;", "sponsor", "", "closeAction", "Lkotlin/Function0;", "shouldShow", "translationOutScreen", "translationToScreen", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SymphonyCard extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39519a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f39520b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f39521c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f39522d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f39524b;

        a(Function0 function0) {
            this.f39524b = function0;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39523a, false, 32123, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39523a, false, 32123, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39524b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39525a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f39526b = new b();

        b() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39525a, false, 32124, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39525a, false, 32124, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SymphonyCard f39527a;

        c(SymphonyCard symphonyCard) {
            this.f39527a = symphonyCard;
        }

        public final void run() {
            this.f39527a.f39520b = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SymphonyCard f39529b;

        d(SymphonyCard symphonyCard) {
            this.f39529b = symphonyCard;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39528a, false, 32125, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39528a, false, 32125, new Class[0], Void.TYPE);
                return;
            }
            this.f39529b.f39520b = false;
            this.f39529b.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SymphonyCard f39531b;

        e(SymphonyCard symphonyCard) {
            this.f39531b = symphonyCard;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39530a, false, 32126, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39530a, false, 32126, new Class[0], Void.TYPE);
                return;
            }
            this.f39531b.setVisibility(0);
            this.f39531b.f39520b = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SymphonyCard f39532a;

        f(SymphonyCard symphonyCard) {
            this.f39532a = symphonyCard;
        }

        public final void run() {
            this.f39532a.f39520b = false;
        }
    }

    @JvmOverloads
    public SymphonyCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SymphonyCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f39519a, false, 32121, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f39519a, false, 32121, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f39522d == null) {
            this.f39522d = new HashMap();
        }
        View view = (View) this.f39522d.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f39522d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39519a, false, 32119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39519a, false, 32119, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(8);
        this.f39521c = false;
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    @NotNull
    public final ViewGroup getAddOtherLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f39519a, false, 32117, new Class[0], ViewGroup.class)) {
            return (ViewGroup) PatchProxy.accessDispatch(new Object[0], this, f39519a, false, 32117, new Class[0], ViewGroup.class);
        }
        FrameLayout frameLayout = (FrameLayout) a(C0906R.id.qj);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "cardOthersTagLayout");
        return frameLayout;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39519a, false, 32120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39519a, false, 32120, new Class[0], Void.TYPE);
            return;
        }
        this.f39521c = false;
        animate().alpha(0.0f).withStartAction(new c(this)).setDuration(200).withEndAction(new d(this)).start();
    }

    public final void setShowing(boolean z) {
        this.f39521c = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SymphonyCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(C0906R.layout.a9g, this, true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SymphonyCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
