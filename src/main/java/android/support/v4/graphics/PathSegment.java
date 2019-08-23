package android.support.v4.graphics;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.v4.util.Preconditions;

public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    @NonNull
    public final PointF getEnd() {
        return this.mEnd;
    }

    public final float getEndFraction() {
        return this.mEndFraction;
    }

    @NonNull
    public final PointF getStart() {
        return this.mStart;
    }

    public final float getStartFraction() {
        return this.mStartFraction;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.mStart.hashCode() * 31;
        int i2 = 0;
        if (this.mStartFraction != 0.0f) {
            i = Float.floatToIntBits(this.mStartFraction);
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.mEnd.hashCode()) * 31;
        if (this.mEndFraction != 0.0f) {
            i2 = Float.floatToIntBits(this.mEndFraction);
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        if (Float.compare(this.mStartFraction, pathSegment.mStartFraction) != 0 || Float.compare(this.mEndFraction, pathSegment.mEndFraction) != 0 || !this.mStart.equals(pathSegment.mStart) || !this.mEnd.equals(pathSegment.mEnd)) {
            return false;
        }
        return true;
    }

    public PathSegment(@NonNull PointF pointF, float f2, @NonNull PointF pointF2, float f3) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f2;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f3;
    }
}
