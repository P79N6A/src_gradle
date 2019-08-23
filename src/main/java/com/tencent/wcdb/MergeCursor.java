package com.tencent.wcdb;

import android.database.ContentObserver;
import android.database.DataSetObserver;

public class MergeCursor extends AbstractCursor {
    private Cursor mCursor;
    private Cursor[] mCursors;
    private DataSetObserver mObserver = new DataSetObserver() {
        public void onChanged() {
            MergeCursor.this.mPos = -1;
        }

        public void onInvalidated() {
            MergeCursor.this.mPos = -1;
        }
    };

    public String[] getColumnNames() {
        if (this.mCursor != null) {
            return this.mCursor.getColumnNames();
        }
        return new String[0];
    }

    public void close() {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            if (this.mCursors[i] != null) {
                this.mCursors[i].close();
            }
        }
        super.close();
    }

    public void deactivate() {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            if (this.mCursors[i] != null) {
                this.mCursors[i].deactivate();
            }
        }
        super.deactivate();
    }

    public int getCount() {
        int length = this.mCursors.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.mCursors[i2] != null) {
                i += this.mCursors[i2].getCount();
            }
        }
        return i;
    }

    public boolean requery() {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            if (this.mCursors[i] != null && !this.mCursors[i].requery()) {
                return false;
            }
        }
        return true;
    }

    public byte[] getBlob(int i) {
        return this.mCursor.getBlob(i);
    }

    public double getDouble(int i) {
        return this.mCursor.getDouble(i);
    }

    public float getFloat(int i) {
        return this.mCursor.getFloat(i);
    }

    public int getInt(int i) {
        return this.mCursor.getInt(i);
    }

    public long getLong(int i) {
        return this.mCursor.getLong(i);
    }

    public short getShort(int i) {
        return this.mCursor.getShort(i);
    }

    public String getString(int i) {
        return this.mCursor.getString(i);
    }

    public int getType(int i) {
        return this.mCursor.getType(i);
    }

    public boolean isNull(int i) {
        return this.mCursor.isNull(i);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            if (this.mCursors[i] != null) {
                this.mCursors[i].registerContentObserver(contentObserver);
            }
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            if (this.mCursors[i] != null) {
                this.mCursors[i].registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            if (this.mCursors[i] != null) {
                this.mCursors[i].unregisterContentObserver(contentObserver);
            }
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        int length = this.mCursors.length;
        for (int i = 0; i < length; i++) {
            if (this.mCursors[i] != null) {
                this.mCursors[i].unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public MergeCursor(Cursor[] cursorArr) {
        this.mCursors = cursorArr;
        this.mCursor = cursorArr[0];
        for (int i = 0; i < this.mCursors.length; i++) {
            if (this.mCursors[i] != null) {
                this.mCursors[i].registerDataSetObserver(this.mObserver);
            }
        }
    }

    public boolean onMove(int i, int i2) {
        this.mCursor = null;
        int length = this.mCursors.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (this.mCursors[i3] != null) {
                if (i2 < this.mCursors[i3].getCount() + i4) {
                    this.mCursor = this.mCursors[i3];
                    break;
                }
                i4 += this.mCursors[i3].getCount();
            }
            i3++;
        }
        if (this.mCursor != null) {
            return this.mCursor.moveToPosition(i2 - i4);
        }
        return false;
    }
}
