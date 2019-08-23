package org.android.spdy;

public class NetTimeGaurd {
    private static long[] totaltime = new long[4];

    static long begin() {
        if (SpdyAgent.enableTimeGaurd) {
            return System.currentTimeMillis();
        }
        return 0;
    }

    static void start(int i) {
        if (SpdyAgent.enableTimeGaurd) {
            totaltime[i] = 0;
        }
    }

    static void finish(int i) {
        if (SpdyAgent.enableTimeGaurd && totaltime[i] > 50) {
            throw new SpdyErrorException("CallBack totaltimeconsuming:" + totaltime[i] + "  mustlessthan:50", -1);
        }
    }

    static void end(String str, int i, long j) {
        if (SpdyAgent.enableTimeGaurd) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            long[] jArr = totaltime;
            jArr[i] = jArr[i] + currentTimeMillis;
            if (currentTimeMillis > 10) {
                throw new SpdyErrorException("CallBack:" + str + " timeconsuming:" + currentTimeMillis + "  mustlessthan:10", -1);
            }
        }
    }
}
