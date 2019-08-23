package com.huawei.emui.hiexperience.iaware.sdk.appsdk;

public class IAwareAppSdk {
    private AppCallBack AppCbk = new AppCallBack() {
        public void getPhoneInfo(String str) {
            IAwareAppSdk.this.mPhoneInfo = str;
        }
    };
    private IAwareAppSdkAdapter mIAwareAppSdkAdapter;
    public String mPhoneInfo = "";
    private boolean registerStatus;

    public interface AppCallBack {
        void getPhoneInfo(String str);
    }

    public boolean registerApp(String str) {
        return registerApp(str, this.AppCbk);
    }

    public void addVipThreads(long[] jArr) {
        if (jArr != null && jArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("\"IFID\":1001,\"vipThreads\":[");
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                String l = Long.toString(jArr[i]);
                if (i == length - 1) {
                    sb.append(l);
                } else {
                    sb.append(l + ",");
                }
            }
            sb.append("]");
            if (sb.length() <= 256 && this.mIAwareAppSdkAdapter != null) {
                this.mIAwareAppSdkAdapter.reportVip(sb.toString());
            }
        }
    }

    public void cancelVipThreads(long[] jArr) {
        if (jArr != null && jArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("\"IFID\":1002,\"vipThreads\":[");
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                String l = Long.toString(jArr[i]);
                if (i == length - 1) {
                    sb.append(l);
                } else {
                    sb.append(l + ",");
                }
            }
            sb.append("]");
            if (sb.length() <= 256 && this.mIAwareAppSdkAdapter != null) {
                this.mIAwareAppSdkAdapter.reportVip(sb.toString());
            }
        }
    }

    private boolean registerApp(String str, AppCallBack appCallBack) {
        if (str == null || str.length() <= 0 || appCallBack == null) {
            return false;
        }
        if (this.mIAwareAppSdkAdapter == null) {
            this.mIAwareAppSdkAdapter = new IAwareAppSdkAdapter();
            this.registerStatus = this.mIAwareAppSdkAdapter.registerAppCallback(str, appCallBack);
        }
        return this.registerStatus;
    }

    public void notifyAppScene(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"IFID\":1000");
        String num = Integer.toString(i);
        String num2 = Integer.toString(i2);
        sb.append(",\"scene\":");
        sb.append(num);
        sb.append(",\"status\":");
        sb.append(num2);
        if (sb.length() <= 256 && this.mIAwareAppSdkAdapter != null) {
            this.mIAwareAppSdkAdapter.reportScene(sb.toString());
        }
    }
}
