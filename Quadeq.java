/* Выполнение упражнения 1.3.2. по книге Р. Седжвика
 * и К. Уэйна. "Computer Science. Основы программирования
 * на Java, ООП, алгоритмы и структуры данных". 
 * Эта программа вычисляет корни уравнения при заданных
 * значениях a, b и c при вызове программы в командной строке.
 * Учтены все возможные значения, которые могут принимать a, b, c.*/

public class Quadeq {
        public static void main(String[] args) {
                /* Объявляем переменные, которым будут
                 * передаваться значения из командной
                 * строки. Переменная d - дискриминант.*/
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                double d = b*b - (4*a*c);
                /* Необходимо учесть когда a, b и c равны нулю,
                 * когда одна из переменных последовательно
                 * равна нулю, а остальыне не равны.
                 * И когда все переменные не равны нулю,
                 * что и приводит к стандартному решению уравнения
                 * ax^2 + bx + c = 0 через дискриминант.*/
                if (a == 0 && b == 0 && c == 0) {
                        System.out.println("No roots");
                }
                if (a == 0.0 && b != 0 && c != 0) {
                        /* bx + c = 0
                         * bx = -c
                         * x  = -c/b
                         * */
                        double x = -(c/b);
                        System.out.println("x = " + x + "."); 
                }
                if (b == 0.0 && a != 0 && c != 0) {
                        /* ax^2 + c = 0
                         * ax^2 = -c
                         * x^2 = -c/b
                         * x = +/-(sqrt(-c/b))
                         * -c/b >= 0
                         *  */
                        if (-(c/a) < 0.0) {
                                System.out.println("No roots");
                        }
                        else {
                                double x1 = Math.sqrt(-(c/a));
                                double x2 = -(Math.sqrt(-(c/a)));
                                System.out.println("x1 = " + x1 + "; " >
                        }
                }
                if (c == 0.0 && a != 0 && b != 0) {
                        /* ax^2 + bx = 0
                         * x(ax + b) = 0
                         * x = 0 or ax + b = 0
                         * ax = -b
                         * x = -b/a*/
                        double x = -(b/a);
                        System.out.println("x = " + x + ".");
                }
                if (a == 0 && b == 0 && c != 0) {
                        /* 0 + 0 + c = 0*/
                        System.out.println("No roots");
                }
                 if (a == 0 && c == 0 && b != 0) {
                        /* 0 + bx + 0 = 0
                         * bx = 0
                         * x = 0
                         * */
                        System.out.println("x = 0.");
                }
                if (b == 0 && c == 0 && a != 0) {
                        /* ax^2 + 0 + 0 = 0
                         * ax^2 = 0
                         * x^2 = 0
                         * x = +/-(sqrt(0))
                         * x = 0
                         * */
                        System.out.println("x = 0.");
                }
                if (a != 0 && b != 0 && c != 0) {
                        /* ax^2 + bx + c = 0
                         * Discriminant = b^2 - (4*a*c)
                         * x1 = (-b + sqrt(Discriminant))/(2*a)
                         * x2 = (-b - sqrt(Discriminant))/(2*a)
                         * */
                        if (d < 0) {
                        System.out.println("No roots");
                        }
                        if (d >= 0) {
                        double x1 = (-b + Math.sqrt(d))/(2*a);
                        double x2 = (-b - Math.sqrt(d))/(2*a);
                        System.out.println("x1 = " + x1 + "; " + "x2 = >
                        }
                }
        }
}
 
