package com.bytedance.android.livesdk.chatroom.f;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10213a;

    public static void a(ImageView imageView, ImageModel imageModel, q.a aVar) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, aVar}, null, f10213a, true, 6474, new Class[]{ImageView.class, ImageModel.class, q.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel, aVar}, null, f10213a, true, 6474, new Class[]{ImageView.class, ImageModel.class, q.a.class}, Void.TYPE);
            return;
        }
        q.a(imageView, imageModel, aVar);
    }

    public static void a(HSImageView hSImageView, int i) {
        HSImageView hSImageView2 = hSImageView;
        if (PatchProxy.isSupport(new Object[]{hSImageView2, Integer.valueOf(i)}, null, f10213a, true, 6483, new Class[]{HSImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView2, Integer.valueOf(i)}, null, f10213a, true, 6483, new Class[]{HSImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{hSImageView2, Integer.valueOf(i)}, null, k.f8293a, true, 1102, new Class[]{HSImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView2, Integer.valueOf(i)}, null, k.f8293a, true, 1102, new Class[]{HSImageView.class, Integer.TYPE}, Void.TYPE);
        } else if (hSImageView2 != null) {
            hSImageView2.setImageURI(ImageRequestBuilder.newBuilderWithResourceId(i).build().getSourceUri());
        }
    }

    public static void a(HSImageView hSImageView, ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{hSImageView, imageModel}, null, f10213a, true, 6484, new Class[]{HSImageView.class, ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView, imageModel}, null, f10213a, true, 6484, new Class[]{HSImageView.class, ImageModel.class}, Void.TYPE);
            return;
        }
        k.a(hSImageView, imageModel);
    }

    public static void a(HSImageView hSImageView, ImageModel imageModel, Postprocessor postprocessor) {
        if (PatchProxy.isSupport(new Object[]{hSImageView, imageModel, postprocessor}, null, f10213a, true, 6489, new Class[]{HSImageView.class, ImageModel.class, Postprocessor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView, imageModel, postprocessor}, null, f10213a, true, 6489, new Class[]{HSImageView.class, ImageModel.class, Postprocessor.class}, Void.TYPE);
            return;
        }
        k.a(hSImageView, imageModel, postprocessor);
    }

    public static void a(HSImageView hSImageView, String str) {
        if (PatchProxy.isSupport(new Object[]{hSImageView, str}, null, f10213a, true, 6490, new Class[]{HSImageView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView, str}, null, f10213a, true, 6490, new Class[]{HSImageView.class, String.class}, Void.TYPE);
            return;
        }
        k.a(hSImageView, str);
    }

    public static void a(HSImageView hSImageView, String str, Postprocessor postprocessor) {
        if (PatchProxy.isSupport(new Object[]{hSImageView, str, postprocessor}, null, f10213a, true, 6491, new Class[]{HSImageView.class, String.class, Postprocessor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView, str, postprocessor}, null, f10213a, true, 6491, new Class[]{HSImageView.class, String.class, Postprocessor.class}, Void.TYPE);
            return;
        }
        k.a(hSImageView, str, postprocessor);
    }

    public static Observable<Bitmap> a(ImageModel imageModel) {
        ImageModel imageModel2 = imageModel;
        if (!PatchProxy.isSupport(new Object[]{imageModel2}, null, f10213a, true, 6493, new Class[]{ImageModel.class}, Observable.class)) {
            return Observable.create(new c(imageModel2));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{imageModel2}, null, f10213a, true, 6493, new Class[]{ImageModel.class}, Observable.class);
    }

    public static void a(ImageView imageView, int i) {
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2, Integer.valueOf(i)}, null, f10213a, true, 6478, new Class[]{ImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, Integer.valueOf(i)}, null, f10213a, true, 6478, new Class[]{ImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.a(imageView2, i, -1, -1);
    }

    public static void b(ImageView imageView, ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel}, null, f10213a, true, 6475, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel}, null, f10213a, true, 6475, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE);
            return;
        }
        q.a(imageView, imageModel);
    }

    public static void a(ImageView imageView, ImageModel imageModel) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2}, null, f10213a, true, 6470, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, imageModel2}, null, f10213a, true, 6470, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE);
            return;
        }
        b(imageView2, imageModel2, 0);
    }

    private static void b(ImageView imageView, ImageModel imageModel, int i) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2, 0}, null, f10213a, true, 6473, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, imageModel2, 0}, null, f10213a, true, 6473, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.a(imageView2, imageModel2, 0);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, Integer.valueOf(i)}, null, f10213a, true, 6476, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel, Integer.valueOf(i)}, null, f10213a, true, 6476, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.a(imageView, imageModel, 0, 0, i, null);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i, int i2) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f10213a, true, 6471, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, imageModel2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f10213a, true, 6471, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.a(imageView2, imageModel2, i, i2, null);
    }

    public static void b(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f10213a, true, 6480, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f10213a, true, 6480, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.a(imageView, imageModel, i, i2, i3, null);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{imageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f10213a, true, 6472, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, imageModel, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f10213a, true, 6472, new Class[]{ImageView.class, ImageModel.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        q.b(imageView, imageModel, i, i2, i3, null);
    }
}
