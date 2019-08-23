package retrofit2;

public class h extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient m<?> f84268a;
    private final int code;
    private final String message;

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public m<?> response() {
        return this.f84268a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(m<?> mVar) {
        super("HTTP " + mVar.a() + " " + mVar.b());
        p.a(mVar, "response == null");
        this.code = mVar.a();
        this.message = mVar.b();
        this.f84268a = mVar;
    }
}
