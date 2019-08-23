package com.ss.android.ugc.aweme.legoImp.task;

import a.i;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.apm.c;
import com.bytedance.services.apm.api.e;
import com.bytedance.tailor.Tailor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.e.d;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.fd;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class UploadOOMHprofTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    public e fileUploadService;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55323, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55323, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 72029, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 72029, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 != null) {
                z = d2.isUploadOOMHprofFile;
            }
        }
        if (z) {
            a.a("UploadOOMHprofTask");
            try {
                n.a("upload_oom_file", new JSONObject().put("is_upload_oom_file", b.a("upload_oom_file")));
                if (d.a(context) && b.a("upload_oom_file")) {
                    final String f2 = com.monitor.cloudmessage.a.f();
                    if (!TextUtils.isEmpty(f2)) {
                        try {
                            i.a((Callable<TResult>) new Callable<Boolean>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f53138a;

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public Boolean call() {
                                    String str;
                                    if (PatchProxy.isSupport(new Object[0], this, f53138a, false, 55324, new Class[0], Boolean.class)) {
                                        return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f53138a, false, 55324, new Class[0], Boolean.class);
                                    }
                                    try {
                                        String absolutePath = com.ss.android.f.a.a().getAbsolutePath();
                                        String str2 = absolutePath + "/.dump.hprof";
                                        String str3 = absolutePath + "/.mini.hprof";
                                        File file = new File(str2);
                                        if (file.exists()) {
                                            if (Tailor.isHprofValid(str2)) {
                                                Tailor.tailorHprof(str2, str3);
                                                File file2 = new File(str3);
                                                if (file2.exists()) {
                                                    new File(str2).delete();
                                                }
                                                ArrayList arrayList = new ArrayList(4);
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(absolutePath);
                                                if (file2.exists()) {
                                                    str = "/.mini.hprof";
                                                } else {
                                                    str = "/.dump.hprof";
                                                }
                                                sb.append(str);
                                                arrayList.add(sb.toString());
                                                arrayList.add(absolutePath + "/.maps");
                                                arrayList.add(absolutePath + "/.fds");
                                                arrayList.add(absolutePath + "/.threads");
                                                fd.a(absolutePath, "dump.xzip", (List<String>) arrayList);
                                                if (file.exists()) {
                                                    file.delete();
                                                }
                                                if (file2.exists()) {
                                                    file2.delete();
                                                }
                                                if (TextUtils.isEmpty(f2)) {
                                                    return Boolean.FALSE;
                                                }
                                                final File file3 = new File(f2);
                                                if (!file3.exists()) {
                                                    return Boolean.FALSE;
                                                }
                                                if (UploadOOMHprofTask.this.fileUploadService == null) {
                                                    UploadOOMHprofTask.this.fileUploadService = new com.bytedance.apm.i.a();
                                                }
                                                JSONObject jSONObject = new JSONObject();
                                                for (Map.Entry next : c.e().entrySet()) {
                                                    jSONObject.put((String) next.getKey(), next.getValue());
                                                }
                                                UploadOOMHprofTask.this.fileUploadService.a(com.ss.android.d.a.d.a(), "51754976314", "oom_hprof_file", Collections.singletonList(file3.getAbsolutePath()), "auto_upload_oom_hprof_file", jSONObject, new com.bytedance.services.apm.api.d() {

                                                    /* renamed from: a  reason: collision with root package name */
                                                    public static ChangeQuickRedirect f53141a;

                                                    public final void a() {
                                                        if (PatchProxy.isSupport(new Object[0], this, f53141a, false, 55325, new Class[0], Void.TYPE)) {
                                                            PatchProxy.accessDispatch(new Object[0], this, f53141a, false, 55325, new Class[0], Void.TYPE);
                                                            return;
                                                        }
                                                        file3.delete();
                                                    }
                                                });
                                                return Boolean.TRUE;
                                            }
                                        }
                                        return Boolean.FALSE;
                                    } catch (Exception unused) {
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
