package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.infer.annotation.a;
import com.facebook.react.animation.Animation;
import com.facebook.react.animation.AnimationListener;
import com.facebook.react.animation.AnimationRegistry;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class NativeViewHierarchyManager {
    private static final String TAG = "NativeViewHierarchyManager";
    public final AnimationRegistry mAnimationRegistry;
    private WeakReference<CatalystInstance> mCatalyInstance;
    private long mFirstScreenPaintedFinishTime;
    private final JSResponderHandler mJSResponderHandler;
    private boolean mLayoutAnimationEnabled;
    private final LayoutAnimationController mLayoutAnimator;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private int mScreenHigh;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final ViewManagerRegistry mViewManagers;

    static class PopupMenuCallbackHandler implements PopupMenu.OnDismissListener, PopupMenu.OnMenuItemClickListener {
        boolean mConsumed;
        final Callback mSuccess;

        private PopupMenuCallbackHandler(Callback callback) {
            this.mSuccess = callback;
        }

        public void onDismiss(PopupMenu popupMenu) {
            if (!this.mConsumed) {
                this.mSuccess.invoke("dismissed");
                this.mConsumed = true;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.mConsumed) {
                return false;
            }
            this.mSuccess.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.mConsumed = true;
            return true;
        }
    }

    public AnimationRegistry getAnimationRegistry() {
        return this.mAnimationRegistry;
    }

    public void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    /* access modifiers changed from: package-private */
    public void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    public void setCatalyInstance(WeakReference<CatalystInstance> weakReference) {
        this.mCatalyInstance = weakReference;
    }

    public void setLayoutAnimationEnabled(boolean z) {
        this.mLayoutAnimationEnabled = z;
    }

    /* access modifiers changed from: package-private */
    public void configureLayoutAnimation(ReadableMap readableMap) {
        this.mLayoutAnimator.initializeFromConfig(readableMap);
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        this(viewManagerRegistry, new RootViewManager());
    }

    private ThemedReactContext getReactContextForView(int i) {
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            return (ThemedReactContext) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public synchronized void removeRootView(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(i)) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
        }
        dropView(this.mTagsToViews.get(i));
        this.mRootTags.delete(i);
    }

    public final synchronized View resolveView(int i) {
        View view;
        view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i + " could not be found");
        }
        return viewManager;
    }

    /* access modifiers changed from: protected */
    public synchronized void dropView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(view.getId())) {
            resolveViewManager(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (this.mTagsToViews.get(childAt.getId()) != null) {
                    dropView(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.mTagsToViews.remove(view.getId());
        this.mTagsToViewManagers.remove(view.getId());
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, WeakReference<CatalystInstance> weakReference) {
        this(viewManagerRegistry, new RootViewManager(), weakReference);
    }

    private boolean arrayContains(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public synchronized void updateProperties(int i, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        try {
            resolveViewManager(i).updateProperties(resolveView(i), reactStylesDiffMap);
        } catch (IllegalViewOperationException unused) {
        }
    }

    public synchronized void updateViewExtraData(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        try {
            resolveViewManager(i).updateExtraData(resolveView(i), obj);
        } catch (IllegalViewOperationException unused) {
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mScreenHigh = 0;
        this.mFirstScreenPaintedFinishTime = 0;
        this.mAnimationRegistry = new AnimationRegistry();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
        this.mFirstScreenPaintedFinishTime = 0;
    }

    public void sendAccessibilityEvent(int i, int i2) {
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            AccessibilityHelper.sendAccessibilityEvent(view, i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public synchronized void measure(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            View view2 = (View) RootViewUtil.getRootView(view);
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                view.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
                iArr[2] = view.getWidth();
                iArr[3] = view.getHeight();
            } else {
                throw new NoSuchNativeViewException("Native view " + i + " is no longer on screen");
            }
        } else {
            throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
        }
    }

    public synchronized void measureInWindow(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Resources resources = view.getContext().getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
            }
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
        }
    }

    public synchronized void setChildren(int i, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
        ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        int i2 = 0;
        while (i2 < readableArray.size()) {
            View view = this.mTagsToViews.get(readableArray.getInt(i2));
            if (view != null) {
                viewGroupManager.addView(viewGroup, view, i2);
                i2++;
            } else {
                throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i2) + "\n detail: " + constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
            }
        }
    }

    public synchronized void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, ThemedReactContext themedReactContext) {
        addRootViewGroup(i, sizeMonitoringFrameLayout, themedReactContext);
    }

    private static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            viewAtIndexArr[i] = new ViewAtIndex(readableArray.getInt(i), i);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, viewAtIndexArr, null);
    }

    /* access modifiers changed from: protected */
    public final synchronized void addRootViewGroup(int i, ViewGroup viewGroup, ThemedReactContext themedReactContext) {
        if (viewGroup.getId() == -1) {
            this.mTagsToViews.put(i, viewGroup);
            this.mTagsToViewManagers.put(i, this.mRootViewManager);
            this.mRootTags.put(i, true);
            viewGroup.setId(i);
        } else {
            throw new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
    }

    public synchronized void dispatchCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            resolveViewManager(i).receiveCommand(view, i2, readableArray);
        } else {
            throw new IllegalViewOperationException("Trying to send command to a non-existing view with tag " + i);
        }
    }

    public synchronized int findTargetTagForTouch(int i, float f2, float f3) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.mTagsToViews.get(i);
        if (view != null) {
        } else {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return TouchTargetHelper.findTargetTagForTouch(f2, f3, (ViewGroup) view);
    }

    /* access modifiers changed from: package-private */
    public synchronized void startAnimationForNativeView(int i, Animation animation, @Nullable final Callback callback) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        final int animationID = animation.getAnimationID();
        if (view != null) {
            animation.setAnimationListener(new AnimationListener() {
                public void onCancel() {
                    a.a(NativeViewHierarchyManager.this.mAnimationRegistry.removeAnimation(animationID), "Animation was already removed somehow!");
                    if (callback != null) {
                        callback.invoke(Boolean.FALSE);
                    }
                }

                public void onFinished() {
                    a.a(NativeViewHierarchyManager.this.mAnimationRegistry.removeAnimation(animationID), "Animation was already removed somehow!");
                    if (callback != null) {
                        callback.invoke(Boolean.TRUE);
                    }
                }
            });
            animation.start(view);
        } else {
            throw new IllegalViewOperationException("View with tag " + i + " not found");
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager, WeakReference<CatalystInstance> weakReference) {
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mScreenHigh = 0;
        this.mFirstScreenPaintedFinishTime = 0;
        this.mCatalyInstance = weakReference;
        this.mAnimationRegistry = new AnimationRegistry();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
        this.mFirstScreenPaintedFinishTime = 0;
    }

    public synchronized void setJSResponder(int i, int i2, boolean z) {
        if (!z) {
            this.mJSResponderHandler.setJSResponder(i2, null);
            return;
        }
        View view = this.mTagsToViews.get(i);
        if (i2 == i || !(view instanceof ViewParent)) {
            if (this.mRootTags.get(i)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
            }
            this.mJSResponderHandler.setJSResponder(i2, view.getParent());
            return;
        }
        this.mJSResponderHandler.setJSResponder(i2, (ViewParent) view);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:1|2|3|4|(1:6)|8|9|(1:11)|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.facebook.e.a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0017 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032 A[Catch:{ all -> 0x0015 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void createView(com.facebook.react.uimanager.ThemedReactContext r2, int r3, java.lang.String r4, @javax.annotation.Nullable com.facebook.react.uimanager.ReactStylesDiffMap r5) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch:{ all -> 0x003e }
            int r0 = r1.mScreenHigh     // Catch:{ Throwable -> 0x0017 }
            if (r0 != 0) goto L_0x0017
            android.content.res.Resources r0 = r2.getResources()     // Catch:{ Throwable -> 0x0017 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Throwable -> 0x0017 }
            int r0 = r0.heightPixels     // Catch:{ Throwable -> 0x0017 }
            r1.mScreenHigh = r0     // Catch:{ Throwable -> 0x0017 }
            goto L_0x0017
        L_0x0015:
            r2 = move-exception
            goto L_0x003a
        L_0x0017:
            com.facebook.react.uimanager.ViewManagerRegistry r0 = r1.mViewManagers     // Catch:{ all -> 0x0015 }
            com.facebook.react.uimanager.ViewManager r4 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            com.facebook.react.touch.JSResponderHandler r0 = r1.mJSResponderHandler     // Catch:{ all -> 0x0015 }
            android.view.View r2 = r4.createView(r2, r0)     // Catch:{ all -> 0x0015 }
            android.util.SparseArray<android.view.View> r0 = r1.mTagsToViews     // Catch:{ all -> 0x0015 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0015 }
            android.util.SparseArray<com.facebook.react.uimanager.ViewManager> r0 = r1.mTagsToViewManagers     // Catch:{ all -> 0x0015 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0015 }
            r2.setId(r3)     // Catch:{ all -> 0x0015 }
            if (r5 == 0) goto L_0x0035
            r4.updateProperties(r2, r5)     // Catch:{ all -> 0x0015 }
        L_0x0035:
            com.facebook.e.a.a()     // Catch:{ all -> 0x003e }
            monitor-exit(r1)
            return
        L_0x003a:
            com.facebook.e.a.a()     // Catch:{ all -> 0x003e }
            throw r2     // Catch:{ all -> 0x003e }
        L_0x003e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.NativeViewHierarchyManager.createView(com.facebook.react.uimanager.ThemedReactContext, int, java.lang.String, com.facebook.react.uimanager.ReactStylesDiffMap):void");
    }

    public synchronized void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        PopupMenu popupMenu = new PopupMenu(getReactContextForView(i), view);
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        PopupMenuCallbackHandler popupMenuCallbackHandler = new PopupMenuCallbackHandler(callback);
        popupMenu.setOnMenuItemClickListener(popupMenuCallbackHandler);
        popupMenu.setOnDismissListener(popupMenuCallbackHandler);
        popupMenu.show();
    }

    public synchronized void manageChildren(int i, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) {
        UiThreadUtil.assertOnUiThread();
        final ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
        final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        if (viewGroup != null) {
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr != null) {
                int length = iArr.length - 1;
                while (length >= 0) {
                    int i2 = iArr[length];
                    if (i2 < 0) {
                        throw new IllegalViewOperationException("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    } else if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                        throw new IllegalViewOperationException("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    } else if (i2 < childCount) {
                        View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                            viewGroupManager.removeView(viewGroup, childAt);
                        } else {
                            viewGroupManager.markView(viewGroup, i2);
                        }
                        length--;
                        childCount = i2;
                    } else {
                        throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                }
            }
            int i3 = 0;
            if (viewAtIndexArr != null) {
                int i4 = 0;
                while (i4 < viewAtIndexArr.length) {
                    ViewAtIndex viewAtIndex = viewAtIndexArr[i4];
                    View view = this.mTagsToViews.get(viewAtIndex.mTag);
                    if (view != null) {
                        viewGroupManager.addView(viewGroup, view, viewAtIndex.mIndex);
                        i4++;
                    } else {
                        throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                }
            }
            if (iArr2 != null) {
                while (i3 < iArr2.length) {
                    final View view2 = this.mTagsToViews.get(iArr2[i3]);
                    if (view2 != null) {
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(view2)) {
                            dropView(view2);
                        } else {
                            this.mLayoutAnimator.deleteView(view2, new LayoutAnimationListener() {
                                public void onAnimationEnd() {
                                    viewGroupManager.removeView(viewGroup, view2);
                                    NativeViewHierarchyManager.this.dropView(view2);
                                }
                            });
                        }
                        i3++;
                    } else {
                        throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + r2 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                }
            }
        } else {
            throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
        }
    }

    private void updateLayout(View view, int i, int i2, int i3, int i4) {
        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(view)) {
            int i5 = i4 + i2;
            view.layout(i, i2, i3 + i, i5);
            if (this.mCatalyInstance != null) {
                ((CatalystInstance) this.mCatalyInstance.get()).updateLayout();
            }
            if (i5 >= this.mScreenHigh && this.mFirstScreenPaintedFinishTime == 0) {
                this.mFirstScreenPaintedFinishTime = System.currentTimeMillis();
                if (this.mCatalyInstance != null) {
                    ((CatalystInstance) this.mCatalyInstance.get()).setFirstScreenPaintFinished(this.mFirstScreenPaintedFinishTime);
                }
            }
            return;
        }
        this.mLayoutAnimator.applyLayoutUpdate(view, i, i2, i3, i4);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 >= viewGroupManager.getChildCount(viewGroup) || i2 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + ",");
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(iArr[i6] + ",");
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (viewAtIndexArr != null) {
            sb.append("  viewsToAdd(" + viewAtIndexArr.length + "): [\n");
            for (int i7 = 0; i7 < viewAtIndexArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= viewAtIndexArr.length || i8 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append("[" + viewAtIndexArr[i9].mIndex + "," + viewAtIndexArr[i9].mTag + "],");
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(iArr2[i12] + ",");
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    public synchronized void updateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        UiThreadUtil.assertOnUiThread();
        try {
            View resolveView = resolveView(i2);
            resolveView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            ViewParent parent = resolveView.getParent();
            if (parent instanceof RootView) {
                parent.requestLayout();
            }
            if (!this.mRootTags.get(i)) {
                ViewManager viewManager = this.mTagsToViewManagers.get(i);
                if (viewManager instanceof ViewGroupManager) {
                    ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                    if (viewGroupManager != null && !viewGroupManager.needsCustomLayoutForChildren()) {
                        updateLayout(resolveView, i3, i4, i5, i6);
                    }
                } else {
                    throw new IllegalViewOperationException("Trying to use view with tag " + i2 + " as a parent, but its Manager doesn't extends ViewGroupManager");
                }
            } else {
                updateLayout(resolveView, i3, i4, i5, i6);
            }
        } finally {
            com.facebook.e.a.a();
        }
    }
}
