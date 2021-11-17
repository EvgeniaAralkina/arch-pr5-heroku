package messagingstompwebsocket.Models;

public class IdMessage {
    Integer id;

    public IdMessage() {}

    public IdMessage(Integer id) { this.id = id;}

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id;}

    @Override
    public String toString() {
        return "IdMessage{" +
                "id=" + id +
                '}';
    }
}
