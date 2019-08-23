package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/PhantomImagesView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addRealViews", "", "models", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "borderDip", "", "fillUrls", "urlModels", "initWithContext", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class PhantomImagesView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38276a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PhantomImagesView f38278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f38279c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f38280d;

        a(PhantomImagesView phantomImagesView, List list, float f2) {
            this.f38278b = phantomImagesView;
            this.f38279c = list;
            this.f38280d = f2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f38277a, false, 30070, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38277a, false, 30070, new Class[0], Void.TYPE);
                return;
            }
            PhantomImagesView phantomImagesView = this.f38278b;
            List subList = this.f38279c.subList(0, Math.min(3, this.f38279c.size()));
            float f2 = this.f38280d;
            if (PatchProxy.isSupport(new Object[]{subList, Float.valueOf(f2)}, phantomImagesView, PhantomImagesView.f38276a, false, 30067, new Class[]{List.class, Float.TYPE}, Void.TYPE)) {
                Object[] objArr = {subList, Float.valueOf(f2)};
                Object[] objArr2 = objArr;
                PhantomImagesView phantomImagesView2 = phantomImagesView;
                PatchProxy.accessDispatch(objArr2, phantomImagesView2, PhantomImagesView.f38276a, false, 30067, new Class[]{List.class, Float.TYPE}, Void.TYPE);
                return;
            }
            Iterator it2 = new IntRange(0, 3).iterator();
            while (it2.hasNext()) {
                View childAt = phantomImagesView.getChildAt(((IntIterator) it2).nextInt());
                if (childAt != null) {
                    GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) ((AvatarWithBorderView) childAt).getHierarchy();
                    Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "avatarView.hierarchy");
                    RoundingParams roundingParams = genericDraweeHierarchy.getRoundingParams();
                    if (roundingParams != null) {
                        roundingParams.setBorderWidth(UIUtils.dip2Px(phantomImagesView.getContext(), f2));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView");
                }
            }
            int i = 0;
            for (Object next : subList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                UrlModel urlModel = (UrlModel) next;
                View childAt2 = phantomImagesView.getChildAt(i);
                if (childAt2 != null) {
                    AvatarWithBorderView avatarWithBorderView = (AvatarWithBorderView) childAt2;
                    ViewGroup.LayoutParams layoutParams = avatarWithBorderView.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.width = phantomImagesView.getHeight();
                        marginLayoutParams.height = phantomImagesView.getHeight();
                        marginLayoutParams.leftMargin = ((i * phantomImagesView.getHeight()) * 3) / 4;
                        c.b(avatarWithBorderView, urlModel);
                        avatarWithBorderView.setVisibility(0);
                        i = i2;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView");
                }
            }
            int size = subList.size();
            while (size <= 3) {
                View childAt3 = phantomImagesView.getChildAt(size);
                if (childAt3 != null) {
                    ((AvatarWithBorderView) childAt3).setVisibility(8);
                    size++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView");
                }
            }
        }
    }

    @JvmOverloads
    public PhantomImagesView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PhantomImagesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f38276a, false, 30065, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f38276a, false, 30065, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        for (int i = 0; i <= 3; i++) {
            addView(new AvatarWithBorderView(context2));
        }
    }

    public final void a(@Nullable List<? extends UrlModel> list, float f2) {
        if (PatchProxy.isSupport(new Object[]{list, Float.valueOf(1.5f)}, this, f38276a, false, 30066, new Class[]{List.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Float.valueOf(1.5f)}, this, f38276a, false, 30066, new Class[]{List.class, Float.TYPE}, Void.TYPE);
        } else if (list == null || list.isEmpty()) {
            setVisibility(8);
        } else {
            setVisibility(0);
            post(new a(this, list, 1.5f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PhantomImagesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhantomImagesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
