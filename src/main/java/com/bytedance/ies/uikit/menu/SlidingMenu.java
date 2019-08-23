package com.bytedance.ies.uikit.menu;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.uikit.menu.CustomViewAbove;
import com.bytedance.ugc.uikit.R$styleable;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.bytex.a.a.a;

public class SlidingMenu extends RelativeLayout {
    static boolean DEBUG;
    private boolean mActionbarOverlay;
    protected int mActivePointerId;
    private OnClickCloseListener mClickCloseListener;
    public OnCloseListener mCloseListener;
    private boolean mEnabled;
    private int mFlingDistance;
    private Handler mHandler;
    private boolean mIgnoreContentsBackground;
    private float mInitialMotionX;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private float mLastMotionX;
    private float mLastMotionY;
    protected int mMaximumVelocity;
    private int mMinimumVelocity;
    public OnOpenListener mOpenListener;
    private boolean mQuickReturn;
    private int mTouchSlop;
    protected VelocityTracker mVelocityTracker;
    private CustomViewAbove mViewAbove;
    private CustomViewBehind mViewBehind;

    public interface CanvasTransformer {
        void transformCanvas(Canvas canvas, float f2);
    }

    public interface OnClickCloseListener {
        void onClickClose();
    }

    public interface OnCloseListener {
        void onClose();
    }

    public interface OnClosedListener {
        void onClosed();
    }

    public interface OnOpenListener {
        void onOpen();
    }

    public interface OnOpenedListener {
        void onOpened();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        private final int mItem;

