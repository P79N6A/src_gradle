package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public enum am {
    EPIC {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final String description() {
            return "slowest";
        }

        public final float value() {
            return 0.333333f;
        }
    },
    SLOW {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final String description() {
            return "slower";
        }

        public final float value() {
            return 0.5f;
        }
    },
    NORMAL {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final String description() {
            return "normal";
        }

        public final float value() {
            return 1.0f;
        }
    },
    STORY_BOOM {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final String description() {
            return "story_boom";
        }

        public final float value() {
            return 1.5f;
        }
    },
    FAST {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final String description() {
            return "faster";
        }

        public final float value() {
            return 2.0f;
        }
    },
    LAPSE {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final String description() {
            return "fastest";
        }

        public final float value() {
            return 3.0f;
        }
    };
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract String description();

    public abstract float value();

    public static am fromValue(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, changeQuickRedirect, true, 86989, new Class[]{Float.TYPE}, am.class)) {
            return (am) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, changeQuickRedirect, true, 86989, new Class[]{Float.TYPE}, am.class);
        } else if (f2 == EPIC.value()) {
            return EPIC;
        } else {
            if (f2 == SLOW.value()) {
                return SLOW;
            }
            if (f2 == NORMAL.value()) {
                return NORMAL;
            }
            if (f2 == FAST.value()) {
                return FAST;
            }
            if (f2 == LAPSE.value()) {
                return LAPSE;
            }
            if (f2 == STORY_BOOM.value()) {
                return STORY_BOOM;
            }
            return null;
        }
    }
}
