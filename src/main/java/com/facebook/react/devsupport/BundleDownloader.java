package com.facebook.react.devsupport;

import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.a;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleDownloader {
    private final BundleDeltaClient mBundleDeltaClient = new BundleDeltaClient();
    private final OkHttpClient mClient;
    @Nullable
    public Call mDownloadBundleFromURLCall;

    public static class BundleInfo {
        public int mFilesChangedCount;
        @Nullable
        public String mUrl;

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }

        public String getUrl() {
            if (this.mUrl != null) {
                return this.mUrl;
            }
            return "unknown";
        }

        @Nullable
        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PushConstants.WEB_URL, this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return null;
            }
        }

        @Nullable
        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mUrl = jSONObject.getString(PushConstants.WEB_URL);
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean storePlainJSInFile(okio.BufferedSource r0, java.io.File r1) throws java.io.IOException {
        /*
            okio.Sink r1 = okio.Okio.sink((java.io.File) r1)     // Catch:{ all -> 0x0010 }
            r0.readAll(r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000c
            r1.close()
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.storePlainJSInFile(okio.BufferedSource, java.io.File):boolean");
    }

    private static void populateBundleInfo(String str, Headers headers, BundleInfo bundleInfo) {
        bundleInfo.mUrl = str;
        String str2 = headers.get("X-Metro-Files-Changed-Count");
        if (str2 != null) {
            try {
                bundleInfo.mFilesChangedCount = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                bundleInfo.mFilesChangedCount = -2;
            }
        }
    }

    public void downloadBundleFromURL(final DevBundleDownloadListener devBundleDownloadListener, final File file, String str, @Nullable final BundleInfo bundleInfo) {
        this.mDownloadBundleFromURLCall = (Call) a.b(this.mClient.newCall(new Request.Builder().url(this.mBundleDeltaClient.toDeltaUrl(str)).build()));
        this.mDownloadBundleFromURLCall.enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                DevBundleDownloadListener devBundleDownloadListener = devBundleDownloadListener;
                devBundleDownloadListener.onFailure(DebugServerException.makeGeneric("Could not connect to development server.", "URL: " + call.request().url().toString(), iOException));
            }

            public void onResponse(Call call, Response response) throws IOException {
                Throwable th;
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                String httpUrl = response.request().url().toString();
                Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.header("content-type"));
                try {
                    if (matcher.find()) {
                        BundleDownloader.this.processMultipartResponse(httpUrl, response, matcher.group(1), file, bundleInfo, devBundleDownloadListener);
                    } else {
                        BundleDownloader.this.processBundleResult(httpUrl, response.code(), response.headers(), Okio.buffer((Source) response.body().source()), file, bundleInfo, devBundleDownloadListener);
                    }
                    if (response != null) {
                        response.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    com.google.a.a.a.a.a.a.a(th, th2);
                }
                throw th;
            }
        });
    }

    public void processMultipartResponse(String str, Response response, String str2, File file, @Nullable BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        MultipartStreamReader multipartStreamReader = new MultipartStreamReader(response.body().source(), str2);
        final Response response2 = response;
        final String str3 = str;
        final File file2 = file;
        final BundleInfo bundleInfo2 = bundleInfo;
        final DevBundleDownloadListener devBundleDownloadListener2 = devBundleDownloadListener;
        AnonymousClass2 r2 = new MultipartStreamReader.ChunkListener() {
            public void onChunkProgress(Map<String, String> map, long j, long j2) throws IOException {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener2.onProgress("Downloading JavaScript bundle", Integer.valueOf((int) (j / 1024)), Integer.valueOf((int) (j2 / 1024)));
                }
            }

            public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z) throws IOException {
                String str;
                Integer num;
                if (z) {
                    int code = response2.code();
                    if (map.containsKey("X-Http-Status")) {
                        code = Integer.parseInt(map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str3, code, Headers.of(map), buffer, file2, bundleInfo2, devBundleDownloadListener2);
                } else if (map.containsKey("Content-Type") && map.get("Content-Type").equals("application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                        Integer num2 = null;
                        if (jSONObject.has("status")) {
                            str = jSONObject.getString("status");
                        } else {
                            str = null;
                        }
                        if (jSONObject.has("done")) {
                            num = Integer.valueOf(jSONObject.getInt("done"));
                        } else {
                            num = null;
                        }
                        if (jSONObject.has("total")) {
                            num2 = Integer.valueOf(jSONObject.getInt("total"));
                        }
                        devBundleDownloadListener2.onProgress(str, num, num2);
                    } catch (JSONException e2) {
                        FLog.e("ReactNative", "Error parsing progress JSON. " + e2.toString());
                    }
                }
            }
        };
        if (!multipartStreamReader.readAllParts(r2)) {
            devBundleDownloadListener.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.code() + "\n\nURL: " + str.toString() + "\n\n"));
        }
    }

    public void processBundleResult(String str, int i, Headers headers, BufferedSource bufferedSource, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        boolean z;
        if (i != 200) {
            String readUtf8 = bufferedSource.readUtf8();
            DebugServerException parse = DebugServerException.parse(readUtf8);
            if (parse != null) {
                devBundleDownloadListener.onFailure(parse);
                return;
            }
            devBundleDownloadListener.onFailure(new DebugServerException("The development server returned response error code: " + i + "\n\nURL: " + str + "\n\nBody:\n" + readUtf8));
            return;
        }
        if (bundleInfo != null) {
            populateBundleInfo(str, headers, bundleInfo);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (BundleDeltaClient.isDeltaUrl(str)) {
            z = this.mBundleDeltaClient.storeDeltaInFile(bufferedSource, file2);
        } else {
            this.mBundleDeltaClient.reset();
            z = storePlainJSInFile(bufferedSource, file2);
        }
        if (!z || file2.renameTo(file)) {
            devBundleDownloadListener.onSuccess();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }
}
