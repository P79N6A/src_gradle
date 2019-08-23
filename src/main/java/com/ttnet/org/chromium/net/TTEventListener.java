package com.ttnet.org.chromium.net;

import java.util.Map;

public abstract class TTEventListener {
    public abstract Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map);

    public abstract void onColdStartFinish();

    public abstract void onServerConfigUpdated(String str);

    public abstract void onTTNetDetectInfoChanged(String str);

    public abstract void onTTNetStateChanged(int i);
}
