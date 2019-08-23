package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J \u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001bH\u0016J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/SquareSlidesLayout;", "Landroid/widget/RelativeLayout;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "handleContentTranslationY", "", "mAdapter", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/SquareSlidesLayout$PreviewAdapter;", "mIndicator", "Landroid/widget/TextView;", "mSellOutView", "Landroid/view/View;", "mSquarePager", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/SquareViewPager;", "mSquarePagerBox", "fillData", "", "slides", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "init", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "setContentTranslationY", "y", "showSellOut", "PreviewAdapter", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class SquareSlidesLayout extends RelativeLayout implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38300a;

    /* renamed from: b  reason: collision with root package name */
    public PreviewAdapter f38301b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f38302c;

    /* renamed from: d  reason: collision with root package name */
    public RelativeLayout f38303d;

    /* renamed from: e  reason: collision with root package name */
    public SquareViewPager f38304e;

    /* renamed from: f  reason: collision with root package name */
    public View f38305f;
    public boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\tJ\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/SquareSlidesLayout$PreviewAdapter;", "Landroid/support/v4/view/PagerAdapter;", "context", "Landroid/content/Context;", "slides", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "(Landroid/content/Context;Ljava/util/List;)V", "mDisplaySize", "", "mSlides", "", "mViews", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getCount", "getDisplaySize", "getRealPosition", "getRealSize", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class PreviewAdapter extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38306a;

        /* renamed from: b  reason: collision with root package name */
        public int f38307b = 1;

        /* renamed from: c  reason: collision with root package name */
        private List<UrlModel> f38308c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List<RemoteImageView> f38309d = new ArrayList();

        public final int getCount() {
            return Integer.MAX_VALUE;
        }

        /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean isViewFromObject(@org.jetbrains.annotations.NotNull android.view.View r20, @org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f38306a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.view.View> r4 = android.view.View.class
                r8[r10] = r4
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Boolean.TYPE
                r6 = 0
                r7 = 30111(0x759f, float:4.2194E-41)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x004c
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = f38306a
                r15 = 0
                r16 = 30111(0x759f, float:4.2194E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r0[r10] = r1
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Boolean.TYPE
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x004c:
                java.lang.String r2 = "view"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                java.lang.String r2 = "object"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                if (r0 != r1) goto L_0x0059
                return r11
            L_0x0059:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout.PreviewAdapter.isViewFromObject(android.view.View, java.lang.Object):boolean");
        }

        public final int a() {
            if (!PatchProxy.isSupport(new Object[0], this, f38306a, false, 30108, new Class[0], Integer.TYPE)) {
                return this.f38308c.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38306a, false, 30108, new Class[0], Integer.TYPE)).intValue();
        }

        private int a(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38306a, false, 30107, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return i % a();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38306a, false, 30107, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }

        @NotNull
        public final Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f38306a, false, 30109, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f38306a, false, 30109, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            int a2 = a(i);
            viewGroup.addView(this.f38309d.get(a2));
            c.b(this.f38309d.get(a2), this.f38308c.get(a2));
            return this.f38309d.get(a2);
        }

        public PreviewAdapter(@NotNull Context context, @NotNull List<? extends UrlModel> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(list, "slides");
            this.f38308c.clear();
            this.f38307b = list.size();
            if (list.size() == 1) {
                Iterator it2 = new IntRange(0, 4).iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    this.f38308c.addAll(list);
                }
            } else if (list.size() == 2) {
                Iterator it3 = new IntRange(0, 2).iterator();
                while (it3.hasNext()) {
                    ((IntIterator) it3).nextInt();
                    this.f38308c.addAll(list);
                }
            } else if (list.size() == 3) {
                Iterator it4 = new IntRange(0, 2).iterator();
                while (it4.hasNext()) {
                    ((IntIterator) it4).nextInt();
                    this.f38308c.addAll(list);
                }
            } else {
                this.f38308c.addAll(list);
            }
            int size = this.f38308c.size();
            for (int i = 0; i < size; i++) {
                List<RemoteImageView> list2 = this.f38309d;
                RemoteImageView remoteImageView = new RemoteImageView(context);
                ((GenericDraweeHierarchy) remoteImageView.getHierarchy()).setPlaceholderImage(2130838432);
                remoteImageView.setBackgroundColor(remoteImageView.getResources().getColor(C0906R.color.a1d));
                list2.add(remoteImageView);
            }
        }

        public final void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
            ViewGroup viewGroup2 = viewGroup;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f38306a, false, 30110, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f38306a, false, 30110, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(viewGroup, "container");
            Intrinsics.checkParameterIsNotNull(obj2, "object");
            viewGroup.removeView(this.f38309d.get(a(i)));
        }
    }

    @JvmOverloads
    public SquareSlidesLayout(@NotNull Context context) {
        this(context, null, 2, null);
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f2, int i2) {
    }

    public final void onPageSelected(int i) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38300a, false, 30104, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38300a, false, 30104, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TextView textView = this.f38302c;
        if (textView != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
            Object[] objArr = new Object[2];
            PreviewAdapter previewAdapter = this.f38301b;
            if (previewAdapter == null) {
                Intrinsics.throwNpe();
            }
            objArr[0] = Integer.valueOf((i % previewAdapter.f38307b) + 1);
            PreviewAdapter previewAdapter2 = this.f38301b;
            if (previewAdapter2 != null) {
                num = Integer.valueOf(previewAdapter2.f38307b);
            } else {
                num = null;
            }
            objArr[1] = num;
            String format = String.format(locale, "%d/%d", Arrays.copyOf(objArr, 2));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            textView.setText(format);
        }
    }

    public final void setContentTranslationY(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f38300a, false, 30103, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f38300a, false, 30103, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.g) {
            if (this.f38304e != null) {
                SquareViewPager squareViewPager = this.f38304e;
                if (squareViewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSquarePager");
                }
                squareViewPager.setTranslationY(f2);
            }
            if (this.f38302c != null) {
                TextView textView = this.f38302c;
                if (textView != null) {
                    double d2 = (double) f2;
                    Double.isNaN(d2);
                    textView.setTranslationY((float) (d2 * 0.6d));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareSlidesLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f38300a, false, 30100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38300a, false, 30100, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a2m, this);
        this.f38303d = (RelativeLayout) inflate.findViewById(C0906R.id.cts);
        this.f38302c = (TextView) inflate.findViewById(C0906R.id.bw2);
        View findViewById = inflate.findViewById(C0906R.id.cnm);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.sell_out_view)");
        this.f38305f = findViewById;
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38300a, false, 30099, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38300a, false, 30099, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = i;
        super.onMeasure(i3, i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SquareSlidesLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
