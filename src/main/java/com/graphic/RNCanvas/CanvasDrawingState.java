package com.graphic.RNCanvas;

import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;

public class CanvasDrawingState {
    public int[] fillStyle;
    public float globalAlpha;
    public float lineDashOffset;
    public LinearGradient mLinearGradient;
    public float miterLimit;
    private String primitiveLineCap;
    private float[] primitiveLineDash;
    private String primitiveLineJoin;
    private String primitiveTextAlign;
    public float shadowBlur;
    public int[] shadowColor;
    public float shadowOffsetX;
    public float shadowOffsetY;
    public Paint.Cap strokeLineCap;
    public DashPathEffect strokeLineDash;
    public Paint.Join strokeLineJoin;
    public float strokeLineWidth;
    public int[] strokeStyle;
    public Paint.Align textAlign;
    public int textBaseline;
    public float textSize;

    public CanvasDrawingState() {
        setUp();
    }

    private void setUp() {
        this.globalAlpha = 1.0f;
        this.fillStyle = new int[]{255, 0, 0, 0};
        this.strokeStyle = new int[]{255, 0, 0, 0};
        this.strokeLineWidth = 1.0f;
        this.strokeLineCap = Paint.Cap.BUTT;
        this.strokeLineJoin = Paint.Join.MITER;
        this.miterLimit = 0.0f;
        this.lineDashOffset = 0.0f;
        this.strokeLineDash = new DashPathEffect(new float[]{0.0f, 0.0f}, this.lineDashOffset);
        this.textSize = 10.0f;
        this.textBaseline = 0;
        this.textAlign = Paint.Align.LEFT;
        this.shadowColor = new int[]{0, 0, 0, 0};
        this.shadowBlur = 0.0f;
        this.shadowOffsetX = 0.0f;
        this.shadowOffsetY = 0.0f;
        this.primitiveTextAlign = "left";
        this.primitiveLineCap = "butt";
        this.primitiveLineJoin = "miter";
        this.primitiveLineDash = new float[]{0.0f, 0.0f};
        this.mLinearGradient = null;
    }

    public void setGlobalAlpha(float f2) {
        this.globalAlpha = f2;
    }

    public void setLinearGradient(LinearGradient linearGradient) {
        this.mLinearGradient = linearGradient;
    }

    public void setMiterLimit(float f2) {
        this.miterLimit = f2;
    }

    public void setShadowBlur(float f2) {
        this.shadowBlur = f2;
    }

    public void setShadowOffsetX(float f2) {
        this.shadowOffsetX = f2;
    }

    public void setShadowOffsetY(float f2) {
        this.shadowOffsetY = f2;
    }

    public void setStrokeLineWidth(float f2) {
        this.strokeLineWidth = f2;
    }

    public void setTextSize(float f2) {
        this.textSize = f2;
    }

    public void setFillStyle(float[] fArr) {
        this.fillStyle = CanvasConvert.convertColor(fArr);
    }

    public void setShadowColor(float[] fArr) {
        this.shadowColor = CanvasConvert.convertColor(fArr);
    }

    public void setStrokeStyle(float[] fArr) {
        this.strokeStyle = CanvasConvert.convertColor(fArr);
    }

    public void setTextBaseline(String str) {
        this.textBaseline = CanvasConvert.convertTextBaseline(str);
    }

    public CanvasDrawingState(CanvasDrawingState canvasDrawingState) {
        setUp(canvasDrawingState);
    }

    public void setLineDashOffset(float f2) {
        this.lineDashOffset = f2;
        this.strokeLineDash = CanvasConvert.convertLineDash(this.primitiveLineDash, this.lineDashOffset);
    }

    public void setStrokeLineCap(String str) {
        this.primitiveLineCap = str;
        this.strokeLineCap = CanvasConvert.convertLineCap(str);
    }

    public void setStrokeLineDash(float[] fArr) {
        this.primitiveLineDash = fArr;
        this.strokeLineDash = CanvasConvert.convertLineDash(fArr, this.lineDashOffset);
    }

    public void setStrokeLineJoin(String str) {
        this.primitiveLineJoin = str;
        this.strokeLineJoin = CanvasConvert.convertLineJoin(str);
    }

    public void setTextAlign(String str) {
        this.primitiveTextAlign = str;
        this.textAlign = CanvasConvert.convertTextAlign(str);
    }

    private void setUp(CanvasDrawingState canvasDrawingState) {
        this.globalAlpha = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.globalAlpha);
        this.fillStyle = CanvasDeepCopy.deepCopyIntList(canvasDrawingState.fillStyle);
        this.strokeStyle = CanvasDeepCopy.deepCopyIntList(canvasDrawingState.strokeStyle);
        this.strokeLineWidth = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.strokeLineWidth);
        this.strokeLineCap = CanvasConvert.convertLineCap(canvasDrawingState.primitiveLineCap);
        this.strokeLineJoin = CanvasConvert.convertLineJoin(canvasDrawingState.primitiveLineJoin);
        this.miterLimit = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.miterLimit);
        this.lineDashOffset = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.lineDashOffset);
        this.strokeLineDash = CanvasConvert.convertLineDash(canvasDrawingState.primitiveLineDash, this.lineDashOffset);
        this.textSize = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.textSize);
        this.textBaseline = CanvasDeepCopy.deepCopyInt(canvasDrawingState.textBaseline);
        this.textAlign = CanvasConvert.convertTextAlign(canvasDrawingState.primitiveTextAlign);
        this.shadowColor = CanvasDeepCopy.deepCopyIntList(canvasDrawingState.shadowColor);
        this.shadowBlur = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.shadowBlur);
        this.shadowOffsetX = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.shadowOffsetX);
        this.shadowOffsetY = CanvasDeepCopy.deepCopyFloat(canvasDrawingState.shadowOffsetY);
        this.primitiveTextAlign = CanvasDeepCopy.deepCopyString(canvasDrawingState.primitiveTextAlign);
        this.primitiveLineCap = CanvasDeepCopy.deepCopyString(canvasDrawingState.primitiveLineCap);
        this.primitiveLineJoin = CanvasDeepCopy.deepCopyString(canvasDrawingState.primitiveLineJoin);
        this.primitiveLineDash = CanvasDeepCopy.deepCopyFloatList(canvasDrawingState.primitiveLineDash);
    }
}
