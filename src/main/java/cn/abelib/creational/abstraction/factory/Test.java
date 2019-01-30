package cn.abelib.creational.abstraction.factory;

/**
 * @Author: abel.huang
 * @Date: 2019-01-27 22:26
 */
public class Test {
    public static void main(String[] args) {
        // math 工厂
        CourseFactory mathCourseFactory = new MathCourseFactory();
        Lecture mathLecture = mathCourseFactory.getLecture();
        Review mathReview = mathCourseFactory.getReview();
        mathLecture.study();
        mathReview.study();

        // english 工厂
        CourseFactory englishCourseFactory = new EnglishCourseFactory();
        Lecture englishLecture = englishCourseFactory.getLecture();
        Review englishReview = englishCourseFactory.getReview();
        englishLecture.study();
        englishReview.study();
    }
}
