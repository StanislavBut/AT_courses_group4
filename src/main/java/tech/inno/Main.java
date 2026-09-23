import java.util.*;

public class Main {

    // Задача 1: проверка на чётность
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Задача 2: проверка доступа по возрасту
    public static String checkAccess(int age) {
        // Строго больше 18 -> Allowed, иначе Denied (включая возраст 18)
        return age > 18 ? "Allowed" : "Denied";
    }

    // Задача 3: проверка на неотрицательность с тернарным оператором
    public static boolean isPositive(int n) {
        return n >= 0 ? true : false;
    }

    // Задача 4: оценка по баллам
    public static String getGrade(int score) {
        if (score >= 0 && score <= 20) {
            return "E";
        } else if (score >= 21 && score <= 40) {
            return "D";
        } else if (score >= 41 && score <= 60) {
            return "C";
        } else if (score >= 61 && score <= 80) {
            return "B";
        } else if (score >= 81 && score <= 100) {
            return "A";
        } else {
            return "Error";
        }
    }

    // Задача 5: обратный отсчёт со словом «Поехали!»
    public static String blastOff(int start) {
        if (start < 1) {
            // Если старт меньше 1, можно вернуть просто «Поехали!»,
            // но по логике задачи обычно ожидают числа от start до 1.
            return "Поехали!";
        }
        StringBuilder result = new StringBuilder();
        for (int i = start; i >= 1; i--) {
            result.append(i).append(" ");
        }
        result.append("Поехали!");
        return result.toString();
    }

    // Задача 6: сумма чисел от 1 до n
    public static int sumToN(int n) {
        if (n <= 0) {
            return 0; // Или можно выбросить исключение, если по условию n всегда > 0
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

        // Альтернатива (формула арифметической прогрессии):
        // return n * (n + 1) / 2;
    }

    // Задача 7: поиск строки "Bug" в массиве (без учёта регистра)
    public static boolean hasBug(String[] messages) {
        if (messages == null || messages.length == 0) {
            return false;
        }
        for (String msg : messages) {
            if (msg != null && msg.equalsIgnoreCase("Bug")) {
                return true;
            }
        }
        return false;
    }

    // Задача 8: чётные числа в диапазоне
    public static String getEvenInRange(int start, int end) {
        // Если диапазон некорректный, возвращаем пустую строку
        if (start > end) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true; // Флаг для корректной расстановки пробелов

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (!first) {
                    sb.append(" ");
                }
                sb.append(i);
                first = false;
            }
        }
        return sb.toString();
    }

    // Задача 9: поиск максимального числа в массиве
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым или null");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Задача 10: реверс массива строк
    public static String[] reverse(String[] arr) {
        if (arr == null) {
            return null;
        }
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Задача 11: среднее арифметическое списка чисел
    public static double calcAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0.0; // Или выбросить исключение
        }
        long sum = 0L; // Используем long, чтобы избежать переполнения при больших суммах
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    // Задача 12: удаление имени из списка
    public static List<String> removeSpecificName(List<String> list, String nameToRemove) {
        List<String> result = new ArrayList<>();
        if (list == null) {
            return result;
        }
        for (String name : list) {
            // Проверяем, что элемент не null и не равен удаляемому имени
            if (name != null && !name.equals(nameToRemove)) {
                result.add(name);
            }
        }
        return result;
    }

    // --- Блок для быстрой проверки (main) ---
    public static void main(String[] args) {
        System.out.println("--- Задача 1 (isEven) ---");
        System.out.println(isEven(4));   // true
        System.out.println(isEven(7));   // false

        System.out.println("\n--- Задача 2 (checkAccess) ---");
        System.out.println(checkAccess(19)); // Allowed
        System.out.println(checkAccess(18)); // Denied

        System.out.println("\n--- Задача 3 (isPositive) ---");
        System.out.println(isPositive(5));   // true
        System.out.println(isPositive(-3));  // false

        System.out.println("\n--- Задача 4 (getGrade) ---");
        System.out.println(getGrade(15));  // E
        System.out.println(getGrade(50));  // C
        System.out.println(getGrade(90));  // A
        System.out.println(getGrade(105)); // Error

        System.out.println("\n--- Задача 5 (blastOff) ---");
        System.out.println(blastOff(5)); // "5 4 3 2 1 Поехали!"

        System.out.println("\n--- Задача 6 (sumToN) ---");
        System.out.println(sumToN(5));   // 15 (1+2+3+4+5)

        System.out.println("\n--- Задача 7 (hasBug) ---");
        String[] logs = {"Info", "Warning", "bug", "Error"};
        System.out.println(hasBug(logs)); // true (регистронезависимо)

        System.out.println("\n--- Задача 8 (getEvenInRange) ---");
        System.out.println(getEvenInRange(2, 5)); // "2 4"
        System.out.println(getEvenInRange(1, 1)); // ""

        System.out.println("\n--- Задача 9 (findMax) ---");
        int[] nums = {3, 9, 2, 8};
        System.out.println(findMax(nums)); // 9

        System.out.println("\n--- Задача 10 (reverse) ---");
        String[] words = {"One", "Two", "Zero"};
        String[] reversed = reverse(words);
        System.out.println(Arrays.toString(reversed)); // [Zero, Two, One]

        System.out.println("\n--- Задача 11 (calcAverage) ---");
        List<Integer> scores = Arrays.asList(10, 20, 30);
        System.out.println(calcAverage(scores)); // 20.0

        System.out.println("\n--- Задача 12 (removeSpecificName) ---");
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
        List<String> filtered = removeSpecificName(names, "Alice");
        System.out.println(filtered); // [Bob, Charlie]
    }
}