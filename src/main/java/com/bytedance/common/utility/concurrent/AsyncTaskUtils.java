package com.bytedance.common.utility.concurrent;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;

public class AsyncTaskUtils {
    static final BaseImpl IMPL;

    static class BaseImpl {
        private BaseImpl() {
        }

        public <T> void executeAsyncTask(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    @TargetApi(11)
    static class HoneyCombImpl extends BaseImpl {
        private HoneyCombImpl() {
            super();
        }

        public <T> void executeAsyncTask(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(TTExecutors.getNormalExecutor(), tArr);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneyCombImpl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static <T> void executeAsyncTask(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        IMPL.executeAsyncTask(asyncTask, tArr);
    }
}
