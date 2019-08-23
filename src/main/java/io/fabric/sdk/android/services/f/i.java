package io.fabric.sdk.android.services.f;

import io.fabric.sdk.android.services.e.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;

public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final io.fabric.sdk.android.i f83320a;

    public final JSONObject a() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new b(this.f83320a).a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(io.fabric.sdk.android.services.b.i.a((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception unused) {
                    io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream, "Error while closing settings cache file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                jSONObject = null;
            }
            io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception unused2) {
            fileInputStream = null;
            io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            io.fabric.sdk.android.services.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public i(io.fabric.sdk.android.i iVar) {
        this.f83320a = iVar;
    }

    public final void a(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter(new File(new b(this.f83320a).a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    io.fabric.sdk.android.services.b.i.a((Closeable) fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception unused2) {
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                io.fabric.sdk.android.services.b.i.a((Closeable) fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            io.fabric.sdk.android.services.b.i.a((Closeable) fileWriter, "Failed to close settings writer.");
        }
    }
}
