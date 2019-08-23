package com.ta.utdid2.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ta.utdid2.b.a.f;
import com.ta.utdid2.b.a.i;
import com.ta.utdid2.b.a.j;

public class a {
    private static final String TAG = "com.ta.utdid2.a.a";

    /* renamed from: a  reason: collision with root package name */
    private static a f78832a;
    private Context mContext;

    private a(Context context) {
        this.mContext = context;
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f78832a == null) {
                f78832a = new a(context);
            }
            aVar = f78832a;
        }
        return aVar;
    }

    private synchronized String b(String str, String str2, String str3) {
        if (this.mContext == null) {
            return "";
        }
        String str4 = "";
        if (f.a(this.mContext)) {
            str4 = b.a(this.mContext).a(str, str2, str3, c.a(this.mContext, str, str2));
        }
        c.a(this.mContext, str, str4, str2);
        return str4;
    }

    public String a(String str, String str2, String str3) {
        if (this.mContext == null || i.a(str) || i.a(str2)) {
            StringBuilder sb = new StringBuilder("mContext:");
            sb.append(this.mContext);
            sb.append("; has appName:");
            sb.append(!i.a(str));
            sb.append("; has token:");
            sb.append(!i.a(str2));
            return "";
        }
        String a2 = c.a(this.mContext, str, str2);
        if ((i.a(a2) || !j.a(c.a(this.mContext, str, str2), 1)) && f.a(this.mContext)) {
            return b(str, str2, str3);
        }
        return a2;
    }

    public void a(String str, String str2, String str3, com.ut.device.a aVar) {
        if (aVar != null) {
            if (this.mContext == null || i.a(str) || i.a(str2)) {
                StringBuilder sb = new StringBuilder("mContext:");
                sb.append(this.mContext);
                sb.append("; callback:");
                sb.append(aVar);
                sb.append("; has appName:");
                sb.append(!i.a(str));
                sb.append("; has token:");
                sb.append(!i.a(str2));
                aVar.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, "");
                return;
            }
            String a2 = c.a(this.mContext, str, str2);
            if (!i.a(a2) && j.a(c.a(this.mContext, str, str2), 1)) {
                aVar.a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, a2);
            } else if (f.a(this.mContext)) {
                b.a(this.mContext).a(str, str2, str3, a2, aVar);
            } else {
                aVar.a(1003, a2);
            }
        }
    }
}
