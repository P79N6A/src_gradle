package com.tt.miniapphost.entity;

import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class AppLaunchInfo {
    public static long startTime;
    public String appId;
    public String appName;
    public String icon;
    public boolean isGame;
    public int mark;
    public int orientation;
    public String ttid;
    public int type;
}
