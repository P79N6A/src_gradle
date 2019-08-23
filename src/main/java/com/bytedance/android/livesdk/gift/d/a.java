package com.bytedance.android.livesdk.gift.d;

import com.ss.android.ugc.aweme.C0906R;

public final class a implements f {
    public final int a(int i) {
        if (i > 1000) {
            return 2130840875;
        }
        return i > 60 ? 2130840873 : 2130840871;
    }

    public final int b(int i) {
        if (i > 1000) {
            return 2130840876;
        }
        return i > 60 ? 2130840874 : 2130840872;
    }

    public final int[] c(int i) {
        int[] iArr = new int[2];
        if (i > 1000) {
            iArr[0] = C0906R.color.act;
            iArr[1] = C0906R.color.acs;
        } else if (i > 60) {
            iArr[0] = C0906R.color.acp;
            iArr[1] = C0906R.color.aco;
        } else {
            iArr[0] = C0906R.color.ac7;
            iArr[1] = C0906R.color.ac7;
        }
        return iArr;
    }
}
