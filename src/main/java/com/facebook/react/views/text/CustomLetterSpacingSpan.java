package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

@TargetApi(21)
public class CustomLetterSpacingSpan extends MetricAffectingSpan {
    private final float mLetterSpacing;

    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }

    public CustomLetterSpacingSpan(float f2) {
        this.mLetterSpacing = f2;
    }

    private void apply(TextPaint textPaint) {
        if (!Float.isNaN(this.mLetterSpacing)) {
            textPaint.setLetterSpacing(this.mLetterSpacing / textPaint.getTextSize());
        }
    }
}