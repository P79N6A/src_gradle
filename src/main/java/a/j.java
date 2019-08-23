package a;

public class j<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final i<TResult> f1091a = new i<>();

    public final boolean a() {
        return this.f1091a.i();
    }

    public final void b() {
        if (!a()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final boolean a(Exception exc) {
        return this.f1091a.b(exc);
    }

    public final boolean a(TResult tresult) {
        return this.f1091a.b(tresult);
    }

    public final void b(Exception exc) {
        if (!a(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void b(TResult tresult) {
        if (!a(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
