package com.ss.android.ugc.aweme.feed.share.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.c;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import java.io.File;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45844a;
    private static final String j = (((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir() + "share/");
    private static final String k = (j + "image/");

    /* renamed from: b  reason: collision with root package name */
    public final String f45845b;

    /* renamed from: c  reason: collision with root package name */
    public int f45846c;

    /* renamed from: d  reason: collision with root package name */
    protected Activity f45847d;

    /* renamed from: e  reason: collision with root package name */
    protected String f45848e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.view.d f45849f;
    public int g;
    public String h;
    public a i;
    private int l;
    private int m = 100;
    private Aweme n;
    private String o;
    private Handler p = new Handler(Looper.getMainLooper());
    private String q;
    private String r;
    private boolean s;
    private Runnable t = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45854a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45854a, false, 42378, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45854a, false, 42378, new Class[0], Void.TYPE);
                return;
            }
            if (b.this.f45849f != null) {
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = b.this.f45849f;
                int i = 100;
                if (b.this.f45846c < 100) {
                    i = b.this.f45846c;
                }
                dVar.setProgress(i);
            }
        }
    };

    public interface a {
        void a(String str);
    }

    public final void onCancel() {
    }

    public final void onDownloadPause() {
    }

    public final void onDownloadStart(int i2) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45844a, false, 42363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45844a, false, 42363, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45852a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45852a, false, 42377, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45852a, false, 42377, new Class[0], Void.TYPE);
                    return;
                }
                b.this.b();
                if (b.this.f45847d != null) {
                    b.this.c();
                    com.bytedance.ies.dmt.ui.d.a.b((Context) b.this.f45847d, (int) C0906R.string.a7i).a();
                }
            }
        });
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45844a, false, 42364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45844a, false, 42364, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.video.b.c(this.o);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45844a, false, 42365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45844a, false, 42365, new Class[0], Void.TYPE);
            return;
        }
        if (this.f45849f != null) {
            try {
                this.f45849f.dismiss();
            } catch (Exception unused) {
            }
            this.f45849f = null;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f45844a, false, 42370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45844a, false, 42370, new Class[0], Void.TYPE);
            return;
        }
        this.f45846c = 100;
        com.ss.android.b.a.a.a.b(this.t);
        b();
        c();
        a(f());
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f45844a, false, 42366, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45844a, false, 42366, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.video.b.h()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f45847d, (int) C0906R.string.c1x).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.b.i() >= 5242880) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.c((Context) this.f45847d, (int) C0906R.string.c1y).a();
            return false;
        }
    }

    @NonNull
    private String f() {
        if (PatchProxy.isSupport(new Object[0], this, f45844a, false, 42371, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f45844a, false, 42371, new Class[0], String.class);
        }
        String str = this.f45845b;
        return new File(str, this.h + ".png").getPath();
    }

    public b(Activity activity) {
        this.f45847d = activity;
        this.f45845b = com.ss.android.ugc.aweme.am.a.a(activity);
        this.f45848e = "";
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45844a, false, 42372, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45844a, false, 42372, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!this.s) {
            com.bytedance.ies.dmt.ui.d.a.a((Context) this.f45847d, (int) C0906R.string.c1f).a();
        }
        b(str);
        if (this.i != null) {
            this.i.a(str);
        }
    }

    private void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45844a, false, 42375, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45844a, false, 42375, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            this.f45847d.sendBroadcast(intent);
        }
    }

    public final void onError(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f45844a, false, 42373, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f45844a, false, 42373, new Class[]{c.class}, Void.TYPE);
        } else if (this.f45847d != null) {
            if (this.l < 3) {
                this.l++;
                com.ss.android.ugc.aweme.app.application.initialization.a.a(new e.a().a(this.q).b(this.o).a(), (d) this);
                return;
            }
            a();
        }
    }

    public final void onDownloadSuccess(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45844a, false, 42368, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45844a, false, 42368, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (str != null) {
            this.o = str;
            if (str.length() == 0) {
                a();
            } else if (com.ss.android.ugc.aweme.d.a.a(this.n) || !c.a(this.n, false)) {
                com.ss.android.ugc.aweme.video.b.c(this.o, f());
                d();
            } else {
                String str2 = this.o;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f45844a, false, 42369, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f45844a, false, 42369, new Class[]{String.class}, Void.TYPE);
                } else {
                    IPhotoProcessService photoProcessService = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoProcessService();
                    if (photoProcessService == null || !c.a(this.n, false)) {
                        a();
                        return;
                    }
                    photoProcessService.photoAddWaterMarker(BitmapUtils.decodeBitmap(new File(str2)), new IPhotoProcessService.IPhotoServiceListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45856a;

                        public final void onSaved(int i, @Nullable PhotoContext photoContext) {
                        }

                        public final void onWaterMakerAdded(Bitmap bitmap) {
                            if (PatchProxy.isSupport(new Object[]{bitmap}, this, f45856a, false, 42379, new Class[]{Bitmap.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bitmap}, this, f45856a, false, 42379, new Class[]{Bitmap.class}, Void.TYPE);
                                return;
                            }
                            String str = b.this.f45845b;
                            if (BitmapUtils.saveBitmapToSD(bitmap, str, b.this.h + ".png")) {
                                b.this.d();
                            } else {
                                b.this.a();
                            }
                        }
                    });
                }
            }
        }
    }

    public final void a(Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{aweme, str}, this, f45844a, false, 42361, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str}, this, f45844a, false, 42361, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        this.r = str;
        a(aweme, false);
    }

    public final void a(Aweme aweme, boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, this, f45844a, false, 42362, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, this, f45844a, false, 42362, new Class[]{Aweme.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n = aweme;
        this.s = z;
        if (aweme != null && aweme.getImageInfos() != null && !aweme.getImageInfos().isEmpty() && aweme.getAuthor() != null && e() && NetworkUtils.isNetworkAvailable(this.f45847d) && c.a((Context) this.f45847d, aweme)) {
            UrlModel labelLarge = this.n.getImageInfos().get(0).getLabelLarge();
            if (labelLarge.getUrlList() != null && !labelLarge.getUrlList().isEmpty()) {
                this.q = labelLarge.getUrlList().get(0);
                this.h = DigestUtils.md5Hex(this.q);
                String f2 = f();
                if (com.ss.android.ugc.aweme.video.b.b(f2)) {
                    a(f2);
                    return;
                }
                if (this.f45849f == null) {
                    if (z) {
                        i2 = C0906R.string.b0t;
                    } else {
                        i2 = C0906R.string.a7v;
                    }
                    this.f45849f = com.ss.android.ugc.aweme.shortvideo.view.d.b(this.f45847d, this.f45847d.getResources().getString(i2));
                    this.f45849f.setIndeterminate(false);
                }
                this.f45849f.setProgress(0);
                this.o = k + this.h + ".temp";
                if (!com.ss.android.ugc.aweme.video.b.b(this.o)) {
                    com.ss.android.ugc.aweme.video.b.a(this.o, true);
                }
                com.ss.android.ugc.aweme.app.application.initialization.a.a(new e.a().a(this.q).b(this.o).a(), (d) this);
                this.g = 0;
                this.p.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45850a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f45850a, false, 42376, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f45850a, false, 42376, new Class[0], Void.TYPE);
                            return;
                        }
                        if (b.this.g == 0) {
                            b.this.a();
                        }
                    }
                }, 60000);
            }
        }
    }

    public final void onDownloadProgress(int i2, long j2, long j3) {
        int i3 = i2;
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f45844a, false, 42367, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f45844a, false, 42367, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f45847d != null) {
            this.g = i3;
            this.f45846c = (i3 * 99) / this.m;
            com.ss.android.b.a.a.a.b(this.t);
        }
    }
}
