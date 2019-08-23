package com.ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.ui.common.rebranding.a;
import com.bytedance.ies.dmt.ui.common.rebranding.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002J$\u0010\u0016\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\tH\u0014J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016R\u001b\u0010\u000b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/notification/view/FansFollowUserBtn;", "Lcom/ss/android/ugc/aweme/following/ui/view/FollowUserBtn;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalWidthForFour", "getHorizontalWidthForFour", "()I", "horizontalWidthForFour$delegate", "Lkotlin/Lazy;", "horizontalWidthForTwo", "getHorizontalWidthForTwo", "horizontalWidthForTwo$delegate", "getHorizontalPadding", "drawableWidth", "textLength", "init", "", "measureNiceWidth", "textView", "Landroid/widget/TextView;", "setFollowButtonStyle", "resId", "setFollowStatus", "followStatus", "followerStatus", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FansFollowUserBtn extends FollowUserBtn {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58127a;

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f58128e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansFollowUserBtn.class), "horizontalWidthForTwo", "getHorizontalWidthForTwo()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansFollowUserBtn.class), "horizontalWidthForFour", "getHorizontalWidthForFour()I"))};

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f58129f = LazyKt.lazy(new b(this));
    private final Lazy g = LazyKt.lazy(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansFollowUserBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FansFollowUserBtn fansFollowUserBtn) {
            super(0);
            this.this$0 = fansFollowUserBtn;
        }

        public final int invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63283, new Class[0], Integer.TYPE)) {
                return this.this$0.b(12, 4);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63283, new Class[0], Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansFollowUserBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FansFollowUserBtn fansFollowUserBtn) {
            super(0);
            this.this$0 = fansFollowUserBtn;
        }

        public final int invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63284, new Class[0], Integer.TYPE)) {
                return this.this$0.b(12, 2);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63284, new Class[0], Integer.TYPE)).intValue();
        }
    }

    private final int getHorizontalWidthForFour() {
        if (!PatchProxy.isSupport(new Object[0], this, f58127a, false, 63275, new Class[0], Integer.TYPE)) {
            return ((Number) this.g.getValue()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58127a, false, 63275, new Class[0], Integer.TYPE)).intValue();
    }

    private final int getHorizontalWidthForTwo() {
        if (!PatchProxy.isSupport(new Object[0], this, f58127a, false, 63274, new Class[0], Integer.TYPE)) {
            return ((Number) this.f58129f.getValue()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58127a, false, 63274, new Class[0], Integer.TYPE)).intValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansFollowUserBtn(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final int a(@NotNull TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2}, this, f58127a, false, 63280, new Class[]{TextView.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{textView2}, this, f58127a, false, 63280, new Class[]{TextView.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(textView2, "textView");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C0906R.string.agr));
        arrayList.add(Integer.valueOf(C0906R.string.a6u));
        arrayList.add(Integer.valueOf(C0906R.string.agl));
        arrayList.add(Integer.valueOf(C0906R.string.a6w));
        return c.a(textView2, arrayList, (int) UIUtils.dip2Px(getContext(), 68.0f), (int) UIUtils.dip2Px(getContext(), 68.0f));
    }

    public final void setFollowButtonStyle(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58127a, false, 63278, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58127a, false, 63278, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == -1) {
            this.f48163c.setPadding(0, 0, 0, 0);
            NiceWidthTextView niceWidthTextView = this.f48163c;
            Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView, "mMainBtn");
            niceWidthTextView.setGravity(17);
            this.f48163c.setCompoundDrawables(null, null, null, null);
        } else {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), i);
            Intrinsics.checkExpressionValueIsNotNull(a2, "mButtonStyle");
            a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
            this.f48163c.setCompoundDrawables(a2, null, null, null);
            NiceWidthTextView niceWidthTextView2 = this.f48163c;
            Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView2, "mMainBtn");
            niceWidthTextView2.setGravity(16);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansFollowUserBtn(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final int b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{12, Integer.valueOf(i2)}, this, f58127a, false, 63279, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{12, Integer.valueOf(i2)}, this, f58127a, false, 63279, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        float dip2Px = UIUtils.dip2Px(getContext(), 68.0f);
        NiceWidthTextView niceWidthTextView = this.f48163c;
        Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView, "mMainBtn");
        return (int) Math.max(0.0f, ((dip2Px - niceWidthTextView.getPaint().measureText(StringsKt.repeat("一", i2))) - UIUtils.dip2Px(getContext(), 14.0f)) / 2.0f);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f58127a, false, 63277, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f58127a, false, 63277, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setVisibility(0);
        int i3 = C0906R.string.a6v;
        switch (i) {
            case 0:
                int i4 = C0906R.string.afp;
                AbTestManager a2 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                Integer k = a2.k();
                if (k != null && k.intValue() == 0) {
                    setFollowButtonStyle(-1);
                } else if (k != null && k.intValue() == 1) {
                    this.f48163c.setPadding(getHorizontalWidthForTwo(), 0, getHorizontalWidthForTwo(), 0);
                    if (i2 == 1 || this.f48164d == 2) {
                        i4 = C0906R.string.afq;
                        setFollowButtonStyle(2130839877);
                    } else {
                        setFollowButtonStyle(2130839876);
                    }
                } else if (k != null && k.intValue() == 2) {
                    if (i2 == 1 || this.f48164d == 2) {
                        i4 = C0906R.string.aft;
                        this.f48163c.setPadding(getHorizontalWidthForFour(), 0, getHorizontalWidthForFour(), 0);
                        setFollowButtonStyle(2130839877);
                    } else {
                        this.f48163c.setPadding(getHorizontalWidthForTwo(), 0, getHorizontalWidthForTwo(), 0);
                        setFollowButtonStyle(2130839876);
                    }
                }
                NiceWidthTextView niceWidthTextView = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView, "mMainBtn");
                niceWidthTextView.setText(getResources().getText(i4));
                this.f48163c.setTextColor(getResources().getColor(C0906R.color.hx));
                NiceWidthTextView niceWidthTextView2 = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView2, "mMainBtn");
                niceWidthTextView2.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837968));
                break;
            case 1:
                setFollowButtonStyle(-1);
                AbTestManager a3 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                Integer k2 = a3.k();
                if ((k2 != null && k2.intValue() == 0) || ((k2 != null && k2.intValue() == 1) || k2 == null || k2.intValue() != 2 || i2 != 1)) {
                    i3 = C0906R.string.agr;
                }
                NiceWidthTextView niceWidthTextView3 = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView3, "mMainBtn");
                niceWidthTextView3.setText(getResources().getText(i3));
                this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                NiceWidthTextView niceWidthTextView4 = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView4, "mMainBtn");
                niceWidthTextView4.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837983));
                break;
            case 2:
                setFollowButtonStyle(-1);
                AbTestManager a4 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "AbTestManager.getInstance()");
                Integer k3 = a4.k();
                if ((k3 != null && k3.intValue() == 0) || ((k3 != null && k3.intValue() == 1) || k3 == null || k3.intValue() != 2)) {
                    i3 = C0906R.string.a6u;
                }
                NiceWidthTextView niceWidthTextView5 = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView5, "mMainBtn");
                niceWidthTextView5.setText(getResources().getText(i3));
                this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                NiceWidthTextView niceWidthTextView6 = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView6, "mMainBtn");
                niceWidthTextView6.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837983));
                break;
            case 3:
                setVisibility(8);
                break;
            case 4:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView7 = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView7, "mMainBtn");
                niceWidthTextView7.setText(getResources().getText(C0906R.string.agl));
                this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                NiceWidthTextView niceWidthTextView8 = this.f48163c;
                Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView8, "mMainBtn");
                niceWidthTextView8.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130837983));
                break;
        }
        this.f48164d = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansFollowUserBtn(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void a(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet, Integer.valueOf(i)}, this, f58127a, false, 63276, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet, Integer.valueOf(i)}, this, f58127a, false, 63276, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f48163c = (NiceWidthTextView) LayoutInflater.from(context).inflate(C0906R.layout.aqy, this, true).findViewById(C0906R.id.o3);
        this.f48163c.a(this);
        Class<?> cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f48163c;
        Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView, "mMainBtn");
        com.bytedance.ies.dmt.ui.common.rebranding.a.a(cls, new a.C0186a(a(niceWidthTextView)));
        this.f48164d = 0;
        NiceWidthTextView niceWidthTextView2 = this.f48163c;
        Intrinsics.checkExpressionValueIsNotNull(niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setCompoundDrawablePadding((int) UIUtils.dip2Px(context, 2.0f));
    }
}
