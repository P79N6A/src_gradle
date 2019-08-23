package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import javax.annotation.Nullable;

public class DevSupportManagerFactory {
    public static DevSupportManager create(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, @Nullable String str, boolean z, int i) {
        return create(context, reactInstanceManagerDevHelper, str, z, null, null, i);
    }

    public static DevSupportManager create(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, @Nullable String str, boolean z, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i) {
        if (!z) {
            return new DisabledDevSupportManager();
        }
        try {
            return (DevSupportManager) Class.forName("com.facebook.react.devsupport." + "DevSupportManagerImpl").getConstructor(new Class[]{Context.class, ReactInstanceManagerDevHelper.class, String.class, Boolean.TYPE, RedBoxHandler.class, DevBundleDownloadListener.class, Integer.TYPE}).newInstance(new Object[]{context, reactInstanceManagerDevHelper, str, Boolean.TRUE, redBoxHandler, devBundleDownloadListener, Integer.valueOf(i)});
        } catch (Exception e2) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e2);
        }
    }
}
