package com.ss.android.ugc.aweme.commerce.preview.activitybar;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.models.s;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0002 !B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentTime", "", "mSecKillStatusListener", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillLayout$SecKillStatusListener;", "marketPrice", "secKillInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "status", "bindSecKillInfo", "", "initView", "onAttachedToWindow", "onDetachedFromWindow", "onPause", "onResume", "onStop", "setMarketPrice", "setSecKillStatusListener", "secKillStatusListener", "showPreSecKill", "showSecKill", "Companion", "SecKillStatusListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37302a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f37303f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public s f37304b;

    /* renamed from: c  reason: collision with root package name */
    public int f37305c = 2;

    /* renamed from: d  reason: collision with root package name */
    public long f37306d;

    /* renamed from: e  reason: collision with root package name */
    public C0470b f37307e;
    private int g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillLayout$Companion;", "", "()V", "PRE_SEC_KILL", "", "SEC_KILL", "SEC_KILL_END", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillLayout$SecKillStatusListener;", "", "onPreSecKill", "", "onSecKill", "onSecKillEnd", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.activitybar.b$b  reason: collision with other inner class name */
    public interface C0470b {
        void a();

        void b();

        void c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28843, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28843, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.post(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37308a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f37309b;

                {
                    this.f37309b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f37308a, false, 28844, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f37308a, false, 28844, new Class[0], Void.TYPE);
                        return;
                    }
                    this.f37309b.this$0.f37305c = 1;
                    b bVar = this.f37309b.this$0;
                    s sVar = this.f37309b.this$0.f37304b;
                    if (sVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("secKillInfo");
                    }
                    bVar.f37306d = sVar.getBeginTime();
                    this.f37309b.this$0.a();
                    C0470b bVar2 = this.f37309b.this$0.f37307e;
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28845, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28845, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.post(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37310a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f37311b;

                {
                    this.f37311b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f37310a, false, 28846, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f37310a, false, 28846, new Class[0], Void.TYPE);
                        return;
                    }
                    this.f37311b.this$0.f37305c = 2;
                    this.f37311b.this$0.setVisibility(8);
                    C0470b bVar = this.f37311b.this$0.f37307e;
                    if (bVar != null) {
                        bVar.c();
                    }
                }
            });
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37302a, false, 28841, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37302a, false, 28841, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f37302a, false, 28836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37302a, false, 28836, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        CountDownLayout countDownLayout = (CountDownLayout) a((int) C0906R.id.cm0);
        if (countDownLayout != null) {
            countDownLayout.e();
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f37302a, false, 28837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37302a, false, 28837, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        CountDownLayout countDownLayout = (CountDownLayout) a((int) C0906R.id.cm0);
        if (countDownLayout != null) {
            countDownLayout.d();
        }
    }

    private final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f37302a, false, 28834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37302a, false, 28834, new Class[0], Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.d8m);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tvSecKillTitle");
        s sVar = this.f37304b;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secKillInfo");
        }
        dmtTextView.setText(sVar.getTitle());
        ConstraintLayout constraintLayout = (ConstraintLayout) a((int) C0906R.id.cm1);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "secKillContainer");
        constraintLayout.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getContext(), 2130838124));
        PriceView priceView = (PriceView) a((int) C0906R.id.c9j);
        s sVar2 = this.f37304b;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secKillInfo");
        }
        priceView.setPriceText(com.ss.android.ugc.aweme.commerce.service.l.d.a(sVar2.getSkuMinPrice()));
        TextView textView = (TextView) a((int) C0906R.id.cm3);
        Intrinsics.checkExpressionValueIsNotNull(textView, "secKillPriceSpace");
        textView.setVisibility(8);
        PriceView priceView2 = (PriceView) a((int) C0906R.id.c9i);
        Intrinsics.checkExpressionValueIsNotNull(priceView2, "pvSecKillMaxPrice");
        priceView2.setVisibility(8);
        PriceView priceView3 = (PriceView) a((int) C0906R.id.c9h);
        Intrinsics.checkExpressionValueIsNotNull(priceView3, "pvSecKillMarketPrice");
        priceView3.setVisibility(8);
        SecKillProgressBar secKillProgressBar = (SecKillProgressBar) a((int) C0906R.id.cm4);
        Intrinsics.checkExpressionValueIsNotNull(secKillProgressBar, "secKillProgressBar");
        secKillProgressBar.setVisibility(8);
        DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.d8l);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "tvSecKillSales");
        dmtTextView2.setVisibility(8);
        CountDownLayout countDownLayout = (CountDownLayout) a((int) C0906R.id.cm0);
        long j = this.f37306d;
        s sVar3 = this.f37304b;
        if (sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secKillInfo");
        }
        countDownLayout.a(0, j, sVar3.getBeginTime(), new c(this));
        ((CountDownLayout) a((int) C0906R.id.cm0)).f();
        ((CountDownLayout) a((int) C0906R.id.cm0)).b();
        C0470b bVar = this.f37307e;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0222 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37302a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 28835(0x70a3, float:4.0406E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37302a
            r5 = 0
            r6 = 28835(0x70a3, float:4.0406E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            r1 = 2131170603(0x7f07152b, float:1.7955569E38)
            android.view.View r1 = r9.a((int) r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "tvSecKillTitle"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commerce.service.models.s r2 = r9.f37304b
            if (r2 != 0) goto L_0x003a
            java.lang.String r3 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x003a:
            java.lang.String r2 = r2.getTitle()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1 = 2131169765(0x7f0711e5, float:1.795387E38)
            android.view.View r1 = r9.a((int) r1)
            android.support.constraint.ConstraintLayout r1 = (android.support.constraint.ConstraintLayout) r1
            java.lang.String r2 = "secKillContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            android.content.Context r3 = r9.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131624993(0x7f0e0421, float:1.8877181E38)
            int r3 = r3.getColor(r4)
            r2.<init>(r3)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
            r1 = 2131169267(0x7f070ff3, float:1.795286E38)
            android.view.View r1 = r9.a((int) r1)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            com.ss.android.ugc.aweme.commerce.service.models.s r2 = r9.f37304b
            if (r2 != 0) goto L_0x0081
            java.lang.String r3 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0081:
            int r2 = r2.getSkuMinPrice()
            java.lang.String r2 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r2)
            r1.setPriceText(r2)
            com.ss.android.ugc.aweme.commerce.service.models.s r1 = r9.f37304b
            if (r1 != 0) goto L_0x0095
            java.lang.String r2 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0095:
            int r1 = r1.getSkuMaxPrice()
            r2 = 2131169767(0x7f0711e7, float:1.7953873E38)
            r3 = 2131169266(0x7f070ff2, float:1.7952857E38)
            r4 = 8
            if (r1 <= 0) goto L_0x00f6
            com.ss.android.ugc.aweme.commerce.service.models.s r1 = r9.f37304b
            if (r1 != 0) goto L_0x00ac
            java.lang.String r5 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x00ac:
            int r1 = r1.getSkuMaxPrice()
            com.ss.android.ugc.aweme.commerce.service.models.s r5 = r9.f37304b
            if (r5 != 0) goto L_0x00b9
            java.lang.String r6 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x00b9:
            int r5 = r5.getSkuMinPrice()
            if (r1 <= r5) goto L_0x00f6
            android.view.View r1 = r9.a((int) r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "secKillPriceSpace"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r0)
            android.view.View r1 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r2 = "pvSecKillMaxPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r0)
            android.view.View r1 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            com.ss.android.ugc.aweme.commerce.service.models.s r2 = r9.f37304b
            if (r2 != 0) goto L_0x00ea
            java.lang.String r3 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00ea:
            int r2 = r2.getSkuMaxPrice()
            java.lang.String r2 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r2)
            r1.setPriceText(r2)
            goto L_0x0112
        L_0x00f6:
            android.view.View r1 = r9.a((int) r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "secKillPriceSpace"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r4)
            android.view.View r1 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r2 = "pvSecKillMaxPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r4)
        L_0x0112:
            int r1 = r9.g
            com.ss.android.ugc.aweme.commerce.service.models.s r2 = r9.f37304b
            if (r2 != 0) goto L_0x011d
            java.lang.String r3 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x011d:
            int r2 = r2.getSkuMinPrice()
            r3 = 2131169265(0x7f070ff1, float:1.7952855E38)
            if (r1 <= r2) goto L_0x0144
            android.view.View r1 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r2 = "pvSecKillMarketPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r0)
            android.view.View r1 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            int r2 = r9.g
            java.lang.String r2 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r2)
            r1.setPriceText(r2)
            goto L_0x0152
        L_0x0144:
            android.view.View r1 = r9.a((int) r3)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r2 = "pvSecKillMarketPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r4)
        L_0x0152:
            r1 = 2131169768(0x7f0711e8, float:1.7953875E38)
            android.view.View r2 = r9.a((int) r1)
            com.ss.android.ugc.aweme.commerce.preview.activitybar.SecKillProgressBar r2 = (com.ss.android.ugc.aweme.commerce.preview.activitybar.SecKillProgressBar) r2
            java.lang.String r3 = "secKillProgressBar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r2.setVisibility(r0)
            r2 = 2131170602(0x7f07152a, float:1.7955567E38)
            android.view.View r3 = r9.a((int) r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
            java.lang.String r4 = "tvSecKillSales"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r3.setVisibility(r0)
            android.view.View r1 = r9.a((int) r1)
            com.ss.android.ugc.aweme.commerce.preview.activitybar.SecKillProgressBar r1 = (com.ss.android.ugc.aweme.commerce.preview.activitybar.SecKillProgressBar) r1
            com.ss.android.ugc.aweme.commerce.service.models.s r3 = r9.f37304b
            if (r3 != 0) goto L_0x0183
            java.lang.String r4 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0183:
            int r3 = r3.getStock()
            com.ss.android.ugc.aweme.commerce.service.models.s r4 = r9.f37304b
            if (r4 != 0) goto L_0x0190
            java.lang.String r5 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0190:
            int r4 = r4.getLeftStock()
            int r3 = r3 - r4
            float r3 = (float) r3
            com.ss.android.ugc.aweme.commerce.service.models.s r4 = r9.f37304b
            if (r4 != 0) goto L_0x019f
            java.lang.String r5 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x019f:
            int r4 = r4.getStock()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            r1.setProgress(r3)
            android.view.View r1 = r9.a((int) r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "tvSecKillSales"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.Context r2 = r9.getContext()
            r3 = 2131562269(0x7f0d0f1d, float:1.8749962E38)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.ss.android.ugc.aweme.commerce.service.models.s r5 = r9.f37304b
            if (r5 != 0) goto L_0x01cb
            java.lang.String r6 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x01cb:
            int r5 = r5.getStock()
            com.ss.android.ugc.aweme.commerce.service.models.s r6 = r9.f37304b
            if (r6 != 0) goto L_0x01d8
            java.lang.String r7 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x01d8:
            int r6 = r6.getLeftStock()
            int r5 = r5 - r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r0] = r5
            java.lang.String r0 = r2.getString(r3, r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            r0 = 2131169764(0x7f0711e4, float:1.7953867E38)
            android.view.View r1 = r9.a((int) r0)
            r2 = r1
            com.ss.android.ugc.aweme.commerce.service.widgets.CountDownLayout r2 = (com.ss.android.ugc.aweme.commerce.service.widgets.CountDownLayout) r2
            r3 = 1
            long r4 = r9.f37306d
            com.ss.android.ugc.aweme.commerce.service.models.s r1 = r9.f37304b
            if (r1 != 0) goto L_0x0202
            java.lang.String r6 = "secKillInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0202:
            long r6 = r1.getEndTime()
            com.ss.android.ugc.aweme.commerce.preview.activitybar.b$d r1 = new com.ss.android.ugc.aweme.commerce.preview.activitybar.b$d
            r1.<init>(r9)
            r8 = r1
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r2.a(r3, r4, r6, r8)
            android.view.View r0 = r9.a((int) r0)
            com.ss.android.ugc.aweme.commerce.service.widgets.CountDownLayout r0 = (com.ss.android.ugc.aweme.commerce.service.widgets.CountDownLayout) r0
            r0.b()
            com.ss.android.ugc.aweme.commerce.preview.activitybar.b$b r0 = r9.f37307e
            if (r0 == 0) goto L_0x0222
            r0.b()
            return
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.activitybar.b.a():void");
    }

    public final void setMarketPrice(int i) {
        this.g = i;
    }

    public final void setSecKillStatusListener(@Nullable C0470b bVar) {
        this.f37307e = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7o, this, true);
    }

    private final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37302a, false, 28833, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37302a, false, 28833, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                b();
                return;
            case 1:
                a();
                return;
            case 2:
                setVisibility(8);
                C0470b bVar = this.f37307e;
                if (bVar != null) {
                    bVar.c();
                    return;
                }
                break;
        }
    }

    public final void a(@NotNull s sVar) {
        int i = 1;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{sVar}, this, f37302a, false, 28832, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, f37302a, false, 28832, new Class[]{s.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(sVar, "secKillInfo");
        this.f37304b = sVar;
        this.f37306d = sVar.getCurrentTime();
        if (sVar.getCurrentTime() < sVar.getBeginTime()) {
            i = 0;
        } else {
            long beginTime = sVar.getBeginTime();
            long endTime = sVar.getEndTime();
            long currentTime = sVar.getCurrentTime();
            if (beginTime > currentTime || endTime < currentTime || sVar.getStock() <= 0 || sVar.getLeftStock() > sVar.getStock()) {
                i = 2;
            }
        }
        this.f37305c = i;
        if (this.f37305c == 2) {
            i2 = 8;
        }
        setVisibility(i2);
        b(this.f37305c);
    }
}
