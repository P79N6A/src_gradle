package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Dimension;
import android.support.annotation.MenuRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.design.R$styleable;
import android.support.design.animation.AnimationUtils;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.internal.ThemeEnforcement;
import android.support.design.resources.MaterialResources;
import android.support.design.shape.MaterialShapeDrawable;
import android.support.design.shape.ShapePathModel;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    @Nullable
    public Animator attachAnimator;
    public int fabAlignmentMode;
    AnimatorListenerAdapter fabAnimationListener;
    public boolean fabAttached;
    private final int fabOffsetEndMode;
    private boolean hideOnScroll;
    public final MaterialShapeDrawable materialShapeDrawable;
    @Nullable
    public Animator menuAnimator;
    @Nullable
    public Animator modeAnimator;
    public final BottomAppBarTopEdgeTreatment topEdgeTreatment;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect fabContentRect = new Rect();

        public Behavior() {
        }

        /* access modifiers changed from: protected */
        public void slideDown(BottomAppBar bottomAppBar) {
            super.slideDown(bottomAppBar);
            FloatingActionButton findDependentFab = bottomAppBar.findDependentFab();
            if (findDependentFab != null) {
                findDependentFab.getContentRect(this.fabContentRect);
                findDependentFab.clearAnimation();
                findDependentFab.animate().translationY(((float) (-findDependentFab.getPaddingBottom())) + ((float) (findDependentFab.getMeasuredHeight() - this.fabContentRect.height()))).setInterpolator(AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR).setDuration(175);
            }
        }

        /* access modifiers changed from: protected */
        public void slideUp(BottomAppBar bottomAppBar) {
            super.slideUp(bottomAppBar);
            FloatingActionButton findDependentFab = bottomAppBar.findDependentFab();
            if (findDependentFab != null) {
                findDependentFab.clearAnimation();
                findDependentFab.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR).setDuration(225);
            }
        }

        private boolean updateFabPositionAndVisibility(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).anchorGravity = 17;
            bottomAppBar.addFabAnimationListeners(floatingActionButton);
            return true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton findDependentFab = bottomAppBar.findDependentFab();
            if (findDependentFab != null) {
                updateFabPositionAndVisibility(findDependentFab, bottomAppBar);
                findDependentFab.getMeasuredContentRect(this.fabContentRect);
                bottomAppBar.setFabDiameter(this.fabContentRect.height());
            }
            if (!bottomAppBar.isAnimationRunning()) {
                bottomAppBar.setCutoutState();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (!bottomAppBar.getHideOnScroll() || !super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return false;
            }
            return true;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        int fabAlignmentMode;
        boolean fabAttached;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.fabAttached ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.fabAlignmentMode = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.fabAttached = z;
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    private float getFabTranslationX() {
        return (float) getFabTranslationX(this.fabAlignmentMode);
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    @NonNull
    public CoordinatorLayout.Behavior<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return this.topEdgeTreatment.getCradleVerticalOffset();
    }

    public float getFabCradleMargin() {
        return this.topEdgeTreatment.getFabCradleMargin();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return this.topEdgeTreatment.getFabCradleRoundedCornerRadius();
    }

    public float getFabTranslationY() {
        return getFabTranslationY(this.fabAttached);
    }

    private boolean isVisibleFab() {
        FloatingActionButton findDependentFab = findDependentFab();
        if (findDependentFab == null || !findDependentFab.isOrWillBeShown()) {
            return false;
        }
        return true;
    }

    private void cancelAnimations() {
        if (this.attachAnimator != null) {
            this.attachAnimator.cancel();
        }
        if (this.menuAnimator != null) {
            this.menuAnimator.cancel();
        }
        if (this.modeAnimator != null) {
            this.modeAnimator.cancel();
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.fabAlignmentMode = this.fabAlignmentMode;
        savedState.fabAttached = this.fabAttached;
        return savedState;
    }

    @Nullable
    public FloatingActionButton findDependentFab() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View next : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if (next instanceof FloatingActionButton) {
                return (FloatingActionButton) next;
            }
        }
        return null;
    }

    public boolean isAnimationRunning() {
        if ((this.attachAnimator == null || !this.attachAnimator.isRunning()) && ((this.menuAnimator == null || !this.menuAnimator.isRunning()) && (this.modeAnimator == null || !this.modeAnimator.isRunning()))) {
            return false;
        }
        return true;
    }

    public void setCutoutState() {
        float f2;
        this.topEdgeTreatment.setHorizontalOffset(getFabTranslationX());
        FloatingActionButton findDependentFab = findDependentFab();
        MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
        if (!this.fabAttached || !isVisibleFab()) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        materialShapeDrawable2.setInterpolation(f2);
        if (findDependentFab != null) {
            findDependentFab.setTranslationY(getFabTranslationY());
            findDependentFab.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!isVisibleFab()) {
                translateActionMenuView(actionMenuView, 0, false);
                return;
            }
            translateActionMenuView(actionMenuView, this.fabAlignmentMode, this.fabAttached);
        }
    }

    public void setHideOnScroll(boolean z) {
        this.hideOnScroll = z;
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.materialShapeDrawable, colorStateList);
    }

    private void removeFabAnimationListeners(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.removeOnHideAnimationListener(this.fabAnimationListener);
        floatingActionButton.removeOnShowAnimationListener(this.fabAnimationListener);
    }

    public void addFabAnimationListeners(@NonNull FloatingActionButton floatingActionButton) {
        removeFabAnimationListeners(floatingActionButton);
        floatingActionButton.addOnHideAnimationListener(this.fabAnimationListener);
        floatingActionButton.addOnShowAnimationListener(this.fabAnimationListener);
    }

    public void replaceMenu(@MenuRes int i) {
        getMenu().clear();
        inflateMenu(i);
    }

    public void setFabAlignmentMode(int i) {
        maybeAnimateModeChange(i);
        maybeAnimateMenuView(i, this.fabAttached);
        this.fabAlignmentMode = i;
    }

    private int getFabTranslationX(int i) {
        boolean z;
        int i2 = 1;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.fabOffsetEndMode;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.fabAlignmentMode = savedState.fabAlignmentMode;
        this.fabAttached = savedState.fabAttached;
    }

    public void setCradleVerticalOffset(@Dimension float f2) {
        if (f2 != getCradleVerticalOffset()) {
            this.topEdgeTreatment.setCradleVerticalOffset(f2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f2) {
        if (f2 != getFabCradleMargin()) {
            this.topEdgeTreatment.setFabCradleMargin(f2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            this.topEdgeTreatment.setFabCradleRoundedCornerRadius(f2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void setFabDiameter(@Px int i) {
        float f2 = (float) i;
        if (f2 != this.topEdgeTreatment.getFabDiameter()) {
            this.topEdgeTreatment.setFabDiameter(f2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    private void maybeAnimateModeChange(int i) {
        if (this.fabAlignmentMode != i && ViewCompat.isLaidOut(this)) {
            if (this.modeAnimator != null) {
                this.modeAnimator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            createCradleTranslationAnimation(i, arrayList);
            createFabTranslationXAnimation(i, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.modeAnimator = animatorSet;
            this.modeAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.modeAnimator = null;
                }
            });
            this.modeAnimator.start();
        }
    }

    public void maybeAnimateAttachChange(boolean z) {
        boolean z2;
        if (ViewCompat.isLaidOut(this)) {
            if (this.attachAnimator != null) {
                this.attachAnimator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!z || !isVisibleFab()) {
                z2 = false;
            } else {
                z2 = true;
            }
            createCradleShapeAnimation(z2, arrayList);
            createFabTranslationYAnimation(z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.attachAnimator = animatorSet;
            this.attachAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.attachAnimator = null;
                }
            });
            this.attachAnimator.start();
        }
    }

    private float getFabTranslationY(boolean z) {
        FloatingActionButton findDependentFab = findDependentFab();
        if (findDependentFab == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        findDependentFab.getContentRect(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) findDependentFab.getMeasuredHeight();
        }
        float height2 = (float) (findDependentFab.getHeight() - rect.height());
        float height3 = (-getCradleVerticalOffset()) + (height / 2.0f) + ((float) (findDependentFab.getHeight() - rect.bottom));
        float paddingBottom = height2 - ((float) findDependentFab.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            paddingBottom = height3;
        }
        return f2 + paddingBottom;
    }

    public BottomAppBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.cl);
    }

    private void createFabTranslationXAnimation(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findDependentFab(), "translationX", new float[]{(float) getFabTranslationX(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void createFabTranslationYAnimation(boolean z, List<Animator> list) {
        FloatingActionButton findDependentFab = findDependentFab();
        if (findDependentFab != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findDependentFab, "translationY", new float[]{getFabTranslationY(z)});
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    private void createCradleShapeAnimation(boolean z, List<Animator> list) {
        float f2;
        if (z) {
            this.topEdgeTreatment.setHorizontalOffset(getFabTranslationX());
        }
        float[] fArr = new float[2];
        fArr[0] = this.materialShapeDrawable.getInterpolation();
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomAppBar.this.materialShapeDrawable.setInterpolation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void createCradleTranslationAnimation(int i, List<Animator> list) {
        if (this.fabAttached) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.topEdgeTreatment.getHorizontalOffset(), (float) getFabTranslationX(i)});
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomAppBar.this.topEdgeTreatment.setHorizontalOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                }
            });
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    public void maybeAnimateMenuView(int i, boolean z) {
        if (ViewCompat.isLaidOut(this)) {
            if (this.menuAnimator != null) {
                this.menuAnimator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!isVisibleFab()) {
                i = 0;
                z = false;
            }
            createMenuViewTranslationAnimation(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.menuAnimator = animatorSet;
            this.menuAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.menuAnimator = null;
                }
            });
            this.menuAnimator.start();
        }
    }

    public BottomAppBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fabAttached = true;
        this.fabAnimationListener = new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.maybeAnimateAttachChange(BottomAppBar.this.fabAttached);
                BottomAppBar.this.maybeAnimateMenuView(BottomAppBar.this.fabAlignmentMode, BottomAppBar.this.fabAttached);
            }
        };
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R$styleable.BottomAppBar, i, C0906R.style.p6, new int[0]);
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, 0);
        this.fabAlignmentMode = obtainStyledAttributes.getInt(1, 0);
        this.hideOnScroll = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        this.fabOffsetEndMode = getResources().getDimensionPixelOffset(C0906R.dimen.im);
        this.topEdgeTreatment = new BottomAppBarTopEdgeTreatment((float) obtainStyledAttributes.getDimensionPixelOffset(2, 0), (float) obtainStyledAttributes.getDimensionPixelOffset(3, 0), (float) obtainStyledAttributes.getDimensionPixelOffset(4, 0));
        ShapePathModel shapePathModel = new ShapePathModel();
        shapePathModel.setTopEdge(this.topEdgeTreatment);
        this.materialShapeDrawable = new MaterialShapeDrawable(shapePathModel);
        this.materialShapeDrawable.setShadowEnabled(true);
        this.materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        DrawableCompat.setTintList(this.materialShapeDrawable, colorStateList);
        ViewCompat.setBackground(this, this.materialShapeDrawable);
    }

    private void createMenuViewTranslationAnimation(final int i, final boolean z, List<Animator> list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if ((this.fabAttached || (z && isVisibleFab())) && (this.fabAlignmentMode == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new AnimatorListenerAdapter() {
                    public boolean cancelled;

                    public void onAnimationCancel(Animator animator) {
                        this.cancelled = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        if (!this.cancelled) {
                            BottomAppBar.this.translateActionMenuView(actionMenuView, i, z);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
                return;
            }
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    public void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2;
        int i2;
        float f2;
        boolean z3;
        int i3;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getLayoutParams() instanceof Toolbar.LayoutParams) || (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) != 8388611) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                if (z2) {
                    i3 = childAt.getLeft();
                } else {
                    i3 = childAt.getRight();
                }
                i4 = Math.max(i4, i3);
            }
        }
        if (z2) {
            i2 = actionMenuView.getRight();
        } else {
            i2 = actionMenuView.getLeft();
        }
        int i6 = i4 - i2;
        if (i != 1 || !z) {
            f2 = 0.0f;
        } else {
            f2 = (float) i6;
        }
        actionMenuView.setTranslationX(f2);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        cancelAnimations();
        setCutoutState();
    }
}
