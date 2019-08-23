package com.facebook.c.b.a;

import android.graphics.Matrix;
import com.facebook.c.b.a;
import com.facebook.c.b.b;
import com.facebook.c.b.c;
import java.util.List;

public final class d extends e<c, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final b.C0250b f23319a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private final float[] f23320b;

    public d(List<c> list, float[][][] fArr, b.C0250b bVar, float[] fArr2) {
        super(list, fArr);
        this.f23319a = bVar;
        this.f23320b = fArr2 == null ? new float[2] : fArr2;
        if (bVar == b.C0250b.POSITION) {
            this.f23320b[0] = list.get(0).f23337a[0];
            this.f23320b[1] = list.get(0).f23337a[1];
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(a aVar, a aVar2, float f2, Object obj) {
        float f3;
        float f4;
        float f5;
        float f6;
        c cVar = (c) aVar;
        c cVar2 = (c) aVar2;
        Matrix matrix = (Matrix) obj;
        float f7 = 0.0f;
        switch (this.f23319a) {
            case ROTATION:
                if (cVar2 == null) {
                    float f8 = cVar.f23337a[0];
                    if (this.f23320b != null) {
                        f4 = this.f23320b[0];
                    } else {
                        f4 = 0.0f;
                    }
                    if (this.f23320b != null) {
                        f7 = this.f23320b[1];
                    }
                    matrix.postRotate(f8, f4, f7);
                    break;
                } else {
                    float a2 = a(cVar.f23337a[0], cVar2.f23337a[0], f2);
                    if (this.f23320b != null) {
                        f3 = this.f23320b[0];
                    } else {
                        f3 = 0.0f;
                    }
                    if (this.f23320b != null) {
                        f7 = this.f23320b[1];
                    }
                    matrix.postRotate(a2, f3, f7);
                    return;
                }
            case SCALE:
                if (cVar2 == null) {
                    float f9 = cVar.f23337a[0] / 100.0f;
                    float f10 = cVar.f23337a[1] / 100.0f;
                    if (this.f23320b != null) {
                        f6 = this.f23320b[0];
                    } else {
                        f6 = 0.0f;
                    }
                    if (this.f23320b != null) {
                        f7 = this.f23320b[1];
                    }
                    matrix.postScale(f9, f10, f6, f7);
                    break;
                } else {
                    float f11 = cVar.f23337a[0];
                    float f12 = cVar2.f23337a[0];
                    float f13 = cVar.f23337a[1];
                    float f14 = cVar2.f23337a[1];
                    float a3 = a(f11, f12, f2) / 100.0f;
                    float a4 = a(f13, f14, f2) / 100.0f;
                    if (this.f23320b != null) {
                        f5 = this.f23320b[0];
                    } else {
                        f5 = 0.0f;
                    }
                    if (this.f23320b != null) {
                        f7 = this.f23320b[1];
                    }
                    matrix.postScale(a3, a4, f5, f7);
                    return;
                }
            case POSITION:
                if (cVar2 != null) {
                    matrix.postTranslate(a(cVar.f23337a[0], cVar2.f23337a[0], f2) - this.f23320b[0], a(cVar.f23337a[1], cVar2.f23337a[1], f2) - this.f23320b[1]);
                }
                return;
            case X_POSITION:
                if (cVar2 == null) {
                    matrix.postTranslate(cVar.f23337a[0], 0.0f);
                    break;
                } else {
                    matrix.postTranslate(a(cVar.f23337a[0], cVar2.f23337a[0], f2), 0.0f);
                    return;
                }
            case Y_POSITION:
                if (cVar2 == null) {
                    matrix.postTranslate(0.0f, cVar.f23337a[0]);
                    break;
                } else {
                    matrix.postTranslate(0.0f, a(cVar.f23337a[0], cVar2.f23337a[0], f2));
                    return;
                }
            default:
                throw new UnsupportedOperationException("Cannot apply matrix transformation to " + this.f23319a);
        }
    }
}
