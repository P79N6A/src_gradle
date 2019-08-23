package com.tt.miniapphost;

import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.util.concurrent.atomic.AtomicInteger;

@MiniAppProcess
public class IDCreator {
    private static AtomicInteger sId = new AtomicInteger(0);

    @MiniAppProcess
    public static int create() {
        return sId.incrementAndGet();
    }
}
