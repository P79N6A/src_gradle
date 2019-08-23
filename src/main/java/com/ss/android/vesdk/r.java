package com.ss.android.vesdk;

public final class r extends RuntimeException {
    private String msgDes;
    private int ret;

    public final String getMsgDes() {
        return this.msgDes;
    }

    public final int getRetCd() {
        return this.ret;
    }

    public r(int i, String str) {
        super("VESDK exception ret: " + i + "msg: " + str);
        this.ret = i;
        this.msgDes = str;
    }
}
