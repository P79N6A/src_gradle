package com.bytedance.frameworks.plugin.stub;

import android.annotation.TargetApi;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e;
import java.io.FileNotFoundException;
import java.util.Set;

public class b extends ContentProvider {
    public boolean onCreate() {
        if (e.a() == null) {
            e.a(getContext());
        }
        return true;
    }

    public String getType(Uri uri) {
        String queryParameter = uri.getQueryParameter("target_authority");
        if (!TextUtils.equals(uri.getAuthority(), queryParameter)) {
            try {
                ContentProviderClient a2 = a(uri.getAuthority(), queryParameter);
                if (a2 != null) {
                    return a2.getType(a(uri, queryParameter));
                }
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.content.ContentProviderClient a(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.getContext()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r1 = 0
            android.content.pm.ProviderInfo r3 = r0.resolveContentProvider(r3, r1)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            android.content.pm.ProviderInfo r0 = com.bytedance.frameworks.plugin.pm.c.c((java.lang.String) r4, (int) r1)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r0 == 0) goto L_0x0036
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            com.bytedance.frameworks.plugin.b.a.a((android.content.pm.ApplicationInfo) r1, (android.content.pm.ComponentInfo) r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            int r1 = r1.uid     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            android.content.ContentProviderClient r4 = r2.a((java.lang.String) r4, (int) r1)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r4 == 0) goto L_0x0036
            com.bytedance.frameworks.plugin.am.c r1 = com.bytedance.frameworks.plugin.am.d.a()     // Catch:{ Exception -> 0x002b, all -> 0x0033 }
            r1.a((android.content.pm.ProviderInfo) r3, (android.content.pm.ProviderInfo) r0)     // Catch:{ Exception -> 0x002b, all -> 0x0033 }
            goto L_0x0031
        L_0x002b:
            r3 = move-exception
            java.lang.String r0 = "PluginActivityManager providerCreated fail."
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r0, (java.lang.Throwable) r3)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
        L_0x0031:
            monitor-exit(r2)
            return r4
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0036:
            r3 = 0
            monitor-exit(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.stub.b.a(java.lang.String, java.lang.String):android.content.ContentProviderClient");
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        String queryParameter = uri.getQueryParameter("target_authority");
        if (!TextUtils.equals(uri.getAuthority(), queryParameter)) {
            try {
                ContentProviderClient a2 = a(uri.getAuthority(), queryParameter);
                if (a2 != null) {
                    return a2.bulkInsert(a(uri, queryParameter), contentValuesArr);
                }
            } catch (RemoteException unused) {
            }
        }
        return super.bulkInsert(uri, contentValuesArr);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String queryParameter = uri.getQueryParameter("target_authority");
        if (!TextUtils.equals(uri.getAuthority(), queryParameter)) {
            try {
                ContentProviderClient a2 = a(uri.getAuthority(), queryParameter);
                if (a2 != null) {
                    return a2.insert(a(uri, queryParameter), contentValues);
                }
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        String queryParameter = uri.getQueryParameter("target_authority");
        if (!TextUtils.equals(uri.getAuthority(), queryParameter)) {
            try {
                ContentProviderClient a2 = a(uri.getAuthority(), queryParameter);
                if (a2 != null) {
                    return a2.openFile(uri, str);
                }
            } catch (RemoteException unused) {
            }
        }
        return super.openFile(uri, str);
    }

    private static Uri a(Uri uri, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme());
        builder.authority(str);
        builder.path(uri.getPath());
        if (Build.VERSION.SDK_INT >= 11) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    if (!TextUtils.equals(next, "target_authority")) {
                        builder.appendQueryParameter(next, uri.getQueryParameter(next));
                    }
                }
            }
        } else {
            builder.query(uri.getQuery());
        }
        builder.fragment(uri.getFragment());
        return builder.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0163, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.content.ContentProviderClient a(java.lang.String r14, int r15) throws java.lang.Exception {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.Object r0 = com.bytedance.frameworks.plugin.b.a.a()     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = "android.content.IContentProvider"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0164 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0164 }
            r3 = 14
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 < r3) goto L_0x006a
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0164 }
            r3 = 15
            if (r2 > r3) goto L_0x006a
            java.lang.Class r15 = r0.getClass()     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = "acquireExistingProvider"
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ all -> 0x0164 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r3[r6] = r8     // Catch:{ all -> 0x0164 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3[r7] = r8     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Method r15 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class) r15, (java.lang.String) r2, (java.lang.Class[]) r3)     // Catch:{ all -> 0x0164 }
            if (r15 == 0) goto L_0x0040
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0164 }
            android.content.Context r3 = r13.getContext()     // Catch:{ all -> 0x0164 }
            r2[r6] = r3     // Catch:{ all -> 0x0164 }
            r2[r7] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Object r14 = r15.invoke(r0, r2)     // Catch:{ all -> 0x0164 }
            goto L_0x0041
        L_0x0040:
            r14 = r4
        L_0x0041:
            java.lang.Class<android.content.ContentProviderClient> r15 = android.content.ContentProviderClient.class
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ all -> 0x0164 }
            java.lang.Class<android.content.ContentResolver> r2 = android.content.ContentResolver.class
            r0[r6] = r2     // Catch:{ all -> 0x0164 }
            r0[r7] = r1     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Constructor r15 = r15.getDeclaredConstructor(r0)     // Catch:{ all -> 0x0164 }
            if (r15 == 0) goto L_0x0162
            r15.setAccessible(r7)     // Catch:{ all -> 0x0164 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0164 }
            android.content.Context r1 = r13.getContext()     // Catch:{ all -> 0x0164 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0164 }
            r0[r6] = r1     // Catch:{ all -> 0x0164 }
            r0[r7] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Object r14 = r15.newInstance(r0)     // Catch:{ all -> 0x0164 }
            android.content.ContentProviderClient r14 = (android.content.ContentProviderClient) r14     // Catch:{ all -> 0x0164 }
            monitor-exit(r13)
            return r14
        L_0x006a:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0164 }
            r3 = 16
            r8 = 3
            if (r2 != r3) goto L_0x00d0
            java.lang.Class r15 = r0.getClass()     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = "acquireExistingProvider"
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x0164 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r3[r6] = r9     // Catch:{ all -> 0x0164 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r3[r7] = r9     // Catch:{ all -> 0x0164 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0164 }
            r3[r5] = r9     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Method r15 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class) r15, (java.lang.String) r2, (java.lang.Class[]) r3)     // Catch:{ all -> 0x0164 }
            if (r15 == 0) goto L_0x009e
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x0164 }
            android.content.Context r3 = r13.getContext()     // Catch:{ all -> 0x0164 }
            r2[r6] = r3     // Catch:{ all -> 0x0164 }
            r2[r7] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0164 }
            r2[r5] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Object r14 = r15.invoke(r0, r2)     // Catch:{ all -> 0x0164 }
            goto L_0x009f
        L_0x009e:
            r14 = r4
        L_0x009f:
            java.lang.Class<android.content.ContentProviderClient> r15 = android.content.ContentProviderClient.class
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ all -> 0x0164 }
            java.lang.Class<android.content.ContentResolver> r2 = android.content.ContentResolver.class
            r0[r6] = r2     // Catch:{ all -> 0x0164 }
            r0[r7] = r1     // Catch:{ all -> 0x0164 }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0164 }
            r0[r5] = r1     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Constructor r15 = r15.getDeclaredConstructor(r0)     // Catch:{ all -> 0x0164 }
            if (r15 == 0) goto L_0x0162
            r15.setAccessible(r7)     // Catch:{ all -> 0x0164 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x0164 }
            android.content.Context r1 = r13.getContext()     // Catch:{ all -> 0x0164 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0164 }
            r0[r6] = r1     // Catch:{ all -> 0x0164 }
            r0[r7] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0164 }
            r0[r5] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Object r14 = r15.newInstance(r0)     // Catch:{ all -> 0x0164 }
            android.content.ContentProviderClient r14 = (android.content.ContentProviderClient) r14     // Catch:{ all -> 0x0164 }
            monitor-exit(r13)
            return r14
        L_0x00d0:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0164 }
            r3 = 17
            if (r2 < r3) goto L_0x0162
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = "acquireExistingProvider"
            r9 = 4
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ all -> 0x0164 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r6] = r11     // Catch:{ all -> 0x0164 }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r7] = r11     // Catch:{ all -> 0x0164 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0164 }
            r10[r5] = r11     // Catch:{ all -> 0x0164 }
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0164 }
            r10[r8] = r11     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Method r2 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class) r2, (java.lang.String) r3, (java.lang.Class[]) r10)     // Catch:{ all -> 0x0164 }
            if (r2 == 0) goto L_0x0162
            java.lang.Class<android.os.UserHandle> r3 = android.os.UserHandle.class
            java.lang.String r10 = "getUserId"
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x0164 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0164 }
            r11[r6] = r12     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Method r3 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class) r3, (java.lang.String) r10, (java.lang.Class[]) r11)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0118
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0164 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0164 }
            r10[r6] = r15     // Catch:{ all -> 0x0164 }
            java.lang.Object r15 = r3.invoke(r4, r10)     // Catch:{ all -> 0x0164 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x0164 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x0164 }
            goto L_0x0119
        L_0x0118:
            r15 = 0
        L_0x0119:
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x0164 }
            android.content.Context r9 = r13.getContext()     // Catch:{ all -> 0x0164 }
            r3[r6] = r9     // Catch:{ all -> 0x0164 }
            r3[r7] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0164 }
            r3[r5] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0164 }
            r3[r8] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Object r14 = r2.invoke(r0, r3)     // Catch:{ all -> 0x0164 }
            java.lang.Class<android.content.ContentProviderClient> r15 = android.content.ContentProviderClient.class
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ all -> 0x0164 }
            java.lang.Class<android.content.ContentResolver> r2 = android.content.ContentResolver.class
            r0[r6] = r2     // Catch:{ all -> 0x0164 }
            r0[r7] = r1     // Catch:{ all -> 0x0164 }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0164 }
            r0[r5] = r1     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Constructor r15 = r15.getDeclaredConstructor(r0)     // Catch:{ all -> 0x0164 }
            if (r15 == 0) goto L_0x0162
            r15.setAccessible(r7)     // Catch:{ all -> 0x0164 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x0164 }
            android.content.Context r1 = r13.getContext()     // Catch:{ all -> 0x0164 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0164 }
            r0[r6] = r1     // Catch:{ all -> 0x0164 }
            r0[r7] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0164 }
            r0[r5] = r14     // Catch:{ all -> 0x0164 }
            java.lang.Object r14 = r15.newInstance(r0)     // Catch:{ all -> 0x0164 }
            android.content.ContentProviderClient r14 = (android.content.ContentProviderClient) r14     // Catch:{ all -> 0x0164 }
            monitor-exit(r13)
            return r14
        L_0x0162:
            monitor-exit(r13)
            return r4
        L_0x0164:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.stub.b.a(java.lang.String, int):android.content.ContentProviderClient");
    }

    @TargetApi(17)
    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        String str4 = null;
        if (bundle != null) {
            str3 = bundle.getString("stub_authority");
        } else {
            str3 = null;
        }
        if (bundle != null) {
            str4 = bundle.getString("target_authority");
        }
        if (!TextUtils.equals(str3, str4)) {
            try {
                ContentProviderClient a2 = a(str3, str4);
                if (a2 != null) {
                    return a2.call(str, str2, bundle);
                }
            } catch (RemoteException unused) {
            }
        }
        return super.call(str, str2, bundle);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        String queryParameter = uri.getQueryParameter("target_authority");
        if (!TextUtils.equals(uri.getAuthority(), queryParameter)) {
            try {
                ContentProviderClient a2 = a(uri.getAuthority(), queryParameter);
                if (a2 != null) {
                    return a2.delete(a(uri, queryParameter), str, strArr);
                }
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String queryParameter = uri.getQueryParameter("target_authority");
        if (!TextUtils.equals(uri.getAuthority(), queryParameter)) {
            try {
                ContentProviderClient a2 = a(uri.getAuthority(), queryParameter);
                if (a2 != null) {
                    return a2.update(a(uri, queryParameter), contentValues, str, strArr);
                }
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String queryParameter = uri.getQueryParameter("target_authority");
        if (!TextUtils.equals(uri.getAuthority(), queryParameter)) {
            try {
                ContentProviderClient a2 = a(uri.getAuthority(), queryParameter);
                if (a2 != null) {
                    return a2.query(a(uri, queryParameter), strArr, str, strArr2, str2);
                }
            } catch (RemoteException unused) {
            }
        }
        return null;
    }
}
