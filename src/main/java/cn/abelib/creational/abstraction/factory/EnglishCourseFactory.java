package cn.abelib.creational.abstraction.factory;

/**
 * @Author: abel.huang
 * @Date: 2019-01-27 22:21
 */
public class EnglishCourseFactory implements CourseFactory {
    @Override
    public Lecture getLecture() {
        return new EnglishLecture();
    }

    @Override
    public Review getReview() {
        return new EnglishReview();
    }
}
