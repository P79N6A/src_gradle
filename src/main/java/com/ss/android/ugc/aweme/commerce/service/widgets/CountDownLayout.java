package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.l.i;
import com.ss.android.ugc.aweme.commerce.service.models.ai;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013J,\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0006\u0010\"\u001a\u00020\u0013J\u0006\u0010#\u001a\u00020\u0013R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/CountDownLayout;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/ugc/aweme/commerce/service/utils/SecKillCountDownTimer$CountDownTimerListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBeginTime", "", "mCountDownTimer", "Lcom/ss/android/ugc/aweme/commerce/service/utils/SecKillCountDownTimer;", "mEndTime", "mOnFinish", "Lkotlin/Function0;", "", "mStatus", "textOnly", "textWithDay", "onFinish", "onStart", "onTick", "millisUntilOver", "pauseCountDown", "resumeCountDown", "setCircleStyleText", "setCountDown", "status", "beginTime", "endTime", "startTimer", "stopTimer", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class CountDownLayout extends LinearLayout implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38260a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f38261b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private i f38262c;

    /* renamed from: d  reason: collision with root package name */
    private long f38263d;

    /* renamed from: e  reason: collision with root package name */
    private long f38264e;

    /* renamed from: f  reason: collision with root package name */
    private Function0<Unit> f38265f;
    private int g = 1;
    private int h = C0906R.string.c2y;
    private int i = C0906R.string.c2x;
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/CountDownLayout$Companion;", "", "()V", "STYLE_CIRCLE", "", "STYLE_TEXT", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f38260a, false, 30057, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f38260a, false, 30057, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        View view = (View) this.j.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.j.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void f() {
        this.h = C0906R.string.c32;
        this.i = C0906R.string.c31;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38260a, false, 30056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38260a, false, 30056, new Class[0], Void.TYPE);
            return;
        }
        Function0<Unit> function0 = this.f38265f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f38260a, false, 30052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38260a, false, 30052, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.f38262c;
        this.f38262c = null;
        if (iVar != null) {
            iVar.a();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f38260a, false, 30053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38260a, false, 30053, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.f38262c;
        if (iVar != null) {
            iVar.c();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f38260a, false, 30054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38260a, false, 30054, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.f38262c;
        if (iVar != null) {
            iVar.d();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38260a, false, 30051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38260a, false, 30051, new Class[0], Void.TYPE);
            return;
        }
        c();
        i iVar = new i(TimeUnit.SECONDS.toMillis(this.f38264e - this.f38263d), TimeUnit.SECONDS.toMillis(1), this);
        this.f38262c = iVar;
        i iVar2 = this.f38262c;
        if (iVar2 != null) {
            iVar2.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a28, this, true);
    }

    public final void a(long j2) {
        DmtTextView dmtTextView;
        CharSequence charSequence;
        String str;
        CharSequence charSequence2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f38260a, false, 30055, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f38260a, false, 30055, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        ai.a aVar = ai.j;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ai a2 = aVar.a(context, j2);
        if (this.g == 0) {
            DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.cm2);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "secKillCountDownTitle");
            if (!TextUtils.isEmpty(a2.f38178e)) {
                charSequence2 = getContext().getString(this.h, new Object[]{a2.f38178e});
            } else {
                charSequence2 = getContext().getString(this.i);
            }
            dmtTextView2.setText(charSequence2);
            DmtTextView dmtTextView3 = (DmtTextView) a((int) C0906R.id.a09);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "countDownHourTv");
            dmtTextView3.setText(a2.f38179f);
            DmtTextView dmtTextView4 = (DmtTextView) a((int) C0906R.id.a0a);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "countDownMinuteTv");
            dmtTextView4.setText(a2.g);
            dmtTextView = (DmtTextView) a((int) C0906R.id.a0b);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "countDownSecondTv");
            charSequence = a2.h;
        } else {
            dmtTextView = (DmtTextView) a((int) C0906R.id.cm2);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "secKillCountDownTitle");
            if (!TextUtils.isEmpty(a2.i)) {
                str = getContext().getString(C0906R.string.c2w, new Object[]{a2.i});
            } else {
                str = "";
            }
            charSequence = str;
        }
        dmtTextView.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a28, this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a28, this, true);
    }

    public final void a(int i2, long j2, long j3, @NotNull Function0<Unit> function0) {
        long j4 = j2;
        long j5 = j3;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5), function02}, this, f38260a, false, 30050, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5), function02}, this, f38260a, false, 30050, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "onFinish");
        this.g = i2;
        this.f38263d = j4;
        this.f38264e = j5;
        this.f38265f = function02;
        if (this.g != 0) {
            LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.a0_);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "countDownLayout");
            linearLayout.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.cm2);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "secKillCountDownTitle");
            ViewGroup.LayoutParams layoutParams = dmtTextView.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) UIUtils.dip2Px(getContext(), 12.0f);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.a0_);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "countDownLayout");
        linearLayout2.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.cm2);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "secKillCountDownTitle");
        ViewGroup.LayoutParams layoutParams2 = dmtTextView2.getLayoutParams();
        if (layoutParams2 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) UIUtils.dip2Px(getContext(), 8.0f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
