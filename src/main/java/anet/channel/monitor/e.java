package anet.channel.monitor;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private long f1252a;

    /* renamed from: b  reason: collision with root package name */
    private double f1253b;

    /* renamed from: c  reason: collision with root package name */
    private double f1254c;

    /* renamed from: d  reason: collision with root package name */
    private double f1255d;

    /* renamed from: e  reason: collision with root package name */
    private double f1256e;

    /* renamed from: f  reason: collision with root package name */
    private double f1257f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;

    e() {
    }

    public void a() {
        this.f1252a = 0;
        this.k = 0.0d;
    }

    public double a(double d2, double d3) {
        double d4 = d2 / d3;
        if (d4 >= 8.0d) {
            if (this.f1252a == 0) {
                this.i = d4;
                this.h = this.i;
                this.f1255d = this.h * 0.1d;
                this.f1254c = this.h * 0.02d;
                this.f1256e = this.h * 0.1d * this.h;
            } else if (this.f1252a == 1) {
                this.j = d4;
                this.h = this.j;
            } else {
                double d5 = d4 - this.j;
                this.i = this.j;
                this.j = d4;
                this.f1253b = d4 / 0.95d;
                this.g = this.f1253b - (this.h * 0.95d);
                char c2 = 0;
                double sqrt = Math.sqrt(this.f1255d);
                if (this.g >= 4.0d * sqrt) {
                    this.g = (this.g * 0.75d) + (sqrt * 2.0d);
                    c2 = 1;
                } else if (this.g <= -4.0d * sqrt) {
                    this.g = (sqrt * -1.0d) + (this.g * 0.75d);
                    c2 = 2;
                }
                this.f1255d = Math.min(Math.max(Math.abs((this.f1255d * 1.05d) - ((this.g * 0.0025d) * this.g)), this.f1255d * 0.8d), this.f1255d * 1.25d);
                this.f1257f = this.f1256e / ((this.f1256e * 0.9025d) + this.f1255d);
                this.h = this.h + (d5 * 1.0526315789473684d) + (this.f1257f * this.g);
                if (c2 == 1) {
                    this.h = Math.min(this.h, this.f1253b);
                } else if (c2 == 2) {
                    this.h = Math.max(this.h, this.f1253b);
                }
                this.f1256e = (1.0d - (this.f1257f * 0.95d)) * (this.f1256e + this.f1254c);
            }
            if (this.h < 0.0d) {
                this.k = this.j * 0.7d;
                this.h = this.k;
            } else {
                this.k = this.h;
            }
            return this.k;
        } else if (this.f1252a != 0) {
            return this.k;
        } else {
            this.k = d4;
            return this.k;
        }
    }
}
