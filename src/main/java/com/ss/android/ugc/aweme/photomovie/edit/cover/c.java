package com.ss.android.ugc.aweme.photomovie.edit.cover;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.photo.e;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import java.io.File;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58911a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f58912b;

    /* renamed from: c  reason: collision with root package name */
    private a f58913c;

    public final int a() {
        return 7;
    }

    public final long b() {
        return 0;
    }

    c(List<String> list, a aVar) {
        this.f58912b = list;
        this.f58913c = aVar;
    }

    public final void a(int i, int i2, @NonNull b.a aVar) {
        int a2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), aVar}, this, f58911a, false, 64067, new Class[]{Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), aVar}, this, f58911a, false, 64067, new Class[]{Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE);
            return;
        }
        int a3 = a();
        for (int i3 = 0; i3 < a3; i3++) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), aVar}, this, f58911a, false, 64066, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), aVar}, this, f58911a, false, 64066, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, b.a.class}, Void.TYPE);
            } else {
                int a4 = a();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(a4)}, this, f58911a, false, 64070, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                    a2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(a4)}, this, f58911a, false, 64070, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                } else {
                    a2 = this.f58913c.a(this.f58912b.size(), (((float) i3) * 1.0f) / ((float) a4));
                }
                final int i4 = a2;
                final int i5 = i;
                final int i6 = i2;
                final b.a aVar2 = aVar;
                AnonymousClass1 r0 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58914a;

                    public final void run() {
                        Uri uri;
                        if (PatchProxy.isSupport(new Object[0], this, f58914a, false, 64071, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f58914a, false, 64071, new Class[0], Void.TYPE);
                            return;
                        }
                        c cVar = c.this;
                        String str = c.this.f58912b.get(i4);
                        if (PatchProxy.isSupport(new Object[]{str}, cVar, c.f58911a, false, 64069, new Class[]{String.class}, Uri.class)) {
                            Object[] objArr = {str};
                            c cVar2 = cVar;
                            uri = (Uri) PatchProxy.accessDispatch(objArr, cVar2, c.f58911a, false, 64069, new Class[]{String.class}, Uri.class);
                        } else {
                            uri = Uri.parse(Uri.fromFile(new File(str)).toString());
                        }
                        com.ss.android.ugc.aweme.base.c.a(e.a(uri), i5, i6, (com.ss.android.ugc.aweme.base.b.a.b<Bitmap>) new com.ss.android.ugc.aweme.base.b.a.b<Bitmap>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f58920a;

                            public final /* synthetic */ void accept(Object obj) {
                                final Bitmap bitmap = (Bitmap) obj;
                                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f58920a, false, 64072, new Class[]{Bitmap.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f58920a, false, 64072, new Class[]{Bitmap.class}, Void.TYPE);
                                    return;
                                }
                                a.b(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f58922a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f58922a, false, 64073, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f58922a, false, 64073, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        aVar2.a(bitmap);
                                    }
                                });
                            }
                        });
                    }
                };
                a.a(r0);
            }
        }
    }
}
