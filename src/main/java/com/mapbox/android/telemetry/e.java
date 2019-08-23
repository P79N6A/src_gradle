package com.mapbox.android.telemetry;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import okhttp3.Request;

public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    final List<String> f26107a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Context f26108b;

    public final void a(String str) {
        if (b(str)) {
            a(this.f26108b.getFilesDir(), true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028 A[SYNTHETIC, Splitter:B:18:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002e A[SYNTHETIC, Splitter:B:24:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = c(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 1
            r2 = 0
            android.content.Context r3 = r5.f26108b     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            java.lang.String r4 = "MapboxBlacklist"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r1)     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            byte[] r6 = r6.getBytes()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.write(r6)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            r3.close()     // Catch:{ IOException -> 0x0031 }
        L_0x001e:
            r1 = 1
            goto L_0x0031
        L_0x0020:
            r6 = move-exception
            r2 = r3
            goto L_0x0026
        L_0x0023:
            r2 = r3
            goto L_0x002c
        L_0x0025:
            r6 = move-exception
        L_0x0026:
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r6
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.telemetry.e.b(java.lang.String):boolean");
    }

    private static boolean c(String str) {
        try {
            JsonArray asJsonArray = ((JsonObject) new GsonBuilder().create().fromJson(str, JsonObject.class)).getAsJsonArray("RevokedCertKeys");
            if (asJsonArray == null || asJsonArray.size() <= 0) {
                return false;
            }
            return true;
        } catch (JsonSyntaxException unused) {
            return false;
        }
    }

    private List<String> a(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        Gson gson = new Gson();
        List<String> list = null;
        try {
            JsonObject jsonObject = (JsonObject) gson.fromJson((Reader) bufferedReader, JsonObject.class);
            if (jsonObject != null) {
                JsonArray asJsonArray = jsonObject.getAsJsonArray("RevokedCertKeys");
                list = (List) gson.fromJson(asJsonArray.toString(), new TypeToken<List<String>>() {
                }.getType());
            }
        } catch (JsonIOException | JsonSyntaxException unused) {
        }
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    private void a(File file, boolean z) {
        if (file.isDirectory()) {
            File file2 = new File(file, "MapboxBlacklist");
            if (file2.exists()) {
                try {
                    List<String> a2 = a(file2);
                    if (!a2.isEmpty()) {
                        if (z) {
                            this.f26107a.clear();
                        }
                        this.f26107a.addAll(a2);
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    e(Context context, n nVar) {
        boolean z;
        this.f26108b = context;
        nVar.f26121e.add(this);
        if (System.currentTimeMillis() - bp.d(nVar.f26117a).getLong("mapboxConfigSyncTimestamp", 0) >= 86400000) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Context context2 = nVar.f26117a;
            nVar.f26120d.newCall(new Request.Builder().url(new HttpUrl.Builder().scheme("https").host(n.a(context2)).addPathSegment("events-config").addQueryParameter("access_token", nVar.f26119c).build()).header("User-Agent", nVar.f26118b).build()).enqueue(nVar);
            return;
        }
        a(context.getFilesDir(), false);
    }
}
