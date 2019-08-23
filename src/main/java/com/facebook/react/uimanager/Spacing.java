package com.facebook.react.uimanager;

import com.facebook.yoga.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.Arrays;

public class Spacing {
    private static final int[] sFlagsMap = {1, 2, 4, 8, 16, 32, 64, SearchJediMixFeedAdapter.f42517f, 256};
    private float mDefaultValue;
    private boolean mHasAliasesSet;
    private final float[] mSpacing;
    private int mValueFlags;

    public Spacing() {
        this(0.0f);
    }

    public void reset() {
        Arrays.fill(this.mSpacing, 1.0E21f);
        this.mHasAliasesSet = false;
        this.mValueFlags = 0;
    }

    private static float[] newFullSpacingArray() {
        return new float[]{1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
    }

    public float getRaw(int i) {
        return this.mSpacing[i];
    }

    public Spacing(float f2) {
        this.mSpacing = newFullSpacingArray();
        this.mValueFlags = 0;
        this.mDefaultValue = f2;
    }

    public float get(int i) {
        float f2;
        char c2;
        if (i == 4 || i == 5) {
            f2 = 1.0E21f;
        } else {
            f2 = this.mDefaultValue;
        }
        if (this.mValueFlags == 0) {
            return f2;
        }
        if ((this.mValueFlags & sFlagsMap[i]) != 0) {
            return this.mSpacing[i];
        }
        if (this.mHasAliasesSet) {
            if (i == 1 || i == 3) {
                c2 = 7;
            } else {
                c2 = 6;
            }
            if ((this.mValueFlags & sFlagsMap[c2]) != 0) {
                return this.mSpacing[c2];
            }
            if ((this.mValueFlags & sFlagsMap[8]) != 0) {
                return this.mSpacing[8];
            }
        }
        return f2;
    }

    /* access modifiers changed from: package-private */
    public float getWithFallback(int i, int i2) {
        if ((this.mValueFlags & sFlagsMap[i]) != 0) {
            return this.mSpacing[i];
        }
        return get(i2);
    }

    public boolean set(int i, float f2) {
        boolean z = false;
        if (FloatUtil.floatsEqual(this.mSpacing[i], f2)) {
            return false;
        }
        this.mSpacing[i] = f2;
        if (a.a(f2)) {
            this.mValueFlags = (sFlagsMap[i] ^ -1) & this.mValueFlags;
        } else {
            this.mValueFlags = sFlagsMap[i] | this.mValueFlags;
        }
        if (!((this.mValueFlags & sFlagsMap[8]) == 0 && (this.mValueFlags & sFlagsMap[7]) == 0 && (this.mValueFlags & sFlagsMap[6]) == 0)) {
            z = true;
        }
        this.mHasAliasesSet = z;
        return true;
    }
}
