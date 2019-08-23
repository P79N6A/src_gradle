package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.d;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b;

public class o extends View implements c<TextStickerData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74399a;
    private int A;
    private Vibrator B;
    private TextStickerData C;
    private long D;
    private long E;
    private PointF F = new PointF();
    private boolean G;

    /* renamed from: b  reason: collision with root package name */
    public float f74400b;

    /* renamed from: c  reason: collision with root package name */
    public float f74401c;

    /* renamed from: d  reason: collision with root package name */
    public float f74402d;

    /* renamed from: e  reason: collision with root package name */
    public float f74403e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public boolean f74404f;
    public final boolean g;
    public b h;
    public com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    private boolean n = true;
    private String[] o;
    private int p = 1;
    private int q = -1;
    private String r = "default";
    private int s = 2;
    private boolean t = true;
    private SafeHandler u;
    private int v;
    private int w;
    private int x;
    private com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a y;
    private int z;

    public interface a {
        int a(o oVar, boolean z, boolean z2);

        PointF a(o oVar, float f2, float f3);

        Float a(float f2);

        void a(o oVar);

        void a(o oVar, RectF rectF, int i, int i2, boolean z, boolean z2, boolean z3);

        void a(o oVar, boolean z);

        void b(o oVar);
    }

    public float getCenterX() {
        return this.f74400b;
    }

    public float getCenterY() {
        return this.f74401c;
    }

    public int getCurAlignTxt() {
        return this.s;
    }

    public int getCurColor() {
        return this.q;
    }

    public String getCurFontType() {
        return this.r;
    }

    public int getCurMode() {
        return this.p;
    }

    @Nullable
    public TextStickerData getData() {
        return this.C;
    }

    public float getStickerRotate() {
        return this.f74402d;
    }

    public float getStickerScale() {
        return this.f74403e;
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74399a, false, 86411, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74399a, false, 86411, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v = i2;
        this.w = i3;
        this.i.a(i2, i3);
        if (!(this.C == null || this.C.mEditCenterPoint == null)) {
            setAnimXY(this.C.mEditCenterPoint);
        }
    }

    public final void a(int i2, int i3, int i4, String str) {
        int i5 = i2;
        int i6 = i3;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, this, f74399a, false, 86428, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, this, f74399a, false, 86428, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.p = i5;
        this.q = i6;
        this.r = str2;
        d.a().f74173c = this.r;
        if (i5 == 1) {
            setTextColor(i6);
            this.f74404f = false;
        } else if (i5 == 2) {
            if (i6 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            c(i6);
            this.f74404f = true;
        } else if (i5 == 3) {
            setTextColor(-1);
            c(TextStickerEditText.a(i3));
            this.f74404f = true;
        }
        this.s = i4;
        invalidate();
    }

    public final boolean a(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86434, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return b(f2, f3 - ((float) this.w));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86434, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public RectF getDeleteRect() {
        return this.y.f74339e;
    }

    public RectF getEditRect() {
        return this.y.g;
    }

    public RectF getHelpRect() {
        return this.y.f74337c;
    }

    public RectF getRotateRect() {
        return this.y.f74340f;
    }

    public RectF getTextRect() {
        return this.y.f74336b;
    }

    public RectF getTimeRect() {
        return this.y.h;
    }

    public final boolean a() {
        return this.i.j;
    }

    private boolean j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86430, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86430, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (SystemClock.elapsedRealtime() < this.E) {
            z2 = true;
        }
        return z2;
    }

    public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a d() {
        if (!PatchProxy.isSupport(new Object[0], this, f74399a, false, 86468, new Class[0], TextStickerData.class)) {
            return h().clone();
        }
        return (TextStickerData) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86468, new Class[0], TextStickerData.class);
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86449, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86449, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.k || this.j || this.i.a()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86450, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86450, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.l || this.j || this.i.a()) {
            return true;
        } else {
            return false;
        }
    }

    public String getText() {
        if (!PatchProxy.isSupport(new Object[0], this, f74399a, false, 86417, new Class[0], String.class)) {
            return a(this.o);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86417, new Class[0], String.class);
    }

    public void invalidate() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86421, new Class[0], Void.TYPE);
            return;
        }
        super.invalidate();
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86414, new Class[0], Void.TYPE);
            return;
        }
        if (this.C != null && this.C.hasPositionData()) {
            this.n = false;
            this.f74400b = this.C.x;
            this.f74401c = this.C.y;
            this.f74402d = this.C.rotation;
            this.f74403e = this.C.scale;
        }
    }

    public final void c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86429, new Class[0], Void.TYPE);
            return;
        }
        if (this.C != null && !a() && !this.G && !j()) {
            boolean isVisibleWhen = this.C.isVisibleWhen(this.D);
            if (!isVisibleWhen) {
                i2 = 8;
            }
            v.b((View) this, i2);
            this.t = isVisibleWhen;
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86448, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86448, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.k || this.l || this.j || this.i.a() || this.i.b()) {
            return true;
        } else {
            return false;
        }
    }

    public PointF[] getAnglePointList() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86465, new Class[0], PointF[].class)) {
            return (PointF[]) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86465, new Class[0], PointF[].class);
        }
        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar = this.y;
        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86483, new Class[0], PointF[].class)) {
            return (PointF[]) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86483, new Class[0], PointF[].class);
        }
        PointF[] pointFArr = new PointF[aVar.L.size()];
        float radians = (float) Math.toRadians((double) aVar.J);
        for (int i2 = 0; i2 < pointFArr.length; i2++) {
            pointFArr[i2] = com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(aVar.L.get(i2), aVar.f74337c.centerX(), aVar.f74337c.centerY(), radians);
        }
        return pointFArr;
    }

    public PointF[] getAnglePointListForBlock() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86466, new Class[0], PointF[].class)) {
            return (PointF[]) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86466, new Class[0], PointF[].class);
        }
        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar = this.y;
        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86484, new Class[0], PointF[].class)) {
            return (PointF[]) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86484, new Class[0], PointF[].class);
        }
        PointF[] pointFArr = {new PointF(aVar.f74336b.left, aVar.f74336b.top), new PointF(aVar.f74336b.right, aVar.f74336b.top), new PointF(aVar.f74336b.right, aVar.f74336b.bottom), new PointF(aVar.f74336b.left, aVar.f74336b.bottom)};
        float radians = (float) Math.toRadians((double) aVar.J);
        for (int i2 = 0; i2 < 4; i2++) {
            pointFArr[i2] = com.ss.android.ugc.aweme.shortvideo.edit.b.a.a(pointFArr[i2], aVar.f74336b.centerX(), aVar.f74336b.centerY(), radians);
        }
        return pointFArr;
    }

    public final TextStickerData h() {
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86469, new Class[0], TextStickerData.class)) {
            return (TextStickerData) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86469, new Class[0], TextStickerData.class);
        }
        if (this.C == null) {
            TextStickerData textStickerData = new TextStickerData("", this.p, this.q, this.s, this.r);
            this.C = textStickerData;
            this.C.mTextStrAry = this.o;
            if (com.ss.android.ugc.aweme.framework.core.a.b().f3306d) {
                throw new IllegalStateException("Why are you running here?");
            }
        }
        this.C.x = this.f74400b;
        this.C.y = this.f74401c;
        this.C.rotation = this.f74402d;
        this.C.scale = this.f74403e;
        this.C.mTextStrAry = this.o;
        this.C.mBgMode = this.p;
        this.C.mColor = this.q;
        this.C.mAlign = this.s;
        this.C.mFontType = this.r;
        return this.C;
    }

    public boolean b() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86426, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86426, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.t && getVisibility() == 0 && (!this.i.d() || this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean a(float f2) {
        this.f74403e = f2;
        return true;
    }

    public void setCenterX(float f2) {
        this.f74400b = f2;
    }

    public void setCenterY(float f2) {
        this.f74401c = f2;
    }

    public void setEnableEdit(boolean z2) {
        this.t = z2;
    }

    public void setPlayPosition(long j2) {
        this.D = j2;
    }

    public void setOnEditClickListener(a aVar) {
        this.i.f74348b = aVar;
    }

    public final boolean b(float f2) {
        if (f2 <= 1.0f) {
            if (this.f74403e < 0.4f) {
                return false;
            }
        } else if (this.f74403e > 11.0f) {
            return false;
        }
        return true;
    }

    public void setText(String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{strArr}, this, f74399a, false, 86416, new Class[]{String[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr}, this, f74399a, false, 86416, new Class[]{String[].class}, Void.TYPE);
            return;
        }
        this.o = strArr;
        this.y.s = strArr;
        invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f74399a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 86418(0x15192, float:1.21097E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f74399a
            r13 = 1
            r14 = 86418(0x15192, float:1.21097E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            if (r0 == 0) goto L_0x0052
            int r1 = r0.length
            if (r1 != 0) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length
        L_0x0043:
            if (r9 >= r2) goto L_0x004d
            r3 = r0[r9]
            r1.append(r3)
            int r9 = r9 + 1
            goto L_0x0043
        L_0x004d:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0052:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.a(java.lang.String[]):java.lang.String");
    }

    public final int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74399a, false, 86433, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74399a, false, 86433, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (getData() == null || !getData().hasTimeData()) {
            return i2;
        } else {
            return getData().mEndTime;
        }
    }

    public void setAlpha(boolean z2) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74399a, false, 86431, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74399a, false, 86431, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            f2 = 1.0f;
        } else {
            f2 = 0.3137255f;
        }
        b(f2, false);
    }

    public void setAnimXY(Point point) {
        if (PatchProxy.isSupport(new Object[]{point}, this, f74399a, false, 86423, new Class[]{Point.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{point}, this, f74399a, false, 86423, new Class[]{Point.class}, Void.TYPE);
            return;
        }
        b bVar = this.h;
        bVar.f74346f = (float) (point.x - this.v);
        bVar.g = (float) (point.y - this.w);
    }

    public void setShowHelpBox(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74399a, false, 86425, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74399a, false, 86425, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.i.a(z2);
        if (!z2) {
            a(1000);
        }
    }

    public void setTouching(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74399a, false, 86442, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74399a, false, 86442, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2 != this.G) {
            this.G = z2;
            if (!z2) {
                a(1000);
            }
        }
    }

    private void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{1000L}, this, f74399a, false, 86443, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1000L}, this, f74399a, false, 86443, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.E = SystemClock.elapsedRealtime();
        this.u.postDelayed(new p(this), 1000);
    }

    private void c(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74399a, false, 86427, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74399a, false, 86427, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar = this.y;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86475, new Class[]{Integer.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86475, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        aVar.q.setColor(i3);
        aVar.r = i3;
        if (aVar.I) {
            aVar.C.setShadowLayer(12.0f, 0.0f, 0.0f, i3);
        } else {
            aVar.C.setShadowLayer(0.0f, 0.0f, 0.0f, i3);
        }
    }

    public void setTextColor(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74399a, false, 86419, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74399a, false, 86419, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar = this.y;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86476, new Class[]{Integer.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86476, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        aVar.I = d.a().e();
        if (aVar.C.getTypeface() != d.a().d()) {
            aVar.C.setTypeface(d.a().d());
        }
        if (aVar.I) {
            aVar.C.setColor(-1);
            aVar.C.setShadowLayer(12.0f, 0.0f, 0.0f, i3);
            return;
        }
        aVar.C.setShadowLayer(0.0f, 0.0f, 0.0f, i3);
        aVar.C.setColor(i3);
    }

    public final int a(int i2) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f74399a, false, 86432, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{0}, this, f74399a, false, 86432, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (getData() == null || !getData().hasTimeData()) {
            return 0;
        } else {
            return getData().mStartTime;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x04da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r27) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74399a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 86422(0x15196, float:1.21103E-40)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74399a
            r3 = 0
            r4 = 86422(0x15196, float:1.21103E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            super.onDraw(r27)
            java.lang.String[] r0 = r7.o
            if (r0 == 0) goto L_0x073d
            java.lang.String[] r0 = r7.o
            int r0 = r0.length
            if (r0 != 0) goto L_0x0046
            goto L_0x073d
        L_0x0046:
            android.graphics.PointF r0 = r7.F
            float r1 = r7.f74400b
            r0.x = r1
            android.graphics.PointF r0 = r7.F
            float r1 = r7.f74401c
            r0.y = r1
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a r6 = r7.y
            float r0 = r7.f74403e
            float r5 = r7.f74402d
            android.graphics.PointF r1 = r7.F
            int r4 = r7.s
            boolean r3 = r7.f74404f
            boolean r2 = r26.a()
            boolean r15 = r7.g
            r14 = 8
            java.lang.Object[] r11 = new java.lang.Object[r14]
            r11[r10] = r8
            java.lang.Float r12 = java.lang.Float.valueOf(r0)
            r11[r9] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r5)
            r18 = 2
            r11[r18] = r12
            r13 = 3
            r11[r13] = r1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r13 = 4
            r11[r13] = r12
            java.lang.Byte r12 = java.lang.Byte.valueOf(r3)
            r20 = 5
            r11[r20] = r12
            java.lang.Byte r12 = java.lang.Byte.valueOf(r2)
            r21 = 6
            r11[r21] = r12
            java.lang.Byte r12 = java.lang.Byte.valueOf(r15)
            r22 = 7
            r11[r22] = r12
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r17 = 0
            r23 = 86473(0x151c9, float:1.21174E-40)
            java.lang.Class[] r12 = new java.lang.Class[r14]
            java.lang.Class<android.graphics.Canvas> r24 = android.graphics.Canvas.class
            r12[r10] = r24
            java.lang.Class r24 = java.lang.Float.TYPE
            r12[r9] = r24
            java.lang.Class r24 = java.lang.Float.TYPE
            r12[r18] = r24
            java.lang.Class<android.graphics.PointF> r24 = android.graphics.PointF.class
            r19 = 3
            r12[r19] = r24
            java.lang.Class r24 = java.lang.Integer.TYPE
            r12[r13] = r24
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r12[r20] = r24
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r12[r21] = r24
            java.lang.Class r24 = java.lang.Boolean.TYPE
            r12[r22] = r24
            java.lang.Class r24 = java.lang.Void.TYPE
            r25 = r12
            r12 = r6
            r13 = r16
            r9 = 8
            r14 = r17
            r19 = r15
            r15 = r23
            r16 = r25
            r17 = r24
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0140
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8 = 1
            r11[r8] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r11[r18] = r0
            r0 = 3
            r11[r0] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r4 = 4
            r11[r4] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            r11[r20] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            r11[r21] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r19)
            r11[r22] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r14 = 0
            r15 = 86473(0x151c9, float:1.21174E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 1
            r1[r3] = r2
            java.lang.Class r2 = java.lang.Float.TYPE
            r1[r18] = r2
            java.lang.Class<android.graphics.PointF> r2 = android.graphics.PointF.class
            r1[r0] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r4] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r20] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r21] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r22] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r6
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            r0 = 4
            r9 = 3
            goto L_0x03e4
        L_0x0140:
            r9 = 3
            r15 = 4
            float r11 = r1.x
            r6.G = r11
            float r1 = r1.y
            r6.H = r1
            android.text.TextPaint r1 = r6.C
            float r11 = r6.t
            float r11 = r11 * r0
            r1.setTextSize(r11)
            r6.J = r5
            java.lang.String[] r1 = r6.s
            if (r1 == 0) goto L_0x0199
            r1 = 0
            r11 = 0
        L_0x015b:
            java.lang.String[] r12 = r6.s
            int r12 = r12.length
            if (r1 >= r12) goto L_0x0184
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            android.text.TextPaint r13 = r6.C
            java.lang.String[] r14 = r6.s
            r14 = r14[r1]
            java.lang.String[] r15 = r6.s
            r15 = r15[r1]
            int r15 = r15.length()
            r13.getTextBounds(r14, r10, r15, r12)
            int r13 = r12.width()
            if (r13 <= r11) goto L_0x0180
            int r11 = r12.width()
        L_0x0180:
            int r1 = r1 + 1
            r15 = 4
            goto L_0x015b
        L_0x0184:
            r1 = 1
            if (r4 != r1) goto L_0x018f
            float r1 = r6.G
            int r12 = r11 / 2
            float r12 = (float) r12
            float r1 = r1 - r12
            r6.G = r1
        L_0x018f:
            if (r4 != r9) goto L_0x0199
            float r1 = r6.G
            int r11 = r11 / 2
            float r11 = (float) r11
            float r1 = r1 + r11
            r6.G = r1
        L_0x0199:
            float r1 = r6.G
            float r11 = r6.H
            r6.a(r1, r11, r0, r4)
            r0 = 1
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r14 = 0
            r15 = 86478(0x151ce, float:1.21181E-40)
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Float.TYPE
            r1[r10] = r0
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r6
            r0 = 4
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x01e1
            r1 = 1
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Float r12 = java.lang.Float.valueOf(r5)
            r11[r10] = r12
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r14 = 0
            r15 = 86478(0x151ce, float:1.21181E-40)
            java.lang.Class[] r12 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Float.TYPE
            r12[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r1 = r12
            r12 = r6
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0287
        L_0x01e1:
            android.graphics.RectF r1 = r6.f74339e
            float r1 = r1.width()
            int r1 = (int) r1
            r11 = 1
            int r1 = r1 >> r11
            android.graphics.RectF r11 = r6.f74339e
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.left
            float r1 = (float) r1
            float r12 = r12 - r1
            android.graphics.RectF r13 = r6.f74337c
            float r13 = r13.top
            float r13 = r13 - r1
            r11.offsetTo(r12, r13)
            android.graphics.RectF r11 = r6.f74340f
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.right
            float r12 = r12 - r1
            android.graphics.RectF r13 = r6.f74337c
            float r13 = r13.bottom
            float r13 = r13 - r1
            r11.offsetTo(r12, r13)
            android.graphics.RectF r11 = r6.g
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.left
            float r12 = r12 - r1
            android.graphics.RectF r13 = r6.f74337c
            float r13 = r13.bottom
            float r13 = r13 - r1
            r11.offsetTo(r12, r13)
            android.graphics.RectF r11 = r6.h
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.right
            float r12 = r12 - r1
            android.graphics.RectF r13 = r6.f74337c
            float r13 = r13.top
            float r13 = r13 - r1
            r11.offsetTo(r12, r13)
            android.graphics.RectF r1 = r6.i
            android.graphics.RectF r11 = r6.f74339e
            r1.set(r11)
            android.graphics.RectF r1 = r6.j
            android.graphics.RectF r11 = r6.f74340f
            r1.set(r11)
            android.graphics.RectF r1 = r6.k
            android.graphics.RectF r11 = r6.g
            r1.set(r11)
            android.graphics.RectF r1 = r6.l
            android.graphics.RectF r11 = r6.h
            r1.set(r11)
            android.graphics.RectF r1 = r6.f74339e
            android.graphics.RectF r11 = r6.f74337c
            float r11 = r11.centerX()
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.centerY()
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a((android.graphics.RectF) r1, (float) r11, (float) r12, (float) r5)
            android.graphics.RectF r1 = r6.f74340f
            android.graphics.RectF r11 = r6.f74337c
            float r11 = r11.centerX()
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.centerY()
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a((android.graphics.RectF) r1, (float) r11, (float) r12, (float) r5)
            android.graphics.RectF r1 = r6.g
            android.graphics.RectF r11 = r6.f74337c
            float r11 = r11.centerX()
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.centerY()
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a((android.graphics.RectF) r1, (float) r11, (float) r12, (float) r5)
            android.graphics.RectF r1 = r6.h
            android.graphics.RectF r11 = r6.f74337c
            float r11 = r11.centerX()
            android.graphics.RectF r12 = r6.f74337c
            float r12 = r12.centerY()
            com.ss.android.ugc.aweme.shortvideo.edit.b.a.a((android.graphics.RectF) r1, (float) r11, (float) r12, (float) r5)
        L_0x0287:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r10] = r8
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r12 = 1
            r11[r12] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            r11[r18] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r19)
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r14 = 0
            r15 = 86480(0x151d0, float:1.21184E-40)
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.Canvas> r12 = android.graphics.Canvas.class
            r1[r10] = r12
            java.lang.Class r12 = java.lang.Float.TYPE
            r16 = 1
            r1[r16] = r12
            java.lang.Class r12 = java.lang.Boolean.TYPE
            r1[r18] = r12
            java.lang.Class r12 = java.lang.Boolean.TYPE
            r1[r9] = r12
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r6
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x02fc
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r10] = r8
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r12 = 1
            r11[r12] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            r11[r18] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r19)
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r14 = 0
            r15 = 86480(0x151d0, float:1.21184E-40)
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.Canvas> r2 = android.graphics.Canvas.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Float.TYPE
            r12 = 1
            r1[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r18] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r6
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0347
        L_0x02fc:
            if (r2 == 0) goto L_0x0347
            r27.save()
            android.graphics.RectF r1 = r6.f74337c
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r6.f74337c
            float r2 = r2.centerY()
            r8.rotate(r5, r1, r2)
            android.graphics.RectF r1 = r6.f74337c
            int r2 = r6.A
            float r2 = (float) r2
            int r11 = r6.A
            float r11 = (float) r11
            android.graphics.Paint r12 = r6.D
            r8.drawRoundRect(r1, r2, r11, r12)
            android.graphics.Bitmap r1 = r6.m
            android.graphics.Rect r2 = r6.f74338d
            android.graphics.RectF r11 = r6.i
            r12 = 0
            r8.drawBitmap(r1, r2, r11, r12)
            android.graphics.Bitmap r1 = r6.n
            android.graphics.Rect r2 = r6.f74338d
            android.graphics.RectF r11 = r6.j
            r8.drawBitmap(r1, r2, r11, r12)
            android.graphics.Bitmap r1 = r6.o
            android.graphics.Rect r2 = r6.f74338d
            android.graphics.RectF r11 = r6.k
            r8.drawBitmap(r1, r2, r11, r12)
            if (r19 == 0) goto L_0x0344
            android.graphics.Bitmap r1 = r6.p
            android.graphics.Rect r2 = r6.f74338d
            android.graphics.RectF r11 = r6.l
            r8.drawBitmap(r1, r2, r11, r12)
        L_0x0344:
            r27.restore()
        L_0x0347:
            float r2 = r6.G
            float r11 = r6.H
            r15 = 4
            r0 = r6
            r1 = r27
            r19 = r3
            r3 = r11
            r11 = r4
            r4 = r5
            r14 = r5
            r5 = r11
            r0.a(r1, r2, r3, r4, r5)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            r1 = 1
            r11[r1] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r19)
            r11[r18] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r0 = 0
            r2 = 86479(0x151cf, float:1.21183E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r4 = android.graphics.Canvas.class
            r3[r10] = r4
            java.lang.Class r4 = java.lang.Float.TYPE
            r3[r1] = r4
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r3[r18] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r6
            r1 = r14
            r14 = r0
            r0 = 4
            r15 = r2
            r16 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x03bb
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r11[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r19)
            r11[r18] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a
            r14 = 0
            r15 = 86479(0x151cf, float:1.21183E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r3 = android.graphics.Canvas.class
            r1[r10] = r3
            java.lang.Class r3 = java.lang.Float.TYPE
            r1[r2] = r3
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r18] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r6
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03e4
        L_0x03bb:
            boolean r2 = r6.I
            if (r2 != 0) goto L_0x03e4
            if (r19 == 0) goto L_0x03e4
            r27.save()
            android.graphics.RectF r2 = r6.f74337c
            float r2 = r2.centerX()
            android.graphics.RectF r3 = r6.f74337c
            float r3 = r3.centerY()
            r8.rotate(r1, r2, r3)
            android.graphics.Paint r1 = r6.q
            int r2 = r6.r
            r1.setColor(r2)
            android.graphics.Path r1 = r6.E
            android.graphics.Paint r2 = r6.q
            r8.drawPath(r1, r2)
            r27.restore()
        L_0x03e4:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b r1 = r7.h
            float r2 = r7.f74403e
            float r3 = r7.f74402d
            float r4 = r7.f74400b
            float r5 = r7.f74401c
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Float r6 = java.lang.Float.valueOf(r2)
            r11[r10] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            r8 = 1
            r11[r8] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r4)
            r11[r18] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            r11[r9] = r6
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a
            r14 = 0
            r15 = 86485(0x151d5, float:1.21191E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Float.TYPE
            r6[r10] = r8
            java.lang.Class r8 = java.lang.Float.TYPE
            r12 = 1
            r6[r12] = r8
            java.lang.Class r8 = java.lang.Float.TYPE
            r6[r18] = r8
            java.lang.Class r8 = java.lang.Float.TYPE
            r6[r9] = r8
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r8 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            if (r6 == 0) goto L_0x0470
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11[r10] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            r3 = 1
            r11[r3] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r4)
            r11[r18] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            r11[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a
            r14 = 0
            r2 = 86485(0x151d5, float:1.21191E-40)
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class r4 = java.lang.Float.TYPE
            r3[r10] = r4
            java.lang.Class r4 = java.lang.Float.TYPE
            r5 = 1
            r3[r5] = r4
            java.lang.Class r4 = java.lang.Float.TYPE
            r3[r18] = r4
            java.lang.Class r4 = java.lang.Float.TYPE
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r6 = 0
            r15 = r2
            r16 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x05a3
        L_0x0470:
            r6 = 0
            boolean r11 = r1.i
            if (r11 == 0) goto L_0x05a3
            float r11 = r1.l
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 < 0) goto L_0x0485
            float r11 = r1.l
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x0483
        L_0x0481:
            r11 = 1
            goto L_0x048c
        L_0x0483:
            r11 = 0
            goto L_0x048c
        L_0x0485:
            float r11 = r1.l
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0483
            goto L_0x0481
        L_0x048c:
            float r12 = r1.m
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x049c
            float r12 = r1.m
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x049a
        L_0x0498:
            r12 = 1
            goto L_0x04a3
        L_0x049a:
            r12 = 0
            goto L_0x04a3
        L_0x049c:
            float r12 = r1.m
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x049a
            goto L_0x0498
        L_0x04a3:
            if (r11 == 0) goto L_0x04b5
            if (r12 == 0) goto L_0x04b5
            float r11 = r1.j
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x04b5
            float r11 = r1.k
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x04b5
            r11 = 1
            goto L_0x04b6
        L_0x04b5:
            r11 = 0
        L_0x04b6:
            if (r11 == 0) goto L_0x04da
            r1.i = r10
            r1.h = r10
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            float r3 = r1.m
            r2.a((float) r3)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            float r3 = r1.l
            r2.a((float) r3, (boolean) r10)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            float r3 = r1.j
            r2.setCenterX(r3)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            float r3 = r1.k
            r2.setCenterY(r3)
            goto L_0x059e
        L_0x04da:
            float r11 = r1.m
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x04f1
            float r11 = r1.f74342b
            float r2 = r2 - r11
            float r11 = r1.m
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x04eb
            float r2 = r1.m
        L_0x04eb:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r11 = r1.o
            r11.a((float) r2)
            goto L_0x0501
        L_0x04f1:
            float r11 = r1.f74342b
            float r2 = r2 + r11
            float r11 = r1.m
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x04fc
            float r2 = r1.m
        L_0x04fc:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r11 = r1.o
            r11.a((float) r2)
        L_0x0501:
            float r2 = r1.l
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x051e
            float r2 = r1.l
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0534
            float r2 = r1.f74343c
            float r3 = r3 - r2
            float r2 = r1.l
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0518
            float r3 = r1.l
        L_0x0518:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.a((float) r3, (boolean) r10)
            goto L_0x0534
        L_0x051e:
            float r2 = r1.l
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0534
            float r2 = r1.f74343c
            float r3 = r3 - r2
            float r2 = r1.l
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x052f
            float r3 = r1.l
        L_0x052f:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.a((float) r3, (boolean) r10)
        L_0x0534:
            float r2 = r1.j
            float r3 = r1.f74346f
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0553
            float r2 = r1.j
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0569
            float r2 = r1.f74344d
            float r4 = r4 - r2
            float r2 = r1.j
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x054d
            float r4 = r1.j
        L_0x054d:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.setCenterX(r4)
            goto L_0x0569
        L_0x0553:
            float r2 = r1.j
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0569
            float r2 = r1.f74344d
            float r4 = r4 - r2
            float r2 = r1.j
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0564
            float r4 = r1.j
        L_0x0564:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.setCenterX(r4)
        L_0x0569:
            float r2 = r1.k
            float r3 = r1.g
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0588
            float r2 = r1.k
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x059e
            float r2 = r1.f74345e
            float r5 = r5 - r2
            float r2 = r1.k
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0582
            float r5 = r1.k
        L_0x0582:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.setCenterY(r5)
            goto L_0x059e
        L_0x0588:
            float r2 = r1.k
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x059e
            float r2 = r1.f74345e
            float r5 = r5 - r2
            float r2 = r1.k
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0599
            float r5 = r1.k
        L_0x0599:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.setCenterY(r5)
        L_0x059e:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r1 = r1.o
            r1.invalidate()
        L_0x05a3:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b r1 = r7.h
            float r2 = r7.f74403e
            float r3 = r7.f74402d
            float r4 = r7.f74400b
            float r5 = r7.f74401c
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Float r12 = java.lang.Float.valueOf(r2)
            r11[r10] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r13 = 1
            r11[r13] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r4)
            r11[r18] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r5)
            r11[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a
            r14 = 0
            r15 = 86486(0x151d6, float:1.21193E-40)
            java.lang.Class[] r12 = new java.lang.Class[r0]
            java.lang.Class r16 = java.lang.Float.TYPE
            r12[r10] = r16
            java.lang.Class r16 = java.lang.Float.TYPE
            r17 = 1
            r12[r17] = r16
            java.lang.Class r16 = java.lang.Float.TYPE
            r12[r18] = r16
            java.lang.Class r16 = java.lang.Float.TYPE
            r12[r9] = r16
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r12
            r12 = r1
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x062a
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11[r10] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            r3 = 1
            r11[r3] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r4)
            r11[r18] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            r11[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b.f74341a
            r14 = 0
            r15 = 86486(0x151d6, float:1.21193E-40)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Float.TYPE
            r0[r10] = r2
            java.lang.Class r2 = java.lang.Float.TYPE
            r12 = 1
            r0[r12] = r2
            java.lang.Class r2 = java.lang.Float.TYPE
            r0[r18] = r2
            java.lang.Class r2 = java.lang.Float.TYPE
            r0[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r1
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x062a:
            r12 = 1
            boolean r0 = r1.h
            if (r0 == 0) goto L_0x073c
            float r0 = r1.l
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x064c
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x064a
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x064a
            float r0 = r1.f74346f
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x064a
            float r0 = r1.g
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x064a
            goto L_0x0660
        L_0x064a:
            r12 = 0
            goto L_0x0660
        L_0x064c:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x064a
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x064a
            float r0 = r1.f74346f
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x064a
            float r0 = r1.g
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x064a
        L_0x0660:
            if (r12 == 0) goto L_0x0680
            r1.h = r10
            r1.i = r10
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.a((float) r8)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.a((float) r6, (boolean) r10)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            float r2 = r1.f74346f
            r0.setCenterX(r2)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            float r2 = r1.g
            r0.setCenterY(r2)
            goto L_0x0737
        L_0x0680:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0694
            float r0 = r1.f74342b
            float r0 = r2 - r0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x068e
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x068e:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.a((float) r0)
            goto L_0x06a2
        L_0x0694:
            float r0 = r1.f74342b
            float r0 = r0 + r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x069d
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x069d:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = r1.o
            r2.a((float) r0)
        L_0x06a2:
            float r0 = r1.l
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x06bb
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x06cd
            float r0 = r1.f74343c
            float r15 = r3 - r0
            int r0 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x06b5
            r15 = 0
        L_0x06b5:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.a((float) r15, (boolean) r10)
            goto L_0x06cd
        L_0x06bb:
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x06cd
            float r0 = r1.f74343c
            float r15 = r3 - r0
            int r0 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x06c8
            r15 = 0
        L_0x06c8:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.a((float) r15, (boolean) r10)
        L_0x06cd:
            float r0 = r1.j
            float r2 = r1.f74346f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x06ec
            float r0 = r1.f74346f
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0702
            float r0 = r1.f74344d
            float r4 = r4 - r0
            float r0 = r1.f74346f
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x06e6
            float r4 = r1.f74346f
        L_0x06e6:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.setCenterX(r4)
            goto L_0x0702
        L_0x06ec:
            float r0 = r1.f74346f
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0702
            float r0 = r1.f74344d
            float r4 = r4 - r0
            float r0 = r1.f74346f
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x06fd
            float r4 = r1.f74346f
        L_0x06fd:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.setCenterX(r4)
        L_0x0702:
            float r0 = r1.k
            float r2 = r1.g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0721
            float r0 = r1.g
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0737
            float r0 = r1.f74345e
            float r5 = r5 - r0
            float r0 = r1.g
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x071b
            float r5 = r1.g
        L_0x071b:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.setCenterY(r5)
            goto L_0x0737
        L_0x0721:
            float r0 = r1.g
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0737
            float r0 = r1.f74345e
            float r5 = r5 - r0
            float r0 = r1.g
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0732
            float r5 = r1.g
        L_0x0732:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.setCenterY(r5)
        L_0x0737:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r0 = r1.o
            r0.invalidate()
        L_0x073c:
            return
        L_0x073d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.onDraw(android.graphics.Canvas):void");
    }

    public final void a(float f2, boolean z2) {
        this.f74402d = f2;
        if (this.f74402d > 180.0f) {
            this.f74402d -= 360.0f;
        }
        if (this.f74402d < -180.0f) {
            this.f74402d += 360.0f;
        }
        if (z2) {
            this.f74402d = this.f74402d;
        }
    }

    public final boolean d(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86456, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86456, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return a(getTimeRect(), f2, f3);
    }

    public final boolean f(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86458, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86458, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return a(getDeleteRect(), f2, f3);
    }

    public final void b(float f2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74399a, false, 86461, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Byte.valueOf(z2)}, this, f74399a, false, 86461, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            setAlpha(1.0f);
        } else {
            setAlpha(f2);
        }
    }

    public final boolean e(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86457, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86457, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return a(getEditRect(), f2, f3);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74399a, false, 86420, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74399a, false, 86420, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.n) {
            this.n = false;
            if (PatchProxy.isSupport(new Object[0], this, f74399a, false, 86424, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74399a, false, 86424, new Class[0], Void.TYPE);
                return;
            }
            this.f74400b = (float) (getMeasuredWidth() / 2);
            this.f74401c = (float) (getMeasuredHeight() / 2);
            this.f74402d = 0.0f;
            this.f74403e = 1.0f;
        }
    }

    public final boolean c(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86455, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86455, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return a(getRotateRect(), f2, f3);
    }

    public final boolean b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86454, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86454, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return a(getHelpRect(), f2, f3);
    }

    /* access modifiers changed from: private */
    public void a(TextStickerData textStickerData, int i2, int i3) {
        TextStickerData textStickerData2 = textStickerData;
        if (PatchProxy.isSupport(new Object[]{textStickerData2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74399a, false, 86413, new Class[]{TextStickerData.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textStickerData2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74399a, false, 86413, new Class[]{TextStickerData.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.C = textStickerData2;
        if (textStickerData2 != null) {
            setText(this.C.mTextStrAry);
            a(this.C.mBgMode, this.C.mColor, this.C.mAlign, this.C.mFontType);
            setAnimXY(this.C.mEditCenterPoint);
            i();
            invalidate();
        }
    }

    private boolean a(RectF rectF, float f2, float f3) {
        RectF rectF2 = rectF;
        if (PatchProxy.isSupport(new Object[]{rectF2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86453, new Class[]{RectF.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rectF2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74399a, false, 86453, new Class[]{RectF.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.aweme.shortvideo.edit.b.a.b(rectF2, f2, f3, this.f74402d);
    }

    public o(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z2) {
        super(context);
        this.u = safeHandler;
        this.g = z2;
        if (PatchProxy.isSupport(new Object[]{context}, this, f74399a, false, 86415, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f74399a, false, 86415, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.y = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a();
            this.i = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c();
            this.h = new b();
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar = this.y;
            if (PatchProxy.isSupport(new Object[]{context, this}, aVar, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86472, new Class[]{Context.class, o.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{context, this}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.f74335a, false, 86472, new Class[]{Context.class, o.class}, Void.TYPE);
            } else {
                aVar.F = this;
                aVar.F.setLayerType(2, null);
                aVar.t = UIUtils.sp2px(context, 28.0f);
                aVar.u = (int) UIUtils.dip2Px(context, 12.0f);
                aVar.v = (int) UIUtils.dip2Px(context, 8.0f);
                aVar.w = aVar.u;
                aVar.x = aVar.v;
                aVar.y = (int) UIUtils.dip2Px(context, 12.0f);
                aVar.z = (int) UIUtils.dip2Px(context, 14.0f);
                aVar.A = (int) UIUtils.dip2Px(context, 2.0f);
                aVar.B = (int) UIUtils.dip2Px(context, 5.0f);
                aVar.m = BitmapFactory.decodeResource(context.getResources(), 2130839332);
                aVar.n = BitmapFactory.decodeResource(context.getResources(), 2130839334);
                aVar.o = BitmapFactory.decodeResource(context.getResources(), 2130838830);
                aVar.p = BitmapFactory.decodeResource(context.getResources(), 2130839337);
                aVar.f74338d.set(0, 0, aVar.m.getWidth(), aVar.m.getHeight());
                aVar.f74339e = new RectF(0.0f, 0.0f, (float) (aVar.z << 1), (float) (aVar.z << 1));
                aVar.f74340f = new RectF(0.0f, 0.0f, (float) (aVar.z << 1), (float) (aVar.z << 1));
                aVar.g = new RectF(0.0f, 0.0f, (float) (aVar.z << 1), (float) (aVar.z << 1));
                aVar.h = new RectF(0.0f, 0.0f, (float) (aVar.z << 1), (float) (aVar.z << 1));
                aVar.C.setColor(-1);
                aVar.C.setTypeface(Typeface.DEFAULT_BOLD);
                aVar.C.setTextSize(aVar.t);
                aVar.C.setAntiAlias(true);
                aVar.K = new Paint(aVar.C);
                aVar.K.setColor(-16737912);
                aVar.D.setColor(-2130706433);
                aVar.D.setStyle(Paint.Style.STROKE);
                aVar.D.setAntiAlias(true);
                aVar.D.setStrokeWidth(2.0f);
                aVar.q = new Paint();
                aVar.q.setStyle(Paint.Style.FILL);
                aVar.q.setAntiAlias(true);
                aVar.q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                aVar.q.setPathEffect(new CornerPathEffect((float) aVar.B));
                aVar.E = new Path();
            }
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c cVar = this.i;
            SafeHandler safeHandler2 = this.u;
            cVar.q = this;
            cVar.p = safeHandler2;
            this.h.o = this;
        }
        this.z = fc.b(context) / 2;
        this.A = fc.a(context) / 2;
        this.x = fc.c(context);
        this.B = (Vibrator) context.getSystemService("vibrator");
        if (PatchProxy.isSupport(new Object[]{textStickerData}, this, f74399a, false, 86412, new Class[]{TextStickerData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textStickerData}, this, f74399a, false, 86412, new Class[]{TextStickerData.class}, Void.TYPE);
            return;
        }
        a(textStickerData, 0, 0);
    }
}
