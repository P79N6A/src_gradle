package com.facebook.imagepipeline.b;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.image.c;
import com.facebook.imagepipeline.image.d;
import java.util.Collections;
import java.util.List;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b f23822a;

    static class a implements b {
        public final int getGoodEnoughScanNumber() {
            return 0;
        }

        private a() {
        }

        public final List<Integer> getScansToDecode() {
            return Collections.EMPTY_LIST;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public interface b {
        int getGoodEnoughScanNumber();

        List<Integer> getScansToDecode();
    }

    public g() {
        this(new a((byte) 0));
    }

    public g(b bVar) {
        this.f23822a = (b) Preconditions.checkNotNull(bVar);
    }

    public final d getQualityInfo(int i) {
        boolean z;
        if (i >= this.f23822a.getGoodEnoughScanNumber()) {
            z = true;
        } else {
            z = false;
        }
        return c.of(i, z, false);
    }

    public final int getNextScanNumberToDecode(int i) {
        List<Integer> scansToDecode = this.f23822a.getScansToDecode();
        if (scansToDecode == null || scansToDecode.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < scansToDecode.size(); i2++) {
            if (scansToDecode.get(i2).intValue() > i) {
                return scansToDecode.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}
