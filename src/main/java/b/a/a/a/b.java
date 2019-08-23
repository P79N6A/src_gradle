package b.a.a.a;

public final class b extends Exception {
    public String message;
    public int statusCode;

    public final String getMsg() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public b(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
