package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/Range;", "", "from", "", "to", "(II)V", "getFrom", "()I", "setFrom", "(I)V", "getTo", "setTo", "contains", "", "start", "end", "equals", "other", "getAnchorPosition", "value", "hashCode", "isEqual", "isWrappedBy", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class Range {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int from;
    private int to;

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.to;
    }

    public final int hashCode() {
        return (this.from * 31) + this.to;
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    public final void setTo(int i) {
        this.to = i;
    }

    public final int getAnchorPosition(int i) {
        if ((i - this.from) - (this.to - i) >= 0) {
            return this.to;
        }
        return this.from;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (this.from == range.from && this.to == range.to) {
            return true;
        }
        return false;
    }

    public Range(int i, int i2) {
        this.from = i;
        this.to = i2;
    }

    public final boolean contains(int i, int i2) {
        if (this.from > i || this.to < i2) {
            return false;
        }
        return true;
    }

    public final boolean isEqual(int i, int i2) {
        if ((this.from == i && this.to == i2) || (this.from == i2 && this.to == i)) {
            return true;
        }
        return false;
    }

    public final boolean isWrappedBy(int i, int i2) {
        int i3 = this.from + 1;
        int i4 = this.to;
        if (i3 > i || i4 <= i) {
            int i5 = this.from + 1;
            int i6 = this.to;
            if (i5 > i2 || i6 <= i2) {
                return false;
            }
        }
        return true;
    }
}
