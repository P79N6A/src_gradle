package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.gesturehandler.i;
import com.swmansion.gesturehandler.j;
import com.swmansion.gesturehandler.k;
import com.swmansion.gesturehandler.n;
import com.swmansion.gesturehandler.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "RNGestureHandlerModule")
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    public List<Integer> mEnqueuedRootViewInit = new ArrayList();
    private i mEventListener = new i() {
        public final void a(com.swmansion.gesturehandler.b bVar, MotionEvent motionEvent) {
            RNGestureHandlerModule.this.onTouchEvent(bVar, motionEvent);
        }

        public final void a(com.swmansion.gesturehandler.b bVar, int i, int i2) {
            RNGestureHandlerModule.this.onStateChange(bVar, i, i2);
        }
    };
    private b[] mHandlerFactories = {new d((byte) 0), new h((byte) 0), new c((byte) 0), new e((byte) 0), new f((byte) 0), new g((byte) 0), new a((byte) 0)};
    private d mInteractionManager = new d();
    private final f mRegistry = new f();
    private List<g> mRoots = new ArrayList();

    static class a extends b<com.swmansion.gesturehandler.a> {
        public final String b() {
            return "FlingGestureHandler";
        }

        public final Class<com.swmansion.gesturehandler.a> a() {
            return com.swmansion.gesturehandler.a.class;
        }

        private a() {
            super((byte) 0);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ com.swmansion.gesturehandler.b a(Context context) {
            return new com.swmansion.gesturehandler.a();
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
            com.swmansion.gesturehandler.a aVar = (com.swmansion.gesturehandler.a) bVar;
            super.a(aVar, readableMap);
            if (readableMap.hasKey("numberOfPointers")) {
                aVar.f78766b = readableMap.getInt("numberOfPointers");
            }
            if (readableMap.hasKey("direction")) {
                aVar.f78765a = readableMap.getInt("direction");
            }
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            com.swmansion.gesturehandler.a aVar = (com.swmansion.gesturehandler.a) bVar;
            super.a(aVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(aVar.j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(aVar.k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(aVar.l));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(aVar.m));
        }
    }

    static abstract class b<T extends com.swmansion.gesturehandler.b> implements c<T> {
        public abstract T a(Context context);

        public abstract Class<T> a();

        public abstract String b();

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public void a(T t, WritableMap writableMap) {
            writableMap.putDouble("numberOfPointers", (double) t.n);
        }

        public void a(T t, ReadableMap readableMap) {
            if (readableMap.hasKey("shouldCancelWhenOutside")) {
                t.a(readableMap.getBoolean("shouldCancelWhenOutside"));
            }
            if (readableMap.hasKey("enabled")) {
                t.b(readableMap.getBoolean("enabled"));
            }
            if (readableMap.hasKey("hitSlop")) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }
    }

    static class c extends b<com.swmansion.gesturehandler.g> {
        public final String b() {
            return "LongPressGestureHandler";
        }

        public final Class<com.swmansion.gesturehandler.g> a() {
            return com.swmansion.gesturehandler.g.class;
        }

        private c() {
            super((byte) 0);
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final /* synthetic */ com.swmansion.gesturehandler.b a(Context context) {
            return new com.swmansion.gesturehandler.g(context);
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
            com.swmansion.gesturehandler.g gVar = (com.swmansion.gesturehandler.g) bVar;
            super.a(gVar, readableMap);
            if (readableMap.hasKey("minDurationMs")) {
                gVar.f78780a = (long) readableMap.getInt("minDurationMs");
            }
            if (readableMap.hasKey("maxDist")) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDist"));
                gVar.f78781b = pixelFromDIP * pixelFromDIP;
            }
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            com.swmansion.gesturehandler.g gVar = (com.swmansion.gesturehandler.g) bVar;
            super.a(gVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(gVar.j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(gVar.k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(gVar.l));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(gVar.m));
        }
    }

    static class d extends b<com.swmansion.gesturehandler.h> {
        public final String b() {
            return "NativeViewGestureHandler";
        }

        public final Class<com.swmansion.gesturehandler.h> a() {
            return com.swmansion.gesturehandler.h.class;
        }

        private d() {
            super((byte) 0);
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final /* synthetic */ com.swmansion.gesturehandler.b a(Context context) {
            return new com.swmansion.gesturehandler.h();
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            com.swmansion.gesturehandler.h hVar = (com.swmansion.gesturehandler.h) bVar;
            super.a(hVar, writableMap);
            writableMap.putBoolean("pointerInside", hVar.j);
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
            com.swmansion.gesturehandler.h hVar = (com.swmansion.gesturehandler.h) bVar;
            super.a(hVar, readableMap);
            if (readableMap.hasKey("shouldActivateOnStart")) {
                hVar.f78783a = readableMap.getBoolean("shouldActivateOnStart");
            }
            if (readableMap.hasKey("disallowInterruption")) {
                hVar.f78784b = readableMap.getBoolean("disallowInterruption");
            }
        }
    }

    static class e extends b<j> {
        public final String b() {
            return "PanGestureHandler";
        }

        public final Class<j> a() {
            return j.class;
        }

        private e() {
            super((byte) 0);
        }

        /* synthetic */ e(byte b2) {
            this();
        }

        public final /* synthetic */ com.swmansion.gesturehandler.b a(Context context) {
            return new j(context);
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            j jVar = (j) bVar;
            super.a(jVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(jVar.j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(jVar.k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(jVar.l));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(jVar.m));
            writableMap.putDouble("translationX", (double) PixelUtil.toDIPFromPixel((jVar.J - jVar.F) + jVar.H));
            writableMap.putDouble("translationY", (double) PixelUtil.toDIPFromPixel((jVar.K - jVar.G) + jVar.I));
            writableMap.putDouble("velocityX", (double) PixelUtil.toDIPFromPixel(jVar.L));
            writableMap.putDouble("velocityY", (double) PixelUtil.toDIPFromPixel(jVar.M));
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
            boolean z;
            j jVar = (j) bVar;
            super.a(jVar, readableMap);
            if (readableMap.hasKey("activeOffsetXStart")) {
                jVar.f78785a = PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetXStart"));
                z = true;
            } else {
                z = false;
            }
            if (readableMap.hasKey("activeOffsetXEnd")) {
                jVar.f78786b = PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetXEnd"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXStart")) {
                jVar.u = PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetXStart"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXEnd")) {
                jVar.v = PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetXEnd"));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYStart")) {
                jVar.w = PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetYStart"));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYEnd")) {
                jVar.x = PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetYEnd"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYStart")) {
                jVar.y = PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetYStart"));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYEnd")) {
                jVar.z = PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetYEnd"));
                z = true;
            }
            if (readableMap.hasKey("minVelocity")) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("minVelocity"));
                jVar.C = pixelFromDIP * pixelFromDIP;
                z = true;
            }
            if (readableMap.hasKey("minVelocityX")) {
                jVar.A = PixelUtil.toPixelFromDIP(readableMap.getDouble("minVelocityX"));
                z = true;
            }
            if (readableMap.hasKey("minVelocityY")) {
                jVar.B = PixelUtil.toPixelFromDIP(readableMap.getDouble("minVelocityY"));
                z = true;
            }
            if (readableMap.hasKey("minDist")) {
                jVar.a(PixelUtil.toPixelFromDIP(readableMap.getDouble("minDist")));
            } else if (z) {
                jVar.a(Float.MAX_VALUE);
            }
            if (readableMap.hasKey("minPointers")) {
                jVar.D = readableMap.getInt("minPointers");
            }
            if (readableMap.hasKey("maxPointers")) {
                jVar.E = readableMap.getInt("maxPointers");
            }
            if (readableMap.hasKey("avgTouches")) {
                jVar.N = readableMap.getBoolean("avgTouches");
            }
        }
    }

    static class f extends b<k> {
        public final String b() {
            return "PinchGestureHandler";
        }

        public final Class<k> a() {
            return k.class;
        }

        private f() {
            super((byte) 0);
        }

        /* synthetic */ f(byte b2) {
            this();
        }

        public final /* synthetic */ com.swmansion.gesturehandler.b a(Context context) {
            return new k();
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            float f2;
            k kVar = (k) bVar;
            super.a(kVar, writableMap);
            writableMap.putDouble("scale", kVar.f78788b);
            float f3 = Float.NaN;
            if (kVar.f78787a == null) {
                f2 = Float.NaN;
            } else {
                f2 = kVar.f78787a.getFocusX();
            }
            writableMap.putDouble("focalX", (double) PixelUtil.toDIPFromPixel(f2));
            if (kVar.f78787a != null) {
                f3 = kVar.f78787a.getFocusY();
            }
            writableMap.putDouble("focalY", (double) PixelUtil.toDIPFromPixel(f3));
            writableMap.putDouble("velocity", kVar.u);
        }
    }

    static class g extends b<n> {
        public final String b() {
            return "RotationGestureHandler";
        }

        public final Class<n> a() {
            return n.class;
        }

        private g() {
            super((byte) 0);
        }

        /* synthetic */ g(byte b2) {
            this();
        }

        public final /* synthetic */ com.swmansion.gesturehandler.b a(Context context) {
            return new n();
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            float f2;
            n nVar = (n) bVar;
            super.a(nVar, writableMap);
            writableMap.putDouble("rotation", nVar.f78797b);
            float f3 = Float.NaN;
            if (nVar.f78796a == null) {
                f2 = Float.NaN;
            } else {
                f2 = nVar.f78796a.f78794e;
            }
            writableMap.putDouble("anchorX", (double) PixelUtil.toDIPFromPixel(f2));
            if (nVar.f78796a != null) {
                f3 = nVar.f78796a.f78795f;
            }
            writableMap.putDouble("anchorY", (double) PixelUtil.toDIPFromPixel(f3));
            writableMap.putDouble("velocity", nVar.u);
        }
    }

    static class h extends b<o> {
        public final String b() {
            return "TapGestureHandler";
        }

        public final Class<o> a() {
            return o.class;
        }

        private h() {
            super((byte) 0);
        }

        /* synthetic */ h(byte b2) {
            this();
        }

        public final /* synthetic */ com.swmansion.gesturehandler.b a(Context context) {
            return new o();
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, WritableMap writableMap) {
            o oVar = (o) bVar;
            super.a(oVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(oVar.j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(oVar.k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(oVar.l));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(oVar.m));
        }

        public final /* synthetic */ void a(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
            o oVar = (o) bVar;
            super.a(oVar, readableMap);
            if (readableMap.hasKey("numberOfTaps")) {
                oVar.x = readableMap.getInt("numberOfTaps");
            }
            if (readableMap.hasKey("maxDurationMs")) {
                oVar.v = (long) readableMap.getInt("maxDurationMs");
            }
            if (readableMap.hasKey("maxDelayMs")) {
                oVar.w = (long) readableMap.getInt("maxDelayMs");
            }
            if (readableMap.hasKey("maxDeltaX")) {
                oVar.f78799a = PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDeltaX"));
            }
            if (readableMap.hasKey("maxDeltaY")) {
                oVar.f78800b = PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDeltaY"));
            }
            if (readableMap.hasKey("maxDist")) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDist"));
                oVar.u = pixelFromDIP * pixelFromDIP;
            }
            if (readableMap.hasKey("minPointers")) {
                oVar.y = readableMap.getInt("minPointers");
            }
        }
    }

    public String getName() {
        return "RNGestureHandlerModule";
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    public f getRegistry() {
        return this.mRegistry;
    }

    @Nullable
    public Map getConstants() {
        return MapBuilder.of("State", MapBuilder.of("UNDETERMINED", 0, "BEGAN", 2, "ACTIVE", 4, "CANCELLED", 3, "FAILED", 1, "END", 5), "Direction", MapBuilder.of("RIGHT", 1, "LEFT", 2, "UP", 4, "DOWN", 8));
    }

    public void onCatalystInstanceDestroy() {
        this.mRegistry.a();
        d dVar = this.mInteractionManager;
        dVar.f78815a.clear();
        dVar.f78816b.clear();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                g gVar = this.mRoots.get(0);
                ReactRootView reactRootView = gVar.f78820a;
                if (reactRootView instanceof a) {
                    a aVar = (a) reactRootView;
                    if (aVar.f78812b != null) {
                        aVar.f78812b.a();
                        aVar.f78812b = null;
                    }
                } else {
                    gVar.a();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    @ReactMethod
    public void dropGestureHandler(int i) {
        this.mInteractionManager.a(i);
        this.mRegistry.b(i);
    }

    public void unregisterRootHelper(g gVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(gVar);
        }
    }

    @Nullable
    private b findFactoryForHandler(com.swmansion.gesturehandler.b bVar) {
        for (b bVar2 : this.mHandlerFactories) {
            if (bVar2.a().equals(bVar.getClass())) {
                return bVar2;
            }
        }
        return null;
    }

    @Nullable
    private g findRootHelperForViewAncestor(int i) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag <= 0) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                g gVar = this.mRoots.get(i2);
                if (gVar.f78820a.getRootViewTag() == resolveRootTagFromReactTag) {
                    return gVar;
                }
            }
            return null;
        }
    }

    public void registerRootHelper(g gVar) {
        synchronized (this.mRoots) {
            if (!this.mRoots.contains(gVar)) {
                this.mRoots.add(gVar);
            } else {
                throw new IllegalStateException("Root helper" + gVar + " already registered");
            }
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r5 = r4.mEnqueuedRootViewInit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r4.mEnqueuedRootViewInit.contains(java.lang.Integer.valueOf(r1)) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r4.mEnqueuedRootViewInit.add(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0.addUIBlock(new com.swmansion.gesturehandler.react.RNGestureHandlerModule.AnonymousClass2(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryInitializeHandlerForReactRootView(int r5) {
        /*
            r4 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r4.getReactApplicationContext()
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r1 = com.facebook.react.uimanager.UIManagerModule.class
            com.facebook.react.bridge.NativeModule r0 = r0.getNativeModule(r1)
            com.facebook.react.uimanager.UIManagerModule r0 = (com.facebook.react.uimanager.UIManagerModule) r0
            int r1 = r0.resolveRootTagFromReactTag(r5)
            if (r1 <= 0) goto L_0x005e
            java.util.List<com.swmansion.gesturehandler.react.g> r2 = r4.mRoots
            monitor-enter(r2)
            r5 = 0
        L_0x0016:
            java.util.List<com.swmansion.gesturehandler.react.g> r3 = r4.mRoots     // Catch:{ all -> 0x005b }
            int r3 = r3.size()     // Catch:{ all -> 0x005b }
            if (r5 >= r3) goto L_0x0033
            java.util.List<com.swmansion.gesturehandler.react.g> r3 = r4.mRoots     // Catch:{ all -> 0x005b }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x005b }
            com.swmansion.gesturehandler.react.g r3 = (com.swmansion.gesturehandler.react.g) r3     // Catch:{ all -> 0x005b }
            com.facebook.react.ReactRootView r3 = r3.f78820a     // Catch:{ all -> 0x005b }
            int r3 = r3.getRootViewTag()     // Catch:{ all -> 0x005b }
            if (r3 != r1) goto L_0x0030
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            return
        L_0x0030:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            java.util.List<java.lang.Integer> r5 = r4.mEnqueuedRootViewInit
            monitor-enter(r5)
            java.util.List<java.lang.Integer> r2 = r4.mEnqueuedRootViewInit     // Catch:{ all -> 0x0058 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0058 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0045
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            return
        L_0x0045:
            java.util.List<java.lang.Integer> r2 = r4.mEnqueuedRootViewInit     // Catch:{ all -> 0x0058 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0058 }
            r2.add(r3)     // Catch:{ all -> 0x0058 }
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            com.swmansion.gesturehandler.react.RNGestureHandlerModule$2 r5 = new com.swmansion.gesturehandler.react.RNGestureHandlerModule$2
            r5.<init>(r1)
            r0.addUIBlock(r5)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x005b:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            throw r5
        L_0x005e:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could find root view for a given ancestor with tag "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.tryInitializeHandlerForReactRootView(int):void");
    }

    @ReactMethod
    public void handleSetJSResponder(int i, boolean z) {
        if (this.mRegistry != null) {
            g findRootHelperForViewAncestor = findRootHelperForViewAncestor(i);
            if (findRootHelperForViewAncestor != null && z) {
                UiThreadUtil.runOnUiThread(new Runnable() {
                    public final void run() {
                        g.this.c();
                    }
                });
            }
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i, ReadableMap readableMap) {
        com.swmansion.gesturehandler.b a2 = this.mRegistry.a(i);
        if (a2 != null) {
            b findFactoryForHandler = findFactoryForHandler(a2);
            if (findFactoryForHandler != null) {
                this.mInteractionManager.a(i);
                this.mInteractionManager.a(a2, readableMap);
                findFactoryForHandler.a(a2, readableMap);
            }
        }
    }

    @ReactMethod
    public void attachGestureHandler(int i, int i2) {
        tryInitializeHandlerForReactRootView(i2);
        if (!this.mRegistry.a(i, i2)) {
            throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
        }
    }

    public void onTouchEvent(com.swmansion.gesturehandler.b bVar, MotionEvent motionEvent) {
        if (bVar.f78772e >= 0 && bVar.g == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(b.a(bVar, findFactoryForHandler(bVar)));
        }
    }

    public static void handleHitSlopProperty(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (readableMap.getType("hitSlop") == ReadableType.Number) {
            float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("hitSlop"));
            bVar.a(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap("hitSlop");
        if (map.hasKey("horizontal")) {
            f3 = PixelUtil.toPixelFromDIP(map.getDouble("horizontal"));
            f2 = f3;
        } else {
            f3 = Float.NaN;
            f2 = Float.NaN;
        }
        if (map.hasKey("vertical")) {
            f5 = PixelUtil.toPixelFromDIP(map.getDouble("vertical"));
            f4 = f5;
        } else {
            f5 = Float.NaN;
            f4 = Float.NaN;
        }
        if (map.hasKey("left")) {
            f3 = PixelUtil.toPixelFromDIP(map.getDouble("left"));
        }
        float f8 = f3;
        if (map.hasKey("top")) {
            f5 = PixelUtil.toPixelFromDIP(map.getDouble("top"));
        }
        float f9 = f5;
        if (map.hasKey("right")) {
            f2 = PixelUtil.toPixelFromDIP(map.getDouble("right"));
        }
        float f10 = f2;
        if (map.hasKey("bottom")) {
            f4 = PixelUtil.toPixelFromDIP(map.getDouble("bottom"));
        }
        float f11 = f4;
        if (map.hasKey("width")) {
            f6 = PixelUtil.toPixelFromDIP(map.getDouble("width"));
        } else {
            f6 = Float.NaN;
        }
        if (map.hasKey("height")) {
            f7 = PixelUtil.toPixelFromDIP(map.getDouble("height"));
        } else {
            f7 = Float.NaN;
        }
        bVar.a(f8, f9, f10, f11, f6, f7);
    }

    public void onStateChange(com.swmansion.gesturehandler.b bVar, int i, int i2) {
        if (bVar.f78772e >= 0) {
            b findFactoryForHandler = findFactoryForHandler(bVar);
            EventDispatcher eventDispatcher = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher();
            i iVar = (i) i.f78829a.acquire();
            if (iVar == null) {
                iVar = new i();
            }
            iVar.a(bVar, i, i2, findFactoryForHandler);
            eventDispatcher.dispatchEvent(iVar);
        }
    }

    @ReactMethod
    public void createGestureHandler(String str, int i, ReadableMap readableMap) {
        for (b bVar : this.mHandlerFactories) {
            if (bVar.b().equals(str)) {
                com.swmansion.gesturehandler.b a2 = bVar.a(getReactApplicationContext());
                a2.f78772e = i;
                a2.p = this.mEventListener;
                this.mRegistry.a(a2);
                this.mInteractionManager.a(a2, readableMap);
                bVar.a(a2, readableMap);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
    }
}
