package com.ss.android.downloadlib.core.download;

public final class o extends Exception {
    private static final long serialVersionUID = -2378731952523070735L;
    private final int mFinalStatus;

    public final int getFinalStatus() {
        return this.mFinalStatus;
    }

    public o(int i, String str) {
        super(str);
        this.mFinalStatus = i;
    }

    public o(int i, Throwable th) {
        super(th);
        this.mFinalStatus = i;
    }

    public static o throwUnhandledHttpError(int i, String str) throws o {
        String str2 = "Unhandled HTTP response: " + i + " " + str;
        if (i >= 400 && i < 600) {
            throw new o(i, str2);
        } else if (i < 300 || i >= 400) {
            throw new o(494, str2);
        } else {
            throw new o(493, str2);
        }
    }

    public o(int i, String str, Throwable th) {
        super(str, th);
        this.mFinalStatus = i;
    }
}
