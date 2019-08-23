package com.meituan.robust;

public class PatchedClassInfo {
    public String patchClassName;
    public String patchedClassName;

    public PatchedClassInfo(String str, String str2) {
        this.patchedClassName = str;
        this.patchClassName = str2;
    }
}
