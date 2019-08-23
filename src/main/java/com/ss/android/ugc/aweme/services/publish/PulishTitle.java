package com.ss.android.ugc.aweme.services.publish;

import com.ss.android.ugc.aweme.i18n.c;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/services/publish/PulishTitle;", "", "()V", "Companion", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class PulishTitle {
    public static final Companion Companion = new Companion(null);
    @JvmField
    public static final int MAX_LINES;
    @JvmField
    public static final int MAX_WORDS;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/services/publish/PulishTitle$Companion;", "", "()V", "MAX_LINES", "", "MAX_WORDS", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i;
        int i2;
        if (c.a()) {
            i = 100;
        } else {
            i = 55;
        }
        MAX_WORDS = i;
        if (c.a()) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        MAX_LINES = i2;
    }
}
