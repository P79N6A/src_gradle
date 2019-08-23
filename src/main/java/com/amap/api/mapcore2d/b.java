package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.amap.api.a.e;
import com.amap.api.a.m;
import com.amap.api.mapcore2d.au;
import com.amap.api.mapcore2d.bb;
import com.amap.api.mapcore2d.bm;
import com.amap.api.mapcore2d.l;
import com.amap.api.mapcore2d.n;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.LocationSource;
import com.amap.api.maps2d.Projection;
import com.amap.api.maps2d.UiSettings;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.Circle;
import com.amap.api.maps2d.model.CircleOptions;
import com.amap.api.maps2d.model.GroundOverlay;
import com.amap.api.maps2d.model.GroundOverlayOptions;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.MyLocationStyle;
import com.amap.api.maps2d.model.Polygon;
import com.amap.api.maps2d.model.PolygonOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.maps2d.model.Text;
import com.amap.api.maps2d.model.TextOptions;
import com.amap.api.maps2d.model.TileOverlay;
import com.amap.api.maps2d.model.TileOverlayOptions;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class b extends View implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, bb.b, bm.a, l.a, n.a, y {
    private static int aH = Color.rgb(222, 215, 214);
    private static Paint aI = null;
    private static Bitmap aJ = null;
    private d A;
    private AMap.OnMyLocationChangeListener B;
    private boolean C = true;
    private bc D;
    /* access modifiers changed from: private */
    public cd E;
    private bk F;
    private LocationSource G;
    private p H;
    private a I = null;
    /* access modifiers changed from: private */
    public boolean J = false;
    /* access modifiers changed from: private */
    public boolean K = false;
    /* access modifiers changed from: private */
    public AMap.OnCameraChangeListener L;
    /* access modifiers changed from: private */
    public k M;
    /* access modifiers changed from: private */
    public AMap.CancelableCallback N = null;
    private av O;
    private boolean P = false;
    private boolean Q = false;
    /* access modifiers changed from: private */
    public View R;
    private AMap.OnInfoWindowClickListener S;
    private AMap.InfoWindowAdapter T;
    /* access modifiers changed from: private */
    public ay U;
    private AMap.OnMarkerClickListener V;
    private Drawable W = null;
    private ah Z;

    /* renamed from: a  reason: collision with root package name */
    az f5687a;
    private float aA;
    private float aB;
    private int aC;
    private int aD;
    private long aE = 0;
    private int aF = 0;
    private int aG = 0;
    private int aK = 0;
    private boolean aL = false;
    private a aM = null;
    private boolean aa = false;
    private boolean ab = false;
    private boolean ac = false;
    private AMap.OnMarkerDragListener ad;
    /* access modifiers changed from: private */
    public AMap.OnMapTouchListener ae;
    private AMap.OnMapLongClickListener af;
    /* access modifiers changed from: private */
    public AMap.OnMapLoadedListener ag;
    private AMap.OnMapClickListener ah;
    private boolean ai = false;
    /* access modifiers changed from: private */
    public AMap.OnMapScreenShotListener aj = null;
    private Timer ak = null;
    private Thread al = null;
    private TimerTask am = new TimerTask() {
        public void run() {
            try {
                b.this.k.sendEmptyMessage(19);
            } catch (Throwable th) {
                cm.a(th, "AMapDelegateImpGLSurfaceView", "TimerTask run");
            }
        }
    };
    private Handler an = new Handler();
    private Handler ao = new Handler() {

        /* renamed from: a  reason: collision with root package name */
        String f5694a = "onTouchHandler";

        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                if (b.this.ae != null) {
                    b.this.ae.onTouch((MotionEvent) message.obj);
                }
            } catch (Throwable th) {
                cm.a(th, "AMapDelegateImpGLSurfaceView", this.f5694a);
            }
        }
    };
    private Point ap;
    private GestureDetector aq;
    private bb.a ar;
    private ArrayList<GestureDetector.OnGestureListener> as = new ArrayList<>();
    private ArrayList<bb.b> at = new ArrayList<>();
    private Scroller au;
    private int av = 0;
    private int aw = 0;
    private Matrix ax = new Matrix();
    private float ay = 1.0f;
    private boolean az = false;

    /* renamed from: b  reason: collision with root package name */
    public aq f5688b;

    /* renamed from: c  reason: collision with root package name */
    float[] f5689c = new float[2];

    /* renamed from: d  reason: collision with root package name */
    boolean f5690d;

    /* renamed from: e  reason: collision with root package name */
    as f5691e = new as(this);

    /* renamed from: f  reason: collision with root package name */
    ce f5692f;
    public au g;
    protected al h;
    public bu i;
    public at j;
    final Handler k = new Handler() {

        /* renamed from: a  reason: collision with root package name */
        String f5696a = "handleMessage";

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                if (r9 == 0) goto L_0x023c
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this
                com.amap.api.mapcore2d.az r0 = r0.f5687a
                if (r0 == 0) goto L_0x023c
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this
                com.amap.api.mapcore2d.az r0 = r0.f5687a
                com.amap.api.mapcore2d.az$c r0 = r0.f5665c
                if (r0 != 0) goto L_0x0012
                goto L_0x023c
            L_0x0012:
                int r0 = r9.what     // Catch:{ Throwable -> 0x0233 }
                r1 = 2
                if (r0 == r1) goto L_0x0214
                r2 = 13
                r3 = 1
                if (r0 == r2) goto L_0x01a0
                r1 = 19
                if (r0 == r1) goto L_0x0188
                switch(r0) {
                    case 10: goto L_0x0163;
                    case 11: goto L_0x014b;
                    default: goto L_0x0023;
                }     // Catch:{ Throwable -> 0x0233 }
            L_0x0023:
                r1 = 0
                switch(r0) {
                    case 15: goto L_0x0144;
                    case 16: goto L_0x00a9;
                    case 17: goto L_0x0029;
                    default: goto L_0x0027;
                }     // Catch:{ Throwable -> 0x0233 }
            L_0x0027:
                goto L_0x0213
            L_0x0029:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.model.CameraPosition r9 = r9.C()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnCameraChangeListener r0 = r0.L     // Catch:{ Throwable -> 0x0233 }
                if (r0 == 0) goto L_0x003c
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                r0.a((boolean) r3, (com.amap.api.maps2d.model.CameraPosition) r9)     // Catch:{ Throwable -> 0x0233 }
            L_0x003c:
                java.lang.String r0 = com.amap.api.mapcore2d.q.h     // Catch:{ Throwable -> 0x0233 }
                r2 = 0
                if (r0 == 0) goto L_0x004d
                java.lang.String r0 = com.amap.api.mapcore2d.q.h     // Catch:{ Throwable -> 0x0233 }
                java.lang.String r0 = r0.trim()     // Catch:{ Throwable -> 0x0233 }
                int r0 = r0.length()     // Catch:{ Throwable -> 0x0233 }
                if (r0 != 0) goto L_0x0078
            L_0x004d:
                float r0 = r9.zoom     // Catch:{ Throwable -> 0x0233 }
                r4 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x006f
                com.amap.api.maps2d.model.LatLng r0 = r9.target     // Catch:{ Throwable -> 0x0233 }
                double r4 = r0.latitude     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.model.LatLng r9 = r9.target     // Catch:{ Throwable -> 0x0233 }
                double r6 = r9.longitude     // Catch:{ Throwable -> 0x0233 }
                boolean r9 = com.amap.api.mapcore2d.cl.a(r4, r6)     // Catch:{ Throwable -> 0x0233 }
                if (r9 != 0) goto L_0x006f
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.cd r9 = r9.E     // Catch:{ Throwable -> 0x0233 }
                r0 = 8
                r9.setVisibility(r0)     // Catch:{ Throwable -> 0x0233 }
                goto L_0x0078
            L_0x006f:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.cd r9 = r9.E     // Catch:{ Throwable -> 0x0233 }
                r9.setVisibility(r2)     // Catch:{ Throwable -> 0x0233 }
            L_0x0078:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$CancelableCallback r9 = r9.N     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x0093
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                boolean unused = r9.J = r3     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$CancelableCallback r9 = r9.N     // Catch:{ Throwable -> 0x0233 }
                r9.onFinish()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                boolean unused = r9.J = r2     // Catch:{ Throwable -> 0x0233 }
            L_0x0093:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                boolean r9 = r9.K     // Catch:{ Throwable -> 0x0233 }
                if (r9 != 0) goto L_0x00a2
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap.CancelableCallback unused = r9.N = r1     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x00a2:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                boolean unused = r9.K = r2     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x00a9:
                java.lang.Object r9 = r9.obj     // Catch:{ Exception -> 0x00ba }
                android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch:{ Exception -> 0x00ba }
                boolean r0 = r9.isRecycled()     // Catch:{ Exception -> 0x00ba }
                if (r0 == 0) goto L_0x00b5
                goto L_0x023b
            L_0x00b5:
                android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9)     // Catch:{ Exception -> 0x00ba }
                goto L_0x00c3
            L_0x00ba:
                r9 = move-exception
                java.lang.String r0 = "AMapDelegateImpGLSurfaceView"
                java.lang.String r2 = r8.f5696a     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.cm.a(r9, r0, r2)     // Catch:{ Throwable -> 0x0233 }
                r9 = r1
            L_0x00c3:
                if (r9 == 0) goto L_0x0127
                android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch:{ Throwable -> 0x0233 }
                r0.<init>(r9)     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r2 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.cd r2 = r2.E     // Catch:{ Throwable -> 0x0233 }
                if (r2 == 0) goto L_0x00db
                com.amap.api.mapcore2d.b r2 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.cd r2 = r2.E     // Catch:{ Throwable -> 0x0233 }
                r2.draw(r0)     // Catch:{ Throwable -> 0x0233 }
            L_0x00db:
                com.amap.api.mapcore2d.b r2 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                android.view.View r2 = r2.R     // Catch:{ Throwable -> 0x0233 }
                if (r2 == 0) goto L_0x0115
                com.amap.api.mapcore2d.b r2 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.ay r2 = r2.U     // Catch:{ Throwable -> 0x0233 }
                if (r2 == 0) goto L_0x0115
                com.amap.api.mapcore2d.b r2 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                android.view.View r2 = r2.R     // Catch:{ Throwable -> 0x0233 }
                android.graphics.Bitmap r2 = r2.getDrawingCache(r3)     // Catch:{ Throwable -> 0x0233 }
                if (r2 == 0) goto L_0x0115
                com.amap.api.mapcore2d.b r3 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                android.view.View r3 = r3.R     // Catch:{ Throwable -> 0x0233 }
                int r3 = r3.getLeft()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r4 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                android.view.View r4 = r4.R     // Catch:{ Throwable -> 0x0233 }
                int r4 = r4.getTop()     // Catch:{ Throwable -> 0x0233 }
                float r3 = (float) r3     // Catch:{ Throwable -> 0x0233 }
                float r4 = (float) r4     // Catch:{ Throwable -> 0x0233 }
                android.graphics.Paint r5 = new android.graphics.Paint     // Catch:{ Throwable -> 0x0233 }
                r5.<init>()     // Catch:{ Throwable -> 0x0233 }
                r0.drawBitmap(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0233 }
            L_0x0115:
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnMapScreenShotListener r0 = r0.aj     // Catch:{ Throwable -> 0x0233 }
                if (r0 == 0) goto L_0x0138
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnMapScreenShotListener r0 = r0.aj     // Catch:{ Throwable -> 0x0233 }
                r0.onMapScreenShot(r9)     // Catch:{ Throwable -> 0x0233 }
                goto L_0x0138
            L_0x0127:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnMapScreenShotListener r9 = r9.aj     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x0138
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnMapScreenShotListener r9 = r9.aj     // Catch:{ Throwable -> 0x0233 }
                r9.onMapScreenShot(r1)     // Catch:{ Throwable -> 0x0233 }
            L_0x0138:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                r9.destroyDrawingCache()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap.OnMapScreenShotListener unused = r9.aj = r1     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x0144:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                r9.D()     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x014b:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnMapLoadedListener r9 = r9.ag     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x015c
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnMapLoadedListener r9 = r9.ag     // Catch:{ Throwable -> 0x0233 }
                r9.onMapLoaded()     // Catch:{ Throwable -> 0x0233 }
            L_0x015c:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                r9.w()     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x0163:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnCameraChangeListener r9 = r9.L     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x0213
                com.amap.api.maps2d.model.CameraPosition r9 = new com.amap.api.maps2d.model.CameraPosition     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.model.LatLng r0 = r0.E()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r1 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                float r1 = r1.getZoomLevel()     // Catch:{ Throwable -> 0x0233 }
                r2 = 0
                r9.<init>(r0, r1, r2, r2)     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.maps2d.AMap$OnCameraChangeListener r0 = r0.L     // Catch:{ Throwable -> 0x0233 }
                r0.onCameraChange(r9)     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x0188:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.az r9 = r9.f5687a     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x0213
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.az r9 = r9.f5687a     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.az$b r9 = r9.f5666d     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x0213
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.az r9 = r9.f5687a     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.az$b r9 = r9.f5666d     // Catch:{ Throwable -> 0x0233 }
                r9.a()     // Catch:{ Throwable -> 0x0233 }
                goto L_0x0213
            L_0x01a0:
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r9 = r9.M     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x0213
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r9 = r9.M     // Catch:{ Throwable -> 0x0233 }
                boolean r9 = r9.g()     // Catch:{ Throwable -> 0x0233 }
                if (r9 == 0) goto L_0x0213
                com.amap.api.mapcore2d.b r9 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r9 = r9.M     // Catch:{ Throwable -> 0x0233 }
                int r9 = r9.h()     // Catch:{ Throwable -> 0x0233 }
                if (r9 == r1) goto L_0x01c2
                goto L_0x023b
            L_0x01c2:
                com.amap.api.mapcore2d.ae r9 = new com.amap.api.mapcore2d.ae     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r0 = r0.M     // Catch:{ Throwable -> 0x0233 }
                int r0 = r0.b()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r1 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r1 = r1.M     // Catch:{ Throwable -> 0x0233 }
                int r1 = r1.c()     // Catch:{ Throwable -> 0x0233 }
                r9.<init>(r0, r1)     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r0 = r0.M     // Catch:{ Throwable -> 0x0233 }
                float r0 = r0.d()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r1 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r1 = r1.M     // Catch:{ Throwable -> 0x0233 }
                float r1 = r1.e()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r2 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r2 = r2.M     // Catch:{ Throwable -> 0x0233 }
                float r2 = r2.f()     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.m r9 = com.amap.api.mapcore2d.m.a((com.amap.api.mapcore2d.ae) r9, (float) r0, (float) r1, (float) r2)     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.k r0 = r0.M     // Catch:{ Throwable -> 0x0233 }
                boolean r0 = r0.a()     // Catch:{ Throwable -> 0x0233 }
                if (r0 == 0) goto L_0x020b
                r9.isChangeFinished = r3     // Catch:{ Throwable -> 0x0233 }
            L_0x020b:
                com.amap.api.mapcore2d.b r0 = com.amap.api.mapcore2d.b.this     // Catch:{ Throwable -> 0x0233 }
                com.amap.api.mapcore2d.as r0 = r0.f5691e     // Catch:{ Throwable -> 0x0233 }
                r0.a(r9)     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x0213:
                return
            L_0x0214:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0233 }
                r0.<init>()     // Catch:{ Throwable -> 0x0233 }
                java.lang.String r1 = "Key验证失败：["
                r0.append(r1)     // Catch:{ Throwable -> 0x0233 }
                java.lang.Object r1 = r9.obj     // Catch:{ Throwable -> 0x0233 }
                if (r1 == 0) goto L_0x0228
                java.lang.Object r9 = r9.obj     // Catch:{ Throwable -> 0x0233 }
                r0.append(r9)     // Catch:{ Throwable -> 0x0233 }
                goto L_0x022d
            L_0x0228:
                java.lang.String r9 = com.amap.api.mapcore2d.cq.f5857b     // Catch:{ Throwable -> 0x0233 }
                r0.append(r9)     // Catch:{ Throwable -> 0x0233 }
            L_0x022d:
                java.lang.String r9 = "]"
                r0.append(r9)     // Catch:{ Throwable -> 0x0233 }
                goto L_0x023b
            L_0x0233:
                r9 = move-exception
                java.lang.String r0 = "AMapDelegateImpGLSurfaceView"
                java.lang.String r1 = "handle_handleMessage"
                com.amap.api.mapcore2d.cm.a(r9, r0, r1)
            L_0x023b:
                return
            L_0x023c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.b.AnonymousClass3.handleMessage(android.os.Message):void");
        }
    };
    int l = 0;
    float m = -1.0f;
    private Context n;
    private boolean o;
    private boolean p = true;
    private Marker q;
    private ab r;
    private final int[] s = {10000000, 5000000, 2000000, 1000000, 500000, 200000, 100000, 50000, 30000, 20000, 10000, 5000, 2000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 500, 200, 100, 50, 25, 10, 5};
    private boolean t = true;
    private int u = 1;
    private CameraUpdate v;
    private long w;
    private AMap.CancelableCallback x;
    private ap y;
    private Location z;

    static abstract class a {
        public abstract void a(int i, int i2, int i3, int i4);
    }

    /* renamed from: com.amap.api.mapcore2d.b$b  reason: collision with other inner class name */
    class C0043b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Context f5701b;

        /* renamed from: c  reason: collision with root package name */
        private AMap.OnCacheRemoveListener f5702c;

        public void run() {
            try {
                cm.a(new File(cm.b(this.f5701b)));
                try {
                    if (this.f5702c != null) {
                        this.f5702c.onRemoveCacheFinish(true);
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
            throw th;
        }

        public C0043b(Context context, AMap.OnCacheRemoveListener onCacheRemoveListener) {
            this.f5701b = context;
            this.f5702c = onCacheRemoveListener;
        }
    }

    public boolean a(Matrix matrix) {
        return false;
    }

    public LatLngBounds getMapBounds() {
        return null;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public int q() {
        return 0;
    }

    public void setZOrderOnTop(boolean z2) throws RemoteException {
    }

    public void u() {
    }

    public static int m() {
        return aH;
    }

    public Handler getMainHandler() {
        return this.k;
    }

    public int getMapType() throws RemoteException {
        return this.u;
    }

    public AMap.OnCameraChangeListener getOnCameraChangeListener() throws RemoteException {
        return this.L;
    }

    public View getView() throws RemoteException {
        return this.g;
    }

    public aq i() {
        return this.f5688b;
    }

    public boolean isMyLocationEnabled() throws RemoteException {
        return this.C;
    }

    public float o() {
        return this.ay;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public az a() {
        return this.f5687a;
    }

    public float a(float f2) {
        if (this.f5687a == null || this.f5687a.f5665c == null) {
            return f2;
        }
        if (f2 < ((float) this.f5687a.f5665c.b())) {
            f2 = (float) this.f5687a.f5665c.b();
        }
        if (f2 > ((float) this.f5687a.f5665c.a())) {
            f2 = (float) this.f5687a.f5665c.a();
        }
        return f2;
    }

    public void a(float f2, Point point, boolean z2, long j2) {
        float f3 = f2;
        Point point2 = point;
        if (this.f5688b != null && this.f5687a != null) {
            float zoomLevel = getZoomLevel();
            float b2 = cm.b(zoomLevel + f3);
            if (b2 - zoomLevel > 0.0f) {
                new ae();
                ae F2 = F();
                if (!(point2 == null || F2 == null)) {
                    ae aeVar = new ae();
                    a(point2.x, point2.y, aeVar);
                    int i2 = F2.f5591a - aeVar.f5591a;
                    int i3 = F2.f5592b - aeVar.f5592b;
                    double d2 = (double) i2;
                    double d3 = (double) f3;
                    double pow = Math.pow(2.0d, d3);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    double d4 = (double) i3;
                    double pow2 = Math.pow(2.0d, d3);
                    Double.isNaN(d4);
                    Double.isNaN(d4);
                    F2.f5591a = aeVar.f5591a + ((int) ((d2 / pow) - d2));
                    F2.f5592b = aeVar.f5592b + ((int) ((d4 / pow2) - d4));
                    w wVar = new w((double) F2.f5592b, (double) F2.f5591a, false);
                    w b3 = this.f5687a.h.b(wVar);
                    if (z2) {
                        this.f5688b.a(b2, point2.x, point2.y, (int) j2);
                    } else {
                        this.f5688b.a(b3);
                        l.a().b();
                    }
                }
            }
        }
    }

    public void a(ab abVar) throws RemoteException {
        int i2;
        int i3;
        if (abVar != null) {
            if (abVar.getTitle() != null || abVar.getSnippet() != null) {
                e();
                Marker marker = new Marker((e) abVar);
                if (this.T != null) {
                    this.R = this.T.getInfoWindow(marker);
                }
                try {
                    if (this.W == null) {
                        this.W = bd.a(this.n, "infowindow_bg2d.9.png");
                    }
                } catch (Exception e2) {
                    cm.a(e2, "AMapDelegateImpGLSurfaceView", "showInfoWindow");
                }
                if (this.R == null && this.T != null) {
                    this.R = this.T.getInfoContents(marker);
                }
                if (this.R == null) {
                    LinearLayout linearLayout = new LinearLayout(this.n);
                    linearLayout.setBackgroundDrawable(this.W);
                    TextView textView = new TextView(this.n);
                    textView.setText(abVar.getTitle());
                    textView.setTextColor(-16777216);
                    TextView textView2 = new TextView(this.n);
                    textView2.setTextColor(-16777216);
                    textView2.setText(abVar.getSnippet());
                    linearLayout.setOrientation(1);
                    linearLayout.addView(textView);
                    linearLayout.addView(textView2);
                    this.R = linearLayout;
                } else if (this.R.getBackground() == null) {
                    this.R.setBackgroundDrawable(this.W);
                }
                ViewGroup.LayoutParams layoutParams = this.R.getLayoutParams();
                this.R.setDrawingCacheEnabled(true);
                this.R.setDrawingCacheQuality(0);
                s b2 = abVar.b();
                if (layoutParams != null) {
                    int i4 = layoutParams.width;
                    i2 = layoutParams.height;
                    i3 = i4;
                } else {
                    i3 = -2;
                    i2 = -2;
                }
                au.a aVar = new au.a(i3, i2, abVar.getRealPosition(), (-((int) b2.f6277a)) + (abVar.getWidth() / 2), (-((int) b2.f6278b)) + 2, 81);
                this.U = (ay) abVar;
                if (this.g != null) {
                    this.g.addView(this.R, aVar);
                }
            }
        }
    }

    public boolean b(ab abVar) {
        if (this.U == null || this.R == null || abVar == null) {
            return false;
        }
        return this.U.getId().equals(abVar.getId());
    }

    public void a(boolean z2) {
        if (j() != z2 && this.f5687a != null) {
            if (!z2) {
                a().f5667e.a(a().f5667e.h, false);
                a().f5667e.a(a().f5667e.g, true);
                a().f5665c.a(false, false);
            } else if (a().f5667e.b(a().f5667e.h) != null) {
                a().f5667e.a(a().f5667e.h, true);
                a().f5665c.a(false, false);
            } else {
                an anVar = new an(this.O);
                anVar.q = new bv(this.f5687a, anVar);
                anVar.j = new cb() {
                    public String a(int i, int i2, int i3) {
                        return ax.a().e() + "/appmaptile?z=" + i3 + "&x=" + i + "&y=" + i2 + "&lang=zh_cn&size=1&scale=1&style=6";
                    }
                };
                anVar.f5598b = a().f5667e.h;
                anVar.f5601e = true;
                anVar.a(true);
                anVar.f5602f = true;
                anVar.f5599c = q.f6268c;
                anVar.f5600d = q.f6269d;
                a().f5667e.a(anVar, this.n);
                a().f5667e.a(a().f5667e.h, true);
                a().f5665c.a(false, false);
            }
        }
    }

    public boolean a(float f2, float f3) {
        if (this.f5688b != null) {
            this.f5688b.b(true);
        }
        if (this.az) {
            this.aA += f2;
            this.aB += f3;
        }
        invalidate();
        return this.az;
    }

    public boolean b(Matrix matrix) {
        try {
            if (!this.h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "onScale");
        }
        this.ax.set(matrix);
        postInvalidate();
        return true;
    }

    public boolean a(float f2, PointF pointF) {
        try {
            if (!this.h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "onScale");
        }
        if (!(this.f5687a == null || this.f5687a.f5667e == null)) {
            this.f5687a.f5667e.f5671c = false;
        }
        r();
        a(f2, pointF, this.aA, this.aB);
        this.az = false;
        postInvalidateDelayed(8);
        this.f5687a.a(true);
        return true;
    }

    public boolean a(PointF pointF) {
        try {
            if (!this.h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "startScale");
        }
        try {
            if (!c().isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e3) {
            cm.a(e3, "AMapDelegateImpGLSurfaceView", "startScale");
        }
        if (!(this.f5687a == null || this.f5687a.f5667e == null)) {
            this.f5687a.a(this.p);
            this.f5687a.f5667e.a(true);
            this.f5687a.f5667e.f5671c = true;
        }
        this.az = true;
        return true;
    }

    /* access modifiers changed from: private */
    public void a(boolean z2, CameraPosition cameraPosition) {
        if (this.L != null && this.M.a() && isEnabled()) {
            if (cameraPosition == null) {
                try {
                    cameraPosition = getCameraPosition();
                } catch (RemoteException e2) {
                    cm.a(e2, "AMapDelegateImpGLSurfaceView", "cameraChangeFinish");
                }
            }
            try {
                this.L.onCameraChangeFinish(cameraPosition);
            } catch (Throwable unused) {
            }
        }
    }

    public void a(int i2, int i3, s sVar) {
        w a2 = this.O.a(new PointF((float) i2, (float) i3), this.O.l, this.O.n, this.O.k, this.O.o);
        if (sVar != null) {
            double a3 = r.a((long) a2.b());
            double a4 = r.a((long) a2.a());
            sVar.f6278b = a3;
            sVar.f6277a = a4;
        }
    }

    public void a(double d2, double d3, s sVar) {
        getZoomLevel();
        PointF b2 = this.O.b(new w((int) r.a(d2), (int) r.a(d3)), this.O.l, this.O.n, this.O.k);
        if (sVar != null) {
            sVar.f6277a = (double) b2.x;
            sVar.f6278b = (double) b2.y;
        }
    }

    public void a(double d2, double d3, ae aeVar) {
        if (this.O != null) {
            w b2 = this.O.b(new w((int) (d2 * 1000000.0d), (int) (d3 * 1000000.0d)));
            aeVar.f5591a = b2.a();
            aeVar.f5592b = b2.b();
        }
    }

    /* access modifiers changed from: protected */
    public void a(m mVar, boolean z2, long j2) {
        m mVar2 = mVar;
        if (this.f5688b != null) {
            try {
                LatLngBounds latLngBounds = mVar2.bounds;
                if (!(latLngBounds == null || latLngBounds.northeast == null)) {
                    if (latLngBounds.southwest != null) {
                        float f2 = (float) ((latLngBounds.northeast.latitude * 1000000.0d) - (latLngBounds.southwest.latitude * 1000000.0d));
                        float f3 = (float) ((latLngBounds.northeast.longitude * 1000000.0d) - (latLngBounds.southwest.longitude * 1000000.0d));
                        int i2 = (int) (((latLngBounds.northeast.latitude * 1000000.0d) + (latLngBounds.southwest.latitude * 1000000.0d)) / 2.0d);
                        int i3 = (int) (((latLngBounds.northeast.longitude * 1000000.0d) + (latLngBounds.southwest.longitude * 1000000.0d)) / 2.0d);
                        float f4 = f2 == 0.0f ? 1.0f : f2;
                        float f5 = f3 == 0.0f ? 1.0f : f3;
                        w wVar = new w(i2, i3);
                        if (z2) {
                            this.f5688b.a(wVar, (int) j2);
                        } else {
                            this.f5688b.a(wVar);
                        }
                        this.f5688b.a(f4, f5, mVar2.width, mVar2.height, mVar2.padding);
                    }
                }
            } catch (Exception e2) {
                cm.a(e2, "AMapDelegateImpGLSurfaceView", "newLatLngBoundsWithSize");
            }
        }
    }

    public al c() throws RemoteException {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public Point f() {
        return this.E.c();
    }

    public boolean g() {
        return this.p;
    }

    public Projection getAMapProjection() throws RemoteException {
        return new Projection(this.Z);
    }

    public UiSettings getAMapUiSettings() throws RemoteException {
        return new UiSettings(this.h);
    }

    public int getLogoPosition() {
        return this.E.d();
    }

    public boolean isTrafficEnabled() throws RemoteException {
        return k();
    }

    public bb l() {
        return this.ar;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    public void p() {
        this.aA = 0.0f;
        this.aB = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.k.sendEmptyMessage(10);
    }

    public void removecache() {
        removecache(null);
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.k.sendEmptyMessage(15);
    }

    public void v() {
        this.k.sendEmptyMessage(17);
    }

    public void AMapInvalidate() {
        postInvalidate();
        this.g.postInvalidate();
    }

    public bc b() {
        return this.D;
    }

    public bh d() {
        if (this.f5687a == null) {
            return null;
        }
        return this.f5687a.f5664b;
    }

    public Location getMyLocation() throws RemoteException {
        if (this.G == null || this.A == null) {
            return null;
        }
        return this.A.f5916a;
    }

    public void t() {
        if (this.N != null) {
            this.N.onCancel();
            this.N = null;
        }
    }

    /* access modifiers changed from: private */
    public LatLng E() {
        w h2 = h();
        if (h2 == null) {
            return null;
        }
        return new LatLng(r.a((long) h2.b()), r.a((long) h2.a()));
    }

    private ae F() {
        w h2 = h();
        if (h2 == null) {
            return null;
        }
        ae aeVar = new ae();
        aeVar.f5591a = (int) h2.e();
        aeVar.f5592b = (int) h2.f();
        return aeVar;
    }

    /* access modifiers changed from: private */
    public void w() {
        try {
            if (this.v != null) {
                animateCameraWithDurationAndCallback(this.v, this.w, this.x);
                this.v = null;
                this.w = 0;
                this.x = null;
            }
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "handleUnHandleMessage");
        }
    }

    private void y() {
        a(this.n);
        this.g.addView(this, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    private void z() {
        this.f5687a.a();
        if (this.f5688b != null) {
            this.f5688b.b(true);
            this.f5688b.e();
        }
        this.f5688b = null;
        this.f5687a = null;
    }

    public CameraPosition getCameraPosition() throws RemoteException {
        LatLng E2 = E();
        if (E2 == null) {
            return null;
        }
        return CameraPosition.builder().target(E2).zoom(getZoomLevel()).build();
    }

    public int getMapHeight() {
        if (this.f5687a == null || this.f5687a.f5665c == null) {
            return 0;
        }
        return this.f5687a.f5665c.d();
    }

    public List<Marker> getMapScreenMarkers() {
        if (!cm.a(getWidth(), getHeight())) {
            return new ArrayList();
        }
        return this.j.g();
    }

    public int getMapWidth() {
        if (this.f5687a == null || this.f5687a.f5665c == null) {
            return 0;
        }
        return this.f5687a.f5665c.c();
    }

    public float getMaxZoomLevel() {
        if (this.f5687a == null || this.f5687a.f5665c == null) {
            return (float) q.f6268c;
        }
        return (float) this.f5687a.f5665c.a();
    }

    public float getMinZoomLevel() {
        if (this.f5687a == null || this.f5687a.f5665c == null) {
            return (float) q.f6269d;
        }
        return (float) this.f5687a.f5665c.b();
    }

    public float getZoomLevel() {
        float f2;
        if (this.f5687a == null || this.f5687a.f5665c == null) {
            return 0.0f;
        }
        try {
            f2 = this.f5687a.f5665c.e();
        } catch (Exception e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "getZoomLevel");
            f2 = 0.0f;
        }
        return f2;
    }

    public w h() {
        if (this.f5687a == null || this.f5687a.f5665c == null) {
            return null;
        }
        return this.f5687a.f5665c.f();
    }

    public void onPause() {
        if (!(this.f5687a == null || this.f5687a.f5666d == null)) {
            this.f5687a.f5666d.d();
        }
        if (this.i != null) {
            this.i.d();
        }
    }

    public void onResume() {
        if (!(this.f5687a == null || this.f5687a.f5666d == null)) {
            this.f5687a.f5666d.c();
        }
        if (this.i != null) {
            this.i.e();
        }
    }

    public void redrawInfoWindow() {
        if (this.R != null && this.U != null) {
            au.a aVar = (au.a) this.R.getLayoutParams();
            if (aVar != null) {
                aVar.f5639b = this.U.getRealPosition();
            }
            this.g.a();
        }
    }

    private void B() {
        if (this.ap != null) {
            int i2 = this.ap.x - this.aF;
            int i3 = this.ap.y - this.aG;
            this.ap.x = this.aF;
            this.ap.y = this.aG;
            this.f5688b.d(i2, i3);
        }
    }

    /* access modifiers changed from: private */
    public CameraPosition C() {
        w h2 = h();
        if (h2 == null) {
            return null;
        }
        double b2 = (double) h2.b();
        Double.isNaN(b2);
        double a2 = (double) h2.a();
        Double.isNaN(a2);
        return CameraPosition.fromLatLngZoom(new LatLng(b2 / 1000000.0d, a2 / 1000000.0d), getZoomLevel());
    }

    public static synchronized Paint n() {
        Paint paint;
        synchronized (b.class) {
            if (aI == null) {
                Paint paint2 = new Paint();
                aI = paint2;
                paint2.setColor(-7829368);
                aI.setAlpha(90);
                aI.setPathEffect(new DashPathEffect(new float[]{2.0f, 2.5f}, 1.0f));
            }
            paint = aI;
        }
        return paint;
    }

    public void clear() throws RemoteException {
        try {
            e();
            if (this.f5687a != null) {
                this.f5687a.f5668f.a();
                this.j.c();
                this.i.b();
                if (this.D != null) {
                    this.D.a();
                }
                invalidate();
            }
        } catch (Exception e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "clear");
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "clear");
        }
    }

    public void e() {
        if (this.R != null) {
            this.R.clearFocus();
            this.R.destroyDrawingCache();
            if (this.g != null) {
                this.g.removeView(this.R);
            }
            Drawable background = this.R.getBackground();
            if (background != null) {
                background.setCallback(null);
            }
            this.R = null;
        }
        this.U = null;
    }

    public float getScalePerPixel() {
        int width = getWidth();
        s sVar = new s();
        s sVar2 = new s();
        a(0, 0, sVar);
        a(width, 0, sVar2);
        double a2 = cm.a(new LatLng(sVar.f6278b, sVar.f6277a), new LatLng(sVar2.f6278b, sVar2.f6277a));
        double d2 = (double) width;
        Double.isNaN(d2);
        return (float) (a2 / d2);
    }

    public boolean j() {
        if (this.f5687a == null || this.f5687a.f5667e == null) {
            return false;
        }
        an b2 = a().f5667e.b(a().f5667e.h);
        if (b2 != null) {
            return b2.a();
        }
        return false;
    }

    public boolean k() {
        if (a() == null) {
            return false;
        }
        an b2 = a().f5667e.b(a().f5667e.i);
        if (b2 != null) {
            return b2.a();
        }
        return false;
    }

    public void stopAnimation() throws RemoteException {
        if (this.f5688b != null) {
            if (!this.M.a()) {
                this.M.a(true);
                l.a().b();
                if (this.N != null) {
                    this.N.onCancel();
                }
                this.N = null;
            }
            this.f5688b.b(true);
        }
    }

    private void A() {
        if (this.P) {
            this.P = false;
        }
        if (this.ac) {
            this.ac = false;
            m a2 = m.a();
            a2.isChangeFinished = true;
            this.f5691e.a(a2);
        }
        if (this.Q) {
            this.Q = false;
            m a3 = m.a();
            a3.isChangeFinished = true;
            this.f5691e.a(a3);
        }
        this.ab = false;
        if (this.q != null) {
            if (this.ad != null) {
                this.ad.onMarkerDragEnd(this.q);
            }
            this.q = null;
            this.r = null;
        }
    }

    private void x() {
        Method method;
        Method[] methods = View.class.getMethods();
        int length = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methods[i2];
            if (method != null && method.getName().equals("setLayerType")) {
                break;
            }
            i2++;
        }
        if (method != null) {
            try {
                method.invoke(this, new Object[]{Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(null)), null});
            } catch (Exception e2) {
                cm.a(e2, "AMapDelegateImpGLSurfaceView", "setLayerType");
            }
        }
    }

    public void computeScroll() {
        if (!this.au.computeScrollOffset() || !this.au.isFinished()) {
            super.computeScroll();
            return;
        }
        int currX = this.au.getCurrX() - this.av;
        int currY = this.au.getCurrY() - this.aw;
        this.av = this.au.getCurrX();
        this.aw = this.au.getCurrY();
        w a2 = this.f5687a.f5664b.a(this.f5687a.h.n.x + currX, this.f5687a.h.n.y + currY);
        if (this.au.isFinished()) {
            l.a().b();
            if (this.L != null) {
                a(true, C());
            }
            this.f5687a.f5665c.a(false, false);
            return;
        }
        this.f5687a.f5665c.b(a2);
    }

    /* access modifiers changed from: private */
    public void D() {
        if (this.F != null) {
            if (this.m == -1.0f) {
                int width = getWidth();
                int height = getHeight();
                int i2 = this.n.getResources().getDisplayMetrics().densityDpi;
                int i3 = 50;
                if (i2 > 120) {
                    if (i2 <= 160) {
                        if (Math.max(width, height) <= 480) {
                            i3 = 120;
                        }
                    } else if (i2 <= 240) {
                        i3 = Math.min(width, height) >= 1000 ? 60 : 70;
                    } else if (i2 > 320 && i2 > 480) {
                        i3 = 40;
                    }
                    this.m = ((float) i3) / 100.0f;
                }
                i3 = 100;
                this.m = ((float) i3) / 100.0f;
            }
            LatLng E2 = E();
            if (E2 != null) {
                float zoomLevel = getZoomLevel();
                float f2 = this.m;
                double cos = (double) ((float) ((((Math.cos((E2.latitude * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, (double) zoomLevel) * 256.0d)));
                int i4 = (int) zoomLevel;
                double d2 = (double) this.s[i4];
                double d3 = (double) f2;
                Double.isNaN(cos);
                Double.isNaN(d3);
                Double.isNaN(d2);
                String a2 = cm.a(this.s[i4]);
                this.F.a((int) (d2 / (cos * d3)));
                this.F.a(a2);
                this.F.invalidate();
            }
        }
    }

    public void destroy() {
        try {
            if (this.ak != null) {
                this.ak.cancel();
                this.ak = null;
            }
            if (this.am != null) {
                this.am.cancel();
                this.am = null;
            }
            if (this.ao != null) {
                this.ao.removeCallbacksAndMessages(null);
            }
            if (this.k != null) {
                this.k.removeCallbacksAndMessages(null);
            }
            if (this.al != null) {
                this.al.interrupt();
                this.al = null;
            }
            n.a().b(this);
            bm.a().a(this);
            l.a().b(this);
            this.f5692f.a();
            this.F.a();
            this.E.a();
            this.y.a();
            this.H.a();
            this.f5687a.f5668f.b();
            this.j.f();
            if (this.W != null) {
                this.W.setCallback(null);
            }
            this.g.removeAllViews();
            e();
            if (this.i != null) {
                this.i.f();
            }
            if (this.f5687a != null) {
                this.f5687a.f5666d.b();
                z();
            }
            this.G = null;
            this.ah = null;
            q.h = null;
            q.g = null;
            dg.b();
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "destroy");
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void setInfoWindowAdapter(AMap.InfoWindowAdapter infoWindowAdapter) throws RemoteException {
        this.T = infoWindowAdapter;
    }

    public void setOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        this.L = onCameraChangeListener;
    }

    public void setOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        this.S = onInfoWindowClickListener;
    }

    public void setOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        this.ah = onMapClickListener;
    }

    public void setOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        this.af = onMapLongClickListener;
    }

    public void setOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        this.ae = onMapTouchListener;
    }

    public void setOnMaploadedListener(AMap.OnMapLoadedListener onMapLoadedListener) throws RemoteException {
        this.ag = onMapLoadedListener;
    }

    public void setOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        this.V = onMarkerClickListener;
    }

    public void setOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) throws RemoteException {
        this.ad = onMarkerDragListener;
    }

    public void setOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) throws RemoteException {
        this.B = onMyLocationChangeListener;
    }

    public void animateCamera(CameraUpdate cameraUpdate) throws RemoteException {
        if (cameraUpdate != null) {
            animateCameraWithCallback(cameraUpdate, null);
        }
    }

    public void getMapScreenShot(AMap.OnMapScreenShotListener onMapScreenShotListener) {
        this.aj = onMapScreenShotListener;
        this.aa = true;
    }

    public void setClickable(boolean z2) {
        this.o = z2;
        super.setClickable(z2);
    }

    public void setTrafficEnabled(boolean z2) throws RemoteException {
        b(z2);
        postInvalidate();
    }

    public void moveCamera(CameraUpdate cameraUpdate) throws RemoteException {
        if (cameraUpdate != null) {
            this.I.a(cameraUpdate.getCameraUpdateFactoryDelegate());
        }
    }

    public boolean removeGLOverlay(String str) throws RemoteException {
        if (this.f5687a == null) {
            return false;
        }
        return this.f5687a.f5668f.b(str);
    }

    public void setMyLocationRotateAngle(float f2) throws RemoteException {
        if (this.D != null) {
            this.D.a(f2);
        }
    }

    public void setMyLocationType(int i2) {
        if (this.D != null) {
            this.D.a(i2);
        }
    }

    public void setZoomPosition(int i2) {
        if (this.f5692f != null) {
            this.f5692f.a(i2);
            this.f5692f.invalidate();
        }
    }

    public Text addText(TextOptions textOptions) throws RemoteException {
        bp bpVar = new bp(this, textOptions, this.j);
        this.j.a((aj) bpVar);
        invalidate();
        return new Text(bpVar);
    }

    public void b(float f2) {
        this.ay = f2;
    }

    public boolean c(float f2) {
        try {
            if (!this.h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "onScale");
        }
        b(f2);
        return false;
    }

    public boolean removeMarker(String str) {
        ab abVar;
        try {
            abVar = this.j.a(str);
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "removeMarker");
            abVar = null;
        }
        if (abVar != null) {
            return this.j.b(abVar);
        }
        return false;
    }

    public void removecache(AMap.OnCacheRemoveListener onCacheRemoveListener) {
        if (this.an != null) {
            try {
                C0043b bVar = new C0043b(this.n, onCacheRemoveListener);
                this.an.removeCallbacks(bVar);
                this.an.post(bVar);
            } catch (Throwable th) {
                dg.b(th, "AMapDelegateImpGLSurfaceView", "removecache");
            }
        }
    }

    public void setLogoPosition(int i2) {
        if (this.E != null) {
            this.E.a(i2);
            this.E.invalidate();
            if (this.F.getVisibility() == 0) {
                this.F.invalidate();
            }
        }
    }

    public void setMapLanguage(String str) throws RemoteException {
        if (this.f5687a != null && this.f5687a.f5667e != null && !j()) {
            this.f5687a.f5667e.a(str);
        }
    }

    public void setMapType(int i2) throws RemoteException {
        if (i2 == 2) {
            this.u = 2;
            a(true);
            this.E.a(true);
        } else {
            this.u = 1;
            a(false);
            this.E.a(false);
        }
        postInvalidate();
    }

    public void showCompassEnabled(boolean z2) {
        if (z2) {
            this.H.setVisibility(0);
        } else {
            this.H.setVisibility(8);
        }
    }

    public void showMyLocationButtonEnabled(boolean z2) {
        if (z2) {
            this.y.setVisibility(0);
        } else {
            this.y.setVisibility(8);
        }
    }

    public void showScaleEnabled(boolean z2) {
        if (z2) {
            this.F.setVisibility(0);
            s();
            return;
        }
        this.F.a("");
        this.F.a(0);
        this.F.setVisibility(8);
    }

    public void showZoomControlsEnabled(boolean z2) {
        if (z2) {
            this.f5692f.setVisibility(0);
        } else {
            this.f5692f.setVisibility(8);
        }
    }

    private LatLng a(LatLng latLng) {
        ae aeVar = new ae();
        b(latLng.latitude, latLng.longitude, aeVar);
        aeVar.f5592b -= 60;
        s sVar = new s();
        a(aeVar.f5591a, aeVar.f5592b, sVar);
        return new LatLng(sVar.f6278b, sVar.f6277a);
    }

    public Circle addCircle(CircleOptions circleOptions) throws RemoteException {
        try {
            if (this.f5687a == null) {
                return null;
            }
            z a2 = this.f5687a.f5668f.a(circleOptions);
            invalidate();
            if (a2 != null) {
                return new Circle(a2);
            }
            return null;
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "addCircle");
        }
    }

    public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        try {
            if (this.f5687a == null) {
                return null;
            }
            aa a2 = this.f5687a.f5668f.a(groundOverlayOptions);
            invalidate();
            if (a2 != null) {
                return new GroundOverlay(a2);
            }
            return null;
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "addGroundOverlay");
        }
    }

    public Marker addMarker(MarkerOptions markerOptions) throws RemoteException {
        if (markerOptions == null) {
            return null;
        }
        try {
            ay ayVar = new ay(markerOptions, this.j);
            this.j.a((ab) ayVar);
            invalidate();
            return new Marker((e) ayVar);
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "addMarker");
            return null;
        }
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        try {
            if (this.f5687a != null) {
                if (this.f5687a.f5668f != null) {
                    af a2 = this.f5687a.f5668f.a(polygonOptions);
                    invalidate();
                    if (a2 != null) {
                        return new Polygon(a2);
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "addPolygon");
        }
    }

    public Polyline addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        try {
            if (this.f5687a == null) {
                return null;
            }
            ag a2 = a().f5668f.a(polylineOptions);
            invalidate();
            if (a2 != null) {
                return new Polyline(a2);
            }
            return null;
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "addPolyline");
        }
    }

    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        if (this.f5687a == null) {
            return null;
        }
        bt btVar = new bt(tileOverlayOptions, this.i, this.f5687a.h, this.f5687a, this.n);
        this.i.a((ak) btVar);
        invalidate();
        return new TileOverlay(btVar);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!q.r || this.f5687a == null) {
            return true;
        }
        if (!this.o) {
            return false;
        }
        if (this.ae != null) {
            this.ao.removeMessages(1);
            Message obtainMessage = this.ao.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = MotionEvent.obtain(motionEvent);
            obtainMessage.sendToTarget();
        }
        if (this.f5687a.f5667e.a(motionEvent)) {
            return true;
        }
        b(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setLocationSource(LocationSource locationSource) throws RemoteException {
        if (this.y != null) {
            if (this.G != null && (this.G instanceof c)) {
                this.G.deactivate();
            }
            this.G = locationSource;
            if (locationSource != null) {
                this.y.a(true);
            } else {
                this.y.a(false);
            }
        }
    }

    private boolean b(MotionEvent motionEvent) {
        boolean z2 = false;
        try {
            boolean a2 = this.ar.a(motionEvent, getWidth(), getHeight());
            if (!a2) {
                try {
                    z2 = this.aq.onTouchEvent(motionEvent);
                } catch (Throwable th) {
                    th = th;
                    z2 = a2;
                    cm.a(th, "AMapDelegateImpGLSurfaceView", "handleTouch");
                    return z2;
                }
            } else {
                z2 = a2;
            }
            if (motionEvent.getAction() == 1 && this.ac) {
                l.a().b();
            }
            if (motionEvent.getAction() == 2) {
                a(motionEvent);
            }
            if (motionEvent.getAction() == 1) {
                A();
            }
        } catch (Throwable th2) {
            th = th2;
            cm.a(th, "AMapDelegateImpGLSurfaceView", "handleTouch");
            return z2;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public PointF c(PointF pointF) {
        PointF pointF2 = new PointF();
        int width = getWidth();
        int height = getHeight();
        int i2 = width >> 1;
        float f2 = pointF.x - ((float) i2);
        int i3 = height >> 1;
        double d2 = (double) (pointF.y - ((float) i3));
        double d3 = (double) f2;
        double atan2 = Math.atan2(d2, d3);
        double sqrt = Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d2, 2.0d));
        double q2 = (double) q();
        Double.isNaN(q2);
        double d4 = atan2 + ((q2 * 3.141592653589793d) / 180.0d);
        double d5 = (double) i2;
        Double.isNaN(d5);
        pointF2.x = (float) ((Math.cos(d4) * sqrt) + d5);
        double d6 = (double) i3;
        Double.isNaN(d6);
        pointF2.y = (float) ((sqrt * Math.sin(d4)) + d6);
        return pointF2;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            if (!this.h.isZoomGesturesEnabled()) {
                return true;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "onDoubleTap");
        }
        if (this.t) {
            if (this.h.isZoomInByScreenCenter()) {
                this.f5688b.c();
            } else {
                this.f5688b.c((int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (this.aK > 1) {
            return true;
        }
        this.aL = true;
        if (!(this.f5687a == null || this.f5687a.f5665c == null)) {
            this.f5692f.a(this.f5687a.f5665c.e() + 1.0f);
        }
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.ac = false;
        if (!this.aL && !this.M.a()) {
            this.M.a(true);
            if (this.N != null) {
                this.N.onCancel();
            }
            this.N = null;
        }
        this.aL = false;
        this.aK = 0;
        if (this.ap == null) {
            this.ap = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        } else {
            this.ap.set((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        try {
            this.ac = false;
            if (this.af != null) {
                s sVar = new s();
                a((int) motionEvent.getX(), (int) motionEvent.getY(), sVar);
                this.af.onMapLongClick(new LatLng(sVar.f6278b, sVar.f6277a));
                this.P = true;
            }
            this.r = this.j.a(motionEvent);
            if (this.r != null) {
                this.q = new Marker((e) this.r);
                if (this.r != null && this.r.isDraggable()) {
                    this.r.a(a(this.r.getRealPosition()));
                    this.j.c(this.r);
                    if (this.ad != null) {
                        this.ad.onMarkerDragStart(this.q);
                    }
                    this.ab = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[Catch:{ Throwable -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMyLocationEnabled(boolean r3) throws android.os.RemoteException {
        /*
            r2 = this;
            com.amap.api.maps2d.LocationSource r0 = r2.G     // Catch:{ Throwable -> 0x0042 }
            if (r0 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0021
            com.amap.api.maps2d.LocationSource r0 = r2.G     // Catch:{ Throwable -> 0x0042 }
            com.amap.api.mapcore2d.d r1 = r2.A     // Catch:{ Throwable -> 0x0042 }
            r0.activate(r1)     // Catch:{ Throwable -> 0x0042 }
            com.amap.api.mapcore2d.ap r0 = r2.y     // Catch:{ Throwable -> 0x0042 }
            r1 = 1
            r0.a((boolean) r1)     // Catch:{ Throwable -> 0x0042 }
            com.amap.api.mapcore2d.bc r0 = r2.D     // Catch:{ Throwable -> 0x0042 }
            if (r0 != 0) goto L_0x0038
            com.amap.api.mapcore2d.bc r0 = new com.amap.api.mapcore2d.bc     // Catch:{ Throwable -> 0x0042 }
            android.content.Context r1 = r2.n     // Catch:{ Throwable -> 0x0042 }
            r0.<init>(r2, r1)     // Catch:{ Throwable -> 0x0042 }
            r2.D = r0     // Catch:{ Throwable -> 0x0042 }
            goto L_0x0038
        L_0x0021:
            com.amap.api.mapcore2d.bc r0 = r2.D     // Catch:{ Throwable -> 0x0042 }
            if (r0 == 0) goto L_0x002d
            com.amap.api.mapcore2d.bc r0 = r2.D     // Catch:{ Throwable -> 0x0042 }
            r0.a()     // Catch:{ Throwable -> 0x0042 }
            r0 = 0
            r2.D = r0     // Catch:{ Throwable -> 0x0042 }
        L_0x002d:
            com.amap.api.maps2d.LocationSource r0 = r2.G     // Catch:{ Throwable -> 0x0042 }
            r0.deactivate()     // Catch:{ Throwable -> 0x0042 }
        L_0x0032:
            com.amap.api.mapcore2d.ap r0 = r2.y     // Catch:{ Throwable -> 0x0042 }
            r1 = 0
            r0.a((boolean) r1)     // Catch:{ Throwable -> 0x0042 }
        L_0x0038:
            if (r3 != 0) goto L_0x003f
            com.amap.api.mapcore2d.al r0 = r2.h     // Catch:{ Throwable -> 0x0042 }
            r0.setMyLocationButtonEnabled(r3)     // Catch:{ Throwable -> 0x0042 }
        L_0x003f:
            r2.C = r3     // Catch:{ Throwable -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            java.lang.String r0 = "AMapDelegateImpGLSurfaceView"
            java.lang.String r1 = "setMyLocationEnabled"
            com.amap.api.mapcore2d.dg.b((java.lang.Throwable) r3, (java.lang.String) r0, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.b.setMyLocationEnabled(boolean):void");
    }

    public void setMyLocationStyle(MyLocationStyle myLocationStyle) throws RemoteException {
        if (b() == null) {
            this.D = new bc(this, this.n);
        }
        if (this.D != null) {
            if (myLocationStyle.getInterval() < 1000) {
                myLocationStyle.interval(1000);
            }
            if (this.G != null && (this.G instanceof c)) {
                ((c) this.G).a(myLocationStyle.getInterval());
                ((c) this.G).a(myLocationStyle.getMyLocationType());
            }
            this.D.a(myLocationStyle);
        }
    }

    public void showMyLocationOverlay(Location location) {
        if (location != null) {
            try {
                if (isMyLocationEnabled()) {
                    if (this.G != null) {
                        if (this.D == null && this.D == null) {
                            this.D = new bc(this, this.n);
                        }
                        if (!(location.getLongitude() == 0.0d || location.getLatitude() == 0.0d)) {
                            this.D.a(location);
                        }
                        if (this.B != null) {
                            this.B.onMyLocationChange(location);
                        }
                        this.z = new Location(location);
                        return;
                    }
                }
                if (this.D != null) {
                    this.D.a();
                }
                this.D = null;
            } catch (Throwable unused) {
            }
        }
    }

    public b(Context context) {
        super(context);
        x();
        setClickable(true);
        a(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public PointF b(PointF pointF) {
        PointF pointF2 = new PointF();
        int width = getWidth();
        int height = getHeight();
        int i2 = width >> 1;
        float f2 = pointF.x - ((float) i2);
        int i3 = height >> 1;
        double d2 = (double) (pointF.y - ((float) i3));
        double d3 = (double) f2;
        double atan2 = Math.atan2(d2, d3);
        double sqrt = Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d2, 2.0d));
        double q2 = (double) q();
        Double.isNaN(q2);
        double d4 = atan2 - ((q2 * 3.141592653589793d) / 180.0d);
        double d5 = (double) i2;
        Double.isNaN(d5);
        pointF2.x = (float) ((Math.cos(d4) * sqrt) + d5);
        double d6 = (double) i3;
        Double.isNaN(d6);
        pointF2.y = (float) ((sqrt * Math.sin(d4)) + d6);
        return pointF2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        try {
            Paint n2 = n();
            canvas.drawColor(m());
            int width = getWidth();
            int height = getHeight();
            if (width > height) {
                i2 = width;
            } else {
                i2 = height;
            }
            float left = (float) getLeft();
            float top = (float) getTop();
            for (int i3 = 0; i3 < i2; i3 += 256) {
                float f2 = (float) i3;
                canvas.drawLine(left, f2, left + ((float) getWidth()), f2, n2);
                canvas.drawLine(f2, top, f2, top + ((float) getHeight()), n2);
            }
            if (this.aa) {
                setDrawingCacheEnabled(true);
                buildDrawingCache();
                Bitmap drawingCache = getDrawingCache();
                Message obtainMessage = this.k.obtainMessage();
                obtainMessage.what = 16;
                obtainMessage.obj = drawingCache;
                this.k.sendMessage(obtainMessage);
                this.aa = false;
            }
            if (!(this.f5687a == null || this.f5687a.f5665c == null)) {
                this.f5687a.f5665c.a(getWidth(), getHeight());
            }
            if (!(this.f5687a == null || this.f5687a.f5667e == null)) {
                this.f5687a.f5667e.a(canvas, this.ax, this.aA, this.aB);
            }
            if (!this.M.a()) {
                this.k.sendEmptyMessage(13);
            }
            if (!this.ai) {
                this.k.sendEmptyMessage(11);
                this.ai = true;
            }
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "onDraw");
        }
    }

    private void a(Context context) {
        this.ap = null;
        this.aq = new GestureDetector(context, this);
        this.ar = bb.a(context, this);
        this.au = new Scroller(context);
        new DisplayMetrics();
        DisplayMetrics displayMetrics = context.getApplicationContext().getResources().getDisplayMetrics();
        this.aC = displayMetrics.widthPixels;
        this.aD = displayMetrics.heightPixels;
        this.av = displayMetrics.widthPixels / 2;
        this.aw = displayMetrics.heightPixels / 2;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f5688b == null || this.f5687a == null) {
            return false;
        }
        this.f5687a.f5667e.b(motionEvent);
        Iterator<GestureDetector.OnGestureListener> it2 = this.as.iterator();
        while (it2.hasNext()) {
            it2.next().onSingleTapUp(motionEvent);
        }
        this.ac = false;
        if (this.P) {
            this.P = false;
            return true;
        }
        try {
            if (this.R != null) {
                if (this.j.a(new Rect(this.R.getLeft(), this.R.getTop(), this.R.getRight(), this.R.getBottom()), (int) motionEvent.getX(), (int) motionEvent.getY()) && this.S != null) {
                    ab e2 = this.j.e();
                    if (!e2.isVisible()) {
                        return true;
                    }
                    this.S.onInfoWindowClick(new Marker((e) e2));
                    return true;
                }
            }
            if (this.j.b(motionEvent)) {
                ab e3 = this.j.e();
                if (e3 != null) {
                    if (e3.isVisible()) {
                        Marker marker = new Marker((e) e3);
                        if (this.V != null) {
                            if (this.V.onMarkerClick(marker) || this.j.b() <= 0) {
                                this.j.c(e3);
                                return true;
                            } else if (this.j.e() != null && !e3.isViewMode()) {
                                LatLng realPosition = e3.getRealPosition();
                                if (realPosition != null) {
                                    this.f5688b.a(cm.a(realPosition));
                                    l.a().b();
                                }
                            }
                        }
                        a(e3);
                        this.j.c(e3);
                        return true;
                    }
                }
                return true;
            }
            if (this.ah != null) {
                s sVar = new s();
                a((int) motionEvent.getX(), (int) motionEvent.getY(), sVar);
                this.ah.onMapClick(new LatLng(sVar.f6278b, sVar.f6277a));
            }
            return true;
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "onSingleTapConfirmed");
            return true;
        }
    }

    public void b(boolean z2) {
        if (z2 != k() && this.f5687a != null) {
            String str = a().f5667e.i;
            if (!z2) {
                a().f5667e.a(str, false);
                a().f5665c.a(false, false);
            } else if (a().f5667e.b(str) != null) {
                a().f5667e.a(str, true);
                a().f5665c.a(false, false);
            } else {
                an anVar = new an(this.O);
                anVar.q = new bv(this.f5687a, anVar);
                anVar.g = true;
                anVar.i = 120000;
                anVar.j = new cb() {
                    public String a(int i, int i2, int i3) {
                        return ax.a().c() + "/trafficengine/mapabc/traffictile?v=w2.61&zoom=" + (17 - i3) + "&x=" + i + "&y=" + i2;
                    }
                };
                anVar.f5598b = str;
                anVar.f5601e = false;
                anVar.a(true);
                anVar.f5602f = false;
                anVar.f5599c = 18;
                anVar.f5600d = 9;
                a().f5667e.a(anVar, getContext());
                a().f5667e.a(str, true);
                a().f5665c.a(false, false);
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        if (this.ab && this.r != null && this.q != null) {
            s sVar = new s();
            a((int) motionEvent.getX(), (int) (motionEvent.getY() - 60.0f), sVar);
            LatLng latLng = new LatLng(sVar.f6278b, sVar.f6277a);
            if (this.r != null && this.r.isDraggable()) {
                this.r.a(latLng);
                if (this.ad != null) {
                    this.ad.onMarkerDrag(this.q);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void animateCameraWithCallback(CameraUpdate cameraUpdate, AMap.CancelableCallback cancelableCallback) throws RemoteException {
        if (cameraUpdate != null) {
            try {
                animateCameraWithDurationAndCallback(cameraUpdate, 250, cancelableCallback);
            } catch (Throwable unused) {
            }
        }
    }

    private void a(int i2, int i3) {
        if (this.ap != null) {
            this.aF = i2;
            this.aG = i3;
            B();
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f5687a == null) {
            return true;
        }
        if (!this.o) {
            return false;
        }
        if (this.f5687a.f5667e.a(i2, keyEvent) || this.f5688b.onKey(this, i2, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f5687a == null) {
            return true;
        }
        if (!this.o) {
            return false;
        }
        if (this.f5687a.f5667e.b(i2, keyEvent) || this.f5688b.onKey(this, i2, keyEvent)) {
            return true;
        }
        return false;
    }

    private void a(Context context, AttributeSet attributeSet) {
        q.f6267b = cp.c(context);
        this.n = context;
        try {
            this.al = new g(this.n, this);
            this.Z = new bi(this);
            setBackgroundColor(Color.rgb(222, 215, 214));
            n.a().a(this);
            l.a().a(this);
            this.I = new a(this);
            this.A = new d(this);
            this.M = new k(context);
            this.i = new bu(this.n, this);
            this.f5687a = new az(this.n, this, q.j);
            this.i.a(true);
            this.O = this.f5687a.h;
            this.f5688b = new aq(this.f5687a);
            this.h = new ca(this);
            this.f5692f = new ce(this.n, this.f5688b, this);
            this.g = new au(this.n, this);
            this.y = new ap(this.n, this.f5691e, this);
            this.E = new cd(this.n, this);
            this.F = new bk(this.n, this);
            this.H = new p(this.n, this.f5691e, this);
            this.j = new at(this.n, attributeSet, this);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            y();
            this.g.addView(this.i, layoutParams);
            this.g.addView(this.E, layoutParams);
            this.g.addView(this.F, layoutParams);
            this.g.addView(this.j, new au.a(layoutParams));
            au.a aVar = new au.a(-2, -2, new LatLng(0.0d, 0.0d), 0, 0, 83);
            this.g.addView(this.f5692f, aVar);
            au.a aVar2 = new au.a(-2, -2, new LatLng(0.0d, 0.0d), 0, 0, 83);
            this.g.addView(this.y, aVar2);
            if (!c().isMyLocationButtonEnabled()) {
                this.y.setVisibility(8);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "initEnviornment");
        } catch (Throwable th) {
            cm.a(th, "AMapDelegateImpGLSurfaceView", "initEnviornment");
            return;
        }
        this.H.setVisibility(8);
        au.a aVar3 = new au.a(-2, -2, new LatLng(0.0d, 0.0d), 0, 0, 51);
        this.g.addView(this.H, aVar3);
        this.D = new bc(this, this.n);
        this.f5692f.setId(h.f6232a);
        this.al.setName("AuthThread");
        this.al.start();
        if (this.ak == null) {
            this.ak = new Timer();
            this.ak.schedule(this.am, 10000, 1000);
        }
        this.G = new c(this.n);
    }

    public boolean b(float f2, PointF pointF) {
        this.az = false;
        try {
            if (!this.h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "endScale");
        }
        l.a().b();
        return true;
    }

    public void b(double d2, double d3, ae aeVar) {
        if (this.O != null) {
            getZoomLevel();
            PointF b2 = this.O.b(new w((int) r.a(d2), (int) r.a(d3)), this.O.l, this.O.n, this.O.k);
            if (aeVar != null) {
                aeVar.f5591a = (int) b2.x;
                aeVar.f5592b = (int) b2.y;
            }
        }
    }

    private void a(int i2, int i3, ae aeVar) {
        getZoomLevel();
        w a2 = this.O.a(new PointF((float) i2, (float) i3), this.O.l, this.O.n, this.O.k, this.O.o);
        if (aeVar != null) {
            aeVar.f5591a = (int) a2.e();
            aeVar.f5592b = (int) a2.f();
        }
    }

    public void animateCameraWithDurationAndCallback(CameraUpdate cameraUpdate, long j2, AMap.CancelableCallback cancelableCallback) throws RemoteException {
        if (cameraUpdate != null) {
            m cameraUpdateFactoryDelegate = cameraUpdate.getCameraUpdateFactoryDelegate();
            if (cameraUpdateFactoryDelegate.nowType == m.a.newLatLngBounds && !cm.a(getWidth(), getHeight())) {
                this.v = cameraUpdate;
                this.w = j2;
                this.x = cancelableCallback;
            } else if (this.f5688b != null) {
                if (cancelableCallback != null) {
                    try {
                        this.N = cancelableCallback;
                    } catch (Throwable th) {
                        cm.a(th, "AMapDelegateImpGLSurfaceView", "animateCameraWithDurationAndCallback");
                    }
                }
                if (this.f5688b.f()) {
                    this.f5688b.g();
                }
                if (cancelableCallback != null) {
                    this.N = cancelableCallback;
                }
                if (this.J) {
                    this.K = true;
                }
                if (cameraUpdateFactoryDelegate.nowType == m.a.scrollBy) {
                    r();
                    if (this.f5687a != null && this.o) {
                        this.f5688b.a((int) cameraUpdateFactoryDelegate.xPixel, (int) cameraUpdateFactoryDelegate.yPixel, (int) j2);
                        postInvalidate();
                    }
                } else if (cameraUpdateFactoryDelegate.nowType == m.a.zoomIn) {
                    this.f5688b.a((int) j2);
                } else if (cameraUpdateFactoryDelegate.nowType == m.a.zoomOut) {
                    this.f5688b.b((int) j2);
                } else if (cameraUpdateFactoryDelegate.nowType == m.a.zoomTo) {
                    this.f5688b.a(cameraUpdateFactoryDelegate.zoom, (int) j2);
                } else if (cameraUpdateFactoryDelegate.nowType == m.a.zoomBy) {
                    float f2 = cameraUpdateFactoryDelegate.amount;
                    Point point = cameraUpdateFactoryDelegate.focus;
                    if (point == null) {
                        point = new Point(this.f5687a.f5665c.c() / 2, this.f5687a.f5665c.d() / 2);
                    }
                    a(f2, point, true, j2);
                } else if (cameraUpdateFactoryDelegate.nowType == m.a.newCameraPosition) {
                    CameraPosition cameraPosition = cameraUpdateFactoryDelegate.cameraPosition;
                    this.f5688b.c(cameraPosition.zoom);
                    this.f5688b.a(new w((int) (cameraPosition.target.latitude * 1000000.0d), (int) (cameraPosition.target.longitude * 1000000.0d)), (int) j2);
                } else if (cameraUpdateFactoryDelegate.nowType == m.a.changeCenter) {
                    CameraPosition cameraPosition2 = cameraUpdateFactoryDelegate.cameraPosition;
                    this.f5688b.a(new w((int) (cameraPosition2.target.latitude * 1000000.0d), (int) (cameraPosition2.target.longitude * 1000000.0d)), (int) j2);
                } else {
                    if (cameraUpdateFactoryDelegate.nowType != m.a.newLatLngBounds) {
                        if (cameraUpdateFactoryDelegate.nowType != m.a.newLatLngBoundsWithSize) {
                            cameraUpdateFactoryDelegate.isChangeFinished = true;
                            this.f5691e.a((m) cameraUpdateFactoryDelegate);
                            return;
                        }
                    }
                    r();
                    a(cameraUpdateFactoryDelegate, true, j2);
                }
            }
        }
    }

    public void b(int i2, int i3, s sVar) {
        if (sVar != null) {
            sVar.f6277a = r.a((long) i2);
            sVar.f6278b = r.a((long) i3);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.ar.k || motionEvent.getEventTime() - this.ar.o < 30) {
            return true;
        }
        invalidate();
        this.ac = false;
        try {
            if (!this.h.isScrollGesturesEnabled()) {
                return true;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "onFling");
        }
        this.N = null;
        this.au.fling(this.av, this.aw, (((int) (-f2)) * 3) / 5, (((int) (-f3)) * 3) / 5, -this.aC, this.aC, -this.aD, this.aD);
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.ar.k || motionEvent2.getEventTime() - this.ar.o < 30) {
            return true;
        }
        try {
            if (!this.h.isScrollGesturesEnabled()) {
                this.ac = false;
                return true;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "onScroll");
        }
        if (this.aK > 1) {
            this.ac = false;
            return true;
        }
        this.ac = true;
        a((int) motionEvent2.getX(), (int) motionEvent2.getY());
        postInvalidate();
        r();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f5687a.h.a(new Point(i2 / 2, i3 / 2));
        this.f5687a.f5665c.a(i2, i3);
        if (!(this.f5688b.a() == 0.0f || this.f5688b.b() == 0.0f)) {
            this.f5688b.a(this.f5688b.a(), this.f5688b.b());
            this.f5688b.a(0.0f);
            this.f5688b.b(0.0f);
        }
        redrawInfoWindow();
        if (this.aM != null) {
            this.aM.a(i2, i3, i4, i5);
        }
    }

    private void a(float f2, PointF pointF, float f3, float f4) {
        try {
            if (!this.h.isZoomGesturesEnabled()) {
                return;
            }
        } catch (RemoteException e2) {
            cm.a(e2, "AMapDelegateImpGLSurfaceView", "doScale");
        }
        if (this.f5687a != null && this.f5687a.f5665c != null) {
            this.aK = 2;
            int c2 = this.f5687a.f5665c.c() / 2;
            int d2 = this.f5687a.f5665c.d() / 2;
            double log = Math.log((double) f2) / Math.log(2.0d);
            double e3 = (double) this.f5687a.f5665c.e();
            Double.isNaN(e3);
            float a2 = a((float) (e3 + log));
            if (a2 != this.f5687a.f5665c.e()) {
                this.f5689c[0] = this.f5689c[1];
                this.f5689c[1] = a2;
                if (this.f5689c[0] != this.f5689c[1]) {
                    w a3 = this.f5687a.f5664b.a(c2, d2);
                    this.f5687a.f5665c.a(a2);
                    this.f5687a.f5665c.a(a3);
                    D();
                }
            }
        }
    }
}
