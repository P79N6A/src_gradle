package com.umeng.commonsdk.debug;

public class UMLogCommon {
    public static final String SC_10001 = ("不能在非主进程进行初始化|目前只能在主进程进行初始化，如何正确初始化请详见地址：" + UMLogUtils.makeUrl("67292"));
    public static final String SC_10002 = ("不能在非Application的onCreate方法中进行初始化|目前只能在Application的onCreate方法中进行初始化，如何正确初始化请详见地址：" + UMLogUtils.makeUrl("67292"));
    public static final String SC_10007 = ("AppKey不能为空|您必须正确设置AppKey，如何正确初始化请详见地址：" + UMLogUtils.makeUrl("67292"));
}
