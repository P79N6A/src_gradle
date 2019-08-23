package com.ss.android.ugc.aweme.tools.extract;

import a.g;
import a.i;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.tools.extract.e;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;

public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74691a;

    /* renamed from: b  reason: collision with root package name */
    protected ExtractFramesModel f74692b = new ExtractFramesModel(f());

    /* renamed from: c  reason: collision with root package name */
    protected volatile boolean f74693c;

    /* renamed from: d  reason: collision with root package name */
    protected f f74694d = new f();

    /* renamed from: e  reason: collision with root package name */
    protected String f74695e = UUID.randomUUID().toString();

    public ExtractFramesModel e() {
        return this.f74692b;
    }

    a() {
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74691a, false, 87047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74691a, false, 87047, new Class[0], Void.TYPE);
            return;
        }
        this.f74693c = false;
        this.f74692b = new ExtractFramesModel(f());
        this.f74695e = UUID.randomUUID().toString();
    }

    public boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f74691a, false, 87048, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74691a, false, 87048, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.CloseUploadExtractFrames) == 0) {
            z = true;
        }
        return z;
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74691a, false, 87049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74691a, false, 87049, new Class[0], Void.TYPE);
        } else if (this.f74692b != null) {
            this.f74692b.removeLastSegment();
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74691a, false, 87052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74691a, false, 87052, new Class[0], Void.TYPE);
        } else if (this.f74692b != null) {
            this.f74692b.removeStickerFace();
        }
    }

    public void a(boolean z) {
        this.f74693c = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) throws Exception {
        String str = (String) iVar.e();
        if (!TextUtils.isEmpty(str)) {
            this.f74692b.addStickFace(str);
        }
        return null;
    }

    public void a(ExtractFramesModel extractFramesModel) {
        if (extractFramesModel != null) {
            this.f74692b = extractFramesModel;
            if (this.f74694d != null) {
                this.f74694d.f74702b = this.f74692b.extractFramesDir;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String b(String str) throws Exception {
        if (!new File(str).exists()) {
            return null;
        }
        if (!this.f74694d.f74702b.contains(f())) {
            this.f74694d.a(f(), this.f74695e);
            this.f74692b.extractFramesDir = this.f74694d.f74702b;
        }
        String a2 = this.f74694d.a();
        com.ss.android.ugc.aweme.tools.e.a(com.ss.android.ugc.aweme.tools.e.a(str, ExtractFrameConfig.f74690a), new File(a2), 70, Bitmap.CompressFormat.JPEG);
        return a2;
    }

    public void a(@NonNull e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f74691a, false, 87046, new Class[]{e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f74691a, false, 87046, new Class[]{e.a.class}, Void.TYPE);
        } else if (!b()) {
            aVar.a(false);
        } else {
            this.f74693c = true;
            this.f74694d.a(f(), this.f74695e);
            this.f74692b.extractFramesDir = this.f74694d.f74702b;
            this.f74692b.addFrameSegment(new ArrayList());
        }
    }

    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74691a, false, 87051, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f74691a, false, 87051, new Class[]{String.class}, Void.TYPE);
        } else if (this.f74692b != null && !TextUtils.isEmpty(str)) {
            i.a((Callable<TResult>) new b<TResult>(this, str)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b);
        }
    }
}
