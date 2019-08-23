package com.facebook.react.devsupport;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.widget.Toast;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.InspectorPackagerConnection;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestOnlyHandler;
import com.facebook.react.packagerconnection.Responder;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DevServerHelper {
    private final BundleDownloader mBundleDownloader = new BundleDownloader(this.mClient);
    public InspectorPackagerConnection.BundleStatusProvider mBundlerStatusProvider;
    private final OkHttpClient mClient = new OkHttpClient.Builder().connectTimeout(5000, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).build();
    @Nullable
    public InspectorPackagerConnection mInspectorPackagerConnection;
    @Nullable
    private OkHttpClient mOnChangePollingClient;
    public boolean mOnChangePollingEnabled;
    @Nullable
    public OnServerContentChangeListener mOnServerContentChangeListener;
    public final String mPackageName;
    @Nullable
    public JSPackagerClient mPackagerClient;
    public final Handler mRestartOnChangePollingHandler = new Handler();
    public final DevInternalSettings mSettings;

    enum BundleType {
        BUNDLE("bundle"),
        DELTA("delta"),
        MAP("map");
        
        private final String mTypeID;

        public final String typeID() {
            return this.mTypeID;
        }

        private BundleType(String str) {
            this.mTypeID = str;
        }
    }

    public interface OnServerContentChangeListener {
        void onServerContentChanged();
    }

    public interface PackagerCommandListener {
        void onCaptureHeapCommand(Responder responder);

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();

        void onPokeSamplingProfilerCommand(Responder responder);
    }

    public interface SymbolicationListener {
        void onSymbolicationComplete(@Nullable Iterable<StackFrame> iterable);
    }

    private boolean getDevMode() {
        return this.mSettings.isJSDevModeEnabled();
    }

    private boolean getJSMinifyMode() {
        return this.mSettings.isJSMinifyEnabled();
    }

    public void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mInspectorPackagerConnection != null) {
                    DevServerHelper.this.mInspectorPackagerConnection.closeQuietly();
                    DevServerHelper.this.mInspectorPackagerConnection = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mPackagerClient != null) {
                    DevServerHelper.this.mPackagerClient.close();
                    DevServerHelper.this.mPackagerClient = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void disableDebugger() {
        if (this.mInspectorPackagerConnection != null) {
            this.mInspectorPackagerConnection.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    private String createLaunchJSDevtoolsCommandUrl() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", new Object[]{this.mSettings.getPackagerConnectionSettings().getDebugServerHost()});
    }

    private String createOnChangeEndpointUrl() {
        return String.format(Locale.US, "http://%s/onchange", new Object[]{this.mSettings.getPackagerConnectionSettings().getDebugServerHost()});
    }

    private String getHostForJSProxy() {
        String str = (String) a.b(this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
        if (str.lastIndexOf(58) >= 0) {
            return str;
        }
        return "localhost";
    }

    public String getWebsocketProxyURL() {
        return String.format(Locale.US, "ws://%s/debugger-proxy?role=client", new Object[]{this.mSettings.getPackagerConnectionSettings().getDebugServerHost()});
    }

    public void launchJSDevtools() {
        this.mClient.newCall(new Request.Builder().url(createLaunchJSDevtoolsCommandUrl()).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
            }

            public void onResponse(Call call, Response response) throws IOException {
            }
        });
    }

    public void openInspectorConnection() {
        if (this.mInspectorPackagerConnection != null) {
            FLog.w("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() {
                /* access modifiers changed from: protected */
                public Void doInBackground(Void... voidArr) {
                    DevServerHelper.this.mInspectorPackagerConnection = new InspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), DevServerHelper.this.mPackageName, DevServerHelper.this.mBundlerStatusProvider);
                    DevServerHelper.this.mInspectorPackagerConnection.connect();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void stopPollingOnChangeEndpoint() {
        this.mOnChangePollingEnabled = false;
        this.mRestartOnChangePollingHandler.removeCallbacksAndMessages(null);
        if (this.mOnChangePollingClient != null) {
            OkHttpCallUtil.cancelTag(this.mOnChangePollingClient, this);
            this.mOnChangePollingClient = null;
        }
        this.mOnServerContentChangeListener = null;
    }

    private void enqueueOnChangeEndpointLongPolling() {
        ((OkHttpClient) a.b(this.mOnChangePollingClient)).newCall(new Request.Builder().url(createOnChangeEndpointUrl()).tag(this).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                if (DevServerHelper.this.mOnChangePollingEnabled) {
                    FLog.d("ReactNative", "Error while requesting /onchange endpoint", (Throwable) iOException);
                    DevServerHelper.this.mRestartOnChangePollingHandler.postDelayed(new Runnable() {
                        public void run() {
                            DevServerHelper.this.handleOnChangePollingResponse(false);
                        }
                    }, 5000);
                }
            }

            public void onResponse(Call call, Response response) throws IOException {
                boolean z;
                DevServerHelper devServerHelper = DevServerHelper.this;
                if (response.code() == 205) {
                    z = true;
                } else {
                    z = false;
                }
                devServerHelper.handleOnChangePollingResponse(z);
            }
        });
    }

    public String getInspectorDeviceUrl() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s", new Object[]{this.mSettings.getPackagerConnectionSettings().getInspectorServerHost(), AndroidInfoHelpers.getFriendlyDeviceName(), this.mPackageName});
    }

    public String getSourceMapUrl(String str) {
        return createBundleURL(str, BundleType.MAP);
    }

    private static String createOpenStackFrameURL(String str) {
        return String.format(Locale.US, "http://%s/open-stack-frame", new Object[]{str});
    }

    private static String createPackagerStatusURL(String str) {
        return String.format(Locale.US, "http://%s/status", new Object[]{str});
    }

    private static String createSymbolicateURL(String str) {
        return String.format(Locale.US, "http://%s/symbolicate", new Object[]{str});
    }

    public String getJSBundleURLForRemoteDebugging(String str) {
        return createBundleURL(str, BundleType.BUNDLE, getHostForJSProxy());
    }

    public String getDevServerBundleURL(String str) {
        BundleType bundleType;
        if (this.mSettings.isBundleDeltasEnabled()) {
            bundleType = BundleType.DELTA;
        } else {
            bundleType = BundleType.BUNDLE;
        }
        return createBundleURL(str, bundleType, this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public String getSourceUrl(String str) {
        BundleType bundleType;
        if (this.mSettings.isBundleDeltasEnabled()) {
            bundleType = BundleType.DELTA;
        } else {
            bundleType = BundleType.BUNDLE;
        }
        return createBundleURL(str, bundleType);
    }

    public void handleOnChangePollingResponse(boolean z) {
        if (this.mOnChangePollingEnabled) {
            if (z) {
                UiThreadUtil.runOnUiThread(new Runnable() {
                    public void run() {
                        if (DevServerHelper.this.mOnServerContentChangeListener != null) {
                            DevServerHelper.this.mOnServerContentChangeListener.onServerContentChanged();
                        }
                    }
                });
            }
            enqueueOnChangeEndpointLongPolling();
        }
    }

    public String getInspectorAttachUrl(String str) {
        return String.format(Locale.US, "http://%s/nuclide/attach-debugger-nuclide?title=%s&app=%s&device=%s", new Object[]{AndroidInfoHelpers.getServerHost(), str, this.mPackageName, AndroidInfoHelpers.getFriendlyDeviceName()});
    }

    public void isPackagerRunning(final PackagerStatusCallback packagerStatusCallback) {
        this.mClient.newCall(new Request.Builder().url(createPackagerStatusURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost())).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                FLog.w("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
                packagerStatusCallback.onPackagerStatusFetched(false);
            }

            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    FLog.e("ReactNative", "Got non-success http code from packager when requesting status: " + response.code());
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                ResponseBody body = response.body();
                if (body == null) {
                    FLog.e("ReactNative", "Got null body response from packager when requesting status");
                    packagerStatusCallback.onPackagerStatusFetched(false);
                } else if (!"packager-status:running".equals(body.string())) {
                    FLog.e("ReactNative", "Got unexpected response from packager when requesting status: " + body.string());
                    packagerStatusCallback.onPackagerStatusFetched(false);
                } else {
                    packagerStatusCallback.onPackagerStatusFetched(true);
                }
            }
        });
    }

    public void startPollingOnChangeEndpoint(OnServerContentChangeListener onServerContentChangeListener) {
        if (!this.mOnChangePollingEnabled) {
            this.mOnChangePollingEnabled = true;
            this.mOnServerContentChangeListener = onServerContentChangeListener;
            this.mOnChangePollingClient = new OkHttpClient.Builder().connectionPool(new ConnectionPool(1, 120000, TimeUnit.MINUTES)).connectTimeout(5000, TimeUnit.MILLISECONDS).build();
            enqueueOnChangeEndpointLongPolling();
        }
    }

    public void openStackFrameCall(StackFrame stackFrame) {
        ((Call) a.b(this.mClient.newCall(new Request.Builder().url(createOpenStackFrameURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost())).post(RequestBody.create(MediaType.parse("application/json"), stackFrame.toJSON().toString())).build()))).enqueue(new Callback() {
            public void onResponse(Call call, Response response) throws IOException {
            }

            public void onFailure(Call call, IOException iOException) {
                FLog.w("ReactNative", "Got IOException when attempting to open stack frame: " + iOException.getMessage());
            }
        });
    }

    private String createBundleURL(String str, BundleType bundleType) {
        return createBundleURL(str, bundleType, this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public void attachDebugger(final Context context, final String str) {
        new AsyncTask<Void, String, Boolean>() {

            /* renamed from: com.facebook.react.devsupport.DevServerHelper$5$_lancet */
            public class _lancet {
                private _lancet() {
                }

                @TargetClass
                @Proxy
                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(toast);
                    }
                    toast.show();
                }
            }

            public boolean doSync() {
                try {
                    new OkHttpClient().newCall(new Request.Builder().url(DevServerHelper.this.getInspectorAttachUrl(str)).build()).execute();
                    return true;
                } catch (IOException e2) {
                    FLog.e("ReactNative", "Failed to send attach request to Inspector", (Throwable) e2);
                    return false;
                }
            }

            /* access modifiers changed from: protected */
            public Boolean doInBackground(Void... voidArr) {
                return Boolean.valueOf(doSync());
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Boolean bool) {
                if (!bool.booleanValue()) {
                    _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context, context.getString(C0906R.string.qj), 1));
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private static String createResourceURL(String str, String str2) {
        return String.format(Locale.US, "http://%s/%s", new Object[]{str, str2});
    }

    public void openPackagerConnection(final String str, final PackagerCommandListener packagerCommandListener) {
        if (this.mPackagerClient != null) {
            FLog.w("ReactNative", "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() {
                /* access modifiers changed from: protected */
                public Void doInBackground(Void... voidArr) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("reload", new NotificationOnlyHandler() {
                        public void onNotification(@Nullable Object obj) {
                            packagerCommandListener.onPackagerReloadCommand();
                        }
                    });
                    hashMap.put("devMenu", new NotificationOnlyHandler() {
                        public void onNotification(@Nullable Object obj) {
                            packagerCommandListener.onPackagerDevMenuCommand();
                        }
                    });
                    hashMap.put("captureHeap", new RequestOnlyHandler() {
                        public void onRequest(@Nullable Object obj, Responder responder) {
                            packagerCommandListener.onCaptureHeapCommand(responder);
                        }
                    });
                    hashMap.put("pokeSamplingProfiler", new RequestOnlyHandler() {
                        public void onRequest(@Nullable Object obj, Responder responder) {
                            packagerCommandListener.onPokeSamplingProfilerCommand(responder);
                        }
                    });
                    hashMap.putAll(new FileIoHandler().handlers());
                    AnonymousClass5 r0 = new ReconnectingWebSocket.ConnectionCallback() {
                        public void onConnected() {
                            packagerCommandListener.onPackagerConnected();
                        }

                        public void onDisconnected() {
                            packagerCommandListener.onPackagerDisconnected();
                        }
                    };
                    DevServerHelper.this.mPackagerClient = new JSPackagerClient(str, DevServerHelper.this.mSettings.getPackagerConnectionSettings(), hashMap, r0);
                    DevServerHelper.this.mPackagerClient.init();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r6 = r3;
        r3 = r2;
        r2 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[SYNTHETIC, Splitter:B:25:0x0056] */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File downloadBundleResourceFromUrlSync(java.lang.String r8, java.io.File r9) {
        /*
            r7 = this;
            com.facebook.react.devsupport.DevInternalSettings r0 = r7.mSettings
            com.facebook.react.packagerconnection.PackagerConnectionSettings r0 = r0.getPackagerConnectionSettings()
            java.lang.String r0 = r0.getDebugServerHost()
            java.lang.String r0 = createResourceURL(r0, r8)
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            okhttp3.Request$Builder r0 = r1.url((java.lang.String) r0)
            okhttp3.Request r0 = r0.build()
            r1 = 0
            okhttp3.OkHttpClient r2 = r7.mClient     // Catch:{ Exception -> 0x0074 }
            okhttp3.Call r0 = r2.newCall(r0)     // Catch:{ Exception -> 0x0074 }
            okhttp3.Response r0 = r0.execute()     // Catch:{ Exception -> 0x0074 }
            boolean r2 = r0.isSuccessful()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r2 != 0) goto L_0x0032
            if (r0 == 0) goto L_0x0031
            r0.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0031:
            return r1
        L_0x0032:
            okio.Sink r2 = okio.Okio.sink((java.io.File) r9)     // Catch:{ all -> 0x0052 }
            okhttp3.ResponseBody r3 = r0.body()     // Catch:{ all -> 0x0050 }
            okio.BufferedSource r3 = r3.source()     // Catch:{ all -> 0x0050 }
            okio.BufferedSource r3 = okio.Okio.buffer((okio.Source) r3)     // Catch:{ all -> 0x0050 }
            r3.readAll(r2)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Exception -> 0x0074 }
        L_0x004f:
            return r9
        L_0x0050:
            r3 = move-exception
            goto L_0x0054
        L_0x0052:
            r3 = move-exception
            r2 = r1
        L_0x0054:
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
        L_0x0059:
            throw r3     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
        L_0x005a:
            r2 = move-exception
            r3 = r1
            goto L_0x0063
        L_0x005d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x005f }
        L_0x005f:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L_0x0063:
            if (r0 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0070
            r0.close()     // Catch:{ Throwable -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r0 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0073
        L_0x0070:
            r0.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0073:
            throw r2     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            java.lang.String r2 = "ReactNative"
            java.lang.String r3 = "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\""
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r8
            r8 = 1
            java.lang.String r9 = r9.getAbsolutePath()
            r4[r8] = r9
            r8 = 2
            r4[r8] = r0
            com.facebook.common.logging.FLog.e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.DevServerHelper.downloadBundleResourceFromUrlSync(java.lang.String, java.io.File):java.io.File");
    }

    public void symbolicateStackTrace(Iterable<StackFrame> iterable, final SymbolicationListener symbolicationListener) {
        try {
            String createSymbolicateURL = createSymbolicateURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
            JSONArray jSONArray = new JSONArray();
            for (StackFrame json : iterable) {
                jSONArray.put(json.toJSON());
            }
            ((Call) a.b(this.mClient.newCall(new Request.Builder().url(createSymbolicateURL).post(RequestBody.create(MediaType.parse("application/json"), new JSONObject().put("stack", jSONArray).toString())).build()))).enqueue(new Callback() {
                public void onFailure(Call call, IOException iOException) {
                    FLog.w("ReactNative", "Got IOException when attempting symbolicate stack trace: " + iOException.getMessage());
                    symbolicationListener.onSymbolicationComplete(null);
                }

                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        symbolicationListener.onSymbolicationComplete(Arrays.asList(StackTraceHelper.convertJsStackTrace(new JSONObject(response.body().string()).getJSONArray("stack"))));
                    } catch (JSONException unused) {
                        symbolicationListener.onSymbolicationComplete(null);
                    }
                }
            });
        } catch (JSONException e2) {
            FLog.w("ReactNative", "Got JSONException when attempting symbolicate stack trace: " + e2.getMessage());
        }
    }

    public DevServerHelper(DevInternalSettings devInternalSettings, String str, InspectorPackagerConnection.BundleStatusProvider bundleStatusProvider) {
        this.mSettings = devInternalSettings;
        this.mBundlerStatusProvider = bundleStatusProvider;
        this.mPackageName = str;
    }

    private String createBundleURL(String str, BundleType bundleType, String str2) {
        return String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&minify=%s", new Object[]{str2, str, bundleType.typeID(), Boolean.valueOf(getDevMode()), Boolean.valueOf(getJSMinifyMode())});
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo) {
        this.mBundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo);
    }
}
