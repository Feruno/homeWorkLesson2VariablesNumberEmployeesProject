package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final int numberOfProgrammers = 10;
        System.out.println("Количество программистов " + numberOfProgrammers);

        final int numberOfTestersNeedTestCodeOneProgrammer = 5;
        System.out.println("Количество тестировщиков, необходимое, чтобы протестировать код одного программиста " + numberOfTestersNeedTestCodeOneProgrammer);

        final int numberOfSupportSpecialistsNeedUserQuestionsAboutCodeOneProgrammer = 20;
        /* У меня есть вопрос нужно ли так именовать переменные или лучше писать коментарии описывающие для чего эти переменные? */
        System.out.println("Количество специалистов поддержки, необходимое, чтобы обработать вопросы, возникающие у пользователей по поводу кода, написанного одним программистом " + numberOfSupportSpecialistsNeedUserQuestionsAboutCodeOneProgrammer);

        int numberOfTestersNeedOnProject = numberOfTestersNeedTestCodeOneProgrammer * numberOfProgrammers;
        System.out.println("количество тестировщиков, требуемое на проекте " + numberOfTestersNeedOnProject);

        int numberOfSupportSpecialistsNeedOnProject = numberOfSupportSpecialistsNeedUserQuestionsAboutCodeOneProgrammer * numberOfProgrammers;
        System.out.println("количество специалистов поддержки, требуемое на проекте " + numberOfSupportSpecialistsNeedOnProject);

        int allTechnicalSpecialistsOnProject = numberOfProgrammers + numberOfTestersNeedOnProject + numberOfSupportSpecialistsNeedOnProject;
        System.out.println("общее количество технических специалистов проекте " + allTechnicalSpecialistsOnProject);
    }
}
