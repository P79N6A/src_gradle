package com.ss.android.ugc.aweme.commerce.preview.pops;

import a.g;
import a.i;
import android.content.Context;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.models.aj;
import com.ss.android.ugc.aweme.commerce.widget.AlignTextView;
import com.taobao.android.dexposed.ClassUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J)\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010 J\"\u0010!\u001a\u00020\u00162\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0016\u0018\u00010#J \u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0002J\u0006\u0010(\u001a\u00020\u0012J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\nH\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0018H\u0002J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\nJ\u0010\u0010-\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u0016H\u0002J\u001a\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0006\u00101\u001a\u00020\u0016J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/CouponViewModel;", "", "couponModel", "Lcom/ss/android/ugc/aweme/commerce/service/models/UICouponModel;", "context", "Landroid/content/Context;", "(Lcom/ss/android/ugc/aweme/commerce/service/models/UICouponModel;Landroid/content/Context;)V", "alignTextView", "Lcom/ss/android/ugc/aweme/commerce/widget/AlignTextView;", "couponContainerLeft", "Landroid/widget/LinearLayout;", "couponCustomer", "Landroid/widget/TextView;", "couponDate", "couponGet", "couponName", "couponRange", "couponSplitter", "Landroid/view/View;", "couponView", "shopName", "alreadyGet", "", "color", "", "colorId", "couponProcess", "continueApply", "", "statusCode", "statusMsg", "", "(Ljava/lang/Boolean;ILjava/lang/String;)V", "doCouponGet", "logCB", "Lkotlin/Function2;", "drawText", "priceColor", "moneyColor", "conditionColor", "getCouponView", "couponBox", "getString", "stringId", "init", "initView", "invalidCoupon", "showToast", "msgId", "updateCoupon", "valid", "", "num", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37550a;
    public static final C0479a l = new C0479a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f37551b;

    /* renamed from: c  reason: collision with root package name */
    TextView f37552c;

    /* renamed from: d  reason: collision with root package name */
    TextView f37553d;

    /* renamed from: e  reason: collision with root package name */
    TextView f37554e;

    /* renamed from: f  reason: collision with root package name */
    View f37555f;
    TextView g;
    TextView h;
    TextView i;
    public final aj j;
    public final Context k;
    private AlignTextView m;
    private View n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/CouponViewModel$Companion;", "", "()V", "VALUE_0", "", "VALUE_1", "VALUE_11", "VALUE_14", "VALUE_15", "VALUE_28", "VALUE_4", "VALUE_5", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.pops.a$a  reason: collision with other inner class name */
    public static final class C0479a {
        private C0479a() {
        }

        public /* synthetic */ C0479a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f37563b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f37564c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function2 f37565d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ConsumeCouponResponse;", "kotlin.jvm.PlatformType", "then", "com/ss/android/ugc/aweme/commerce/preview/pops/CouponViewModel$doCouponGet$1$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.preview.pops.a$b$a  reason: collision with other inner class name */
        static final class C0480a<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.commerce.service.g.a.a, Void> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37567a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f37568b;

            C0480a(b bVar) {
                this.f37568b = bVar;
            }

            public final /* synthetic */ Object then(i iVar) {
                i iVar2 = iVar;
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37567a, false, 29040, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37567a, false, 29040, new Class[]{i.class}, Void.class);
                }
                Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
                if (iVar.d() || iVar.e() == null) {
                    com.ss.android.ugc.aweme.commerce.e.b.a(this.f37568b.f37563b.k, com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.f37568b.f37563b.k, C0906R.string.bga, new Object[0]));
                } else {
                    a aVar = this.f37568b.f37563b;
                    Boolean bool = ((com.ss.android.ugc.aweme.commerce.service.g.a.a) iVar.e()).f37965a;
                    int i = ((com.ss.android.ugc.aweme.commerce.service.g.a.a) iVar.e()).statusCode;
                    String str = ((com.ss.android.ugc.aweme.commerce.service.g.a.a) iVar.e()).statusMsg;
                    if (PatchProxy.isSupport(new Object[]{bool, Integer.valueOf(i), str}, aVar, a.f37550a, false, 29035, new Class[]{Boolean.class, Integer.TYPE, String.class}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{bool, Integer.valueOf(i), str}, aVar2, a.f37550a, false, 29035, new Class[]{Boolean.class, Integer.TYPE, String.class}, Void.TYPE);
                    } else if (i == 0) {
                        aVar.a(C0906R.string.x6, str);
                        if (bool == null || !Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                            aVar.c();
                        } else {
                            TextView textView = aVar.i;
                            if (textView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("couponGet");
                            }
                            textView.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(aVar.k, C0906R.string.xl, new Object[0]));
                        }
                    } else if (i != 4) {
                        switch (i) {
                            case 2402:
                                aVar.a(C0906R.string.x5, str);
                                TextView textView2 = aVar.i;
                                if (textView2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("couponGet");
                                }
                                textView2.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(aVar.k, C0906R.string.xo, new Object[0]));
                                TextView textView3 = aVar.i;
                                if (textView3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("couponGet");
                                }
                                textView3.setTag(C0906R.id.wj, Boolean.FALSE);
                                if (!PatchProxy.isSupport(new Object[0], aVar, a.f37550a, false, 29032, new Class[0], Void.TYPE)) {
                                    TextView textView4 = aVar.f37553d;
                                    if (textView4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponName");
                                    }
                                    textView4.setTextColor(aVar.k.getResources().getColor(C0906R.color.gp));
                                    TextView textView5 = aVar.f37552c;
                                    if (textView5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("shopName");
                                    }
                                    textView5.setTextColor(aVar.k.getResources().getColor(C0906R.color.gp));
                                    TextView textView6 = aVar.f37554e;
                                    if (textView6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponCustomer");
                                    }
                                    textView6.setTextColor(aVar.k.getResources().getColor(C0906R.color.gp));
                                    TextView textView7 = aVar.g;
                                    if (textView7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponRange");
                                    }
                                    textView7.setTextColor(aVar.k.getResources().getColor(C0906R.color.gp));
                                    TextView textView8 = aVar.h;
                                    if (textView8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponDate");
                                    }
                                    textView8.setTextColor(aVar.k.getResources().getColor(C0906R.color.gp));
                                    TextView textView9 = aVar.i;
                                    if (textView9 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponGet");
                                    }
                                    textView9.setTextColor(aVar.k.getResources().getColor(C0906R.color.gp));
                                    LinearLayout linearLayout = aVar.f37551b;
                                    if (linearLayout == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponContainerLeft");
                                    }
                                    DrawableCompat.setTint(linearLayout.getBackground(), C0906R.color.a6w);
                                    TextView textView10 = aVar.i;
                                    if (textView10 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponGet");
                                    }
                                    DrawableCompat.setTint(textView10.getBackground(), C0906R.color.a6w);
                                    TextView textView11 = aVar.f37553d;
                                    if (textView11 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponName");
                                    }
                                    DrawableCompat.setTint(textView11.getBackground(), C0906R.color.a6w);
                                    View view = aVar.f37555f;
                                    if (view == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("couponSplitter");
                                    }
                                    DrawableCompat.setTint(view.getBackground(), C0906R.color.a6w);
                                    aVar.a(aVar.a((int) C0906R.color.gp), aVar.a((int) C0906R.color.gp), aVar.a((int) C0906R.color.gp));
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(new Object[0], aVar, a.f37550a, false, 29032, new Class[0], Void.TYPE);
                                    break;
                                }
                            case 2403:
                                aVar.a(C0906R.string.x7, str);
                                aVar.c();
                                break;
                        }
                    } else {
                        aVar.a(C0906R.string.x4, str);
                    }
                }
                this.f37568b.f37564c.element = false;
                return null;
            }
        }

        b(a aVar, Ref.BooleanRef booleanRef, Function2 function2) {
            this.f37563b = aVar;
            this.f37564c = booleanRef;
            this.f37565d = function2;
        }

        public final void onClick(View view) {
            i<com.ss.android.ugc.aweme.commerce.service.g.a.a> iVar;
            if (PatchProxy.isSupport(new Object[]{view}, this, f37562a, false, 29039, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37562a, false, 29039, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f37563b.j.j && !this.f37564c.element) {
                String str = this.f37563b.j.f38181a;
                if (str != null) {
                    this.f37564c.element = true;
                    com.ss.android.ugc.aweme.commerce.preview.api.a aVar = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c;
                    if (PatchProxy.isSupport(new Object[]{str}, aVar, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28859, new Class[]{String.class}, i.class)) {
                        com.ss.android.ugc.aweme.commerce.preview.api.a aVar2 = aVar;
                        iVar = (i) PatchProxy.accessDispatch(new Object[]{str}, aVar2, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28859, new Class[]{String.class}, i.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str, "couponMetaId");
                        iVar = com.ss.android.ugc.aweme.commerce.preview.api.a.f37315b.consumeCoupon(str);
                    }
                    iVar.a((g<TResult, TContinuationResult>) new C0480a<TResult,TContinuationResult>(this), i.f1052b);
                    Function2 function2 = this.f37565d;
                    if (function2 != null) {
                        function2.invoke(str, Boolean.TRUE);
                    }
                }
            }
        }
    }

    public final void a(@Nullable Function2<? super String, ? super Boolean, Unit> function2) {
        if (PatchProxy.isSupport(new Object[]{function2}, this, f37550a, false, 29033, new Class[]{Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function2}, this, f37550a, false, 29033, new Class[]{Function2.class}, Void.TYPE);
            return;
        }
        TextView textView = this.i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponGet");
        }
        textView.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.k, this.j.j ? C0906R.string.y_ : C0906R.string.xk, new Object[0]));
        TextView textView2 = this.i;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponGet");
        }
        textView2.setTextColor(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.k, this.j.j ? C0906R.color.f4489c : C0906R.color.f4491e));
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        View view = this.n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponView");
        }
        view.setOnClickListener(new b(this, booleanRef, function2));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f37550a, false, 29037, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f37550a, false, 29037, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.e.b.a(this.k, !TextUtils.isEmpty(str) ? str : com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.k, i2, new Object[0]));
    }

    @NotNull
    public final View b() {
        if (PatchProxy.isSupport(new Object[0], this, f37550a, false, 29034, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f37550a, false, 29034, new Class[0], View.class);
        }
        View view = this.n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponView");
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f37550a, false, 29036, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37550a, false, 29036, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponGet");
        }
        textView.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.k, C0906R.string.xk, new Object[0]));
        TextView textView2 = this.i;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponGet");
        }
        textView2.setTextColor(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.k, C0906R.color.f4491e));
        this.j.j = false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37550a, false, 29028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37550a, false, 29028, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.f37552c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shopName");
        }
        textView.setText(this.j.f38183c);
        TextView textView2 = this.f37553d;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponName");
        }
        textView2.setText(this.j.f38182b);
        TextView textView3 = this.g;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponRange");
        }
        textView3.setText(this.j.h);
        TextView textView4 = this.h;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponDate");
        }
        textView4.setText(this.j.i);
        if (TextUtils.isEmpty(this.j.g)) {
            TextView textView5 = this.f37554e;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("couponCustomer");
            }
            textView5.setVisibility(8);
            View view = this.f37555f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("couponSplitter");
            }
            view.setVisibility(8);
        } else {
            TextView textView6 = this.f37554e;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("couponCustomer");
            }
            textView6.setText(this.j.g);
        }
        a(a((int) C0906R.color.a1z), a((int) C0906R.color.a1z), a((int) C0906R.color.f4489c));
    }

    private final float b(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37550a, false, 29031, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return UIUtils.dip2Px(this.k, (float) i2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37550a, false, 29031, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    private final String c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37550a, false, 29038, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37550a, false, 29038, new Class[]{Integer.TYPE}, String.class);
        }
        return com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.k, i2, new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37550a, false, 29030, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.k.getResources().getColor(i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37550a, false, 29030, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    private final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f37550a, false, 29027, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f37550a, false, 29027, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View findViewById = view.findViewById(C0906R.id.wd);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "couponView.findViewById(….commerce_container_left)");
        this.f37551b = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.wo);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "couponView.findViewById(…ommerce_coupon_shop_name)");
        this.f37552c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.wl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "couponView.findViewById(R.id.commerce_coupon_name)");
        this.f37553d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.wm);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "couponView.findViewById(…erce_coupon_new_customer)");
        this.f37554e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.a0w);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "couponView.findViewById(…d.coupon_coupon_splitter)");
        this.f37555f = findViewById5;
        View findViewById6 = view.findViewById(C0906R.id.wi);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "couponView.findViewById(…ce_coupon_discount_range)");
        this.g = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C0906R.id.wg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "couponView.findViewById(R.id.commerce_coupon_date)");
        this.h = (TextView) findViewById7;
        View findViewById8 = view.findViewById(C0906R.id.wj);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "couponView.findViewById(R.id.commerce_coupon_get)");
        this.i = (TextView) findViewById8;
        View findViewById9 = view.findViewById(C0906R.id.ee);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "couponView.findViewById(R.id.alignTextView)");
        this.m = (AlignTextView) findViewById9;
    }

    private final View b(LinearLayout linearLayout) {
        if (PatchProxy.isSupport(new Object[]{linearLayout}, this, f37550a, false, 29026, new Class[]{LinearLayout.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{linearLayout}, this, f37550a, false, 29026, new Class[]{LinearLayout.class}, View.class);
        }
        View inflate = LayoutInflater.from(this.k).inflate(C0906R.layout.a2j, linearLayout, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…p_item, couponBox, false)");
        return inflate;
    }

    @NotNull
    public final a a(@NotNull LinearLayout linearLayout) {
        if (PatchProxy.isSupport(new Object[]{linearLayout}, this, f37550a, false, 29025, new Class[]{LinearLayout.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{linearLayout}, this, f37550a, false, 29025, new Class[]{LinearLayout.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(linearLayout, "couponBox");
        this.n = b(linearLayout);
        View view = this.n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponView");
        }
        a(view);
        return this;
    }

    public a(@NotNull aj ajVar, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(ajVar, "couponModel");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.j = ajVar;
        this.k = context;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f37550a, false, 29029, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f37550a, false, 29029, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i5 = this.j.k % 10;
        if (i5 == 1) {
            AlignTextView alignTextView = this.m;
            if (alignTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("alignTextView");
            }
            AlignTextView.a[] aVarArr = new AlignTextView.a[3];
            String str = this.j.f38185e;
            if (str == null) {
                str = "";
            }
            AlignTextView.a aVar = new AlignTextView.a(str, b(28), i2, 0.0f, true, 0.0f, 32);
            aVarArr[0] = aVar;
            AlignTextView.a aVar2 = new AlignTextView.a(c(C0906R.string.sp), b(14), i3, b(4), true, b(1));
            aVarArr[1] = aVar2;
            String str2 = this.j.f38186f;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            AlignTextView.a aVar3 = new AlignTextView.a(str2, b(11), i4, b(4), false, 0.0f, 32);
            aVarArr[2] = aVar3;
            alignTextView.setTextList(CollectionsKt.listOf(aVarArr));
            return;
        }
        if (i5 == 3 || i5 == 2) {
            String str3 = this.j.f38184d;
            if (str3 != null) {
                CharSequence charSequence = str3;
                if (StringsKt.contains$default(charSequence, (CharSequence) ClassUtils.PACKAGE_SEPARATOR, false, 2, (Object) null)) {
                    List split$default = StringsKt.split$default(charSequence, new String[]{ClassUtils.PACKAGE_SEPARATOR}, false, 0, 6, (Object) null);
                    AlignTextView alignTextView2 = this.m;
                    if (alignTextView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("alignTextView");
                    }
                    AlignTextView.a[] aVarArr2 = new AlignTextView.a[4];
                    AlignTextView.a aVar4 = new AlignTextView.a(c(C0906R.string.sq), b(15), i2, 0.0f, true, 0.0f, 32);
                    aVarArr2[0] = aVar4;
                    AlignTextView.a aVar5 = new AlignTextView.a((String) split$default.get(0), b(28), i3, b(4), true, 0.0f, 32);
                    aVarArr2[1] = aVar5;
                    AlignTextView.a aVar6 = new AlignTextView.a(ClassUtils.PACKAGE_SEPARATOR + ((String) split$default.get(1)), b(15), i3, 0.0f, true, 0.0f, 32);
                    aVarArr2[2] = aVar6;
                    String str4 = this.j.f38186f;
                    if (str4 == null) {
                        Intrinsics.throwNpe();
                    }
                    AlignTextView.a aVar7 = new AlignTextView.a(str4, b(11), i4, b(5), false, 0.0f, 32);
                    aVarArr2[3] = aVar7;
                    alignTextView2.setTextList(CollectionsKt.listOf(aVarArr2));
                } else {
                    AlignTextView alignTextView3 = this.m;
                    if (alignTextView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("alignTextView");
                    }
                    AlignTextView.a[] aVarArr3 = new AlignTextView.a[3];
                    AlignTextView.a aVar8 = new AlignTextView.a(c(C0906R.string.sq), b(15), i2, 0.0f, true, 0.0f, 32);
                    aVarArr3[0] = aVar8;
                    AlignTextView.a aVar9 = new AlignTextView.a(str3, b(28), i3, b(4), true, 0.0f, 32);
                    aVarArr3[1] = aVar9;
                    String str5 = this.j.f38186f;
                    if (str5 == null) {
                        Intrinsics.throwNpe();
                    }
                    AlignTextView.a aVar10 = new AlignTextView.a(str5, b(11), i4, b(5), false, 0.0f, 32);
                    aVarArr3[2] = aVar10;
                    alignTextView3.setTextList(CollectionsKt.listOf(aVarArr3));
                }
            }
        }
    }
}
