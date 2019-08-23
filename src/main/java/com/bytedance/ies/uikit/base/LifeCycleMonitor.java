package com.bytedance.ies.uikit.base;

public interface LifeCycleMonitor {

    public static class Stub implements LifeCycleMonitor {
        public void onDestroy() {
        }

        public void onPause() {
        }

        public void onResume() {
        }

        public void onStop() {
        }
    }

    void onDestroy();

    void onPause();

    void onResume();

    void onStop();
}
