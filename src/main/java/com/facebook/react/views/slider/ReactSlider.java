package com.facebook.react.views.slider;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import javax.annotation.Nullable;

public class ReactSlider extends SeekBar {
    private static int DEFAULT_TOTAL_STEPS = 128;
    private double mMaxValue;
    private double mMinValue;
    private double mStep;
    private double mStepCalculated;
    private double mValue;

    private double getStepValue() {
        if (this.mStep > 0.0d) {
            return this.mStep;
        }
        return this.mStepCalculated;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.mMaxValue - this.mMinValue) / getStepValue());
    }

    private void updateValue() {
        double d2 = (this.mValue - this.mMinValue) / (this.mMaxValue - this.mMinValue);
        double totalSteps = (double) getTotalSteps();
        Double.isNaN(totalSteps);
        setProgress((int) Math.round(d2 * totalSteps));
    }

    private void updateAll() {
        if (this.mStep == 0.0d) {
            double d2 = this.mMaxValue - this.mMinValue;
            double d3 = (double) DEFAULT_TOTAL_STEPS;
            Double.isNaN(d3);
            this.mStepCalculated = d2 / d3;
        }
        setMax(getTotalSteps());
        updateValue();
    }

    /* access modifiers changed from: package-private */
    public void setMaxValue(double d2) {
        this.mMaxValue = d2;
        updateAll();
    }

    /* access modifiers changed from: package-private */
    public void setMinValue(double d2) {
        this.mMinValue = d2;
        updateAll();
    }

    /* access modifiers changed from: package-private */
    public void setStep(double d2) {
        this.mStep = d2;
        updateAll();
    }

    /* access modifiers changed from: package-private */
    public void setValue(double d2) {
        this.mValue = d2;
        updateValue();
    }

    public double toRealProgress(int i) {
        if (i == getMax()) {
            return this.mMaxValue;
        }
        double d2 = (double) i;
        double stepValue = getStepValue();
        Double.isNaN(d2);
        return (d2 * stepValue) + this.mMinValue;
    }

    public ReactSlider(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
