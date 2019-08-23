package com.meizu.cloud.pushsdk.handler.a.a;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.b.f;
import com.meizu.cloud.pushsdk.platform.a.b;
import com.meizu.cloud.pushsdk.util.c;
import java.io.File;

public class a extends com.meizu.cloud.pushsdk.handler.a.a<f> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    public int a() {
        return 65536;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void b(f fVar) {
        c.c(c(), c().getPackageName(), fVar.d().b().d(), fVar.d().b().a(), fVar.d().b().e(), fVar.d().b().b());
    }

    /* access modifiers changed from: protected */
    public void a(f fVar, com.meizu.cloud.pushsdk.notification.c cVar) {
        String str;
        File file;
        DebugLogger.flush();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        String a2 = fVar.d().b().a();
        String d2 = fVar.d().b().d();
        String str2 = absolutePath + "/Android/data/pushSdktmp/" + a2 + "_" + d2 + ".zip";
        try {
            new b(str2).a(fVar.c());
            file = new File(str2);
            str = null;
        } catch (Exception e2) {
            str = e2.getMessage();
            DebugLogger.e("AbstractMessageHandler", "zip error message " + str);
            file = null;
        }
        if (file != null && file.length() / 1024 > ((long) fVar.a())) {
            str = "the upload file exceeds the max size";
        } else if (fVar.b() && !com.meizu.cloud.pushsdk.util.a.b(c())) {
            str = "current network not allowed upload log file";
        }
        com.meizu.cloud.pushsdk.b.a.c<String> a3 = b.a(c()).a(fVar.d().b().a(), fVar.d().b().d(), str, file);
        if (a3 == null || !a3.b()) {
            DebugLogger.i("AbstractMessageHandler", "upload error code " + a3.c() + ((String) a3.a()));
            return;
        }
        if (file != null) {
            file.delete();
        }
        DebugLogger.e("AbstractMessageHandler", "upload success " + ((String) a3.a()));
    }

    public boolean a(Intent intent) {
        int i;
        DebugLogger.i("AbstractMessageHandler", "start LogUploadMessageHandler match");
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        if (!TextUtils.isEmpty(stringExtra)) {
            com.meizu.cloud.pushsdk.handler.a.b.b a2 = com.meizu.cloud.pushsdk.handler.a.b.b.a(stringExtra);
            if (a2.a() != null) {
                i = a2.a().a();
                return !PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(String.valueOf(i));
            }
        }
        i = 0;
        if (!PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public f c(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        return new f(intent.getStringExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE), stringExtra, intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), stringExtra2);
    }
}
