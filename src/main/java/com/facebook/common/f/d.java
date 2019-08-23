package com.facebook.common.f;

import com.facebook.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;

public final class d {
    public static long a(InputStream inputStream, long j) throws IOException {
        boolean z;
        Preconditions.checkNotNull(inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (inputStream.read() == -1) {
                return j - j2;
            } else {
                j2--;
            }
        }
        return j;
    }
}
