package com.facebook.common.f;

import com.facebook.infer.annotation.Functional;
import javax.annotation.Nullable;

public enum e {
    YES,
    NO,
    UNSET;

    @Functional
    public final boolean isSet() {
        if (this != UNSET) {
            return true;
        }
        return false;
    }

    @Functional
    public final int getDbValue() {
        switch (this) {
            case YES:
                return 1;
            case NO:
                return 2;
            default:
                return 3;
        }
    }

    @Functional
    public final boolean asBoolean() {
        switch (this) {
            case YES:
                return true;
            case NO:
                return false;
            case UNSET:
                throw new IllegalStateException("No boolean equivalent for UNSET");
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    @Nullable
    @Functional
    public final Boolean asBooleanObject() {
        switch (this) {
            case YES:
                return Boolean.TRUE;
            case NO:
                return Boolean.FALSE;
            case UNSET:
                return null;
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    @Functional
    public static e valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }

    @Functional
    public static e valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    @Functional
    public static e fromDbValue(int i) {
        switch (i) {
            case 1:
                return YES;
            case 2:
                return NO;
            default:
                return UNSET;
        }
    }

    @Functional
    public final boolean asBoolean(boolean z) {
        switch (this) {
            case YES:
                return true;
            case NO:
                return false;
            case UNSET:
                return z;
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }
}
