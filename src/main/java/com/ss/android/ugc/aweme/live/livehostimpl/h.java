package com.ss.android.ugc.aweme.live.livehostimpl;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.e;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.c;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.c.a;
import java.io.File;
import java.util.ArrayList;

public final class h implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53440a;

    public h() {
        b.a(e.class, this);
    }

    public final boolean a(ImageModel imageModel) {
        if (!PatchProxy.isSupport(new Object[]{imageModel}, this, f53440a, false, 55778, new Class[]{ImageModel.class}, Boolean.TYPE)) {
            return a.a(imageModel);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageModel}, this, f53440a, false, 55778, new Class[]{ImageModel.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f53440a, false, 55779, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f53440a, false, 55779, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, a.f53336a, true, 55958, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, a.f53336a, true, 55958, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a.a(str2, null);
    }

    public final String b(ImageModel imageModel) {
        ImageModel imageModel2 = imageModel;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{imageModel2}, this, f53440a, false, 55782, new Class[]{ImageModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{imageModel2}, this, f53440a, false, 55782, new Class[]{ImageModel.class}, String.class);
        }
        if (PatchProxy.isSupport(new Object[]{imageModel2}, null, a.f53336a, true, 55961, new Class[]{ImageModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{imageModel2}, null, a.f53336a, true, 55961, new Class[]{ImageModel.class}, String.class);
        } else if (imageModel2 == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return "";
        } else {
            String str = "";
            if (a.a(imageModel)) {
                ImageRequest[] a2 = a.a(imageModel2, null, null);
                int length = a2.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    BinaryResource resource = ImagePipelineFactory.getInstance().getMainFileCache().getResource(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(a2[i], null));
                    if (resource != null) {
                        File file = ((FileBinaryResource) resource).getFile();
                        if (file != null) {
                            str = file.getAbsolutePath();
                            break;
                        }
                    }
                    i++;
                }
            }
            return str;
        }
    }

    public final String b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53440a, false, 55781, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f53440a, false, 55781, new Class[]{String.class}, String.class);
        }
        if (PatchProxy.isSupport(new Object[]{str}, null, a.f53336a, true, 55960, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, a.f53336a, true, 55960, new Class[]{String.class}, String.class);
        }
        String str2 = "";
        if (str == null || str.isEmpty()) {
            return str2;
        }
        Uri parse = Uri.parse(str);
        if (a.a(parse)) {
            BinaryResource resource = ImagePipelineFactory.getInstance().getMainFileCache().getResource(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(parse), null));
            if (resource != null) {
                File file = ((FileBinaryResource) resource).getFile();
                if (file != null) {
                    str2 = file.getAbsolutePath();
                }
            }
        }
        return str2;
    }

    public final e.a a(ImageModel imageModel, e.c cVar) {
        ImageModel imageModel2 = imageModel;
        final e.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{imageModel2, cVar2}, this, f53440a, false, 55776, new Class[]{ImageModel.class, e.c.class}, e.a.class)) {
            return (e.a) PatchProxy.accessDispatch(new Object[]{imageModel2, cVar2}, this, f53440a, false, 55776, new Class[]{ImageModel.class, e.c.class}, e.a.class);
        }
        AnonymousClass1 r2 = new BaseBitmapDataSubscriber() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53441a;

            public final void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
            }

            public final void onNewResultImpl(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f53441a, false, 55783, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f53441a, false, 55783, new Class[]{Bitmap.class}, Void.TYPE);
                    return;
                }
                cVar2.a(bitmap2);
            }
        };
        ImageRequest[] a2 = a.a(imageModel2, null, null);
        if (!(a2 == null || a2.length == 0)) {
            ArrayList arrayList = new ArrayList();
            for (ImageRequest imageRequest : a2) {
                if (imageRequest != null) {
                    arrayList.add(Fresco.getImagePipeline().getDataSourceSupplier(imageRequest, null, ImageRequest.a.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty()) {
                c.a(arrayList).get().subscribe(r2, com.facebook.common.executors.h.a());
            }
        }
        return null;
    }

    public final void a(String str, e.b bVar) {
        if (PatchProxy.isSupport(new Object[]{str, bVar}, this, f53440a, false, 55780, new Class[]{String.class, e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bVar}, this, f53440a, false, 55780, new Class[]{String.class, e.b.class}, Void.TYPE);
            return;
        }
        a.a(str, bVar);
    }
}
