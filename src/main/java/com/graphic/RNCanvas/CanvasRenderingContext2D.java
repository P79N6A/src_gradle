package com.graphic.RNCanvas;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.HashMap;

public class CanvasRenderingContext2D {
    private final String COLOR = "_color";
    private final String COLOR_PROPS = "_color_steps";
    private final String END_POS = "_end_pos";
    private final String POS = "_pos";
    private final String START_POS = "_start_pos";
    private final String X = "_x";
    private final String Y = "_y";
    private Canvas canvas;
    private CanvasDrawingState currentState;
    private float[] lastPoint;
    private final Matrix matrix = new Matrix();
    private final Paint paint = new Paint();
    private final Path path = new Path();
    private float scale;
    private final CanvasDrawingStateManager stateManager = new CanvasDrawingStateManager();

    private float modulus(float f2, float f3) {
        float f4 = f2 % f3;
        return f4 < 0.0f ? f4 + f3 : f4;
    }

    public void createImageData() {
    }

    public void createLinearGradient(float f2, float f3, float f4, float f5) {
    }

    public void createPattern() {
    }

    public void createRadialGradient(float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public void drawFocusIfNeeded() {
    }

    public void drawImage() {
    }

    public void getImageData() {
    }

    public void isPointInPath() {
    }

    public void isPointInStroke() {
    }

    public void putImageData() {
    }

    public void scrollPathIntoView() {
    }

    public void closePath() {
        this.path.close();
    }

    public DashPathEffect getLineDash() {
        return this.currentState.strokeLineDash;
    }

    private void setUpCurrentState() {
        this.currentState = this.stateManager.getCurrentState();
    }

    public void beginPath() {
        this.path.reset();
        resetLastPoint();
    }

    public void clip() {
        this.path.setFillType(Path.FillType.WINDING);
        this.canvas.clipPath(this.path);
    }

    public void fill() {
        setUpFillPaint();
        this.canvas.drawPath(this.path, this.paint);
    }

    public void resetTransform() {
        this.matrix.reset();
        this.canvas.setMatrix(this.matrix);
    }

    public void restore() {
        this.stateManager.restore();
        setUpCurrentState();
        this.canvas.restore();
    }

    public void save() {
        this.stateManager.save();
        setUpCurrentState();
        this.canvas.save();
    }

    public void stroke() {
        setUpStrokePaint();
        this.canvas.drawPath(this.path, this.paint);
    }

    private void resetLastPoint() {
        this.lastPoint = new float[]{0.0f, 0.0f};
    }

    private void setUpFillPaint() {
        resetPaint();
        setPaintStyle(Paint.Style.FILL, this.currentState.fillStyle);
        if (this.currentState.mLinearGradient != null) {
            this.paint.setShader(this.currentState.mLinearGradient);
        }
    }

    private float getTextVerticalOffset() {
        if (this.currentState.textBaseline == 0) {
            return 0.0f;
        }
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        float f2 = fontMetrics.ascent + fontMetrics.descent;
        if (this.currentState.textBaseline == 1) {
            return -f2;
        }
        if (this.currentState.textBaseline == 2) {
            return -(f2 / 2.0f);
        }
        return 0.0f;
    }

    private void resetPaint() {
        this.paint.reset();
        this.paint.setFlags(1);
        this.paint.setTextSize(this.currentState.textSize);
        this.paint.setTextAlign(this.currentState.textAlign);
        this.paint.clearShadowLayer();
    }

    private void setUpStrokePaint() {
        resetPaint();
        setPaintStyle(Paint.Style.STROKE, this.currentState.strokeStyle);
        this.paint.setStrokeCap(this.currentState.strokeLineCap);
        this.paint.setStrokeWidth(this.currentState.strokeLineWidth * this.scale);
        this.paint.setStrokeJoin(this.currentState.strokeLineJoin);
        this.paint.setStrokeMiter(this.currentState.miterLimit);
        this.paint.setPathEffect(this.currentState.strokeLineDash);
        if (this.currentState.mLinearGradient != null) {
            this.paint.setShader(this.currentState.mLinearGradient);
        }
    }

    public void setDevicePixelRatio(float f2) {
        this.scale = f2;
    }

    public void rotate(float f2) {
        this.canvas.rotate(f2);
    }

    public void setFillStyle(float[] fArr) {
        this.currentState.setFillStyle(fArr);
    }

    public void setGlobalAlpha(float f2) {
        this.currentState.setGlobalAlpha(f2);
    }

    public void setLineCap(String str) {
        this.currentState.setStrokeLineCap(str);
    }

    public void setLineDashOffset(float f2) {
        this.currentState.setLineDashOffset(f2);
    }

    public void setLineJoin(String str) {
        this.currentState.setStrokeLineJoin(str);
    }

    public void setLineWidth(float f2) {
        this.currentState.setStrokeLineWidth(f2);
    }

    public void setMiterLimit(float f2) {
        this.currentState.setMiterLimit(f2);
    }

    public void setShadowBlur(float f2) {
        this.currentState.setShadowBlur(f2);
    }

    public void setShadowColor(float[] fArr) {
        this.currentState.setShadowColor(fArr);
    }

    public void setShadowOffsetX(float f2) {
        this.currentState.setShadowOffsetX(f2);
    }

    public void setShadowOffsetY(float f2) {
        this.currentState.setShadowOffsetY(f2);
    }

    public void setStrokeStyle(float[] fArr) {
        try {
            this.currentState.setStrokeStyle(fArr);
        } catch (Exception unused) {
        }
    }

    public void setTextAlign(String str) {
        this.currentState.setTextAlign(str);
    }

    public void setTextBaseline(String str) {
        this.currentState.setTextBaseline(str);
    }

    public void setLineDash(float[] fArr) {
        if (fArr.length != 0) {
            this.currentState.setStrokeLineDash(fArr);
        }
    }

    public HashMap measureText(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(this.paint.measureText(str)));
        return hashMap;
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.stateManager.reset();
        setUpCurrentState();
        resetLastPoint();
        this.path.reset();
        resetPaint();
    }

