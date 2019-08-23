package com.ss.android.ugc.aweme.shortvideo;

import a.g;
import a.i;
import a.j;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigureExtension;
import com.ss.android.ugc.aweme.sticker.c.a;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.concurrent.Callable;

public final class OriginFramesUploader {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65352a;

    public @interface Type {
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{cVar, obj2}, this, f65352a, false, 74245, new Class[]{c.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, obj2}, this, f65352a, false, 74245, new Class[]{c.class, Object.class}, Void.TYPE);
        } else if (cVar != null) {
            cVar.j();
        } else {
            if (obj2 instanceof cb) {
                cb cbVar = (cb) obj2;
                if (cbVar.isFastImport) {
                    VEPreviewConfigureExtension.removeTempFiles(cbVar.previewConfigure);
                    return;
                }
                String str = cbVar.mPath;
                String wavFile = cbVar.getWavFile();
                if (!TextUtils.isEmpty(wavFile)) {
                    b.c(wavFile);
                }
                if (!TextUtils.isEmpty(str)) {
                    b.c(str);
                    a.a(new File(d.a(str)));
                }
            }
        }
    }

    public final void a(@NonNull Context context, @NonNull Object obj, c cVar, String str, String str2) {
        int i;
        boolean z;
        i<TResult> iVar;
        Object obj2 = obj;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context, obj2, cVar2, str, str2}, this, f65352a, false, 74244, new Class[]{Context.class, Object.class, c.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, obj2, cVar2, str, str2};
            PatchProxy.accessDispatch(objArr, this, f65352a, false, 74244, new Class[]{Context.class, Object.class, c.class, String.class, String.class}, Void.TYPE);
            return;
        }
        boolean z2 = obj2 instanceof cb;
        if (!z2 || !Publish.d(((cb) obj2).videoType)) {
            i = 1;
        } else {
            i = 2;
        }
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f65352a, false, 74247, new Class[]{Object.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f65352a, false, 74247, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.CloseUploadExtractFrames) == 0) {
                if (!(obj2 instanceof PhotoMovieContext)) {
                    if (z2) {
                        cb cbVar = (cb) obj2;
                        if (!cbVar.isMvThemeVideoType()) {
                            z = cbVar.shouldUploadExtractFrames();
                        }
                    }
                }
                z = true;
            }
            z = false;
        }
        if (!z) {
            a(cVar2, obj2);
            if (z2 && ((cb) obj2).extractFramesModel != null) {
                i.a((Callable<TResult>) new db<TResult>(obj2));
            }
            return;
        }
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f65352a, false, 74246, new Class[]{Object.class}, i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[]{obj2}, this, f65352a, false, 74246, new Class[]{Object.class}, i.class);
        } else {
            j jVar = new j();
            if (obj2 instanceof PhotoMovieContext) {
                i.b((Callable<TResult>) new dd<TResult>(obj2, jVar));
            } else if (z2) {
                cb cbVar2 = (cb) obj2;
                if (cbVar2.isMvThemeVideoType()) {
                    i.b((Callable<TResult>) new de<TResult>(obj2, jVar));
                } else if (cbVar2.mFromCut || cbVar2.mFromMultiCut) {
                    i.b((Callable<TResult>) new df<TResult>(obj2, jVar));
                } else {
                    jVar.b(null);
                }
            } else {
                iVar = i.h();
            }
            iVar = jVar.f1091a;
        }
        i<TResult> iVar2 = iVar;
        dc dcVar = new dc(this, cVar, obj, str, str2, context, i);
        iVar2.a((g<TResult, TContinuationResult>) dcVar);
    }
}
