package com.ss.android.download;

public final class q extends Exception {
    private static final long serialVersionUID = -2378731952523070735L;
    private final int mFinalStatus;

    public final int getFinalStatus() {
        return this.mFinalStatus;
    }

    public q(int i, String str) {
        super(str);
        this.mFinalStatus = i;
    }

    public q(int i, Throwable th) {
        super(th);
        this.mFinalStatus = i;
    }

    public static q throwUnhandledHttpError(int i, String str) throws q {
        String str2 = "Unhandled HTTP response: " + i + " " + str;
        if (i >= 400 && i < 600) {
            throw new q(i, str2);
        } else if (i < 300 || i >= 400) {
            throw new q(494, str2);
        } else {
            throw new q(493, str2);
        }
    }

    public q(int i, String str, Throwable th) {
        super(str, th);
        this.mFinalStatus = i;
    }
}
