import java.io.Serializable;

//id, дату добавления записи, время
// добавления записи, дедлай задачи, ФИО автора,
public class Human implements Serializable {
    private int id;
    private String name;

    public Human(int id ,String human) {
        this.name = human;
        this.id = id;
    }
    public String getHuman() {
        return name;
    }
    public void setHuman(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String toString(){
        return id + ":" + name;
    }
}
