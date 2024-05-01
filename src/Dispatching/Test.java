package src.Dispatching;

public class Test {
    public static void main(String[] args) {
        C gamma = new C();
        A alfa = gamma;
        B beta = gamma;

        System.out.println(alfa.f(beta, beta)); // 6
        System.out.println(beta.f(beta, beta)); // 6
        System.out.println(beta.f(gamma, alfa)); // 2
        System.out.println(gamma.f(gamma, gamma)); // 5
        System.out.println(gamma.f(gamma, alfa)); // 2
        System.out.println(gamma.f(beta, gamma)); // 3
    }
}
