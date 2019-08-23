package com.crashlytics.android.core;

import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.a;
import io.fabric.sdk.android.services.b.v;
import io.fabric.sdk.android.services.d.c;
import io.fabric.sdk.android.services.d.d;
import io.fabric.sdk.android.services.d.e;
import java.io.File;
import java.util.Map;

public class DefaultCreateReportSpiCall extends a implements CreateReportSpiCall {
    public boolean invoke(CreateReportRequest createReportRequest) {
        d applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        new StringBuilder("Sending report to: ").append(this.url);
        int b2 = applyMultipartDataTo.b();
        new StringBuilder("Create report request ID: ").append(applyMultipartDataTo.b("X-REQUEST-ID"));
        new StringBuilder("Result was: ").append(b2);
        if (v.a(b2) == 0) {
            return true;
        }
        return false;
    }

    private d applyHeadersTo(d dVar, CreateReportRequest createReportRequest) {
        d a2 = dVar.a("X-CRASHLYTICS-API-KEY", createReportRequest.apiKey).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.kit.getVersion());
        for (Map.Entry entry : createReportRequest.report.getCustomHeaders().entrySet()) {
            a2 = a2.a((String) entry.getKey(), (String) entry.getValue());
        }
        return a2;
    }

    private d applyMultipartDataTo(d dVar, Report report) {
        dVar.b("report[identifier]", report.getIdentifier());
        if (report.getFiles().length == 1) {
            StringBuilder sb = new StringBuilder("Adding single file ");
            sb.append(report.getFileName());
            sb.append(" to report ");
            sb.append(report.getIdentifier());
            return dVar.a("report[file]", report.getFileName(), "application/octet-stream", report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            StringBuilder sb2 = new StringBuilder("Adding file ");
            sb2.append(file.getName());
            sb2.append(" to report ");
            sb2.append(report.getIdentifier());
            dVar.a("report[file" + i + "]", file.getName(), "application/octet-stream", file);
            i++;
        }
        return dVar;
    }

    public DefaultCreateReportSpiCall(i iVar, String str, String str2, e eVar) {
        super(iVar, str, str2, eVar, c.POST);
    }

    DefaultCreateReportSpiCall(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }
}
