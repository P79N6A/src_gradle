package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;

public abstract class AbsActionBarView extends ViewGroup {
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    protected class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        private boolean mCanceled;
        int mFinalVisibility;

        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }

        protected VisibilityAnimListener() {
        }

        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.mCanceled = false;
        }

        public void onAnimationEnd(View view) {
            if (!this.mCanceled) {
                AbsActionBarView.this.mVisibilityAnim = null;
                AbsActionBarView.super.setVisibility(this.mFinalVisibility);
            }
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i) {
            AbsActionBarView.this.mVisibilityAnim = viewPropertyAnimatorCompat;
            this.mFinalVisibility = i;
            return this;
        }
    }

    protected static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public boolean canShowOverflowMenu() {
        if (!isOverflowReserved() || getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void dismissPopupMenus() {
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
    }

    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.mFinalVisibility;
        }
        return getVisibility();
    }

    public boolean hideOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.isOverflowMenuShowPending();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        if (this.mActionMenuPresenter == null || !this.mActionMenuPresenter.isOverflowReserved()) {
            return false;
        }
        return true;
    }

    public void postShowOverflowMenu() {
        post(new Runnable() {
            public void run() {
                AbsActionBarView.this.showOverflowMenu();
            }
        });
    }

    public boolean showOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.showOverflowMenu();
        }
        return false;
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void animateToVisibility(int i) {
        setupAnimatorToVisibility(i, 200).start();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.mVisibilityAnim != null) {
                this.mVisibilityAnim.cancel();
            }
            super.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.ActionBar, C0906R.attr.f4374f, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimatorCompat alpha = ViewCompat.animate(this).alpha(1.0f);
            alpha.setDuration(j);
            alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i));
            return alpha;
        }
        ViewPropertyAnimatorCompat alpha2 = ViewCompat.animate(this).alpha(0.0f);
        alpha2.setDuration(j);
        alpha2.setListener(this.mVisAnimListener.withFinalVisibility(alpha2, i));
        return alpha2;
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0906R.attr.f4371c, typedValue, true) || typedValue.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public int measureChildView(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    public int positionChild(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }
}
