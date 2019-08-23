package anet.channel.util;

import android.util.SparseArray;

public class ErrorConstant {
    private static SparseArray<String> errorMsgMap;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        errorMsgMap = sparseArray;
        sparseArray.put(200, "请求成功");
        errorMsgMap.put(-100, "未知错误");
        errorMsgMap.put(-101, "发生异常");
        errorMsgMap.put(-102, "非法参数");
        errorMsgMap.put(-103, "远程调用失败");
        errorMsgMap.put(-105, "ACCS自定义帧回调为空");
        errorMsgMap.put(-108, "获取Process失败");
        errorMsgMap.put(-200, "无网络");
        errorMsgMap.put(-203, "无策略");
        errorMsgMap.put(-202, "请求超时");
        errorMsgMap.put(-204, "请求被取消");
        errorMsgMap.put(-205, "请求后台被禁止");
        errorMsgMap.put(-206, "请求收到的数据长度与Content-Length不匹配");
        errorMsgMap.put(-300, "Tnet层抛出异常");
        errorMsgMap.put(-301, "Session不可用");
        errorMsgMap.put(-302, "鉴权异常");
        errorMsgMap.put(-303, "自定义帧数据过大");
        errorMsgMap.put(-304, "Tnet请求失败");
        errorMsgMap.put(-400, "连接超时");
        errorMsgMap.put(-401, "Socket超时");
        errorMsgMap.put(-402, "SSL失败");
        errorMsgMap.put(-403, "域名未认证");
        errorMsgMap.put(-404, "IO异常");
        errorMsgMap.put(-405, "域名不能解析");
        errorMsgMap.put(-406, "连接异常");
    }

    public static String getErrMsg(int i) {
        return StringUtils.stringNull2Empty(errorMsgMap.get(i));
    }

    public static String formatMsg(int i, String str) {
        return StringUtils.concatString(getErrMsg(i), ":", str);
    }
}
