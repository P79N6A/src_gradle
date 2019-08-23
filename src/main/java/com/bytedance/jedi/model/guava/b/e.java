package com.bytedance.jedi.model.guava.b;

import com.bytedance.jedi.model.guava.annotations.GwtCompatible;

@GwtCompatible
public enum e {
    EXPLICIT {
        /* access modifiers changed from: package-private */
        public final boolean wasEvicted() {
            return false;
        }
    },
    REPLACED {
        /* access modifiers changed from: package-private */
        public final boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED {
        /* access modifiers changed from: package-private */
        public final boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED {
        /* access modifiers changed from: package-private */
        public final boolean wasEvicted() {
            return true;
        }
    },
    SIZE {
        /* access modifiers changed from: package-private */
        public final boolean wasEvicted() {
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    public abstract boolean wasEvicted();
}
