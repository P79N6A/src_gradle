package com.bytedance.ies.uikit.menu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.ies.uikit.menu.SlidingMenu;
import java.util.ArrayList;
import java.util.List;

public class CustomViewAbove extends ViewGroup {
    private static final Interpolator sInterpolator = new Interpolator() {
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    protected int mActivePointerId;
    private SlidingMenu.OnClosedListener mClosedListener;
    private View mContent;
    private int mCurItem;
    private boolean mEnabled;
    private List<View> mIgnoredViews;
    private OnPageChangeListener mInternalPageChangeListener;
    private OnPageChangeListener mOnPageChangeListener;
    private SlidingMenu.OnOpenedListener mOpenedListener;
    private float mScrollX;
    private Scroller mScroller;
    private boolean mScrolling;
    private boolean mScrollingCacheEnabled;
    protected int mTouchMode;
    public CustomViewBehind mViewBehind;

    public interface OnPageChangeListener {
        void onPageScrolled(int i, float f2, int i2);

        void onPageSelected(int i);
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f2, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public View getContent() {
        return this.mContent;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getTouchMode() {
        return this.mTouchMode;
    }

    public boolean isSlidingEnabled() {
        return this.mEnabled;
    }

    public void clearIgnoredViews() {
        this.mIgnoredViews.clear();
    }

    public int getDestScrollX() {
        return getDestScrollX(this.mCurItem);
    }

    public int getBehindWidth() {
        if (this.mViewBehind == null) {
            return 0;
        }
        return this.mViewBehind.getBehindWidth();
    }

    public int getContentLeft() {
        return this.mContent.getLeft() + this.mContent.getPaddingLeft();
    }

    /* access modifiers changed from: package-private */
    public int getLeftBound() {
        return this.mViewBehind.getAbsLeftBound(this.mContent);
    }

    /* access modifiers changed from: package-private */
    public int getRightBound() {
        return this.mViewBehind.getAbsRightBound(this.mContent);
    }

    public boolean isMenuOpen() {
        if (this.mCurItem == 0 || this.mCurItem == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean pageLeft() {
        if (this.mCurItem <= 0) {
            return false;
        }
        setCurrentItem(this.mCurItem - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean pageRight() {
        if (this.mCurItem > 0) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public float getPercentOpen() {
        return Math.abs(this.mScrollX - ((float) this.mContent.getLeft())) / ((float) getBehindWidth());
    }

    public void computeScroll() {
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            pageScrolled(currX);
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void initCustomViewAbove() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.mScroller = new Scroller(getContext(), sInterpolator);
        setInternalPageChangeListener(new SimpleOnPageChangeListener() {
            public void onPageSelected(int i) {
                if (CustomViewAbove.this.mViewBehind != null) {
                    switch (i) {
                        case 0:
                        case 2:
                            CustomViewAbove.this.mViewBehind.setChildrenEnabled(true);
                            return;
                        case 1:
                            CustomViewAbove.this.mViewBehind.setChildrenEnabled(false);
                            break;
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void completeScroll() {
        if (this.mScrolling) {
            setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
            if (isMenuOpen()) {
                if (this.mOpenedListener != null) {
                    this.mOpenedListener.onOpened();
                }
            } else if (this.mClosedListener != null) {
                this.mClosedListener.onClosed();
            }
        }
        this.mScrolling = false;
    }

    public void setCustomViewBehind(CustomViewBehind customViewBehind) {
        this.mViewBehind = customViewBehind;
    }

    public void setOnClosedListener(SlidingMenu.OnClosedListener onClosedListener) {
        this.mClosedListener = onClosedListener;
    }

    public void setOnOpenedListener(SlidingMenu.OnOpenedListener onOpenedListener) {
        this.mOpenedListener = onOpenedListener;
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setSlidingEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setTouchMode(int i) {
        this.mTouchMode = i;
    }

    public CustomViewAbove(Context context) {
        this(context, null);
    }

    public void removeIgnoredView(View view) {
        this.mIgnoredViews.remove(view);
    }

    public void setCurrentItem(int i) {
        setCurrentItemInternal(i, true, false);
    }

    /* access modifiers changed from: package-private */
    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    /* access modifiers changed from: package-private */
    public void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public void addIgnoredView(View view) {
        if (!this.mIgnoredViews.contains(view)) {
            this.mIgnoredViews.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void pageScrolled(int i) {
        int width = getWidth();
        int i2 = i / width;
        int i3 = i % width;
        onPageScrolled(i2, ((float) i3) / ((float) width), i3);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float distanceInfluenceForSnapDuration(float f2) {
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
    }

    public int getChildWidth(int i) {
        switch (i) {
            case 0:
                return getBehindWidth();
            case 1:
                return this.mContent.getWidth();
            default:
                return 0;
        }
    }

    public int getDestScrollX(int i) {
        switch (i) {
            case 0:
            case 2:
                return this.mViewBehind.getMenuLeft(this.mContent, i);
            case 1:
                return this.mContent.getLeft();
            default:
                return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean menuTouchInQuickReturn(MotionEvent motionEvent) {
        return this.mViewBehind.menuTouchInQuickReturn(this.mContent, this.mCurItem, motionEvent.getX() + this.mScrollX);
    }

    public void setAboveOffset(int i) {
        View view = this.mContent;
        view.setPadding(i, view.getPaddingTop(), this.mContent.getPaddingRight(), this.mContent.getPaddingBottom());
    }

    public void setContent(View view) {
        if (this.mContent != null) {
            removeView(this.mContent);
        }
        this.mContent = view;
        addView(this.mContent);
    }

    /* access modifiers changed from: package-private */
    public boolean thisSlideAllowed(float f2) {
        if (isMenuOpen()) {
            return this.mViewBehind.menuOpenSlideAllowed(f2);
        }
        return this.mViewBehind.menuClosedSlideAllowed(f2);
    }

    private boolean isInIgnoredView(MotionEvent motionEvent) {
        Rect rect = new Rect();
        for (View hitRect : this.mIgnoredViews) {
            hitRect.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.mViewBehind.drawShadow(this.mContent, canvas);
        this.mViewBehind.drawFade(this.mContent, canvas, getPercentOpen());
        this.mViewBehind.drawSelector(this.mContent, canvas, getPercentOpen());
    }

    /* access modifiers changed from: package-private */
    public boolean thisTouchAllowed(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() + this.mScrollX);
        if (isMenuOpen()) {
            return this.mViewBehind.menuOpenTouchAllowed(this.mContent, this.mCurItem, (float) x);
        }
        switch (this.mTouchMode) {
            case 0:
                return this.mViewBehind.marginTouchAllowed(this.mContent, x);
            case 1:
                if (!isInIgnoredView(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r6 != 2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            if (r0 != r5) goto L_0x0007
            r0 = 0
        L_0x0007:
            r1 = 0
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r5, r0, r6)
            r3 = 66
            r4 = 17
            if (r2 == 0) goto L_0x0032
            if (r2 == r0) goto L_0x0032
            if (r6 != r4) goto L_0x001f
            boolean r1 = r2.requestFocus()
            goto L_0x0046
        L_0x001f:
            if (r6 != r3) goto L_0x0046
            if (r0 == 0) goto L_0x002d
            int r1 = r2.getLeft()
            int r0 = r0.getLeft()
            if (r1 <= r0) goto L_0x003d
        L_0x002d:
            boolean r1 = r2.requestFocus()
            goto L_0x0046
        L_0x0032:
            if (r6 == r4) goto L_0x0042
            r0 = 1
            if (r6 != r0) goto L_0x0038
            goto L_0x0042
        L_0x0038:
            if (r6 == r3) goto L_0x003d
            r0 = 2
            if (r6 != r0) goto L_0x0046
        L_0x003d:
            boolean r1 = r5.pageRight()
            goto L_0x0046
        L_0x0042:
            boolean r1 = r5.pageLeft()
        L_0x0046:
            if (r1 == 0) goto L_0x004f
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.menu.CustomViewAbove.arrowScroll(int):boolean");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        return arrowScroll(17);
                    case 22:
                        return arrowScroll(66);
                }
            } else if (Build.VERSION.SDK_INT >= 11) {
                if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                    return arrowScroll(2);
                }
                if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public void setCurrentItem(int i, boolean z) {
        setCurrentItemInternal(i, z, false);
    }

    public CustomViewAbove(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mActivePointerId = -1;
        this.mEnabled = true;
        this.mIgnoredViews = new ArrayList();
        this.mTouchMode = 0;
        this.mScrollX = 0.0f;
        initCustomViewAbove();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.mContent.measure(getChildMeasureSpec(i, 0, defaultSize), getChildMeasureSpec(i2, 0, defaultSize2));
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        this.mScrollX = (float) i;
        if (this.mEnabled) {
            this.mViewBehind.scrollBehindTo(this.mContent, i, i2);
        }
        ((SlidingMenu) getParent()).manageLayers(getPercentOpen());
    }

    /* access modifiers changed from: package-private */
    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    /* access modifiers changed from: protected */
    public void onPageScrolled(int i, float f2, int i2) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrolled(i, f2, i2);
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrolled(i, f2, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = i - scrollX;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll();
            if (isMenuOpen()) {
                if (this.mOpenedListener != null) {
                    this.mOpenedListener.onOpened();
                    return;
                }
            } else if (this.mClosedListener != null) {
                this.mClosedListener.onClosed();
            }
            return;
        }
        setScrollingCacheEnabled(true);
        this.mScrolling = true;
        int behindWidth = getBehindWidth();
        float f2 = (float) (behindWidth / 2);
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) behindWidth))) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i4 = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs)) * 1000.0f) * 4;
        } else {
            Math.abs(i5);
            i4 = 600;
        }
        this.mScroller.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            completeScroll();
            scrollTo(getDestScrollX(this.mCurItem), getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        boolean z3;
        if (z2 || this.mCurItem != i) {
            int menuPage = this.mViewBehind.getMenuPage(i);
            if (this.mCurItem != menuPage) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.mCurItem = menuPage;
            int destScrollX = getDestScrollX(this.mCurItem);
            if (z3 && this.mOnPageChangeListener != null) {
                this.mOnPageChangeListener.onPageSelected(menuPage);
            }
            if (z3 && this.mInternalPageChangeListener != null) {
                this.mInternalPageChangeListener.onPageSelected(menuPage);
            }
            if (z) {
                smoothScrollTo(destScrollX, 0, i2);
                return;
            }
            completeScroll();
            scrollTo(destScrollX, 0);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mContent.layout(0, 0, i3 - i, i4 - i2);
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (canScroll(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !ViewCompat.canScrollHorizontally(view, -i)) {
            return false;
        }
        return true;
    }
}
