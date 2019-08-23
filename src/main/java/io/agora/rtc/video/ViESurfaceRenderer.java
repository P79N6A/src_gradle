package io.agora.rtc.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Process;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ViESurfaceRenderer implements SurfaceHolder.Callback {
    private Bitmap bitmap;
    private float bottomScale = 1.0f;
    private ByteBuffer byteBuffer;
    private Rect dest = new Rect();
    private float leftScale = 0.0f;
    private float rightScale = 1.0f;
    private Rect source = new Rect();
    private SurfaceHolder surfaceHolder;
    private float topScale = 0.0f;

    public void DrawBitmap() {
        if (this.bitmap != null) {
            Canvas lockCanvas = this.surfaceHolder.lockCanvas();
            if (lockCanvas != null) {
                lockCanvas.drawBitmap(this.bitmap, this.source, this.dest, null);
                this.surfaceHolder.unlockCanvasAndPost(lockCanvas);
            }
        }
    }

    public void DrawByteBuffer() {
        if (this.byteBuffer != null) {
            this.byteBuffer.rewind();
            this.bitmap.copyPixelsFromBuffer(this.byteBuffer);
            DrawBitmap();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder2) {
        this.bitmap = null;
        this.byteBuffer = null;
    }

    public ViESurfaceRenderer(SurfaceView surfaceView) {
        this.surfaceHolder = surfaceView.getHolder();
        if (this.surfaceHolder != null) {
            this.surfaceHolder.addCallback(this);
            surfaceCreated(this.surfaceHolder);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder2) {
        Canvas lockCanvas = this.surfaceHolder.lockCanvas();
        if (lockCanvas != null) {
            Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            if (surfaceFrame != null) {
                changeDestRect(surfaceFrame.right - surfaceFrame.left, surfaceFrame.bottom - surfaceFrame.top);
            }
            this.surfaceHolder.unlockCanvasAndPost(lockCanvas);
        }
    }

    public ByteBuffer CreateByteBuffer(int i, int i2) {
        if (this.bitmap == null) {
            this.bitmap = CreateBitmap(i, i2);
            this.byteBuffer = ByteBuffer.allocateDirect(i * i2 * 2);
        }
        return this.byteBuffer;
    }

    private void changeDestRect(int i, int i2) {
        this.dest.right = (int) (((float) this.dest.left) + (Math.abs(this.leftScale - this.rightScale) * ((float) i)));
        this.dest.bottom = (int) (((float) this.dest.top) + (Math.abs(this.topScale - this.bottomScale) * ((float) i2)));
    }

    private void saveBitmapToJPEG(int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(String.format("/sdcard/render_%d.jpg", new Object[]{Long.valueOf(System.currentTimeMillis())}));
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public Bitmap CreateBitmap(int i, int i2) {
        if (this.bitmap == null) {
            try {
                Process.setThreadPriority(-4);
            } catch (Exception unused) {
            }
        }
        changeDestRect(i, i2);
        this.bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        this.source.left = 0;
        this.source.top = 0;
        this.source.bottom = i2;
        this.source.right = i;
        return this.bitmap;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder2, int i, int i2, int i3) {
        changeDestRect(i2, i3);
    }

    public void SetCoordinates(float f2, float f3, float f4, float f5) {
        this.leftScale = f2;
        this.topScale = f3;
        this.rightScale = f4;
        this.bottomScale = f5;
    }
}
