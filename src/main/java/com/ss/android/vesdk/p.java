package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.FFMpegInvoker;
import com.ss.android.ttve.common.TETrackIndexManager;
import com.ss.android.ttve.model.MVInfoBean;
import com.ss.android.ttve.model.MVResourceBean;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.monitor.f;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEReverseCallback;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class p implements SurfaceTexture.OnFrameAvailableListener {
    public static boolean B;
    public MVInfoBean A;
    int C = -1;
    public String D;
    public double E;
    public double F;
    public double G;
    public double H;
    private TETrackIndexManager I = new TETrackIndexManager();
    private com.ss.android.ttve.a.a J = new com.ss.android.ttve.a.a();
    private String[] K;
    private String[] L;
    private String M;
    private com.ss.android.ttve.common.a N = new com.ss.android.ttve.common.a() {
        public final void a(int i, int i2, float f2, String str) {
            long j;
            long j2;
            int i3 = i;
            int i4 = i2;
            float f3 = f2;
            String str2 = str;
            if (i3 != 4101) {
                if (i3 != 4103) {
                    if (i3 != 4105) {
                        if (p.this.h != null) {
                            p.this.h.a(i3, i4, f3, str2);
                        }
                    } else if (p.this.f78042f != null) {
                        Message message = new Message();
                        message.what = i3;
                        message.obj = Float.valueOf(f2);
                        p.this.f78040d.sendMessage(message);
                    } else if (p.this.h != null) {
                        p.this.h.a(i3, i4, f3, str2);
                    }
                } else if (p.this.v) {
                    p.this.w.f78069d = p.this.h;
                    new Thread(p.this.w).start();
                    p.this.v = false;
                } else {
                    if (i4 == 1 || i4 == 0) {
                        p pVar = p.this;
                        long currentTimeMillis = System.currentTimeMillis() - pVar.u;
                        com.ss.android.ttve.monitor.e.a("te_composition_time", currentTimeMillis);
                        com.ss.android.ttve.monitor.e.a(1, "te_composition_time", currentTimeMillis);
                        if (com.ss.android.medialib.g.a(pVar.t)) {
                            int[] iArr = new int[10];
                            if (TEVideoUtils.getVideoFileInfo(pVar.t, iArr) == 0) {
                                long length = new File(pVar.t).length();
                                com.ss.android.ttve.monitor.e.a("te_composition_page_mode", (long) pVar.C);
                                double d2 = (double) length;
                                Double.isNaN(d2);
                                double d3 = (d2 / 1024.0d) / 1024.0d;
                                com.ss.android.ttve.monitor.e.a("te_composition_file_size", d3);
                                com.ss.android.ttve.monitor.e.a("te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.e.a("te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.e.a("te_composition_fps", (double) iArr[7]);
                                String str3 = iArr[0] + "x" + iArr[1];
                                if (TextUtils.isEmpty("te_composition_resolution")) {
                                    y.c("TEMonitor", "perfString: key is null");
                                } else {
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    TEMonitorInvoker.nativePerfString("te_composition_resolution", str3);
                                }
                                com.ss.android.ttve.monitor.e.a(1, "te_composition_page_mode", (long) pVar.C);
                                com.ss.android.ttve.monitor.e.a(1, "te_composition_resolution", iArr[0] + "x" + iArr[1]);
                                com.ss.android.ttve.monitor.e.a(1, "te_composition_fps", (double) iArr[7]);
                                com.ss.android.ttve.monitor.e.a(1, "te_composition_bit_rate", (double) iArr[6]);
                                com.ss.android.ttve.monitor.e.a(1, "te_composition_file_duration", (double) iArr[3]);
                                com.ss.android.ttve.monitor.e.a(1, "te_composition_file_size", d3);
                                int i5 = pVar.z.f31260c;
                                if (i5 != 0) {
                                    com.ss.android.ttve.monitor.e.a(1, "te_composition_time_filter_type", (long) i5);
                                }
                            }
                        }
                        boolean b2 = pVar.z.b();
                        long j3 = 0;
                        if (b2) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        com.ss.android.ttve.monitor.e.a(1, "te_composition_effect_add", j);
                        if (!b2) {
                            com.ss.android.ttve.monitor.e.a(1, "te_composition_effect_json", pVar.z.a(0));
                        }
                        boolean c2 = pVar.z.c();
                        if (c2) {
                            j2 = 0;
                        } else {
                            j2 = 1;
                        }
                        com.ss.android.ttve.monitor.e.a(1, "te_composition_info_sticker_add", j2);
                        if (!c2) {
                            com.ss.android.ttve.monitor.e.a(1, "te_composition_info_sticker_json", pVar.z.a(1));
                        }
                        if (!pVar.v()) {
                            j3 = 1;
                        }
                        com.ss.android.ttve.monitor.e.a(1, "te_composition_brush_add", j3);
                        pVar.z.a();
                        com.ss.android.ttve.monitor.e.a(com.ss.android.ttve.monitor.e.f31255b);
                        com.ss.android.ttve.monitor.e.a(1, "iesve_veeditor_composition_finish_file", pVar.f78039c);
                        com.ss.android.ttve.monitor.e.a(1, "iesve_veeditor_composition_finish_result", "succ");
                        com.ss.android.ttve.monitor.e.a(1, "iesve_veeditor_composition_finish_reason", "");
                        com.ss.android.ttve.monitor.e.b(1);
                    }
                    if (p.this.f78042f != null) {
                        Message message2 = new Message();
                        message2.what = 4103;
                        message2.arg1 = i4;
                        p.this.f78040d.sendMessage(message2);
                    } else if (p.this.h != null) {
                        p.this.h.a(i3, i4, f3, str2);
                    }
                }
            } else if (p.this.f78041e != null) {
                p.this.f78040d.sendEmptyMessage(4101);
            } else if (p.this.h != null) {
                p.this.h.a(i3, i4, f3, str2);
            }
        }
    };
    private com.ss.android.ttve.common.a O = new com.ss.android.ttve.common.a() {
        public final void a(int i, int i2, float f2, String str) {
            p.this.b();
            if (p.this.i != null) {
                p.this.i.a(i, i2, f2, str);
            }
            if (p.this.f78042f != null) {
                f fVar = p.this.f78040d;
                final int i3 = i;
                final int i4 = i2;
                final float f3 = f2;
                final String str2 = str;
                AnonymousClass1 r1 = new Runnable() {
                    public final void run() {
                        if (p.this.f78042f != null) {
                            p.this.f78042f.a(i3, i4, f3, str2);
                        }
                    }
                };
                fVar.post(r1);
            }
        }
    };
    private int P = 0;
    private int Q = 0;
    private Boolean R = Boolean.FALSE;
    private int S = -1;
    private int T = 0;
    private SurfaceView U;
    private TextureView V;
    private int W = 0;
    private int X = -1;
    private i Y;
    private h Z = h.ALIGN_PARENT_BOTTOM;

    /* renamed from: a  reason: collision with root package name */
    private aj f78037a = new aj(-1, -1);
    private j aa = j.CENTER;
    private boolean ab = false;
    private boolean ac = false;
    private boolean ad = false;
    private int ae = -1;
    private int af = -1;
    private int ag = -1;
    private int ah = -1;
    private com.ss.android.ttve.model.d ai;
    private boolean aj = false;
    private boolean ak = false;
    private boolean al = true;
    private boolean am = false;
    private Bitmap an = null;
    private float ao = 0.0f;
    private float ap = 1.0f;
    private float aq = 1.0f;
    private int ar = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
    private float as = 30.0f;
    @ColorInt
    private int at = -16777216;
    @ColorInt
    private int au = -16777216;
    private final TextureView.SurfaceTextureListener av = new TextureView.SurfaceTextureListener() {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            p.this.a();
            p.this.p.release();
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            p.this.l = i;
            p.this.m = i2;
            p.this.z();
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (p.this.o == surfaceTexture) {
                p.this.a(p.this.p);
            } else {
                p.this.p = new Surface(surfaceTexture);
                p.this.a(p.this.p);
            }
            p.this.o = surfaceTexture;
        }
    };
    private SurfaceHolder.Callback2 aw = new SurfaceHolder.Callback2() {
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            p.this.a();
        }

        public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            y.b("VEEditor", "surfaceRedrawNeeded...");
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            p.this.a(surfaceHolder.getSurface());
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            y.b("VEEditor", String.format("surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
            p.this.l = i2;
            p.this.m = i3;
            p.this.z();
            p pVar = p.this;
            y.a("VEEditor", "onSurfaceChanged...");
            if (i2 != 0 && i3 != 0) {
                pVar.n.setSurfaceSize(i2, i3);
            }
        }
    };
    private a.d ax = new a.d() {
        public final int a(int i) {
            y.b("VEEditor", "onOpenGLCreate: ret = " + i);
            return 0;
        }

        public final int b(int i) {
            y.b("VEEditor", "onOpenGLDestroy: ret = " + i);
            return 0;
        }

        public final int a(int i, double d2) {
            y.e("VEEditor", "onOpenGLDrawing: tex = " + i + " timeStamp = " + d2);
            if (p.this.q == 0) {
                com.ss.android.ttve.monitor.e.a(1, "te_edit_first_frame_time", System.currentTimeMillis() - p.this.s);
                if (p.this.g != null) {
                    p.this.g.a();
                }
            }
            p.this.q++;
            if (p.this.q == 30) {
                p.this.r = System.currentTimeMillis();
                if (p.this.s != p.this.r) {
                    y.b("VEEditor", "Render FPS = " + (30000.0f / ((float) (p.this.r - p.this.s))));
                    p.this.s = p.this.r;
                    p.this.q = 0;
                }
            }
            return 0;
        }
    };
    private a.C0395a ay = new a.C0395a() {
        public final int a(byte[] bArr, int i, int i2, boolean z) {
            if (bArr == null || i < 0 || i2 <= 0) {
                return -1;
            }
            if (p.this.x == null) {
                return -2;
            }
            p.this.x.a(bArr, i, i2, z);
            return 0;
        }
    };
    private a.b az = new a.b() {
        public final int a(byte[] bArr, int i, int i2, int i3, float f2) {
            if (p.this.y == null) {
                return -100;
            }
            if (bArr != null) {
                return p.this.y.a(bArr, i, i2, i3, f2);
            }
            Message message = new Message();
            message.what = 4117;
            p.this.f78040d.sendMessage(message);
            return 0;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.vesdk.runtime.b f78038b;

    /* renamed from: c  reason: collision with root package name */
    String f78039c = "mp4";

    /* renamed from: d  reason: collision with root package name */
    public f f78040d = new f(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public volatile VEListener.i f78041e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile VEListener.g f78042f = null;
    public volatile VEListener.k g = null;
    public m h = null;
    public m i = null;
    public int j = 0;
    public int k = -1;
    public int l = 0;
    public int m = 0;
    public TEInterface n;
    public SurfaceTexture o;
    public Surface p;
    public int q = 0;
    public long r = 0;
    public long s = 0;
    String t = null;
    long u = 0;
    public boolean v = false;
    public b w = null;
    public VEListener.j x = null;
    public VEListener.l y = null;
    public com.ss.android.ttve.monitor.f z = new com.ss.android.ttve.monitor.f();

    public enum a {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_NORMAL_SCORE(5),
        GET_FRAMES_MODE_NOEFFECT_SCORE(6);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        private a(int i) {
            this.mValue = i;
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        String f78066a;

        /* renamed from: b  reason: collision with root package name */
        public String f78067b;

        /* renamed from: c  reason: collision with root package name */
        String f78068c;

        /* renamed from: d  reason: collision with root package name */
        public m f78069d;

        /* renamed from: e  reason: collision with root package name */
        boolean f78070e;

        /* renamed from: f  reason: collision with root package name */
        public String f78071f;
        public int g = 50;
        public int h = 50;
        public int i = 100;
        public int j = 100;

        public final void run() {
            String str;
            if (TextUtils.isEmpty(this.f78067b) || TextUtils.isEmpty(this.f78068c) || this.f78070e) {
                if (this.f78069d != null) {
                    this.f78069d.a(4103, -205, 0.0f, "");
                }
                return;
            }
            this.f78070e = true;
            int executeFFmpegCommand = TEVideoUtils.executeFFmpegCommand(String.format("ffmpeg -y -i %s -vf palettegen %s", new Object[]{this.f78067b, this.f78066a}), null);
            if (executeFFmpegCommand != 0) {
                this.f78070e = false;
                if (this.f78069d != null) {
                    this.f78069d.a(4103, executeFFmpegCommand, 0.0f, "");
                }
                return;
            }
            if (this.f78071f != null) {
                str = String.format(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [2:v]scale=w=%d:h=%d[o0];[0:v][o0]overlay=x=%d-w/2:y=%d-h/2[o1];[o1][1:v]paletteuse -f gif %s", new Object[]{this.f78067b, this.f78066a, this.f78071f, Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), this.f78068c});
            } else {
                str = String.format(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", new Object[]{this.f78067b, this.f78066a, this.f78068c});
            }
            int executeFFmpegCommand2 = TEVideoUtils.executeFFmpegCommand(str, null);
            if (this.f78069d != null) {
                this.f78069d.a(4103, executeFFmpegCommand2, 0.0f, "");
            }
            this.f78070e = false;
        }

        b() {
        }
    }

    public enum c {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_CANVAS
    }

    public enum d {
        EDITOR_SEEK_FLAG_OnGoing(0),
        EDITOR_SEEK_FLAG_LastSeek(1),
        EDITOR_SEEK_FLAG_ToIframe(2),
        EDITOR_SEEK_FLAG_LAST_UpdateIn(EDITOR_SEEK_FLAG_LastSeek.getValue() | 4),
        EDITOR_SEEK_FLAG_LAST_UpdateOut(EDITOR_SEEK_FLAG_LastSeek.getValue() | 8),
        EDITOR_SEEK_FLAG_LAST_UpdateInOut(EDITOR_SEEK_FLAG_LastSeek.getValue() | 16),
        EDITOR_SEEK_FLAG_Forward(SearchJediMixFeedAdapter.f42517f),
        EDITOR_SEEK_FLAG_LAST_Forward(EDITOR_SEEK_FLAG_Forward.getValue() | EDITOR_SEEK_FLAG_LastSeek.getValue()),
        EDITOR_SEEK_FLAG_LAST_Clear(EDITOR_SEEK_FLAG_LastSeek.getValue() | 256),
        EDITOR_SEEK_FLAG_LAST_Accurate(EDITOR_SEEK_FLAG_LastSeek.getValue() | 640),
        EDITOR_SEEK_FLAG_LAST_Accurate_Clear(EDITOR_SEEK_FLAG_LastSeek.getValue() | 896);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        private d(int i) {
            this.mValue = i;
        }
    }

    public enum e {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        private e(int i) {
            this.mValue = i;
        }
    }

    class f extends Handler {
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 4101) {
                if (i != 4103) {
                    if (i != 4105) {
                        if (i == 4117 && p.this.y != null) {
                            p.this.y.a(null, -1, -1, -1, 0.0f);
                        }
                    } else if (p.this.f78042f != null) {
                        p.this.f78042f.a(((Float) message.obj).floatValue());
                    }
                } else if (p.this.f78042f != null) {
                    if (message.arg1 < 0) {
                        p.this.f78042f.a(message.arg1, 0, 0.0f, "");
                    } else {
                        p.this.f78042f.a();
                    }
                    p.this.f78042f = null;
                }
            } else if (p.this.f78041e != null) {
                p.this.f78041e.a(0);
                p.this.f78041e = null;
            }
        }

        public f(Looper looper) {
            super(looper);
        }
    }

    public enum g {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(SearchJediMixFeedAdapter.f42517f);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        public static g valueOf(int i) {
            if (i == 4) {
                return PREPARED;
            }
            if (i == 8) {
                return STARTED;
            }
            if (i == 16) {
                return PAUSED;
            }
            if (i == 32) {
                return SEEKING;
            }
            if (i == 64) {
                return STOPPED;
            }
            if (i == 128) {
                return COMPLETED;
            }
            if (i == 65535) {
                return ANY;
            }
            if (i == 1048576) {
                return NOTHING;
            }
            switch (i) {
                case 0:
                    return ERROR;
                case 1:
                    return IDLE;
                case 2:
                    return INITIALIZED;
                default:
                    return null;
            }
        }

        private g(int i) {
            this.mValue = i;
        }
    }

    public enum h {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL
    }

    public enum i {
        VIDEO_OUT_RATIO_1_1,
        VIDEO_OUT_RATIO_4_3,
        VIDEO_OUT_RATIO_3_4,
        VIDEO_OUT_RATIO_16_9,
        VIDEO_OUT_RATIO_9_16,
        VIDEO_OUT_RATIO_ORIGINAL
    }

    public enum j {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public final void a() {
        y.b("VEEditor", "surfaceDestroyed...");
        this.n.releasePreviewSurface();
    }

    public final void a(Surface surface) {
        Rect rect;
        y.a("VEEditor", "surfaceCreated...");
        this.al = false;
        if (this.ak && this.an != null) {
            Canvas lockCanvas = surface.lockCanvas(null);
            int width = lockCanvas.getWidth();
            int height = lockCanvas.getHeight();
            int width2 = this.an.getWidth();
            int height2 = this.an.getHeight();
            y.a("VEEditor", "width " + width + " height " + height + " image width " + width2 + " image height " + height2);
            float f2 = (float) width;
            float f3 = (float) height;
            float f4 = ((float) width2) / ((float) height2);
            if (f4 > f2 / f3) {
                int i2 = (height - ((int) (f2 / f4))) / 2;
                rect = new Rect(0, i2, width, height - i2);
            } else {
                int i3 = (width - ((int) (f3 * f4))) / 2;
                rect = new Rect(i3, 0, width - i3, height);
            }
            lockCanvas.drawBitmap(this.an, null, rect, null);
            surface.unlockCanvasAndPost(lockCanvas);
            if (this.am) {
                if (this.an != null && !this.an.isRecycled()) {
                    this.an.recycle();
                    this.an = null;
                }
                this.am = false;
            }
        }
        this.n.setPreviewSurface(surface);
    }

    public final void b() {
        boolean b2 = this.z.b();
        long j2 = 1;
        com.ss.android.ttve.monitor.e.a(1, "te_composition_effect_add", b2 ? 0 : 1);
        if (!b2) {
            com.ss.android.ttve.monitor.e.a(1, "te_composition_effect_json", this.z.a(0));
        }
        boolean c2 = this.z.c();
        com.ss.android.ttve.monitor.e.a(1, "te_composition_info_sticker_add", c2 ? 0 : 1);
        if (!c2) {
            com.ss.android.ttve.monitor.e.a(1, "te_composition_info_sticker_json", this.z.a(1));
        }
        if (v()) {
            j2 = 0;
        }
        com.ss.android.ttve.monitor.e.a(1, "te_composition_brush_add", j2);
        this.z.a();
        com.ss.android.ttve.monitor.e.a(1, "iesve_veeditor_composition_finish_file", this.f78039c);
        com.ss.android.ttve.monitor.e.a(1, "iesve_veeditor_composition_finish_result", "fail");
        com.ss.android.ttve.monitor.e.a(1, "iesve_veeditor_composition_finish_reason", "");
        com.ss.android.ttve.monitor.e.b(1);
    }

    public final void a(@NonNull m mVar) {
        this.i = mVar;
        y.a("VEEditor", "setOnErrorListener...");
    }

    public final void a(int i2, int i3, int i4, int i5) {
        y.a("VEEditor", "setDisplayPos... " + i2 + " " + i3 + " " + i4 + " " + i5);
        a(((float) i4) / ((float) this.P), ((float) i5) / ((float) this.Q), 0.0f, -(((this.l / 2) - (i4 / 2)) - i2), ((this.m / 2) - (i5 / 2)) - i3);
    }

    public final void a(float f2, float f3, float f4, int i2, int i3) {
        com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
        aVar.a("iesve_veeditor_video_scale_width", f2).a("iesve_veeditor_video_scale_heigh", f3);
        com.ss.android.ttve.monitor.d.a("iesve_veeditor_video_scale", 1, aVar);
        this.ao = f4;
        this.ap = f3;
        this.aq = f3;
        y.a("VEEditor", "setDisplayState... " + f2 + " " + f3 + " " + f4 + " " + i2 + " " + i3);
        this.n.setDisplayState(f2, f3, f4, 0.0f, i2, i3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        com.ss.android.vesdk.y.d("VEEditor", "getDisplayImage failed " + r0);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029 A[Catch:{ Exception -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ss.android.ttve.nativePort.TEInterface r0 = r4.n     // Catch:{ all -> 0x0071 }
            com.ss.android.vesdk.ag r0 = r0.getDisplayRect()     // Catch:{ all -> 0x0071 }
            int r1 = r0.f77886c     // Catch:{ all -> 0x0071 }
            r2 = 0
            if (r1 == 0) goto L_0x006f
            int r1 = r0.f77887d     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x0011
            goto L_0x006f
        L_0x0011:
            if (r5 <= 0) goto L_0x0020
            int r1 = r0.f77886c     // Catch:{ all -> 0x0071 }
            if (r5 < r1) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            int r1 = r0.f77887d     // Catch:{ all -> 0x0071 }
            int r1 = r1 * r5
            int r0 = r0.f77886c     // Catch:{ all -> 0x0071 }
            int r1 = r1 / r0
            goto L_0x0024
        L_0x0020:
            int r5 = r0.f77886c     // Catch:{ all -> 0x0071 }
            int r1 = r0.f77887d     // Catch:{ all -> 0x0071 }
        L_0x0024:
            int r0 = r5 % 2
            r3 = 1
            if (r0 != r3) goto L_0x002b
            int r5 = r5 + 1
        L_0x002b:
            int r0 = r1 % 2
            if (r0 != r3) goto L_0x0031
            int r1 = r1 + 1
        L_0x0031:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0055 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r0)     // Catch:{ Exception -> 0x0055 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r4.n     // Catch:{ all -> 0x0071 }
            int r0 = r0.getDisplayImage(r5)     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r5 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "getDisplayImage failed "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.ss.android.vesdk.y.d(r5, r0)
            r5 = r2
        L_0x0054:
            return r5
        L_0x0055:
            r5 = move-exception
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "getDisplayImage createBitmap failed "
            r1.<init>(r3)     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0071 }
            r1.append(r5)     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0071 }
            com.ss.android.vesdk.y.d(r0, r5)     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return r2
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return r2
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.a(int):android.graphics.Bitmap");
    }

    public final int a(int i2, int i3) {
        int prepareEngine;
        synchronized (this) {
            com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
            aVar.a("iesve_veeditor_cut_duration", i3 - i2);
            com.ss.android.ttve.monitor.d.a("iesve_veeditor_cut_duration", 1, aVar);
            y.a("VEEditor", "setInOut... " + i2 + " " + i3);
            this.n.stop();
            this.n.setTimeRange(i2, i3, 0);
            prepareEngine = this.n.prepareEngine(0);
        }
        return prepareEngine;
    }

    public int a(String[] strArr, String[] strArr2, String[] strArr3, i iVar) throws r {
        synchronized (this) {
            com.ss.android.ttve.monitor.e.d(1);
            com.ss.android.ttve.monitor.e.c(1);
            this.s = System.currentTimeMillis();
            y.a("VEEditor", "init...");
            if (this.f78038b == null) {
                y.d("VEEditor", "init mResManager is null");
                return -112;
            }
            int createScene = this.n.createScene(this.f78038b.f78096a, strArr, strArr3, strArr2, null, iVar.ordinal());
            if (createScene != 0) {
                y.d("VEEditor", "Create Scene failed, ret = " + createScene);
                b();
                this.ab = false;
                return createScene;
            }
            this.ab = true;
            this.f78038b.g = false;
            this.Y = iVar;
            this.f78038b.f78098c = strArr3;
            this.f78038b.f78097b = strArr;
            this.f78038b.f78099d = strArr2;
            this.af = -1;
            this.R = Boolean.valueOf((strArr3 == null || strArr3.length == 0) ? false : true);
            if (this.R.booleanValue()) {
                this.f78038b.i = 1;
            } else {
                this.f78038b.i = 0;
            }
            this.f78038b.h = 0;
            this.T = 0;
            int A2 = A();
            return A2;
        }
    }

    public final int a(q qVar, al alVar) {
        synchronized (this) {
            com.ss.android.ttve.monitor.e.d(1);
            com.ss.android.ttve.monitor.e.c(1);
            this.s = System.currentTimeMillis();
            y.a("VEEditor", "init with model...");
            a(1.0f, 1.0f, 0.0f, 0, 0);
            if (this.f78038b == null) {
                y.d("VEEditor", "init mResManager is null");
                return -112;
            }
            this.ab = true;
            this.f78038b.g = qVar.f78076d;
            this.Y = qVar.f78077e;
            this.f78038b.f78098c = qVar.n;
            this.f78038b.f78097b = qVar.m;
            this.f78038b.f78099d = qVar.o;
            this.af = -1;
            this.R = Boolean.valueOf(qVar.f78078f);
            this.f78038b.h = 0;
            this.T = qVar.g;
            this.n.setHostTrackIndex(qVar.h);
            if (alVar != null) {
                int updateSenceTime = this.n.updateSenceTime(alVar);
                if (updateSenceTime < 0) {
                    y.d("VEEditor", "updateSceneTime failed, ret = " + updateSenceTime);
                    return updateSenceTime;
                }
                this.n.setTimeRange(0, updateSenceTime, 0);
            }
            this.ae = qVar.k;
            this.ah = qVar.l;
            this.S = qVar.i;
            return 0;
        }
    }

    public int a(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, String[] strArr3, int[] iArr3, int[] iArr4, float[] fArr, c[] cVarArr, i iVar) throws r {
        String[] strArr4 = strArr3;
        synchronized (this) {
            com.ss.android.ttve.monitor.e.d(1);
            com.ss.android.ttve.monitor.e.c(1);
            this.s = System.currentTimeMillis();
            y.a("VEEditor", "init...");
            int createScene2 = this.n.createScene2(strArr, iArr, iArr2, strArr3, iArr3, iArr4, strArr2, null, fArr, c.toIntArray(cVarArr), iVar.ordinal());
            if (createScene2 != 0) {
                y.d("VEEditor", "Create Scene failed, ret = " + createScene2);
                b();
                this.ab = false;
                return createScene2;
            }
            this.ab = true;
            this.f78038b.g = false;
            this.Y = iVar;
            this.f78038b.f78098c = strArr4;
            this.f78038b.f78097b = strArr;
            this.f78038b.f78099d = strArr2;
            this.af = -1;
            this.R = Boolean.valueOf((strArr4 == null || strArr4.length == 0) ? false : true);
            if (this.R.booleanValue()) {
                this.f78038b.i = 1;
            } else {
                this.f78038b.i = 0;
            }
            this.f78038b.h = 0;
            this.T = 0;
            int A2 = A();
            return A2;
        }
    }

    public int a(@NonNull String str, @NonNull String[] strArr, @NonNull String[] strArr2) throws r {
        int a2;
        synchronized (this) {
            a2 = a(str, strArr, strArr2, (String) null, 0, 0, false);
        }
        return a2;
    }

    public final int a(@NonNull String str, @NonNull String[] strArr, @NonNull String[] strArr2, @Nullable String str2, int i2, int i3) {
        int a2;
        synchronized (this) {
            a2 = a(str, strArr, strArr2, str2, i2, i3, false);
        }
        return a2;
    }

    public int a(String str, int i2, int i3) {
        y.c("VEEditor", "updateMVBackgroundAudioTrack");
        return b(this.M, this.K, this.L, str, i2, i3, false);
    }

    public final int a(al alVar) {
        y.c("VEEditor", "update sence time");
        synchronized (this) {
            this.n.stop();
            int updateSenceTime = this.n.updateSenceTime(alVar);
            if (updateSenceTime < 0) {
                y.d("VEEditor", "updateSceneTime failed, ret = " + updateSenceTime);
                return updateSenceTime;
            }
            this.T = 0;
            this.n.setTimeRange(0, updateSenceTime, 0);
            int prepareEngine = this.n.prepareEngine(0);
            if (prepareEngine == 0) {
                return 0;
            }
            y.d("VEEditor", "Prepare Engine failed, ret = " + prepareEngine);
            return prepareEngine;
        }
    }

    public final int a(al alVar, int i2, int i3) {
        y.c("VEEditor", "update sence time with start/end time");
        synchronized (this) {
            this.n.stop();
            int updateSenceTime = this.n.updateSenceTime(alVar);
            if (updateSenceTime < 0) {
                y.d("VEEditor", "updateSceneTime failed, ret = " + updateSenceTime);
                return updateSenceTime;
            }
            this.T = 0;
            this.n.setTimeRange(i2, i3, 0);
            int prepareEngine = this.n.prepareEngine(0);
            if (prepareEngine == 0) {
                return 0;
            }
            y.d("VEEditor", "Prepare Engine failed, ret = " + prepareEngine);
            return prepareEngine;
        }
    }

    public final int a(int i2, int i3, c cVar) {
        y.a("VEEditor", "setFileRotate..." + 0 + " " + i3 + " " + cVar);
        TEInterface tEInterface = this.n;
        return tEInterface.setClipAttr(0, 0, i3, "clip rotate", cVar.ordinal());
    }

    public final void a(boolean z2) {
        y.a("VEEditor", "setLoopPlay");
        this.n.setLooping(z2);
    }

    public final void b(boolean z2) {
        y.a("VEEditor", "enableSimpleProcessor: " + String.valueOf(z2));
        this.n.enableSimpleProcessor(z2);
    }

    public final int a(String[] strArr) {
        y.c("VEEditor", "setReverseVideoPaths");
        if (this.f78038b != null) {
            this.f78038b.f78100e = strArr;
            this.f78038b.g = true;
        }
        return 0;
    }

    public final void b(String[] strArr) {
        y.c("VEEditor", "setVideoPaths");
        this.f78038b.f78097b = strArr;
    }

    public final int a(@NonNull String[] strArr, String[] strArr2) {
        y.c("VEEditor", "setReverseMediaPaths");
        if (strArr == null || strArr.length <= 0) {
            y.d("VEEditor", "setReverseMediaPaths error, reverseVideoPaths = null");
            return -100;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            y.c("VEEditor", "setReverseMediaPaths with reverseAudioPaths is null");
        }
        if (this.f78038b != null) {
            this.f78038b.f78101f = strArr2;
            this.f78038b.f78100e = strArr;
            this.f78038b.g = true;
        }
        return 0;
    }

    public final int a(c cVar) {
        y.c("VEEditor", "setScaleMode...");
        if (cVar == c.SCALE_MODE_CENTER_CROP) {
            this.n.setResizer(2, 0.0f, 0.0f);
        } else if (cVar == c.SCALE_MODE_CENTER_INSIDE) {
            this.n.setResizer(1, 0.0f, 0.0f);
        } else if (cVar == c.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE) {
            this.n.setResizer(3, 0.0f, 0.0f);
        } else if (cVar == c.SCALE_MODE_CANVAS) {
            this.n.setResizer(4, 0.0f, 0.0f);
        }
        return 0;
    }

    public final int a(int i2, d dVar) {
        y.c("VEEditor", "seek... " + i2 + " flags " + dVar);
        this.f78041e = null;
        return this.n.seek(i2, this.l, this.m, dVar.getValue());
    }

    public final int a(int i2, d dVar, VEListener.i iVar) {
        y.c("VEEditor", "seek with cb... " + 0 + " flags " + dVar);
        if ((dVar.getValue() | d.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
            this.f78041e = iVar;
        }
        int seek = this.n.seek(0, this.l, this.m, dVar.getValue());
        if (seek != 0) {
            y.d("VEEditor", "seek failed, result = " + seek);
            this.f78041e = null;
        }
        return seek;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        return -100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(java.lang.String r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "addAudioTrack... "
            r1.<init>(r2)     // Catch:{ all -> 0x006c }
            r1.append(r11)     // Catch:{ all -> 0x006c }
            java.lang.String r2 = " In "
            r1.append(r2)     // Catch:{ all -> 0x006c }
            r1.append(r12)     // Catch:{ all -> 0x006c }
            java.lang.String r2 = " Out "
            r1.append(r2)     // Catch:{ all -> 0x006c }
            r1.append(r13)     // Catch:{ all -> 0x006c }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ all -> 0x006c }
            r1.append(r14)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006c }
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x006c }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x006c }
            r1 = -100
            if (r0 == 0) goto L_0x0036
            monitor-exit(r10)     // Catch:{ all -> 0x006c }
            return r1
        L_0x0036:
            if (r13 <= r12) goto L_0x006a
            if (r12 >= 0) goto L_0x003b
            goto L_0x006a
        L_0x003b:
            java.lang.String r0 = "iesve_veeditor_import_music"
            r1 = 0
            r2 = 1
            com.ss.android.ttve.monitor.d.a((java.lang.String) r0, (int) r2, (com.ss.android.vesdk.keyvaluepair.a) r1)     // Catch:{ all -> 0x006c }
            com.ss.android.ttve.nativePort.TEInterface r3 = r10.n     // Catch:{ all -> 0x006c }
            r5 = 0
            int r6 = r13 - r12
            r4 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            int r11 = r3.addAudioTrack(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x006c }
            com.ss.android.ttve.common.TETrackIndexManager r12 = r10.I     // Catch:{ all -> 0x006c }
            int r11 = r12.a(r2, r11)     // Catch:{ all -> 0x006c }
            java.lang.String r12 = "VEEditor"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            java.lang.String r14 = "addAudioTrack... "
            r13.<init>(r14)     // Catch:{ all -> 0x006c }
            r13.append(r11)     // Catch:{ all -> 0x006c }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x006c }
            com.ss.android.vesdk.y.c(r12, r13)     // Catch:{ all -> 0x006c }
            monitor-exit(r10)     // Catch:{ all -> 0x006c }
            return r11
        L_0x006a:
            monitor-exit(r10)     // Catch:{ all -> 0x006c }
            return r1
        L_0x006c:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x006c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.a(java.lang.String, int, int, boolean):int");
    }

    public int a(String str, int i2, int i3, int i4, int i5, boolean z2) {
        return a(str, i2, i3, i4, i5, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        return -100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        return -100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(java.lang.String r8, int r9, int r10, int r11, int r12, boolean r13, boolean r14) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "addAudioTrack... "
            r1.<init>(r2)     // Catch:{ all -> 0x0099 }
            r1.append(r8)     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = " In "
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            r1.append(r9)     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = " Out "
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            r1.append(r10)     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = " SeqIn "
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            r1.append(r11)     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = " seqOut "
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            r1.append(r12)     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            r1.append(r13)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0099 }
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x0099 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0099 }
            r1 = -100
            if (r0 == 0) goto L_0x0046
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            return r1
        L_0x0046:
            if (r10 <= r9) goto L_0x0097
            if (r9 >= 0) goto L_0x004b
            goto L_0x0097
        L_0x004b:
            if (r12 <= r11) goto L_0x0095
            if (r11 >= 0) goto L_0x0050
            goto L_0x0095
        L_0x0050:
            if (r14 == 0) goto L_0x0057
            com.ss.android.ttve.nativePort.TEInterface r0 = r7.n     // Catch:{ all -> 0x0099 }
            r0.stop()     // Catch:{ all -> 0x0099 }
        L_0x0057:
            com.ss.android.ttve.nativePort.TEInterface r0 = r7.n     // Catch:{ all -> 0x0099 }
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r9
            r5 = r10
            r6 = r13
            int r8 = r0.addAudioTrack(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0099 }
            com.ss.android.ttve.common.TETrackIndexManager r9 = r7.I     // Catch:{ all -> 0x0099 }
            r10 = 1
            int r8 = r9.a(r10, r8)     // Catch:{ all -> 0x0099 }
            if (r14 == 0) goto L_0x0093
            com.ss.android.ttve.nativePort.TEInterface r9 = r7.n     // Catch:{ all -> 0x0099 }
            com.ss.android.ttve.nativePort.TEInterface r11 = r7.n     // Catch:{ all -> 0x0099 }
            int r11 = r11.getDuration()     // Catch:{ all -> 0x0099 }
            r12 = 0
            r9.setTimeRange(r12, r11, r10)     // Catch:{ all -> 0x0099 }
            int r9 = r7.l(r12)     // Catch:{ all -> 0x0099 }
            if (r9 == 0) goto L_0x0093
            java.lang.String r8 = "VEEditor"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            java.lang.String r11 = "addAudioTrack Prepare Engine failed, ret = "
            r10.<init>(r11)     // Catch:{ all -> 0x0099 }
            r10.append(r9)     // Catch:{ all -> 0x0099 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0099 }
            com.ss.android.vesdk.y.d(r8, r10)     // Catch:{ all -> 0x0099 }
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            return r9
        L_0x0093:
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            return r8
        L_0x0095:
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            return r1
        L_0x0097:
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            return r1
        L_0x0099:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.a(java.lang.String, int, int, int, int, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        return -100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r12 = "VEEditor"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "updateAudioTrack...  Index "
            r0.<init>(r1)     // Catch:{ all -> 0x004b }
            r0.append(r9)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = " In "
            r0.append(r1)     // Catch:{ all -> 0x004b }
            r0.append(r10)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = " Out "
            r0.append(r1)     // Catch:{ all -> 0x004b }
            r0.append(r11)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = " false"
            r0.append(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004b }
            com.ss.android.vesdk.y.c(r12, r0)     // Catch:{ all -> 0x004b }
            r12 = -100
            if (r9 >= 0) goto L_0x002f
            monitor-exit(r8)     // Catch:{ all -> 0x004b }
            return r12
        L_0x002f:
            if (r11 <= r10) goto L_0x0049
            if (r10 >= 0) goto L_0x0034
            goto L_0x0049
        L_0x0034:
            com.ss.android.ttve.common.TETrackIndexManager r12 = r8.I     // Catch:{ all -> 0x004b }
            r0 = 1
            int r2 = r12.b(r0, r9)     // Catch:{ all -> 0x004b }
            com.ss.android.ttve.nativePort.TEInterface r1 = r8.n     // Catch:{ all -> 0x004b }
            r3 = 0
            int r4 = r11 - r10
            r7 = 0
            r5 = r10
            r6 = r11
            int r9 = r1.updateAudioTrack(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
            monitor-exit(r8)     // Catch:{ all -> 0x004b }
            return r9
        L_0x0049:
            monitor-exit(r8)     // Catch:{ all -> 0x004b }
            return r12
        L_0x004b:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x004b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.a(int, int, int, boolean):int");
    }

    public final boolean a(int i2, int i3, float f2) {
        boolean trackVolume;
        synchronized (this) {
            y.c("VEEditor", "setVolume... index " + i2 + " type " + i3);
            trackVolume = this.n.setTrackVolume(i3, this.I.b(1, i2), f2);
        }
        return trackVolume;
    }

    public final int a(String str, @Nullable String[] strArr) {
        int addInfoSticker;
        y.a("VEEditor", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        com.ss.android.ttve.monitor.d.a("iesve_veeditor_import_sticker", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        synchronized (this) {
            addInfoSticker = this.n.addInfoSticker(str, strArr);
        }
        f.a aVar = new f.a();
        aVar.f31261a = str;
        this.z.a(1, addInfoSticker, aVar);
        return addInfoSticker;
    }

    public final int a(@NonNull String str, float f2, float f3, float f4, float f5) {
        y.a("VEEditor", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        com.ss.android.ttve.monitor.d.a("iesve_veeditor_import_sticker", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return this.n.addInfoSticker(str, new String[]{"0.0", "0.0", "1.0", "1.0", PushConstants.PUSH_TYPE_NOTIFY});
    }

    public final int a(int i2, float f2, float f3) {
        synchronized (this) {
            y.b("VEEditor", "setInfoStickerPosition... index: " + i2 + "offsetX: " + f2 + "offsetY: " + f3);
            if (i2 < 0) {
                return -100;
            }
            int filterParam = this.n.setFilterParam(i2, "entity position x", String.valueOf(f2)) + this.n.setFilterParam(i2, "entity position y", String.valueOf(f3));
            return filterParam;
        }
    }

    public final int a(int i2, float f2) {
        synchronized (this) {
            y.b("VEEditor", "setInfoStickerRotation... index: " + i2 + "degree: " + f2);
            if (i2 < 0) {
                return -100;
            }
            int filterParam = this.n.setFilterParam(i2, "entity rotation", String.valueOf(f2));
            return filterParam;
        }
    }

    public final int a(int i2, int i3, int i4) {
        synchronized (this) {
            y.a("VEEditor", "setInfoStickerTime... index: " + i2 + "startTime: " + i3 + "endTime: " + i4);
            if (i2 < 0) {
                return -100;
            }
            f.a aVar = this.z.f31259b.get(Integer.valueOf(i2));
            if (aVar != null) {
                aVar.f31262b = i3;
                aVar.f31263c = i4 - i3;
            }
            int filterParam = this.n.setFilterParam(i2, "entity start time", String.valueOf(i3)) + this.n.setFilterParam(i2, "entity end time", String.valueOf(i4));
            return filterParam;
        }
    }

    public final int a(String str, float f2) {
        return a(str, 1.0f, false, false);
    }

    public final int a(String str, String str2, float f2, float f3) {
        return a(str, str2, f2, 0.8f, false);
    }

    public final int[] a(int[] iArr, int[] iArr2, String[] strArr) {
        for (int i2 = 0; i2 <= 0; i2++) {
            if (iArr[0] < 0 || iArr[0] > t() || TextUtils.isEmpty(strArr[0])) {
                return new int[]{-100};
            }
        }
        boolean[] zArr = new boolean[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        for (int i3 = 0; i3 <= 0; i3++) {
            zArr[0] = false;
            iArr3[0] = 0;
            iArr4[0] = 0;
        }
        int length = iArr.length;
        int[] iArr5 = new int[length];
        int[] iArr6 = new int[length];
        int[] iArr7 = new int[length];
        String[] strArr2 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr5[i4] = 0;
            iArr6[i4] = 0;
            strArr2[i4] = "filter effect";
            iArr7[i4] = 8;
        }
        int[] addFilters = this.n.addFilters(iArr5, strArr2, iArr, iArr2, iArr6, iArr7);
        if (length != addFilters.length) {
            int[] iArr8 = new int[length];
            Arrays.fill(iArr8, -1);
            return iArr8;
        }
        for (int i5 = 0; i5 < length; i5++) {
            this.n.setFilterParam(addFilters[i5], "effect res path", strArr[i5]);
            this.n.setFilterParam(addFilters[i5], "effect use amazing", zArr[i5] ? "true" : "false");
            TEInterface tEInterface = this.n;
            int i6 = addFilters[i5];
            tEInterface.setFilterParam(i6, "effect sticker id", iArr3[i5]);
            TEInterface tEInterface2 = this.n;
            int i7 = addFilters[i5];
            tEInterface2.setFilterParam(i7, "effect req id", iArr4[i5]);
            f.a aVar = new f.a();
            aVar.f31261a = strArr[i5];
            aVar.f31262b = iArr[i5];
            aVar.f31263c = iArr2[i5] - iArr[i5];
            this.z.a(0, addFilters[i5], aVar);
        }
        return addFilters;
    }

    public final int a(int[] iArr) {
        for (int a2 : iArr) {
            this.z.a(0, a2);
        }
        return this.n.removeFilter(iArr);
    }

    public final int a(int i2, int i3, int i4, int i5, int i6) {
        synchronized (this) {
            y.c("VEEditor", "addRepeatEffect... " + 0 + " 0" + " " + i4 + " 3" + " 600");
            int pauseSync = this.n.pauseSync();
            if (pauseSync == 0 || pauseSync == -101) {
                int t2 = t();
                int[] addFilters = this.n.addFilters(new int[]{0}, new String[]{"timeEffect repeating"}, new int[]{i4}, new int[]{t2}, new int[]{0}, new int[]{6});
                this.S = addFilters[0];
                TEInterface tEInterface = this.n;
                int i7 = addFilters[0];
                tEInterface.setFilterParam(i7, "timeEffect repeating duration", 600);
                TEInterface tEInterface2 = this.n;
                int i8 = addFilters[0];
                tEInterface2.setFilterParam(i8, "timeEffect repeating times", 3);
                this.n.createTimeline();
                com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
                aVar.a("iesve_veeditor_time_effect_id", "repeat");
                com.ss.android.ttve.monitor.d.a("iesve_veeditor_time_effect", 1, aVar);
                this.z.f31260c = 1;
                int i9 = addFilters[0];
                return i9;
            }
            y.d("VEEditor", "pauseSync failed in addRepeatEffect, ret " + pauseSync);
            return -1;
        }
    }

    public final int a(int i2, int i3, int i4, int i5, float f2, float f3) {
        synchronized (this) {
            y.c("VEEditor", "addSlowMotionEffect... " + 0 + " 0" + " " + i4 + " " + i5 + " 0.5" + " 1.333");
            int pauseSync = this.n.pauseSync();
            if (pauseSync == 0 || pauseSync == -101) {
                int t2 = t();
                int[] addFilters = this.n.addFilters(new int[]{0}, new String[]{"timeEffect slow motion"}, new int[]{i4}, new int[]{t2}, new int[]{0}, new int[]{6});
                this.S = addFilters[0];
                TEInterface tEInterface = this.n;
                int i6 = addFilters[0];
                tEInterface.setFilterParam(i6, "timeEffect slow motion duration", i5);
                TEInterface tEInterface2 = this.n;
                int i7 = addFilters[0];
                tEInterface2.setFilterParam(i7, "timeEffect slow motion speed", 0.5f);
                TEInterface tEInterface3 = this.n;
                int i8 = addFilters[0];
                tEInterface3.setFilterParam(i8, "timeEffect fast motion speed", 1.333f);
                this.n.createTimeline();
                com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
                aVar.a("iesve_veeditor_time_effect_id", "slow");
                com.ss.android.ttve.monitor.d.a("iesve_veeditor_time_effect", 1, aVar);
                this.z.f31260c = 2;
                int i9 = addFilters[0];
                return i9;
            }
            y.d("VEEditor", "pauseSync failed in addSlowMotionEffect, ret " + pauseSync);
            return -1;
        }
    }

    public final int a(String str, String str2) {
        synchronized (this) {
            y.c("VEEditor", "addMetadata...");
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    this.n.addMetaData(str, str2);
                    return 0;
                }
            }
            return -100;
        }
    }

    public final int a(int[] iArr, int i2, int i3, a aVar, VEListener.l lVar) {
        int images;
        synchronized (this) {
            y.a("VEEditor", "getImages...");
            this.y = lVar;
            this.n.setGetImageCallback(this.az);
            images = this.n.getImages(iArr, i2, i3, aVar.getValue());
        }
        return images;
    }

    public final boolean a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, VEListener.g gVar) throws r {
        this.f78042f = gVar;
        return b(str, str2, vEVideoEncodeSettings);
    }

    public final boolean a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) throws r {
        this.f78042f = null;
        return b(str, str2, vEVideoEncodeSettings);
    }

    public final long c() {
        return this.n.getNativeHandler();
    }

    public final Bitmap e() {
        return a(-1);
    }

    public final String[] p() {
        return this.f78038b.f78097b;
    }

    public final int r() {
        return h(false);
    }

    public final int t() {
        return this.n.getDuration();
    }

    public final int u() {
        return this.n.getCurPosition();
    }

    public final int w() {
        return this.n.get2DBrushStrokeCount();
    }

    public final aj d() {
        return new aj(this.P, this.Q);
    }

    public final String[] n() {
        if (this.f78038b.g) {
            return this.f78038b.f78100e;
        }
        return null;
    }

    public final String[] o() {
        if (this.f78038b.g) {
            return this.f78038b.f78101f;
        }
        return null;
    }

    public final int q() {
        y.c("VEEditor", "play...");
        return this.n.start();
    }

    public final int s() {
        y.b("VEEditor", "refreshCurrentFrame...");
        return this.n.refreshCurrentFrame();
    }

    public final boolean v() {
        if (this.n.get2DBrushStrokeCount() == 0) {
            return true;
        }
        return false;
    }

    public final void i() {
        synchronized (this) {
            if (this.n != null) {
                y.c("VEEditor", "stop... ");
                this.n.stop();
            }
        }
    }

    public final int x() {
        int cancelGetImages;
        synchronized (this) {
            y.c("VEEditor", "cancelGetVideoFrames...");
            cancelGetImages = this.n.cancelGetImages();
        }
        return cancelGetImages;
    }

    public final boolean y() {
        boolean z2;
        synchronized (this) {
            if (this.n.getNativeHandler() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final g l() throws r {
        if (this.n != null) {
            int curState = this.n.getCurState();
            if (curState != -1) {
                return g.valueOf(curState);
            }
            throw new r(-105, " native video editor is null");
        }
        throw new r(-105, "video editor is null");
    }

    private int A() {
        try {
            int[] addFilters = this.n.addFilters(new int[]{0, 0}, new String[]{"color filter", "effect hdr filter"}, new int[]{0, 0}, new int[]{this.X, this.X}, new int[]{0, 0}, new int[]{7, 16});
            this.ae = addFilters[0];
            this.ah = addFilters[1];
            return 0;
        } catch (NullPointerException unused) {
            throw new r(-1, "init failed: VESDK need to be init");
        }
    }

    @Nullable
    public final VEMVAudioInfo f() {
        y.c("VEEditor", "getMVOriginalBackgroundAudio");
        if (this.M != null && this.K != null && this.L != null) {
            return (VEMVAudioInfo) this.n.getMVOriginalBackgroundAudio();
        }
        y.d("VEEditor", "getMVOriginalBackgroundAudio bad input file, please call initMV first");
        return null;
    }

    @Nullable
    public final q g() {
        y.a("VEEditor", "saveModel...");
        if (this.ab) {
            q qVar = new q();
            qVar.f78076d = this.f78038b.g;
            qVar.f78077e = this.Y;
            qVar.C = this.Z;
            qVar.D = this.aa;
            qVar.f78078f = this.R.booleanValue();
            qVar.g = this.T;
            qVar.h = this.n.getHostTrackIndex();
            qVar.i = this.S;
            qVar.k = this.ae;
            qVar.l = this.ah;
            qVar.m = this.f78038b.f78097b;
            qVar.n = this.f78038b.f78098c;
            qVar.o = this.f78038b.f78099d;
            qVar.p = this.at;
            qVar.q = this.au;
            return qVar;
        }
        y.d("VEEditor", "saveModel error, editor is not init...");
        return null;
    }

    public final int h() {
        int prepareEngine;
        synchronized (this) {
            y.c("VEEditor", "prepare...");
            prepareEngine = this.n.prepareEngine(0);
            if (prepareEngine != 0) {
                y.d("VEEditor", "prepare() prepareEngine failed: result: " + prepareEngine);
                b();
            }
            int[] initResolution = this.n.getInitResolution();
            this.f78037a.f77890a = initResolution[0];
            this.f78037a.f77891b = initResolution[1];
            if (this.l > 0 && this.m > 0) {
                z();
            }
            b(this.at);
            int i2 = this.au;
            this.au = i2;
            this.n.setVideoBackGroundColor(i2);
        }
        return prepareEngine;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.ab = r0     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "onReleaseResource... "
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x0058 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.n     // Catch:{ all -> 0x0058 }
            long r0 = r0.getNativeHandler()     // Catch:{ all -> 0x0058 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0019
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            return
        L_0x0019:
            android.view.SurfaceView r0 = r5.U     // Catch:{ all -> 0x0058 }
            r1 = 0
            if (r0 == 0) goto L_0x002a
            android.view.SurfaceView r0 = r5.U     // Catch:{ all -> 0x0058 }
            android.view.SurfaceHolder r0 = r0.getHolder()     // Catch:{ all -> 0x0058 }
            android.view.SurfaceHolder$Callback2 r2 = r5.aw     // Catch:{ all -> 0x0058 }
            r0.removeCallback(r2)     // Catch:{ all -> 0x0058 }
            goto L_0x003d
        L_0x002a:
            android.view.TextureView r0 = r5.V     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x003d
            android.view.TextureView r0 = r5.V     // Catch:{ all -> 0x0058 }
            android.view.TextureView$SurfaceTextureListener r0 = r0.getSurfaceTextureListener()     // Catch:{ all -> 0x0058 }
            android.view.TextureView$SurfaceTextureListener r2 = r5.av     // Catch:{ all -> 0x0058 }
            if (r0 != r2) goto L_0x003d
            android.view.TextureView r0 = r5.V     // Catch:{ all -> 0x0058 }
            r0.setSurfaceTextureListener(r1)     // Catch:{ all -> 0x0058 }
        L_0x003d:
            r5.U = r1     // Catch:{ all -> 0x0058 }
            r5.V = r1     // Catch:{ all -> 0x0058 }
            r5.f78038b = r1     // Catch:{ all -> 0x0058 }
            android.graphics.Bitmap r0 = r5.an     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0056
            android.graphics.Bitmap r0 = r5.an     // Catch:{ all -> 0x0058 }
            boolean r0 = r0.isRecycled()     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0056
            android.graphics.Bitmap r0 = r5.an     // Catch:{ all -> 0x0058 }
            r0.recycle()     // Catch:{ all -> 0x0058 }
            r5.an = r1     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.j():void");
    }

    public final void z() {
        if (((float) this.f78037a.f77890a) / ((float) this.f78037a.f77891b) > ((float) this.l) / ((float) this.m)) {
            this.P = this.l;
            this.Q = (int) (((float) this.l) / (((float) this.f78037a.f77890a) / ((float) this.f78037a.f77891b)));
            return;
        }
        this.Q = this.m;
        this.P = (int) (((float) this.m) / (((float) this.f78037a.f77891b) / ((float) this.f78037a.f77890a)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.ab = r0     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "onDestroy... "
            com.ss.android.vesdk.y.c(r0, r1)     // Catch:{ all -> 0x0070 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.n     // Catch:{ all -> 0x0070 }
            long r0 = r0.getNativeHandler()     // Catch:{ all -> 0x0070 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0019
            monitor-exit(r5)     // Catch:{ all -> 0x0070 }
            return
        L_0x0019:
            android.view.SurfaceView r0 = r5.U     // Catch:{ all -> 0x0070 }
            r1 = 0
            if (r0 == 0) goto L_0x002a
            android.view.SurfaceView r0 = r5.U     // Catch:{ all -> 0x0070 }
            android.view.SurfaceHolder r0 = r0.getHolder()     // Catch:{ all -> 0x0070 }
            android.view.SurfaceHolder$Callback2 r2 = r5.aw     // Catch:{ all -> 0x0070 }
            r0.removeCallback(r2)     // Catch:{ all -> 0x0070 }
            goto L_0x003d
        L_0x002a:
            android.view.TextureView r0 = r5.V     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x003d
            android.view.TextureView r0 = r5.V     // Catch:{ all -> 0x0070 }
            android.view.TextureView$SurfaceTextureListener r0 = r0.getSurfaceTextureListener()     // Catch:{ all -> 0x0070 }
            android.view.TextureView$SurfaceTextureListener r2 = r5.av     // Catch:{ all -> 0x0070 }
            if (r0 != r2) goto L_0x003d
            android.view.TextureView r0 = r5.V     // Catch:{ all -> 0x0070 }
            r0.setSurfaceTextureListener(r1)     // Catch:{ all -> 0x0070 }
        L_0x003d:
            r5.U = r1     // Catch:{ all -> 0x0070 }
            r5.V = r1     // Catch:{ all -> 0x0070 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.n     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0059
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.n     // Catch:{ all -> 0x0070 }
            r0.setOpenGLListeners(r1)     // Catch:{ all -> 0x0070 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.n     // Catch:{ all -> 0x0070 }
            r0.setInfoListener(r1)     // Catch:{ all -> 0x0070 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.n     // Catch:{ all -> 0x0070 }
            r0.setErrorListener(r1)     // Catch:{ all -> 0x0070 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.n     // Catch:{ all -> 0x0070 }
            r0.destroyEngine()     // Catch:{ all -> 0x0070 }
        L_0x0059:
            r5.f78038b = r1     // Catch:{ all -> 0x0070 }
            android.graphics.Bitmap r0 = r5.an     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006e
            android.graphics.Bitmap r0 = r5.an     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isRecycled()     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006e
            android.graphics.Bitmap r0 = r5.an     // Catch:{ all -> 0x0070 }
            r0.recycle()     // Catch:{ all -> 0x0070 }
            r5.an = r1     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r5)     // Catch:{ all -> 0x0070 }
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0070 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.k():void");
    }

    public final int m() throws r {
        y.c("VEEditor", "genReverseVideo");
        if (this.f78038b.f78097b == null || this.f78038b.f78097b.length <= 0) {
            y.d("VEEditor", "genReverseVideo error:invalid videoPaths");
            return -100;
        }
        long currentTimeMillis = System.currentTimeMillis();
        FFMpegInvoker fFMpegInvoker = new FFMpegInvoker();
        this.f78038b.f78100e = new String[this.f78038b.f78097b.length];
        int i2 = 0;
        while (i2 < this.f78038b.f78097b.length) {
            String a2 = this.f78038b.a(i2);
            int addFastReverseVideo = fFMpegInvoker.addFastReverseVideo(this.f78038b.f78097b[i2], a2);
            if (this.ad) {
                y.c("VEEditor", "genReverseVideo fail: cancel reverse");
                this.ad = false;
                return -1;
            } else if (addFastReverseVideo == 0) {
                this.f78038b.f78100e[i2] = a2;
                i2++;
            } else {
                throw new r(-1, "reverse mResManager.mVideoPaths[i] failed: " + addFastReverseVideo);
            }
        }
        this.f78038b.g = true;
        com.ss.android.ttve.monitor.e.a(1, "te_edit_reverse_time", System.currentTimeMillis() - currentTimeMillis);
        return 0;
    }

    public final void d(boolean z2) {
        this.ak = true;
    }

    private int g(boolean z2) {
        return this.n.enableEffectAmazing(false);
    }

    public final int a(float f2) {
        return this.n.set2DBrushSize(f2);
    }

    public final void b(int i2) {
        this.at = i2;
        this.n.setBackGroundColor(i2);
    }

    public final int d(int i2) {
        return a(i2, false);
    }

    public final void f(boolean z2) {
        this.n.setDleEnabledPreview(z2);
    }

    public final int j(int i2) {
        this.n.setPreviewFps(i2);
        return 0;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        y.e("VEEditor", "onFrameAvailable...");
    }

    private int h(boolean z2) {
        y.c("VEEditor", "pause...");
        return this.n.pause();
    }

    public final void e(boolean z2) {
        this.n.setDleEnabled(z2);
    }

    public final int a(String str) {
        return b(str, 1.0f);
    }

    public final void b(@NonNull m mVar) {
        y.a("VEEditor", "setOnInfoListener...");
        this.h = mVar;
    }

    public final void c(int i2) {
        this.C = i2;
        y.c("VEEditor", "setPageMode: " + i2);
        this.n.setPageMode(i2);
    }

    public final boolean e(int i2) {
        boolean isInfoStickerAnimatable;
        synchronized (this) {
            y.a("VEEditor", "addInfoSticker...");
            isInfoStickerAnimatable = this.n.isInfoStickerAnimatable(i2);
        }
        return isInfoStickerAnimatable;
    }

    public final float[] g(int i2) throws r {
        float[] infoStickerBoundingBox;
        synchronized (this) {
            y.b("VEEditor", "getInfoStickerBoundingBox...");
            if (i2 >= 0) {
                infoStickerBoundingBox = this.n.getInfoStickerBoundingBox(i2);
            } else {
                throw new r(-100, "");
            }
        }
        return infoStickerBoundingBox;
    }

    public final int f(int i2) {
        synchronized (this) {
            y.a("VEEditor", "removeInfoSticker... index: " + i2);
            if (i2 < 0) {
                return -100;
            }
            this.z.a(1, i2);
            int removeInfoSticker = this.n.removeInfoSticker(i2);
            return removeInfoSticker;
        }
    }

    public final int h(@ColorInt int i2) {
        float f2 = ((float) ((i2 >>> 16) & 255)) * 0.003921569f;
        float f3 = ((float) ((i2 >>> 8) & 255)) * 0.003921569f;
        float f4 = ((float) (i2 & 255)) * 0.003921569f;
        return this.n.set2DBrushColor(f2, f3, f4, ((float) ((i2 >>> 24) & 255)) * 0.003921569f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int l(int r7) {
        /*
            r6 = this;
            com.ss.android.vesdk.m r7 = r6.h
            r0 = 0
            if (r7 == 0) goto L_0x005f
            com.ss.android.vesdk.p$g r7 = com.ss.android.vesdk.p.g.ERROR
            com.ss.android.vesdk.p$g r1 = r6.l()     // Catch:{ Exception -> 0x0012 }
            int r7 = r6.u()     // Catch:{ Exception -> 0x0010 }
            goto L_0x002a
        L_0x0010:
            r7 = move-exception
            goto L_0x0016
        L_0x0012:
            r1 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x0016:
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "prepareWithCallback error: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.ss.android.vesdk.y.d(r2, r7)
            r7 = 0
        L_0x002a:
            com.ss.android.ttve.nativePort.TEInterface r2 = r6.n
            int r2 = r2.prepareEngine(r0)
            if (r2 == 0) goto L_0x0033
            return r2
        L_0x0033:
            com.ss.android.ttve.nativePort.TEInterface r2 = r6.n
            int[] r2 = r2.getInitResolution()
            com.ss.android.vesdk.aj r3 = r6.f78037a
            r4 = r2[r0]
            r3.f77890a = r4
            com.ss.android.vesdk.aj r3 = r6.f78037a
            r4 = 1
            r2 = r2[r4]
            r3.f77891b = r2
            int r2 = r6.l
            if (r2 <= 0) goto L_0x0051
            int r2 = r6.m
            if (r2 <= 0) goto L_0x0051
            r6.z()
        L_0x0051:
            com.ss.android.vesdk.m r2 = r6.h
            r3 = 4120(0x1018, float:5.773E-42)
            int r1 = r1.ordinal()
            float r7 = (float) r7
            r4 = 0
            r2.a(r3, r1, r7, r4)
            return r0
        L_0x005f:
            com.ss.android.ttve.nativePort.TEInterface r7 = r6.n
            int r7 = r7.prepareEngine(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.l(int):int");
    }

    public final int i(int i2) {
        synchronized (this) {
            y.c("VEEditor", "deleteRepeatEffect... " + i2);
            int pauseSync = this.n.pauseSync();
            if (pauseSync == 0 || pauseSync == -101) {
                int removeFilter = this.n.removeFilter(new int[]{i2});
                this.z.f31260c = 0;
                this.n.createTimeline();
                return removeFilter;
            }
            y.a("VEEditor", "pauseSync failed, ret " + pauseSync);
            return -1;
        }
    }

    public final int k(int i2) {
        synchronized (this) {
            y.c("VEEditor", "deleteSlowEffect... " + i2);
            int pauseSync = this.n.pauseSync();
            if (pauseSync == 0 || pauseSync == -101) {
                int removeFilter = this.n.removeFilter(new int[]{i2});
                this.n.createTimeline();
                this.z.f31260c = 0;
                return removeFilter;
            }
            y.c("VEEditor", "pauseSync failed, ret " + pauseSync);
            return -1;
        }
    }

    public p(String str) throws r {
        if (!TextUtils.isEmpty(str)) {
            this.n = TEInterface.createEngine();
            this.f78038b = new com.ss.android.vesdk.runtime.b(str);
            this.n.setInfoListener(this.N);
            this.n.setErrorListener(this.O);
            com.ss.android.ttve.monitor.d.a("iesve_veeditor_offscreen", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
            g(false);
            return;
        }
        throw new r(-100, "workspace is: " + str);
    }

    public final int b(al alVar) {
        synchronized (this) {
            this.n.stop();
            int updateSceneFileOrder = this.n.updateSceneFileOrder(alVar);
            if (updateSceneFileOrder < 0) {
                y.d("VEEditor", "updateSceneFileOrder failed, ret = " + updateSceneFileOrder);
                return updateSceneFileOrder;
            }
            this.T = alVar.f77893b[0];
            this.n.createTimeline();
            if (this.J.f31140a == 1) {
                this.n.setTimeRange(0, this.n.getDuration(), 1);
            } else {
                this.n.setTimeRange(0, updateSceneFileOrder, 0);
            }
            int l2 = l(0);
            if (l2 == 0) {
                return 0;
            }
            y.d("VEEditor", "Prepare Engine failed, ret = " + l2);
            return l2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0117, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(boolean r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            monitor-enter(r18)
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "enableReversePlay:"
            r3.<init>(r4)     // Catch:{ all -> 0x0123 }
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.y.c(r2, r3)     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            boolean r2 = r2.g     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x0029
            java.lang.String r0 = "VEEditor"
            java.lang.String r2 = "enableReversePlay error: reverse video is not ready!"
            com.ss.android.vesdk.y.d(r0, r2)     // Catch:{ all -> 0x0123 }
            r0 = -100
            monitor-exit(r18)     // Catch:{ all -> 0x0123 }
            return r0
        L_0x0029:
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0118
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            java.lang.String[] r2 = r2.f78100e     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0118
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            java.lang.String[] r2 = r2.f78100e     // Catch:{ all -> 0x0123 }
            int r2 = r2.length     // Catch:{ all -> 0x0123 }
            if (r2 > 0) goto L_0x003c
            goto L_0x0118
        L_0x003c:
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.n     // Catch:{ all -> 0x0123 }
            long r7 = r2.getDurationUs()     // Catch:{ all -> 0x0123 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.n     // Catch:{ all -> 0x0123 }
            r2.stop()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x004e
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            java.lang.String[] r2 = r2.f78100e     // Catch:{ all -> 0x0123 }
            goto L_0x0052
        L_0x004e:
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            java.lang.String[] r2 = r2.f78097b     // Catch:{ all -> 0x0123 }
        L_0x0052:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.n     // Catch:{ all -> 0x0123 }
            r9 = 0
            int r2 = r3.updateTrackClips(r9, r9, r2)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0070
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "Create Scene failed, ret = "
            r3.<init>(r4)     // Catch:{ all -> 0x0123 }
            r3.append(r2)     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.y.d(r0, r3)     // Catch:{ all -> 0x0123 }
            monitor-exit(r18)     // Catch:{ all -> 0x0123 }
            return r2
        L_0x0070:
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            java.lang.String[] r2 = r2.f78101f     // Catch:{ all -> 0x0123 }
            r10 = 1
            if (r2 == 0) goto L_0x00c4
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            int r2 = r2.i     // Catch:{ all -> 0x0123 }
            if (r2 == r10) goto L_0x00c4
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            com.ss.android.ttve.nativePort.TEInterface r11 = r1.n     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.runtime.b r3 = r1.f78038b     // Catch:{ all -> 0x0123 }
            java.lang.String[] r3 = r3.f78101f     // Catch:{ all -> 0x0123 }
            r12 = r3[r9]     // Catch:{ all -> 0x0123 }
            r13 = 0
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.n     // Catch:{ all -> 0x0123 }
            int r14 = r3.getDuration()     // Catch:{ all -> 0x0123 }
            r15 = 0
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.n     // Catch:{ all -> 0x0123 }
            int r16 = r3.getDuration()     // Catch:{ all -> 0x0123 }
            r17 = 0
            int r3 = r11.addAudioTrack(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0123 }
            r2.h = r3     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.runtime.b r2 = r1.f78038b     // Catch:{ all -> 0x0123 }
            r2.i = r10     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "add org audio track index "
            r3.<init>(r4)     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.runtime.b r4 = r1.f78038b     // Catch:{ all -> 0x0123 }
            int r4 = r4.h     // Catch:{ all -> 0x0123 }
            r3.append(r4)     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = " type "
            r3.append(r4)     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.runtime.b r4 = r1.f78038b     // Catch:{ all -> 0x0123 }
            int r4 = r4.i     // Catch:{ all -> 0x0123 }
            r3.append(r4)     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.y.d(r2, r3)     // Catch:{ all -> 0x0123 }
        L_0x00c4:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.n     // Catch:{ all -> 0x0123 }
            r4 = 0
            r5 = 0
            boolean r2 = r1.aj     // Catch:{ all -> 0x0123 }
            if (r0 == r2) goto L_0x00ce
            r6 = 1
            goto L_0x00cf
        L_0x00ce:
            r6 = 0
        L_0x00cf:
            r3.updateTrackFilterDuration(r4, r5, r6, r7)     // Catch:{ all -> 0x0123 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.n     // Catch:{ all -> 0x0123 }
            r2.createTimeline()     // Catch:{ all -> 0x0123 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.n     // Catch:{ all -> 0x0123 }
            int r2 = r2.prepareEngine(r9)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x00f4
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "enableReversePlay() prepareEngine failed: result: "
            r3.<init>(r4)     // Catch:{ all -> 0x0123 }
            r3.append(r2)     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.y.d(r0, r3)     // Catch:{ all -> 0x0123 }
            monitor-exit(r18)     // Catch:{ all -> 0x0123 }
            return r2
        L_0x00f4:
            r2 = -1
            r1.af = r2     // Catch:{ all -> 0x0123 }
            com.ss.android.vesdk.p$d r2 = com.ss.android.vesdk.p.d.EDITOR_SEEK_FLAG_LastSeek     // Catch:{ all -> 0x0123 }
            r1.a((int) r9, (com.ss.android.vesdk.p.d) r2)     // Catch:{ all -> 0x0123 }
            r1.aj = r0     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x0116
            com.ss.android.vesdk.keyvaluepair.a r0 = new com.ss.android.vesdk.keyvaluepair.a     // Catch:{ all -> 0x0123 }
            r0.<init>()     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = "iesve_veeditor_time_effect_id"
            java.lang.String r3 = "reverse"
            r0.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = "iesve_veeditor_time_effect"
            com.ss.android.ttve.monitor.d.a((java.lang.String) r2, (int) r10, (com.ss.android.vesdk.keyvaluepair.a) r0)     // Catch:{ all -> 0x0123 }
            com.ss.android.ttve.monitor.f r0 = r1.z     // Catch:{ all -> 0x0123 }
            r2 = 3
            r0.f31260c = r2     // Catch:{ all -> 0x0123 }
        L_0x0116:
            monitor-exit(r18)     // Catch:{ all -> 0x0123 }
            return r9
        L_0x0118:
            java.lang.String r0 = "VEEditor"
            java.lang.String r2 = "enableReversePlay error: reverse video path is invalid!"
            com.ss.android.vesdk.y.d(r0, r2)     // Catch:{ all -> 0x0123 }
            r0 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r18)     // Catch:{ all -> 0x0123 }
            return r0
        L_0x0123:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0123 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.c(boolean):int");
    }

    public final int b(int[] iArr) {
        int removeFilter;
        synchronized (this) {
            y.c("VEEditor", "deleteAudioFilter..." + iArr[0]);
            removeFilter = this.n.removeFilter(iArr);
        }
        return removeFilter;
    }

    public final void b(int i2, int i3) {
        this.n.setMaxWidthHeight(i2, i3);
    }

    private int a(int i2, boolean z2) {
        synchronized (this) {
            y.c("VEEditor", "deleteAudioTrack...");
            if (i2 < 0) {
                return -100;
            }
            int b2 = this.I.b(1, i2);
            this.I.f31150a.remove(Integer.valueOf(i2));
            int deleteAudioTrack = this.n.deleteAudioTrack(b2, false);
            return deleteAudioTrack;
        }
    }

    public final int b(int i2, float f2) {
        synchronized (this) {
            y.b("VEEditor", "setInfoStickerScale... index: " + i2 + "scale: " + f2);
            if (i2 < 0) {
                return -100;
            }
            int filterParam = this.n.setFilterParam(i2, "entity scale x", String.valueOf(f2)) + this.n.setFilterParam(i2, "entity scale y", String.valueOf(f2));
            return filterParam;
        }
    }

    public final int c(int i2, float f2) {
        synchronized (this) {
            y.b("VEEditor", "setInfoStickerAlpha... index: " + i2 + "alpha: " + f2);
            if (i2 < 0) {
                return -100;
            }
            int filterParam = this.n.setFilterParam(i2, "entity alpha", String.valueOf(f2));
            return filterParam;
        }
    }

    private int b(String str, float f2) {
        int i2;
        synchronized (this) {
            if (this.ah < 0) {
                return -105;
            }
            if (str == null) {
                str = "";
                f2 = 0.0f;
            }
            this.n.setFilterParam(this.ah, "effect res path", str);
            TEInterface tEInterface = this.n;
            int i3 = this.ah;
            tEInterface.setFilterParam(i3, "effect hdr intensity", f2);
            if (str.length() > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            com.ss.android.ttve.monitor.d.a("iesve_veeditor_set_effect_hdr", i2, (com.ss.android.vesdk.keyvaluepair.a) null);
            return 0;
        }
    }

    public final int c(int i2, int i3) {
        synchronized (this) {
            y.b("VEEditor", "setInfoStickerLayer... index: " + i2 + "layer: " + i3);
            if (i2 < 0) {
                return -100;
            }
            int filterParam = this.n.setFilterParam(i2, "entity layer", String.valueOf(i3));
            return filterParam;
        }
    }

    public p(String str, SurfaceView surfaceView) {
        if (!TextUtils.isEmpty(str)) {
            y.a("VEEditor", "VEEditor surfaceView");
            this.n = TEInterface.createEngine();
            this.f78038b = new com.ss.android.vesdk.runtime.b(str);
            this.U = surfaceView;
            surfaceView.getHolder().addCallback(this.aw);
            this.n.setOpenGLListeners(this.ax);
            this.n.setInfoListener(this.N);
            this.n.setErrorListener(this.O);
            g(false);
            return;
        }
        throw new r(-100, "workspace is: " + str);
    }

    private int a(int i2, int i3, e eVar) {
        int timeRange;
        synchronized (this) {
            timeRange = this.n.setTimeRange(i2, i3, eVar.getValue());
        }
        return timeRange;
    }

    private boolean b(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) throws r {
        synchronized (this) {
            if (!this.ab) {
                throw new r(-105, "编码前需确保初始化成功！！！");
            } else if (this.n.getNativeHandler() == 0) {
                return false;
            } else {
                VERuntime.a().nativeSetVideoEncodeSetting(vEVideoEncodeSettings);
                String str3 = str;
                this.t = str3;
                this.u = System.currentTimeMillis();
                if (this.ak) {
                    ag displayRect = this.n.getDisplayRect();
                    if (displayRect.f77886c == 0 || displayRect.f77887d == 0) {
                        this.an = null;
                    } else {
                        if (displayRect.f77886c % 2 == 1) {
                            displayRect.f77886c++;
                        }
                        if (displayRect.f77887d % 2 == 1) {
                            displayRect.f77887d++;
                        }
                        this.an = Bitmap.createBitmap(displayRect.f77886c, displayRect.f77887d, Bitmap.Config.ARGB_8888);
                        this.n.getDisplayImage(this.an);
                        Matrix matrix = new Matrix();
                        matrix.postRotate(this.ao);
                        matrix.postScale(this.ap, this.aq);
                        this.an = Bitmap.createBitmap(this.an, 0, 0, this.an.getWidth(), this.an.getHeight(), matrix, true);
                    }
                }
                y.c("VEEditor", "compile...");
                this.n.stop();
                switch (vEVideoEncodeSettings.getCompileType()) {
                    case COMPILE_TYPE_MP4:
                        this.n.setCompileType(1);
                        this.f78039c = "mp4";
                        break;
                    case COMPILE_TYPE_GIF:
                        this.n.setCompileType(2);
                        this.f78039c = "gif";
                        break;
                    case COMPILE_TYPE_HIGH_GIF:
                        if (this.w == null || !this.w.f78070e) {
                            this.v = true;
                            this.n.setCompileType(4);
                            if (this.w == null) {
                                this.w = new b();
                            }
                            str3 = new File(this.t).getParent() + File.separatorChar + "gif.mp4";
                            this.w.f78067b = str3;
                            b bVar = this.w;
                            bVar.f78068c = this.t;
                            if (TextUtils.isEmpty(bVar.f78068c)) {
                                bVar.f78066a = null;
                            } else {
                                bVar.f78066a = new File(bVar.f78068c).getParent() + File.separatorChar + "palette.png";
                            }
                            this.w.f78071f = this.D;
                            b bVar2 = this.w;
                            double d2 = this.E;
                            double d3 = (double) vEVideoEncodeSettings.getVideoRes().f77890a;
                            Double.isNaN(d3);
                            bVar2.g = (int) (d2 * d3);
                            b bVar3 = this.w;
                            double d4 = this.F;
                            double d5 = (double) vEVideoEncodeSettings.getVideoRes().f77891b;
                            Double.isNaN(d5);
                            bVar3.h = (int) (d4 * d5);
                            b bVar4 = this.w;
                            double d6 = this.G;
                            double d7 = (double) vEVideoEncodeSettings.getVideoRes().f77890a;
                            Double.isNaN(d7);
                            bVar4.i = (int) (d6 * d7);
                            b bVar5 = this.w;
                            double d8 = this.H;
                            double d9 = (double) vEVideoEncodeSettings.getVideoRes().f77891b;
                            Double.isNaN(d9);
                            bVar5.j = (int) (d8 * d9);
                            this.f78039c = "high_gif";
                            break;
                        } else {
                            return false;
                        }
                    default:
                        this.n.setCompileType(1);
                        this.f78039c = "mp4";
                        break;
                }
                this.n.setCompileFps(vEVideoEncodeSettings.getFps());
                this.n.setEngineCompilePath(str3, str2);
                this.n.setResizer(vEVideoEncodeSettings.getResizeMode(), vEVideoEncodeSettings.getResizeX(), vEVideoEncodeSettings.getResizeY());
                this.n.setUsrRotate(vEVideoEncodeSettings.getRotate());
                this.n.setSpeedRatio(vEVideoEncodeSettings.getSpeed());
                this.n.setEnableRemuxVideo(vEVideoEncodeSettings.isEnableRemuxVideo());
                this.n.setEnableInterLeave(vEVideoEncodeSettings.isEnableInterLeave());
                if (this.x != null) {
                    this.n.setEncoderParallel(true);
                    this.n.setEncoderDataListener(this.ay);
                } else {
                    this.n.setEncoderParallel(false);
                    this.n.setEncoderDataListener(null);
                }
                this.n.setWidthHeight(vEVideoEncodeSettings.getVideoRes().f77890a, vEVideoEncodeSettings.getVideoRes().f77891b);
                VEWatermarkParam watermarkParam = vEVideoEncodeSettings.getWatermarkParam();
                if (watermarkParam == null || !watermarkParam.needExtFile) {
                    if (watermarkParam != null) {
                        this.n.setEnableRemuxVideo(false);
                    }
                    if (this.n.prepareEngine(1) != 0) {
                        b();
                        return false;
                    }
                } else {
                    this.n.setCompileWatermark(watermarkParam);
                    if (this.n.prepareEngine(2) != 0) {
                        b();
                        return false;
                    }
                }
                if (watermarkParam != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(watermarkParam.images);
                    if (watermarkParam.secondHalfImages != null) {
                        arrayList.add(watermarkParam.secondHalfImages);
                    }
                    this.n.setWaterMark(arrayList, watermarkParam.interval, watermarkParam.xOffset, watermarkParam.yOffset, watermarkParam.width, watermarkParam.height, watermarkParam.duration, watermarkParam.position, watermarkParam.mask);
                    com.ss.android.ttve.monitor.e.a(1, "te_composition_watermark_add", 1);
                } else {
                    com.ss.android.ttve.monitor.e.a(1, "te_composition_watermark_add", 0);
                }
                this.n.start();
                com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
                aVar.a("iesve_veeditor_composition_start_file", this.f78039c);
                com.ss.android.ttve.monitor.d.a("iesve_veeditor_composition_start", 1, aVar);
                return true;
            }
        }
    }

    public p(String str, SurfaceView surfaceView, long j2) {
        if (!TextUtils.isEmpty(str)) {
            y.a("VEEditor", "VEEditor surfaceView with handler");
            this.n = TEInterface.createEngine(j2);
            this.f78038b = new com.ss.android.vesdk.runtime.b(str);
            this.U = surfaceView;
            surfaceView.getHolder().addCallback(this.aw);
            this.n.setOpenGLListeners(this.ax);
            this.n.setInfoListener(this.N);
            this.n.setErrorListener(this.O);
            g(false);
            return;
        }
        throw new r(-100, "workspace is: " + str);
    }

    private List<List<List<MVResourceBean>>> a(MVInfoBean mVInfoBean, List<String> list, List<String> list2) {
        ArrayList<MVResourceBean> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList3.add(arrayList4);
        arrayList3.add(arrayList5);
        ArrayList<MVResourceBean> arrayList6 = mVInfoBean.resources;
        ArrayList arrayList7 = new ArrayList();
        while (arrayList7.size() != arrayList6.size()) {
            ArrayList arrayList8 = new ArrayList();
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (MVResourceBean next : arrayList6) {
                if (!arrayList7.contains(Integer.valueOf(next.rid))) {
                    if ("video".equals(next.type) || "img".equals(next.type)) {
                        List<String> list3 = list2;
                        if (next.seqIn >= d2) {
                            MVResourceBean mVResourceBean = new MVResourceBean();
                            mVResourceBean.seqIn = next.seqIn * 1000.0d;
                            mVResourceBean.seqOut = next.seqOut * 1000.0d;
                            mVResourceBean.trimIn = next.trimIn * 1000.0d;
                            mVResourceBean.trimOut = next.trimOut * 1000.0d;
                            if (!"img".equals(next.type)) {
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                            } else if (mVResourceBean.trimOut == 0.0d) {
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                                mVResourceBean.trimOut = mVResourceBean.seqOut - mVResourceBean.seqIn;
                            } else {
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                            }
                            mVResourceBean.content = next.content;
                            mVResourceBean.type = next.type;
                            mVResourceBean.rid = next.rid;
                            arrayList8.add(mVResourceBean);
                            d2 = next.seqOut;
                            arrayList7.add(Integer.valueOf(mVResourceBean.rid));
                            list.add(mVResourceBean.content);
                            arrayList5 = arrayList2;
                        }
                    } else if (!"audio".equals(next.type) || next.seqIn < d3) {
                        List<String> list4 = list2;
                    } else {
                        ArrayList arrayList9 = new ArrayList();
                        MVResourceBean mVResourceBean2 = new MVResourceBean();
                        mVResourceBean2.seqIn = next.seqIn * 1000.0d;
                        mVResourceBean2.seqOut = next.seqOut * 1000.0d;
                        mVResourceBean2.trimIn = next.trimIn * 1000.0d;
                        mVResourceBean2.trimOut = next.trimOut * 1000.0d;
                        mVResourceBean2.content = next.content;
                        mVResourceBean2.type = next.type;
                        mVResourceBean2.rid = next.rid;
                        if (this.j == 0) {
                            this.j = mVResourceBean2.rid;
                        }
                        arrayList9.add(mVResourceBean2);
                        d3 = next.seqOut;
                        arrayList7.add(Integer.valueOf(mVResourceBean2.rid));
                        list2.add(mVResourceBean2.content);
                        if (arrayList9.size() > 0) {
                            arrayList5.add(arrayList9);
                        }
                    }
                    arrayList2 = arrayList5;
                    arrayList = arrayList6;
                    List<String> list5 = list;
                    arrayList5 = arrayList2;
                } else {
                    List<String> list6 = list2;
                    arrayList = arrayList6;
                    List<String> list7 = list;
                }
                arrayList6 = arrayList;
            }
            List<String> list8 = list2;
            ArrayList arrayList10 = arrayList5;
            ArrayList<MVResourceBean> arrayList11 = arrayList6;
            List<String> list9 = list;
            if (arrayList8.size() > 0) {
                arrayList4.add(arrayList8);
            }
            arrayList5 = arrayList10;
            arrayList6 = arrayList11;
        }
        return arrayList3;
    }

    private int a(String str, float f2, boolean z2, boolean z3) {
        synchronized (this) {
            if (this.ae < 0) {
                return -105;
            }
            if (f2 >= 0.0f) {
                if (str != null) {
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (this.ai == null) {
                        this.ai = new com.ss.android.ttve.model.d();
                    }
                    if (!z3 && str.equals(this.ai.f31215a) && this.ai.f31216b.length() == 0 && this.ai.f31218d == f2 && this.ai.f31217c == 1.0f && !this.ai.f31219e) {
                        return 0;
                    }
                    this.ai.f31215a = str;
                    this.ai.f31216b = "";
                    this.ai.f31217c = 1.0f;
                    this.ai.f31218d = f2;
                    this.ai.f31219e = false;
                    this.n.setFilterParam(this.ae, "left filter", str);
                    this.n.setFilterParam(this.ae, "use filter res intensity", "false");
                    TEInterface tEInterface = this.n;
                    int i2 = this.ae;
                    tEInterface.setFilterParam(i2, "filter intensity", f2);
                    this.n.setFilterParam(this.ae, "right filter", "");
                    this.n.setFilterParam(this.ae, "filter position", "1.0");
                    com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
                    String str2 = "";
                    if (!TextUtils.isEmpty(str)) {
                        String[] split = str.split(File.separator);
                        if (split.length > 0) {
                            str2 = split[split.length - 1];
                        }
                    }
                    aVar.a("iesve_veeditor_set_filter_click_filter_id", str2);
                    com.ss.android.ttve.monitor.d.a("iesve_veeditor_set_filter_click", 1, aVar);
                    com.ss.android.ttve.monitor.e.a(1, "te_composition_filter_id", str);
                    return 0;
                }
            }
            return -100;
        }
    }

    private int a(String str, String str2, float f2, float f3, boolean z2) {
        if (this.ae < 0) {
            return -105;
        }
        if (f3 < 0.0f || f2 < 0.0f || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (this.ai == null) {
            this.ai = new com.ss.android.ttve.model.d();
        }
        if (str.equals(this.ai.f31215a) && str2.equals(this.ai.f31216b) && this.ai.f31218d == f3 && this.ai.f31217c == f2 && !this.ai.f31219e) {
            return 0;
        }
        this.ai.f31215a = str;
        this.ai.f31216b = str2;
        this.ai.f31217c = f2;
        this.ai.f31218d = f3;
        this.ai.f31219e = false;
        y.b("VEEditor", "leftFilterPath: " + str + "\nrightFilterPath: " + str2 + " position: " + f2 + " intensity: " + f3);
        this.n.setFilterParam(this.ae, "left filter", str);
        this.n.setFilterParam(this.ae, "use filter res intensity", "false");
        TEInterface tEInterface = this.n;
        int i2 = this.ae;
        StringBuilder sb = new StringBuilder();
        sb.append(f3);
        tEInterface.setFilterParam(i2, "filter intensity", sb.toString());
        this.n.setFilterParam(this.ae, "right filter", str2);
        TEInterface tEInterface2 = this.n;
        int i3 = this.ae;
        tEInterface2.setFilterParam(i3, "filter position", f2);
        com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
        String str3 = "";
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split2 = str2.split(File.separator);
            if (split2.length > 0) {
                str4 = split2[split2.length - 1];
            }
        }
        aVar.a("iesve_veeditor_set_filter_slide_left_id", str3);
        aVar.a("iesve_veeditor_set_filter_slide_right_id", str4);
        com.ss.android.ttve.monitor.d.a("iesve_veeditor_set_filter_slide", 1, aVar);
        return 0;
    }

    public static p a(com.ss.android.vesdk.runtime.b bVar, al alVar, int i2, int i3, VEListener.h hVar) {
        int i4;
        int i5;
        com.ss.android.vesdk.runtime.b bVar2 = bVar;
        al alVar2 = alVar;
        final VEListener.h hVar2 = hVar;
        y.c("VEEditor", "genReverseVideo with param:startTime:" + i4 + "endTime:" + i5);
        p pVar = new p(bVar2.f78096a);
        final TEReverseCallback tEReverseCallback = new TEReverseCallback();
        tEReverseCallback.setListener(hVar2);
        bVar2.g = false;
        float[] fArr = new float[alVar2.i.length];
        for (int i6 = 0; i6 < alVar2.i.length; i6++) {
            fArr[i6] = (float) alVar2.i[i6];
        }
        pVar.a(alVar2.f77892a, alVar2.f77896e, alVar2.f77897f, null, alVar2.f77894c, alVar2.g, alVar2.h, fArr, alVar2.k, i.VIDEO_OUT_RATIO_ORIGINAL);
        VEVideoEncodeSettings.a f2 = new VEVideoEncodeSettings.a(2).a(-1, -1).a(30).b(false).c(13).f(1);
        f2.f77859a.mWatermarkParam = null;
        VEVideoEncodeSettings a2 = f2.a(VEVideoEncodeSettings.e.ENCODE_PROFILE_BASELINE).a(VEVideoEncodeSettings.d.ENCODE_LEVEL_ULTRAFAST).a();
        pVar.a(i4, i5, e.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
        String a3 = bVar2.a(0);
        String str = com.ss.android.vesdk.runtime.e.a(bVar2.f78096a, "concat") + File.separator + 0 + "_reverse" + ".wav";
        p pVar2 = pVar;
        final String str2 = a3;
        final String a4 = bVar2.a(1);
        final com.ss.android.vesdk.runtime.b bVar3 = bVar;
        final String str3 = str;
        p pVar3 = pVar;
        final VEListener.h hVar3 = hVar;
        AnonymousClass9 r0 = new m(pVar2) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f78059a;

            public final void a(int i, int i2, float f2, String str) {
                if (i != 4103) {
                    if (i == 4105) {
                        TEReverseCallback tEReverseCallback = tEReverseCallback;
                        double d2 = (double) f2;
                        Double.isNaN(d2);
                        tEReverseCallback.onProgressChanged(d2 * 0.5d);
                    }
                } else if (this.f78059a.y()) {
                    TEVideoUtils.reverseAllIVideo(str2, a4, tEReverseCallback);
                    new Thread(new Runnable() {
                        public final void run() {
                            AnonymousClass9.this.f78059a.k();
                            com.ss.android.vesdk.runtime.b bVar = bVar3;
                            bVar.f78097b = new String[]{str2};
                            com.ss.android.vesdk.runtime.b bVar2 = bVar3;
                            bVar2.f78101f = new String[]{str3};
                            com.ss.android.vesdk.runtime.b bVar3 = bVar3;
                            bVar3.f78100e = new String[]{a4};
                            bVar3.g = true;
                            if (hVar3 != null) {
                                hVar3.a(0);
                            }
                        }
                    }).start();
                }
            }

            {
                this.f78059a = r1;
            }
        };
        pVar3.b((m) r0);
        pVar3.a((m) new m(pVar3) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f78044a;

            {
                this.f78044a = r1;
            }

            public final void a(int i, int i2, float f2, String str) {
                new Thread(new Runnable() {
                    public final void run() {
                        AnonymousClass10.this.f78044a.k();
                        if (hVar2 != null) {
                            hVar2.a(-1);
                        }
                    }
                }).start();
            }
        });
        pVar3.a(a3, str, a2);
        return pVar3;
    }

    public final int b(@NonNull String str, float f2, float f3, float f4, float f5) {
        y.a("VEEditor", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        com.ss.android.ttve.monitor.d.a("iesve_veeditor_import_sticker", 1, (com.ss.android.vesdk.keyvaluepair.a) null);
        return this.n.addInfoSticker(str, new String[]{"0.0", "0.0", "1.0", String.valueOf(f5), PushConstants.PUSH_TYPE_THROUGH_MESSAGE});
    }

    private static void a(List<MVResourceBean> list, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5) {
        int i2 = 0;
        for (MVResourceBean next : list) {
            iArr[i2] = (int) next.trimIn;
            iArr2[i2] = (int) next.trimOut;
            iArr3[i2] = (int) next.seqIn;
            iArr4[i2] = (int) next.seqOut;
            strArr[i2] = next.content;
            iArr5[i2] = next.rid;
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b(@android.support.annotation.NonNull java.lang.String r13, @android.support.annotation.NonNull java.lang.String[] r14, @android.support.annotation.NonNull java.lang.String[] r15, @android.support.annotation.Nullable java.lang.String r16, int r17, int r18, boolean r19) {
        /*
            r12 = this;
            r9 = r12
            monitor-enter(r12)
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "reinitMV..."
            com.ss.android.vesdk.y.a(r0, r1)     // Catch:{ all -> 0x0096 }
            if (r13 == 0) goto L_0x008b
            if (r14 == 0) goto L_0x008b
            if (r15 != 0) goto L_0x0011
            goto L_0x008b
        L_0x0011:
            com.ss.android.vesdk.p$d r1 = com.ss.android.vesdk.p.d.EDITOR_SEEK_FLAG_LastSeek     // Catch:{ all -> 0x0096 }
            r10 = 0
            r12.a((int) r10, (com.ss.android.vesdk.p.d) r1)     // Catch:{ all -> 0x0096 }
            com.ss.android.ttve.nativePort.TEInterface r1 = r9.n     // Catch:{ all -> 0x0096 }
            int r1 = r1.stop()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "stop in reinitMV failed, ret = "
            r2.<init>(r3)     // Catch:{ all -> 0x0096 }
            r2.append(r1)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0096 }
            com.ss.android.vesdk.y.a(r0, r1)     // Catch:{ all -> 0x0096 }
            r0 = -1
            monitor-exit(r12)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x0035:
            r9.j = r10     // Catch:{ all -> 0x0096 }
            r1 = 2
            int[] r1 = new int[r1]     // Catch:{ all -> 0x0096 }
            int r2 = r9.ae     // Catch:{ all -> 0x0096 }
            r1[r10] = r2     // Catch:{ all -> 0x0096 }
            int r2 = r9.ah     // Catch:{ all -> 0x0096 }
            r11 = 1
            r1[r11] = r2     // Catch:{ all -> 0x0096 }
            r12.a((int[]) r1)     // Catch:{ all -> 0x0096 }
            r8 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            int r0 = r1.a((java.lang.String) r2, (java.lang.String[]) r3, (java.lang.String[]) r4, (java.lang.String) r5, (int) r6, (int) r7, (boolean) r8)     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = "VEEditor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "init2 in reinitMV failed, ret = "
            r2.<init>(r3)     // Catch:{ all -> 0x0096 }
            r2.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0096 }
            com.ss.android.vesdk.y.d(r1, r2)     // Catch:{ all -> 0x0096 }
            monitor-exit(r12)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x006c:
            com.ss.android.ttve.nativePort.TEInterface r0 = r9.n     // Catch:{ all -> 0x0096 }
            r0.createTimeline()     // Catch:{ all -> 0x0096 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r9.n     // Catch:{ all -> 0x0096 }
            int r0 = r0.prepareEngine(r10)     // Catch:{ all -> 0x0096 }
            com.ss.android.ttve.nativePort.TEInterface r1 = r9.n     // Catch:{ all -> 0x0096 }
            r1.updateTrackFilter(r10, r10, r10)     // Catch:{ all -> 0x0096 }
            com.ss.android.ttve.model.d r1 = r9.ai     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0089
            com.ss.android.ttve.model.d r1 = r9.ai     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.f31215a     // Catch:{ all -> 0x0096 }
            r2 = 1065353216(0x3f800000, float:1.0)
            r12.a((java.lang.String) r1, (float) r2, (boolean) r10, (boolean) r11)     // Catch:{ all -> 0x0096 }
        L_0x0089:
            monitor-exit(r12)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x008b:
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "reinitMV bad input file, please call init2 first"
            com.ss.android.vesdk.y.a(r0, r1)     // Catch:{ all -> 0x0096 }
            r0 = -205(0xffffffffffffff33, float:NaN)
            monitor-exit(r12)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x0096:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0096 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.p.b(java.lang.String, java.lang.String[], java.lang.String[], java.lang.String, int, int, boolean):int");
    }

    private int a(@NonNull String str, @NonNull String[] strArr, @NonNull String[] strArr2, @Nullable String str2, int i2, int i3, boolean z2) {
        boolean z3;
        com.ss.android.ttve.monitor.e.d(1);
        com.ss.android.ttve.monitor.e.c(1);
        this.s = System.currentTimeMillis();
        y.a("VEEditor", "init...");
        this.M = str;
        this.K = strArr;
        this.L = strArr2;
        TEInterface tEInterface = this.n;
        if (this.U != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.A = (MVInfoBean) tEInterface.initMVResources(str, strArr, strArr2, str2, i2, i3, z3, z2);
        if (this.A == null) {
            y.d("VEEditor", "initMVInternal failed");
            return -1;
        }
        B = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<List<List<MVResourceBean>>> a2 = a(this.A, (List<String>) arrayList, (List<String>) arrayList2);
        if (a2.size() != 0) {
            List<List> list = a2.get(0);
            if (list.size() != 0) {
                int size = ((List) list.get(0)).size();
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                int[] iArr3 = new int[size];
                int[] iArr4 = new int[size];
                String[] strArr3 = new String[size];
                int[] iArr5 = new int[size];
                a((List) list.get(0), iArr, iArr2, iArr3, iArr4, strArr3, iArr5);
                List<List> list2 = a2.get(1);
                i iVar = i.VIDEO_OUT_RATIO_ORIGINAL;
                float f2 = ((((float) this.A.width) * 1.0f) / ((float) this.A.height)) * 1.0f;
                if (f2 == 1.0f) {
                    iVar = i.VIDEO_OUT_RATIO_1_1;
                } else if (f2 == 0.75f) {
                    iVar = i.VIDEO_OUT_RATIO_3_4;
                } else if (f2 == 1.3333334f) {
                    iVar = i.VIDEO_OUT_RATIO_4_3;
                } else if (f2 == 1.7777778f) {
                    iVar = i.VIDEO_OUT_RATIO_16_9;
                } else if (f2 == 0.5625f) {
                    iVar = i.VIDEO_OUT_RATIO_9_16;
                }
                int createScene2 = this.n.createScene2(strArr3, iArr, iArr2, iArr3, iArr4, null, null, null, null, null, iArr5, null, null, null, iVar.ordinal());
                if (createScene2 != 0) {
                    y.d("VEEditor", "Create Scene failed, ret = " + createScene2);
                    b();
                    this.ab = false;
                    return createScene2;
                }
                t();
                boolean z4 = true;
                for (List list3 : list) {
                    if (z4) {
                        z4 = false;
                    } else {
                        int size2 = list3.size();
                        int[] iArr6 = new int[size2];
                        int[] iArr7 = new int[size2];
                        int[] iArr8 = new int[size2];
                        int[] iArr9 = new int[size2];
                        String[] strArr4 = new String[size2];
                        int[] iArr10 = new int[size2];
                        a(list3, iArr6, iArr7, iArr8, iArr9, strArr4, iArr10);
                        String[] strArr5 = strArr4;
                        this.n.addVideoTrackForMV(strArr5, null, iArr8, iArr9, iArr6, iArr7, iArr10);
                    }
                }
                for (List list4 : list2) {
                    if (list4.size() != 0) {
                        String str3 = ((MVResourceBean) list4.get(0)).content;
                        int i4 = ((MVResourceBean) list4.get(0)).rid;
                        int addAudioTrackForMV = this.n.addAudioTrackForMV(str3, (int) ((MVResourceBean) list4.get(0)).seqIn, (int) ((MVResourceBean) list4.get(0)).seqOut, (int) ((MVResourceBean) list4.get(0)).trimIn, (int) ((MVResourceBean) list4.get(0)).trimOut, i4, true);
                        if (i4 == this.j) {
                            this.k = addAudioTrackForMV;
                        }
                    }
                }
                this.ab = true;
                this.ac = false;
                this.Y = iVar;
                this.f78038b.f78098c = new String[arrayList2.size()];
                this.f78038b.f78097b = new String[arrayList2.size()];
                arrayList2.toArray(this.f78038b.f78098c);
                arrayList.toArray(this.f78038b.f78097b);
                this.f78038b.f78099d = null;
                this.af = -1;
                this.R = Boolean.FALSE;
                this.f78038b.i = 0;
                this.f78038b.h = 0;
                this.T = 0;
                this.n.setWidthHeight(this.A.width, this.A.height);
                return A();
            }
            throw new r(-1, "没有MV视频信息");
        }
        throw new r(-1, "没有MV信息");
    }
}
