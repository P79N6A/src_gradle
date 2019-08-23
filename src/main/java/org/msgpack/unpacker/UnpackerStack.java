package org.msgpack.unpacker;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import org.msgpack.c;

public final class UnpackerStack {
    private int[] counts = new int[SearchJediMixFeedAdapter.f42517f];
    public int top;
    private byte[] types = new byte[SearchJediMixFeedAdapter.f42517f];

    public final int getTopCount() {
        return this.counts[this.top];
    }

    public final void pop() {
        this.top--;
    }

    public final void reduceCount() {
        int[] iArr = this.counts;
        int i = this.top;
        iArr[i] = iArr[i] - 1;
    }

    public final boolean topIsArray() {
        if (this.types[this.top] == 1) {
            return true;
        }
        return false;
    }

    public final boolean topIsMap() {
        if (this.types[this.top] == 2) {
            return true;
        }
        return false;
    }

    public UnpackerStack() {
        this.types[0] = 0;
    }

    public final void checkCount() {
        if (this.counts[this.top] <= 0) {
            if (this.types[this.top] == 1) {
                throw new c("Array is end but readArrayEnd() is not called");
            } else if (this.types[this.top] == 2) {
                throw new c("Map is end but readMapEnd() is not called");
            }
        }
    }

    public final void pushArray(int i) {
        this.top++;
        this.types[this.top] = 1;
        this.counts[this.top] = i;
    }

    public final void pushMap(int i) {
        this.top++;
        this.types[this.top] = 2;
        this.counts[this.top] = i * 2;
    }
}
