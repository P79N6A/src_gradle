package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import javax.annotation.Nullable;

public class ReactRootView extends SizeMonitoringFrameLayout implements RootView, MeasureSpecProvider {
    private final ReactAndroidHWInputDeviceHelper mAndroidHWInputDeviceHelper;
    @Nullable
    private Bundle mAppProperties;
    @Nullable
    private CustomGlobalLayoutListener mCustomGlobalLayoutListener;
    private long mFirstDrawTime;
    private int mHeightMeasureSpec;
    public boolean mIsAttachedToInstance;
    private boolean mIsFabric;
    @Nullable
    private Runnable mJSEntryPoint;
    @Nullable
    private String mJSModuleName;
    private final JSTouchDispatcher mJSTouchDispatcher;
    @Nullable
    public ReactInstanceManager mReactInstanceManager;
    @Nullable
    private ReactRootViewEventListener mRootViewEventListener;
    private int mRootViewTag;
    private boolean mShouldLogContentAppeared;
    private long mStartLoadime;
    private boolean mWasMeasured;
    private int mWidthMeasureSpec;

    class CustomGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private int mDeviceRotation;
        private int mKeyboardHeight;
        private final int mMinKeyboardHeightDetected;
        private DisplayMetrics mScreenMetrics = new DisplayMetrics();
        private final Rect mVisibleViewArea;
        private DisplayMetrics mWindowMetrics = new DisplayMetrics();

