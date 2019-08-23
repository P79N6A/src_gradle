package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.drawee.controller.ControllerListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Deprecated
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8317a;

    public interface a {
        void a(ImageModel imageModel);

        void a(ImageModel imageModel, int i, int i2, boolean z);

        void a(ImageModel imageModel, Exception exc);
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public static void a(ImageView imageView, ImageModel imageModel, a aVar) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, aVar}, null, f8317a, true, 1154, new Class[]{ImageView.class, ImageModel.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel, aVar}, null, f8317a, true, 1154, new Class[]{ImageView.class, ImageModel.class, a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, 0, aVar}, null, f8317a, true, 1155, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel, 0, aVar}, null, f8317a, true, 1155, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        b(imageView, imageModel, -1, -1, 0, aVar);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i, int i2, a aVar) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2), null}, null, f8317a, true, 1157, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
            Object[] objArr = {imageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2), null};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f8317a, true, 1157, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE);
        } else if (imageModel != null && !CollectionUtils.isEmpty(imageModel.getUrls()) && a(imageView.getContext())) {
            b(imageView, imageModel, i, i2, -1, null);
        }
    }

    public static boolean a(Context context) {
        Context context2 = context;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f8317a, true, 1167, new Class[]{Context.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f8317a, true, 1167, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (context2 == null) {
                return false;
            } else {
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    return (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) && !activity.isFinishing();
                } else if ((context2 instanceof Application) || !(context2 instanceof ContextWrapper)) {
                    return true;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        return true;
    }

    private static String a(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, null, f8317a, true, 1168, new Class[]{ImageModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{imageModel}, null, f8317a, true, 1168, new Class[]{ImageModel.class}, String.class);
        } else if (imageModel == null || Lists.isEmpty(imageModel.getUrls())) {
            return "";
        } else {
            return imageModel.getUrls().get(0);
        }
    }

    public static void b(ImageView imageView, ImageModel imageModel) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2}, null, f8317a, true, 1153, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, imageModel2}, null, f8317a, true, 1153, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE);
        } else if (imageModel2 != null && !CollectionUtils.isEmpty(imageModel.getUrls())) {
            a(imageView2, imageModel2, 0);
        }
    }

    public static void a(ImageView imageView, ImageModel imageModel) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2}, null, f8317a, true, 1147, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, imageModel2}, null, f8317a, true, 1147, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE);
        } else if (a(imageView.getContext())) {
            com.bytedance.android.live.core.utils.fresco.a.a(imageView.getContext()).a(imageModel2).a().a(ImageView.ScaleType.CENTER_CROP).a((ControllerListener) new k.a(null, null)).a(imageView2);
        }
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, Integer.valueOf(i)}, null, f8317a, true, 1158, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel, Integer.valueOf(i)}, null, f8317a, true, 1158, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(imageView, imageModel, -1, -1, i, null);
    }

    public static void a(ImageView imageView, int i, int i2, int i3) {
        com.bytedance.android.live.core.utils.fresco.a aVar;
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2, Integer.valueOf(i), -1, -1}, null, f8317a, true, 1152, new Class[]{ImageView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, Integer.valueOf(i), -1, -1}, null, f8317a, true, 1152, new Class[]{ImageView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (a(imageView.getContext())) {
            com.bytedance.android.live.core.utils.fresco.a a2 = com.bytedance.android.live.core.utils.fresco.a.a(imageView.getContext());
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, com.bytedance.android.live.core.utils.fresco.a.f8257a, false, 1325, new Class[]{Integer.TYPE}, com.bytedance.android.live.core.utils.fresco.a.class)) {
                com.bytedance.android.live.core.utils.fresco.a aVar2 = a2;
                aVar = (com.bytedance.android.live.core.utils.fresco.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aVar2, com.bytedance.android.live.core.utils.fresco.a.f8257a, false, 1325, new Class[]{Integer.TYPE}, com.bytedance.android.live.core.utils.fresco.a.class);
            } else {
                aVar = a2.a(new Uri.Builder().scheme("res").path(String.valueOf(i)).build());
            }
            aVar.a().a(ImageView.ScaleType.CENTER_CROP).a((ControllerListener) new k.a(null, null)).a(imageView2);
        }
    }

    public static void b(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, a aVar) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar2}, null, f8317a, true, 1159, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
            Object[] objArr = {imageView2, imageModel2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f8317a, true, 1159, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE);
        } else if (imageModel2 == null) {
            if (aVar2 != null) {
                aVar2.a(imageModel2, new IllegalArgumentException("imageModel == null"));
            }
        } else if (CollectionUtils.isEmpty(imageModel.getUrls())) {
            if (aVar2 != null) {
                aVar2.a(imageModel2, new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"));
            }
        } else if (!a(imageView.getContext())) {
            if (aVar2 != null) {
                aVar2.a(imageModel2, new IllegalArgumentException("!isActivityOK(view.getContext())"));
            }
        } else {
            com.bytedance.android.live.core.utils.fresco.a a2 = com.bytedance.android.live.core.utils.fresco.a.a(imageView.getContext()).a(a(imageModel)).a(imageModel2).a(ImageView.ScaleType.CENTER_CROP);
            if (i4 > 0 && i5 > 0) {
                a2.a(i4, i5);
            }
            if (i6 > 0) {
                a2.a(i6);
            }
            a2.a((ControllerListener) new k.a(imageModel2, aVar2));
            a2.a(imageView2);
        }
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, a aVar) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null}, null, f8317a, true, 1150, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
            Object[] objArr = {imageView2, imageModel2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f8317a, true, 1150, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE);
        } else if (a(imageView.getContext())) {
            com.bytedance.android.live.core.utils.fresco.a a2 = com.bytedance.android.live.core.utils.fresco.a.a(imageView.getContext()).a(imageModel2).a().a(ImageView.ScaleType.CENTER_CROP);
            if (i4 > 0 && i5 > 0) {
                a2.a(i4, i5);
            }
            if (i6 > 0) {
                a2.a(i6);
            }
            a2.a((ControllerListener) new k.a(null, null));
            a2.a(imageView2);
        }
    }
}
