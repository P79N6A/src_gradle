package com.umeng.message.tag;

import com.umeng.commonsdk.debug.UMLog;

public class a implements TagFilter {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81379a = "com.umeng.message.tag.a";

    /* renamed from: b  reason: collision with root package name */
    private static int f81380b = 256;

    public boolean filter(String str) {
        if (str == null || "".equals(str.trim())) {
            return false;
        }
        if (str == null || str.length() <= f81380b) {
            return true;
        }
        UMLog.mutlInfo(f81379a, 0, String.format("The length of %s exceeds allowed max length %i", new Object[]{str, Integer.valueOf(f81380b)}));
        return false;
    }
}
