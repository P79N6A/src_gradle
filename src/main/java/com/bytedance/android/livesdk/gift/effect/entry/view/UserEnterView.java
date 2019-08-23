package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Keep;
import android.support.v4.graphics.ColorUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.livesdk.gift.effect.entry.e.a;
import com.bytedance.android.livesdk.gift.effect.normal.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

@Keep
public class UserEnterView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int baseLineY;
    private Bitmap bgBitmap;
    private RectF bgRectF;
    private Paint clearPaint;
    private ComposeShader composeLightShader;
    private int descTextColor;
    private String descriptionStr;
    private int grade;
    public Bitmap honorLevelBm;
    private RectF honorLevelDrawRect;
    public Rect honorLevelRect;
    private float honorPaddingLeft;
    private float honorPaddingTop;
    private boolean isPlayLight;
    private boolean isPlayLine;
    private boolean isRTL;
    private boolean isStopDraw;
    private Bitmap lightComposeBm;
    private Canvas lightComposeCanvas;
    private Shader lightMaskShader;
    private Shader lightShader;
    private Bitmap lineBitmap;
    private Shader lineBitmapShader;
    private Canvas lineCanvas;
    private int lineColor;
    private Paint linePaint;
    private Shader lineShader;
    private Matrix mGradientMatrix;
    private float mLightTranslate;
    private Matrix mLineMatrix;
    private float mLineTranslate;
    private Paint mPaint;
    private Path mPathBg;
    private NinePatch ninePatch;
    private Bitmap starBm;
    private RectF starDrawRect;
    private float starPadding;
    private Rect starRect;
    private Paint textPaint;
    private float textWidth;
    private float viewHeight;
    private float viewWidth;

    public void stopDraw() {
        this.isStopDraw = true;
    }

    private float measureViewHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9510, new Class[0], Float.TYPE)) {
            return getResources().getDimension(C0906R.dimen.qn);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9510, new Class[0], Float.TYPE)).floatValue();
    }

    public void playAnim() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9513, new Class[0], Void.TYPE);
        } else if (this.grade == 2) {
            playLineAnim();
        } else {
            playLightAnim();
        }
    }

    private float measureViewWidth() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9509, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9509, new Class[0], Float.TYPE)).floatValue();
        }
        float dimension = getResources().getDimension(C0906R.dimen.qw);
        this.textPaint.setTextSize(getResources().getDimension(C0906R.dimen.qq));
        float dimension2 = getResources().getDimension(C0906R.dimen.qs) + dimension + dimension + this.textPaint.measureText(this.descriptionStr) + dimension + getResources().getDimension(C0906R.dimen.qy) + dimension;
        if (dimension2 <= getResources().getDimension(C0906R.dimen.qo)) {
            dimension2 = getResources().getDimension(C0906R.dimen.qo);
        }
        this.textPaint.setTextAlign(Paint.Align.LEFT);
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f2 = fontMetrics.top;
        this.baseLineY = ((int) ((this.viewHeight - f2) - fontMetrics.bottom)) / 2;
        this.textWidth = getResources().getDimension(C0906R.dimen.qs) + dimension + dimension;
        return dimension2;
    }

    public void playLightAnim() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9514, new Class[0], Void.TYPE);
        } else if (!this.isPlayLight) {
            this.isPlayLight = true;
            int color = getResources().getColor(C0906R.color.ai2);
            int color2 = getResources().getColor(C0906R.color.ai4);
            int color3 = getResources().getColor(C0906R.color.ai3);
            this.mGradientMatrix = new Matrix();
            if (this.isRTL) {
                f2 = this.viewWidth;
            } else {
                f2 = 0.0f;
            }
            this.mLightTranslate = f2;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, color, color, Shader.TileMode.CLAMP);
            this.lightShader = linearGradient;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 30.0f, 7.0f, new int[]{color3, color2, color3}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            this.lightMaskShader = linearGradient2;
            this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, PorterDuff.Mode.DST_ATOP);
            this.lightComposeBm = Bitmap.createBitmap((int) this.viewWidth, (int) this.viewHeight, Bitmap.Config.ARGB_8888);
            this.lightComposeCanvas = new Canvas(this.lightComposeBm);
            invalidate();
        }
    }

    private void initBitmap() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9504, new Class[0], Void.TYPE);
            return;
        }
        this.honorLevelBm = Bitmap.createBitmap((int) getResources().getDimension(C0906R.dimen.qs), (int) getResources().getDimension(C0906R.dimen.qr), Bitmap.Config.ARGB_8888);
        this.honorLevelRect = new Rect(0, 0, this.honorLevelBm.getWidth(), this.honorLevelBm.getHeight());
        this.starBm = BitmapFactory.decodeResource(getResources(), 2130841348);
        this.starRect = new Rect(0, 0, this.starBm.getWidth(), this.starBm.getHeight());
        this.bgBitmap = BitmapFactory.decodeResource(getResources(), 2130840984);
        byte[] ninePatchChunk = this.bgBitmap.getNinePatchChunk();
        this.bgRectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        if (this.isRTL) {
            this.starBm = b.c(this.starBm);
            this.bgBitmap = b.c(this.bgBitmap);
            this.starDrawRect = new RectF(this.starPadding, this.starPadding, this.starPadding + getResources().getDimension(C0906R.dimen.qy), this.starPadding + getResources().getDimension(C0906R.dimen.qx));
            this.honorLevelDrawRect = new RectF((this.viewWidth - this.honorPaddingLeft) - getResources().getDimension(C0906R.dimen.qs), this.honorPaddingTop, this.viewWidth - this.honorPaddingLeft, getResources().getDimension(C0906R.dimen.qr) + this.honorPaddingTop);
        } else {
            this.starDrawRect = new RectF((this.viewWidth - this.starPadding) - getResources().getDimension(C0906R.dimen.qy), this.starPadding, this.viewWidth - this.starPadding, this.starPadding + getResources().getDimension(C0906R.dimen.qx));
            this.honorLevelDrawRect = new RectF(this.honorPaddingLeft, this.honorPaddingTop, getResources().getDimension(C0906R.dimen.qs) + this.honorPaddingLeft, getResources().getDimension(C0906R.dimen.qr) + this.honorPaddingTop);
        }
        this.ninePatch = new NinePatch(this.bgBitmap, ninePatchChunk, null);
    }

    public void playLineAnim() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9515, new Class[0], Void.TYPE);
        } else if (!this.isPlayLine) {
            this.isPlayLine = true;
            this.mLineMatrix = new Matrix();
            if (this.isRTL) {
                f2 = this.viewWidth;
            } else {
                f2 = -this.viewWidth;
            }
            this.mLineTranslate = f2 * 3.0f;
            this.lineColor = getResources().getColor(C0906R.color.ai5);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth * 4.0f, 0.0f, ColorUtils.setAlphaComponent(this.lineColor, 180), ColorUtils.setAlphaComponent(this.lineColor, 180), Shader.TileMode.CLAMP);
            this.lineShader = linearGradient;
            this.lineBitmap = Bitmap.createBitmap((int) (this.viewWidth * 4.0f), (int) this.viewHeight, Bitmap.Config.ARGB_8888);
            this.lineCanvas = new Canvas(this.lineBitmap);
            Bitmap bitmap = this.lineBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.lineBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            float f3 = this.viewWidth / 4.0f;
            float f4 = this.viewHeight / 4.0f;
            float dimension = getResources().getDimension(C0906R.dimen.qu);
            float dimension2 = getResources().getDimension(C0906R.dimen.qt);
            float f5 = f3 * 2.0f;
            float f6 = f4 * 2.0f;
            float f7 = f5 + dimension;
            float f8 = f3 * 1.0f;
            float f9 = f4 * 3.0f;
            float f10 = 0.0f * f3;
            float f11 = f10 + dimension;
            float f12 = f3 * 3.0f;
            float f13 = f4 * 1.0f;
            float f14 = dimension + f12;
            float[] fArr = {f5, f6, f7, f6, f8, f9, f8 + dimension, f9, this.viewWidth + f10, f6, this.viewWidth + f11, f6, f5 + this.viewWidth, f9, f7 + this.viewWidth, f9, this.viewWidth + f12, f13, this.viewWidth + f14, f13, (this.viewWidth * 2.0f) + f10, f9, (this.viewWidth * 2.0f) + f11, f9, (this.viewWidth * 2.0f) + f12, f13, (this.viewWidth * 2.0f) + f14, f13, f10 + (this.viewWidth * 3.0f), f9, f11 + (this.viewWidth * 3.0f), f9, f12 + (this.viewWidth * 3.0f), f13, f14 + (this.viewWidth * 3.0f), f13};
            this.lineCanvas.drawPaint(this.clearPaint);
            this.linePaint.setShader(this.lineShader);
            this.linePaint.setStrokeWidth(dimension2);
            this.lineCanvas.drawLines(fArr, this.linePaint);
            invalidate();
        }
    }

    public UserEnterView(Context context) {
        this(context, null);
    }

    private void init(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 9503, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 9503, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.isRTL = false;
        this.mPathBg = new Path();
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.textPaint = new Paint();
        this.textPaint.setAntiAlias(true);
        this.clearPaint = new Paint();
        this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.linePaint = new Paint();
        this.linePaint.setAntiAlias(true);
        this.viewWidth = measureViewWidth();
        this.viewHeight = measureViewHeight();
        this.descTextColor = getResources().getColor(C0906R.color.ai6);
        this.honorPaddingLeft = getResources().getDimension(C0906R.dimen.qw);
        this.starPadding = getResources().getDimension(C0906R.dimen.qv);
        this.honorPaddingTop = (this.viewHeight - getResources().getDimension(C0906R.dimen.qr)) / 2.0f;
        initBitmap();
        initPath(this.viewWidth, this.viewHeight);
    }

    private void initDescription(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 9507, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 9507, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.descriptionStr = str;
        this.textPaint.setTextSize(getResources().getDimension(C0906R.dimen.qq));
        float measureText = this.textPaint.measureText(this.descriptionStr);
        float dimension = getResources().getDimension(C0906R.dimen.qp);
        if (measureText > dimension) {
            while (measureText > dimension) {
                this.descriptionStr = subString(this.descriptionStr, 0, this.descriptionStr.codePointCount(0, this.descriptionStr.length()) - 1);
                measureText = this.textPaint.measureText(this.descriptionStr);
            }
            this.descriptionStr += "…";
        }
        if (this.grade == 2) {
            this.descriptionStr += " " + getResources().getString(C0906R.string.cvw);
            this.descTextColor = getResources().getColor(C0906R.color.ai5);
            return;
        }
        this.descriptionStr += " " + getResources().getString(C0906R.string.cvx);
        this.descTextColor = getResources().getColor(C0906R.color.ai6);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, changeQuickRedirect, false, 9512, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, changeQuickRedirect, false, 9512, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (!this.isStopDraw) {
            this.ninePatch.draw(canvas, this.bgRectF);
            this.mPaint.reset();
            this.mPaint.setAntiAlias(true);
            canvas.drawBitmap(this.honorLevelBm, this.honorLevelRect, this.honorLevelDrawRect, this.mPaint);
            this.textPaint.setColor(this.descTextColor);
            canvas.drawText(this.descriptionStr, this.textWidth, (float) this.baseLineY, this.textPaint);
            canvas.drawBitmap(this.starBm, this.starRect, this.starDrawRect, this.mPaint);
            if (this.isPlayLight) {
                this.lightComposeCanvas.drawPaint(this.clearPaint);
                if (this.isRTL) {
                    this.mLightTranslate -= 30.0f;
                } else {
                    this.mLightTranslate += 30.0f;
                }
                this.mGradientMatrix.setTranslate(this.mLightTranslate, 0.0f);
                this.lightMaskShader.setLocalMatrix(this.mGradientMatrix);
                this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, PorterDuff.Mode.DST_ATOP);
                this.mPaint.setShader(this.composeLightShader);
                this.lightComposeCanvas.drawPath(this.mPathBg, this.mPaint);
                this.mPaint.setAlpha(SearchJediMixFeedAdapter.f42517f);
                canvas.drawBitmap(this.lightComposeBm, 0.0f, 0.0f, this.mPaint);
                if (this.mLightTranslate >= this.viewWidth * 1.5f) {
                    this.isPlayLight = false;
                    this.mLightTranslate = (-this.viewWidth) / 2.0f;
                }
            }
            if (this.isPlayLine) {
                if (this.isRTL) {
                    this.mLineTranslate -= 60.0f;
                } else {
                    this.mLineTranslate += 60.0f;
                }
                this.mLineMatrix.setTranslate(this.mLineTranslate, 0.0f);
                this.lineBitmapShader.setLocalMatrix(this.mLineMatrix);
                this.mPaint.setAlpha(240);
                this.mPaint.setShader(this.lineBitmapShader);
                canvas.drawPath(this.mPathBg, this.mPaint);
                if (this.mLineTranslate >= this.viewWidth * 4.0f) {
                    this.isPlayLine = false;
                    this.mLineTranslate = -this.viewWidth;
                }
            }
            if ((this.isPlayLight || this.isPlayLine) && (this.mLightTranslate <= this.viewWidth * 1.5f || this.mLineTranslate <= this.viewWidth * 4.0f)) {
                postInvalidateDelayed(20);
            }
        }
    }

    public void setupUI(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 9506, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 9506, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.grade = aVar.j;
        initDescription(aVar.f14848c);
        this.viewWidth = measureViewWidth();
        this.viewHeight = measureViewHeight();
        if (this.grade == 0) {
            this.bgBitmap = BitmapFactory.decodeResource(getResources(), 2130840985);
            this.starBm = BitmapFactory.decodeResource(getResources(), 2130841348);
        } else if (this.grade == 2) {
            this.bgBitmap = BitmapFactory.decodeResource(getResources(), 2130840983);
            this.starBm = BitmapFactory.decodeResource(getResources(), 2130841347);
        } else {
            this.bgBitmap = BitmapFactory.decodeResource(getResources(), 2130840984);
            this.starBm = BitmapFactory.decodeResource(getResources(), 2130841348);
        }
        byte[] ninePatchChunk = this.bgBitmap.getNinePatchChunk();
        this.bgRectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        if (this.isRTL) {
            this.starBm = b.c(this.starBm);
            this.bgBitmap = b.c(this.bgBitmap);
            this.starDrawRect = new RectF(this.starPadding, this.starPadding, this.starPadding + getResources().getDimension(C0906R.dimen.qy), this.starPadding + getResources().getDimension(C0906R.dimen.qx));
            this.honorLevelDrawRect = new RectF((this.viewWidth - this.honorPaddingLeft) - getResources().getDimension(C0906R.dimen.qs), this.honorPaddingTop, this.viewWidth - this.honorPaddingLeft, getResources().getDimension(C0906R.dimen.qr) + this.honorPaddingTop);
        } else {
            this.starDrawRect = new RectF((this.viewWidth - this.starPadding) - getResources().getDimension(C0906R.dimen.qy), this.starPadding, this.viewWidth - this.starPadding, this.starPadding + getResources().getDimension(C0906R.dimen.qx));
            this.honorLevelDrawRect = new RectF(this.honorPaddingLeft, this.honorPaddingTop, getResources().getDimension(C0906R.dimen.qs) + this.honorPaddingLeft, getResources().getDimension(C0906R.dimen.qr) + this.honorPaddingTop);
        }
        this.ninePatch = new NinePatch(this.bgBitmap, ninePatchChunk, null);
        if (this.grade == 0) {
            if (com.bytedance.android.livesdkapi.a.a.f18616d) {
                this.honorLevelBm = BitmapFactory.decodeResource(getResources(), 2130841420);
            } else {
                this.honorLevelBm = BitmapFactory.decodeResource(getResources(), 2130841421);
            }
            this.honorLevelRect = new Rect(0, 0, this.honorLevelBm.getWidth(), this.honorLevelBm.getHeight());
        } else {
            k.a(aVar.h, 0, 0, (q.b) new q.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14867a;

                public final void a(Bitmap bitmap) {
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f14867a, false, 9516, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f14867a, false, 9516, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    if (bitmap != null) {
                        UserEnterView.this.honorLevelBm = bitmap;
                        UserEnterView.this.honorLevelRect = new Rect(0, 0, UserEnterView.this.honorLevelBm.getWidth(), UserEnterView.this.honorLevelBm.getHeight());
                    }
                }
            });
        }
        initPath(this.viewWidth, this.viewHeight);
        requestLayout();
    }

    public UserEnterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void initPath(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 9505, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 9505, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        float f4 = f3 - 1.0f;
        RectF rectF = new RectF(1.0f, 1.0f, f4, f4);
        this.mPathBg.moveTo(f2, 1.0f);
        this.mPathBg.lineTo((float) (((int) f3) / 2), 1.0f);
        this.mPathBg.arcTo(rectF, 90.0f, 180.0f, true);
        this.mPathBg.lineTo(f2, 1.0f);
        this.mPathBg.lineTo(f2, f4);
        this.mPathBg.close();
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 9511, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 9511, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        this.viewWidth = measureViewWidth();
        this.viewHeight = measureViewHeight();
        setMeasuredDimension((int) this.viewWidth, (int) this.viewHeight);
    }

    public UserEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.descriptionStr = "";
        init(context);
    }

    private String subString(String str, int i, int i2) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 9508, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, String.class)) {
            return str2.substring(str2.offsetByCodePoints(0, i), str2.offsetByCodePoints(0, i2));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 9508, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, String.class);
    }
}
