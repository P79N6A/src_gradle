package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

public class SpringAnimation extends AnimationDriver {
    private int mCurrentLoop;
    private final PhysicsState mCurrentState = new PhysicsState();
    private double mDisplacementFromRestThreshold;
    private double mEndValue;
    private double mInitialVelocity;
    private int mIterations;
    private long mLastTime;
    private double mOriginalValue;
    private boolean mOvershootClampingEnabled;
    private double mRestSpeedThreshold;
    private double mSpringDamping;
    private double mSpringMass;
    private boolean mSpringStarted;
    private double mSpringStiffness;
    private double mStartValue;
    private double mTimeAccumulator;

    static class PhysicsState {
        double position;
        double velocity;

        private PhysicsState() {
        }
    }

    private boolean isAtRest() {
        if (Math.abs(this.mCurrentState.velocity) > this.mRestSpeedThreshold || (getDisplacementDistanceForState(this.mCurrentState) > this.mDisplacementFromRestThreshold && this.mSpringStiffness != 0.0d)) {
            return false;
        }
        return true;
    }

    private boolean isOvershooting() {
        if (this.mSpringStiffness <= 0.0d || ((this.mStartValue >= this.mEndValue || this.mCurrentState.position <= this.mEndValue) && (this.mStartValue <= this.mEndValue || this.mCurrentState.position >= this.mEndValue))) {
            return false;
        }
        return true;
    }

    private double getDisplacementDistanceForState(PhysicsState physicsState) {
        return Math.abs(this.mEndValue - physicsState.position);
    }

    SpringAnimation(ReadableMap readableMap) {
        this.mCurrentState.velocity = readableMap.getDouble("initialVelocity");
        resetConfig(readableMap);
    }

    public void resetConfig(ReadableMap readableMap) {
        int i;
        this.mSpringStiffness = readableMap.getDouble("stiffness");
        this.mSpringDamping = readableMap.getDouble("damping");
        this.mSpringMass = readableMap.getDouble("mass");
        this.mInitialVelocity = this.mCurrentState.velocity;
        this.mEndValue = readableMap.getDouble("toValue");
        this.mRestSpeedThreshold = readableMap.getDouble("restSpeedThreshold");
        this.mDisplacementFromRestThreshold = readableMap.getDouble("restDisplacementThreshold");
        this.mOvershootClampingEnabled = readableMap.getBoolean("overshootClamping");
        boolean z = true;
        if (readableMap.hasKey("iterations")) {
            i = readableMap.getInt("iterations");
        } else {
            i = 1;
        }
        this.mIterations = i;
        if (this.mIterations != 0) {
            z = false;
        }
        this.mHasFinished = z;
        this.mCurrentLoop = 0;
        this.mTimeAccumulator = 0.0d;
        this.mSpringStarted = false;
    }

    public void runAnimationStep(long j) {
        long j2 = j / 1000000;
        if (!this.mSpringStarted) {
            if (this.mCurrentLoop == 0) {
                this.mOriginalValue = this.mAnimatedValue.mValue;
                this.mCurrentLoop = 1;
            }
            PhysicsState physicsState = this.mCurrentState;
            double d2 = this.mAnimatedValue.mValue;
            physicsState.position = d2;
            this.mStartValue = d2;
            this.mLastTime = j2;
            this.mTimeAccumulator = 0.0d;
            this.mSpringStarted = true;
        }
        double d3 = (double) (j2 - this.mLastTime);
        Double.isNaN(d3);
        advance(d3 / 1000.0d);
        this.mLastTime = j2;
        this.mAnimatedValue.mValue = this.mCurrentState.position;
        if (isAtRest()) {
            if (this.mIterations == -1 || this.mCurrentLoop < this.mIterations) {
                this.mSpringStarted = false;
                this.mAnimatedValue.mValue = this.mOriginalValue;
                this.mCurrentLoop++;
                return;
            }
            this.mHasFinished = true;
        }
    }

    private void advance(double d2) {
        double d3;
        double d4;
        if (!isAtRest()) {
            double d5 = 0.064d;
            if (d2 <= 0.064d) {
                d5 = d2;
            }
            this.mTimeAccumulator += d5;
            double d6 = this.mSpringDamping;
            double d7 = this.mSpringMass;
            double d8 = this.mSpringStiffness;
            double d9 = -this.mInitialVelocity;
            double sqrt = d6 / (Math.sqrt(d8 * d7) * 2.0d);
            double sqrt2 = Math.sqrt(d8 / d7);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d10 = this.mEndValue - this.mStartValue;
            double d11 = this.mTimeAccumulator;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d11);
                double d12 = sqrt * sqrt2;
                double d13 = d9 + (d12 * d10);
                double d14 = d11 * sqrt3;
                double sin = this.mEndValue - ((((d13 / sqrt3) * Math.sin(d14)) + (Math.cos(d14) * d10)) * exp);
                d4 = ((d12 * exp) * (((Math.sin(d14) * d13) / sqrt3) + (Math.cos(d14) * d10))) - (((Math.cos(d14) * d13) - ((sqrt3 * d10) * Math.sin(d14))) * exp);
                d3 = sin;
            } else {
                double exp2 = Math.exp((-sqrt2) * d11);
                d3 = this.mEndValue - (((((sqrt2 * d10) + d9) * d11) + d10) * exp2);
                d4 = exp2 * ((d9 * ((d11 * sqrt2) - 1.0d)) + (d11 * d10 * sqrt2 * sqrt2));
            }
            this.mCurrentState.position = d3;
            this.mCurrentState.velocity = d4;
            if (isAtRest() || (this.mOvershootClampingEnabled && isOvershooting())) {
                if (this.mSpringStiffness > 0.0d) {
                    this.mStartValue = this.mEndValue;
                    this.mCurrentState.position = this.mEndValue;
                } else {
                    this.mEndValue = this.mCurrentState.position;
                    this.mStartValue = this.mEndValue;
                }
                this.mCurrentState.velocity = 0.0d;
            }
        }
    }
}
