package anetwork.channel.degrade;

import android.content.Context;
import anetwork.channel.aidl.adapter.b;

public class DegradableNetwork extends b {
    public DegradableNetwork(Context context) {
        super(context, 1);
    }
}
