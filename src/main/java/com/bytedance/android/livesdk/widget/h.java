package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.WeakHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18473a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<Bitmap> f18474b;

    /* renamed from: c  reason: collision with root package name */
    public static WeakReference<Bitmap> f18475c;

    /* renamed from: d  reason: collision with root package name */
    private static TypedArray f18476d = ac.a().obtainTypedArray(C0906R.array.ab);

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<a, Bitmap> f18477e = new WeakHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static Random f18478f = new Random();

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18479a;

        /* renamed from: b  reason: collision with root package name */
        public int f18480b;

        /* renamed from: c  reason: collision with root package name */
        public int f18481c;

        /* renamed from: d  reason: collision with root package name */
        public int f18482d = -1;

        public final int hashCode() {
            return ((((((this.f18479a + 629) * 37) + this.f18480b) * 37) + this.f18481c) * 37) + this.f18482d;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f18480b == aVar.f18480b && this.f18481c == aVar.f18481c && this.f18479a == aVar.f18479a && this.f18482d == aVar.f18482d) {
                return true;
            }
            return false;
        }

        a(int i, int i2, int i3, int i4) {
            this.f18480b = i2;
            this.f18481c = i3;
            this.f18479a = i;
        }
    }

    public static Bitmap a(Context context, String str) {
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str}, null, f18473a, true, 14403, new Class[]{Context.class, String.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{context2, str}, null, f18473a, true, 14403, new Class[]{Context.class, String.class}, Bitmap.class);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0906R.dimen.p2);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0906R.dimen.p1);
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.valueOf(str).intValue();
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(6, "HeartView", e2.getStackTrace());
                i = f18478f.nextInt(f18476d.length());
            }
        } else {
            i = f18478f.nextInt(f18476d.length());
            com.bytedance.android.live.core.c.a.a("HeartView", "digg index is null, get random index!");
        }
        if (i < 0) {
            com.bytedance.android.live.core.c.a.c("HeartView", "the index from remote is negative number!");
            i = f18478f.nextInt(f18476d.length());
        }
        if (f18476d.length() <= 0) {
            return null;
        }
        TypedArray typedArray = f18476d;
        return z.a(context2, typedArray.getResourceId(i % typedArray.length(), 0), dimensionPixelSize, dimensionPixelSize2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(android.content.Context r23, int r24, int r25, int r26) {
        /*
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r23
            java.lang.Integer r6 = java.lang.Integer.valueOf(r24)
            r13 = 1
            r5[r13] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r14 = 2
            r5[r14] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            r15 = 3
            r5[r15] = r6
            com.meituan.robust.ChangeQuickRedirect r7 = f18473a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r14] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r15] = r6
            java.lang.Class<android.graphics.Bitmap> r11 = android.graphics.Bitmap.class
            r6 = 0
            r8 = 1
            r9 = 14401(0x3841, float:2.018E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x007e
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r5[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r5[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r5[r15] = r0
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f18473a
            r19 = 1
            r20 = 14401(0x3841, float:2.018E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r15] = r1
            java.lang.Class<android.graphics.Bitmap> r22 = android.graphics.Bitmap.class
            r16 = r5
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L_0x007e:
            com.bytedance.android.livesdk.widget.h$a r4 = new com.bytedance.android.livesdk.widget.h$a
            r5 = -1
            r4.<init>(r1, r2, r3, r5)
            java.util.WeakHashMap<com.bytedance.android.livesdk.widget.h$a, android.graphics.Bitmap> r5 = f18477e
            java.lang.Object r5 = r5.get(r4)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L_0x0095
            boolean r6 = r5.isRecycled()
            if (r6 != 0) goto L_0x0095
            return r5
        L_0x0095:
            android.content.res.Resources r0 = r23.getResources()
            java.lang.ref.WeakReference<android.graphics.Bitmap> r5 = f18474b
            r6 = 0
            if (r5 == 0) goto L_0x00bd
            java.lang.ref.WeakReference<android.graphics.Bitmap> r5 = f18474b
            java.lang.Object r5 = r5.get()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L_0x00bb
            int r7 = r5.getWidth()
            if (r7 != r2) goto L_0x00b4
            int r7 = r5.getHeight()
            if (r7 == r3) goto L_0x00bb
        L_0x00b4:
            boolean r7 = r5.isRecycled()
            if (r7 != 0) goto L_0x00bb
            goto L_0x00be
        L_0x00bb:
            f18474b = r6
        L_0x00bd:
            r5 = r6
        L_0x00be:
            if (r5 != 0) goto L_0x00d5
            r5 = 2130841193(0x7f020e69, float:1.7287446E38)
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeResource(r0, r5)
            if (r5 != 0) goto L_0x00ca
            return r6
        L_0x00ca:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = f18474b
            if (r0 != 0) goto L_0x00d5
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            f18474b = r0
        L_0x00d5:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r5, r2, r3, r12)
            if (r0 != 0) goto L_0x00dc
            return r6
        L_0x00dc:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>()
            r2.setBitmap(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r15)
            android.graphics.PorterDuffColorFilter r6 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r6.<init>(r1, r7)
            r3.setColorFilter(r6)
            r1 = 0
            r2.drawBitmap(r0, r1, r1, r3)
            java.util.WeakHashMap<com.bytedance.android.livesdk.widget.h$a, android.graphics.Bitmap> r1 = f18477e
            r1.put(r4, r0)
            boolean r1 = r5.isRecycled()
            if (r1 != 0) goto L_0x0105
            r5.recycle()
        L_0x0105:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.h.a(android.content.Context, int, int, int):android.graphics.Bitmap");
    }
}
