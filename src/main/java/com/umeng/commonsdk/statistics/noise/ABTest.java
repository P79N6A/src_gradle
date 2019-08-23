package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;

public class ABTest implements d {
    private static ABTest instance;
    private Context context;
    private boolean isInTest;
    private int mGroup = -1;
    private int mInterval = -1;
    private String mPoli;
    private int mPolicy = -1;
    private float mProb07;
    private float mProb13;

    public int getGroup() {
        return this.mGroup;
    }

    public int getTestInterval() {
        return this.mInterval;
    }

    public String getTestName() {
        return this.mPoli;
    }

    public int getTestPolicy() {
        return this.mPolicy;
    }

    public boolean isInTest() {
        return this.isInTest;
    }

    public String getGroupInfo() {
        if (!this.isInTest) {
            return "error";
        }
        return String.valueOf(this.mGroup);
    }

    public String toString() {
        return " p13:" + this.mProb13 + " p07:" + this.mProb07 + " policy:" + this.mPolicy + " interval:" + this.mInterval;
    }

    public void onImprintChanged(ImprintHandler.a aVar) {
        onExperimentChanged(aVar.a("client_test", null), Integer.valueOf(aVar.a("test_report_interval", PushConstants.PUSH_TYPE_NOTIFY)).intValue());
    }

    public static synchronized ABTest getService(Context context2) {
        ABTest aBTest;
        synchronized (ABTest.class) {
            if (instance == null) {
                instance = new ABTest(context2, UMEnvelopeBuild.imprintProperty(context2, "client_test", null), Integer.valueOf(UMEnvelopeBuild.imprintProperty(context2, "test_report_interval", PushConstants.PUSH_TYPE_NOTIFY)).intValue());
            }
            aBTest = instance;
        }
        return aBTest;
    }

    public static boolean validate(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\|");
        if (split.length != 6) {
            return false;
        }
        if (split[0].startsWith("SIG7") && split[1].split(",").length == split[5].split(",").length) {
            return true;
        }
        if (split[0].startsWith("FIXED")) {
            int length = split[5].split(",").length;
            int parseInt = Integer.parseInt(split[1]);
            if (length < parseInt || parseInt <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void parseFIXED(String str) {
        int i;
        if (str != null) {
            String[] split = str.split("\\|");
            float f2 = 0.0f;
            if (split[2].equals("SIG13")) {
                f2 = Float.valueOf(split[3]).floatValue();
            }
            if (this.mProb13 > f2) {
                this.isInTest = false;
                return;
            }
            if (split[0].equals("FIXED")) {
                i = Integer.valueOf(split[1]).intValue();
            } else {
                i = -1;
            }
            int[] iArr = null;
            if (split[4].equals("RPT")) {
                this.mPoli = "RPT";
                String[] split2 = split[5].split(",");
                iArr = new int[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    iArr[i2] = Integer.valueOf(split2[i2]).intValue();
                }
            } else if (split[4].equals("DOM")) {
                this.mPoli = "DOM";
                this.isInTest = true;
                try {
                    String[] split3 = split[5].split(",");
                    int[] iArr2 = new int[split3.length];
                    int i3 = 0;
                    while (i3 < split3.length) {
                        try {
                            iArr2[i3] = Integer.valueOf(split3[i3]).intValue();
                            i3++;
                        } catch (Exception unused) {
                        }
                    }
                    iArr = iArr2;
                } catch (Exception unused2) {
                }
            }
            if (i != -1) {
                this.isInTest = true;
                this.mGroup = i;
                if (iArr != null) {
                    this.mPolicy = iArr[i - 1];
                }
            } else {
                this.isInTest = false;
            }
        }
    }

    private void parseSig7(String str) {
        float f2;
        float[] fArr;
        if (str != null) {
            String[] split = str.split("\\|");
            float f3 = 0.0f;
            if (split[2].equals("SIG13")) {
                f2 = Float.valueOf(split[3]).floatValue();
            } else {
                f2 = 0.0f;
            }
            if (this.mProb13 > f2) {
                this.isInTest = false;
                return;
            }
            int[] iArr = null;
            if (split[0].equals("SIG7")) {
                String[] split2 = split[1].split(",");
                fArr = new float[split2.length];
                for (int i = 0; i < split2.length; i++) {
                    fArr[i] = Float.valueOf(split2[i]).floatValue();
                }
            } else {
                fArr = null;
            }
            if (split[4].equals("RPT")) {
                this.mPoli = "RPT";
                String[] split3 = split[5].split(",");
                iArr = new int[split3.length];
                for (int i2 = 0; i2 < split3.length; i2++) {
                    iArr[i2] = Integer.valueOf(split3[i2]).intValue();
                }
            } else if (split[4].equals("DOM")) {
                this.isInTest = true;
                this.mPoli = "DOM";
                try {
                    String[] split4 = split[5].split(",");
                    int[] iArr2 = new int[split4.length];
                    int i3 = 0;
                    while (i3 < split4.length) {
                        try {
                            iArr2[i3] = Integer.valueOf(split4[i3]).intValue();
                            i3++;
                        } catch (Exception unused) {
                        }
                    }
                    iArr = iArr2;
                } catch (Exception unused2) {
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 >= fArr.length) {
                    i4 = -1;
                    break;
                }
                f3 += fArr[i4];
                if (this.mProb07 < f3) {
                    break;
                }
                i4++;
            }
            if (i4 != -1) {
                this.isInTest = true;
                this.mGroup = i4 + 1;
                if (iArr != null) {
                    this.mPolicy = iArr[i4];
                }
            } else {
                this.isInTest = false;
            }
        }
    }

    private float prob(String str, int i) {
        int i2 = i * 2;
        if (str == null) {
            return 0.0f;
        }
        return ((float) Integer.valueOf(str.substring(i2, i2 + 5), 16).intValue()) / 1048576.0f;
    }

    public void onExperimentChanged(String str, int i) {
        this.mInterval = i;
        String signature = Envelope.getSignature(this.context);
        if (TextUtils.isEmpty(signature) || TextUtils.isEmpty(str)) {
            this.isInTest = false;
            return;
        }
        try {
            this.mProb13 = prob(signature, 12);
            this.mProb07 = prob(signature, 6);
            if (str.startsWith("SIG7")) {
                parseSig7(str);
                return;
            }
            if (str.startsWith("FIXED")) {
                parseFIXED(str);
            }
        } catch (Exception e2) {
            this.isInTest = false;
            MLog.e("v:" + str, (Throwable) e2);
        }
    }

    private ABTest(Context context2, String str, int i) {
        this.context = context2;
        onExperimentChanged(str, i);
    }
}
