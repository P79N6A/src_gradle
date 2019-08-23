package com.ss.android.ugc.aweme.qrcode.v2;

import a.g;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.c.i;
import com.ss.android.ugc.aweme.qrcode.d;
import java.util.concurrent.Callable;

public final class h extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63546b;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ BitmapDrawable b() throws Exception {
        try {
            if (this.f63471d.c()) {
                return new BitmapDrawable(getResources(), this.f63471d.d().getAbsolutePath());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final b a() {
        if (!PatchProxy.isSupport(new Object[0], this, f63546b, false, 70606, new Class[0], b.class)) {
            return new i();
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, f63546b, false, 70606, new Class[0], b.class);
    }

    public h(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(a.i iVar) throws Exception {
        if (iVar.e() != null) {
            ((GenericDraweeHierarchy) this.f63472e.getHierarchy()).setFadeDuration(0);
            ((GenericDraweeHierarchy) this.f63472e.getHierarchy()).setPlaceholderImage((Drawable) iVar.e(), ScalingUtils.ScaleType.CENTER_CROP);
            this.i = true;
        }
        return null;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63546b, false, 70608, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63546b, false, 70608, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (!this.h) {
            super.a(exc);
        }
    }

    public final void setData(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f63546b, false, 70607, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f63546b, false, 70607, new Class[]{d.class}, Void.TYPE);
            return;
        }
        super.setData(dVar);
        if (this.f63471d.c()) {
            this.h = true;
            Uri fromFile = Uri.fromFile(this.f63471d.d());
            Fresco.getImagePipeline().evictFromCache(fromFile);
            this.f63472e.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(fromFile).setOldController(this.f63472e.getController())).setControllerListener(this.j)).build());
            if (this.f63473f != null) {
                this.f63473f.c();
            }
            a.i.a((Callable<TResult>) new i<TResult>(this)).a((g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(this), a.i.f1052b);
        }
    }
}
