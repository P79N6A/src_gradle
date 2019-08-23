package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public final class a {

    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a  reason: collision with other inner class name */
    public static class C0852a {
        public String W;
        public long X;
        public String action;
        public Bundle bundle;
        public String content;
    }

    public static boolean a(Context context, C0852a aVar) {
        String str;
        String str2;
        if (context == null) {
            str = "MicroMsg.SDK.MMessage";
            str2 = "send fail, invalid argument";
        } else if (d.h(aVar.action)) {
            str = "MicroMsg.SDK.MMessage";
            str2 = "send fail, action is null";
        } else {
            String str3 = null;
            if (!d.h(aVar.W)) {
                str3 = aVar.W + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(aVar.action);
            if (aVar.bundle != null) {
                intent.putExtras(aVar.bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra("_mmessage_sdkVersion", Build.SDK_INT);
            intent.putExtra("_mmessage_appPackage", packageName);
            intent.putExtra("_mmessage_content", aVar.content);
            intent.putExtra("_mmessage_support_content_type", aVar.X);
            intent.putExtra("_mmessage_checksum", b.a(aVar.content, Build.SDK_INT, packageName));
            context.sendBroadcast(intent, str3);
            Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str3);
            return true;
        }
        Log.e(str, str2);
        return false;
    }
}
