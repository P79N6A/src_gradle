package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeBounds extends Transition {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final PointF get(View view) {
            return null;
        }

        public final void set(View view, PointF pointF) {
            ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, "bottomRight") {
        public final PointF get(ViewBounds viewBounds) {
            return null;
        }

        public final void set(ViewBounds viewBounds, PointF pointF) {
            viewBounds.setBottomRight(pointF);
        }
    };
    private static final Property<Drawable, PointF> DRAWABLE_ORIGIN_PROPERTY = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        private Rect mBounds = new Rect();

        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.mBounds);
            return new PointF((float) this.mBounds.left, (float) this.mBounds.top);
        }

        public final void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.mBounds);
            this.mBounds.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.mBounds);
        }
    };
    private static final Property<View, PointF> POSITION_PROPERTY = new Property<View, PointF>(PointF.class, "position") {
        public final PointF get(View view) {
            return null;
        }

        public final void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            ViewUtils.setLeftTopRightBottom(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, "topLeft") {
        public final PointF get(View view) {
            return null;
        }

        public final void set(View view, PointF pointF) {
            ViewUtils.setLeftTopRightBottom(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, "topLeft") {
        public final PointF get(ViewBounds viewBounds) {
            return null;
        }

        public final void set(ViewBounds viewBounds, PointF pointF) {
            viewBounds.setTopLeft(pointF);
        }
    };
    private static RectEvaluator sRectEvaluator = new RectEvaluator();
    private static final String[] sTransitionProperties = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation = new int[2];

    static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private View mView;

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }

        ViewBounds(View view) {
            this.mView = view;
        }

        /* access modifiers changed from: package-private */
        public void setBottomRight(PointF pointF) {
            this.mRight = Math.round(pointF.x);
            this.mBottom = Math.round(pointF.y);
            this.mBottomRightCalls++;
            if (this.mTopLeftCalls == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }

        /* access modifiers changed from: package-private */
        public void setTopLeft(PointF pointF) {
            this.mLeft = Math.round(pointF.x);
            this.mTop = Math.round(pointF.y);
            this.mTopLeftCalls++;
            if (this.mTopLeftCalls == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public ChangeBounds() {
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public void setResizeClip(boolean z) {
        this.mResizeClip = z;
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (ViewCompat.isLaidOut(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            transitionValues.values.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            transitionValues.values.put("android:changeBounds:parent", transitionValues.view.getParent());
            if (this.mReparent) {
                transitionValues.view.getLocationInWindow(this.mTempLocation);
                transitionValues.values.put("android:changeBounds:windowX", Integer.valueOf(this.mTempLocation[0]));
                transitionValues.values.put("android:changeBounds:windowY", Integer.valueOf(this.mTempLocation[1]));
            }
            if (this.mResizeClip) {
                transitionValues.values.put("android:changeBounds:clip", ViewCompat.getClipBounds(view));
            }
        }
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_BOUNDS);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }

    private boolean parentMatches(View view, View view2) {
        if (!this.mReparent) {
            return true;
        }
        TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.view) {
            return true;
        }
        return false;
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator2;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (transitionValues3 == null || transitionValues4 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues3.values;
        Map<String, Object> map2 = transitionValues4.values;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = transitionValues4.view;
        if (parentMatches(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) transitionValues3.values.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) transitionValues4.values.get("android:changeBounds:bounds");
            int i3 = rect3.left;
            int i4 = rect4.left;
            int i5 = rect3.top;
            int i6 = rect4.top;
            int i7 = rect3.right;
            int i8 = rect4.right;
            int i9 = rect3.bottom;
            int i10 = rect4.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect5 = (Rect) transitionValues3.values.get("android:changeBounds:clip");
            Rect rect6 = (Rect) transitionValues4.values.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                if (i3 == i4 && i5 == i6) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect7 = rect6;
                Rect rect8 = rect5;
                if (!this.mResizeClip) {
                    view = view3;
                    ViewUtils.setLeftTopRightBottom(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            animator = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath((float) i3, (float) i5, (float) i4, (float) i6));
                        } else {
                            final ViewBounds viewBounds = new ViewBounds(view);
                            ObjectAnimator ofPointF = ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, getPathMotion().getPath((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator ofPointF2 = ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{ofPointF, ofPointF2});
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                private ViewBounds mViewBounds = viewBounds;
                            });
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        animator = ObjectAnimatorUtils.ofPointF(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath((float) i7, (float) i9, (float) i8, (float) i10));
                    } else {
                        animator = ObjectAnimatorUtils.ofPointF(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else {
                    view = view3;
                    ViewUtils.setLeftTopRightBottom(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        objectAnimator = null;
                    } else {
                        objectAnimator = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                    if (rect8 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect8;
                    }
                    if (rect7 == null) {
                        rect2 = new Rect(i2, i2, i13, i14);
                    } else {
                        rect2 = rect7;
                    }
                    if (!rect.equals(rect2)) {
                        ViewCompat.setClipBounds(view, rect);
                        RectEvaluator rectEvaluator = sRectEvaluator;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect2;
                        objectAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", rectEvaluator, objArr);
                        final View view4 = view;
                        final Rect rect9 = rect7;
                        final int i15 = i4;
                        final int i16 = i6;
                        final int i17 = i8;
                        final int i18 = i10;
                        AnonymousClass8 r0 = new AnimatorListenerAdapter() {
                            private boolean mIsCanceled;

                            public void onAnimationCancel(Animator animator) {
                                this.mIsCanceled = true;
                            }

                            public void onAnimationEnd(Animator animator) {
                                if (!this.mIsCanceled) {
                                    ViewCompat.setClipBounds(view4, rect9);
                                    ViewUtils.setLeftTopRightBottom(view4, i15, i16, i17, i18);
                                }
                            }
                        };
                        objectAnimator2.addListener(r0);
                    } else {
                        objectAnimator2 = null;
                    }
                    animator = TransitionUtils.mergeAnimators(objectAnimator, objectAnimator2);
                }
                if (view.getParent() instanceof ViewGroup) {
                    final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    ViewGroupUtils.suppressLayout(viewGroup4, true);
                    addListener(new TransitionListenerAdapter() {
                        boolean mCanceled;

                        public void onTransitionPause(@NonNull Transition transition) {
                            ViewGroupUtils.suppressLayout(viewGroup4, false);
                        }

                        public void onTransitionResume(@NonNull Transition transition) {
                            ViewGroupUtils.suppressLayout(viewGroup4, true);
                        }

                        public void onTransitionCancel(@NonNull Transition transition) {
                            ViewGroupUtils.suppressLayout(viewGroup4, false);
                            this.mCanceled = true;
                        }

                        public void onTransitionEnd(@NonNull Transition transition) {
                            if (!this.mCanceled) {
                                ViewGroupUtils.suppressLayout(viewGroup4, false);
                            }
                            transition.removeListener(this);
                        }
                    });
                }
                return animator;
            }
        } else {
            int intValue = ((Integer) transitionValues3.values.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) transitionValues3.values.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) transitionValues4.values.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) transitionValues4.values.get("android:changeBounds:windowY")).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.mTempLocation);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float transitionAlpha = ViewUtils.getTransitionAlpha(view2);
                ViewUtils.setTransitionAlpha(view2, 0.0f);
                ViewUtils.getOverlay(viewGroup).add(bitmapDrawable);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{PropertyValuesHolderUtils.ofPointF(DRAWABLE_ORIGIN_PROPERTY, getPathMotion().getPath((float) (intValue - this.mTempLocation[0]), (float) (intValue2 - this.mTempLocation[1]), (float) (intValue3 - this.mTempLocation[0]), (float) (intValue4 - this.mTempLocation[1])))});
                final ViewGroup viewGroup5 = viewGroup;
                final BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                final View view5 = view2;
                final float f2 = transitionAlpha;
                AnonymousClass10 r02 = new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        ViewUtils.getOverlay(viewGroup5).remove(bitmapDrawable2);
                        ViewUtils.setTransitionAlpha(view5, f2);
                    }
                };
                ofPropertyValuesHolder.addListener(r02);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }
}
