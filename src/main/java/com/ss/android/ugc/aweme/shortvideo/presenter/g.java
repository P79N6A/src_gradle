package com.ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68843a;

    public static void a(@Nullable String str, int i, @Nullable OnGetVideoCoverCallback onGetVideoCoverCallback) {
        final int i2;
        final String str2 = str;
        final OnGetVideoCoverCallback onGetVideoCoverCallback2 = onGetVideoCoverCallback;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), onGetVideoCoverCallback2}, null, f68843a, true, 78202, new Class[]{String.class, Integer.TYPE, OnGetVideoCoverCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), onGetVideoCoverCallback2}, null, f68843a, true, 78202, new Class[]{String.class, Integer.TYPE, OnGetVideoCoverCallback.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68844a;

                public final void run() {
                    CoverInfo coverInfo;
                    if (PatchProxy.isSupport(new Object[0], this, f68844a, false, 78203, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68844a, false, 78203, new Class[0], Void.TYPE);
                        return;
                    }
                    FFMpegManager a2 = FFMpegManager.a();
                    String str = str2;
                    int i = i2;
                    if (PatchProxy.isSupport(new Object[]{str, 256, 256, Integer.valueOf(i)}, a2, FFMpegManager.f29312a, false, 16196, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, CoverInfo.class)) {
                        Object[] objArr = {str, 256, 256, Integer.valueOf(i)};
                        Object[] objArr2 = objArr;
                        FFMpegManager fFMpegManager = a2;
                        coverInfo = (CoverInfo) PatchProxy.accessDispatch(objArr2, fFMpegManager, FFMpegManager.f29312a, false, 16196, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, CoverInfo.class);
                    } else {
                        coverInfo = a2.f29314b.getFrameCover(str, 256, 256, i, 1);
                    }
                    if (!(coverInfo == null || coverInfo.getData() == null)) {
                        final Bitmap createBitmap = Bitmap.createBitmap(coverInfo.getData(), coverInfo.getWidth(), coverInfo.getHeight(), Bitmap.Config.ARGB_8888);
                        a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f68848a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f68848a, false, 78204, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f68848a, false, 78204, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (onGetVideoCoverCallback2 != null) {
                                    if (createBitmap != null) {
                                        onGetVideoCoverCallback2.onGetVideoCoverSuccess(createBitmap);
                                        return;
                                    }
                                    onGetVideoCoverCallback2.onGetVideoCoverFailed(-1);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
