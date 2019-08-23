package com.tt.miniapphost.process.data;

import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class CrossProcessInformation {

    public static class CallerProcess {
        private final int mCallerProcessCallbackId;
        private final String mCallerProcessIdentify;

        @AnyProcess
        public int getCallerProcessCallbackId() {
            return this.mCallerProcessCallbackId;
        }

        @AnyProcess
        public String getCallerProcessIdentify() {
            return this.mCallerProcessIdentify;
        }

        @AnyProcess
        public CallerProcess(String str, int i) {
            this.mCallerProcessIdentify = str;
            this.mCallerProcessCallbackId = i;
        }
    }
}
