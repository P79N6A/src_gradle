package org.android.spdy;

import android.text.TextUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.android.spdy.ProtectedPointer;

public class ProtectedPointerTest {

    static class Data {
        private int i;

        public class _lancet {
            private _lancet() {
            }

            @TargetClass
            @Proxy
            static void com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(int i) {
                String str = a.b().f3304b;
                if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                    System.exit(i);
                    return;
                }
                throw new RuntimeException("Process killed, status is " + i);
            }
        }

        Data() {
        }

        public void destroy() {
            System.out.println("destroy");
            this.i = 1;
        }

        public void work() {
            System.out.println("work");
            if (this.i == 1) {
                _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(-1);
            }
        }
    }

    public static void test_sequece(ProtectedPointer protectedPointer) {
        protectedPointer.release();
    }

    public static void main(String[] strArr) {
        for (int i = 0; i <= 0; i++) {
            ProtectedPointer protectedPointer = new ProtectedPointer(new Data());
            protectedPointer.setHow2close(new ProtectedPointer.ProtectedPointerOnClose() {
                public final void close(Object obj) {
                    ((Data) obj).destroy();
                }
            });
            test_close_with_work(protectedPointer);
        }
    }

    public static void test_close_anywhere1(ProtectedPointer protectedPointer) {
        if (protectedPointer.enter()) {
            protectedPointer.release();
            ((Data) protectedPointer.getData()).work();
            protectedPointer.exit();
        }
    }

    public static void test_close_with_work(final ProtectedPointer protectedPointer) {
        Thread thread = new Thread(new Runnable() {
            public final void run() {
                for (int i = 0; i < 1000; i++) {
                    if (protectedPointer.enter()) {
                        ((Data) protectedPointer.getData()).work();
                        protectedPointer.exit();
                    } else {
                        System.out.println("the data has been destroy");
                    }
                }
            }
        });
        new Thread(new Runnable() {
            public final void run() {
                protectedPointer.release();
            }
        }).run();
        thread.run();
    }
}
