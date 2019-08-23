package com.squareup.wire;

public final class Preconditions {
    private Preconditions() {
    }

    static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
