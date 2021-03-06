package com.taobao.accs;

import java.io.PrintStream;
import java.io.PrintWriter;

public class AccsException extends Exception {
    private int mErrorCode;

    public AccsException(String str) {
        super(str);
    }

    public AccsException(int i) {
        this.mErrorCode = i;
    }

    public void printStackTrace(PrintStream printStream) {
        printStream.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        printWriter.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printWriter);
    }

    public AccsException(String str, int i) {
        super(str);
        this.mErrorCode = i;
    }

    public AccsException(Throwable th, int i) {
        super(th);
        this.mErrorCode = i;
    }

    public AccsException(String str, Throwable th, int i) {
        super(str, th);
        this.mErrorCode = i;
    }
}
