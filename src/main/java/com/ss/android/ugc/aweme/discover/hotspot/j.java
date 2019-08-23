package com.ss.android.ugc.aweme.discover.hotspot;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotItemUtil;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f42446a = {2130839160, 2130839258, 2130838986};

    /* renamed from: b  reason: collision with root package name */
    public static final a f42447b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotItemUtil$Companion;", "", "()V", "HOT_SEARCH_LABELi_ICON_SPOT", "", "getHOT_SEARCH_LABELi_ICON_SPOT", "()[I", "getDrawable", "Landroid/graphics/drawable/Drawable;", "label", "", "context", "Landroid/content/Context;", "showItemOrderB", "", "textView", "Landroid/widget/TextView;", "position", "bgImageView", "Landroid/widget/ImageView;", "showLabelView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42448a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NotNull Context context, @NotNull TextView textView, int i, @Nullable ImageView imageView) {
            int i2;
            CharSequence charSequence;
            float f2;
            ViewGroup.LayoutParams layoutParams;
            float f3;
            Context context2 = context;
            TextView textView2 = textView;
            int i3 = i;
            ImageView imageView2 = imageView;
            if (PatchProxy.isSupport(new Object[]{context2, textView2, Integer.valueOf(i), imageView2}, this, f42448a, false, 36562, new Class[]{Context.class, TextView.class, Integer.TYPE, ImageView.class}, Void.TYPE)) {
                Object[] objArr = {context2, textView2, Integer.valueOf(i), imageView2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f42448a, false, 36562, new Class[]{Context.class, TextView.class, Integer.TYPE, ImageView.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(textView2, "textView");
            if (i3 <= 2) {
                i2 = 2130838225;
            } else {
                i2 = 2130838226;
            }
            if (imageView2 != null) {
                imageView2.setBackgroundResource(i2);
            }
            if (PatchProxy.isSupport(new Object[]{textView2, "DINCond-Black.otf"}, null, com.ss.android.ugc.aweme.discover.hotspot.list.a.f42483a, true, 36591, new Class[]{TextView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView2, "DINCond-Black.otf"}, null, com.ss.android.ugc.aweme.discover.hotspot.list.a.f42483a, true, 36591, new Class[]{TextView.class, String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(textView2, "textView");
                Intrinsics.checkParameterIsNotNull("DINCond-Black.otf", "path");
                if (com.ss.android.ugc.aweme.discover.hotspot.list.a.f42484b.containsKey("DINCond-Black.otf")) {
                    textView2.setTypeface(com.ss.android.ugc.aweme.discover.hotspot.list.a.f42484b.get("DINCond-Black.otf"));
                } else {
                    try {
                        textView2.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "DINCond-Black.otf"));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (i3 <= 2) {
                charSequence = context.getResources().getString(C0906R.string.amp, new Object[]{Integer.valueOf(i3 + 1)});
            } else {
                charSequence = String.valueOf(i3 + 1);
            }
            textView2.setText(charSequence);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                Context context3 = textView.getContext();
                if (i3 <= 2) {
                    f2 = 4.5f;
                } else if (i3 <= 8) {
                    f2 = 5.8f;
                } else {
                    f2 = 2.8f;
                }
                marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(context3, f2);
                textView2.setLayoutParams(marginLayoutParams);
                if (imageView2 != null) {
                    layoutParams = imageView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    Context context4 = textView.getContext();
                    if (i3 <= 2) {
                        f3 = 35.0f;
                    } else {
                        f3 = 21.0f;
                    }
                    layoutParams.width = (int) UIUtils.dip2Px(context4, f3);
                }
                if (imageView2 != null) {
                    imageView2.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
