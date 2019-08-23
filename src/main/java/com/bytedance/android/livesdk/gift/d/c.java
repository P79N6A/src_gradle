package com.bytedance.android.livesdk.gift.d;

import com.ss.android.ugc.aweme.C0906R;

public final class c implements f {
    public final int a(int i) {
        if (i > 1000) {
            return 2130840879;
        }
        if (i > 500) {
            return 2130840877;
        }
        if (i > 200) {
            return 2130840875;
        }
        return i > 60 ? 2130840873 : 2130840871;
    }

    public final int b(int i) {
        if (i > 1000) {
            return 2130840880;
        }
        if (i > 500) {
            return 2130840878;
        }
        if (i > 200) {
            return 2130840876;
        }
        return i > 60 ? 2130840874 : 2130840872;
    }

    public final int[] c(int i) {
        int[] iArr = new int[2];
        if (i > 1000) {
            iArr[0] = C0906R.color.acb;
            iArr[1] = C0906R.color.aca;
        } else if (i > 500) {
            iArr[0] = C0906R.color.acd;
            iArr[1] = C0906R.color.acc;
        } else if (i > 200) {
            iArr[0] = C0906R.color.ach;
            iArr[1] = C0906R.color.acg;
        } else if (i > 60) {
            iArr[0] = C0906R.color.acj;
            iArr[1] = C0906R.color.aci;
        } else {
            iArr[0] = C0906R.color.acf;
            iArr[1] = C0906R.color.ace;
        }
        return iArr;
    }
}
