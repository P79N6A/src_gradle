package cn.com.chinatelecom.a.a.e;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1713a = "i";

    public static String a(int i) {
        switch (i) {
            case -8102:
                return "获取失败";
            case -8101:
                return "获取失败";
            case -8100:
                return "无网络连接";
            default:
                switch (i) {
                    case -8000:
                        return "responseCode非200";
                    case -7999:
                        return "服务不可用。";
                    case -7998:
                        return "请求参数错误";
                    default:
                        return "未知原因";
                }
        }
    }
}
