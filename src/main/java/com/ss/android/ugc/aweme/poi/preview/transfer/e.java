package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a.c;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

public final class e extends i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60166a;

    e(h hVar) {
        super(hVar);
    }

    public final TransferImage a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60166a, false, 65431, new Class[]{Integer.TYPE}, TransferImage.class)) {
            return (TransferImage) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60166a, false, 65431, new Class[]{Integer.TYPE}, TransferImage.class);
        }
        g transConfig = this.f60213c.getTransConfig();
        TransferImage a2 = a(transConfig.b().get(i));
        a(transConfig.n.get(i), a2, true);
        this.f60213c.addView(a2, 1);
        return a2;
    }

    public final TransferImage c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60166a, false, 65434, new Class[]{Integer.TYPE}, TransferImage.class)) {
            return (TransferImage) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60166a, false, 65434, new Class[]{Integer.TYPE}, TransferImage.class);
        }
        TransferImage transferImage = null;
        g transConfig = this.f60213c.getTransConfig();
        List<ImageView> b2 = transConfig.b();
        if (b2.size() > i && b2.get(i) != null) {
            transferImage = a(b2.get(i));
            a(transConfig.n.get(i), transferImage, false);
            this.f60213c.addView(transferImage, 1);
        }
        return transferImage;
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60166a, false, 65432, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60166a, false, 65432, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        TransferAdapter transAdapter = this.f60213c.getTransAdapter();
        g transConfig = this.f60213c.getTransConfig();
        TransferImage a2 = this.f60213c.getTransAdapter().a(i);
        c cVar = transConfig.r;
        com.ss.android.ugc.aweme.poi.preview.b.c cVar2 = transConfig.p;
        cVar2.a(i, transAdapter.b(i));
        if (transConfig.h) {
            a(a2.getDrawable(), i, a2, cVar2);
            return;
        }
        String str = transConfig.n.get(i);
        if (cVar.a(str)) {
            f fVar = new f(this, transConfig, i, a2, cVar2);
            cVar.a(str, transConfig, fVar);
            return;
        }
        a(transConfig.a(this.f60214d), i, a2, cVar2);
    }

    public final void a(TransferImage transferImage, int i) {
        if (PatchProxy.isSupport(new Object[]{transferImage, Integer.valueOf(i)}, this, f60166a, false, 65430, new Class[]{TransferImage.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{transferImage, Integer.valueOf(i)}, this, f60166a, false, 65430, new Class[]{TransferImage.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        g transConfig = this.f60213c.getTransConfig();
        c cVar = transConfig.r;
        String str = transConfig.n.get(i);
        if (cVar.a(str)) {
            Drawable a2 = cVar.a(str, transConfig);
            if (a2 == null) {
                transferImage.setImageDrawable(transConfig.a(this.f60214d));
            } else {
                transferImage.setImageDrawable(a2);
            }
        } else {
            transferImage.setImageDrawable(transConfig.a(this.f60214d));
        }
    }

    private void a(Drawable drawable, int i, TransferImage transferImage, com.ss.android.ugc.aweme.poi.preview.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{drawable, Integer.valueOf(i), transferImage, cVar}, this, f60166a, false, 65433, new Class[]{Drawable.class, Integer.TYPE, TransferImage.class, com.ss.android.ugc.aweme.poi.preview.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, Integer.valueOf(i), transferImage, cVar}, this, f60166a, false, 65433, new Class[]{Drawable.class, Integer.TYPE, TransferImage.class, com.ss.android.ugc.aweme.poi.preview.b.c.class}, Void.TYPE);
            return;
        }
        g transConfig = this.f60213c.getTransConfig();
        c cVar2 = transConfig.r;
        final int i2 = i;
        final com.ss.android.ugc.aweme.poi.preview.b.c cVar3 = cVar;
        final TransferImage transferImage2 = transferImage;
        final g gVar = transConfig;
        AnonymousClass1 r4 = new c.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60167a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f60167a, false, 65436, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60167a, false, 65436, new Class[0], Void.TYPE);
                    return;
                }
                cVar3.a(i2);
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60167a, false, 65438, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60167a, false, 65438, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                switch (i) {
                    case 0:
                        transferImage2.setImageDrawable(gVar.b(e.this.f60214d));
                        break;
                    case 1:
                        cVar3.b(i2);
                        transferImage2.a();
                        e.this.f60213c.a((ImageView) transferImage2, i2);
                        return;
                }
            }
        };
        cVar2.a(transConfig.m.get(i2), transferImage, drawable, transConfig, r4);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(g gVar, int i, TransferImage transferImage, com.ss.android.ugc.aweme.poi.preview.b.c cVar, Drawable drawable) {
        if (drawable == null) {
            drawable = gVar.a(this.f60214d);
        }
        a(drawable, i, transferImage, cVar);
    }
}
