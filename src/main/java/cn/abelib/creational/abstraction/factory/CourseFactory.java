package cn.abelib.creational.abstraction.factory;

/**
 * @Author: abel.huang
 * @Date: 2019-01-27 22:00
 */
public interface CourseFactory {
    /**
     * 课堂教学
     * @return
     */
    Lecture getLecture();

    /**
     *  自习
     * @return
     */
    Review getReview();
}
