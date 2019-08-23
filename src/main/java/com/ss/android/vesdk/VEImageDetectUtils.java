package com.ss.android.vesdk;

import android.os.Build;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.ttve.nativePort.b;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.List;

@Keep
public class VEImageDetectUtils {
    public static final String TAG = "VEImageDetectUtils";
    private IDetectImageResultListener mDetectResultListener;
    private boolean mInterruptDetectImageContent = true;
    private long mNativeHandler;

    @Keep
    public interface IDetectImageResultListener {
        void onDetectResult(String str, String str2, String str3, boolean z);
    }

    private native int nativeDestroy(long j);

    private native int nativeDetectImageContent(long j, String str, String str2, String[] strArr);

    private native long nativeInit(int i, int i2, String str, String str2, boolean z);

    static {
        b.a();
    }

    public synchronized void stopDetectImagesContentIfNeed() {
        this.mInterruptDetectImageContent = true;
    }

    public int init() {
        long nativeInit = nativeInit(0, 0, VERuntime.a().f78083e.a(), Build.DEVICE, false);
        if (nativeInit == 0) {
            return -1;
        }
        this.mNativeHandler = nativeInit;
        return 0;
    }

    public int destroy() {
        if (this.mNativeHandler == 0) {
            y.c(TAG, "invoke destroy() encounter handler == 0. Consider destroy() has been called already?");
            return -1;
        }
        int nativeDestroy = nativeDestroy(this.mNativeHandler);
        if (nativeDestroy == 0) {
            this.mNativeHandler = 0;
            y.a(TAG, "NativeHandler destroy succeed.");
        }
        this.mDetectResultListener = null;
        return nativeDestroy;
    }

    public void setDetectImageContentListener(@Nullable IDetectImageResultListener iDetectImageResultListener) {
        this.mDetectResultListener = iDetectImageResultListener;
    }

    public int detectImageContent(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        if (!new File(str2).exists()) {
            String str3 = TAG;
            y.d(str3, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            return -100;
        } else if (list.isEmpty()) {
            y.c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return -100;
        } else {
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return nativeDetectImageContent(this.mNativeHandler, str, str2, strArr);
        }
    }

    public void detectImagesContent(@NonNull String str, @NonNull List<String> list, @NonNull List<String> list2) {
        int i;
        synchronized (this) {
            this.mInterruptDetectImageContent = false;
        }
        if (list2.isEmpty()) {
            y.c(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i = 0; i < size && !this.mInterruptDetectImageContent; i++) {
            String str2 = list.get(i);
            if (!new File(str2).exists()) {
                String str3 = TAG;
                y.d(str3, "Illegal argument. file: \"" + str2 + "\" is not exist.");
            } else {
                nativeDetectImageContent(this.mNativeHandler, str, list.get(i), strArr);
            }
        }
    }

    @Keep
    public void onNativeCallback_onDetectImageContent(String str, String str2, String str3, boolean z) {
        if (this.mDetectResultListener != null) {
            this.mDetectResultListener.onDetectResult(str, str2, str3, z);
        } else {
            y.c(TAG, "Native callback onDetectImageContent encounter no listener handle?");
        }
    }
}
