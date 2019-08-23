package com.ss.android.medialib.player;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.model.EffectFileInfo;
import com.ss.android.medialib.model.EffectModel;

@Keep
public class EffectConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    String deviceName;
    String effect8File;
    String effect9File;
    int effectBuildChainType = 1;
    EffectFileInfo[] effectFileInfos;
    String effectModelDir;
    EffectModel[] effectModels;
    int effectType;
    float filterIntensity = -1.0f;
    String leftFilter;
    float pos;
    String rightFilter;
    String snowflakeFile;
    String vertigoFile;

    public String getEffect8File() {
        return this.effect8File;
    }

    public String getEffect9File() {
        return this.effect9File;
    }

    public int getEffectBuildChainType() {
        return this.effectBuildChainType;
    }

    public EffectFileInfo[] getEffectFileInfos() {
        return this.effectFileInfos;
    }

    public EffectModel[] getEffectModels() {
        return this.effectModels;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public float getFilterIntensity() {
        return this.filterIntensity;
    }

    public String getLeftFilter() {
        return this.leftFilter;
    }

    public float getPos() {
        return this.pos;
    }

    public String getRightFilter() {
        return this.rightFilter;
    }

    public String getSnowflakeFile() {
        return this.snowflakeFile;
    }

    public String getVertigoFile() {
        return this.vertigoFile;
    }

    public String getDeviceName() {
        if (this.deviceName == null) {
            return "";
        }
        return this.deviceName;
    }

    public String getEffectModelDir() {
        if (this.effectModelDir == null) {
            return "";
        }
        return this.effectModelDir;
    }

    public EffectConfig setDeviceName(@NonNull String str) {
        this.deviceName = str;
        return this;
    }

    public void setEffect8File(String str) {
        this.effect8File = str;
    }

    public void setEffect9File(String str) {
        this.effect9File = str;
    }

    public EffectConfig setEffectBuildChainType(int i) {
        this.effectBuildChainType = i;
        return this;
    }

    public EffectConfig setEffectFileInfos(EffectFileInfo[] effectFileInfoArr) {
        this.effectFileInfos = effectFileInfoArr;
        return this;
    }

    public EffectConfig setEffectModelDir(@NonNull String str) {
        this.effectModelDir = str;
        return this;
    }

    public EffectConfig setEffectModels(EffectModel[] effectModelArr) {
        this.effectModels = effectModelArr;
        return this;
    }

    public EffectConfig setEffectType(int i) {
        this.effectType = i;
        return this;
    }

    public EffectConfig setFilterIntensity(float f2) {
        this.filterIntensity = f2;
        return this;
    }

    public void setSnowflakeFile(String str) {
        this.snowflakeFile = str;
    }

    public void setVertigoFile(String str) {
        this.vertigoFile = str;
    }

    public EffectConfig setFilter(String str) {
        this.leftFilter = str;
        this.rightFilter = str;
        this.pos = 1.0f;
        return this;
    }

    public EffectConfig setEffectModels(String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{strArr}, this, changeQuickRedirect, false, 17517, new Class[]{String[].class}, EffectConfig.class)) {
            return (EffectConfig) PatchProxy.accessDispatch(new Object[]{strArr}, this, changeQuickRedirect, false, 17517, new Class[]{String[].class}, EffectConfig.class);
        } else if (strArr == null) {
            return this;
        } else {
            this.effectModels = new EffectModel[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                if (str != null) {
                    String[] split = str.split(",");
                    if (split != null && split.length == 3) {
                        this.effectModels[i] = new EffectModel(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                    }
                }
            }
            return this;
        }
    }

    public EffectConfig setFilter(String str, String str2, float f2) {
        this.leftFilter = str;
        this.rightFilter = str2;
        this.pos = f2;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.medialib.player.EffectConfig setEffectModels(int[] r14, int r15, int r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r14
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 1
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r12 = 2
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<int[]> r1 = int[].class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<com.ss.android.medialib.player.EffectConfig> r6 = com.ss.android.medialib.player.EffectConfig.class
            r3 = 0
            r4 = 17518(0x446e, float:2.4548E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 17518(0x446e, float:2.4548E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<int[]> r1 = int[].class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<com.ss.android.medialib.player.EffectConfig> r6 = com.ss.android.medialib.player.EffectConfig.class
            r1 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.medialib.player.EffectConfig r0 = (com.ss.android.medialib.player.EffectConfig) r0
            return r0
        L_0x005f:
            if (r8 != 0) goto L_0x0062
            return r7
        L_0x0062:
            int r0 = r8.length
            int r0 = r0 / r9
            int r0 = r0 + r11
            com.ss.android.medialib.model.EffectModel[] r1 = new com.ss.android.medialib.model.EffectModel[r0]
            r7.effectModels = r1
        L_0x0069:
            int r1 = r0 + -1
            if (r10 >= r1) goto L_0x0084
            com.ss.android.medialib.model.EffectModel r1 = new com.ss.android.medialib.model.EffectModel
            int r2 = r10 * 3
            r3 = r8[r2]
            int r4 = r2 + 1
            r4 = r8[r4]
            int r2 = r2 + r12
            r2 = r8[r2]
            r1.<init>(r3, r4, r2)
            com.ss.android.medialib.model.EffectModel[] r2 = r7.effectModels
            r2[r10] = r1
            int r10 = r10 + 1
            goto L_0x0069
        L_0x0084:
            com.ss.android.medialib.model.EffectModel[] r0 = r7.effectModels
            com.ss.android.medialib.model.EffectModel r2 = new com.ss.android.medialib.model.EffectModel
            r3 = r15
            r4 = r16
            r2.<init>(r15, r4, r4)
            r0[r1] = r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.player.EffectConfig.setEffectModels(int[], int, int):com.ss.android.medialib.player.EffectConfig");
    }

    public EffectConfig setEffectFiles(String str, String str2, String str3, String str4) {
        this.effect8File = str;
        this.effect9File = str2;
        this.vertigoFile = str3;
        this.snowflakeFile = str4;
        return this;
    }
}
