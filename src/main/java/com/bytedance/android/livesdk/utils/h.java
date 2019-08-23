package com.bytedance.android.livesdk.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.bytedance.android.live.core.utils.ac;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h extends HandlerThread implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17601a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f17602b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f17603c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f17604d = {2130840616, 2130840617, 2130840618, 2130840619, 2130840620, 2130840621, 2130840622, 2130840623, 2130840624, 2130840625, 2130840626, 2130840627, 2130840628, 2130840629, 2130840630};

    /* renamed from: e  reason: collision with root package name */
    private Surface f17605e;

    /* renamed from: f  reason: collision with root package name */
    private a f17606f;
    private int g = -1;
    private Bitmap h;
    private Bitmap i;
    private Bitmap[] j;
    private Paint k;
    private int l;
    private Rect m;
    private Rect n;
    private Rect o;
    private boolean p;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f17609a;

        /* renamed from: b  reason: collision with root package name */
        public int f17610b;

        /* renamed from: c  reason: collision with root package name */
        public int f17611c;
    }

    public final boolean quitSafely() {
        if (PatchProxy.isSupport(new Object[0], this, f17601a, false, 13626, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17601a, false, 13626, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean quitSafely = super.quitSafely();
        if (this.f17603c != null) {
            this.f17603c.sendEmptyMessage(235);
        }
        return quitSafely;
    }

    public final void onLooperPrepared() {
        if (PatchProxy.isSupport(new Object[0], this, f17601a, false, 13621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17601a, false, 13621, new Class[0], Void.TYPE);
            return;
        }
        super.onLooperPrepared();
        this.f17603c = new Handler(getLooper(), this);
        a();
        if (PatchProxy.isSupport(new Object[0], this, f17601a, false, 13624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17601a, false, 13624, new Class[0], Void.TYPE);
            return;
        }
        ImagePipelineFactory.getInstance().getImagePipeline().fetchDecodedImage(ImageRequest.fromUri(this.f17606f.f17609a), null).subscribe(new BaseBitmapDataSubscriber() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17607a;

            public final void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
            }

            public final void onNewResultImpl(@Nullable Bitmap bitmap) {
                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f17607a, false, 13629, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f17607a, false, 13629, new Class[]{Bitmap.class}, Void.TYPE);
                } else if (bitmap != null) {
                    if (h.this.f17602b != null) {
                        h.this.f17602b.recycle();
                    }
                    h.this.f17602b = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                    h.this.a();
                }
            }
        }, CallerThreadExecutor.getInstance());
    }

    public final void a() {
        Bitmap bitmap;
        if (PatchProxy.isSupport(new Object[0], this, f17601a, false, 13625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17601a, false, 13625, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.h != null && !this.h.isRecycled()) {
                this.h.recycle();
            }
            this.h = Bitmap.createScaledBitmap(this.f17602b, this.f17606f.f17610b, this.f17606f.f17611c, false);
            NativeBlurFilter.iterativeBoxBlur(this.h, 3, 5);
            if (this.i != null && !this.i.isRecycled()) {
                this.i.recycle();
            }
            int i2 = (int) (((float) this.f17606f.f17610b) * 0.36290324f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f17602b, i2, i2, false);
            if (PatchProxy.isSupport(new Object[]{createScaledBitmap}, null, ac.f8233a, true, 1255, new Class[]{Bitmap.class}, Bitmap.class)) {
                bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{createScaledBitmap}, null, ac.f8233a, true, 1255, new Class[]{Bitmap.class}, Bitmap.class);
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                paint.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-12434878);
                canvas.drawCircle((float) (createScaledBitmap.getWidth() / 2), (float) (createScaledBitmap.getHeight() / 2), (float) (createScaledBitmap.getWidth() / 2), paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(createScaledBitmap, rect, rect, paint);
                bitmap = createBitmap;
            }
            this.i = bitmap;
            createScaledBitmap.recycle();
            this.l = this.f17604d.length;
            this.j = new Bitmap[this.l];
            Resources resources = ac.e().getResources();
            for (int i3 = 0; i3 < this.l; i3++) {
                this.j[i3] = BitmapFactory.decodeResource(resources, this.f17604d[i3]);
            }
            if (this.f17603c != null) {
                this.f17603c.sendEmptyMessage(233);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean handleMessage(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f17601a, false, 13622, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f17601a, false, 13622, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        }
        switch (message.what) {
            case 233:
                if (!PatchProxy.isSupport(new Object[0], this, f17601a, false, 13623, new Class[0], Void.TYPE)) {
                    if (!this.p && this.f17605e.isValid()) {
                        Canvas lockCanvas = this.f17605e.lockCanvas(this.m);
                        if (this.h.isRecycled() && this.f17602b != null && !this.f17602b.isRecycled()) {
                            this.h = Bitmap.createScaledBitmap(this.f17602b, this.f17606f.f17610b, this.f17606f.f17611c, false);
                        }
                        lockCanvas.drawBitmap(this.h, null, this.m, null);
                        if (this.g >= 0) {
                            Bitmap[] bitmapArr = this.j;
                            int i2 = this.g;
                            this.g = i2 + 1;
                            Bitmap bitmap = bitmapArr[i2];
                            if (bitmap != null && !bitmap.isRecycled()) {
                                lockCanvas.drawBitmap(bitmap, null, this.o, this.k);
                            }
                            if (this.g >= this.l) {
                                this.g = -1;
                            }
                        }
                        if (this.i != null && !this.i.isRecycled()) {
                            lockCanvas.drawBitmap(this.i, null, this.n, this.k);
                        }
                        this.f17605e.unlockCanvasAndPost(lockCanvas);
                        if (this.f17603c != null) {
                            this.f17603c.sendEmptyMessageDelayed(233, 130);
                            break;
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f17601a, false, 13623, new Class[0], Void.TYPE);
                    break;
                }
                break;
            case 234:
                if (this.g < 0) {
                    this.g = 0;
                    break;
                }
                break;
            case 235:
                if (!PatchProxy.isSupport(new Object[0], this, f17601a, false, 13628, new Class[0], Void.TYPE)) {
                    this.p = true;
                    if (this.f17602b != null && !this.f17602b.isRecycled()) {
                        this.f17602b.recycle();
                        this.f17602b = null;
                    }
                    if (this.h != null && !this.h.isRecycled()) {
                        this.h.recycle();
                        this.h = null;
                    }
                    if (this.i != null && !this.i.isRecycled()) {
                        this.i.recycle();
                        this.i = null;
                    }
                    if (this.j != null) {
                        for (Bitmap bitmap2 : this.j) {
                            if (bitmap2 != null && !bitmap2.isRecycled()) {
                                bitmap2.recycle();
                            }
                        }
                        this.j = null;
                    }
                    this.f17605e = null;
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f17601a, false, 13628, new Class[0], Void.TYPE);
                    break;
                }
        }
        return true;
    }

    public h(Surface surface, a aVar) {
        super("AudioEffectDrewThread");
        this.f17605e = surface;
        this.f17606f = aVar;
        this.m = new Rect(0, 0, aVar.f17610b, aVar.f17611c);
        int i2 = (int) (((float) aVar.f17610b) * 0.36290324f);
        int i3 = (aVar.f17610b - i2) / 2;
        int i4 = (aVar.f17611c - i2) / 2;
        this.n = new Rect(i3, i4, i3 + i2, i2 + i4);
        int i5 = (int) (((float) aVar.f17610b) * 0.5645161f);
        int i6 = (aVar.f17610b - i5) / 2;
        int i7 = (aVar.f17611c - i5) / 2;
        this.o = new Rect(i6, i7, i6 + i5, i5 + i7);
        this.k = new Paint(1);
        this.k.setAntiAlias(true);
        this.k.setFilterBitmap(true);
        this.k.setDither(true);
        this.f17602b = BitmapFactory.decodeResource(ac.e().getResources(), 2130841197);
    }
}
