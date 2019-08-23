package com.alipay.b.b.a.a;

public final class c extends RuntimeException {
    private static final long serialVersionUID = -2875437994101380406L;
    private int mCode;
    private String mMsg;
    private String mOperationType;

    public c(Integer num, String str) {
        super(a(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public c(Integer num, String str, Throwable th) {
        super(a(num, str), th);
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public c(Integer num, Throwable th) {
        super(th);
        this.mCode = num.intValue();
    }

    public c(String str) {
        super(str);
        this.mMsg = str;
    }

    private static String a(Integer num, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("RPCException: ");
        if (num != null) {
            sb.append("[");
            sb.append(num);
            sb.append("]");
        }
        sb.append(" : ");
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    public final int getCode() {
        return this.mCode;
    }

    public final String getMsg() {
        return this.mMsg;
    }

    public final String getOperationType() {
        return this.mOperationType;
    }

    public final void setOperationType(String str) {
        this.mOperationType = str;
    }
}
