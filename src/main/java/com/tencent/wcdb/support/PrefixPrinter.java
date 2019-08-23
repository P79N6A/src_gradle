package com.tencent.wcdb.support;

import android.util.Printer;

public class PrefixPrinter implements Printer {
    private final String mPrefix;
    private final Printer mPrinter;

    public void println(String str) {
        Printer printer = this.mPrinter;
        printer.println(this.mPrefix + str);
    }

    private PrefixPrinter(Printer printer, String str) {
        this.mPrinter = printer;
        this.mPrefix = str;
    }

    public static Printer create(Printer printer, String str) {
        if (str == null || str.equals("")) {
            return printer;
        }
        return new PrefixPrinter(printer, str);
    }
}
