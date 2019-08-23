package com.ss.android.ugc.aweme.story.comment.discretescrollview;

import com.meituan.robust.ChangeQuickRedirect;

public enum b {
    START {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int applyTo(int i) {
            return i * -1;
        }

        public final boolean sameAs(int i) {
            return i < 0;
        }
    },
    END {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final int applyTo(int i) {
            return i;
        }

        public final boolean sameAs(int i) {
            return i > 0;
        }
    };
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract int applyTo(int i);

    public abstract boolean sameAs(int i);

    public static b fromDelta(int i) {
        if (i > 0) {
            return END;
        }
        return START;
    }
}
