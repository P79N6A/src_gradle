package com.bytedance.common.utility.android;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.ClipboardManager;

public class ClipboardCompat {
    static final ClipboardImpl IMPL;

    static class BaseClipboardImpl implements ClipboardImpl {
        BaseClipboardImpl() {
        }

        public void setText(Context context, CharSequence charSequence, CharSequence charSequence2) {
            ((ClipboardManager) context.getSystemService("clipboard")).setText(charSequence2);
        }
    }

    interface ClipboardImpl {
        void setText(Context context, CharSequence charSequence, CharSequence charSequence2);
    }

    static class HoneycombClipboardImpl implements ClipboardImpl {
        HoneycombClipboardImpl() {
        }

        @TargetApi(11)
        public void setText(Context context, CharSequence charSequence, CharSequence charSequence2) {
            ((android.content.ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombClipboardImpl();
        } else {
            IMPL = new BaseClipboardImpl();
        }
    }

    public static void setText(Context context, CharSequence charSequence, CharSequence charSequence2) {
        if (context != null && charSequence != null && charSequence2 != null) {
            try {
                IMPL.setText(context, charSequence, charSequence2);
            } catch (Throwable unused) {
            }
        }
    }
}