    public void clip(String str) {
        if (str.equals("nonzero")) {
            clip();
            return;
        }
        if (str.equals("evenodd")) {
            this.path.setFillType(Path.FillType.EVEN_ODD);
            this.canvas.clipPath(this.path);
        }
    }

    public void setFont(HashMap hashMap) {
        double doubleValue = ((Double) hashMap.get("fontSize")).doubleValue();
        double d2 = (double) this.scale;
        Double.isNaN(d2);
        Double valueOf = Double.valueOf(doubleValue * d2);
        this.paint.setTypeface(Typeface.SANS_SERIF);
        this.currentState.setTextSize(valueOf.floatValue());
    }

    public void setGradientStyle(HashMap hashMap) {
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        HashMap hashMap2 = hashMap;
        if (hashMap2 != null && hashMap.size() > 0 && hashMap2.containsKey("_start_pos") && hashMap2.containsKey("_end_pos") && hashMap2.containsKey("_color_steps")) {
            HashMap hashMap3 = (HashMap) hashMap2.get("_start_pos");
            HashMap hashMap4 = (HashMap) hashMap2.get("_end_pos");
            double doubleValue = ((Double) hashMap3.get("_x")).doubleValue();
            double doubleValue2 = ((Double) hashMap3.get("_y")).doubleValue();
            double doubleValue3 = ((Double) hashMap4.get("_x")).doubleValue();
            double doubleValue4 = ((Double) hashMap4.get("_y")).doubleValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) hashMap2.get("_color_steps");
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                try {
                    HashMap hashMap5 = (HashMap) arrayList3.get(i2);
                    if (hashMap5.containsKey("_pos") && hashMap5.containsKey("_color")) {
                        arrayList.add(Integer.valueOf(Color.parseColor((String) hashMap5.get("_color"))));
                        arrayList2.add(Float.valueOf((float) ((Double) hashMap5.get("_pos")).doubleValue()));
                    }
                } catch (Exception unused) {
                }
            }
            if (arrayList.size() > 0 && arrayList2.size() > 0) {
                int[] iArr = new int[arrayList.size()];
                float[] fArr = new float[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                    fArr[i3] = ((Float) arrayList2.get(i3)).floatValue();
                }
                if (!(this.canvas.getClipBounds() == null || this.canvas.getClipBounds().left == 0 || this.canvas.getClipBounds().top == 0)) {
                    if (doubleValue == doubleValue3) {
                        CanvasDrawingState canvasDrawingState = this.currentState;
                        float f6 = ((float) doubleValue) + ((float) this.canvas.getClipBounds().left);
                        if (doubleValue2 > doubleValue4) {
                            f4 = ((float) doubleValue4) + ((float) (this.canvas.getClipBounds().top * 3));
                        } else {
                            double d2 = (double) ((float) doubleValue4);
                            double d3 = (double) this.canvas.getClipBounds().top;
                            Double.isNaN(d3);
                            Double.isNaN(d2);
                            f4 = (float) (d2 - (d3 * 0.6d));
                        }
                        float f7 = ((float) doubleValue3) + ((float) this.canvas.getClipBounds().left);
                        if (doubleValue4 > doubleValue2) {
                            f5 = ((float) doubleValue4) + ((float) (this.canvas.getClipBounds().top * 2));
                        } else {
                            double d4 = (double) ((float) doubleValue4);
                            double d5 = (double) this.canvas.getClipBounds().top;
                            Double.isNaN(d5);
                            Double.isNaN(d4);
                            f5 = (float) (d4 + (d5 * 1.2d));
                        }
                        float[] fArr2 = fArr;
                        LinearGradient linearGradient = new LinearGradient(f6, f4, f7, f5, iArr, fArr2, Shader.TileMode.CLAMP);
                        canvasDrawingState.setLinearGradient(linearGradient);
                        return;
                    }
                    float[] fArr3 = fArr;
                    CanvasDrawingState canvasDrawingState2 = this.currentState;
                    if (doubleValue > doubleValue3) {
                        f2 = ((float) doubleValue) + ((float) (this.canvas.getClipBounds().left * 3));
                    } else {
                        f2 = (float) doubleValue;
                    }
                    float f8 = f2;
                    float f9 = ((float) doubleValue2) + ((float) this.canvas.getClipBounds().top);
                    if (doubleValue3 > doubleValue) {
                        f3 = (float) doubleValue3;
                        i = this.canvas.getClipBounds().left * 2;
                    } else {
                        f3 = (float) doubleValue3;
                        i = this.canvas.getClipBounds().left;
                    }
                    LinearGradient linearGradient2 = new LinearGradient(f8, f9, f3 + ((float) i), ((float) doubleValue4) + ((float) this.canvas.getClipBounds().top), iArr, fArr3, Shader.TileMode.CLAMP);
                    canvasDrawingState2.setLinearGradient(linearGradient2);
                }
            }
        }
    }

    public void scale(float f2, float f3) {
        this.canvas.scale(f2, f3);
    }

    private void trackPoint(float f2, float f3) {
        this.lastPoint[0] = f2;
        this.lastPoint[1] = f3;
    }

    public void translate(float f2, float f3) {
        this.canvas.translate(f2 * this.scale, f3 * this.scale);
    }

    public void lineTo(float f2, float f3) {
        float f4 = f2 * this.scale;
        float f5 = f3 * this.scale;
        trackPoint(f4, f5);
        this.path.lineTo(f4, f5);
    }

    public void moveTo(float f2, float f3) {
        float f4 = f2 * this.scale;
        float f5 = f3 * this.scale;
        trackPoint(f4, f5);
        this.path.moveTo(f4, f5);
    }

    private void setPaintStyle(Paint.Style style, int[] iArr) {
        this.paint.setStyle(style);
        this.paint.setARGB((int) (((float) iArr[0]) * this.currentState.globalAlpha), iArr[1], iArr[2], iArr[3]);
        this.paint.setShadowLayer(this.currentState.shadowBlur, this.currentState.shadowOffsetX, this.currentState.shadowOffsetY, CanvasConvert.convertColorListToColor(this.currentState.shadowColor));
    }

    public void fillText(String str, float f2, float f3) {
        setUpFillPaint();
        drawText(str, f2, f3);
    }

    public void strokeText(String str, float f2, float f3) {
        setUpStrokePaint();
        drawText(str, f2, f3);
    }

    private void drawText(String str, float f2, float f3) {
        this.canvas.drawText(str, f2 * this.scale, (f3 * this.scale) + getTextVerticalOffset(), this.paint);
    }

    public void quadraticCurveTo(float f2, float f3, float f4, float f5) {
        float f6 = f2 * this.scale;
        float f7 = f3 * this.scale;
        float f8 = f4 * this.scale;
        float f9 = f5 * this.scale;
        trackPoint(f8, f9);
        this.path.quadTo(f6, f7, f8, f9);
    }

    public void rect(float f2, float f3, float f4, float f5) {
        float f6 = f2 * this.scale;
        float f7 = f3 * this.scale;
        this.path.addRect(new RectF(f6, f7, (f4 * this.scale) + f6, (f5 * this.scale) + f7), Path.Direction.CW);
    }

    public void clearRect(float f2, float f3, float f4, float f5) {
        float f6 = f2 * this.scale;
        float f7 = f3 * this.scale;
        float f8 = f4 * this.scale;
        float f9 = f5 * this.scale;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.canvas.drawRect(f6, f7, f6 + f8, f7 + f9, paint2);
    }

    public void fillRect(float f2, float f3, float f4, float f5) {
        float f6 = f2 * this.scale;
        float f7 = f3 * this.scale;
        RectF rectF = new RectF(f6, f7, (f4 * this.scale) + f6, (f5 * this.scale) + f7);
        setUpFillPaint();
        this.canvas.drawRect(rectF, this.paint);
    }

    public void strokeRect(float f2, float f3, float f4, float f5) {
        float f6 = f2 * this.scale;
        float f7 = f3 * this.scale;
        RectF rectF = new RectF(f6, f7, (f4 * this.scale) + f6, (f5 * this.scale) + f7);
        setUpStrokePaint();
        this.canvas.drawRect(rectF, this.paint);
    }

    public void arc(float f2, float f3, float f4, float f5, float f6) {
        arc(f2, f3, f4, f5, f6, false);
    }

    public void arcTo(float f2, float f3, float f4, float f5, float f6) {
        float f7;
        boolean z;
        boolean z2;
        float f8 = this.lastPoint[0] * this.scale;
        float f9 = this.lastPoint[1] * this.scale;
        float f10 = this.scale * f2;
        float f11 = this.scale * f3;
        float f12 = this.scale * f4;
        float f13 = this.scale * f5;
        float f14 = this.scale * f6;
        if ((f10 == f8 && f11 == f9) || ((f10 == f12 && f11 == f13) || f14 == 0.0f)) {
            lineTo(f10, f11);
            return;
        }
        float[] fArr = {f8 - f10, f9 - f11};
        float[] fArr2 = {f12 - f10, f13 - f11};
        double d2 = (double) fArr[0];
        double d3 = (double) fArr[0];
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = (double) (fArr[1] * fArr[1]);
        Double.isNaN(d5);
        float sqrt = (float) Math.sqrt(d4 + d5);
        double d6 = (double) fArr2[0];
        double d7 = (double) fArr2[0];
        Double.isNaN(d6);
        Double.isNaN(d7);
        double d8 = d6 * d7;
        double d9 = (double) (fArr2[1] * fArr2[1]);
        Double.isNaN(d9);
        float sqrt2 = (float) Math.sqrt(d8 + d9);
        double d10 = (double) (((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) / (sqrt * sqrt2));
        if (d10 == -1.0d) {
            lineTo(f10, f11);
        } else if (d10 == 1.0d) {
            float f15 = 65535.0f / sqrt;
            lineTo(f8 + (fArr[0] * f15), f9 + (f15 * fArr[1]));
        } else {
            float tan = f14 / ((float) Math.tan(Math.acos(d10) / 2.0d));
            float f16 = tan / sqrt;
            float[] fArr3 = {(fArr[0] * f16) + f10, (f16 * fArr[1]) + f11};
            float[] fArr4 = {fArr[1], -fArr[0]};
            double d11 = (double) fArr4[0];
            double d12 = (double) fArr4[0];
            Double.isNaN(d11);
            Double.isNaN(d12);
            double d13 = d11 * d12;
            double d14 = (double) (fArr4[1] * fArr4[1]);
            Double.isNaN(d14);
            float sqrt3 = (float) Math.sqrt(d13 + d14);
            float f17 = f14 / sqrt3;
            if (((double) (((fArr4[0] * fArr2[0]) + (fArr4[1] * fArr2[1])) / (sqrt3 * sqrt2))) < 0.0d) {
                fArr4[0] = -fArr4[0];
                fArr4[1] = -fArr4[1];
            }
            float[] fArr5 = {fArr3[0] + (fArr4[0] * f17), fArr3[1] + (f17 * fArr4[1])};
            fArr4[0] = -fArr4[0];
            fArr4[1] = -fArr4[1];
            float acos = (float) ((Math.acos((double) (fArr4[0] / sqrt3)) * 180.0d) / 3.141592653589793d);
            if (fArr4[1] < 0.0f) {
                acos = 360.0f - acos;
            }
            float f18 = tan / sqrt2;
            float[] fArr6 = {f10 + (fArr2[0] * f18), f11 + (f18 * fArr2[1])};
            float[] fArr7 = {fArr6[0] - fArr5[0], fArr6[1] - fArr5[1]};
            double d15 = (double) fArr7[0];
            double d16 = (double) fArr7[0];
            Double.isNaN(d15);
            Double.isNaN(d16);
            double d17 = d15 * d16;
            double d18 = (double) (fArr7[1] * fArr7[1]);
            Double.isNaN(d18);
            float acos2 = (float) ((Math.acos((double) (fArr7[0] / ((float) Math.sqrt(d17 + d18)))) * 180.0d) / 3.141592653589793d);
            if (fArr7[1] < 0.0f) {
                f7 = 360.0f - acos2;
            } else {
                f7 = acos2;
            }
            if (acos <= f7 || acos - f7 >= 180.0f) {
                z = false;
            } else {
                z = true;
            }
            if (acos >= f7 || f7 - acos <= 180.0f) {
                z2 = z;
            } else {
                z2 = true;
            }
            lineTo(fArr3[0], fArr3[1]);
            arc(fArr5[0], fArr5[1], f14, acos, f7, z2);
        }
    }

    public void setTransform(float f2, float f3, float f4, float f5, float f6, float f7) {
        resetTransform();
        transform(f2, f3, f4, f5, f6, f7);
    }

    public void bezierCurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f2 * this.scale;
        float f9 = f3 * this.scale;
        float f10 = f4 * this.scale;
        float f11 = f5 * this.scale;
        float f12 = f6 * this.scale;
        float f13 = f7 * this.scale;
        trackPoint(f12, f13);
        this.path.cubicTo(f8, f9, f10, f11, f12, f13);
    }

    public void transform(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.matrix.reset();
        this.matrix.setValues(new float[]{f2, f4, f6 * this.scale, f3, f5, f7 * this.scale, 0.0f, 0.0f, 1.0f});
        this.canvas.concat(this.matrix);
    }

    public void arc(float f2, float f3, float f4, float f5, float f6, boolean z) {
        Path.Direction direction;
        float f7 = f2 * this.scale;
        float f8 = f3 * this.scale;
        float f9 = f4 * this.scale;
        float degrees = (float) Math.toDegrees((double) f5);
        float degrees2 = ((float) Math.toDegrees((double) f6)) - degrees;
        if (Math.abs(degrees2) >= 360.0f) {
            Path path2 = this.path;
            if (z) {
                direction = Path.Direction.CCW;
            } else {
                direction = Path.Direction.CW;
            }
            path2.addCircle(f7, f8, f9, direction);
            return;
        }
        float modulus = modulus(degrees2, 360.0f);
        if (z && modulus < 360.0f) {
            modulus = (360.0f - modulus) * -1.0f;
        }
        this.path.arcTo(new RectF(f7 - f9, f8 - f9, f7 + f9, f8 + f9), degrees, modulus);
    }
}
