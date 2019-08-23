package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

public class RegistrationPolicyAlwaysRegister extends NetworkChangeNotifierAutoDetect.RegistrationPolicy {
    /* access modifiers changed from: protected */
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        register();
    }
}
