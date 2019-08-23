package com.douyin.share.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.douyin.share.a.b.b.d;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;

public final class n {
    public static boolean a(final Context context, final d dVar) {
        if (context == null || dVar == null) {
            return false;
        }
        final String h = dVar.h();
        if (TextUtils.isEmpty(h) || !new File(h).exists()) {
            return false;
        }
        a.a(new Runnable() {
            public final void run() {
                try {
                    final String b2 = dVar.b();
                    a.b(new Runnable() {
                        public final void run() {
                            String str = h;
                            if (!h.endsWith(".jpg")) {
                                str = h + ".jpg";
                            }
                            String str2 = h;
                            if (PatchProxy.isSupport(new Object[]{str2, str}, null, b.f4305a, true, 88889, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                                ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, str}, null, b.f4305a, true, 88889, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
                            } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                                File file = new File(str2);
                                File file2 = new File(str);
                                if (file.exists()) {
                                    boolean renameTo = file.renameTo(file2);
                                }
                            }
                            String str3 = dVar.d() + "【抖音短视频】\n" + b2;
                            try {
                                Intent intent = new Intent();
                                intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
                                intent.setAction("android.intent.action.SEND");
                                intent.setFlags(335577088);
                                intent.setType("image/*");
                                intent.putExtra("Kdescription", str3);
                                intent.putExtra("android.intent.extra.STREAM", Uri.parse("file://" + str));
                                context.startActivity(intent);
                            } catch (Exception unused) {
                            }
                        }
                    });
                } catch (Exception unused) {
                }
            }
        });
        return true;
    }
}
