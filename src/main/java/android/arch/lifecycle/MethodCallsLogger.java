package android.arch.lifecycle;

import android.support.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MethodCallsLogger {
    private Map<String, Integer> mCalledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean approveCall(String str, int i) {
        int i2;
        boolean z;
        Integer num = this.mCalledMethods.get(str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if ((i2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mCalledMethods.put(str, Integer.valueOf(i | i2));
        if (!z) {
            return true;
        }
        return false;
    }
}
