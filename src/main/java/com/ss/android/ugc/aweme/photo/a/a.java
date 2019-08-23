package com.ss.android.ugc.aweme.photo.a;

import a.i;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.e;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

public final class a implements IPhotoProcessService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58457a;

    public final void a(File file) throws Exception {
        if (PatchProxy.isSupport(new Object[]{file}, this, f58457a, false, 63786, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f58457a, false, 63786, new Class[]{File.class}, Void.TYPE);
            return;
        }
        GlobalContext.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

    public final void savePhotoWithoutWaterMarker(@Nullable PhotoContext photoContext, @Nullable IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener) {
        final PhotoContext photoContext2 = photoContext;
        final IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener2 = iPhotoServiceListener;
        if (PatchProxy.isSupport(new Object[]{photoContext2, iPhotoServiceListener2}, this, f58457a, false, 63787, new Class[]{PhotoContext.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext2, iPhotoServiceListener2}, this, f58457a, false, 63787, new Class[]{PhotoContext.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58470a;

            public final void run() {
                AnonymousClass1 r0;
                if (PatchProxy.isSupport(new Object[0], this, f58470a, false, 63793, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58470a, false, 63793, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.photo.a aVar = new com.ss.android.ugc.aweme.photo.a(GlobalContext.getContext());
                File file = new File(aVar.a());
                try {
                    File file2 = new File(photoContext2.mPhotoLocalPath);
                    b.c(photoContext2.mPhotoLocalPath, aVar.a());
                    photoContext2.mPhotoLocalPath = file.getAbsolutePath();
                    a.this.a(file);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    r0 = new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58474a;

                        public final void run() {
                            int i = 0;
                            if (PatchProxy.isSupport(new Object[0], this, f58474a, false, 63794, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58474a, false, 63794, new Class[0], Void.TYPE);
                                return;
                            }
                            if (iPhotoServiceListener2 != null) {
                                IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener2;
                                if (!b.b(photoContext2.mPhotoLocalPath)) {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext2);
                            }
                        }
                    };
                } catch (Exception unused) {
                    r0 = new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58474a;

                        public final void run() {
                            int i = 0;
                            if (PatchProxy.isSupport(new Object[0], this, f58474a, false, 63794, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58474a, false, 63794, new Class[0], Void.TYPE);
                                return;
                            }
                            if (iPhotoServiceListener2 != null) {
                                IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener2;
                                if (!b.b(photoContext2.mPhotoLocalPath)) {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext2);
                            }
                        }
                    };
                } catch (Throwable th) {
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58474a;

                        public final void run() {
                            int i = 0;
                            if (PatchProxy.isSupport(new Object[0], this, f58474a, false, 63794, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f58474a, false, 63794, new Class[0], Void.TYPE);
                                return;
                            }
                            if (iPhotoServiceListener2 != null) {
                                IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener = iPhotoServiceListener2;
                                if (!b.b(photoContext2.mPhotoLocalPath)) {
                                    i = -1;
                                }
                                iPhotoServiceListener.onSaved(i, photoContext2);
                            }
                        }
                    });
                    throw th;
                }
                com.ss.android.b.a.a.a.b(r0);
            }
        });
    }

    public final void photoAddWaterMarker(@Nullable Bitmap bitmap, @Nullable IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener) {
        Bitmap bitmap2 = bitmap;
        final IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener2 = iPhotoServiceListener;
        if (PatchProxy.isSupport(new Object[]{bitmap2, iPhotoServiceListener2}, this, f58457a, false, 63782, new Class[]{Bitmap.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, iPhotoServiceListener2}, this, f58457a, false, 63782, new Class[]{Bitmap.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE);
            return;
        }
        AnonymousClass1 r3 = new e.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58458a;

            public final void a(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f58458a, false, 63789, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f58458a, false, 63789, new Class[]{Bitmap.class}, Void.TYPE);
                    return;
                }
                if (iPhotoServiceListener2 != null) {
                    iPhotoServiceListener2.onWaterMakerAdded(bitmap2);
                    if (PatchProxy.isSupport(new Object[0], null, a.f58457a, true, 63783, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, a.f58457a, true, 63783, new Class[0], Void.TYPE);
                        return;
                    }
                    r.a("add_watermark", (Map) d.a().a("enter_from", "download_video").f34114b);
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{bitmap2, r3}, null, e.f58487a, true, 63542, new Class[]{Bitmap.class, e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2, r3}, null, e.f58487a, true, 63542, new Class[]{Bitmap.class, e.a.class}, Void.TYPE);
            return;
        }
        e.a((com.ss.android.ugc.aweme.base.b.a.b<Bitmap>) new com.ss.android.ugc.aweme.base.b.a.b<Bitmap>(bitmap2, r3) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58493a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f58494b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f58495c;

            public final /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f58493a, false, 63553, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f58493a, false, 63553, new Class[]{Bitmap.class}, Void.TYPE);
                    return;
                }
                e.a(this.f58494b, bitmap, this.f58495c);
            }

            {
                this.f58494b = r1;
                this.f58495c = r2;
            }
        });
    }

    public final void savePhotoWithWaterMarker(@Nullable PhotoContext photoContext, @Nullable IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener) {
        final PhotoContext photoContext2 = photoContext;
        final IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener2 = iPhotoServiceListener;
        if (PatchProxy.isSupport(new Object[]{photoContext2, iPhotoServiceListener2}, this, f58457a, false, 63785, new Class[]{PhotoContext.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext2, iPhotoServiceListener2}, this, f58457a, false, 63785, new Class[]{PhotoContext.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE);
            return;
        }
        AnonymousClass2 r3 = new e.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58461a;

            public final void a(final Bitmap bitmap) {
                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f58461a, false, 63790, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f58461a, false, 63790, new Class[]{Bitmap.class}, Void.TYPE);
                } else if (bitmap == null) {
                    if (iPhotoServiceListener2 != null) {
                        iPhotoServiceListener2.onSaved(-1, null);
                    }
                } else {
                    com.ss.android.b.a.a.a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58465a;

                        /* JADX WARNING: Removed duplicated region for block: B:24:0x0088 A[SYNTHETIC, Splitter:B:24:0x0088] */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[SYNTHETIC, Splitter:B:31:0x009b] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r9 = this;
                                r0 = 0
                                java.lang.Object[] r1 = new java.lang.Object[r0]
                                com.meituan.robust.ChangeQuickRedirect r3 = f58465a
                                java.lang.Class[] r6 = new java.lang.Class[r0]
                                java.lang.Class r7 = java.lang.Void.TYPE
                                r4 = 0
                                r5 = 63791(0xf92f, float:8.939E-41)
                                r2 = r9
                                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                                if (r1 == 0) goto L_0x0025
                                java.lang.Object[] r2 = new java.lang.Object[r0]
                                com.meituan.robust.ChangeQuickRedirect r4 = f58465a
                                r5 = 0
                                r6 = 63791(0xf92f, float:8.939E-41)
                                java.lang.Class[] r7 = new java.lang.Class[r0]
                                java.lang.Class r8 = java.lang.Void.TYPE
                                r3 = r9
                                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                                return
                            L_0x0025:
                                com.ss.android.ugc.aweme.photo.a r0 = new com.ss.android.ugc.aweme.photo.a
                                android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
                                r0.<init>(r1)
                                java.io.File r1 = new java.io.File
                                java.lang.String r0 = r0.a()
                                r1.<init>(r0)
                                r0 = 0
                                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0099, all -> 0x0083 }
                                r2.<init>(r1)     // Catch:{ Exception -> 0x0099, all -> 0x0083 }
                                android.graphics.Bitmap r0 = r10     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                r4 = 100
                                r0.compress(r3, r4, r2)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                r2.flush()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                com.ss.android.ugc.aweme.photo.a.a$2 r3 = com.ss.android.ugc.aweme.photo.a.a.AnonymousClass2.this     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                com.ss.android.ugc.aweme.photo.PhotoContext r3 = r0     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                java.lang.String r3 = r3.mPhotoLocalPath     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                r0.<init>(r3)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                boolean r3 = r0.exists()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                if (r3 == 0) goto L_0x005d
                                r0.delete()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                            L_0x005d:
                                com.ss.android.ugc.aweme.photo.a.a$2 r0 = com.ss.android.ugc.aweme.photo.a.a.AnonymousClass2.this     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                com.ss.android.ugc.aweme.photo.PhotoContext r0 = r0     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                java.lang.String r3 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                r0.mPhotoLocalPath = r3     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                com.ss.android.ugc.aweme.photo.a.a$2 r0 = com.ss.android.ugc.aweme.photo.a.a.AnonymousClass2.this     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                com.ss.android.ugc.aweme.photo.a.a r0 = com.ss.android.ugc.aweme.photo.a.a.this     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                r0.a(r1)     // Catch:{ Exception -> 0x0081, all -> 0x007f }
                                r2.close()     // Catch:{ Exception -> 0x0071 }
                            L_0x0071:
                                android.graphics.Bitmap r0 = r10
                                r0.recycle()
                                com.ss.android.ugc.aweme.photo.a.a$2$1$1 r0 = new com.ss.android.ugc.aweme.photo.a.a$2$1$1
                                r0.<init>()
                            L_0x007b:
                                com.ss.android.b.a.a.a.b(r0)
                                return
                            L_0x007f:
                                r0 = move-exception
                                goto L_0x0086
                            L_0x0081:
                                r0 = r2
                                goto L_0x0099
                            L_0x0083:
                                r1 = move-exception
                                r2 = r0
                                r0 = r1
                            L_0x0086:
                                if (r2 == 0) goto L_0x008b
                                r2.close()     // Catch:{ Exception -> 0x008b }
                            L_0x008b:
                                android.graphics.Bitmap r1 = r10
                                r1.recycle()
                                com.ss.android.ugc.aweme.photo.a.a$2$1$1 r1 = new com.ss.android.ugc.aweme.photo.a.a$2$1$1
                                r1.<init>()
                                com.ss.android.b.a.a.a.b(r1)
                                throw r0
                            L_0x0099:
                                if (r0 == 0) goto L_0x009e
                                r0.close()     // Catch:{ Exception -> 0x009e }
                            L_0x009e:
                                android.graphics.Bitmap r0 = r10
                                r0.recycle()
                                com.ss.android.ugc.aweme.photo.a.a$2$1$1 r0 = new com.ss.android.ugc.aweme.photo.a.a$2$1$1
                                r0.<init>()
                                goto L_0x007b
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.a.a.AnonymousClass2.AnonymousClass1.run():void");
                        }
                    });
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{photoContext2, r3}, null, e.f58487a, true, 63541, new Class[]{PhotoContext.class, e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext2, r3}, null, e.f58487a, true, 63541, new Class[]{PhotoContext.class, e.a.class}, Void.TYPE);
        } else if (photoContext2 == null) {
            r3.a(null);
        } else {
            c.a(e.a(Uri.parse(Uri.fromFile(new File(photoContext2.mPhotoLocalPath)).toString())), photoContext2.mWidth, photoContext2.mHeight, (com.ss.android.ugc.aweme.base.b.a.b<Bitmap>) new com.ss.android.ugc.aweme.base.b.a.b<Bitmap>(r3) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58488a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f58489b;

                {
                    this.f58489b = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    final Bitmap bitmap = (Bitmap) obj;
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f58488a, false, 63551, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f58488a, false, 63551, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    e.a((com.ss.android.ugc.aweme.base.b.a.b<Bitmap>) new com.ss.android.ugc.aweme.base.b.a.b<Bitmap>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f58490a;

                        public final /* synthetic */ void accept(Object obj) {
                            Bitmap bitmap = (Bitmap) obj;
                            if (PatchProxy.isSupport(new Object[]{bitmap}, this, f58490a, false, 63552, new Class[]{Bitmap.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bitmap}, this, f58490a, false, 63552, new Class[]{Bitmap.class}, Void.TYPE);
                                return;
                            }
                            e.a(bitmap, bitmap, AnonymousClass1.this.f58489b);
                        }
                    });
                }
            });
        }
    }

    public final void photoAddStoryWaterMarker(String str, String str2, @Nullable IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener) {
        String str3 = str;
        String str4 = str2;
        IPhotoProcessService.IPhotoServiceListener iPhotoServiceListener2 = iPhotoServiceListener;
        if (PatchProxy.isSupport(new Object[]{str3, str4, iPhotoServiceListener2}, this, f58457a, false, 63784, new Class[]{String.class, String.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, iPhotoServiceListener2}, this, f58457a, false, 63784, new Class[]{String.class, String.class, IPhotoProcessService.IPhotoServiceListener.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new b<TResult>(str3, iPhotoServiceListener2, str4));
    }
}
