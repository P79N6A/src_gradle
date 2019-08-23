package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class LayoutState {
    int mAvailable;
    int mCurrentPosition;
    int mEndLine;
    boolean mInfinite;
    int mItemDirection;
    int mLayoutDirection;
    boolean mRecycle = true;
    int mStartLine;
    boolean mStopInFocusable;

    LayoutState() {
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.mAvailable + ", mCurrentPosition=" + this.mCurrentPosition + ", mItemDirection=" + this.mItemDirection + ", mLayoutDirection=" + this.mLayoutDirection + ", mStartLine=" + this.mStartLine + ", mEndLine=" + this.mEndLine + '}';
    }

    /* access modifiers changed from: package-private */
    public boolean hasMore(RecyclerView.State state) {
        if (this.mCurrentPosition < 0 || this.mCurrentPosition >= state.getItemCount()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public View next(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }
}
