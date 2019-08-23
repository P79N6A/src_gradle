package com.ss.android.ugc.aweme.lancet;

import a.i;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import com.bytedance.apm.internal.ApmDelegate;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b implements ControllerListener<ImageInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52931a;

    /* renamed from: b  reason: collision with root package name */
    public ImageRequest f52932b;

    /* renamed from: c  reason: collision with root package name */
    private ControllerListener f52933c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52934d;

    public final void onRelease(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52931a, false, 54932, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52931a, false, 54932, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f52933c != null) {
            this.f52933c.onRelease(str);
        }
    }

    public b(ControllerListener controllerListener, Object obj) {
        ImageRequest imageRequest;
        this.f52933c = controllerListener;
        if (obj != null) {
            if (obj instanceof ImageRequest) {
                imageRequest = (ImageRequest) obj;
            } else {
                ImageRequest[] imageRequestArr = (ImageRequest[]) obj;
                if (imageRequestArr.length > 0) {
                    imageRequest = imageRequestArr[0];
                } else {
                    imageRequest = null;
                }
            }
            this.f52932b = imageRequest;
        }
    }

    public final void onFailure(String str, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, th}, this, f52931a, false, 54929, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, th}, this, f52931a, false, 54929, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f52933c != null) {
            this.f52933c.onFailure(str, th);
        }
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, th}, this, f52931a, false, 54931, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, th}, this, f52931a, false, 54931, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f52933c != null) {
            this.f52933c.onIntermediateImageFailed(str, th);
        }
    }

    public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        ImageInfo imageInfo = (ImageInfo) obj;
        if (PatchProxy.isSupport(new Object[]{str, imageInfo}, this, f52931a, false, 54928, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, imageInfo}, this, f52931a, false, 54928, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
            return;
        }
        if (this.f52933c != null) {
            this.f52933c.onIntermediateImageSet(str, imageInfo);
        }
    }

    public final void onSubmit(String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f52931a, false, 54930, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, obj}, this, f52931a, false, 54930, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        if (this.f52933c != null) {
            this.f52933c.onSubmit(str, obj);
        }
    }

    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        String str2 = str;
        Animatable animatable2 = animatable;
        final ImageInfo imageInfo = (ImageInfo) obj;
        if (PatchProxy.isSupport(new Object[]{str2, imageInfo, animatable2}, this, f52931a, false, 54927, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, imageInfo, animatable2}, this, f52931a, false, 54927, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            return;
        }
        if (!this.f52934d) {
            this.f52934d = true;
            if (ApmDelegate.getInstance().getLogTypeSwitch("fresco_big_image_not_compress")) {
                i.a((Callable<TResult>) new Callable<Object>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52935a;

                    public final Object call() throws Exception {
                        int i;
                        if (PatchProxy.isSupport(new Object[0], this, f52935a, false, 54933, new Class[0], Object.class)) {
                            return PatchProxy.accessDispatch(new Object[0], this, f52935a, false, 54933, new Class[0], Object.class);
                        }
                        if (!(b.this.f52932b == null || b.this.f52932b.getSourceUri() == null)) {
                            int width = imageInfo.getWidth();
                            int height = imageInfo.getHeight();
                            b.this.f52932b.getSourceUri();
                            int i2 = -1;
                            if (b.this.f52932b.getResizeOptions() != null) {
                                i2 = b.this.f52932b.getResizeOptions().height;
                                i = b.this.f52932b.getResizeOptions().width;
                            } else {
                                i = -1;
                            }
                            if (b.this.f52932b.getImageDecodeOptions() != null) {
                                Bitmap.Config config = b.this.f52932b.getImageDecodeOptions().bitmapConfig;
                            }
                            if (width > 900 || height > 1000) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("image_width", imageInfo.getWidth());
                                    jSONObject.put("image_height", imageInfo.getHeight());
                                    jSONObject.put("image_url", b.this.f52932b.getSourceUri().toString());
                                    jSONObject.put("bitmap_config", b.this.f52932b.getImageDecodeOptions().bitmapConfig);
                                    jSONObject.put("resize_width", i);
                                    jSONObject.put("resize_height", i2);
                                    n.a("fresco_big_image_not_compress", jSONObject);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        return null;
                    }
                });
            }
        }
        if (!(this.f52933c == null || this.f52933c == this)) {
            this.f52933c.onFinalImageSet(str2, imageInfo, animatable2);
        }
    }
}
