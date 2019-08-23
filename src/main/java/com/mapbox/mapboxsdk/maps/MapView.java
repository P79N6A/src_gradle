package com.mapbox.mapboxsdk.maps;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ZoomButtonsController;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.NativeMapView;
import com.mapbox.mapboxsdk.maps.o;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.offline.OfflineGeometryRegionDefinition;
import com.mapbox.mapboxsdk.offline.OfflineRegionDefinition;
import com.mapbox.mapboxsdk.offline.OfflineTilePyramidRegionDefinition;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MapView extends FrameLayout implements NativeMapView.b {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<l> f26550a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    final j f26551b = new j();

    /* renamed from: c  reason: collision with root package name */
    public o f26552c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26553d;

    /* renamed from: e  reason: collision with root package name */
    public CompassView f26554e;

    /* renamed from: f  reason: collision with root package name */
    public PointF f26555f;
    public l g;
    private final e h = new e();
    private final d i = new d();
    private NativeMapView j;
    private p k;
    private MapRenderer l;
    private boolean m;
    private ImageView n;
    private ImageView o;
    private m p;
    private n q;
    private Bundle r;
    private boolean s;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MapChange {
    }

    static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final d f26565a;

        /* renamed from: b  reason: collision with root package name */
        private ac f26566b;

        public final void onClick(View view) {
            if (this.f26566b.f26608c != null) {
                this.f26566b.f26608c.onClick(view);
            } else {
                this.f26565a.onClick(view);
            }
        }

        private a(Context context, o oVar) {
            this.f26565a = new d(context, oVar);
            this.f26566b = oVar.f26696b;
        }

        /* synthetic */ a(Context context, o oVar, byte b2) {
            this(context, oVar);
        }
    }

    class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final List<g> f26567a;

        private b() {
            this.f26567a = new ArrayList();
        }

        public final void a(PointF pointF) {
            PointF pointF2;
            l lVar = MapView.this.g;
            if (pointF != null || lVar.f26663b.q == null) {
                pointF2 = pointF;
            } else {
                pointF2 = lVar.f26663b.q;
            }
            lVar.m = pointF2;
            for (g a2 : this.f26567a) {
                a2.a(pointF);
            }
        }

        /* synthetic */ b(MapView mapView, byte b2) {
            this();
        }
    }

    class c implements o.j {
        private c() {
        }

        public final void a(o.m mVar) {
            MapView.this.g.f26666e = mVar;
        }

        /* synthetic */ c(MapView mapView, byte b2) {
            this();
        }

        public final void a(AndroidGesturesManager androidGesturesManager, boolean z, boolean z2) {
            l lVar = MapView.this.g;
            Context context = MapView.this.getContext();
            lVar.a(androidGesturesManager, z2);
            lVar.a(context, z);
        }
    }

    class d implements j, k {

        /* renamed from: b  reason: collision with root package name */
        private int f26571b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f26572c;

        public final void a() {
            this.f26572c = true;
        }

        public final void c() {
            MapView.this.b((j) this);
            MapView.this.b((k) this);
        }

        public final void b() {
            if (this.f26572c) {
                this.f26571b++;
                if (this.f26571b == 2) {
                    MapView.this.setForeground(null);
                    MapView.this.b((k) this);
                }
            }
        }

        d() {
            MapView.this.a((j) this);
            MapView.this.a((k) this);
        }
    }

    class e implements g, h, i, j, k, m {

        /* renamed from: a  reason: collision with root package name */
        public boolean f26573a = true;

        /* renamed from: c  reason: collision with root package name */
        private final List<s> f26575c = new ArrayList();

        public final void f() {
            if (MapView.this.f26552c != null) {
                MapView.this.f26552c.f();
            }
        }

        public final void g() {
            if (MapView.this.f26552c != null) {
                MapView.this.f26552c.f();
            }
        }

        public final void h() {
            if (MapView.this.f26552c != null) {
                MapView.this.f26552c.f();
            }
        }

        public final void e() {
            if (MapView.this.f26552c != null && !this.f26573a) {
                MapView.this.f26552c.g.e();
            }
        }

        public final void a() {
            if (MapView.this.f26552c != null) {
                if (this.f26573a) {
                    this.f26573a = false;
                    MapView.this.f26552c.d();
                    c();
                    MapView.this.f26552c.e();
                } else {
                    MapView.this.f26552c.g.d();
                }
            }
            this.f26573a = false;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f26575c.size() > 0) {
                Iterator<s> it2 = this.f26575c.iterator();
                while (it2.hasNext()) {
                    s next = it2.next();
                    if (next != null) {
                        next.a(MapView.this.f26552c);
                    }
                    it2.remove();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            this.f26575c.clear();
            MapView.this.a((m) this);
            MapView.this.b((j) this);
            MapView.this.b((k) this);
            MapView.this.a((i) this);
            MapView.this.a((h) this);
            MapView.this.a((g) this);
        }

        public final void b() {
            if (MapView.this.f26552c != null) {
                o oVar = MapView.this.f26552c;
                CameraPosition b2 = oVar.f26698d.b();
                if (b2 != null) {
                    ac acVar = oVar.f26696b;
                    if (acVar.a()) {
                        CompassView compassView = acVar.f26606a;
                        compassView.f26741a = (float) (-b2.bearing);
                        if (compassView.isEnabled()) {
                            if (!compassView.b()) {
                                compassView.a();
                                compassView.setAlpha(1.0f);
                                compassView.setVisibility(0);
                                if (compassView.f26745e) {
                                    compassView.f26744d.a();
                                }
                                compassView.setRotation(compassView.f26741a);
                            } else if (compassView.getVisibility() != 4 && compassView.f26743c == null) {
                                compassView.postDelayed(compassView, 500);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(s sVar) {
            this.f26575c.add(sVar);
        }

        e() {
            MapView.this.f26551b.f26654c.add(this);
            MapView.this.a((j) this);
            MapView.this.a((k) this);
            MapView.this.f26551b.f26655d.add(this);
            MapView.this.f26551b.f26652a.add(this);
            MapView.this.f26551b.f26653b.add(this);
        }
    }

    static class f implements ZoomButtonsController.OnZoomListener {

        /* renamed from: a  reason: collision with root package name */
        private final l f26576a;

        /* renamed from: b  reason: collision with root package name */
        private final f f26577b;

        /* renamed from: c  reason: collision with root package name */
        private final float f26578c;

        /* renamed from: d  reason: collision with root package name */
        private final float f26579d;

        public final void onVisibilityChanged(boolean z) {
        }

        public final void onZoom(boolean z) {
            this.f26577b.a(3);
            PointF pointF = this.f26576a.m;
            if (pointF == null) {
                pointF = new PointF(this.f26578c / 2.0f, this.f26579d / 2.0f);
            }
            if (z) {
                this.f26576a.a(pointF, true);
            } else {
                this.f26576a.b(pointF, true);
            }
        }

        f(l lVar, f fVar, float f2, float f3) {
            this.f26576a = lVar;
            this.f26577b = fVar;
            this.f26578c = f2;
            this.f26579d = f3;
        }
    }

    public interface g {
        void h();
    }

    public interface h {
        void g();
    }

    public interface i {
        void f();
    }

    public interface j {
        void a();
    }

    public interface k {
        void b();
    }

    @Deprecated
    public interface l {
        void a(int i);
    }

    public interface m {
        void e();
    }

    /* access modifiers changed from: package-private */
    public o getMapboxMap() {
        return this.f26552c;
    }

    public final void a(m mVar) {
        this.f26551b.f26654c.remove(mVar);
    }

    @UiThread
    public final void a(@NonNull s sVar) {
        if (this.h.f26573a || this.f26552c == null) {
            this.h.a(sVar);
        } else {
            sVar.a(this.f26552c);
        }
    }

    private boolean i() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    private boolean j() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.m = true;
        post(new Runnable() {
            public final void run() {
                if (!MapView.this.f26553d && MapView.this.f26552c == null) {
                    MapView.this.a();
                    MapView.this.f26552c.a();
                }
            }
        });
    }

    @UiThread
    public final void d() {
        if (this.l != null) {
            this.l.onResume();
        }
    }

    @UiThread
    public final void e() {
        if (this.l != null) {
            this.l.onPause();
        }
    }

    @UiThread
    public final void h() {
        if (this.j != null) {
            this.j.i();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (i()) {
            this.q.a(false);
        }
    }

    private float getPixelRatio() {
        float f2 = this.k.F;
        if (f2 == 0.0f) {
            return getResources().getDisplayMetrics().density;
        }
        return f2;
    }

    @UiThread
    public final void c() {
        if (!this.s) {
            ConnectivityReceiver.a(getContext()).a();
            FileSource.a(getContext()).activate();
            this.s = true;
        }
        if (this.f26552c != null) {
            this.f26552c.a();
        }
        if (this.l != null) {
            this.l.onStart();
        }
    }

    @UiThread
    public final void f() {
        if (this.f26552c != null) {
            this.g.a();
            this.f26552c.b();
        }
        if (this.l != null) {
            this.l.onStop();
        }
        if (this.s) {
            ConnectivityReceiver.a(getContext()).b();
            FileSource.a(getContext()).deactivate();
            this.s = false;
        }
    }

    @UiThread
    public final void g() {
        this.f26553d = true;
        this.f26551b.h();
        this.f26550a.clear();
        this.h.d();
        this.i.c();
        if (this.f26552c != null) {
            this.f26552c.c();
        }
        if (this.j != null && this.m) {
            this.j.a();
            this.j = null;
        }
        if (this.l != null) {
            this.l.onDestroy();
        }
    }

    public Bitmap getViewContent() {
        setDrawingCacheEnabled(true);
        setDrawingCacheQuality(524288);
        buildDrawingCache();
        if (getDrawingCache() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getDrawingCache());
        setDrawingCacheEnabled(false);
        destroyDrawingCache();
        return createBitmap;
    }

    public final void a() {
        Context context = getContext();
        b bVar = new b(this, (byte) 0);
        bVar.f26567a.add(new g() {
            public final void a(PointF pointF) {
                MapView.this.f26555f = pointF;
            }
        });
        c cVar = new c(this, (byte) 0);
        final f fVar = new f();
        x xVar = new x(this.j);
        ac acVar = new ac(xVar, bVar, this.f26554e, this.n, this.o, getPixelRatio());
        LongSparseArray longSparseArray = new LongSparseArray();
        com.mapbox.mapboxsdk.annotations.j jVar = new com.mapbox.mapboxsdk.annotations.j((ViewGroup) findViewById(C0906R.id.blf));
        h hVar = new h(this.j);
        a aVar = new a(this.j, longSparseArray);
        q qVar = new q(this.j, this, longSparseArray, hVar, jVar);
        t tVar = new t(this.j, longSparseArray);
        v vVar = new v(this.j, longSparseArray);
        b bVar2 = r0;
        v vVar2 = vVar;
        t tVar2 = tVar;
        ac acVar2 = acVar;
        x xVar2 = xVar;
        b bVar3 = new b(this.j, this, longSparseArray, jVar, hVar, aVar, qVar, tVar2, vVar2, new y(this.j, longSparseArray));
        ab abVar = new ab(this.j, bVar2.f26614c, fVar);
        o oVar = new o(this.j, abVar, acVar2, xVar2, cVar, bVar2, fVar);
        this.f26552c = oVar;
        l lVar = new l(context, abVar, xVar2, acVar2, bVar2, fVar);
        this.g = lVar;
        ac acVar3 = acVar2;
        this.p = new m(abVar, acVar3, this.g);
        this.q = new n(new ZoomButtonsController(this));
        f fVar2 = new f(this.g, fVar, (float) getWidth(), (float) getHeight());
        n nVar = this.q;
        nVar.f26693a = acVar3;
        nVar.f26694b.setOnZoomListener(fVar2);
        this.f26554e.f26744d = new o.h() {
            public final void a() {
                fVar.m_();
            }

            public final void b() {
                MapView.this.f26554e.f26745e = false;
                fVar.a();
            }
        };
        this.f26554e.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (MapView.this.f26552c != null && MapView.this.f26554e != null) {
                    if (MapView.this.f26555f != null) {
                        MapView.this.f26552c.a(0.0d, MapView.this.f26555f.x, MapView.this.f26555f.y, 150);
                    } else {
                        MapView.this.f26552c.a(0.0d, ((float) MapView.this.f26552c.f26695a.l()) / 2.0f, ((float) MapView.this.f26552c.f26695a.m()) / 2.0f, 150);
                    }
                    fVar.a(3);
                    MapView.this.f26554e.f26745e = true;
                    MapView.this.f26554e.postDelayed(MapView.this.f26554e, 650);
                }
            }
        });
        this.f26552c.g = new com.mapbox.mapboxsdk.location.o(this.f26552c);
        this.n.setOnClickListener(new a(context, this.f26552c, (byte) 0));
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestDisallowInterceptTouchEvent(true);
        NativeMapView nativeMapView = this.j;
        ConnectivityReceiver.a(context);
        boolean b2 = ConnectivityReceiver.b(context);
        if (!nativeMapView.a("setReachability")) {
            nativeMapView.nativeSetReachability(b2);
        }
        BitmapDrawable bitmapDrawable = null;
        if (this.r == null) {
            o oVar2 = this.f26552c;
            p pVar = this.k;
            ab abVar2 = oVar2.f26698d;
            CameraPosition cameraPosition = pVar.f26704a;
            if (cameraPosition != null && !cameraPosition.equals(CameraPosition.f26469a)) {
                abVar2.a(oVar2, com.mapbox.mapboxsdk.camera.b.a(cameraPosition), (o.a) null);
            }
            abVar2.a(pVar.o);
            abVar2.b(pVar.p);
            ac acVar4 = oVar2.f26696b;
            Resources resources = context.getResources();
            acVar4.g = pVar.t;
            acVar4.h = pVar.r;
            acVar4.f26610e = pVar.q;
            acVar4.f26611f = pVar.s;
            acVar4.i = pVar.u;
            acVar4.j = pVar.v;
            acVar4.a(pVar.f26706c);
            acVar4.a(pVar.f26708e);
            int[] iArr = pVar.f26709f;
            if (iArr != null) {
                acVar4.a(iArr[0], iArr[1], iArr[2], iArr[3]);
            } else {
                int dimension = (int) resources.getDimension(C0906R.dimen.i8);
                acVar4.a(dimension, dimension, dimension, dimension);
            }
            acVar4.b(pVar.f26707d);
            if (pVar.g == null) {
                pVar.a(ResourcesCompat.getDrawable(resources, 2130840256, null));
            }
            acVar4.a(pVar.g);
            acVar4.c(pVar.h);
            acVar4.b(pVar.i);
            int[] iArr2 = pVar.j;
            if (iArr2 != null) {
                acVar4.b(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            } else {
                int dimension2 = (int) resources.getDimension(C0906R.dimen.i8);
                acVar4.b(dimension2, dimension2, dimension2, dimension2);
            }
            acVar4.d(pVar.l);
            acVar4.c(pVar.m);
            int[] iArr3 = pVar.n;
            if (iArr3 != null) {
                acVar4.c(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                Resources resources2 = context.getResources();
                int dimension3 = (int) resources2.getDimension(C0906R.dimen.i8);
                acVar4.c((int) resources2.getDimension(C0906R.dimen.ii), dimension3, dimension3, dimension3);
            }
            int i2 = pVar.k;
            if (i2 == -1) {
                i2 = com.mapbox.mapboxsdk.utils.b.a(context);
            }
            if (Color.alpha(i2) == 0) {
                com.mapbox.mapboxsdk.utils.b.a(acVar4.f26607b, ContextCompat.getColor(acVar4.f26607b.getContext(), C0906R.color.sn));
            } else {
                com.mapbox.mapboxsdk.utils.b.a(acVar4.f26607b, i2);
            }
            if (!context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch")) {
                acVar4.i = true;
            }
            oVar2.f26695a.b(pVar.f26705b);
            String str = pVar.z;
            if (!TextUtils.isEmpty(str)) {
                NativeMapView nativeMapView2 = oVar2.f26695a;
                if (!nativeMapView2.a("setApiBaseUrl")) {
                    nativeMapView2.f26580a.setApiBaseUrl(str);
                }
            }
            String str2 = pVar.D;
            if (!TextUtils.isEmpty(str2)) {
                oVar2.f26695a.b(str2);
            }
            String str3 = pVar.E;
            if (!TextUtils.isEmpty(str3)) {
                NativeMapView nativeMapView3 = oVar2.f26695a;
                if (!nativeMapView3.a("setStyleJson")) {
                    nativeMapView3.nativeSetStyleJson(str3);
                }
            }
            boolean z = pVar.w;
            NativeMapView nativeMapView4 = oVar2.f26695a;
            if (!nativeMapView4.a("setPrefetchesTiles")) {
                nativeMapView4.nativeSetPrefetchesTiles(z);
            }
        } else {
            o oVar3 = this.f26552c;
            Bundle bundle = this.r;
            CameraPosition cameraPosition2 = (CameraPosition) bundle.getParcelable("mapbox_cameraPosition");
            ac acVar5 = oVar3.f26696b;
            acVar5.g = bundle.getBoolean("mapbox_zoomEnabled");
            acVar5.h = bundle.getBoolean("mapbox_scrollEnabled");
            acVar5.f26610e = bundle.getBoolean("mapbox_rotateEnabled");
            acVar5.f26611f = bundle.getBoolean("mapbox_tiltEnabled");
            acVar5.j = bundle.getBoolean("mapbox_doubleTapEnabled");
            acVar5.k = bundle.getBoolean("mapbox_scaleAnimationEnabled");
            acVar5.l = bundle.getBoolean("mapbox_rotateAnimationEnabled");
            acVar5.m = bundle.getBoolean("mapbox_flingAnimationEnabled");
            acVar5.n = bundle.getBoolean("mapbox_increaseRotateThreshold");
            acVar5.o = bundle.getBoolean("mapbox_increaseScaleThreshold");
            acVar5.a(bundle.getBoolean("mapbox_compassEnabled"));
            acVar5.a(bundle.getInt("mapbox_compassGravity"));
            acVar5.a(bundle.getInt("mapbox_compassMarginLeft"), bundle.getInt("mapbox_compassMarginTop"), bundle.getInt("mapbox_compassMarginRight"), bundle.getInt("mapbox_compassMarginBottom"));
            acVar5.b(bundle.getBoolean("mapbox_compassFade"));
            Context context2 = acVar5.f26606a.getContext();
            byte[] byteArray = bundle.getByteArray("mapbox_compassImage");
            if (byteArray != null) {
                bitmapDrawable = new BitmapDrawable(context2.getResources(), BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
            acVar5.a((Drawable) bitmapDrawable);
            acVar5.c(bundle.getBoolean("mapbox_logoEnabled"));
            acVar5.b(bundle.getInt("mapbox_logoGravity"));
            acVar5.b(bundle.getInt("mapbox_logoMarginLeft"), bundle.getInt("mapbox_logoMarginTop"), bundle.getInt("mapbox_logoMarginRight"), bundle.getInt("mapbox_logoMarginBottom"));
            acVar5.d(bundle.getBoolean("mapbox_atrrEnabled"));
            acVar5.c(bundle.getInt("mapbox_attrGravity"));
            acVar5.c(bundle.getInt("mapbox_attrMarginLeft"), bundle.getInt("mapbox_attrMarginTop"), bundle.getInt("mapbox_attrMarginRight"), bundle.getInt("mapbox_atrrMarginBottom"));
            acVar5.i = bundle.getBoolean("mapbox_zoomControlsEnabled");
            acVar5.p = bundle.getBoolean("mapbox_deselectMarkerOnTap");
            PointF pointF = (PointF) bundle.getParcelable("mapbox_userFocalPoint");
            if (pointF != null) {
                acVar5.a(pointF);
            }
            if (cameraPosition2 != null) {
                oVar3.a(com.mapbox.mapboxsdk.camera.b.a(new CameraPosition.a(cameraPosition2).a()));
            }
            oVar3.f26695a.b(bundle.getBoolean("mapbox_debugActive"));
            if (!TextUtils.isEmpty(bundle.getString("mapbox_styleUrl"))) {
                oVar3.f26695a.b(bundle.getString("mapbox_styleUrl"));
            }
        }
        e eVar = this.h;
        if (!eVar.f26573a) {
            MapView.this.f26552c.d();
            eVar.c();
            MapView.this.f26552c.e();
        }
    }

    public static void setMapStrictModeEnabled(boolean z) {
        com.mapbox.mapboxsdk.b.a(z);
    }

    /* access modifiers changed from: package-private */
    public void setMapboxMap(o oVar) {
        this.f26552c = oVar;
    }

    public final void a(g gVar) {
        this.f26551b.f26653b.remove(gVar);
    }

    public final void b(j jVar) {
        this.f26551b.f26657f.remove(jVar);
    }

    public final void a(h hVar) {
        this.f26551b.f26652a.remove(hVar);
    }

    public void setStyleUrl(@NonNull String str) {
        if (this.j != null) {
            this.j.b(str);
        }
    }

    private void setOfflineGeometryRegionDefinition(OfflineGeometryRegionDefinition offlineGeometryRegionDefinition) {
        a(offlineGeometryRegionDefinition.styleURL, offlineGeometryRegionDefinition.getBounds().a(), offlineGeometryRegionDefinition.minZoom, offlineGeometryRegionDefinition.maxZoom);
    }

    private void setOfflineTilePyramidRegionDefinition(OfflineTilePyramidRegionDefinition offlineTilePyramidRegionDefinition) {
        a(offlineTilePyramidRegionDefinition.styleURL, offlineTilePyramidRegionDefinition.getBounds().a(), offlineTilePyramidRegionDefinition.minZoom, offlineTilePyramidRegionDefinition.maxZoom);
    }

    @UiThread
    public final void a(@Nullable Bundle bundle) {
        if (bundle == null) {
            aa d2 = com.mapbox.mapboxsdk.d.d();
            if (d2 != null) {
                d2.a();
            }
            return;
        }
        if (bundle.getBoolean("mapbox_savedState")) {
            this.r = bundle;
        }
    }

    @UiThread
    public final void b(@NonNull Bundle bundle) {
        if (this.f26552c != null) {
            bundle.putBoolean("mapbox_savedState", true);
            this.f26552c.a(bundle);
        }
    }

    public void setOfflineRegionDefinition(OfflineRegionDefinition offlineRegionDefinition) {
        if (offlineRegionDefinition instanceof OfflineTilePyramidRegionDefinition) {
            setOfflineTilePyramidRegionDefinition((OfflineTilePyramidRegionDefinition) offlineRegionDefinition);
        } else if (offlineRegionDefinition instanceof OfflineGeometryRegionDefinition) {
            setOfflineGeometryRegionDefinition((OfflineGeometryRegionDefinition) offlineRegionDefinition);
        } else {
            throw new UnsupportedOperationException("OfflineRegionDefintion instance not supported");
        }
    }

    public final void b(k kVar) {
        this.f26551b.f26656e.remove(kVar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!i()) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            switch (actionMasked) {
                case 9:
                    break;
                case 10:
                    this.q.a(false);
                    return true;
                default:
                    return false;
            }
        }
        this.q.a(true);
        return true;
    }

    public final void a(i iVar) {
        this.f26551b.f26655d.remove(iVar);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if (!j()) {
            return super.onGenericMotionEvent(motionEvent);
        }
        l lVar = this.g;
        if ((motionEvent.getSource() & 2) == 2 && motionEvent.getActionMasked() == 8 && lVar.f26663b.g) {
            lVar.f26662a.c();
            lVar.f26662a.a((double) motionEvent.getAxisValue(9), new PointF(motionEvent.getX(), motionEvent.getY()));
            z = true;
        } else {
            z = false;
        }
        if (z || super.onGenericMotionEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!i() || !j()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.q.a(true);
        }
        l lVar = this.g;
        if (motionEvent != null && (motionEvent.getButtonState() == 0 || motionEvent.getButtonState() == 1)) {
            z = lVar.n.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        lVar.a();
                        lVar.f26662a.a(true);
                        break;
                    case 1:
                        lVar.f26662a.a(false);
                        if (!lVar.r.isEmpty()) {
                            lVar.s.removeCallbacksAndMessages(null);
                            for (Animator start : lVar.r) {
                                start.start();
                            }
                            lVar.r.clear();
                            break;
                        }
                        break;
                }
            } else {
                lVar.r.clear();
                lVar.f26662a.c();
                lVar.f26662a.a(false);
            }
        } else {
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        if (r0 != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if (super.onTrackballEvent(r13) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTrackballEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.mapbox.mapboxsdk.maps.m r0 = r12.p
            int r1 = r13.getActionMasked()
            r2 = 0
            r3 = 0
            r4 = 1
            switch(r1) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0045;
                case 2: goto L_0x001b;
                case 3: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0091
        L_0x000e:
            com.mapbox.mapboxsdk.maps.m$a r1 = r0.f26690d
            if (r1 == 0) goto L_0x008f
            com.mapbox.mapboxsdk.maps.m$a r1 = r0.f26690d
            r1.a()
            r0.f26690d = r2
            goto L_0x008f
        L_0x001b:
            com.mapbox.mapboxsdk.maps.ac r1 = r0.f26688b
            boolean r1 = r1.h
            if (r1 == 0) goto L_0x0091
            com.mapbox.mapboxsdk.maps.ab r1 = r0.f26687a
            r1.c()
            com.mapbox.mapboxsdk.maps.ab r5 = r0.f26687a
            float r0 = r13.getX()
            double r0 = (double) r0
            r6 = -4601552919265804288(0xc024000000000000, double:-10.0)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r6
            float r2 = r13.getY()
            double r8 = (double) r2
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r6
            r10 = 0
            r6 = r0
            r5.a((double) r6, (double) r8, (long) r10)
            goto L_0x008f
        L_0x0045:
            com.mapbox.mapboxsdk.maps.ac r1 = r0.f26688b
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x0091
            com.mapbox.mapboxsdk.maps.m$a r1 = r0.f26690d
            if (r1 == 0) goto L_0x008f
            android.graphics.PointF r1 = new android.graphics.PointF
            com.mapbox.mapboxsdk.maps.ac r2 = r0.f26688b
            float r2 = r2.c()
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            com.mapbox.mapboxsdk.maps.ac r6 = r0.f26688b
            float r6 = r6.b()
            float r6 = r6 / r5
            r1.<init>(r2, r6)
            com.mapbox.mapboxsdk.maps.l r0 = r0.f26689c
            r0.a((android.graphics.PointF) r1, (boolean) r4)
            goto L_0x008f
        L_0x006a:
            com.mapbox.mapboxsdk.maps.m$a r1 = r0.f26690d
            if (r1 == 0) goto L_0x0075
            com.mapbox.mapboxsdk.maps.m$a r1 = r0.f26690d
            r1.a()
            r0.f26690d = r2
        L_0x0075:
            com.mapbox.mapboxsdk.maps.m$a r1 = new com.mapbox.mapboxsdk.maps.m$a
            r1.<init>()
            r0.f26690d = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.mapbox.mapboxsdk.maps.m$a r0 = r0.f26690d
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r5 = (long) r2
            r1.postDelayed(r0, r5)
        L_0x008f:
            r0 = 1
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            if (r0 != 0) goto L_0x009c
            boolean r13 = super.onTrackballEvent(r13)
            if (r13 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            return r3
        L_0x009c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapView.onTrackballEvent(android.view.MotionEvent):boolean");
    }

    public final void a(j jVar) {
        this.f26551b.f26657f.add(jVar);
    }

    public final void a(k kVar) {
        this.f26551b.f26656e.add(kVar);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(@NonNull View view, int i2) {
        boolean z;
        if (!isInEditMode() && i()) {
            n nVar = this.q;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            nVar.a(z);
        }
    }

    @UiThread
    public MapView(@NonNull Context context, @Nullable p pVar) {
        super(context);
        a(context, pVar == null ? p.a(context, null) : pVar);
    }

    public boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        boolean z;
        m mVar = this.p;
        if ((i2 == 23 || i2 == 66) && mVar.f26688b.g) {
            mVar.f26689c.b(new PointF(mVar.f26688b.c() / 2.0f, mVar.f26688b.b() / 2.0f), true);
            z = true;
        } else {
            z = false;
        }
        if (z || super.onKeyLongPress(i2, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        boolean z;
        m mVar = this.p;
        if (keyEvent.isCanceled() || (!(i2 == 23 || i2 == 66) || !mVar.f26688b.g)) {
            z = false;
        } else {
            mVar.f26689c.a(new PointF(mVar.f26688b.c() / 2.0f, mVar.f26688b.b() / 2.0f), true);
            z = true;
        }
        if (z || super.onKeyUp(i2, keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @UiThread
    @CallSuper
    public void a(@NonNull Context context, @NonNull p pVar) {
        if (!isInEditMode()) {
            setForeground(new ColorDrawable(pVar.C));
            this.k = pVar;
            View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a_z, this);
            this.f26554e = (CompassView) inflate.findViewById(C0906R.id.xx);
            this.n = (ImageView) inflate.findViewById(C0906R.id.g5);
            this.o = (ImageView) inflate.findViewById(C0906R.id.bkl);
            setContentDescription(context.getString(C0906R.string.b_j));
            setWillNotDraw(false);
            String str = pVar.y;
            if (pVar.A) {
                TextureView textureView = new TextureView(getContext());
                AnonymousClass4 r0 = new com.mapbox.mapboxsdk.maps.renderer.c.a(getContext(), textureView, str, pVar.B) {
                    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                        MapView.this.b();
                        super.onSurfaceCreated(gl10, eGLConfig);
                    }
                };
                this.l = r0;
                addView(textureView, 0);
            } else {
                GLSurfaceView gLSurfaceView = new GLSurfaceView(getContext());
                gLSurfaceView.setZOrderMediaOverlay(this.k.x);
                this.l = new com.mapbox.mapboxsdk.maps.renderer.b.a(getContext(), gLSurfaceView, str) {
                    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                        MapView.this.b();
                        super.onSurfaceCreated(gl10, eGLConfig);
                    }
                };
                addView(gLSurfaceView, 0);
            }
            NativeMapView nativeMapView = new NativeMapView(getContext(), getPixelRatio(), this.k.G, this, this.f26551b, this.l);
            this.j = nativeMapView;
            this.j.a((l) new l() {
                public final void a(int i) {
                    if (!MapView.this.f26550a.isEmpty()) {
                        Iterator<l> it2 = MapView.this.f26550a.iterator();
                        while (it2.hasNext()) {
                            it2.next().a(i);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r21, android.view.KeyEvent r22) {
        /*
            r20 = this;
            r0 = r21
            r1 = r20
            com.mapbox.mapboxsdk.maps.m r2 = r1.p
            int r3 = r22.getRepeatCount()
            r4 = 5
            if (r3 < r4) goto L_0x0011
            r3 = 4632233691727265792(0x4049000000000000, double:50.0)
        L_0x000f:
            r8 = r3
            goto L_0x0014
        L_0x0011:
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L_0x000f
        L_0x0014:
            r3 = 66
            r4 = 0
            r12 = 1
            if (r0 == r3) goto L_0x007a
            switch(r0) {
                case 19: goto L_0x0063;
                case 20: goto L_0x004b;
                case 21: goto L_0x0034;
                case 22: goto L_0x001e;
                case 23: goto L_0x007a;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0078
        L_0x001e:
            com.mapbox.mapboxsdk.maps.ac r3 = r2.f26688b
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x0078
            com.mapbox.mapboxsdk.maps.ab r3 = r2.f26687a
            r3.c()
            com.mapbox.mapboxsdk.maps.ab r13 = r2.f26687a
            double r14 = -r8
            r16 = 0
            r18 = 0
            r13.a((double) r14, (double) r16, (long) r18)
            goto L_0x007d
        L_0x0034:
            com.mapbox.mapboxsdk.maps.ac r3 = r2.f26688b
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x0078
            com.mapbox.mapboxsdk.maps.ab r3 = r2.f26687a
            r3.c()
            com.mapbox.mapboxsdk.maps.ab r5 = r2.f26687a
            r2 = 0
            r10 = 0
            r6 = r8
            r8 = r2
            r5.a((double) r6, (double) r8, (long) r10)
            goto L_0x007d
        L_0x004b:
            com.mapbox.mapboxsdk.maps.ac r3 = r2.f26688b
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x0078
            com.mapbox.mapboxsdk.maps.ab r3 = r2.f26687a
            r3.c()
            com.mapbox.mapboxsdk.maps.ab r13 = r2.f26687a
            r14 = 0
            double r2 = -r8
            r18 = 0
            r16 = r2
            r13.a((double) r14, (double) r16, (long) r18)
            goto L_0x007d
        L_0x0063:
            com.mapbox.mapboxsdk.maps.ac r3 = r2.f26688b
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x0078
            com.mapbox.mapboxsdk.maps.ab r3 = r2.f26687a
            r3.c()
            com.mapbox.mapboxsdk.maps.ab r5 = r2.f26687a
            r6 = 0
            r10 = 0
            r5.a((double) r6, (double) r8, (long) r10)
            goto L_0x007d
        L_0x0078:
            r2 = 0
            goto L_0x007e
        L_0x007a:
            r22.startTracking()
        L_0x007d:
            r2 = 1
        L_0x007e:
            if (r2 != 0) goto L_0x0088
            boolean r0 = super.onKeyDown(r21, r22)
            if (r0 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            return r4
        L_0x0088:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapView.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    private void a(String str, LatLng latLng, double d2, double d3) {
        CameraPosition.a a2 = new CameraPosition.a().a(latLng);
        a2.f26470a = d2;
        CameraPosition a3 = a2.a();
        setStyleUrl(str);
        if (this.f26552c != null) {
            this.f26552c.a(com.mapbox.mapboxsdk.camera.b.a(a3));
            this.f26552c.f26698d.a(d2);
            this.f26552c.f26698d.b(d3);
            return;
        }
        this.k.a(a3);
        this.k.a(d2);
        this.k.b(d3);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!isInEditMode() && this.j != null) {
            NativeMapView nativeMapView = this.j;
            if (!nativeMapView.a("resizeView")) {
                int ceil = (int) Math.ceil((double) (((float) i2) / nativeMapView.f26582c));
                int ceil2 = (int) Math.ceil((double) (((float) i3) / nativeMapView.f26582c));
                if (ceil < 0) {
                    throw new IllegalArgumentException("width cannot be negative.");
                } else if (ceil2 >= 0) {
                    if (ceil > 65535) {
                        Logger.e("Mbgl-NativeMapView", String.format("Device returned an out of range width size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(ceil)}));
                        ceil = 65535;
                    }
                    if (ceil2 > 65535) {
                        Logger.e("Mbgl-NativeMapView", String.format("Device returned an out of range height size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(ceil2)}));
                        ceil2 = 65535;
                    }
                    nativeMapView.nativeResizeView(ceil, ceil2);
                } else {
                    throw new IllegalArgumentException("height cannot be negative.");
                }
            }
        }
    }
}
