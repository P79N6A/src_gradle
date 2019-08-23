package com.bytedance.crash.a;

import android.text.TextUtils;
import com.bytedance.crash.j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class b implements d {
    public final List<String> a(String str, long j) {
        File file;
        String str2;
        j.a().a();
        boolean z = !j.a().b().contains(":");
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            File file2 = new File(str);
            File file3 = null;
            if (!file2.exists() || file2.listFiles() == null) {
                file = null;
            } else {
                long j2 = 0;
                long j3 = 0;
                file = null;
                File file4 = null;
                for (File file5 : file2.listFiles()) {
                    String name = file5.getName();
                    if (name.endsWith(".hot") && ((!z || !file5.getName().contains("-")) && (z || file5.getName().contains("-")))) {
                        if (z) {
                            str2 = j.a().b();
                        } else {
                            str2 = j.a().b().replace(":", "-");
                        }
                        if (name.contains(str2)) {
                            String[] split = name.split("_");
                            if (split != null && split.length >= 4) {
                                long parseLong = Long.parseLong(split[3]);
                                if (j2 < parseLong) {
                                    file4 = file;
                                    j3 = j2;
                                    file = file5;
                                    j2 = parseLong;
                                } else {
                                    if (j3 >= parseLong) {
                                        file5 = file4;
                                        parseLong = j3;
                                    }
                                    file4 = file5;
                                    j3 = parseLong;
                                }
                            } else if (split != null) {
                                if (split.length > 1) {
                                    long parseLong2 = Long.parseLong(split[0]);
                                    if (j2 < parseLong2) {
                                        file4 = file;
                                        j3 = j2;
                                        file = file5;
                                        j2 = parseLong2;
                                    } else if (j3 < parseLong2) {
                                        file4 = file5;
                                        j3 = parseLong2;
                                    }
                                }
                            }
                        }
                    }
                }
                file3 = file4;
            }
            if (file3 != null) {
                arrayList.add(file3.getAbsolutePath());
            }
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
