package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.design.animation.AnimationUtils;
import android.support.design.animation.AnimatorSetCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.Space;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class IndicatorViewController {
    @Nullable
    public Animator captionAnimator;
    private FrameLayout captionArea;
    public int captionDisplayed;
    private int captionToShow;
    private final float captionTranslationYPx = ((float) this.context.getResources().getDimensionPixelSize(C0906R.dimen.eu));
    private int captionViewsAdded;
    private final Context context;
    private boolean errorEnabled;
    private CharSequence errorText;
    private int errorTextAppearance;
    public TextView errorView;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    private TextView helperTextView;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;
    private final TextInputLayout textInputView;
    private Typeface typeface;

    /* access modifiers changed from: package-private */
    public final boolean isCaptionView(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence getErrorText() {
        return this.errorText;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence getHelperText() {
        return this.helperText;
    }

    /* access modifiers changed from: package-private */
    public final boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    /* access modifiers changed from: package-private */
    public final boolean errorIsDisplayed() {
        return isCaptionStateError(this.captionDisplayed);
    }

    /* access modifiers changed from: package-private */
    public final boolean errorShouldBeShown() {
        return isCaptionStateError(this.captionToShow);
    }

    /* access modifiers changed from: package-private */
    public final boolean helperTextIsDisplayed() {
        return isCaptionStateHelperText(this.captionDisplayed);
    }

    /* access modifiers changed from: package-private */
    public final boolean helperTextShouldBeShown() {
        return isCaptionStateHelperText(this.captionToShow);
    }

    private boolean canAdjustIndicatorPadding() {
        if (this.indicatorArea == null || this.textInputView.getEditText() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void cancelCaptionAnimator() {
        if (this.captionAnimator != null) {
            this.captionAnimator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    @ColorInt
    public final int getErrorViewCurrentTextColor() {
        if (this.errorView != null) {
            return this.errorView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final ColorStateList getErrorViewTextColors() {
        if (this.errorView != null) {
            return this.errorView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final ColorStateList getHelperTextViewColors() {
        if (this.helperTextView != null) {
            return this.helperTextView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @ColorInt
    public final int getHelperTextViewCurrentTextColor() {
        if (this.helperTextView != null) {
            return this.helperTextView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void hideHelperText() {
        cancelCaptionAnimator();
        if (this.captionDisplayed == 2) {
            this.captionToShow = 0;
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, null));
    }

    /* access modifiers changed from: package-private */
    public final void adjustIndicatorPadding() {
        if (canAdjustIndicatorPadding()) {
            ViewCompat.setPaddingRelative(this.indicatorArea, ViewCompat.getPaddingStart(this.textInputView.getEditText()), 0, ViewCompat.getPaddingEnd(this.textInputView.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void hideError() {
        this.errorText = null;
        cancelCaptionAnimator();
        if (this.captionDisplayed == 1) {
            if (!this.helperTextEnabled || TextUtils.isEmpty(this.helperText)) {
                this.captionToShow = 0;
            } else {
                this.captionToShow = 2;
            }
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, null));
    }

    /* access modifiers changed from: package-private */
    public final void setErrorTextAppearance(@StyleRes int i) {
        this.errorTextAppearance = i;
        if (this.errorView != null) {
            this.textInputView.setTextAppearanceCompatWithErrorFallback(this.errorView, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setErrorViewTextColor(@Nullable ColorStateList colorStateList) {
        if (this.errorView != null) {
            this.errorView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setHelperTextAppearance(@StyleRes int i) {
        this.helperTextTextAppearance = i;
        if (this.helperTextView != null) {
            TextViewCompat.setTextAppearance(this.helperTextView, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setHelperTextViewTextColor(@Nullable ColorStateList colorStateList) {
        if (this.helperTextView != null) {
            this.helperTextView.setTextColor(colorStateList);
        }
    }

    public IndicatorViewController(TextInputLayout textInputLayout) {
        this.context = textInputLayout.getContext();
        this.textInputView = textInputLayout;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.captionTranslationYPx, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        return ofFloat;
    }

    @Nullable
    private TextView getCaptionViewFromDisplayState(int i) {
        switch (i) {
            case 1:
                return this.errorView;
            case 2:
                return this.helperTextView;
            default:
                return null;
        }
    }

    private boolean isCaptionStateError(int i) {
        if (i != 1 || this.errorView == null || TextUtils.isEmpty(this.errorText)) {
            return false;
        }
        return true;
    }

    private boolean isCaptionStateHelperText(int i) {
        if (i != 2 || this.helperTextView == null || TextUtils.isEmpty(this.helperText)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void setTypefaces(Typeface typeface2) {
        if (typeface2 != this.typeface) {
            this.typeface = typeface2;
            setTextViewTypeface(this.errorView, typeface2);
            setTextViewTypeface(this.helperTextView, typeface2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void showError(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.errorText = charSequence;
        this.errorView.setText(charSequence);
        if (this.captionDisplayed != 1) {
            this.captionToShow = 1;
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, charSequence));
    }

    /* access modifiers changed from: package-private */
    public final void showHelper(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.helperText = charSequence;
        this.helperTextView.setText(charSequence);
        if (this.captionDisplayed != 2) {
            this.captionToShow = 2;
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, charSequence));
    }

    /* access modifiers changed from: package-private */
    public final void setErrorEnabled(boolean z) {
        if (this.errorEnabled != z) {
            cancelCaptionAnimator();
            if (z) {
                this.errorView = new AppCompatTextView(this.context);
                this.errorView.setId(C0906R.id.d25);
                if (this.typeface != null) {
                    this.errorView.setTypeface(this.typeface);
                }
                setErrorTextAppearance(this.errorTextAppearance);
                this.errorView.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.errorView, 1);
                addIndicator(this.errorView, 0);
            } else {
                hideError();
                removeIndicator(this.errorView, 0);
                this.errorView = null;
                this.textInputView.updateEditTextBackground();
                this.textInputView.updateTextInputBoxState();
            }
            this.errorEnabled = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setHelperTextEnabled(boolean z) {
        if (this.helperTextEnabled != z) {
            cancelCaptionAnimator();
            if (z) {
                this.helperTextView = new AppCompatTextView(this.context);
                this.helperTextView.setId(C0906R.id.d26);
                if (this.typeface != null) {
                    this.helperTextView.setTypeface(this.typeface);
                }
                this.helperTextView.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.helperTextView, 1);
                setHelperTextAppearance(this.helperTextTextAppearance);
                addIndicator(this.helperTextView, 1);
            } else {
                hideHelperText();
                removeIndicator(this.helperTextView, 1);
                this.helperTextView = null;
                this.textInputView.updateEditTextBackground();
                this.textInputView.updateTextInputBoxState();
            }
            this.helperTextEnabled = z;
        }
    }

    private void setTextViewTypeface(@Nullable TextView textView, Typeface typeface2) {
        if (textView != null) {
            textView.setTypeface(typeface2);
        }
    }

    private void setViewGroupGoneIfEmpty(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f2});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    private void setCaptionViewVisibilities(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView captionViewFromDisplayState = getCaptionViewFromDisplayState(i2);
                if (captionViewFromDisplayState != null) {
                    captionViewFromDisplayState.setVisibility(0);
                    captionViewFromDisplayState.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i);
                if (captionViewFromDisplayState2 != null) {
                    captionViewFromDisplayState2.setVisibility(4);
                    if (i == 1) {
                        captionViewFromDisplayState2.setText(null);
                    }
                }
            }
            this.captionDisplayed = i2;
        }
    }

    private boolean shouldAnimateCaptionView(TextView textView, @Nullable CharSequence charSequence) {
        if (!ViewCompat.isLaidOut(this.textInputView) || !this.textInputView.isEnabled() || (this.captionToShow == this.captionDisplayed && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void removeIndicator(TextView textView, int i) {
        if (this.indicatorArea != null) {
            if (!isCaptionView(i) || this.captionArea == null) {
                this.indicatorArea.removeView(textView);
            } else {
                this.captionViewsAdded--;
                setViewGroupGoneIfEmpty(this.captionArea, this.captionViewsAdded);
                this.captionArea.removeView(textView);
            }
            this.indicatorsAdded--;
            setViewGroupGoneIfEmpty(this.indicatorArea, this.indicatorsAdded);
        }
    }

    /* access modifiers changed from: package-private */
    public final void addIndicator(TextView textView, int i) {
        if (this.indicatorArea == null && this.captionArea == null) {
            this.indicatorArea = new LinearLayout(this.context);
            this.indicatorArea.setOrientation(0);
            this.textInputView.addView(this.indicatorArea, -1, -2);
            this.captionArea = new FrameLayout(this.context);
            this.indicatorArea.addView(this.captionArea, -1, new FrameLayout.LayoutParams(-2, -2));
            this.indicatorArea.addView(new Space(this.context), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.textInputView.getEditText() != null) {
                adjustIndicatorPadding();
            }
        }
        if (isCaptionView(i)) {
            this.captionArea.setVisibility(0);
            this.captionArea.addView(textView);
            this.captionViewsAdded++;
        } else {
            this.indicatorArea.addView(textView, i);
        }
        this.indicatorArea.setVisibility(0);
        this.indicatorsAdded++;
    }

    private void updateCaptionViewsVisibility(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.captionAnimator = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            createCaptionAnimators(arrayList2, this.helperTextEnabled, this.helperTextView, 2, i3, i4);
            createCaptionAnimators(arrayList2, this.errorEnabled, this.errorView, 1, i3, i4);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            final TextView captionViewFromDisplayState = getCaptionViewFromDisplayState(i);
            final TextView captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i2);
            final int i5 = i2;
            final int i6 = i;
            AnonymousClass1 r0 = new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    if (captionViewFromDisplayState2 != null) {
                        captionViewFromDisplayState2.setVisibility(0);
                    }
                }

                public void onAnimationEnd(Animator animator) {
                    IndicatorViewController.this.captionDisplayed = i5;
                    IndicatorViewController.this.captionAnimator = null;
                    if (captionViewFromDisplayState != null) {
                        captionViewFromDisplayState.setVisibility(4);
                        if (i6 == 1 && IndicatorViewController.this.errorView != null) {
                            IndicatorViewController.this.errorView.setText(null);
                        }
                    }
                }
            };
            animatorSet.addListener(r0);
            animatorSet.start();
        } else {
            setCaptionViewVisibilities(i, i2);
        }
        this.textInputView.updateEditTextBackground();
        this.textInputView.updateLabelState(z);
        this.textInputView.updateTextInputBoxState();
    }

    private void createCaptionAnimators(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(createCaptionOpacityAnimator(textView, z2));
                if (i3 == i) {
                    list.add(createCaptionTranslationYAnimator(textView));
                }
            }
        }
    }
}
