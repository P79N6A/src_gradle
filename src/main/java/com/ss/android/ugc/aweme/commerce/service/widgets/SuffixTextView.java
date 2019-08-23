package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.ies.commerce.service.R$styleable;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/SuffixTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContent", "", "mContentView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMContentView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mContentView$delegate", "Lkotlin/Lazy;", "mSuffix", "mSuffixView", "getMSuffixView", "mSuffixView$delegate", "mTextColor", "", "mTextSize", "", "setText", "", "tValue", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class SuffixTextView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38311a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f38312b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SuffixTextView.class), "mContentView", "getMContentView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SuffixTextView.class), "mSuffixView", "getMSuffixView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: c  reason: collision with root package name */
    private String f38313c;

    /* renamed from: d  reason: collision with root package name */
    private String f38314d;

    /* renamed from: e  reason: collision with root package name */
    private float f38315e = 24.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f38316f = -16777216;
    private final Lazy g = LazyKt.lazy(new a(this));
    private final Lazy h = LazyKt.lazy(new b(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SuffixTextView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SuffixTextView suffixTextView) {
            super(0);
            this.this$0 = suffixTextView;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30122, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.dqz);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30122, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SuffixTextView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SuffixTextView suffixTextView) {
            super(0);
            this.this$0 = suffixTextView;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30123, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.findViewById(C0906R.id.aex);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30123, new Class[0], DmtTextView.class);
        }
    }

    private final DmtTextView getMContentView() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f38311a, false, 30117, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f38311a, false, 30117, new Class[0], DmtTextView.class);
        } else {
            value = this.g.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView getMSuffixView() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f38311a, false, 30118, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f38311a, false, 30118, new Class[0], DmtTextView.class);
        } else {
            value = this.h.getValue();
        }
        return (DmtTextView) value;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuffixTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setText(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38311a, false, 30119, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38311a, false, 30119, new Class[]{String.class}, Void.TYPE);
            return;
        }
        getMContentView().setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuffixTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SuffixTextView);
        this.f38313c = obtainStyledAttributes.getString(0);
        this.f38314d = obtainStyledAttributes.getString(1);
        this.f38315e = obtainStyledAttributes.getDimension(3, 12.0f);
        this.f38316f = obtainStyledAttributes.getColor(2, -7829368);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(C0906R.layout.ary, this);
        getMContentView().setTextSize(0, this.f38315e);
        getMContentView().setTextColor(this.f38316f);
        getMContentView().setText(this.f38313c);
        getMSuffixView().setText(this.f38314d);
        getMSuffixView().setTextSize(0, this.f38315e);
        getMSuffixView().setTextColor(this.f38316f);
    }
}
