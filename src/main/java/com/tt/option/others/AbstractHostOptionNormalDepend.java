package com.tt.option.others;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.option.BaseAbstractHostDepend;

public class AbstractHostOptionNormalDepend extends BaseAbstractHostDepend<HostOptionNormalDepend> implements HostOptionNormalDepend {
    @AnyProcess
    public String getImplClassName() {
        return "HostOptionNormalDependImpl";
    }

    @AnyProcess
    public boolean openLocation(@NonNull Activity activity, @Nullable String str, @Nullable String str2, double d2, double d3, int i, @Nullable String str3) {
        if (inject()) {
            return ((HostOptionNormalDepend) this.defaultOptionDepend).openLocation(activity, str, str2, d2, d3, i, str3);
        }
        return false;
    }
}
