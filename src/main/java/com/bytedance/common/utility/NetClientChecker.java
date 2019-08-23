package com.bytedance.common.utility;

public class NetClientChecker {
    public static boolean isNetworkClientSet() {
        if (!(NetworkClient.getDefault() instanceof DummyNetworkClient)) {
            return true;
        }
        return false;
    }
}