        private void emitUpdateDimensionsEvent() {
            ((DeviceInfoModule) ReactRootView.this.mReactInstanceManager.getCurrentReactContext().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        private void checkForDeviceDimensionsChanges() {
            DisplayMetricsHolder.initDisplayMetrics(ReactRootView.this.getContext());
            if (!areMetricsEqual(this.mWindowMetrics, DisplayMetricsHolder.getWindowDisplayMetrics()) || !areMetricsEqual(this.mScreenMetrics, DisplayMetricsHolder.getScreenDisplayMetrics())) {
                this.mWindowMetrics.setTo(DisplayMetricsHolder.getWindowDisplayMetrics());
                this.mScreenMetrics.setTo(DisplayMetricsHolder.getScreenDisplayMetrics());
                emitUpdateDimensionsEvent();
            }
        }

        private void checkForDeviceOrientationChanges() {
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.mDeviceRotation != rotation) {
                this.mDeviceRotation = rotation;
                emitOrientationChanged(rotation);
            }
        }

        public void onGlobalLayout() {
            if (ReactRootView.this.mReactInstanceManager != null && ReactRootView.this.mIsAttachedToInstance && ReactRootView.this.mReactInstanceManager.getCurrentReactContext() != null) {
                checkForKeyboardEvents();
                checkForDeviceOrientationChanges();
                checkForDeviceDimensionsChanges();
            }
        }

        private void checkForKeyboardEvents() {
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
            int i = DisplayMetricsHolder.getWindowDisplayMetrics().heightPixels - this.mVisibleViewArea.bottom;
            if (this.mKeyboardHeight == i || i <= this.mMinKeyboardHeightDetected) {
                if (this.mKeyboardHeight != 0 && i <= this.mMinKeyboardHeightDetected) {
                    this.mKeyboardHeight = 0;
                    ReactRootView.this.sendEvent("keyboardDidHide", null);
                }
                return;
            }
            this.mKeyboardHeight = i;
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("screenY", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.bottom));
            createMap2.putDouble("screenX", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.left));
            createMap2.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mVisibleViewArea.width()));
            createMap2.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mKeyboardHeight));
            createMap.putMap("endCoordinates", createMap2);
            ReactRootView.this.sendEvent("keyboardDidShow", createMap);
        }

        CustomGlobalLayoutListener() {
            DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(ReactRootView.this.getContext().getApplicationContext());
            this.mVisibleViewArea = new Rect();
            this.mMinKeyboardHeightDetected = (int) PixelUtil.toPixelFromDIP(60.0f);
        }

        private void emitOrientationChanged(int i) {
            String str;
            double d2;
            double d3;
            boolean z = true;
            switch (i) {
                case 0:
                    str = "portrait-primary";
                    d3 = 0.0d;
                    break;
                case 1:
                    str = "landscape-primary";
                    d2 = -90.0d;
                    break;
                case 2:
                    str = "portrait-secondary";
                    d3 = 180.0d;
                    break;
                case 3:
                    str = "landscape-secondary";
                    d2 = 90.0d;
                    break;
                default:
                    return;
            }
            d2 = d3;
            z = false;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("name", str);
            createMap.putDouble("rotationDegrees", d2);
            createMap.putBoolean("isLandscape", z);
            ReactRootView.this.sendEvent("namedOrientationDidChange", createMap);
        }

        private boolean areMetricsEqual(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            if (Build.VERSION.SDK_INT >= 17) {
                return displayMetrics.equals(displayMetrics2);
            }
            if (displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi) {
                return true;
            }
            return false;
        }
    }

    public interface ReactRootViewEventListener {
        void onAttachedToReactInstance(ReactRootView reactRootView);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void simulateAttachForTesting() {
        this.mIsAttachedToInstance = true;
    }

    @Nullable
    public Bundle getAppProperties() {
        return this.mAppProperties;
    }

    @Nullable
    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactInstanceManager;
    }

    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    public boolean isFabric() {
        return this.mIsFabric;
    }

    private CustomGlobalLayoutListener getCustomGlobalLayoutListener() {
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new CustomGlobalLayoutListener();
        }
        return this.mCustomGlobalLayoutListener;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        a.a(!this.mIsAttachedToInstance, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    /* access modifiers changed from: package-private */
    public String getJSModuleName() {
        return (String) a.b(this.mJSModuleName);
    }

    /* access modifiers changed from: package-private */
    public void invokeJSEntryPoint() {
        if (this.mJSEntryPoint == null) {
            defaultJSEntryPoint();
        } else {
            this.mJSEntryPoint.run();
        }
    }

    public void onAttachedToReactInstance() {
        if (this.mRootViewEventListener != null) {
            this.mRootViewEventListener.onAttachedToReactInstance(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mIsAttachedToInstance) {
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    public void unmountReactApplication() {
        if (this.mReactInstanceManager != null && this.mIsAttachedToInstance) {
            this.mReactInstanceManager.detachRootView(this);
            this.mReactInstanceManager = null;
            this.mIsAttachedToInstance = false;
        }
        this.mShouldLogContentAppeared = false;
    }

    private void attachToReactInstanceManager() {
        com.facebook.e.a.a("attachToReactInstanceManager");
        try {
            if (!this.mIsAttachedToInstance) {
                this.mIsAttachedToInstance = true;
                ((ReactInstanceManager) a.b(this.mReactInstanceManager)).attachRootView(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                com.facebook.e.a.a();
            }
        } finally {
            com.facebook.e.a.a();
        }
    }

    private void enableLayoutCalculation() {
        if (this.mReactInstanceManager == null) {
            FLog.w("ReactNative", "Unable to enable layout calculation for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            ((UIManagerModule) currentReactContext.getCatalystInstance().getNativeModule(UIManagerModule.class)).getUIImplementation().enableLayoutCalculationForRootNode(getRootViewTag());
        }
    }

    public int getHeightMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().height <= 0) {
            return this.mHeightMeasureSpec;
        }
        return View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824);
    }

    public int getWidthMeasureSpec() {
        if (this.mWasMeasured || getLayoutParams() == null || getLayoutParams().width <= 0) {
            return this.mWidthMeasureSpec;
        }
        return View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsAttachedToInstance) {
            if (Build.VERSION.SDK_INT >= 16) {
                getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                return;
            }
            getViewTreeObserver().removeGlobalOnLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    public void setFirstDrawTime() {
        try {
            if (!(this.mReactInstanceManager == null || this.mReactInstanceManager.getCurrentReactContext() == null)) {
                CatalystInstance catalystInstance = this.mReactInstanceManager.getCurrentReactContext().getCatalystInstance();
                if (catalystInstance != null && catalystInstance.isFirstDrawn()) {
                    this.mFirstDrawTime = System.currentTimeMillis();
                    catalystInstance.startFirstDraw();
                    catalystInstance.setFirstDraw(this.mFirstDrawTime);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void setStartLoadime() {
        try {
            if (this.mStartLoadime == 0) {
                this.mStartLoadime = System.currentTimeMillis();
            }
            if (!(this.mReactInstanceManager == null || this.mReactInstanceManager.getCurrentReactContext() == null || this.mReactInstanceManager.getCurrentReactContext().getCatalystInstance() == null)) {
                this.mReactInstanceManager.getCurrentReactContext().getCatalystInstance().setStartLoad(this.mStartLoadime);
            }
        } catch (Exception unused) {
        }
    }

    private void defaultJSEntryPoint() {
        com.facebook.e.a.a("ReactRootView.runApplication");
        try {
            if (this.mReactInstanceManager != null) {
                if (this.mIsAttachedToInstance) {
                    ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
                    if (currentReactContext == null) {
                        com.facebook.e.a.a();
                        return;
                    }
                    CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", (double) getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    this.mShouldLogContentAppeared = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(getJSModuleName(), writableNativeMap);
                    com.facebook.e.a.a();
                }
            }
        } finally {
            com.facebook.e.a.a();
        }
    }

    public void setEventListener(ReactRootViewEventListener reactRootViewEventListener) {
        this.mRootViewEventListener = reactRootViewEventListener;
    }

    public void setIsFabric(boolean z) {
        this.mIsFabric = z;
    }

    public void setJSEntryPoint(Runnable runnable) {
        this.mJSEntryPoint = runnable;
    }

    public void setRootViewTag(int i) {
        this.mRootViewTag = i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e2) {
            handleException(e2);
        }
    }

    public void invokeDefaultJSEntryPoint(@Nullable Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        if (bundle != null) {
            this.mAppProperties = bundle;
        }
        defaultJSEntryPoint();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(@Nullable Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.mAppProperties = bundle;
        if (getRootViewTag() != 0) {
            invokeJSEntryPoint();
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.mShouldLogContentAppeared) {
            this.mShouldLogContentAppeared = false;
            if (this.mJSModuleName != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, this.mJSModuleName, this.mRootViewTag);
            }
        }
        setStartLoadime();
        setFirstDrawTime();
    }

    public ReactRootView(Context context) {
        super(context);
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mIsFabric = false;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
    }

    private void dispatchJSTouchEvent(MotionEvent motionEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            FLog.w("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        this.mJSTouchDispatcher.handleTouchEvent(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            FLog.w("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        this.mAndroidHWInputDeviceHelper.handleKeyEvent(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    public void handleException(Throwable th) {
        Exception exc;
        if (this.mReactInstanceManager == null || this.mReactInstanceManager.getCurrentReactContext() == null) {
            throw new RuntimeException(th);
        }
        if (th instanceof StackOverflowError) {
            exc = new IllegalViewOperationException("StackOverflowException", this, th);
        } else if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = new RuntimeException(th);
        }
        this.mReactInstanceManager.getCurrentReactContext().handleException(exc);
    }

    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            FLog.w("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str) {
        startReactApplication(reactInstanceManager, str, null);
    }

    /* access modifiers changed from: package-private */
    public void sendEvent(String str, @Nullable WritableMap writableMap) {
        if (this.mReactInstanceManager != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactInstanceManager.getCurrentReactContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    private void updateRootLayoutSpecs(int i, int i2) {
        if (this.mReactInstanceManager == null) {
            FLog.w("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            final ReactContext reactContext = currentReactContext;
            final int i3 = i;
            final int i4 = i2;
            AnonymousClass1 r1 = new GuardedRunnable(currentReactContext) {
                public void runGuarded() {
                    ((UIManagerModule) reactContext.getCatalystInstance().getNativeModule(UIManagerModule.class)).updateRootLayoutSpecs(ReactRootView.this.getRootViewTag(), i3, i4);
                }
            };
            currentReactContext.runOnLayoutThread(r1);
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            FLog.w("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
            return;
        }
        this.mAndroidHWInputDeviceHelper.onFocusChanged(view2);
        super.requestChildFocus(view, view2);
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mIsFabric = false;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047 A[Catch:{ all -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ all -> 0x0094 }, LOOP:1: B:18:0x0050->B:20:0x0056, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e A[Catch:{ all -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ReactRootView.onMeasure"
            com.facebook.e.a.a(r0)
            r6.mWidthMeasureSpec = r7     // Catch:{ all -> 0x0094 }
            r6.mHeightMeasureSpec = r8     // Catch:{ all -> 0x0094 }
            int r0 = android.view.View.MeasureSpec.getMode(r7)     // Catch:{ all -> 0x0094 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            if (r0 == r1) goto L_0x001a
            if (r0 != 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch:{ all -> 0x0094 }
            goto L_0x0041
        L_0x001a:
            r7 = 0
            r0 = 0
        L_0x001c:
            int r3 = r6.getChildCount()     // Catch:{ all -> 0x0094 }
            if (r7 >= r3) goto L_0x0040
            android.view.View r3 = r6.getChildAt(r7)     // Catch:{ all -> 0x0094 }
            int r4 = r3.getLeft()     // Catch:{ all -> 0x0094 }
            int r5 = r3.getMeasuredWidth()     // Catch:{ all -> 0x0094 }
            int r4 = r4 + r5
            int r5 = r3.getPaddingLeft()     // Catch:{ all -> 0x0094 }
            int r4 = r4 + r5
            int r3 = r3.getPaddingRight()     // Catch:{ all -> 0x0094 }
            int r4 = r4 + r3
            int r0 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x0094 }
            int r7 = r7 + 1
            goto L_0x001c
        L_0x0040:
            r7 = r0
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x0094 }
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x004a
            goto L_0x004f
        L_0x004a:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x0094 }
            goto L_0x0074
        L_0x004f:
            r8 = 0
        L_0x0050:
            int r0 = r6.getChildCount()     // Catch:{ all -> 0x0094 }
            if (r2 >= r0) goto L_0x0074
            android.view.View r0 = r6.getChildAt(r2)     // Catch:{ all -> 0x0094 }
            int r1 = r0.getTop()     // Catch:{ all -> 0x0094 }
            int r3 = r0.getMeasuredHeight()     // Catch:{ all -> 0x0094 }
            int r1 = r1 + r3
            int r3 = r0.getPaddingTop()     // Catch:{ all -> 0x0094 }
            int r1 = r1 + r3
            int r0 = r0.getPaddingBottom()     // Catch:{ all -> 0x0094 }
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r8, r1)     // Catch:{ all -> 0x0094 }
            int r2 = r2 + 1
            goto L_0x0050
        L_0x0074:
            r6.setMeasuredDimension(r7, r8)     // Catch:{ all -> 0x0094 }
            r7 = 1
            r6.mWasMeasured = r7     // Catch:{ all -> 0x0094 }
            com.facebook.react.ReactInstanceManager r7 = r6.mReactInstanceManager     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x0086
            boolean r7 = r6.mIsAttachedToInstance     // Catch:{ all -> 0x0094 }
            if (r7 != 0) goto L_0x0086
            r6.attachToReactInstanceManager()     // Catch:{ all -> 0x0094 }
            goto L_0x008d
        L_0x0086:
            int r7 = r6.mWidthMeasureSpec     // Catch:{ all -> 0x0094 }
            int r8 = r6.mHeightMeasureSpec     // Catch:{ all -> 0x0094 }
            r6.updateRootLayoutSpecs(r7, r8)     // Catch:{ all -> 0x0094 }
        L_0x008d:
            r6.enableLayoutCalculation()     // Catch:{ all -> 0x0094 }
            com.facebook.e.a.a()
            return
        L_0x0094:
            r7 = move-exception
            com.facebook.e.a.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactRootView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            FLog.w("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
            return;
        }
        this.mAndroidHWInputDeviceHelper.clearFocus();
        super.onFocusChanged(z, i, rect);
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle) {
        boolean z;
        com.facebook.e.a.a("startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            if (this.mReactInstanceManager == null) {
                z = true;
            } else {
                z = false;
            }
            a.a(z, "This root view has already been attached to a catalyst instance manager");
            this.mReactInstanceManager = reactInstanceManager;
            this.mJSModuleName = str;
            this.mAppProperties = bundle;
            if (!this.mReactInstanceManager.hasStartedCreatingInitialContext()) {
                this.mReactInstanceManager.createReactContextInBackground();
            }
            attachToReactInstanceManager();
            setStartLoadime();
        } finally {
            com.facebook.e.a.a();
        }
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mIsFabric = false;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
        this.mFirstDrawTime = 0;
        this.mStartLoadime = 0;
    }
}
