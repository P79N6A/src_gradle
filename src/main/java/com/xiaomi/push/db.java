package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;

public class db extends dd {
    public db(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    public static db a(Context context, String str, int i) {
        b.b("delete  messages when db size is too bigger");
        String a2 = dh.a(context).a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new db(str, "rowDataId in (select " + ("rowDataId from " + a2) + " order by createTimeStamp asc" + " limit ?)", new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    private void a(long j) {
        if (this.f266a != null && this.f266a.length > 0) {
            this.f266a[0] = String.valueOf(j);
        }
    }

    public void a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a2 = dn.a(a());
            long j = cz.f249a;
            if (a2 > j) {
                double d2 = (double) (a2 - j);
                Double.isNaN(d2);
                double d3 = (double) j;
                Double.isNaN(d3);
                double d4 = (double) longValue;
                Double.isNaN(d4);
                long j2 = (long) (d4 * ((d2 * 1.2d) / d3));
                a(j2);
                cv a3 = cv.a(context);
                a3.a("begin delete " + j2 + "noUpload messages , because db size is " + a2 + "B");
                super.a(context, obj);
                return;
            }
            b.b("db size is suitable");
        }
    }
}
