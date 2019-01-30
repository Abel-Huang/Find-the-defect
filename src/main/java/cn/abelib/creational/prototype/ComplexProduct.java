package cn.abelib.creational.prototype;

/**
 * @Author: abel.huang
 * @Date: 2019-01-31 04:37
 */
public class ComplexProduct implements Cloneable{
    private int id;
    private String name;
    private String desc;
    private String content;

    public ComplexProduct() {
        System.out.println("Create a ComplexProduct!");
    }

    @Override
    public String toString() {
        return "ComplexProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Clone ComplexProduct Object");
        return super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
