package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

public final class c extends i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60154a;

    c(h hVar) {
        super(hVar);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60154a, false, 65425, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60154a, false, 65425, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        g transConfig = this.f60213c.getTransConfig();
        String str = transConfig.m.get(i);
        TransferImage a2 = this.f60213c.getTransAdapter().a(i);
        if (transConfig.h) {
            a(str, a2, a2.getDrawable(), i);
            return;
        }
        com.ss.android.ugc.aweme.poi.preview.a.c cVar = transConfig.r;
        d dVar = new d(this, transConfig, str, a2, i);
        cVar.a(str, transConfig, dVar);
    }

    public final TransferImage c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60154a, false, 65427, new Class[]{Integer.TYPE}, TransferImage.class)) {
            return (TransferImage) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60154a, false, 65427, new Class[]{Integer.TYPE}, TransferImage.class);
        }
        TransferImage transferImage = null;
        g transConfig = this.f60213c.getTransConfig();
        List<ImageView> b2 = transConfig.b();
        if (b2.size() > i && b2.get(i) != null) {
            transferImage = a(b2.get(i));
            a(transConfig.m.get(i), transferImage, false);
            this.f60213c.addView(transferImage, 1);
        }
        return transferImage;
    }

    public final TransferImage a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60154a, false, 65424, new Class[]{Integer.TYPE}, TransferImage.class)) {
            return (TransferImage) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60154a, false, 65424, new Class[]{Integer.TYPE}, TransferImage.class);
        }
        g transConfig = this.f60213c.getTransConfig();
        TransferImage a2 = a(transConfig.b().get(i));
        a(transConfig.m.get(i), a2, true);
        this.f60213c.addView(a2, 1);
        return a2;
    }

    public final void a(TransferImage transferImage, int i) {
        if (PatchProxy.isSupport(new Object[]{transferImage, Integer.valueOf(i)}, this, f60154a, false, 65423, new Class[]{TransferImage.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{transferImage, Integer.valueOf(i)}, this, f60154a, false, 65423, new Class[]{TransferImage.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        g transConfig = this.f60213c.getTransConfig();
        Drawable a2 = transConfig.r.a(transConfig.m.get(i), transConfig);
        if (a2 == null) {
            transferImage.setImageDrawable(transConfig.a(this.f60214d));
        } else {
            transferImage.setImageDrawable(a2);
        }
    }

    private void a(String str, TransferImage transferImage, Drawable drawable, int i) {
        final TransferImage transferImage2 = transferImage;
        if (PatchProxy.isSupport(new Object[]{str, transferImage2, drawable, Integer.valueOf(i)}, this, f60154a, false, 65426, new Class[]{String.class, TransferImage.class, Drawable.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, transferImage2, drawable, Integer.valueOf(i)}, this, f60154a, false, 65426, new Class[]{String.class, TransferImage.class, Drawable.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final g transConfig = this.f60213c.getTransConfig();
        final int i2 = i;
        transConfig.r.a(str, transferImage, drawable, transConfig, new c.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60155a;

            public final void a() {
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60155a, false, 65429, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60155a, false, 65429, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                switch (i) {
                    case 0:
                        transferImage2.setImageDrawable(transConfig.b(c.this.f60214d));
                        break;
                    case 1:
                        if (3 == transferImage2.getState()) {
                            transferImage2.a(202);
                        }
                        transferImage2.a();
                        c.this.f60213c.a((ImageView) transferImage2, i2);
                        return;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(g gVar, String str, TransferImage transferImage, int i, Drawable drawable) {
        if (drawable == null) {
            drawable = gVar.a(this.f60214d);
        }
        a(str, transferImage, drawable, i);
    }
}
