package com.ss.android.ugc.c;

import com.ss.android.ugc.c.b;
import java.util.Arrays;
import java.util.Queue;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private double f77189a = -1.0d;

    public final double a(Queue<c> queue, c[] cVarArr) {
        return b(queue, cVarArr);
    }

    public final double b(Queue<c> queue, c[] cVarArr) {
        double d2 = -1.0d;
        if (queue.size() <= 0) {
            return -1.0d;
        }
        queue.toArray(cVarArr);
        int i = 0;
        Arrays.sort(cVarArr, 0, queue.size());
        int size = queue.size();
        double d3 = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            d3 += cVarArr[i2].f77198c;
        }
        double d4 = d3 / 2.0d;
        while (true) {
            if (i >= size) {
                break;
            }
            d4 -= cVarArr[i].f77198c;
            if (d4 <= 0.0d) {
                d2 = cVarArr[i].f77197b;
                break;
            }
            i++;
        }
        if (d2 >= 0.0d) {
            this.f77189a = d2;
            return d2;
        }
        throw new IllegalArgumentException();
    }
}
