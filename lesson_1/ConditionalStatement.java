public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 18;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Пол - мужской");
        }

        if (!maleGender) {
            System.out.println("Пол - женский");
        }

        double height = 1.83;
        if (height < 1.80) {
            System.out.println("Человек не слишком высокого роста");
        } else {
            System.out.println("Рост человека = " + height + " метра");
        }

        char firstLetterOfName = 'S';
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени - \"M\"");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени - \"I\"");
        } else {
            System.out.println("Имя начинается не на букву \"M\" и не на букву \"I\"");
        }
    }
}
