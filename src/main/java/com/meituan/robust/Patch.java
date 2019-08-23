package com.meituan.robust;

import java.io.File;
import java.util.List;

public class Patch implements Cloneable {
    private String appHash;
    private boolean isAppliedSuccess;
    private String localPath;
    private String md5;
    private String name;
    private List<PatchedClassInfo> patchedClasses;
    private String patchesInfoImplClassFullName;
    private String tempPath;
    private String url;

    public String getAppHash() {
        return this.appHash;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public List<PatchedClassInfo> getPatchedClasses() {
        return this.patchedClasses;
    }

    public String getPatchesInfoImplClassFullName() {
        return this.patchesInfoImplClassFullName;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAppliedSuccess() {
        return this.isAppliedSuccess;
    }

    public Patch clone() {
        try {
            return (Patch) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getLocalPath() {
        return this.localPath + ".jar";
    }

    public String getTempPath() {
        return this.tempPath + "_temp.jar";
    }

    public void setAppHash(String str) {
        this.appHash = str;
    }

    public void setAppliedSuccess(boolean z) {
        this.isAppliedSuccess = z;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPatchedClasses(List<PatchedClassInfo> list) {
        this.patchedClasses = list;
    }

    public void setPatchesInfoImplClassFullName(String str) {
        this.patchesInfoImplClassFullName = str;
    }

    public void setTempPath(String str) {
        this.tempPath = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void delete(String str) {
        new File(str).delete();
    }
}
