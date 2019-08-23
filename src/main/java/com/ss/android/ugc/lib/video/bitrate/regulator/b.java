package com.ss.android.ugc.lib.video.bitrate.regulator;

import com.meituan.robust.ChangeQuickRedirect;

public final class b extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int code;
    private d shiftInfo;

    public final int getCode() {
        return this.code;
    }

    public final d getShiftInfo() {
        return this.shiftInfo;
    }

    public final void setShiftInfo(d dVar) {
        this.shiftInfo = dVar;
    }

    public b(int i, String str) {
        super(str);
        this.code = i;
    }
}
