package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.f;
import com.umeng.commonsdk.proguard.s;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.b;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

public class Envelope {
    private final int CODEX_ENCRYPT = 1;
    private final int CODEX_NORMAL;
    private final byte[] SEED = {0, 0, 0, 0, 0, 0, 0, 0};
    private boolean encrypt;
    private byte[] identity;
    private String mAddress;
    private byte[] mChecksum;
    private byte[] mEntity;
    private byte[] mGuid;
    private int mLength;
    private int mSerialNo;
    private byte[] mSignature;
    private int mTimestamp;
    private String mVersion = "1.0";

    public String getSignature() {
        return DataHelper.toHexString(this.mSignature);
    }

    private byte[] genSignature() {
        return genGuid(this.SEED, (int) (System.currentTimeMillis() / 1000));
    }

    private byte[] genCheckSum() {
        return DataHelper.hash((DataHelper.toHexString(this.mSignature) + this.mSerialNo + this.mTimestamp + this.mLength + DataHelper.toHexString(this.mGuid)).getBytes());
    }

    public void seal() {
        if (this.mSignature == null) {
            this.mSignature = genSignature();
        }
        if (this.encrypt) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.mSignature, 1, bArr, 0, 16);
                this.mEntity = DataHelper.encrypt(this.mEntity, bArr);
            } catch (Exception unused) {
            }
        }
        this.mGuid = genGuid(this.mSignature, this.mTimestamp);
        this.mChecksum = genCheckSum();
    }

    public byte[] toBinary() {
        f fVar = new f();
        fVar.a(this.mVersion);
        fVar.b(this.mAddress);
        fVar.c(DataHelper.toHexString(this.mSignature));
        fVar.a(this.mSerialNo);
        fVar.b(this.mTimestamp);
        fVar.c(this.mLength);
        fVar.a(this.mEntity);
        fVar.d(this.encrypt ? 1 : 0);
        fVar.d(DataHelper.toHexString(this.mGuid));
        fVar.e(DataHelper.toHexString(this.mChecksum));
        try {
            return new s().a(fVar);
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return String.format("version : %s\n", new Object[]{this.mVersion}) + String.format("address : %s\n", new Object[]{this.mAddress}) + String.format("signature : %s\n", new Object[]{DataHelper.toHexString(this.mSignature)}) + String.format("serial : %s\n", new Object[]{Integer.valueOf(this.mSerialNo)}) + String.format("timestamp : %d\n", new Object[]{Integer.valueOf(this.mTimestamp)}) + String.format("length : %d\n", new Object[]{Integer.valueOf(this.mLength)}) + String.format("guid : %s\n", new Object[]{DataHelper.toHexString(this.mGuid)}) + String.format("checksum : %s ", new Object[]{DataHelper.toHexString(this.mChecksum)}) + String.format("codex : %d", new Object[]{Integer.valueOf(this.encrypt ? 1 : 0)});
    }

    public void setEncrypt(boolean z) {
        this.encrypt = z;
    }

    public void setSerialNumber(int i) {
        this.mSerialNo = i;
    }

    public void setSignature(String str) {
        this.mSignature = DataHelper.reverseHexString(str);
    }

    public static String getSignature(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("signature", null);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0074 A[Catch:{ Throwable -> 0x0090 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void export(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.mAddress
            java.lang.String r1 = "umid"
            r2 = 0
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r9, r1, r2)
            byte[] r2 = r8.mSignature
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r2)
            r3 = 16
            byte[] r4 = new byte[r3]
            byte[] r5 = r8.mSignature
            r6 = 2
            r7 = 0
            java.lang.System.arraycopy(r5, r6, r4, r7, r3)
            byte[] r3 = com.umeng.commonsdk.statistics.common.DataHelper.hash(r4)
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DataHelper.toHexString(r3)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x005f }
            r4.<init>()     // Catch:{ Throwable -> 0x005f }
            java.lang.String r5 = "appkey"
            r4.put(r5, r0)     // Catch:{ Throwable -> 0x005f }
            if (r1 == 0) goto L_0x0033
            java.lang.String r5 = "umid"
            r4.put(r5, r1)     // Catch:{ Throwable -> 0x005f }
        L_0x0033:
            java.lang.String r5 = "signature"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x005f }
            java.lang.String r2 = "checksum"
            r4.put(r2, r3)     // Catch:{ Throwable -> 0x005f }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x005f }
            java.io.File r3 = r9.getFilesDir()     // Catch:{ Throwable -> 0x005f }
            java.lang.String r5 = ".umeng"
            r2.<init>(r3, r5)     // Catch:{ Throwable -> 0x005f }
            boolean r3 = r2.exists()     // Catch:{ Throwable -> 0x005f }
            if (r3 != 0) goto L_0x0051
            r2.mkdir()     // Catch:{ Throwable -> 0x005f }
        L_0x0051:
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x005f }
            java.lang.String r5 = "exchangeIdentity.json"
            r3.<init>(r2, r5)     // Catch:{ Throwable -> 0x005f }
            java.lang.String r2 = r4.toString()     // Catch:{ Throwable -> 0x005f }
            com.umeng.commonsdk.statistics.common.HelperUtils.writeFile((java.io.File) r3, (java.lang.String) r2)     // Catch:{ Throwable -> 0x005f }
        L_0x005f:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0090 }
            r2.<init>()     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r3 = "appkey"
            r2.put(r3, r0)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r0 = "channel"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getChannel(r9)     // Catch:{ Throwable -> 0x0090 }
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x0090 }
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "umid"
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.HelperUtils.getUmengMD5(r1)     // Catch:{ Throwable -> 0x0090 }
            r2.put(r0, r1)     // Catch:{ Throwable -> 0x0090 }
        L_0x007d:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0090 }
            java.io.File r9 = r9.getFilesDir()     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r1 = "exid.dat"
            r0.<init>(r9, r1)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r9 = r2.toString()     // Catch:{ Throwable -> 0x0090 }
            com.umeng.commonsdk.statistics.common.HelperUtils.writeFile((java.io.File) r0, (java.lang.String) r9)     // Catch:{ Throwable -> 0x0090 }
            return
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.Envelope.export(android.content.Context):void");
    }

    private byte[] genGuid(byte[] bArr, int i) {
        byte[] hash = DataHelper.hash(this.identity);
        byte[] hash2 = DataHelper.hash(this.mEntity);
        int length = hash.length;
        byte[] bArr2 = new byte[(length * 2)];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr2[i3] = hash2[i2];
            bArr2[i3 + 1] = hash[i2];
        }
        for (int i4 = 0; i4 < 2; i4++) {
            bArr2[i4] = bArr[i4];
            bArr2[(bArr2.length - i4) - 1] = bArr[(bArr.length - i4) - 1];
        }
        byte[] bArr3 = {(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) (i >>> 24)};
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            bArr2[i5] = (byte) (bArr2[i5] ^ bArr3[i5 % 4]);
        }
        return bArr2;
    }

    private Envelope(byte[] bArr, String str, byte[] bArr2) throws Exception {
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.mAddress = str;
        this.mLength = bArr.length;
        this.mEntity = b.a(bArr);
        this.mTimestamp = (int) (System.currentTimeMillis() / 1000);
        this.identity = bArr2;
    }

    public static Envelope genEncryptEnvelope(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString("signature", null);
            int i = sharedPreferences.getInt("serial", 1);
            Envelope envelope = new Envelope(bArr, str, (deviceId + mac).getBytes());
            envelope.setEncrypt(true);
            envelope.setSignature(string);
            envelope.setSerialNumber(i);
            envelope.seal();
            sharedPreferences.edit().putInt("serial", i + 1).putString("signature", envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }

    public static Envelope genEnvelope(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString("signature", null);
            int i = sharedPreferences.getInt("serial", 1);
            Envelope envelope = new Envelope(bArr, str, (deviceId + mac).getBytes());
            envelope.setSignature(string);
            envelope.setSerialNumber(i);
            envelope.seal();
            sharedPreferences.edit().putInt("serial", i + 1).putString("signature", envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }
}
