package com.meituan.robust;

import android.content.Context;
import android.text.TextUtils;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Field;
import java.util.List;

public class PatchExecutor extends Thread {
    protected Context context;
    protected PatchManipulate patchManipulate;
    protected RobustCallBack robustCallBack;

    /* access modifiers changed from: protected */
    public List<Patch> fetchPatchList() {
        return this.patchManipulate.fetchPatchList(this.context);
    }

    public void run() {
        try {
            applyPatchList(fetchPatchList());
        } catch (Throwable th) {
            this.robustCallBack.exceptionNotify(th, "class:PatchExecutor,method:run,line:36");
        }
    }

    /* access modifiers changed from: protected */
    public void applyPatchList(List<Patch> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            for (Patch next : list) {
                if (!next.isAppliedSuccess() && this.patchManipulate.ensurePatchExist(next)) {
                    try {
                        z = patch(this.context, next);
                    } catch (Throwable th) {
                        this.robustCallBack.exceptionNotify(th, "class:PatchExecutor method:applyPatchList line:69");
                        z = false;
                    }
                    if (z) {
                        next.setAppliedSuccess(true);
                        this.robustCallBack.onPatchApplied(true, next);
                    } else {
                        this.robustCallBack.onPatchApplied(false, next);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean patch(Context context2, Patch patch) {
        PatchesInfo patchesInfo;
        Field field;
        if (!this.patchManipulate.verifyPatch(context2, patch)) {
            this.robustCallBack.logNotify("verifyPatch failure, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:107");
            return false;
        }
        DexClassLoader dexClassLoader = new DexClassLoader(patch.getTempPath(), context2.getCacheDir().getAbsolutePath(), null, PatchExecutor.class.getClassLoader());
        patch.delete(patch.getTempPath());
        try {
            patchesInfo = (PatchesInfo) dexClassLoader.loadClass(patch.getPatchesInfoImplClassFullName()).newInstance();
        } catch (Throwable th) {
            this.robustCallBack.exceptionNotify(th, "class:PatchExecutor method:patch line:108");
            patchesInfo = null;
        }
        if (patchesInfo == null) {
            this.robustCallBack.logNotify("patchesInfo is null, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:114");
            return false;
        }
        List<PatchedClassInfo> patchedClassesInfo = patchesInfo.getPatchedClassesInfo();
        if (patchedClassesInfo == null || patchedClassesInfo.isEmpty()) {
            this.robustCallBack.logNotify("patchedClasses is null or empty, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:122");
            return false;
        }
        for (PatchedClassInfo patchedClassInfo : patchedClassesInfo) {
            String str = patchedClassInfo.patchedClassName;
            String str2 = patchedClassInfo.patchClassName;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                this.robustCallBack.logNotify("patchedClasses or patchClassName is empty, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:131");
            } else {
                try {
                    Class loadClass = dexClassLoader.loadClass(str.trim());
                    Field[] declaredFields = loadClass.getDeclaredFields();
                    int length = declaredFields.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            field = null;
                            break;
                        }
                        field = declaredFields[i];
                        if (TextUtils.equals(field.getType().getCanonicalName(), ChangeQuickRedirect.class.getCanonicalName()) && TextUtils.equals(field.getDeclaringClass().getCanonicalName(), loadClass.getCanonicalName())) {
                            break;
                        }
                        i++;
                    }
                    if (field == null) {
                        this.robustCallBack.logNotify("changeQuickRedirectField  is null, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:147");
                    } else {
                        Object newInstance = dexClassLoader.loadClass(str2).newInstance();
                        field.setAccessible(true);
                        field.set(null, newInstance);
                    }
                } catch (Throwable th2) {
                    this.robustCallBack.exceptionNotify(th2, "class:PatchExecutor method:patch line:169");
                }
            }
        }
        patch.setPatchedClasses(patchedClassesInfo);
        return true;
    }

    public PatchExecutor(Context context2, PatchManipulate patchManipulate2, RobustCallBack robustCallBack2) {
        this.context = context2.getApplicationContext();
        this.patchManipulate = patchManipulate2;
        this.robustCallBack = robustCallBack2;
    }
}
