package d.a.a.a.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f82743a = true;

    /* renamed from: e  reason: collision with root package name */
    public static String f82744e = ":push";

    /* renamed from: f  reason: collision with root package name */
    public static boolean f82745f;
    public static boolean g;

    public static boolean b() {
        if (!g) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f82745f = true;
                    g = true;
                    return f82745f;
                }
            } catch (Exception unused) {
            }
            g = true;
        }
        return f82745f;
    }
}