        public int getItem() {
            return this.mItem;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mItem = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.mItem = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mItem);
        }
    }

    private void startDrag() {
        this.mIsBeingDragged = true;
        this.mQuickReturn = false;
    }

    public void clearIgnoredViews() {
        this.mViewAbove.clearIgnoredViews();
    }

    public float getBehindScrollScale() {
        return this.mViewBehind.getScrollScale();
    }

    public View getContent() {
        return this.mViewAbove.getContent();
    }

    public int getCurrentItem() {
        return this.mViewAbove.getCurrentItem();
    }

    public View getMenu() {
        return this.mViewBehind.getContent();
    }

    public int getMode() {
        return this.mViewBehind.getMode();
    }

    public View getSecondaryMenu() {
        return this.mViewBehind.getSecondaryContent();
    }

    public int getTouchModeAbove() {
        return this.mViewAbove.getTouchMode();
    }

    public boolean isMenuOpen() {
        return this.mViewAbove.isMenuOpen();
    }

    public boolean isSlidingEnabled() {
        return this.mViewAbove.isSlidingEnabled();
    }

    public void showContent() {
        showContent(true);
    }

    public void showMenu() {
        showMenu(true);
    }

    public void showSecondaryMenu() {
        showSecondaryMenu(true);
    }

    public void toggle() {
        toggle(true);
    }

    public int getBehindOffset() {
        return ((RelativeLayout.LayoutParams) this.mViewBehind.getLayoutParams()).rightMargin;
    }

    public boolean isSecondaryMenuShowing() {
        if (this.mViewAbove.getCurrentItem() == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.mViewAbove.getCurrentItem());
    }

    private void endDrag() {
        this.mQuickReturn = false;
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        this.mActivePointerId = -1;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public boolean isMenuShowing() {
        if (this.mViewAbove.getCurrentItem() == 0 || this.mViewAbove.getCurrentItem() == 2) {
            return true;
        }
        return false;
    }

    public void setIgnoreContentsBackground(boolean z) {
        this.mIgnoreContentsBackground = z;
    }

    public void setOnClickCloseListener(OnClickCloseListener onClickCloseListener) {
        this.mClickCloseListener = onClickCloseListener;
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.mCloseListener = onCloseListener;
    }

    public void setOnOpenListener(OnOpenListener onOpenListener) {
        this.mOpenListener = onOpenListener;
    }

    public void addIgnoredView(View view) {
        this.mViewAbove.addIgnoredView(view);
    }

    public void removeIgnoredView(View view) {
        this.mViewAbove.removeIgnoredView(view);
    }

    public void setAboveOffset(int i) {
        this.mViewAbove.setAboveOffset(i);
    }

    public void setBehindCanvasTransformer(CanvasTransformer canvasTransformer) {
        this.mViewBehind.setCanvasTransformer(canvasTransformer);
    }

    public void setBehindOffset(int i) {
        this.mViewBehind.setWidthOffset(i);
    }

    public void setFadeDegree(float f2) {
        this.mViewBehind.setFadeDegree(f2);
    }

    public void setFadeEnabled(boolean z) {
        this.mViewBehind.setFadeEnabled(z);
    }

    public void setMenu(View view) {
        this.mViewBehind.setContent(view);
    }

    public void setOnClosedListener(OnClosedListener onClosedListener) {
        this.mViewAbove.setOnClosedListener(onClosedListener);
    }

    public void setOnOpenedListener(OnOpenedListener onOpenedListener) {
        this.mViewAbove.setOnOpenedListener(onOpenedListener);
    }

    public void setRightBehindOffset(int i) {
        this.mViewBehind.setSecondaryWidthOffset(i);
    }

    public void setSecondaryMenu(View view) {
        this.mViewBehind.setSecondaryContent(view);
    }

    public void setSecondaryShadowDrawable(Drawable drawable) {
        this.mViewBehind.setSecondaryShadowDrawable(drawable);
    }

    public void setSelectedView(View view) {
        this.mViewBehind.setSelectedView(view);
    }

    public void setSelectorBitmap(Bitmap bitmap) {
        this.mViewBehind.setSelectorBitmap(bitmap);
    }

    public void setSelectorEnabled(boolean z) {
        this.mViewBehind.setSelectorEnabled(true);
    }

    public void setShadowDrawable(Drawable drawable) {
        this.mViewBehind.setShadowDrawable(drawable);
    }

    public void setShadowWidth(int i) {
        this.mViewBehind.setShadowWidth(i);
    }

    public void setSlidingEnabled(boolean z) {
        this.mEnabled = z;
        this.mViewAbove.setSlidingEnabled(z);
    }

    public SlidingMenu(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setContent(View view) {
        this.mViewAbove.setContent(view);
        showContent();
    }

    public void setSecondaryShadowDrawable(int i) {
        setSecondaryShadowDrawable(a.a(getContext().getResources(), i));
    }

    public void setSelectorDrawable(int i) {
        this.mViewBehind.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    public void setShadowDrawable(int i) {
        setShadowDrawable(a.a(getContext().getResources(), i));
    }

    public void setShadowWidthRes(int i) {
        setShadowWidth((int) getResources().getDimension(i));
    }

    public void showContent(boolean z) {
        this.mViewAbove.setCurrentItem(1, z);
    }

    public void showMenu(boolean z) {
        this.mViewAbove.setCurrentItem(0, z);
    }

    public void showSecondaryMenu(boolean z) {
        this.mViewAbove.setCurrentItem(2, z);
    }

    public void toggle(boolean z) {
        if (isMenuShowing()) {
            showContent(z);
        } else {
            showMenu(z);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public boolean fitSystemWindows(Rect rect) {
        int i = rect.left;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        if (!this.mActionbarOverlay) {
            setPadding(i, i3, i2, i4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mViewAbove.setCurrentItem(savedState.getItem());
    }

    public void setAboveOffsetRes(int i) {
        setAboveOffset((int) getContext().getResources().getDimension(i));
    }

    public void setBehindOffsetRes(int i) {
        setBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public void setBehindScrollScale(float f2) {
        if (f2 >= 0.0f || f2 <= 1.0f) {
            this.mViewBehind.setScrollScale(f2);
            return;
        }
        throw new IllegalStateException("ScrollScale must be between 0 and 1");
    }

    public void setBehindWidthRes(int i) {
        setBehindWidth((int) getContext().getResources().getDimension(i));
    }

    public void setContent(int i) {
        setContent(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setMenu(int i) {
        setMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setMode(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.mViewBehind.setMode(i);
            return;
        }
        throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
    }

    public void setRightBehindOffsetRes(int i) {
        setRightBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public void setSecondaryMenu(int i) {
        setSecondaryMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public void setTouchModeAbove(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.mViewAbove.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    public void setTouchModeBehind(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.mViewBehind.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionX = MotionEventCompat.getX(motionEvent, i);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }

    @TargetApi(11)
    public void manageLayers(float f2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 11) {
            final int i = 0;
            if (f2 <= 0.0f || f2 >= 1.0f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = 2;
            }
            if (i != getContent().getLayerType()) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        boolean z;
                        StringBuilder sb = new StringBuilder("changing layerType. hardware? ");
                        if (i == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        SlidingMenu.this.getContent().setLayerType(i, null);
                        SlidingMenu.this.getMenu().setLayerType(i, null);
                        if (SlidingMenu.this.getSecondaryMenu() != null) {
                            SlidingMenu.this.getSecondaryMenu().setLayerType(i, null);
                        }
                    }
                });
            }
        }
    }

    public void setBehindWidth(int i) {
        int i2;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Class<Display> cls = Display.class;
        try {
            Point point = new Point();
            cls.getMethod("getSize", new Class[]{Point.class}).invoke(defaultDisplay, new Object[]{point});
            i2 = point.x;
        } catch (Exception unused) {
            i2 = defaultDisplay.getWidth();
        }
        setBehindOffset(i2 - i);
    }

    public void setStatic(boolean z) {
        if (z) {
            setSlidingEnabled(false);
            this.mViewAbove.setCustomViewBehind(null);
            this.mViewAbove.setCurrentItem(1);
            return;
        }
        this.mViewAbove.setCurrentItem(1);
        this.mViewAbove.setCustomViewBehind(this.mViewBehind);
        setSlidingEnabled(true);
    }

    private void determineDrag(MotionEvent motionEvent) {
        int i;
        int i2 = this.mActivePointerId;
        int pointerIndex = getPointerIndex(motionEvent, i2);
        if (i2 != -1) {
            float x = MotionEventCompat.getX(motionEvent, pointerIndex);
            float f2 = x - this.mLastMotionX;
            float abs = Math.abs(f2);
            float y = MotionEventCompat.getY(motionEvent, pointerIndex);
            float abs2 = Math.abs(y - this.mLastMotionY);
            if (isMenuOpen()) {
                i = this.mTouchSlop / 2;
            } else {
                i = this.mTouchSlop;
            }
            if (abs <= ((float) i) || abs <= abs2 || !this.mViewAbove.thisSlideAllowed(f2)) {
                if (abs > ((float) this.mTouchSlop)) {
                    this.mIsUnableToDrag = true;
                }
                return;
            }
            startDrag();
            this.mLastMotionX = x;
            this.mLastMotionY = y;
            this.mViewAbove.setScrollingCacheEnabled(true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mEnabled) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1 || (action != 0 && this.mIsUnableToDrag)) {
            endDrag();
            return false;
        }
        if (action == 0) {
            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
            if (this.mActivePointerId != -1) {
                float x = MotionEventCompat.getX(motionEvent, actionIndex);
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                if (this.mViewAbove.thisTouchAllowed(motionEvent)) {
                    this.mIsBeingDragged = false;
                    this.mIsUnableToDrag = false;
                    this.mQuickReturn = false;
                    if (isMenuOpen() && this.mViewAbove.menuTouchInQuickReturn(motionEvent)) {
                        this.mQuickReturn = true;
                    }
                } else {
                    this.mIsUnableToDrag = true;
                }
            }
        } else if (action == 2) {
            determineDrag(motionEvent);
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (!this.mIsBeingDragged) {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
        }
        if (this.mIsBeingDragged || this.mQuickReturn) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mEnabled) {
            return false;
        }
        if (!this.mIsBeingDragged && !this.mViewAbove.thisTouchAllowed(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        switch (action & 255) {
            case 0:
                this.mViewAbove.completeScroll();
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                break;
            case 1:
                if (!this.mIsBeingDragged) {
                    if (this.mQuickReturn && this.mViewAbove.menuTouchInQuickReturn(motionEvent)) {
                        if (this.mClickCloseListener != null) {
                            this.mClickCloseListener.onClickClose();
                        }
                        this.mViewAbove.setCurrentItem(1);
                        endDrag();
                        break;
                    }
                } else {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) this.mMaximumVelocity);
                    int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
                    float scrollX = ((float) (this.mViewAbove.getScrollX() - this.mViewAbove.getDestScrollX())) / ((float) this.mViewBehind.getBehindWidth());
                    int pointerIndex = getPointerIndex(motionEvent, this.mActivePointerId);
                    if (this.mActivePointerId != -1) {
                        this.mViewAbove.setCurrentItemInternal(determineTargetPage(scrollX, xVelocity, (int) (MotionEventCompat.getX(motionEvent, pointerIndex) - this.mInitialMotionX)), true, true, xVelocity);
                    } else {
                        this.mViewAbove.setCurrentItemInternal(this.mViewAbove.getCurrentItem(), true, true, xVelocity);
                    }
                    this.mActivePointerId = -1;
                    endDrag();
                    break;
                }
            case 2:
                if (!this.mIsBeingDragged) {
                    determineDrag(motionEvent);
                    if (this.mIsUnableToDrag) {
                        return false;
                    }
                }
                if (this.mIsBeingDragged) {
                    int pointerIndex2 = getPointerIndex(motionEvent, this.mActivePointerId);
                    if (this.mActivePointerId != -1) {
                        float x2 = MotionEventCompat.getX(motionEvent, pointerIndex2);
                        float f2 = this.mLastMotionX - x2;
                        this.mLastMotionX = x2;
                        float scrollX2 = ((float) this.mViewAbove.getScrollX()) + f2;
                        float leftBound = (float) this.mViewAbove.getLeftBound();
                        float rightBound = (float) this.mViewAbove.getRightBound();
                        if (scrollX2 < leftBound) {
                            scrollX2 = leftBound;
                        } else if (scrollX2 > rightBound) {
                            scrollX2 = rightBound;
                        }
                        int i = (int) scrollX2;
                        this.mLastMotionX += scrollX2 - ((float) i);
                        this.mViewAbove.scrollTo(i, getScrollY());
                        this.mViewAbove.pageScrolled(i);
                        break;
                    }
                }
                break;
            case 3:
                if (this.mIsBeingDragged) {
                    this.mViewAbove.setCurrentItemInternal(this.mViewAbove.getCurrentItem(), true, true);
                    this.mActivePointerId = -1;
                    endDrag();
                    break;
                }
                break;
            case 5:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                break;
            case 6:
                onSecondaryPointerUp(motionEvent);
                int pointerIndex3 = getPointerIndex(motionEvent, this.mActivePointerId);
                if (this.mActivePointerId != -1) {
                    this.mLastMotionX = MotionEventCompat.getX(motionEvent, pointerIndex3);
                    break;
                }
                break;
        }
        return true;
    }

    public SlidingMenu(Activity activity, int i) {
        this((Context) activity, (AttributeSet) null);
        attachToActivity(activity, i);
    }

    public void attachToActivity(Activity activity, int i) {
        attachToActivity(activity, i, false);
    }

    private int getPointerIndex(MotionEvent motionEvent, int i) {
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex == -1) {
            this.mActivePointerId = -1;
        }
        return findPointerIndex;
    }

    public SlidingMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int determineTargetPage(float f2, int i, int i2) {
        int currentItem = this.mViewAbove.getCurrentItem();
        if (Math.abs(i2) <= this.mFlingDistance || Math.abs(i) <= this.mMinimumVelocity) {
            return Math.round(((float) currentItem) + f2);
        }
        if (i > 0 && i2 > 0) {
            return currentItem - 1;
        }
        if (i >= 0 || i2 >= 0) {
            return currentItem;
        }
        return currentItem + 1;
    }

    public void attachToActivity(Activity activity, int i, boolean z) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("slideStyle must be either SLIDING_WINDOW or SLIDING_CONTENT");
        } else if (getParent() == null) {
            TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842836});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            switch (i) {
                case 0:
                    this.mActionbarOverlay = false;
                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
                    if (!this.mIgnoreContentsBackground) {
                        viewGroup2.setBackgroundResource(resourceId);
                    } else if (this.mIgnoreContentsBackground) {
                        ViewGroup viewGroup3 = (ViewGroup) activity.findViewById(16908290);
                        int childCount = viewGroup2.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = viewGroup2.getChildAt(i2);
                            if (childAt != viewGroup3 && !(childAt instanceof ViewStub) && childAt.getBackground() == null) {
                                childAt.setBackgroundResource(resourceId);
                            }
                        }
                    }
                    viewGroup.removeView(viewGroup2);
                    viewGroup.addView(this);
                    setContent((View) viewGroup2);
                    return;
                case 1:
                    this.mActionbarOverlay = z;
                    ViewGroup viewGroup4 = (ViewGroup) activity.findViewById(16908290);
                    View childAt2 = viewGroup4.getChildAt(0);
                    viewGroup4.removeView(childAt2);
                    viewGroup4.addView(this);
                    setContent(childAt2);
                    if (childAt2.getBackground() == null && !this.mIgnoreContentsBackground) {
                        childAt2.setBackgroundResource(resourceId);
                        break;
                    }
            }
        } else {
            throw new IllegalStateException("This SlidingMenu appears to already be attached");
        }
    }

    public SlidingMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler();
        this.mQuickReturn = false;
        this.mActivePointerId = -1;
        this.mEnabled = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFlingDistance = (int) (context.getResources().getDisplayMetrics().density * 25.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mViewBehind = new CustomViewBehind(context);
        addView(this.mViewBehind, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        this.mViewAbove = new CustomViewAbove(context);
        addView(this.mViewAbove, layoutParams2);
        this.mViewAbove.setCustomViewBehind(this.mViewBehind);
        this.mViewBehind.setCustomViewAbove(this.mViewAbove);
        this.mViewAbove.setOnPageChangeListener(new CustomViewAbove.OnPageChangeListener() {
            public void onPageScrolled(int i, float f2, int i2) {
            }

            public void onPageSelected(int i) {
                if (i != 0 || SlidingMenu.this.mOpenListener == null) {
                    if (i == 1 && SlidingMenu.this.mCloseListener != null) {
                        SlidingMenu.this.mCloseListener.onClose();
                    }
                    return;
                }
                SlidingMenu.this.mOpenListener.onOpen();
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SlidingMenu);
        setMode(obtainStyledAttributes.getInt(5, 0));
        int resourceId = obtainStyledAttributes.getResourceId(12, -1);
        if (resourceId != -1) {
            setContent(resourceId);
        } else {
            setContent((View) new FrameLayout(context));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, -1);
        if (resourceId2 != -1) {
            setMenu(resourceId2);
        } else {
            setMenu((View) new FrameLayout(context));
        }
        setTouchModeAbove(obtainStyledAttributes.getInt(10, 0));
        setTouchModeBehind(obtainStyledAttributes.getInt(11, 0));
        int dimension = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(2, -1.0f);
        if (dimension == -1 || dimension2 == -1) {
            if (dimension != -1) {
                setBehindOffset(dimension);
            } else if (dimension2 != -1) {
                setBehindWidth(dimension2);
            } else {
                setBehindOffset(0);
            }
            setBehindScrollScale(obtainStyledAttributes.getFloat(1, 0.33f));
            int resourceId3 = obtainStyledAttributes.getResourceId(8, -1);
            if (resourceId3 != -1) {
                setShadowDrawable(resourceId3);
            }
            setShadowWidth((int) obtainStyledAttributes.getDimension(9, 0.0f));
            setFadeEnabled(obtainStyledAttributes.getBoolean(4, true));
            setFadeDegree(obtainStyledAttributes.getFloat(3, 0.33f));
            setSelectorEnabled(obtainStyledAttributes.getBoolean(7, false));
            int resourceId4 = obtainStyledAttributes.getResourceId(6, -1);
            if (resourceId4 != -1) {
                setSelectorDrawable(resourceId4);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
    }
}
