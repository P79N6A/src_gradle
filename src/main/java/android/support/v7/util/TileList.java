package android.support.v7.util;

import android.util.SparseArray;
import java.lang.reflect.Array;

public class TileList<T> {
    Tile<T> mLastAccessedTile;
    final int mTileSize;
    private final SparseArray<Tile<T>> mTiles = new SparseArray<>(10);

    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        Tile<T> mNext;
        public int mStartPosition;

        /* access modifiers changed from: package-private */
        public T getByPosition(int i) {
            return this.mItems[i - this.mStartPosition];
        }

        /* access modifiers changed from: package-private */
        public boolean containsPosition(int i) {
            if (this.mStartPosition > i || i >= this.mStartPosition + this.mItemCount) {
                return false;
            }
            return true;
        }

        public Tile(Class<T> cls, int i) {
            this.mItems = (Object[]) Array.newInstance(cls, i);
        }
    }

    public void clear() {
        this.mTiles.clear();
    }

    public int size() {
        return this.mTiles.size();
    }

    public TileList(int i) {
        this.mTileSize = i;
    }

    public Tile<T> getAtIndex(int i) {
        return this.mTiles.valueAt(i);
    }

    public Tile<T> removeAtPos(int i) {
        Tile<T> tile = this.mTiles.get(i);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i);
        return tile;
    }

    public Tile<T> addOrReplace(Tile<T> tile) {
        int indexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (indexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        Tile<T> valueAt = this.mTiles.valueAt(indexOfKey);
        this.mTiles.setValueAt(indexOfKey, tile);
        if (this.mLastAccessedTile == valueAt) {
            this.mLastAccessedTile = tile;
        }
        return valueAt;
    }

    public T getItemAt(int i) {
        if (this.mLastAccessedTile == null || !this.mLastAccessedTile.containsPosition(i)) {
            int indexOfKey = this.mTiles.indexOfKey(i - (i % this.mTileSize));
            if (indexOfKey < 0) {
                return null;
            }
            this.mLastAccessedTile = this.mTiles.valueAt(indexOfKey);
        }
        return this.mLastAccessedTile.getByPosition(i);
    }
}