package com.facebook.fbui.textlayoutbuilder;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.VisibleForTesting;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.util.LruCache;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class TextLayoutBuilder {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    static final LruCache<Integer, Layout> f23755a = new LruCache<>(100);
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final b f23756b = new b();

    /* renamed from: c  reason: collision with root package name */
    public Layout f23757c = null;

    /* renamed from: d  reason: collision with root package name */
    public a f23758d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23759e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23760f = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MeasureMode {
    }

    static class a extends TextPaint {

        /* renamed from: a  reason: collision with root package name */
        private float f23761a;

        /* renamed from: b  reason: collision with root package name */
        private float f23762b;

        /* renamed from: c  reason: collision with root package name */
        private float f23763c;

        /* renamed from: d  reason: collision with root package name */
        private int f23764d;

        public a() {
        }

        public final int hashCode() {
            int i;
            Typeface typeface = getTypeface();
            int color = (((getColor() + 31) * 31) + Float.floatToIntBits(getTextSize())) * 31;
            if (typeface != null) {
                i = typeface.hashCode();
            } else {
                i = 0;
            }
            int floatToIntBits = ((((((((((color + i) * 31) + Float.floatToIntBits(this.f23761a)) * 31) + Float.floatToIntBits(this.f23762b)) * 31) + Float.floatToIntBits(this.f23763c)) * 31) + this.f23764d) * 31) + this.linkColor;
            if (this.drawableState == null) {
                return (floatToIntBits * 31) + 0;
            }
            for (int i2 : this.drawableState) {
                floatToIntBits = (floatToIntBits * 31) + i2;
            }
            return floatToIntBits;
        }

        public a(int i) {
            super(1);
        }

        public a(Paint paint) {
            super(paint);
        }

        public final void setShadowLayer(float f2, float f3, float f4, int i) {
            this.f23763c = f2;
            this.f23761a = f3;
            this.f23762b = f4;
            this.f23764d = i;
            super.setShadowLayer(f2, f3, f4, i);
        }
    }

    @VisibleForTesting
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public TextPaint f23765a = new a(1);

        /* renamed from: b  reason: collision with root package name */
        public int f23766b;

        /* renamed from: c  reason: collision with root package name */
        public int f23767c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f23768d;

        /* renamed from: e  reason: collision with root package name */
        public float f23769e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f23770f = 0.0f;
        public boolean g = true;
        public TextUtils.TruncateAt h = null;
        public boolean i = false;
        public int j = Integer.MAX_VALUE;
        public Layout.Alignment k = Layout.Alignment.ALIGN_NORMAL;
        public TextDirectionHeuristicCompat l = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        boolean m = false;

        public final void a() {
            if (this.m) {
                this.f23765a = new a((Paint) this.f23765a);
                this.m = false;
            }
        }

        b() {
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (this.f23765a != null) {
                i2 = this.f23765a.hashCode();
            } else {
                i2 = 0;
            }
            int floatToIntBits = (((((((((((i2 + 31) * 31) + this.f23766b) * 31) + this.f23767c) * 31) + Float.floatToIntBits(this.f23769e)) * 31) + Float.floatToIntBits(this.f23770f)) * 31) + (this.g ? 1 : 0)) * 31;
            if (this.h != null) {
                i3 = this.h.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (((((floatToIntBits + i3) * 31) + (this.i ? 1 : 0)) * 31) + this.j) * 31;
            if (this.k != null) {
                i4 = this.k.hashCode();
            } else {
                i4 = 0;
            }
            int i8 = (i7 + i4) * 31;
            if (this.l != null) {
                i5 = this.l.hashCode();
            } else {
                i5 = 0;
            }
            int i9 = (i8 + i5) * 31;
            if (this.f23768d != null) {
                i6 = this.f23768d.hashCode();
            }
            return i9 + i6;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x016c A[LOOP:0: B:40:0x0104->B:60:0x016c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout a() {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r1.f23759e
            if (r0 == 0) goto L_0x000d
            android.text.Layout r0 = r1.f23757c
            if (r0 == 0) goto L_0x000d
            android.text.Layout r0 = r1.f23757c
            return r0
        L_0x000d:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            java.lang.CharSequence r0 = r0.f23768d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0019
            return r2
        L_0x0019:
            r0 = -1
            boolean r3 = r1.f23759e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0043
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r3 = r1.f23756b
            java.lang.CharSequence r3 = r3.f23768d
            boolean r3 = r3 instanceof android.text.Spannable
            if (r3 == 0) goto L_0x0043
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r3 = r1.f23756b
            java.lang.CharSequence r3 = r3.f23768d
            android.text.Spannable r3 = (android.text.Spannable) r3
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r6 = r1.f23756b
            java.lang.CharSequence r6 = r6.f23768d
            int r6 = r6.length()
            int r6 = r6 - r5
            java.lang.Class<android.text.style.ClickableSpan> r7 = android.text.style.ClickableSpan.class
            java.lang.Object[] r3 = r3.getSpans(r4, r6, r7)
            android.text.style.ClickableSpan[] r3 = (android.text.style.ClickableSpan[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L_0x0043
            r4 = 1
        L_0x0043:
            boolean r3 = r1.f23759e
            if (r3 == 0) goto L_0x0060
            if (r4 != 0) goto L_0x0060
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            int r0 = r0.hashCode()
            android.support.v4.util.LruCache<java.lang.Integer, android.text.Layout> r3 = f23755a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r6)
            android.text.Layout r3 = (android.text.Layout) r3
            if (r3 == 0) goto L_0x005e
            return r3
        L_0x005e:
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = -1
        L_0x0061:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x0069
            r15 = 1
            goto L_0x006e
        L_0x0069:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            int r0 = r0.j
            r15 = r0
        L_0x006e:
            if (r15 != r5) goto L_0x007c
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            java.lang.CharSequence r0 = r0.f23768d
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            android.text.TextPaint r2 = r2.f23765a
            android.text.BoringLayout$Metrics r2 = android.text.BoringLayout.isBoring(r0, r2)
        L_0x007c:
            r22 = r2
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            int r0 = r0.f23767c
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00b8;
                case 2: goto L_0x009d;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected measure mode "
            r2.<init>(r3)
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r3 = r1.f23756b
            int r3 = r3.f23767c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x009d:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            java.lang.CharSequence r0 = r0.f23768d
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            android.text.TextPaint r2 = r2.f23765a
            float r0 = android.text.Layout.getDesiredWidth(r0, r2)
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            int r0 = (int) r6
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            int r2 = r2.f23766b
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x00cf
        L_0x00b8:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            int r0 = r0.f23766b
            goto L_0x00cf
        L_0x00bd:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            java.lang.CharSequence r0 = r0.f23768d
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            android.text.TextPaint r2 = r2.f23765a
            float r0 = android.text.Layout.getDesiredWidth(r0, r2)
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            int r0 = (int) r6
        L_0x00cf:
            r25 = r0
            if (r22 == 0) goto L_0x0104
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            java.lang.CharSequence r0 = r0.f23768d
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            android.text.TextPaint r2 = r2.f23765a
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r6 = r1.f23756b
            android.text.Layout$Alignment r6 = r6.k
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r7 = r1.f23756b
            float r7 = r7.f23769e
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r8 = r1.f23756b
            float r8 = r8.f23770f
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r9 = r1.f23756b
            boolean r9 = r9.g
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r10 = r1.f23756b
            android.text.TextUtils$TruncateAt r10 = r10.h
            r16 = r0
            r17 = r2
            r18 = r25
            r19 = r6
            r20 = r7
            r21 = r8
            r23 = r9
            r24 = r10
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x013c
        L_0x0104:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            java.lang.CharSequence r6 = r0.f23768d     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            r7 = 0
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            java.lang.CharSequence r0 = r0.f23768d     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            int r8 = r0.length()     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.text.TextPaint r9 = r0.f23765a     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.text.Layout$Alignment r11 = r0.k     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            float r12 = r0.f23769e     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            float r13 = r0.f23770f     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            boolean r14 = r0.g     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.text.TextUtils$TruncateAt r0 = r0.h     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            android.support.v4.text.TextDirectionHeuristicCompat r2 = r2.l     // Catch:{ IndexOutOfBoundsException -> 0x0161 }
            r10 = r25
            r19 = r15
            r15 = r0
            r16 = r25
            r17 = r19
            r18 = r2
            android.text.StaticLayout r0 = com.facebook.fbui.textlayoutbuilder.b.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IndexOutOfBoundsException -> 0x015f }
        L_0x013c:
            boolean r2 = r1.f23759e
            if (r2 == 0) goto L_0x014d
            if (r4 != 0) goto L_0x014d
            r1.f23757c = r0
            android.support.v4.util.LruCache<java.lang.Integer, android.text.Layout> r2 = f23755a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r0)
        L_0x014d:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            r2.m = r5
            boolean r2 = r1.f23760f
            if (r2 == 0) goto L_0x015e
            com.facebook.fbui.textlayoutbuilder.a r2 = r1.f23758d
            if (r2 == 0) goto L_0x015e
            com.facebook.fbui.textlayoutbuilder.a r2 = r1.f23758d
            r2.a(r0)
        L_0x015e:
            return r0
        L_0x015f:
            r0 = move-exception
            goto L_0x0164
        L_0x0161:
            r0 = move-exception
            r19 = r15
        L_0x0164:
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            java.lang.CharSequence r2 = r2.f23768d
            boolean r2 = r2 instanceof java.lang.String
            if (r2 != 0) goto L_0x017b
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r0 = r1.f23756b
            com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder$b r2 = r1.f23756b
            java.lang.CharSequence r2 = r2.f23768d
            java.lang.String r2 = r2.toString()
            r0.f23768d = r2
            r15 = r19
            goto L_0x0104
        L_0x017b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder.a():android.text.Layout");
    }

    public final TextLayoutBuilder a(CharSequence charSequence) {
        if (charSequence == this.f23756b.f23768d || (charSequence != null && this.f23756b.f23768d != null && charSequence.equals(this.f23756b.f23768d))) {
            return this;
        }
        this.f23756b.f23768d = charSequence;
        this.f23757c = null;
        return this;
    }
}
