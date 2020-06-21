/**
 * 一个普通实体类,对应数据库中的一张表
 */
@Entity
@NamedQuery(name = "...", query = "...")
public class Entity {

    private static final long serialVersionUID = $serialuid;

    private String parameter1;
    private String parameter2;

    public Entity() {
        this(null);
    }


    public String getParameter1() {
        return parameter1;
    }


    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {

        return parameter1;
    }


    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

}