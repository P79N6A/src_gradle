package com.bytedance.common.utility;

import android.os.Looper;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class LooperPrinterUtils {
    public static int MAX_COUNT = 5;
    private static boolean isInit;
    public static PrinterListener sListener;
    private static Printer sOriginPrinter;
    private static PrinterWrapper sPrinterWrapper;

    public interface PrinterListener {
        void onDuration(long j);
    }

    static class PrinterWrapper implements Printer {
        boolean haveAdd = false;
        boolean haveRemove = false;
        List<Printer> mAddPrinters = new ArrayList();
        List<Printer> mPrinters = new ArrayList();
        List<Printer> mRemovePrinters = new ArrayList();

        PrinterWrapper() {
        }

        public void println(String str) {
            long j;
            if (LooperPrinterUtils.sListener != null) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            if (str.startsWith(">>>>> Dispatching") && this.haveAdd) {
                for (Printer next : this.mAddPrinters) {
                    if (!this.mPrinters.contains(next)) {
                        this.mPrinters.add(next);
                    }
                }
                this.mAddPrinters.clear();
                this.haveAdd = false;
            }
            this.mPrinters.size();
            for (Printer next2 : this.mPrinters) {
                if (next2 != null) {
                    next2.println(str);
                }
            }
            if (str.startsWith("<<<<< Finished") && this.haveRemove) {
                for (Printer next3 : this.mRemovePrinters) {
                    this.mPrinters.remove(next3);
                    this.mAddPrinters.remove(next3);
                }
                this.mRemovePrinters.clear();
                this.haveRemove = false;
            }
            if (LooperPrinterUtils.sListener != null && j > 0) {
                LooperPrinterUtils.sListener.onDuration(System.currentTimeMillis() - j);
            }
        }
    }

    public static List<Printer> getPrinters() {
        if (sPrinterWrapper != null) {
            return sPrinterWrapper.mPrinters;
        }
        return null;
    }

    private static Printer getCurrentPrinter() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void release() {
        if (isInit) {
            isInit = false;
            Looper.getMainLooper().setMessageLogging(sOriginPrinter);
            sPrinterWrapper = null;
        }
    }

    public static void init() {
        if (!isInit) {
            isInit = true;
            sPrinterWrapper = new PrinterWrapper();
            Printer currentPrinter = getCurrentPrinter();
            sOriginPrinter = currentPrinter;
            if (currentPrinter != null) {
                sPrinterWrapper.mPrinters.add(sOriginPrinter);
            }
            Looper.getMainLooper().setMessageLogging(sPrinterWrapper);
        }
    }

    public static void setMaxCount(int i) {
        MAX_COUNT = i;
    }

    public static void setPrinterLisnter(PrinterListener printerListener) {
        sListener = printerListener;
    }

    public static void addMessageLogging(Printer printer) {
        if (printer != null && !sPrinterWrapper.mAddPrinters.contains(printer)) {
            sPrinterWrapper.mAddPrinters.add(printer);
            sPrinterWrapper.haveAdd = true;
        }
    }

    public static void removeMessageLogging(Printer printer) {
        if (printer != null && !sPrinterWrapper.mRemovePrinters.contains(printer)) {
            sPrinterWrapper.mRemovePrinters.add(printer);
            sPrinterWrapper.haveRemove = true;
        }
    }
}
