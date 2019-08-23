package android.support.v7.widget;

public class RtlSpacingHelper {
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft;
    private int mExplicitRight;
    private boolean mIsRelative;
    private boolean mIsRtl;
    private int mLeft;
    private int mRight;
    private int mStart = Integer.MIN_VALUE;

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    RtlSpacingHelper() {
    }

    public int getEnd() {
        if (this.mIsRtl) {
            return this.mLeft;
        }
        return this.mRight;
    }

    public int getStart() {
        if (this.mIsRtl) {
            return this.mRight;
        }
        return this.mLeft;
    }

    public void setDirection(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z != this.mIsRtl) {
            this.mIsRtl = z;
            if (!this.mIsRelative) {
                this.mLeft = this.mExplicitLeft;
                this.mRight = this.mExplicitRight;
            } else if (z) {
                if (this.mEnd != Integer.MIN_VALUE) {
                    i3 = this.mEnd;
                } else {
                    i3 = this.mExplicitLeft;
                }
                this.mLeft = i3;
                if (this.mStart != Integer.MIN_VALUE) {
                    i4 = this.mStart;
                } else {
                    i4 = this.mExplicitRight;
                }
                this.mRight = i4;
            } else {
                if (this.mStart != Integer.MIN_VALUE) {
                    i = this.mStart;
                } else {
                    i = this.mExplicitLeft;
                }
                this.mLeft = i;
                if (this.mEnd != Integer.MIN_VALUE) {
                    i2 = this.mEnd;
                } else {
                    i2 = this.mExplicitRight;
                }
                this.mRight = i2;
            }
        }
    }

    public void setAbsolute(int i, int i2) {
        this.mIsRelative = false;
        if (i != Integer.MIN_VALUE) {
            this.mExplicitLeft = i;
            this.mLeft = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mExplicitRight = i2;
            this.mRight = i2;
        }
    }

    public void setRelative(int i, int i2) {
        this.mStart = i;
        this.mEnd = i2;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i2 != Integer.MIN_VALUE) {
                this.mLeft = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.mRight = i;
            }
        } else {
            if (i != Integer.MIN_VALUE) {
                this.mLeft = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.mRight = i2;
            }
        }
    }
}
