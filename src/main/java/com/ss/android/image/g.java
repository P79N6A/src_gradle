package com.ss.android.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.c;
import com.ss.android.common.util.h;
import com.ss.android.download.a.d;
import com.ss.android.download.a.e;
import com.ss.android.download.a.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;

public class g implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    static final Bitmap f29238a = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);

    /* renamed from: b  reason: collision with root package name */
    final Object f29239b;

    /* renamed from: c  reason: collision with root package name */
    final LinkedList<b> f29240c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<ImageView, Object> f29241d;

    /* renamed from: e  reason: collision with root package name */
    public d<String, Bitmap> f29242e;

    /* renamed from: f  reason: collision with root package name */
    public e<String, Bitmap> f29243f;
    g.a<String, f, Boolean, ImageView, a> g;
    public com.ss.android.download.a.g<String, f, Boolean, ImageView, a> h;
    final boolean i;
    protected final int j;
    final int k;
    final int l;
    final c<String> m;
    final WeakHandler n;
    final Context o;
    public final h p;
    final b q;
    final Resources r;
    k s;
    public boolean t;
    boolean u;
    public boolean v;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f29252a = true;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f29253b;

        public a(Bitmap bitmap) {
            this.f29253b = bitmap;
        }
    }

    static class b extends Drawable {

        /* renamed from: a  reason: collision with root package name */
        final Drawable f29254a;

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final int getIntrinsicHeight() {
            if (this.f29254a != null) {
                return this.f29254a.getIntrinsicHeight();
            }
            return 0;
        }

        public final int getIntrinsicWidth() {
            if (this.f29254a != null) {
                return this.f29254a.getIntrinsicWidth();
            }
            return 0;
        }

        public b(Drawable drawable) {
            this.f29254a = drawable;
        }

        /* access modifiers changed from: protected */
        public final boolean onLevelChange(int i) {
            if (this.f29254a == null) {
                return false;
            }
            this.f29254a.setLevel(i);
            invalidateSelf();
            return true;
        }

        public final void draw(Canvas canvas) {
            if (this.f29254a != null && this.f29254a.getLevel() > 0) {
                this.f29254a.draw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        public final void onBoundsChange(Rect rect) {
            if (this.f29254a != null) {
                int intrinsicWidth = this.f29254a.getIntrinsicWidth();
                int intrinsicHeight = this.f29254a.getIntrinsicHeight();
                int width = rect.width();
                int height = rect.height();
                if (width > 0 && height > 0 && intrinsicWidth > 0 && intrinsicHeight > 0) {
                    int i = rect.left + ((width - intrinsicWidth) / 2);
                    int i2 = rect.top + ((height - intrinsicHeight) / 2);
                    this.f29254a.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
                }
            }
        }
    }

    public final void a() {
        this.t = true;
        this.u = true;
        this.h.d();
    }

    public final void b() {
        this.u = false;
        this.h.c();
        this.f29243f.a(8);
    }

    public final void a(ImageView imageView) {
        if (imageView != null) {
            this.f29241d.remove(imageView);
            if (this.l > 0) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof b) {
                    this.f29240c.add((b) drawable);
                    imageView.setImageDrawable(null);
                }
            }
        }
    }

    public void handleMsg(Message message) {
        if (this.t && message.what == 100) {
            String str = null;
            if (message.obj instanceof String) {
                str = (String) message.obj;
            }
            if (!StringUtils.isEmpty(str)) {
                int i2 = message.arg1;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 > 99) {
                    i2 = 99;
                }
                int i3 = i2 * 100;
                for (ImageView next : this.f29241d.keySet()) {
                    if (next != null && str.equals(next.getTag())) {
                        Drawable drawable = next.getDrawable();
                        if (drawable instanceof b) {
                            drawable.setLevel(i3);
                        }
                    }
                }
            }
        }
    }

    public final void a(ImageView imageView, String str, String str2) {
        a(imageView, new f(str, null), false);
    }

    public final void a(ImageView imageView, f fVar, boolean z) {
        String str;
        if (this.t && imageView != null) {
            a(imageView);
            b bVar = null;
            if (fVar != null) {
                str = fVar.mKey;
            } else {
                str = null;
            }
            imageView.setTag(str);
            Drawable background = imageView.getBackground();
            if (str == null) {
                if (background != null) {
                    background.setLevel(1);
                }
                return;
            }
            Bitmap bitmap = (Bitmap) this.f29243f.a(str);
            if (bitmap == null && this.f29242e != null) {
                bitmap = (Bitmap) this.f29242e.a(str);
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                if (background != null) {
                    background.setLevel(2);
                }
                return;
            }
            if (background != null) {
                background.setLevel(0);
            }
            if (this.l > 0) {
                if (!this.f29240c.isEmpty()) {
                    bVar = this.f29240c.removeLast();
                }
                if (bVar == null) {
                    bVar = new b(com.ss.android.ugc.bytex.a.a.a.a(this.r, this.l));
                }
                imageView.setImageDrawable(bVar);
                bVar.setLevel(0);
            }
            this.f29241d.put(imageView, this.f29239b);
            this.h.a(str, fVar, Boolean.FALSE, imageView);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011a A[Catch:{ Throwable -> 0x0187 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011b A[Catch:{ Throwable -> 0x0187 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.image.g.a a(java.lang.String r28, com.ss.android.image.f r29, boolean r30) {
        /*
            r27 = this;
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = 0
            com.ss.android.image.b r0 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r0 = r0.d(r14)     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.b r1 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = r1.f(r14)     // Catch:{ Throwable -> 0x0187 }
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0187 }
            r12.<init>(r0)     // Catch:{ Throwable -> 0x0187 }
            java.lang.StringBuffer r11 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0187 }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x0187 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x0187 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0187 }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0187 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0187 }
            boolean r1 = r2.isFile()     // Catch:{ Throwable -> 0x0187 }
            r10 = 1
            r9 = 0
            if (r1 != 0) goto L_0x0039
            boolean r0 = r0.isFile()     // Catch:{ Throwable -> 0x0187 }
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            android.content.Context r1 = r13.o     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.common.util.NetworkUtils$h r1 = com.ss.android.common.util.NetworkUtils.getNetworkType(r1)     // Catch:{ Throwable -> 0x0187 }
            if (r0 != 0) goto L_0x0054
            if (r30 != 0) goto L_0x004e
            com.ss.android.common.util.NetworkUtils$h r2 = com.ss.android.common.util.NetworkUtils.h.WIFI     // Catch:{ Throwable -> 0x0187 }
            if (r1 == r2) goto L_0x004e
            com.ss.android.image.k r2 = r13.s     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.k r3 = com.ss.android.image.k.ALWAYS     // Catch:{ Throwable -> 0x0187 }
            if (r2 != r3) goto L_0x0054
        L_0x004e:
            com.ss.android.common.util.NetworkUtils$h r2 = com.ss.android.common.util.NetworkUtils.h.NONE     // Catch:{ Throwable -> 0x0187 }
            if (r1 == r2) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r0 != 0) goto L_0x010b
            if (r1 == 0) goto L_0x010b
            com.ss.android.image.b r0 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r4 = r0.b(r14)     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.b r0 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r5 = r0.e(r14)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r6 = com.ss.android.image.b.c(r28)     // Catch:{ Throwable -> 0x0187 }
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0187 }
            r8.<init>(r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0187 }
            r7.<init>(r5)     // Catch:{ Throwable -> 0x0187 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0187 }
            r3.<init>(r6)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r2 = r29.getExtraKey()     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.b r0 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r17 = r0.d(r2)     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.b r0 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r18 = r0.f(r2)     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.b r0 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r19 = r0.b(r2)     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.b r0 = r13.q     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r20 = r0.e(r2)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r21 = com.ss.android.image.b.c(r2)     // Catch:{ Throwable -> 0x0187 }
            boolean r0 = r13.v     // Catch:{ Throwable -> 0x0187 }
            if (r0 == 0) goto L_0x00a1
            com.ss.android.common.util.c<java.lang.String> r0 = r13.m     // Catch:{ Throwable -> 0x0187 }
            r22 = r0
            goto L_0x00a3
        L_0x00a1:
            r22 = r16
        L_0x00a3:
            boolean r0 = r15.mIsVideo     // Catch:{ Throwable -> 0x0187 }
            if (r0 == 0) goto L_0x00f3
            android.content.Context r6 = r13.o     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r5 = r15.mUri     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r4 = r15.mUrlList     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.common.util.h r1 = r13.p     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.g$3 r23 = new com.ss.android.image.g$3     // Catch:{ Throwable -> 0x0187 }
            r0 = r23
            r24 = r1
            r1 = r27
            r25 = r3
            r3 = r8
            r14 = r4
            r4 = r19
            r15 = r5
            r5 = r7
            r19 = r6
            r6 = r20
            r20 = r7
            r7 = r25
            r26 = r8
            r8 = r21
            r9 = r12
            r10 = r17
            r17 = r11
            r21 = r12
            r12 = r18
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Throwable -> 0x0187 }
            java.util.List r2 = com.ss.android.image.f.extractImageUrlList(r15, r14)     // Catch:{ Throwable -> 0x0187 }
            r1 = -1
            r0 = r19
            r3 = r26
            r4 = r20
            r5 = r25
            r6 = r22
            r7 = r28
            r8 = r24
            r9 = r23
            boolean r0 = com.ss.android.image.d.a((android.content.Context) r0, (int) r1, (java.util.List<com.ss.android.image.i>) r2, (java.lang.StringBuffer) r3, (java.lang.StringBuffer) r4, (java.lang.StringBuffer) r5, (com.ss.android.common.util.c<java.lang.String>) r6, (java.lang.String) r7, (com.ss.android.common.util.h) r8, (org.apache.http.client.RedirectHandler) r9)     // Catch:{ Throwable -> 0x0187 }
            r10 = r29
            goto L_0x0110
        L_0x00f3:
            r17 = r11
            r21 = r12
            android.content.Context r0 = r13.o     // Catch:{ Throwable -> 0x0187 }
            r1 = -1
            r10 = r29
            java.lang.String r2 = r10.mUri     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r3 = r10.mUrlList     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.common.util.h r9 = r13.p     // Catch:{ Throwable -> 0x0187 }
            r7 = r22
            r8 = r28
            boolean r0 = com.ss.android.image.d.a((android.content.Context) r0, (int) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (com.ss.android.common.util.c<java.lang.String>) r7, (java.lang.String) r8, (com.ss.android.common.util.h) r9)     // Catch:{ Throwable -> 0x0187 }
            goto L_0x0110
        L_0x010b:
            r17 = r11
            r21 = r12
            r10 = r15
        L_0x0110:
            java.lang.String r1 = r21.toString()     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r2 = r17.toString()     // Catch:{ Throwable -> 0x0187 }
            if (r0 != 0) goto L_0x011b
            return r16
        L_0x011b:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0187 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0187 }
            boolean r3 = r0.isFile()     // Catch:{ Throwable -> 0x0187 }
            if (r3 != 0) goto L_0x012c
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0187 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0187 }
            r1 = r2
        L_0x012c:
            boolean r0 = r0.isFile()     // Catch:{ Throwable -> 0x0187 }
            if (r0 != 0) goto L_0x0133
            return r16
        L_0x0133:
            int r0 = r13.j     // Catch:{ Throwable -> 0x0187 }
            int r2 = r13.k     // Catch:{ Throwable -> 0x0187 }
            if (r10 == 0) goto L_0x0143
            boolean r3 = r29.isFixedDisplaySize()     // Catch:{ Throwable -> 0x0187 }
            if (r3 == 0) goto L_0x0143
            int r0 = r10.mWidth     // Catch:{ Throwable -> 0x0187 }
            int r2 = r10.mHeight     // Catch:{ Throwable -> 0x0187 }
        L_0x0143:
            boolean r3 = r13.i     // Catch:{ Throwable -> 0x0187 }
            boolean r4 = r10.mNeedAlpha     // Catch:{ Throwable -> 0x0187 }
            android.graphics.Bitmap r0 = a(r3, r0, r2, r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0187 }
            r1.<init>()     // Catch:{ Throwable -> 0x0187 }
            boolean r2 = r10.mNeedAlpha     // Catch:{ Throwable -> 0x0187 }
            if (r2 == 0) goto L_0x0157
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Throwable -> 0x0187 }
            goto L_0x0159
        L_0x0157:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Throwable -> 0x0187 }
        L_0x0159:
            r3 = 80
            r0.compress(r2, r3, r1)     // Catch:{ Throwable -> 0x0187 }
            r0.recycle()     // Catch:{ Throwable -> 0x0187 }
            byte[] r0 = r1.toByteArray()     // Catch:{ Throwable -> 0x0187 }
            r1.close()     // Catch:{ Throwable -> 0x0187 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Throwable -> 0x0187 }
            r1.<init>()     // Catch:{ Throwable -> 0x0187 }
            r2 = 1
            r1.inPurgeable = r2     // Catch:{ Throwable -> 0x0187 }
            boolean r2 = r10.mNeedAlpha     // Catch:{ Throwable -> 0x0187 }
            if (r2 == 0) goto L_0x0177
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Throwable -> 0x0187 }
            goto L_0x0179
        L_0x0177:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Throwable -> 0x0187 }
        L_0x0179:
            r1.inPreferredConfig = r2     // Catch:{ Throwable -> 0x0187 }
            int r2 = r0.length     // Catch:{ Throwable -> 0x0187 }
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r2, r1)     // Catch:{ Throwable -> 0x0187 }
            com.ss.android.image.g$a r1 = new com.ss.android.image.g$a     // Catch:{ Throwable -> 0x0187 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0187 }
            return r1
        L_0x0187:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.image.g.a(java.lang.String, com.ss.android.image.f, boolean):com.ss.android.image.g$a");
    }

    private static Bitmap a(boolean z, int i2, int i3, String str, boolean z2) {
        Bitmap bitmap;
        Bitmap.Config config;
        Bitmap createBitmap;
        if (!z) {
            if (z2) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = null;
            }
            bitmap = BitmapUtils.getBitmapFromSD(str, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, i3, config);
            if (i2 <= 0 || bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f2 = (float) i3;
            float f3 = (float) height;
            if (((int) (((f2 * 1.0f) * ((float) width)) / f3)) > i2) {
                int i4 = (int) (((f3 * 1.0f) * ((float) i2)) / f2);
                createBitmap = Bitmap.createBitmap(bitmap, (width - i4) / 2, 0, i4, height);
            }
            return bitmap;
        } else if (i3 <= 0) {
            try {
                return BitmapUtils.loadBitmap(i2, str, z2);
            } catch (Exception unused) {
                bitmap = null;
            }
        } else {
            bitmap = BitmapUtils.getBitmapFromSD(str, i2, z2);
            if (bitmap == null) {
                return null;
            }
            try {
                int width2 = bitmap.getWidth();
                float f4 = (float) i2;
                float f5 = (float) width2;
                if (((int) (((f4 * 1.0f) * ((float) bitmap.getHeight())) / f5)) > i3) {
                    createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, (int) (((f5 * 1.0f) * ((float) i3)) / f4));
                }
            } catch (Exception unused2) {
            }
            return bitmap;
        }
        bitmap = createBitmap;
        return bitmap;
    }

    public g(Context context, h hVar, int i2, int i3, int i4, b bVar, int i5, int i6) {
        this(context, hVar, 4, 8, 1, bVar, i5, i6, 0, true);
    }

    public g(Context context, h hVar, int i2, int i3, int i4, b bVar, int i5, int i6, int i7) {
        this(context, hVar, 4, 4, 4, bVar, i5, i6, 2130838334, true);
    }

    private g(Context context, h hVar, int i2, int i3, int i4, b bVar, int i5, int i6, int i7, boolean z) {
        this.f29239b = new Object();
        this.f29240c = new LinkedList<>();
        this.f29241d = new WeakHashMap<>();
        this.f29242e = null;
        this.n = new WeakHandler(Looper.getMainLooper(), this);
        this.o = context.getApplicationContext();
        this.r = this.o.getResources();
        this.j = i5;
        this.k = i6;
        this.p = hVar;
        this.q = bVar;
        this.s = k.ALWAYS;
        this.l = i7;
        this.i = true;
        if (this.j > 0) {
            this.m = new c<String>() {
                public final /* synthetic */ void a(int i, Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        Message obtainMessage = g.this.n.obtainMessage(100);
                        obtainMessage.arg1 = i;
                        obtainMessage.obj = str;
                        g.this.n.sendMessage(obtainMessage);
                    }
                }
            };
            this.f29243f = new e<>(i2);
            this.g = new g.a<String, f, Boolean, ImageView, a>() {
                public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
                    return g.this.a((String) obj, (f) obj2, ((Boolean) obj3).booleanValue());
                }

                public final /* synthetic */ void a(Object obj, Object obj2, Object obj3, Collection collection, Object obj4) {
                    Bitmap bitmap;
                    String str = (String) obj;
                    f fVar = (f) obj2;
                    a aVar = (a) obj4;
                    g gVar = g.this;
                    if (gVar.t && str != null && collection != null) {
                        if (aVar != null) {
                            bitmap = aVar.f29253b;
                        } else {
                            bitmap = null;
                        }
                        boolean z = false;
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            ImageView imageView = (ImageView) it2.next();
                            if (str.equals(imageView.getTag())) {
                                Drawable background = imageView.getBackground();
                                gVar.a(imageView);
                                if (bitmap != null) {
                                    imageView.setImageBitmap(bitmap);
                                    if (background != null) {
                                        background.setLevel(2);
                                    }
                                } else {
                                    imageView.setImageDrawable(null);
                                    if (background != null) {
                                        background.setLevel(1);
                                    }
                                }
                                if (bitmap != null) {
                                    imageView.setImageBitmap(bitmap);
                                }
                                gVar.f29241d.remove(imageView);
                                z = true;
                            }
                        }
                        if (z && bitmap != null) {
                            gVar.f29243f.a(str, bitmap);
                            if (gVar.f29242e != null) {
                                gVar.f29242e.a(str, bitmap);
                            }
                        }
                    }
                }
            };
            this.h = new com.ss.android.download.a.g<>(i3, i4, this.g);
            this.t = true;
            this.u = true;
            return;
        }
        throw new IllegalArgumentException("fitWidth but maxWidth is not positive");
    }
}
