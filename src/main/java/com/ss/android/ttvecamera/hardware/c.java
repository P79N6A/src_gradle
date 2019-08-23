package com.ss.android.ttvecamera.hardware;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;

@TargetApi(21)
public final class c extends b {
    public final String b() {
        if (c()) {
            return "3";
        }
        return super.b();
    }

    public final boolean a() {
        if (!PushConstants.PUSH_TYPE_NOTIFY.equals(b()) || c()) {
            return true;
        }
        return false;
    }

    private static boolean c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        return arrayList.contains(Build.MODEL);
    }

    public c(Context context) {
        super(context);
    }
}
