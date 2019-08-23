package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Keep;
import android.support.v4.graphics.ColorUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.gift.d.g;
import com.bytedance.android.livesdk.gift.effect.a.a;
import com.bytedance.android.livesdk.gift.effect.normal.d.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

@Keep
public class NormalGiftView extends View implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Paint alphaPaint;
    private float bgHeight;
    private float bgMarginStart;
    private Paint clearPaint;
    private ComposeShader composeGiftShader;
    private ComposeShader composeLightShader;
    private int endColor;
    private Bitmap giftComposeBm;
    private Canvas giftComposeCanvas;
    private Shader giftMaskShader;
    private b giftMsg;
    private BitmapShader giftShader;
    private RectF grayBackgroundRectF;
    private Shader grayShader;
    private boolean isNeedDrawGrayLayer;
    private boolean isPlayLight;
    private boolean isRTL;
    private boolean isStopDraw;
    private Bitmap lightComposeBm;
    private Canvas lightComposeCanvas;
    private Shader lightMaskShader;
    private Shader lightShader;
    private a mBaseGiftView;
    private Matrix mDefaultTranslateMatrix;
    private Bitmap mGiftBaseViewBitmap;
    private float mGiftTranslate;
    private Matrix mGradientMatrix;
    private float mLightTranslate;
    private Paint mPaint;
    private float rectRadio;
    private int startColor;
    private float viewHeight;
    private float viewWidth;
    private RectF wholeBackgroundRectF;

    public void stopDraw() {
        this.isStopDraw = true;
    }

    public b getGiftMsg() {
        return this.giftMsg;
    }

    public void playAnimation() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9603, new Class[0], Void.TYPE);
            return;
        }
        if (this.isPlayLight) {
            initLightCanvas();
        }
        invalidate();
    }

    private void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9596, new Class[0], Void.TYPE);
            return;
        }
        this.isRTL = c.a(getContext());
        this.mBaseGiftView = new a(getContext());
        this.mBaseGiftView.setDrawingCacheListener(this);
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.clearPaint = new Paint();
        this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.alphaPaint = new Paint();
        this.alphaPaint.setAlpha(180);
        this.mGradientMatrix = new Matrix();
        this.mDefaultTranslateMatrix = new Matrix();
        this.mDefaultTranslateMatrix.setTranslate(1.0f, 0.0f);
        this.bgMarginStart = getResources().getDimension(C0906R.dimen.np);
        this.bgHeight = getResources().getDimension(C0906R.dimen.no);
        this.rectRadio = getResources().getDimension(C0906R.dimen.nq);
        this.viewWidth = (float) this.mBaseGiftView.getWidth();
        this.viewHeight = (float) this.mBaseGiftView.getHeight();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, getResources().getColor(C0906R.color.ac7), getResources().getColor(C0906R.color.ac7), Shader.TileMode.CLAMP);
        this.grayShader = linearGradient;
        this.grayShader.setLocalMatrix(this.mDefaultTranslateMatrix);
    }

    private void initLightCanvas() {
        int color;
        int color2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9597, new Class[0], Void.TYPE);
            return;
        }
        if (this.isRTL) {
            this.mLightTranslate = this.viewWidth + 150.0f;
            this.mGiftTranslate = this.viewWidth + 150.0f;
        } else {
            this.mLightTranslate = -(this.viewWidth + 150.0f);
            this.mGiftTranslate = -(this.viewWidth + 150.0f);
        }
        this.giftComposeBm = Bitmap.createBitmap((int) this.viewWidth, (int) this.viewHeight, Bitmap.Config.ARGB_8888);
        this.lightComposeBm = Bitmap.createBitmap((int) this.viewWidth, (int) this.viewHeight, Bitmap.Config.ARGB_8888);
        this.giftComposeCanvas = new Canvas(this.giftComposeBm);
        this.lightComposeCanvas = new Canvas(this.lightComposeBm);
        float f2 = this.viewHeight / 2.0f;
        float f3 = this.viewWidth;
        float f4 = this.viewHeight / 2.0f;
        if (this.isRTL) {
            color = getResources().getColor(C0906R.color.ack);
        } else {
            color = getResources().getColor(C0906R.color.acl);
        }
        int i = color;
        if (this.isRTL) {
            color2 = getResources().getColor(C0906R.color.acl);
        } else {
            color2 = getResources().getColor(C0906R.color.ack);
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, f2, f3, f4, i, color2, Shader.TileMode.CLAMP);
        this.giftMaskShader = linearGradient;
        float f5 = this.viewWidth;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f5, this.viewHeight, ColorUtils.setAlphaComponent(this.startColor, 255), ColorUtils.setAlphaComponent(this.endColor, 255), Shader.TileMode.CLAMP);
        this.lightShader = linearGradient2;
        LinearGradient linearGradient3 = new LinearGradient(0.0f, this.viewHeight / 2.0f, this.viewWidth, this.viewHeight / 2.0f, new int[]{getResources().getColor(C0906R.color.ack), getResources().getColor(C0906R.color.acl), getResources().getColor(C0906R.color.ack)}, new float[]{0.0f, 0.9f, 1.0f}, Shader.TileMode.CLAMP);
        this.lightMaskShader = linearGradient3;
        Bitmap bitmap = this.mGiftBaseViewBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.giftShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.composeGiftShader = new ComposeShader(this.giftShader, this.giftMaskShader, PorterDuff.Mode.DST_ATOP);
        this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, PorterDuff.Mode.DST_ATOP);
        this.giftShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.lightShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.composeGiftShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.composeLightShader.setLocalMatrix(this.mDefaultTranslateMatrix);
    }

    public NormalGiftView(Context context) {
        this(context, null);
    }

    private void drawNormalGift(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, changeQuickRedirect, false, 9604, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, changeQuickRedirect, false, 9604, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.drawBitmap(this.mGiftBaseViewBitmap, 0.0f, 0.0f, this.mPaint);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, changeQuickRedirect, false, 9602, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, changeQuickRedirect, false, 9602, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.isStopDraw || this.mGiftBaseViewBitmap == null || this.mGiftBaseViewBitmap.isRecycled()) {
            return;
        }
        if (this.isPlayLight) {
            drawLightGift(canvas);
        } else {
            drawNormalGift(canvas);
        }
    }

    public void setOrientation(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9599, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9599, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mBaseGiftView != null) {
            this.mBaseGiftView.setOrientation(i);
        }
    }

    public void updateDrawingCache(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 9600, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 9600, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.mGiftBaseViewBitmap = com.bytedance.android.livesdk.gift.effect.normal.e.b.a((View) this.mBaseGiftView);
        if (this.mGiftBaseViewBitmap != null) {
            Bitmap bitmap = this.mGiftBaseViewBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.giftShader = new BitmapShader(bitmap, tileMode, tileMode);
            invalidate();
        }
    }

    private void drawLightGift(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, changeQuickRedirect, false, 9605, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, changeQuickRedirect, false, 9605, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.giftComposeCanvas.drawPaint(this.clearPaint);
        this.lightComposeCanvas.drawPaint(this.clearPaint);
        if (this.isRTL) {
            this.mLightTranslate -= 45.0f;
            if (this.mGiftTranslate - this.mLightTranslate >= this.viewWidth * 0.2f) {
                this.mGiftTranslate = this.mLightTranslate + (this.viewWidth * 0.2f);
            }
        } else {
            this.mLightTranslate += 45.0f;
            if (this.mLightTranslate - this.mGiftTranslate >= this.viewWidth * 0.2f) {
                this.mGiftTranslate = this.mLightTranslate - (this.viewWidth * 0.2f);
            }
        }
        if (this.isNeedDrawGrayLayer) {
            this.mPaint.setShader(this.grayShader);
            canvas.drawRoundRect(this.grayBackgroundRectF, this.rectRadio, this.rectRadio, this.mPaint);
        }
        this.mGradientMatrix.setTranslate(this.mGiftTranslate, 0.0f);
        this.giftMaskShader.setLocalMatrix(this.mGradientMatrix);
        this.composeGiftShader = new ComposeShader(this.giftShader, this.giftMaskShader, PorterDuff.Mode.DST_IN);
        this.composeGiftShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.mPaint.setShader(this.composeGiftShader);
        this.giftComposeCanvas.drawRoundRect(this.wholeBackgroundRectF, this.rectRadio, this.rectRadio, this.mPaint);
        canvas.drawBitmap(this.giftComposeBm, 0.0f, 0.0f, this.alphaPaint);
        this.mGradientMatrix.setTranslate(this.mLightTranslate, 0.0f);
        this.lightMaskShader.setLocalMatrix(this.mGradientMatrix);
        this.composeLightShader = new ComposeShader(this.lightShader, this.lightMaskShader, PorterDuff.Mode.DST_ATOP);
        this.composeLightShader.setLocalMatrix(this.mDefaultTranslateMatrix);
        this.mPaint.setShader(this.composeLightShader);
        this.lightComposeCanvas.drawRoundRect(this.grayBackgroundRectF, this.rectRadio, this.rectRadio, this.mPaint);
        canvas.drawBitmap(this.lightComposeBm, 0.0f, 0.0f, this.mPaint);
        if (this.isRTL) {
            if (this.mGiftTranslate >= (-this.viewWidth)) {
                postInvalidateDelayed(25);
            }
        } else if (this.mGiftTranslate <= this.viewWidth) {
            postInvalidateDelayed(25);
        }
    }

    public NormalGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 9601, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 9601, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        this.viewWidth = (float) this.mBaseGiftView.getWidth();
        this.viewHeight = (float) this.mBaseGiftView.getHeight();
        setMeasuredDimension((int) this.viewWidth, (int) this.viewHeight);
    }

    public void settingUi(b bVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 9598, new Class[]{b.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 9598, new Class[]{b.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.isRTL = z;
        this.giftMsg = bVar;
        if (this.giftMsg.o * this.giftMsg.f14908b > 60) {
            this.isPlayLight = true;
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            this.isPlayLight = false;
        }
        int[] c2 = g.a().c(this.giftMsg.o * this.giftMsg.f14908b);
        this.startColor = getResources().getColor(c2[0]);
        this.endColor = getResources().getColor(c2[1]);
        this.mBaseGiftView.setUI(bVar);
        this.mGiftBaseViewBitmap = com.bytedance.android.livesdk.gift.effect.normal.e.b.a((View) this.mBaseGiftView);
        this.viewWidth = (float) this.mBaseGiftView.getWidth();
        this.viewHeight = (float) this.mBaseGiftView.getHeight();
        this.wholeBackgroundRectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
        float f2 = (this.viewHeight - this.bgHeight) / 2.0f;
        this.grayBackgroundRectF = new RectF(this.bgMarginStart, f2, this.viewWidth, this.viewHeight - f2);
        requestLayout();
    }

    public NormalGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
