package android.support.design.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.AnimatorRes;
import android.support.annotation.BoolRes;
import android.support.annotation.CallSuper;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.design.animation.MotionSpec;
import android.support.design.chip.ChipDrawable;
import android.support.design.resources.TextAppearance;
import android.support.design.ripple.RippleUtils;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.text.BidiFormatter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate {
    public static final Rect EMPTY_BOUNDS = new Rect();
    private static final int[] SELECTED_STATE = {16842913};
    @Nullable
    public ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private int focusedVirtualView;
    private final ResourcesCompat.FontCallback fontCallback;
    @Nullable
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListenerInternal;
    @Nullable
    private View.OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    @Nullable
    private RippleDrawable ripple;
    private final ChipTouchHelper touchHelper;

    class ChipTouchHelper extends ExploreByTouchHelper {
        public void getVisibleVirtualViews(List<Integer> list) {
            if (Chip.this.hasCloseIcon()) {
                list.add(0);
            }
        }

        public void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            boolean z;
            if (Chip.this.chipDrawable == null || !Chip.this.chipDrawable.isCheckable()) {
                z = false;
            } else {
                z = true;
            }
            accessibilityNodeInfoCompat.setCheckable(z);
            accessibilityNodeInfoCompat.setClassName(Chip.class.getName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityNodeInfoCompat.setText(text);
            } else {
                accessibilityNodeInfoCompat.setContentDescription(text);
            }
        }

        ChipTouchHelper(Chip chip) {
            super(chip);
        }

        public int getVirtualViewAt(float f2, float f3) {
            if (!Chip.this.hasCloseIcon() || !Chip.this.getCloseIconTouchBounds().contains(f2, f3)) {
                return -1;
            }
            return 0;
        }

        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (Chip.this.hasCloseIcon()) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = "";
                    }
                    objArr[0] = text;
                    accessibilityNodeInfoCompat.setContentDescription(context.getString(C0906R.string.bcu, objArr).trim());
                }
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                accessibilityNodeInfoCompat.setEnabled(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.EMPTY_BOUNDS);
        }

        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 == 16 && i == 0) {
                return Chip.this.performCloseIconClick();
            }
            return false;
        }
    }

    public Drawable getChipDrawable() {
        return this.chipDrawable;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    private void ensureFocus() {
        if (this.focusedVirtualView == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getTextAppearance();
        }
        return null;
    }

    private void initOutlineProvider() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                @TargetApi(21)
                public void getOutline(View view, Outline outline) {
                    if (Chip.this.chipDrawable != null) {
                        Chip.this.chipDrawable.getOutline(outline);
                    } else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
    }

    @Nullable
    public Drawable getCheckedIcon() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCheckedIcon();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipBackgroundColor();
        }
        return null;
    }

    public float getChipCornerRadius() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipCornerRadius();
        }
        return 0.0f;
    }

    public float getChipEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipEndPadding();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipIcon();
        }
        return null;
    }

    public float getChipIconSize() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipIconSize();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipIconTint();
        }
        return null;
    }

    public float getChipMinHeight() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipMinHeight();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipStrokeColor();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getChipStrokeWidth();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getCloseIcon() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIcon();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconContentDescription();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconSize();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getCloseIconTint();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getEllipsize();
        }
        return null;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getHideMotionSpec();
        }
        return null;
    }

    public float getIconEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getIconEndPadding();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getIconStartPadding();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getRippleColor();
        }
        return null;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getShowMotionSpec();
        }
        return null;
    }

    public CharSequence getText() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getText();
        }
        return "";
    }

    public float getTextEndPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getTextEndPadding();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        if (this.chipDrawable != null) {
            return this.chipDrawable.getTextStartPadding();
        }
        return 0.0f;
    }

    public boolean hasCloseIcon() {
        if (this.chipDrawable == null || this.chipDrawable.getCloseIcon() == null) {
            return false;
        }
        return true;
    }

    public boolean isCheckable() {
        if (this.chipDrawable == null || !this.chipDrawable.isCheckable()) {
            return false;
        }
        return true;
    }

    public boolean isCheckedIconVisible() {
        if (this.chipDrawable == null || !this.chipDrawable.isCheckedIconVisible()) {
            return false;
        }
        return true;
    }

    public boolean isChipIconVisible() {
        if (this.chipDrawable == null || !this.chipDrawable.isChipIconVisible()) {
            return false;
        }
        return true;
    }

    public boolean isCloseIconVisible() {
        if (this.chipDrawable == null || !this.chipDrawable.isCloseIconVisible()) {
            return false;
        }
        return true;
    }

    public void onChipDrawableSizeChange() {
        updatePaddingInternal();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public RectF getCloseIconTouchBounds() {
        this.rectF.setEmpty();
        if (hasCloseIcon()) {
            this.chipDrawable.getCloseIconTouchBounds(this.rectF);
        }
        return this.rectF;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.rect;
    }

    @CallSuper
    public boolean performCloseIconClick() {
        boolean z;
        playSoundEffect(0);
        if (this.onCloseIconClickListener != null) {
            this.onCloseIconClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.touchHelper.sendEventForVirtualView(0, 1);
        return z;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        if (this.chipDrawable == null || !this.chipDrawable.isCloseIconStateful()) {
            z = false;
        } else {
            z = this.chipDrawable.setCloseIconState(createCloseIconDrawableState());
        }
        if (z) {
            invalidate();
        }
    }

    private int[] createCloseIconDrawableState() {
        int i;
        int i2 = 0;
        if (isEnabled()) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.closeIconFocused) {
            i++;
        }
        if (this.closeIconHovered) {
            i++;
        }
        if (this.closeIconPressed) {
            i++;
        }
        if (isChecked()) {
            i++;
        }
        int[] iArr = new int[i];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.closeIconFocused) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.closeIconHovered) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.closeIconPressed) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    private void updatePaddingInternal() {
        if (!TextUtils.isEmpty(getText()) && this.chipDrawable != null) {
            float chipStartPadding = this.chipDrawable.getChipStartPadding() + this.chipDrawable.getChipEndPadding() + this.chipDrawable.getTextStartPadding() + this.chipDrawable.getTextEndPadding();
            if ((this.chipDrawable.isChipIconVisible() && this.chipDrawable.getChipIcon() != null) || (this.chipDrawable.getCheckedIcon() != null && this.chipDrawable.isCheckedIconVisible() && isChecked())) {
                chipStartPadding += this.chipDrawable.getIconStartPadding() + this.chipDrawable.getIconEndPadding() + this.chipDrawable.getChipIconSize();
            }
            if (this.chipDrawable.isCloseIconVisible() && this.chipDrawable.getCloseIcon() != null) {
                chipStartPadding += this.chipDrawable.getCloseIconStartPadding() + this.chipDrawable.getCloseIconEndPadding() + this.chipDrawable.getCloseIconSize();
            }
            if (((float) ViewCompat.getPaddingEnd(this)) != chipStartPadding) {
                ViewCompat.setPaddingRelative(this, ViewCompat.getPaddingStart(this), getPaddingTop(), (int) chipStartPadding, getPaddingBottom());
            }
        }
    }

    private void applyChipDrawable(@NonNull ChipDrawable chipDrawable2) {
        chipDrawable2.setDelegate(this);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListenerInternal = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.onCloseIconClickListener = onClickListener;
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void unapplyChipDrawable(@Nullable ChipDrawable chipDrawable2) {
        if (chipDrawable2 != null) {
            chipDrawable2.setDelegate(null);
        }
    }

    public void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    private void setCloseIconFocused(boolean z) {
        if (this.closeIconFocused != z) {
            this.closeIconFocused = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.closeIconHovered != z) {
            this.closeIconHovered = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.closeIconPressed != z) {
            this.closeIconPressed = z;
            refreshDrawableState();
        }
    }

    public void getFocusedRect(Rect rect2) {
        if (this.focusedVirtualView == 0) {
            rect2.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect2);
        }
    }

    public void setCheckable(boolean z) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckable(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckableResource(i);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIcon(drawable);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconResource(i);
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconVisible(i);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipBackgroundColor(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipBackgroundColorResource(i);
        }
    }

    public void setChipCornerRadius(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipCornerRadius(f2);
        }
    }

    public void setChipCornerRadiusResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipCornerRadiusResource(i);
        }
    }

    public void setChipEndPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipEndPadding(f2);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipEndPaddingResource(i);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIcon(drawable);
        }
    }

    public void setChipIconResource(@DrawableRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconResource(i);
        }
    }

    public void setChipIconSize(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconSize(f2);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconSizeResource(i);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconTint(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconTintResource(i);
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconVisible(i);
        }
    }

    public void setChipMinHeight(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipMinHeight(f2);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipMinHeightResource(i);
        }
    }

    public void setChipStartPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStartPadding(f2);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStartPaddingResource(i);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeColor(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeColorResource(i);
        }
    }

    public void setChipStrokeWidth(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeWidth(f2);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeWidthResource(i);
        }
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIcon(drawable);
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconContentDescription(charSequence);
        }
    }

    public void setCloseIconEndPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconEndPadding(f2);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconEndPaddingResource(i);
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconResource(i);
        }
    }

    public void setCloseIconSize(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconSize(f2);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconSizeResource(i);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconStartPadding(f2);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconStartPaddingResource(i);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconTint(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconTintResource(i);
        }
    }

    public void setCloseIconVisible(@BoolRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconVisible(i);
        }
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setHideMotionSpec(motionSpec);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setHideMotionSpecResource(i);
        }
    }

    public void setIconEndPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconEndPadding(f2);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconEndPaddingResource(i);
        }
    }

    public void setIconStartPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconStartPadding(f2);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setIconStartPaddingResource(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        if (this.chipDrawable != null) {
            this.chipDrawable.setMaxWidth(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setRippleColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setRippleColorResource(i);
        }
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setShowMotionSpec(motionSpec);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setShowMotionSpecResource(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setTextEndPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextEndPadding(f2);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextEndPaddingResource(i);
        }
    }

    public void setTextStartPadding(float f2) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextStartPadding(f2);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextStartPaddingResource(i);
        }
    }

    private float calculateTextOffsetFromStart(@NonNull ChipDrawable chipDrawable2) {
        float chipStartPadding = getChipStartPadding() + chipDrawable2.calculateChipIconWidth() + getTextStartPadding();
        if (ViewCompat.getLayoutDirection(this) == 0) {
            return chipStartPadding;
        }
        return -chipStartPadding;
    }

    private boolean moveFocus(boolean z) {
        ensureFocus();
        if (z) {
            if (this.focusedVirtualView == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.focusedVirtualView == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }

    private void setFocusedVirtualView(int i) {
        if (this.focusedVirtualView != i) {
            if (this.focusedVirtualView == 0) {
                setCloseIconFocused(false);
            }
            this.focusedVirtualView = i;
            if (i == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    private void updateTextPaintDrawState(TextAppearance textAppearance) {
        TextPaint paint = getPaint();
        paint.drawableState = this.chipDrawable.getState();
        textAppearance.updateDrawState(getContext(), paint, this.fontCallback);
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (handleAccessibilityExit(motionEvent) || this.touchHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.touchHelper.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, SELECTED_STATE);
        }
        return onCreateDrawableState;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.chipDrawable || drawable == this.ripple) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.chipDrawable || drawable == this.ripple) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setCheckedIconVisible(boolean z) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconVisible(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setChipIconVisible(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setCloseIconVisible(z);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.chipDrawable != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                if (this.chipDrawable != null) {
                    this.chipDrawable.setEllipsize(truncateAt);
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(i);
        }
        setTextAppearance(getContext(), i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (TextUtils.isEmpty(getText()) || this.chipDrawable == null || this.chipDrawable.shouldDrawText()) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.translate(calculateTextOffsetFromStart(this.chipDrawable), 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        if (this.chipDrawable == null) {
            this.deferredCheckedValue = z;
            return;
        }
        if (this.chipDrawable.isCheckable()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (!(isChecked == z || this.onCheckedChangeListenerInternal == null)) {
                this.onCheckedChangeListenerInternal.onCheckedChanged(this, z);
            }
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable2) {
        if (this.chipDrawable != chipDrawable2) {
            unapplyChipDrawable(this.chipDrawable);
            this.chipDrawable = chipDrawable2;
            applyChipDrawable(this.chipDrawable);
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.ripple = new RippleDrawable(RippleUtils.convertToRippleDrawableColor(this.chipDrawable.getRippleColor()), this.chipDrawable, null);
                this.chipDrawable.setUseCompatRipple(false);
                ViewCompat.setBackground(this, this.ripple);
                return;
            }
            this.chipDrawable.setUseCompatRipple(true);
            ViewCompat.setBackground(this, this.chipDrawable);
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(i);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().updateMeasureState(getContext(), getPaint(), this.fontCallback);
            updateTextPaintDrawState(getTextAppearance());
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean handleAccessibilityExit(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = ExploreByTouchHelper.class.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.touchHelper)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = ExploreByTouchHelper.class.getDeclaredMethod("updateHoveredVirtualView", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.touchHelper, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        setCloseIconPressed(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (super.onTouchEvent(r5) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            android.graphics.RectF r1 = r4.getCloseIconTouchBounds()
            float r2 = r5.getX()
            float r3 = r5.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0024;
                case 2: goto L_0x001a;
                case 3: goto L_0x002d;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0039
        L_0x001a:
            boolean r0 = r4.closeIconPressed
            if (r0 == 0) goto L_0x0039
            if (r1 != 0) goto L_0x0037
            r4.setCloseIconPressed(r2)
            goto L_0x0037
        L_0x0024:
            boolean r0 = r4.closeIconPressed
            if (r0 == 0) goto L_0x002d
            r4.performCloseIconClick()
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            r4.setCloseIconPressed(r2)
            goto L_0x003a
        L_0x0032:
            if (r1 == 0) goto L_0x0039
            r4.setCloseIconPressed(r3)
        L_0x0037:
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 != 0) goto L_0x0044
            boolean r5 = super.onTouchEvent(r5)
            if (r5 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            return r2
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void validateAttributes(@Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
            } else {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextAppearance(textAppearance);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().updateMeasureState(getContext(), getPaint(), this.fontCallback);
            updateTextPaintDrawState(textAppearance);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.eu);
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.chipDrawable != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence unicodeWrap = BidiFormatter.getInstance().unicodeWrap(charSequence);
            if (this.chipDrawable.shouldDrawText()) {
                unicodeWrap = null;
            }
            super.setText(unicodeWrap, bufferType);
            if (this.chipDrawable != null) {
                this.chipDrawable.setText(charSequence);
            }
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(i);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().updateMeasureState(context, getPaint(), this.fontCallback);
            updateTextPaintDrawState(getTextAppearance());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getKeyCode()
            r1 = 61
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x003f
            r1 = 66
            if (r0 == r1) goto L_0x0031
            switch(r0) {
                case 21: goto L_0x0022;
                case 22: goto L_0x0012;
                case 23: goto L_0x0031;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x006b
        L_0x0012:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006b
            boolean r0 = android.support.design.internal.ViewUtils.isLayoutRtl(r6)
            r0 = r0 ^ r3
            boolean r2 = r6.moveFocus(r0)
            goto L_0x006b
        L_0x0022:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006b
            boolean r0 = android.support.design.internal.ViewUtils.isLayoutRtl(r6)
            boolean r2 = r6.moveFocus(r0)
            goto L_0x006b
        L_0x0031:
            int r0 = r6.focusedVirtualView
            switch(r0) {
                case -1: goto L_0x003b;
                case 0: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x006b
        L_0x0037:
            r6.performCloseIconClick()
            return r3
        L_0x003b:
            r6.performClick()
            return r3
        L_0x003f:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0047
            r0 = 2
            goto L_0x0050
        L_0x0047:
            boolean r0 = r8.hasModifiers(r3)
            if (r0 == 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x006b
            android.view.ViewParent r1 = r6.getParent()
            r4 = r6
        L_0x0057:
            android.view.View r4 = r4.focusSearch(r0)
            if (r4 == 0) goto L_0x0065
            if (r4 == r6) goto L_0x0065
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == r1) goto L_0x0057
        L_0x0065:
            if (r4 == 0) goto L_0x006b
            r4.requestFocus()
            return r3
        L_0x006b:
            if (r2 == 0) goto L_0x0071
            r6.invalidate()
            return r3
        L_0x0071:
            boolean r7 = super.onKeyDown(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect2) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i, rect2);
        this.touchHelper.onFocusChanged(z, i, rect2);
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.focusedVirtualView = Integer.MIN_VALUE;
        this.rect = new Rect();
        this.rectF = new RectF();
        this.fontCallback = new ResourcesCompat.FontCallback() {
            public void onFontRetrievalFailed(int i) {
            }

            public void onFontRetrieved(@NonNull Typeface typeface) {
                Chip.this.setText(Chip.this.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        validateAttributes(attributeSet);
        ChipDrawable createFromAttributes = ChipDrawable.createFromAttributes(context, attributeSet, i, C0906R.style.f4470pl);
        setChipDrawable(createFromAttributes);
        this.touchHelper = new ChipTouchHelper(this);
        ViewCompat.setAccessibilityDelegate(this, this.touchHelper);
        initOutlineProvider();
        setChecked(this.deferredCheckedValue);
        createFromAttributes.setShouldDrawText(false);
        setText(createFromAttributes.getText());
        setEllipsize(createFromAttributes.getEllipsize());
        setIncludeFontPadding(false);
        if (getTextAppearance() != null) {
            updateTextPaintDrawState(getTextAppearance());
        }
        setSingleLine();
        setGravity(8388627);
        updatePaddingInternal();
    }

    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }
}
