package request;


import java.io.Serializable;
import java.util.Date;

public class DemoRequest implements Serializable {

    private static final long serialVersionUID = 469756990213999911L;
    
    private String name;
    private Date date;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
