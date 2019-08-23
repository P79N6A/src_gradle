package com.tencent.wcdb;

import android.database.CharArrayBuffer;

public abstract class AbstractWindowedCursor extends AbstractCursor {
    protected CursorWindow mWindow;

    public CursorWindow getWindow() {
        return this.mWindow;
    }

    public boolean hasWindow() {
        if (this.mWindow != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDeactivateOrClose() {
        super.onDeactivateOrClose();
        closeWindow();
    }

    /* access modifiers changed from: protected */
    public void checkPosition() {
        super.checkPosition();
        if (this.mWindow == null) {
            throw new StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    /* access modifiers changed from: protected */
    public void closeWindow() {
        if (this.mWindow != null) {
            this.mWindow.close();
            this.mWindow = null;
        }
    }

    public byte[] getBlob(int i) {
        checkPosition();
        return this.mWindow.getBlob(this.mPos, i);
    }

    public double getDouble(int i) {
        checkPosition();
        return this.mWindow.getDouble(this.mPos, i);
    }

    public float getFloat(int i) {
        checkPosition();
        return this.mWindow.getFloat(this.mPos, i);
    }

    public int getInt(int i) {
        checkPosition();
        return this.mWindow.getInt(this.mPos, i);
    }

    public long getLong(int i) {
        checkPosition();
        return this.mWindow.getLong(this.mPos, i);
    }

    public short getShort(int i) {
        checkPosition();
        return this.mWindow.getShort(this.mPos, i);
    }

    public String getString(int i) {
        checkPosition();
        return this.mWindow.getString(this.mPos, i);
    }

    public int getType(int i) {
        checkPosition();
        return this.mWindow.getType(this.mPos, i);
    }

    @Deprecated
    public boolean isBlob(int i) {
        if (getType(i) == 4) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isFloat(int i) {
        if (getType(i) == 2) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLong(int i) {
        if (getType(i) == 1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isString(int i) {
        if (getType(i) == 3) {
            return true;
        }
        return false;
    }

    public void setWindow(CursorWindow cursorWindow) {
        if (cursorWindow != this.mWindow) {
            closeWindow();
            this.mWindow = cursorWindow;
        }
    }

    /* access modifiers changed from: protected */
    public void clearOrCreateWindow(String str) {
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(str);
        } else {
            this.mWindow.clear();
        }
    }

    public boolean isNull(int i) {
        checkPosition();
        if (this.mWindow.getType(this.mPos, i) == 0) {
            return true;
        }
        return false;
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        checkPosition();
        this.mWindow.copyStringToBuffer(this.mPos, i, charArrayBuffer);
    }
}
