package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.b.c;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60147a;

    a(h hVar) {
        super(hVar);
    }

    private Drawable e(int i) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65417, new Class[]{Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65417, new Class[]{Integer.TYPE}, Drawable.class);
        }
        g transConfig = this.f60213c.getTransConfig();
        ImageView imageView = transConfig.b().get(i);
        if (imageView != null) {
            drawable = imageView.getDrawable();
        } else {
            drawable = transConfig.a(this.f60214d);
        }
        return drawable;
    }

    public final TransferImage a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65414, new Class[]{Integer.TYPE}, TransferImage.class)) {
            return (TransferImage) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65414, new Class[]{Integer.TYPE}, TransferImage.class);
        }
        ImageView imageView = this.f60213c.getTransConfig().b().get(i);
        TransferImage a2 = a(imageView);
        a2.setImageDrawable(imageView.getDrawable());
        a2.a(201);
        this.f60213c.addView(a2, 1);
        return a2;
    }

    public final void b(int i) {
        Drawable b2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65415, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65415, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TransferAdapter transAdapter = this.f60213c.getTransAdapter();
        g transConfig = this.f60213c.getTransConfig();
        String str = transConfig.m.get(i);
        TransferImage a2 = transAdapter.a(i);
        if (transConfig.h) {
            b2 = e(i);
        } else {
            b2 = b(a2, i);
        }
        Drawable drawable = b2;
        final c cVar = transConfig.p;
        cVar.a(i, transAdapter.b(i));
        com.ss.android.ugc.aweme.poi.preview.a.c cVar2 = transConfig.r;
        final int i2 = i;
        final TransferImage transferImage = a2;
        final g gVar = transConfig;
        AnonymousClass1 r0 = new c.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60148a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f60148a, false, 65420, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60148a, false, 65420, new Class[0], Void.TYPE);
                    return;
                }
                cVar.a(i2);
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60148a, false, 65422, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60148a, false, 65422, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                switch (i) {
                    case 0:
                        transferImage.setImageDrawable(gVar.b(a.this.f60214d));
                        break;
                    case 1:
                        cVar.b(i2);
                        transferImage.a(202);
                        transferImage.a();
                        a.this.f60213c.a((ImageView) transferImage, i2);
                        return;
                }
            }
        };
        cVar2.a(str, a2, drawable, transConfig, r0);
    }

    public final TransferImage c(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65416, new Class[]{Integer.TYPE}, TransferImage.class)) {
            return (TransferImage) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60147a, false, 65416, new Class[]{Integer.TYPE}, TransferImage.class);
        }
        TransferImage transferImage = null;
        g transConfig = this.f60213c.getTransConfig();
        List<ImageView> b2 = transConfig.b();
        if (b2.size() > i2 && b2.get(i2) != null) {
            transferImage = a(b2.get(i2));
            transferImage.setImageDrawable(this.f60213c.getTransAdapter().a(transConfig.f60180b).getDrawable());
            if (PatchProxy.isSupport(new Object[]{201}, transferImage, TransferImage.G, false, 65586, new Class[]{Integer.TYPE}, Void.TYPE)) {
                TransferImage transferImage2 = transferImage;
                PatchProxy.accessDispatch(new Object[]{201}, transferImage2, TransferImage.G, false, 65586, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                transferImage.I = 200;
                transferImage.H = 2;
                transferImage.J = 201;
                transferImage.O = true;
                transferImage.P.setAlpha(255);
                transferImage.invalidate();
            }
            this.f60213c.addView(transferImage, 1);
        }
        return transferImage;
    }

    private Drawable b(TransferImage transferImage, int i) {
        if (PatchProxy.isSupport(new Object[]{transferImage, Integer.valueOf(i)}, this, f60147a, false, 65418, new Class[]{TransferImage.class, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{transferImage, Integer.valueOf(i)}, this, f60147a, false, 65418, new Class[]{TransferImage.class, Integer.TYPE}, Drawable.class);
        }
        g transConfig = this.f60213c.getTransConfig();
        Drawable e2 = e(i);
        int[] iArr = new int[2];
        ImageView imageView = transConfig.b().get(i);
        if (imageView != null) {
            iArr[0] = imageView.getWidth();
            iArr[1] = imageView.getHeight();
        }
        a(transferImage, e2, iArr);
        return e2;
    }

    public final void a(TransferImage transferImage, int i) {
        TransferImage transferImage2 = transferImage;
        if (PatchProxy.isSupport(new Object[]{transferImage2, Integer.valueOf(i)}, this, f60147a, false, 65413, new Class[]{TransferImage.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{transferImage2, Integer.valueOf(i)}, this, f60147a, false, 65413, new Class[]{TransferImage.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        transferImage2.setImageDrawable(b(transferImage, i));
    }

    private void a(TransferImage transferImage, Drawable drawable, int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{transferImage, drawable, iArr}, this, f60147a, false, 65419, new Class[]{TransferImage.class, Drawable.class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{transferImage, drawable, iArr}, this, f60147a, false, 65419, new Class[]{TransferImage.class, Drawable.class, int[].class}, Void.TYPE);
            return;
        }
        DisplayMetrics displayMetrics = this.f60214d.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int d2 = d(displayMetrics.heightPixels);
        transferImage.a(drawable, iArr[0], iArr[1], i, d2);
        transferImage.d();
    }
}
