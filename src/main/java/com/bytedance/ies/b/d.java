package com.bytedance.ies.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.b.a.a;
import com.bytedance.ies.b.c.b;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchManipulate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class d extends PatchManipulate {

    /* renamed from: a  reason: collision with root package name */
    private e f20199a;

    public d(e eVar) {
        this.f20199a = eVar;
    }

    public final boolean ensurePatchExist(Patch patch) {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(patch.getMd5())) {
            return false;
        }
        if (!patch.getMd5().equals(b.a(patch.getLocalPath())) && !this.f20199a.a(patch)) {
            return false;
        }
        try {
            String localPath = patch.getLocalPath();
            File file = new File(patch.getTempPath());
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(localPath);
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                fileInputStream.close();
                File file2 = new File(patch.getTempPath());
                if (!file2.exists() || !file2.isFile()) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public final List<Patch> fetchPatchList(Context context) {
        List<a> a2 = this.f20199a.a();
        if (CollectionUtils.isEmpty(a2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a2.size());
        for (a aVar : a2) {
            if (aVar != null) {
                Patch patch = new Patch();
                patch.setUrl(aVar.f20190b);
                if (aVar.f20192d == null) {
                    aVar.f20192d = DigestUtils.md5Hex(aVar.f20189a);
                }
                patch.setName(aVar.f20192d);
                patch.setMd5(aVar.a());
                patch.setLocalPath(this.f20199a.f20201b + patch.getName() + "_robust");
                patch.setTempPath(context.getCacheDir() + File.separator + "robust" + File.separator + patch.getName());
                patch.setPatchesInfoImplClassFullName("com.bytedance.ies.patch.PatchesInfoImpl");
                patch.setAppliedSuccess(aVar.f20193e);
                arrayList.add(patch);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean verifyPatch(android.content.Context r6, com.meituan.robust.Patch r7) {
        /*
            r5 = this;
            java.lang.String r0 = r7.getMd5()
            r1 = 0
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r7.getMd5()
            java.lang.String r2 = r7.getTempPath()
            java.lang.String r2 = com.bytedance.ies.b.c.b.a(r2)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0066
            java.lang.String r7 = r7.getTempPath()
            java.lang.String r0 = r6.getPackageName()
            java.util.List r6 = com.bytedance.ies.b.c.a.a(r6, r0)
            java.util.List r7 = com.bytedance.ies.b.c.a.a((java.lang.String) r7)
            java.util.Collections.sort(r6)
            java.util.Collections.sort(r7)
            int r0 = r6.size()
            r2 = 1
            if (r0 <= 0) goto L_0x0062
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x0062
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 != r3) goto L_0x0062
            r0 = 0
        L_0x0047:
            int r3 = r6.size()
            if (r0 >= r3) goto L_0x0060
            java.lang.Object r3 = r6.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r0)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0062
            int r0 = r0 + 1
            goto L_0x0047
        L_0x0060:
            r6 = 1
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            if (r6 == 0) goto L_0x0066
            return r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.d.verifyPatch(android.content.Context, com.meituan.robust.Patch):boolean");
    }
}
