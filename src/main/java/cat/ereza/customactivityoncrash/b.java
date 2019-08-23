package cat.ereza.customactivityoncrash;

import android.os.Process;
import android.text.TextUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class b {
    @TargetClass
    @Proxy
    static void a(int i) {
        String str = a.b().f3304b;
        if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
            Process.killProcess(i);
            return;
        }
        throw new RuntimeException("Process killed, pid is " + i);
    }

    @TargetClass
    @Proxy
    static void b(int i) {
        String str = a.b().f3304b;
        if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
            System.exit(10);
            return;
        }
        throw new RuntimeException("Process killed, status is " + 10);
    }
}
