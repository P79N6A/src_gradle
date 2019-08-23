package com.bytedance.frameworks.core.b;

public interface b {

    public enum a {
        LOW(1),
        NORMAL(2),
        HIGHT(3);
        
        final int priority;

        public final int getValue() {
            return this.priority;
        }

        private a(int i) {
            this.priority = i;
        }
    }
}
