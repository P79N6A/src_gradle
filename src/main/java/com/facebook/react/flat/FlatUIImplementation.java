package com.facebook.react.flat;

import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.yoga.YogaDirection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class FlatUIImplementation extends UIImplementation {
    private static final Map<String, Class<? extends ViewManager>> flatManagerClassMap;
    private final boolean mMemoryImprovementEnabled;
    private final MoveProxy mMoveProxy = new MoveProxy();
    @Nullable
    private RCTImageViewManager mRCTImageViewManager;
    private final ReactApplicationContext mReactContext;
    private final StateBuilder mStateBuilder;

    public void updateViewHierarchy() {
        super.updateViewHierarchy();
        this.mStateBuilder.afterUpdateViewHierarchy(this.mEventDispatcher);
    }

    public ReactShadowNode createRootShadowNode() {
        if (this.mRCTImageViewManager != null) {
            this.mReactContext.getNativeModule(FrescoModule.class);
            DraweeRequestHelper.setDraweeControllerBuilder(this.mRCTImageViewManager.getDraweeControllerBuilder());
            this.mRCTImageViewManager = null;
        }
        FlatRootShadowNode flatRootShadowNode = new FlatRootShadowNode();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            flatRootShadowNode.setLayoutDirection(YogaDirection.RTL);
        }
        return flatRootShadowNode;
    }

    static {
        HashMap hashMap = new HashMap();
        flatManagerClassMap = hashMap;
        hashMap.put("RCTView", RCTViewManager.class);
        flatManagerClassMap.put("RCTText", RCTTextManager.class);
        flatManagerClassMap.put("RCTRawText", RCTRawTextManager.class);
        flatManagerClassMap.put("RCTVirtualText", RCTVirtualTextManager.class);
        flatManagerClassMap.put("RCTTextInlineImage", RCTTextInlineImageManager.class);
        flatManagerClassMap.put("RCTImageView", RCTImageViewManager.class);
        flatManagerClassMap.put("AndroidTextInput", RCTTextInputManager.class);
        flatManagerClassMap.put("AndroidViewPager", RCTViewPagerManager.class);
        flatManagerClassMap.put("ARTSurfaceView", FlatARTSurfaceViewManager.class);
        flatManagerClassMap.put("RCTModalHostView", RCTModalHostManager.class);
    }

    public void removeRootView(int i) {
        if (this.mMemoryImprovementEnabled) {
            removeRootShadowNode(i);
        }
        this.mStateBuilder.removeRootView(i);
    }

    private void ensureMountsToViewAndBackingViewIsCreated(int i) {
        FlatShadowNode flatShadowNode = (FlatShadowNode) resolveShadowNode(i);
        if (!flatShadowNode.isBackingViewCreated()) {
            flatShadowNode.forceMountToView();
            this.mStateBuilder.ensureBackingViewIsCreated(flatShadowNode);
        }
    }

    public ReactShadowNode createShadowNode(String str) {
        ReactShadowNode createShadowNode = super.createShadowNode(str);
        if ((createShadowNode instanceof FlatShadowNode) || createShadowNode.isVirtual()) {
            return createShadowNode;
        }
        return new NativeViewWrapper(resolveViewManager(str));
    }

    private static Map<String, ViewManager> buildViewManagerMap(List<ViewManager> list) {
        HashMap hashMap = new HashMap();
        for (ViewManager next : list) {
            hashMap.put(next.getName(), next);
        }
        for (Map.Entry next2 : flatManagerClassMap.entrySet()) {
            String str = (String) next2.getKey();
            ViewManager viewManager = (ViewManager) hashMap.get(str);
            if (viewManager != null) {
                Class<?> cls = (Class) next2.getValue();
                if (viewManager.getClass() != cls) {
                    try {
                        hashMap.put(str, cls.newInstance());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException("Unable to access flat class for " + str, e2);
                    } catch (InstantiationException e3) {
                        throw new RuntimeException("Unable to instantiate flat class for " + str, e3);
                    }
                }
            }
        }
        return hashMap;
    }

    private void moveChild(ReactShadowNode reactShadowNode, int i) {
        this.mMoveProxy.setChildMoveFrom(i, reactShadowNode);
    }

    private void removeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2) {
        dropNativeViews(reactShadowNode, reactShadowNode2);
        removeShadowNode(reactShadowNode);
    }

    public void measure(int i, Callback callback) {
        measureHelper(i, false, callback);
    }

    public void measureInWindow(int i, Callback callback) {
        measureHelper(i, true, callback);
    }

    public void sendAccessibilityEvent(int i, int i2) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.sendAccessibilityEvent(i, i2);
    }

    public void setChildren(int i, ReadableArray readableArray) {
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            addChildAt(resolveShadowNode, resolveShadowNode(readableArray.getInt(i2)), i2, i2 - 1);
        }
    }

    public void setJSResponder(int i, boolean z) {
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        while (resolveShadowNode.isVirtual()) {
            resolveShadowNode = resolveShadowNode.getParent();
        }
        int reactTag = resolveShadowNode.getReactTag();
        while ((resolveShadowNode instanceof FlatShadowNode) && !((FlatShadowNode) resolveShadowNode).mountsToView()) {
            resolveShadowNode = resolveShadowNode.getParent();
        }
        FlatUIViewOperationQueue operationsQueue = this.mStateBuilder.getOperationsQueue();
        if (resolveShadowNode != null) {
            reactTag = resolveShadowNode.getReactTag();
        }
        operationsQueue.enqueueSetJSResponder(reactTag, i, z);
    }

    private void dropNativeViews(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2) {
        if (reactShadowNode instanceof FlatShadowNode) {
            FlatShadowNode flatShadowNode = (FlatShadowNode) reactShadowNode;
            if (flatShadowNode.mountsToView() && flatShadowNode.isBackingViewCreated()) {
                int i = -1;
                while (true) {
                    if (reactShadowNode2 == null) {
                        break;
                    }
                    if (reactShadowNode2 instanceof FlatShadowNode) {
                        FlatShadowNode flatShadowNode2 = (FlatShadowNode) reactShadowNode2;
                        if (flatShadowNode2.mountsToView() && flatShadowNode2.isBackingViewCreated() && flatShadowNode2.getParent() != null) {
                            i = flatShadowNode2.getReactTag();
                            break;
                        }
                    }
                    reactShadowNode2 = reactShadowNode2.getParent();
                }
                this.mStateBuilder.dropView(flatShadowNode, i);
                return;
            }
        }
        int childCount = reactShadowNode.getChildCount();
        for (int i2 = 0; i2 != childCount; i2++) {
            dropNativeViews(reactShadowNode.getChildAt(i2), reactShadowNode);
        }
    }

    public void addAnimation(int i, int i2, Callback callback) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.addAnimation(i, i2, callback);
    }

    public void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f2, float f3) {
        this.mStateBuilder.applyUpdates((FlatRootShadowNode) reactShadowNode);
    }

    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        this.mStateBuilder.enqueueViewManagerCommand(i, i2, readableArray);
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, int i, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode instanceof FlatShadowNode) {
            FlatShadowNode flatShadowNode = (FlatShadowNode) reactShadowNode;
            if (reactStylesDiffMap != null) {
                flatShadowNode.handleUpdateProperties(reactStylesDiffMap);
            }
            if (flatShadowNode.mountsToView()) {
                this.mStateBuilder.enqueueCreateOrUpdateView(flatShadowNode, reactStylesDiffMap);
            }
            return;
        }
        super.handleCreateView(reactShadowNode, i, reactStylesDiffMap);
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode instanceof FlatShadowNode) {
            FlatShadowNode flatShadowNode = (FlatShadowNode) reactShadowNode;
            flatShadowNode.handleUpdateProperties(reactStylesDiffMap);
            if (flatShadowNode.mountsToView()) {
                this.mStateBuilder.enqueueCreateOrUpdateView(flatShadowNode, reactStylesDiffMap);
            }
            return;
        }
        super.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
    }

    private static ReactShadowNode removeChildAt(ReactShadowNode reactShadowNode, int i, int i2) {
        if (i < i2) {
            return reactShadowNode.removeChildAt(i);
        }
        throw new RuntimeException("Invariant failure, needs sorting! " + i + " >= " + i2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    private void addChildren(com.facebook.react.uimanager.ReactShadowNode r10, @javax.annotation.Nullable com.facebook.react.bridge.ReadableArray r11, @javax.annotation.Nullable com.facebook.react.bridge.ReadableArray r12) {
        /*
            r9 = this;
            com.facebook.react.flat.MoveProxy r0 = r9.mMoveProxy
            int r0 = r0.size()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != 0) goto L_0x0013
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x001b
        L_0x0013:
            com.facebook.react.flat.MoveProxy r0 = r9.mMoveProxy
            int r0 = r0.getMoveTo(r1)
            r3 = r0
            r0 = 0
        L_0x001b:
            r4 = -1
            if (r12 != 0) goto L_0x0026
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
        L_0x0022:
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002e
        L_0x0026:
            int r5 = r12.size()
            int r6 = r12.getInt(r1)
        L_0x002e:
            if (r6 >= r3) goto L_0x0049
            int r7 = r11.getInt(r1)
            com.facebook.react.uimanager.ReactShadowNode r7 = r9.resolveShadowNode(r7)
            addChildAt(r10, r7, r6, r4)
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0041
            r4 = r6
            goto L_0x0022
        L_0x0041:
            int r4 = r12.getInt(r1)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L_0x002e
        L_0x0049:
            if (r3 >= r6) goto L_0x006d
            com.facebook.react.flat.MoveProxy r7 = r9.mMoveProxy
            com.facebook.react.uimanager.ReactShadowNode r7 = r7.getChildMoveTo(r0)
            addChildAt(r10, r7, r3, r4)
            int r0 = r0 + 1
            com.facebook.react.flat.MoveProxy r4 = r9.mMoveProxy
            int r4 = r4.size()
            if (r0 != r4) goto L_0x0063
            r4 = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002e
        L_0x0063:
            com.facebook.react.flat.MoveProxy r4 = r9.mMoveProxy
            int r4 = r4.getMoveTo(r0)
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x002e
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.FlatUIImplementation.addChildren(com.facebook.react.uimanager.ReactShadowNode, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.facebook.react.uimanager.ReactShadowNodeImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void measureHelper(int r12, boolean r13, com.facebook.react.bridge.Callback r14) {
        /*
            r11 = this;
            com.facebook.react.uimanager.ReactShadowNode r1 = r11.resolveShadowNode(r12)
            com.facebook.react.flat.FlatShadowNode r1 = (com.facebook.react.flat.FlatShadowNode) r1
            boolean r2 = r1.mountsToView()
            if (r2 == 0) goto L_0x001b
            com.facebook.react.flat.StateBuilder r2 = r11.mStateBuilder
            r2.ensureBackingViewIsCreated(r1)
            if (r13 == 0) goto L_0x0017
            super.measureInWindow(r12, r14)
            return
        L_0x0017:
            super.measure(r12, r14)
            return
        L_0x001b:
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.isVirtual()
            if (r0 == 0) goto L_0x002b
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = r1.getParent()
            r1 = r0
            com.facebook.react.flat.FlatShadowNode r1 = (com.facebook.react.flat.FlatShadowNode) r1
            goto L_0x001b
        L_0x002b:
            if (r1 != 0) goto L_0x002e
            return
        L_0x002e:
            float r0 = r1.getLayoutWidth()
            float r2 = r1.getLayoutHeight()
            boolean r3 = r1.mountsToView()
            r4 = 0
            if (r3 == 0) goto L_0x0042
            float r5 = r1.getLayoutX()
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r3 == 0) goto L_0x0049
            float r4 = r1.getLayoutY()
        L_0x0049:
            boolean r3 = r1.mountsToView()
            if (r3 != 0) goto L_0x006c
            boolean r3 = r1.isVirtual()
            if (r3 != 0) goto L_0x005f
            float r3 = r1.getLayoutX()
            float r5 = r5 + r3
            float r3 = r1.getLayoutY()
            float r4 = r4 + r3
        L_0x005f:
            com.facebook.react.uimanager.ReactShadowNodeImpl r1 = r1.getParent()
            com.facebook.react.flat.FlatShadowNode r1 = (com.facebook.react.flat.FlatShadowNode) r1
            java.lang.Object r1 = com.facebook.infer.annotation.a.a(r1)
            com.facebook.react.flat.FlatShadowNode r1 = (com.facebook.react.flat.FlatShadowNode) r1
            goto L_0x0049
        L_0x006c:
            float r3 = r1.getLayoutWidth()
            float r8 = r1.getLayoutHeight()
            com.facebook.react.flat.StateBuilder r9 = r11.mStateBuilder
            com.facebook.react.flat.FlatUIViewOperationQueue r9 = r9.getOperationsQueue()
            int r1 = r1.getReactTag()
            float r5 = r5 / r3
            float r4 = r4 / r8
            float r10 = r0 / r3
            float r8 = r2 / r8
            r0 = r9
            r2 = r5
            r3 = r4
            r4 = r10
            r5 = r8
            r6 = r13
            r7 = r14
            r0.enqueueMeasureVirtualView(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.FlatUIImplementation.measureHelper(int, boolean, com.facebook.react.bridge.Callback):void");
    }

    public void findSubviewIn(int i, float f2, float f3, Callback callback) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.findSubviewIn(i, f2, f3, callback);
    }

    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        ensureMountsToViewAndBackingViewIsCreated(i);
        super.showPopupMenu(i, readableArray, callback, callback2);
    }

    private static void addChildAt(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i, int i2) {
        if (i > i2) {
            reactShadowNode.addChildAt(reactShadowNode2, i);
            return;
        }
        throw new RuntimeException("Invariant failure, needs sorting! " + i + " <= " + i2);
    }

    private void removeChildren(ReactShadowNode reactShadowNode, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.mMoveProxy.setup(readableArray, readableArray2);
        int size = this.mMoveProxy.size() - 1;
        if (size == -1) {
            i = -1;
        } else {
            i = this.mMoveProxy.getMoveFrom(size);
        }
        if (readableArray3 == null) {
            i2 = 0;
        } else {
            i2 = readableArray3.size();
        }
        int[] iArr = new int[i2];
        if (i2 > 0) {
            a.b(readableArray3);
            for (int i7 = 0; i7 < i2; i7++) {
                iArr[i7] = readableArray3.getInt(i7);
            }
        }
        Arrays.sort(iArr);
        int i8 = Integer.MAX_VALUE;
        if (readableArray3 == null) {
            i3 = -1;
            i4 = -1;
        } else {
            i3 = iArr.length - 1;
            i4 = iArr[i3];
        }
        while (true) {
            if (i > i4) {
                moveChild(removeChildAt(reactShadowNode, i, i8), size);
                size--;
                if (size == -1) {
                    i6 = -1;
                } else {
                    i6 = this.mMoveProxy.getMoveFrom(size);
                }
                int i9 = i6;
                i8 = i;
                i = i9;
            } else if (i4 > i) {
                removeChild(removeChildAt(reactShadowNode, i4, i8), reactShadowNode);
                i3--;
                if (i3 == -1) {
                    i5 = -1;
                } else {
                    i5 = iArr[i3];
                }
                int i10 = i4;
                i4 = i5;
                i8 = i10;
            } else {
                return;
            }
        }
    }

    public static FlatUIImplementation createInstance(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, boolean z, int i) {
        Map<String, ViewManager> buildViewManagerMap = buildViewManagerMap(list);
        RCTImageViewManager rCTImageViewManager = (RCTImageViewManager) buildViewManagerMap.get("RCTImageView");
        if (rCTImageViewManager != null) {
            Object callerContext = rCTImageViewManager.getCallerContext();
            if (callerContext != null) {
                RCTImageView.setCallerContext(callerContext);
            }
        }
        DraweeRequestHelper.setResources(reactApplicationContext.getResources());
        TypefaceCache.setAssetManager(reactApplicationContext.getAssets());
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(buildViewManagerMap);
        FlatUIImplementation flatUIImplementation = new FlatUIImplementation(reactApplicationContext, rCTImageViewManager, viewManagerRegistry, new FlatUIViewOperationQueue(reactApplicationContext, new FlatNativeViewHierarchyManager(viewManagerRegistry), i), eventDispatcher, z);
        return flatUIImplementation;
    }

    public void manageChildren(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        ReactShadowNode resolveShadowNode = resolveShadowNode(i);
        removeChildren(resolveShadowNode, readableArray, readableArray2, readableArray5);
        addChildren(resolveShadowNode, readableArray3, readableArray4);
    }

    private FlatUIImplementation(ReactApplicationContext reactApplicationContext, @Nullable RCTImageViewManager rCTImageViewManager, ViewManagerRegistry viewManagerRegistry, FlatUIViewOperationQueue flatUIViewOperationQueue, EventDispatcher eventDispatcher, boolean z) {
        super(reactApplicationContext, viewManagerRegistry, (UIViewOperationQueue) flatUIViewOperationQueue, eventDispatcher);
        this.mReactContext = reactApplicationContext;
        this.mRCTImageViewManager = rCTImageViewManager;
        this.mStateBuilder = new StateBuilder(flatUIViewOperationQueue);
        this.mMemoryImprovementEnabled = z;
    }
}
