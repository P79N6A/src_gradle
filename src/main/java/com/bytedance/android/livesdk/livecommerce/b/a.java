package com.bytedance.android.livesdk.livecommerce.b;

import android.content.Context;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.livecommerce.view.ECPromotionImageView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15959a;

    public static void a(HSImageView hSImageView, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{hSImageView, str, Integer.valueOf(i)}, null, f15959a, true, 10687, new Class[]{HSImageView.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView, str, Integer.valueOf(i)}, null, f15959a, true, 10687, new Class[]{HSImageView.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        k.a(hSImageView, str);
        Context context = hSImageView.getContext();
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) hSImageView.getHierarchy();
        if (!(context == null || genericDraweeHierarchy == null)) {
            genericDraweeHierarchy.setPlaceholderImage(2130838633);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.setCornersRadius((float) com.bytedance.android.livesdk.livecommerce.f.a.a(context, (float) i));
            genericDraweeHierarchy.setRoundingParams(roundingParams);
        }
    }

    public static void a(ECPromotionImageView eCPromotionImageView, String str, int i) {
        ECPromotionImageView eCPromotionImageView2 = eCPromotionImageView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{eCPromotionImageView2, str2, Integer.valueOf(i)}, null, f15959a, true, 10690, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eCPromotionImageView2, str2, Integer.valueOf(i)}, null, f15959a, true, 10690, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(eCPromotionImageView2, str2, i, false);
    }

    public static void a(ECPromotionImageView eCPromotionImageView, String str, int i, boolean z) {
        ECPromotionImageView eCPromotionImageView2 = eCPromotionImageView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{eCPromotionImageView2, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f15959a, true, 10691, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eCPromotionImageView2, str2, Integer.valueOf(i), Byte.valueOf(z)}, null, f15959a, true, 10691, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(eCPromotionImageView2, str2, i, true, z);
    }

    public static void a(ECPromotionImageView eCPromotionImageView, String str, int i, boolean z, boolean z2) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{eCPromotionImageView, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f15959a, true, 10693, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {eCPromotionImageView, str, Integer.valueOf(i), Byte.valueOf(z), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f15959a, true, 10693, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (i2 == 1) {
            if (z2) {
                eCPromotionImageView.e(str);
            } else {
                eCPromotionImageView.a(str);
            }
        } else if (!z) {
            eCPromotionImageView.b(str);
        } else if (i2 == 3) {
            eCPromotionImageView.c(str);
        } else if (i2 == 4) {
            eCPromotionImageView.d(str);
        } else {
            eCPromotionImageView.b(str);
        }
    }
}
