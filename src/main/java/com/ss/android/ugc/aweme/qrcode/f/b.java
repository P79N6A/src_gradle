package com.ss.android.ugc.aweme.qrcode.f;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.d.e;

public abstract class b extends LinearLayout implements com.ss.android.ugc.aweme.qrcode.d.a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63470c;

    /* renamed from: d  reason: collision with root package name */
    protected e f63471d;

    /* renamed from: e  reason: collision with root package name */
    protected RemoteImageView f63472e;

    /* renamed from: f  reason: collision with root package name */
    protected a f63473f;
    protected d g;
    protected boolean h;
    public boolean i;
    protected BaseControllerListener<ImageInfo> j;

    public interface a {
        void a();

        void b();

        void c();
    }

    public abstract void setData(String str);

    public abstract void setQRCodeCardSubtitleColor(@ColorInt int i2);

    public abstract void setQRCodeCardTitleColor(@ColorInt int i2);

    public com.ss.android.ugc.aweme.qrcode.c.b a() {
        if (!PatchProxy.isSupport(new Object[0], this, f63470c, false, 70649, new Class[0], com.ss.android.ugc.aweme.qrcode.c.b.class)) {
            return new com.ss.android.ugc.aweme.qrcode.c.b();
        }
        return (com.ss.android.ugc.aweme.qrcode.c.b) PatchProxy.accessDispatch(new Object[0], this, f63470c, false, 70649, new Class[0], com.ss.android.ugc.aweme.qrcode.c.b.class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f63470c, false, 70654, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63470c, false, 70654, new Class[0], Void.TYPE);
            return;
        }
        if (this.f63473f != null) {
            this.f63473f.b();
        }
    }

    public View getQRCodeCardBottom() {
        if (!PatchProxy.isSupport(new Object[0], this, f63470c, false, 70655, new Class[0], View.class)) {
            return findViewById(C0906R.id.c9t);
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f63470c, false, 70655, new Class[0], View.class);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f63470c, false, 70653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63470c, false, 70653, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f63471d.a();
        this.f63473f = null;
    }

    public void setOnBindQrCodeListener(a aVar) {
        this.f63473f = aVar;
    }

    public void setData(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f63470c, false, 70647, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f63470c, false, 70647, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.g = dVar;
        setData(dVar.objectId);
    }

    public final String a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f63470c, false, 70652, new Class[]{UrlModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{urlModel}, this, f63470c, false, 70652, new Class[]{UrlModel.class}, String.class);
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return "";
        } else {
            return urlModel.getUrlList().get(0);
        }
    }

    public void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f63470c, false, 70648, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63470c, false, 70648, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f63471d = new e(a(), this);
        this.j = new BaseControllerListener<ImageInfo>() {
            public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                b.this.i = true;
            }
        };
    }

    public final void b(final com.ss.android.ugc.aweme.qrcode.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63470c, false, 70651, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f63470c, false, 70651, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            String a2 = a(aVar.f63358a);
            if (c.a(Uri.parse(a2))) {
                this.f63472e.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(a2)).setOldController(this.f63472e.getController())).setControllerListener(this.j)).build());
                if (!this.f63471d.c()) {
                    this.f63471d.a(a2);
                }
                if (this.f63473f != null) {
                    this.f63473f.a();
                }
            } else {
                c.a(aVar.f63358a, (c.a) new c.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63475a;

                    public final void a(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f63475a, false, 70657, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f63475a, false, 70657, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        b.this.c();
                    }

                    public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                        if (PatchProxy.isSupport(new Object[]{dataSource}, this, f63475a, false, 70656, new Class[]{DataSource.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dataSource}, this, f63475a, false, 70656, new Class[]{DataSource.class}, Void.TYPE);
                            return;
                        }
                        b.this.f63472e.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(b.this.a(aVar.f63358a))).setOldController(b.this.f63472e.getController())).setControllerListener(b.this.j)).build());
                        if (b.this.f63473f != null) {
                            b.this.f63473f.a();
                        }
                        b.this.f63471d.a(b.this.a(aVar.f63358a));
                    }
                });
            }
        }
    }

    public b(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
