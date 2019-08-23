package com.ss.android.ugc.aweme.livewallpaper;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.livewallpaper.a;
import com.ss.android.ugc.aweme.livewallpaper.c.d;
import com.ss.android.ugc.aweme.video.b;
import java.util.ArrayList;
import java.util.Iterator;

public class AmeLiveWallpaper extends WallpaperService implements a.C0619a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53540a;

    /* renamed from: b  reason: collision with root package name */
    public static String f53541b;

    /* renamed from: c  reason: collision with root package name */
    public int f53542c;

    /* renamed from: d  reason: collision with root package name */
    public int f53543d;

    /* renamed from: e  reason: collision with root package name */
    public String f53544e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<a> f53545f = new ArrayList<>();
    private ContentResolver g;
    private d h;

    class a extends WallpaperService.Engine {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53546a;

        /* renamed from: b  reason: collision with root package name */
        a f53547b;

        public final Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
            return null;
        }

        private a() {
            super(AmeLiveWallpaper.this);
            this.f53547b = new a(AmeLiveWallpaper.this);
        }

        public final void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f53546a, false, 55994, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f53546a, false, 55994, new Class[]{SurfaceHolder.class}, Void.TYPE);
                return;
            }
            super.onSurfaceCreated(surfaceHolder);
            AmeLiveWallpaper.this.a(false);
            AmeLiveWallpaper.this.b(false);
            if (b.b(AmeLiveWallpaper.f53541b)) {
                this.f53547b.a(surfaceHolder, AmeLiveWallpaper.f53541b, AmeLiveWallpaper.this.f53542c, AmeLiveWallpaper.this.f53543d, true);
            }
        }

        public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f53546a, false, 55995, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f53546a, false, 55995, new Class[]{SurfaceHolder.class}, Void.TYPE);
                return;
            }
            super.onSurfaceDestroyed(surfaceHolder);
            this.f53547b.a(surfaceHolder);
            AmeLiveWallpaper.this.f53545f.remove(this);
        }

        public final void onVisibilityChanged(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53546a, false, 55992, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53546a, false, 55992, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.onVisibilityChanged(z);
            a aVar = this.f53547b;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, aVar, a.f53558a, false, 56006, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, aVar2, a.f53558a, false, 56006, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (aVar.f53559b != null) {
                if (z && !aVar.f53559b.isPlaying()) {
                    aVar.f53559b.start();
                } else if (!z && aVar.f53559b.isPlaying()) {
                    aVar.f53559b.pause();
                }
            }
        }

        /* synthetic */ a(AmeLiveWallpaper ameLiveWallpaper, byte b2) {
            this();
        }

        public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            SurfaceHolder surfaceHolder2 = surfaceHolder;
            if (PatchProxy.isSupport(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53546a, false, 55993, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{surfaceHolder2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53546a, false, 55993, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f53547b.a(surfaceHolder2, i, i2, i3);
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f53540a, false, 55982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53540a, false, 55982, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g = getContentResolver();
        this.h = (d) c.a(k.a(), d.class);
    }

    public WallpaperService.Engine onCreateEngine() {
        if (PatchProxy.isSupport(new Object[0], this, f53540a, false, 55984, new Class[0], WallpaperService.Engine.class)) {
            return (WallpaperService.Engine) PatchProxy.accessDispatch(new Object[0], this, f53540a, false, 55984, new Class[0], WallpaperService.Engine.class);
        }
        a aVar = new a(this, (byte) 0);
        this.f53545f.add(aVar);
        return aVar;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53540a, false, 55983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53540a, false, 55983, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53540a, false, 55989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53540a, false, 55989, new Class[0], Void.TYPE);
            return;
        }
        Iterator<a> it2 = this.f53545f.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (PatchProxy.isSupport(new Object[0], next, a.f53546a, false, 55996, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], next, a.f53546a, false, 55996, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(AmeLiveWallpaper.this.f53544e)) {
                next.f53547b.f53560c = AmeLiveWallpaper.this.f53544e;
                next.f53547b.a(f53541b, AmeLiveWallpaper.this.f53542c, AmeLiveWallpaper.this.f53543d, true);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:10|(4:12|13|14|15)|16|17|(1:19)|20|(1:22)|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[Catch:{ Exception -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075 A[Catch:{ Exception -> 0x007e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f53540a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 55987(0xdab3, float:7.8454E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f53540a
            r3 = 0
            r4 = 55987(0xdab3, float:7.8454E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            if (r10 == 0) goto L_0x0045
            int r0 = r9.f53542c
            if (r0 <= 0) goto L_0x0045
            int r0 = r9.f53543d
            if (r0 <= 0) goto L_0x0045
            return
        L_0x0045:
            android.content.ContentResolver r0 = r9.g
            if (r0 == 0) goto L_0x0065
            android.content.ContentResolver r0 = r9.g     // Catch:{ NumberFormatException -> 0x0057 }
            android.net.Uri r1 = com.ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.f53551c     // Catch:{ NumberFormatException -> 0x0057 }
            java.lang.String r0 = r0.getType(r1)     // Catch:{ NumberFormatException -> 0x0057 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0057 }
            r9.f53542c = r0     // Catch:{ NumberFormatException -> 0x0057 }
        L_0x0057:
            android.content.ContentResolver r0 = r9.g     // Catch:{ NumberFormatException -> 0x0065 }
            android.net.Uri r1 = com.ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.f53552d     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r0 = r0.getType(r1)     // Catch:{ NumberFormatException -> 0x0065 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0065 }
            r9.f53543d = r0     // Catch:{ NumberFormatException -> 0x0065 }
        L_0x0065:
            int r0 = r9.f53542c     // Catch:{ Exception -> 0x007e }
            if (r0 > 0) goto L_0x0071
            com.ss.android.ugc.aweme.livewallpaper.c.d r0 = r9.h     // Catch:{ Exception -> 0x007e }
            int r0 = r0.a((int) r8)     // Catch:{ Exception -> 0x007e }
            r9.f53542c = r0     // Catch:{ Exception -> 0x007e }
        L_0x0071:
            int r0 = r9.f53543d     // Catch:{ Exception -> 0x007e }
            if (r0 > 0) goto L_0x007d
            com.ss.android.ugc.aweme.livewallpaper.c.d r0 = r9.h     // Catch:{ Exception -> 0x007e }
            int r0 = r0.c((int) r8)     // Catch:{ Exception -> 0x007e }
            r9.f53543d = r0     // Catch:{ Exception -> 0x007e }
        L_0x007d:
            return
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper.b(boolean):void");
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53540a, false, 55986, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53540a, false, 55986, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z || !b.b(f53541b)) {
            if (this.g != null) {
                f53541b = this.g.getType(WallPaperDataProvider.f53550b);
            }
            if (TextUtils.isEmpty(f53541b)) {
                f53541b = this.h.c("");
            }
            if (!b.b(f53541b) && this.g != null) {
                f53541b = this.g.getType(WallPaperDataProvider.f53553e);
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53540a, false, 55985, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53540a, false, 55985, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (intent2 != null) {
            String stringExtra = intent.getStringExtra("video_path");
            if (!TextUtils.isEmpty(stringExtra)) {
                f53541b = stringExtra;
            }
            this.f53542c = intent.getIntExtra("video_width", 0);
            this.f53543d = intent.getIntExtra("video_height", 0);
            this.f53544e = intent.getStringExtra("source");
        }
        a(true);
        b(true);
        if (PatchProxy.isSupport(new Object[0], this, f53540a, false, 55988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53540a, false, 55988, new Class[0], Void.TYPE);
        } else if (TextUtils.isEmpty(this.f53544e)) {
            if (this.g != null) {
                this.f53544e = this.g.getType(WallPaperDataProvider.g);
            }
            if (TextUtils.isEmpty(this.f53544e)) {
                this.f53544e = this.h.e("");
            }
        }
        a();
        return super.onStartCommand(intent, i, i2);
    }

    public final void a(boolean z, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3, str4}, this, f53540a, false, 55991, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, str4}, this, f53540a, false, 55991, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z), str3, str4}, this, f53540a, false, 55990, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, str4}, this, f53540a, false, 55990, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("result", Boolean.valueOf(z));
            contentValues.put("source", str3);
            contentValues.put("message", str4);
            try {
                this.g.insert(WallPaperDataProvider.f53554f, contentValues);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.util.c.a("LiveWallPaper insert failed " + e2.getMessage());
            }
        }
    }
}
