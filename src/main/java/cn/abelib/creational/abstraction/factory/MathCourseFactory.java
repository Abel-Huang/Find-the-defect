package cn.abelib.creational.abstraction.factory;

/**
 * @Author: abel.huang
 * @Date: 2019-01-27 22:14
 */
public class MathCourseFactory implements CourseFactory {
    @Override
    public Lecture getLecture() {
        return new MathLecture();
    }

    @Override
    public Review getReview() {
        return new MathReview();
    }
}
