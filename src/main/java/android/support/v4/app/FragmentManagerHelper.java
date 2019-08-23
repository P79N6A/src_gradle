package android.support.v4.app;

import android.util.Log;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONObject;

public class FragmentManagerHelper {
    public static boolean isExecutingActions(FragmentManager fragmentManager) {
        if (!(fragmentManager instanceof FragmentManagerImpl)) {
            return false;
        }
        return ((FragmentManagerImpl) fragmentManager).mExecutingActions;
    }

    public static void moniterFragmentAdapterUpdateException(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(exc);
            if (stackTraceString.length() > 4096) {
                stackTraceString = stackTraceString.substring(0, 4096);
            }
            jSONObject.put("error_stack", stackTraceString);
        } catch (Exception unused) {
        }
        n.a("pageradapter_finish_update_exception", jSONObject);
    }
}
