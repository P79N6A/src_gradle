package com.ss.android.ugc.aweme.im.sdk.chat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.text.TextUtilsCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.Locale;

public class SearchableEditText extends FixedEditText {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f51036f;
    public boolean g;
    private Drawable h;
    private Drawable i;

    public SearchableEditText(Context context) {
        this(context, null);
    }

    public void setSearchable(boolean z) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51036f, false, 51410, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51036f, false, 51410, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = z;
        if (this.g) {
            drawable = this.i;
        } else {
            drawable = null;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    private void a(boolean z) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51036f, false, 51411, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51036f, false, 51411, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!this.g || !z) {
            drawable = null;
        } else {
            drawable = this.h;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f51036f, false, 51407, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f51036f, false, 51407, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 1) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable drawable = getCompoundDrawablesRelative()[2];
                if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    if (PatchProxy.isSupport(new Object[]{drawable, motionEvent}, this, f51036f, false, 51408, new Class[]{Drawable.class, MotionEvent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{drawable, motionEvent}, this, f51036f, false, 51408, new Class[]{Drawable.class, MotionEvent.class}, Void.TYPE);
                    } else if (drawable != null && motionEvent.getX() >= ((float) (getLeft() + getPaddingLeft())) && motionEvent.getX() <= ((float) (getLeft() + getPaddingLeft() + drawable.getBounds().width()))) {
                        setText("");
                    }
                } else {
                    a(drawable, motionEvent);
                }
            } else {
                a(getCompoundDrawables()[2], motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public SearchableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Drawable drawable, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{drawable, motionEvent}, this, f51036f, false, 51409, new Class[]{Drawable.class, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable, motionEvent}, this, f51036f, false, 51409, new Class[]{Drawable.class, MotionEvent.class}, Void.TYPE);
            return;
        }
        if (drawable != null && motionEvent.getX() <= ((float) (getWidth() - getPaddingRight())) && motionEvent.getX() >= ((float) ((getWidth() - getPaddingRight()) - drawable.getBounds().width()))) {
            setText("");
        }
    }

    public SearchableEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = a.a(getResources(), 2130838846);
        this.i = a.a(getResources(), 2130839029);
        if (Build.VERSION.SDK_INT >= 19) {
            this.h.setAutoMirrored(true);
            this.i.setAutoMirrored(true);
        }
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), rect}, this, f51036f, false, 51406, new Class[]{Boolean.TYPE, Integer.TYPE, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), rect}, this, f51036f, false, 51406, new Class[]{Boolean.TYPE, Integer.TYPE, Rect.class}, Void.TYPE);
            return;
        }
        super.onFocusChanged(z, i2, rect);
        if (z && getText().length() > 0) {
            z2 = true;
        }
        a(z2);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f51036f, false, 51405, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f51036f, false, 51405, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onTextChanged(charSequence, i2, i3, i4);
        if (isFocused() && charSequence.length() > 0) {
            z = true;
        }
        a(z);
    }
}
