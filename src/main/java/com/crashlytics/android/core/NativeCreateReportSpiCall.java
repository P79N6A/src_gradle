package com.crashlytics.android.core;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.a;
import io.fabric.sdk.android.services.b.v;
import io.fabric.sdk.android.services.d.c;
import io.fabric.sdk.android.services.d.d;
import io.fabric.sdk.android.services.d.e;
import java.io.File;

public class NativeCreateReportSpiCall extends a implements CreateReportSpiCall {
    public boolean invoke(CreateReportRequest createReportRequest) {
        d applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest.apiKey), createReportRequest.report);
        new StringBuilder("Sending report to: ").append(this.url);
        int b2 = applyMultipartDataTo.b();
        new StringBuilder("Result was: ").append(b2);
        if (v.a(b2) == 0) {
            return true;
        }
        return false;
    }

    private d applyHeadersTo(d dVar, String str) {
        dVar.a("User-Agent", "Crashlytics Android SDK/" + this.kit.getVersion()).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.kit.getVersion()).a("X-CRASHLYTICS-API-KEY", str);
        return dVar;
    }

    private d applyMultipartDataTo(d dVar, Report report) {
        dVar.b("report_id", report.getIdentifier());
        for (File file : report.getFiles()) {
            if (file.getName().equals("minidump")) {
                dVar.a("minidump_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("metadata")) {
                dVar.a("crash_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("binaryImages")) {
                dVar.a("binary_images_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("session")) {
                dVar.a("session_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals(PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
                dVar.a("app_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("device")) {
                dVar.a("device_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("os")) {
                dVar.a("os_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals(AllStoryActivity.f73306b)) {
                dVar.a("user_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("logs")) {
                dVar.a("logs_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("keys")) {
                dVar.a("keys_file", file.getName(), "application/octet-stream", file);
            }
        }
        return dVar;
    }

    public NativeCreateReportSpiCall(i iVar, String str, String str2, e eVar) {
        super(iVar, str, str2, eVar, c.POST);
    }
}
