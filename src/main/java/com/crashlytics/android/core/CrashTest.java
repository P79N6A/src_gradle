package com.crashlytics.android.core;

import android.os.AsyncTask;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class CrashTest {
    public int stackOverflow() {
        return stackOverflow() + ((int) Math.random());
    }

    public void indexOutOfBounds() {
        new StringBuilder("Out of bounds value: ").append(new int[2][10]);
    }

    public void throwFiveChainedExceptions() {
        try {
            privateMethodThatThrowsException(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (Exception e2) {
            throw new RuntimeException(PushConstants.PUSH_TYPE_UPLOAD_LOG, e2);
        } catch (Exception e3) {
            try {
                throw new RuntimeException("3", e3);
            } catch (Exception e4) {
                try {
                    throw new RuntimeException(PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION, e4);
                } catch (Exception e5) {
                    throw new RuntimeException("5", e5);
                }
            }
        }
    }

    private void privateMethodThatThrowsException(String str) {
        throw new RuntimeException(str);
    }

    public void throwRuntimeException(String str) {
        throw new RuntimeException(str);
    }

    public void crashAsyncTask(final long j) {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                }
                CrashTest.this.throwRuntimeException("Background thread crash");
                return null;
            }
        }.execute(new Void[]{null});
    }
}
