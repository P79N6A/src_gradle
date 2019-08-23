package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
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
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tJ\b\u0010!\u001a\u00020\u001eH\u0002R\u001a\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/HeadTextView;", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cur", "getCur", "()I", "setCur", "(I)V", "numTextSize", "getNumTextSize", "setNumTextSize", "prefixText", "", "kotlin.jvm.PlatformType", "getPrefixText", "()Ljava/lang/String;", "prefixText$delegate", "Lkotlin/Lazy;", "sum", "getSum", "setSum", "initIndex", "", "index", "setIndex", "updateText", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HeadTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37401a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37402b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeadTextView.class), "prefixText", "getPrefixText()Ljava/lang/String;"))};

    /* renamed from: c  reason: collision with root package name */
    int f37403c;

    /* renamed from: d  reason: collision with root package name */
    int f37404d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f37405e;

    /* renamed from: f  reason: collision with root package name */
    private int f37406f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.$context = context;
        }

        public final String invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28946, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28946, new Class[0], String.class);
            }
            Context context = this.$context;
            if (context == null) {
                Intrinsics.throwNpe();
            }
            return context.getResources().getString(C0906R.string.y7);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HeadTextView f37410b;

        b(HeadTextView headTextView) {
            this.f37410b = headTextView;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37409a, false, 28947, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37409a, false, 28947, new Class[0], Void.TYPE);
                return;
            }
            String str = this.f37410b.getPrefixText() + '(' + this.f37410b.getCur() + '/' + this.f37410b.getSum() + ')';
            SpannableString spannableString = new SpannableString(str);
            d.a(spannableString, new AbsoluteSizeSpan(this.f37410b.getNumTextSize()), this.f37410b.getPrefixText().length(), str.length(), 33);
            this.f37410b.setText(spannableString);
        }
    }

    public final String getPrefixText() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37401a, false, 28939, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37401a, false, 28939, new Class[0], String.class);
        } else {
            value = this.f37405e.getValue();
        }
        return (String) value;
    }

    public final int getCur() {
        return this.f37404d;
    }

    public final int getNumTextSize() {
        return this.f37406f;
    }

    public final int getSum() {
        return this.f37403c;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37401a, false, 28942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37401a, false, 28942, new Class[0], Void.TYPE);
            return;
        }
        post(new b(this));
    }

    public final void setCur(int i) {
        this.f37404d = i;
    }

    public final void setNumTextSize(int i) {
        this.f37406f = i;
    }

    public final void setSum(int i) {
        this.f37403c = i;
    }

    public HeadTextView(@Nullable Context context) {
        this(context, null, 0);
    }

    public final void setIndex(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37401a, false, 28941, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37401a, false, 28941, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i2 = this.f37403c;
        if (i > 0 && i2 >= i) {
            this.f37404d = i;
            a();
        }
    }

    private HeadTextView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, null, 0);
        this.f37405e = LazyKt.lazy(new a(context));
        this.f37406f = 11;
        post(new Runnable(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37407a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ HeadTextView f37408b;

            {
                this.f37408b = r1;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f37407a, false, 28945, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37407a, false, 28945, new Class[0], Void.TYPE);
                    return;
                }
                this.f37408b.setText(this.f37408b.getPrefixText());
            }
        });
    }
}
