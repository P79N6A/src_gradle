package com.meituan.robust;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Constants {
    public static Class AddAnnotationClass;
    public static final String[] LIB_NAME_ARRAY = {"baksmali-2.1.2.jar", "smali-2.1.2.jar", "dx.jar"};
    public static Class ModifyAnnotationClass;
    public static final List<String> NO_NEED_REFLECT_CLASS = Arrays.asList(new String[]{"android.os.Bundle", "android.os.BaseBundle"});
    public static final Boolean OBSCURE = Boolean.TRUE;
    public static final String PACKNAME_START = "L";
    public static final Set RFileClassSet;
    public static boolean isLogging = true;

    static {
        HashSet hashSet = new HashSet();
        RFileClassSet = hashSet;
        hashSet.add("R$array");
        RFileClassSet.add("R$xml");
        RFileClassSet.add("R$styleable");
        RFileClassSet.add("R$style");
        RFileClassSet.add("R$string");
        RFileClassSet.add("R$raw");
        RFileClassSet.add("R$menu");
        RFileClassSet.add("R$layout");
        RFileClassSet.add("R$integer");
        RFileClassSet.add("R$id");
        RFileClassSet.add("R$drawable");
        RFileClassSet.add("R$dimen");
        RFileClassSet.add("R$color");
        RFileClassSet.add("R$bool");
        RFileClassSet.add("R$attr");
        RFileClassSet.add("R$anim");
    }
}
