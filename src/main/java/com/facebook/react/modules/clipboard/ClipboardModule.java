package com.facebook.react.modules.clipboard;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Clipboard")
public class ClipboardModule extends ContextBaseJavaModule {
    public String getName() {
        return "Clipboard";
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    public ClipboardModule(Context context) {
        super(context);
    }

    @SuppressLint({"DeprecatedMethod"})
    @ReactMethod
    public void setString(String str) {
        if (Build.VERSION.SDK_INT >= 11) {
            getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
            return;
        }
        getClipboardService().setText(str);
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip == null) {
                promise.resolve("");
            } else if (primaryClip.getItemCount() > 0) {
                ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                promise.resolve(itemAt.getText());
            } else {
                promise.resolve("");
            }
        } catch (Exception e2) {
            promise.reject((Throwable) e2);
        }
    }
}
